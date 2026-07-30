package p153l;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a6r0 implements Runnable {

    /* JADX INFO: renamed from: a */
    private Context f68752a;

    /* JADX INFO: renamed from: b */
    private File f68753b;

    /* JADX INFO: renamed from: c */
    private Runnable f68754c;

    /* JADX INFO: renamed from: l.a6r0$a */
    public static class C15660a extends a6r0 {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Runnable f68755d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15660a(Context context, File file, Runnable runnable) {
            super(context, file, null);
            this.f68755d = runnable;
        }

        @Override // p153l.a6r0
        /* JADX INFO: renamed from: a */
        public void mo96341a(Context context) {
            Runnable runnable = this.f68755d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private a6r0(Context context, File file) {
        this.f68752a = context;
        this.f68753b = file;
    }

    /* JADX INFO: renamed from: b */
    public static void m96340b(Context context, File file, Runnable runnable) {
        new C15660a(context, file, runnable).run();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo96341a(Context context);

    @Override // java.lang.Runnable
    public final void run() {
        y5r0 y5r0VarM214315a = null;
        try {
            if (this.f68753b == null) {
                this.f68753b = new File(this.f68752a.getFilesDir(), "default_locker");
            }
            y5r0VarM214315a = y5r0.m214315a(this.f68752a, this.f68753b);
            Runnable runnable = this.f68754c;
            if (runnable != null) {
                runnable.run();
            }
            mo96341a(this.f68752a);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (y5r0VarM214315a != null) {
                y5r0VarM214315a.m214316b();
            }
        }
    }

    public /* synthetic */ a6r0(Context context, File file, C15660a c15660a) {
        this(context, file);
    }
}
