package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.UserHomeMode;
import com.p046p1.mobile.putong.core.newui.statussquare.CoreMyTabStatusPostView;
import com.p046p1.mobile.putong.core.newui.statussquare.CoreStatusSquareEnterView;
import com.p046p1.mobile.putong.core.newui.view.RoundedRectangleProgressView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class bsd implements sxj0 {

    /* JADX INFO: renamed from: A */
    public CoreMyTabStatusPostView f77031A;

    /* JADX INFO: renamed from: B */
    public Act f77032B;

    /* JADX INFO: renamed from: a */
    public LinearLayout f77033a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f77034b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f77035c;

    /* JADX INFO: renamed from: d */
    public RoundedRectangleProgressView f77036d;

    /* JADX INFO: renamed from: e */
    public VImage f77037e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f77038f;

    /* JADX INFO: renamed from: g */
    public VText f77039g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f77040h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f77041i;

    /* JADX INFO: renamed from: j */
    public VText f77042j;

    /* JADX INFO: renamed from: k */
    public VImage f77043k;

    /* JADX INFO: renamed from: l */
    public ODiamondTagLabel f77044l;

    /* JADX INFO: renamed from: m */
    public VImage f77045m;

    /* JADX INFO: renamed from: n */
    public VText f77046n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f77047o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f77048p;

    /* JADX INFO: renamed from: q */
    public TextView f77049q;

    /* JADX INFO: renamed from: r */
    public TextView f77050r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f77051s;

    /* JADX INFO: renamed from: t */
    public TextView f77052t;

    /* JADX INFO: renamed from: u */
    public TextView f77053u;

    /* JADX INFO: renamed from: v */
    public View f77054v;

    /* JADX INFO: renamed from: w */
    public VLinear f77055w;

    /* JADX INFO: renamed from: x */
    public VDraweeView f77056x;

    /* JADX INFO: renamed from: y */
    public TextView f77057y;

    /* JADX INFO: renamed from: z */
    public CoreStatusSquareEnterView f77058z;

    public bsd(Act act) {
        this.f77032B = act;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m103676A(xaj0 xaj0Var, String str, View view) {
        zvf0.m220399u("e_my_state", OMSDialogPositon.p_navigation_view, vwb.m200311Y("state_id", (String) xaj0Var.f191751a));
        CoreModule.m29934N().mo60270Dk(this.f77032B, str, (String) xaj0Var.f191751a, OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m103677B(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        this.f77031A.m43549h();
    }

    @Override // p149l.sxj0
    @NonNull
    /* JADX INFO: renamed from: a */
    public View mo103678a() {
        return this.f77055w;
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: b */
    public void mo103679b(boolean z) {
        xdl0.m208344M(this.f77058z, !z);
        xdl0.m208344M(this.f77031A, z);
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: c */
    public void mo103680c() {
        xdl0.m208344M(this.f77055w, true);
        xdl0.m208344M(this.f77054v, true);
        this.f77046n.setMaxLines(1);
    }

    @Override // p149l.sxj0
    @NonNull
    /* JADX INFO: renamed from: d */
    public VImage mo103681d() {
        return this.f77045m;
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: e */
    public void mo103682e(final String str, final xaj0<String, String, String> xaj0Var) {
        ViewGroup.LayoutParams layoutParams = this.f77055w.getLayoutParams();
        layoutParams.width = -2;
        VLinear vLinear = this.f77055w;
        vLinear.setPadding(t100.f167259h, vLinear.getPaddingTop(), t100.f167261j, this.f77055w.getPaddingBottom());
        this.f77055w.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f77056x.getLayoutParams();
        int i = t100.f167269r;
        layoutParams2.height = i;
        layoutParams2.width = i;
        this.f77056x.setLayoutParams(layoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f77057y.getLayoutParams();
        marginLayoutParams.leftMargin = t100.f167254c;
        this.f77057y.setLayoutParams(marginLayoutParams);
        this.f77057y.setTextSize(12.0f);
        this.f77058z.f26796l.setTextSize(12.0f);
        this.f77057y.setTextColor(this.f77032B.getResources().getColor(w0c0.f183875p));
        this.f77057y.setText(xaj0Var.f191752b);
        this.f77056x.setBackgroundResource(0);
        qib0.f154691G.m102325I0(this.f77056x, xaj0Var.f191753c, t100.m186890d(24.0f), t100.m186890d(24.0f));
        this.f77055w.setOnClickListener(new View.OnClickListener() { // from class: l.zrd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204495a.m103676A(xaj0Var, str, view);
            }
        });
    }

    @Override // p149l.sxj0
    @NonNull
    /* JADX INFO: renamed from: g */
    public ODiamondTagLabel mo103683g() {
        return this.f77044l;
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: h */
    public void mo103684h(View.OnClickListener onClickListener) {
        xdl0.m208329E0(this.f77037e, onClickListener);
        xdl0.m208329E0(this.f77038f, onClickListener);
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: i */
    public void mo103685i(User user) {
        String str = user.description;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f77046n;
        if (zIsEmpty) {
            xdl0.m208344M(vText, false);
            this.f77046n.setText(this.f77032B.getString(R$string.f18582hj));
        } else {
            xdl0.m208344M(vText, true);
            this.f77046n.setText(str);
        }
    }

    @Override // p149l.sxj0
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM103696y = m103696y(layoutInflater, viewGroup);
        m103697z();
        return viewM103696y;
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: j */
    public void mo103686j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        xdl0.m208329E0(this.f77048p, onClickListener2);
        xdl0.m208329E0(this.f77051s, onClickListener);
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: l */
    public void mo103687l(User user) {
        qib0.f154691G.m102327J0(this.f77035c, user.m60124fp().calculatedWidth(t100.f167240O), false);
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: n */
    public void mo103688n(final View.OnClickListener onClickListener) {
        ViewGroup.LayoutParams layoutParams = this.f77055w.getLayoutParams();
        layoutParams.width = t100.f167239N;
        this.f77055w.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f77056x.getLayoutParams();
        int i = t100.f167266o;
        layoutParams2.height = i;
        layoutParams2.width = i;
        this.f77056x.setLayoutParams(layoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f77057y.getLayoutParams();
        marginLayoutParams.leftMargin = 0;
        marginLayoutParams.rightMargin = t100.f167255d;
        this.f77057y.setLayoutParams(marginLayoutParams);
        this.f77057y.setTextSize(12.0f);
        this.f77058z.f26796l.setTextSize(12.0f);
        this.f77057y.setTextColor(this.f77032B.getResources().getColor(w0c0.f183858j0));
        this.f77057y.setText("状态");
        qib0.f154691G.m102354Y0(this.f77056x, x2c0.f190299kg);
        xdl0.m208329E0(this.f77055w, new View.OnClickListener() { // from class: l.asd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71409a.m103677B(onClickListener, view);
            }
        });
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: p */
    public void mo103690p(User user) {
        this.f77049q.setText(i0g0.m133880t(user.profile.followships.counters.followers));
        this.f77052t.setText(i0g0.m133880t(user.profile.followships.counters.followings));
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: s */
    public void mo103692s() {
        super.mo103692s();
        m103697z();
    }

    @Override // p149l.sxj0
    @NonNull
    /* JADX INFO: renamed from: t */
    public VText mo103693t() {
        return this.f77042j;
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: u */
    public void mo103694u() {
        this.f77031A.m43557p();
    }

    @Override // p149l.sxj0
    @NonNull
    /* JADX INFO: renamed from: v */
    public VImage mo103695v() {
        return this.f77043k;
    }

    /* JADX INFO: renamed from: y */
    public View m103696y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return csd.m108493b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: z */
    public final void m103697z() {
        xdl0.m208344M(this.f77037e, true);
        xdl0.m208344M(this.f77038f, false);
        if (upa.m194745e2()) {
            if (TextUtils.equals(CoreModule.f17545c.f19639e0.f149321Z3.get(), UserHomeMode.marryMode)) {
                xdl0.m208344M(this.f77036d, false);
                xdl0.m208344M(this.f77038f, false);
                xdl0.m208344M(this.f77037e, true);
                return;
            }
            xdl0.m208344M(this.f77037e, true);
            xdl0.m208344M(this.f77038f, false);
        }
        xdl0.m208344M(this.f77036d, false);
        if (CoreModule.m29934N().mo60353fs()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f77040h.getLayoutParams();
            marginLayoutParams.height = t100.m186890d(130.0f);
            this.f77040h.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: o */
    public void mo103689o(int i) {
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: q */
    public void mo103691q(User user) {
    }
}
