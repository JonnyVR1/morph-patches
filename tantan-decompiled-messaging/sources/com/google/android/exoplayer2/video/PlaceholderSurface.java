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
import com.google.android.exoplayer2.util.RunnableC2055a;
import p149l.jwv;
import p149l.p11;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(17)
@Deprecated
public final class PlaceholderSurface extends Surface {
    private static final String TAG = "PlaceholderSurface";
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final HandlerThreadC2059b thread;
    private boolean threadReleased;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.PlaceholderSurface$b */
    public static class HandlerThreadC2059b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: a */
        public RunnableC2055a f9572a;

        /* JADX INFO: renamed from: b */
        public Handler f9573b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public Error f9574c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public RuntimeException f9575d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public PlaceholderSurface f9576e;

        public HandlerThreadC2059b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        /* JADX INFO: renamed from: a */
        public PlaceholderSurface m12180a(int i) {
            boolean z;
            start();
            this.f9573b = new Handler(getLooper(), this);
            this.f9572a = new RunnableC2055a(this.f9573b);
            synchronized (this) {
                z = false;
                this.f9573b.obtainMessage(1, i, 0).sendToTarget();
                while (this.f9576e == null && this.f9575d == null && this.f9574c == null) {
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
            RuntimeException runtimeException = this.f9575d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f9574c;
            if (error == null) {
                return (PlaceholderSurface) p11.m167011e(this.f9576e);
            }
            throw error;
        }

        /* JADX INFO: renamed from: b */
        public final void m12181b(int i) throws GlUtil.GlException {
            p11.m167011e(this.f9572a);
            this.f9572a.m12159h(i);
            this.f9576e = new PlaceholderSurface(this, this.f9572a.m12158g(), i != 0);
        }

        /* JADX INFO: renamed from: c */
        public void m12182c() {
            p11.m167011e(this.f9573b);
            this.f9573b.sendEmptyMessage(2);
        }

        /* JADX INFO: renamed from: d */
        public final void m12183d() {
            p11.m167011e(this.f9572a);
            this.f9572a.m12160i();
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
                        m12183d();
                    } catch (Throwable th) {
                        try {
                            jwv.m143684d(PlaceholderSurface.TAG, "Failed to release placeholder surface", th);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
                try {
                    m12181b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (GlUtil.GlException e) {
                    jwv.m143684d(PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e);
                    this.f9575d = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    jwv.m143684d(PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e2);
                    this.f9574c = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    jwv.m143684d(PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e3);
                    this.f9575d = e3;
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

    public PlaceholderSurface(HandlerThreadC2059b handlerThreadC2059b, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.thread = handlerThreadC2059b;
        this.secure = z;
    }

    /* JADX INFO: renamed from: a */
    public static int m12177a(Context context) {
        if (GlUtil.m12135h(context)) {
            return GlUtil.m12136i() ? 1 : 2;
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized boolean m12178b(Context context) {
        try {
            if (!secureModeInitialized) {
                secureMode = m12177a(context);
                secureModeInitialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return secureMode != 0;
    }

    /* JADX INFO: renamed from: c */
    public static PlaceholderSurface m12179c(Context context, boolean z) {
        p11.m167013g(!z || m12178b(context));
        return new HandlerThreadC2059b().m12180a(z ? secureMode : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.thread) {
            try {
                if (!this.threadReleased) {
                    this.thread.m12182c();
                    this.threadReleased = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
