package p153l;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class yew0 {

    /* JADX INFO: renamed from: a */
    public final Context f199425a;

    /* JADX INFO: renamed from: b */
    public final Executor f199426b;

    /* JADX INFO: renamed from: c */
    public final hct0 f199427c;

    /* JADX INFO: renamed from: d */
    public final hew0 f199428d;

    public yew0(Context context, Executor executor, hct0 hct0Var, hew0 hew0Var) {
        this.f199425a = context;
        this.f199426b = executor;
        this.f199427c = hct0Var;
        this.f199428d = hew0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m215477a(String str) {
        this.f199427c.zza(str);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m215478b(String str, cew0 cew0Var) {
        rdw0 rdw0VarM176209a = qdw0.m176209a(this.f199425a, 14);
        rdw0VarM176209a.zzh();
        rdw0VarM176209a.mo162910S(this.f199427c.zza(str));
        if (cew0Var == null) {
            this.f199428d.m134677b(rdw0VarM176209a.zzl());
        } else {
            cew0Var.m109461a(rdw0VarM176209a);
            cew0Var.m109467g();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m215479c(final String str, @Nullable final cew0 cew0Var) {
        if (hew0.m134676a() && ((Boolean) ris0.f163392d.m149974e()).booleanValue()) {
            this.f199426b.execute(new Runnable() { // from class: l.xew0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f193983a.m215478b(str, cew0Var);
                }
            });
        } else {
            this.f199426b.execute(new Runnable() { // from class: l.wew0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f188730a.m215477a(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m215480d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m215479c((String) it.next(), null);
        }
    }
}
