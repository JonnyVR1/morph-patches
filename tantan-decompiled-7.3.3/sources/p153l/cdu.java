package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.external.R$string;

/* JADX INFO: loaded from: classes9.dex */
public class cdu implements iam<vcu> {

    /* JADX INFO: renamed from: a */
    public Act f81273a;

    /* JADX INFO: renamed from: b */
    public vcu f81274b;

    /* JADX INFO: renamed from: c */
    public jl80 f81275c;

    /* JADX INFO: renamed from: d */
    public BottomSheetDialog f81276d;

    public cdu(Act act) {
        this.f81273a = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m109246q() {
        this.f81274b.m200837i0();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f81273a;
    }

    @Override // p153l.iam
    public void destroy() {
        jl80 jl80Var = this.f81275c;
        if (jl80Var != null) {
            jl80Var.dismiss();
        }
        BottomSheetDialog bottomSheetDialog = this.f81276d;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.dismiss();
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(vcu vcuVar) {
        this.f81274b = vcuVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m109248j(String str) {
        if (getAct() == null) {
            return;
        }
        this.f81276d = new BottomSheetDialog(getAct(), hgc0.f109386c);
        View viewInflate = LayoutInflater.from(getAct()).inflate(xec0.f193821T0, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(ldc0.f131510V);
        TextView textView2 = (TextView) viewInflate.findViewById(ldc0.f131470J);
        TextView textView3 = (TextView) viewInflate.findViewById(ldc0.f131460G1);
        textView.setText(str);
        this.f81276d.setContentView(viewInflate);
        bnl0.m105509E0(textView2, new View.OnClickListener() { // from class: l.wcu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188501a.m109249k(view);
            }
        });
        bnl0.m105509E0(textView3, new View.OnClickListener() { // from class: l.xcu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193406a.m109250l(view);
            }
        });
        this.f81276d.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ycu
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f198544a.m109251m(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m109249k(View view) {
        this.f81276d.dismiss();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m109250l(View view) {
        this.f81276d.dismiss();
        this.f81274b.m200837i0();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m109251m(DialogInterface dialogInterface) {
        getAct().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m109252n(DialogInterface dialogInterface) {
        this.f81273a.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m109253p() {
        this.f81274b.m200836h0();
    }

    /* JADX INFO: renamed from: s */
    public void m109254s(String str) {
        if (this.f81276d == null) {
            m109248j(str);
        }
        this.f81276d.show();
    }

    /* JADX INFO: renamed from: u */
    public void m109255u(String str, String str2, String str3) {
        this.f81275c = new jl80.C17971a(this.f81273a).m146021P(this.f81274b.m200835f0()).m146018M(this.f81274b.m200835f0()).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.zcu
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f203824a.m109252n(dialogInterface);
            }
        }).m146024S(nbc0.f141119O0).m146055x0(R$string.f45742c0, new Object[0]).m146051t0(str).m146034c0(str3, new Runnable() { // from class: l.adu
            @Override // java.lang.Runnable
            public final void run() {
                this.f70731a.m109253p();
            }
        }).m146029X(str2, new Runnable() { // from class: l.bdu
            @Override // java.lang.Runnable
            public final void run() {
                this.f76299a.m109246q();
            }
        }).m146030Y(-98787).m146049r0();
    }
}
