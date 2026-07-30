package com.p046p1.mobile.putong.core.p053ui.visitor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.VisitorFilterSettings;
import org.jetbrains.annotations.NotNull;
import p147v.VRangeSlider;
import p147v.VText;
import p149l.c8m0;
import p149l.vwb;
import p149l.w5m0;
import p149l.wg50;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class VisitorsFilterItemAgeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f38089a;

    /* JADX INFO: renamed from: b */
    public VRangeSlider f38090b;

    /* JADX INFO: renamed from: c */
    public VRangeSlider.InterfaceC22565a f38091c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.VisitorsFilterItemAgeView$a */
    public class C9041a implements wg50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VisitorFilterSettings f38092a;

        public C9041a(VisitorFilterSettings visitorFilterSettings) {
            this.f38092a = visitorFilterSettings;
        }

        @Override // p149l.wg50
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo55416a(@NonNull VRangeSlider vRangeSlider, boolean z, float f) {
        }

        @Override // p149l.wg50
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo55417b(@NonNull VRangeSlider vRangeSlider, boolean z, float f, float f2) {
            int iMax = Math.max((int) f, w5m0.m201651e());
            int iMin = Math.min((int) f2, w5m0.m201650d());
            VisitorFilterSettings visitorFilterSettings = this.f38092a;
            visitorFilterSettings.minAge = iMax;
            visitorFilterSettings.maxAge = iMin;
            VisitorsFilterItemAgeView.this.f38089a.setText(C9049e.m57961a(iMax, iMin));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.VisitorsFilterItemAgeView$b */
    public class C9042b implements VRangeSlider.InterfaceC22565a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VisitorFilterSettings f38094a;

        public C9042b(VisitorFilterSettings visitorFilterSettings) {
            this.f38094a = visitorFilterSettings;
        }

        @Override // p149l.xek0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo55484a(@NonNull @NotNull VRangeSlider vRangeSlider) {
        }

        @Override // p149l.xek0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo55485b(@NonNull @NotNull VRangeSlider vRangeSlider) {
            zvf0.m220400v("e_advanced_filter_age", "p_my_visitor", vwb.m200311Y("suggest_see_user_search_max_age", Integer.valueOf(this.f38094a.maxAge)), vwb.m200311Y("suggest_see_user_search_min_age", Integer.valueOf(this.f38094a.minAge)));
        }
    }

    public VisitorsFilterItemAgeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57810a(View view) {
        c8m0.m105799a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m57811b(VisitorFilterSettings visitorFilterSettings) {
        int iM201651e = w5m0.m201651e();
        int iM201650d = w5m0.m201650d();
        float fM201651e = visitorFilterSettings.minAge;
        float fM201650d = visitorFilterSettings.maxAge;
        if (fM201651e <= 0.0f) {
            fM201651e = w5m0.m201651e();
        }
        if (fM201650d <= 0.0f) {
            fM201650d = w5m0.m201650d();
        }
        this.f38089a.setText(C9049e.m57961a((int) fM201651e, (int) fM201650d));
        this.f38090b.setValueFrom(iM201651e);
        this.f38090b.setValueTo(iM201650d);
        this.f38090b.setValues(Float.valueOf(fM201651e), Float.valueOf(fM201650d));
        this.f38090b.mo222965f(new C9041a(visitorFilterSettings));
        VRangeSlider.InterfaceC22565a interfaceC22565a = this.f38091c;
        if (interfaceC22565a == null) {
            this.f38091c = new C9042b(visitorFilterSettings);
        } else {
            this.f38090b.mo222950Q(interfaceC22565a);
        }
        this.f38090b.mo222967g(this.f38091c);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57810a(this);
    }

    public VisitorsFilterItemAgeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VisitorsFilterItemAgeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
