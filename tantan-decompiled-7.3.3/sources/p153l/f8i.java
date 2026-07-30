package p153l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;

/* JADX INFO: loaded from: classes13.dex */
public class f8i extends AbstractC16917f7 implements t6i {

    /* JADX INFO: renamed from: a */
    public dj70 f97739a;

    /* JADX INFO: renamed from: b */
    public lnh f97740b;

    /* JADX INFO: renamed from: c */
    public wyd0 f97741c = new wyd0("FeedTopViewLiveRender_SHOW_TIME" + FeedModule.m61405F().userId(), "");

    public f8i(lol lolVar, dj70 dj70Var) {
        this.f97740b = (lnh) lolVar;
        this.f97739a = dj70Var;
    }

    /* JADX INFO: renamed from: t */
    private lnh m124542t() {
        return this.f97740b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m124543w(View view) {
        FeedModule.f39703d.m145504Dd(false).subscribe(psd0.m173596G(new y20() { // from class: l.e8i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92545a.m124547v((Envelope) obj);
            }
        }));
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: b */
    public boolean mo96457b(dj70 dj70Var) {
        Moment moment = dj70Var.f88791a;
        return moment != null && moment.isVoiceLive;
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: c */
    public void mo96458c(dj70 dj70Var) {
        this.f97739a = dj70Var;
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: j */
    public void mo96462j() {
        m124542t().f132804g.setOnClickListener(new View.OnClickListener() { // from class: l.c8i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80217a.m124543w(view);
            }
        });
        this.f97740b.f132789O.setText(p6i.m170908q(this.f97739a.f88791a.voiceLive.startTime));
        if (this.f97741c.get().equals(pzi0.m174459t())) {
            return;
        }
        FeedModule.f39703d.m145504Dd(true);
        this.f97741c.put(pzi0.m174459t());
    }

    @Override // p153l.AbstractC16917f7
    /* JADX INFO: renamed from: l */
    public void mo96463l(dj70 dj70Var) {
        Moment moment;
        this.f97739a = dj70Var;
        m124550z();
        bnl0.m105524M(m124542t().f132804g, (dj70Var == null || (moment = dj70Var.f88791a) == null || !moment.isVoiceLive) ? false : true);
        if (this.f97739a.f88793c || !u6i.m194710c(dj70Var, m124549y())) {
            return;
        }
        m124545s(this.f97740b.f132811n);
    }

    /* JADX INFO: renamed from: r */
    public Act m124544r() {
        return this.f97739a.f88797g;
    }

    /* JADX INFO: renamed from: s */
    public void m124545s(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.b8i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f75433a.m124546u(view2);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m124546u(View view) {
        u6i.m194711d(this.f97739a, m124544r(), m124549y());
        Moment momentM124549y = m124549y();
        dj70 dj70Var = this.f97739a;
        dug.m118145k(momentM124549y, dj70Var.f88798h + 1, o7i.m166350u(dj70Var.f88792b), o7i.m166349t(this.f97739a.f88792b), "");
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m124547v(Envelope envelope) {
        FeedModule.f39703d.f121371p0.m137019l(this.f97739a.f88791a);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m124548x(Bitmap bitmap) {
        m124542t().f132816s.setAvatar(bitmap);
    }

    /* JADX INFO: renamed from: y */
    public Moment m124549y() {
        return this.f97739a.f88791a;
    }

    /* JADX INFO: renamed from: z */
    public final void m124550z() {
        dj70 dj70Var = this.f97739a;
        if (!dj70Var.f88793c && u6i.m194710c(dj70Var, m124549y()) && m124549y().momentVoiceLiveInfos == null) {
            dj70 dj70Var2 = this.f97739a;
            if (dj70Var2.f88796f == null || "from_live_square_tab".equals(dj70Var2.f88792b)) {
                return;
            }
            bnl0.m105524M(m124542t().f132812o, false);
            bnl0.m105524M(m124542t().f132815r, false);
            bnl0.m105524M(m124542t().f132816s, true);
            bnl0.m105524M(m124542t().f132819v, false);
            bnl0.m105524M(m124542t().f132806i, false);
            m124542t().f132816s.m65902c(Color.parseColor("#D67AFF"), Color.parseColor("#A87CFF"));
            String strM166350u = o7i.m166350u(this.f97739a.f88792b);
            String strM166349t = o7i.m166349t(this.f97739a.f88792b);
            if (m124549y() != null && m124549y().voiceLive != null && strM166350u != null && strM166349t != null) {
                i4g0.m138492A("e_live_audio_room_enter", strM166350u, new pf60("anchorId", m124549y().voiceLive.anchor.f39651id), new pf60("liveId", m124549y().voiceLive.f40098id), new pf60("audio_card_type", "user_card"), new pf60("audio_tab_id", ""), new pf60(FirebaseAnalytics.Param.INDEX, String.valueOf(this.f97739a.f88798h + 1)));
            }
            uqb0.f180374G.m127102F(uqb0.f180374G.m127136X0(this.f97739a.f88796f.m61308fp().profileSmall()).m8661O(new q3d0(m124542t().f132816s.getAvatarSize(), m124542t().f132816s.getAvatarSize())).m8668a(), new y20() { // from class: l.d8i
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f85599a.m124548x((Bitmap) obj);
                }
            });
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

    @Override // p153l.AbstractC16917f7, p153l.v7i
    /* JADX INFO: renamed from: d */
    public void mo96459d(dj70 dj70Var) {
    }

    @Override // p153l.AbstractC16917f7
    /* JADX INFO: renamed from: m */
    public void mo96464m(dj70 dj70Var) {
    }
}
