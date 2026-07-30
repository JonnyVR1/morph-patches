package tv.danmaku.ijk.media.streamer;

import com.immomo.mediacore.sink.IjkWriter;
import com.immomo.mediacore.strinf.NotifyCenter;
import p153l.t9c;

/* JADX INFO: loaded from: classes3.dex */
public class PusherTask extends IjkWriter {
    private long duration;

    public PusherTask(NotifyCenter notifyCenter, boolean z, long j) {
        super(notifyCenter, z);
        this.duration = j > 10000 ? 10000L : j;
    }

    @Override // com.immomo.mediacore.sink.IjkWriter, com.immomo.mediacore.sink.SinkBase
    public boolean prepare() {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            setErrorCode(0);
            t9c.m189745c("lqdebug", "pusher task prepare:");
            synchronized (this.mFPreparedSyncObject) {
                _prepare();
                try {
                    this.mFPreparedSyncObject.wait(this.duration);
                } catch (InterruptedException unused) {
                }
            }
            z = true;
        } catch (Error e) {
            e.printStackTrace();
            z = false;
        } catch (Exception e2) {
            e2.printStackTrace();
            z = false;
        }
        if (getLastError().compareAndSet(true, false)) {
            return false;
        }
        boolean z2 = System.currentTimeMillis() - jCurrentTimeMillis < this.duration ? z : false;
        if (z2) {
            getServerIpAddr();
        }
        return z2;
    }
}
