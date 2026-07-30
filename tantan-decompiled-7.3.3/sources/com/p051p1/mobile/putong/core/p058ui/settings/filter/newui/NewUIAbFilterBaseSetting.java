package com.p051p1.mobile.putong.core.p058ui.settings.filter.newui;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LabelData;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.NewUIAbFilterBaseSetting;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.tags.TagContainerLayout;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.core.view.CommonLabelShowView;
import com.p051p1.mobile.putong.data.IdealTag;
import com.p051p1.mobile.putong.data.LookingFor;
import com.p051p1.mobile.putong.data.OMSThemeInfo;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VListCell;
import p151v.VRangeSlider;
import p151v.VSlider;
import p151v.VText;
import p153l.bnl0;
import p153l.bsj0;
import p153l.cp50;
import p153l.gdc0;
import p153l.i4g0;
import p153l.ik40;
import p153l.j9c0;
import p153l.jyb;
import p153l.nrb0;
import p153l.o1j0;
import p153l.ozk0;
import p153l.pi40;
import p153l.q2i0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qcj;
import p153l.qu2;
import p153l.sx20;
import p153l.tr90;
import p153l.x20;
import p153l.xve0;
import p153l.y20;
import p153l.yra;
import p153l.yti0;

/* JADX INFO: loaded from: classes12.dex */
public class NewUIAbFilterBaseSetting extends VLinear {

    /* JADX INFO: renamed from: A */
    public Settings f37044A;

    /* JADX INFO: renamed from: B */
    public TextView f37045B;

    /* JADX INFO: renamed from: C */
    public TextView f37046C;

    /* JADX INFO: renamed from: D */
    public Act f37047D;

    /* JADX INFO: renamed from: E */
    public ValueAnimator f37048E;

    /* JADX INFO: renamed from: F */
    public ValueAnimator f37049F;

    /* JADX INFO: renamed from: G */
    public boolean f37050G;

    /* JADX INFO: renamed from: H */
    public HiddenNearByView f37051H;

    /* JADX INFO: renamed from: I */
    public List<IdealTag> f37052I;

    /* JADX INFO: renamed from: J */
    public Runnable f37053J;

    /* JADX INFO: renamed from: c */
    public VListCell f37054c;

    /* JADX INFO: renamed from: d */
    public VFrame f37055d;

    /* JADX INFO: renamed from: e */
    public ImageView f37056e;

    /* JADX INFO: renamed from: f */
    public VFrame f37057f;

    /* JADX INFO: renamed from: g */
    public CommonLabelShowView f37058g;

    /* JADX INFO: renamed from: h */
    public TextView f37059h;

    /* JADX INFO: renamed from: i */
    public VRangeSlider f37060i;

    /* JADX INFO: renamed from: j */
    public VText f37061j;

    /* JADX INFO: renamed from: k */
    public TextView f37062k;

    /* JADX INFO: renamed from: l */
    public VSlider f37063l;

    /* JADX INFO: renamed from: m */
    public VListCell f37064m;

    /* JADX INFO: renamed from: n */
    public FilterSwitchCell f37065n;

    /* JADX INFO: renamed from: o */
    public VFrame f37066o;

    /* JADX INFO: renamed from: p */
    public TextView f37067p;

    /* JADX INFO: renamed from: q */
    public VSlider f37068q;

    /* JADX INFO: renamed from: r */
    public VLinear f37069r;

    /* JADX INFO: renamed from: s */
    public VListCell f37070s;

    /* JADX INFO: renamed from: t */
    public TagContainerLayout f37071t;

    /* JADX INFO: renamed from: u */
    public VText f37072u;

    /* JADX INFO: renamed from: v */
    public VListCell f37073v;

    /* JADX INFO: renamed from: w */
    public VLinear f37074w;

    /* JADX INFO: renamed from: x */
    public VListCell f37075x;

    /* JADX INFO: renamed from: y */
    public List<q2i0> f37076y;

    /* JADX INFO: renamed from: z */
    public pi40 f37077z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$a */
    public class C9037a implements Animator.AnimatorListener {
        public C9037a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            bnl0.m105524M(NewUIAbFilterBaseSetting.this.f37066o, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$b */
    public class C9038b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f37079a;

        public C9038b(int i) {
            this.f37079a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(new Rect(0 - qa00.m175859d(10.0f), this.f37079a, view.getWidth() + qa00.m175859d(10.0f), view.getHeight()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$c */
    public class C9039c implements HiddenNearByView.InterfaceC9020g {
        public C9039c() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.HiddenNearByView.InterfaceC9020g
        /* JADX INFO: renamed from: a */
        public void mo56573a(int i) {
            NewUIAbFilterBaseSetting.this.f37063l.setValue(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$d */
    public class C9040d implements y20<NewFilterGenderItem> {
        public C9040d() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(NewFilterGenderItem newFilterGenderItem) {
            if (NullChecker.m82486a(newFilterGenderItem)) {
                int iIndexOfChild = NewUIAbFilterBaseSetting.this.f37071t.indexOfChild(newFilterGenderItem);
                if (!NullChecker.m82486a(NewUIAbFilterBaseSetting.this.f37044A) || jyb.m147479J(NewUIAbFilterBaseSetting.this.f37044A.settingGroups)) {
                    return;
                }
                NewUIAbFilterBaseSetting.this.f37044A.getSettingGroup().search.lookingForGender = NewUIAbFilterBaseSetting.this.m56707r0(iIndexOfChild);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$e */
    public class C9041e extends VSlider.AbstractC22683a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f37083a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f37084b;

        public C9041e(Settings settings, Runnable runnable) {
            this.f37083a = settings;
            this.f37084b = runnable;
        }

        @Override // p151v.VSlider.AbstractC22683a, p153l.cp50
        /* JADX INFO: renamed from: c */
        public void mo56599a(@NonNull @NotNull VSlider vSlider, boolean z, float f) {
            if (nrb0.m164467c() && !CoreModule.f18264c.f20381e0.f89334t5.get().booleanValue() && f < 20.0f && this.f37083a.autoAdjustSuggestRadius().booleanValue()) {
                bsj0.m106284t(NewUIAbFilterBaseSetting.this.f37064m, false);
                CoreModule.f18264c.f20381e0.f89334t5.put(Boolean.TRUE);
            }
            if (IntlCountryCodeController.m29109f()) {
                Settings settings = this.f37083a;
                if (f == 60.0f) {
                    settings.getSettingGroup().search.radius = this.f37083a.getRadiusAllowedMaximum();
                } else {
                    settings.getSettingGroup().search.radius = Integer.valueOf(this.f37083a.getRadiusAllowedMinimum().intValue() + Math.min(this.f37083a.getRadiusAllowedMaximum().intValue() - this.f37083a.getRadiusAllowedMinimum().intValue(), (int) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, q8g0.m175780L(f))));
                }
            } else {
                this.f37083a.getSettingGroup().search.radius = Integer.valueOf(this.f37083a.getRadiusAllowedMinimum().intValue() + Math.min(this.f37083a.getRadiusAllowedMaximum().intValue() - this.f37083a.getRadiusAllowedMinimum().intValue(), Math.max(0, ((int) f) * 1000)));
            }
            this.f37084b.run();
            super.mo56599a(vSlider, z, f);
        }

        @Override // p151v.VSlider.AbstractC22683a, p153l.cp50
        /* JADX INFO: renamed from: d */
        public void mo56600b(@NonNull @NotNull VSlider vSlider, boolean z, float f, float f2) {
            super.mo56600b(vSlider, z, f, f2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$f */
    public class C9042f implements VSlider.InterfaceC22684b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f37086a;

        public C9042f(Settings settings) {
            this.f37086a = settings;
        }

        @Override // p153l.dok0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo56667a(@NonNull @NotNull VSlider vSlider) {
        }

        @Override // p153l.dok0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo56668b(@NonNull @NotNull VSlider vSlider) {
            i4g0.m138524v("e_advanced_filter_distance", "p_advanced_filter_page", jyb.m147494Y("suggest_see_user_search_radius", this.f37086a.getSearchRadius()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$g */
    public class C9043g implements cp50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f37088a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f37089b;

        public C9043g(Settings settings, Runnable runnable) {
            this.f37088a = settings;
            this.f37089b = runnable;
        }

        @Override // p153l.cp50
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo56599a(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f) {
        }

        @Override // p153l.cp50
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo56600b(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f, float f2) {
            if (f < this.f37088a.getSearchAgeAllowedMinimum().intValue() || f2 < this.f37088a.getSearchAgeAllowedMinimum().intValue() || f > this.f37088a.getSearchAgeAllowedMaximum().intValue() || f2 > this.f37088a.getSearchAgeAllowedMaximum().intValue()) {
                return;
            }
            this.f37088a.getSettingGroup().search.minAge = Integer.valueOf((int) f);
            this.f37088a.getSettingGroup().search.maxAge = Integer.valueOf((int) f2);
            this.f37089b.run();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$h */
    public class C9044h implements VRangeSlider.InterfaceC22680a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f37091a;

        public C9044h(Settings settings) {
            this.f37091a = settings;
        }

        @Override // p153l.dok0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo56667a(@NonNull @NotNull VRangeSlider vRangeSlider) {
        }

        @Override // p153l.dok0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo56668b(@NonNull @NotNull VRangeSlider vRangeSlider) {
            i4g0.m138524v("e_advanced_filter_age", "p_advanced_filter_page", jyb.m147494Y("suggest_see_user_search_max_age", this.f37091a.getSearchMaxAge()), jyb.m147494Y("suggest_see_user_search_min_age", this.f37091a.getSearchMinAge()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$i */
    public class C9045i implements CompoundButton.OnCheckedChangeListener {
        public C9045i() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            NewUIAbFilterBaseSetting newUIAbFilterBaseSetting = NewUIAbFilterBaseSetting.this;
            if (z) {
                newUIAbFilterBaseSetting.m56725n0(newUIAbFilterBaseSetting.f37068q.getValue());
            } else {
                newUIAbFilterBaseSetting.f37068q.setValue(0.0f);
                NewUIAbFilterBaseSetting.this.m56725n0(0.0f);
            }
            NewUIAbFilterBaseSetting newUIAbFilterBaseSetting2 = NewUIAbFilterBaseSetting.this;
            if (z) {
                newUIAbFilterBaseSetting2.m56721Q0();
            } else {
                newUIAbFilterBaseSetting2.m56727s0();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$j */
    public class C9046j implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f37094a;

        public C9046j(int i) {
            this.f37094a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) NewUIAbFilterBaseSetting.this.f37066o.getLayoutParams();
            int i = this.f37094a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            NewUIAbFilterBaseSetting.this.m56726p0((int) (i * fFloatValue));
            NewUIAbFilterBaseSetting.this.f37066o.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewUIAbFilterBaseSetting$k */
    public class C9047k implements Animator.AnimatorListener {
        public C9047k() {
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
    public class C9048l implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f37097a;

        public C9048l(int i) {
            this.f37097a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) NewUIAbFilterBaseSetting.this.f37066o.getLayoutParams();
            int i = this.f37097a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            NewUIAbFilterBaseSetting.this.m56726p0((int) (i * fFloatValue));
            NewUIAbFilterBaseSetting.this.f37066o.setLayoutParams(marginLayoutParams);
        }
    }

    public NewUIAbFilterBaseSetting(Context context) {
        super(context);
        this.f37076y = new ArrayList();
        this.f37050G = false;
        this.f37053J = new Runnable() { // from class: l.zj40
            @Override // java.lang.Runnable
            public final void run() {
                this.f204641a.m56681G0();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m56679A0(View view) {
        m56711y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m56680E0(View view) {
        bsj0.m106262T(this.f37065n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m56681G0() {
        String str;
        int iIntValue = this.f37044A.getSearchInvisibleRadius().intValue();
        String string = this.f37047D.getString(R$string.f28672b2);
        String string2 = this.f37047D.getString(R$string.f28690e2);
        if (iIntValue == 0) {
            str = "";
        } else if (iIntValue < 1000) {
            str = "<" + iIntValue + string2;
        } else if (iIntValue % 1000 == 0) {
            str = "<" + (iIntValue / 1000) + string;
        } else {
            str = "<" + String.format("%.1f", Double.valueOf(((double) iIntValue) / 1000.0d)) + string;
        }
        this.f37067p.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public /* synthetic */ void m56682N0(View view) {
        CoreModule.f18276o.m132214d().mo34741Pa(getContext());
    }

    /* JADX INFO: renamed from: P0 */
    private void m56684P0() {
        C4496a c4496a = new C4496a(this.f37064m.getContext());
        c4496a.m21846B(qa00.m175859d(2.0f)).m21848D("离线期间有" + (this.f37044A.getSearchRadius().intValue() / 1000) + "km外的人喜欢了你，已为你自动扩大距离").m21869k(CoreModule.f18263b.getResources().getColor(j9c0.f118869f)).m21870l(qa00.m175859d(7.0f)).m21873p(75).m21854J(13.0f).m21853I(228).m21880w(qa00.m175859d(6.0f)).m21881x(qa00.m175859d(6.0f)).m21847C(10).m21860b(3000L).m21882y(true).m21874q(C4496a.f16399N);
        C4499d.m21895l().m21908u(c4496a, this.f37064m.getRightView(), "boost_auto_distance");
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m56685Q(View view) {
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ LabelData m56686R(IdealTag idealTag) {
        LabelData labelData = new LabelData();
        labelData.name = idealTag.name;
        return labelData;
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ String m56689V(Act act, float f) {
        return String.valueOf(((int) f) + 1) + act.getString(R$string.f28672b2);
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ boolean m56695b0(int i, int i2, Intent intent) {
        CoreModule.f18264c.f20381e0.f89245h7 = false;
        return false;
    }

    /* JADX INFO: renamed from: k0 */
    private void m56703k0(VListCell vListCell) {
        ImageView imageView = (ImageView) vListCell.findViewById(gdc0.f103693u);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = qa00.m175859d(24.0f);
        layoutParams.width = qa00.m175859d(24.0f);
    }

    /* JADX INFO: renamed from: m0 */
    private void m56704m0() {
        if (NullChecker.m82486a(this.f37048E) && this.f37048E.isRunning()) {
            this.f37048E.cancel();
        }
        if (NullChecker.m82486a(this.f37049F) && this.f37049F.isRunning()) {
            this.f37049F.cancel();
        }
    }

    /* JADX INFO: renamed from: o0 */
    private boolean m56705o0() {
        boolean zM217332i = yti0.m217322b().m217332i();
        CoreModule.f18264c.f20444z0.f178194V.put(Boolean.valueOf(zM217332i));
        return zM217332i;
    }

    /* JADX INFO: renamed from: q0 */
    private int m56706q0(LookingFor lookingFor) {
        if (TEnum.equals(lookingFor, "male")) {
            return 0;
        }
        return TEnum.equals(lookingFor, "female") ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public LookingFor m56707r0(int i) {
        if (i == 0) {
            return LookingFor.get("male");
        }
        return i == 1 ? LookingFor.get("female") : LookingFor.get("both");
    }

    private void setGenderChoose(LookingFor lookingFor) {
        this.f37077z.m165618o(xve0.f196391g[m56706q0(lookingFor)]);
    }

    /* JADX INFO: renamed from: v0 */
    private void m56708v0() {
        pi40 pi40Var = new pi40();
        this.f37077z = pi40Var;
        pi40Var.m165617n(new C9040d());
        this.f37071t.setCanAdjustChildHeight(false);
        this.f37071t.setIsSquare(true);
        this.f37071t.setAdapter(this.f37077z);
        this.f37077z.m172355r(Arrays.asList(xve0.f196391g));
        this.f37077z.m165615l();
    }

    /* JADX INFO: renamed from: w0 */
    private void m56709w0() {
        bnl0.m105524M(this.f37054c, false);
        if (yti0.m217322b().m217330g()) {
            OMSThemeInfo oMSThemeInfoM217325a = yti0.m217322b().m217325a();
            if (!NullChecker.m82486a(oMSThemeInfoM217325a) || oMSThemeInfoM217325a.settingTxt.isEmpty()) {
                return;
            }
            bnl0.m105524M(this.f37054c, true);
            bsj0.m106284t(this.f37054c, m56705o0());
            i4g0.m138492A("e_advanced_filter_theme", "p_advanced_filter_page", jyb.m147494Y("theme_status", bsj0.m106285u(this.f37054c) ? "open" : "close"));
            this.f37054c.setTitle(oMSThemeInfoM217325a.settingTxt);
            this.f37054c.setOnClickListener(new View.OnClickListener() { // from class: l.yj40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f200271a.m56713D0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x0 */
    private void m56710x0() {
        m56703k0(this.f37064m);
        if (CoreModule.m30933P().m143410g().mo36087xj()) {
            this.f37046C = (TextView) this.f37073v.findViewById(gdc0.f103673c0);
            bnl0.m105524M(this.f37065n, false);
            bnl0.m105524M(this.f37066o, false);
            return;
        }
        this.f37045B = this.f37059h;
        this.f37046C = (TextView) this.f37073v.findViewById(gdc0.f103673c0);
        m56703k0(this.f37065n);
        if (CoreModule.m30933P().m143405a().mo34409Sk()) {
            this.f37065n.setTitle("不被附近的人发现");
            bnl0.m105524M(this.f37069r, true);
            bnl0.m105524M(this.f37070s, true);
        }
        bnl0.m105509E0(this.f37065n, new View.OnClickListener() { // from class: l.rj40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163420a.m56680E0(view);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    private void m56711y0() {
        i4g0.m138520r("e_ideal_type_entrance", "p_advanced_filter_page");
        CoreModule.f18264c.f20381e0.f89245h7 = true;
        Act act = this.f37047D;
        act.startActivityForResult(MkWebViewAct.m81423g2(act, "", tr90.f175822p, true, true, true, true, null), new C4468a.a() { // from class: l.fk40
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return NewUIAbFilterBaseSetting.m56695b0(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m56712B0(View view) {
        m56711y0();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m56713D0(View view) {
        if (!Network.isConnected(CoreModule.f18263b)) {
            o1j0.m165640n(R$string.f28564G0);
        } else {
            i4g0.m138523u("e_advanced_filter_theme", "p_advanced_filter_page", jyb.m147494Y("theme_status", bsj0.m106285u(this.f37054c) ? "close" : "open"));
            bsj0.m106262T(this.f37054c);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m56714H0(Act act, Settings settings) {
        String strConcat;
        if (IntlCountryCodeController.m29109f()) {
            String str = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + act.getString(R$string.f28696f2);
            double dM175779K = q8g0.m175779K(settings.getSearchRadius().intValue());
            if (dM175779K >= 59.0d && settings.getSearchRadius().intValue() < settings.getRadiusAllowedMaximum().intValue()) {
                strConcat = "59".concat(str);
            } else if (settings.getSearchRadius().intValue() >= settings.getRadiusAllowedMaximum().intValue()) {
                strConcat = "60" + str + Marker.ANY_NON_NULL_MARKER;
            } else if (settings.getSearchRadius().intValue() <= settings.getRadiusAllowedMinimum().intValue()) {
                strConcat = "<1 " + act.getString(R$string.f28702g2);
            } else {
                strConcat = yra.f201299a.format(dM175779K) + str;
            }
        } else {
            int iIntValue = settings.getSearchRadius().intValue() / 1000;
            Integer radiusAllowedMaximum = settings.getRadiusAllowedMaximum();
            String string = act.getString(R$string.f28672b2);
            if (!NullChecker.m82487b(radiusAllowedMaximum) || iIntValue < radiusAllowedMaximum.intValue() / 1000) {
                Integer radiusAllowedMinimum = settings.getRadiusAllowedMinimum();
                if (!NullChecker.m82487b(radiusAllowedMinimum) || iIntValue > radiusAllowedMinimum.intValue() / 1000) {
                    strConcat = Integer.toString(iIntValue) + string;
                } else {
                    strConcat = "<" + (radiusAllowedMinimum.intValue() / 1000) + string;
                }
            } else {
                strConcat = (radiusAllowedMaximum.intValue() / 1000) + string + Marker.ANY_NON_NULL_MARKER;
            }
        }
        this.f37062k.setText(strConcat);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m56715I0(Settings settings) {
        settings.getSettingGroup().privacy.hideContacts = Boolean.valueOf(bsj0.m106262T(this.f37070s));
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m56716J0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        bsj0.m106284t(this.f37070s, false);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m56717K0(final Settings settings, Act act, View view) {
        if (!bsj0.m106285u(this.f37070s)) {
            PermissionHelper.m81065c().m81083r("android.permission.READ_CONTACTS").m81088w(false).m81086u(false).m81078m(new x20() { // from class: l.wj40
                @Override // p153l.x20
                public final void call() {
                    this.f189416a.m56715I0(settings);
                }
            }, new y20() { // from class: l.xj40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f194537a.m56716J0((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m81074i(act);
        } else {
            settings.getSettingGroup().privacy.hideContacts = Boolean.valueOf(bsj0.m106262T(this.f37070s));
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m56718L0(Settings settings, View view) {
        i4g0.m138524v("e_advanced_filter_larger_distance", "p_advanced_filter_page", jyb.m147494Y("suggest_see_user_search_auto_radius", Boolean.valueOf(!bsj0.m106285u(this.f37064m))));
        settings.getSettingGroup().search.autoAdjustRadius = Boolean.valueOf(bsj0.m106262T(this.f37064m));
        CoreModule.f18264c.f20381e0.f89334t5.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m56719M0(Settings settings) {
        TextView textView = this.f37045B;
        StringBuilder sb = new StringBuilder();
        sb.append(settings.getSearchMinAge());
        sb.append(" - ");
        sb.append(settings.getSearchMaxAge());
        sb.append(settings.getSearchMaxAge().equals(settings.getSearchAgeAllowedMaximum()) ? Marker.ANY_NON_NULL_MARKER : "");
        textView.setText(sb.toString());
    }

    /* JADX INFO: renamed from: O0 */
    public void m56720O0(final Act act, final Settings settings, String str) {
        boolean z;
        this.f37047D = act;
        this.f37044A = settings;
        this.f37045B = this.f37059h;
        Runnable runnable = new Runnable() { // from class: l.gk40
            @Override // java.lang.Runnable
            public final void run() {
                this.f104704a.m56714H0(act, settings);
            }
        };
        runnable.run();
        this.f37053J.run();
        if (CoreModule.m30933P().m143405a().mo34409Sk()) {
            bsj0.m106284t(this.f37070s, settings.hideContacts().booleanValue());
            this.f37070s.setOnClickListener(new View.OnClickListener() { // from class: l.hk40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f110376a.m56717K0(settings, act, view);
                }
            });
        }
        this.f37063l.setValueTo((settings.getRadiusAllowedMaximum().intValue() - settings.getRadiusAllowedMinimum().intValue()) / 1000);
        int iIntValue = (settings.getSearchRadius().intValue() - settings.getRadiusAllowedMinimum().intValue()) / 1000;
        float f = iIntValue;
        if (f == this.f37063l.getValue()) {
            this.f37063l.setValue(iIntValue + 1);
        }
        this.f37063l.setValue(f);
        this.f37063l.setLabelFormatter(new ozk0() { // from class: l.sj40
            @Override // p153l.ozk0
            /* JADX INFO: renamed from: a */
            public final String mo56598a(float f2) {
                return NewUIAbFilterBaseSetting.m56689V(act, f2);
            }
        });
        this.f37063l.mo224211f(new C9041e(settings, runnable));
        this.f37063l.mo224213g(new C9042f(settings));
        m56709w0();
        boolean zBooleanValue = settings.autoAdjustSuggestRadius().booleanValue();
        bsj0.m106284t(this.f37064m, zBooleanValue);
        this.f37064m.setOnClickListener(new View.OnClickListener() { // from class: l.tj40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174564a.m56718L0(settings, view);
            }
        });
        if (TextUtils.equals(str, sx20.f171069n)) {
            if (!zBooleanValue) {
                this.f37064m.performClick();
            }
            m56684P0();
        }
        Runnable runnable2 = new Runnable() { // from class: l.uj40
            @Override // java.lang.Runnable
            public final void run() {
                this.f179179a.m56719M0(settings);
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
        this.f37060i.setValueFrom(fIntValue);
        this.f37060i.setValueTo(fIntValue2);
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
            qu2.m178128w(new IllegalStateException("wrong age ranges(from advanced filter), uid:" + CoreModule.m30929H().userId() + "; allowedMinimum:" + fIntValue + "; allowedMaximum:" + fIntValue2 + " searchMinAge:" + fMax + "; searchMaxAge:" + fIntValue4));
        }
        this.f37060i.setValues(Float.valueOf(fMax), Float.valueOf(fIntValue4));
        this.f37060i.mo224211f(new C9043g(settings, runnable2));
        this.f37060i.mo224213g(new C9044h(settings));
        m56729u0(act, settings);
        setGenderChoose(settings.getLookingFor());
        this.f37073v.setOnClickListener(new View.OnClickListener() { // from class: l.vj40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184353a.m56682N0(view);
            }
        });
        boolean z2 = settings.getSearchInvisibleRadius().intValue() == 0;
        if (CoreModule.m30933P().m143410g().mo36087xj()) {
            return;
        }
        bnl0.m105524M(this.f37066o, !z2);
        this.f37065n.getSwitchButton().setChecked(!z2);
        this.f37065n.m56553d(new C9045i());
    }

    /* JADX INFO: renamed from: Q0 */
    public void m56721Q0() {
        m56704m0();
        this.f37048E = ValueAnimator.ofFloat(1.0f, 0.0f);
        int iM175859d = qa00.m175859d(77.0f);
        this.f37048E.setDuration(400L);
        this.f37048E.addUpdateListener(new C9046j(iM175859d));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f37066o.getLayoutParams();
        marginLayoutParams.topMargin = -iM175859d;
        this.f37066o.setLayoutParams(marginLayoutParams);
        bnl0.m105524M(this.f37066o, true);
        this.f37048E.addListener(new C9047k());
        this.f37048E.start();
    }

    /* JADX INFO: renamed from: R0 */
    public void m56722R0(String str) {
        if (NullChecker.m82487b(this.f37046C)) {
            this.f37046C.setText(str);
        }
    }

    public View getLocationTitle() {
        return this.f37072u;
    }

    public List<IdealTag> getOriginIdealTag() {
        return this.f37052I;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m56723j0(View view) {
        ik40.m140268a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public void m56724l0(String str, String str2) {
        this.f37073v.setTitle(str);
        this.f37046C.setText(str2);
    }

    /* JADX INFO: renamed from: n0 */
    public void m56725n0(float f) {
        int i = (int) (f * 200.0f);
        this.f37044A.getSettingGroup().search.invisibleRadius = Integer.valueOf(i);
        this.f37053J.run();
        if (this.f37044A.getSearchRadius().intValue() < i) {
            if (i % 1000 != 0) {
                i = (i / 1000) * 1000;
            }
            this.f37063l.setValue(i / 1000);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56723j0(this);
        m56710x0();
        m56708v0();
        m56728t0(false);
    }

    /* JADX INFO: renamed from: p0 */
    public void m56726p0(int i) {
        this.f37066o.setOutlineProvider(new C9038b(i));
        this.f37066o.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: s0 */
    public void m56727s0() {
        m56704m0();
        this.f37049F = ValueAnimator.ofFloat(0.0f, 1.0f);
        int iM175859d = qa00.m175859d(73.0f);
        this.f37049F.setDuration(400L);
        this.f37049F.addUpdateListener(new C9048l(iM175859d));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f37066o.getLayoutParams();
        marginLayoutParams.topMargin = 0;
        this.f37066o.setLayoutParams(marginLayoutParams);
        this.f37049F.addListener(new C9037a());
        this.f37049F.start();
    }

    public void setHiddenNearByView(HiddenNearByView hiddenNearByView) {
        this.f37051H = hiddenNearByView;
        hiddenNearByView.setHiddenNearByViewListener(new C9039c());
    }

    /* JADX INFO: renamed from: t0 */
    public void m56728t0(boolean z) {
        if (CoreModule.m30933P().m143405a().mo180468f4()) {
            bnl0.m105524M(this.f37055d, true);
            i4g0.m138526x("e_ideal_type_entrance", "p_advanced_filter_page");
            List<IdealTag> list = CoreModule.f18264c.f20381e0.m116600p9().profile.extensions.basic.ideal;
            if (!z) {
                this.f37052I = list;
            }
            boolean zM147479J = jyb.m147479J(list);
            VFrame vFrame = this.f37057f;
            if (zM147479J) {
                bnl0.m105524M(vFrame, true);
                bnl0.m105524M(this.f37058g, false);
                bnl0.m105524M(this.f37056e, false);
                bnl0.m105509E0(this.f37055d, new View.OnClickListener() { // from class: l.ak40
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NewUIAbFilterBaseSetting.m56685Q(view);
                    }
                });
                bnl0.m105509E0(this.f37057f, new View.OnClickListener() { // from class: l.bk40
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f77045a.m56730z0(view);
                    }
                });
                return;
            }
            bnl0.m105524M(vFrame, false);
            bnl0.m105524M(this.f37058g, true);
            bnl0.m105524M(this.f37056e, true);
            bnl0.m105509E0(this.f37055d, new View.OnClickListener() { // from class: l.ck40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f82264a.m56679A0(view);
                }
            });
            this.f37058g.setLabel(jyb.m147486Q(list, new qcj() { // from class: l.dk40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return NewUIAbFilterBaseSetting.m56686R((IdealTag) obj);
                }
            }));
            bnl0.m105509E0(this.f37058g, new View.OnClickListener() { // from class: l.ek40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f94342a.m56712B0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m56729u0(Act act, Settings settings) {
        this.f37074w.setVisibility(8);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m56730z0(View view) {
        m56711y0();
    }

    public NewUIAbFilterBaseSetting(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37076y = new ArrayList();
        this.f37050G = false;
        this.f37053J = new Runnable() { // from class: l.zj40
            @Override // java.lang.Runnable
            public final void run() {
                this.f204641a.m56681G0();
            }
        };
    }

    public NewUIAbFilterBaseSetting(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37076y = new ArrayList();
        this.f37050G = false;
        this.f37053J = new Runnable() { // from class: l.zj40
            @Override // java.lang.Runnable
            public final void run() {
                this.f204641a.m56681G0();
            }
        };
    }
}
