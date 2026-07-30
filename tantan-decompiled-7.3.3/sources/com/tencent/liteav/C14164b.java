package com.tencent.liteav;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.clevertap.android.sdk.Constants;
import com.tencent.liteav.basic.log.TXCLog;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: renamed from: com.tencent.liteav.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14164b {

    /* JADX INFO: renamed from: a */
    private static final String f58875a = "b";

    /* JADX INFO: renamed from: d */
    private a f58878d;

    /* JADX INFO: renamed from: e */
    private HandlerThread f58879e;

    /* JADX INFO: renamed from: k */
    private WeakReference<b> f58885k;

    /* JADX INFO: renamed from: b */
    private int f58876b = 300;

    /* JADX INFO: renamed from: c */
    private long f58877c = 0;

    /* JADX INFO: renamed from: f */
    private boolean f58880f = false;

    /* JADX INFO: renamed from: g */
    private ByteBuffer f58881g = null;

    /* JADX INFO: renamed from: h */
    private Bitmap f58882h = null;

    /* JADX INFO: renamed from: i */
    private int f58883i = 0;

    /* JADX INFO: renamed from: j */
    private int f58884j = 0;

    /* JADX INFO: renamed from: com.tencent.liteav.b$a */
    public class a extends Handler {

        /* JADX INFO: renamed from: b */
        private int f58887b;

        /* JADX INFO: renamed from: c */
        private long f58888c;

        public a(Looper looper, int i, long j) {
            super(looper);
            this.f58887b = i;
            this.f58888c = j;
            TXCLog.m84156w(C14164b.f58875a, "bkgpush:init publish time delay:" + this.f58887b + ", end:" + this.f58888c);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1001) {
                try {
                    C14164b.this.m83890f();
                    if (this.f58888c >= 0 && System.currentTimeMillis() >= this.f58888c) {
                        TXCLog.m84156w(C14164b.f58875a, "bkgpush:stop background publish when timeout");
                        if (C14164b.this.f58885k == null || !C14164b.this.f58880f) {
                            return;
                        }
                        b bVar = (b) C14164b.this.f58885k.get();
                        if (bVar != null) {
                            bVar.mo83895a();
                        }
                        C14164b.this.f58880f = false;
                        return;
                    }
                    sendEmptyMessageDelayed(1001, this.f58887b);
                } catch (Exception e) {
                    TXCLog.m84149e(C14164b.f58875a, "publish image failed." + e.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo83895a();

        /* JADX INFO: renamed from: a */
        void mo83896a(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2);
    }

    public C14164b(b bVar) {
        this.f58885k = null;
        this.f58885k = new WeakReference<>(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0006 A[PHI: r0
      0x0006: PHI (r0v7 int) = (r0v3 int), (r0v4 int) binds: [B:4:0x0004, B:7:0x0009] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: b */
    private void m83885b(int i, int i2) {
        if (i > 0) {
            int i3 = 20;
            if (i >= 20) {
                i = i3;
            } else {
                i3 = 5;
                if (i <= 5) {
                    i = i3;
                }
            }
            this.f58876b = 1000 / i;
        } else {
            this.f58876b = 200;
        }
        long j = i2;
        if (i2 > 0) {
            this.f58877c = System.currentTimeMillis() + (j * 1000);
        } else if (i2 == 0) {
            this.f58877c = System.currentTimeMillis() + Constants.INBOX_V2_THROTTLE_WINDOW_MS;
        } else {
            this.f58877c = -1L;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m83888d() {
        m83889e();
        HandlerThread handlerThread = new HandlerThread("TXImageCapturer");
        this.f58879e = handlerThread;
        handlerThread.start();
        this.f58878d = new a(this.f58879e.getLooper(), this.f58876b, this.f58877c);
    }

    /* JADX INFO: renamed from: e */
    private void m83889e() {
        a aVar = this.f58878d;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
            this.f58878d = null;
        }
        HandlerThread handlerThread = this.f58879e;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f58879e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m83890f() {
        int i;
        b bVar;
        ByteBuffer byteBufferAllocateDirect;
        int height = 0;
        try {
            WeakReference<b> weakReference = this.f58885k;
            if (weakReference == null || !this.f58880f || (bVar = weakReference.get()) == null) {
                return;
            }
            Bitmap bitmap = this.f58882h;
            ByteBuffer byteBuffer = this.f58881g;
            if (byteBuffer != null || bitmap == null) {
                byteBufferAllocateDirect = byteBuffer;
                i = 0;
            } else {
                int width = bitmap.getWidth();
                try {
                    height = bitmap.getHeight();
                    byteBufferAllocateDirect = ByteBuffer.allocateDirect(width * height * 4);
                    bitmap.copyPixelsToBuffer(byteBufferAllocateDirect);
                    byteBufferAllocateDirect.rewind();
                    this.f58881g = byteBufferAllocateDirect;
                    i = height;
                    height = width;
                } catch (Error unused) {
                    i = height;
                    height = width;
                } catch (Exception unused2) {
                    i = height;
                    height = width;
                    TXCLog.m84156w(f58875a, "bkgpush: generate bitmap pixel exception " + height + "*" + i);
                    return;
                }
            }
            if (bitmap == null || byteBufferAllocateDirect == null) {
                return;
            }
            try {
                bVar.mo83896a(bitmap, byteBufferAllocateDirect, this.f58883i, this.f58884j);
                return;
            } catch (Error unused3) {
            } catch (Exception unused4) {
                TXCLog.m84156w(f58875a, "bkgpush: generate bitmap pixel exception " + height + "*" + i);
                return;
            }
        } catch (Error unused5) {
            i = 0;
        } catch (Exception unused6) {
            i = 0;
        }
        TXCLog.m84156w(f58875a, "bkgpush: generate bitmap pixel error " + height + "*" + i);
    }

    /* JADX INFO: renamed from: a */
    public void m83892a(int i, int i2, Bitmap bitmap, int i3, int i4) {
        if (this.f58880f) {
            TXCLog.m84156w(f58875a, "bkgpush: start background publish return when started");
            return;
        }
        if (bitmap == null) {
            try {
                TXCLog.m84156w(f58875a, "bkgpush: background publish img is empty, add default img " + i3 + "*" + i4);
                ColorDrawable colorDrawable = new ColorDrawable(RoundedDrawable.DEFAULT_BORDER_COLOR);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                colorDrawable.draw(new Canvas(bitmapCreateBitmap));
                bitmap = bitmapCreateBitmap;
            } catch (Error e) {
                TXCLog.m84150e(f58875a, "save bitmap failed.", e);
            } catch (Exception e2) {
                TXCLog.m84150e(f58875a, "save bitmap failed.", e2);
            }
        }
        TXCLog.m84156w(f58875a, "bkgpush: generate bitmap " + i3 + "*" + i4);
        this.f58882h = bitmap;
        this.f58883i = i3;
        this.f58884j = i4;
        m83891a(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public void m83894b() {
        this.f58880f = false;
        this.f58881g = null;
        this.f58882h = null;
        TXCLog.m84156w(f58875a, "bkgpush: stop background publish");
        m83889e();
    }

    /* JADX INFO: renamed from: a */
    public void m83891a(int i, int i2) {
        if (this.f58880f) {
            TXCLog.m84156w(f58875a, "bkgpush: start background publish return when started");
            return;
        }
        this.f58880f = true;
        m83885b(i, i2);
        m83888d();
        a aVar = this.f58878d;
        if (aVar != null) {
            aVar.sendEmptyMessageDelayed(1001, this.f58876b);
        }
        TXCLog.m84156w(f58875a, "bkgpush: start background publish with time:" + ((this.f58877c - System.currentTimeMillis()) / 1000) + ", interval:" + this.f58876b);
    }

    /* JADX INFO: renamed from: a */
    public boolean m83893a() {
        return this.f58880f;
    }
}
