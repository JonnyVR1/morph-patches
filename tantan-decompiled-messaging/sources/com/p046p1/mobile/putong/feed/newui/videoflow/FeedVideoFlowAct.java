package com.p046p1.mobile.putong.feed.newui.videoflow;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.tantanapp.common.utils.NullChecker;
import p149l.b9i;
import p149l.e1c0;
import p149l.e30;
import p149l.h9i;
import p149l.j760;
import p149l.mkd0;
import p149l.uzb0;
import p149l.x8i;
import p149l.xaj0;
import p149l.xia;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes12.dex */
public class FeedVideoFlowAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public h9i f43276c;

    /* JADX INFO: renamed from: d */
    public x8i f43277d;

    /* JADX INFO: renamed from: e */
    public b9i f43278e;

    /* JADX INFO: renamed from: f */
    public boolean f43279f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct$a */
    public static final class C11376a {

        /* JADX INFO: renamed from: a */
        public Context f43280a;

        /* JADX INFO: renamed from: b */
        public String f43281b;

        /* JADX INFO: renamed from: c */
        public String f43282c;

        /* JADX INFO: renamed from: d */
        public boolean f43283d;

        /* JADX INFO: renamed from: e */
        public boolean f43284e;

        /* JADX INFO: renamed from: f */
        public String f43285f;

        /* JADX INFO: renamed from: g */
        public String f43286g;

        /* JADX INFO: renamed from: h */
        public String f43287h;

        public C11376a(Context context) {
            this.f43280a = context;
        }

        /* JADX INFO: renamed from: a */
        public static C11376a m66194a(Context context) {
            return new C11376a(context);
        }

        /* JADX INFO: renamed from: b */
        public Intent m66195b() {
            Intent intent = new Intent(this.f43280a, (Class<?>) FeedVideoFlowAct.class);
            intent.putExtra("VIDEO_FLOW_MOMENT_ID", this.f43281b);
            intent.putExtra("isHideComment", this.f43283d);
            intent.putExtra("VIDEO_LIVE_AUTHOR_ID", this.f43285f);
            intent.putExtra("VIDEO_LIVE_ROOM_ID", this.f43286g);
            intent.putExtra("start_home_card", this.f43284e);
            intent.putExtra("from", this.f43287h);
            if (NullChecker.m81303a(this.f43282c)) {
                intent.putExtra("VIDEO_FLOW_SOURCE", this.f43282c);
            }
            return intent;
        }

        /* JADX INFO: renamed from: c */
        public C11376a m66196c(String str) {
            this.f43287h = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C11376a m66197d(boolean z) {
            this.f43284e = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C11376a m66198e(String str) {
            this.f43281b = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ void m66184V1(Throwable th) {
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m66186Y1() {
        xia xiaVar = FeedModule.f38855d;
        Moment moment = this.f43277d.f191519e;
        duringCreated(xiaVar.m209360Rb(moment.owner, moment.f56011id)).subscribe(mkd0.m154956H(new e30() { // from class: l.o8i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142634a.m66191d2((xaj0) obj);
            }
        }, new e30() { // from class: l.p8i
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedVideoFlowAct.m66184V1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z1 */
    public b9i m66187Z1() {
        return this.f43278e;
    }

    /* JADX INFO: renamed from: a2 */
    public h9i m66188a2() {
        return this.f43276c;
    }

    /* JADX INFO: renamed from: b2 */
    public String m66189b2() {
        return m66188a2().m130018l().m178269P();
    }

    /* JADX INFO: renamed from: c2 */
    public int m66190c2() {
        return m66188a2().m130018l().m178270Q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m66191d2(xaj0 xaj0Var) {
        Video video = (Video) this.f43277d.f191519e.media.get(0);
        video.music = (Music) ((j760) xaj0Var.f191753c).f116564a;
        this.f43276c.m130018l().m178274U(video.music);
    }

    /* JADX INFO: renamed from: e2 */
    public void m66192e2() {
        if (NullChecker.m81303a(this.f43277d.f191519e)) {
            m66186Y1();
        }
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        this.f43276c.m130018l().m178264J();
        super.m66873d2();
        this.f43278e.m100808i();
        this.act.hideInput();
    }

    /* JADX INFO: renamed from: g2 */
    public void m66193g2() {
        setSwipeBackEnable(false);
        setStatusBarColor(getResources().getColor(e1c0.f88801o0));
        decorOrSwipingDecorView().setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        dimStatusBar(true);
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(uzb0.f178978c, uzb0.f178979d);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f43276c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    @SuppressLint({"MissingSuperCall"})
    public void initDataOnCreate() {
        initPageHelper();
        Bundle extras = this.act.getIntent().getExtras();
        String string = null;
        if (NullChecker.m81303a(extras)) {
            string = extras.getString("VIDEO_FLOW_SOURCE", null);
            this.f43279f = extras.getBoolean("start_home_card", false);
        }
        this.f43278e = new b9i(this);
        this.f43276c = new h9i(this, true, true);
        x8i x8iVar = new x8i(this);
        this.f43277d = x8iVar;
        x8iVar.m207413q0(this);
        this.f43277d.m207414r0(string);
        this.f43277d.mo51532C(this.f43276c);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    @SuppressLint({"MissingSuperCall"})
    public void initSubscription() {
        super.initSubscription();
        this.f43277d.mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        m66188a2().m130018l().m178273T();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_video_recommend";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        m66193g2();
    }
}
