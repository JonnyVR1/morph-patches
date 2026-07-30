package p007l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import l.e30;
import l.e51;
import l.jq2;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class pe00 extends jq2<ze00> {

    /* JADX INFO: renamed from: a */
    public MomentDetailAct f11802a;

    /* JADX INFO: renamed from: b */
    public String f11803b;

    /* JADX INFO: renamed from: c */
    public String f11804c;

    /* JADX INFO: renamed from: d */
    public String f11805d;

    /* JADX INFO: renamed from: e */
    public boolean f11806e;

    /* JADX INFO: renamed from: f */
    public int f11807f;

    /* JADX INFO: renamed from: g */
    public String f11808g;

    /* JADX INFO: renamed from: h */
    public boolean f11809h;

    /* JADX INFO: renamed from: i */
    public String f11810i;

    /* JADX INFO: renamed from: j */
    public String f11811j;

    /* JADX INFO: renamed from: k */
    public boolean f11812k;

    /* JADX INFO: renamed from: l */
    public RawFeed f11813l;

    /* JADX INFO: renamed from: m */
    public boolean f11814m;

    /* JADX INFO: renamed from: n */
    public String f11815n;

    /* JADX INFO: renamed from: o */
    public Runnable f11816o;

    /* JADX INFO: renamed from: l.pe00$a */
    public class RunnableC2457a implements Runnable {
        public RunnableC2457a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FeedModule.f316d.m16709pc(pe00.this.f11804c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pe00(MomentDetailAct momentDetailAct) {
        super(momentDetailAct);
        this.f11807f = 0;
        this.f11816o = new RunnableC2457a();
        this.f11802a = momentDetailAct;
        m13033h0(momentDetailAct.getIntent().getExtras());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m13030i0(Bundle bundle) {
        ((ze00) ((jq2) this).viewModel).m17309r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m13031j0(c cVar) {
        if (cVar == c.i && NullChecker.b(((ze00) ((jq2) this).viewModel).f15700d)) {
            ((ze00) ((jq2) this).viewModel).f15700d.m5958R4();
            if (!TextUtils.isEmpty(this.f11804c) && !TextUtils.isEmpty(this.f11805d)) {
                e51.I(((ze00) ((jq2) this).viewModel).f15700d, this.f11816o, ((long) vqg.m15481I("detailTime")) * 1000);
            }
        }
        if (cVar == c.j && NullChecker.b(((ze00) ((jq2) this).viewModel).f15700d)) {
            this.f11802a.hideInput();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m13032a0() {
        creates(new e30() { // from class: l.ud00
            public final void call(Object obj) {
                this.f13811a.m13030i0((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.fe00
            public final void call(Object obj) {
                this.f8073a.m13031j0((c) obj);
            }
        }));
        duringCreated(FeedModule.f316d.f14996p0).subscribe(mkd0.G(new e30() { // from class: l.he00
            public final void call(Object obj) {
                this.f8675a.m13034k0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public void m13033h0(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (this.f11803b == null && bundle.containsKey("from")) {
            this.f11803b = bundle.getString("from");
        }
        if (this.f11804c == null && bundle.containsKey("momentId")) {
            this.f11804c = bundle.getString("momentId");
        }
        if (this.f11805d == null && bundle.containsKey("momentOwner")) {
            this.f11805d = bundle.getString("momentOwner");
        }
        if (bundle.containsKey("initMediaIndex")) {
            this.f11807f = bundle.getInt("initMediaIndex", 0);
        }
        if (bundle.containsKey("isHideComment")) {
            this.f11806e = bundle.getBoolean("isHideComment", false);
        }
        if (bundle.containsKey("start_home_card")) {
            this.f11814m = bundle.getBoolean("start_home_card", false);
        }
        if (bundle.containsKey("canGreeting")) {
            this.f11809h = bundle.getBoolean("canGreeting", false);
        }
        this.f11808g = bundle.getString("momentValue", null);
        this.f11810i = bundle.getString("msg_id", null);
        this.f11811j = bundle.getString("enterPage", null);
        if (bundle.containsKey("showInput")) {
            this.f11812k = bundle.getBoolean("showInput", false);
        }
        Serializable serializable = bundle.getSerializable("rawFeed");
        if (serializable instanceof RawFeed) {
            this.f11813l = (RawFeed) serializable;
        }
        this.f11815n = bundle.getString("clickedMsgid", null);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m13034k0(Moment moment) {
        if (TextUtils.equals(((DbObject) moment).id, this.f11804c)) {
            this.f11802a.finishWithoutCustomAnimation();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m13035l0(Bundle bundle) {
        m13033h0(bundle);
    }

    /* JADX INFO: renamed from: m0 */
    public void m13036m0(Bundle bundle) {
        bundle.putString("from", this.f11803b);
        bundle.putString("momentId", this.f11804c);
        bundle.putString("momentOwner", this.f11805d);
        bundle.putInt("initMediaIndex", this.f11807f);
        bundle.putBoolean("isHideComment", this.f11806e);
        bundle.putString("momentValue", this.f11808g);
        bundle.putString("msg_id", this.f11810i);
    }

    public void destroy() {
    }
}
