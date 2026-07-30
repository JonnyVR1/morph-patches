package com.p046p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.CategoryTopic;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VLinear;
import p147v.VRecyclerView;
import p149l.l80;
import p149l.ryi0;
import p149l.tyi0;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class TopicBannerItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public TopicBannerItemView f43489c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f43490d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f43491e;

    /* JADX INFO: renamed from: f */
    public tyi0 f43492f;

    /* JADX INFO: renamed from: g */
    public tyi0 f43493g;

    /* JADX INFO: renamed from: h */
    public Act f43494h;

    /* JADX INFO: renamed from: i */
    public int f43495i;

    /* JADX INFO: renamed from: j */
    public int f43496j;

    /* JADX INFO: renamed from: k */
    public l80 f43497k;

    public TopicBannerItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m66425r() {
        tyi0 tyi0Var = new tyi0(this.f43494h, this.f43495i, this.f43496j, this.f43497k);
        this.f43492f = tyi0Var;
        this.f43490d.setAdapter(tyi0Var);
        tyi0 tyi0Var2 = new tyi0(this.f43494h, this.f43495i, this.f43496j, this.f43497k);
        this.f43493g = tyi0Var2;
        this.f43491e.setAdapter(tyi0Var2);
    }

    /* JADX INFO: renamed from: Q */
    public final void m66426Q(View view) {
        ryi0.m181665a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final List<TopicMoment> m66427R(CategoryTopic categoryTopic, List<TopicMoment> list) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(categoryTopic)) {
            for (final String str : categoryTopic.topicIds) {
                TopicMoment topicMoment = (TopicMoment) vwb.m200346r(list, new w9j() { // from class: l.qyi0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(str.equals(((TopicMoment) obj).f39247id));
                    }
                });
                if (NullChecker.m81303a(topicMoment)) {
                    arrayList.add(topicMoment);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: S */
    public void m66428S(CategoryTopic categoryTopic, CategoryTopic categoryTopic2, List<TopicMoment> list, int i, int i2, l80 l80Var) {
        if (vwb.m200296J(list) || categoryTopic == null) {
            return;
        }
        this.f43497k = l80Var;
        this.f43495i = i;
        this.f43496j = i2;
        m66425r();
        this.f43492f.m191047M(categoryTopic, m66427R(categoryTopic, list));
        this.f43493g.m191047M(categoryTopic2, m66427R(categoryTopic2, list));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66426Q(this);
        this.f43494h = (Act) getContext();
    }

    public TopicBannerItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TopicBannerItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
