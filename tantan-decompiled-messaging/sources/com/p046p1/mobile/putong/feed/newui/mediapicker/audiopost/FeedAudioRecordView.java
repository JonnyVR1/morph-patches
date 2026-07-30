package com.p046p1.mobile.putong.feed.newui.mediapicker.audiopost;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.feed.newui.view.progressbar.FeedProgressBar;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import p147v.VImage;
import p147v.VText;
import p149l.cdh;
import p149l.eb1;
import p149l.gc1;
import p149l.hc1;
import p149l.j760;
import p149l.jsm;
import p149l.nog;
import p149l.qfp0;
import p149l.rn5;
import p149l.tic0;
import p149l.ukw;
import p149l.wc40;
import p149l.wng;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedAudioRecordView extends FrameLayout {

    /* JADX INFO: renamed from: y */
    public static final String f40559y = "FeedAudioRecordView";

    /* JADX INFO: renamed from: a */
    public View f40560a;

    /* JADX INFO: renamed from: b */
    public View f40561b;

    /* JADX INFO: renamed from: c */
    public View f40562c;

    /* JADX INFO: renamed from: d */
    public FeedProgressBar f40563d;

    /* JADX INFO: renamed from: e */
    public VImage f40564e;

    /* JADX INFO: renamed from: f */
    public VText f40565f;

    /* JADX INFO: renamed from: g */
    public VText f40566g;

    /* JADX INFO: renamed from: h */
    public VText f40567h;

    /* JADX INFO: renamed from: i */
    public VImage f40568i;

    /* JADX INFO: renamed from: j */
    public VImage f40569j;

    /* JADX INFO: renamed from: k */
    public Act f40570k;

    /* JADX INFO: renamed from: l */
    public AudioRecordState f40571l;

    /* JADX INFO: renamed from: m */
    public hc1 f40572m;

    /* JADX INFO: renamed from: n */
    public qfp0 f40573n;

    /* JADX INFO: renamed from: o */
    public tic0 f40574o;

    /* JADX INFO: renamed from: p */
    public rn5 f40575p;

    /* JADX INFO: renamed from: q */
    public ukw f40576q;

    /* JADX INFO: renamed from: r */
    public gc1 f40577r;

    /* JADX INFO: renamed from: s */
    public int f40578s;

    /* JADX INFO: renamed from: t */
    public boolean f40579t;

    /* JADX INFO: renamed from: u */
    public int f40580u;

    /* JADX INFO: renamed from: v */
    public int f40581v;

    /* JADX INFO: renamed from: w */
    public Runnable f40582w;

    /* JADX INFO: renamed from: x */
    public Handler f40583x;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView$a */
    public static /* synthetic */ class C11241a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f40584a;

        static {
            int[] iArr = new int[AudioRecordState.values().length];
            f40584a = iArr;
            try {
                iArr[AudioRecordState.INITIALIZING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40584a[AudioRecordState.WAITING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40584a[AudioRecordState.RECORDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40584a[AudioRecordState.COMPLETING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FeedAudioRecordView(@NonNull Context context) {
        super(context);
        this.f40580u = 0;
        this.f40581v = 0;
        m62613m(context);
    }

    private Audio getRecordedAudioData() {
        Audio audio = new Audio();
        File fileM194196m = this.f40576q.m194196m();
        File file = new File(this.f40576q.m194196m().getParentFile(), System.currentTimeMillis() + "_" + SystemClock.uptimeMillis() + ".mp3");
        fileM194196m.renameTo(file);
        audio.url = file.getAbsolutePath();
        audio.mediaType = "audio/mp3";
        audio.duration = (float) this.f40580u;
        audio.status = MediaLocalStatus.get("raw");
        return audio;
    }

    /* JADX INFO: renamed from: A */
    public final void m62600A() {
        m62612l();
    }

    /* JADX INFO: renamed from: B */
    public final void m62601B() {
        wng.m204695v().m204731j0();
        m62611k(AudioRecordState.WAITING);
        m62603D();
    }

    /* JADX INFO: renamed from: C */
    public boolean m62602C(float f) {
        return f >= 4.0f;
    }

    /* JADX INFO: renamed from: D */
    public void m62603D() {
        this.f40580u = 0;
        this.f40581v = 0;
        this.f40576q.m194193j();
    }

    /* JADX INFO: renamed from: E */
    public void m62604E() {
        if (this.f40579t) {
            this.f40583x.postDelayed(getRecordTimerRunnable(), 100L);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m62605F() {
        if (this.f40571l == AudioRecordState.RECORDING) {
            m62623w();
        }
    }

    /* JADX INFO: renamed from: G */
    public void m62606G() {
        this.f40576q.m194192D();
        m62625y();
    }

    /* JADX INFO: renamed from: H */
    public void m62607H() {
        this.f40579t = false;
        this.f40583x.removeCallbacks(getRecordTimerRunnable());
    }

    public AudioRecordState getCurrentRecordState() {
        return this.f40571l;
    }

    public hc1 getNowAudioRecordHandle() {
        int i = C11241a.f40584a[this.f40571l.ordinal()];
        if (i == 1) {
            return new jsm(this);
        }
        if (i == 2) {
            if (this.f40573n == null) {
                this.f40573n = new qfp0(this);
            }
            return this.f40573n;
        }
        if (i == 3) {
            if (this.f40574o == null) {
                this.f40574o = new tic0(this);
            }
            return this.f40574o;
        }
        if (i != 4) {
            return new qfp0(this);
        }
        if (this.f40575p == null) {
            this.f40575p = new rn5(this);
        }
        return this.f40575p;
    }

    public Runnable getRecordTimerRunnable() {
        if (this.f40582w == null) {
            this.f40582w = new Runnable() { // from class: l.gog
                @Override // java.lang.Runnable
                public final void run() {
                    this.f103675a.m62616p();
                }
            };
        }
        return this.f40582w;
    }

    /* JADX INFO: renamed from: h */
    public View m62608h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nog.m160411b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i */
    public void m62609i() {
        m62625y();
        m62603D();
    }

    /* JADX INFO: renamed from: j */
    public void m62610j() {
        if (this.f40571l == AudioRecordState.COMPLETING) {
            m62601B();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m62611k(AudioRecordState audioRecordState) {
        if (NullChecker.m81303a(this.f40572m)) {
            this.f40572m.mo130369c();
        }
        this.f40571l = audioRecordState;
        hc1 nowAudioRecordHandle = getNowAudioRecordHandle();
        this.f40572m = nowAudioRecordHandle;
        nowAudioRecordHandle.mo130370d(this.f40571l);
        this.f40572m.mo130367a();
        if (NullChecker.m81303a(this.f40577r)) {
            this.f40577r.mo62952b(audioRecordState);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m62612l() {
        float fM194202s = this.f40576q.m194202s() / 1000.0f;
        if (!m62602C(fM194202s)) {
            m62601B();
            return;
        }
        int iRound = Math.round(fM194202s);
        this.f40580u = iRound;
        this.f40566g.setText(String.valueOf(iRound));
    }

    /* JADX INFO: renamed from: m */
    public final void m62613m(Context context) {
        this.f40570k = (Act) context;
        addView(m62608h(LayoutInflater.from(context), this));
        m62614n();
        m62615o();
        m62611k(AudioRecordState.INITIALIZING);
        m62611k(AudioRecordState.WAITING);
        this.f40583x = new Handler();
    }

    /* JADX INFO: renamed from: n */
    public final void m62614n() {
        this.f40560a.setOnClickListener(new View.OnClickListener() { // from class: l.hog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108823a.m62617q(view);
            }
        });
        this.f40568i.setOnClickListener(new View.OnClickListener() { // from class: l.iog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114158a.m62618r(view);
            }
        });
        this.f40569j.setOnClickListener(new View.OnClickListener() { // from class: l.jog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118973a.m62619s(view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m62615o() {
        ukw ukwVar = new ukw();
        this.f40576q = ukwVar;
        ukwVar.m194208y(wc40.m202628e());
        this.f40576q.m194189A(new ukw.InterfaceC20451d() { // from class: l.kog
            @Override // p149l.ukw.InterfaceC20451d
            public final void onStart() {
                this.f123999a.m62626z();
            }
        });
        this.f40576q.m194190B(new ukw.InterfaceC20452e() { // from class: l.log
            @Override // p149l.ukw.InterfaceC20452e
            /* JADX INFO: renamed from: a */
            public final void mo99331a(String str) {
                this.f129104a.m62620t(str);
            }
        });
        this.f40576q.m194209z(new ukw.InterfaceC20450c() { // from class: l.mog
            @Override // p149l.ukw.InterfaceC20450c
            public final void onError(int i, int i2) {
                this.f134891a.m62621u(i, i2);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m62616p() {
        if (this.f40579t) {
            int iRound = this.f40581v > 500 ? Math.round(cdh.m106230c(this.f40570k, this.f40576q.m194196m().getAbsolutePath()) / 1000.0f) : -1;
            this.f40581v += 100;
            if (m62622v(iRound)) {
                this.f40580u = Math.round(this.f40581v / 1000.0f);
            } else {
                this.f40580u = iRound;
            }
            if (this.f40580u >= 60) {
                m62623w();
            } else {
                m62604E();
            }
            this.f40566g.setText(String.valueOf(this.f40580u));
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m62617q(View view) {
        m62623w();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m62618r(View view) {
        zvf0.m220399u("e_recording_over_button", "p_moment_post", new j760("button_operation", RequestParameters.SUBRESOURCE_DELETE));
        m62601B();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m62619s(View view) {
        m62624x();
    }

    public void setAudioRecordStateChangeListener(gc1 gc1Var) {
        this.f40577r = gc1Var;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m62620t(String str) {
        m62600A();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m62621u(int i, int i2) {
        m62603D();
        m62625y();
        m62611k(AudioRecordState.WAITING);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m62622v(int i) {
        return i <= 0;
    }

    /* JADX INFO: renamed from: w */
    public void m62623w() {
        this.f40572m.mo130368b();
    }

    /* JADX INFO: renamed from: x */
    public final void m62624x() {
        zvf0.m220399u("e_recording_over_button", "p_moment_post", new j760("button_operation", "finish"));
        Audio recordedAudioData = getRecordedAudioData();
        if (NullChecker.m81303a(this.f40577r)) {
            this.f40577r.mo62951a(recordedAudioData);
        }
        this.f40580u = 0;
        this.f40581v = 0;
        wng.m204695v().m204731j0();
        m62611k(AudioRecordState.WAITING);
    }

    /* JADX INFO: renamed from: y */
    public void m62625y() {
        m62607H();
        eb1.m115446a(null);
    }

    /* JADX INFO: renamed from: z */
    public final void m62626z() {
    }

    public FeedAudioRecordView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40580u = 0;
        this.f40581v = 0;
        m62613m(context);
    }

    public FeedAudioRecordView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40580u = 0;
        this.f40581v = 0;
        m62613m(context);
    }
}
