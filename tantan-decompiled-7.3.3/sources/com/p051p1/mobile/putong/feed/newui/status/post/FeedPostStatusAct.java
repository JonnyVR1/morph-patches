package com.p051p1.mobile.putong.feed.newui.status.post;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p153l.cxh;
import p153l.lwh;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPostStatusAct extends FeedMyStatusBaseAct {

    /* JADX INFO: renamed from: h */
    public cxh f43809h;

    /* JADX INFO: renamed from: i */
    public lwh f43810i;

    /* JADX INFO: renamed from: j */
    public Emotion f43811j;

    /* JADX INFO: renamed from: k */
    public BubbleInfo f43812k;

    /* JADX INFO: renamed from: l */
    public boolean f43813l;

    /* JADX INFO: renamed from: m */
    public String f43814m;

    /* JADX INFO: renamed from: r2 */
    public static Intent m66988r2(Act act, BubbleInfo bubbleInfo, String str) {
        Intent intent = new Intent(act, (Class<?>) FeedPostStatusAct.class);
        intent.setFlags(603979776);
        intent.putExtra("userState", bubbleInfo);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: s2 */
    public static Intent m66989s2(Act act, Emotion emotion) {
        Intent intent = new Intent(act, (Class<?>) FeedPostStatusAct.class);
        intent.setFlags(603979776);
        intent.putExtra(Emotion.TYPE, emotion);
        return intent;
    }

    /* JADX INFO: renamed from: u2 */
    public static Intent m66990u2(Act act, Emotion emotion, String str) {
        Intent intentM66989s2 = m66989s2(act, emotion);
        intentM66989s2.putExtra("from", str);
        return intentM66989s2;
    }

    /* JADX INFO: renamed from: v2 */
    public static Intent m66991v2(Act act, ArrayList<Media> arrayList) {
        Intent intent = new Intent(act, (Class<?>) FeedPostStatusAct.class);
        intent.setFlags(603979776);
        intent.putExtra("my_states", arrayList);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public /* synthetic */ void m66992w2(C4470c c4470c) {
        if (c4470c == C4470c.f16267i && NullChecker.m82486a(this.f43809h)) {
            this.f43809h.m113018R();
        }
    }

    @Override // com.p051p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: d2 */
    public int mo66979d2() {
        return Color.parseColor("#cc000000");
    }

    /* JADX INFO: renamed from: e2 */
    public GradientDrawable m66993e2() {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, mo66981h2());
        gradientDrawable.setCornerRadii(new float[]{qa00.m175859d(32.0f), qa00.m175859d(32.0f), qa00.m175859d(32.0f), qa00.m175859d(32.0f), 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        return gradientDrawable;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: h2 */
    public int[] mo66981h2() {
        Emotion emotion = this.f43811j;
        if (emotion == null || emotion.backgroundColor.size() == 0) {
            return null;
        }
        int[] iArr = new int[this.f43811j.backgroundColor.size()];
        for (int i = 0; i < this.f43811j.backgroundColor.size(); i++) {
            try {
                iArr[i] = Color.parseColor(this.f43811j.backgroundColor.get(i));
            } catch (Exception e) {
                iArr[i] = Color.parseColor("#ffffff");
                CrashHelper.m82479c(e);
            }
        }
        return iArr;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f43809h = new cxh(this);
        lwh lwhVar = new lwh(this);
        this.f43810i = lwhVar;
        lwhVar.mo52715C(this.f43809h);
        this.f43810i.mo40472Z();
        super.initDataOnCreate();
        String stringExtra = act().getIntent().getStringExtra("from");
        this.f43814m = stringExtra;
        this.pageHelper.m152781p(pf60.m172085a("where_show_from", TextUtils.equals(stringExtra, "onlinematch") ? "quickchat" : "moment"));
    }

    @Override // com.p051p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.iwh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117269a.m66992w2((C4470c) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: m2 */
    public View mo64243m2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f43809h.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10020 && i2 == -1) {
            this.f43810i.m156048h0(intent.getExtras());
            this.f43809h.m113024Y();
        } else {
            if (intent == null) {
                return;
            }
            ArrayList<Media> arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h);
            if (arrayList.get(0) instanceof Video) {
                return;
            }
            this.f43809h.m113021U(arrayList);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (NullChecker.m82487b(intent)) {
            this.f43813l = false;
            if (NullChecker.m82486a(intent.getSerializableExtra("my_states"))) {
                ArrayList<Media> arrayList = (ArrayList) intent.getSerializableExtra("my_states");
                if (arrayList == null || arrayList.size() == 0) {
                    return;
                } else {
                    this.f43809h.m113021U(arrayList);
                }
            }
            if (NullChecker.m82486a(intent.getSerializableExtra(Emotion.TYPE))) {
                Emotion emotion = (Emotion) intent.getSerializableExtra(Emotion.TYPE);
                this.f43811j = emotion;
                this.f43809h.m113020T(emotion);
                if (this.f43809h.f84245v == null) {
                    m66985o2(m66993e2());
                }
            }
            if (NullChecker.m82486a(intent.getSerializableExtra("userState"))) {
                BubbleInfo bubbleInfo = (BubbleInfo) intent.getSerializableExtra("userState");
                this.f43812k = bubbleInfo;
                this.f43809h.m113022V(bubbleInfo);
            }
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_set_my_state_post";
    }

    @Override // com.p051p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Intent intent = getIntent();
        this.f43811j = (Emotion) intent.getSerializableExtra(Emotion.TYPE);
        if (NullChecker.m82486a(intent.getSerializableExtra("userState"))) {
            BubbleInfo bubbleInfo = (BubbleInfo) intent.getSerializableExtra("userState");
            this.f43812k = bubbleInfo;
            Emotion emotion = bubbleInfo.emotion;
            this.f43811j = emotion;
            emotion.backgroundColor = bubbleInfo.textTheme.backgroundColor;
            this.f43813l = true;
        }
    }
}
