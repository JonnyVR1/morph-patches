package p007l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.android.app.Act;
import l.e30;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.nvc0;
import l.qib0;
import l.uqd0;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class q6i extends AbstractC2409k7 implements e5i {

    /* JADX INFO: renamed from: a */
    public xa70 f12116a;

    /* JADX INFO: renamed from: b */
    public wlh f12117b;

    /* JADX INFO: renamed from: c */
    public uqd0 f12118c = new uqd0("FeedTopViewLiveRender_SHOW_TIME" + FeedModule.m1139F().userId(), "");

    public q6i(zll zllVar, xa70 xa70Var) {
        this.f12117b = (wlh) zllVar;
        this.f12116a = xa70Var;
    }

    /* JADX INFO: renamed from: t */
    private wlh m13419t() {
        return this.f12117b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m13420w(View view) {
        FeedModule.f316d.m16444Dd(false).subscribe(mkd0.G(new e30() { // from class: l.p6i
            public final void call(Object obj) {
                this.f11705a.m13424v((Envelope) obj);
            }
        }));
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: b */
    public boolean mo10419b(xa70 xa70Var) {
        Moment moment = xa70Var.f14820a;
        return moment != null && moment.isVoiceLive;
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: c */
    public void mo10420c(xa70 xa70Var) {
        this.f12116a = xa70Var;
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: j */
    public void mo9676j() {
        m13419t().f14598g.setOnClickListener(new View.OnClickListener() { // from class: l.n6i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10685a.m13420w(view);
            }
        });
        this.f12117b.f14583O.setText(a5i.m8417q(this.f12116a.f14820a.voiceLive.startTime));
        if (((String) this.f12118c.get()).equals(mqi0.t())) {
            return;
        }
        FeedModule.f316d.m16444Dd(true);
        this.f12118c.put(mqi0.t());
    }

    @Override // p007l.AbstractC2409k7
    /* JADX INFO: renamed from: l */
    public void mo11392l(xa70 xa70Var) {
        Moment moment;
        this.f12116a = xa70Var;
        m13427z();
        xdl0.M(m13419t().f14598g, (xa70Var == null || (moment = xa70Var.f14820a) == null || !moment.isVoiceLive) ? false : true);
        if (this.f12116a.f14822c || !f5i.m10065c(xa70Var, m13426y())) {
            return;
        }
        m13422s(this.f12117b.f14605n);
    }

    /* JADX INFO: renamed from: r */
    public Act m13421r() {
        return this.f12116a.f14826g;
    }

    /* JADX INFO: renamed from: s */
    public void m13422s(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.m6i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f10245a.m13423u(view2);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m13423u(View view) {
        f5i.m10066d(this.f12116a, m13421r(), m13426y());
        Moment momentM13426y = m13426y();
        xa70 xa70Var = this.f12116a;
        osg.m12855k(momentM13426y, xa70Var.f14827h + 1, z5i.m17228u(xa70Var.f14821b), z5i.m17227t(this.f12116a.f14821b), "");
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m13424v(Envelope envelope) {
        FeedModule.f316d.f14996p0.onNext(this.f12116a.f14820a);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m13425x(Bitmap bitmap) {
        m13419t().f14610s.setAvatar(bitmap);
    }

    /* JADX INFO: renamed from: y */
    public Moment m13426y() {
        return this.f12116a.f14820a;
    }

    /* JADX INFO: renamed from: z */
    public final void m13427z() {
        xa70 xa70Var = this.f12116a;
        if (!xa70Var.f14822c && f5i.m10065c(xa70Var, m13426y()) && m13426y().momentVoiceLiveInfos == null) {
            xa70 xa70Var2 = this.f12116a;
            if (xa70Var2.f14825f == null || "from_live_square_tab".equals(xa70Var2.f14821b)) {
                return;
            }
            xdl0.M(m13419t().f14606o, false);
            xdl0.M(m13419t().f14609r, false);
            xdl0.M(m13419t().f14610s, true);
            xdl0.M(m13419t().f14613v, false);
            xdl0.M(m13419t().f14600i, false);
            m13419t().f14610s.m5813c(Color.parseColor("#D67AFF"), Color.parseColor("#A87CFF"));
            String strM17228u = z5i.m17228u(this.f12116a.f14821b);
            String strM17227t = z5i.m17227t(this.f12116a.f14821b);
            if (m13426y() != null && m13426y().voiceLive != null && strM17228u != null && strM17227t != null) {
                zvf0.A("e_live_audio_room_enter", strM17228u, new j760[]{new j760("anchorId", m13426y().voiceLive.anchor.f264id), new j760("liveId", m13426y().voiceLive.f711id), new j760("audio_card_type", "user_card"), new j760("audio_tab_id", ""), new j760("index", String.valueOf(this.f12116a.f14827h + 1))});
            }
            qib0.G.F(qib0.G.X0(this.f12116a.f14825f.m1042fp().profileSmall()).O(new nvc0(m13419t().f14610s.getAvatarSize(), m13419t().f14610s.getAvatarSize())).a(), new e30() { // from class: l.o6i
                public final void call(Object obj) {
                    this.f11357a.m13425x((Bitmap) obj);
                }
            });
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

    @Override // p007l.AbstractC2409k7, p007l.g6i
    /* JADX INFO: renamed from: d */
    public void mo10421d(xa70 xa70Var) {
    }

    @Override // p007l.AbstractC2409k7
    /* JADX INFO: renamed from: m */
    public void mo11393m(xa70 xa70Var) {
    }
}
