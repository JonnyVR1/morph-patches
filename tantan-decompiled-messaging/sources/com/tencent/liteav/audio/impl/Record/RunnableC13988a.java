package com.tencent.liteav.audio.impl.Record;

import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: com.tencent.liteav.audio.impl.Record.a */
/* JADX INFO: loaded from: classes2.dex */
public class RunnableC13988a implements Runnable {

    /* JADX INFO: renamed from: a */
    private WeakReference<InterfaceC13990c> f57989a;

    /* JADX INFO: renamed from: b */
    private int f57990b;

    /* JADX INFO: renamed from: c */
    private int f57991c;

    /* JADX INFO: renamed from: d */
    private int f57992d;

    /* JADX INFO: renamed from: e */
    private boolean f57993e;

    /* JADX INFO: renamed from: f */
    private Thread f57994f;

    /* JADX INFO: renamed from: g */
    private byte[] f57995g;

    /* JADX INFO: renamed from: b */
    private void m82677b() {
        InterfaceC13990c interfaceC13990c;
        synchronized (this) {
            try {
                WeakReference<InterfaceC13990c> weakReference = this.f57989a;
                interfaceC13990c = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC13990c != null) {
            interfaceC13990c.onAudioRecordStart();
        } else {
            TXCLog.m82966e("AudioCenter:TXCAudioBGMRecord", "onRecordStart:no callback");
        }
    }

    /* JADX INFO: renamed from: c */
    private void m82678c() {
        InterfaceC13990c interfaceC13990c;
        synchronized (this) {
            try {
                WeakReference<InterfaceC13990c> weakReference = this.f57989a;
                interfaceC13990c = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC13990c != null) {
            interfaceC13990c.onAudioRecordStop();
        } else {
            TXCLog.m82966e("AudioCenter:TXCAudioBGMRecord", "onRecordStop:no callback");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82679a() {
        this.f57993e = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Thread thread = this.f57994f;
        if (thread != null && thread.isAlive() && Thread.currentThread().getId() != this.f57994f.getId()) {
            try {
                this.f57994f.join();
            } catch (Exception e) {
                TXCLog.m82966e("AudioCenter:TXCAudioBGMRecord", "record stop Exception: " + e.getMessage());
            }
        }
        TXCLog.m82969i("AudioCenter:TXCAudioBGMRecord", "stop record cost time(MS): " + (System.currentTimeMillis() - jCurrentTimeMillis));
        this.f57994f = null;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f57993e) {
            TXCLog.m82973w("AudioCenter:TXCAudioBGMRecord", "audio record: abandom start audio sys record thread!");
            return;
        }
        m82677b();
        int i = this.f57990b;
        int i2 = this.f57991c;
        int i3 = this.f57992d;
        int i4 = ((i2 * 1024) * i3) / 8;
        byte[] bArr = new byte[i4];
        this.f57995g = bArr;
        Arrays.fill(bArr, (byte) 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long length = 0;
        while (this.f57993e && !Thread.interrupted()) {
            if (((((((System.currentTimeMillis() - jCurrentTimeMillis) * ((long) i)) * ((long) i2)) * ((long) i3)) / 8) / 1000) - length < i4) {
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException unused) {
                }
            } else {
                byte[] bArr2 = this.f57995g;
                length += (long) bArr2.length;
                m82676a(bArr2, bArr2.length, TXCTimeUtil.getTimeTick());
            }
        }
        m82678c();
    }

    /* JADX INFO: renamed from: a */
    private void m82676a(byte[] bArr, int i, long j) {
        InterfaceC13990c interfaceC13990c;
        synchronized (this) {
            try {
                WeakReference<InterfaceC13990c> weakReference = this.f57989a;
                interfaceC13990c = weakReference != null ? weakReference.get() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC13990c != null) {
            interfaceC13990c.onAudioRecordPCM(bArr, i, j);
        } else {
            TXCLog.m82966e("AudioCenter:TXCAudioBGMRecord", "onRecordPcmData:no callback");
        }
    }
}
