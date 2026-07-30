package com.p000p1.mobile.putong.feed.newui.status.post;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Video;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.e30;
import l.j760;
import l.mkd0;
import l.t100;
import p007l.nvh;
import p007l.wuh;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPostStatusAct extends FeedMyStatusBaseAct {

    /* JADX INFO: renamed from: h */
    public nvh f4422h;

    /* JADX INFO: renamed from: i */
    public wuh f4423i;

    /* JADX INFO: renamed from: j */
    public Emotion f4424j;

    /* JADX INFO: renamed from: k */
    public BubbleInfo f4425k;

    /* JADX INFO: renamed from: l */
    public boolean f4426l;

    /* JADX INFO: renamed from: m */
    public String f4427m;

    /* JADX INFO: renamed from: q2 */
    public static Intent m6951q2(Act act, BubbleInfo bubbleInfo, String str) {
        Intent intent = new Intent((Context) act, (Class<?>) FeedPostStatusAct.class);
        intent.setFlags(603979776);
        intent.putExtra("userState", bubbleInfo);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: r2 */
    public static Intent m6952r2(Act act, Emotion emotion) {
        Intent intent = new Intent((Context) act, (Class<?>) FeedPostStatusAct.class);
        intent.setFlags(603979776);
        intent.putExtra(Emotion.TYPE, emotion);
        return intent;
    }

    /* JADX INFO: renamed from: s2 */
    public static Intent m6953s2(Act act, Emotion emotion, String str) {
        Intent intentM6952r2 = m6952r2(act, emotion);
        intentM6952r2.putExtra("from", str);
        return intentM6952r2;
    }

    /* JADX INFO: renamed from: u2 */
    public static Intent m6954u2(Act act, ArrayList<Media> arrayList) {
        Intent intent = new Intent((Context) act, (Class<?>) FeedPostStatusAct.class);
        intent.setFlags(603979776);
        intent.putExtra("my_states", arrayList);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public /* synthetic */ void m6955v2(c cVar) {
        if (cVar == c.i && NullChecker.a(this.f4422h)) {
            this.f4422h.m12372R();
        }
    }

    @Override // com.p000p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: c2 */
    public int mo6942c2() {
        return Color.parseColor("#cc000000");
    }

    /* JADX INFO: renamed from: d2 */
    public GradientDrawable m6956d2() {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, mo6944g2());
        gradientDrawable.setCornerRadii(new float[]{t100.d(32.0f), t100.d(32.0f), t100.d(32.0f), t100.d(32.0f), 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        return gradientDrawable;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: g2 */
    public int[] mo6944g2() {
        Emotion emotion = this.f4424j;
        if (emotion == null || emotion.backgroundColor.size() == 0) {
            return null;
        }
        int[] iArr = new int[this.f4424j.backgroundColor.size()];
        for (int i = 0; i < this.f4424j.backgroundColor.size(); i++) {
            try {
                iArr[i] = Color.parseColor(this.f4424j.backgroundColor.get(i));
            } catch (Exception e) {
                iArr[i] = Color.parseColor("#ffffff");
                CrashHelper.c(e);
            }
        }
        return iArr;
    }

    public void initDataOnCreate() {
        this.f4422h = new nvh(this);
        wuh wuhVar = new wuh(this);
        this.f4423i = wuhVar;
        wuhVar.C(this.f4422h);
        this.f4423i.m15928Z();
        super.initDataOnCreate();
        String stringExtra = act().getIntent().getStringExtra("from");
        this.f4427m = stringExtra;
        ((PutongAct) this).pageHelper.p(new j760[]{j760.a("where_show_from", TextUtils.equals(stringExtra, "onlinematch") ? "quickchat" : "moment")});
    }

    @Override // com.p000p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    public void initSubscription() {
        super.initSubscription();
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.tuh
            public final void call(Object obj) {
                this.f13423a.m6955v2((c) obj);
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: l2 */
    public View mo4076l2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f4422h.inflateView(layoutInflater, viewGroup);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10020 && i2 == -1) {
            this.f4423i.m15930h0(intent.getExtras());
            this.f4422h.m12378Y();
        } else {
            if (intent == null) {
                return;
            }
            ArrayList<Media> arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.h);
            if (arrayList.get(0) instanceof Video) {
                return;
            }
            this.f4422h.m12375U(arrayList);
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (NullChecker.b(intent)) {
            this.f4426l = false;
            if (NullChecker.a(intent.getSerializableExtra("my_states"))) {
                ArrayList<Media> arrayList = (ArrayList) intent.getSerializableExtra("my_states");
                if (arrayList == null || arrayList.size() == 0) {
                    return;
                } else {
                    this.f4422h.m12375U(arrayList);
                }
            }
            if (NullChecker.a(intent.getSerializableExtra(Emotion.TYPE))) {
                Emotion emotion = (Emotion) intent.getSerializableExtra(Emotion.TYPE);
                this.f4424j = emotion;
                this.f4422h.m12374T(emotion);
                if (this.f4422h.f10914v == null) {
                    m6948n2(m6956d2());
                }
            }
            if (NullChecker.a(intent.getSerializableExtra("userState"))) {
                BubbleInfo bubbleInfo = (BubbleInfo) intent.getSerializableExtra("userState");
                this.f4425k = bubbleInfo;
                this.f4422h.m12376V(bubbleInfo);
            }
        }
    }

    public String pageId() {
        return "p_set_my_state_post";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Intent intent = getIntent();
        this.f4424j = (Emotion) intent.getSerializableExtra(Emotion.TYPE);
        if (NullChecker.a(intent.getSerializableExtra("userState"))) {
            BubbleInfo bubbleInfo = (BubbleInfo) intent.getSerializableExtra("userState");
            this.f4425k = bubbleInfo;
            Emotion emotion = bubbleInfo.emotion;
            this.f4424j = emotion;
            emotion.backgroundColor = bubbleInfo.textTheme.backgroundColor;
            this.f4426l = true;
        }
    }
}
