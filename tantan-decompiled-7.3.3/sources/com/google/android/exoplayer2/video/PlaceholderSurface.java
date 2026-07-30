package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.RunnableC2078a;
import p153l.kyv;
import p153l.w11;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(17)
@Deprecated
public final class PlaceholderSurface extends Surface {
    private static final String TAG = "PlaceholderSurface";
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final HandlerThreadC2082b thread;
    private boolean threadReleased;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.PlaceholderSurface$b */
    public static class HandlerThreadC2082b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: a */
        public RunnableC2078a f9609a;

        /* JADX INFO: renamed from: b */
        public Handler f9610b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public Error f9611c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public RuntimeException f9612d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public PlaceholderSurface f9613e;

        public HandlerThreadC2082b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        /* JADX INFO: renamed from: a */
        public PlaceholderSurface m12234a(int i) {
            boolean z;
            start();
            this.f9610b = new Handler(getLooper(), this);
            this.f9609a = new RunnableC2078a(this.f9610b);
            synchronized (this) {
                z = false;
                this.f9610b.obtainMessage(1, i, 0).sendToTarget();
                while (this.f9613e == null && this.f9612d == null && this.f9611c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f9612d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f9611c;
            if (error == null) {
                return (PlaceholderSurface) w11.m204369e(this.f9613e);
            }
            throw error;
        }

        /* JADX INFO: renamed from: b */
        public final void m12235b(int i) throws GlUtil.GlException {
            w11.m204369e(this.f9609a);
            this.f9609a.m12213h(i);
            this.f9613e = new PlaceholderSurface(this, this.f9609a.m12212g(), i != 0);
        }

        /* JADX INFO: renamed from: c */
        public void m12236c() {
            w11.m204369e(this.f9610b);
            this.f9610b.sendEmptyMessage(2);
        }

        /* JADX INFO: renamed from: d */
        public final void m12237d() {
            w11.m204369e(this.f9609a);
            this.f9609a.m12214i();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        m12237d();
                    } catch (Throwable th) {
                        try {
                            kyv.m152146d(PlaceholderSurface.TAG, "Failed to release placeholder surface", th);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
                try {
                    m12235b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (GlUtil.GlException e) {
                    kyv.m152146d(PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e);
                    this.f9612d = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    kyv.m152146d(PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e2);
                    this.f9611c = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    kyv.m152146d(PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e3);
                    this.f9612d = e3;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }
    }

    public PlaceholderSurface(HandlerThreadC2082b handlerThreadC2082b, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.thread = handlerThreadC2082b;
        this.secure = z;
    }

    /* JADX INFO: renamed from: a */
    public static int m12231a(Context context) {
        if (GlUtil.m12189h(context)) {
            return GlUtil.m12190i() ? 1 : 2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized boolean m12232b(Context context) {
        try {
            if (!secureModeInitialized) {
                secureMode = m12231a(context);
                secureModeInitialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return secureMode != 0;
    }

    /* JADX INFO: renamed from: c */
    public static PlaceholderSurface m12233c(Context context, boolean z) {
        w11.m204371g(!z || m12232b(context));
        return new HandlerThreadC2082b().m12234a(z ? secureMode : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.thread) {
            try {
                if (!this.threadReleased) {
                    this.thread.m12236c();
                    this.threadReleased = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
