package p149l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;

/* JADX INFO: loaded from: classes12.dex */
public class q6i extends AbstractC17936k7 implements e5i {

    /* JADX INFO: renamed from: a */
    public xa70 f152908a;

    /* JADX INFO: renamed from: b */
    public wlh f152909b;

    /* JADX INFO: renamed from: c */
    public uqd0 f152910c = new uqd0("FeedTopViewLiveRender_SHOW_TIME" + FeedModule.m60221F().userId(), "");

    public q6i(zll zllVar, xa70 xa70Var) {
        this.f152909b = (wlh) zllVar;
        this.f152908a = xa70Var;
    }

    /* JADX INFO: renamed from: t */
    private wlh m173136t() {
        return this.f152909b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m173137w(View view) {
        FeedModule.f38855d.m209263Dd(false).subscribe(mkd0.m154955G(new e30() { // from class: l.p6i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147406a.m173141v((Envelope) obj);
            }
        }));
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: b */
    public boolean mo124591b(xa70 xa70Var) {
        Moment moment = xa70Var.f191689a;
        return moment != null && moment.isVoiceLive;
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: c */
    public void mo124592c(xa70 xa70Var) {
        this.f152908a = xa70Var;
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: j */
    public void mo115059j() {
        m173136t().f186932g.setOnClickListener(new View.OnClickListener() { // from class: l.n6i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137407a.m173137w(view);
            }
        });
        this.f152909b.f186917O.setText(a5i.m95041q(this.f152908a.f191689a.voiceLive.startTime));
        if (this.f152910c.get().equals(mqi0.m155949t())) {
            return;
        }
        FeedModule.f38855d.m209263Dd(true);
        this.f152910c.put(mqi0.m155949t());
    }

    @Override // p149l.AbstractC17936k7
    /* JADX INFO: renamed from: l */
    public void mo144642l(xa70 xa70Var) {
        Moment moment;
        this.f152908a = xa70Var;
        m173144z();
        xdl0.m208344M(m173136t().f186932g, (xa70Var == null || (moment = xa70Var.f191689a) == null || !moment.isVoiceLive) ? false : true);
        if (this.f152908a.f191691c || !f5i.m119504c(xa70Var, m173143y())) {
            return;
        }
        m173139s(this.f152909b.f186939n);
    }

    /* JADX INFO: renamed from: r */
    public Act m173138r() {
        return this.f152908a.f191695g;
    }

    /* JADX INFO: renamed from: s */
    public void m173139s(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.m6i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f131691a.m173140u(view2);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m173140u(View view) {
        f5i.m119505d(this.f152908a, m173138r(), m173143y());
        Moment momentM173143y = m173143y();
        xa70 xa70Var = this.f152908a;
        osg.m165776k(momentM173143y, xa70Var.f191696h + 1, z5i.m217340u(xa70Var.f191690b), z5i.m217339t(this.f152908a.f191690b), "");
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m173141v(Envelope envelope) {
        FeedModule.f38855d.f193061p0.m132487l(this.f152908a.f191689a);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m173142x(Bitmap bitmap) {
        m173136t().f186944s.setAvatar(bitmap);
    }

    /* JADX INFO: renamed from: y */
    public Moment m173143y() {
        return this.f152908a.f191689a;
    }

    /* JADX INFO: renamed from: z */
    public final void m173144z() {
        xa70 xa70Var = this.f152908a;
        if (!xa70Var.f191691c && f5i.m119504c(xa70Var, m173143y()) && m173143y().momentVoiceLiveInfos == null) {
            xa70 xa70Var2 = this.f152908a;
            if (xa70Var2.f191694f == null || "from_live_square_tab".equals(xa70Var2.f191690b)) {
                return;
            }
            xdl0.m208344M(m173136t().f186940o, false);
            xdl0.m208344M(m173136t().f186943r, false);
            xdl0.m208344M(m173136t().f186944s, true);
            xdl0.m208344M(m173136t().f186947v, false);
            xdl0.m208344M(m173136t().f186934i, false);
            m173136t().f186944s.m64719c(Color.parseColor("#D67AFF"), Color.parseColor("#A87CFF"));
            String strM217340u = z5i.m217340u(this.f152908a.f191690b);
            String strM217339t = z5i.m217339t(this.f152908a.f191690b);
            if (m173143y() != null && m173143y().voiceLive != null && strM217340u != null && strM217339t != null) {
                zvf0.m220368A("e_live_audio_room_enter", strM217340u, new j760("anchorId", m173143y().voiceLive.anchor.f38803id), new j760("liveId", m173143y().voiceLive.f39250id), new j760("audio_card_type", "user_card"), new j760("audio_tab_id", ""), new j760(FirebaseAnalytics.Param.INDEX, String.valueOf(this.f152908a.f191696h + 1)));
            }
            qib0.f154691G.m102318F(qib0.f154691G.m102352X0(this.f152908a.f191694f.m60124fp().profileSmall()).m8607O(new nvc0(m173136t().f186944s.getAvatarSize(), m173136t().f186944s.getAvatarSize())).m8614a(), new e30() { // from class: l.o6i
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f142347a.m173142x((Bitmap) obj);
                }
            });
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

    @Override // p149l.AbstractC17936k7, p149l.g6i
    /* JADX INFO: renamed from: d */
    public void mo124593d(xa70 xa70Var) {
    }

    @Override // p149l.AbstractC17936k7
    /* JADX INFO: renamed from: m */
    public void mo144643m(xa70 xa70Var) {
    }
}
