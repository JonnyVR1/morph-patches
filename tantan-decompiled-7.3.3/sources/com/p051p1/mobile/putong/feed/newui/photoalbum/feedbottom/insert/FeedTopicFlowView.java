package com.p051p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.apmem.tools.layouts.FlowLayout;
import org.jetbrains.annotations.NotNull;
import p151v.VFrame;
import p153l.er60;
import p153l.ksg;
import p153l.oah;
import p153l.pf60;
import p153l.r4h;
import p153l.tfj0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedTopicFlowView extends VFrame {

    /* JADX INFO: renamed from: a */
    public oah f42644a;

    /* JADX INFO: renamed from: b */
    public r4h.InterfaceC19760a<TopicMoment> f42645b;

    /* JADX INFO: renamed from: c */
    public boolean f42646c;

    /* JADX INFO: renamed from: d */
    public y20<View> f42647d;

    public FeedTopicFlowView(Context context) {
        super(context);
        m65772w(context);
    }

    /* JADX INFO: renamed from: w */
    private void m65772w(Context context) {
    }

    /* JADX INFO: renamed from: B */
    public void m65773B(Act act, List<TopicMoment> list, String str, int i, boolean z, String str2) {
        oah oahVar = this.f42644a;
        if (oahVar == null) {
            addView(m65776v(act, list, str, i, z, str2));
            return;
        }
        oahVar.m166843C(list);
        this.f42644a.m166845E(this.f42646c);
        this.f42644a.notifyDataSetChanged();
    }

    public oah getAdapter() {
        return this.f42644a;
    }

    /* JADX INFO: renamed from: s */
    public void m65774s(TopicMoment topicMoment, String str) {
        tfj0.m190940c("e_circle_tag", str, (pf60[]) m65775u(topicMoment).toArray(new pf60[0]));
    }

    public void setOnItemClick(r4h.InterfaceC19760a<TopicMoment> interfaceC19760a) {
        this.f42645b = interfaceC19760a;
    }

    public void setOnViewRender(y20<View> y20Var) {
        this.f42647d = y20Var;
    }

    public void setWithCancelIcon(boolean z) {
        this.f42646c = z;
    }

    /* JADX INFO: renamed from: u */
    public final List<pf60<String, String>> m65775u(TopicMoment topicMoment) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pf60.m172085a("circle_id", topicMoment.f40095id));
        arrayList.add(pf60.m172085a("moment_id", topicMoment.momentId));
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final FlowLayout m65776v(final Act act, List<TopicMoment> list, final String str, int i, boolean z, final String str2) {
        FlowLayout flowLayout = new FlowLayout(act);
        oah oahVar = new oah(list, act, i, z, str2);
        this.f42644a = oahVar;
        oahVar.m166844D(this.f42647d);
        this.f42644a.m166845E(this.f42646c);
        this.f42644a.m179763t(flowLayout);
        this.f42644a.m179762A(new r4h.InterfaceC19760a() { // from class: l.a9i
            @Override // p153l.r4h.InterfaceC19760a
            /* JADX INFO: renamed from: a */
            public final void mo96595a(View view, Object obj, int i2) {
                this.f69047a.m65777z(str, act, str2, view, (TopicMoment) obj, i2);
            }
        });
        return flowLayout;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m65777z(String str, Act act, String str2, View view, TopicMoment topicMoment, int i) {
        if (TextUtils.equals(topicMoment.topicType, "live_square")) {
            return;
        }
        if (NullChecker.m82486a(this.f42645b)) {
            this.f42645b.mo96595a(view, topicMoment, i);
            return;
        }
        if (topicMoment.isEnterGroup()) {
            m65774s(topicMoment, str);
            act.startActivity(new FeedGroupDetailAct.C11363a(act, topicMoment.f40095id).m63170a());
        } else {
            tfj0.m190940c("e_tag", str, ksg.m151208i(str2, pf60.m172085a("topic_id", topicMoment.f40095id), pf60.m172085a("topic_type", er60.m122104w().m122107E(topicMoment))));
            ksg.m151233u0(topicMoment, act, "from_no_topic_aggregation_list");
        }
    }

    public FeedTopicFlowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65772w(context);
    }

    public FeedTopicFlowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65772w(context);
    }
}
