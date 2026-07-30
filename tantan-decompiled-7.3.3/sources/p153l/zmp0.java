package p153l;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class zmp0 {

    /* JADX INFO: renamed from: l.zmp0$a */
    public class C21840a implements y3e.InterfaceC21506c {

        /* JADX INFO: renamed from: a */
        private File f205094a = null;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f205095b;

        public C21840a(Context context) {
            this.f205095b = context;
        }

        @Override // p153l.y3e.InterfaceC21506c
        public File get() {
            if (this.f205094a == null) {
                this.f205094a = new File(this.f205095b.getCacheDir(), "volley");
            }
            return this.f205094a;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static b3d0 m220474a(Context context) {
        return m220475b(context, null);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static b3d0 m220475b(Context context, mm2 mm2Var) {
        return m220476c(context, mm2Var == null ? new ot2(new iol()) : new ot2(mm2Var));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    private static b3d0 m220476c(Context context, lj20 lj20Var) {
        b3d0 b3d0Var = new b3d0(new y3e(new C21840a(context.getApplicationContext())), lj20Var);
        b3d0Var.m102284g();
        return b3d0Var;
    }
}
