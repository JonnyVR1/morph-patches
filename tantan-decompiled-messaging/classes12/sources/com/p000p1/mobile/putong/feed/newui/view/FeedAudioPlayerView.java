package com.p000p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.data.Audio;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.android.rx.a;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Map;
import l.c4g0;
import l.e30;
import l.e51;
import l.ib1;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.osi0;
import l.t100;
import l.vwb;
import l.z91;
import l.zvf0;
import p007l.f3c0;
import p007l.fog;
import p007l.vqg;
import p007l.wng;
import p007l.yng;
import p007l.zng;
import v.VFrame;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedAudioPlayerView extends ConstraintLayout {

    /* JADX INFO: renamed from: w */
    public static final String f4790w = "FeedAudioPlayerView";

    /* JADX INFO: renamed from: d */
    public VFrame f4791d;

    /* JADX INFO: renamed from: e */
    public ProgressBar f4792e;

    /* JADX INFO: renamed from: f */
    public VImage f4793f;

    /* JADX INFO: renamed from: g */
    public TextView f4794g;

    /* JADX INFO: renamed from: h */
    public VImage f4795h;

    /* JADX INFO: renamed from: i */
    public float f4796i;

    /* JADX INFO: renamed from: j */
    public float f4797j;

    /* JADX INFO: renamed from: k */
    public String f4798k;

    /* JADX INFO: renamed from: l */
    public yng f4799l;

    /* JADX INFO: renamed from: m */
    public Moment f4800m;

    /* JADX INFO: renamed from: n */
    public String f4801n;

    /* JADX INFO: renamed from: o */
    public String f4802o;

    /* JADX INFO: renamed from: p */
    public boolean f4803p;

    /* JADX INFO: renamed from: q */
    public a<String> f4804q;

    /* JADX INFO: renamed from: r */
    public c4g0 f4805r;

    /* JADX INFO: renamed from: s */
    public boolean f4806s;

    /* JADX INFO: renamed from: t */
    public boolean f4807t;

    /* JADX INFO: renamed from: u */
    public boolean f4808u;

    /* JADX INFO: renamed from: v */
    public final z91 f4809v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.FeedAudioPlayerView$a */
    public class C2224a extends zng {
        public C2224a() {
        }

        @Override // p007l.zng, p007l.yng
        /* JADX INFO: renamed from: a */
        public void mo7451a(Exception exc) {
            super.mo7451a(exc);
            FeedAudioPlayerView.this.m7434R0();
            FeedAudioPlayerView.this.m7442a1();
        }

        @Override // p007l.zng, p007l.yng
        /* JADX INFO: renamed from: i */
        public void mo7452i(boolean z) {
            super.mo7452i(z);
            FeedModule.m1141M().Zo().f(false);
            FeedAudioPlayerView.this.m7434R0();
            FeedAudioPlayerView.this.m7442a1();
        }

        @Override // p007l.zng, p007l.yng
        /* JADX INFO: renamed from: j */
        public void mo7453j(float f) {
            super.mo7453j(f);
            FeedAudioPlayerView.this.f4797j = f / 1000.0f;
        }

        @Override // p007l.zng, p007l.yng
        public void onComplete() {
            super.onComplete();
            FeedModule.m1141M().Zo().f(false);
            FeedAudioPlayerView feedAudioPlayerView = FeedAudioPlayerView.this;
            feedAudioPlayerView.f4797j = feedAudioPlayerView.f4796i;
            FeedAudioPlayerView.this.m7434R0();
            FeedAudioPlayerView.this.m7442a1();
        }

        @Override // p007l.zng, p007l.yng
        public void onPause() {
            super.onPause();
            FeedAudioPlayerView.this.m7445g1();
            FeedAudioPlayerView.this.m7442a1();
        }

        @Override // p007l.zng, p007l.yng
        public void onStart() {
            FeedAudioPlayerView feedAudioPlayerView = FeedAudioPlayerView.this;
            if (feedAudioPlayerView.m7446h1(feedAudioPlayerView.f4798k)) {
                super.onStart();
                FeedModule.m1141M().Zo().f(true);
                FeedAudioPlayerView.this.m7410f1();
                FeedAudioPlayerView.this.m7443d1();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.FeedAudioPlayerView$b */
    public class C2225b implements z91 {
        public C2225b() {
        }

        /* JADX INFO: renamed from: b */
        public void m7455b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            e51.H(FeedAudioPlayerView.this.act(), new Runnable() { // from class: l.eog
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7447a.m7457f();
                }
            }, 300L);
        }

        /* JADX INFO: renamed from: d */
        public void m7456d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                osi0.g(audioBusinessType2.getBusinessMsg());
            } else {
                ib1.b().g(str, audioBusinessType, z91Var);
                FeedAudioPlayerView.this.m7435S0();
            }
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m7457f() {
            if (!wng.m15855v().m15886e0(FeedAudioPlayerView.this.f4798k) || FeedAudioPlayerView.this.f4808u) {
                return;
            }
            wng.m15855v().m15891j0();
        }

        public void success() {
            FeedAudioPlayerView.this.m7435S0();
        }
    }

    public FeedAudioPlayerView(Context context) {
        super(context);
        this.f4798k = "";
        this.f4807t = true;
        this.f4808u = false;
        this.f4809v = new C2225b();
        m7406I0(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I0 */
    private void m7406I0(Context context) {
        addView(m7447v0(LayoutInflater.from(context), this));
        m7407J0();
        m7431L0();
        m7437U0();
        m7438V0();
        setMaxWidth(t100.d(295.0f));
        setMinWidth(t100.d(219.0f));
        m7442a1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J0 */
    private void m7407J0() {
        setOnClickListener(new View.OnClickListener() { // from class: l.bog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6397a.m7409O0(view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N0 */
    private void m7408N0() {
        m7425B0(this.f4798k);
        this.f4794g.setText(String.format("%ss", String.format(getResources().getString(R$string.f549k0), Integer.valueOf(Math.round(this.f4796i)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public /* synthetic */ void m7409O0(View view) {
        if (m7449y0() || !this.f4807t) {
            return;
        }
        if (wng.m15855v().m15886e0(this.f4798k)) {
            wng.m15855v().m15891j0();
        } else {
            ib1.b().f(f4790w, AudioBusinessType.NORMAL, this.f4809v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public Act act() {
        return getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public void m7410f1() {
        m7443d1();
    }

    private yng getPlayListenerToAudioPlayer() {
        if (this.f4799l == null) {
            this.f4799l = new C2224a();
        }
        return this.f4799l;
    }

    private a<String> getPlayingSubscriber() {
        if (this.f4804q == null) {
            this.f4804q = mkd0.G(new e30() { // from class: l.cog
                public final void call(Object obj) {
                    this.f6699a.m7426D0((String) obj);
                }
            });
        }
        return this.f4804q;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m7425B0(String str) {
        if (m7446h1(str)) {
            m7436T0();
        } else {
            m7445g1();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m7426D0(String str) {
        if (m7450z0(str)) {
            m7436T0();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m7427E0() {
        if (NullChecker.a(this.f4805r)) {
            this.f4805r.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m7428G0(boolean z) {
        if (TextUtils.isEmpty(this.f4801n)) {
            return;
        }
        if (z) {
            this.f4806s = true;
            zvf0.u("e_moment_voice", this.f4801n, vqg.m15519i(this.f4802o, vwb.Y("owner_id", this.f4800m.owner), vwb.Y("moment_id", ((DbObject) this.f4800m).id), vwb.Y("resource", "")));
        } else if (this.f4806s) {
            DecimalFormat decimalFormat = new DecimalFormat("0.0");
            zvf0.u("e_moment_voice_over", this.f4801n, vqg.m15519i(this.f4802o, new j760("voice_duration", decimalFormat.format(this.f4796i)), new j760("voice_play_duration", decimalFormat.format(this.f4797j)), vwb.Y("owner_id", this.f4800m.owner), vwb.Y("moment_id", ((DbObject) this.f4800m).id), vwb.Y("resource", "")));
            this.f4806s = false;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m7429H0(Moment moment) {
        if (!NullChecker.a(moment) || moment.media.size() <= 0) {
            return;
        }
        Media media = moment.media.get(0);
        if (media instanceof Audio) {
            Audio audio = (Audio) media;
            this.f4796i = audio.duration;
            this.f4798k = audio.url;
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m7430K0(String str, boolean z) {
        String strM15485K = vqg.m15485K(str, z);
        this.f4801n = strM15485K;
        if (TextUtils.isEmpty(strM15485K)) {
            this.f4801n = "p_user_moment_interactions_details_view";
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m7431L0() {
        this.f4805r = wng.m15855v().m15903x().subscribe(getPlayingSubscriber());
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m7432P0(c cVar) {
        if (cVar == c.m) {
            m7427E0();
            ib1.b().e(f4790w);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m7433Q0(Map map) {
        if (NullChecker.a(this.f4800m)) {
            Moment moment = (Moment) map.get(((DbObject) this.f4800m).id);
            if (NullChecker.a(moment)) {
                this.f4800m = moment;
            }
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m7434R0() {
        this.f4808u = true;
        ib1.b().a(f4790w);
        if (m7446h1(this.f4798k)) {
            m7445g1();
            m7428G0(false);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final void m7435S0() {
        try {
            if (wng.m15855v().m15886e0(this.f4798k)) {
                wng.m15855v().m15891j0();
                return;
            }
            this.f4808u = false;
            m7428G0(true);
            wng.m15855v().m15885d0(act()).m15884c0(this.f4800m).m15881Z(this.f4798k, getPlayListenerToAudioPlayer());
            FeedGlobalPlayerView.f4836C = this.f4802o;
            FeedGlobalPlayerView.f4837D = this.f4803p;
            FeedGlobalPlayerView.f4835B = this.f4801n;
        } catch (IOException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final void m7436T0() {
        m7410f1();
        m7448w0();
    }

    /* JADX INFO: renamed from: U0 */
    public final void m7437U0() {
        act().lifecycle().subscribe(mkd0.G(new e30() { // from class: l.dog
            public final void call(Object obj) {
                this.f7019a.m7432P0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V0 */
    public final void m7438V0() {
        act().duringCreated(FeedModule.f316d.f14988l0).subscribe(mkd0.G(new e30() { // from class: l.aog
            public final void call(Object obj) {
                this.f5794a.m7433Q0((Map) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X0 */
    public FeedAudioPlayerView m7439X0(float f, String str) {
        this.f4796i = f;
        this.f4798k = str;
        m7408N0();
        return this;
    }

    /* JADX INFO: renamed from: Y0 */
    public FeedAudioPlayerView m7440Y0(Moment moment) {
        return m7441Z0(moment, true);
    }

    /* JADX INFO: renamed from: Z0 */
    public FeedAudioPlayerView m7441Z0(Moment moment, boolean z) {
        m7429H0(moment);
        this.f4800m = moment;
        this.f4807t = z;
        m7408N0();
        return this;
    }

    /* JADX INFO: renamed from: a1 */
    public void m7442a1() {
        this.f4793f.setImageResource(f3c0.f7579C);
    }

    /* JADX INFO: renamed from: d1 */
    public void m7443d1() {
        this.f4793f.setImageResource(f3c0.f7765b1);
    }

    /* JADX INFO: renamed from: e1 */
    public void m7444e1(String str, boolean z) {
        this.f4802o = str;
        this.f4803p = z;
        m7430K0(str, z);
    }

    /* JADX INFO: renamed from: g1 */
    public final void m7445g1() {
        m7442a1();
    }

    /* JADX INFO: renamed from: h1 */
    public final boolean m7446h1(String str) {
        return wng.m15855v().m15888g0(str);
    }

    /* JADX INFO: renamed from: v0 */
    public View m7447v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fog.m10256b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m7448w0() {
        wng.m15855v().m15893m(getPlayListenerToAudioPlayer());
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m7449y0() {
        if (!this.f4798k.contains("http") || Network.isConnected(FeedModule.f313a)) {
            return false;
        }
        lsi0.n(R$string.f442U);
        return true;
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m7450z0(String str) {
        String str2 = this.f4798k;
        return str2 != null && str2.equals(str);
    }

    public FeedAudioPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4798k = "";
        this.f4807t = true;
        this.f4808u = false;
        this.f4809v = new C2225b();
        m7406I0(context);
    }

    public FeedAudioPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4798k = "";
        this.f4807t = true;
        this.f4808u = false;
        this.f4809v = new C2225b();
        m7406I0(context);
    }
}
