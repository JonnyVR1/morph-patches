package p009l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.view.RoundedRectangleProgressView;
import com.p000p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.User;
import java.text.DecimalFormat;
import l.bzc0;
import l.h33;
import l.qib0;
import l.t100;
import l.w0c0;
import l.x2c0;
import l.xaj0;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VIcon;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class g33 implements sxj0 {

    /* JADX INFO: renamed from: a */
    public LinearLayout f13278a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f13279b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f13280c;

    /* JADX INFO: renamed from: d */
    public VImage f13281d;

    /* JADX INFO: renamed from: e */
    public RoundedRectangleProgressView f13282e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f13283f;

    /* JADX INFO: renamed from: g */
    public VText f13284g;

    /* JADX INFO: renamed from: h */
    public VImage f13285h;

    /* JADX INFO: renamed from: i */
    public ODiamondTagLabel f13286i;

    /* JADX INFO: renamed from: j */
    public VImage f13287j;

    /* JADX INFO: renamed from: k */
    public VText f13288k;

    /* JADX INFO: renamed from: l */
    public Space f13289l;

    /* JADX INFO: renamed from: m */
    public VLinear f13290m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f13291n;

    /* JADX INFO: renamed from: o */
    public VText f13292o;

    /* JADX INFO: renamed from: p */
    public VIcon f13293p;

    /* JADX INFO: renamed from: q */
    public VLinear f13294q;

    /* JADX INFO: renamed from: r */
    public VText f13295r;

    /* JADX INFO: renamed from: s */
    public Act f13296s;

    public g33(Act act) {
        this.f13296s = act;
    }

    /* JADX INFO: renamed from: z */
    public static String m14771z(long j) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        if (j <= 999) {
            return decimalFormat.format(j);
        }
        if (j <= 9999) {
            return decimalFormat.format(j / 10000.0f) + "w";
        }
        if (j >= 9999999) {
            return "999w+";
        }
        return decimalFormat.format(j / 10000.0f) + "w";
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m14772A(View view) {
        zvf0.r("e_state_explore", "p_navigation_view");
        CoreModule.N().t6(this.f13296s, true, "p_navigation_view");
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m14773B(View view) {
        zvf0.r("e_my_moment", "p_navigation_view");
        this.f13296s.startActivity(CoreModule.N().argsToPhotoAlbumFeedAct(this.f13296s, CoreModule.H().userId(), "p_my_moment", -1, (String) null, 0));
    }

    @Override // p009l.sxj0
    @NonNull
    /* JADX INFO: renamed from: a */
    public View mo12204a() {
        return this.f13290m;
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: c */
    public void mo12206c() {
        xdl0.M(mo12204a(), true);
        this.f13288k.setMaxLines(1);
    }

    @Override // p009l.sxj0
    @NonNull
    /* JADX INFO: renamed from: d */
    public VImage mo12207d() {
        return this.f13287j;
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: e */
    public void mo12208e(String str, xaj0<String, String, String> xaj0Var) {
        VLinear vLinear = this.f13290m;
        VDraweeView vDraweeView = this.f13291n;
        VText vText = this.f13292o;
        if (bzc0.f()) {
            int i = t100.h;
            vLinear.setPadding(i, 0, i, 0);
            ViewGroup.LayoutParams layoutParams = vLinear.getLayoutParams();
            layoutParams.width = -2;
            vLinear.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = vDraweeView.getLayoutParams();
            int i2 = t100.q;
            layoutParams2.height = i2;
            layoutParams2.width = i2;
            vDraweeView.setLayoutParams(layoutParams2);
            vDraweeView.setBackgroundResource(0);
            qib0.G.I0(vDraweeView, (String) xaj0Var.c, i2, i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vText.getLayoutParams();
            marginLayoutParams.leftMargin = t100.c;
            marginLayoutParams.rightMargin = 0;
            vText.setLayoutParams(marginLayoutParams);
            vText.setText("更多状态");
            xdl0.M(this.f13293p, true);
            vLinear.setOnClickListener(new View.OnClickListener() { // from class: l.e33
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12190a.m14772A(view);
                }
            });
        }
    }

    @Override // p009l.sxj0
    @NonNull
    /* JADX INFO: renamed from: g */
    public ODiamondTagLabel mo12209g() {
        return this.f13286i;
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: h */
    public void mo12210h(View.OnClickListener onClickListener) {
        xdl0.E0(this.f13281d, onClickListener);
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: i */
    public void mo12211i(User user) {
        VText vText = this.f13288k;
        String str = user.description;
        if (TextUtils.isEmpty(str)) {
            xdl0.M(vText, false);
            vText.setText(this.f13296s.getString(R.string.hj));
            if (bzc0.f()) {
                xdl0.M(this.f13289l, false);
                return;
            }
            return;
        }
        xdl0.M(vText, true);
        vText.setText(str);
        if (bzc0.f()) {
            xdl0.M(this.f13289l, true);
        }
    }

    @Override // p009l.sxj0
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m14774y(layoutInflater, viewGroup);
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: l */
    public void mo12213l(User user) {
        qib0.G.J0(this.f13280c, user.fp().calculatedWidth(t100.O), false);
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: n */
    public void mo12214n(View.OnClickListener onClickListener) {
        VLinear vLinear = this.f13290m;
        VDraweeView vDraweeView = this.f13291n;
        VText vText = this.f13292o;
        int i = t100.j;
        vLinear.setPadding(i, 0, i, 0);
        ViewGroup.LayoutParams layoutParams = vLinear.getLayoutParams();
        layoutParams.width = -2;
        vLinear.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = vDraweeView.getLayoutParams();
        int i2 = t100.k;
        layoutParams2.height = i2;
        layoutParams2.width = i2;
        vDraweeView.setLayoutParams(layoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vText.getLayoutParams();
        marginLayoutParams.leftMargin = t100.c;
        marginLayoutParams.rightMargin = 0;
        vText.setLayoutParams(marginLayoutParams);
        xdl0.M(this.f13293p, false);
        vText.setTextColor(this.f13296s.getResources().getColor(w0c0.j0));
        vText.setText("状态");
        qib0.G.Y0(vDraweeView, x2c0.Ah);
        xdl0.E0(vLinear, onClickListener);
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: o */
    public void mo12215o(int i) {
        if (bzc0.f()) {
            this.f13295r.setText(i > 0 ? String.format("%s条动态", m14771z(i)) : "我的动态");
            xdl0.M(this.f13294q, true);
            xdl0.E0(this.f13294q, new View.OnClickListener() { // from class: l.f33
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12761a.m14773B(view);
                }
            });
        }
    }

    @Override // p009l.sxj0
    @NonNull
    /* JADX INFO: renamed from: t */
    public VText mo12219t() {
        return this.f13284g;
    }

    @Override // p009l.sxj0
    @NonNull
    /* JADX INFO: renamed from: v */
    public VImage mo12221v() {
        return this.f13285h;
    }

    /* JADX INFO: renamed from: y */
    public View m14774y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return h33.b(this, layoutInflater, viewGroup);
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: b */
    public void mo12205b(boolean z) {
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: p */
    public void mo12216p(User user) {
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: q */
    public void mo12217q(User user) {
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: u */
    public void mo12220u() {
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: j */
    public void mo12212j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
    }
}
