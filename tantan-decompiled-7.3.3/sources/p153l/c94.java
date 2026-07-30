package p153l;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class c94 {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final x0j.C21224c f80285a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Handler f80286b;

    /* JADX INFO: renamed from: l.c94$a */
    public class RunnableC16212a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x0j.C21224c f80287a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Typeface f80288b;

        public RunnableC16212a(x0j.C21224c c21224c, Typeface typeface) {
            this.f80287a = c21224c;
            this.f80288b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f80287a.mo126464b(this.f80288b);
        }
    }

    /* JADX INFO: renamed from: l.c94$b */
    public class RunnableC16213b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x0j.C21224c f80290a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f80291b;

        public RunnableC16213b(x0j.C21224c c21224c, int i) {
            this.f80290a = c21224c;
            this.f80291b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f80290a.mo126463a(this.f80291b);
        }
    }

    public c94(@NonNull x0j.C21224c c21224c, @NonNull Handler handler) {
        this.f80285a = c21224c;
        this.f80286b = handler;
    }

    /* JADX INFO: renamed from: a */
    public final void m108404a(int i) {
        this.f80286b.post(new RunnableC16213b(this.f80285a, i));
    }

    /* JADX INFO: renamed from: b */
    public void m108405b(@NonNull v0j.C20715e c20715e) {
        if (c20715e.m198909a()) {
            m108406c(c20715e.f181876a);
        } else {
            m108404a(c20715e.f181877b);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m108406c(@NonNull Typeface typeface) {
        this.f80286b.post(new RunnableC16212a(this.f80285a, typeface));
    }
}
