package p153l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes9.dex */
public class ad0 extends lbl0 {

    /* JADX INFO: renamed from: a */
    public static jxd0 f69773a = new jxd0("video_chat_agreement" + mbs.m157870o0(), Boolean.FALSE);

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: a */
    public void mo96996a(Act act) {
        super.mo96996a(act);
        if (f69773a.get().booleanValue()) {
            m153583e(act);
        } else {
            m96998o(act);
        }
    }

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: f */
    public String mo96997f() {
        return "AgreementChecker";
    }

    /* JADX INFO: renamed from: o */
    public final void m96998o(final Act act) {
        View viewInflate = p9r.m171370a(act).inflate(xec0.f193792J1, (ViewGroup) null);
        final jl80 jl80VarM146020O = new jl80.C17971a(act).m146023R(viewInflate).m146020O();
        jl80VarM146020O.setCanceledOnTouchOutside(false);
        jl80VarM146020O.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.wc0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                it0.m142010D(act);
            }
        });
        jl80VarM146020O.show();
        bnl0.m105509E0(viewInflate.findViewById(ldc0.f131466I), new View.OnClickListener() { // from class: l.xc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193242a.m97000q(jl80VarM146020O, act, view);
            }
        });
        bnl0.m105509E0(viewInflate.findViewById(ldc0.f131434A), new View.OnClickListener() { // from class: l.yc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198375a.m97001r(jl80VarM146020O, act, view);
            }
        });
        bnl0.m105509E0(viewInflate.findViewById(ldc0.f131545f), new View.OnClickListener() { // from class: l.zc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203716a.m97002s(act, view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m96999p(Act act) {
        new sej0(act).m185560j(efv.m120733k());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m97000q(jl80 jl80Var, Act act, View view) {
        f69773a.put(Boolean.TRUE);
        jl80Var.dismiss();
        m153583e(act);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m97001r(jl80 jl80Var, Act act, View view) {
        jl80Var.dismiss();
        m153580b("cancel");
        it0.m142010D(act);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m97002s(Act act, View view) {
        m96999p(act);
    }
}
