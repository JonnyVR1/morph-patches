package com.p046p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import p149l.b5c0;
import p149l.d30;
import p149l.o6c0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedQaInputAct extends PutongAct {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public /* synthetic */ void m65951Z1() {
        setResult(1, new Intent());
        m66873d2();
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m65952a2() {
        setResult(1, null);
        m66873d2();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(o6c0.f142101R2, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        final FeedChangeQATopicInputJoinView feedChangeQATopicInputJoinView = (FeedChangeQATopicInputJoinView) findViewById(b5c0.f73619w0);
        feedChangeQATopicInputJoinView.setFrom(getIntent().getStringExtra("from"));
        feedChangeQATopicInputJoinView.setSendSuccess(new d30() { // from class: l.ewh
            @Override // p149l.d30
            public final void call() {
                this.f93498a.m65951Z1();
            }
        });
        feedChangeQATopicInputJoinView.setCloseAction(new d30() { // from class: l.fwh
            @Override // p149l.d30
            public final void call() {
                this.f99655a.m65952a2();
            }
        });
        feedChangeQATopicInputJoinView.setTopicMoment((TopicMoment) getIntent().getSerializableExtra("topicMoment"));
        postDelayed(new Runnable() { // from class: l.gwh
            @Override // java.lang.Runnable
            public final void run() {
                feedChangeQATopicInputJoinView.mo65921E();
            }
        }, 400L);
    }
}
