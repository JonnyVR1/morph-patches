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
import android.widget.FrameLayout;
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
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.NewFilterBaseSetting;
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
import p153l.j9c0;
import p153l.jyb;
import p153l.nrb0;
import p153l.o1j0;
import p153l.ozk0;
import p153l.pi40;
import p153l.px20;
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
public class NewFilterBaseSetting extends VLinear {

    /* JADX INFO: renamed from: A */
    public View f36970A;

    /* JADX INFO: renamed from: B */
    public VText f36971B;

    /* JADX INFO: renamed from: C */
    public VListCell f36972C;

    /* JADX INFO: renamed from: D */
    public List<q2i0> f36973D;

    /* JADX INFO: renamed from: E */
    public pi40 f36974E;

    /* JADX INFO: renamed from: F */
    public Settings f36975F;

    /* JADX INFO: renamed from: G */
    public TextView f36976G;

    /* JADX INFO: renamed from: H */
    public TextView f36977H;

    /* JADX INFO: renamed from: I */
    public Act f36978I;

    /* JADX INFO: renamed from: J */
    public ValueAnimator f36979J;

    /* JADX INFO: renamed from: K */
    public ValueAnimator f36980K;

    /* JADX INFO: renamed from: L */
    public boolean f36981L;

    /* JADX INFO: renamed from: M */
    public HiddenNearByView f36982M;

    /* JADX INFO: renamed from: N */
    public List<IdealTag> f36983N;

    /* JADX INFO: renamed from: O */
    public Runnable f36984O;

    /* JADX INFO: renamed from: c */
    public VListCell f36985c;

    /* JADX INFO: renamed from: d */
    public VFrame f36986d;

    /* JADX INFO: renamed from: e */
    public ImageView f36987e;

    /* JADX INFO: renamed from: f */
    public VFrame f36988f;

    /* JADX INFO: renamed from: g */
    public CommonLabelShowView f36989g;

    /* JADX INFO: renamed from: h */
    public TextView f36990h;

    /* JADX INFO: renamed from: i */
    public VRangeSlider f36991i;

    /* JADX INFO: renamed from: j */
    public VText f36992j;

    /* JADX INFO: renamed from: k */
    public TextView f36993k;

    /* JADX INFO: renamed from: l */
    public VSlider f36994l;

    /* JADX INFO: renamed from: m */
    public VListCell f36995m;

    /* JADX INFO: renamed from: n */
    public FilterSwitchCell f36996n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f36997o;

    /* JADX INFO: renamed from: p */
    public TextView f36998p;

    /* JADX INFO: renamed from: q */
    public VSlider f36999q;

    /* JADX INFO: renamed from: r */
    public VLinear f37000r;

    /* JADX INFO: renamed from: s */
    public VListCell f37001s;

    /* JADX INFO: renamed from: t */
    public VLinear f37002t;

    /* JADX INFO: renamed from: u */
    public VText f37003u;

    /* JADX INFO: renamed from: v */
    public TagContainerLayout f37004v;

    /* JADX INFO: renamed from: w */
    public TagContainerLayout f37005w;

    /* JADX INFO: renamed from: x */
    public VText f37006x;

    /* JADX INFO: renamed from: y */
    public VListCell f37007y;

    /* JADX INFO: renamed from: z */
    public VListCell f37008z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$a */
    public class C9025a implements Animator.AnimatorListener {
        public C9025a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            bnl0.m105524M(NewFilterBaseSetting.this.f36997o, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$b */
    public class C9026b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f37010a;

        public C9026b(int i) {
            this.f37010a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(new Rect(0 - qa00.m175859d(10.0f), this.f37010a, view.getWidth() + qa00.m175859d(10.0f), view.getHeight()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$c */
    public class C9027c implements HiddenNearByView.InterfaceC9020g {
        public C9027c() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.HiddenNearByView.InterfaceC9020g
        /* JADX INFO: renamed from: a */
        public void mo56573a(int i) {
            NewFilterBaseSetting.this.f36994l.setValue(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$d */
    public class C9028d implements y20<NewFilterGenderItem> {
        public C9028d() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(NewFilterGenderItem newFilterGenderItem) {
            if (NullChecker.m82486a(newFilterGenderItem)) {
                int iIndexOfChild = NewFilterBaseSetting.this.f37005w.indexOfChild(newFilterGenderItem);
                if (!NullChecker.m82486a(NewFilterBaseSetting.this.f36975F) || jyb.m147479J(NewFilterBaseSetting.this.f36975F.settingGroups)) {
                    return;
                }
                NewFilterBaseSetting.this.f36975F.getSettingGroup().search.lookingForGender = NewFilterBaseSetting.this.m56638r0(iIndexOfChild);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$e */
    public class C9029e extends VSlider.AbstractC22683a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f37014a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f37015b;

        public C9029e(Settings settings, Runnable runnable) {
            this.f37014a = settings;
            this.f37015b = runnable;
        }

        @Override // p151v.VSlider.AbstractC22683a, p153l.cp50
        /* JADX INFO: renamed from: c */
        public void mo56599a(@NonNull @NotNull VSlider vSlider, boolean z, float f) {
            if (nrb0.m164467c() && !CoreModule.f18264c.f20381e0.f89334t5.get().booleanValue() && f < 20.0f && this.f37014a.autoAdjustSuggestRadius().booleanValue()) {
                bsj0.m106284t(NewFilterBaseSetting.this.f36995m, false);
                CoreModule.f18264c.f20381e0.f89334t5.put(Boolean.TRUE);
            }
            if (IntlCountryCodeController.m29109f()) {
                Settings settings = this.f37014a;
                if (f == 60.0f) {
                    settings.getSettingGroup().search.radius = this.f37014a.getRadiusAllowedMaximum();
                } else {
                    settings.getSettingGroup().search.radius = Integer.valueOf(this.f37014a.getRadiusAllowedMinimum().intValue() + Math.min(this.f37014a.getRadiusAllowedMaximum().intValue() - this.f37014a.getRadiusAllowedMinimum().intValue(), (int) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, q8g0.m175780L(f))));
                }
            } else {
                this.f37014a.getSettingGroup().search.radius = Integer.valueOf(this.f37014a.getRadiusAllowedMinimum().intValue() + Math.min(this.f37014a.getRadiusAllowedMaximum().intValue() - this.f37014a.getRadiusAllowedMinimum().intValue(), Math.max(0, ((int) f) * 1000)));
            }
            this.f37015b.run();
            super.mo56599a(vSlider, z, f);
        }

        @Override // p151v.VSlider.AbstractC22683a, p153l.cp50
        /* JADX INFO: renamed from: d */
        public void mo56600b(@NonNull @NotNull VSlider vSlider, boolean z, float f, float f2) {
            super.mo56600b(vSlider, z, f, f2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$f */
    public class C9030f implements VSlider.InterfaceC22684b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f37017a;

        public C9030f(Settings settings) {
            this.f37017a = settings;
        }

        @Override // p153l.dok0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo56667a(@NonNull @NotNull VSlider vSlider) {
        }

        @Override // p153l.dok0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo56668b(@NonNull @NotNull VSlider vSlider) {
            i4g0.m138524v("e_advanced_filter_distance", "p_advanced_filter_page", jyb.m147494Y("suggest_see_user_search_radius", this.f37017a.getSearchRadius()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$g */
    public class C9031g implements cp50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f37019a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f37020b;

        public C9031g(Settings settings, Runnable runnable) {
            this.f37019a = settings;
            this.f37020b = runnable;
        }

        @Override // p153l.cp50
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo56599a(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f) {
        }

        @Override // p153l.cp50
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo56600b(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f, float f2) {
            if (f < this.f37019a.getSearchAgeAllowedMinimum().intValue() || f2 < this.f37019a.getSearchAgeAllowedMinimum().intValue() || f > this.f37019a.getSearchAgeAllowedMaximum().intValue() || f2 > this.f37019a.getSearchAgeAllowedMaximum().intValue()) {
                return;
            }
            this.f37019a.getSettingGroup().search.minAge = Integer.valueOf((int) f);
            this.f37019a.getSettingGroup().search.maxAge = Integer.valueOf((int) f2);
            this.f37020b.run();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$h */
    public class C9032h implements VRangeSlider.InterfaceC22680a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f37022a;

        public C9032h(Settings settings) {
            this.f37022a = settings;
        }

        @Override // p153l.dok0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo56667a(@NonNull @NotNull VRangeSlider vRangeSlider) {
        }

        @Override // p153l.dok0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo56668b(@NonNull @NotNull VRangeSlider vRangeSlider) {
            i4g0.m138524v("e_advanced_filter_age", "p_advanced_filter_page", jyb.m147494Y("suggest_see_user_search_max_age", this.f37022a.getSearchMaxAge()), jyb.m147494Y("suggest_see_user_search_min_age", this.f37022a.getSearchMinAge()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$i */
    public class C9033i implements CompoundButton.OnCheckedChangeListener {
        public C9033i() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            NewFilterBaseSetting newFilterBaseSetting = NewFilterBaseSetting.this;
            if (z) {
                newFilterBaseSetting.m56658n0(newFilterBaseSetting.f36999q.getValue());
            } else {
                newFilterBaseSetting.f36999q.setValue(0.0f);
                NewFilterBaseSetting.this.m56658n0(0.0f);
            }
            NewFilterBaseSetting newFilterBaseSetting2 = NewFilterBaseSetting.this;
            if (z) {
                newFilterBaseSetting2.m56654Q0();
            } else {
                newFilterBaseSetting2.m56661s0();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$j */
    public class C9034j implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f37025a;

        public C9034j(int i) {
            this.f37025a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) NewFilterBaseSetting.this.f36997o.getLayoutParams();
            int i = this.f37025a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            NewFilterBaseSetting.this.m56660p0((int) (i * fFloatValue));
            NewFilterBaseSetting.this.f36997o.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$k */
    public class C9035k implements Animator.AnimatorListener {
        public C9035k() {
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

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$l */
    public class C9036l implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f37028a;

        public C9036l(int i) {
            this.f37028a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) NewFilterBaseSetting.this.f36997o.getLayoutParams();
            int i = this.f37028a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            NewFilterBaseSetting.this.m56660p0((int) (i * fFloatValue));
            NewFilterBaseSetting.this.f36997o.setLayoutParams(marginLayoutParams);
        }
    }

    public NewFilterBaseSetting(Context context) {
        super(context);
        this.f36973D = new ArrayList();
        this.f36981L = false;
        this.f36984O = new Runnable() { // from class: l.yw20
            @Override // java.lang.Runnable
            public final void run() {
                this.f201777a.m56645G0();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m56614E0(View view) {
        bsj0.m106262T(this.f36996n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public /* synthetic */ void m56615M0(View view) {
        CoreModule.f18276o.m132214d().mo34741Pa(getContext());
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m56620T(View view) {
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ LabelData m56621V(IdealTag idealTag) {
        LabelData labelData = new LabelData();
        labelData.name = idealTag.name;
        return labelData;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ boolean m56630e0(int i, int i2, Intent intent) {
        CoreModule.f18264c.f20381e0.f89245h7 = false;
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ String m56632g0(Act act, float f) {
        return String.valueOf(((int) f) + 1) + act.getString(R$string.f28672b2);
    }

    /* JADX INFO: renamed from: k0 */
    private void m56635k0(VListCell vListCell) {
        ImageView imageView = (ImageView) vListCell.findViewById(gdc0.f103693u);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = qa00.m175859d(24.0f);
        layoutParams.width = qa00.m175859d(24.0f);
    }

    /* JADX INFO: renamed from: m0 */
    private void m56636m0() {
        if (NullChecker.m82486a(this.f36979J) && this.f36979J.isRunning()) {
            this.f36979J.cancel();
        }
        if (NullChecker.m82486a(this.f36980K) && this.f36980K.isRunning()) {
            this.f36980K.cancel();
        }
    }

    /* JADX INFO: renamed from: q0 */
    private int m56637q0(LookingFor lookingFor) {
        if (TEnum.equals(lookingFor, "male")) {
            return 0;
        }
        return TEnum.equals(lookingFor, "female") ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public LookingFor m56638r0(int i) {
        if (i == 0) {
            return LookingFor.get("male");
        }
        return i == 1 ? LookingFor.get("female") : LookingFor.get("both");
    }

    private void setGenderChoose(LookingFor lookingFor) {
        this.f36974E.m165618o(xve0.f196390f[m56637q0(lookingFor)]);
    }

    /* JADX INFO: renamed from: v0 */
    private void m56639v0() {
        pi40 pi40Var = new pi40();
        this.f36974E = pi40Var;
        pi40Var.m165617n(new C9028d());
        this.f37005w.setCanAdjustChildHeight(false);
        this.f37005w.setIsSquare(true);
        this.f37005w.setAdapter(this.f36974E);
        this.f36974E.m172355r(Arrays.asList(xve0.f196390f));
        this.f36974E.m165615l();
    }

    /* JADX INFO: renamed from: x0 */
    private void m56640x0() {
        m56635k0(this.f36995m);
        if (!CoreModule.m30933P().m143410g().mo36087xj()) {
            this.f36976G = this.f36990h;
            this.f36977H = (TextView) this.f37007y.findViewById(gdc0.f103673c0);
            m56635k0(this.f36996n);
            if (CoreModule.m30933P().m143405a().mo34409Sk()) {
                this.f36996n.setTitle("不被附近的人发现");
                bnl0.m105524M(this.f37000r, true);
                bnl0.m105524M(this.f37001s, true);
            }
            bnl0.m105509E0(this.f36996n, new View.OnClickListener() { // from class: l.lx20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f133896a.m56614E0(view);
                }
            });
            return;
        }
        bnl0.m105524M(this.f36970A, true);
        bnl0.m105524M(this.f36971B, true);
        bnl0.m105524M(this.f36972C, true);
        bnl0.m105524M(this.f37007y, false);
        VListCell vListCell = this.f36972C;
        this.f37007y = vListCell;
        this.f36977H = (TextView) vListCell.findViewById(gdc0.f103673c0);
        bnl0.m105524M(this.f36996n, false);
        bnl0.m105524M(this.f36997o, false);
        bnl0.m105524M(this.f37006x, false);
        bnl0.m105524M(this.f37000r, true);
        bnl0.m105524M(this.f37001s, true);
    }

    /* JADX INFO: renamed from: y0 */
    private void m56641y0() {
        i4g0.m138520r("e_ideal_type_entrance", "p_advanced_filter_page");
        CoreModule.f18264c.f20381e0.f89245h7 = true;
        Act act = this.f36978I;
        act.startActivityForResult(MkWebViewAct.m81423g2(act, "", tr90.f175822p, true, true, true, true, null), new C4468a.a() { // from class: l.mx20
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return NewFilterBaseSetting.m56630e0(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m56642A0(View view) {
        m56641y0();
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m56643B0(View view) {
        m56641y0();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m56644D0(View view) {
        if (!Network.isConnected(CoreModule.f18263b)) {
            o1j0.m165640n(R$string.f28564G0);
        } else {
            i4g0.m138523u("e_advanced_filter_theme", "p_advanced_filter_page", jyb.m147494Y("theme_status", bsj0.m106285u(this.f36985c) ? "close" : "open"));
            bsj0.m106262T(this.f36985c);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m56645G0() {
        String str;
        int iIntValue = this.f36975F.getSearchInvisibleRadius().intValue();
        String string = this.f36978I.getString(R$string.f28672b2);
        String string2 = this.f36978I.getString(R$string.f28690e2);
        if (iIntValue == 0) {
            str = "";
        } else if (iIntValue < 1000) {
            str = "<" + iIntValue + string2;
        } else if (iIntValue % 1000 == 0) {
            str = "<" + (iIntValue / 1000) + string;
        } else {
            str = "<" + String.format("%.1f", Double.valueOf(((double) iIntValue) / 1000.0d)) + string;
        }
        this.f36998p.setText(str);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m56646H0(Settings settings) {
        settings.getSettingGroup().privacy.hideContacts = Boolean.valueOf(bsj0.m106262T(this.f37001s));
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m56647I0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        bsj0.m106284t(this.f37001s, false);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m56648J0(final Settings settings, Act act, View view) {
        if (!bsj0.m106285u(this.f37001s)) {
            PermissionHelper.m81065c().m81083r("android.permission.READ_CONTACTS").m81088w(false).m81086u(false).m81078m(new x20() { // from class: l.dx20
                @Override // p153l.x20
                public final void call() {
                    this.f91057a.m56646H0(settings);
                }
            }, new y20() { // from class: l.ex20
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f96228a.m56647I0((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m81074i(act);
        } else {
            settings.getSettingGroup().privacy.hideContacts = Boolean.valueOf(bsj0.m106262T(this.f37001s));
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m56649K0(Settings settings, View view) {
        i4g0.m138524v("e_advanced_filter_larger_distance", "p_advanced_filter_page", jyb.m147494Y("suggest_see_user_search_auto_radius", Boolean.valueOf(!bsj0.m106285u(this.f36995m))));
        settings.getSettingGroup().search.autoAdjustRadius = Boolean.valueOf(bsj0.m106262T(this.f36995m));
        CoreModule.f18264c.f20381e0.f89334t5.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m56650L0(Settings settings) {
        TextView textView = this.f36976G;
        StringBuilder sb = new StringBuilder();
        sb.append(settings.getSearchMinAge());
        sb.append(" - ");
        sb.append(settings.getSearchMaxAge());
        sb.append(settings.getSearchMaxAge().equals(settings.getSearchAgeAllowedMaximum()) ? Marker.ANY_NON_NULL_MARKER : "");
        textView.setText(sb.toString());
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m56651N0(Act act, Settings settings) {
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
        this.f36993k.setText(strConcat);
    }

    /* JADX INFO: renamed from: O0 */
    public void m56652O0(final Act act, final Settings settings, String str) {
        boolean z;
        this.f36978I = act;
        this.f36975F = settings;
        this.f36976G = this.f36990h;
        Runnable runnable = new Runnable() { // from class: l.nx20
            @Override // java.lang.Runnable
            public final void run() {
                this.f144063a.m56651N0(act, settings);
            }
        };
        runnable.run();
        this.f36984O.run();
        if (CoreModule.m30933P().m143405a().mo34409Sk()) {
            bsj0.m106284t(this.f37001s, settings.hideContacts().booleanValue());
            this.f37001s.setOnClickListener(new View.OnClickListener() { // from class: l.ox20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f149615a.m56648J0(settings, act, view);
                }
            });
        }
        this.f36994l.setValueTo((settings.getRadiusAllowedMaximum().intValue() - settings.getRadiusAllowedMinimum().intValue()) / 1000);
        int iIntValue = (settings.getSearchRadius().intValue() - settings.getRadiusAllowedMinimum().intValue()) / 1000;
        float f = iIntValue;
        if (f == this.f36994l.getValue()) {
            this.f36994l.setValue(iIntValue + 1);
        }
        this.f36994l.setValue(f);
        this.f36994l.setLabelFormatter(new ozk0() { // from class: l.zw20
            @Override // p153l.ozk0
            /* JADX INFO: renamed from: a */
            public final String mo56598a(float f2) {
                return NewFilterBaseSetting.m56632g0(act, f2);
            }
        });
        this.f36994l.mo224211f(new C9029e(settings, runnable));
        this.f36994l.mo224213g(new C9030f(settings));
        m56664w0();
        boolean zBooleanValue = settings.autoAdjustSuggestRadius().booleanValue();
        bsj0.m106284t(this.f36995m, zBooleanValue);
        this.f36995m.setOnClickListener(new View.OnClickListener() { // from class: l.ax20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73813a.m56649K0(settings, view);
            }
        });
        if (TextUtils.equals(str, sx20.f171069n)) {
            if (!zBooleanValue) {
                this.f36995m.performClick();
            }
            m56653P0();
        }
        Runnable runnable2 = new Runnable() { // from class: l.bx20
            @Override // java.lang.Runnable
            public final void run() {
                this.f78806a.m56650L0(settings);
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
        this.f36991i.setValueFrom(fIntValue);
        this.f36991i.setValueTo(fIntValue2);
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
        this.f36991i.setValues(Float.valueOf(fMax), Float.valueOf(fIntValue4));
        this.f36991i.mo224211f(new C9031g(settings, runnable2));
        this.f36991i.mo224213g(new C9032h(settings));
        m56663u0(act, settings);
        setGenderChoose(settings.getLookingFor());
        this.f37007y.setOnClickListener(new View.OnClickListener() { // from class: l.cx20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84168a.m56615M0(view);
            }
        });
        boolean z2 = settings.getSearchInvisibleRadius().intValue() == 0;
        if (CoreModule.m30933P().m143410g().mo36087xj()) {
            return;
        }
        bnl0.m105524M(this.f36997o, !z2);
        this.f36996n.getSwitchButton().setChecked(!z2);
        this.f36996n.m56553d(new C9033i());
    }

    /* JADX INFO: renamed from: P0 */
    public final void m56653P0() {
        C4496a c4496a = new C4496a(this.f36995m.getContext());
        c4496a.m21846B(qa00.m175859d(2.0f)).m21848D("离线期间有" + (this.f36975F.getSearchRadius().intValue() / 1000) + "km外的人喜欢了你，已为你自动扩大距离").m21869k(CoreModule.f18263b.getResources().getColor(j9c0.f118869f)).m21870l(qa00.m175859d(7.0f)).m21873p(75).m21854J(13.0f).m21853I(228).m21880w(qa00.m175859d(6.0f)).m21881x(qa00.m175859d(6.0f)).m21847C(10).m21860b(3000L).m21882y(true).m21874q(C4496a.f16399N);
        C4499d.m21895l().m21908u(c4496a, this.f36995m.getRightView(), "boost_auto_distance");
    }

    /* JADX INFO: renamed from: Q0 */
    public void m56654Q0() {
        m56636m0();
        this.f36979J = ValueAnimator.ofFloat(1.0f, 0.0f);
        int iM175859d = qa00.m175859d(77.0f);
        this.f36979J.setDuration(400L);
        this.f36979J.addUpdateListener(new C9034j(iM175859d));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f36997o.getLayoutParams();
        marginLayoutParams.topMargin = -iM175859d;
        this.f36997o.setLayoutParams(marginLayoutParams);
        bnl0.m105524M(this.f36997o, true);
        this.f36979J.addListener(new C9035k());
        this.f36979J.start();
    }

    /* JADX INFO: renamed from: R0 */
    public void m56655R0(String str) {
        if (NullChecker.m82487b(this.f36977H)) {
            this.f36977H.setText(str);
        }
    }

    public View getLocationTitle() {
        return CoreModule.m30933P().m143410g().mo36087xj() ? this.f36971B : this.f37006x;
    }

    public List<IdealTag> getOriginIdealTag() {
        return this.f36983N;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m56656j0(View view) {
        px20.m174104a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public void m56657l0(String str, String str2) {
        this.f37007y.setTitle(str);
        this.f36977H.setText(str2);
    }

    /* JADX INFO: renamed from: n0 */
    public void m56658n0(float f) {
        int i = (int) (f * 200.0f);
        this.f36975F.getSettingGroup().search.invisibleRadius = Integer.valueOf(i);
        this.f36984O.run();
        if (this.f36975F.getSearchRadius().intValue() < i) {
            if (i % 1000 != 0) {
                i = (i / 1000) * 1000;
            }
            this.f36994l.setValue(i / 1000);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m56659o0() {
        boolean zM217332i = yti0.m217322b().m217332i();
        CoreModule.f18264c.f20444z0.f178194V.put(Boolean.valueOf(zM217332i));
        return zM217332i;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56656j0(this);
        m56640x0();
        m56639v0();
        m56662t0(false);
    }

    /* JADX INFO: renamed from: p0 */
    public void m56660p0(int i) {
        this.f36997o.setOutlineProvider(new C9026b(i));
        this.f36997o.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: s0 */
    public void m56661s0() {
        m56636m0();
        this.f36980K = ValueAnimator.ofFloat(0.0f, 1.0f);
        int iM175859d = qa00.m175859d(73.0f);
        this.f36980K.setDuration(400L);
        this.f36980K.addUpdateListener(new C9036l(iM175859d));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f36997o.getLayoutParams();
        marginLayoutParams.topMargin = 0;
        this.f36997o.setLayoutParams(marginLayoutParams);
        this.f36980K.addListener(new C9025a());
        this.f36980K.start();
    }

    public void setHiddenNearByView(HiddenNearByView hiddenNearByView) {
        this.f36982M = hiddenNearByView;
        hiddenNearByView.setHiddenNearByViewListener(new C9027c());
    }

    /* JADX INFO: renamed from: t0 */
    public void m56662t0(boolean z) {
        if (CoreModule.m30933P().m143405a().mo180468f4()) {
            bnl0.m105524M(this.f36986d, true);
            i4g0.m138526x("e_ideal_type_entrance", "p_advanced_filter_page");
            List<IdealTag> list = CoreModule.f18264c.f20381e0.m116600p9().profile.extensions.basic.ideal;
            if (!z) {
                this.f36983N = list;
            }
            boolean zM147479J = jyb.m147479J(list);
            VFrame vFrame = this.f36988f;
            if (zM147479J) {
                bnl0.m105524M(vFrame, true);
                bnl0.m105524M(this.f36989g, false);
                bnl0.m105524M(this.f36987e, false);
                bnl0.m105509E0(this.f36986d, new View.OnClickListener() { // from class: l.gx20
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NewFilterBaseSetting.m56620T(view);
                    }
                });
                bnl0.m105509E0(this.f36988f, new View.OnClickListener() { // from class: l.hx20
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f111963a.m56665z0(view);
                    }
                });
                return;
            }
            bnl0.m105524M(vFrame, false);
            bnl0.m105524M(this.f36989g, true);
            bnl0.m105524M(this.f36987e, true);
            bnl0.m105509E0(this.f36986d, new View.OnClickListener() { // from class: l.ix20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f117308a.m56642A0(view);
                }
            });
            this.f36989g.setLabel(jyb.m147486Q(list, new qcj() { // from class: l.jx20
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return NewFilterBaseSetting.m56621V((IdealTag) obj);
                }
            }));
            bnl0.m105509E0(this.f36989g, new View.OnClickListener() { // from class: l.kx20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f129161a.m56643B0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m56663u0(Act act, Settings settings) {
        this.f37008z.setVisibility(8);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m56664w0() {
        bnl0.m105524M(this.f36985c, false);
        if (yti0.m217322b().m217330g()) {
            OMSThemeInfo oMSThemeInfoM217325a = yti0.m217322b().m217325a();
            if (!NullChecker.m82486a(oMSThemeInfoM217325a) || oMSThemeInfoM217325a.settingTxt.isEmpty()) {
                return;
            }
            bnl0.m105524M(this.f36985c, true);
            bsj0.m106284t(this.f36985c, m56659o0());
            i4g0.m138492A("e_advanced_filter_theme", "p_advanced_filter_page", jyb.m147494Y("theme_status", bsj0.m106285u(this.f36985c) ? "open" : "close"));
            this.f36985c.setTitle(oMSThemeInfoM217325a.settingTxt);
            this.f36985c.setOnClickListener(new View.OnClickListener() { // from class: l.fx20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f101232a.m56644D0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m56665z0(View view) {
        m56641y0();
    }

    public NewFilterBaseSetting(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36973D = new ArrayList();
        this.f36981L = false;
        this.f36984O = new Runnable() { // from class: l.yw20
            @Override // java.lang.Runnable
            public final void run() {
                this.f201777a.m56645G0();
            }
        };
    }

    public NewFilterBaseSetting(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36973D = new ArrayList();
        this.f36981L = false;
        this.f36984O = new Runnable() { // from class: l.yw20
            @Override // java.lang.Runnable
            public final void run() {
                this.f201777a.m56645G0();
            }
        };
    }
}
