package com.p051p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import java.util.List;
import p151v.VFrame;
import p153l.l1i;
import p153l.x20;
import p153l.zub0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class FeedQaTopicVoteListGroupView<T extends View> extends VFrame {

    /* JADX INFO: renamed from: a */
    public zub0 f43922a;

    /* JADX INFO: renamed from: b */
    public String f43923b;

    public FeedQaTopicVoteListGroupView(Context context, String str) {
        super(context);
        this.f43923b = str;
        mo67144K(context);
    }

    private String getFrom() {
        return this.f43923b;
    }

    /* JADX INFO: renamed from: B */
    public T m67139B(l1i l1iVar) {
        return getQaTopicVoteViewList().get(l1iVar.m152489c());
    }

    /* JADX INFO: renamed from: C */
    public abstract void mo67140C(l1i l1iVar);

    /* JADX INFO: renamed from: E */
    public abstract void mo67141E(l1i l1iVar);

    /* JADX INFO: renamed from: F */
    public void mo67142F(l1i l1iVar) {
        if (l1iVar.m152495i()) {
            mo67140C(l1iVar);
        } else {
            mo67141E(l1iVar);
        }
    }

    /* JADX INFO: renamed from: G */
    public abstract void mo67143G(l1i l1iVar);

    /* JADX INFO: renamed from: K */
    public void mo67144K(Context context) {
        this.f43922a = m67149s(act());
    }

    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void m67145L(l1i l1iVar) {
        View viewM67139B = m67139B(l1iVar);
        if (!l1iVar.m152492f()) {
            mo67147N(viewM67139B, FeedQaItemVoteStatus.NO_VOTE);
        } else if (l1iVar.m152495i()) {
            mo67147N(viewM67139B, FeedQaItemVoteStatus.HAVE_VOTE_BE_VOTING);
        } else {
            mo67147N(viewM67139B, FeedQaItemVoteStatus.HAVE_VOTE_NOT_BE_VOTING);
        }
    }

    /* JADX INFO: renamed from: N */
    public abstract void mo67147N(T t, FeedQaItemVoteStatus feedQaItemVoteStatus);

    /* JADX INFO: renamed from: O */
    public void m67148O(TopicMoment topicMoment) {
        zub0 zub0Var = this.f43922a;
        if (zub0Var != null) {
            zub0Var.m221630w(topicMoment);
        }
    }

    public Act act() {
        return (Act) getContext();
    }

    public abstract int getAnimTime();

    public abstract List<T> getQaTopicVoteViewList();

    public abstract View getView();

    public abstract View getVoteListContainer();

    public abstract List<View> getVoteViewContainerList();

    /* JADX INFO: renamed from: s */
    public final zub0 m67149s(Act act) {
        return new zub0(this, act, mo67150u(), getFrom());
    }

    public void setCancelSuccess(x20 x20Var) {
        zub0 zub0Var = this.f43922a;
        if (zub0Var != null) {
            zub0Var.m221632y(x20Var);
        }
    }

    public void setVoteSuccess(x20 x20Var) {
        zub0 zub0Var = this.f43922a;
        if (zub0Var != null) {
            zub0Var.m221633z(x20Var);
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean mo67150u() {
        return true;
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo67151v(l1i l1iVar);

    /* JADX INFO: renamed from: w */
    public void m67152w(l1i l1iVar) {
        if (l1iVar.m152492f()) {
            mo67142F(l1iVar);
        } else {
            mo67143G(l1iVar);
        }
    }

    /* JADX INFO: renamed from: z */
    public void mo67153z(final l1i l1iVar) {
        if (!l1iVar.m152493g()) {
            m67152w(l1iVar);
            m67145L(l1iVar);
            return;
        }
        mo67151v(l1iVar);
        if (l1iVar.m152494h()) {
            act().postDelayed(new Runnable() { // from class: l.xxh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f196637a.m67145L(l1iVar);
                }
            }, 300L);
        } else {
            m67145L(l1iVar);
        }
    }

    public FeedQaTopicVoteListGroupView(Context context) {
        super(context);
        mo67144K(context);
    }

    public FeedQaTopicVoteListGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo67144K(context);
    }

    public FeedQaTopicVoteListGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo67144K(context);
    }
}
