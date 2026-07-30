package com.p000p1.mobile.putong.core.view;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.data.DynamicLable;
import com.p000p1.mobile.putong.core.data.LabelParams;
import com.p000p1.mobile.putong.core.data.LabelStatistics;
import com.tantan.library.svga.SVGAnimationView;
import java.util.HashMap;
import java.util.List;
import l.gol;
import l.lva;
import l.vwb;
import l.xdl0;
import p003l.o6j0;
import p003l.sk4;
import v.VDraweeView;
import v.VFrame;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CardLabelItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f2352a;

    /* JADX INFO: renamed from: b */
    public VLinear f2353b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f2354c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f2355d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f2356e;

    /* JADX INFO: renamed from: f */
    public VText f2357f;

    /* JADX INFO: renamed from: g */
    public int f2358g;

    /* JADX INFO: renamed from: h */
    public DynamicLable f2359h;

    /* JADX INFO: renamed from: i */
    public gol f2360i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CardLabelItemView$a */
    public class ViewOnClickListenerC3251a implements View.OnClickListener {
        public ViewOnClickListenerC3251a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CardLabelItemView.this.f2359h != null) {
                if (!TextUtils.isEmpty(CardLabelItemView.this.f2359h.deeplink) && CardLabelItemView.this.f2360i != null) {
                    lva.D(CardLabelItemView.this.f2360i.getCardView().getContext(), Uri.parse(CardLabelItemView.this.f2359h.deeplink));
                }
                CardLabelItemView cardLabelItemView = CardLabelItemView.this;
                cardLabelItemView.m4901w(cardLabelItemView.f2359h.statistics);
            }
        }
    }

    public CardLabelItemView(Context context) {
        super(context);
        this.f2358g = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m4900v(this);
        xdl0.E0(this, new ViewOnClickListenerC3251a());
    }

    /* JADX INFO: renamed from: v */
    public final void m4900v(View view) {
        sk4.m9357a(this, view);
    }

    /* JADX INFO: renamed from: w */
    public final void m4901w(LabelStatistics labelStatistics) {
        if (labelStatistics == null || TextUtils.isEmpty(labelStatistics.eid)) {
            return;
        }
        List<LabelParams> list = labelStatistics.params;
        if (vwb.J(list)) {
            return;
        }
        HashMap map = new HashMap();
        for (LabelParams labelParams : list) {
            map.put(labelParams.key, labelParams.value);
        }
        o6j0.m8404d(labelStatistics.eid, "p_suggest_users_home_view", map);
    }

    public CardLabelItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2358g = 0;
    }

    public CardLabelItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2358g = 0;
    }
}
