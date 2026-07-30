package com.p051p1.mobile.putong.feed.newui.mediapicker.post.state;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct;
import com.tantanapp.common.utils.NullChecker;
import p153l.chh;
import p153l.ygh;

/* JADX INFO: loaded from: classes13.dex */
public class FeedMomentPostSelectStatusAct extends FeedMyStatusBaseAct {

    /* JADX INFO: renamed from: h */
    public Emotion f41651h;

    /* JADX INFO: renamed from: i */
    public BubbleInfo f41652i;

    /* JADX INFO: renamed from: j */
    public chh f41653j;

    /* JADX INFO: renamed from: k */
    public ygh f41654k;

    /* JADX INFO: renamed from: q2 */
    public static Intent m64242q2(Act act, BubbleInfo bubbleInfo) {
        Intent intent = new Intent(act, (Class<?>) FeedMomentPostSelectStatusAct.class);
        intent.putExtra("userState", bubbleInfo);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f41653j = new chh(this);
        ygh yghVar = new ygh(this);
        this.f41654k = yghVar;
        yghVar.mo52715C(this.f41653j);
        this.f41654k.mo40472Z();
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: m2 */
    public View mo64243m2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = this.f41653j.inflateView(layoutInflater, viewGroup);
        this.f41654k.mo40473a0();
        return viewInflateView;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_moment_fast_state_post";
    }

    @Override // com.p051p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Intent intent = getIntent();
        if (NullChecker.m82486a(intent.getSerializableExtra("userState"))) {
            BubbleInfo bubbleInfo = (BubbleInfo) intent.getSerializableExtra("userState");
            this.f41652i = bubbleInfo;
            Emotion emotion = bubbleInfo.emotion;
            this.f41651h = emotion;
            emotion.backgroundColor = bubbleInfo.textTheme.backgroundColor;
        }
    }
}
