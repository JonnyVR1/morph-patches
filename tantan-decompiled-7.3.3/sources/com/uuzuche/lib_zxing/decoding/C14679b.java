package com.uuzuche.lib_zxing.decoding;

import android.os.Handler;
import android.os.Looper;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.uuzuche.lib_zxing.activity.CaptureFragment;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import p153l.shd;
import p153l.t5d0;

/* JADX INFO: renamed from: com.uuzuche.lib_zxing.decoding.b */
/* JADX INFO: loaded from: classes2.dex */
final class C14679b extends Thread {

    /* JADX INFO: renamed from: a */
    private final CaptureFragment f61719a;

    /* JADX INFO: renamed from: b */
    private final Hashtable<DecodeHintType, Object> f61720b;

    /* JADX INFO: renamed from: c */
    private Handler f61721c;

    /* JADX INFO: renamed from: d */
    private final CountDownLatch f61722d = new CountDownLatch(1);

    public C14679b(CaptureFragment captureFragment, Vector<BarcodeFormat> vector, String str, t5d0 t5d0Var) {
        this.f61719a = captureFragment;
        Hashtable<DecodeHintType, Object> hashtable = new Hashtable<>(3);
        this.f61720b = hashtable;
        if (vector == null || vector.isEmpty()) {
            vector = new Vector<>();
            vector.addAll(shd.f168694c);
            vector.addAll(shd.f168695d);
            vector.addAll(shd.f168696e);
        }
        hashtable.put(DecodeHintType.POSSIBLE_FORMATS, vector);
        if (str != null) {
            hashtable.put(DecodeHintType.CHARACTER_SET, str);
        }
        hashtable.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, t5d0Var);
    }

    /* JADX INFO: renamed from: a */
    public Handler m85875a() {
        try {
            this.f61722d.await();
        } catch (InterruptedException unused) {
        }
        return this.f61721c;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f61721c = new HandlerC14678a(this.f61719a, this.f61720b);
        this.f61722d.countDown();
        Looper.loop();
    }
}
