package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class pe00 extends jq2<ze00> {

    /* JADX INFO: renamed from: a */
    public MomentDetailAct f148382a;

    /* JADX INFO: renamed from: b */
    public String f148383b;

    /* JADX INFO: renamed from: c */
    public String f148384c;

    /* JADX INFO: renamed from: d */
    public String f148385d;

    /* JADX INFO: renamed from: e */
    public boolean f148386e;

    /* JADX INFO: renamed from: f */
    public int f148387f;

    /* JADX INFO: renamed from: g */
    public String f148388g;

    /* JADX INFO: renamed from: h */
    public boolean f148389h;

    /* JADX INFO: renamed from: i */
    public String f148390i;

    /* JADX INFO: renamed from: j */
    public String f148391j;

    /* JADX INFO: renamed from: k */
    public boolean f148392k;

    /* JADX INFO: renamed from: l */
    public RawFeed f148393l;

    /* JADX INFO: renamed from: m */
    public boolean f148394m;

    /* JADX INFO: renamed from: n */
    public String f148395n;

    /* JADX INFO: renamed from: o */
    public Runnable f148396o;

    /* JADX INFO: renamed from: l.pe00$a */
    public class RunnableC19192a implements Runnable {
        public RunnableC19192a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FeedModule.f38855d.m209528pc(pe00.this.f148384c);
        }
    }

    public pe00(MomentDetailAct momentDetailAct) {
        super(momentDetailAct);
        this.f148387f = 0;
        this.f148396o = new RunnableC19192a();
        this.f148382a = momentDetailAct;
        m168495h0(momentDetailAct.getIntent().getExtras());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m168493i0(Bundle bundle) {
        ((ze00) this.viewModel).m218259r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m168494j0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i && NullChecker.m81304b(((ze00) this.viewModel).f202760d)) {
            ((ze00) this.viewModel).f202760d.m64861R4();
            if (!TextUtils.isEmpty(this.f148384c) && !TextUtils.isEmpty(this.f148385d)) {
                e51.m114744I(((ze00) this.viewModel).f202760d, this.f148396o, ((long) vqg.m199511I("detailTime")) * 1000);
            }
        }
        if (c4319c == C4319c.f15549j && NullChecker.m81304b(((ze00) this.viewModel).f202760d)) {
            this.f148382a.hideInput();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.ud00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175879a.m168493i0((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.fe00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97089a.m168494j0((C4319c) obj);
            }
        }));
        duringCreated(FeedModule.f38855d.f193061p0).subscribe(mkd0.m154955G(new e30() { // from class: l.he00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107322a.m168496k0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public void m168495h0(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (this.f148383b == null && bundle.containsKey("from")) {
            this.f148383b = bundle.getString("from");
        }
        if (this.f148384c == null && bundle.containsKey("momentId")) {
            this.f148384c = bundle.getString("momentId");
        }
        if (this.f148385d == null && bundle.containsKey("momentOwner")) {
            this.f148385d = bundle.getString("momentOwner");
        }
        if (bundle.containsKey("initMediaIndex")) {
            this.f148387f = bundle.getInt("initMediaIndex", 0);
        }
        if (bundle.containsKey("isHideComment")) {
            this.f148386e = bundle.getBoolean("isHideComment", false);
        }
        if (bundle.containsKey("start_home_card")) {
            this.f148394m = bundle.getBoolean("start_home_card", false);
        }
        if (bundle.containsKey("canGreeting")) {
            this.f148389h = bundle.getBoolean("canGreeting", false);
        }
        this.f148388g = bundle.getString("momentValue", null);
        this.f148390i = bundle.getString("msg_id", null);
        this.f148391j = bundle.getString("enterPage", null);
        if (bundle.containsKey("showInput")) {
            this.f148392k = bundle.getBoolean("showInput", false);
        }
        Serializable serializable = bundle.getSerializable("rawFeed");
        if (serializable instanceof RawFeed) {
            this.f148393l = (RawFeed) serializable;
        }
        this.f148395n = bundle.getString("clickedMsgid", null);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m168496k0(Moment moment) {
        if (TextUtils.equals(moment.f56011id, this.f148384c)) {
            this.f148382a.finishWithoutCustomAnimation();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m168497l0(Bundle bundle) {
        m168495h0(bundle);
    }

    /* JADX INFO: renamed from: m0 */
    public void m168498m0(Bundle bundle) {
        bundle.putString("from", this.f148383b);
        bundle.putString("momentId", this.f148384c);
        bundle.putString("momentOwner", this.f148385d);
        bundle.putInt("initMediaIndex", this.f148387f);
        bundle.putBoolean("isHideComment", this.f148386e);
        bundle.putString("momentValue", this.f148388g);
        bundle.putString("msg_id", this.f148390i);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
