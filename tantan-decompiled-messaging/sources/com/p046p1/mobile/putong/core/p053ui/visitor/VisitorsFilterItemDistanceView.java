package com.p046p1.mobile.putong.core.p053ui.visitor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.VisitorFilterSettings;
import com.p046p1.mobile.putong.core.p053ui.visitor.VisitorsFilterItemDistanceView;
import p147v.VSlider;
import p147v.VText;
import p149l.h8m0;
import p149l.iqk0;
import p149l.vwb;
import p149l.w5m0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class VisitorsFilterItemDistanceView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f38098a;

    /* JADX INFO: renamed from: b */
    public VSlider f38099b;

    /* JADX INFO: renamed from: c */
    public VSlider.InterfaceC22569b f38100c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.VisitorsFilterItemDistanceView$a */
    public class C9043a extends VSlider.AbstractC22568a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VisitorFilterSettings f38101a;

        public C9043a(VisitorFilterSettings visitorFilterSettings) {
            this.f38101a = visitorFilterSettings;
        }

        @Override // p147v.VSlider.AbstractC22568a, p149l.wg50
        /* JADX INFO: renamed from: c */
        public void mo55416a(@NonNull VSlider vSlider, boolean z, float f) {
            super.mo55416a(vSlider, z, f);
            int iM201649c = w5m0.m201649c() + Math.min(w5m0.m201648b() - w5m0.m201649c(), Math.max(0, ((int) f) * 1000));
            this.f38101a.distance = iM201649c;
            VisitorsFilterItemDistanceView.this.f38098a.setText(C9049e.m57962b(iM201649c));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.VisitorsFilterItemDistanceView$b */
    public class C9044b implements VSlider.InterfaceC22569b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VisitorFilterSettings f38103a;

        public C9044b(VisitorFilterSettings visitorFilterSettings) {
            this.f38103a = visitorFilterSettings;
        }

        @Override // p149l.xek0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo55484a(@NonNull VSlider vSlider) {
        }

        @Override // p149l.xek0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo55485b(@NonNull VSlider vSlider) {
            zvf0.m220400v("e_advanced_filter_distance", "p_my_visitor", vwb.m200311Y("suggest_see_user_search_radius", Integer.valueOf(this.f38103a.distance)));
        }
    }

    public VisitorsFilterItemDistanceView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m57821a(float f) {
        return (((int) f) + 1) + "km";
    }

    /* JADX INFO: renamed from: b */
    public final void m57822b(View view) {
        h8m0.m129891a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public int m57823c() {
        return (w5m0.m201648b() - w5m0.m201649c()) / 1000;
    }

    /* JADX INFO: renamed from: d */
    public void m57824d(VisitorFilterSettings visitorFilterSettings) {
        int i = visitorFilterSettings.distance;
        this.f38098a.setText(C9049e.m57962b(i));
        int iM57825e = m57825e(i);
        float f = iM57825e;
        if (f == this.f38099b.getValue()) {
            this.f38099b.setValue(iM57825e + 1);
        }
        this.f38099b.setValueTo(m57823c());
        this.f38099b.setValue(f);
        this.f38099b.mo222965f(new C9043a(visitorFilterSettings));
        this.f38099b.setLabelFormatter(new iqk0() { // from class: l.g8m0
            @Override // p149l.iqk0
            /* JADX INFO: renamed from: a */
            public final String mo55415a(float f2) {
                return VisitorsFilterItemDistanceView.m57821a(f2);
            }
        });
        VSlider.InterfaceC22569b interfaceC22569b = this.f38100c;
        if (interfaceC22569b == null) {
            this.f38100c = new C9044b(visitorFilterSettings);
        } else {
            this.f38099b.mo222950Q(interfaceC22569b);
        }
        this.f38099b.mo222967g(this.f38100c);
    }

    /* JADX INFO: renamed from: e */
    public int m57825e(int i) {
        return (i - w5m0.m201649c()) / 1000;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57822b(this);
    }

    public VisitorsFilterItemDistanceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VisitorsFilterItemDistanceView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
