package lsm;

import lsm.base.Compaction;

public interface VersionSet {
	/**
	 * 当前系统是否需要compact
	 * @return
	 */
	public boolean needsCompaction();
	
	/**
	 * 获取compaction信息
	 * @return
	 */
	public Compaction pickCompaction();
	
	/**
	 * 记录和应用一个edit，来产生一个新的version
	 * @param edit 
	 */
	public void logAndApply(VersionEdit edit);
	
	/**
	 * 获取最新序列号
	 * @return
	 */
	public long getLastSequence();
}
