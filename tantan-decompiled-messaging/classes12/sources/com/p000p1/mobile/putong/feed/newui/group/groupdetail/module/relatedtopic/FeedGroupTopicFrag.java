package com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.relatedtopic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import com.p1.mobile.putong.app.PutongFrag;
import java.util.List;
import l.j760;
import l.t100;
import l.xdl0;
import p007l.l80;
import p007l.p6j0;
import p007l.s6h;
import p007l.t6h;
import p007l.zi60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedGroupTopicFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public s6h f1581A;

    /* JADX INFO: renamed from: B */
    public List<TopicMoment> f1582B;

    /* JADX INFO: renamed from: z */
    public FeedMaxHeightRecyclerView f1583z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.groupdetail.module.relatedtopic.FeedGroupTopicFrag$a */
    public class C2046a extends l80<TopicMoment> {
        public C2046a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(TopicMoment topicMoment, int i) {
            super.mo2866j(topicMoment, i);
            p6j0.m12915e("e_topic", "p_circle_detail", j760.a("topic_id", topicMoment.f708id), j760.a("is_create", Boolean.valueOf(topicMoment.owner.f220id.equals(FeedModule.m1139F().userId()))), j760.a("topic_type", zi60.m17436w().m17439E(topicMoment)), j760.a("topic_source", "circle_relate_topic"));
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo2867l(TopicMoment topicMoment, int i, long j) {
            super.mo2867l(topicMoment, i, j);
        }
    }

    /* JADX INFO: renamed from: M4 */
    public View m3024M4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t6h.m14437b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: N4 */
    public void m3025N4(List<TopicMoment> list) {
        this.f1582B = list;
        s6h s6hVar = this.f1581A;
        if (s6hVar != null) {
            s6hVar.m14032J(list);
        }
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM3024M4 = m3024M4(layoutInflater, viewGroup);
        s6h s6hVar = new s6h(act(), new C2046a());
        this.f1581A = s6hVar;
        this.f1583z.setAdapter(s6hVar);
        xdl0.c0(this.f1583z, t100.d(156.0f));
        this.f1583z.setClipToPadding(false);
        xdl0.C0(this.f1583z, xdl0.w0());
        List<TopicMoment> list = this.f1582B;
        if (list != null) {
            this.f1581A.m14032J(list);
        }
        return viewM3024M4;
    }
}
