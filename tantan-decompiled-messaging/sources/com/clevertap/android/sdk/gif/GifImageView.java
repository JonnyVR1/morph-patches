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
    private boolean f4923c;

    /* JADX INFO: renamed from: d */
    private InterfaceC1189c f4924d;

    /* JADX INFO: renamed from: e */
    private Thread f4925e;

    /* JADX INFO: renamed from: f */
    private long f4926f;

    /* JADX INFO: renamed from: g */
    private C1192a f4927g;

    /* JADX INFO: renamed from: h */
    private final Handler f4928h;

    /* JADX INFO: renamed from: i */
    private boolean f4929i;

    /* JADX INFO: renamed from: j */
    private boolean f4930j;

    /* JADX INFO: renamed from: k */
    private Bitmap f4931k;

    /* JADX INFO: renamed from: l */
    private final Runnable f4932l;

    /* JADX INFO: renamed from: m */
    private final Runnable f4933m;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.gif.GifImageView$a */
    public class RunnableC1187a implements Runnable {
        public RunnableC1187a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GifImageView.this.f4931k = null;
            GifImageView.this.f4927g = null;
            GifImageView.this.f4925e = null;
            GifImageView.this.f4930j = false;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.gif.GifImageView$b */
    public class RunnableC1188b implements Runnable {
        public RunnableC1188b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (GifImageView.this.f4931k == null || GifImageView.this.f4931k.isRecycled()) {
                return;
            }
            GifImageView gifImageView = GifImageView.this;
            gifImageView.setImageBitmap(gifImageView.f4931k);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.gif.GifImageView$c */
    public interface InterfaceC1189c {
        void onAnimationStart();
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.gif.GifImageView$d */
    public interface InterfaceC1190d {
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.gif.GifImageView$e */
    public interface InterfaceC1191e {
    }

    public GifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4924d = null;
        this.f4926f = -1L;
        this.f4928h = new Handler(Looper.getMainLooper());
        this.f4932l = new RunnableC1187a();
        this.f4933m = new RunnableC1188b();
    }

    /* JADX INFO: renamed from: j */
    private boolean m6046j() {
        return (this.f4923c || this.f4929i) && this.f4927g != null && this.f4925e == null;
    }

    /* JADX INFO: renamed from: o */
    private void m6047o() {
        if (m6046j()) {
            Thread thread = new Thread(this);
            this.f4925e = thread;
            thread.start();
        }
    }

    public int getFrameCount() {
        return this.f4927g.m6065g();
    }

    public long getFramesDisplayDuration() {
        return this.f4926f;
    }

    public int getGifHeight() {
        return this.f4927g.m6066i();
    }

    public int getGifWidth() {
        return this.f4927g.m6069m();
    }

    public InterfaceC1190d getOnAnimationStop() {
        return null;
    }

    public InterfaceC1191e getOnFrameAvailable() {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m6048k() {
        this.f4923c = false;
        this.f4929i = false;
        this.f4930j = true;
        m6051p();
        this.f4928h.post(this.f4932l);
    }

    /* JADX INFO: renamed from: l */
    public void m6049l(int i) {
        if (this.f4927g.m6063e() == i || !this.f4927g.m6075w(i - 1) || this.f4923c) {
            return;
        }
        this.f4929i = true;
        m6047o();
    }

    /* JADX INFO: renamed from: m */
    public void m6050m() {
        this.f4923c = true;
        m6047o();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m6048k();
    }

    /* JADX INFO: renamed from: p */
    public void m6051p() {
        this.f4923c = false;
        Thread thread = this.f4925e;
        if (thread != null) {
            thread.interrupt();
            this.f4925e = null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        long jNanoTime;
        InterfaceC1189c interfaceC1189c = this.f4924d;
        if (interfaceC1189c != null) {
            interfaceC1189c.onAnimationStart();
        }
        do {
            if (!this.f4923c && !this.f4929i) {
                break;
            }
            boolean zM6062a = this.f4927g.m6062a();
            try {
                long jNanoTime2 = System.nanoTime();
                this.f4931k = this.f4927g.m6068l();
                jNanoTime = (System.nanoTime() - jNanoTime2) / 1000000;
                try {
                    this.f4928h.post(this.f4933m);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused) {
                }
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused2) {
                jNanoTime = 0;
            }
            this.f4929i = false;
            if (!this.f4923c || !zM6062a) {
                this.f4923c = false;
                break;
            }
            try {
                int iM6067k = (int) (((long) this.f4927g.m6067k()) - jNanoTime);
                if (iM6067k > 0) {
                    long j = this.f4926f;
                    if (j <= 0) {
                        j = iM6067k;
                    }
                    Thread.sleep(j);
                }
            } catch (InterruptedException unused3) {
            }
        } while (this.f4923c);
        if (this.f4930j) {
            this.f4928h.post(this.f4932l);
        }
        this.f4925e = null;
    }

    public void setBytes(byte[] bArr) {
        C1192a c1192a = new C1192a();
        this.f4927g = c1192a;
        try {
            c1192a.m6070n(bArr);
            if (this.f4923c) {
                m6047o();
            } else {
                m6049l(0);
            }
        } catch (Exception unused) {
            this.f4927g = null;
        }
    }

    public void setFramesDisplayDuration(long j) {
        this.f4926f = j;
    }

    public void setOnAnimationStart(InterfaceC1189c interfaceC1189c) {
        this.f4924d = interfaceC1189c;
    }

    public void setOnAnimationStop(InterfaceC1190d interfaceC1190d) {
    }

    public void setOnFrameAvailable(InterfaceC1191e interfaceC1191e) {
    }

    public GifImageView(Context context) {
        super(context);
        this.f4924d = null;
        this.f4926f = -1L;
        this.f4928h = new Handler(Looper.getMainLooper());
        this.f4932l = new RunnableC1187a();
        this.f4933m = new RunnableC1188b();
    }
}
