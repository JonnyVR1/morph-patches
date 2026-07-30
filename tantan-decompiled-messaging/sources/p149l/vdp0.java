package p149l;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class vdp0 {

    /* JADX INFO: renamed from: l.vdp0$a */
    public class C20618a implements k2e.InterfaceC17916c {

        /* JADX INFO: renamed from: a */
        private File f181109a = null;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f181110b;

        public C20618a(Context context) {
            this.f181110b = context;
        }

        @Override // p149l.k2e.InterfaceC17916c
        public File get() {
            if (this.f181109a == null) {
                this.f181109a = new File(this.f181110b.getCacheDir(), "volley");
            }
            return this.f181109a;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static yuc0 m198088a(Context context) {
        return m198089b(context, null);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static yuc0 m198089b(Context context, em2 em2Var) {
        return m198090c(context, em2Var == null ? new ys2(new wll()) : new ys2(em2Var));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    private static yuc0 m198090c(Context context, cb20 cb20Var) {
        yuc0 yuc0Var = new yuc0(new k2e(new C20618a(context.getApplicationContext())), cb20Var);
        yuc0Var.m216105g();
        return yuc0Var;
    }
}
