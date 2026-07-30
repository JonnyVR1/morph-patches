package p009l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.statussquare.CoreMyTabStatusPostView;
import com.p000p1.mobile.putong.core.newui.statussquare.CoreStatusSquareEnterView;
import com.p000p1.mobile.putong.core.newui.view.RoundedRectangleProgressView;
import com.p000p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.User;
import l.csd;
import l.j760;
import l.qib0;
import l.t100;
import l.upa;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xaj0;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bsd implements sxj0 {

    /* JADX INFO: renamed from: A */
    public CoreMyTabStatusPostView f10247A;

    /* JADX INFO: renamed from: B */
    public Act f10248B;

    /* JADX INFO: renamed from: a */
    public LinearLayout f10249a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f10250b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f10251c;

    /* JADX INFO: renamed from: d */
    public RoundedRectangleProgressView f10252d;

    /* JADX INFO: renamed from: e */
    public VImage f10253e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f10254f;

    /* JADX INFO: renamed from: g */
    public VText f10255g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f10256h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f10257i;

    /* JADX INFO: renamed from: j */
    public VText f10258j;

    /* JADX INFO: renamed from: k */
    public VImage f10259k;

    /* JADX INFO: renamed from: l */
    public ODiamondTagLabel f10260l;

    /* JADX INFO: renamed from: m */
    public VImage f10261m;

    /* JADX INFO: renamed from: n */
    public VText f10262n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f10263o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f10264p;

    /* JADX INFO: renamed from: q */
    public TextView f10265q;

    /* JADX INFO: renamed from: r */
    public TextView f10266r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f10267s;

    /* JADX INFO: renamed from: t */
    public TextView f10268t;

    /* JADX INFO: renamed from: u */
    public TextView f10269u;

    /* JADX INFO: renamed from: v */
    public View f10270v;

    /* JADX INFO: renamed from: w */
    public VLinear f10271w;

    /* JADX INFO: renamed from: x */
    public VDraweeView f10272x;

    /* JADX INFO: renamed from: y */
    public TextView f10273y;

    /* JADX INFO: renamed from: z */
    public CoreStatusSquareEnterView f10274z;

    public bsd(Act act) {
        this.f10248B = act;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m12202A(xaj0 xaj0Var, String str, View view) {
        zvf0.u("e_my_state", "p_navigation_view", new j760[]{vwb.Y("state_id", (String) xaj0Var.a)});
        CoreModule.N().Dk(this.f10248B, str, (String) xaj0Var.a, "p_navigation_view");
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m12203B(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        this.f10247A.m7795h();
    }

    @Override // p009l.sxj0
    @NonNull
    /* JADX INFO: renamed from: a */
    public View mo12204a() {
        return this.f10271w;
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: b */
    public void mo12205b(boolean z) {
        xdl0.M(this.f10274z, !z);
        xdl0.M(this.f10247A, z);
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: c */
    public void mo12206c() {
        xdl0.M(this.f10271w, true);
        xdl0.M(this.f10270v, true);
        this.f10262n.setMaxLines(1);
    }

    @Override // p009l.sxj0
    @NonNull
    /* JADX INFO: renamed from: d */
    public VImage mo12207d() {
        return this.f10261m;
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: e */
    public void mo12208e(final String str, final xaj0<String, String, String> xaj0Var) {
        ViewGroup.LayoutParams layoutParams = this.f10271w.getLayoutParams();
        layoutParams.width = -2;
        VLinear vLinear = this.f10271w;
        vLinear.setPadding(t100.h, vLinear.getPaddingTop(), t100.j, this.f10271w.getPaddingBottom());
        this.f10271w.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f10272x.getLayoutParams();
        int i = t100.r;
        layoutParams2.height = i;
        layoutParams2.width = i;
        this.f10272x.setLayoutParams(layoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f10273y.getLayoutParams();
        marginLayoutParams.leftMargin = t100.c;
        this.f10273y.setLayoutParams(marginLayoutParams);
        this.f10273y.setTextSize(12.0f);
        this.f10274z.f5574l.setTextSize(12.0f);
        this.f10273y.setTextColor(this.f10248B.getResources().getColor(w0c0.p));
        this.f10273y.setText((CharSequence) xaj0Var.b);
        this.f10272x.setBackgroundResource(0);
        qib0.G.I0(this.f10272x, (String) xaj0Var.c, t100.d(24.0f), t100.d(24.0f));
        this.f10271w.setOnClickListener(new View.OnClickListener() { // from class: l.zrd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23852a.m12202A(xaj0Var, str, view);
            }
        });
    }

    @Override // p009l.sxj0
    @NonNull
    /* JADX INFO: renamed from: g */
    public ODiamondTagLabel mo12209g() {
        return this.f10260l;
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: h */
    public void mo12210h(View.OnClickListener onClickListener) {
        xdl0.E0(this.f10253e, onClickListener);
        xdl0.E0(this.f10254f, onClickListener);
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: i */
    public void mo12211i(User user) {
        String str = user.description;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f10262n;
        if (zIsEmpty) {
            xdl0.M(vText, false);
            this.f10262n.setText(this.f10248B.getString(R.string.hj));
        } else {
            xdl0.M(vText, true);
            this.f10262n.setText(str);
        }
    }

    @Override // p009l.sxj0
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM12222y = m12222y(layoutInflater, viewGroup);
        m12223z();
        return viewM12222y;
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: j */
    public void mo12212j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        xdl0.E0(this.f10264p, onClickListener2);
        xdl0.E0(this.f10267s, onClickListener);
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: l */
    public void mo12213l(User user) {
        qib0.G.J0(this.f10251c, user.fp().calculatedWidth(t100.O), false);
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: n */
    public void mo12214n(final View.OnClickListener onClickListener) {
        ViewGroup.LayoutParams layoutParams = this.f10271w.getLayoutParams();
        layoutParams.width = t100.N;
        this.f10271w.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f10272x.getLayoutParams();
        int i = t100.o;
        layoutParams2.height = i;
        layoutParams2.width = i;
        this.f10272x.setLayoutParams(layoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f10273y.getLayoutParams();
        marginLayoutParams.leftMargin = 0;
        marginLayoutParams.rightMargin = t100.d;
        this.f10273y.setLayoutParams(marginLayoutParams);
        this.f10273y.setTextSize(12.0f);
        this.f10274z.f5574l.setTextSize(12.0f);
        this.f10273y.setTextColor(this.f10248B.getResources().getColor(w0c0.j0));
        this.f10273y.setText("状态");
        qib0.G.Y0(this.f10272x, x2c0.kg);
        xdl0.E0(this.f10271w, new View.OnClickListener() { // from class: l.asd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9663a.m12203B(onClickListener, view);
            }
        });
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: p */
    public void mo12216p(User user) {
        this.f10265q.setText(i0g0.m16148t(user.profile.followships.counters.followers));
        this.f10268t.setText(i0g0.m16148t(user.profile.followships.counters.followings));
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: s */
    public void mo12218s() {
        super.mo12218s();
        m12223z();
    }

    @Override // p009l.sxj0
    @NonNull
    /* JADX INFO: renamed from: t */
    public VText mo12219t() {
        return this.f10258j;
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: u */
    public void mo12220u() {
        this.f10247A.m7803p();
    }

    @Override // p009l.sxj0
    @NonNull
    /* JADX INFO: renamed from: v */
    public VImage mo12221v() {
        return this.f10259k;
    }

    /* JADX INFO: renamed from: y */
    public View m12222y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return csd.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: z */
    public final void m12223z() {
        xdl0.M(this.f10253e, true);
        xdl0.M(this.f10254f, false);
        if (upa.e2()) {
            if (TextUtils.equals((CharSequence) CoreModule.c.e0.Z3.get(), "marryMode")) {
                xdl0.M(this.f10252d, false);
                xdl0.M(this.f10254f, false);
                xdl0.M(this.f10253e, true);
                return;
            }
            xdl0.M(this.f10253e, true);
            xdl0.M(this.f10254f, false);
        }
        xdl0.M(this.f10252d, false);
        if (CoreModule.N().fs()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f10256h.getLayoutParams();
            marginLayoutParams.height = t100.d(130.0f);
            this.f10256h.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: o */
    public void mo12215o(int i) {
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: q */
    public void mo12217q(User user) {
    }
}
