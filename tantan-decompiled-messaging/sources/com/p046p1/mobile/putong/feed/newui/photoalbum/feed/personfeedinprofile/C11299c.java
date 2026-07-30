package com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import p149l.eac0;
import p149l.l80;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.c */
/* JADX INFO: loaded from: classes12.dex */
public class C11299c extends eac0<TopicMoment> {

    /* JADX INFO: renamed from: d */
    public int f41762d = -1;

    /* JADX INFO: renamed from: e */
    public Context f41763e;

    /* JADX INFO: renamed from: f */
    public C11298b f41764f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.c$a */
    public class a extends l80<TopicMoment> {
        public a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(TopicMoment topicMoment, int i) {
            super.mo55695j(topicMoment, i);
            zvf0.m220368A("e_profile_moment_tag", OMSDialogPositon.p_suggest_user_profile_info_view, vwb.m200311Y("topic_id", topicMoment.f39247id));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.c$b */
    public interface b {
        /* JADX INFO: renamed from: b */
        default void m64536b(TopicMoment topicMoment, int i, int i2) {
            if (i == i2) {
                mo64518e(topicMoment, false);
            } else {
                mo64518e(topicMoment, true);
            }
        }

        /* JADX INFO: renamed from: e */
        void mo64518e(TopicMoment topicMoment, boolean z);
    }

    public C11299c(Context context, C11298b c11298b) {
        this.f41763e = context;
        this.f41764f = c11298b;
        m115416E(new a());
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int mo28824C() {
        C11298b c11298b = this.f41764f;
        if (c11298b == null) {
            return 0;
        }
        return c11298b.m64523c().size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return new TopicListItemView(this.f41763e);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final TopicMoment topicMoment, int i, final int i2) {
        TopicListItemView topicListItemView = (TopicListItemView) view;
        topicListItemView.m64495c(topicMoment, this.f41762d == i2 && this.f41764f.m64524d());
        if (this.f41764f.m64521a() > 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.leftMargin = t100.m186890d(10.0f);
            topicListItemView.setLayoutParams(marginLayoutParams);
        }
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.yzi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f200889a.m64533I(topicMoment, i2, view2);
            }
        });
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return this.f41764f.m64523c().get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m64533I(TopicMoment topicMoment, int i, View view) {
        zvf0.m220399u("e_profile_moment_tag", OMSDialogPositon.p_suggest_user_profile_info_view, vwb.m200311Y("topic_id", topicMoment.f39247id));
        if (this.f41764f.m64522b() != null) {
            this.f41764f.m64522b().m64536b(topicMoment, i, this.f41762d);
        }
        int i2 = this.f41762d;
        this.f41762d = i;
        if (i2 == i) {
            this.f41762d = -1;
        }
        notifyItemChanged(i2);
        notifyItemChanged(this.f41762d);
    }

    /* JADX INFO: renamed from: J */
    public void m64534J(C11298b c11298b) {
        this.f41764f = c11298b;
        notifyDataSetChanged();
    }
}
