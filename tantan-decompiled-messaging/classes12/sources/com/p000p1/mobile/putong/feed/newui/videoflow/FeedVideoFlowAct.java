package com.p000p1.mobile.putong.feed.newui.videoflow;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.j760;
import l.mkd0;
import l.xaj0;
import p007l.b9i;
import p007l.e1c0;
import p007l.h9i;
import p007l.uzb0;
import p007l.x8i;
import p007l.xia;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedVideoFlowAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public h9i f4737c;

    /* JADX INFO: renamed from: d */
    public x8i f4738d;

    /* JADX INFO: renamed from: e */
    public b9i f4739e;

    /* JADX INFO: renamed from: f */
    public boolean f4740f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct$a */
    public static final class C2220a {

        /* JADX INFO: renamed from: a */
        public Context f4741a;

        /* JADX INFO: renamed from: b */
        public String f4742b;

        /* JADX INFO: renamed from: c */
        public String f4743c;

        /* JADX INFO: renamed from: d */
        public boolean f4744d;

        /* JADX INFO: renamed from: e */
        public boolean f4745e;

        /* JADX INFO: renamed from: f */
        public String f4746f;

        /* JADX INFO: renamed from: g */
        public String f4747g;

        /* JADX INFO: renamed from: h */
        public String f4748h;

        public C2220a(Context context) {
            this.f4741a = context;
        }

        /* JADX INFO: renamed from: a */
        public static C2220a m7352a(Context context) {
            return new C2220a(context);
        }

        /* JADX INFO: renamed from: b */
        public Intent m7353b() {
            Intent intent = new Intent(this.f4741a, (Class<?>) FeedVideoFlowAct.class);
            intent.putExtra("VIDEO_FLOW_MOMENT_ID", this.f4742b);
            intent.putExtra("isHideComment", this.f4744d);
            intent.putExtra("VIDEO_LIVE_AUTHOR_ID", this.f4746f);
            intent.putExtra("VIDEO_LIVE_ROOM_ID", this.f4747g);
            intent.putExtra("start_home_card", this.f4745e);
            intent.putExtra("from", this.f4748h);
            if (NullChecker.a(this.f4743c)) {
                intent.putExtra("VIDEO_FLOW_SOURCE", this.f4743c);
            }
            return intent;
        }

        /* JADX INFO: renamed from: c */
        public C2220a m7354c(String str) {
            this.f4748h = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C2220a m7355d(boolean z) {
            this.f4745e = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C2220a m7356e(String str) {
            this.f4742b = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ void m7342V1(Throwable th) {
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m7344Y1() {
        xia xiaVar = FeedModule.f316d;
        Moment moment = this.f4738d.f14805e;
        duringCreated(xiaVar.m16541Rb(moment.owner, ((DbObject) moment).id)).subscribe(mkd0.H(new e30() { // from class: l.o8i
            public final void call(Object obj) {
                this.f11381a.m7349d2((xaj0) obj);
            }
        }, new e30() { // from class: l.p8i
            public final void call(Object obj) {
                FeedVideoFlowAct.m7342V1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z1 */
    public b9i m7345Z1() {
        return this.f4739e;
    }

    /* JADX INFO: renamed from: a2 */
    public h9i m7346a2() {
        return this.f4737c;
    }

    /* JADX INFO: renamed from: b2 */
    public String m7347b2() {
        return m7346a2().m10580l().m13875P();
    }

    /* JADX INFO: renamed from: c2 */
    public int m7348c2() {
        return m7346a2().m10580l().m13876Q();
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m7349d2(xaj0 xaj0Var) {
        Video video = (Video) this.f4738d.f14805e.media.get(0);
        video.music = (Music) ((j760) xaj0Var.c).a;
        this.f4737c.m10580l().m13880U(video.music);
    }

    /* JADX INFO: renamed from: e2 */
    public void m7350e2() {
        if (NullChecker.a(this.f4738d.f14805e)) {
            m7344Y1();
        }
    }

    public void finish() {
        this.f4737c.m10580l().m13870J();
        super/*com.p1.mobile.android.app.Act*/.finish();
        this.f4739e.m8774i();
        ((Act) this).act.hideInput();
    }

    /* JADX INFO: renamed from: g2 */
    public void m7351g2() {
        setSwipeBackEnable(false);
        setStatusBarColor(getResources().getColor(e1c0.f7157o0));
        decorOrSwipingDecorView().setBackgroundColor(-16777216);
        dimStatusBar(true);
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(uzb0.f13989c, uzb0.f13990d);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f4737c.inflateView(layoutInflater, viewGroup);
    }

    @SuppressLint({"MissingSuperCall"})
    public void initDataOnCreate() {
        initPageHelper();
        Bundle extras = ((Act) this).act.getIntent().getExtras();
        String string = null;
        if (NullChecker.a(extras)) {
            string = extras.getString("VIDEO_FLOW_SOURCE", null);
            this.f4740f = extras.getBoolean("start_home_card", false);
        }
        this.f4739e = new b9i(this);
        this.f4737c = new h9i(this, true, true);
        x8i x8iVar = new x8i(this);
        this.f4738d = x8iVar;
        x8iVar.m16056q0(this);
        this.f4738d.m16057r0(string);
        this.f4738d.m16046C(this.f4737c);
    }

    @SuppressLint({"MissingSuperCall"})
    public void initSubscription() {
        super.initSubscription();
        this.f4738d.m16047a0();
    }

    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
    }

    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        m7346a2().m10580l().m13879T();
    }

    public String pageId() {
        return "p_video_recommend";
    }

    public void preCreateView(Bundle bundle) {
        m7351g2();
    }
}
