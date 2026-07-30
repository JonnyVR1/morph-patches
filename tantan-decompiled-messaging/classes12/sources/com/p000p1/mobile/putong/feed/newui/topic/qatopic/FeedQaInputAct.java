package com.p000p1.mobile.putong.feed.newui.topic.qatopic;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p1.mobile.putong.app.PutongAct;
import l.d30;
import p007l.b5c0;
import p007l.o6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedQaInputAct extends PutongAct {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z1 */
    public /* synthetic */ void m7103Z1() {
        setResult(1, new Intent());
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m7104a2() {
        setResult(1, null);
        finish();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(o6c0.f11120R2, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        final FeedChangeQATopicInputJoinView feedChangeQATopicInputJoinView = (FeedChangeQATopicInputJoinView) findViewById(b5c0.f6100w0);
        feedChangeQATopicInputJoinView.setFrom(getIntent().getStringExtra("from"));
        feedChangeQATopicInputJoinView.setSendSuccess(new d30() { // from class: l.ewh
            public final void call() {
                this.f7491a.m7103Z1();
            }
        });
        feedChangeQATopicInputJoinView.setCloseAction(new d30() { // from class: l.fwh
            public final void call() {
                this.f8266a.m7104a2();
            }
        });
        feedChangeQATopicInputJoinView.setTopicMoment((TopicMoment) getIntent().getSerializableExtra("topicMoment"));
        postDelayed(new Runnable() { // from class: l.gwh
            @Override // java.lang.Runnable
            public final void run() {
                feedChangeQATopicInputJoinView.mo7073E();
            }
        }, 400L);
    }
}
