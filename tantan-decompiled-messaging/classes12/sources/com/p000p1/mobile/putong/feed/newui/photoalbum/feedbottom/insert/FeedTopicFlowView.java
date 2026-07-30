package com.p000p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.j760;
import org.apmem.tools.layouts.FlowLayout;
import org.jetbrains.annotations.NotNull;
import p007l.c3h;
import p007l.p6j0;
import p007l.vqg;
import p007l.z8h;
import p007l.zi60;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedTopicFlowView extends VFrame {

    /* JADX INFO: renamed from: a */
    public z8h f3257a;

    /* JADX INFO: renamed from: b */
    public c3h.InterfaceC2348a<TopicMoment> f3258b;

    /* JADX INFO: renamed from: c */
    public boolean f3259c;

    /* JADX INFO: renamed from: d */
    public e30<View> f3260d;

    public FeedTopicFlowView(Context context) {
        super(context);
        m5683w(context);
    }

    /* JADX INFO: renamed from: w */
    private void m5683w(Context context) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public void m5684B(Act act, List<TopicMoment> list, String str, int i, boolean z, String str2) {
        z8h z8hVar = this.f3257a;
        if (z8hVar == null) {
            addView(m5687v(act, list, str, i, z, str2));
            return;
        }
        z8hVar.m17269C(list);
        this.f3257a.m17271E(this.f3259c);
        this.f3257a.notifyDataSetChanged();
    }

    public z8h getAdapter() {
        return this.f3257a;
    }

    /* JADX INFO: renamed from: s */
    public void m5685s(TopicMoment topicMoment, String str) {
        p6j0.m12913c("e_circle_tag", str, (j760[]) m5686u(topicMoment).toArray(new j760[0]));
    }

    public void setOnItemClick(c3h.InterfaceC2348a<TopicMoment> interfaceC2348a) {
        this.f3258b = interfaceC2348a;
    }

    public void setOnViewRender(e30<View> e30Var) {
        this.f3260d = e30Var;
    }

    public void setWithCancelIcon(boolean z) {
        this.f3259c = z;
    }

    /* JADX INFO: renamed from: u */
    public final List<j760<String, String>> m5686u(TopicMoment topicMoment) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.a("circle_id", topicMoment.f708id));
        arrayList.add(j760.a("moment_id", topicMoment.momentId));
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final FlowLayout m5687v(final Act act, List<TopicMoment> list, final String str, int i, boolean z, final String str2) {
        FlowLayout flowLayout = new FlowLayout(act);
        z8h z8hVar = new z8h(list, act, i, z, str2);
        this.f3257a = z8hVar;
        z8hVar.m17270D(this.f3260d);
        this.f3257a.m17271E(this.f3259c);
        this.f3257a.m9087t(flowLayout);
        this.f3257a.m9085A(new c3h.InterfaceC2348a() { // from class: l.l7i
            @Override // p007l.c3h.InterfaceC2348a
            /* JADX INFO: renamed from: a */
            public final void mo9091a(View view, Object obj, int i2) {
                this.f9916a.m5688z(str, act, str2, view, (TopicMoment) obj, i2);
            }
        });
        return flowLayout;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m5688z(String str, Act act, String str2, View view, TopicMoment topicMoment, int i) {
        if (TextUtils.equals(topicMoment.topicType, "live_square")) {
            return;
        }
        if (NullChecker.a(this.f3258b)) {
            this.f3258b.mo9091a(view, topicMoment, i);
            return;
        }
        if (topicMoment.isEnterGroup()) {
            m5685s(topicMoment, str);
            act.startActivity(new FeedGroupDetailAct.C2044a(act, topicMoment.f708id).m2961a());
        } else {
            p6j0.m12913c("e_tag", str, vqg.m15519i(str2, j760.a("topic_id", topicMoment.f708id), j760.a("topic_type", zi60.m17436w().m17439E(topicMoment))));
            vqg.m15544u0(topicMoment, act, "from_no_topic_aggregation_list");
        }
    }

    public FeedTopicFlowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5683w(context);
    }

    public FeedTopicFlowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5683w(context);
    }
}
