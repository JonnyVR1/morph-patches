package com.p000p1.mobile.putong.feed.newui.status.selectstatus;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.t100;
import p007l.e1c0;
import p007l.txh;
import p007l.zxh;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedSelectAndPostStatusAct extends FeedMyStatusBaseAct {

    /* JADX INFO: renamed from: h */
    public Emotion f4428h;

    /* JADX INFO: renamed from: i */
    public BubbleInfo f4429i;

    /* JADX INFO: renamed from: j */
    public zxh f4430j;

    /* JADX INFO: renamed from: k */
    public txh f4431k;

    /* JADX INFO: renamed from: l */
    public String f4432l;

    /* JADX INFO: renamed from: p2 */
    public static Intent m6957p2(Act act) {
        return new Intent((Context) act, (Class<?>) FeedSelectAndPostStatusAct.class);
    }

    /* JADX INFO: renamed from: q2 */
    public static Intent m6958q2(Act act, BubbleInfo bubbleInfo, String str) {
        Intent intent = new Intent((Context) act, (Class<?>) FeedSelectAndPostStatusAct.class);
        intent.putExtra("userState", bubbleInfo);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: r2 */
    public static Intent m6959r2(Act act, String str) {
        Intent intent = new Intent((Context) act, (Class<?>) FeedSelectAndPostStatusAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: s2 */
    public static void m6960s2(Act act) {
        act.startActivity(m6957p2(act));
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: u2 */
    public static void m6961u2(Act act, String str) {
        act.startActivity(m6959r2(act, str));
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: d2 */
    public GradientDrawable m6962d2() {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, mo6944g2());
        gradientDrawable.setCornerRadii(new float[]{t100.d(32.0f), t100.d(32.0f), t100.d(32.0f), t100.d(32.0f), 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        return gradientDrawable;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: g2 */
    public int[] mo6944g2() {
        return new int[]{getResources().getColor(e1c0.f7110I), getResources().getColor(e1c0.f7110I), getResources().getColor(e1c0.f7110I)};
    }

    public void initDataOnCreate() {
        this.f4430j = new zxh(this);
        txh txhVar = new txh(this);
        this.f4431k = txhVar;
        txhVar.C(this.f4430j);
        this.f4431k.m14680Z();
        this.f4432l = act().getIntent().getStringExtra("from");
        super.initDataOnCreate();
    }

    @Override // com.p000p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: l2 */
    public View mo4076l2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = this.f4430j.inflateView(layoutInflater, viewGroup);
        this.f4431k.m14681a0();
        return viewInflateView;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: m2 */
    public Integer mo6947m2() {
        return super.mo6947m2();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (NullChecker.b(intent) && NullChecker.a(intent.getSerializableExtra("userState"))) {
            BubbleInfo bubbleInfo = (BubbleInfo) intent.getSerializableExtra("userState");
            this.f4429i = bubbleInfo;
            this.f4430j.m17559B(bubbleInfo);
        }
        m6948n2(m6962d2());
    }

    public String pageId() {
        return "p_set_my_state_post";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Intent intent = getIntent();
        if (NullChecker.a(intent.getSerializableExtra("userState"))) {
            BubbleInfo bubbleInfo = (BubbleInfo) intent.getSerializableExtra("userState");
            this.f4429i = bubbleInfo;
            Emotion emotion = bubbleInfo.emotion;
            this.f4428h = emotion;
            emotion.backgroundColor = bubbleInfo.textTheme.backgroundColor;
        }
    }
}
