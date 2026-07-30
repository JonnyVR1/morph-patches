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
public class C14001b {

    /* JADX INFO: renamed from: a */
    private static final String f58027a = "b";

    /* JADX INFO: renamed from: d */
    private a f58030d;

    /* JADX INFO: renamed from: e */
    private HandlerThread f58031e;

    /* JADX INFO: renamed from: k */
    private WeakReference<b> f58037k;

    /* JADX INFO: renamed from: b */
    private int f58028b = 300;

    /* JADX INFO: renamed from: c */
    private long f58029c = 0;

    /* JADX INFO: renamed from: f */
    private boolean f58032f = false;

    /* JADX INFO: renamed from: g */
    private ByteBuffer f58033g = null;

    /* JADX INFO: renamed from: h */
    private Bitmap f58034h = null;

    /* JADX INFO: renamed from: i */
    private int f58035i = 0;

    /* JADX INFO: renamed from: j */
    private int f58036j = 0;

    /* JADX INFO: renamed from: com.tencent.liteav.b$a */
    public class a extends Handler {

        /* JADX INFO: renamed from: b */
        private int f58039b;

        /* JADX INFO: renamed from: c */
        private long f58040c;

        public a(Looper looper, int i, long j) {
            super(looper);
            this.f58039b = i;
            this.f58040c = j;
            TXCLog.m82973w(C14001b.f58027a, "bkgpush:init publish time delay:" + this.f58039b + ", end:" + this.f58040c);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1001) {
                try {
                    C14001b.this.m82707f();
                    if (this.f58040c >= 0 && System.currentTimeMillis() >= this.f58040c) {
                        TXCLog.m82973w(C14001b.f58027a, "bkgpush:stop background publish when timeout");
                        if (C14001b.this.f58037k == null || !C14001b.this.f58032f) {
                            return;
                        }
                        b bVar = (b) C14001b.this.f58037k.get();
                        if (bVar != null) {
                            bVar.mo82712a();
                        }
                        C14001b.this.f58032f = false;
                        return;
                    }
                    sendEmptyMessageDelayed(1001, this.f58039b);
                } catch (Exception e) {
                    TXCLog.m82966e(C14001b.f58027a, "publish image failed." + e.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo82712a();

        /* JADX INFO: renamed from: a */
        void mo82713a(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2);
    }

    public C14001b(b bVar) {
        this.f58037k = null;
        this.f58037k = new WeakReference<>(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0006 A[PHI: r0
      0x0006: PHI (r0v7 int) = (r0v3 int), (r0v4 int) binds: [B:4:0x0004, B:7:0x0009] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: b */
    private void m82702b(int i, int i2) {
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
            this.f58028b = 1000 / i;
        } else {
            this.f58028b = 200;
        }
        long j = i2;
        if (i2 > 0) {
            this.f58029c = System.currentTimeMillis() + (j * 1000);
        } else if (i2 == 0) {
            this.f58029c = System.currentTimeMillis() + Constants.INBOX_V2_THROTTLE_WINDOW_MS;
        } else {
            this.f58029c = -1L;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m82705d() {
        m82706e();
        HandlerThread handlerThread = new HandlerThread("TXImageCapturer");
        this.f58031e = handlerThread;
        handlerThread.start();
        this.f58030d = new a(this.f58031e.getLooper(), this.f58028b, this.f58029c);
    }

    /* JADX INFO: renamed from: e */
    private void m82706e() {
        a aVar = this.f58030d;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
            this.f58030d = null;
        }
        HandlerThread handlerThread = this.f58031e;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f58031e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m82707f() {
        int i;
        b bVar;
        ByteBuffer byteBufferAllocateDirect;
        int height = 0;
        try {
            WeakReference<b> weakReference = this.f58037k;
            if (weakReference == null || !this.f58032f || (bVar = weakReference.get()) == null) {
                return;
            }
            Bitmap bitmap = this.f58034h;
            ByteBuffer byteBuffer = this.f58033g;
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
                    this.f58033g = byteBufferAllocateDirect;
                    i = height;
                    height = width;
                } catch (Error unused) {
                    i = height;
                    height = width;
                } catch (Exception unused2) {
                    i = height;
                    height = width;
                    TXCLog.m82973w(f58027a, "bkgpush: generate bitmap pixel exception " + height + "*" + i);
                    return;
                }
            }
            if (bitmap == null || byteBufferAllocateDirect == null) {
                return;
            }
            try {
                bVar.mo82713a(bitmap, byteBufferAllocateDirect, this.f58035i, this.f58036j);
                return;
            } catch (Error unused3) {
            } catch (Exception unused4) {
                TXCLog.m82973w(f58027a, "bkgpush: generate bitmap pixel exception " + height + "*" + i);
                return;
            }
        } catch (Error unused5) {
            i = 0;
        } catch (Exception unused6) {
            i = 0;
        }
        TXCLog.m82973w(f58027a, "bkgpush: generate bitmap pixel error " + height + "*" + i);
    }

    /* JADX INFO: renamed from: a */
    public void m82709a(int i, int i2, Bitmap bitmap, int i3, int i4) {
        if (this.f58032f) {
            TXCLog.m82973w(f58027a, "bkgpush: start background publish return when started");
            return;
        }
        if (bitmap == null) {
            try {
                TXCLog.m82973w(f58027a, "bkgpush: background publish img is empty, add default img " + i3 + "*" + i4);
                ColorDrawable colorDrawable = new ColorDrawable(RoundedDrawable.DEFAULT_BORDER_COLOR);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                colorDrawable.draw(new Canvas(bitmapCreateBitmap));
                bitmap = bitmapCreateBitmap;
            } catch (Error e) {
                TXCLog.m82967e(f58027a, "save bitmap failed.", e);
            } catch (Exception e2) {
                TXCLog.m82967e(f58027a, "save bitmap failed.", e2);
            }
        }
        TXCLog.m82973w(f58027a, "bkgpush: generate bitmap " + i3 + "*" + i4);
        this.f58034h = bitmap;
        this.f58035i = i3;
        this.f58036j = i4;
        m82708a(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public void m82711b() {
        this.f58032f = false;
        this.f58033g = null;
        this.f58034h = null;
        TXCLog.m82973w(f58027a, "bkgpush: stop background publish");
        m82706e();
    }

    /* JADX INFO: renamed from: a */
    public void m82708a(int i, int i2) {
        if (this.f58032f) {
            TXCLog.m82973w(f58027a, "bkgpush: start background publish return when started");
            return;
        }
        this.f58032f = true;
        m82702b(i, i2);
        m82705d();
        a aVar = this.f58030d;
        if (aVar != null) {
            aVar.sendEmptyMessageDelayed(1001, this.f58028b);
        }
        TXCLog.m82973w(f58027a, "bkgpush: start background publish with time:" + ((this.f58029c - System.currentTimeMillis()) / 1000) + ", interval:" + this.f58028b);
    }

    /* JADX INFO: renamed from: a */
    public boolean m82710a() {
        return this.f58032f;
    }
}
