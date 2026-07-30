package com.p046p1.mobile.putong.feed.newui.view;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.p047rx.C4342a;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Map;
import p147v.VFrame;
import p147v.VImage;
import p149l.c4g0;
import p149l.e30;
import p149l.e51;
import p149l.f3c0;
import p149l.fog;
import p149l.ib1;
import p149l.j760;
import p149l.lsi0;
import p149l.mkd0;
import p149l.osi0;
import p149l.t100;
import p149l.vqg;
import p149l.vwb;
import p149l.wng;
import p149l.yng;
import p149l.z91;
import p149l.zng;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedAudioPlayerView extends ConstraintLayout {

    /* JADX INFO: renamed from: w */
    public static final String f43329w = "FeedAudioPlayerView";

    /* JADX INFO: renamed from: d */
    public VFrame f43330d;

    /* JADX INFO: renamed from: e */
    public ProgressBar f43331e;

    /* JADX INFO: renamed from: f */
    public VImage f43332f;

    /* JADX INFO: renamed from: g */
    public TextView f43333g;

    /* JADX INFO: renamed from: h */
    public VImage f43334h;

    /* JADX INFO: renamed from: i */
    public float f43335i;

    /* JADX INFO: renamed from: j */
    public float f43336j;

    /* JADX INFO: renamed from: k */
    public String f43337k;

    /* JADX INFO: renamed from: l */
    public yng f43338l;

    /* JADX INFO: renamed from: m */
    public Moment f43339m;

    /* JADX INFO: renamed from: n */
    public String f43340n;

    /* JADX INFO: renamed from: o */
    public String f43341o;

    /* JADX INFO: renamed from: p */
    public boolean f43342p;

    /* JADX INFO: renamed from: q */
    public C4342a<String> f43343q;

    /* JADX INFO: renamed from: r */
    public c4g0 f43344r;

    /* JADX INFO: renamed from: s */
    public boolean f43345s;

    /* JADX INFO: renamed from: t */
    public boolean f43346t;

    /* JADX INFO: renamed from: u */
    public boolean f43347u;

    /* JADX INFO: renamed from: v */
    public final z91 f43348v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.FeedAudioPlayerView$a */
    public class C11380a extends zng {
        public C11380a() {
        }

        @Override // p149l.zng, p149l.yng
        /* JADX INFO: renamed from: a */
        public void mo66291a(Exception exc) {
            super.mo66291a(exc);
            FeedAudioPlayerView.this.m66274R0();
            FeedAudioPlayerView.this.m66282a1();
        }

        @Override // p149l.zng, p149l.yng
        /* JADX INFO: renamed from: i */
        public void mo66292i(boolean z) {
            super.mo66292i(z);
            FeedModule.m60223M().mo67253Zo().mo111895f(false);
            FeedAudioPlayerView.this.m66274R0();
            FeedAudioPlayerView.this.m66282a1();
        }

        @Override // p149l.zng, p149l.yng
        /* JADX INFO: renamed from: j */
        public void mo66293j(float f) {
            super.mo66293j(f);
            FeedAudioPlayerView.this.f43336j = f / 1000.0f;
        }

        @Override // p149l.zng, p149l.yng
        public void onComplete() {
            super.onComplete();
            FeedModule.m60223M().mo67253Zo().mo111895f(false);
            FeedAudioPlayerView feedAudioPlayerView = FeedAudioPlayerView.this;
            feedAudioPlayerView.f43336j = feedAudioPlayerView.f43335i;
            FeedAudioPlayerView.this.m66274R0();
            FeedAudioPlayerView.this.m66282a1();
        }

        @Override // p149l.zng, p149l.yng
        public void onPause() {
            super.onPause();
            FeedAudioPlayerView.this.m66285g1();
            FeedAudioPlayerView.this.m66282a1();
        }

        @Override // p149l.zng, p149l.yng
        public void onStart() {
            FeedAudioPlayerView feedAudioPlayerView = FeedAudioPlayerView.this;
            if (feedAudioPlayerView.m66286h1(feedAudioPlayerView.f43337k)) {
                super.onStart();
                FeedModule.m60223M().mo67253Zo().mo111895f(true);
                FeedAudioPlayerView.this.m66250f1();
                FeedAudioPlayerView.this.m66283d1();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.FeedAudioPlayerView$b */
    public class C11381b implements z91 {
        public C11381b() {
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: b */
        public void mo39105b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            e51.m114743H(FeedAudioPlayerView.this.act(), new Runnable() { // from class: l.eog
                @Override // java.lang.Runnable
                public final void run() {
                    this.f92441a.m66295f();
                }
            }, 300L);
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: d */
        public void mo39106d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                osi0.m165783g(audioBusinessType2.getBusinessMsg());
            } else {
                ib1.m135233b().mo135239g(str, audioBusinessType, z91Var);
                FeedAudioPlayerView.this.m66275S0();
            }
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m66295f() {
            if (!wng.m204695v().m204726e0(FeedAudioPlayerView.this.f43337k) || FeedAudioPlayerView.this.f43347u) {
                return;
            }
            wng.m204695v().m204731j0();
        }

        @Override // p149l.z91
        public void success() {
            FeedAudioPlayerView.this.m66275S0();
        }
    }

    public FeedAudioPlayerView(Context context) {
        super(context);
        this.f43337k = "";
        this.f43346t = true;
        this.f43347u = false;
        this.f43348v = new C11381b();
        m66246I0(context);
    }

    /* JADX INFO: renamed from: I0 */
    private void m66246I0(Context context) {
        addView(m66287v0(LayoutInflater.from(context), this));
        m66247J0();
        m66271L0();
        m66277U0();
        m66278V0();
        setMaxWidth(t100.m186890d(295.0f));
        setMinWidth(t100.m186890d(219.0f));
        m66282a1();
    }

    /* JADX INFO: renamed from: J0 */
    private void m66247J0() {
        setOnClickListener(new View.OnClickListener() { // from class: l.bog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76513a.m66249O0(view);
            }
        });
    }

    /* JADX INFO: renamed from: N0 */
    private void m66248N0() {
        m66265B0(this.f43337k);
        this.f43333g.setText(String.format("%ss", String.format(getResources().getString(R$string.f39088k0), Integer.valueOf(Math.round(this.f43335i)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public /* synthetic */ void m66249O0(View view) {
        if (m66289y0() || !this.f43346t) {
            return;
        }
        if (wng.m204695v().m204726e0(this.f43337k)) {
            wng.m204695v().m204731j0();
        } else {
            ib1.m135233b().mo135238f(f43329w, AudioBusinessType.NORMAL, this.f43348v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public void m66250f1() {
        m66283d1();
    }

    private yng getPlayListenerToAudioPlayer() {
        if (this.f43338l == null) {
            this.f43338l = new C11380a();
        }
        return this.f43338l;
    }

    private C4342a<String> getPlayingSubscriber() {
        if (this.f43343q == null) {
            this.f43343q = mkd0.m154955G(new e30() { // from class: l.cog
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f81837a.m66266D0((String) obj);
                }
            });
        }
        return this.f43343q;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m66265B0(String str) {
        if (m66286h1(str)) {
            m66276T0();
        } else {
            m66285g1();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m66266D0(String str) {
        if (m66290z0(str)) {
            m66276T0();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m66267E0() {
        if (NullChecker.m81303a(this.f43344r)) {
            this.f43344r.unsubscribe();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m66268G0(boolean z) {
        if (TextUtils.isEmpty(this.f43340n)) {
            return;
        }
        if (z) {
            this.f43345s = true;
            zvf0.m220399u("e_moment_voice", this.f43340n, vqg.m199549i(this.f43341o, vwb.m200311Y("owner_id", this.f43339m.owner), vwb.m200311Y("moment_id", this.f43339m.f56011id), vwb.m200311Y("resource", "")));
        } else if (this.f43345s) {
            DecimalFormat decimalFormat = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME);
            zvf0.m220399u("e_moment_voice_over", this.f43340n, vqg.m199549i(this.f43341o, new j760("voice_duration", decimalFormat.format(this.f43335i)), new j760("voice_play_duration", decimalFormat.format(this.f43336j)), vwb.m200311Y("owner_id", this.f43339m.owner), vwb.m200311Y("moment_id", this.f43339m.f56011id), vwb.m200311Y("resource", "")));
            this.f43345s = false;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m66269H0(Moment moment) {
        if (!NullChecker.m81303a(moment) || moment.media.size() <= 0) {
            return;
        }
        Media media = moment.media.get(0);
        if (media instanceof Audio) {
            Audio audio = (Audio) media;
            this.f43335i = audio.duration;
            this.f43337k = audio.url;
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m66270K0(String str, boolean z) {
        String strM199515K = vqg.m199515K(str, z);
        this.f43340n = strM199515K;
        if (TextUtils.isEmpty(strM199515K)) {
            this.f43340n = "p_user_moment_interactions_details_view";
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m66271L0() {
        this.f43344r = wng.m204695v().m204743x().subscribe(getPlayingSubscriber());
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m66272P0(C4319c c4319c) {
        if (c4319c == C4319c.f15552m) {
            m66267E0();
            ib1.m135233b().mo135237e(f43329w);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m66273Q0(Map map) {
        if (NullChecker.m81303a(this.f43339m)) {
            Moment moment = (Moment) map.get(this.f43339m.f56011id);
            if (NullChecker.m81303a(moment)) {
                this.f43339m = moment;
            }
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m66274R0() {
        this.f43347u = true;
        ib1.m135233b().mo135234a(f43329w);
        if (m66286h1(this.f43337k)) {
            m66285g1();
            m66268G0(false);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final void m66275S0() {
        try {
            if (wng.m204695v().m204726e0(this.f43337k)) {
                wng.m204695v().m204731j0();
                return;
            }
            this.f43347u = false;
            m66268G0(true);
            wng.m204695v().m204725d0(act()).m204724c0(this.f43339m).m204721Z(this.f43337k, getPlayListenerToAudioPlayer());
            FeedGlobalPlayerView.f43375C = this.f43341o;
            FeedGlobalPlayerView.f43376D = this.f43342p;
            FeedGlobalPlayerView.f43374B = this.f43340n;
        } catch (IOException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final void m66276T0() {
        m66250f1();
        m66288w0();
    }

    /* JADX INFO: renamed from: U0 */
    public final void m66277U0() {
        act().lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.dog
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87167a.m66272P0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V0 */
    public final void m66278V0() {
        act().duringCreated(FeedModule.f38855d.f193053l0).subscribe(mkd0.m154955G(new e30() { // from class: l.aog
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70860a.m66273Q0((Map) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X0 */
    public FeedAudioPlayerView m66279X0(float f, String str) {
        this.f43335i = f;
        this.f43337k = str;
        m66248N0();
        return this;
    }

    /* JADX INFO: renamed from: Y0 */
    public FeedAudioPlayerView m66280Y0(Moment moment) {
        return m66281Z0(moment, true);
    }

    /* JADX INFO: renamed from: Z0 */
    public FeedAudioPlayerView m66281Z0(Moment moment, boolean z) {
        m66269H0(moment);
        this.f43339m = moment;
        this.f43346t = z;
        m66248N0();
        return this;
    }

    /* JADX INFO: renamed from: a1 */
    public void m66282a1() {
        this.f43332f.setImageResource(f3c0.f94296C);
    }

    /* JADX INFO: renamed from: d1 */
    public void m66283d1() {
        this.f43332f.setImageResource(f3c0.f94482b1);
    }

    /* JADX INFO: renamed from: e1 */
    public void m66284e1(String str, boolean z) {
        this.f43341o = str;
        this.f43342p = z;
        m66270K0(str, z);
    }

    /* JADX INFO: renamed from: g1 */
    public final void m66285g1() {
        m66282a1();
    }

    /* JADX INFO: renamed from: h1 */
    public final boolean m66286h1(String str) {
        return wng.m204695v().m204728g0(str);
    }

    /* JADX INFO: renamed from: v0 */
    public View m66287v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fog.m122452b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m66288w0() {
        wng.m204695v().m204733m(getPlayListenerToAudioPlayer());
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m66289y0() {
        if (!this.f43337k.contains("http") || Network.isConnected(FeedModule.f38852a)) {
            return false;
        }
        lsi0.m151584n(R$string.f38981U);
        return true;
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m66290z0(String str) {
        String str2 = this.f43337k;
        return str2 != null && str2.equals(str);
    }

    public FeedAudioPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43337k = "";
        this.f43346t = true;
        this.f43347u = false;
        this.f43348v = new C11381b();
        m66246I0(context);
    }

    public FeedAudioPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43337k = "";
        this.f43346t = true;
        this.f43347u = false;
        this.f43348v = new C11381b();
        m66246I0(context);
    }
}
