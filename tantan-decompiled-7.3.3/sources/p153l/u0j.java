package p153l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class u0j extends iye.AbstractC17823c {

    /* JADX INFO: renamed from: i */
    public static final C20442a f176893i = new C20442a();

    /* JADX INFO: renamed from: l.u0j$a */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class C20442a {
        /* JADX INFO: renamed from: a */
        public Typeface m193831a(@NonNull Context context, @NonNull x0j.C21223b c21223b) throws PackageManager.NameNotFoundException {
            return x0j.m208855a(context, null, new x0j.C21223b[]{c21223b});
        }

        /* JADX INFO: renamed from: b */
        public x0j.C21222a m193832b(@NonNull Context context, @NonNull t0j t0jVar) throws PackageManager.NameNotFoundException {
            return x0j.m208856b(context, null, t0jVar);
        }

        /* JADX INFO: renamed from: c */
        public void m193833c(@NonNull Context context, @NonNull Uri uri, @NonNull ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        /* JADX INFO: renamed from: d */
        public void m193834d(@NonNull Context context, @NonNull ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: renamed from: l.u0j$b */
    public static class C20443b implements iye.InterfaceC17826f {

        /* JADX INFO: renamed from: a */
        public final Context f176894a;

        /* JADX INFO: renamed from: b */
        public final t0j f176895b;

        /* JADX INFO: renamed from: c */
        public final C20442a f176896c;

        /* JADX INFO: renamed from: d */
        public final Object f176897d = new Object();

        /* JADX INFO: renamed from: e */
        @GuardedBy("mLock")
        public Handler f176898e;

        /* JADX INFO: renamed from: f */
        @GuardedBy("mLock")
        public HandlerThread f176899f;

        /* JADX INFO: renamed from: g */
        @Nullable
        @GuardedBy("mLock")
        public AbstractC20444c f176900g;

        /* JADX INFO: renamed from: h */
        public iye.AbstractC17827g f176901h;

        /* JADX INFO: renamed from: i */
        public ContentObserver f176902i;

        /* JADX INFO: renamed from: j */
        public Runnable f176903j;

        /* JADX INFO: renamed from: l.u0j$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ iye.AbstractC17827g f176904a;

            public a(iye.AbstractC17827g abstractC17827g) {
                this.f176904a = abstractC17827g;
            }

            @Override // java.lang.Runnable
            public void run() {
                C20443b c20443b = C20443b.this;
                c20443b.f176901h = this.f176904a;
                c20443b.m193836c();
            }
        }

        /* JADX INFO: renamed from: l.u0j$b$b */
        public class b extends ContentObserver {
            public b(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z, Uri uri) {
                C20443b.this.m193836c();
            }
        }

        /* JADX INFO: renamed from: l.u0j$b$c */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C20443b.this.m193836c();
            }
        }

        public C20443b(@NonNull Context context, @NonNull t0j t0jVar, @NonNull C20442a c20442a) {
            yn80.m216776f(context, "Context cannot be null");
            yn80.m216776f(t0jVar, "FontRequest cannot be null");
            this.f176894a = context.getApplicationContext();
            this.f176895b = t0jVar;
            this.f176896c = c20442a;
        }

        @Override // p153l.iye.InterfaceC17826f
        @RequiresApi(19)
        /* JADX INFO: renamed from: a */
        public void mo142652a(@NonNull iye.AbstractC17827g abstractC17827g) {
            yn80.m216776f(abstractC17827g, "LoaderCallback cannot be null");
            synchronized (this.f176897d) {
                try {
                    if (this.f176898e == null) {
                        HandlerThread handlerThread = new HandlerThread("emojiCompat", 10);
                        this.f176899f = handlerThread;
                        handlerThread.start();
                        this.f176898e = new Handler(this.f176899f.getLooper());
                    }
                    this.f176898e.post(new a(abstractC17827g));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m193835b() {
            this.f176901h = null;
            ContentObserver contentObserver = this.f176902i;
            if (contentObserver != null) {
                this.f176896c.m193834d(this.f176894a, contentObserver);
                this.f176902i = null;
            }
            synchronized (this.f176897d) {
                try {
                    this.f176898e.removeCallbacks(this.f176903j);
                    HandlerThread handlerThread = this.f176899f;
                    if (handlerThread != null) {
                        handlerThread.quit();
                    }
                    this.f176898e = null;
                    this.f176899f = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @RequiresApi(19)
        /* JADX INFO: renamed from: c */
        public void m193836c() {
            if (this.f176901h == null) {
                return;
            }
            try {
                x0j.C21223b c21223bM193837d = m193837d();
                int iM208862b = c21223bM193837d.m208862b();
                if (iM208862b == 2) {
                    synchronized (this.f176897d) {
                        try {
                            AbstractC20444c abstractC20444c = this.f176900g;
                            if (abstractC20444c != null) {
                                long jM193839a = abstractC20444c.m193839a();
                                if (jM193839a >= 0) {
                                    m193838e(c21223bM193837d.m208864d(), jM193839a);
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (iM208862b != 0) {
                    throw new RuntimeException("fetchFonts result is not OK. (" + iM208862b + ")");
                }
                Typeface typefaceM193831a = this.f176896c.m193831a(this.f176894a, c21223bM193837d);
                ByteBuffer byteBufferM159294f = moj0.m159294f(this.f176894a, null, c21223bM193837d.m208864d());
                if (byteBufferM159294f == null) {
                    throw new RuntimeException("Unable to open file.");
                }
                this.f176901h.mo142646b(ha00.m134093b(typefaceM193831a, byteBufferM159294f));
                m193835b();
            } catch (Throwable th2) {
                this.f176901h.mo142645a(th2);
                m193835b();
            }
        }

        /* JADX INFO: renamed from: d */
        public final x0j.C21223b m193837d() {
            try {
                x0j.C21222a c21222aM193832b = this.f176896c.m193832b(this.f176894a, this.f176895b);
                if (c21222aM193832b.m208860c() != 0) {
                    throw new RuntimeException("fetchFonts failed (" + c21222aM193832b.m208860c() + ")");
                }
                x0j.C21223b[] c21223bArrM208859b = c21222aM193832b.m208859b();
                if (c21223bArrM208859b != null && c21223bArrM208859b.length != 0) {
                    return c21223bArrM208859b[0];
                }
                azk0.m101074a("fetchFonts failed (empty result)");
                return null;
            } catch (PackageManager.NameNotFoundException e) {
                vtq0.m202761a("provider not found", e);
                return null;
            }
        }

        @RequiresApi(19)
        /* JADX INFO: renamed from: e */
        public final void m193838e(Uri uri, long j) {
            synchronized (this.f176897d) {
                try {
                    if (this.f176902i == null) {
                        b bVar = new b(this.f176898e);
                        this.f176902i = bVar;
                        this.f176896c.m193833c(this.f176894a, uri, bVar);
                    }
                    if (this.f176903j == null) {
                        this.f176903j = new c();
                    }
                    this.f176898e.postDelayed(this.f176903j, j);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.u0j$c */
    public static abstract class AbstractC20444c {
        /* JADX INFO: renamed from: a */
        public abstract long m193839a();
    }

    public u0j(@NonNull Context context, @NonNull t0j t0jVar) {
        super(new C20443b(context, t0jVar, f176893i));
    }
}
