package com.p051p1.mobile.putong.core.p058ui.visitor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.VisitorFilterSettings;
import org.jetbrains.annotations.NotNull;
import p151v.VRangeSlider;
import p151v.VText;
import p153l.afm0;
import p153l.cp50;
import p153l.ghm0;
import p153l.i4g0;
import p153l.jyb;

/* JADX INFO: loaded from: classes12.dex */
public class VisitorsFilterItemAgeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f38937a;

    /* JADX INFO: renamed from: b */
    public VRangeSlider f38938b;

    /* JADX INFO: renamed from: c */
    public VRangeSlider.InterfaceC22680a f38939c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.VisitorsFilterItemAgeView$a */
    public class C9204a implements cp50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VisitorFilterSettings f38940a;

        public C9204a(VisitorFilterSettings visitorFilterSettings) {
            this.f38940a = visitorFilterSettings;
        }

        @Override // p153l.cp50
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo56599a(@NonNull VRangeSlider vRangeSlider, boolean z, float f) {
        }

        @Override // p153l.cp50
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo56600b(@NonNull VRangeSlider vRangeSlider, boolean z, float f, float f2) {
            int iMax = Math.max((int) f, afm0.m97514e());
            int iMin = Math.min((int) f2, afm0.m97513d());
            VisitorFilterSettings visitorFilterSettings = this.f38940a;
            visitorFilterSettings.minAge = iMax;
            visitorFilterSettings.maxAge = iMin;
            VisitorsFilterItemAgeView.this.f38937a.setText(C9212e.m59144a(iMax, iMin));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.VisitorsFilterItemAgeView$b */
    public class C9205b implements VRangeSlider.InterfaceC22680a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VisitorFilterSettings f38942a;

        public C9205b(VisitorFilterSettings visitorFilterSettings) {
            this.f38942a = visitorFilterSettings;
        }

        @Override // p153l.dok0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo56667a(@NonNull @NotNull VRangeSlider vRangeSlider) {
        }

        @Override // p153l.dok0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo56668b(@NonNull @NotNull VRangeSlider vRangeSlider) {
            i4g0.m138524v("e_advanced_filter_age", "p_my_visitor", jyb.m147494Y("suggest_see_user_search_max_age", Integer.valueOf(this.f38942a.maxAge)), jyb.m147494Y("suggest_see_user_search_min_age", Integer.valueOf(this.f38942a.minAge)));
        }
    }

    public VisitorsFilterItemAgeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m58993a(View view) {
        ghm0.m130253a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m58994b(VisitorFilterSettings visitorFilterSettings) {
        int iM97514e = afm0.m97514e();
        int iM97513d = afm0.m97513d();
        float fM97514e = visitorFilterSettings.minAge;
        float fM97513d = visitorFilterSettings.maxAge;
        if (fM97514e <= 0.0f) {
            fM97514e = afm0.m97514e();
        }
        if (fM97513d <= 0.0f) {
            fM97513d = afm0.m97513d();
        }
        this.f38937a.setText(C9212e.m59144a((int) fM97514e, (int) fM97513d));
        this.f38938b.setValueFrom(iM97514e);
        this.f38938b.setValueTo(iM97513d);
        this.f38938b.setValues(Float.valueOf(fM97514e), Float.valueOf(fM97513d));
        this.f38938b.mo224211f(new C9204a(visitorFilterSettings));
        VRangeSlider.InterfaceC22680a interfaceC22680a = this.f38939c;
        if (interfaceC22680a == null) {
            this.f38939c = new C9205b(visitorFilterSettings);
        } else {
            this.f38938b.mo224196Q(interfaceC22680a);
        }
        this.f38938b.mo224213g(this.f38939c);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58993a(this);
    }

    public VisitorsFilterItemAgeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VisitorsFilterItemAgeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
