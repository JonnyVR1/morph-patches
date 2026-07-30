package p149l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class evv0 implements gdv0 {

    /* JADX INFO: renamed from: a */
    public final Context f93392a;

    /* JADX INFO: renamed from: b */
    public final Executor f93393b;

    /* JADX INFO: renamed from: c */
    public final xbt0 f93394c;

    /* JADX INFO: renamed from: d */
    public final qcv0 f93395d;

    /* JADX INFO: renamed from: e */
    public final iwv0 f93396e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public s8s0 f93397f;

    /* JADX INFO: renamed from: g */
    public final b5w0 f93398g;

    /* JADX INFO: renamed from: h */
    public final gyv0 f93399h;

    /* JADX INFO: renamed from: i */
    public gnr f93400i;

    public evv0(Context context, Executor executor, xbt0 xbt0Var, qcv0 qcv0Var, iwv0 iwv0Var, gyv0 gyv0Var) {
        this.f93392a = context;
        this.f93393b = executor;
        this.f93394c = xbt0Var;
        this.f93395d = qcv0Var;
        this.f93399h = gyv0Var;
        this.f93396e = iwv0Var;
        this.f93398g = xbt0Var.mo135792D();
    }

    @Override // p149l.gdv0
    /* JADX INFO: renamed from: a */
    public final boolean mo113608a(zzl zzlVar, String str, edv0 edv0Var, fdv0 fdv0Var) {
        j9u0 j9u0VarZzf;
        w4w0 w4w0VarMo116366d;
        if (str == null) {
            x2t0.m206866d("Ad unit ID should not be null for interstitial ad.");
            this.f93393b.execute(new Runnable() { // from class: l.yuv0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f200135a.m118332g();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132009N8)).booleanValue() && zzlVar.zzf) {
            this.f93394c.mo135805p().m113352n(true);
        }
        zzq zzqVar = ((xuv0) edv0Var).f194559a;
        gyv0 gyv0Var = this.f93399h;
        gyv0Var.m128758J(str);
        gyv0Var.m128757I(zzqVar);
        gyv0Var.m128770e(zzlVar);
        Context context = this.f93392a;
        iyv0 iyv0VarM128772g = gyv0Var.m128772g();
        l4w0 l4w0VarM144515b = k4w0.m144515b(context, v4w0.m197070f(iyv0VarM128772g), 4, zzlVar);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132178b8)).booleanValue()) {
            i9u0 i9u0VarMo135801l = this.f93394c.mo135801l();
            kwt0 kwt0Var = new kwt0();
            kwt0Var.m147644e(this.f93392a);
            kwt0Var.m147648i(iyv0VarM128772g);
            i9u0VarMo135801l.mo106788n(kwt0Var.m147649j());
            f4u0 f4u0Var = new f4u0();
            f4u0Var.m119450m(this.f93395d, this.f93393b);
            f4u0Var.m119451n(this.f93395d, this.f93393b);
            i9u0VarMo135801l.mo106784i(f4u0Var.m119454q());
            i9u0VarMo135801l.mo106787m(new oav0(this.f93397f));
            j9u0VarZzf = i9u0VarMo135801l.zzh();
        } else {
            f4u0 f4u0Var2 = new f4u0();
            iwv0 iwv0Var = this.f93396e;
            if (iwv0Var != null) {
                f4u0Var2.m119445h(iwv0Var, this.f93393b);
                f4u0Var2.m119446i(this.f93396e, this.f93393b);
                f4u0Var2.m119442e(this.f93396e, this.f93393b);
            }
            i9u0 i9u0VarMo135801l2 = this.f93394c.mo135801l();
            kwt0 kwt0Var2 = new kwt0();
            kwt0Var2.m147644e(this.f93392a);
            kwt0Var2.m147648i(iyv0VarM128772g);
            i9u0VarMo135801l2.mo106788n(kwt0Var2.m147649j());
            f4u0Var2.m119450m(this.f93395d, this.f93393b);
            f4u0Var2.m119445h(this.f93395d, this.f93393b);
            f4u0Var2.m119446i(this.f93395d, this.f93393b);
            f4u0Var2.m119442e(this.f93395d, this.f93393b);
            f4u0Var2.m119441d(this.f93395d, this.f93393b);
            f4u0Var2.m119452o(this.f93395d, this.f93393b);
            f4u0Var2.m119451n(this.f93395d, this.f93393b);
            f4u0Var2.m119449l(this.f93395d, this.f93393b);
            f4u0Var2.m119443f(this.f93395d, this.f93393b);
            i9u0VarMo135801l2.mo106784i(f4u0Var2.m119454q());
            i9u0VarMo135801l2.mo106787m(new oav0(this.f93397f));
            j9u0VarZzf = i9u0VarMo135801l2.zzh();
        }
        j9u0 j9u0Var = j9u0VarZzf;
        if (((Boolean) l9s0.f127142c.m115379e()).booleanValue()) {
            w4w0VarMo116366d = j9u0Var.mo116366d();
            w4w0VarMo116366d.m201590h(4);
            w4w0VarMo116366d.m201584b(zzlVar.zzp);
        } else {
            w4w0VarMo116366d = null;
        }
        w4w0 w4w0Var = w4w0VarMo116366d;
        trt0 trt0VarMo116363a = j9u0Var.mo116363a();
        gnr gnrVarM190444i = trt0VarMo116363a.m190444i(trt0VarMo116363a.m190445j());
        this.f93400i = gnrVarM190444i;
        jmw0.m142245r(gnrVarM190444i, new dvv0(this, fdv0Var, w4w0Var, l4w0VarM144515b, j9u0Var), this.f93393b);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m118332g() {
        this.f93395d.mo97693u(pzv0.m172256d(6, null, null));
    }

    /* JADX INFO: renamed from: h */
    public final void m118333h(s8s0 s8s0Var) {
        this.f93397f = s8s0Var;
    }

    @Override // p149l.gdv0
    public final boolean zza() {
        gnr gnrVar = this.f93400i;
        return (gnrVar == null || gnrVar.isDone()) ? false : true;
    }
}
