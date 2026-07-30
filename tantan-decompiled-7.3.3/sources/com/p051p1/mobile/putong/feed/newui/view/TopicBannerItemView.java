package com.p051p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.CategoryTopic;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VLinear;
import p151v.VRecyclerView;
import p153l.h80;
import p153l.jyb;
import p153l.qcj;
import p153l.v7j0;
import p153l.x7j0;

/* JADX INFO: loaded from: classes13.dex */
public class TopicBannerItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public TopicBannerItemView f44337c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f44338d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f44339e;

    /* JADX INFO: renamed from: f */
    public x7j0 f44340f;

    /* JADX INFO: renamed from: g */
    public x7j0 f44341g;

    /* JADX INFO: renamed from: h */
    public Act f44342h;

    /* JADX INFO: renamed from: i */
    public int f44343i;

    /* JADX INFO: renamed from: j */
    public int f44344j;

    /* JADX INFO: renamed from: k */
    public h80 f44345k;

    public TopicBannerItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m67608r() {
        x7j0 x7j0Var = new x7j0(this.f44342h, this.f44343i, this.f44344j, this.f44345k);
        this.f44340f = x7j0Var;
        this.f44338d.setAdapter(x7j0Var);
        x7j0 x7j0Var2 = new x7j0(this.f44342h, this.f44343i, this.f44344j, this.f44345k);
        this.f44341g = x7j0Var2;
        this.f44339e.setAdapter(x7j0Var2);
    }

    /* JADX INFO: renamed from: Q */
    public final void m67609Q(View view) {
        v7j0.m200214a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final List<TopicMoment> m67610R(CategoryTopic categoryTopic, List<TopicMoment> list) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(categoryTopic)) {
            for (final String str : categoryTopic.topicIds) {
                TopicMoment topicMoment = (TopicMoment) jyb.m147529r(list, new qcj() { // from class: l.u7j0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(str.equals(((TopicMoment) obj).f40095id));
                    }
                });
                if (NullChecker.m82486a(topicMoment)) {
                    arrayList.add(topicMoment);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: S */
    public void m67611S(CategoryTopic categoryTopic, CategoryTopic categoryTopic2, List<TopicMoment> list, int i, int i2, h80 h80Var) {
        if (jyb.m147479J(list) || categoryTopic == null) {
            return;
        }
        this.f44345k = h80Var;
        this.f44343i = i;
        this.f44344j = i2;
        m67608r();
        this.f44340f.m209643M(categoryTopic, m67610R(categoryTopic, list));
        this.f44341g.m209643M(categoryTopic2, m67610R(categoryTopic2, list));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67609Q(this);
        this.f44342h = (Act) getContext();
    }

    public TopicBannerItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TopicBannerItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
