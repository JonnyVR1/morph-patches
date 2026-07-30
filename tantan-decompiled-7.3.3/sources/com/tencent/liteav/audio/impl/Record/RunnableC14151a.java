package com.tencent.liteav.audio.impl.Record;

import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: com.tencent.liteav.audio.impl.Record.a */
/* JADX INFO: loaded from: classes2.dex */
public class RunnableC14151a implements Runnable {

    /* JADX INFO: renamed from: a */
    private WeakReference<InterfaceC14153c> f58837a;

    /* JADX INFO: renamed from: b */
    private int f58838b;

    /* JADX INFO: renamed from: c */
    private int f58839c;

    /* JADX INFO: renamed from: d */
    private int f58840d;

    /* JADX INFO: renamed from: e */
    private boolean f58841e;

    /* JADX INFO: renamed from: f */
    private Thread f58842f;

    /* JADX INFO: renamed from: g */
    private byte[] f58843g;

    /* JADX INFO: renamed from: b */
    private void m83860b() {
        InterfaceC14153c interfaceC14153c;
        synchronized (this) {
            try {
                WeakReference<InterfaceC14153c> weakReference = this.f58837a;
                interfaceC14153c = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC14153c != null) {
            interfaceC14153c.onAudioRecordStart();
        } else {
            TXCLog.m84149e("AudioCenter:TXCAudioBGMRecord", "onRecordStart:no callback");
        }
    }

    /* JADX INFO: renamed from: c */
    private void m83861c() {
        InterfaceC14153c interfaceC14153c;
        synchronized (this) {
            try {
                WeakReference<InterfaceC14153c> weakReference = this.f58837a;
                interfaceC14153c = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC14153c != null) {
            interfaceC14153c.onAudioRecordStop();
        } else {
            TXCLog.m84149e("AudioCenter:TXCAudioBGMRecord", "onRecordStop:no callback");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83862a() {
        this.f58841e = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Thread thread = this.f58842f;
        if (thread != null && thread.isAlive() && Thread.currentThread().getId() != this.f58842f.getId()) {
            try {
                this.f58842f.join();
            } catch (Exception e) {
                TXCLog.m84149e("AudioCenter:TXCAudioBGMRecord", "record stop Exception: " + e.getMessage());
            }
        }
        TXCLog.m84152i("AudioCenter:TXCAudioBGMRecord", "stop record cost time(MS): " + (System.currentTimeMillis() - jCurrentTimeMillis));
        this.f58842f = null;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f58841e) {
            TXCLog.m84156w("AudioCenter:TXCAudioBGMRecord", "audio record: abandom start audio sys record thread!");
            return;
        }
        m83860b();
        int i = this.f58838b;
        int i2 = this.f58839c;
        int i3 = this.f58840d;
        int i4 = ((i2 * 1024) * i3) / 8;
        byte[] bArr = new byte[i4];
        this.f58843g = bArr;
        Arrays.fill(bArr, (byte) 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long length = 0;
        while (this.f58841e && !Thread.interrupted()) {
            if (((((((System.currentTimeMillis() - jCurrentTimeMillis) * ((long) i)) * ((long) i2)) * ((long) i3)) / 8) / 1000) - length < i4) {
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException unused) {
                }
            } else {
                byte[] bArr2 = this.f58843g;
                length += (long) bArr2.length;
                m83859a(bArr2, bArr2.length, TXCTimeUtil.getTimeTick());
            }
        }
        m83861c();
    }

    /* JADX INFO: renamed from: a */
    private void m83859a(byte[] bArr, int i, long j) {
        InterfaceC14153c interfaceC14153c;
        synchronized (this) {
            try {
                WeakReference<InterfaceC14153c> weakReference = this.f58837a;
                interfaceC14153c = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC14153c != null) {
            interfaceC14153c.onAudioRecordPCM(bArr, i, j);
        } else {
            TXCLog.m84149e("AudioCenter:TXCAudioBGMRecord", "onRecordPcmData:no callback");
        }
    }
}
