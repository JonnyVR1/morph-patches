package com.p000p1.mobile.putong.feed.newui.mediapicker.post;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.MomentShareInfoParcelable;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.cwf0;
import l.d30;
import l.e51;
import p007l.kjb0;
import p007l.kyg;
import p007l.nkg;
import p007l.nlg;
import p007l.oe40;
import p007l.p6j0;
import p007l.wng;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class NewPostAct extends PutongAct {

    /* JADX INFO: renamed from: d */
    public C2090b f2082d;

    /* JADX INFO: renamed from: e */
    public C2089a f2083e;

    /* JADX INFO: renamed from: f */
    public float f2084f;

    /* JADX INFO: renamed from: g */
    public float f2085g;

    /* JADX INFO: renamed from: c */
    public String f2081c = "other";

    /* JADX INFO: renamed from: h */
    public boolean f2086h = false;

    /* JADX INFO: renamed from: i */
    public boolean f2087i = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct$a */
    public static final class C2088a {

        /* JADX INFO: renamed from: a */
        public String f2088a = "other";

        /* JADX INFO: renamed from: b */
        public Context f2089b;

        /* JADX INFO: renamed from: c */
        public ArrayList<Media> f2090c;

        /* JADX INFO: renamed from: d */
        public Boolean f2091d;

        /* JADX INFO: renamed from: e */
        public TopicMoment f2092e;

        /* JADX INFO: renamed from: f */
        public Boolean f2093f;

        /* JADX INFO: renamed from: g */
        public Boolean f2094g;

        /* JADX INFO: renamed from: h */
        public Boolean f2095h;

        /* JADX INFO: renamed from: i */
        public String f2096i;

        /* JADX INFO: renamed from: j */
        public String f2097j;

        /* JADX INFO: renamed from: k */
        public String f2098k;

        /* JADX INFO: renamed from: l */
        public Boolean f2099l;

        /* JADX INFO: renamed from: m */
        public Parcelable f2100m;

        /* JADX INFO: renamed from: n */
        public String f2101n;

        /* JADX INFO: renamed from: o */
        public String f2102o;

        /* JADX INFO: renamed from: p */
        public ArrayList<TopicMoment> f2103p;

        /* JADX INFO: renamed from: q */
        public Boolean f2104q;

        /* JADX INFO: renamed from: r */
        public String f2105r;

        public C2088a(Context context) {
            this.f2089b = context;
        }

        /* JADX INFO: renamed from: a */
        public Intent m3695a() {
            Intent intent = new Intent(this.f2089b, (Class<?>) NewPostAct.class);
            if (NullChecker.a(this.f2090c)) {
                intent.putExtra("extra_images", this.f2090c);
            }
            if (NullChecker.a(this.f2091d)) {
                intent.putExtra("read_draft", this.f2091d);
            }
            if (NullChecker.a(this.f2096i)) {
                intent.putExtra("extra_selected_folder_path", this.f2096i);
            }
            if (NullChecker.a(this.f2095h)) {
                intent.putExtra("extra_show_only_photo", this.f2095h);
            }
            if (NullChecker.a(this.f2093f)) {
                intent.putExtra("extra_from_attend_btn", this.f2093f);
            }
            if (NullChecker.a(this.f2094g)) {
                intent.putExtra("extra_show_audio_input", this.f2094g);
            }
            if (NullChecker.a(this.f2088a)) {
                intent.putExtra("extra_from", this.f2088a);
            }
            if (NullChecker.a(this.f2103p)) {
                intent.putExtra("extra_group_hot_topics", this.f2103p);
            }
            if (NullChecker.a(this.f2092e)) {
                intent.putExtra("extra_topic", this.f2092e);
            }
            if (NullChecker.a(this.f2097j)) {
                intent.putExtra("extra_moment_value", this.f2097j);
            }
            if (NullChecker.a(this.f2098k)) {
                intent.putExtra("extra_guide_type", this.f2098k);
            }
            if (NullChecker.a(this.f2099l)) {
                intent.putExtra("extra_from_photo_to_video", this.f2099l);
            }
            if (NullChecker.a(this.f2100m)) {
                intent.putExtra("extra_moment_share_info", this.f2100m);
            }
            if (NullChecker.a(this.f2102o)) {
                intent.putExtra("EXTRA_EDIT_VIEW_HINT", this.f2102o);
            }
            if (NullChecker.a(this.f2101n)) {
                intent.putExtra("groupId", this.f2101n);
            }
            if (NullChecker.a(this.f2104q)) {
                intent.putExtra("DIRECT_TO_TAKE_VIDEO_PAGE", this.f2104q);
            }
            if (NullChecker.a(this.f2105r)) {
                intent.putExtra("extra_at_user_id", this.f2105r);
            }
            return intent;
        }

        /* JADX INFO: renamed from: b */
        public C2088a m3696b(String str) {
            this.f2102o = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C2088a m3697c(String str) {
            this.f2088a = str;
            if ("from_h5_moment_level_open_camera".equals(str)) {
                this.f2104q = Boolean.TRUE;
            }
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C2088a m3698d(String str) {
            this.f2101n = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C2088a m3699e(ArrayList<TopicMoment> arrayList) {
            this.f2103p = arrayList;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C2088a m3700f(ArrayList<Media> arrayList) {
            this.f2090c = arrayList;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C2088a m3701g(boolean z) {
            this.f2093f = Boolean.valueOf(z);
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C2088a m3702h(Parcelable parcelable) {
            this.f2100m = parcelable;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C2088a m3703i(boolean z) {
            this.f2099l = Boolean.valueOf(z);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C2088a m3704j(boolean z) {
            this.f2091d = Boolean.valueOf(z);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C2088a m3705k(String str) {
            this.f2096i = str;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C2088a m3706l(boolean z) {
            this.f2095h = Boolean.valueOf(z);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C2088a m3707m(TopicMoment topicMoment) {
            this.f2092e = topicMoment;
            return this;
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public void m3688Y1(boolean z, TextView textView) {
        FeedModule.f316d.m16527Pb().mo15074a(this, textView, z);
        FeedModule.f316d.m16527Pb().mo15077d(textView, z);
    }

    /* JADX INFO: renamed from: Z1 */
    public final boolean m3689Z1(float f, float f2) {
        return Math.abs(f) <= Math.abs(f2);
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m3690a2() {
        this.f2082d.f2146A.m4054j1();
    }

    /* JADX INFO: renamed from: c2 */
    public void m3692c2() {
        if (this.f2082d.m3919o0() && !this.f2082d.m3887X1()) {
            if (nkg.m12274x0()) {
                kyg.m11536e(((Act) this).act, "p_fake_nearby_moment_popup", null, new d30() { // from class: l.s140
                    public final void call() {
                        this.f12775a.m3691b2();
                    }
                });
            } else {
                m3691b2();
            }
        }
    }

    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public final void m3691b2() {
        wng.m15855v().m15891j0();
        if (this.f2082d.m3930t1()) {
            finish();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f2082d.m3899e0()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f2084f = x;
                this.f2085g = y;
                this.f2086h = true;
            } else if (action == 2) {
                float f = x - this.f2084f;
                float f2 = y - this.f2085g;
                if (this.f2086h && Math.abs(f2) > 50.0f && m3689Z1(f, f2)) {
                    this.f2082d.m3933v0(this.f2084f, this.f2085g);
                    this.f2086h = false;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e2 */
    public void m3694e2() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public void finish() {
        this.f2082d.m3935w0();
        this.f2082d.m3909j0();
        super/*com.p1.mobile.android.app.Act*/.finish();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f2082d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        nlg.m12287g().m12292f();
        this.f2082d = new C2090b(this);
        C2089a c2089a = new C2089a(this);
        this.f2083e = c2089a;
        c2089a.m3747C(this.f2082d);
        super.initDataOnCreate();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f2083e.m3779a0();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == oe40.f11441a && i2 == -1) {
            this.f2083e.m3764R1(intent);
            return;
        }
        if (i == 10020 && i2 == -1) {
            this.f2083e.m3781b1(intent.getExtras());
            this.f2082d.m3878R1();
        } else if (i == 10040 && i2 == -1) {
            this.f2083e.m3771V1((BubbleInfo) intent.getExtras().getSerializable("userState"));
            this.f2082d.m3889Y1();
        }
    }

    public void onBackPressed() {
        this.f2082d.m3928s1();
    }

    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        nlg.m12287g().m12292f();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f2083e.m3754J1(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResumeLifecycle() {
        this.f2082d.m3934v1();
        super.onResumeLifecycle();
        if (!getIntent().getBooleanExtra("DIRECT_TO_TAKE_VIDEO_PAGE", false) || this.f2087i) {
            return;
        }
        this.f2082d.f2146A.postDelayed(new Runnable() { // from class: l.r140
            @Override // java.lang.Runnable
            public final void run() {
                this.f12448a.m3690a2();
            }
        }, 500L);
        this.f2087i = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("extra_images", this.f2083e.m3784g1());
    }

    public void onStopLifecycle() {
        this.f2082d.m3935w0();
        this.f2082d.f2157L = true;
        super.onStopLifecycle();
    }

    public String pageId() {
        return "p_moment_post";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        String str;
        if (!FeedModule.m1139F().signedIn_()) {
            Intent intent = new Intent();
            if (NullChecker.b(getIntent())) {
                e51.p(intent, getIntent());
            }
            intent.putExtra("after_signin", 1);
            kjb0.m11446J(((Act) this).act, intent);
            finish();
        }
        if (NullChecker.a(getIntent().getStringExtra("extra_from")) && !getIntent().getStringExtra("extra_from").isEmpty()) {
            this.f2081c = getIntent().getStringExtra("extra_from");
        }
        if (TextUtils.equals("from_mine_tab_album", this.f2081c)) {
            FeedModule.f316d.f15011w1.onNext(Boolean.TRUE);
        }
        this.f2083e.m3786i1(bundle);
        cwf0 cwf0Var = ((PutongAct) this).pageHelper;
        if ("share".equals(this.f2081c)) {
            MomentShareInfoParcelable momentShareInfoParcelable = this.f2083e.f2135q;
            str = momentShareInfoParcelable == null ? "" : momentShareInfoParcelable.name;
        } else {
            str = this.f2081c;
        }
        p6j0.C2456a c2456aM12922g = p6j0.C2456a.m12922g("posted_source", str);
        p6j0.C2456a c2456aM12921f = p6j0.C2456a.m12921f("is_masked", 0);
        String str2 = this.f2083e.f2128j;
        if (str2 == null) {
            str2 = "";
        }
        p6j0.C2456a c2456aM12922g2 = p6j0.C2456a.m12922g("moment_post_guide_type", str2);
        String str3 = "false";
        if (getIntent() != null && getIntent().getBooleanExtra("extra_from_photo_to_video", false)) {
            str3 = "true";
        }
        p6j0.C2456a c2456aM12922g3 = p6j0.C2456a.m12922g("is_from_photo_to_video", str3);
        MomentShareInfoParcelable momentShareInfoParcelable2 = this.f2083e.f2135q;
        cwf0Var.o(p6j0.m12911a(c2456aM12922g, c2456aM12921f, c2456aM12922g2, c2456aM12922g3, p6j0.C2456a.m12922g("information", momentShareInfoParcelable2 != null ? momentShareInfoParcelable2.getTrackInfomation() : "")));
        setSwipeBackEnable(false);
        this.f2082d.m3849A0();
        super.preCreateView(bundle);
    }
}
