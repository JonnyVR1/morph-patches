package com.p051p1.mobile.putong.feed.newui.status.selectstatus;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct;
import com.tantanapp.common.utils.NullChecker;
import p153l.izh;
import p153l.k9c0;
import p153l.ozh;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class FeedSelectAndPostStatusAct extends FeedMyStatusBaseAct {

    /* JADX INFO: renamed from: h */
    public Emotion f43815h;

    /* JADX INFO: renamed from: i */
    public BubbleInfo f43816i;

    /* JADX INFO: renamed from: j */
    public ozh f43817j;

    /* JADX INFO: renamed from: k */
    public izh f43818k;

    /* JADX INFO: renamed from: l */
    public String f43819l;

    /* JADX INFO: renamed from: q2 */
    public static Intent m66994q2(Act act) {
        return new Intent(act, (Class<?>) FeedSelectAndPostStatusAct.class);
    }

    /* JADX INFO: renamed from: r2 */
    public static Intent m66995r2(Act act, BubbleInfo bubbleInfo, String str) {
        Intent intent = new Intent(act, (Class<?>) FeedSelectAndPostStatusAct.class);
        intent.putExtra("userState", bubbleInfo);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: s2 */
    public static Intent m66996s2(Act act, String str) {
        Intent intent = new Intent(act, (Class<?>) FeedSelectAndPostStatusAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: u2 */
    public static void m66997u2(Act act) {
        act.startActivity(m66994q2(act));
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: v2 */
    public static void m66998v2(Act act, String str) {
        act.startActivity(m66996s2(act, str));
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: e2 */
    public GradientDrawable m66999e2() {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, mo66981h2());
        gradientDrawable.setCornerRadii(new float[]{qa00.m175859d(32.0f), qa00.m175859d(32.0f), qa00.m175859d(32.0f), qa00.m175859d(32.0f), 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        return gradientDrawable;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: h2 */
    public int[] mo66981h2() {
        return new int[]{getResources().getColor(k9c0.f124477I), getResources().getColor(k9c0.f124477I), getResources().getColor(k9c0.f124477I)};
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f43817j = new ozh(this);
        izh izhVar = new izh(this);
        this.f43818k = izhVar;
        izhVar.mo52715C(this.f43817j);
        this.f43818k.mo40472Z();
        this.f43819l = act().getIntent().getStringExtra("from");
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: m2 */
    public View mo64243m2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = this.f43817j.inflateView(layoutInflater, viewGroup);
        this.f43818k.mo40473a0();
        return viewInflateView;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: n2 */
    public Integer mo66984n2() {
        return super.mo66984n2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (NullChecker.m82487b(intent) && NullChecker.m82486a(intent.getSerializableExtra("userState"))) {
            BubbleInfo bubbleInfo = (BubbleInfo) intent.getSerializableExtra("userState");
            this.f43816i = bubbleInfo;
            this.f43817j.m169951B(bubbleInfo);
        }
        m66985o2(m66999e2());
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_set_my_state_post";
    }

    @Override // com.p051p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Intent intent = getIntent();
        if (NullChecker.m82486a(intent.getSerializableExtra("userState"))) {
            BubbleInfo bubbleInfo = (BubbleInfo) intent.getSerializableExtra("userState");
            this.f43816i = bubbleInfo;
            Emotion emotion = bubbleInfo.emotion;
            this.f43815h = emotion;
            emotion.backgroundColor = bubbleInfo.textTheme.backgroundColor;
        }
    }
}
