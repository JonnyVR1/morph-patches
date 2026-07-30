package com.p051p1.mobile.putong.feed.newui.mediapicker.audiopost;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.feed.newui.view.progressbar.FeedProgressBar;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import p151v.VImage;
import p151v.VText;
import p153l.arc0;
import p153l.cqg;
import p153l.i4g0;
import p153l.kl40;
import p153l.lb1;
import p153l.lpg;
import p153l.lum;
import p153l.nc1;
import p153l.oc1;
import p153l.pf60;
import p153l.reh;
import p153l.tnw;
import p153l.uop0;
import p153l.vo5;

/* JADX INFO: loaded from: classes13.dex */
public class FeedAudioRecordView extends FrameLayout {

    /* JADX INFO: renamed from: y */
    public static final String f41407y = "FeedAudioRecordView";

    /* JADX INFO: renamed from: a */
    public View f41408a;

    /* JADX INFO: renamed from: b */
    public View f41409b;

    /* JADX INFO: renamed from: c */
    public View f41410c;

    /* JADX INFO: renamed from: d */
    public FeedProgressBar f41411d;

    /* JADX INFO: renamed from: e */
    public VImage f41412e;

    /* JADX INFO: renamed from: f */
    public VText f41413f;

    /* JADX INFO: renamed from: g */
    public VText f41414g;

    /* JADX INFO: renamed from: h */
    public VText f41415h;

    /* JADX INFO: renamed from: i */
    public VImage f41416i;

    /* JADX INFO: renamed from: j */
    public VImage f41417j;

    /* JADX INFO: renamed from: k */
    public Act f41418k;

    /* JADX INFO: renamed from: l */
    public AudioRecordState f41419l;

    /* JADX INFO: renamed from: m */
    public oc1 f41420m;

    /* JADX INFO: renamed from: n */
    public uop0 f41421n;

    /* JADX INFO: renamed from: o */
    public arc0 f41422o;

    /* JADX INFO: renamed from: p */
    public vo5 f41423p;

    /* JADX INFO: renamed from: q */
    public tnw f41424q;

    /* JADX INFO: renamed from: r */
    public nc1 f41425r;

    /* JADX INFO: renamed from: s */
    public int f41426s;

    /* JADX INFO: renamed from: t */
    public boolean f41427t;

    /* JADX INFO: renamed from: u */
    public int f41428u;

    /* JADX INFO: renamed from: v */
    public int f41429v;

    /* JADX INFO: renamed from: w */
    public Runnable f41430w;

    /* JADX INFO: renamed from: x */
    public Handler f41431x;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView$a */
    public static /* synthetic */ class C11404a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f41432a;

        static {
            int[] iArr = new int[AudioRecordState.values().length];
            f41432a = iArr;
            try {
                iArr[AudioRecordState.INITIALIZING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41432a[AudioRecordState.WAITING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41432a[AudioRecordState.RECORDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41432a[AudioRecordState.COMPLETING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FeedAudioRecordView(@NonNull Context context) {
        super(context);
        this.f41428u = 0;
        this.f41429v = 0;
        m63796m(context);
    }

    private Audio getRecordedAudioData() {
        Audio audio = new Audio();
        File fileM191984m = this.f41424q.m191984m();
        File file = new File(this.f41424q.m191984m().getParentFile(), System.currentTimeMillis() + "_" + SystemClock.uptimeMillis() + ".mp3");
        fileM191984m.renameTo(file);
        audio.url = file.getAbsolutePath();
        audio.mediaType = "audio/mp3";
        audio.duration = (float) this.f41428u;
        audio.status = MediaLocalStatus.get("raw");
        return audio;
    }

    /* JADX INFO: renamed from: A */
    public final void m63783A() {
        m63795l();
    }

    /* JADX INFO: renamed from: B */
    public final void m63784B() {
        lpg.m155193v().m155229j0();
        m63794k(AudioRecordState.WAITING);
        m63786D();
    }

    /* JADX INFO: renamed from: C */
    public boolean m63785C(float f) {
        return f >= 4.0f;
    }

    /* JADX INFO: renamed from: D */
    public void m63786D() {
        this.f41428u = 0;
        this.f41429v = 0;
        this.f41424q.m191981j();
    }

    /* JADX INFO: renamed from: E */
    public void m63787E() {
        if (this.f41427t) {
            this.f41431x.postDelayed(getRecordTimerRunnable(), 100L);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m63788F() {
        if (this.f41419l == AudioRecordState.RECORDING) {
            m63806w();
        }
    }

    /* JADX INFO: renamed from: G */
    public void m63789G() {
        this.f41424q.m191980D();
        m63808y();
    }

    /* JADX INFO: renamed from: H */
    public void m63790H() {
        this.f41427t = false;
        this.f41431x.removeCallbacks(getRecordTimerRunnable());
    }

    public AudioRecordState getCurrentRecordState() {
        return this.f41419l;
    }

    public oc1 getNowAudioRecordHandle() {
        int i = C11404a.f41432a[this.f41419l.ordinal()];
        if (i == 1) {
            return new lum(this);
        }
        if (i == 2) {
            if (this.f41421n == null) {
                this.f41421n = new uop0(this);
            }
            return this.f41421n;
        }
        if (i == 3) {
            if (this.f41422o == null) {
                this.f41422o = new arc0(this);
            }
            return this.f41422o;
        }
        if (i != 4) {
            return new uop0(this);
        }
        if (this.f41423p == null) {
            this.f41423p = new vo5(this);
        }
        return this.f41423p;
    }

    public Runnable getRecordTimerRunnable() {
        if (this.f41430w == null) {
            this.f41430w = new Runnable() { // from class: l.vpg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f185249a.m63799p();
                }
            };
        }
        return this.f41430w;
    }

    /* JADX INFO: renamed from: h */
    public View m63791h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cqg.m111898b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i */
    public void m63792i() {
        m63808y();
        m63786D();
    }

    /* JADX INFO: renamed from: j */
    public void m63793j() {
        if (this.f41419l == AudioRecordState.COMPLETING) {
            m63784B();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m63794k(AudioRecordState audioRecordState) {
        if (NullChecker.m82486a(this.f41420m)) {
            this.f41420m.mo99662c();
        }
        this.f41419l = audioRecordState;
        oc1 nowAudioRecordHandle = getNowAudioRecordHandle();
        this.f41420m = nowAudioRecordHandle;
        nowAudioRecordHandle.mo99663d(this.f41419l);
        this.f41420m.mo99660a();
        if (NullChecker.m82486a(this.f41425r)) {
            this.f41425r.mo64135b(audioRecordState);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m63795l() {
        float fM191990s = this.f41424q.m191990s() / 1000.0f;
        if (!m63785C(fM191990s)) {
            m63784B();
            return;
        }
        int iRound = Math.round(fM191990s);
        this.f41428u = iRound;
        this.f41414g.setText(String.valueOf(iRound));
    }

    /* JADX INFO: renamed from: m */
    public final void m63796m(Context context) {
        this.f41418k = (Act) context;
        addView(m63791h(LayoutInflater.from(context), this));
        m63797n();
        m63798o();
        m63794k(AudioRecordState.INITIALIZING);
        m63794k(AudioRecordState.WAITING);
        this.f41431x = new Handler();
    }

    /* JADX INFO: renamed from: n */
    public final void m63797n() {
        this.f41408a.setOnClickListener(new View.OnClickListener() { // from class: l.wpg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190302a.m63800q(view);
            }
        });
        this.f41416i.setOnClickListener(new View.OnClickListener() { // from class: l.xpg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195709a.m63801r(view);
            }
        });
        this.f41417j.setOnClickListener(new View.OnClickListener() { // from class: l.ypg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201067a.m63802s(view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m63798o() {
        tnw tnwVar = new tnw();
        this.f41424q = tnwVar;
        tnwVar.m191996y(kl40.m150347e());
        this.f41424q.m191977A(new tnw.InterfaceC20357d() { // from class: l.zpg
            @Override // p153l.tnw.InterfaceC20357d
            public final void onStart() {
                this.f205461a.m63809z();
            }
        });
        this.f41424q.m191978B(new tnw.InterfaceC20358e() { // from class: l.aqg
            @Override // p153l.tnw.InterfaceC20358e
            /* JADX INFO: renamed from: a */
            public final void mo99477a(String str) {
                this.f72814a.m63803t(str);
            }
        });
        this.f41424q.m191997z(new tnw.InterfaceC20356c() { // from class: l.bqg
            @Override // p153l.tnw.InterfaceC20356c
            public final void onError(int i, int i2) {
                this.f77897a.m63804u(i, i2);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m63799p() {
        if (this.f41427t) {
            int iRound = this.f41429v > 500 ? Math.round(reh.m181028c(this.f41418k, this.f41424q.m191984m().getAbsolutePath()) / 1000.0f) : -1;
            this.f41429v += 100;
            if (m63805v(iRound)) {
                this.f41428u = Math.round(this.f41429v / 1000.0f);
            } else {
                this.f41428u = iRound;
            }
            if (this.f41428u >= 60) {
                m63806w();
            } else {
                m63787E();
            }
            this.f41414g.setText(String.valueOf(this.f41428u));
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m63800q(View view) {
        m63806w();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m63801r(View view) {
        i4g0.m138523u("e_recording_over_button", "p_moment_post", new pf60("button_operation", RequestParameters.SUBRESOURCE_DELETE));
        m63784B();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m63802s(View view) {
        m63807x();
    }

    public void setAudioRecordStateChangeListener(nc1 nc1Var) {
        this.f41425r = nc1Var;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m63803t(String str) {
        m63783A();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m63804u(int i, int i2) {
        m63786D();
        m63808y();
        m63794k(AudioRecordState.WAITING);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m63805v(int i) {
        return i <= 0;
    }

    /* JADX INFO: renamed from: w */
    public void m63806w() {
        this.f41420m.mo99661b();
    }

    /* JADX INFO: renamed from: x */
    public final void m63807x() {
        i4g0.m138523u("e_recording_over_button", "p_moment_post", new pf60("button_operation", "finish"));
        Audio recordedAudioData = getRecordedAudioData();
        if (NullChecker.m82486a(this.f41425r)) {
            this.f41425r.mo64134a(recordedAudioData);
        }
        this.f41428u = 0;
        this.f41429v = 0;
        lpg.m155193v().m155229j0();
        m63794k(AudioRecordState.WAITING);
    }

    /* JADX INFO: renamed from: y */
    public void m63808y() {
        m63790H();
        lb1.m153551a(null);
    }

    /* JADX INFO: renamed from: z */
    public final void m63809z() {
    }

    public FeedAudioRecordView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41428u = 0;
        this.f41429v = 0;
        m63796m(context);
    }

    public FeedAudioRecordView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41428u = 0;
        this.f41429v = 0;
        m63796m(context);
    }
}
