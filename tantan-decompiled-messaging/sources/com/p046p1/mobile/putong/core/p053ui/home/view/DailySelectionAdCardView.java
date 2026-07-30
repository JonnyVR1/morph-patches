package com.p046p1.mobile.putong.core.p053ui.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VDraweeView;
import p147v.VText;
import p149l.qib0;
import p149l.ura;
import p149l.xdl0;
import p149l.y0c;
import p149l.zvf0;
import p149l.zz6;

/* JADX INFO: loaded from: classes10.dex */
public class DailySelectionAdCardView extends CardView {

    /* JADX INFO: renamed from: a */
    public VText_Bold f29704a;

    /* JADX INFO: renamed from: b */
    public VText f29705b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f29706c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f29707d;

    public DailySelectionAdCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m46098f(View view) {
        CoreModule.f17545c.f19663m0.m30986C8("dailySelectionAdCardViewClick");
        ura.m195053e().m195057d().mo33905qa((Act) getContext(), "selected_users_intro_card");
        zvf0.m220396r("e_selected_users_intro_card", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: e */
    public final void m46099e(View view) {
        y0c.m212106a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public void m46100h() {
        if (ura.m195053e().m195057d().mo33716Lc()) {
            this.f29704a.setText("每日精选");
        }
        if (zz6.m221004u0()) {
            qib0.f154691G.m102331L0(this.f29706c, "https://auto.tancdn.com/v1/images/eyJpZCI6IkFENFRIUko2RzQ3NkVET1g1WEdGNzdIRzVGN0RCQTE0IiwidyI6OTkzLCJoIjo3OTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTA4OTE2NDk2MjM5NDY1Nzc5fQ.png");
        } else {
            qib0.f154691G.m102331L0(this.f29706c, "https://auto.tancdn.com/v1/images/eyJpZCI6Ik4yUFlCSDRHQ1VaSEozVllITFlVWDY0NVUyT1pQTDE0IiwidyI6OTkzLCJoIjo3OTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjY2OTY5Nzk0MjEzNTU3NTMxfQ.png");
        }
        this.f29705b.setText(String.format("全平台的优质%S都在等你，去发现心仪的人", zz6.m221004u0() ? "男性" : "女性"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46099e(this);
        xdl0.m208329E0(this.f29707d, new View.OnClickListener() { // from class: l.x0c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188946a.m46098f(view);
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
