package com.p000p1.mobile.putong.feed.newui.mediapicker.audiopost;

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
import com.p000p1.mobile.putong.data.Audio;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.feed.newui.view.progressbar.FeedProgressBar;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import l.j760;
import l.ukw;
import l.wc40;
import l.zvf0;
import p007l.cdh;
import p007l.eb1;
import p007l.gc1;
import p007l.hc1;
import p007l.jsm;
import p007l.nog;
import p007l.qfp0;
import p007l.rn5;
import p007l.tic0;
import p007l.wng;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedAudioRecordView extends FrameLayout {

    /* JADX INFO: renamed from: y */
    public static final String f2020y = "FeedAudioRecordView";

    /* JADX INFO: renamed from: a */
    public View f2021a;

    /* JADX INFO: renamed from: b */
    public View f2022b;

    /* JADX INFO: renamed from: c */
    public View f2023c;

    /* JADX INFO: renamed from: d */
    public FeedProgressBar f2024d;

    /* JADX INFO: renamed from: e */
    public VImage f2025e;

    /* JADX INFO: renamed from: f */
    public VText f2026f;

    /* JADX INFO: renamed from: g */
    public VText f2027g;

    /* JADX INFO: renamed from: h */
    public VText f2028h;

    /* JADX INFO: renamed from: i */
    public VImage f2029i;

    /* JADX INFO: renamed from: j */
    public VImage f2030j;

    /* JADX INFO: renamed from: k */
    public Act f2031k;

    /* JADX INFO: renamed from: l */
    public AudioRecordState f2032l;

    /* JADX INFO: renamed from: m */
    public hc1 f2033m;

    /* JADX INFO: renamed from: n */
    public qfp0 f2034n;

    /* JADX INFO: renamed from: o */
    public tic0 f2035o;

    /* JADX INFO: renamed from: p */
    public rn5 f2036p;

    /* JADX INFO: renamed from: q */
    public ukw f2037q;

    /* JADX INFO: renamed from: r */
    public gc1 f2038r;

    /* JADX INFO: renamed from: s */
    public int f2039s;

    /* JADX INFO: renamed from: t */
    public boolean f2040t;

    /* JADX INFO: renamed from: u */
    public int f2041u;

    /* JADX INFO: renamed from: v */
    public int f2042v;

    /* JADX INFO: renamed from: w */
    public Runnable f2043w;

    /* JADX INFO: renamed from: x */
    public Handler f2044x;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView$a */
    public static /* synthetic */ class C2085a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2045a;

        static {
            int[] iArr = new int[AudioRecordState.values().length];
            f2045a = iArr;
            try {
                iArr[AudioRecordState.INITIALIZING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2045a[AudioRecordState.WAITING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2045a[AudioRecordState.RECORDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2045a[AudioRecordState.COMPLETING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FeedAudioRecordView(@NonNull Context context) {
        super(context);
        this.f2041u = 0;
        this.f2042v = 0;
        m3618m(context);
    }

    private Audio getRecordedAudioData() {
        Audio audio = new Audio();
        File fileM = this.f2037q.m();
        File file = new File(this.f2037q.m().getParentFile(), System.currentTimeMillis() + "_" + SystemClock.uptimeMillis() + ".mp3");
        fileM.renameTo(file);
        audio.url = file.getAbsolutePath();
        audio.mediaType = "audio/mp3";
        audio.duration = (float) this.f2041u;
        audio.status = MediaLocalStatus.get(MediaLocalStatus.raw);
        return audio;
    }

    /* JADX INFO: renamed from: A */
    public final void m3605A() {
        m3617l();
    }

    /* JADX INFO: renamed from: B */
    public final void m3606B() {
        wng.m15855v().m15891j0();
        m3616k(AudioRecordState.WAITING);
        m3608D();
    }

    /* JADX INFO: renamed from: C */
    public boolean m3607C(float f) {
        return f >= 4.0f;
    }

    /* JADX INFO: renamed from: D */
    public void m3608D() {
        this.f2041u = 0;
        this.f2042v = 0;
        this.f2037q.j();
    }

    /* JADX INFO: renamed from: E */
    public void m3609E() {
        if (this.f2040t) {
            this.f2044x.postDelayed(getRecordTimerRunnable(), 100L);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m3610F() {
        if (this.f2032l == AudioRecordState.RECORDING) {
            m3628w();
        }
    }

    /* JADX INFO: renamed from: G */
    public void m3611G() {
        this.f2037q.D();
        m3630y();
    }

    /* JADX INFO: renamed from: H */
    public void m3612H() {
        this.f2040t = false;
        this.f2044x.removeCallbacks(getRecordTimerRunnable());
    }

    public AudioRecordState getCurrentRecordState() {
        return this.f2032l;
    }

    public hc1 getNowAudioRecordHandle() {
        int i = C2085a.f2045a[this.f2032l.ordinal()];
        if (i == 1) {
            return new jsm(this);
        }
        if (i == 2) {
            if (this.f2034n == null) {
                this.f2034n = new qfp0(this);
            }
            return this.f2034n;
        }
        if (i == 3) {
            if (this.f2035o == null) {
                this.f2035o = new tic0(this);
            }
            return this.f2035o;
        }
        if (i != 4) {
            return new qfp0(this);
        }
        if (this.f2036p == null) {
            this.f2036p = new rn5(this);
        }
        return this.f2036p;
    }

    public Runnable getRecordTimerRunnable() {
        if (this.f2043w == null) {
            this.f2043w = new Runnable() { // from class: l.gog
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8494a.m3621p();
                }
            };
        }
        return this.f2043w;
    }

    /* JADX INFO: renamed from: h */
    public View m3613h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nog.m12299b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i */
    public void m3614i() {
        m3630y();
        m3608D();
    }

    /* JADX INFO: renamed from: j */
    public void m3615j() {
        if (this.f2032l == AudioRecordState.COMPLETING) {
            m3606B();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m3616k(AudioRecordState audioRecordState) {
        if (NullChecker.a(this.f2033m)) {
            this.f2033m.mo10596c();
        }
        this.f2032l = audioRecordState;
        hc1 nowAudioRecordHandle = getNowAudioRecordHandle();
        this.f2033m = nowAudioRecordHandle;
        nowAudioRecordHandle.mo10597d(this.f2032l);
        this.f2033m.mo10594a();
        if (NullChecker.a(this.f2038r)) {
            this.f2038r.mo3965b(audioRecordState);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3617l() {
        float fS = this.f2037q.s() / 1000.0f;
        if (!m3607C(fS)) {
            m3606B();
            return;
        }
        int iRound = Math.round(fS);
        this.f2041u = iRound;
        this.f2027g.setText(String.valueOf(iRound));
    }

    /* JADX INFO: renamed from: m */
    public final void m3618m(Context context) {
        this.f2031k = (Act) context;
        addView(m3613h(LayoutInflater.from(context), this));
        m3619n();
        m3620o();
        m3616k(AudioRecordState.INITIALIZING);
        m3616k(AudioRecordState.WAITING);
        this.f2044x = new Handler();
    }

    /* JADX INFO: renamed from: n */
    public final void m3619n() {
        this.f2021a.setOnClickListener(new View.OnClickListener() { // from class: l.hog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8783a.m3622q(view);
            }
        });
        this.f2029i.setOnClickListener(new View.OnClickListener() { // from class: l.iog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9111a.m3623r(view);
            }
        });
        this.f2030j.setOnClickListener(new View.OnClickListener() { // from class: l.jog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9462a.m3624s(view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m3620o() {
        ukw ukwVar = new ukw();
        this.f2037q = ukwVar;
        ukwVar.y(wc40.e());
        this.f2037q.A(new ukw.d() { // from class: l.kog
            public final void onStart() {
                this.f9758a.m3631z();
            }
        });
        this.f2037q.B(new ukw.e() { // from class: l.log
            /* JADX INFO: renamed from: a */
            public final void m11670a(String str) {
                this.f10085a.m3625t(str);
            }
        });
        this.f2037q.z(new ukw.c() { // from class: l.mog
            public final void onError(int i, int i2) {
                this.f10529a.m3626u(i, i2);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m3621p() {
        if (this.f2040t) {
            int iRound = this.f2042v > 500 ? Math.round(cdh.m9124c(this.f2031k, this.f2037q.m().getAbsolutePath()) / 1000.0f) : -1;
            this.f2042v += 100;
            if (m3627v(iRound)) {
                this.f2041u = Math.round(this.f2042v / 1000.0f);
            } else {
                this.f2041u = iRound;
            }
            if (this.f2041u >= 60) {
                m3628w();
            } else {
                m3609E();
            }
            this.f2027g.setText(String.valueOf(this.f2041u));
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m3622q(View view) {
        m3628w();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m3623r(View view) {
        zvf0.u("e_recording_over_button", "p_moment_post", new j760[]{new j760("button_operation", "delete")});
        m3606B();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m3624s(View view) {
        m3629x();
    }

    public void setAudioRecordStateChangeListener(gc1 gc1Var) {
        this.f2038r = gc1Var;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m3625t(String str) {
        m3605A();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m3626u(int i, int i2) {
        m3608D();
        m3630y();
        m3616k(AudioRecordState.WAITING);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m3627v(int i) {
        return i <= 0;
    }

    /* JADX INFO: renamed from: w */
    public void m3628w() {
        this.f2033m.mo10595b();
    }

    /* JADX INFO: renamed from: x */
    public final void m3629x() {
        zvf0.u("e_recording_over_button", "p_moment_post", new j760[]{new j760("button_operation", "finish")});
        Audio recordedAudioData = getRecordedAudioData();
        if (NullChecker.a(this.f2038r)) {
            this.f2038r.mo3964a(recordedAudioData);
        }
        this.f2041u = 0;
        this.f2042v = 0;
        wng.m15855v().m15891j0();
        m3616k(AudioRecordState.WAITING);
    }

    /* JADX INFO: renamed from: y */
    public void m3630y() {
        m3612H();
        eb1.m9688a(null);
    }

    /* JADX INFO: renamed from: z */
    public final void m3631z() {
    }

    public FeedAudioRecordView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2041u = 0;
        this.f2042v = 0;
        m3618m(context);
    }

    public FeedAudioRecordView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2041u = 0;
        this.f2042v = 0;
        m3618m(context);
    }
}
