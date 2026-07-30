package com.tantanapp.media.ttmediautils.task;

/* JADX INFO: loaded from: classes12.dex */
public abstract class NamedRunnable implements INamedRunnable {
    private static final String TAG = "TTMedia";
    private final String mName;
    private long mTimeAddToPool;
    private long mTimeBeginToRun;

    public NamedRunnable(String str) {
        this.mName = TAG + str;
    }

    @Override // com.tantanapp.media.ttmediautils.task.INamedRunnable
    public long getAddedTime() {
        return this.mTimeAddToPool;
    }

    @Override // com.tantanapp.media.ttmediautils.task.INamedRunnable
    public long getBeginTime() {
        return this.mTimeBeginToRun;
    }

    @Override // com.tantanapp.media.ttmediautils.task.INamedRunnable
    public String getName() {
        return this.mName;
    }

    @Override // com.tantanapp.media.ttmediautils.task.INamedRunnable
    public void setAddedTime(long j) {
        this.mTimeAddToPool = j;
    }

    @Override // com.tantanapp.media.ttmediautils.task.INamedRunnable
    public void setBeginTime(long j) {
        this.mTimeBeginToRun = j;
    }
}
