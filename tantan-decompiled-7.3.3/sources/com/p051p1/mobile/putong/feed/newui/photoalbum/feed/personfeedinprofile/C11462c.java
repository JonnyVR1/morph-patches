package com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import p153l.bnl0;
import p153l.h80;
import p153l.i4g0;
import p153l.jyb;
import p153l.kic0;
import p153l.qa00;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.c */
/* JADX INFO: loaded from: classes13.dex */
public class C11462c extends kic0<TopicMoment> {

    /* JADX INFO: renamed from: d */
    public int f42610d = -1;

    /* JADX INFO: renamed from: e */
    public Context f42611e;

    /* JADX INFO: renamed from: f */
    public C11461b f42612f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.c$a */
    public class a extends h80<TopicMoment> {
        public a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(TopicMoment topicMoment, int i) {
            super.mo56878j(topicMoment, i);
            i4g0.m138492A("e_profile_moment_tag", OMSDialogPositon.p_suggest_user_profile_info_view, jyb.m147494Y("topic_id", topicMoment.f40095id));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.c$b */
    public interface b {
        /* JADX INFO: renamed from: b */
        default void m65719b(TopicMoment topicMoment, int i, int i2) {
            if (i == i2) {
                mo65701e(topicMoment, false);
            } else {
                mo65701e(topicMoment, true);
            }
        }

        /* JADX INFO: renamed from: e */
        void mo65701e(TopicMoment topicMoment, boolean z);
    }

    public C11462c(Context context, C11461b c11461b) {
        this.f42611e = context;
        this.f42612f = c11461b;
        m149868E(new a());
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int mo29823C() {
        C11461b c11461b = this.f42612f;
        if (c11461b == null) {
            return 0;
        }
        return c11461b.m65706c().size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return new TopicListItemView(this.f42611e);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final TopicMoment topicMoment, int i, final int i2) {
        TopicListItemView topicListItemView = (TopicListItemView) view;
        topicListItemView.m65678c(topicMoment, this.f42610d == i2 && this.f42612f.m65707d());
        if (this.f42612f.m65704a() > 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.leftMargin = qa00.m175859d(10.0f);
            topicListItemView.setLayoutParams(marginLayoutParams);
        }
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.c9j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f80490a.m65716I(topicMoment, i2, view2);
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return this.f42612f.m65706c().get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m65716I(TopicMoment topicMoment, int i, View view) {
        i4g0.m138523u("e_profile_moment_tag", OMSDialogPositon.p_suggest_user_profile_info_view, jyb.m147494Y("topic_id", topicMoment.f40095id));
        if (this.f42612f.m65705b() != null) {
            this.f42612f.m65705b().m65719b(topicMoment, i, this.f42610d);
        }
        int i2 = this.f42610d;
        this.f42610d = i;
        if (i2 == i) {
            this.f42610d = -1;
        }
        notifyItemChanged(i2);
        notifyItemChanged(this.f42610d);
    }

    /* JADX INFO: renamed from: J */
    public void m65717J(C11461b c11461b) {
        this.f42612f = c11461b;
        notifyDataSetChanged();
    }
}
