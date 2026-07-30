package p149l;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class d84 {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final byi.C16015c f84812a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Handler f84813b;

    /* JADX INFO: renamed from: l.d84$a */
    public class RunnableC16311a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ byi.C16015c f84814a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Typeface f84815b;

        public RunnableC16311a(byi.C16015c c16015c, Typeface typeface) {
            this.f84814a = c16015c;
            this.f84815b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f84814a.mo101545b(this.f84815b);
        }
    }

    /* JADX INFO: renamed from: l.d84$b */
    public class RunnableC16312b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ byi.C16015c f84817a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f84818b;

        public RunnableC16312b(byi.C16015c c16015c, int i) {
            this.f84817a = c16015c;
            this.f84818b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f84817a.mo101544a(this.f84818b);
        }
    }

    public d84(@NonNull byi.C16015c c16015c, @NonNull Handler handler) {
        this.f84812a = c16015c;
        this.f84813b = handler;
    }

    /* JADX INFO: renamed from: a */
    public final void m110262a(int i) {
        this.f84813b.post(new RunnableC16312b(this.f84812a, i));
    }

    /* JADX INFO: renamed from: b */
    public void m110263b(@NonNull zxi.C21809e c21809e) {
        if (c21809e.m220835a()) {
            m110264c(c21809e.f205457a);
        } else {
            m110262a(c21809e.f205458b);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m110264c(@NonNull Typeface typeface) {
        this.f84813b.post(new RunnableC16311a(this.f84812a, typeface));
    }
}
