package com.p000p1.mobile.putong.core.p004ui.visitor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.core.p004ui.visitor.VisitorsFilterItemDistanceView;
import com.p1.mobile.putong.core.data.VisitorFilterSettings;
import l.h8m0;
import l.iqk0;
import l.j760;
import l.vwb;
import l.w5m0;
import l.zvf0;
import v.VSlider;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VisitorsFilterItemDistanceView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f7879a;

    /* JADX INFO: renamed from: b */
    public VSlider f7880b;

    /* JADX INFO: renamed from: c */
    public VSlider.b f7881c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.VisitorsFilterItemDistanceView$a */
    public class C0479a extends VSlider.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VisitorFilterSettings f7882a;

        public C0479a(VisitorFilterSettings visitorFilterSettings) {
            this.f7882a = visitorFilterSettings;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m11331a(@NonNull VSlider vSlider, boolean z, float f) {
            super.c(vSlider, z, f);
            int iC = w5m0.c() + Math.min(w5m0.b() - w5m0.c(), Math.max(0, ((int) f) * AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO));
            this.f7882a.distance = iC;
            VisitorsFilterItemDistanceView.this.f7879a.setText(C0485e.m11480b(iC));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.visitor.VisitorsFilterItemDistanceView$b */
    public class C0480b implements VSlider.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VisitorFilterSettings f7884a;

        public C0480b(VisitorFilterSettings visitorFilterSettings) {
            this.f7884a = visitorFilterSettings;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m11333a(@NonNull VSlider vSlider) {
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void m11334b(@NonNull VSlider vSlider) {
            zvf0.v("e_advanced_filter_distance", "p_my_visitor", new j760[]{vwb.Y("suggest_see_user_search_radius", Integer.valueOf(this.f7884a.distance))});
        }
    }

    public VisitorsFilterItemDistanceView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m11326a(float f) {
        return (((int) f) + 1) + "km";
    }

    /* JADX INFO: renamed from: b */
    public final void m11327b(View view) {
        h8m0.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public int m11328c() {
        return (w5m0.b() - w5m0.c()) / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
    }

    /* JADX INFO: renamed from: d */
    public void m11329d(VisitorFilterSettings visitorFilterSettings) {
        int i = visitorFilterSettings.distance;
        this.f7879a.setText(C0485e.m11480b(i));
        int iM11330e = m11330e(i);
        float f = iM11330e;
        if (f == this.f7880b.getValue()) {
            this.f7880b.setValue(iM11330e + 1);
        }
        this.f7880b.setValueTo(m11328c());
        this.f7880b.setValue(f);
        this.f7880b.f(new C0479a(visitorFilterSettings));
        this.f7880b.setLabelFormatter(new iqk0() { // from class: l.g8m0
            /* JADX INFO: renamed from: a */
            public final String m15628a(float f2) {
                return VisitorsFilterItemDistanceView.m11326a(f2);
            }
        });
        VSlider.b bVar = this.f7881c;
        if (bVar == null) {
            this.f7881c = new C0480b(visitorFilterSettings);
        } else {
            this.f7880b.Q(bVar);
        }
        this.f7880b.g(this.f7881c);
    }

    /* JADX INFO: renamed from: e */
    public int m11330e(int i) {
        return (i - w5m0.c()) / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m11327b(this);
    }

    public VisitorsFilterItemDistanceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VisitorsFilterItemDistanceView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
