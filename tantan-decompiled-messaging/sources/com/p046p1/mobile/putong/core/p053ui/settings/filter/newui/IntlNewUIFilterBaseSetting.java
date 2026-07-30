package com.p046p1.mobile.putong.core.p053ui.settings.filter.newui;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.tags.TagContainerLayout;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.LookingFor;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
import p149l.e01;
import p149l.e30;
import p149l.i0g0;
import p149l.iqk0;
import p149l.iuh0;
import p149l.ja40;
import p149l.jjb0;
import p149l.mqa;
import p149l.poo;
import p149l.qib0;
import p149l.qne0;
import p149l.t100;
import p149l.vwb;
import p149l.wg50;
import p149l.xdl0;
import p149l.yij0;

/* JADX INFO: loaded from: classes9.dex */
public class IntlNewUIFilterBaseSetting extends VLinear {

    /* JADX INFO: renamed from: c */
    public VFrame f36090c;

    /* JADX INFO: renamed from: d */
    public VText f36091d;

    /* JADX INFO: renamed from: e */
    public VText f36092e;

    /* JADX INFO: renamed from: f */
    public VText f36093f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f36094g;

    /* JADX INFO: renamed from: h */
    public VText f36095h;

    /* JADX INFO: renamed from: i */
    public TextView f36096i;

    /* JADX INFO: renamed from: j */
    public VRangeSlider f36097j;

    /* JADX INFO: renamed from: k */
    public TextView f36098k;

    /* JADX INFO: renamed from: l */
    public VText f36099l;

    /* JADX INFO: renamed from: m */
    public VSlider f36100m;

    /* JADX INFO: renamed from: n */
    public VListCell f36101n;

    /* JADX INFO: renamed from: o */
    public VLinear f36102o;

    /* JADX INFO: renamed from: p */
    public VText f36103p;

    /* JADX INFO: renamed from: q */
    public VLinear f36104q;

    /* JADX INFO: renamed from: r */
    public TagContainerLayout f36105r;

    /* JADX INFO: renamed from: s */
    public List<iuh0> f36106s;

    /* JADX INFO: renamed from: t */
    public ja40 f36107t;

    /* JADX INFO: renamed from: u */
    public Settings f36108u;

    /* JADX INFO: renamed from: v */
    public Act f36109v;

    /* JADX INFO: renamed from: w */
    public Map<String, String> f36110w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.IntlNewUIFilterBaseSetting$a */
    public class C8858a implements e30<NewFilterTagItem> {
        public C8858a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(NewFilterTagItem newFilterTagItem) {
            if (NullChecker.m81303a(newFilterTagItem)) {
                int iIndexOfChild = IntlNewUIFilterBaseSetting.this.f36105r.indexOfChild(newFilterTagItem);
                if (!NullChecker.m81303a(IntlNewUIFilterBaseSetting.this.f36108u) || vwb.m200296J(IntlNewUIFilterBaseSetting.this.f36108u.settingGroups)) {
                    return;
                }
                IntlNewUIFilterBaseSetting.this.f36108u.getSettingGroup().search.lookingForGender = IntlNewUIFilterBaseSetting.this.m55404b0(iIndexOfChild);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.IntlNewUIFilterBaseSetting$b */
    public class C8859b implements iqk0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f36112a;

        public C8859b(Act act) {
            this.f36112a = act;
        }

        @Override // p149l.iqk0
        @NonNull
        /* JADX INFO: renamed from: a */
        public String mo55415a(float f) {
            int i = (int) f;
            if (!IntlCountryCodeController.m28110f()) {
                return (i + 1) + this.f36112a.getString(R$string.f27824b2);
            }
            if (i < IntlNewUIFilterBaseSetting.this.f36100m.getValueTo() - 1.0f) {
                i++;
            }
            return i + this.f36112a.getString(R$string.f27848f2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.IntlNewUIFilterBaseSetting$c */
    public class C8860c extends VSlider.AbstractC22568a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f36114a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f36115b;

        public C8860c(Settings settings, Runnable runnable) {
            this.f36114a = settings;
            this.f36115b = runnable;
        }

        @Override // p147v.VSlider.AbstractC22568a, p149l.wg50
        /* JADX INFO: renamed from: c */
        public void mo55416a(@NonNull @NotNull VSlider vSlider, boolean z, float f) {
            if (jjb0.m141785c() && !CoreModule.f17545c.f19639e0.f149477t5.get().booleanValue() && f < 20.0f && this.f36114a.autoAdjustSuggestRadius().booleanValue()) {
                yij0.m214964t(IntlNewUIFilterBaseSetting.this.f36101n, false);
                CoreModule.f17545c.f19639e0.f149477t5.put(Boolean.TRUE);
            }
            if (IntlCountryCodeController.m28110f()) {
                Settings settings = this.f36114a;
                if (f == 60.0f) {
                    settings.getSettingGroup().search.radius = this.f36114a.getRadiusAllowedMaximum();
                } else {
                    settings.getSettingGroup().search.radius = Integer.valueOf(this.f36114a.getRadiusAllowedMinimum().intValue() + Math.min(this.f36114a.getRadiusAllowedMaximum().intValue() - this.f36114a.getRadiusAllowedMinimum().intValue(), (int) Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, i0g0.m133845L(f))));
                }
            } else {
                this.f36114a.getSettingGroup().search.radius = Integer.valueOf(this.f36114a.getRadiusAllowedMinimum().intValue() + Math.min(this.f36114a.getRadiusAllowedMaximum().intValue() - this.f36114a.getRadiusAllowedMinimum().intValue(), Math.max(0, ((int) f) * 1000)));
            }
            this.f36115b.run();
            super.mo55416a(vSlider, z, f);
        }

        @Override // p147v.VSlider.AbstractC22568a, p149l.wg50
        /* JADX INFO: renamed from: d */
        public void mo55417b(@NonNull @NotNull VSlider vSlider, boolean z, float f, float f2) {
            super.mo55417b(vSlider, z, f, f2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.IntlNewUIFilterBaseSetting$d */
    public class C8861d implements wg50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Settings f36117a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f36118b;

        public C8861d(Settings settings, Runnable runnable) {
            this.f36117a = settings;
            this.f36118b = runnable;
        }

        @Override // p149l.wg50
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo55416a(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f) {
        }

        @Override // p149l.wg50
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo55417b(@NonNull @NotNull VRangeSlider vRangeSlider, boolean z, float f, float f2) {
            if (f < this.f36117a.getSearchAgeAllowedMinimum().intValue() || f2 < this.f36117a.getSearchAgeAllowedMinimum().intValue() || f > this.f36117a.getSearchAgeAllowedMaximum().intValue() || f2 > this.f36117a.getSearchAgeAllowedMaximum().intValue()) {
                return;
            }
            this.f36117a.getSettingGroup().search.minAge = Integer.valueOf((int) f);
            this.f36117a.getSettingGroup().search.maxAge = Integer.valueOf((int) f2);
            this.f36118b.run();
        }
    }

    public IntlNewUIFilterBaseSetting(Context context) {
        super(context);
        this.f36106s = new ArrayList();
    }

    /* JADX INFO: renamed from: e0 */
    private void m55398e0() {
        e01 e01Var = new e01();
        this.f36110w = e01Var;
        e01Var.put("male", CoreModule.f17544b.getResources().getString(R$string.f27742L1));
        this.f36110w.put("female", CoreModule.f17544b.getResources().getString(R$string.f27752N1));
        this.f36110w.put("nonbinary", CoreModule.f17544b.getResources().getString(R$string.f27747M1));
        this.f36110w.put("both", CoreModule.f17544b.getResources().getString(R$string.f27742L1) + " & " + CoreModule.f17544b.getResources().getString(R$string.f27752N1));
        m55401Y(this.f36101n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m55399j0(View view) {
        CoreModule.f17557o.m195057d().mo33738Pa(getContext());
    }

    private void setGenderChoose(LookingFor lookingFor) {
        this.f36107t.m127951o(qne0.f155428h[m55403a0(lookingFor)]);
    }

    private void setLookingForGender(Settings settings) {
        List<LookingFor> list = settings.getSettingGroup().gender.lookingForGenders;
        if (list.size() > 2) {
            this.f36103p.setText(this.f36109v.getResources().getString(R$string.f27757O1));
            return;
        }
        if (list.size() <= 0) {
            this.f36103p.setText(this.f36110w.get(settings.getLookingFor().toString()));
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (LookingFor lookingFor : list) {
            if (!sb.toString().isEmpty()) {
                sb.append(" & ");
            }
            sb.append(this.f36110w.get(lookingFor.toString()));
        }
        this.f36103p.setText(sb.toString());
    }

    /* JADX INFO: renamed from: X */
    public final void m55400X(View view) {
        poo.m170632a(this, view);
    }

    /* JADX INFO: renamed from: Y */
    public final void m55401Y(VListCell vListCell) {
        ImageView imageView = (ImageView) vListCell.findViewById(a5c0.f67698u);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = t100.m186890d(24.0f);
        layoutParams.width = t100.m186890d(24.0f);
    }

    /* JADX INFO: renamed from: Z */
    public void m55402Z(String str, String str2) {
        this.f36091d.setText(str);
        this.f36092e.setText(str2);
    }

    /* JADX INFO: renamed from: a0 */
    public final int m55403a0(LookingFor lookingFor) {
        if (TEnum.equals(lookingFor, "male")) {
            return 0;
        }
        return TEnum.equals(lookingFor, "female") ? 1 : 2;
    }

    /* JADX INFO: renamed from: b0 */
    public final LookingFor m55404b0(int i) {
        if (i == 0) {
            return LookingFor.get("male");
        }
        return i == 1 ? LookingFor.get("female") : LookingFor.get("both");
    }

    /* JADX INFO: renamed from: c0 */
    public void m55405c0(final Settings settings) {
        setLookingForGender(settings);
        if (qib0.f154713b0.f139230a.mo28172rq(settings.getSettingGroup())) {
            xdl0.m208344M(this.f36102o, true);
            xdl0.m208329E0(this.f36102o, new View.OnClickListener() { // from class: l.koo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f124052a.m55407f0(settings, view);
                }
            });
        } else {
            xdl0.m208344M(this.f36104q, true);
            if (this.f36107t == null) {
                m55406d0();
            }
            setGenderChoose(settings.getLookingFor());
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m55406d0() {
        ja40 ja40Var = new ja40();
        this.f36107t = ja40Var;
        ja40Var.m127950n(new C8858a());
        this.f36105r.setCanAdjustChildHeight(false);
        this.f36105r.setIsSquare(true);
        this.f36105r.setAdapter(this.f36107t);
        this.f36107t.m140687r(Arrays.asList(qne0.f155428h));
        this.f36107t.m127948l();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m55407f0(Settings settings, View view) {
        m55412l0(settings.getSettingGroup());
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m55408g0(Act act, Settings settings) {
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
        this.f36098k.setText(strConcat);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m55409h0(Settings settings, View view) {
        settings.getSettingGroup().search.autoAdjustRadius = Boolean.valueOf(yij0.m214942T(this.f36101n));
        CoreModule.f17545c.f19639e0.f149477t5.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m55410i0(Settings settings) {
        TextView textView = this.f36096i;
        StringBuilder sb = new StringBuilder();
        sb.append(settings.getSearchMinAge());
        sb.append(" - ");
        sb.append(settings.getSearchMaxAge());
        sb.append(settings.getSearchMaxAge().equals(settings.getSearchAgeAllowedMaximum()) ? Marker.ANY_NON_NULL_MARKER : "");
        textView.setText(sb.toString());
    }

    /* JADX INFO: renamed from: k0 */
    public void m55411k0(final Act act, final Settings settings) {
        boolean z;
        this.f36109v = act;
        this.f36108u = settings;
        m55405c0(settings);
        Runnable runnable = new Runnable() { // from class: l.loo
            @Override // java.lang.Runnable
            public final void run() {
                this.f129124a.m55408g0(act, settings);
            }
        };
        runnable.run();
        boolean zM28110f = IntlCountryCodeController.m28110f();
        VSlider vSlider = this.f36100m;
        boolean z2 = true;
        if (zM28110f) {
            float f = 60.0f;
            vSlider.setValueTo(60.0f);
            double dIntValue = ((double) settings.getSearchRadius().intValue()) * 6.214E-4d;
            if (dIntValue >= 59.0d && settings.getSearchRadius().intValue() < settings.getRadiusAllowedMaximum().intValue()) {
                f = 59.0f;
            } else if (settings.getSearchRadius().intValue() < settings.getRadiusAllowedMaximum().intValue()) {
                f = (int) dIntValue;
            }
            this.f36100m.setValue(f);
        } else {
            vSlider.setValueTo((settings.getRadiusAllowedMaximum().intValue() - settings.getRadiusAllowedMinimum().intValue()) / 1000);
            int iIntValue = (settings.getSearchRadius().intValue() - settings.getRadiusAllowedMinimum().intValue()) / 1000;
            float f2 = iIntValue;
            if (f2 == this.f36100m.getValue()) {
                this.f36100m.setValue(iIntValue + 1);
            }
            this.f36100m.setValue(f2);
        }
        this.f36100m.setLabelFormatter(new C8859b(act));
        this.f36100m.mo222965f(new C8860c(settings, runnable));
        yij0.m214964t(this.f36101n, settings.autoAdjustSuggestRadius().booleanValue());
        this.f36101n.setOnClickListener(new View.OnClickListener() { // from class: l.moo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134927a.m55409h0(settings, view);
            }
        });
        Runnable runnable2 = new Runnable() { // from class: l.noo
            @Override // java.lang.Runnable
            public final void run() {
                this.f139856a.m55410i0(settings);
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
        this.f36097j.setValueFrom(fIntValue);
        this.f36097j.setValueTo(fIntValue2);
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
            au2.m98935w(new IllegalStateException("wrong age ranges(from advanced filter), uid:" + CoreModule.m29931H().userId() + "; allowedMinimum:" + fIntValue + "; allowedMaximum:" + fIntValue2 + " searchMinAge:" + fMax + "; searchMaxAge:" + fIntValue4));
        }
        this.f36097j.setValues(Float.valueOf(fMax), Float.valueOf(fIntValue4));
        this.f36097j.mo222965f(new C8861d(settings, runnable2));
        this.f36090c.setOnClickListener(new View.OnClickListener() { // from class: l.ooo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144897a.m55399j0(view);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public void m55412l0(SettingGroups settingGroups) {
        if (!NullChecker.m81303a(this.f36109v) || this.f36109v.isFinishing()) {
            return;
        }
        qib0.f154713b0.f139231b.mo30703Km(this.f36109v, settingGroups);
    }

    /* JADX INFO: renamed from: m0 */
    public void m55413m0(String str) {
        if (NullChecker.m81304b(this.f36092e)) {
            this.f36092e.setText(str);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55400X(this);
        m55398e0();
    }

    public IntlNewUIFilterBaseSetting(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36106s = new ArrayList();
    }

    public IntlNewUIFilterBaseSetting(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36106s = new ArrayList();
    }
}
