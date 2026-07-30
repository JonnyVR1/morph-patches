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
import android.widget.FrameLayout;
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
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.NewFilterBaseSetting;
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
import p149l.fp20;
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
import p149l.vwb;
import p149l.w9j;
import p149l.wg50;
import p149l.xdl0;
import p149l.yij0;
import p149l.yki0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class NewFilterBaseSetting extends VLinear {

    /* JADX INFO: renamed from: A */
    public View f36122A;

    /* JADX INFO: renamed from: B */
    public VText f36123B;

    /* JADX INFO: renamed from: C */
    public VListCell f36124C;

    /* JADX INFO: renamed from: D */
    public List<iuh0> f36125D;

    /* JADX INFO: renamed from: E */
    public ba40 f36126E;

    /* JADX INFO: renamed from: F */
    public Settings f36127F;

    /* JADX INFO: renamed from: G */
    public TextView f36128G;

    /* JADX INFO: renamed from: H */
    public TextView f36129H;

    /* JADX INFO: renamed from: I */
    public Act f36130I;

    /* JADX INFO: renamed from: J */
    public ValueAnimator f36131J;

    /* JADX INFO: renamed from: K */
    public ValueAnimator f36132K;

    /* JADX INFO: renamed from: L */
    public boolean f36133L;

    /* JADX INFO: renamed from: M */
    public HiddenNearByView f36134M;

    /* JADX INFO: renamed from: N */
    public List<IdealTag> f36135N;

    /* JADX INFO: renamed from: O */
    public Runnable f36136O;

    /* JADX INFO: renamed from: c */
    public VListCell f36137c;

    /* JADX INFO: renamed from: d */
    public VFrame f36138d;

    /* JADX INFO: renamed from: e */
    public ImageView f36139e;

    /* JADX INFO: renamed from: f */
    public VFrame f36140f;

    /* JADX INFO: renamed from: g */
    public CommonLabelShowView f36141g;

    /* JADX INFO: renamed from: h */
    public TextView f36142h;

    /* JADX INFO: renamed from: i */
    public VRangeSlider f36143i;

    /* JADX INFO: renamed from: j */
    public VText f36144j;

    /* JADX INFO: renamed from: k */
    public TextView f36145k;

    /* JADX INFO: renamed from: l */
    public VSlider f36146l;

    /* JADX INFO: renamed from: m */
    public VListCell f36147m;

    /* JADX INFO: renamed from: n */
    public FilterSwitchCell f36148n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f36149o;

    /* JADX INFO: renamed from: p */
    public TextView f36150p;

    /* JADX INFO: renamed from: q */
    public VSlider f36151q;

    /* JADX INFO: renamed from: r */
    public VLinear f36152r;

    /* JADX INFO: renamed from: s */
    public VListCell f36153s;

    /* JADX INFO: renamed from: t */
    public VLinear f36154t;

    /* JADX INFO: renamed from: u */
    public VText f36155u;

    /* JADX INFO: renamed from: v */
    public TagContainerLayout f36156v;

    /* JADX INFO: renamed from: w */
    public TagContainerLayout f36157w;

    /* JADX INFO: renamed from: x */
    public VText f36158x;

    /* JADX INFO: renamed from: y */
    public VListCell f36159y;

    /* JADX INFO: renamed from: z */
    public VListCell f36160z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$a */
    public class C8862a implements Animator.AnimatorListener {
        public C8862a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdl0.m208344M(NewFilterBaseSetting.this.f36149o, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$b */
    public class C8863b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f36162a;

        public C8863b(int i) {
            this.f36162a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(new Rect(0 - t100.m186890d(10.0f), this.f36162a, view.getWidth() + t100.m186890d(10.0f), view.getHeight()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$c */
    public class C8864c implements HiddenNearByView.InterfaceC8857g {
        public C8864c() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.HiddenNearByView.InterfaceC8857g
        /* JADX INFO: renamed from: a */
        public void mo55390a(int i) {
            NewFilterBaseSetting.this.f36146l.setValue(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$d */
    public class C8865d implements e30<NewFilterGenderItem> {
        public C8865d() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(NewFilterGenderItem newFilterGenderItem) {
            if (NullChecker.m81303a(newFilterGenderItem)) {
                int iIndexOfChild = NewFilterBaseSetting.this.f36157w.indexOfChild(newFilterGenderItem);
                if (!NullChecker.m81303a(NewFilterBaseSetting.this.f36127F) || vwb.m200296J(NewFilterBaseSetting.this.f36127F.settingGroups)) {
                    return;
                }
                NewFilterBaseSetting.this.f36127F.getSettingGroup().search.lookingForGender = NewFilterBaseSetting.this.m55455r0(iIndexOfChild);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$e */
    public class C8866e extends VSlider.AbstractC22568a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f36166a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f36167b;

        public C8866e(Settings settings, Runnable runnable) {
            this.f36166a = settings;
            this.f36167b = runnable;
        }

        @Override // p147v.VSlider.AbstractC22568a, p149l.wg50
        /* JADX INFO: renamed from: c */
        public void mo55416a(@NonNull @NotNull VSlider vSlider, boolean z, float f) {
            if (jjb0.m141785c() && !CoreModule.f17545c.f19639e0.f149477t5.get().booleanValue() && f < 20.0f && this.f36166a.autoAdjustSuggestRadius().booleanValue()) {
                yij0.m214964t(NewFilterBaseSetting.this.f36147m, false);
                CoreModule.f17545c.f19639e0.f149477t5.put(Boolean.TRUE);
            }
            if (IntlCountryCodeController.m28110f()) {
                Settings settings = this.f36166a;
                if (f == 60.0f) {
                    settings.getSettingGroup().search.radius = this.f36166a.getRadiusAllowedMaximum();
                } else {
                    settings.getSettingGroup().search.radius = Integer.valueOf(this.f36166a.getRadiusAllowedMinimum().intValue() + Math.min(this.f36166a.getRadiusAllowedMaximum().intValue() - this.f36166a.getRadiusAllowedMinimum().intValue(), (int) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, i0g0.m133845L(f))));
                }
            } else {
                this.f36166a.getSettingGroup().search.radius = Integer.valueOf(this.f36166a.getRadiusAllowedMinimum().intValue() + Math.min(this.f36166a.getRadiusAllowedMaximum().intValue() - this.f36166a.getRadiusAllowedMinimum().intValue(), Math.max(0, ((int) f) * 1000)));
            }
            this.f36167b.run();
            super.mo55416a(vSlider, z, f);
        }

        @Override // p147v.VSlider.AbstractC22568a, p149l.wg50
        /* JADX INFO: renamed from: d */
        public void mo55417b(@NonNull @NotNull VSlider vSlider, boolean z, float f, float f2) {
            super.mo55417b(vSlider, z, f, f2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$f */
    public class C8867f implements VSlider.InterfaceC22569b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f36169a;

        public C8867f(Settings settings) {
            this.f36169a = settings;
        }

        @Override // p149l.xek0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo55484a(@NonNull @NotNull VSlider vSlider) {
        }

        @Override // p149l.xek0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo55485b(@NonNull @NotNull VSlider vSlider) {
            zvf0.m220400v("e_advanced_filter_distance", "p_advanced_filter_page", vwb.m200311Y("suggest_see_user_search_radius", this.f36169a.getSearchRadius()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$g */
    public class C8868g implements wg50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f36171a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f36172b;

        public C8868g(Settings settings, Runnable runnable) {
            this.f36171a = settings;
            this.f36172b = runnable;
        }

        @Override // p149l.wg50
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo55416a(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f) {
        }

        @Override // p149l.wg50
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo55417b(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f, float f2) {
            if (f < this.f36171a.getSearchAgeAllowedMinimum().intValue() || f2 < this.f36171a.getSearchAgeAllowedMinimum().intValue() || f > this.f36171a.getSearchAgeAllowedMaximum().intValue() || f2 > this.f36171a.getSearchAgeAllowedMaximum().intValue()) {
                return;
            }
            this.f36171a.getSettingGroup().search.minAge = Integer.valueOf((int) f);
            this.f36171a.getSettingGroup().search.maxAge = Integer.valueOf((int) f2);
            this.f36172b.run();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$h */
    public class C8869h implements VRangeSlider.InterfaceC22565a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f36174a;

        public C8869h(Settings settings) {
            this.f36174a = settings;
        }

        @Override // p149l.xek0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo55484a(@NonNull @NotNull VRangeSlider vRangeSlider) {
        }

        @Override // p149l.xek0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo55485b(@NonNull @NotNull VRangeSlider vRangeSlider) {
            zvf0.m220400v("e_advanced_filter_age", "p_advanced_filter_page", vwb.m200311Y("suggest_see_user_search_max_age", this.f36174a.getSearchMaxAge()), vwb.m200311Y("suggest_see_user_search_min_age", this.f36174a.getSearchMinAge()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$i */
    public class C8870i implements CompoundButton.OnCheckedChangeListener {
        public C8870i() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            NewFilterBaseSetting newFilterBaseSetting = NewFilterBaseSetting.this;
            if (z) {
                newFilterBaseSetting.m55475n0(newFilterBaseSetting.f36151q.getValue());
            } else {
                newFilterBaseSetting.f36151q.setValue(0.0f);
                NewFilterBaseSetting.this.m55475n0(0.0f);
            }
            NewFilterBaseSetting newFilterBaseSetting2 = NewFilterBaseSetting.this;
            if (z) {
                newFilterBaseSetting2.m55471Q0();
            } else {
                newFilterBaseSetting2.m55478s0();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$j */
    public class C8871j implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f36177a;

        public C8871j(int i) {
            this.f36177a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) NewFilterBaseSetting.this.f36149o.getLayoutParams();
            int i = this.f36177a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            NewFilterBaseSetting.this.m55477p0((int) (i * fFloatValue));
            NewFilterBaseSetting.this.f36149o.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$k */
    public class C8872k implements Animator.AnimatorListener {
        public C8872k() {
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
    public class C8873l implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f36180a;

        public C8873l(int i) {
            this.f36180a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) NewFilterBaseSetting.this.f36149o.getLayoutParams();
            int i = this.f36180a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            NewFilterBaseSetting.this.m55477p0((int) (i * fFloatValue));
            NewFilterBaseSetting.this.f36149o.setLayoutParams(marginLayoutParams);
        }
    }

    public NewFilterBaseSetting(Context context) {
        super(context);
        this.f36125D = new ArrayList();
        this.f36133L = false;
        this.f36136O = new Runnable() { // from class: l.oo20
            @Override // java.lang.Runnable
            public final void run() {
                this.f144842a.m55462G0();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m55431E0(View view) {
        yij0.m214942T(this.f36148n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public /* synthetic */ void m55432M0(View view) {
        CoreModule.f17557o.m195057d().mo33738Pa(getContext());
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m55437T(View view) {
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ LabelData m55438V(IdealTag idealTag) {
        LabelData labelData = new LabelData();
        labelData.name = idealTag.name;
        return labelData;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ boolean m55447e0(int i, int i2, Intent intent) {
        CoreModule.f17545c.f19639e0.f149388h7 = false;
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ String m55449g0(Act act, float f) {
        return String.valueOf(((int) f) + 1) + act.getString(R$string.f27824b2);
    }

    /* JADX INFO: renamed from: k0 */
    private void m55452k0(VListCell vListCell) {
        ImageView imageView = (ImageView) vListCell.findViewById(a5c0.f67698u);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = t100.m186890d(24.0f);
        layoutParams.width = t100.m186890d(24.0f);
    }

    /* JADX INFO: renamed from: m0 */
    private void m55453m0() {
        if (NullChecker.m81303a(this.f36131J) && this.f36131J.isRunning()) {
            this.f36131J.cancel();
        }
        if (NullChecker.m81303a(this.f36132K) && this.f36132K.isRunning()) {
            this.f36132K.cancel();
        }
    }

    /* JADX INFO: renamed from: q0 */
    private int m55454q0(LookingFor lookingFor) {
        if (TEnum.equals(lookingFor, "male")) {
            return 0;
        }
        return TEnum.equals(lookingFor, "female") ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public LookingFor m55455r0(int i) {
        if (i == 0) {
            return LookingFor.get("male");
        }
        return i == 1 ? LookingFor.get("female") : LookingFor.get("both");
    }

    private void setGenderChoose(LookingFor lookingFor) {
        this.f36126E.m127951o(qne0.f155426f[m55454q0(lookingFor)]);
    }

    /* JADX INFO: renamed from: v0 */
    private void m55456v0() {
        ba40 ba40Var = new ba40();
        this.f36126E = ba40Var;
        ba40Var.m127950n(new C8865d());
        this.f36157w.setCanAdjustChildHeight(false);
        this.f36157w.setIsSquare(true);
        this.f36157w.setAdapter(this.f36126E);
        this.f36126E.m100895r(Arrays.asList(qne0.f155426f));
        this.f36126E.m127948l();
    }

    /* JADX INFO: renamed from: x0 */
    private void m55457x0() {
        m55452k0(this.f36147m);
        if (!CoreModule.m29935P().m94656g().mo35084xj()) {
            this.f36128G = this.f36142h;
            this.f36129H = (TextView) this.f36159y.findViewById(a5c0.f67678c0);
            m55452k0(this.f36148n);
            if (CoreModule.m29935P().m94651a().mo33406Sk()) {
                this.f36148n.setTitle("不被附近的人发现");
                xdl0.m208344M(this.f36152r, true);
                xdl0.m208344M(this.f36153s, true);
            }
            xdl0.m208329E0(this.f36148n, new View.OnClickListener() { // from class: l.bp20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f76598a.m55431E0(view);
                }
            });
            return;
        }
        xdl0.m208344M(this.f36122A, true);
        xdl0.m208344M(this.f36123B, true);
        xdl0.m208344M(this.f36124C, true);
        xdl0.m208344M(this.f36159y, false);
        VListCell vListCell = this.f36124C;
        this.f36159y = vListCell;
        this.f36129H = (TextView) vListCell.findViewById(a5c0.f67678c0);
        xdl0.m208344M(this.f36148n, false);
        xdl0.m208344M(this.f36149o, false);
        xdl0.m208344M(this.f36158x, false);
        xdl0.m208344M(this.f36152r, true);
        xdl0.m208344M(this.f36153s, true);
    }

    /* JADX INFO: renamed from: y0 */
    private void m55458y0() {
        zvf0.m220396r("e_ideal_type_entrance", "p_advanced_filter_page");
        CoreModule.f17545c.f19639e0.f149388h7 = true;
        Act act = this.f36130I;
        act.startActivityForResult(MkWebViewAct.m80240e2(act, "", pj90.f149728p, true, true, true, true, null), new C4317a.a() { // from class: l.cp20
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return NewFilterBaseSetting.m55447e0(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m55459A0(View view) {
        m55458y0();
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m55460B0(View view) {
        m55458y0();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m55461D0(View view) {
        if (!Network.isConnected(CoreModule.f17544b)) {
            lsi0.m151584n(R$string.f27716G0);
        } else {
            zvf0.m220399u("e_advanced_filter_theme", "p_advanced_filter_page", vwb.m200311Y("theme_status", yij0.m214965u(this.f36137c) ? "close" : "open"));
            yij0.m214942T(this.f36137c);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m55462G0() {
        String str;
        int iIntValue = this.f36127F.getSearchInvisibleRadius().intValue();
        String string = this.f36130I.getString(R$string.f27824b2);
        String string2 = this.f36130I.getString(R$string.f27842e2);
        if (iIntValue == 0) {
            str = "";
        } else if (iIntValue < 1000) {
            str = "<" + iIntValue + string2;
        } else if (iIntValue % 1000 == 0) {
            str = "<" + (iIntValue / 1000) + string;
        } else {
            str = "<" + String.format("%.1f", Double.valueOf(((double) iIntValue) / 1000.0d)) + string;
        }
        this.f36150p.setText(str);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m55463H0(Settings settings) {
        settings.getSettingGroup().privacy.hideContacts = Boolean.valueOf(yij0.m214942T(this.f36153s));
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m55464I0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        yij0.m214964t(this.f36153s, false);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m55465J0(final Settings settings, Act act, View view) {
        if (!yij0.m214965u(this.f36153s)) {
            PermissionHelper.m79882c().m79900r("android.permission.READ_CONTACTS").m79905w(false).m79903u(false).m79895m(new d30() { // from class: l.to20
                @Override // p149l.d30
                public final void call() {
                    this.f171315a.m55463H0(settings);
                }
            }, new e30() { // from class: l.uo20
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f177490a.m55464I0((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m79891i(act);
        } else {
            settings.getSettingGroup().privacy.hideContacts = Boolean.valueOf(yij0.m214942T(this.f36153s));
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m55466K0(Settings settings, View view) {
        zvf0.m220400v("e_advanced_filter_larger_distance", "p_advanced_filter_page", vwb.m200311Y("suggest_see_user_search_auto_radius", Boolean.valueOf(!yij0.m214965u(this.f36147m))));
        settings.getSettingGroup().search.autoAdjustRadius = Boolean.valueOf(yij0.m214942T(this.f36147m));
        CoreModule.f17545c.f19639e0.f149477t5.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m55467L0(Settings settings) {
        TextView textView = this.f36128G;
        StringBuilder sb = new StringBuilder();
        sb.append(settings.getSearchMinAge());
        sb.append(" - ");
        sb.append(settings.getSearchMaxAge());
        sb.append(settings.getSearchMaxAge().equals(settings.getSearchAgeAllowedMaximum()) ? Marker.ANY_NON_NULL_MARKER : "");
        textView.setText(sb.toString());
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m55468N0(Act act, Settings settings) {
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
        this.f36145k.setText(strConcat);
    }

    /* JADX INFO: renamed from: O0 */
    public void m55469O0(final Act act, final Settings settings, String str) {
        boolean z;
        this.f36130I = act;
        this.f36127F = settings;
        this.f36128G = this.f36142h;
        Runnable runnable = new Runnable() { // from class: l.dp20
            @Override // java.lang.Runnable
            public final void run() {
                this.f87229a.m55468N0(act, settings);
            }
        };
        runnable.run();
        this.f36136O.run();
        if (CoreModule.m29935P().m94651a().mo33406Sk()) {
            yij0.m214964t(this.f36153s, settings.hideContacts().booleanValue());
            this.f36153s.setOnClickListener(new View.OnClickListener() { // from class: l.ep20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f92531a.m55465J0(settings, act, view);
                }
            });
        }
        this.f36146l.setValueTo((settings.getRadiusAllowedMaximum().intValue() - settings.getRadiusAllowedMinimum().intValue()) / 1000);
        int iIntValue = (settings.getSearchRadius().intValue() - settings.getRadiusAllowedMinimum().intValue()) / 1000;
        float f = iIntValue;
        if (f == this.f36146l.getValue()) {
            this.f36146l.setValue(iIntValue + 1);
        }
        this.f36146l.setValue(f);
        this.f36146l.setLabelFormatter(new iqk0() { // from class: l.po20
            @Override // p149l.iqk0
            /* JADX INFO: renamed from: a */
            public final String mo55415a(float f2) {
                return NewFilterBaseSetting.m55449g0(act, f2);
            }
        });
        this.f36146l.mo222965f(new C8866e(settings, runnable));
        this.f36146l.mo222967g(new C8867f(settings));
        m55481w0();
        boolean zBooleanValue = settings.autoAdjustSuggestRadius().booleanValue();
        yij0.m214964t(this.f36147m, zBooleanValue);
        this.f36147m.setOnClickListener(new View.OnClickListener() { // from class: l.qo20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155534a.m55466K0(settings, view);
            }
        });
        if (TextUtils.equals(str, ip20.f114252n)) {
            if (!zBooleanValue) {
                this.f36147m.performClick();
            }
            m55470P0();
        }
        Runnable runnable2 = new Runnable() { // from class: l.ro20
            @Override // java.lang.Runnable
            public final void run() {
                this.f160348a.m55467L0(settings);
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
        this.f36143i.setValueFrom(fIntValue);
        this.f36143i.setValueTo(fIntValue2);
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
        this.f36143i.setValues(Float.valueOf(fMax), Float.valueOf(fIntValue4));
        this.f36143i.mo222965f(new C8868g(settings, runnable2));
        this.f36143i.mo222967g(new C8869h(settings));
        m55480u0(act, settings);
        setGenderChoose(settings.getLookingFor());
        this.f36159y.setOnClickListener(new View.OnClickListener() { // from class: l.so20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165537a.m55432M0(view);
            }
        });
        boolean z2 = settings.getSearchInvisibleRadius().intValue() == 0;
        if (CoreModule.m29935P().m94656g().mo35084xj()) {
            return;
        }
        xdl0.m208344M(this.f36149o, !z2);
        this.f36148n.getSwitchButton().setChecked(!z2);
        this.f36148n.m55370d(new C8870i());
    }

    /* JADX INFO: renamed from: P0 */
    public final void m55470P0() {
        C4345a c4345a = new C4345a(this.f36147m.getContext());
        c4345a.m20847B(t100.m186890d(2.0f)).m20849D("离线期间有" + (this.f36127F.getSearchRadius().intValue() / 1000) + "km外的人喜欢了你，已为你自动扩大距离").m20870k(CoreModule.f17544b.getResources().getColor(c1c0.f78249f)).m20871l(t100.m186890d(7.0f)).m20874p(75).m20855J(13.0f).m20854I(228).m20881w(t100.m186890d(6.0f)).m20882x(t100.m186890d(6.0f)).m20848C(10).m20861b(3000L).m20883y(true).m20875q(C4345a.f15680N);
        C4348d.m20896l().m20909u(c4345a, this.f36147m.getRightView(), "boost_auto_distance");
    }

    /* JADX INFO: renamed from: Q0 */
    public void m55471Q0() {
        m55453m0();
        this.f36131J = ValueAnimator.ofFloat(1.0f, 0.0f);
        int iM186890d = t100.m186890d(77.0f);
        this.f36131J.setDuration(400L);
        this.f36131J.addUpdateListener(new C8871j(iM186890d));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f36149o.getLayoutParams();
        marginLayoutParams.topMargin = -iM186890d;
        this.f36149o.setLayoutParams(marginLayoutParams);
        xdl0.m208344M(this.f36149o, true);
        this.f36131J.addListener(new C8872k());
        this.f36131J.start();
    }

    /* JADX INFO: renamed from: R0 */
    public void m55472R0(String str) {
        if (NullChecker.m81304b(this.f36129H)) {
            this.f36129H.setText(str);
        }
    }

    public View getLocationTitle() {
        return CoreModule.m29935P().m94656g().mo35084xj() ? this.f36123B : this.f36158x;
    }

    public List<IdealTag> getOriginIdealTag() {
        return this.f36135N;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m55473j0(View view) {
        fp20.m122554a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public void m55474l0(String str, String str2) {
        this.f36159y.setTitle(str);
        this.f36129H.setText(str2);
    }

    /* JADX INFO: renamed from: n0 */
    public void m55475n0(float f) {
        int i = (int) (f * 200.0f);
        this.f36127F.getSettingGroup().search.invisibleRadius = Integer.valueOf(i);
        this.f36136O.run();
        if (this.f36127F.getSearchRadius().intValue() < i) {
            if (i % 1000 != 0) {
                i = (i / 1000) * 1000;
            }
            this.f36146l.setValue(i / 1000);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m55476o0() {
        boolean zM215137i = yki0.m215127b().m215137i();
        CoreModule.f17545c.f19702z0.f106529V.put(Boolean.valueOf(zM215137i));
        return zM215137i;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55473j0(this);
        m55457x0();
        m55456v0();
        m55479t0(false);
    }

    /* JADX INFO: renamed from: p0 */
    public void m55477p0(int i) {
        this.f36149o.setOutlineProvider(new C8863b(i));
        this.f36149o.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: s0 */
    public void m55478s0() {
        m55453m0();
        this.f36132K = ValueAnimator.ofFloat(0.0f, 1.0f);
        int iM186890d = t100.m186890d(73.0f);
        this.f36132K.setDuration(400L);
        this.f36132K.addUpdateListener(new C8873l(iM186890d));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f36149o.getLayoutParams();
        marginLayoutParams.topMargin = 0;
        this.f36149o.setLayoutParams(marginLayoutParams);
        this.f36132K.addListener(new C8862a());
        this.f36132K.start();
    }

    public void setHiddenNearByView(HiddenNearByView hiddenNearByView) {
        this.f36134M = hiddenNearByView;
        hiddenNearByView.setHiddenNearByViewListener(new C8864c());
    }

    /* JADX INFO: renamed from: t0 */
    public void m55479t0(boolean z) {
        if (CoreModule.m29935P().m94651a().mo158376f4()) {
            xdl0.m208344M(this.f36138d, true);
            zvf0.m220402x("e_ideal_type_entrance", "p_advanced_filter_page");
            List<IdealTag> list = CoreModule.f17545c.f19639e0.m169527p9().profile.extensions.basic.ideal;
            if (!z) {
                this.f36135N = list;
            }
            boolean zM200296J = vwb.m200296J(list);
            VFrame vFrame = this.f36140f;
            if (zM200296J) {
                xdl0.m208344M(vFrame, true);
                xdl0.m208344M(this.f36141g, false);
                xdl0.m208344M(this.f36139e, false);
                xdl0.m208329E0(this.f36138d, new View.OnClickListener() { // from class: l.wo20
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NewFilterBaseSetting.m55437T(view);
                    }
                });
                xdl0.m208329E0(this.f36140f, new View.OnClickListener() { // from class: l.xo20
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f193776a.m55482z0(view);
                    }
                });
                return;
            }
            xdl0.m208344M(vFrame, false);
            xdl0.m208344M(this.f36141g, true);
            xdl0.m208344M(this.f36139e, true);
            xdl0.m208329E0(this.f36138d, new View.OnClickListener() { // from class: l.yo20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f199257a.m55459A0(view);
                }
            });
            this.f36141g.setLabel(vwb.m200303Q(list, new w9j() { // from class: l.zo20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return NewFilterBaseSetting.m55438V((IdealTag) obj);
                }
            }));
            xdl0.m208329E0(this.f36141g, new View.OnClickListener() { // from class: l.ap20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f70975a.m55460B0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m55480u0(Act act, Settings settings) {
        this.f36160z.setVisibility(8);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m55481w0() {
        xdl0.m208344M(this.f36137c, false);
        if (yki0.m215127b().m215135g()) {
            OMSThemeInfo oMSThemeInfoM215130a = yki0.m215127b().m215130a();
            if (!NullChecker.m81303a(oMSThemeInfoM215130a) || oMSThemeInfoM215130a.settingTxt.isEmpty()) {
                return;
            }
            xdl0.m208344M(this.f36137c, true);
            yij0.m214964t(this.f36137c, m55476o0());
            zvf0.m220368A("e_advanced_filter_theme", "p_advanced_filter_page", vwb.m200311Y("theme_status", yij0.m214965u(this.f36137c) ? "open" : "close"));
            this.f36137c.setTitle(oMSThemeInfoM215130a.settingTxt);
            this.f36137c.setOnClickListener(new View.OnClickListener() { // from class: l.vo20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f182331a.m55461D0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m55482z0(View view) {
        m55458y0();
    }

    public NewFilterBaseSetting(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36125D = new ArrayList();
        this.f36133L = false;
        this.f36136O = new Runnable() { // from class: l.oo20
            @Override // java.lang.Runnable
            public final void run() {
                this.f144842a.m55462G0();
            }
        };
    }

    public NewFilterBaseSetting(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36125D = new ArrayList();
        this.f36133L = false;
        this.f36136O = new Runnable() { // from class: l.oo20
            @Override // java.lang.Runnable
            public final void run() {
                this.f144842a.m55462G0();
            }
        };
    }
}
