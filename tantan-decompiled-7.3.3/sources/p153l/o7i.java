package p153l;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.WealthLevelView;
import com.p051p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.tantanapp.common.utils.NullChecker;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes13.dex */
public class o7i extends AbstractC16917f7 implements t6i {

    /* JADX INFO: renamed from: a */
    public lol f145271a;

    /* JADX INFO: renamed from: b */
    public dj70 f145272b;

    /* JADX INFO: renamed from: c */
    public kcg0 f145273c;

    /* JADX INFO: renamed from: d */
    public C22508b<uxj0> f145274d = C22508b.m222767b();

    /* JADX INFO: renamed from: e */
    public f7i f145275e;

    public o7i(lol lolVar, dj70 dj70Var) {
        this.f145271a = lolVar;
        this.f145272b = dj70Var;
    }

    /* JADX INFO: renamed from: t */
    public static String m166349t(String str) {
        if (TextUtils.equals(str, "from_nearby_focus")) {
            return "follow_photo";
        }
        if (TextUtils.equals(str, "from_nearby_falls_feed")) {
            return "nearby_photo";
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static String m166350u(String str) {
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
            return pu20.m173809d("from_activity_tab_one");
        }
        if (TextUtils.equals(str, "from_activity_tab_two")) {
            return pu20.m173809d("from_activity_tab_two");
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public final void m166351A(dj70 dj70Var) {
        if (NullChecker.m82486a(dj70Var.f88796f)) {
            WealthLevelView wealthLevelView = this.f145271a instanceof lnh ? m166357s().f132775A : null;
            if (wealthLevelView != null) {
                wealthLevelView.m66486x(dj70Var.f88796f);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m166352B(dj70 dj70Var) {
        User user = dj70Var.f88796f;
        if (user == null || user.m61308fp() == null || "from_live_square_tab".equals(dj70Var.f88792b)) {
            m166355q(m166357s().f132812o, dj70Var);
            return;
        }
        TextUtils.equals(dj70Var.f88792b, "from_discover_dating");
        bnl0.m105524M(m166357s().f132812o, false);
        bnl0.m105524M(m166357s().f132815r, false);
        bnl0.m105524M(m166357s().f132816s, true);
        bnl0.m105524M(m166357s().f132819v, false);
        bnl0.m105524M(m166357s().f132806i, false);
        m166357s().f132816s.m65902c(Color.parseColor("#FF69AB"), Color.parseColor("#FF5EEA"));
        uqb0.f180374G.m127102F(uqb0.f180374G.m127136X0(dj70Var.f88796f.m61308fp().profileSmall()).m8661O(new q3d0(m166357s().f132816s.getAvatarSize(), m166357s().f132816s.getAvatarSize())).m8668a(), new y20() { // from class: l.m7i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135080a.m166359w((Bitmap) obj);
            }
        });
        m166355q(m166357s().f132811n, dj70Var);
    }

    /* JADX INFO: renamed from: C */
    public final void m166353C(dj70 dj70Var) {
        if (!(this.f145271a instanceof lnh) || dj70Var.f88793c) {
            return;
        }
        if (!u6i.m194709b(dj70Var, dj70Var.f88791a) || (m166354p() instanceof TopicAggregationAct)) {
            psd0.m173633z(this.f145273c);
        } else {
            m166352B(dj70Var);
        }
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: b */
    public boolean mo96457b(dj70 dj70Var) {
        Moment moment;
        return (dj70Var.f88796f == null || (moment = dj70Var.f88791a) == null || !moment.isLive) ? false : true;
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: c */
    public void mo96458c(dj70 dj70Var) {
        this.f145272b = dj70Var;
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: e */
    public void mo153129e() {
        if ((this.f145271a instanceof lnh) && FeedModule.f39703d.f121337Y.get().booleanValue()) {
            if (this.f145275e == null) {
                this.f145275e = new f7i();
            }
            this.f145275e.m124459s(this.f145272b, m166357s().f132807j, m166357s().f132808k, null, m166357s().f132798a);
        }
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: j */
    public void mo96462j() {
        m166361y();
        m166362z();
        m166356r();
    }

    @Override // p153l.AbstractC16917f7
    /* JADX INFO: renamed from: l */
    public void mo96463l(dj70 dj70Var) {
        this.f145272b = dj70Var;
        m166353C(dj70Var);
        m166351A(dj70Var);
    }

    /* JADX INFO: renamed from: p */
    public Act m166354p() {
        return this.f145272b.f88797g;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: q */
    public final void m166355q(View view, final dj70 dj70Var) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.n7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f140607a.m166358v(dj70Var, view2);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m166356r() {
        lol lolVar = this.f145271a;
        if (lolVar instanceof lnh) {
            lnh lnhVar = (lnh) lolVar;
            if (bnl0.m105529O0(lnhVar.f132791Q) && bnl0.m105529O0(lnhVar.f132789O)) {
                bnl0.m105524M(lnhVar.f132790P, true);
            } else {
                bnl0.m105524M(lnhVar.f132790P, false);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final lnh m166357s() {
        return (lnh) this.f145271a;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m166358v(dj70 dj70Var, View view) {
        String str;
        if ("from_nearby_focus".equals(dj70Var.f88792b)) {
            str = "follow_photo";
        } else {
            str = "from_nearby_falls_feed".equals(dj70Var.f88792b) ? "nearby_photo" : "";
        }
        Act actM166354p = m166354p();
        Live live = dj70Var.f88791a.live;
        orb0.m168879H(actM166354p, live.f39615id, str, live.recommendInfo.category);
        dug.m118144j(dj70Var.f88791a, dj70Var.f88798h + 1, m166349t(dj70Var.f88792b), m166350u(dj70Var.f88792b), dj70Var.f88800j);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m166359w(Bitmap bitmap) {
        m166357s().f132816s.setAvatar(bitmap);
    }

    /* JADX INFO: renamed from: x */
    public Moment m166360x() {
        return this.f145272b.f88791a;
    }

    /* JADX INFO: renamed from: y */
    public final void m166361y() {
        if (this.f145271a instanceof lnh) {
            User userM145688e8 = FeedModule.f39703d.m145688e8(m166360x().owner);
            if (!NullChecker.m82486a(userM145688e8) || this.f145272b.f88805o.f161475a) {
                return;
            }
            m166357s().f132791Q.setText(q8g0.m175811p(userM145688e8.location.distance, true));
            m166357s().f132791Q.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m166362z() {
        if (this.f145271a instanceof lnh) {
            m166357s().f132789O.setText(p6i.m170908q(m166360x().live.startTime));
        }
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: f */
    public void mo96460f() {
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: h */
    public void mo96461h() {
    }

    @Override // p153l.AbstractC16917f7
    /* JADX INFO: renamed from: m */
    public void mo96464m(dj70 dj70Var) {
    }
}
