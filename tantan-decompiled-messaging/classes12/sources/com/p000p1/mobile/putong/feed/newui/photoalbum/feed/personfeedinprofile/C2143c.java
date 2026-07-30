package com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import l.j760;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p007l.eac0;
import p007l.l80;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2143c extends eac0<TopicMoment> {

    /* JADX INFO: renamed from: d */
    public int f3223d = -1;

    /* JADX INFO: renamed from: e */
    public Context f3224e;

    /* JADX INFO: renamed from: f */
    public C2142b f3225f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.c$a */
    public class a extends l80<TopicMoment> {
        public a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(TopicMoment topicMoment, int i) {
            super.mo2866j(topicMoment, i);
            zvf0.A("e_profile_moment_tag", OMSDialogPositon.p_suggest_user_profile_info_view, new j760[]{vwb.Y("topic_id", topicMoment.f708id)});
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.c$b */
    public interface b {
        /* JADX INFO: renamed from: b */
        default void m5630b(TopicMoment topicMoment, int i, int i2) {
            if (i == i2) {
                mo5609e(topicMoment, false);
            } else {
                mo5609e(topicMoment, true);
            }
        }

        /* JADX INFO: renamed from: e */
        void mo5609e(TopicMoment topicMoment, boolean z);
    }

    public C2143c(Context context, C2142b c2142b) {
        this.f3224e = context;
        this.f3225f = c2142b;
        m9685E(new a());
    }

    /* JADX INFO: renamed from: C */
    public int m5623C() {
        C2142b c2142b = this.f3225f;
        if (c2142b == null) {
            return 0;
        }
        return c2142b.m5614c().size();
    }

    /* JADX INFO: renamed from: D */
    public View m5624D(ViewGroup viewGroup, int i) {
        return new TopicListItemView(this.f3224e);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m5622A(View view, final TopicMoment topicMoment, int i, final int i2) {
        TopicListItemView topicListItemView = (TopicListItemView) view;
        topicListItemView.m5586c(topicMoment, this.f3223d == i2 && this.f3225f.m5615d());
        if (this.f3225f.m5612a() > 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.leftMargin = t100.d(10.0f);
            topicListItemView.setLayoutParams(marginLayoutParams);
        }
        xdl0.E0(view, new View.OnClickListener() { // from class: l.yzi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f15542a.m5627I(topicMoment, i2, view2);
            }
        });
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return this.f3225f.m5614c().get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m5627I(TopicMoment topicMoment, int i, View view) {
        zvf0.u("e_profile_moment_tag", OMSDialogPositon.p_suggest_user_profile_info_view, new j760[]{vwb.Y("topic_id", topicMoment.f708id)});
        if (this.f3225f.m5613b() != null) {
            this.f3225f.m5613b().m5630b(topicMoment, i, this.f3223d);
        }
        int i2 = this.f3223d;
        this.f3223d = i;
        if (i2 == i) {
            this.f3223d = -1;
        }
        notifyItemChanged(i2);
        notifyItemChanged(this.f3223d);
    }

    /* JADX INFO: renamed from: J */
    public void m5628J(C2142b c2142b) {
        this.f3225f = c2142b;
        notifyDataSetChanged();
    }
}
