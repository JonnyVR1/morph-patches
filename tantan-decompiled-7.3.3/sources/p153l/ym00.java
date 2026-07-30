package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class ym00 extends ar2<in00> {

    /* JADX INFO: renamed from: a */
    public MomentDetailAct f200607a;

    /* JADX INFO: renamed from: b */
    public String f200608b;

    /* JADX INFO: renamed from: c */
    public String f200609c;

    /* JADX INFO: renamed from: d */
    public String f200610d;

    /* JADX INFO: renamed from: e */
    public boolean f200611e;

    /* JADX INFO: renamed from: f */
    public int f200612f;

    /* JADX INFO: renamed from: g */
    public String f200613g;

    /* JADX INFO: renamed from: h */
    public boolean f200614h;

    /* JADX INFO: renamed from: i */
    public String f200615i;

    /* JADX INFO: renamed from: j */
    public String f200616j;

    /* JADX INFO: renamed from: k */
    public boolean f200617k;

    /* JADX INFO: renamed from: l */
    public RawFeed f200618l;

    /* JADX INFO: renamed from: m */
    public boolean f200619m;

    /* JADX INFO: renamed from: n */
    public String f200620n;

    /* JADX INFO: renamed from: o */
    public Runnable f200621o;

    /* JADX INFO: renamed from: l.ym00$a */
    public class RunnableC21629a implements Runnable {
        public RunnableC21629a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FeedModule.f39703d.m145769pc(ym00.this.f200609c);
        }
    }

    public ym00(MomentDetailAct momentDetailAct) {
        super(momentDetailAct);
        this.f200612f = 0;
        this.f200621o = new RunnableC21629a();
        this.f200607a = momentDetailAct;
        m216648h0(momentDetailAct.getIntent().getExtras());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m216646i0(Bundle bundle) {
        ((in00) this.viewModel).m141001r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m216647j0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i && NullChecker.m82487b(((in00) this.viewModel).f115853d)) {
            ((in00) this.viewModel).f115853d.m66044R4();
            if (!TextUtils.isEmpty(this.f200609c) && !TextUtils.isEmpty(this.f200610d)) {
                l51.m152889I(((in00) this.viewModel).f115853d, this.f200621o, ((long) ksg.m151170I("detailTime")) * 1000);
            }
        }
        if (c4470c == C4470c.f16268j && NullChecker.m82487b(((in00) this.viewModel).f115853d)) {
            this.f200607a.hideInput();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.dm00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89593a.m216646i0((Bundle) obj);
            }
        });
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.om00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147889a.m216647j0((C4470c) obj);
            }
        }));
        duringCreated(FeedModule.f39703d.f121371p0).subscribe(psd0.m173596G(new y20() { // from class: l.qm00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158289a.m216649k0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public void m216648h0(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (this.f200608b == null && bundle.containsKey("from")) {
            this.f200608b = bundle.getString("from");
        }
        if (this.f200609c == null && bundle.containsKey("momentId")) {
            this.f200609c = bundle.getString("momentId");
        }
        if (this.f200610d == null && bundle.containsKey("momentOwner")) {
            this.f200610d = bundle.getString("momentOwner");
        }
        if (bundle.containsKey("initMediaIndex")) {
            this.f200612f = bundle.getInt("initMediaIndex", 0);
        }
        if (bundle.containsKey("isHideComment")) {
            this.f200611e = bundle.getBoolean("isHideComment", false);
        }
        if (bundle.containsKey("start_home_card")) {
            this.f200619m = bundle.getBoolean("start_home_card", false);
        }
        if (bundle.containsKey("canGreeting")) {
            this.f200614h = bundle.getBoolean("canGreeting", false);
        }
        this.f200613g = bundle.getString("momentValue", null);
        this.f200615i = bundle.getString("msg_id", null);
        this.f200616j = bundle.getString("enterPage", null);
        if (bundle.containsKey("showInput")) {
            this.f200617k = bundle.getBoolean("showInput", false);
        }
        Serializable serializable = bundle.getSerializable("rawFeed");
        if (serializable instanceof RawFeed) {
            this.f200618l = (RawFeed) serializable;
        }
        this.f200620n = bundle.getString("clickedMsgid", null);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m216649k0(Moment moment) {
        if (TextUtils.equals(moment.f56859id, this.f200609c)) {
            this.f200607a.finishWithoutCustomAnimation();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m216650l0(Bundle bundle) {
        m216648h0(bundle);
    }

    /* JADX INFO: renamed from: m0 */
    public void m216651m0(Bundle bundle) {
        bundle.putString("from", this.f200608b);
        bundle.putString("momentId", this.f200609c);
        bundle.putString("momentOwner", this.f200610d);
        bundle.putInt("initMediaIndex", this.f200612f);
        bundle.putBoolean("isHideComment", this.f200611e);
        bundle.putString("momentValue", this.f200613g);
        bundle.putString("msg_id", this.f200615i);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
