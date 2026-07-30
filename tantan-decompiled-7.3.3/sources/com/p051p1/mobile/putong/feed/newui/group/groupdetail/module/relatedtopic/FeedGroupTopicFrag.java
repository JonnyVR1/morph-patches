package com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.relatedtopic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import java.util.List;
import p153l.bnl0;
import p153l.er60;
import p153l.h80;
import p153l.h8h;
import p153l.i8h;
import p153l.pf60;
import p153l.qa00;
import p153l.tfj0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedGroupTopicFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public h8h f40968A;

    /* JADX INFO: renamed from: B */
    public List<TopicMoment> f40969B;

    /* JADX INFO: renamed from: z */
    public FeedMaxHeightRecyclerView f40970z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.groupdetail.module.relatedtopic.FeedGroupTopicFrag$a */
    public class C11365a extends h80<TopicMoment> {
        public C11365a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(TopicMoment topicMoment, int i) {
            super.mo56878j(topicMoment, i);
            tfj0.m190942e("e_topic", "p_circle_detail", pf60.m172085a("topic_id", topicMoment.f40095id), pf60.m172085a("is_create", Boolean.valueOf(topicMoment.owner.f39607id.equals(FeedModule.m61405F().userId()))), pf60.m172085a("topic_type", er60.m122104w().m122107E(topicMoment)), pf60.m172085a("topic_source", "circle_relate_topic"));
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo59141l(TopicMoment topicMoment, int i, long j) {
            super.mo59141l(topicMoment, i, j);
        }
    }

    /* JADX INFO: renamed from: M4 */
    public View m63226M4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return i8h.m139010b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: N4 */
    public void m63227N4(List<TopicMoment> list) {
        this.f40969B = list;
        h8h h8hVar = this.f40968A;
        if (h8hVar != null) {
            h8hVar.m133937J(list);
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM63226M4 = m63226M4(layoutInflater, viewGroup);
        h8h h8hVar = new h8h(act(), new C11365a());
        this.f40968A = h8hVar;
        this.f40970z.setAdapter(h8hVar);
        bnl0.m105548c0(this.f40970z, qa00.m175859d(156.0f));
        this.f40970z.setClipToPadding(false);
        bnl0.m105505C0(this.f40970z, bnl0.m105588w0());
        List<TopicMoment> list = this.f40969B;
        if (list != null) {
            this.f40968A.m133937J(list);
        }
        return viewM63226M4;
    }
}
