package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.external.R$string;

/* JADX INFO: loaded from: classes13.dex */
public class bbu implements s7m<uau> {

    /* JADX INFO: renamed from: a */
    public Act f74878a;

    /* JADX INFO: renamed from: b */
    public uau f74879b;

    /* JADX INFO: renamed from: c */
    public dd80 f74880c;

    /* JADX INFO: renamed from: d */
    public BottomSheetDialog f74881d;

    public bbu(Act act) {
        this.f74878a = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m101021q() {
        this.f74879b.m192804i0();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f74878a;
    }

    @Override // p149l.s7m
    public void destroy() {
        dd80 dd80Var = this.f74880c;
        if (dd80Var != null) {
            dd80Var.dismiss();
        }
        BottomSheetDialog bottomSheetDialog = this.f74881d;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.dismiss();
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(uau uauVar) {
        this.f74879b = uauVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m101023j(String str) {
        if (getAct() == null) {
            return;
        }
        this.f74881d = new BottomSheetDialog(getAct(), c8c0.f79738c);
        View viewInflate = LayoutInflater.from(getAct()).inflate(s6c0.f162707T0, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(f5c0.f95053V);
        TextView textView2 = (TextView) viewInflate.findViewById(f5c0.f95013J);
        TextView textView3 = (TextView) viewInflate.findViewById(f5c0.f95003G1);
        textView.setText(str);
        this.f74881d.setContentView(viewInflate);
        xdl0.m208329E0(textView2, new View.OnClickListener() { // from class: l.vau
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180782a.m101024k(view);
            }
        });
        xdl0.m208329E0(textView3, new View.OnClickListener() { // from class: l.wau
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185509a.m101025l(view);
            }
        });
        this.f74881d.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.xau
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f191816a.m101026m(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m101024k(View view) {
        this.f74881d.dismiss();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m101025l(View view) {
        this.f74881d.dismiss();
        this.f74879b.m192804i0();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m101026m(DialogInterface dialogInterface) {
        getAct().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m101027n(DialogInterface dialogInterface) {
        this.f74878a.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m101028p() {
        this.f74879b.m192803h0();
    }

    /* JADX INFO: renamed from: s */
    public void m101029s(String str) {
        if (this.f74881d == null) {
            m101023j(str);
        }
        this.f74881d.show();
    }

    /* JADX INFO: renamed from: u */
    public void m101030u(String str, String str2, String str3) {
        this.f74880c = new dd80.C16336a(this.f74878a).m110961P(this.f74879b.m192802f0()).m110958M(this.f74879b.m192802f0()).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.yau
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f197239a.m101027n(dialogInterface);
            }
        }).m110964S(h3c0.f105628O0).m110995x0(R$string.f44894c0, new Object[0]).m110991t0(str).m110974c0(str3, new Runnable() { // from class: l.zau
            @Override // java.lang.Runnable
            public final void run() {
                this.f202401a.m101028p();
            }
        }).m110969X(str2, new Runnable() { // from class: l.abu
            @Override // java.lang.Runnable
            public final void run() {
                this.f68751a.m101021q();
            }
        }).m110970Y(-98787).m110989r0();
    }
}
