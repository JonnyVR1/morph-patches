package com.p046p1.mobile.putong.core.newui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.media.AudioPlayer;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.AudioSignature;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;
import p149l.c4g0;
import p149l.cd1;
import p149l.cqb;
import p149l.e30;
import p149l.ed1;
import p149l.jo0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.roj0;
import p149l.u4c0;
import p149l.x2c0;
import p149l.yc1;

/* JADX INFO: loaded from: classes11.dex */
public class AudioSignatureCardPlayView extends VRelative {

    /* JADX INFO: renamed from: t */
    public static String f26442t = "";

    /* JADX INFO: renamed from: d */
    public LinearLayout f26443d;

    /* JADX INFO: renamed from: e */
    public VImage f26444e;

    /* JADX INFO: renamed from: f */
    public SceneView f26445f;

    /* JADX INFO: renamed from: g */
    public VText f26446g;

    /* JADX INFO: renamed from: h */
    public VText f26447h;

    /* JADX INFO: renamed from: i */
    public boolean f26448i;

    /* JADX INFO: renamed from: j */
    public c4g0 f26449j;

    /* JADX INFO: renamed from: k */
    public c4g0 f26450k;

    /* JADX INFO: renamed from: l */
    public AudioPlayer f26451l;

    /* JADX INFO: renamed from: m */
    public boolean f26452m;

    /* JADX INFO: renamed from: n */
    public C22392a<roj0> f26453n;

    /* JADX INFO: renamed from: o */
    public String f26454o;

    /* JADX INFO: renamed from: p */
    public AudioSignature f26455p;

    /* JADX INFO: renamed from: q */
    public boolean f26456q;

    /* JADX INFO: renamed from: r */
    public View.OnClickListener f26457r;

    /* JADX INFO: renamed from: s */
    public cqb f26458s;

    public AudioSignatureCardPlayView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26452m = false;
        this.f26453n = C22392a.m221512b();
        this.f26454o = "";
        this.f26456q = false;
        this.f26457r = new View.OnClickListener() { // from class: l.zc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202507a.m43196H(view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m43196H(View view) {
        int id = view.getId();
        if (id == u4c0.f174350lc) {
            if (this.f26456q) {
                lsi0.m151595y("对方添加了语音签名，附近的人优先看到 ta！");
                return;
            }
            return;
        }
        if (id == u4c0.f174276h5) {
            if (this.f26456q) {
                lsi0.m151595y("对方添加了语音签名，附近的人优先看到 ta！");
            }
        } else {
            if (id == u4c0.f173718A1) {
                this.f26443d.setVisibility(4);
                return;
            }
            if (id == u4c0.f173937N) {
                if (this.f26448i) {
                    this.f26451l.finish();
                } else if (ConnectivityReceiver.m81284g()) {
                    this.f26451l.play(this.f26455p.url);
                } else {
                    lsi0.m151578h(R$string.f18813p4);
                }
            }
        }
    }

    public static String getFirstSuggestedUserId() {
        return f26442t;
    }

    /* JADX INFO: renamed from: r */
    private void m43199r() {
        m43201B(this);
        setVisibility(4);
        this.f26443d.setVisibility(4);
        this.f26447h.setOnClickListener(this.f26457r);
        this.f26445f.setOnClickListener(this.f26457r);
        this.f26444e.setOnClickListener(this.f26457r);
        this.f26446g.setOnClickListener(this.f26457r);
    }

    public static void setFirstSuggestedUserId(String str) {
        f26442t = str;
    }

    /* JADX INFO: renamed from: B */
    public final void m43201B(View view) {
        cd1.m106212a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m43202I(AudioPlayer.State state) {
        if (state == AudioPlayer.State.preparing) {
            this.f26448i = true;
            this.f26453n.onNext(roj0.f160388a);
            this.f26446g.setCompoundDrawablesWithIntrinsicBounds(x2c0.f189714Rr, 0, 0, 0);
            if (this.f26458s == null) {
                ed1 ed1Var = new ed1(yc1.m213987a(this.f26455p.duration), this.f26446g);
                this.f26458s = ed1Var;
                ed1Var.m108245a();
                return;
            }
            return;
        }
        if ((state == AudioPlayer.State.stopped || state == AudioPlayer.State.finished) && this.f26448i) {
            if (state == AudioPlayer.State.finished) {
                this.f26458s.stop();
                this.f26458s = null;
            }
            this.f26448i = false;
            this.f26446g.setCompoundDrawablesWithIntrinsicBounds(x2c0.f189683Qr, 0, 0, 0);
            this.f26446g.setText(String.format(Locale.getDefault(), "%d s", Integer.valueOf(yc1.m213987a(this.f26455p.duration))));
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m43203L(Random random, Long l2) {
        this.f26447h.setText(String.format(Locale.getDefault(), "%sx", String.valueOf((random.nextInt(5) + 17) / 10.0f)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AudioPlayer audioPlayer = new AudioPlayer(getContext());
        this.f26451l = audioPlayer;
        this.f26450k = audioPlayer.obs().distinctUntilChanged().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.ad1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68893a.m43202I((AudioPlayer.State) obj);
            }
        }));
        final Random random = new Random();
        this.f26449j = C22306c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().compose(mkd0.m154951C()).subscribe(mkd0.m154955G(new e30() { // from class: l.bd1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74995a.m43203L(random, (Long) obj);
            }
        }));
        this.f26445f.m80918d("animations/boost/config.xml", "animations/boost/pic");
        this.f26445f.m80916b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f26451l.destroy();
        this.f26451l = null;
        mkd0.m154992z(this.f26450k);
        mkd0.m154992z(this.f26449j);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43199r();
    }

    public AudioSignatureCardPlayView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudioSignatureCardPlayView(Context context) {
        this(context, null);
    }
}
