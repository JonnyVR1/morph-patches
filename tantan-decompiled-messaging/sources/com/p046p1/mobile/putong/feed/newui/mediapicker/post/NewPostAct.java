package com.p046p1.mobile.putong.feed.newui.mediapicker.post;

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
import com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.MomentShareInfoParcelable;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p149l.cwf0;
import p149l.d30;
import p149l.e51;
import p149l.kjb0;
import p149l.kyg;
import p149l.nkg;
import p149l.nlg;
import p149l.oe40;
import p149l.p6j0;
import p149l.wng;

/* JADX INFO: loaded from: classes12.dex */
public class NewPostAct extends PutongAct {

    /* JADX INFO: renamed from: d */
    public C11246b f40621d;

    /* JADX INFO: renamed from: e */
    public C11245a f40622e;

    /* JADX INFO: renamed from: f */
    public float f40623f;

    /* JADX INFO: renamed from: g */
    public float f40624g;

    /* JADX INFO: renamed from: c */
    public String f40620c = "other";

    /* JADX INFO: renamed from: h */
    public boolean f40625h = false;

    /* JADX INFO: renamed from: i */
    public boolean f40626i = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct$a */
    public static final class C11244a {

        /* JADX INFO: renamed from: a */
        public String f40627a = "other";

        /* JADX INFO: renamed from: b */
        public Context f40628b;

        /* JADX INFO: renamed from: c */
        public ArrayList<Media> f40629c;

        /* JADX INFO: renamed from: d */
        public Boolean f40630d;

        /* JADX INFO: renamed from: e */
        public TopicMoment f40631e;

        /* JADX INFO: renamed from: f */
        public Boolean f40632f;

        /* JADX INFO: renamed from: g */
        public Boolean f40633g;

        /* JADX INFO: renamed from: h */
        public Boolean f40634h;

        /* JADX INFO: renamed from: i */
        public String f40635i;

        /* JADX INFO: renamed from: j */
        public String f40636j;

        /* JADX INFO: renamed from: k */
        public String f40637k;

        /* JADX INFO: renamed from: l */
        public Boolean f40638l;

        /* JADX INFO: renamed from: m */
        public Parcelable f40639m;

        /* JADX INFO: renamed from: n */
        public String f40640n;

        /* JADX INFO: renamed from: o */
        public String f40641o;

        /* JADX INFO: renamed from: p */
        public ArrayList<TopicMoment> f40642p;

        /* JADX INFO: renamed from: q */
        public Boolean f40643q;

        /* JADX INFO: renamed from: r */
        public String f40644r;

        public C11244a(Context context) {
            this.f40628b = context;
        }

        /* JADX INFO: renamed from: a */
        public Intent m62690a() {
            Intent intent = new Intent(this.f40628b, (Class<?>) NewPostAct.class);
            if (NullChecker.m81303a(this.f40629c)) {
                intent.putExtra("extra_images", this.f40629c);
            }
            if (NullChecker.m81303a(this.f40630d)) {
                intent.putExtra("read_draft", this.f40630d);
            }
            if (NullChecker.m81303a(this.f40635i)) {
                intent.putExtra("extra_selected_folder_path", this.f40635i);
            }
            if (NullChecker.m81303a(this.f40634h)) {
                intent.putExtra("extra_show_only_photo", this.f40634h);
            }
            if (NullChecker.m81303a(this.f40632f)) {
                intent.putExtra("extra_from_attend_btn", this.f40632f);
            }
            if (NullChecker.m81303a(this.f40633g)) {
                intent.putExtra("extra_show_audio_input", this.f40633g);
            }
            if (NullChecker.m81303a(this.f40627a)) {
                intent.putExtra("extra_from", this.f40627a);
            }
            if (NullChecker.m81303a(this.f40642p)) {
                intent.putExtra("extra_group_hot_topics", this.f40642p);
            }
            if (NullChecker.m81303a(this.f40631e)) {
                intent.putExtra("extra_topic", this.f40631e);
            }
            if (NullChecker.m81303a(this.f40636j)) {
                intent.putExtra("extra_moment_value", this.f40636j);
            }
            if (NullChecker.m81303a(this.f40637k)) {
                intent.putExtra("extra_guide_type", this.f40637k);
            }
            if (NullChecker.m81303a(this.f40638l)) {
                intent.putExtra("extra_from_photo_to_video", this.f40638l);
            }
            if (NullChecker.m81303a(this.f40639m)) {
                intent.putExtra("extra_moment_share_info", this.f40639m);
            }
            if (NullChecker.m81303a(this.f40641o)) {
                intent.putExtra("EXTRA_EDIT_VIEW_HINT", this.f40641o);
            }
            if (NullChecker.m81303a(this.f40640n)) {
                intent.putExtra("groupId", this.f40640n);
            }
            if (NullChecker.m81303a(this.f40643q)) {
                intent.putExtra("DIRECT_TO_TAKE_VIDEO_PAGE", this.f40643q);
            }
            if (NullChecker.m81303a(this.f40644r)) {
                intent.putExtra("extra_at_user_id", this.f40644r);
            }
            return intent;
        }

        /* JADX INFO: renamed from: b */
        public C11244a m62691b(String str) {
            this.f40641o = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C11244a m62692c(String str) {
            this.f40627a = str;
            if ("from_h5_moment_level_open_camera".equals(str)) {
                this.f40643q = Boolean.TRUE;
            }
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C11244a m62693d(String str) {
            this.f40640n = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C11244a m62694e(ArrayList<TopicMoment> arrayList) {
            this.f40642p = arrayList;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C11244a m62695f(ArrayList<Media> arrayList) {
            this.f40629c = arrayList;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C11244a m62696g(boolean z) {
            this.f40632f = Boolean.valueOf(z);
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C11244a m62697h(Parcelable parcelable) {
            this.f40639m = parcelable;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C11244a m62698i(boolean z) {
            this.f40638l = Boolean.valueOf(z);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C11244a m62699j(boolean z) {
            this.f40630d = Boolean.valueOf(z);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C11244a m62700k(String str) {
            this.f40635i = str;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C11244a m62701l(boolean z) {
            this.f40634h = Boolean.valueOf(z);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C11244a m62702m(TopicMoment topicMoment) {
            this.f40631e = topicMoment;
            return this;
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public void m62683Y1(boolean z, TextView textView) {
        FeedModule.f38855d.m209346Pb().mo193129a(this, textView, z);
        FeedModule.f38855d.m209346Pb().mo193132d(textView, z);
    }

    /* JADX INFO: renamed from: Z1 */
    public final boolean m62684Z1(float f, float f2) {
        return Math.abs(f) <= Math.abs(f2);
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m62685a2() {
        this.f40621d.f40685A.m63038j1();
    }

    /* JADX INFO: renamed from: c2 */
    public void m62687c2() {
        if (this.f40621d.m62910o0() && !this.f40621d.m62879X1()) {
            if (nkg.m159915x0()) {
                kyg.m147870e(this.act, "p_fake_nearby_moment_popup", null, new d30() { // from class: l.s140
                    @Override // p149l.d30
                    public final void call() {
                        this.f161862a.m62686b2();
                    }
                });
            } else {
                m62686b2();
            }
        }
    }

    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public final void m62686b2() {
        wng.m204695v().m204731j0();
        if (this.f40621d.m62921t1()) {
            lambda$debugItems$19();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f40621d.m62891e0()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f40623f = x;
                this.f40624g = y;
                this.f40625h = true;
            } else if (action == 2) {
                float f = x - this.f40623f;
                float f2 = y - this.f40624g;
                if (this.f40625h && Math.abs(f2) > 50.0f && m62684Z1(f, f2)) {
                    this.f40621d.m62924v0(this.f40623f, this.f40624g);
                    this.f40625h = false;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e2 */
    public void m62689e2() {
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        this.f40621d.m62926w0();
        this.f40621d.m62900j0();
        super.lambda$debugItems$19();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f40621d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        nlg.m160044g().m160049f();
        this.f40621d = new C11246b(this);
        C11245a c11245a = new C11245a(this);
        this.f40622e = c11245a;
        c11245a.mo51532C(this.f40621d);
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f40622e.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == oe40.f143278a && i2 == -1) {
            this.f40622e.m62758R1(intent);
            return;
        }
        if (i == 10020 && i2 == -1) {
            this.f40622e.m62774b1(intent.getExtras());
            this.f40621d.m62870R1();
        } else if (i == 10040 && i2 == -1) {
            this.f40622e.m62765V1((BubbleInfo) intent.getExtras().getSerializable("userState"));
            this.f40621d.m62881Y1();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f40621d.m62919s1();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        nlg.m160044g().m160049f();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f40622e.m62748J1(intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        this.f40621d.m62925v1();
        super.onResumeLifecycle();
        if (!getIntent().getBooleanExtra("DIRECT_TO_TAKE_VIDEO_PAGE", false) || this.f40626i) {
            return;
        }
        this.f40621d.f40685A.postDelayed(new Runnable() { // from class: l.r140
            @Override // java.lang.Runnable
            public final void run() {
                this.f157236a.m62685a2();
            }
        }, 500L);
        this.f40626i = true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("extra_images", this.f40622e.m62777g1());
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onStopLifecycle() {
        this.f40621d.m62926w0();
        this.f40621d.f40696L = true;
        super.onStopLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_moment_post";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        String str;
        if (!FeedModule.m60221F().signedIn_()) {
            Intent intent = new Intent();
            if (NullChecker.m81304b(getIntent())) {
                e51.m114765p(intent, getIntent());
            }
            intent.putExtra(SignInBaseActMVP.AFTER_SIGNIN, 1);
            kjb0.m146187J(this.act, intent);
            lambda$debugItems$19();
        }
        if (NullChecker.m81303a(getIntent().getStringExtra("extra_from")) && !getIntent().getStringExtra("extra_from").isEmpty()) {
            this.f40620c = getIntent().getStringExtra("extra_from");
        }
        if (TextUtils.equals("from_mine_tab_album", this.f40620c)) {
            FeedModule.f38855d.f193076w1.onNext(Boolean.TRUE);
        }
        this.f40622e.m62779i1(bundle);
        cwf0 cwf0Var = this.pageHelper;
        if ("share".equals(this.f40620c)) {
            MomentShareInfoParcelable momentShareInfoParcelable = this.f40622e.f40674q;
            str = momentShareInfoParcelable == null ? "" : momentShareInfoParcelable.name;
        } else {
            str = this.f40620c;
        }
        p6j0.C19147a c19147aM167678g = p6j0.C19147a.m167678g("posted_source", str);
        p6j0.C19147a c19147aM167677f = p6j0.C19147a.m167677f("is_masked", 0);
        String str2 = this.f40622e.f40667j;
        if (str2 == null) {
            str2 = "";
        }
        p6j0.C19147a c19147aM167678g2 = p6j0.C19147a.m167678g("moment_post_guide_type", str2);
        String str3 = "false";
        if (getIntent() != null && getIntent().getBooleanExtra("extra_from_photo_to_video", false)) {
            str3 = "true";
        }
        p6j0.C19147a c19147aM167678g3 = p6j0.C19147a.m167678g("is_from_photo_to_video", str3);
        MomentShareInfoParcelable momentShareInfoParcelable2 = this.f40622e.f40674q;
        cwf0Var.m109039o(p6j0.m167667a(c19147aM167678g, c19147aM167677f, c19147aM167678g2, c19147aM167678g3, p6j0.C19147a.m167678g("information", momentShareInfoParcelable2 != null ? momentShareInfoParcelable2.getTrackInfomation() : "")));
        setSwipeBackEnable(false);
        this.f40621d.m62842A0();
        super.preCreateView(bundle);
    }
}
