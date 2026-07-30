package p007l;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.data.Live;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.WealthLevelView;
import com.p000p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.c4g0;
import l.e30;
import l.i0g0;
import l.mkd0;
import l.nvc0;
import l.qib0;
import l.roj0;
import l.xdl0;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class z5i extends AbstractC2409k7 implements e5i {

    /* JADX INFO: renamed from: a */
    public zll f15598a;

    /* JADX INFO: renamed from: b */
    public xa70 f15599b;

    /* JADX INFO: renamed from: c */
    public c4g0 f15600c;

    /* JADX INFO: renamed from: d */
    public b<roj0> f15601d = b.b();

    /* JADX INFO: renamed from: e */
    public q5i f15602e;

    public z5i(zll zllVar, xa70 xa70Var) {
        this.f15598a = zllVar;
        this.f15599b = xa70Var;
    }

    /* JADX INFO: renamed from: t */
    public static String m17227t(String str) {
        if (TextUtils.equals(str, "from_nearby_focus")) {
            return "follow_photo";
        }
        if (TextUtils.equals(str, "from_nearby_falls_feed")) {
            return "nearby_photo";
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static String m17228u(String str) {
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
            return fm20.m10224d("from_activity_tab_one");
        }
        if (TextUtils.equals(str, "from_activity_tab_two")) {
            return fm20.m10224d("from_activity_tab_two");
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public final void m17229A(xa70 xa70Var) {
        if (NullChecker.a(xa70Var.f14825f)) {
            WealthLevelView wealthLevelView = this.f15598a instanceof wlh ? m17235s().f14569A : null;
            if (wealthLevelView != null) {
                wealthLevelView.m6404x(xa70Var.f14825f);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m17230B(xa70 xa70Var) {
        User user = xa70Var.f14825f;
        if (user == null || user.m1042fp() == null || "from_live_square_tab".equals(xa70Var.f14821b)) {
            m17233q(m17235s().f14606o, xa70Var);
            return;
        }
        TextUtils.equals(xa70Var.f14821b, "from_discover_dating");
        xdl0.M(m17235s().f14606o, false);
        xdl0.M(m17235s().f14609r, false);
        xdl0.M(m17235s().f14610s, true);
        xdl0.M(m17235s().f14613v, false);
        xdl0.M(m17235s().f14600i, false);
        m17235s().f14610s.m5813c(Color.parseColor("#FF69AB"), Color.parseColor("#FF5EEA"));
        qib0.G.F(qib0.G.X0(xa70Var.f14825f.m1042fp().profileSmall()).O(new nvc0(m17235s().f14610s.getAvatarSize(), m17235s().f14610s.getAvatarSize())).a(), new e30() { // from class: l.x5i
            public final void call(Object obj) {
                this.f14775a.m17237w((Bitmap) obj);
            }
        });
        m17233q(m17235s().f14605n, xa70Var);
    }

    /* JADX INFO: renamed from: C */
    public final void m17231C(xa70 xa70Var) {
        if (!(this.f15598a instanceof wlh) || xa70Var.f14822c) {
            return;
        }
        if (!f5i.m10064b(xa70Var, xa70Var.f14820a) || (m17232p() instanceof TopicAggregationAct)) {
            mkd0.z(this.f15600c);
        } else {
            m17230B(xa70Var);
        }
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: b */
    public boolean mo10419b(xa70 xa70Var) {
        Moment moment;
        return (xa70Var.f14825f == null || (moment = xa70Var.f14820a) == null || !moment.isLive) ? false : true;
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: c */
    public void mo10420c(xa70 xa70Var) {
        this.f15599b = xa70Var;
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: e */
    public void mo9667e() {
        if ((this.f15598a instanceof wlh) && ((Boolean) FeedModule.f316d.f14962Y.get()).booleanValue()) {
            if (this.f15602e == null) {
                this.f15602e = new q5i();
            }
            this.f15602e.m13407s(this.f15599b, m17235s().f14601j, m17235s().f14602k, null, m17235s().f14592a);
        }
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: j */
    public void mo9676j() {
        m17239y();
        m17240z();
        m17234r();
    }

    @Override // p007l.AbstractC2409k7
    /* JADX INFO: renamed from: l */
    public void mo11392l(xa70 xa70Var) {
        this.f15599b = xa70Var;
        m17231C(xa70Var);
        m17229A(xa70Var);
    }

    /* JADX INFO: renamed from: p */
    public Act m17232p() {
        return this.f15599b.f14826g;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: q */
    public final void m17233q(View view, final xa70 xa70Var) {
        xdl0.E0(view, new View.OnClickListener() { // from class: l.y5i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f15266a.m17236v(xa70Var, view2);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m17234r() {
        zll zllVar = this.f15598a;
        if (zllVar instanceof wlh) {
            wlh wlhVar = (wlh) zllVar;
            if (xdl0.O0(wlhVar.f14585Q) && xdl0.O0(wlhVar.f14583O)) {
                xdl0.M(wlhVar.f14584P, true);
            } else {
                xdl0.M(wlhVar.f14584P, false);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final wlh m17235s() {
        return (wlh) this.f15598a;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m17236v(xa70 xa70Var, View view) {
        String str;
        if ("from_nearby_focus".equals(xa70Var.f14821b)) {
            str = "follow_photo";
        } else {
            str = "from_nearby_falls_feed".equals(xa70Var.f14821b) ? "nearby_photo" : "";
        }
        Act actM17232p = m17232p();
        Live live = xa70Var.f14820a.live;
        kjb0.m11444H(actM17232p, live.f228id, str, live.recommendInfo.category);
        osg.m12854j(xa70Var.f14820a, xa70Var.f14827h + 1, m17227t(xa70Var.f14821b), m17228u(xa70Var.f14821b), xa70Var.f14829j);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m17237w(Bitmap bitmap) {
        m17235s().f14610s.setAvatar(bitmap);
    }

    /* JADX INFO: renamed from: x */
    public Moment m17238x() {
        return this.f15599b.f14820a;
    }

    /* JADX INFO: renamed from: y */
    public final void m17239y() {
        if (this.f15598a instanceof wlh) {
            User userM16628e8 = FeedModule.f316d.m16628e8(m17238x().owner);
            if (!NullChecker.a(userM16628e8) || this.f15599b.f14834o.f6542a) {
                return;
            }
            m17235s().f14585Q.setText(i0g0.p(userM16628e8.location.distance, true));
            m17235s().f14585Q.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m17240z() {
        if (this.f15598a instanceof wlh) {
            m17235s().f14583O.setText(a5i.m8417q(m17238x().live.startTime));
        }
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: f */
    public void mo9669f() {
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: h */
    public void mo9673h() {
    }

    @Override // p007l.AbstractC2409k7
    /* JADX INFO: renamed from: m */
    public void mo11393m(xa70 xa70Var) {
    }
}
