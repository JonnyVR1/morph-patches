package com.p000p1.mobile.putong.core.p004ui.settings.filter.newui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.NewUIAbFilterBaseSetting;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.tags.TagContainerLayout;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.data.LabelData;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.view.CommonLabelShowView;
import com.p1.mobile.putong.data.IdealTag;
import com.p1.mobile.putong.data.LookingFor;
import com.p1.mobile.putong.data.OMSThemeInfo;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l.a5c0;
import l.c1c0;
import l.d30;
import l.e30;
import l.i0g0;
import l.iqk0;
import l.j760;
import l.lsi0;
import l.mqa;
import l.pj90;
import l.t100;
import l.ub40;
import l.vwb;
import l.w9j;
import l.wg50;
import l.xdl0;
import l.yij0;
import l.yki0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import p006l.au2;
import p006l.ba40;
import p006l.ip20;
import p006l.iuh0;
import p006l.jjb0;
import p006l.qne0;
import v.VFrame;
import v.VLinear;
import v.VListCell;
import v.VRangeSlider;
import v.VSlider;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class NewUIAbFilterBaseSetting extends VLinear {

    /* JADX INFO: renamed from: A */
    public Settings f5977A;

    /* JADX INFO: renamed from: B */
    public TextView f5978B;

    /* JADX INFO: renamed from: C */
    public TextView f5979C;

    /* JADX INFO: renamed from: D */
    public Act f5980D;

    /* JADX INFO: renamed from: E */
    public ValueAnimator f5981E;

    /* JADX INFO: renamed from: F */
    public ValueAnimator f5982F;

    /* JADX INFO: renamed from: G */
    public boolean f5983G;

    /* JADX INFO: renamed from: H */
    public HiddenNearByView f5984H;

    /* JADX INFO: renamed from: I */
    public List<IdealTag> f5985I;

    /* JADX INFO: renamed from: J */
    public Runnable f5986J;

    /* JADX INFO: renamed from: c */
    public VListCell f5987c;

    /* JADX INFO: renamed from: d */
    public VFrame f5988d;

    /* JADX INFO: renamed from: e */
    public ImageView f5989e;

    /* JADX INFO: renamed from: f */
    public VFrame f5990f;

    /* JADX INFO: renamed from: g */
    public CommonLabelShowView f5991g;

    /* JADX INFO: renamed from: h */
    public TextView f5992h;

    /* JADX INFO: renamed from: i */
    public VRangeSlider f5993i;

    /* JADX INFO: renamed from: j */
    public VText f5994j;

    /* JADX INFO: renamed from: k */
    public TextView f5995k;

    /* JADX INFO: renamed from: l */
    public VSlider f5996l;

    /* JADX INFO: renamed from: m */
    public VListCell f5997m;

    /* JADX INFO: renamed from: n */
    public FilterSwitchCell f5998n;

    /* JADX INFO: renamed from: o */
    public VFrame f5999o;

    /* JADX INFO: renamed from: p */
    public TextView f6000p;

    /* JADX INFO: renamed from: q */
    public VSlider f6001q;

    /* JADX INFO: renamed from: r */
    public VLinear f6002r;

    /* JADX INFO: renamed from: s */
    public VListCell f6003s;

    /* JADX INFO: renamed from: t */
    public TagContainerLayout f6004t;

    /* JADX INFO: renamed from: u */
    public VText f6005u;

    /* JADX INFO: renamed from: v */
    public VListCell f6006v;

    /* JADX INFO: renamed from: w */
    public VLinear f6007w;

    /* JADX INFO: renamed from: x */
    public VListCell f6008x;

    /* JADX INFO: renamed from: y */
    public List<iuh0> f6009y;

    /* JADX INFO: renamed from: z */
    public ba40 f6010z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$a */
    public class C0310a implements Animator.AnimatorListener {
        public C0310a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdl0.M(NewUIAbFilterBaseSetting.this.f5999o, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$b */
    public class C0311b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f6012a;

        public C0311b(int i) {
            this.f6012a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(new Rect(0 - t100.d(10.0f), this.f6012a, view.getWidth() + t100.d(10.0f), view.getHeight()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$c */
    public class C0312c implements HiddenNearByView.InterfaceC0293g {
        public C0312c() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.HiddenNearByView.InterfaceC0293g
        /* JADX INFO: renamed from: a */
        public void mo8763a(int i) {
            NewUIAbFilterBaseSetting.this.f5996l.setValue(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$d */
    public class C0313d implements e30<NewFilterGenderItem> {
        public C0313d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(NewFilterGenderItem newFilterGenderItem) {
            if (NullChecker.a(newFilterGenderItem)) {
                int iIndexOfChild = NewUIAbFilterBaseSetting.this.f6004t.indexOfChild(newFilterGenderItem);
                if (!NullChecker.a(NewUIAbFilterBaseSetting.this.f5977A) || vwb.J(NewUIAbFilterBaseSetting.this.f5977A.settingGroups)) {
                    return;
                }
                NewUIAbFilterBaseSetting.this.f5977A.getSettingGroup().search.lookingForGender = NewUIAbFilterBaseSetting.this.m8907r0(iIndexOfChild);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$e */
    public class C0314e extends VSlider.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f6016a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f6017b;

        public C0314e(Settings settings, Runnable runnable) {
            this.f6016a = settings;
            this.f6017b = runnable;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m8932a(@NonNull @NotNull VSlider vSlider, boolean z, float f) {
            if (jjb0.m17488c() && !((Boolean) CoreModule.f1534c.f3628e0.f19089t5.get()).booleanValue() && f < 20.0f && this.f6016a.autoAdjustSuggestRadius().booleanValue()) {
                yij0.t(NewUIAbFilterBaseSetting.this.f5997m, false);
                CoreModule.f1534c.f3628e0.f19089t5.put(Boolean.TRUE);
            }
            if (IntlCountryCodeController.m5f()) {
                Settings settings = this.f6016a;
                if (f == 60.0f) {
                    settings.getSettingGroup().search.radius = this.f6016a.getRadiusAllowedMaximum();
                } else {
                    settings.getSettingGroup().search.radius = Integer.valueOf(this.f6016a.getRadiusAllowedMinimum().intValue() + Math.min(this.f6016a.getRadiusAllowedMaximum().intValue() - this.f6016a.getRadiusAllowedMinimum().intValue(), (int) Math.max(0.0d, i0g0.L(f))));
                }
            } else {
                this.f6016a.getSettingGroup().search.radius = Integer.valueOf(this.f6016a.getRadiusAllowedMinimum().intValue() + Math.min(this.f6016a.getRadiusAllowedMaximum().intValue() - this.f6016a.getRadiusAllowedMinimum().intValue(), Math.max(0, ((int) f) * AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO)));
            }
            this.f6017b.run();
            super.c(vSlider, z, f);
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void m8933b(@NonNull @NotNull VSlider vSlider, boolean z, float f, float f2) {
            super.d(vSlider, z, f, f2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$f */
    public class C0315f implements VSlider.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f6019a;

        public C0315f(Settings settings) {
            this.f6019a = settings;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m8936a(@NonNull @NotNull VSlider vSlider) {
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void m8937b(@NonNull @NotNull VSlider vSlider) {
            zvf0.v("e_advanced_filter_distance", "p_advanced_filter_page", new j760[]{vwb.Y("suggest_see_user_search_radius", this.f6019a.getSearchRadius())});
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$g */
    public class C0316g implements wg50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f6021a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f6022b;

        public C0316g(Settings settings, Runnable runnable) {
            this.f6021a = settings;
            this.f6022b = runnable;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m8940a(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f) {
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void m8941b(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f, float f2) {
            if (f < this.f6021a.getSearchAgeAllowedMinimum().intValue() || f2 < this.f6021a.getSearchAgeAllowedMinimum().intValue() || f > this.f6021a.getSearchAgeAllowedMaximum().intValue() || f2 > this.f6021a.getSearchAgeAllowedMaximum().intValue()) {
                return;
            }
            this.f6021a.getSettingGroup().search.minAge = Integer.valueOf((int) f);
            this.f6021a.getSettingGroup().search.maxAge = Integer.valueOf((int) f2);
            this.f6022b.run();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$h */
    public class C0317h implements VRangeSlider.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f6024a;

        public C0317h(Settings settings) {
            this.f6024a = settings;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m8944a(@NonNull @NotNull VRangeSlider vRangeSlider) {
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void m8945b(@NonNull @NotNull VRangeSlider vRangeSlider) {
            zvf0.v("e_advanced_filter_age", "p_advanced_filter_page", new j760[]{vwb.Y("suggest_see_user_search_max_age", this.f6024a.getSearchMaxAge()), vwb.Y("suggest_see_user_search_min_age", this.f6024a.getSearchMinAge())});
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$i */
    public class C0318i implements CompoundButton.OnCheckedChangeListener {
        public C0318i() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            NewUIAbFilterBaseSetting newUIAbFilterBaseSetting = NewUIAbFilterBaseSetting.this;
            if (z) {
                newUIAbFilterBaseSetting.m8925n0(newUIAbFilterBaseSetting.f6001q.getValue());
            } else {
                newUIAbFilterBaseSetting.f6001q.setValue(0.0f);
                NewUIAbFilterBaseSetting.this.m8925n0(0.0f);
            }
            NewUIAbFilterBaseSetting newUIAbFilterBaseSetting2 = NewUIAbFilterBaseSetting.this;
            if (z) {
                newUIAbFilterBaseSetting2.m8921Q0();
            } else {
                newUIAbFilterBaseSetting2.m8927s0();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$j */
    public class C0319j implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f6027a;

        public C0319j(int i) {
            this.f6027a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) NewUIAbFilterBaseSetting.this.f5999o.getLayoutParams();
            int i = this.f6027a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            NewUIAbFilterBaseSetting.this.m8926p0((int) (i * fFloatValue));
            NewUIAbFilterBaseSetting.this.f5999o.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$k */
    public class C0320k implements Animator.AnimatorListener {
        public C0320k() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$l */
    public class C0321l implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f6030a;

        public C0321l(int i) {
            this.f6030a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) NewUIAbFilterBaseSetting.this.f5999o.getLayoutParams();
            int i = this.f6030a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            NewUIAbFilterBaseSetting.this.m8926p0((int) (i * fFloatValue));
            NewUIAbFilterBaseSetting.this.f5999o.setLayoutParams(marginLayoutParams);
        }
    }

    public NewUIAbFilterBaseSetting(Context context) {
        super(context);
        this.f6009y = new ArrayList();
        this.f5983G = false;
        this.f5986J = new Runnable() { // from class: l.lb40
            @Override // java.lang.Runnable
            public final void run() {
                this.f16315a.m8881G0();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m8879A0(View view) {
        m8911y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m8880E0(View view) {
        yij0.T(this.f5998n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m8881G0() {
        String str;
        int iIntValue = this.f5977A.getSearchInvisibleRadius().intValue();
        String string = this.f5980D.getString(R.string.b2);
        String string2 = this.f5980D.getString(R.string.e2);
        if (iIntValue == 0) {
            str = "";
        } else if (iIntValue < 1000) {
            str = "<" + iIntValue + string2;
        } else if (iIntValue % AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO == 0) {
            str = "<" + (iIntValue / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) + string;
        } else {
            str = "<" + String.format("%.1f", Double.valueOf(((double) iIntValue) / 1000.0d)) + string;
        }
        this.f6000p.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N0 */
    public /* synthetic */ void m8882N0(View view) {
        CoreModule.f1546o.m25559d().m5675Pa(getContext());
    }

    /* JADX INFO: renamed from: P0 */
    private void m8884P0() {
        a aVar = new a(this.f5997m.getContext());
        aVar.B(t100.d(2.0f)).D("离线期间有" + (this.f5977A.getSearchRadius().intValue() / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) + "km外的人喜欢了你，已为你自动扩大距离").k(new int[]{CoreModule.f1533b.getResources().getColor(c1c0.f)}).l(t100.d(7.0f)).p(75).J(13.0f).I(228).w(t100.d(6.0f)).x(t100.d(6.0f)).C(10).b(3000L).y(true).q(a.N);
        d.l().u(aVar, this.f5997m.getRightView(), "boost_auto_distance");
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m8885Q(View view) {
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ LabelData m8886R(IdealTag idealTag) {
        LabelData labelData = new LabelData();
        labelData.name = idealTag.name;
        return labelData;
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ String m8889V(Act act, float f) {
        return String.valueOf(((int) f) + 1) + act.getString(R.string.b2);
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ boolean m8895b0(int i, int i2, Intent intent) {
        CoreModule.f1534c.f3628e0.f19000h7 = false;
        return false;
    }

    /* JADX INFO: renamed from: k0 */
    private void m8903k0(VListCell vListCell) {
        ImageView imageView = (ImageView) vListCell.findViewById(a5c0.u);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = t100.d(24.0f);
        layoutParams.width = t100.d(24.0f);
    }

    /* JADX INFO: renamed from: m0 */
    private void m8904m0() {
        if (NullChecker.a(this.f5981E) && this.f5981E.isRunning()) {
            this.f5981E.cancel();
        }
        if (NullChecker.a(this.f5982F) && this.f5982F.isRunning()) {
            this.f5982F.cancel();
        }
    }

    /* JADX INFO: renamed from: o0 */
    private boolean m8905o0() {
        boolean zI = yki0.b().i();
        CoreModule.f1534c.f3691z0.f13754V.put(Boolean.valueOf(zI));
        return zI;
    }

    /* JADX INFO: renamed from: q0 */
    private int m8906q0(LookingFor lookingFor) {
        if (TEnum.equals(lookingFor, "male")) {
            return 0;
        }
        return TEnum.equals(lookingFor, "female") ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public LookingFor m8907r0(int i) {
        if (i == 0) {
            return LookingFor.get("male");
        }
        return i == 1 ? LookingFor.get("female") : LookingFor.get("both");
    }

    private void setGenderChoose(LookingFor lookingFor) {
        this.f6010z.m15989o(qne0.f19940g[m8906q0(lookingFor)]);
    }

    /* JADX INFO: renamed from: v0 */
    private void m8908v0() {
        ba40 ba40Var = new ba40();
        this.f6010z = ba40Var;
        ba40Var.m15988n(new C0313d());
        this.f6004t.setCanAdjustChildHeight(false);
        this.f6004t.setIsSquare(true);
        this.f6004t.setAdapter(this.f6010z);
        this.f6010z.m12583r(Arrays.asList(qne0.f19940g));
        this.f6010z.m15986l();
    }

    /* JADX INFO: renamed from: w0 */
    private void m8909w0() {
        xdl0.M(this.f5987c, false);
        if (yki0.b().g()) {
            OMSThemeInfo oMSThemeInfoA = yki0.b().a();
            if (!NullChecker.a(oMSThemeInfoA) || oMSThemeInfoA.settingTxt.isEmpty()) {
                return;
            }
            xdl0.M(this.f5987c, true);
            yij0.t(this.f5987c, m8905o0());
            zvf0.A("e_advanced_filter_theme", "p_advanced_filter_page", new j760[]{vwb.Y("theme_status", yij0.u(this.f5987c) ? "open" : "close")});
            this.f5987c.setTitle(oMSThemeInfoA.settingTxt);
            this.f5987c.setOnClickListener(new View.OnClickListener() { // from class: l.kb40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15683a.m8913D0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x0 */
    private void m8910x0() {
        m8903k0(this.f5997m);
        if (CoreModule.m1854P().m11711g().m7021xj()) {
            this.f5979C = (TextView) this.f6006v.findViewById(a5c0.c0);
            xdl0.M(this.f5998n, false);
            xdl0.M(this.f5999o, false);
            return;
        }
        this.f5978B = this.f5992h;
        this.f5979C = (TextView) this.f6006v.findViewById(a5c0.c0);
        m8903k0(this.f5998n);
        if (CoreModule.m1854P().m11706a().m5343Sk()) {
            this.f5998n.setTitle("不被附近的人发现");
            xdl0.M(this.f6002r, true);
            xdl0.M(this.f6003s, true);
        }
        xdl0.E0(this.f5998n, new View.OnClickListener() { // from class: l.db40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10271a.m8880E0(view);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    private void m8911y0() {
        zvf0.r("e_ideal_type_entrance", "p_advanced_filter_page");
        CoreModule.f1534c.f3628e0.f19000h7 = true;
        Act act = this.f5980D;
        act.startActivityForResult(MkWebViewAct.e2(act, "", pj90.p, true, true, true, true, (ResultReceiver) null), new com.p1.mobile.android.app.a.a() { // from class: l.rb40
            /* JADX INFO: renamed from: a */
            public final boolean m22792a(int i, int i2, Intent intent) {
                return NewUIAbFilterBaseSetting.m8895b0(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m8912B0(View view) {
        m8911y0();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m8913D0(View view) {
        if (!Network.isConnected(CoreModule.f1533b)) {
            lsi0.n(R.string.G0);
        } else {
            zvf0.u("e_advanced_filter_theme", "p_advanced_filter_page", new j760[]{vwb.Y("theme_status", yij0.u(this.f5987c) ? "close" : "open")});
            yij0.T(this.f5987c);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m8914H0(Act act, Settings settings) {
        String strConcat;
        if (IntlCountryCodeController.m5f()) {
            String str = " " + act.getString(R.string.f2);
            double dK = i0g0.K(settings.getSearchRadius().intValue());
            if (dK >= 59.0d && settings.getSearchRadius().intValue() < settings.getRadiusAllowedMaximum().intValue()) {
                strConcat = "59".concat(str);
            } else if (settings.getSearchRadius().intValue() >= settings.getRadiusAllowedMaximum().intValue()) {
                strConcat = "60" + str + "+";
            } else if (settings.getSearchRadius().intValue() <= settings.getRadiusAllowedMinimum().intValue()) {
                strConcat = "<1 " + act.getString(R.string.g2);
            } else {
                strConcat = mqa.a.format(dK) + str;
            }
        } else {
            int iIntValue = settings.getSearchRadius().intValue() / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
            Integer radiusAllowedMaximum = settings.getRadiusAllowedMaximum();
            String string = act.getString(R.string.b2);
            if (!NullChecker.b(radiusAllowedMaximum) || iIntValue < radiusAllowedMaximum.intValue() / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) {
                Integer radiusAllowedMinimum = settings.getRadiusAllowedMinimum();
                if (!NullChecker.b(radiusAllowedMinimum) || iIntValue > radiusAllowedMinimum.intValue() / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) {
                    strConcat = Integer.toString(iIntValue) + string;
                } else {
                    strConcat = "<" + (radiusAllowedMinimum.intValue() / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) + string;
                }
            } else {
                strConcat = (radiusAllowedMaximum.intValue() / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) + string + "+";
            }
        }
        this.f5995k.setText(strConcat);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m8915I0(Settings settings) {
        settings.getSettingGroup().privacy.hideContacts = Boolean.valueOf(yij0.T(this.f6003s));
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m8916J0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        yij0.t(this.f6003s, false);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m8917K0(final Settings settings, Act act, View view) {
        if (!yij0.u(this.f6003s)) {
            PermissionHelper.c().r(new String[]{"android.permission.READ_CONTACTS"}).w(false).u(false).m(new d30() { // from class: l.ib40
                public final void call() {
                    this.f14347a.m8915I0(settings);
                }
            }, new e30() { // from class: l.jb40
                public final void call(Object obj) {
                    this.f15098a.m8916J0((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).i(act);
        } else {
            settings.getSettingGroup().privacy.hideContacts = Boolean.valueOf(yij0.T(this.f6003s));
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m8918L0(Settings settings, View view) {
        zvf0.v("e_advanced_filter_larger_distance", "p_advanced_filter_page", new j760[]{vwb.Y("suggest_see_user_search_auto_radius", Boolean.valueOf(!yij0.u(this.f5997m)))});
        settings.getSettingGroup().search.autoAdjustRadius = Boolean.valueOf(yij0.T(this.f5997m));
        CoreModule.f1534c.f3628e0.f19089t5.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m8919M0(Settings settings) {
        TextView textView = this.f5978B;
        StringBuilder sb = new StringBuilder();
        sb.append(settings.getSearchMinAge());
        sb.append(" - ");
        sb.append(settings.getSearchMaxAge());
        sb.append(settings.getSearchMaxAge().equals(settings.getSearchAgeAllowedMaximum()) ? "+" : "");
        textView.setText(sb.toString());
    }

    /* JADX INFO: renamed from: O0 */
    public void m8920O0(final Act act, final Settings settings, String str) {
        boolean z;
        this.f5980D = act;
        this.f5977A = settings;
        this.f5978B = this.f5992h;
        Runnable runnable = new Runnable() { // from class: l.sb40
            @Override // java.lang.Runnable
            public final void run() {
                this.f21230a.m8914H0(act, settings);
            }
        };
        runnable.run();
        this.f5986J.run();
        if (CoreModule.m1854P().m11706a().m5343Sk()) {
            yij0.t(this.f6003s, settings.hideContacts().booleanValue());
            this.f6003s.setOnClickListener(new View.OnClickListener() { // from class: l.tb40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21982a.m8917K0(settings, act, view);
                }
            });
        }
        this.f5996l.setValueTo((settings.getRadiusAllowedMaximum().intValue() - settings.getRadiusAllowedMinimum().intValue()) / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        int iIntValue = (settings.getSearchRadius().intValue() - settings.getRadiusAllowedMinimum().intValue()) / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
        float f = iIntValue;
        if (f == this.f5996l.getValue()) {
            this.f5996l.setValue(iIntValue + 1);
        }
        this.f5996l.setValue(f);
        this.f5996l.setLabelFormatter(new iqk0() { // from class: l.eb40
            /* JADX INFO: renamed from: a */
            public final String m14420a(float f2) {
                return NewUIAbFilterBaseSetting.m8889V(act, f2);
            }
        });
        this.f5996l.f(new C0314e(settings, runnable));
        this.f5996l.g(new C0315f(settings));
        m8909w0();
        boolean zBooleanValue = settings.autoAdjustSuggestRadius().booleanValue();
        yij0.t(this.f5997m, zBooleanValue);
        this.f5997m.setOnClickListener(new View.OnClickListener() { // from class: l.fb40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12633a.m8918L0(settings, view);
            }
        });
        if (TextUtils.equals(str, ip20.f14609n)) {
            if (!zBooleanValue) {
                this.f5997m.performClick();
            }
            m8884P0();
        }
        Runnable runnable2 = new Runnable() { // from class: l.gb40
            @Override // java.lang.Runnable
            public final void run() {
                this.f13197a.m8919M0(settings);
            }
        };
        runnable2.run();
        float fIntValue = settings.getSearchAgeAllowedMinimum().intValue();
        float fIntValue2 = settings.getSearchAgeAllowedMaximum().intValue();
        if (fIntValue <= 0.0f) {
            fIntValue = User.AGE_DEFAULT_SEARCH_MIN;
            z = true;
        } else {
            z = false;
        }
        if (fIntValue2 <= 0.0f) {
            fIntValue2 = User.AGE_DEFAULT_SEARCH_MAX;
            z = true;
        }
        this.f5993i.setValueFrom(fIntValue);
        this.f5993i.setValueTo(fIntValue2);
        float fIntValue3 = settings.getSearchMinAge().intValue();
        float fIntValue4 = settings.getSearchMaxAge().intValue();
        if (fIntValue3 <= 0.0f) {
            fIntValue3 = User.AGE_DEFAULT_SEARCH_MIN;
            z = true;
        }
        if (fIntValue4 <= 0.0f) {
            fIntValue4 = User.AGE_DEFAULT_SEARCH_MAX;
            z = true;
        }
        float fMax = Math.max(fIntValue, fIntValue3);
        if (z) {
            au2.m12238w(new IllegalStateException("wrong age ranges(from advanced filter), uid:" + CoreModule.m1850H().userId() + "; allowedMinimum:" + fIntValue + "; allowedMaximum:" + fIntValue2 + " searchMinAge:" + fMax + "; searchMaxAge:" + fIntValue4));
        }
        this.f5993i.setValues(new Float[]{Float.valueOf(fMax), Float.valueOf(fIntValue4)});
        this.f5993i.f(new C0316g(settings, runnable2));
        this.f5993i.g(new C0317h(settings));
        m8929u0(act, settings);
        setGenderChoose(settings.getLookingFor());
        this.f6006v.setOnClickListener(new View.OnClickListener() { // from class: l.hb40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13779a.m8882N0(view);
            }
        });
        boolean z2 = settings.getSearchInvisibleRadius().intValue() == 0;
        if (CoreModule.m1854P().m11711g().m7021xj()) {
            return;
        }
        xdl0.M(this.f5999o, !z2);
        this.f5998n.getSwitchButton().setChecked(!z2);
        this.f5998n.m8743d(new C0318i());
    }

    /* JADX INFO: renamed from: Q0 */
    public void m8921Q0() {
        m8904m0();
        this.f5981E = ValueAnimator.ofFloat(1.0f, 0.0f);
        int iD = t100.d(77.0f);
        this.f5981E.setDuration(400L);
        this.f5981E.addUpdateListener(new C0319j(iD));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f5999o.getLayoutParams();
        marginLayoutParams.topMargin = -iD;
        this.f5999o.setLayoutParams(marginLayoutParams);
        xdl0.M(this.f5999o, true);
        this.f5981E.addListener(new C0320k());
        this.f5981E.start();
    }

    /* JADX INFO: renamed from: R0 */
    public void m8922R0(String str) {
        if (NullChecker.b(this.f5979C)) {
            this.f5979C.setText(str);
        }
    }

    public View getLocationTitle() {
        return this.f6005u;
    }

    public List<IdealTag> getOriginIdealTag() {
        return this.f5985I;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m8923j0(View view) {
        ub40.a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public void m8924l0(String str, String str2) {
        this.f6006v.setTitle(str);
        this.f5979C.setText(str2);
    }

    /* JADX INFO: renamed from: n0 */
    public void m8925n0(float f) {
        int i = (int) (f * 200.0f);
        this.f5977A.getSettingGroup().search.invisibleRadius = Integer.valueOf(i);
        this.f5986J.run();
        if (this.f5977A.getSearchRadius().intValue() < i) {
            if (i % AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO != 0) {
                i = (i / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) * AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
            }
            this.f5996l.setValue(i / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8923j0(this);
        m8910x0();
        m8908v0();
        m8928t0(false);
    }

    /* JADX INFO: renamed from: p0 */
    public void m8926p0(int i) {
        this.f5999o.setOutlineProvider(new C0311b(i));
        this.f5999o.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: s0 */
    public void m8927s0() {
        m8904m0();
        this.f5982F = ValueAnimator.ofFloat(0.0f, 1.0f);
        int iD = t100.d(73.0f);
        this.f5982F.setDuration(400L);
        this.f5982F.addUpdateListener(new C0321l(iD));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f5999o.getLayoutParams();
        marginLayoutParams.topMargin = 0;
        this.f5999o.setLayoutParams(marginLayoutParams);
        this.f5982F.addListener(new C0310a());
        this.f5982F.start();
    }

    public void setHiddenNearByView(HiddenNearByView hiddenNearByView) {
        this.f5984H = hiddenNearByView;
        hiddenNearByView.setHiddenNearByViewListener(new C0312c());
    }

    /* JADX INFO: renamed from: t0 */
    public void m8928t0(boolean z) {
        if (CoreModule.m1854P().m11706a().m19884f4()) {
            xdl0.M(this.f5988d, true);
            zvf0.x("e_ideal_type_entrance", "p_advanced_filter_page");
            List<IdealTag> list = CoreModule.f1534c.f3628e0.m21490p9().profile.extensions.basic.ideal;
            if (!z) {
                this.f5985I = list;
            }
            boolean zJ = vwb.J(list);
            VFrame vFrame = this.f5990f;
            if (zJ) {
                xdl0.M(vFrame, true);
                xdl0.M(this.f5991g, false);
                xdl0.M(this.f5989e, false);
                xdl0.E0(this.f5988d, new View.OnClickListener() { // from class: l.mb40
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NewUIAbFilterBaseSetting.m8885Q(view);
                    }
                });
                xdl0.E0(this.f5990f, new View.OnClickListener() { // from class: l.nb40
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f17571a.m8930z0(view);
                    }
                });
                return;
            }
            xdl0.M(vFrame, false);
            xdl0.M(this.f5991g, true);
            xdl0.M(this.f5989e, true);
            xdl0.E0(this.f5988d, new View.OnClickListener() { // from class: l.ob40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18126a.m8879A0(view);
                }
            });
            this.f5991g.setLabel(vwb.Q(list, new w9j() { // from class: l.pb40
                public final Object call(Object obj) {
                    return NewUIAbFilterBaseSetting.m8886R((IdealTag) obj);
                }
            }));
            xdl0.E0(this.f5991g, new View.OnClickListener() { // from class: l.qb40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f19698a.m8912B0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m8929u0(Act act, Settings settings) {
        this.f6007w.setVisibility(8);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m8930z0(View view) {
        m8911y0();
    }

    public NewUIAbFilterBaseSetting(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6009y = new ArrayList();
        this.f5983G = false;
        this.f5986J = new Runnable() { // from class: l.lb40
            @Override // java.lang.Runnable
            public final void run() {
                this.f16315a.m8881G0();
            }
        };
    }

    public NewUIAbFilterBaseSetting(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6009y = new ArrayList();
        this.f5983G = false;
        this.f5986J = new Runnable() { // from class: l.lb40
            @Override // java.lang.Runnable
            public final void run() {
                this.f16315a.m8881G0();
            }
        };
    }
}
