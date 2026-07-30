package com.p046p1.mobile.putong.feed.newui.mediapicker.post.state;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct;
import com.tantanapp.common.utils.NullChecker;
import p149l.jfh;
import p149l.nfh;

/* JADX INFO: loaded from: classes12.dex */
public class FeedMomentPostSelectStatusAct extends FeedMyStatusBaseAct {

    /* JADX INFO: renamed from: h */
    public Emotion f40803h;

    /* JADX INFO: renamed from: i */
    public BubbleInfo f40804i;

    /* JADX INFO: renamed from: j */
    public nfh f40805j;

    /* JADX INFO: renamed from: k */
    public jfh f40806k;

    /* JADX INFO: renamed from: p2 */
    public static Intent m63059p2(Act act, BubbleInfo bubbleInfo) {
        Intent intent = new Intent(act, (Class<?>) FeedMomentPostSelectStatusAct.class);
        intent.putExtra("userState", bubbleInfo);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f40805j = new nfh(this);
        jfh jfhVar = new jfh(this);
        this.f40806k = jfhVar;
        jfhVar.mo51532C(this.f40805j);
        this.f40806k.mo39469Z();
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: l2 */
    public View mo63060l2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = this.f40805j.inflateView(layoutInflater, viewGroup);
        this.f40806k.mo39470a0();
        return viewInflateView;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_moment_fast_state_post";
    }

    @Override // com.p046p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Intent intent = getIntent();
        if (NullChecker.m81303a(intent.getSerializableExtra("userState"))) {
            BubbleInfo bubbleInfo = (BubbleInfo) intent.getSerializableExtra("userState");
            this.f40804i = bubbleInfo;
            Emotion emotion = bubbleInfo.emotion;
            this.f40803h = emotion;
            emotion.backgroundColor = bubbleInfo.textTheme.backgroundColor;
        }
    }
}
