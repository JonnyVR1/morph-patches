package p149l;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class uwq0 implements Runnable {

    /* JADX INFO: renamed from: a */
    private Context f178668a;

    /* JADX INFO: renamed from: b */
    private File f178669b;

    /* JADX INFO: renamed from: c */
    private Runnable f178670c;

    /* JADX INFO: renamed from: l.uwq0$a */
    public static class C20531a extends uwq0 {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Runnable f178671d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20531a(Context context, File file, Runnable runnable) {
            super(context, file, null);
            this.f178671d = runnable;
        }

        @Override // p149l.uwq0
        /* JADX INFO: renamed from: a */
        public void mo196135a(Context context) {
            Runnable runnable = this.f178671d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private uwq0(Context context, File file) {
        this.f178668a = context;
        this.f178669b = file;
    }

    /* JADX INFO: renamed from: b */
    public static void m196134b(Context context, File file, Runnable runnable) {
        new C20531a(context, file, runnable).run();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo196135a(Context context);

    @Override // java.lang.Runnable
    public final void run() {
        swq0 swq0VarM186333a = null;
        try {
            if (this.f178669b == null) {
                this.f178669b = new File(this.f178668a.getFilesDir(), "default_locker");
            }
            swq0VarM186333a = swq0.m186333a(this.f178668a, this.f178669b);
            Runnable runnable = this.f178670c;
            if (runnable != null) {
                runnable.run();
            }
            mo196135a(this.f178668a);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (swq0VarM186333a != null) {
                swq0VarM186333a.m186334b();
            }
        }
    }

    public /* synthetic */ uwq0(Context context, File file, C20531a c20531a) {
        this(context, file);
    }
}
