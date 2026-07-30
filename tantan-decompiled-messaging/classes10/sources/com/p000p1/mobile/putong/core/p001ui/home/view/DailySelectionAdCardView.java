package com.p000p1.mobile.putong.core.p001ui.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.VText_Bold;
import l.qib0;
import l.ura;
import l.xdl0;
import l.zvf0;
import l.zz6;
import p003l.y0c;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class DailySelectionAdCardView extends CardView {

    /* JADX INFO: renamed from: a */
    public VText_Bold f2098a;

    /* JADX INFO: renamed from: b */
    public VText f2099b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f2100c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f2101d;

    public DailySelectionAdCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m3463f(View view) {
        CoreModule.c.m0.C8("dailySelectionAdCardViewClick");
        ura.e().d().qa(getContext(), "selected_users_intro_card");
        zvf0.r("e_selected_users_intro_card", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: e */
    public final void m3464e(View view) {
        y0c.m11075a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public void m3465h() {
        if (ura.e().d().Lc()) {
            this.f2098a.setText("每日精选");
        }
        if (zz6.u0()) {
            qib0.G.L0(this.f2100c, "https://auto.tancdn.com/v1/images/eyJpZCI6IkFENFRIUko2RzQ3NkVET1g1WEdGNzdIRzVGN0RCQTE0IiwidyI6OTkzLCJoIjo3OTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTA4OTE2NDk2MjM5NDY1Nzc5fQ.png");
        } else {
            qib0.G.L0(this.f2100c, "https://auto.tancdn.com/v1/images/eyJpZCI6Ik4yUFlCSDRHQ1VaSEozVllITFlVWDY0NVUyT1pQTDE0IiwidyI6OTkzLCJoIjo3OTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjY2OTY5Nzk0MjEzNTU3NTMxfQ.png");
        }
        this.f2099b.setText(String.format("全平台的优质%S都在等你，去发现心仪的人", zz6.u0() ? "男性" : "女性"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3464e(this);
        xdl0.E0(this.f2101d, new View.OnClickListener() { // from class: l.x0c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8276a.m3463f(view);
            }
        });
    }

    public DailySelectionAdCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DailySelectionAdCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
