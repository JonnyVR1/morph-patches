package p149l;

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
public class yxi extends exe.AbstractC16711c {

    /* JADX INFO: renamed from: i */
    public static final C21569a f200613i = new C21569a();

    /* JADX INFO: renamed from: l.yxi$a */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class C21569a {
        /* JADX INFO: renamed from: a */
        public Typeface m216450a(@NonNull Context context, @NonNull byi.C16014b c16014b) throws PackageManager.NameNotFoundException {
            return byi.m104458a(context, null, new byi.C16014b[]{c16014b});
        }

        /* JADX INFO: renamed from: b */
        public byi.C16013a m216451b(@NonNull Context context, @NonNull xxi xxiVar) throws PackageManager.NameNotFoundException {
            return byi.m104459b(context, null, xxiVar);
        }

        /* JADX INFO: renamed from: c */
        public void m216452c(@NonNull Context context, @NonNull Uri uri, @NonNull ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        /* JADX INFO: renamed from: d */
        public void m216453d(@NonNull Context context, @NonNull ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: renamed from: l.yxi$b */
    public static class C21570b implements exe.InterfaceC16714f {

        /* JADX INFO: renamed from: a */
        public final Context f200614a;

        /* JADX INFO: renamed from: b */
        public final xxi f200615b;

        /* JADX INFO: renamed from: c */
        public final C21569a f200616c;

        /* JADX INFO: renamed from: d */
        public final Object f200617d = new Object();

        /* JADX INFO: renamed from: e */
        @GuardedBy("mLock")
        public Handler f200618e;

        /* JADX INFO: renamed from: f */
        @GuardedBy("mLock")
        public HandlerThread f200619f;

        /* JADX INFO: renamed from: g */
        @Nullable
        @GuardedBy("mLock")
        public AbstractC21571c f200620g;

        /* JADX INFO: renamed from: h */
        public exe.AbstractC16715g f200621h;

        /* JADX INFO: renamed from: i */
        public ContentObserver f200622i;

        /* JADX INFO: renamed from: j */
        public Runnable f200623j;

        /* JADX INFO: renamed from: l.yxi$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ exe.AbstractC16715g f200624a;

            public a(exe.AbstractC16715g abstractC16715g) {
                this.f200624a = abstractC16715g;
            }

            @Override // java.lang.Runnable
            public void run() {
                C21570b c21570b = C21570b.this;
                c21570b.f200621h = this.f200624a;
                c21570b.m216455c();
            }
        }

        /* JADX INFO: renamed from: l.yxi$b$b */
        public class b extends ContentObserver {
            public b(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z, Uri uri) {
                C21570b.this.m216455c();
            }
        }

        /* JADX INFO: renamed from: l.yxi$b$c */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C21570b.this.m216455c();
            }
        }

        public C21570b(@NonNull Context context, @NonNull xxi xxiVar, @NonNull C21569a c21569a) {
            tf80.m188659f(context, "Context cannot be null");
            tf80.m188659f(xxiVar, "FontRequest cannot be null");
            this.f200614a = context.getApplicationContext();
            this.f200615b = xxiVar;
            this.f200616c = c21569a;
        }

        @Override // p149l.exe.InterfaceC16714f
        @RequiresApi(19)
        /* JADX INFO: renamed from: a */
        public void mo118661a(@NonNull exe.AbstractC16715g abstractC16715g) {
            tf80.m188659f(abstractC16715g, "LoaderCallback cannot be null");
            synchronized (this.f200617d) {
                try {
                    if (this.f200618e == null) {
                        HandlerThread handlerThread = new HandlerThread("emojiCompat", 10);
                        this.f200619f = handlerThread;
                        handlerThread.start();
                        this.f200618e = new Handler(this.f200619f.getLooper());
                    }
                    this.f200618e.post(new a(abstractC16715g));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m216454b() {
            this.f200621h = null;
            ContentObserver contentObserver = this.f200622i;
            if (contentObserver != null) {
                this.f200616c.m216453d(this.f200614a, contentObserver);
                this.f200622i = null;
            }
            synchronized (this.f200617d) {
                try {
                    this.f200618e.removeCallbacks(this.f200623j);
                    HandlerThread handlerThread = this.f200619f;
                    if (handlerThread != null) {
                        handlerThread.quit();
                    }
                    this.f200618e = null;
                    this.f200619f = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @RequiresApi(19)
        /* JADX INFO: renamed from: c */
        public void m216455c() {
            if (this.f200621h == null) {
                return;
            }
            try {
                byi.C16014b c16014bM216456d = m216456d();
                int iM104465b = c16014bM216456d.m104465b();
                if (iM104465b == 2) {
                    synchronized (this.f200617d) {
                        try {
                            AbstractC21571c abstractC21571c = this.f200620g;
                            if (abstractC21571c != null) {
                                long jM216458a = abstractC21571c.m216458a();
                                if (jM216458a >= 0) {
                                    m216457e(c16014bM216456d.m104467d(), jM216458a);
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (iM104465b != 0) {
                    throw new RuntimeException("fetchFonts result is not OK. (" + iM104465b + ")");
                }
                Typeface typefaceM216450a = this.f200616c.m216450a(this.f200614a, c16014bM216456d);
                ByteBuffer byteBufferM135934f = ifj0.m135934f(this.f200614a, null, c16014bM216456d.m104467d());
                if (byteBufferM135934f == null) {
                    throw new RuntimeException("Unable to open file.");
                }
                this.f200621h.mo118655b(k100.m144126b(typefaceM216450a, byteBufferM135934f));
                m216454b();
            } catch (Throwable th2) {
                this.f200621h.mo118654a(th2);
                m216454b();
            }
        }

        /* JADX INFO: renamed from: d */
        public final byi.C16014b m216456d() {
            try {
                byi.C16013a c16013aM216451b = this.f200616c.m216451b(this.f200614a, this.f200615b);
                if (c16013aM216451b.m104463c() != 0) {
                    throw new RuntimeException("fetchFonts failed (" + c16013aM216451b.m104463c() + ")");
                }
                byi.C16014b[] c16014bArrM104462b = c16013aM216451b.m104462b();
                if (c16014bArrM104462b != null && c16014bArrM104462b.length != 0) {
                    return c16014bArrM104462b[0];
                }
                upk0.m194883a("fetchFonts failed (empty result)");
                return null;
            } catch (PackageManager.NameNotFoundException e) {
                pkq0.m170054a("provider not found", e);
                return null;
            }
        }

        @RequiresApi(19)
        /* JADX INFO: renamed from: e */
        public final void m216457e(Uri uri, long j) {
            synchronized (this.f200617d) {
                try {
                    if (this.f200622i == null) {
                        b bVar = new b(this.f200618e);
                        this.f200622i = bVar;
                        this.f200616c.m216452c(this.f200614a, uri, bVar);
                    }
                    if (this.f200623j == null) {
                        this.f200623j = new c();
                    }
                    this.f200618e.postDelayed(this.f200623j, j);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.yxi$c */
    public static abstract class AbstractC21571c {
        /* JADX INFO: renamed from: a */
        public abstract long m216458a();
    }

    public yxi(@NonNull Context context, @NonNull xxi xxiVar) {
        super(new C21570b(context, xxiVar, f200613i));
    }
}
