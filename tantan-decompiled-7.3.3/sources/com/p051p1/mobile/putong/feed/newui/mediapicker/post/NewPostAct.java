package com.p051p1.mobile.putong.feed.newui.mediapicker.post;

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
import com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.MomentShareInfoParcelable;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p153l.cmg;
import p153l.cn40;
import p153l.cng;
import p153l.l4g0;
import p153l.l51;
import p153l.lpg;
import p153l.orb0;
import p153l.tfj0;
import p153l.x20;
import p153l.zzg;

/* JADX INFO: loaded from: classes13.dex */
public class NewPostAct extends PutongAct {

    /* JADX INFO: renamed from: d */
    public C11409b f41469d;

    /* JADX INFO: renamed from: e */
    public C11408a f41470e;

    /* JADX INFO: renamed from: f */
    public float f41471f;

    /* JADX INFO: renamed from: g */
    public float f41472g;

    /* JADX INFO: renamed from: c */
    public String f41468c = "other";

    /* JADX INFO: renamed from: h */
    public boolean f41473h = false;

    /* JADX INFO: renamed from: i */
    public boolean f41474i = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct$a */
    public static final class C11407a {

        /* JADX INFO: renamed from: a */
        public String f41475a = "other";

        /* JADX INFO: renamed from: b */
        public Context f41476b;

        /* JADX INFO: renamed from: c */
        public ArrayList<Media> f41477c;

        /* JADX INFO: renamed from: d */
        public Boolean f41478d;

        /* JADX INFO: renamed from: e */
        public TopicMoment f41479e;

        /* JADX INFO: renamed from: f */
        public Boolean f41480f;

        /* JADX INFO: renamed from: g */
        public Boolean f41481g;

        /* JADX INFO: renamed from: h */
        public Boolean f41482h;

        /* JADX INFO: renamed from: i */
        public String f41483i;

        /* JADX INFO: renamed from: j */
        public String f41484j;

        /* JADX INFO: renamed from: k */
        public String f41485k;

        /* JADX INFO: renamed from: l */
        public Boolean f41486l;

        /* JADX INFO: renamed from: m */
        public Parcelable f41487m;

        /* JADX INFO: renamed from: n */
        public String f41488n;

        /* JADX INFO: renamed from: o */
        public String f41489o;

        /* JADX INFO: renamed from: p */
        public ArrayList<TopicMoment> f41490p;

        /* JADX INFO: renamed from: q */
        public Boolean f41491q;

        /* JADX INFO: renamed from: r */
        public String f41492r;

        public C11407a(Context context) {
            this.f41476b = context;
        }

        /* JADX INFO: renamed from: a */
        public Intent m63873a() {
            Intent intent = new Intent(this.f41476b, (Class<?>) NewPostAct.class);
            if (NullChecker.m82486a(this.f41477c)) {
                intent.putExtra("extra_images", this.f41477c);
            }
            if (NullChecker.m82486a(this.f41478d)) {
                intent.putExtra("read_draft", this.f41478d);
            }
            if (NullChecker.m82486a(this.f41483i)) {
                intent.putExtra("extra_selected_folder_path", this.f41483i);
            }
            if (NullChecker.m82486a(this.f41482h)) {
                intent.putExtra("extra_show_only_photo", this.f41482h);
            }
            if (NullChecker.m82486a(this.f41480f)) {
                intent.putExtra("extra_from_attend_btn", this.f41480f);
            }
            if (NullChecker.m82486a(this.f41481g)) {
                intent.putExtra("extra_show_audio_input", this.f41481g);
            }
            if (NullChecker.m82486a(this.f41475a)) {
                intent.putExtra("extra_from", this.f41475a);
            }
            if (NullChecker.m82486a(this.f41490p)) {
                intent.putExtra("extra_group_hot_topics", this.f41490p);
            }
            if (NullChecker.m82486a(this.f41479e)) {
                intent.putExtra("extra_topic", this.f41479e);
            }
            if (NullChecker.m82486a(this.f41484j)) {
                intent.putExtra("extra_moment_value", this.f41484j);
            }
            if (NullChecker.m82486a(this.f41485k)) {
                intent.putExtra("extra_guide_type", this.f41485k);
            }
            if (NullChecker.m82486a(this.f41486l)) {
                intent.putExtra("extra_from_photo_to_video", this.f41486l);
            }
            if (NullChecker.m82486a(this.f41487m)) {
                intent.putExtra("extra_moment_share_info", this.f41487m);
            }
            if (NullChecker.m82486a(this.f41489o)) {
                intent.putExtra("EXTRA_EDIT_VIEW_HINT", this.f41489o);
            }
            if (NullChecker.m82486a(this.f41488n)) {
                intent.putExtra("groupId", this.f41488n);
            }
            if (NullChecker.m82486a(this.f41491q)) {
                intent.putExtra("DIRECT_TO_TAKE_VIDEO_PAGE", this.f41491q);
            }
            if (NullChecker.m82486a(this.f41492r)) {
                intent.putExtra("extra_at_user_id", this.f41492r);
            }
            return intent;
        }

        /* JADX INFO: renamed from: b */
        public C11407a m63874b(String str) {
            this.f41489o = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C11407a m63875c(String str) {
            this.f41475a = str;
            if ("from_h5_moment_level_open_camera".equals(str)) {
                this.f41491q = Boolean.TRUE;
            }
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C11407a m63876d(String str) {
            this.f41488n = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C11407a m63877e(ArrayList<TopicMoment> arrayList) {
            this.f41490p = arrayList;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C11407a m63878f(ArrayList<Media> arrayList) {
            this.f41477c = arrayList;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C11407a m63879g(boolean z) {
            this.f41480f = Boolean.valueOf(z);
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C11407a m63880h(Parcelable parcelable) {
            this.f41487m = parcelable;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C11407a m63881i(boolean z) {
            this.f41486l = Boolean.valueOf(z);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C11407a m63882j(boolean z) {
            this.f41478d = Boolean.valueOf(z);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C11407a m63883k(String str) {
            this.f41483i = str;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C11407a m63884l(boolean z) {
            this.f41482h = Boolean.valueOf(z);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C11407a m63885m(TopicMoment topicMoment) {
            this.f41479e = topicMoment;
            return this;
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public void m63866Z1(boolean z, TextView textView) {
        FeedModule.f39703d.m145587Pb().mo144666a(this, textView, z);
        FeedModule.f39703d.m145587Pb().mo144669d(textView, z);
    }

    /* JADX INFO: renamed from: a2 */
    public final boolean m63867a2(float f, float f2) {
        return Math.abs(f) <= Math.abs(f2);
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m63868b2() {
        this.f41469d.f41533A.m64221j1();
    }

    /* JADX INFO: renamed from: d2 */
    public void m63870d2() {
        if (this.f41469d.m64093o0() && !this.f41469d.m64062X1()) {
            if (cmg.m111244x0()) {
                zzg.m222253e(this.act, "p_fake_nearby_moment_popup", null, new x20() { // from class: l.ga40
                    @Override // p153l.x20
                    public final void call() {
                        this.f102958a.m63869c2();
                    }
                });
            } else {
                m63869c2();
            }
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f41469d.m64074e0()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f41471f = x;
                this.f41472g = y;
                this.f41473h = true;
            } else if (action == 2) {
                float f = x - this.f41471f;
                float f2 = y - this.f41472g;
                if (this.f41473h && Math.abs(f2) > 50.0f && m63867a2(f, f2)) {
                    this.f41469d.m64107v0(this.f41471f, this.f41472g);
                    this.f41473h = false;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e2, reason: merged with bridge method [inline-methods] */
    public final void m63869c2() {
        lpg.m155193v().m155229j0();
        if (this.f41469d.m64104t1()) {
            lambda$debugItems$19();
        }
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        this.f41469d.m64109w0();
        this.f41469d.m64083j0();
        super.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: g2 */
    public void m63872g2() {
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f41469d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        cng.m111504g().m111509f();
        this.f41469d = new C11409b(this);
        C11408a c11408a = new C11408a(this);
        this.f41470e = c11408a;
        c11408a.mo52715C(this.f41469d);
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f41470e.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == cn40.f82681a && i2 == -1) {
            this.f41470e.m63941R1(intent);
            return;
        }
        if (i == 10020 && i2 == -1) {
            this.f41470e.m63957b1(intent.getExtras());
            this.f41469d.m64053R1();
        } else if (i == 10040 && i2 == -1) {
            this.f41470e.m63948V1((BubbleInfo) intent.getExtras().getSerializable("userState"));
            this.f41469d.m64064Y1();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f41469d.m64102s1();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        cng.m111504g().m111509f();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f41470e.m63931J1(intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        this.f41469d.m64108v1();
        super.onResumeLifecycle();
        if (!getIntent().getBooleanExtra("DIRECT_TO_TAKE_VIDEO_PAGE", false) || this.f41474i) {
            return;
        }
        this.f41469d.f41533A.postDelayed(new Runnable() { // from class: l.fa40
            @Override // java.lang.Runnable
            public final void run() {
                this.f97941a.m63868b2();
            }
        }, 500L);
        this.f41474i = true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("extra_images", this.f41470e.m63960g1());
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onStopLifecycle() {
        this.f41469d.m64109w0();
        this.f41469d.f41544L = true;
        super.onStopLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_moment_post";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        String str;
        if (!FeedModule.m61405F().signedIn_()) {
            Intent intent = new Intent();
            if (NullChecker.m82487b(getIntent())) {
                l51.m152910p(intent, getIntent());
            }
            intent.putExtra(SignInBaseActMVP.AFTER_SIGNIN, 1);
            orb0.m168881J(this.act, intent);
            lambda$debugItems$19();
        }
        if (NullChecker.m82486a(getIntent().getStringExtra("extra_from")) && !getIntent().getStringExtra("extra_from").isEmpty()) {
            this.f41468c = getIntent().getStringExtra("extra_from");
        }
        if (TextUtils.equals("from_mine_tab_album", this.f41468c)) {
            FeedModule.f39703d.f121386w1.onNext(Boolean.TRUE);
        }
        this.f41470e.m63962i1(bundle);
        l4g0 l4g0Var = this.pageHelper;
        if ("share".equals(this.f41468c)) {
            MomentShareInfoParcelable momentShareInfoParcelable = this.f41470e.f41522q;
            str = momentShareInfoParcelable == null ? "" : momentShareInfoParcelable.name;
        } else {
            str = this.f41468c;
        }
        tfj0.C20302a c20302aM190949g = tfj0.C20302a.m190949g("posted_source", str);
        tfj0.C20302a c20302aM190948f = tfj0.C20302a.m190948f("is_masked", 0);
        String str2 = this.f41470e.f41515j;
        if (str2 == null) {
            str2 = "";
        }
        tfj0.C20302a c20302aM190949g2 = tfj0.C20302a.m190949g("moment_post_guide_type", str2);
        String str3 = "false";
        if (getIntent() != null && getIntent().getBooleanExtra("extra_from_photo_to_video", false)) {
            str3 = "true";
        }
        tfj0.C20302a c20302aM190949g3 = tfj0.C20302a.m190949g("is_from_photo_to_video", str3);
        MomentShareInfoParcelable momentShareInfoParcelable2 = this.f41470e.f41522q;
        l4g0Var.m152780o(tfj0.m190938a(c20302aM190949g, c20302aM190948f, c20302aM190949g2, c20302aM190949g3, tfj0.C20302a.m190949g("information", momentShareInfoParcelable2 != null ? momentShareInfoParcelable2.getTrackInfomation() : "")));
        setSwipeBackEnable(false);
        this.f41469d.m64025A0();
        super.preCreateView(bundle);
    }
}
