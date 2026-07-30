package com.clevertap.android.sdk.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes.dex */
public class GifImageView extends AppCompatImageView implements Runnable {

    /* JADX INFO: renamed from: c */
    private boolean f4960c;

    /* JADX INFO: renamed from: d */
    private InterfaceC1212c f4961d;

    /* JADX INFO: renamed from: e */
    private Thread f4962e;

    /* JADX INFO: renamed from: f */
    private long f4963f;

    /* JADX INFO: renamed from: g */
    private C1215a f4964g;

    /* JADX INFO: renamed from: h */
    private final Handler f4965h;

    /* JADX INFO: renamed from: i */
    private boolean f4966i;

    /* JADX INFO: renamed from: j */
    private boolean f4967j;

    /* JADX INFO: renamed from: k */
    private Bitmap f4968k;

    /* JADX INFO: renamed from: l */
    private final Runnable f4969l;

    /* JADX INFO: renamed from: m */
    private final Runnable f4970m;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.gif.GifImageView$a */
    public class RunnableC1210a implements Runnable {
        public RunnableC1210a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GifImageView.this.f4968k = null;
            GifImageView.this.f4964g = null;
            GifImageView.this.f4962e = null;
            GifImageView.this.f4967j = false;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.gif.GifImageView$b */
    public class RunnableC1211b implements Runnable {
        public RunnableC1211b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (GifImageView.this.f4968k == null || GifImageView.this.f4968k.isRecycled()) {
                return;
            }
            GifImageView gifImageView = GifImageView.this;
            gifImageView.setImageBitmap(gifImageView.f4968k);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.gif.GifImageView$c */
    public interface InterfaceC1212c {
        void onAnimationStart();
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.gif.GifImageView$d */
    public interface InterfaceC1213d {
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.gif.GifImageView$e */
    public interface InterfaceC1214e {
    }

    public GifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4961d = null;
        this.f4963f = -1L;
        this.f4965h = new Handler(Looper.getMainLooper());
        this.f4969l = new RunnableC1210a();
        this.f4970m = new RunnableC1211b();
    }

    /* JADX INFO: renamed from: j */
    private boolean m6100j() {
        return (this.f4960c || this.f4966i) && this.f4964g != null && this.f4962e == null;
    }

    /* JADX INFO: renamed from: o */
    private void m6101o() {
        if (m6100j()) {
            Thread thread = new Thread(this);
            this.f4962e = thread;
            thread.start();
        }
    }

    public int getFrameCount() {
        return this.f4964g.m6119g();
    }

    public long getFramesDisplayDuration() {
        return this.f4963f;
    }

    public int getGifHeight() {
        return this.f4964g.m6120i();
    }

    public int getGifWidth() {
        return this.f4964g.m6123m();
    }

    public InterfaceC1213d getOnAnimationStop() {
        return null;
    }

    public InterfaceC1214e getOnFrameAvailable() {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m6102k() {
        this.f4960c = false;
        this.f4966i = false;
        this.f4967j = true;
        m6105p();
        this.f4965h.post(this.f4969l);
    }

    /* JADX INFO: renamed from: l */
    public void m6103l(int i) {
        if (this.f4964g.m6117e() == i || !this.f4964g.m6129w(i - 1) || this.f4960c) {
            return;
        }
        this.f4966i = true;
        m6101o();
    }

    /* JADX INFO: renamed from: m */
    public void m6104m() {
        this.f4960c = true;
        m6101o();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m6102k();
    }

    /* JADX INFO: renamed from: p */
    public void m6105p() {
        this.f4960c = false;
        Thread thread = this.f4962e;
        if (thread != null) {
            thread.interrupt();
            this.f4962e = null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        long jNanoTime;
        InterfaceC1212c interfaceC1212c = this.f4961d;
        if (interfaceC1212c != null) {
            interfaceC1212c.onAnimationStart();
        }
        do {
            if (!this.f4960c && !this.f4966i) {
                break;
            }
            boolean zM6116a = this.f4964g.m6116a();
            try {
                long jNanoTime2 = System.nanoTime();
                this.f4968k = this.f4964g.m6122l();
                jNanoTime = (System.nanoTime() - jNanoTime2) / 1000000;
                try {
                    this.f4965h.post(this.f4970m);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused) {
                }
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused2) {
                jNanoTime = 0;
            }
            this.f4966i = false;
            if (!this.f4960c || !zM6116a) {
                this.f4960c = false;
                break;
            }
            try {
                int iM6121k = (int) (((long) this.f4964g.m6121k()) - jNanoTime);
                if (iM6121k > 0) {
                    long j = this.f4963f;
                    if (j <= 0) {
                        j = iM6121k;
                    }
                    Thread.sleep(j);
                }
            } catch (InterruptedException unused3) {
            }
        } while (this.f4960c);
        if (this.f4967j) {
            this.f4965h.post(this.f4969l);
        }
        this.f4962e = null;
    }

    public void setBytes(byte[] bArr) {
        C1215a c1215a = new C1215a();
        this.f4964g = c1215a;
        try {
            c1215a.m6124n(bArr);
            if (this.f4960c) {
                m6101o();
            } else {
                m6103l(0);
            }
        } catch (Exception unused) {
            this.f4964g = null;
        }
    }

    public void setFramesDisplayDuration(long j) {
        this.f4963f = j;
    }

    public void setOnAnimationStart(InterfaceC1212c interfaceC1212c) {
        this.f4961d = interfaceC1212c;
    }

    public void setOnAnimationStop(InterfaceC1213d interfaceC1213d) {
    }

    public void setOnFrameAvailable(InterfaceC1214e interfaceC1214e) {
    }

    public GifImageView(Context context) {
        super(context);
        this.f4961d = null;
        this.f4963f = -1L;
        this.f4965h = new Handler(Looper.getMainLooper());
        this.f4969l = new RunnableC1210a();
        this.f4970m = new RunnableC1211b();
    }
}
