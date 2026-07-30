package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes5.dex */
public class t91 implements iam<o91> {

    /* JADX INFO: renamed from: a */
    public View f172593a;

    /* JADX INFO: renamed from: b */
    public ImageView f172594b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f172595c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f172596d;

    /* JADX INFO: renamed from: e */
    public ImageView f172597e;

    /* JADX INFO: renamed from: f */
    public TextView f172598f;

    /* JADX INFO: renamed from: g */
    public TextView f172599g;

    /* JADX INFO: renamed from: h */
    public TextView f172600h;

    /* JADX INFO: renamed from: i */
    public VImage f172601i;

    /* JADX INFO: renamed from: j */
    public o91 f172602j;

    /* JADX INFO: renamed from: k */
    public DialogC12774a f172603k;

    /* JADX INFO: renamed from: q */
    private void m189715q() {
        bnl0.m105509E0(this.f172599g, new View.OnClickListener() { // from class: l.p91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151077a.m189720k(view);
            }
        });
        bnl0.m105509E0(this.f172600h, new View.OnClickListener() { // from class: l.q91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156184a.m189721l(view);
            }
        });
        bnl0.m105509E0(this.f172593a, new View.OnClickListener() { // from class: l.r91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161787a.m189722m(view);
            }
        });
        bnl0.m105509E0(this.f172601i, new View.OnClickListener() { // from class: l.s91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166889a.m189723n(view);
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f172602j.act();
    }

    @Override // p153l.iam
    public void destroy() {
        if (isShowing()) {
            o1j0.m165649w(R$string.f47772R);
            m189718i();
        }
    }

    /* JADX INFO: renamed from: e */
    public View m189716e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return u91.m195072b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(o91 o91Var) {
        this.f172602j = o91Var;
    }

    /* JADX INFO: renamed from: i */
    public void m189718i() {
        ynp0.m216937n(this.f172603k);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        return ynp0.m216949z(this.f172603k);
    }

    /* JADX INFO: renamed from: j */
    public DialogC12774a m189719j() {
        if (this.f172603k == null) {
            c0s c0sVar = new c0s(this.f172602j, m189716e(act().inflater(), null));
            this.f172603k = c0sVar;
            c0sVar.m72961j0(LiveDialogEnum.CALl_AUDIENCE_APPLY_DIALOG);
            m189715q();
            this.f172602j.m166668q4(1);
        }
        return this.f172603k;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m189720k(View view) {
        this.f172602j.m166669s4();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m189721l(View view) {
        this.f172602j.m166659d4();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m189722m(View view) {
        ynp0.m216937n(this.f172603k);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m189723n(View view) {
        this.f172602j.m166670t4();
    }

    /* JADX INFO: renamed from: p */
    public void m189724p(String str) {
        this.f172600h.setText(str);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [l.oo2] */
    /* JADX INFO: renamed from: s */
    public void m189725s(int i) {
        if (this.f172603k == null) {
            return;
        }
        switch (i) {
            case 1:
                bnl0.m105524M(this.f172594b, true);
                this.f172594b.setImageResource(obc0.f146411m1);
                bnl0.m105524M(this.f172595c, false);
                bnl0.m105524M(this.f172596d, false);
                bnl0.m105524M(this.f172597e, false);
                this.f172600h.setText(act().getString(R$string.f48293p2));
                this.f172600h.setBackgroundResource(obc0.f145978B0);
                this.f172598f.setText(act().getString(R$string.f48050e0));
                this.f172600h.setTextColor(-1);
                this.f172600h.setEnabled(true);
                break;
            case 2:
                bnl0.m105524M(this.f172594b, true);
                this.f172594b.setImageResource(obc0.f145979B1);
                bnl0.m105524M(this.f172595c, false);
                bnl0.m105524M(this.f172596d, false);
                bnl0.m105524M(this.f172597e, false);
                this.f172600h.setText(act().getString(R$string.f47711O1));
                this.f172600h.setTextColor(-1);
                this.f172600h.setBackgroundResource(obc0.f145978B0);
                this.f172598f.setText(act().getString(R$string.f48006c0));
                this.f172600h.setEnabled(true);
                break;
            case 3:
                bnl0.m105524M(this.f172594b, false);
                bnl0.m105524M(this.f172595c, true);
                bnl0.m105524M(this.f172596d, true);
                bnl0.m105524M(this.f172597e, true);
                this.f172600h.setText(act().getString(R$string.f47711O1));
                this.f172600h.setBackgroundResource(obc0.f146303d1);
                izs.m142867r("context_single_room", this.f172595c, zrv.f205799a.m207651V().m61308fp().profileSmall());
                izs.m142868s("context_single_room", this.f172596d, this.f172602j.m213810E2().m168532l0().m61308fp().profileSmall().formatted());
                this.f172598f.setText(act().getString(R$string.f48117h1));
                this.f172600h.setTextColor(1090519039);
                this.f172600h.setEnabled(false);
                o1j0.m165649w(R$string.f47836U0);
                break;
            case 4:
                this.f172600h.setEnabled(true);
                break;
            case 5:
                bnl0.m105524M(this.f172594b, true);
                this.f172594b.setImageResource(obc0.f146411m1);
                bnl0.m105524M(this.f172595c, false);
                bnl0.m105524M(this.f172596d, false);
                bnl0.m105524M(this.f172597e, false);
                this.f172600h.setText(act().getString(R$string.f47817T2));
                this.f172600h.setBackgroundResource(obc0.f145978B0);
                this.f172598f.setText(act().getString(R$string.f48050e0));
                this.f172600h.setTextColor(-1);
                this.f172600h.setEnabled(true);
                break;
            case 6:
                m189719j().dismiss();
                break;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m189726u() {
        m189719j().show();
    }
}
