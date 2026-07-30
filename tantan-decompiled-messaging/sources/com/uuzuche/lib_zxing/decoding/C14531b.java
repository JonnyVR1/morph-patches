package com.uuzuche.lib_zxing.decoding;

import android.os.Handler;
import android.os.Looper;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.uuzuche.lib_zxing.activity.CaptureFragment;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import p149l.mgd;
import p149l.qxc0;

/* JADX INFO: renamed from: com.uuzuche.lib_zxing.decoding.b */
/* JADX INFO: loaded from: classes2.dex */
final class C14531b extends Thread {

    /* JADX INFO: renamed from: a */
    private final CaptureFragment f60872a;

    /* JADX INFO: renamed from: b */
    private final Hashtable<DecodeHintType, Object> f60873b;

    /* JADX INFO: renamed from: c */
    private Handler f60874c;

    /* JADX INFO: renamed from: d */
    private final CountDownLatch f60875d = new CountDownLatch(1);

    public C14531b(CaptureFragment captureFragment, Vector<BarcodeFormat> vector, String str, qxc0 qxc0Var) {
        this.f60872a = captureFragment;
        Hashtable<DecodeHintType, Object> hashtable = new Hashtable<>(3);
        this.f60873b = hashtable;
        if (vector == null || vector.isEmpty()) {
            vector = new Vector<>();
            vector.addAll(mgd.f133670c);
            vector.addAll(mgd.f133671d);
            vector.addAll(mgd.f133672e);
        }
        hashtable.put(DecodeHintType.POSSIBLE_FORMATS, vector);
        if (str != null) {
            hashtable.put(DecodeHintType.CHARACTER_SET, str);
        }
        hashtable.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, qxc0Var);
    }

    /* JADX INFO: renamed from: a */
    public Handler m84704a() {
        try {
            this.f60875d.await();
        } catch (InterruptedException unused) {
        }
        return this.f60874c;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f60874c = new HandlerC14530a(this.f60872a, this.f60873b);
        this.f60875d.countDown();
        Looper.loop();
    }
}
