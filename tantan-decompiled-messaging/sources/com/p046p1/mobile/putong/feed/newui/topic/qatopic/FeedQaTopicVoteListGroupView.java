package com.p046p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import java.util.List;
import p147v.VFrame;
import p149l.d30;
import p149l.vmb0;
import p149l.wzh;

/* JADX INFO: loaded from: classes12.dex */
public abstract class FeedQaTopicVoteListGroupView<T extends View> extends VFrame {

    /* JADX INFO: renamed from: a */
    public vmb0 f43074a;

    /* JADX INFO: renamed from: b */
    public String f43075b;

    public FeedQaTopicVoteListGroupView(Context context, String str) {
        super(context);
        this.f43075b = str;
        mo65961K(context);
    }

    private String getFrom() {
        return this.f43075b;
    }

    /* JADX INFO: renamed from: B */
    public T m65956B(wzh wzhVar) {
        return getQaTopicVoteViewList().get(wzhVar.m206282c());
    }

    /* JADX INFO: renamed from: C */
    public abstract void mo65957C(wzh wzhVar);

    /* JADX INFO: renamed from: E */
    public abstract void mo65958E(wzh wzhVar);

    /* JADX INFO: renamed from: F */
    public void mo65959F(wzh wzhVar) {
        if (wzhVar.m206288i()) {
            mo65957C(wzhVar);
        } else {
            mo65958E(wzhVar);
        }
    }

    /* JADX INFO: renamed from: G */
    public abstract void mo65960G(wzh wzhVar);

    /* JADX INFO: renamed from: K */
    public void mo65961K(Context context) {
        this.f43074a = m65966s(act());
    }

    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void m65962L(wzh wzhVar) {
        View viewM65956B = m65956B(wzhVar);
        if (!wzhVar.m206285f()) {
            mo65964N(viewM65956B, FeedQaItemVoteStatus.NO_VOTE);
        } else if (wzhVar.m206288i()) {
            mo65964N(viewM65956B, FeedQaItemVoteStatus.HAVE_VOTE_BE_VOTING);
        } else {
            mo65964N(viewM65956B, FeedQaItemVoteStatus.HAVE_VOTE_NOT_BE_VOTING);
        }
    }

    /* JADX INFO: renamed from: N */
    public abstract void mo65964N(T t, FeedQaItemVoteStatus feedQaItemVoteStatus);

    /* JADX INFO: renamed from: O */
    public void m65965O(TopicMoment topicMoment) {
        vmb0 vmb0Var = this.f43074a;
        if (vmb0Var != null) {
            vmb0Var.m198930w(topicMoment);
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
    public final vmb0 m65966s(Act act) {
        return new vmb0(this, act, mo65967u(), getFrom());
    }

    public void setCancelSuccess(d30 d30Var) {
        vmb0 vmb0Var = this.f43074a;
        if (vmb0Var != null) {
            vmb0Var.m198932y(d30Var);
        }
    }

    public void setVoteSuccess(d30 d30Var) {
        vmb0 vmb0Var = this.f43074a;
        if (vmb0Var != null) {
            vmb0Var.m198933z(d30Var);
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean mo65967u() {
        return true;
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo65968v(wzh wzhVar);

    /* JADX INFO: renamed from: w */
    public void m65969w(wzh wzhVar) {
        if (wzhVar.m206285f()) {
            mo65959F(wzhVar);
        } else {
            mo65960G(wzhVar);
        }
    }

    /* JADX INFO: renamed from: z */
    public void mo65970z(final wzh wzhVar) {
        if (!wzhVar.m206286g()) {
            m65969w(wzhVar);
            m65962L(wzhVar);
            return;
        }
        mo65968v(wzhVar);
        if (wzhVar.m206287h()) {
            act().postDelayed(new Runnable() { // from class: l.iwh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f115272a.m65962L(wzhVar);
                }
            }, 300L);
        } else {
            m65962L(wzhVar);
        }
    }

    public FeedQaTopicVoteListGroupView(Context context) {
        super(context);
        mo65961K(context);
    }

    public FeedQaTopicVoteListGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo65961K(context);
    }

    public FeedQaTopicVoteListGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo65961K(context);
    }
}
