package com.p046p1.mobile.putong.feed.newui.status.selectstatus;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct;
import com.tantanapp.common.utils.NullChecker;
import p149l.e1c0;
import p149l.t100;
import p149l.txh;
import p149l.zxh;

/* JADX INFO: loaded from: classes12.dex */
public class FeedSelectAndPostStatusAct extends FeedMyStatusBaseAct {

    /* JADX INFO: renamed from: h */
    public Emotion f42967h;

    /* JADX INFO: renamed from: i */
    public BubbleInfo f42968i;

    /* JADX INFO: renamed from: j */
    public zxh f42969j;

    /* JADX INFO: renamed from: k */
    public txh f42970k;

    /* JADX INFO: renamed from: l */
    public String f42971l;

    /* JADX INFO: renamed from: p2 */
    public static Intent m65811p2(Act act) {
        return new Intent(act, (Class<?>) FeedSelectAndPostStatusAct.class);
    }

    /* JADX INFO: renamed from: q2 */
    public static Intent m65812q2(Act act, BubbleInfo bubbleInfo, String str) {
        Intent intent = new Intent(act, (Class<?>) FeedSelectAndPostStatusAct.class);
        intent.putExtra("userState", bubbleInfo);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: r2 */
    public static Intent m65813r2(Act act, String str) {
        Intent intent = new Intent(act, (Class<?>) FeedSelectAndPostStatusAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: s2 */
    public static void m65814s2(Act act) {
        act.startActivity(m65811p2(act));
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: u2 */
    public static void m65815u2(Act act, String str) {
        act.startActivity(m65813r2(act, str));
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: d2 */
    public GradientDrawable m65816d2() {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, mo65798g2());
        gradientDrawable.setCornerRadii(new float[]{t100.m186890d(32.0f), t100.m186890d(32.0f), t100.m186890d(32.0f), t100.m186890d(32.0f), 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        return gradientDrawable;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: g2 */
    public int[] mo65798g2() {
        return new int[]{getResources().getColor(e1c0.f88754I), getResources().getColor(e1c0.f88754I), getResources().getColor(e1c0.f88754I)};
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f42969j = new zxh(this);
        txh txhVar = new txh(this);
        this.f42970k = txhVar;
        txhVar.mo51532C(this.f42969j);
        this.f42970k.mo39469Z();
        this.f42971l = act().getIntent().getStringExtra("from");
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: l2 */
    public View mo63060l2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = this.f42969j.inflateView(layoutInflater, viewGroup);
        this.f42970k.mo39470a0();
        return viewInflateView;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: m2 */
    public Integer mo65801m2() {
        return super.mo65801m2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (NullChecker.m81304b(intent) && NullChecker.m81303a(intent.getSerializableExtra("userState"))) {
            BubbleInfo bubbleInfo = (BubbleInfo) intent.getSerializableExtra("userState");
            this.f42968i = bubbleInfo;
            this.f42969j.m220812B(bubbleInfo);
        }
        m65802n2(m65816d2());
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_set_my_state_post";
    }

    @Override // com.p046p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Intent intent = getIntent();
        if (NullChecker.m81303a(intent.getSerializableExtra("userState"))) {
            BubbleInfo bubbleInfo = (BubbleInfo) intent.getSerializableExtra("userState");
            this.f42968i = bubbleInfo;
            Emotion emotion = bubbleInfo.emotion;
            this.f42967h = emotion;
            emotion.backgroundColor = bubbleInfo.textTheme.backgroundColor;
        }
    }
}
