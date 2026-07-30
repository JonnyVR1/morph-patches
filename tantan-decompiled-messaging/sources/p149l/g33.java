package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.view.RoundedRectangleProgressView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import java.text.DecimalFormat;
import p147v.VDraweeView;
import p147v.VIcon;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class g33 implements sxj0 {

    /* JADX INFO: renamed from: a */
    public LinearLayout f100319a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f100320b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f100321c;

    /* JADX INFO: renamed from: d */
    public VImage f100322d;

    /* JADX INFO: renamed from: e */
    public RoundedRectangleProgressView f100323e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f100324f;

    /* JADX INFO: renamed from: g */
    public VText f100325g;

    /* JADX INFO: renamed from: h */
    public VImage f100326h;

    /* JADX INFO: renamed from: i */
    public ODiamondTagLabel f100327i;

    /* JADX INFO: renamed from: j */
    public VImage f100328j;

    /* JADX INFO: renamed from: k */
    public VText f100329k;

    /* JADX INFO: renamed from: l */
    public Space f100330l;

    /* JADX INFO: renamed from: m */
    public VLinear f100331m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f100332n;

    /* JADX INFO: renamed from: o */
    public VText f100333o;

    /* JADX INFO: renamed from: p */
    public VIcon f100334p;

    /* JADX INFO: renamed from: q */
    public VLinear f100335q;

    /* JADX INFO: renamed from: r */
    public VText f100336r;

    /* JADX INFO: renamed from: s */
    public Act f100337s;

    public g33(Act act) {
        this.f100337s = act;
    }

    /* JADX INFO: renamed from: z */
    public static String m124200z(long j) {
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
    public final /* synthetic */ void m124201A(View view) {
        zvf0.m220396r("e_state_explore", OMSDialogPositon.p_navigation_view);
        CoreModule.m29934N().mo60390t6(this.f100337s, true, OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m124202B(View view) {
        zvf0.m220396r("e_my_moment", OMSDialogPositon.p_navigation_view);
        this.f100337s.startActivity(CoreModule.m29934N().argsToPhotoAlbumFeedAct(this.f100337s, CoreModule.m29931H().userId(), "p_my_moment", -1, null, 0));
    }

    @Override // p149l.sxj0
    @NonNull
    /* JADX INFO: renamed from: a */
    public View mo103678a() {
        return this.f100331m;
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: c */
    public void mo103680c() {
        xdl0.m208344M(mo103678a(), true);
        this.f100329k.setMaxLines(1);
    }

    @Override // p149l.sxj0
    @NonNull
    /* JADX INFO: renamed from: d */
    public VImage mo103681d() {
        return this.f100328j;
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: e */
    public void mo103682e(String str, xaj0<String, String, String> xaj0Var) {
        VLinear vLinear = this.f100331m;
        VDraweeView vDraweeView = this.f100332n;
        VText vText = this.f100333o;
        if (bzc0.m104566f()) {
            int i = t100.f167259h;
            vLinear.setPadding(i, 0, i, 0);
            ViewGroup.LayoutParams layoutParams = vLinear.getLayoutParams();
            layoutParams.width = -2;
            vLinear.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = vDraweeView.getLayoutParams();
            int i2 = t100.f167268q;
            layoutParams2.height = i2;
            layoutParams2.width = i2;
            vDraweeView.setLayoutParams(layoutParams2);
            vDraweeView.setBackgroundResource(0);
            qib0.f154691G.m102325I0(vDraweeView, xaj0Var.f191753c, i2, i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vText.getLayoutParams();
            marginLayoutParams.leftMargin = t100.f167254c;
            marginLayoutParams.rightMargin = 0;
            vText.setLayoutParams(marginLayoutParams);
            vText.setText("更多状态");
            xdl0.m208344M(this.f100334p, true);
            vLinear.setOnClickListener(new View.OnClickListener() { // from class: l.e33
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f88988a.m124201A(view);
                }
            });
        }
    }

    @Override // p149l.sxj0
    @NonNull
    /* JADX INFO: renamed from: g */
    public ODiamondTagLabel mo103683g() {
        return this.f100327i;
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: h */
    public void mo103684h(View.OnClickListener onClickListener) {
        xdl0.m208329E0(this.f100322d, onClickListener);
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: i */
    public void mo103685i(User user) {
        VText vText = this.f100329k;
        String str = user.description;
        if (TextUtils.isEmpty(str)) {
            xdl0.m208344M(vText, false);
            vText.setText(this.f100337s.getString(R$string.f18582hj));
            if (bzc0.m104566f()) {
                xdl0.m208344M(this.f100330l, false);
                return;
            }
            return;
        }
        xdl0.m208344M(vText, true);
        vText.setText(str);
        if (bzc0.m104566f()) {
            xdl0.m208344M(this.f100330l, true);
        }
    }

    @Override // p149l.sxj0
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m124203y(layoutInflater, viewGroup);
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: l */
    public void mo103687l(User user) {
        qib0.f154691G.m102327J0(this.f100321c, user.m60124fp().calculatedWidth(t100.f167240O), false);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p149l.sxj0
    /* JADX INFO: renamed from: n */
    public void mo103688n(View.OnClickListener onClickListener) {
        VLinear vLinear = this.f100331m;
        VDraweeView vDraweeView = this.f100332n;
        VText vText = this.f100333o;
        int i = t100.f167261j;
        vLinear.setPadding(i, 0, i, 0);
        ViewGroup.LayoutParams layoutParams = vLinear.getLayoutParams();
        layoutParams.width = -2;
        vLinear.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = vDraweeView.getLayoutParams();
        int i2 = t100.f167262k;
        layoutParams2.height = i2;
        layoutParams2.width = i2;
        vDraweeView.setLayoutParams(layoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vText.getLayoutParams();
        marginLayoutParams.leftMargin = t100.f167254c;
        marginLayoutParams.rightMargin = 0;
        vText.setLayoutParams(marginLayoutParams);
        xdl0.m208344M(this.f100334p, false);
        vText.setTextColor(this.f100337s.getResources().getColor(w0c0.f183858j0));
        vText.setText("状态");
        qib0.f154691G.m102354Y0(vDraweeView, x2c0.f189171Ah);
        xdl0.m208329E0(vLinear, onClickListener);
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: o */
    public void mo103689o(int i) {
        if (bzc0.m104566f()) {
            this.f100336r.setText(i > 0 ? String.format("%s条动态", m124200z(i)) : "我的动态");
            xdl0.m208344M(this.f100335q, true);
            xdl0.m208329E0(this.f100335q, new View.OnClickListener() { // from class: l.f33
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f94243a.m124202B(view);
                }
            });
        }
    }

    @Override // p149l.sxj0
    @NonNull
    /* JADX INFO: renamed from: t */
    public VText mo103693t() {
        return this.f100325g;
    }

    @Override // p149l.sxj0
    @NonNull
    /* JADX INFO: renamed from: v */
    public VImage mo103695v() {
        return this.f100326h;
    }

    /* JADX INFO: renamed from: y */
    public View m124203y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return h33.m129158b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: b */
    public void mo103679b(boolean z) {
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: p */
    public void mo103690p(User user) {
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: q */
    public void mo103691q(User user) {
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: u */
    public void mo103694u() {
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: j */
    public void mo103686j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
    }
}
