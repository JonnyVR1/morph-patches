package com.p051p1.mobile.putong.core.p058ui.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.c17;
import p153l.gta;
import p153l.i4g0;
import p153l.l2c;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class DailySelectionAdCardView extends CardView {

    /* JADX INFO: renamed from: a */
    public VText_Bold f30552a;

    /* JADX INFO: renamed from: b */
    public VText f30553b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f30554c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f30555d;

    public DailySelectionAdCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m47281f(View view) {
        CoreModule.f18264c.f20405m0.m31989C8("dailySelectionAdCardViewClick");
        gta.m132210e().m132214d().mo34908qa((Act) getContext(), "selected_users_intro_card");
        i4g0.m138520r("e_selected_users_intro_card", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: e */
    public final void m47282e(View view) {
        l2c.m152599a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public void m47283h() {
        if (gta.m132210e().m132214d().mo34719Lc()) {
            this.f30552a.setText("每日精选");
        }
        if (c17.m107528u0()) {
            uqb0.f180374G.m127115L0(this.f30554c, "https://auto.tancdn.com/v1/images/eyJpZCI6IkFENFRIUko2RzQ3NkVET1g1WEdGNzdIRzVGN0RCQTE0IiwidyI6OTkzLCJoIjo3OTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTA4OTE2NDk2MjM5NDY1Nzc5fQ.png");
        } else {
            uqb0.f180374G.m127115L0(this.f30554c, "https://auto.tancdn.com/v1/images/eyJpZCI6Ik4yUFlCSDRHQ1VaSEozVllITFlVWDY0NVUyT1pQTDE0IiwidyI6OTkzLCJoIjo3OTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjY2OTY5Nzk0MjEzNTU3NTMxfQ.png");
        }
        this.f30553b.setText(String.format("全平台的优质%S都在等你，去发现心仪的人", c17.m107528u0() ? "男性" : "女性"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47282e(this);
        bnl0.m105509E0(this.f30555d, new View.OnClickListener() { // from class: l.k2c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123591a.m47281f(view);
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
