package com.p051p1.mobile.putong.core.newui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.media.AudioPlayer;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.AudioSignature;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;
import p153l.adc0;
import p153l.dbc0;
import p153l.fd1;
import p153l.fo0;
import p153l.jd1;
import p153l.kcg0;
import p153l.ld1;
import p153l.o1j0;
import p153l.psd0;
import p153l.qrb;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class AudioSignatureCardPlayView extends VRelative {

    /* JADX INFO: renamed from: t */
    public static String f27184t = "";

    /* JADX INFO: renamed from: d */
    public LinearLayout f27185d;

    /* JADX INFO: renamed from: e */
    public VImage f27186e;

    /* JADX INFO: renamed from: f */
    public SceneView f27187f;

    /* JADX INFO: renamed from: g */
    public VText f27188g;

    /* JADX INFO: renamed from: h */
    public VText f27189h;

    /* JADX INFO: renamed from: i */
    public boolean f27190i;

    /* JADX INFO: renamed from: j */
    public kcg0 f27191j;

    /* JADX INFO: renamed from: k */
    public kcg0 f27192k;

    /* JADX INFO: renamed from: l */
    public AudioPlayer f27193l;

    /* JADX INFO: renamed from: m */
    public boolean f27194m;

    /* JADX INFO: renamed from: n */
    public C22507a<uxj0> f27195n;

    /* JADX INFO: renamed from: o */
    public String f27196o;

    /* JADX INFO: renamed from: p */
    public AudioSignature f27197p;

    /* JADX INFO: renamed from: q */
    public boolean f27198q;

    /* JADX INFO: renamed from: r */
    public View.OnClickListener f27199r;

    /* JADX INFO: renamed from: s */
    public qrb f27200s;

    public AudioSignatureCardPlayView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27194m = false;
        this.f27195n = C22507a.m222758b();
        this.f27196o = "";
        this.f27198q = false;
        this.f27199r = new View.OnClickListener() { // from class: l.gd1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103621a.m44207H(view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m44207H(View view) {
        int id = view.getId();
        if (id == adc0.f70475nc) {
            if (this.f27198q) {
                o1j0.m165651y("对方添加了语音签名，附近的人优先看到 ta！");
                return;
            }
            return;
        }
        if (id == adc0.f70400j5) {
            if (this.f27198q) {
                o1j0.m165651y("对方添加了语音签名，附近的人优先看到 ta！");
            }
        } else {
            if (id == adc0.f69806A1) {
                this.f27185d.setVisibility(4);
                return;
            }
            if (id == adc0.f70025N) {
                if (this.f27190i) {
                    this.f27193l.finish();
                } else if (ConnectivityReceiver.m82467g()) {
                    this.f27193l.play(this.f27197p.url);
                } else {
                    o1j0.m165634h(R$string.f19605r4);
                }
            }
        }
    }

    public static String getFirstSuggestedUserId() {
        return f27184t;
    }

    /* JADX INFO: renamed from: r */
    private void m44210r() {
        m44212B(this);
        setVisibility(4);
        this.f27185d.setVisibility(4);
        this.f27189h.setOnClickListener(this.f27199r);
        this.f27187f.setOnClickListener(this.f27199r);
        this.f27186e.setOnClickListener(this.f27199r);
        this.f27188g.setOnClickListener(this.f27199r);
    }

    public static void setFirstSuggestedUserId(String str) {
        f27184t = str;
    }

    /* JADX INFO: renamed from: B */
    public final void m44212B(View view) {
        jd1.m144402a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m44213I(AudioPlayer.State state) {
        if (state == AudioPlayer.State.preparing) {
            this.f27190i = true;
            this.f27195n.onNext(uxj0.f181467a);
            this.f27188g.setCompoundDrawablesWithIntrinsicBounds(dbc0.f86165Fs, 0, 0, 0);
            if (this.f27200s == null) {
                ld1 ld1Var = new ld1(fd1.m125075a(this.f27197p.duration), this.f27188g);
                this.f27200s = ld1Var;
                ld1Var.m177533a();
                return;
            }
            return;
        }
        if ((state == AudioPlayer.State.stopped || state == AudioPlayer.State.finished) && this.f27190i) {
            if (state == AudioPlayer.State.finished) {
                this.f27200s.stop();
                this.f27200s = null;
            }
            this.f27190i = false;
            this.f27188g.setCompoundDrawablesWithIntrinsicBounds(dbc0.f86133Es, 0, 0, 0);
            this.f27188g.setText(String.format(Locale.getDefault(), "%d s", Integer.valueOf(fd1.m125075a(this.f27197p.duration))));
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m44214L(Random random, Long l2) {
        this.f27189h.setText(String.format(Locale.getDefault(), "%sx", String.valueOf((random.nextInt(5) + 17) / 10.0f)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AudioPlayer audioPlayer = new AudioPlayer(getContext());
        this.f27193l = audioPlayer;
        this.f27192k = audioPlayer.obs().distinctUntilChanged().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.hd1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108771a.m44213I((AudioPlayer.State) obj);
            }
        }));
        final Random random = new Random();
        this.f27191j = C22421c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().compose(psd0.m173592C()).subscribe(psd0.m173596G(new y20() { // from class: l.id1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114462a.m44214L(random, (Long) obj);
            }
        }));
        this.f27187f.m82101d("animations/boost/config.xml", "animations/boost/pic");
        this.f27187f.m82099b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f27193l.destroy();
        this.f27193l = null;
        psd0.m173633z(this.f27192k);
        psd0.m173633z(this.f27191j);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44210r();
    }

    public AudioSignatureCardPlayView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudioSignatureCardPlayView(Context context) {
        this(context, null);
    }
}
