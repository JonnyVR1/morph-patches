package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.UserHomeMode;
import com.p051p1.mobile.putong.core.newui.statussquare.CoreMyTabStatusPostView;
import com.p051p1.mobile.putong.core.newui.statussquare.CoreStatusSquareEnterView;
import com.p051p1.mobile.putong.core.newui.view.RoundedRectangleProgressView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class qtd implements y6k0 {

    /* JADX INFO: renamed from: A */
    public CoreMyTabStatusPostView f159404A;

    /* JADX INFO: renamed from: B */
    public Act f159405B;

    /* JADX INFO: renamed from: a */
    public LinearLayout f159406a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f159407b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f159408c;

    /* JADX INFO: renamed from: d */
    public RoundedRectangleProgressView f159409d;

    /* JADX INFO: renamed from: e */
    public VImage f159410e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f159411f;

    /* JADX INFO: renamed from: g */
    public VText f159412g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f159413h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f159414i;

    /* JADX INFO: renamed from: j */
    public VText f159415j;

    /* JADX INFO: renamed from: k */
    public VImage f159416k;

    /* JADX INFO: renamed from: l */
    public ODiamondTagLabel f159417l;

    /* JADX INFO: renamed from: m */
    public VImage f159418m;

    /* JADX INFO: renamed from: n */
    public VText f159419n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f159420o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f159421p;

    /* JADX INFO: renamed from: q */
    public TextView f159422q;

    /* JADX INFO: renamed from: r */
    public TextView f159423r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f159424s;

    /* JADX INFO: renamed from: t */
    public TextView f159425t;

    /* JADX INFO: renamed from: u */
    public TextView f159426u;

    /* JADX INFO: renamed from: v */
    public View f159427v;

    /* JADX INFO: renamed from: w */
    public VLinear f159428w;

    /* JADX INFO: renamed from: x */
    public VDraweeView f159429x;

    /* JADX INFO: renamed from: y */
    public TextView f159430y;

    /* JADX INFO: renamed from: z */
    public CoreStatusSquareEnterView f159431z;

    public qtd(Act act) {
        this.f159405B = act;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m177913A(bkj0 bkj0Var, String str, View view) {
        i4g0.m138523u("e_my_state", OMSDialogPositon.p_navigation_view, jyb.m147494Y("state_id", (String) bkj0Var.f77081a));
        CoreModule.m30932N().mo61454Dk(this.f159405B, str, (String) bkj0Var.f77081a, OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m177914B(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        this.f159404A.m44735h();
    }

    @Override // p153l.y6k0
    @NonNull
    /* JADX INFO: renamed from: a */
    public View mo149538a() {
        return this.f159428w;
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: b */
    public void mo149539b(boolean z) {
        bnl0.m105524M(this.f159431z, !z);
        bnl0.m105524M(this.f159404A, z);
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: c */
    public void mo149540c() {
        bnl0.m105524M(this.f159428w, true);
        bnl0.m105524M(this.f159427v, true);
        this.f159419n.setMaxLines(1);
    }

    @Override // p153l.y6k0
    @NonNull
    /* JADX INFO: renamed from: d */
    public VImage mo149541d() {
        return this.f159418m;
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: e */
    public void mo149542e(final String str, final bkj0<String, String, String> bkj0Var) {
        ViewGroup.LayoutParams layoutParams = this.f159428w.getLayoutParams();
        layoutParams.width = -2;
        VLinear vLinear = this.f159428w;
        vLinear.setPadding(qa00.f156321h, vLinear.getPaddingTop(), qa00.f156323j, this.f159428w.getPaddingBottom());
        this.f159428w.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f159429x.getLayoutParams();
        int i = qa00.f156331r;
        layoutParams2.height = i;
        layoutParams2.width = i;
        this.f159429x.setLayoutParams(layoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f159430y.getLayoutParams();
        marginLayoutParams.leftMargin = qa00.f156316c;
        this.f159430y.setLayoutParams(marginLayoutParams);
        this.f159430y.setTextSize(12.0f);
        this.f159431z.f27644l.setTextSize(12.0f);
        this.f159430y.setTextColor(this.f159405B.getResources().getColor(c9c0.f80445p));
        this.f159430y.setText(bkj0Var.f77082b);
        this.f159429x.setBackgroundResource(0);
        uqb0.f180374G.m127109I0(this.f159429x, bkj0Var.f77083c, qa00.m175859d(24.0f), qa00.m175859d(24.0f));
        this.f159428w.setOnClickListener(new View.OnClickListener() { // from class: l.otd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148946a.m177913A(bkj0Var, str, view);
            }
        });
    }

    @Override // p153l.y6k0
    @NonNull
    /* JADX INFO: renamed from: g */
    public ODiamondTagLabel mo149544g() {
        return this.f159417l;
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: h */
    public void mo149545h(View.OnClickListener onClickListener) {
        bnl0.m105509E0(this.f159410e, onClickListener);
        bnl0.m105509E0(this.f159411f, onClickListener);
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: i */
    public void mo149546i(User user) {
        String str = user.description;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f159419n;
        if (zIsEmpty) {
            bnl0.m105524M(vText, false);
            this.f159419n.setText(this.f159405B.getString(R$string.f18398Dj));
        } else {
            bnl0.m105524M(vText, true);
            this.f159419n.setText(str);
        }
    }

    @Override // p153l.y6k0
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM177916y = m177916y(layoutInflater, viewGroup);
        m177917z();
        return viewM177916y;
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: j */
    public void mo149547j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        bnl0.m105509E0(this.f159421p, onClickListener2);
        bnl0.m105509E0(this.f159424s, onClickListener);
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: l */
    public void mo149549l(User user) {
        uqb0.f180374G.m127111J0(this.f159408c, user.m61308fp().calculatedWidth(qa00.f156302O), false);
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: n */
    public void mo149551n(final View.OnClickListener onClickListener) {
        ViewGroup.LayoutParams layoutParams = this.f159428w.getLayoutParams();
        layoutParams.width = qa00.f156301N;
        this.f159428w.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f159429x.getLayoutParams();
        int i = qa00.f156328o;
        layoutParams2.height = i;
        layoutParams2.width = i;
        this.f159429x.setLayoutParams(layoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f159430y.getLayoutParams();
        marginLayoutParams.leftMargin = 0;
        marginLayoutParams.rightMargin = qa00.f156317d;
        this.f159430y.setLayoutParams(marginLayoutParams);
        this.f159430y.setTextSize(12.0f);
        this.f159431z.f27644l.setTextSize(12.0f);
        this.f159430y.setTextColor(this.f159405B.getResources().getColor(c9c0.f80431k0));
        this.f159430y.setText("状态");
        uqb0.f180374G.m127138Y0(this.f159429x, dbc0.f86761Yg);
        bnl0.m105509E0(this.f159428w, new View.OnClickListener() { // from class: l.ptd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f154037a.m177914B(onClickListener, view);
            }
        });
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: p */
    public void mo149553p(User user) {
        this.f159422q.setText(q8g0.m175815t(user.profile.followships.counters.followers));
        this.f159425t.setText(q8g0.m175815t(user.profile.followships.counters.followings));
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: s */
    public void mo177915s() {
        super.mo177915s();
        m177917z();
    }

    @Override // p153l.y6k0
    @NonNull
    /* JADX INFO: renamed from: t */
    public VText mo149556t() {
        return this.f159415j;
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: u */
    public void mo149557u() {
        this.f159404A.m44743p();
    }

    @Override // p153l.y6k0
    @NonNull
    /* JADX INFO: renamed from: v */
    public VImage mo149558v() {
        return this.f159416k;
    }

    /* JADX INFO: renamed from: y */
    public View m177916y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rtd.m183109b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: z */
    public final void m177917z() {
        bnl0.m105524M(this.f159410e, true);
        bnl0.m105524M(this.f159411f, false);
        if (gra.m131676e2()) {
            if (TextUtils.equals(CoreModule.f18264c.f20381e0.f89178Z3.get(), UserHomeMode.marryMode)) {
                bnl0.m105524M(this.f159409d, false);
                bnl0.m105524M(this.f159411f, false);
                bnl0.m105524M(this.f159410e, true);
                return;
            }
            bnl0.m105524M(this.f159410e, true);
            bnl0.m105524M(this.f159411f, false);
        }
        bnl0.m105524M(this.f159409d, false);
        if (CoreModule.m30932N().mo61537fs()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f159413h.getLayoutParams();
            marginLayoutParams.height = qa00.m175859d(130.0f);
            this.f159413h.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: o */
    public void mo149552o(int i) {
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: q */
    public void mo149554q(User user) {
    }
}
