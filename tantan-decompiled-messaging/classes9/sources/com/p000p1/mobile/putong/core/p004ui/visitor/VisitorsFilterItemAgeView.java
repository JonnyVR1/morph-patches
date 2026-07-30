package com.p000p1.mobile.putong.core.p004ui.visitor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.data.VisitorFilterSettings;
import l.c8m0;
import l.j760;
import l.vwb;
import l.w5m0;
import l.wg50;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import v.VRangeSlider;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VisitorsFilterItemAgeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f7870a;

    /* JADX INFO: renamed from: b */
    public VRangeSlider f7871b;

    /* JADX INFO: renamed from: c */
    public VRangeSlider.a f7872c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.VisitorsFilterItemAgeView$a */
    public class C0477a implements wg50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VisitorFilterSettings f7873a;

        public C0477a(VisitorFilterSettings visitorFilterSettings) {
            this.f7873a = visitorFilterSettings;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m11313a(@NonNull VRangeSlider vRangeSlider, boolean z, float f) {
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void m11314b(@NonNull VRangeSlider vRangeSlider, boolean z, float f, float f2) {
            int iMax = Math.max((int) f, w5m0.e());
            int iMin = Math.min((int) f2, w5m0.d());
            VisitorFilterSettings visitorFilterSettings = this.f7873a;
            visitorFilterSettings.minAge = iMax;
            visitorFilterSettings.maxAge = iMin;
            VisitorsFilterItemAgeView.this.f7870a.setText(C0485e.m11479a(iMax, iMin));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.VisitorsFilterItemAgeView$b */
    public class C0478b implements VRangeSlider.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VisitorFilterSettings f7875a;

        public C0478b(VisitorFilterSettings visitorFilterSettings) {
            this.f7875a = visitorFilterSettings;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m11317a(@NonNull @NotNull VRangeSlider vRangeSlider) {
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void m11318b(@NonNull @NotNull VRangeSlider vRangeSlider) {
            zvf0.v("e_advanced_filter_age", "p_my_visitor", new j760[]{vwb.Y("suggest_see_user_search_max_age", Integer.valueOf(this.f7875a.maxAge)), vwb.Y("suggest_see_user_search_min_age", Integer.valueOf(this.f7875a.minAge))});
        }
    }

    public VisitorsFilterItemAgeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m11311a(View view) {
        c8m0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m11312b(VisitorFilterSettings visitorFilterSettings) {
        int iE = w5m0.e();
        int iD = w5m0.d();
        float fE = visitorFilterSettings.minAge;
        float fD = visitorFilterSettings.maxAge;
        if (fE <= 0.0f) {
            fE = w5m0.e();
        }
        if (fD <= 0.0f) {
            fD = w5m0.d();
        }
        this.f7870a.setText(C0485e.m11479a((int) fE, (int) fD));
        this.f7871b.setValueFrom(iE);
        this.f7871b.setValueTo(iD);
        this.f7871b.setValues(new Float[]{Float.valueOf(fE), Float.valueOf(fD)});
        this.f7871b.f(new C0477a(visitorFilterSettings));
        VRangeSlider.a aVar = this.f7872c;
        if (aVar == null) {
            this.f7872c = new C0478b(visitorFilterSettings);
        } else {
            this.f7871b.Q(aVar);
        }
        this.f7871b.g(this.f7872c);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m11311a(this);
    }

    public VisitorsFilterItemAgeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VisitorsFilterItemAgeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
