package com.p051p1.mobile.putong.core.p058ui.settings.filter.newui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.tags.TagContainerLayout;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.LookingFor;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
import p153l.jyb;
import p153l.l01;
import p153l.nrb0;
import p153l.ozk0;
import p153l.pqo;
import p153l.q2i0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qu2;
import p153l.uqb0;
import p153l.xi40;
import p153l.xve0;
import p153l.y20;
import p153l.yra;

/* JADX INFO: loaded from: classes12.dex */
public class IntlNewUIFilterBaseSetting extends VLinear {

    /* JADX INFO: renamed from: c */
    public VFrame f36938c;

    /* JADX INFO: renamed from: d */
    public VText f36939d;

    /* JADX INFO: renamed from: e */
    public VText f36940e;

    /* JADX INFO: renamed from: f */
    public VText f36941f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f36942g;

    /* JADX INFO: renamed from: h */
    public VText f36943h;

    /* JADX INFO: renamed from: i */
    public TextView f36944i;

    /* JADX INFO: renamed from: j */
    public VRangeSlider f36945j;

    /* JADX INFO: renamed from: k */
    public TextView f36946k;

    /* JADX INFO: renamed from: l */
    public VText f36947l;

    /* JADX INFO: renamed from: m */
    public VSlider f36948m;

    /* JADX INFO: renamed from: n */
    public VListCell f36949n;

    /* JADX INFO: renamed from: o */
    public VLinear f36950o;

    /* JADX INFO: renamed from: p */
    public VText f36951p;

    /* JADX INFO: renamed from: q */
    public VLinear f36952q;

    /* JADX INFO: renamed from: r */
    public TagContainerLayout f36953r;

    /* JADX INFO: renamed from: s */
    public List<q2i0> f36954s;

    /* JADX INFO: renamed from: t */
    public xi40 f36955t;

    /* JADX INFO: renamed from: u */
    public Settings f36956u;

    /* JADX INFO: renamed from: v */
    public Act f36957v;

    /* JADX INFO: renamed from: w */
    public Map<String, String> f36958w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.IntlNewUIFilterBaseSetting$a */
    public class C9021a implements y20<NewFilterTagItem> {
        public C9021a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(NewFilterTagItem newFilterTagItem) {
            if (NullChecker.m82486a(newFilterTagItem)) {
                int iIndexOfChild = IntlNewUIFilterBaseSetting.this.f36953r.indexOfChild(newFilterTagItem);
                if (!NullChecker.m82486a(IntlNewUIFilterBaseSetting.this.f36956u) || jyb.m147479J(IntlNewUIFilterBaseSetting.this.f36956u.settingGroups)) {
                    return;
                }
                IntlNewUIFilterBaseSetting.this.f36956u.getSettingGroup().search.lookingForGender = IntlNewUIFilterBaseSetting.this.m56587b0(iIndexOfChild);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.IntlNewUIFilterBaseSetting$b */
    public class C9022b implements ozk0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f36960a;

        public C9022b(Act act) {
            this.f36960a = act;
        }

        @Override // p153l.ozk0
        @NonNull
        /* JADX INFO: renamed from: a */
        public String mo56598a(float f) {
            int i = (int) f;
            if (!IntlCountryCodeController.m29109f()) {
                return (i + 1) + this.f36960a.getString(R$string.f28672b2);
            }
            if (i < IntlNewUIFilterBaseSetting.this.f36948m.getValueTo() - 1.0f) {
                i++;
            }
            return i + this.f36960a.getString(R$string.f28696f2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.IntlNewUIFilterBaseSetting$c */
    public class C9023c extends VSlider.AbstractC22683a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f36962a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f36963b;

        public C9023c(Settings settings, Runnable runnable) {
            this.f36962a = settings;
            this.f36963b = runnable;
        }

        @Override // p151v.VSlider.AbstractC22683a, p153l.cp50
        /* JADX INFO: renamed from: c */
        public void mo56599a(@NonNull @NotNull VSlider vSlider, boolean z, float f) {
            if (nrb0.m164467c() && !CoreModule.f18264c.f20381e0.f89334t5.get().booleanValue() && f < 20.0f && this.f36962a.autoAdjustSuggestRadius().booleanValue()) {
                bsj0.m106284t(IntlNewUIFilterBaseSetting.this.f36949n, false);
                CoreModule.f18264c.f20381e0.f89334t5.put(Boolean.TRUE);
            }
            if (IntlCountryCodeController.m29109f()) {
                Settings settings = this.f36962a;
                if (f == 60.0f) {
                    settings.getSettingGroup().search.radius = this.f36962a.getRadiusAllowedMaximum();
                } else {
                    settings.getSettingGroup().search.radius = Integer.valueOf(this.f36962a.getRadiusAllowedMinimum().intValue() + Math.min(this.f36962a.getRadiusAllowedMaximum().intValue() - this.f36962a.getRadiusAllowedMinimum().intValue(), (int) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, q8g0.m175780L(f))));
                }
            } else {
                this.f36962a.getSettingGroup().search.radius = Integer.valueOf(this.f36962a.getRadiusAllowedMinimum().intValue() + Math.min(this.f36962a.getRadiusAllowedMaximum().intValue() - this.f36962a.getRadiusAllowedMinimum().intValue(), Math.max(0, ((int) f) * 1000)));
            }
            this.f36963b.run();
            super.mo56599a(vSlider, z, f);
        }

        @Override // p151v.VSlider.AbstractC22683a, p153l.cp50
        /* JADX INFO: renamed from: d */
        public void mo56600b(@NonNull @NotNull VSlider vSlider, boolean z, float f, float f2) {
            super.mo56600b(vSlider, z, f, f2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.IntlNewUIFilterBaseSetting$d */
    public class C9024d implements cp50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f36965a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f36966b;

        public C9024d(Settings settings, Runnable runnable) {
            this.f36965a = settings;
            this.f36966b = runnable;
        }

        @Override // p153l.cp50
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo56599a(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f) {
        }

        @Override // p153l.cp50
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo56600b(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f, float f2) {
            if (f < this.f36965a.getSearchAgeAllowedMinimum().intValue() || f2 < this.f36965a.getSearchAgeAllowedMinimum().intValue() || f > this.f36965a.getSearchAgeAllowedMaximum().intValue() || f2 > this.f36965a.getSearchAgeAllowedMaximum().intValue()) {
                return;
            }
            this.f36965a.getSettingGroup().search.minAge = Integer.valueOf((int) f);
            this.f36965a.getSettingGroup().search.maxAge = Integer.valueOf((int) f2);
            this.f36966b.run();
        }
    }

    public IntlNewUIFilterBaseSetting(Context context) {
        super(context);
        this.f36954s = new ArrayList();
    }

    /* JADX INFO: renamed from: e0 */
    private void m56581e0() {
        l01 l01Var = new l01();
        this.f36958w = l01Var;
        l01Var.put("male", CoreModule.f18263b.getResources().getString(R$string.f28590L1));
        this.f36958w.put("female", CoreModule.f18263b.getResources().getString(R$string.f28600N1));
        this.f36958w.put("nonbinary", CoreModule.f18263b.getResources().getString(R$string.f28595M1));
        this.f36958w.put("both", CoreModule.f18263b.getResources().getString(R$string.f28590L1) + " & " + CoreModule.f18263b.getResources().getString(R$string.f28600N1));
        m56584Y(this.f36949n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m56582j0(View view) {
        CoreModule.f18276o.m132214d().mo34741Pa(getContext());
    }

    private void setGenderChoose(LookingFor lookingFor) {
        this.f36955t.m165618o(xve0.f196392h[m56586a0(lookingFor)]);
    }

    private void setLookingForGender(Settings settings) {
        List<LookingFor> list = settings.getSettingGroup().gender.lookingForGenders;
        if (list.size() > 2) {
            this.f36951p.setText(this.f36957v.getResources().getString(R$string.f28605O1));
            return;
        }
        if (list.size() <= 0) {
            this.f36951p.setText(this.f36958w.get(settings.getLookingFor().toString()));
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (LookingFor lookingFor : list) {
            if (!sb.toString().isEmpty()) {
                sb.append(" & ");
            }
            sb.append(this.f36958w.get(lookingFor.toString()));
        }
        this.f36951p.setText(sb.toString());
    }

    /* JADX INFO: renamed from: X */
    public final void m56583X(View view) {
        pqo.m173374a(this, view);
    }

    /* JADX INFO: renamed from: Y */
    public final void m56584Y(VListCell vListCell) {
        ImageView imageView = (ImageView) vListCell.findViewById(gdc0.f103693u);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = qa00.m175859d(24.0f);
        layoutParams.width = qa00.m175859d(24.0f);
    }

    /* JADX INFO: renamed from: Z */
    public void m56585Z(String str, String str2) {
        this.f36939d.setText(str);
        this.f36940e.setText(str2);
    }

    /* JADX INFO: renamed from: a0 */
    public final int m56586a0(LookingFor lookingFor) {
        if (TEnum.equals(lookingFor, "male")) {
            return 0;
        }
        return TEnum.equals(lookingFor, "female") ? 1 : 2;
    }

    /* JADX INFO: renamed from: b0 */
    public final LookingFor m56587b0(int i) {
        if (i == 0) {
            return LookingFor.get("male");
        }
        return i == 1 ? LookingFor.get("female") : LookingFor.get("both");
    }

    /* JADX INFO: renamed from: c0 */
    public void m56588c0(final Settings settings) {
        setLookingForGender(settings);
        if (uqb0.f180396b0.f170324a.mo29171rq(settings.getSettingGroup())) {
            bnl0.m105524M(this.f36950o, true);
            bnl0.m105509E0(this.f36950o, new View.OnClickListener() { // from class: l.kqo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f128262a.m56590f0(settings, view);
                }
            });
        } else {
            bnl0.m105524M(this.f36952q, true);
            if (this.f36955t == null) {
                m56589d0();
            }
            setGenderChoose(settings.getLookingFor());
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m56589d0() {
        xi40 xi40Var = new xi40();
        this.f36955t = xi40Var;
        xi40Var.m165617n(new C9021a());
        this.f36953r.setCanAdjustChildHeight(false);
        this.f36953r.setIsSquare(true);
        this.f36953r.setAdapter(this.f36955t);
        this.f36955t.m211098r(Arrays.asList(xve0.f196392h));
        this.f36955t.m165615l();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m56590f0(Settings settings, View view) {
        m56595l0(settings.getSettingGroup());
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m56591g0(Act act, Settings settings) {
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
        this.f36946k.setText(strConcat);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m56592h0(Settings settings, View view) {
        settings.getSettingGroup().search.autoAdjustRadius = Boolean.valueOf(bsj0.m106262T(this.f36949n));
        CoreModule.f18264c.f20381e0.f89334t5.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m56593i0(Settings settings) {
        TextView textView = this.f36944i;
        StringBuilder sb = new StringBuilder();
        sb.append(settings.getSearchMinAge());
        sb.append(" - ");
        sb.append(settings.getSearchMaxAge());
        sb.append(settings.getSearchMaxAge().equals(settings.getSearchAgeAllowedMaximum()) ? Marker.ANY_NON_NULL_MARKER : "");
        textView.setText(sb.toString());
    }

    /* JADX INFO: renamed from: k0 */
    public void m56594k0(final Act act, final Settings settings) {
        boolean z;
        this.f36957v = act;
        this.f36956u = settings;
        m56588c0(settings);
        Runnable runnable = new Runnable() { // from class: l.lqo
            @Override // java.lang.Runnable
            public final void run() {
                this.f133233a.m56591g0(act, settings);
            }
        };
        runnable.run();
        boolean zM29109f = IntlCountryCodeController.m29109f();
        VSlider vSlider = this.f36948m;
        boolean z2 = true;
        if (zM29109f) {
            float f = 60.0f;
            vSlider.setValueTo(60.0f);
            double dIntValue = ((double) settings.getSearchRadius().intValue()) * 6.214E-4d;
            if (dIntValue >= 59.0d && settings.getSearchRadius().intValue() < settings.getRadiusAllowedMaximum().intValue()) {
                f = 59.0f;
            } else if (settings.getSearchRadius().intValue() < settings.getRadiusAllowedMaximum().intValue()) {
                f = (int) dIntValue;
            }
            this.f36948m.setValue(f);
        } else {
            vSlider.setValueTo((settings.getRadiusAllowedMaximum().intValue() - settings.getRadiusAllowedMinimum().intValue()) / 1000);
            int iIntValue = (settings.getSearchRadius().intValue() - settings.getRadiusAllowedMinimum().intValue()) / 1000;
            float f2 = iIntValue;
            if (f2 == this.f36948m.getValue()) {
                this.f36948m.setValue(iIntValue + 1);
            }
            this.f36948m.setValue(f2);
        }
        this.f36948m.setLabelFormatter(new C9022b(act));
        this.f36948m.mo224211f(new C9023c(settings, runnable));
        bsj0.m106284t(this.f36949n, settings.autoAdjustSuggestRadius().booleanValue());
        this.f36949n.setOnClickListener(new View.OnClickListener() { // from class: l.mqo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138116a.m56592h0(settings, view);
            }
        });
        Runnable runnable2 = new Runnable() { // from class: l.nqo
            @Override // java.lang.Runnable
            public final void run() {
                this.f143247a.m56593i0(settings);
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
        this.f36945j.setValueFrom(fIntValue);
        this.f36945j.setValueTo(fIntValue2);
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
            qu2.m178128w(new IllegalStateException("wrong age ranges(from advanced filter), uid:" + CoreModule.m30929H().userId() + "; allowedMinimum:" + fIntValue + "; allowedMaximum:" + fIntValue2 + " searchMinAge:" + fMax + "; searchMaxAge:" + fIntValue4));
        }
        this.f36945j.setValues(Float.valueOf(fMax), Float.valueOf(fIntValue4));
        this.f36945j.mo224211f(new C9024d(settings, runnable2));
        this.f36938c.setOnClickListener(new View.OnClickListener() { // from class: l.oqo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148606a.m56582j0(view);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public void m56595l0(SettingGroups settingGroups) {
        if (!NullChecker.m82486a(this.f36957v) || this.f36957v.isFinishing()) {
            return;
        }
        uqb0.f180396b0.f170325b.mo31706Km(this.f36957v, settingGroups);
    }

    /* JADX INFO: renamed from: m0 */
    public void m56596m0(String str) {
        if (NullChecker.m82487b(this.f36940e)) {
            this.f36940e.setText(str);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56583X(this);
        m56581e0();
    }

    public IntlNewUIFilterBaseSetting(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36954s = new ArrayList();
    }

    public IntlNewUIFilterBaseSetting(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36954s = new ArrayList();
    }
}
