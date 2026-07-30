package com.p051p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.p052rx.C4493a;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Map;
import p151v.VFrame;
import p151v.VImage;
import p153l.ga1;
import p153l.i4g0;
import p153l.jyb;
import p153l.kcg0;
import p153l.ksg;
import p153l.l51;
import p153l.lbc0;
import p153l.lpg;
import p153l.npg;
import p153l.o1j0;
import p153l.opg;
import p153l.pb1;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.r1j0;
import p153l.upg;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedAudioPlayerView extends ConstraintLayout {

    /* JADX INFO: renamed from: w */
    public static final String f44177w = "FeedAudioPlayerView";

    /* JADX INFO: renamed from: d */
    public VFrame f44178d;

    /* JADX INFO: renamed from: e */
    public ProgressBar f44179e;

    /* JADX INFO: renamed from: f */
    public VImage f44180f;

    /* JADX INFO: renamed from: g */
    public TextView f44181g;

    /* JADX INFO: renamed from: h */
    public VImage f44182h;

    /* JADX INFO: renamed from: i */
    public float f44183i;

    /* JADX INFO: renamed from: j */
    public float f44184j;

    /* JADX INFO: renamed from: k */
    public String f44185k;

    /* JADX INFO: renamed from: l */
    public npg f44186l;

    /* JADX INFO: renamed from: m */
    public Moment f44187m;

    /* JADX INFO: renamed from: n */
    public String f44188n;

    /* JADX INFO: renamed from: o */
    public String f44189o;

    /* JADX INFO: renamed from: p */
    public boolean f44190p;

    /* JADX INFO: renamed from: q */
    public C4493a<String> f44191q;

    /* JADX INFO: renamed from: r */
    public kcg0 f44192r;

    /* JADX INFO: renamed from: s */
    public boolean f44193s;

    /* JADX INFO: renamed from: t */
    public boolean f44194t;

    /* JADX INFO: renamed from: u */
    public boolean f44195u;

    /* JADX INFO: renamed from: v */
    public final ga1 f44196v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.FeedAudioPlayerView$a */
    public class C11543a extends opg {
        public C11543a() {
        }

        @Override // p153l.opg, p153l.npg
        /* JADX INFO: renamed from: a */
        public void mo67474a(Exception exc) {
            super.mo67474a(exc);
            FeedAudioPlayerView.this.m67457R0();
            FeedAudioPlayerView.this.m67465a1();
        }

        @Override // p153l.opg, p153l.npg
        /* JADX INFO: renamed from: i */
        public void mo67475i(boolean z) {
            super.mo67475i(z);
            FeedModule.m61407M().mo68436Zo().mo136902f(false);
            FeedAudioPlayerView.this.m67457R0();
            FeedAudioPlayerView.this.m67465a1();
        }

        @Override // p153l.opg, p153l.npg
        /* JADX INFO: renamed from: j */
        public void mo67476j(float f) {
            super.mo67476j(f);
            FeedAudioPlayerView.this.f44184j = f / 1000.0f;
        }

        @Override // p153l.opg, p153l.npg
        public void onComplete() {
            super.onComplete();
            FeedModule.m61407M().mo68436Zo().mo136902f(false);
            FeedAudioPlayerView feedAudioPlayerView = FeedAudioPlayerView.this;
            feedAudioPlayerView.f44184j = feedAudioPlayerView.f44183i;
            FeedAudioPlayerView.this.m67457R0();
            FeedAudioPlayerView.this.m67465a1();
        }

        @Override // p153l.opg, p153l.npg
        public void onPause() {
            super.onPause();
            FeedAudioPlayerView.this.m67468g1();
            FeedAudioPlayerView.this.m67465a1();
        }

        @Override // p153l.opg, p153l.npg
        public void onStart() {
            FeedAudioPlayerView feedAudioPlayerView = FeedAudioPlayerView.this;
            if (feedAudioPlayerView.m67469h1(feedAudioPlayerView.f44185k)) {
                super.onStart();
                FeedModule.m61407M().mo68436Zo().mo136902f(true);
                FeedAudioPlayerView.this.m67433f1();
                FeedAudioPlayerView.this.m67466d1();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.FeedAudioPlayerView$b */
    public class C11544b implements ga1 {
        public C11544b() {
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: b */
        public void mo40108b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            l51.m152888H(FeedAudioPlayerView.this.act(), new Runnable() { // from class: l.tpg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f175594a.m67478f();
                }
            }, 300L);
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: d */
        public void mo40109d(String str, AudioBusinessType audioBusinessType, ga1 ga1Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                r1j0.m179420g(audioBusinessType2.getBusinessMsg());
            } else {
                pb1.m171472b().mo171478g(str, audioBusinessType, ga1Var);
                FeedAudioPlayerView.this.m67458S0();
            }
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m67478f() {
            if (!lpg.m155193v().m155224e0(FeedAudioPlayerView.this.f44185k) || FeedAudioPlayerView.this.f44195u) {
                return;
            }
            lpg.m155193v().m155229j0();
        }

        @Override // p153l.ga1
        public void success() {
            FeedAudioPlayerView.this.m67458S0();
        }
    }

    public FeedAudioPlayerView(Context context) {
        super(context);
        this.f44185k = "";
        this.f44194t = true;
        this.f44195u = false;
        this.f44196v = new C11544b();
        m67429I0(context);
    }

    /* JADX INFO: renamed from: I0 */
    private void m67429I0(Context context) {
        addView(m67470v0(LayoutInflater.from(context), this));
        m67430J0();
        m67454L0();
        m67460U0();
        m67461V0();
        setMaxWidth(qa00.m175859d(295.0f));
        setMinWidth(qa00.m175859d(219.0f));
        m67465a1();
    }

    /* JADX INFO: renamed from: J0 */
    private void m67430J0() {
        setOnClickListener(new View.OnClickListener() { // from class: l.qpg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158869a.m67432O0(view);
            }
        });
    }

    /* JADX INFO: renamed from: N0 */
    private void m67431N0() {
        m67448B0(this.f44185k);
        this.f44181g.setText(String.format("%ss", String.format(getResources().getString(R$string.f39936k0), Integer.valueOf(Math.round(this.f44183i)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public /* synthetic */ void m67432O0(View view) {
        if (m67472y0() || !this.f44194t) {
            return;
        }
        if (lpg.m155193v().m155224e0(this.f44185k)) {
            lpg.m155193v().m155229j0();
        } else {
            pb1.m171472b().mo171477f(f44177w, AudioBusinessType.NORMAL, this.f44196v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public void m67433f1() {
        m67466d1();
    }

    private npg getPlayListenerToAudioPlayer() {
        if (this.f44186l == null) {
            this.f44186l = new C11543a();
        }
        return this.f44186l;
    }

    private C4493a<String> getPlayingSubscriber() {
        if (this.f44191q == null) {
            this.f44191q = psd0.m173596G(new y20() { // from class: l.rpg
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f164364a.m67449D0((String) obj);
                }
            });
        }
        return this.f44191q;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m67448B0(String str) {
        if (m67469h1(str)) {
            m67459T0();
        } else {
            m67468g1();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m67449D0(String str) {
        if (m67473z0(str)) {
            m67459T0();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m67450E0() {
        if (NullChecker.m82486a(this.f44192r)) {
            this.f44192r.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m67451G0(boolean z) {
        if (TextUtils.isEmpty(this.f44188n)) {
            return;
        }
        if (z) {
            this.f44193s = true;
            i4g0.m138523u("e_moment_voice", this.f44188n, ksg.m151208i(this.f44189o, jyb.m147494Y("owner_id", this.f44187m.owner), jyb.m147494Y("moment_id", this.f44187m.f56859id), jyb.m147494Y("resource", "")));
        } else if (this.f44193s) {
            DecimalFormat decimalFormat = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME);
            i4g0.m138523u("e_moment_voice_over", this.f44188n, ksg.m151208i(this.f44189o, new pf60("voice_duration", decimalFormat.format(this.f44183i)), new pf60("voice_play_duration", decimalFormat.format(this.f44184j)), jyb.m147494Y("owner_id", this.f44187m.owner), jyb.m147494Y("moment_id", this.f44187m.f56859id), jyb.m147494Y("resource", "")));
            this.f44193s = false;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m67452H0(Moment moment) {
        if (!NullChecker.m82486a(moment) || moment.media.size() <= 0) {
            return;
        }
        Media media = moment.media.get(0);
        if (media instanceof Audio) {
            Audio audio = (Audio) media;
            this.f44183i = audio.duration;
            this.f44185k = audio.url;
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m67453K0(String str, boolean z) {
        String strM151174K = ksg.m151174K(str, z);
        this.f44188n = strM151174K;
        if (TextUtils.isEmpty(strM151174K)) {
            this.f44188n = "p_user_moment_interactions_details_view";
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m67454L0() {
        this.f44192r = lpg.m155193v().m155241x().subscribe(getPlayingSubscriber());
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m67455P0(C4470c c4470c) {
        if (c4470c == C4470c.f16271m) {
            m67450E0();
            pb1.m171472b().mo171476e(f44177w);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m67456Q0(Map map) {
        if (NullChecker.m82486a(this.f44187m)) {
            Moment moment = (Moment) map.get(this.f44187m.f56859id);
            if (NullChecker.m82486a(moment)) {
                this.f44187m = moment;
            }
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m67457R0() {
        this.f44195u = true;
        pb1.m171472b().mo171473a(f44177w);
        if (m67469h1(this.f44185k)) {
            m67468g1();
            m67451G0(false);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final void m67458S0() {
        try {
            if (lpg.m155193v().m155224e0(this.f44185k)) {
                lpg.m155193v().m155229j0();
                return;
            }
            this.f44195u = false;
            m67451G0(true);
            lpg.m155193v().m155223d0(act()).m155222c0(this.f44187m).m155219Z(this.f44185k, getPlayListenerToAudioPlayer());
            FeedGlobalPlayerView.f44223C = this.f44189o;
            FeedGlobalPlayerView.f44224D = this.f44190p;
            FeedGlobalPlayerView.f44222B = this.f44188n;
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final void m67459T0() {
        m67433f1();
        m67471w0();
    }

    /* JADX INFO: renamed from: U0 */
    public final void m67460U0() {
        act().lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.spg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170051a.m67455P0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V0 */
    public final void m67461V0() {
        act().duringCreated(FeedModule.f39703d.f121363l0).subscribe(psd0.m173596G(new y20() { // from class: l.ppg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153532a.m67456Q0((Map) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X0 */
    public FeedAudioPlayerView m67462X0(float f, String str) {
        this.f44183i = f;
        this.f44185k = str;
        m67431N0();
        return this;
    }

    /* JADX INFO: renamed from: Y0 */
    public FeedAudioPlayerView m67463Y0(Moment moment) {
        return m67464Z0(moment, true);
    }

    /* JADX INFO: renamed from: Z0 */
    public FeedAudioPlayerView m67464Z0(Moment moment, boolean z) {
        m67452H0(moment);
        this.f44187m = moment;
        this.f44194t = z;
        m67431N0();
        return this;
    }

    /* JADX INFO: renamed from: a1 */
    public void m67465a1() {
        this.f44180f.setImageResource(lbc0.f130814C);
    }

    /* JADX INFO: renamed from: d1 */
    public void m67466d1() {
        this.f44180f.setImageResource(lbc0.f131000b1);
    }

    /* JADX INFO: renamed from: e1 */
    public void m67467e1(String str, boolean z) {
        this.f44189o = str;
        this.f44190p = z;
        m67453K0(str, z);
    }

    /* JADX INFO: renamed from: g1 */
    public final void m67468g1() {
        m67465a1();
    }

    /* JADX INFO: renamed from: h1 */
    public final boolean m67469h1(String str) {
        return lpg.m155193v().m155226g0(str);
    }

    /* JADX INFO: renamed from: v0 */
    public View m67470v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return upg.m197091b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m67471w0() {
        lpg.m155193v().m155231m(getPlayListenerToAudioPlayer());
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m67472y0() {
        if (!this.f44185k.contains("http") || Network.isConnected(FeedModule.f39700a)) {
            return false;
        }
        o1j0.m165640n(R$string.f39829U);
        return true;
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m67473z0(String str) {
        String str2 = this.f44185k;
        return str2 != null && str2.equals(str);
    }

    public FeedAudioPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44185k = "";
        this.f44194t = true;
        this.f44195u = false;
        this.f44196v = new C11544b();
        m67429I0(context);
    }

    public FeedAudioPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44185k = "";
        this.f44194t = true;
        this.f44195u = false;
        this.f44196v = new C11544b();
        m67429I0(context);
    }
}
