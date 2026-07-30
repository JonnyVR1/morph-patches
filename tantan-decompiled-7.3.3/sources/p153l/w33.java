package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.view.RoundedRectangleProgressView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import java.text.DecimalFormat;
import p151v.VDraweeView;
import p151v.VIcon;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class w33 implements y6k0 {

    /* JADX INFO: renamed from: a */
    public LinearLayout f187053a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f187054b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f187055c;

    /* JADX INFO: renamed from: d */
    public VImage f187056d;

    /* JADX INFO: renamed from: e */
    public RoundedRectangleProgressView f187057e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f187058f;

    /* JADX INFO: renamed from: g */
    public VText f187059g;

    /* JADX INFO: renamed from: h */
    public VImage f187060h;

    /* JADX INFO: renamed from: i */
    public ODiamondTagLabel f187061i;

    /* JADX INFO: renamed from: j */
    public VImage f187062j;

    /* JADX INFO: renamed from: k */
    public VText f187063k;

    /* JADX INFO: renamed from: l */
    public Space f187064l;

    /* JADX INFO: renamed from: m */
    public VLinear f187065m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f187066n;

    /* JADX INFO: renamed from: o */
    public VText f187067o;

    /* JADX INFO: renamed from: p */
    public VIcon f187068p;

    /* JADX INFO: renamed from: q */
    public VLinear f187069q;

    /* JADX INFO: renamed from: r */
    public VText f187070r;

    /* JADX INFO: renamed from: s */
    public Act f187071s;

    public w33(Act act) {
        this.f187071s = act;
    }

    /* JADX INFO: renamed from: z */
    public static String m204678z(long j) {
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
    public final /* synthetic */ void m204679A(View view) {
        i4g0.m138520r("e_state_explore", OMSDialogPositon.p_navigation_view);
        CoreModule.m30932N().mo61574t6(this.f187071s, true, OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m204680B(View view) {
        i4g0.m138520r("e_my_moment", OMSDialogPositon.p_navigation_view);
        this.f187071s.startActivity(CoreModule.m30932N().argsToPhotoAlbumFeedAct(this.f187071s, CoreModule.m30929H().userId(), "p_my_moment", -1, null, 0));
    }

    @Override // p153l.y6k0
    @NonNull
    /* JADX INFO: renamed from: a */
    public View mo149538a() {
        return this.f187065m;
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: c */
    public void mo149540c() {
        bnl0.m105524M(mo149538a(), true);
        this.f187063k.setMaxLines(1);
    }

    @Override // p153l.y6k0
    @NonNull
    /* JADX INFO: renamed from: d */
    public VImage mo149541d() {
        return this.f187062j;
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: e */
    public void mo149542e(String str, bkj0<String, String, String> bkj0Var) {
        VLinear vLinear = this.f187065m;
        VDraweeView vDraweeView = this.f187066n;
        VText vText = this.f187067o;
        if (e7d0.m119697f()) {
            int i = qa00.f156321h;
            vLinear.setPadding(i, 0, i, 0);
            ViewGroup.LayoutParams layoutParams = vLinear.getLayoutParams();
            layoutParams.width = -2;
            vLinear.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = vDraweeView.getLayoutParams();
            int i2 = qa00.f156330q;
            layoutParams2.height = i2;
            layoutParams2.width = i2;
            vDraweeView.setLayoutParams(layoutParams2);
            vDraweeView.setBackgroundResource(0);
            uqb0.f180374G.m127109I0(vDraweeView, bkj0Var.f77083c, i2, i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vText.getLayoutParams();
            marginLayoutParams.leftMargin = qa00.f156316c;
            marginLayoutParams.rightMargin = 0;
            vText.setLayoutParams(marginLayoutParams);
            vText.setText("更多状态");
            bnl0.m105524M(this.f187068p, true);
            vLinear.setOnClickListener(new View.OnClickListener() { // from class: l.u33
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f177281a.m204679A(view);
                }
            });
        }
    }

    @Override // p153l.y6k0
    @NonNull
    /* JADX INFO: renamed from: g */
    public ODiamondTagLabel mo149544g() {
        return this.f187061i;
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: h */
    public void mo149545h(View.OnClickListener onClickListener) {
        bnl0.m105509E0(this.f187056d, onClickListener);
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: i */
    public void mo149546i(User user) {
        VText vText = this.f187063k;
        String str = user.description;
        if (TextUtils.isEmpty(str)) {
            bnl0.m105524M(vText, false);
            vText.setText(this.f187071s.getString(R$string.f18398Dj));
            if (e7d0.m119697f()) {
                bnl0.m105524M(this.f187064l, false);
                return;
            }
            return;
        }
        bnl0.m105524M(vText, true);
        vText.setText(str);
        if (e7d0.m119697f()) {
            bnl0.m105524M(this.f187064l, true);
        }
    }

    @Override // p153l.y6k0
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m204681y(layoutInflater, viewGroup);
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: l */
    public void mo149549l(User user) {
        uqb0.f180374G.m127111J0(this.f187055c, user.m61308fp().calculatedWidth(qa00.f156302O), false);
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
    @Override // p153l.y6k0
    /* JADX INFO: renamed from: n */
    public void mo149551n(View.OnClickListener onClickListener) {
        VLinear vLinear = this.f187065m;
        VDraweeView vDraweeView = this.f187066n;
        VText vText = this.f187067o;
        int i = qa00.f156323j;
        vLinear.setPadding(i, 0, i, 0);
        ViewGroup.LayoutParams layoutParams = vLinear.getLayoutParams();
        layoutParams.width = -2;
        vLinear.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = vDraweeView.getLayoutParams();
        int i2 = qa00.f156324k;
        layoutParams2.height = i2;
        layoutParams2.width = i2;
        vDraweeView.setLayoutParams(layoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vText.getLayoutParams();
        marginLayoutParams.leftMargin = qa00.f156316c;
        marginLayoutParams.rightMargin = 0;
        vText.setLayoutParams(marginLayoutParams);
        bnl0.m105524M(this.f187068p, false);
        vText.setTextColor(this.f187071s.getResources().getColor(c9c0.f80431k0));
        vText.setText("状态");
        uqb0.f180374G.m127138Y0(vDraweeView, dbc0.f87286oi);
        bnl0.m105509E0(vLinear, onClickListener);
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: o */
    public void mo149552o(int i) {
        if (e7d0.m119697f()) {
            this.f187070r.setText(i > 0 ? String.format("%s条动态", m204678z(i)) : "我的动态");
            bnl0.m105524M(this.f187069q, true);
            bnl0.m105509E0(this.f187069q, new View.OnClickListener() { // from class: l.v33
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f182150a.m204680B(view);
                }
            });
        }
    }

    @Override // p153l.y6k0
    @NonNull
    /* JADX INFO: renamed from: t */
    public VText mo149556t() {
        return this.f187059g;
    }

    @Override // p153l.y6k0
    @NonNull
    /* JADX INFO: renamed from: v */
    public VImage mo149558v() {
        return this.f187060h;
    }

    /* JADX INFO: renamed from: y */
    public View m204681y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return x33.m209189b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: u */
    public void mo149557u() {
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: b */
    public void mo149539b(boolean z) {
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: p */
    public void mo149553p(User user) {
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: q */
    public void mo149554q(User user) {
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: j */
    public void mo149547j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
    }
}
