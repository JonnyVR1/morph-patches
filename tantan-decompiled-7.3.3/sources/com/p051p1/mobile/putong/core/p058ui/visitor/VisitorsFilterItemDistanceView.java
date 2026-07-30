package com.p051p1.mobile.putong.core.p058ui.visitor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.VisitorFilterSettings;
import com.p051p1.mobile.putong.core.p058ui.visitor.VisitorsFilterItemDistanceView;
import p151v.VSlider;
import p151v.VText;
import p153l.afm0;
import p153l.i4g0;
import p153l.jyb;
import p153l.lhm0;
import p153l.ozk0;

/* JADX INFO: loaded from: classes12.dex */
public class VisitorsFilterItemDistanceView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f38946a;

    /* JADX INFO: renamed from: b */
    public VSlider f38947b;

    /* JADX INFO: renamed from: c */
    public VSlider.InterfaceC22684b f38948c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.VisitorsFilterItemDistanceView$a */
    public class C9206a extends VSlider.AbstractC22683a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VisitorFilterSettings f38949a;

        public C9206a(VisitorFilterSettings visitorFilterSettings) {
            this.f38949a = visitorFilterSettings;
        }

        @Override // p151v.VSlider.AbstractC22683a, p153l.cp50
        /* JADX INFO: renamed from: c */
        public void mo56599a(@NonNull VSlider vSlider, boolean z, float f) {
            super.mo56599a(vSlider, z, f);
            int iM97512c = afm0.m97512c() + Math.min(afm0.m97511b() - afm0.m97512c(), Math.max(0, ((int) f) * 1000));
            this.f38949a.distance = iM97512c;
            VisitorsFilterItemDistanceView.this.f38946a.setText(C9212e.m59145b(iM97512c));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.VisitorsFilterItemDistanceView$b */
    public class C9207b implements VSlider.InterfaceC22684b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VisitorFilterSettings f38951a;

        public C9207b(VisitorFilterSettings visitorFilterSettings) {
            this.f38951a = visitorFilterSettings;
        }

        @Override // p153l.dok0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo56667a(@NonNull VSlider vSlider) {
        }

        @Override // p153l.dok0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo56668b(@NonNull VSlider vSlider) {
            i4g0.m138524v("e_advanced_filter_distance", "p_my_visitor", jyb.m147494Y("suggest_see_user_search_radius", Integer.valueOf(this.f38951a.distance)));
        }
    }

    public VisitorsFilterItemDistanceView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59004a(float f) {
        return (((int) f) + 1) + "km";
    }

    /* JADX INFO: renamed from: b */
    public final void m59005b(View view) {
        lhm0.m154229a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public int m59006c() {
        return (afm0.m97511b() - afm0.m97512c()) / 1000;
    }

    /* JADX INFO: renamed from: d */
    public void m59007d(VisitorFilterSettings visitorFilterSettings) {
        int i = visitorFilterSettings.distance;
        this.f38946a.setText(C9212e.m59145b(i));
        int iM59008e = m59008e(i);
        float f = iM59008e;
        if (f == this.f38947b.getValue()) {
            this.f38947b.setValue(iM59008e + 1);
        }
        this.f38947b.setValueTo(m59006c());
        this.f38947b.setValue(f);
        this.f38947b.mo224211f(new C9206a(visitorFilterSettings));
        this.f38947b.setLabelFormatter(new ozk0() { // from class: l.khm0
            @Override // p153l.ozk0
            /* JADX INFO: renamed from: a */
            public final String mo56598a(float f2) {
                return VisitorsFilterItemDistanceView.m59004a(f2);
            }
        });
        VSlider.InterfaceC22684b interfaceC22684b = this.f38948c;
        if (interfaceC22684b == null) {
            this.f38948c = new C9207b(visitorFilterSettings);
        } else {
            this.f38947b.mo224196Q(interfaceC22684b);
        }
        this.f38947b.mo224213g(this.f38948c);
    }

    /* JADX INFO: renamed from: e */
    public int m59008e(int i) {
        return (i - afm0.m97512c()) / 1000;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m59005b(this);
    }

    public VisitorsFilterItemDistanceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VisitorsFilterItemDistanceView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
