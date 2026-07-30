package com.p000p1.mobile.putong.feed.newui.mediapicker.post.state;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import p007l.jfh;
import p007l.nfh;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedMomentPostSelectStatusAct extends FeedMyStatusBaseAct {

    /* JADX INFO: renamed from: h */
    public Emotion f2264h;

    /* JADX INFO: renamed from: i */
    public BubbleInfo f2265i;

    /* JADX INFO: renamed from: j */
    public nfh f2266j;

    /* JADX INFO: renamed from: k */
    public jfh f2267k;

    /* JADX INFO: renamed from: p2 */
    public static Intent m4075p2(Act act, BubbleInfo bubbleInfo) {
        Intent intent = new Intent((Context) act, (Class<?>) FeedMomentPostSelectStatusAct.class);
        intent.putExtra("userState", bubbleInfo);
        return intent;
    }

    public void initDataOnCreate() {
        this.f2266j = new nfh(this);
        jfh jfhVar = new jfh(this);
        this.f2267k = jfhVar;
        jfhVar.C(this.f2266j);
        this.f2267k.m11135Z();
        super.initDataOnCreate();
    }

    @Override // com.p000p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: l2 */
    public View mo4076l2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = this.f2266j.inflateView(layoutInflater, viewGroup);
        this.f2267k.m11136a0();
        return viewInflateView;
    }

    public String pageId() {
        return "p_moment_fast_state_post";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Intent intent = getIntent();
        if (NullChecker.a(intent.getSerializableExtra("userState"))) {
            BubbleInfo bubbleInfo = (BubbleInfo) intent.getSerializableExtra("userState");
            this.f2265i = bubbleInfo;
            Emotion emotion = bubbleInfo.emotion;
            this.f2264h = emotion;
            emotion.backgroundColor = bubbleInfo.textTheme.backgroundColor;
        }
    }
}
