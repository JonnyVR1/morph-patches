package com.p046p1.mobile.putong.core.view;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.DynamicLable;
import com.p046p1.mobile.putong.core.data.LabelParams;
import com.p046p1.mobile.putong.core.data.LabelStatistics;
import com.tantan.library.svga.SVGAnimationView;
import java.util.HashMap;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p149l.gol;
import p149l.lva;
import p149l.o6j0;
import p149l.sk4;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public class CardLabelItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f38410a;

    /* JADX INFO: renamed from: b */
    public VLinear f38411b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f38412c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f38413d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f38414e;

    /* JADX INFO: renamed from: f */
    public VText f38415f;

    /* JADX INFO: renamed from: g */
    public int f38416g;

    /* JADX INFO: renamed from: h */
    public DynamicLable f38417h;

    /* JADX INFO: renamed from: i */
    public gol f38418i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CardLabelItemView$a */
    public class ViewOnClickListenerC9153a implements View.OnClickListener {
        public ViewOnClickListenerC9153a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CardLabelItemView.this.f38417h != null) {
                if (!TextUtils.isEmpty(CardLabelItemView.this.f38417h.deeplink) && CardLabelItemView.this.f38418i != null) {
                    lva.m151843D((Act) CardLabelItemView.this.f38418i.getCardView().getContext(), Uri.parse(CardLabelItemView.this.f38417h.deeplink));
                }
                CardLabelItemView cardLabelItemView = CardLabelItemView.this;
                cardLabelItemView.m59492w(cardLabelItemView.f38417h.statistics);
            }
        }
    }

    public CardLabelItemView(Context context) {
        super(context);
        this.f38416g = 0;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m59491v(this);
        xdl0.m208329E0(this, new ViewOnClickListenerC9153a());
    }

    /* JADX INFO: renamed from: v */
    public final void m59491v(View view) {
        sk4.m184575a(this, view);
    }

    /* JADX INFO: renamed from: w */
    public final void m59492w(LabelStatistics labelStatistics) {
        if (labelStatistics == null || TextUtils.isEmpty(labelStatistics.eid)) {
            return;
        }
        List<LabelParams> list = labelStatistics.params;
        if (vwb.m200296J(list)) {
            return;
        }
        HashMap map = new HashMap();
        for (LabelParams labelParams : list) {
            map.put(labelParams.key, labelParams.value);
        }
        o6j0.m162860d(labelStatistics.eid, "p_suggest_users_home_view", map);
    }

    public CardLabelItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38416g = 0;
    }

    public CardLabelItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38416g = 0;
    }
}
