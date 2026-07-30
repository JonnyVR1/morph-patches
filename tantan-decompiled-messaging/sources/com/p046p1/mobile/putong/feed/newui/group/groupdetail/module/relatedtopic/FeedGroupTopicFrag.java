package com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.relatedtopic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import java.util.List;
import p149l.j760;
import p149l.l80;
import p149l.p6j0;
import p149l.s6h;
import p149l.t100;
import p149l.t6h;
import p149l.xdl0;
import p149l.zi60;

/* JADX INFO: loaded from: classes12.dex */
public class FeedGroupTopicFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public s6h f40120A;

    /* JADX INFO: renamed from: B */
    public List<TopicMoment> f40121B;

    /* JADX INFO: renamed from: z */
    public FeedMaxHeightRecyclerView f40122z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.groupdetail.module.relatedtopic.FeedGroupTopicFrag$a */
    public class C11202a extends l80<TopicMoment> {
        public C11202a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(TopicMoment topicMoment, int i) {
            super.mo55695j(topicMoment, i);
            p6j0.m167671e("e_topic", "p_circle_detail", j760.m140076a("topic_id", topicMoment.f39247id), j760.m140076a("is_create", Boolean.valueOf(topicMoment.owner.f38759id.equals(FeedModule.m60221F().userId()))), j760.m140076a("topic_type", zi60.m218961w().m218964E(topicMoment)), j760.m140076a("topic_source", "circle_relate_topic"));
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo57958l(TopicMoment topicMoment, int i, long j) {
            super.mo57958l(topicMoment, i, j);
        }
    }

    /* JADX INFO: renamed from: M4 */
    public View m62043M4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t6h.m187380b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: N4 */
    public void m62044N4(List<TopicMoment> list) {
        this.f40121B = list;
        s6h s6hVar = this.f40120A;
        if (s6hVar != null) {
            s6hVar.m182452J(list);
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM62043M4 = m62043M4(layoutInflater, viewGroup);
        s6h s6hVar = new s6h(act(), new C11202a());
        this.f40120A = s6hVar;
        this.f40122z.setAdapter(s6hVar);
        xdl0.m208368c0(this.f40122z, t100.m186890d(156.0f));
        this.f40122z.setClipToPadding(false);
        xdl0.m208325C0(this.f40122z, xdl0.m208408w0());
        List<TopicMoment> list = this.f40121B;
        if (list != null) {
            this.f40120A.m182452J(list);
        }
        return viewM62043M4;
    }
}
