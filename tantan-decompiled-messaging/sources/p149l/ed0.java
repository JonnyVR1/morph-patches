package p149l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes13.dex */
public class ed0 extends g2l0 {

    /* JADX INFO: renamed from: a */
    public static hpd0 f90580a = new hpd0("video_chat_agreement" + l9s.m149093o0(), Boolean.FALSE);

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: a */
    public void mo94566a(Act act) {
        super.mo94566a(act);
        if (f90580a.get().booleanValue()) {
            m124169e(act);
        } else {
            m115780o(act);
        }
    }

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: f */
    public String mo94567f() {
        return "AgreementChecker";
    }

    /* JADX INFO: renamed from: o */
    public final void m115780o(final Act act) {
        View viewInflate = o7r.m163037a(act).inflate(s6c0.f162678J1, (ViewGroup) null);
        final dd80 dd80VarM110960O = new dd80.C16336a(act).m110963R(viewInflate).m110960O();
        dd80VarM110960O.setCanceledOnTouchOutside(false);
        dd80VarM110960O.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.ad0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                dt0.m113504D(act);
            }
        });
        dd80VarM110960O.show();
        xdl0.m208329E0(viewInflate.findViewById(f5c0.f95009I), new View.OnClickListener() { // from class: l.bd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74990a.m115782q(dd80VarM110960O, act, view);
            }
        });
        xdl0.m208329E0(viewInflate.findViewById(f5c0.f94977A), new View.OnClickListener() { // from class: l.cd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80339a.m115783r(dd80VarM110960O, act, view);
            }
        });
        xdl0.m208329E0(viewInflate.findViewById(f5c0.f95088f), new View.OnClickListener() { // from class: l.dd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85523a.m115784s(act, view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m115781p(Act act) {
        new o5j0(act).m162796j(ddv.m111078k());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m115782q(dd80 dd80Var, Act act, View view) {
        f90580a.put(Boolean.TRUE);
        dd80Var.dismiss();
        m124169e(act);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m115783r(dd80 dd80Var, Act act, View view) {
        dd80Var.dismiss();
        m124166b("cancel");
        dt0.m113504D(act);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m115784s(Act act, View view) {
        m115781p(act);
    }
}
