package com.p000p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.data.CategoryTopic;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.vwb;
import l.w9j;
import p007l.l80;
import p007l.ryi0;
import p007l.tyi0;
import v.VLinear;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TopicBannerItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public TopicBannerItemView f4950c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f4951d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f4952e;

    /* JADX INFO: renamed from: f */
    public tyi0 f4953f;

    /* JADX INFO: renamed from: g */
    public tyi0 f4954g;

    /* JADX INFO: renamed from: h */
    public Act f4955h;

    /* JADX INFO: renamed from: i */
    public int f4956i;

    /* JADX INFO: renamed from: j */
    public int f4957j;

    /* JADX INFO: renamed from: k */
    public l80 f4958k;

    public TopicBannerItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m7590r() {
        tyi0 tyi0Var = new tyi0(this.f4955h, this.f4956i, this.f4957j, this.f4958k);
        this.f4953f = tyi0Var;
        this.f4951d.setAdapter(tyi0Var);
        tyi0 tyi0Var2 = new tyi0(this.f4955h, this.f4956i, this.f4957j, this.f4958k);
        this.f4954g = tyi0Var2;
        this.f4952e.setAdapter(tyi0Var2);
    }

    /* JADX INFO: renamed from: Q */
    public final void m7591Q(View view) {
        ryi0.m13971a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final List<TopicMoment> m7592R(CategoryTopic categoryTopic, List<TopicMoment> list) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(categoryTopic)) {
            for (final String str : categoryTopic.topicIds) {
                TopicMoment topicMoment = (TopicMoment) vwb.r(list, new w9j() { // from class: l.qyi0
                    public final Object call(Object obj) {
                        return Boolean.valueOf(str.equals(((TopicMoment) obj).f708id));
                    }
                });
                if (NullChecker.a(topicMoment)) {
                    arrayList.add(topicMoment);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: S */
    public void m7593S(CategoryTopic categoryTopic, CategoryTopic categoryTopic2, List<TopicMoment> list, int i, int i2, l80 l80Var) {
        if (vwb.J(list) || categoryTopic == null) {
            return;
        }
        this.f4958k = l80Var;
        this.f4956i = i;
        this.f4957j = i2;
        m7590r();
        this.f4953f.m14698M(categoryTopic, m7592R(categoryTopic, list));
        this.f4954g.m14698M(categoryTopic2, m7592R(categoryTopic2, list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7591Q(this);
        this.f4955h = getContext();
    }

    public TopicBannerItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TopicBannerItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
