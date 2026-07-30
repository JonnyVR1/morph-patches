package com.p051p1.mobile.putong.core.view;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.DynamicLable;
import com.p051p1.mobile.putong.core.data.LabelParams;
import com.p051p1.mobile.putong.core.data.LabelStatistics;
import com.tantan.library.svga.SVGAnimationView;
import java.util.HashMap;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.jyb;
import p153l.rl4;
import p153l.rql;
import p153l.sfj0;
import p153l.xwa;

/* JADX INFO: loaded from: classes12.dex */
public class CardLabelItemView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f39258a;

    /* JADX INFO: renamed from: b */
    public VLinear f39259b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f39260c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f39261d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f39262e;

    /* JADX INFO: renamed from: f */
    public VText f39263f;

    /* JADX INFO: renamed from: g */
    public int f39264g;

    /* JADX INFO: renamed from: h */
    public DynamicLable f39265h;

    /* JADX INFO: renamed from: i */
    public rql f39266i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CardLabelItemView$a */
    public class ViewOnClickListenerC9316a implements View.OnClickListener {
        public ViewOnClickListenerC9316a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CardLabelItemView.this.f39265h != null) {
                if (!TextUtils.isEmpty(CardLabelItemView.this.f39265h.deeplink) && CardLabelItemView.this.f39266i != null) {
                    xwa.m213304D((Act) CardLabelItemView.this.f39266i.getCardView().getContext(), Uri.parse(CardLabelItemView.this.f39265h.deeplink));
                }
                CardLabelItemView cardLabelItemView = CardLabelItemView.this;
                cardLabelItemView.m60676w(cardLabelItemView.f39265h.statistics);
            }
        }
    }

    public CardLabelItemView(Context context) {
        super(context);
        this.f39264g = 0;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m60675v(this);
        bnl0.m105509E0(this, new ViewOnClickListenerC9316a());
    }

    /* JADX INFO: renamed from: v */
    public final void m60675v(View view) {
        rl4.m181914a(this, view);
    }

    /* JADX INFO: renamed from: w */
    public final void m60676w(LabelStatistics labelStatistics) {
        if (labelStatistics == null || TextUtils.isEmpty(labelStatistics.eid)) {
            return;
        }
        List<LabelParams> list = labelStatistics.params;
        if (jyb.m147479J(list)) {
            return;
        }
        HashMap map = new HashMap();
        for (LabelParams labelParams : list) {
            map.put(labelParams.key, labelParams.value);
        }
        sfj0.m185597d(labelStatistics.eid, "p_suggest_users_home_view", map);
    }

    public CardLabelItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39264g = 0;
    }

    public CardLabelItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39264g = 0;
    }
}
