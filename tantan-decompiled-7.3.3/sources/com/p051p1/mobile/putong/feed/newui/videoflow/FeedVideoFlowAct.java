package com.p051p1.mobile.putong.feed.newui.videoflow;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.tantanapp.common.utils.NullChecker;
import p153l.a8c0;
import p153l.bkj0;
import p153l.jka;
import p153l.k9c0;
import p153l.mai;
import p153l.pf60;
import p153l.psd0;
import p153l.qai;
import p153l.wai;
import p153l.y20;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes13.dex */
public class FeedVideoFlowAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public wai f44124c;

    /* JADX INFO: renamed from: d */
    public mai f44125d;

    /* JADX INFO: renamed from: e */
    public qai f44126e;

    /* JADX INFO: renamed from: f */
    public boolean f44127f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct$a */
    public static final class C11539a {

        /* JADX INFO: renamed from: a */
        public Context f44128a;

        /* JADX INFO: renamed from: b */
        public String f44129b;

        /* JADX INFO: renamed from: c */
        public String f44130c;

        /* JADX INFO: renamed from: d */
        public boolean f44131d;

        /* JADX INFO: renamed from: e */
        public boolean f44132e;

        /* JADX INFO: renamed from: f */
        public String f44133f;

        /* JADX INFO: renamed from: g */
        public String f44134g;

        /* JADX INFO: renamed from: h */
        public String f44135h;

        public C11539a(Context context) {
            this.f44128a = context;
        }

        /* JADX INFO: renamed from: a */
        public static C11539a m67377a(Context context) {
            return new C11539a(context);
        }

        /* JADX INFO: renamed from: b */
        public Intent m67378b() {
            Intent intent = new Intent(this.f44128a, (Class<?>) FeedVideoFlowAct.class);
            intent.putExtra("VIDEO_FLOW_MOMENT_ID", this.f44129b);
            intent.putExtra("isHideComment", this.f44131d);
            intent.putExtra("VIDEO_LIVE_AUTHOR_ID", this.f44133f);
            intent.putExtra("VIDEO_LIVE_ROOM_ID", this.f44134g);
            intent.putExtra("start_home_card", this.f44132e);
            intent.putExtra("from", this.f44135h);
            if (NullChecker.m82486a(this.f44130c)) {
                intent.putExtra("VIDEO_FLOW_SOURCE", this.f44130c);
            }
            return intent;
        }

        /* JADX INFO: renamed from: c */
        public C11539a m67379c(String str) {
            this.f44135h = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C11539a m67380d(boolean z) {
            this.f44132e = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C11539a m67381e(String str) {
            this.f44129b = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m67367X1(Throwable th) {
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m67369Z1() {
        jka jkaVar = FeedModule.f39703d;
        Moment moment = this.f44125d.f135526e;
        duringCreated(jkaVar.m145601Rb(moment.owner, moment.f56859id)).subscribe(psd0.m173597H(new y20() { // from class: l.dai
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85890a.m67374e2((bkj0) obj);
            }
        }, new y20() { // from class: l.eai
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedVideoFlowAct.m67367X1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a2 */
    public qai m67370a2() {
        return this.f44126e;
    }

    /* JADX INFO: renamed from: b2 */
    public wai m67371b2() {
        return this.f44124c;
    }

    /* JADX INFO: renamed from: c2 */
    public String m67372c2() {
        return m67371b2().m205649l().m129721P();
    }

    /* JADX INFO: renamed from: d2 */
    public int m67373d2() {
        return m67371b2().m205649l().m129722Q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m67374e2(bkj0 bkj0Var) {
        Video video = (Video) this.f44125d.f135526e.media.get(0);
        video.music = (Music) ((pf60) bkj0Var.f77083c).f152156a;
        this.f44124c.m205649l().m129726U(video.music);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        this.f44124c.m205649l().m129716J();
        super.m68056e2();
        this.f44126e.m175936i();
        this.act.hideInput();
    }

    /* JADX INFO: renamed from: g2 */
    public void m67375g2() {
        if (NullChecker.m82486a(this.f44125d.f135526e)) {
            m67369Z1();
        }
    }

    /* JADX INFO: renamed from: h2 */
    public void m67376h2() {
        setSwipeBackEnable(false);
        setStatusBarColor(getResources().getColor(k9c0.f124524o0));
        decorOrSwipingDecorView().setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        dimStatusBar(true);
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(a8c0.f68903c, a8c0.f68904d);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f44124c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    @SuppressLint({"MissingSuperCall"})
    public void initDataOnCreate() {
        initPageHelper();
        Bundle extras = this.act.getIntent().getExtras();
        String string = null;
        if (NullChecker.m82486a(extras)) {
            string = extras.getString("VIDEO_FLOW_SOURCE", null);
            this.f44127f = extras.getBoolean("start_home_card", false);
        }
        this.f44126e = new qai(this);
        this.f44124c = new wai(this, true, true);
        mai maiVar = new mai(this);
        this.f44125d = maiVar;
        maiVar.m157666q0(this);
        this.f44125d.m157667r0(string);
        this.f44125d.mo52715C(this.f44124c);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    @SuppressLint({"MissingSuperCall"})
    public void initSubscription() {
        super.initSubscription();
        this.f44125d.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        m67371b2().m205649l().m129725T();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_video_recommend";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        m67376h2();
    }
}
