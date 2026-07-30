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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.NewFilterBaseSetting;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.tags.TagContainerLayout;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
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
import l.fp20;
import l.i0g0;
import l.iqk0;
import l.j760;
import l.lsi0;
import l.mqa;
import l.pj90;
import l.t100;
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
public class NewFilterBaseSetting extends VLinear {

    /* JADX INFO: renamed from: A */
    public View f5903A;

    /* JADX INFO: renamed from: B */
    public VText f5904B;

    /* JADX INFO: renamed from: C */
    public VListCell f5905C;

    /* JADX INFO: renamed from: D */
    public List<iuh0> f5906D;

    /* JADX INFO: renamed from: E */
    public ba40 f5907E;

    /* JADX INFO: renamed from: F */
    public Settings f5908F;

    /* JADX INFO: renamed from: G */
    public TextView f5909G;

    /* JADX INFO: renamed from: H */
    public TextView f5910H;

    /* JADX INFO: renamed from: I */
    public Act f5911I;

    /* JADX INFO: renamed from: J */
    public ValueAnimator f5912J;

    /* JADX INFO: renamed from: K */
    public ValueAnimator f5913K;

    /* JADX INFO: renamed from: L */
    public boolean f5914L;

    /* JADX INFO: renamed from: M */
    public HiddenNearByView f5915M;

    /* JADX INFO: renamed from: N */
    public List<IdealTag> f5916N;

    /* JADX INFO: renamed from: O */
    public Runnable f5917O;

    /* JADX INFO: renamed from: c */
    public VListCell f5918c;

    /* JADX INFO: renamed from: d */
    public VFrame f5919d;

    /* JADX INFO: renamed from: e */
    public ImageView f5920e;

    /* JADX INFO: renamed from: f */
    public VFrame f5921f;

    /* JADX INFO: renamed from: g */
    public CommonLabelShowView f5922g;

    /* JADX INFO: renamed from: h */
    public TextView f5923h;

    /* JADX INFO: renamed from: i */
    public VRangeSlider f5924i;

    /* JADX INFO: renamed from: j */
    public VText f5925j;

    /* JADX INFO: renamed from: k */
    public TextView f5926k;

    /* JADX INFO: renamed from: l */
    public VSlider f5927l;

    /* JADX INFO: renamed from: m */
    public VListCell f5928m;

    /* JADX INFO: renamed from: n */
    public FilterSwitchCell f5929n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f5930o;

    /* JADX INFO: renamed from: p */
    public TextView f5931p;

    /* JADX INFO: renamed from: q */
    public VSlider f5932q;

    /* JADX INFO: renamed from: r */
    public VLinear f5933r;

    /* JADX INFO: renamed from: s */
    public VListCell f5934s;

    /* JADX INFO: renamed from: t */
    public VLinear f5935t;

    /* JADX INFO: renamed from: u */
    public VText f5936u;

    /* JADX INFO: renamed from: v */
    public TagContainerLayout f5937v;

    /* JADX INFO: renamed from: w */
    public TagContainerLayout f5938w;

    /* JADX INFO: renamed from: x */
    public VText f5939x;

    /* JADX INFO: renamed from: y */
    public VListCell f5940y;

    /* JADX INFO: renamed from: z */
    public VListCell f5941z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$a */
    public class C0298a implements Animator.AnimatorListener {
        public C0298a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdl0.M(NewFilterBaseSetting.this.f5930o, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$b */
    public class C0299b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5943a;

        public C0299b(int i) {
            this.f5943a = i;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(new Rect(0 - t100.d(10.0f), this.f5943a, view.getWidth() + t100.d(10.0f), view.getHeight()));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$c */
    public class C0300c implements HiddenNearByView.InterfaceC0293g {
        public C0300c() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.HiddenNearByView.InterfaceC0293g
        /* JADX INFO: renamed from: a */
        public void mo8763a(int i) {
            NewFilterBaseSetting.this.f5927l.setValue(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$d */
    public class C0301d implements e30<NewFilterGenderItem> {
        public C0301d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(NewFilterGenderItem newFilterGenderItem) {
            if (NullChecker.a(newFilterGenderItem)) {
                int iIndexOfChild = NewFilterBaseSetting.this.f5938w.indexOfChild(newFilterGenderItem);
                if (!NullChecker.a(NewFilterBaseSetting.this.f5908F) || vwb.J(NewFilterBaseSetting.this.f5908F.settingGroups)) {
                    return;
                }
                NewFilterBaseSetting.this.f5908F.getSettingGroup().search.lookingForGender = NewFilterBaseSetting.this.m8830r0(iIndexOfChild);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$e */
    public class C0302e extends VSlider.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f5947a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f5948b;

        public C0302e(Settings settings, Runnable runnable) {
            this.f5947a = settings;
            this.f5948b = runnable;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m8859a(@NonNull @NotNull VSlider vSlider, boolean z, float f) {
            if (jjb0.m17488c() && !((Boolean) CoreModule.f1534c.f3628e0.f19089t5.get()).booleanValue() && f < 20.0f && this.f5947a.autoAdjustSuggestRadius().booleanValue()) {
                yij0.t(NewFilterBaseSetting.this.f5928m, false);
                CoreModule.f1534c.f3628e0.f19089t5.put(Boolean.TRUE);
            }
            if (IntlCountryCodeController.m5f()) {
                Settings settings = this.f5947a;
                if (f == 60.0f) {
                    settings.getSettingGroup().search.radius = this.f5947a.getRadiusAllowedMaximum();
                } else {
                    settings.getSettingGroup().search.radius = Integer.valueOf(this.f5947a.getRadiusAllowedMinimum().intValue() + Math.min(this.f5947a.getRadiusAllowedMaximum().intValue() - this.f5947a.getRadiusAllowedMinimum().intValue(), (int) Math.max(0.0d, i0g0.L(f))));
                }
            } else {
                this.f5947a.getSettingGroup().search.radius = Integer.valueOf(this.f5947a.getRadiusAllowedMinimum().intValue() + Math.min(this.f5947a.getRadiusAllowedMaximum().intValue() - this.f5947a.getRadiusAllowedMinimum().intValue(), Math.max(0, ((int) f) * AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO)));
            }
            this.f5948b.run();
            super.c(vSlider, z, f);
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void m8860b(@NonNull @NotNull VSlider vSlider, boolean z, float f, float f2) {
            super.d(vSlider, z, f, f2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$f */
    public class C0303f implements VSlider.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f5950a;

        public C0303f(Settings settings) {
            this.f5950a = settings;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m8863a(@NonNull @NotNull VSlider vSlider) {
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void m8864b(@NonNull @NotNull VSlider vSlider) {
            zvf0.v("e_advanced_filter_distance", "p_advanced_filter_page", new j760[]{vwb.Y("suggest_see_user_search_radius", this.f5950a.getSearchRadius())});
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$g */
    public class C0304g implements wg50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f5952a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f5953b;

        public C0304g(Settings settings, Runnable runnable) {
            this.f5952a = settings;
            this.f5953b = runnable;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m8867a(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f) {
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void m8868b(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f, float f2) {
            if (f < this.f5952a.getSearchAgeAllowedMinimum().intValue() || f2 < this.f5952a.getSearchAgeAllowedMinimum().intValue() || f > this.f5952a.getSearchAgeAllowedMaximum().intValue() || f2 > this.f5952a.getSearchAgeAllowedMaximum().intValue()) {
                return;
            }
            this.f5952a.getSettingGroup().search.minAge = Integer.valueOf((int) f);
            this.f5952a.getSettingGroup().search.maxAge = Integer.valueOf((int) f2);
            this.f5953b.run();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$h */
    public class C0305h implements VRangeSlider.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f5955a;

        public C0305h(Settings settings) {
            this.f5955a = settings;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m8871a(@NonNull @NotNull VRangeSlider vRangeSlider) {
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void m8872b(@NonNull @NotNull VRangeSlider vRangeSlider) {
            zvf0.v("e_advanced_filter_age", "p_advanced_filter_page", new j760[]{vwb.Y("suggest_see_user_search_max_age", this.f5955a.getSearchMaxAge()), vwb.Y("suggest_see_user_search_min_age", this.f5955a.getSearchMinAge())});
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$i */
    public class C0306i implements CompoundButton.OnCheckedChangeListener {
        public C0306i() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            NewFilterBaseSetting newFilterBaseSetting = NewFilterBaseSetting.this;
            if (z) {
                newFilterBaseSetting.m8850n0(newFilterBaseSetting.f5932q.getValue());
            } else {
                newFilterBaseSetting.f5932q.setValue(0.0f);
                NewFilterBaseSetting.this.m8850n0(0.0f);
            }
            NewFilterBaseSetting newFilterBaseSetting2 = NewFilterBaseSetting.this;
            if (z) {
                newFilterBaseSetting2.m8846Q0();
            } else {
                newFilterBaseSetting2.m8853s0();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$j */
    public class C0307j implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5958a;

        public C0307j(int i) {
            this.f5958a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) NewFilterBaseSetting.this.f5930o.getLayoutParams();
            int i = this.f5958a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            NewFilterBaseSetting.this.m8852p0((int) (i * fFloatValue));
            NewFilterBaseSetting.this.f5930o.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterBaseSetting$k */
    public class C0308k implements Animator.AnimatorListener {
        public C0308k() {
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
    public class C0309l implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5961a;

        public C0309l(int i) {
            this.f5961a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) NewFilterBaseSetting.this.f5930o.getLayoutParams();
            int i = this.f5961a;
            marginLayoutParams.topMargin = (int) ((-i) * fFloatValue);
            NewFilterBaseSetting.this.m8852p0((int) (i * fFloatValue));
            NewFilterBaseSetting.this.f5930o.setLayoutParams(marginLayoutParams);
        }
    }

    public NewFilterBaseSetting(Context context) {
        super(context);
        this.f5906D = new ArrayList();
        this.f5914L = false;
        this.f5917O = new Runnable() { // from class: l.oo20
            @Override // java.lang.Runnable
            public final void run() {
                this.f18297a.m8837G0();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m8806E0(View view) {
        yij0.T(this.f5929n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M0 */
    public /* synthetic */ void m8807M0(View view) {
        CoreModule.f1546o.m25559d().m5675Pa(getContext());
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m8812T(View view) {
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ LabelData m8813V(IdealTag idealTag) {
        LabelData labelData = new LabelData();
        labelData.name = idealTag.name;
        return labelData;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ boolean m8822e0(int i, int i2, Intent intent) {
        CoreModule.f1534c.f3628e0.f19000h7 = false;
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ String m8824g0(Act act, float f) {
        return String.valueOf(((int) f) + 1) + act.getString(R.string.b2);
    }

    /* JADX INFO: renamed from: k0 */
    private void m8827k0(VListCell vListCell) {
        ImageView imageView = (ImageView) vListCell.findViewById(a5c0.u);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = t100.d(24.0f);
        layoutParams.width = t100.d(24.0f);
    }

    /* JADX INFO: renamed from: m0 */
    private void m8828m0() {
        if (NullChecker.a(this.f5912J) && this.f5912J.isRunning()) {
            this.f5912J.cancel();
        }
        if (NullChecker.a(this.f5913K) && this.f5913K.isRunning()) {
            this.f5913K.cancel();
        }
    }

    /* JADX INFO: renamed from: q0 */
    private int m8829q0(LookingFor lookingFor) {
        if (TEnum.equals(lookingFor, "male")) {
            return 0;
        }
        return TEnum.equals(lookingFor, "female") ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public LookingFor m8830r0(int i) {
        if (i == 0) {
            return LookingFor.get("male");
        }
        return i == 1 ? LookingFor.get("female") : LookingFor.get("both");
    }

    private void setGenderChoose(LookingFor lookingFor) {
        this.f5907E.m15989o(qne0.f19939f[m8829q0(lookingFor)]);
    }

    /* JADX INFO: renamed from: v0 */
    private void m8831v0() {
        ba40 ba40Var = new ba40();
        this.f5907E = ba40Var;
        ba40Var.m15988n(new C0301d());
        this.f5938w.setCanAdjustChildHeight(false);
        this.f5938w.setIsSquare(true);
        this.f5938w.setAdapter(this.f5907E);
        this.f5907E.m12583r(Arrays.asList(qne0.f19939f));
        this.f5907E.m15986l();
    }

    /* JADX INFO: renamed from: x0 */
    private void m8832x0() {
        m8827k0(this.f5928m);
        if (!CoreModule.m1854P().m11711g().m7021xj()) {
            this.f5909G = this.f5923h;
            this.f5910H = (TextView) this.f5940y.findViewById(a5c0.c0);
            m8827k0(this.f5929n);
            if (CoreModule.m1854P().m11706a().m5343Sk()) {
                this.f5929n.setTitle("不被附近的人发现");
                xdl0.M(this.f5933r, true);
                xdl0.M(this.f5934s, true);
            }
            xdl0.E0(this.f5929n, new View.OnClickListener() { // from class: l.bp20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9019a.m8806E0(view);
                }
            });
            return;
        }
        xdl0.M(this.f5903A, true);
        xdl0.M(this.f5904B, true);
        xdl0.M(this.f5905C, true);
        xdl0.M(this.f5940y, false);
        VListCell vListCell = this.f5905C;
        this.f5940y = vListCell;
        this.f5910H = (TextView) vListCell.findViewById(a5c0.c0);
        xdl0.M(this.f5929n, false);
        xdl0.M(this.f5930o, false);
        xdl0.M(this.f5939x, false);
        xdl0.M(this.f5933r, true);
        xdl0.M(this.f5934s, true);
    }

    /* JADX INFO: renamed from: y0 */
    private void m8833y0() {
        zvf0.r("e_ideal_type_entrance", "p_advanced_filter_page");
        CoreModule.f1534c.f3628e0.f19000h7 = true;
        Act act = this.f5911I;
        act.startActivityForResult(MkWebViewAct.e2(act, "", pj90.p, true, true, true, true, (ResultReceiver) null), new a.a() { // from class: l.cp20
            /* JADX INFO: renamed from: a */
            public final boolean m13608a(int i, int i2, Intent intent) {
                return NewFilterBaseSetting.m8822e0(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m8834A0(View view) {
        m8833y0();
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m8835B0(View view) {
        m8833y0();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m8836D0(View view) {
        if (!Network.isConnected(CoreModule.f1533b)) {
            lsi0.n(R.string.G0);
        } else {
            zvf0.u("e_advanced_filter_theme", "p_advanced_filter_page", new j760[]{vwb.Y("theme_status", yij0.u(this.f5918c) ? "close" : "open")});
            yij0.T(this.f5918c);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m8837G0() {
        String str;
        int iIntValue = this.f5908F.getSearchInvisibleRadius().intValue();
        String string = this.f5911I.getString(R.string.b2);
        String string2 = this.f5911I.getString(R.string.e2);
        if (iIntValue == 0) {
            str = "";
        } else if (iIntValue < 1000) {
            str = "<" + iIntValue + string2;
        } else if (iIntValue % AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO == 0) {
            str = "<" + (iIntValue / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) + string;
        } else {
            str = "<" + String.format("%.1f", Double.valueOf(((double) iIntValue) / 1000.0d)) + string;
        }
        this.f5931p.setText(str);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m8838H0(Settings settings) {
        settings.getSettingGroup().privacy.hideContacts = Boolean.valueOf(yij0.T(this.f5934s));
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m8839I0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        yij0.t(this.f5934s, false);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m8840J0(final Settings settings, Act act, View view) {
        if (!yij0.u(this.f5934s)) {
            PermissionHelper.c().r(new String[]{"android.permission.READ_CONTACTS"}).w(false).u(false).m(new d30() { // from class: l.to20
                public final void call() {
                    this.f22205a.m8838H0(settings);
                }
            }, new e30() { // from class: l.uo20
                public final void call(Object obj) {
                    this.f23684a.m8839I0((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).i(act);
        } else {
            settings.getSettingGroup().privacy.hideContacts = Boolean.valueOf(yij0.T(this.f5934s));
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m8841K0(Settings settings, View view) {
        zvf0.v("e_advanced_filter_larger_distance", "p_advanced_filter_page", new j760[]{vwb.Y("suggest_see_user_search_auto_radius", Boolean.valueOf(!yij0.u(this.f5928m)))});
        settings.getSettingGroup().search.autoAdjustRadius = Boolean.valueOf(yij0.T(this.f5928m));
        CoreModule.f1534c.f3628e0.f19089t5.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m8842L0(Settings settings) {
        TextView textView = this.f5909G;
        StringBuilder sb = new StringBuilder();
        sb.append(settings.getSearchMinAge());
        sb.append(" - ");
        sb.append(settings.getSearchMaxAge());
        sb.append(settings.getSearchMaxAge().equals(settings.getSearchAgeAllowedMaximum()) ? "+" : "");
        textView.setText(sb.toString());
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m8843N0(Act act, Settings settings) {
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
        this.f5926k.setText(strConcat);
    }

    /* JADX INFO: renamed from: O0 */
    public void m8844O0(final Act act, final Settings settings, String str) {
        boolean z;
        this.f5911I = act;
        this.f5908F = settings;
        this.f5909G = this.f5923h;
        Runnable runnable = new Runnable() { // from class: l.dp20
            @Override // java.lang.Runnable
            public final void run() {
                this.f10504a.m8843N0(act, settings);
            }
        };
        runnable.run();
        this.f5917O.run();
        if (CoreModule.m1854P().m11706a().m5343Sk()) {
            yij0.t(this.f5934s, settings.hideContacts().booleanValue());
            this.f5934s.setOnClickListener(new View.OnClickListener() { // from class: l.ep20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11314a.m8840J0(settings, act, view);
                }
            });
        }
        this.f5927l.setValueTo((settings.getRadiusAllowedMaximum().intValue() - settings.getRadiusAllowedMinimum().intValue()) / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        int iIntValue = (settings.getSearchRadius().intValue() - settings.getRadiusAllowedMinimum().intValue()) / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
        float f = iIntValue;
        if (f == this.f5927l.getValue()) {
            this.f5927l.setValue(iIntValue + 1);
        }
        this.f5927l.setValue(f);
        this.f5927l.setLabelFormatter(new iqk0() { // from class: l.po20
            /* JADX INFO: renamed from: a */
            public final String m21626a(float f2) {
                return NewFilterBaseSetting.m8824g0(act, f2);
            }
        });
        this.f5927l.f(new C0302e(settings, runnable));
        this.f5927l.g(new C0303f(settings));
        m8856w0();
        boolean zBooleanValue = settings.autoAdjustSuggestRadius().booleanValue();
        yij0.t(this.f5928m, zBooleanValue);
        this.f5928m.setOnClickListener(new View.OnClickListener() { // from class: l.qo20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19948a.m8841K0(settings, view);
            }
        });
        if (TextUtils.equals(str, ip20.f14609n)) {
            if (!zBooleanValue) {
                this.f5928m.performClick();
            }
            m8845P0();
        }
        Runnable runnable2 = new Runnable() { // from class: l.ro20
            @Override // java.lang.Runnable
            public final void run() {
                this.f20655a.m8842L0(settings);
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
        this.f5924i.setValueFrom(fIntValue);
        this.f5924i.setValueTo(fIntValue2);
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
        this.f5924i.setValues(new Float[]{Float.valueOf(fMax), Float.valueOf(fIntValue4)});
        this.f5924i.f(new C0304g(settings, runnable2));
        this.f5924i.g(new C0305h(settings));
        m8855u0(act, settings);
        setGenderChoose(settings.getLookingFor());
        this.f5940y.setOnClickListener(new View.OnClickListener() { // from class: l.so20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21448a.m8807M0(view);
            }
        });
        boolean z2 = settings.getSearchInvisibleRadius().intValue() == 0;
        if (CoreModule.m1854P().m11711g().m7021xj()) {
            return;
        }
        xdl0.M(this.f5930o, !z2);
        this.f5929n.getSwitchButton().setChecked(!z2);
        this.f5929n.m8743d(new C0306i());
    }

    /* JADX INFO: renamed from: P0 */
    public final void m8845P0() {
        com.p1.mobile.android.ui.bubble.a aVar = new com.p1.mobile.android.ui.bubble.a(this.f5928m.getContext());
        aVar.B(t100.d(2.0f)).D("离线期间有" + (this.f5908F.getSearchRadius().intValue() / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) + "km外的人喜欢了你，已为你自动扩大距离").k(new int[]{CoreModule.f1533b.getResources().getColor(c1c0.f)}).l(t100.d(7.0f)).p(75).J(13.0f).I(228).w(t100.d(6.0f)).x(t100.d(6.0f)).C(10).b(3000L).y(true).q(com.p1.mobile.android.ui.bubble.a.N);
        d.l().u(aVar, this.f5928m.getRightView(), "boost_auto_distance");
    }

    /* JADX INFO: renamed from: Q0 */
    public void m8846Q0() {
        m8828m0();
        this.f5912J = ValueAnimator.ofFloat(1.0f, 0.0f);
        int iD = t100.d(77.0f);
        this.f5912J.setDuration(400L);
        this.f5912J.addUpdateListener(new C0307j(iD));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f5930o.getLayoutParams();
        marginLayoutParams.topMargin = -iD;
        this.f5930o.setLayoutParams(marginLayoutParams);
        xdl0.M(this.f5930o, true);
        this.f5912J.addListener(new C0308k());
        this.f5912J.start();
    }

    /* JADX INFO: renamed from: R0 */
    public void m8847R0(String str) {
        if (NullChecker.b(this.f5910H)) {
            this.f5910H.setText(str);
        }
    }

    public View getLocationTitle() {
        return CoreModule.m1854P().m11711g().m7021xj() ? this.f5904B : this.f5939x;
    }

    public List<IdealTag> getOriginIdealTag() {
        return this.f5916N;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m8848j0(View view) {
        fp20.a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public void m8849l0(String str, String str2) {
        this.f5940y.setTitle(str);
        this.f5910H.setText(str2);
    }

    /* JADX INFO: renamed from: n0 */
    public void m8850n0(float f) {
        int i = (int) (f * 200.0f);
        this.f5908F.getSettingGroup().search.invisibleRadius = Integer.valueOf(i);
        this.f5917O.run();
        if (this.f5908F.getSearchRadius().intValue() < i) {
            if (i % AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO != 0) {
                i = (i / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) * AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
            }
            this.f5927l.setValue(i / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m8851o0() {
        boolean zI = yki0.b().i();
        CoreModule.f1534c.f3691z0.f13754V.put(Boolean.valueOf(zI));
        return zI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8848j0(this);
        m8832x0();
        m8831v0();
        m8854t0(false);
    }

    /* JADX INFO: renamed from: p0 */
    public void m8852p0(int i) {
        this.f5930o.setOutlineProvider(new C0299b(i));
        this.f5930o.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: s0 */
    public void m8853s0() {
        m8828m0();
        this.f5913K = ValueAnimator.ofFloat(0.0f, 1.0f);
        int iD = t100.d(73.0f);
        this.f5913K.setDuration(400L);
        this.f5913K.addUpdateListener(new C0309l(iD));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f5930o.getLayoutParams();
        marginLayoutParams.topMargin = 0;
        this.f5930o.setLayoutParams(marginLayoutParams);
        this.f5913K.addListener(new C0298a());
        this.f5913K.start();
    }

    public void setHiddenNearByView(HiddenNearByView hiddenNearByView) {
        this.f5915M = hiddenNearByView;
        hiddenNearByView.setHiddenNearByViewListener(new C0300c());
    }

    /* JADX INFO: renamed from: t0 */
    public void m8854t0(boolean z) {
        if (CoreModule.m1854P().m11706a().m19884f4()) {
            xdl0.M(this.f5919d, true);
            zvf0.x("e_ideal_type_entrance", "p_advanced_filter_page");
            List<IdealTag> list = CoreModule.f1534c.f3628e0.m21490p9().profile.extensions.basic.ideal;
            if (!z) {
                this.f5916N = list;
            }
            boolean zJ = vwb.J(list);
            VFrame vFrame = this.f5921f;
            if (zJ) {
                xdl0.M(vFrame, true);
                xdl0.M(this.f5922g, false);
                xdl0.M(this.f5920e, false);
                xdl0.E0(this.f5919d, new View.OnClickListener() { // from class: l.wo20
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NewFilterBaseSetting.m8812T(view);
                    }
                });
                xdl0.E0(this.f5921f, new View.OnClickListener() { // from class: l.xo20
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f27631a.m8857z0(view);
                    }
                });
                return;
            }
            xdl0.M(vFrame, false);
            xdl0.M(this.f5922g, true);
            xdl0.M(this.f5920e, true);
            xdl0.E0(this.f5919d, new View.OnClickListener() { // from class: l.yo20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f28315a.m8834A0(view);
                }
            });
            this.f5922g.setLabel(vwb.Q(list, new w9j() { // from class: l.zo20
                public final Object call(Object obj) {
                    return NewFilterBaseSetting.m8813V((IdealTag) obj);
                }
            }));
            xdl0.E0(this.f5922g, new View.OnClickListener() { // from class: l.ap20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8432a.m8835B0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m8855u0(Act act, Settings settings) {
        this.f5941z.setVisibility(8);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m8856w0() {
        xdl0.M(this.f5918c, false);
        if (yki0.b().g()) {
            OMSThemeInfo oMSThemeInfoA = yki0.b().a();
            if (!NullChecker.a(oMSThemeInfoA) || oMSThemeInfoA.settingTxt.isEmpty()) {
                return;
            }
            xdl0.M(this.f5918c, true);
            yij0.t(this.f5918c, m8851o0());
            zvf0.A("e_advanced_filter_theme", "p_advanced_filter_page", new j760[]{vwb.Y("theme_status", yij0.u(this.f5918c) ? "open" : "close")});
            this.f5918c.setTitle(oMSThemeInfoA.settingTxt);
            this.f5918c.setOnClickListener(new View.OnClickListener() { // from class: l.vo20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f24397a.m8836D0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m8857z0(View view) {
        m8833y0();
    }

    public NewFilterBaseSetting(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5906D = new ArrayList();
        this.f5914L = false;
        this.f5917O = new Runnable() { // from class: l.oo20
            @Override // java.lang.Runnable
            public final void run() {
                this.f18297a.m8837G0();
            }
        };
    }

    public NewFilterBaseSetting(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5906D = new ArrayList();
        this.f5914L = false;
        this.f5917O = new Runnable() { // from class: l.oo20
            @Override // java.lang.Runnable
            public final void run() {
                this.f18297a.m8837G0();
            }
        };
    }
}
