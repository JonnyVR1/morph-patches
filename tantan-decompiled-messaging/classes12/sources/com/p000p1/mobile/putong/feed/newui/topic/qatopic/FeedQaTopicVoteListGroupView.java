package com.p000p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p1.mobile.android.app.Act;
import java.util.List;
import l.d30;
import p007l.vmb0;
import p007l.wzh;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class FeedQaTopicVoteListGroupView<T extends View> extends VFrame {

    /* JADX INFO: renamed from: a */
    public vmb0 f4535a;

    /* JADX INFO: renamed from: b */
    public String f4536b;

    public FeedQaTopicVoteListGroupView(Context context, String str) {
        super(context);
        this.f4536b = str;
        mo7113K(context);
    }

    private String getFrom() {
        return this.f4536b;
    }

    /* JADX INFO: renamed from: B */
    public T m7108B(wzh wzhVar) {
        return getQaTopicVoteViewList().get(wzhVar.m15946c());
    }

    /* JADX INFO: renamed from: C */
    public abstract void mo7109C(wzh wzhVar);

    /* JADX INFO: renamed from: E */
    public abstract void mo7110E(wzh wzhVar);

    /* JADX INFO: renamed from: F */
    public void mo7111F(wzh wzhVar) {
        if (wzhVar.m15952i()) {
            mo7109C(wzhVar);
        } else {
            mo7110E(wzhVar);
        }
    }

    /* JADX INFO: renamed from: G */
    public abstract void mo7112G(wzh wzhVar);

    /* JADX INFO: renamed from: K */
    public void mo7113K(Context context) {
        this.f4535a = m7118s(act());
    }

    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void m7114L(wzh wzhVar) {
        View viewM7108B = m7108B(wzhVar);
        if (!wzhVar.m15949f()) {
            mo7116N(viewM7108B, FeedQaItemVoteStatus.NO_VOTE);
        } else if (wzhVar.m15952i()) {
            mo7116N(viewM7108B, FeedQaItemVoteStatus.HAVE_VOTE_BE_VOTING);
        } else {
            mo7116N(viewM7108B, FeedQaItemVoteStatus.HAVE_VOTE_NOT_BE_VOTING);
        }
    }

    /* JADX INFO: renamed from: N */
    public abstract void mo7116N(T t, FeedQaItemVoteStatus feedQaItemVoteStatus);

    /* JADX INFO: renamed from: O */
    public void m7117O(TopicMoment topicMoment) {
        vmb0 vmb0Var = this.f4535a;
        if (vmb0Var != null) {
            vmb0Var.m15459w(topicMoment);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Act act() {
        return getContext();
    }

    public abstract int getAnimTime();

    public abstract List<T> getQaTopicVoteViewList();

    public abstract View getView();

    public abstract View getVoteListContainer();

    public abstract List<View> getVoteViewContainerList();

    /* JADX INFO: renamed from: s */
    public final vmb0 m7118s(Act act) {
        return new vmb0(this, act, mo7119u(), getFrom());
    }

    public void setCancelSuccess(d30 d30Var) {
        vmb0 vmb0Var = this.f4535a;
        if (vmb0Var != null) {
            vmb0Var.m15461y(d30Var);
        }
    }

    public void setVoteSuccess(d30 d30Var) {
        vmb0 vmb0Var = this.f4535a;
        if (vmb0Var != null) {
            vmb0Var.m15462z(d30Var);
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean mo7119u() {
        return true;
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo7120v(wzh wzhVar);

    /* JADX INFO: renamed from: w */
    public void m7121w(wzh wzhVar) {
        if (wzhVar.m15949f()) {
            mo7111F(wzhVar);
        } else {
            mo7112G(wzhVar);
        }
    }

    /* JADX INFO: renamed from: z */
    public void mo7122z(final wzh wzhVar) {
        if (!wzhVar.m15950g()) {
            m7121w(wzhVar);
            m7114L(wzhVar);
            return;
        }
        mo7120v(wzhVar);
        if (wzhVar.m15951h()) {
            act().postDelayed(new Runnable() { // from class: l.iwh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9151a.m7114L(wzhVar);
                }
            }, 300L);
        } else {
            m7114L(wzhVar);
        }
    }

    public FeedQaTopicVoteListGroupView(Context context) {
        super(context);
        mo7113K(context);
    }

    public FeedQaTopicVoteListGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo7113K(context);
    }

    public FeedQaTopicVoteListGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo7113K(context);
    }
}
