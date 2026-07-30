package com.p046p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.apmem.tools.layouts.FlowLayout;
import org.jetbrains.annotations.NotNull;
import p147v.VFrame;
import p149l.c3h;
import p149l.e30;
import p149l.j760;
import p149l.p6j0;
import p149l.vqg;
import p149l.z8h;
import p149l.zi60;

/* JADX INFO: loaded from: classes12.dex */
public class FeedTopicFlowView extends VFrame {

    /* JADX INFO: renamed from: a */
    public z8h f41796a;

    /* JADX INFO: renamed from: b */
    public c3h.InterfaceC16050a<TopicMoment> f41797b;

    /* JADX INFO: renamed from: c */
    public boolean f41798c;

    /* JADX INFO: renamed from: d */
    public e30<View> f41799d;

    public FeedTopicFlowView(Context context) {
        super(context);
        m64589w(context);
    }

    /* JADX INFO: renamed from: w */
    private void m64589w(Context context) {
    }

    /* JADX INFO: renamed from: B */
    public void m64590B(Act act, List<TopicMoment> list, String str, int i, boolean z, String str2) {
        z8h z8hVar = this.f41796a;
        if (z8hVar == null) {
            addView(m64593v(act, list, str, i, z, str2));
            return;
        }
        z8hVar.m217597C(list);
        this.f41796a.m217599E(this.f41798c);
        this.f41796a.notifyDataSetChanged();
    }

    public z8h getAdapter() {
        return this.f41796a;
    }

    /* JADX INFO: renamed from: s */
    public void m64591s(TopicMoment topicMoment, String str) {
        p6j0.m167669c("e_circle_tag", str, (j760[]) m64592u(topicMoment).toArray(new j760[0]));
    }

    public void setOnItemClick(c3h.InterfaceC16050a<TopicMoment> interfaceC16050a) {
        this.f41797b = interfaceC16050a;
    }

    public void setOnViewRender(e30<View> e30Var) {
        this.f41799d = e30Var;
    }

    public void setWithCancelIcon(boolean z) {
        this.f41798c = z;
    }

    /* JADX INFO: renamed from: u */
    public final List<j760<String, String>> m64592u(TopicMoment topicMoment) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.m140076a("circle_id", topicMoment.f39247id));
        arrayList.add(j760.m140076a("moment_id", topicMoment.momentId));
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final FlowLayout m64593v(final Act act, List<TopicMoment> list, final String str, int i, boolean z, final String str2) {
        FlowLayout flowLayout = new FlowLayout(act);
        z8h z8hVar = new z8h(list, act, i, z, str2);
        this.f41796a = z8hVar;
        z8hVar.m217598D(this.f41799d);
        this.f41796a.m217599E(this.f41798c);
        this.f41796a.m105022t(flowLayout);
        this.f41796a.m105021A(new c3h.InterfaceC16050a() { // from class: l.l7i
            @Override // p149l.c3h.InterfaceC16050a
            /* JADX INFO: renamed from: a */
            public final void mo105026a(View view, Object obj, int i2) {
                this.f126726a.m64594z(str, act, str2, view, (TopicMoment) obj, i2);
            }
        });
        return flowLayout;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m64594z(String str, Act act, String str2, View view, TopicMoment topicMoment, int i) {
        if (TextUtils.equals(topicMoment.topicType, "live_square")) {
            return;
        }
        if (NullChecker.m81303a(this.f41797b)) {
            this.f41797b.mo105026a(view, topicMoment, i);
            return;
        }
        if (topicMoment.isEnterGroup()) {
            m64591s(topicMoment, str);
            act.startActivity(new FeedGroupDetailAct.C11200a(act, topicMoment.f39247id).m61987a());
        } else {
            p6j0.m167669c("e_tag", str, vqg.m199549i(str2, j760.m140076a("topic_id", topicMoment.f39247id), j760.m140076a("topic_type", zi60.m218961w().m218964E(topicMoment))));
            vqg.m199574u0(topicMoment, act, "from_no_topic_aggregation_list");
        }
    }

    public FeedTopicFlowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m64589w(context);
    }

    public FeedTopicFlowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m64589w(context);
    }
}
