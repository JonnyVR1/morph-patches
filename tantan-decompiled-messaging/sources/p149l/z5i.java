package p149l;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.WealthLevelView;
import com.p046p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.tantanapp.common.utils.NullChecker;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes12.dex */
public class z5i extends AbstractC17936k7 implements e5i {

    /* JADX INFO: renamed from: a */
    public zll f201807a;

    /* JADX INFO: renamed from: b */
    public xa70 f201808b;

    /* JADX INFO: renamed from: c */
    public c4g0 f201809c;

    /* JADX INFO: renamed from: d */
    public C22393b<roj0> f201810d = C22393b.m221521b();

    /* JADX INFO: renamed from: e */
    public q5i f201811e;

    public z5i(zll zllVar, xa70 xa70Var) {
        this.f201807a = zllVar;
        this.f201808b = xa70Var;
    }

    /* JADX INFO: renamed from: t */
    public static String m217339t(String str) {
        if (TextUtils.equals(str, "from_nearby_focus")) {
            return "follow_photo";
        }
        if (TextUtils.equals(str, "from_nearby_falls_feed")) {
            return "nearby_photo";
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static String m217340u(String str) {
        if (TextUtils.equals(str, "from_discover_dating")) {
            return "p_discover_dating";
        }
        if (TextUtils.equals(str, "from_discover_discussion")) {
            return "p_discover_discussion";
        }
        if (TextUtils.equals(str, "from_nearby_focus")) {
            return "p_follow";
        }
        if (TextUtils.equals(str, "from_nearby_falls_feed")) {
            return OMSDialogPositon.p_nearby;
        }
        if (TextUtils.equals(str, "from_nearby_online")) {
            return "p_nearby_online";
        }
        if (TextUtils.equals(str, "from_activity_tab_one")) {
            return fm20.m122121d("from_activity_tab_one");
        }
        if (TextUtils.equals(str, "from_activity_tab_two")) {
            return fm20.m122121d("from_activity_tab_two");
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public final void m217341A(xa70 xa70Var) {
        if (NullChecker.m81303a(xa70Var.f191694f)) {
            WealthLevelView wealthLevelView = this.f201807a instanceof wlh ? m217347s().f186903A : null;
            if (wealthLevelView != null) {
                wealthLevelView.m65303x(xa70Var.f191694f);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m217342B(xa70 xa70Var) {
        User user = xa70Var.f191694f;
        if (user == null || user.m60124fp() == null || "from_live_square_tab".equals(xa70Var.f191690b)) {
            m217345q(m217347s().f186940o, xa70Var);
            return;
        }
        TextUtils.equals(xa70Var.f191690b, "from_discover_dating");
        xdl0.m208344M(m217347s().f186940o, false);
        xdl0.m208344M(m217347s().f186943r, false);
        xdl0.m208344M(m217347s().f186944s, true);
        xdl0.m208344M(m217347s().f186947v, false);
        xdl0.m208344M(m217347s().f186934i, false);
        m217347s().f186944s.m64719c(Color.parseColor("#FF69AB"), Color.parseColor("#FF5EEA"));
        qib0.f154691G.m102318F(qib0.f154691G.m102352X0(xa70Var.f191694f.m60124fp().profileSmall()).m8607O(new nvc0(m217347s().f186944s.getAvatarSize(), m217347s().f186944s.getAvatarSize())).m8614a(), new e30() { // from class: l.x5i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191147a.m217349w((Bitmap) obj);
            }
        });
        m217345q(m217347s().f186939n, xa70Var);
    }

    /* JADX INFO: renamed from: C */
    public final void m217343C(xa70 xa70Var) {
        if (!(this.f201807a instanceof wlh) || xa70Var.f191691c) {
            return;
        }
        if (!f5i.m119503b(xa70Var, xa70Var.f191689a) || (m217344p() instanceof TopicAggregationAct)) {
            mkd0.m154992z(this.f201809c);
        } else {
            m217342B(xa70Var);
        }
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: b */
    public boolean mo124591b(xa70 xa70Var) {
        Moment moment;
        return (xa70Var.f191694f == null || (moment = xa70Var.f191689a) == null || !moment.isLive) ? false : true;
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: c */
    public void mo124592c(xa70 xa70Var) {
        this.f201808b = xa70Var;
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: e */
    public void mo115050e() {
        if ((this.f201807a instanceof wlh) && FeedModule.f38855d.f193027Y.get().booleanValue()) {
            if (this.f201811e == null) {
                this.f201811e = new q5i();
            }
            this.f201811e.m173024s(this.f201808b, m217347s().f186935j, m217347s().f186936k, null, m217347s().f186926a);
        }
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: j */
    public void mo115059j() {
        m217351y();
        m217352z();
        m217346r();
    }

    @Override // p149l.AbstractC17936k7
    /* JADX INFO: renamed from: l */
    public void mo144642l(xa70 xa70Var) {
        this.f201808b = xa70Var;
        m217343C(xa70Var);
        m217341A(xa70Var);
    }

    /* JADX INFO: renamed from: p */
    public Act m217344p() {
        return this.f201808b.f191695g;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: q */
    public final void m217345q(View view, final xa70 xa70Var) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.y5i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f196439a.m217348v(xa70Var, view2);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m217346r() {
        zll zllVar = this.f201807a;
        if (zllVar instanceof wlh) {
            wlh wlhVar = (wlh) zllVar;
            if (xdl0.m208349O0(wlhVar.f186919Q) && xdl0.m208349O0(wlhVar.f186917O)) {
                xdl0.m208344M(wlhVar.f186918P, true);
            } else {
                xdl0.m208344M(wlhVar.f186918P, false);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final wlh m217347s() {
        return (wlh) this.f201807a;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m217348v(xa70 xa70Var, View view) {
        String str;
        if ("from_nearby_focus".equals(xa70Var.f191690b)) {
            str = "follow_photo";
        } else {
            str = "from_nearby_falls_feed".equals(xa70Var.f191690b) ? "nearby_photo" : "";
        }
        Act actM217344p = m217344p();
        Live live = xa70Var.f191689a.live;
        kjb0.m146185H(actM217344p, live.f38767id, str, live.recommendInfo.category);
        osg.m165775j(xa70Var.f191689a, xa70Var.f191696h + 1, m217339t(xa70Var.f191690b), m217340u(xa70Var.f191690b), xa70Var.f191698j);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m217349w(Bitmap bitmap) {
        m217347s().f186944s.setAvatar(bitmap);
    }

    /* JADX INFO: renamed from: x */
    public Moment m217350x() {
        return this.f201808b.f191689a;
    }

    /* JADX INFO: renamed from: y */
    public final void m217351y() {
        if (this.f201807a instanceof wlh) {
            User userM209447e8 = FeedModule.f38855d.m209447e8(m217350x().owner);
            if (!NullChecker.m81303a(userM209447e8) || this.f201808b.f191703o.f79383a) {
                return;
            }
            m217347s().f186919Q.setText(i0g0.m133876p(userM209447e8.location.distance, true));
            m217347s().f186919Q.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m217352z() {
        if (this.f201807a instanceof wlh) {
            m217347s().f186917O.setText(a5i.m95041q(m217350x().live.startTime));
        }
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: f */
    public void mo115052f() {
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: h */
    public void mo115056h() {
    }

    @Override // p149l.AbstractC17936k7
    /* JADX INFO: renamed from: m */
    public void mo144643m(xa70 xa70Var) {
    }
}
