package com.p046p1.mobile.putong.core.p053ui.settings.filter.newui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Outline;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LabelData;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.NewUIAbFilterBaseSetting;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.tags.TagContainerLayout;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.core.view.CommonLabelShowView;
import com.p046p1.mobile.putong.data.IdealTag;
import com.p046p1.mobile.putong.data.LookingFor;
import com.p046p1.mobile.putong.data.OMSThemeInfo;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VListCell;
import p147v.VRangeSlider;
import p147v.VSlider;
import p147v.VText;
import p149l.a5c0;
import p149l.au2;
import p149l.ba40;
import p149l.c1c0;
import p149l.d30;
import p149l.e30;
import p149l.i0g0;
import p149l.ip20;
import p149l.iqk0;
import p149l.iuh0;
import p149l.jjb0;
import p149l.lsi0;
import p149l.mqa;
import p149l.pj90;
import p149l.qne0;
import p149l.t100;
import p149l.ub40;
import p149l.vwb;
import p149l.w9j;
import p149l.wg50;
import p149l.xdl0;
import p149l.yij0;
import p149l.yki0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class NewUIAbFilterBaseSetting extends VLinear {

    /* JADX INFO: renamed from: A */
    public Settings f36196A;

    /* JADX INFO: renamed from: B */
    public TextView f36197B;

    /* JADX INFO: renamed from: C */
    public TextView f36198C;

    /* JADX INFO: renamed from: D */
    public Act f36199D;

    /* JADX INFO: renamed from: E */
    public ValueAnimator f36200E;

    /* JADX INFO: renamed from: F */
    public ValueAnimator f36201F;

    /* JADX INFO: renamed from: G */
    public boolean f36202G;

    /* JADX INFO: renamed from: H */
    public HiddenNearByView f36203H;

    /* JADX INFO: renamed from: I */
    public List<IdealTag> f36204I;

    /* JADX INFO: renamed from: J */
    public Runnable f36205J;

    /* JADX INFO: renamed from: c */
    public VListCell f36206c;

    /* JADX INFO: renamed from: d */
    public VFrame f36207d;

    /* JADX INFO: renamed from: e */
    public ImageView f36208e;

    /* JADX INFO: renamed from: f */
    public VFrame f36209f;

    /* JADX INFO: renamed from: g */
    public CommonLabelShowView f36210g;

    /* JADX INFO: renamed from: h */
    public TextView f36211h;

    /* JADX INFO: renamed from: i */
    public VRangeSlider f36212i;

    /* JADX INFO: renamed from: j */
    public VText f36213j;

    /* JADX INFO: renamed from: k */
    public TextView f36214k;

    /* JADX INFO: renamed from: l */
    public VSlider f36215l;

    /* JADX INFO: renamed from: m */
    public VListCell f36216m;

    /* JADX INFO: renamed from: n */
    public FilterSwitchCell f36217n;

    /* JADX INFO: renamed from: o */
    public VFrame f36218o;

    /* JADX INFO: renamed from: p */
    public TextView f36219p;

    /* JADX INFO: renamed from: q */
    public VSlider f36220q;

    /* JADX INFO: renamed from: r */
    public VLinear f36221r;

    /* JADX INFO: renamed from: s */
    public VListCell f36222s;

    /* JADX INFO: renamed from: t */
    public TagContainerLayout f36223t;

    /* JADX INFO: renamed from: u */
    public VText f36224u;

    /* JADX INFO: renamed from: v */
    public VListCell f36225v;

    /* JADX INFO: renamed from: w */
    public VLinear f36226w;

    /* JADX INFO: renamed from: x */
    public VListCell f36227x;

    /* JADX INFO: renamed from: y */
    public List<iuh0> f36228y;

    /* JADX INFO: renamed from: z */
    public ba40 f36229z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$a */
    public class C8874a implements Animator.AnimatorListener {
        public C8874a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdl0.m208344M(NewUIAbFilterBaseSetting.this.f36218o, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$b */
    public class C8875b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f36231a;

        public C8875b(int i) {
            this.f36231a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(new Rect(0 - t100.m186890d(10.0f), this.f36231a, view.getWidth() + t100.m186890d(10.0f), view.getHeight()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$c */
    public class C8876c implements HiddenNearByView.InterfaceC8857g {
        public C8876c() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.HiddenNearByView.InterfaceC8857g
        /* JADX INFO: renamed from: a */
        public void mo55390a(int i) {
            NewUIAbFilterBaseSetting.this.f36215l.setValue(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$d */
    public class C8877d implements e30<NewFilterGenderItem> {
        public C8877d() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(NewFilterGenderItem newFilterGenderItem) {
            if (NullChecker.m81303a(newFilterGenderItem)) {
                int iIndexOfChild = NewUIAbFilterBaseSetting.this.f36223t.indexOfChild(newFilterGenderItem);
                if (!NullChecker.m81303a(NewUIAbFilterBaseSetting.this.f36196A) || vwb.m200296J(NewUIAbFilterBaseSetting.this.f36196A.settingGroups)) {
                    return;
                }
                NewUIAbFilterBaseSetting.this.f36196A.getSettingGroup().search.lookingForGender = NewUIAbFilterBaseSetting.this.m55524r0(iIndexOfChild);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$e */
    public class C8878e extends VSlider.AbstractC22568a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f36235a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f36236b;

        public C8878e(Settings settings, Runnable runnable) {
            this.f36235a = settings;
            this.f36236b = runnable;
        }

        @Override // p147v.VSlider.AbstractC22568a, p149l.wg50
        /* JADX INFO: renamed from: c */
        public void mo55416a(@NonNull @NotNull VSlider vSlider, boolean z, float f) {
            if (jjb0.m141785c() && !CoreModule.f17545c.f19639e0.f149477t5.get().booleanValue() && f < 20.0f && this.f36235a.autoAdjustSuggestRadius().booleanValue()) {
                yij0.m214964t(NewUIAbFilterBaseSetting.this.f36216m, false);
                CoreModule.f17545c.f19639e0.f149477t5.put(Boolean.TRUE);
            }
            if (IntlCountryCodeController.m28110f()) {
                Settings settings = this.f36235a;
                if (f == 60.0f) {
                    settings.getSettingGroup().search.radius = this.f36235a.getRadiusAllowedMaximum();
                } else {
                    settings.getSettingGroup().search.radius = Integer.valueOf(this.f36235a.getRadiusAllowedMinimum().intValue() + Math.min(this.f36235a.getRadiusAllowedMaximum().intValue() - this.f36235a.getRadiusAllowedMinimum().intValue(), (int) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, i0g0.m133845L(f))));
                }
            } else {
                this.f36235a.getSettingGroup().search.radius = Integer.valueOf(this.f36235a.getRadiusAllowedMinimum().intValue() + Math.min(this.f36235a.getRadiusAllowedMaximum().intValue() - this.f36235a.getRadiusAllowedMinimum().intValue(), Math.max(0, ((int) f) * 1000)));
            }
            this.f36236b.run();
            super.mo55416a(vSlider, z, f);
        }

        @Override // p147v.VSlider.AbstractC22568a, p149l.wg50
        /* JADX INFO: renamed from: d */
        public void mo55417b(@NonNull @NotNull VSlider vSlider, boolean z, float f, float f2) {
            super.mo55417b(vSlider, z, f, f2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$f */
    public class C8879f implements VSlider.InterfaceC22569b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f36238a;

        public C8879f(Settings settings) {
            this.f36238a = settings;
        }

        @Override // p149l.xek0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo55484a(@NonNull @NotNull VSlider vSlider) {
        }

        @Override // p149l.xek0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo55485b(@NonNull @NotNull VSlider vSlider) {
            zvf0.m220400v("e_advanced_filter_distance", "p_advanced_filter_page", vwb.m200311Y("suggest_see_user_search_radius", this.f36238a.getSearchRadius()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$g */
    public class C8880g implements wg50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f36240a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f36241b;

        public C8880g(Settings settings, Runnable runnable) {
            this.f36240a = settings;
            this.f36241b = runnable;
        }

        @Override // p149l.wg50
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo55416a(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f) {
        }

        @Override // p149l.wg50
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo55417b(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f, float f2) {
            if (f < this.f36240a.getSearchAgeAllowedMinimum().intValue() || f2 < this.f36240a.getSearchAgeAllowedMinimum().intValue() || f > this.f36240a.getSearchAgeAllowedMaximum().intValue() || f2 > this.f36240a.getSearchAgeAllowedMaximum().intValue()) {
                return;
            }
            this.f36240a.getSettingGroup().search.minAge = Integer.valueOf((int) f);
            this.f36240a.getSettingGroup().search.maxAge = Integer.valueOf((int) f2);
            this.f36241b.run();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$h */
    public class C8881h implements VRangeSlider.InterfaceC22565a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f36243a;

        public C8881h(Settings settings) {
            this.f36243a = settings;
        }

        @Override // p149l.xek0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo55484a(@NonNull @NotNull VRangeSlider vRangeSlider) {
        }

        @Override // p149l.xek0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo55485b(@NonNull @NotNull VRangeSlider vRangeSlider) {
            zvf0.m220400v("e_advanced_filter_age", "p_advanced_filter_page", vwb.m200311Y("suggest_see_user_search_max_age", this.f36243a.getSearchMaxAge()), vwb.m200311Y("suggest_see_user_search_min_age", this.f36243a.getSearchMinAge()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$i */
    public class C8882i implements CompoundButton.OnCheckedChangeListener {
        public C8882i() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            NewUIAbFilterBaseSetting newUIAbFilterBaseSetting = NewUIAbFilterBaseSetting.this;
            if (z) {
                newUIAbFilterBaseSetting.m55542n0(newUIAbFilterBaseSetting.f36220q.getValue());
            } else {
                newUIAbFilterBaseSetting.f36220q.setValue(0.0f);
                NewUIAbFilterBaseSetting.this.m55542n0(0.0f);
            }
            NewUIAbFilterBaseSetting newUIAbFilterBaseSetting2 = NewUIAbFilterBaseSetting.this;
            if (z) {
                newUIAbFilterBaseSetting2.m55538Q0();
            } else {
                newUIAbFilterBaseSetting2.m55544s0();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$j */
    public class C8883j implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f36246a;

        public C8883j(int i) {
            this.f36246a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) NewUIAbFilterBaseSetting.this.f36218o.getLayoutParams();
            int i = this.f36246a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            NewUIAbFilterBaseSetting.this.m55543p0((int) (i * fFloatValue));
            NewUIAbFilterBaseSetting.this.f36218o.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$k */
    public class C8884k implements Animator.AnimatorListener {
        public C8884k() {
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
    public class C8885l implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f36249a;

        public C8885l(int i) {
            this.f36249a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) NewUIAbFilterBaseSetting.this.f36218o.getLayoutParams();
            int i = this.f36249a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            NewUIAbFilterBaseSetting.this.m55543p0((int) (i * fFloatValue));
            NewUIAbFilterBaseSetting.this.f36218o.setLayoutParams(marginLayoutParams);
        }
    }

    public NewUIAbFilterBaseSetting(Context context) {
        super(context);
        this.f36228y = new ArrayList();
        this.f36202G = false;
        this.f36205J = new Runnable() { // from class: l.lb40
            @Override // java.lang.Runnable
            public final void run() {
                this.f127273a.m55498G0();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m55496A0(View view) {
        m55528y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m55497E0(View view) {
        yij0.m214942T(this.f36217n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m55498G0() {
        String str;
        int iIntValue = this.f36196A.getSearchInvisibleRadius().intValue();
        String string = this.f36199D.getString(R$string.f27824b2);
        String string2 = this.f36199D.getString(R$string.f27842e2);
        if (iIntValue == 0) {
            str = "";
        } else if (iIntValue < 1000) {
            str = "<" + iIntValue + string2;
        } else if (iIntValue % 1000 == 0) {
            str = "<" + (iIntValue / 1000) + string;
        } else {
            str = "<" + String.format("%.1f", Double.valueOf(((double) iIntValue) / 1000.0d)) + string;
        }
        this.f36219p.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public /* synthetic */ void m55499N0(View view) {
        CoreModule.f17557o.m195057d().mo33738Pa(getContext());
    }

    /* JADX INFO: renamed from: P0 */
    private void m55501P0() {
        C4345a c4345a = new C4345a(this.f36216m.getContext());
        c4345a.m20847B(t100.m186890d(2.0f)).m20849D("离线期间有" + (this.f36196A.getSearchRadius().intValue() / 1000) + "km外的人喜欢了你，已为你自动扩大距离").m20870k(CoreModule.f17544b.getResources().getColor(c1c0.f78249f)).m20871l(t100.m186890d(7.0f)).m20874p(75).m20855J(13.0f).m20854I(228).m20881w(t100.m186890d(6.0f)).m20882x(t100.m186890d(6.0f)).m20848C(10).m20861b(3000L).m20883y(true).m20875q(C4345a.f15680N);
        C4348d.m20896l().m20909u(c4345a, this.f36216m.getRightView(), "boost_auto_distance");
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m55502Q(View view) {
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ LabelData m55503R(IdealTag idealTag) {
        LabelData labelData = new LabelData();
        labelData.name = idealTag.name;
        return labelData;
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ String m55506V(Act act, float f) {
        return String.valueOf(((int) f) + 1) + act.getString(R$string.f27824b2);
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ boolean m55512b0(int i, int i2, Intent intent) {
        CoreModule.f17545c.f19639e0.f149388h7 = false;
        return false;
    }

    /* JADX INFO: renamed from: k0 */
    private void m55520k0(VListCell vListCell) {
        ImageView imageView = (ImageView) vListCell.findViewById(a5c0.f67698u);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = t100.m186890d(24.0f);
        layoutParams.width = t100.m186890d(24.0f);
    }

    /* JADX INFO: renamed from: m0 */
    private void m55521m0() {
        if (NullChecker.m81303a(this.f36200E) && this.f36200E.isRunning()) {
            this.f36200E.cancel();
        }
        if (NullChecker.m81303a(this.f36201F) && this.f36201F.isRunning()) {
            this.f36201F.cancel();
        }
    }

    /* JADX INFO: renamed from: o0 */
    private boolean m55522o0() {
        boolean zM215137i = yki0.m215127b().m215137i();
        CoreModule.f17545c.f19702z0.f106529V.put(Boolean.valueOf(zM215137i));
        return zM215137i;
    }

    /* JADX INFO: renamed from: q0 */
    private int m55523q0(LookingFor lookingFor) {
        if (TEnum.equals(lookingFor, "male")) {
            return 0;
        }
        return TEnum.equals(lookingFor, "female") ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public LookingFor m55524r0(int i) {
        if (i == 0) {
            return LookingFor.get("male");
        }
        return i == 1 ? LookingFor.get("female") : LookingFor.get("both");
    }

    private void setGenderChoose(LookingFor lookingFor) {
        this.f36229z.m127951o(qne0.f155427g[m55523q0(lookingFor)]);
    }

    /* JADX INFO: renamed from: v0 */
    private void m55525v0() {
        ba40 ba40Var = new ba40();
        this.f36229z = ba40Var;
        ba40Var.m127950n(new C8877d());
        this.f36223t.setCanAdjustChildHeight(false);
        this.f36223t.setIsSquare(true);
        this.f36223t.setAdapter(this.f36229z);
        this.f36229z.m100895r(Arrays.asList(qne0.f155427g));
        this.f36229z.m127948l();
    }

    /* JADX INFO: renamed from: w0 */
    private void m55526w0() {
        xdl0.m208344M(this.f36206c, false);
        if (yki0.m215127b().m215135g()) {
            OMSThemeInfo oMSThemeInfoM215130a = yki0.m215127b().m215130a();
            if (!NullChecker.m81303a(oMSThemeInfoM215130a) || oMSThemeInfoM215130a.settingTxt.isEmpty()) {
                return;
            }
            xdl0.m208344M(this.f36206c, true);
            yij0.m214964t(this.f36206c, m55522o0());
            zvf0.m220368A("e_advanced_filter_theme", "p_advanced_filter_page", vwb.m200311Y("theme_status", yij0.m214965u(this.f36206c) ? "open" : "close"));
            this.f36206c.setTitle(oMSThemeInfoM215130a.settingTxt);
            this.f36206c.setOnClickListener(new View.OnClickListener() { // from class: l.kb40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f122198a.m55530D0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x0 */
    private void m55527x0() {
        m55520k0(this.f36216m);
        if (CoreModule.m29935P().m94656g().mo35084xj()) {
            this.f36198C = (TextView) this.f36225v.findViewById(a5c0.f67678c0);
            xdl0.m208344M(this.f36217n, false);
            xdl0.m208344M(this.f36218o, false);
            return;
        }
        this.f36197B = this.f36211h;
        this.f36198C = (TextView) this.f36225v.findViewById(a5c0.f67678c0);
        m55520k0(this.f36217n);
        if (CoreModule.m29935P().m94651a().mo33406Sk()) {
            this.f36217n.setTitle("不被附近的人发现");
            xdl0.m208344M(this.f36221r, true);
            xdl0.m208344M(this.f36222s, true);
        }
        xdl0.m208329E0(this.f36217n, new View.OnClickListener() { // from class: l.db40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85293a.m55497E0(view);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    private void m55528y0() {
        zvf0.m220396r("e_ideal_type_entrance", "p_advanced_filter_page");
        CoreModule.f17545c.f19639e0.f149388h7 = true;
        Act act = this.f36199D;
        act.startActivityForResult(MkWebViewAct.m80240e2(act, "", pj90.f149728p, true, true, true, true, null), new C4317a.a() { // from class: l.rb40
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return NewUIAbFilterBaseSetting.m55512b0(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m55529B0(View view) {
        m55528y0();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m55530D0(View view) {
        if (!Network.isConnected(CoreModule.f17544b)) {
            lsi0.m151584n(R$string.f27716G0);
        } else {
            zvf0.m220399u("e_advanced_filter_theme", "p_advanced_filter_page", vwb.m200311Y("theme_status", yij0.m214965u(this.f36206c) ? "close" : "open"));
            yij0.m214942T(this.f36206c);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m55531H0(Act act, Settings settings) {
        String strConcat;
        if (IntlCountryCodeController.m28110f()) {
            String str = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + act.getString(R$string.f27848f2);
            double dM133844K = i0g0.m133844K(settings.getSearchRadius().intValue());
            if (dM133844K >= 59.0d && settings.getSearchRadius().intValue() < settings.getRadiusAllowedMaximum().intValue()) {
                strConcat = "59".concat(str);
            } else if (settings.getSearchRadius().intValue() >= settings.getRadiusAllowedMaximum().intValue()) {
                strConcat = "60" + str + Marker.ANY_NON_NULL_MARKER;
            } else if (settings.getSearchRadius().intValue() <= settings.getRadiusAllowedMinimum().intValue()) {
                strConcat = "<1 " + act.getString(R$string.f27854g2);
            } else {
                strConcat = mqa.f135201a.format(dM133844K) + str;
            }
        } else {
            int iIntValue = settings.getSearchRadius().intValue() / 1000;
            Integer radiusAllowedMaximum = settings.getRadiusAllowedMaximum();
            String string = act.getString(R$string.f27824b2);
            if (!NullChecker.m81304b(radiusAllowedMaximum) || iIntValue < radiusAllowedMaximum.intValue() / 1000) {
                Integer radiusAllowedMinimum = settings.getRadiusAllowedMinimum();
                if (!NullChecker.m81304b(radiusAllowedMinimum) || iIntValue > radiusAllowedMinimum.intValue() / 1000) {
                    strConcat = Integer.toString(iIntValue) + string;
                } else {
                    strConcat = "<" + (radiusAllowedMinimum.intValue() / 1000) + string;
                }
            } else {
                strConcat = (radiusAllowedMaximum.intValue() / 1000) + string + Marker.ANY_NON_NULL_MARKER;
            }
        }
        this.f36214k.setText(strConcat);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m55532I0(Settings settings) {
        settings.getSettingGroup().privacy.hideContacts = Boolean.valueOf(yij0.m214942T(this.f36222s));
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m55533J0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        yij0.m214964t(this.f36222s, false);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m55534K0(final Settings settings, Act act, View view) {
        if (!yij0.m214965u(this.f36222s)) {
            PermissionHelper.m79882c().m79900r("android.permission.READ_CONTACTS").m79905w(false).m79903u(false).m79895m(new d30() { // from class: l.ib40
                @Override // p149l.d30
                public final void call() {
                    this.f112347a.m55532I0(settings);
                }
            }, new e30() { // from class: l.jb40
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f117161a.m55533J0((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m79891i(act);
        } else {
            settings.getSettingGroup().privacy.hideContacts = Boolean.valueOf(yij0.m214942T(this.f36222s));
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m55535L0(Settings settings, View view) {
        zvf0.m220400v("e_advanced_filter_larger_distance", "p_advanced_filter_page", vwb.m200311Y("suggest_see_user_search_auto_radius", Boolean.valueOf(!yij0.m214965u(this.f36216m))));
        settings.getSettingGroup().search.autoAdjustRadius = Boolean.valueOf(yij0.m214942T(this.f36216m));
        CoreModule.f17545c.f19639e0.f149477t5.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m55536M0(Settings settings) {
        TextView textView = this.f36197B;
        StringBuilder sb = new StringBuilder();
        sb.append(settings.getSearchMinAge());
        sb.append(" - ");
        sb.append(settings.getSearchMaxAge());
        sb.append(settings.getSearchMaxAge().equals(settings.getSearchAgeAllowedMaximum()) ? Marker.ANY_NON_NULL_MARKER : "");
        textView.setText(sb.toString());
    }

    /* JADX INFO: renamed from: O0 */
    public void m55537O0(final Act act, final Settings settings, String str) {
        boolean z;
        this.f36199D = act;
        this.f36196A = settings;
        this.f36197B = this.f36211h;
        Runnable runnable = new Runnable() { // from class: l.sb40
            @Override // java.lang.Runnable
            public final void run() {
                this.f163500a.m55531H0(act, settings);
            }
        };
        runnable.run();
        this.f36205J.run();
        if (CoreModule.m29935P().m94651a().mo33406Sk()) {
            yij0.m214964t(this.f36222s, settings.hideContacts().booleanValue());
            this.f36222s.setOnClickListener(new View.OnClickListener() { // from class: l.tb40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f169219a.m55534K0(settings, act, view);
                }
            });
        }
        this.f36215l.setValueTo((settings.getRadiusAllowedMaximum().intValue() - settings.getRadiusAllowedMinimum().intValue()) / 1000);
        int iIntValue = (settings.getSearchRadius().intValue() - settings.getRadiusAllowedMinimum().intValue()) / 1000;
        float f = iIntValue;
        if (f == this.f36215l.getValue()) {
            this.f36215l.setValue(iIntValue + 1);
        }
        this.f36215l.setValue(f);
        this.f36215l.setLabelFormatter(new iqk0() { // from class: l.eb40
            @Override // p149l.iqk0
            /* JADX INFO: renamed from: a */
            public final String mo55415a(float f2) {
                return NewUIAbFilterBaseSetting.m55506V(act, f2);
            }
        });
        this.f36215l.mo222965f(new C8878e(settings, runnable));
        this.f36215l.mo222967g(new C8879f(settings));
        m55526w0();
        boolean zBooleanValue = settings.autoAdjustSuggestRadius().booleanValue();
        yij0.m214964t(this.f36216m, zBooleanValue);
        this.f36216m.setOnClickListener(new View.OnClickListener() { // from class: l.fb40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96694a.m55535L0(settings, view);
            }
        });
        if (TextUtils.equals(str, ip20.f114252n)) {
            if (!zBooleanValue) {
                this.f36216m.performClick();
            }
            m55501P0();
        }
        Runnable runnable2 = new Runnable() { // from class: l.gb40
            @Override // java.lang.Runnable
            public final void run() {
                this.f101806a.m55536M0(settings);
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
        this.f36212i.setValueFrom(fIntValue);
        this.f36212i.setValueTo(fIntValue2);
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
            au2.m98935w(new IllegalStateException("wrong age ranges(from advanced filter), uid:" + CoreModule.m29931H().userId() + "; allowedMinimum:" + fIntValue + "; allowedMaximum:" + fIntValue2 + " searchMinAge:" + fMax + "; searchMaxAge:" + fIntValue4));
        }
        this.f36212i.setValues(Float.valueOf(fMax), Float.valueOf(fIntValue4));
        this.f36212i.mo222965f(new C8880g(settings, runnable2));
        this.f36212i.mo222967g(new C8881h(settings));
        m55546u0(act, settings);
        setGenderChoose(settings.getLookingFor());
        this.f36225v.setOnClickListener(new View.OnClickListener() { // from class: l.hb40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106904a.m55499N0(view);
            }
        });
        boolean z2 = settings.getSearchInvisibleRadius().intValue() == 0;
        if (CoreModule.m29935P().m94656g().mo35084xj()) {
            return;
        }
        xdl0.m208344M(this.f36218o, !z2);
        this.f36217n.getSwitchButton().setChecked(!z2);
        this.f36217n.m55370d(new C8882i());
    }

    /* JADX INFO: renamed from: Q0 */
    public void m55538Q0() {
        m55521m0();
        this.f36200E = ValueAnimator.ofFloat(1.0f, 0.0f);
        int iM186890d = t100.m186890d(77.0f);
        this.f36200E.setDuration(400L);
        this.f36200E.addUpdateListener(new C8883j(iM186890d));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f36218o.getLayoutParams();
        marginLayoutParams.topMargin = -iM186890d;
        this.f36218o.setLayoutParams(marginLayoutParams);
        xdl0.m208344M(this.f36218o, true);
        this.f36200E.addListener(new C8884k());
        this.f36200E.start();
    }

    /* JADX INFO: renamed from: R0 */
    public void m55539R0(String str) {
        if (NullChecker.m81304b(this.f36198C)) {
            this.f36198C.setText(str);
        }
    }

    public View getLocationTitle() {
        return this.f36224u;
    }

    public List<IdealTag> getOriginIdealTag() {
        return this.f36204I;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m55540j0(View view) {
        ub40.m192815a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public void m55541l0(String str, String str2) {
        this.f36225v.setTitle(str);
        this.f36198C.setText(str2);
    }

    /* JADX INFO: renamed from: n0 */
    public void m55542n0(float f) {
        int i = (int) (f * 200.0f);
        this.f36196A.getSettingGroup().search.invisibleRadius = Integer.valueOf(i);
        this.f36205J.run();
        if (this.f36196A.getSearchRadius().intValue() < i) {
            if (i % 1000 != 0) {
                i = (i / 1000) * 1000;
            }
            this.f36215l.setValue(i / 1000);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55540j0(this);
        m55527x0();
        m55525v0();
        m55545t0(false);
    }

    /* JADX INFO: renamed from: p0 */
    public void m55543p0(int i) {
        this.f36218o.setOutlineProvider(new C8875b(i));
        this.f36218o.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: s0 */
    public void m55544s0() {
        m55521m0();
        this.f36201F = ValueAnimator.ofFloat(0.0f, 1.0f);
        int iM186890d = t100.m186890d(73.0f);
        this.f36201F.setDuration(400L);
        this.f36201F.addUpdateListener(new C8885l(iM186890d));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f36218o.getLayoutParams();
        marginLayoutParams.topMargin = 0;
        this.f36218o.setLayoutParams(marginLayoutParams);
        this.f36201F.addListener(new C8874a());
        this.f36201F.start();
    }

    public void setHiddenNearByView(HiddenNearByView hiddenNearByView) {
        this.f36203H = hiddenNearByView;
        hiddenNearByView.setHiddenNearByViewListener(new C8876c());
    }

    /* JADX INFO: renamed from: t0 */
    public void m55545t0(boolean z) {
        if (CoreModule.m29935P().m94651a().mo158376f4()) {
            xdl0.m208344M(this.f36207d, true);
            zvf0.m220402x("e_ideal_type_entrance", "p_advanced_filter_page");
            List<IdealTag> list = CoreModule.f17545c.f19639e0.m169527p9().profile.extensions.basic.ideal;
            if (!z) {
                this.f36204I = list;
            }
            boolean zM200296J = vwb.m200296J(list);
            VFrame vFrame = this.f36209f;
            if (zM200296J) {
                xdl0.m208344M(vFrame, true);
                xdl0.m208344M(this.f36210g, false);
                xdl0.m208344M(this.f36208e, false);
                xdl0.m208329E0(this.f36207d, new View.OnClickListener() { // from class: l.mb40
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NewUIAbFilterBaseSetting.m55502Q(view);
                    }
                });
                xdl0.m208329E0(this.f36209f, new View.OnClickListener() { // from class: l.nb40
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f138003a.m55547z0(view);
                    }
                });
                return;
            }
            xdl0.m208344M(vFrame, false);
            xdl0.m208344M(this.f36210g, true);
            xdl0.m208344M(this.f36208e, true);
            xdl0.m208329E0(this.f36207d, new View.OnClickListener() { // from class: l.ob40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f142886a.m55496A0(view);
                }
            });
            this.f36210g.setLabel(vwb.m200303Q(list, new w9j() { // from class: l.pb40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return NewUIAbFilterBaseSetting.m55503R((IdealTag) obj);
                }
            }));
            xdl0.m208329E0(this.f36210g, new View.OnClickListener() { // from class: l.qb40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f153617a.m55529B0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m55546u0(Act act, Settings settings) {
        this.f36226w.setVisibility(8);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m55547z0(View view) {
        m55528y0();
    }

    public NewUIAbFilterBaseSetting(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36228y = new ArrayList();
        this.f36202G = false;
        this.f36205J = new Runnable() { // from class: l.lb40
            @Override // java.lang.Runnable
            public final void run() {
                this.f127273a.m55498G0();
            }
        };
    }

    public NewUIAbFilterBaseSetting(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36228y = new ArrayList();
        this.f36202G = false;
        this.f36205J = new Runnable() { // from class: l.lb40
            @Override // java.lang.Runnable
            public final void run() {
                this.f127273a.m55498G0();
            }
        };
    }
}
