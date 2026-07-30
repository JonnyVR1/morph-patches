package com.p051p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import p153l.hdc0;
import p153l.tec0;
import p153l.x20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedQaInputAct extends PutongAct {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public /* synthetic */ void m67134a2() {
        setResult(1, new Intent());
        m68056e2();
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m67135b2() {
        setResult(1, null);
        m68056e2();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(tec0.f173570R2, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        final FeedChangeQATopicInputJoinView feedChangeQATopicInputJoinView = (FeedChangeQATopicInputJoinView) findViewById(hdc0.f108972w0);
        feedChangeQATopicInputJoinView.setFrom(getIntent().getStringExtra("from"));
        feedChangeQATopicInputJoinView.setSendSuccess(new x20() { // from class: l.txh
            @Override // p153l.x20
            public final void call() {
                this.f176559a.m67134a2();
            }
        });
        feedChangeQATopicInputJoinView.setCloseAction(new x20() { // from class: l.uxh
            @Override // p153l.x20
            public final void call() {
                this.f181449a.m67135b2();
            }
        });
        feedChangeQATopicInputJoinView.setTopicMoment((TopicMoment) getIntent().getSerializableExtra("topicMoment"));
        postDelayed(new Runnable() { // from class: l.vxh
            @Override // java.lang.Runnable
            public final void run() {
                feedChangeQATopicInputJoinView.mo67104E();
            }
        }, 400L);
    }
}
