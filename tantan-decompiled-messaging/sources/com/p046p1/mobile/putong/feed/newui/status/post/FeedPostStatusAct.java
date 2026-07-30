package com.p046p1.mobile.putong.feed.newui.status.post;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p149l.e30;
import p149l.j760;
import p149l.mkd0;
import p149l.nvh;
import p149l.t100;
import p149l.wuh;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPostStatusAct extends FeedMyStatusBaseAct {

    /* JADX INFO: renamed from: h */
    public nvh f42961h;

    /* JADX INFO: renamed from: i */
    public wuh f42962i;

    /* JADX INFO: renamed from: j */
    public Emotion f42963j;

    /* JADX INFO: renamed from: k */
    public BubbleInfo f42964k;

    /* JADX INFO: renamed from: l */
    public boolean f42965l;

    /* JADX INFO: renamed from: m */
    public String f42966m;

    /* JADX INFO: renamed from: q2 */
    public static Intent m65805q2(Act act, BubbleInfo bubbleInfo, String str) {
        Intent intent = new Intent(act, (Class<?>) FeedPostStatusAct.class);
        intent.setFlags(603979776);
        intent.putExtra("userState", bubbleInfo);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: r2 */
    public static Intent m65806r2(Act act, Emotion emotion) {
        Intent intent = new Intent(act, (Class<?>) FeedPostStatusAct.class);
        intent.setFlags(603979776);
        intent.putExtra(Emotion.TYPE, emotion);
        return intent;
    }

    /* JADX INFO: renamed from: s2 */
    public static Intent m65807s2(Act act, Emotion emotion, String str) {
        Intent intentM65806r2 = m65806r2(act, emotion);
        intentM65806r2.putExtra("from", str);
        return intentM65806r2;
    }

    /* JADX INFO: renamed from: u2 */
    public static Intent m65808u2(Act act, ArrayList<Media> arrayList) {
        Intent intent = new Intent(act, (Class<?>) FeedPostStatusAct.class);
        intent.setFlags(603979776);
        intent.putExtra("my_states", arrayList);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public /* synthetic */ void m65809v2(C4319c c4319c) {
        if (c4319c == C4319c.f15548i && NullChecker.m81303a(this.f42961h)) {
            this.f42961h.m161630R();
        }
    }

    @Override // com.p046p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: c2 */
    public int mo65796c2() {
        return Color.parseColor("#cc000000");
    }

    /* JADX INFO: renamed from: d2 */
    public GradientDrawable m65810d2() {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, mo65798g2());
        gradientDrawable.setCornerRadii(new float[]{t100.m186890d(32.0f), t100.m186890d(32.0f), t100.m186890d(32.0f), t100.m186890d(32.0f), 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        return gradientDrawable;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: g2 */
    public int[] mo65798g2() {
        Emotion emotion = this.f42963j;
        if (emotion == null || emotion.backgroundColor.size() == 0) {
            return null;
        }
        int[] iArr = new int[this.f42963j.backgroundColor.size()];
        for (int i = 0; i < this.f42963j.backgroundColor.size(); i++) {
            try {
                iArr[i] = Color.parseColor(this.f42963j.backgroundColor.get(i));
            } catch (Exception e) {
                iArr[i] = Color.parseColor("#ffffff");
                CrashHelper.m81296c(e);
            }
        }
        return iArr;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f42961h = new nvh(this);
        wuh wuhVar = new wuh(this);
        this.f42962i = wuhVar;
        wuhVar.mo51532C(this.f42961h);
        this.f42962i.mo39469Z();
        super.initDataOnCreate();
        String stringExtra = act().getIntent().getStringExtra("from");
        this.f42966m = stringExtra;
        this.pageHelper.m109040p(j760.m140076a("where_show_from", TextUtils.equals(stringExtra, "onlinematch") ? "quickchat" : "moment"));
    }

    @Override // com.p046p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.tuh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172171a.m65809v2((C4319c) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: l2 */
    public View mo63060l2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f42961h.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10020 && i2 == -1) {
            this.f42962i.m205631h0(intent.getExtras());
            this.f42961h.m161636Y();
        } else {
            if (intent == null) {
                return;
            }
            ArrayList<Media> arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h);
            if (arrayList.get(0) instanceof Video) {
                return;
            }
            this.f42961h.m161633U(arrayList);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (NullChecker.m81304b(intent)) {
            this.f42965l = false;
            if (NullChecker.m81303a(intent.getSerializableExtra("my_states"))) {
                ArrayList<Media> arrayList = (ArrayList) intent.getSerializableExtra("my_states");
                if (arrayList == null || arrayList.size() == 0) {
                    return;
                } else {
                    this.f42961h.m161633U(arrayList);
                }
            }
            if (NullChecker.m81303a(intent.getSerializableExtra(Emotion.TYPE))) {
                Emotion emotion = (Emotion) intent.getSerializableExtra(Emotion.TYPE);
                this.f42963j = emotion;
                this.f42961h.m161632T(emotion);
                if (this.f42961h.f140738v == null) {
                    m65802n2(m65810d2());
                }
            }
            if (NullChecker.m81303a(intent.getSerializableExtra("userState"))) {
                BubbleInfo bubbleInfo = (BubbleInfo) intent.getSerializableExtra("userState");
                this.f42964k = bubbleInfo;
                this.f42961h.m161634V(bubbleInfo);
            }
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_set_my_state_post";
    }

    @Override // com.p046p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Intent intent = getIntent();
        this.f42963j = (Emotion) intent.getSerializableExtra(Emotion.TYPE);
        if (NullChecker.m81303a(intent.getSerializableExtra("userState"))) {
            BubbleInfo bubbleInfo = (BubbleInfo) intent.getSerializableExtra("userState");
            this.f42964k = bubbleInfo;
            Emotion emotion = bubbleInfo.emotion;
            this.f42963j = emotion;
            emotion.backgroundColor = bubbleInfo.textTheme.backgroundColor;
            this.f42965l = true;
        }
    }
}
