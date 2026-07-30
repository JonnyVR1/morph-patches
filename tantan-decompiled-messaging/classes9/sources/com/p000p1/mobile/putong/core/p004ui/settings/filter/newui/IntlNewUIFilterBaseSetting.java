package com.p000p1.mobile.putong.core.p004ui.settings.filter.newui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.tags.TagContainerLayout;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.LookingFor;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import l.a5c0;
import l.e01;
import l.e30;
import l.i0g0;
import l.iqk0;
import l.mqa;
import l.poo;
import l.t100;
import l.vwb;
import l.wg50;
import l.xdl0;
import l.yij0;
import org.jetbrains.annotations.NotNull;
import p006l.au2;
import p006l.iuh0;
import p006l.ja40;
import p006l.jjb0;
import p006l.qib0;
import p006l.qne0;
import v.VFrame;
import v.VLinear;
import v.VListCell;
import v.VRangeSlider;
import v.VSlider;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlNewUIFilterBaseSetting extends VLinear {

    /* JADX INFO: renamed from: c */
    public VFrame f5871c;

    /* JADX INFO: renamed from: d */
    public VText f5872d;

    /* JADX INFO: renamed from: e */
    public VText f5873e;

    /* JADX INFO: renamed from: f */
    public VText f5874f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f5875g;

    /* JADX INFO: renamed from: h */
    public VText f5876h;

    /* JADX INFO: renamed from: i */
    public TextView f5877i;

    /* JADX INFO: renamed from: j */
    public VRangeSlider f5878j;

    /* JADX INFO: renamed from: k */
    public TextView f5879k;

    /* JADX INFO: renamed from: l */
    public VText f5880l;

    /* JADX INFO: renamed from: m */
    public VSlider f5881m;

    /* JADX INFO: renamed from: n */
    public VListCell f5882n;

    /* JADX INFO: renamed from: o */
    public VLinear f5883o;

    /* JADX INFO: renamed from: p */
    public VText f5884p;

    /* JADX INFO: renamed from: q */
    public VLinear f5885q;

    /* JADX INFO: renamed from: r */
    public TagContainerLayout f5886r;

    /* JADX INFO: renamed from: s */
    public List<iuh0> f5887s;

    /* JADX INFO: renamed from: t */
    public ja40 f5888t;

    /* JADX INFO: renamed from: u */
    public Settings f5889u;

    /* JADX INFO: renamed from: v */
    public Act f5890v;

    /* JADX INFO: renamed from: w */
    public Map<String, String> f5891w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.IntlNewUIFilterBaseSetting$a */
    public class C0294a implements e30<NewFilterTagItem> {
        public C0294a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(NewFilterTagItem newFilterTagItem) {
            if (NullChecker.a(newFilterTagItem)) {
                int iIndexOfChild = IntlNewUIFilterBaseSetting.this.f5886r.indexOfChild(newFilterTagItem);
                if (!NullChecker.a(IntlNewUIFilterBaseSetting.this.f5889u) || vwb.J(IntlNewUIFilterBaseSetting.this.f5889u.settingGroups)) {
                    return;
                }
                IntlNewUIFilterBaseSetting.this.f5889u.getSettingGroup().search.lookingForGender = IntlNewUIFilterBaseSetting.this.m8777b0(iIndexOfChild);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.IntlNewUIFilterBaseSetting$b */
    public class C0295b implements iqk0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f5893a;

        public C0295b(Act act) {
            this.f5893a = act;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public String m8788a(float f) {
            int i = (int) f;
            if (!IntlCountryCodeController.m5f()) {
                return (i + 1) + this.f5893a.getString(R.string.b2);
            }
            if (i < IntlNewUIFilterBaseSetting.this.f5881m.getValueTo() - 1.0f) {
                i++;
            }
            return i + this.f5893a.getString(R.string.f2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.IntlNewUIFilterBaseSetting$c */
    public class C0296c extends VSlider.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f5895a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f5896b;

        public C0296c(Settings settings, Runnable runnable) {
            this.f5895a = settings;
            this.f5896b = runnable;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m8789a(@NonNull @NotNull VSlider vSlider, boolean z, float f) {
            if (jjb0.m17488c() && !((Boolean) CoreModule.f1534c.f3628e0.f19089t5.get()).booleanValue() && f < 20.0f && this.f5895a.autoAdjustSuggestRadius().booleanValue()) {
                yij0.t(IntlNewUIFilterBaseSetting.this.f5882n, false);
                CoreModule.f1534c.f3628e0.f19089t5.put(Boolean.TRUE);
            }
            if (IntlCountryCodeController.m5f()) {
                Settings settings = this.f5895a;
                if (f == 60.0f) {
                    settings.getSettingGroup().search.radius = this.f5895a.getRadiusAllowedMaximum();
                } else {
                    settings.getSettingGroup().search.radius = Integer.valueOf(this.f5895a.getRadiusAllowedMinimum().intValue() + Math.min(this.f5895a.getRadiusAllowedMaximum().intValue() - this.f5895a.getRadiusAllowedMinimum().intValue(), (int) Math.max(0.0d, i0g0.L(f))));
                }
            } else {
                this.f5895a.getSettingGroup().search.radius = Integer.valueOf(this.f5895a.getRadiusAllowedMinimum().intValue() + Math.min(this.f5895a.getRadiusAllowedMaximum().intValue() - this.f5895a.getRadiusAllowedMinimum().intValue(), Math.max(0, ((int) f) * AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO)));
            }
            this.f5896b.run();
            super.c(vSlider, z, f);
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void m8790b(@NonNull @NotNull VSlider vSlider, boolean z, float f, float f2) {
            super.d(vSlider, z, f, f2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.IntlNewUIFilterBaseSetting$d */
    public class C0297d implements wg50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f5898a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f5899b;

        public C0297d(Settings settings, Runnable runnable) {
            this.f5898a = settings;
            this.f5899b = runnable;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m8793a(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f) {
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void m8794b(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f, float f2) {
            if (f < this.f5898a.getSearchAgeAllowedMinimum().intValue() || f2 < this.f5898a.getSearchAgeAllowedMinimum().intValue() || f > this.f5898a.getSearchAgeAllowedMaximum().intValue() || f2 > this.f5898a.getSearchAgeAllowedMaximum().intValue()) {
                return;
            }
            this.f5898a.getSettingGroup().search.minAge = Integer.valueOf((int) f);
            this.f5898a.getSettingGroup().search.maxAge = Integer.valueOf((int) f2);
            this.f5899b.run();
        }
    }

    public IntlNewUIFilterBaseSetting(Context context) {
        super(context);
        this.f5887s = new ArrayList();
    }

    /* JADX INFO: renamed from: e0 */
    private void m8771e0() {
        e01 e01Var = new e01();
        this.f5891w = e01Var;
        e01Var.put("male", CoreModule.f1533b.getResources().getString(R.string.L1));
        this.f5891w.put("female", CoreModule.f1533b.getResources().getString(R.string.N1));
        this.f5891w.put("nonbinary", CoreModule.f1533b.getResources().getString(R.string.M1));
        this.f5891w.put("both", CoreModule.f1533b.getResources().getString(R.string.L1) + " & " + CoreModule.f1533b.getResources().getString(R.string.N1));
        m8774Y(this.f5882n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m8772j0(View view) {
        CoreModule.f1546o.m25559d().m5675Pa(getContext());
    }

    private void setGenderChoose(LookingFor lookingFor) {
        this.f5888t.m15989o(qne0.f19941h[m8776a0(lookingFor)]);
    }

    private void setLookingForGender(Settings settings) {
        List<LookingFor> list = settings.getSettingGroup().gender.lookingForGenders;
        if (list.size() > 2) {
            this.f5884p.setText(this.f5890v.getResources().getString(R.string.O1));
            return;
        }
        if (list.size() <= 0) {
            this.f5884p.setText(this.f5891w.get(settings.getLookingFor().toString()));
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (LookingFor lookingFor : list) {
            if (!sb.toString().isEmpty()) {
                sb.append(" & ");
            }
            sb.append(this.f5891w.get(lookingFor.toString()));
        }
        this.f5884p.setText(sb.toString());
    }

    /* JADX INFO: renamed from: X */
    public final void m8773X(View view) {
        poo.a(this, view);
    }

    /* JADX INFO: renamed from: Y */
    public final void m8774Y(VListCell vListCell) {
        ImageView imageView = (ImageView) vListCell.findViewById(a5c0.u);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = t100.d(24.0f);
        layoutParams.width = t100.d(24.0f);
    }

    /* JADX INFO: renamed from: Z */
    public void m8775Z(String str, String str2) {
        this.f5872d.setText(str);
        this.f5873e.setText(str2);
    }

    /* JADX INFO: renamed from: a0 */
    public final int m8776a0(LookingFor lookingFor) {
        if (TEnum.equals(lookingFor, "male")) {
            return 0;
        }
        return TEnum.equals(lookingFor, "female") ? 1 : 2;
    }

    /* JADX INFO: renamed from: b0 */
    public final LookingFor m8777b0(int i) {
        if (i == 0) {
            return LookingFor.get("male");
        }
        return i == 1 ? LookingFor.get("female") : LookingFor.get("both");
    }

    /* JADX INFO: renamed from: c0 */
    public void m8778c0(final Settings settings) {
        setLookingForGender(settings);
        if (qib0.f19804b0.f17706a.mo67rq(settings.getSettingGroup())) {
            xdl0.M(this.f5883o, true);
            xdl0.E0(this.f5883o, new View.OnClickListener() { // from class: l.koo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15927a.m8780f0(settings, view);
                }
            });
        } else {
            xdl0.M(this.f5885q, true);
            if (this.f5888t == null) {
                m8779d0();
            }
            setGenderChoose(settings.getLookingFor());
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m8779d0() {
        ja40 ja40Var = new ja40();
        this.f5888t = ja40Var;
        ja40Var.m15988n(new C0294a());
        this.f5886r.setCanAdjustChildHeight(false);
        this.f5886r.setIsSquare(true);
        this.f5886r.setAdapter(this.f5888t);
        this.f5888t.m17409r(Arrays.asList(qne0.f19941h));
        this.f5888t.m15986l();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m8780f0(Settings settings, View view) {
        m8785l0(settings.getSettingGroup());
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m8781g0(Act act, Settings settings) {
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
        this.f5879k.setText(strConcat);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m8782h0(Settings settings, View view) {
        settings.getSettingGroup().search.autoAdjustRadius = Boolean.valueOf(yij0.T(this.f5882n));
        CoreModule.f1534c.f3628e0.f19089t5.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m8783i0(Settings settings) {
        TextView textView = this.f5877i;
        StringBuilder sb = new StringBuilder();
        sb.append(settings.getSearchMinAge());
        sb.append(" - ");
        sb.append(settings.getSearchMaxAge());
        sb.append(settings.getSearchMaxAge().equals(settings.getSearchAgeAllowedMaximum()) ? "+" : "");
        textView.setText(sb.toString());
    }

    /* JADX INFO: renamed from: k0 */
    public void m8784k0(final Act act, final Settings settings) {
        boolean z;
        this.f5890v = act;
        this.f5889u = settings;
        m8778c0(settings);
        Runnable runnable = new Runnable() { // from class: l.loo
            @Override // java.lang.Runnable
            public final void run() {
                this.f16540a.m8781g0(act, settings);
            }
        };
        runnable.run();
        boolean zM5f = IntlCountryCodeController.m5f();
        VSlider vSlider = this.f5881m;
        boolean z2 = true;
        if (zM5f) {
            float f = 60.0f;
            vSlider.setValueTo(60.0f);
            double dIntValue = ((double) settings.getSearchRadius().intValue()) * 6.214E-4d;
            if (dIntValue >= 59.0d && settings.getSearchRadius().intValue() < settings.getRadiusAllowedMaximum().intValue()) {
                f = 59.0f;
            } else if (settings.getSearchRadius().intValue() < settings.getRadiusAllowedMaximum().intValue()) {
                f = (int) dIntValue;
            }
            this.f5881m.setValue(f);
        } else {
            vSlider.setValueTo((settings.getRadiusAllowedMaximum().intValue() - settings.getRadiusAllowedMinimum().intValue()) / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
            int iIntValue = (settings.getSearchRadius().intValue() - settings.getRadiusAllowedMinimum().intValue()) / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
            float f2 = iIntValue;
            if (f2 == this.f5881m.getValue()) {
                this.f5881m.setValue(iIntValue + 1);
            }
            this.f5881m.setValue(f2);
        }
        this.f5881m.setLabelFormatter(new C0295b(act));
        this.f5881m.f(new C0296c(settings, runnable));
        yij0.t(this.f5882n, settings.autoAdjustSuggestRadius().booleanValue());
        this.f5882n.setOnClickListener(new View.OnClickListener() { // from class: l.moo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17155a.m8782h0(settings, view);
            }
        });
        Runnable runnable2 = new Runnable() { // from class: l.noo
            @Override // java.lang.Runnable
            public final void run() {
                this.f17764a.m8783i0(settings);
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
        this.f5878j.setValueFrom(fIntValue);
        this.f5878j.setValueTo(fIntValue2);
        float fIntValue3 = settings.getSearchMinAge().intValue();
        float fIntValue4 = settings.getSearchMaxAge().intValue();
        if (fIntValue3 <= 0.0f) {
            fIntValue3 = User.AGE_DEFAULT_SEARCH_MIN;
            z = true;
        }
        if (fIntValue4 <= 0.0f) {
            fIntValue4 = User.AGE_DEFAULT_SEARCH_MAX;
        } else {
            z2 = z;
        }
        float fMax = Math.max(fIntValue, fIntValue3);
        if (z2) {
            au2.m12238w(new IllegalStateException("wrong age ranges(from advanced filter), uid:" + CoreModule.m1850H().userId() + "; allowedMinimum:" + fIntValue + "; allowedMaximum:" + fIntValue2 + " searchMinAge:" + fMax + "; searchMaxAge:" + fIntValue4));
        }
        this.f5878j.setValues(new Float[]{Float.valueOf(fMax), Float.valueOf(fIntValue4)});
        this.f5878j.f(new C0297d(settings, runnable2));
        this.f5871c.setOnClickListener(new View.OnClickListener() { // from class: l.ooo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18308a.m8772j0(view);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public void m8785l0(SettingGroups settingGroups) {
        if (!NullChecker.a(this.f5890v) || this.f5890v.isFinishing()) {
            return;
        }
        qib0.f19804b0.f17707b.Km(this.f5890v, settingGroups);
    }

    /* JADX INFO: renamed from: m0 */
    public void m8786m0(String str) {
        if (NullChecker.b(this.f5873e)) {
            this.f5873e.setText(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8773X(this);
        m8771e0();
    }

    public IntlNewUIFilterBaseSetting(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5887s = new ArrayList();
    }

    public IntlNewUIFilterBaseSetting(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5887s = new ArrayList();
    }
}
