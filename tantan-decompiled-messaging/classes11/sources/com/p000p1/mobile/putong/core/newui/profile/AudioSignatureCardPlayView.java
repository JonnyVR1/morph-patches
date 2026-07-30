package com.p000p1.mobile.putong.core.newui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.android.media.AudioPlayer;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.AudioSignature;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.cd1;
import l.e30;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.roj0;
import l.u4c0;
import l.x2c0;
import p009l.cqb;
import p009l.ed1;
import p009l.yc1;
import rx.c;
import rx.subjects.a;
import v.VImage;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class AudioSignatureCardPlayView extends VRelative {

    /* JADX INFO: renamed from: t */
    public static String f5220t = "";

    /* JADX INFO: renamed from: d */
    public LinearLayout f5221d;

    /* JADX INFO: renamed from: e */
    public VImage f5222e;

    /* JADX INFO: renamed from: f */
    public SceneView f5223f;

    /* JADX INFO: renamed from: g */
    public VText f5224g;

    /* JADX INFO: renamed from: h */
    public VText f5225h;

    /* JADX INFO: renamed from: i */
    public boolean f5226i;

    /* JADX INFO: renamed from: j */
    public c4g0 f5227j;

    /* JADX INFO: renamed from: k */
    public c4g0 f5228k;

    /* JADX INFO: renamed from: l */
    public AudioPlayer f5229l;

    /* JADX INFO: renamed from: m */
    public boolean f5230m;

    /* JADX INFO: renamed from: n */
    public a<roj0> f5231n;

    /* JADX INFO: renamed from: o */
    public String f5232o;

    /* JADX INFO: renamed from: p */
    public AudioSignature f5233p;

    /* JADX INFO: renamed from: q */
    public boolean f5234q;

    /* JADX INFO: renamed from: r */
    public View.OnClickListener f5235r;

    /* JADX INFO: renamed from: s */
    public cqb f5236s;

    public AudioSignatureCardPlayView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5230m = false;
        this.f5231n = a.b();
        this.f5232o = "";
        this.f5234q = false;
        this.f5235r = new View.OnClickListener() { // from class: l.zc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23557a.m7412H(view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m7412H(View view) {
        int id = view.getId();
        if (id == u4c0.lc) {
            if (this.f5234q) {
                lsi0.y("对方添加了语音签名，附近的人优先看到 ta！");
                return;
            }
            return;
        }
        if (id == u4c0.h5) {
            if (this.f5234q) {
                lsi0.y("对方添加了语音签名，附近的人优先看到 ta！");
            }
        } else {
            if (id == u4c0.A1) {
                this.f5221d.setVisibility(4);
                return;
            }
            if (id == u4c0.N) {
                if (this.f5226i) {
                    this.f5229l.finish();
                } else if (ConnectivityReceiver.g()) {
                    this.f5229l.play(this.f5233p.url);
                } else {
                    lsi0.h(R.string.p4);
                }
            }
        }
    }

    public static String getFirstSuggestedUserId() {
        return f5220t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m7415r() {
        m7417B(this);
        setVisibility(4);
        this.f5221d.setVisibility(4);
        this.f5225h.setOnClickListener(this.f5235r);
        this.f5223f.setOnClickListener(this.f5235r);
        this.f5222e.setOnClickListener(this.f5235r);
        this.f5224g.setOnClickListener(this.f5235r);
    }

    public static void setFirstSuggestedUserId(String str) {
        f5220t = str;
    }

    /* JADX INFO: renamed from: B */
    public final void m7417B(View view) {
        cd1.a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m7418I(AudioPlayer.State state) {
        if (state == AudioPlayer.State.preparing) {
            this.f5226i = true;
            this.f5231n.onNext(roj0.a);
            this.f5224g.setCompoundDrawablesWithIntrinsicBounds(x2c0.Rr, 0, 0, 0);
            if (this.f5236s == null) {
                ed1 ed1Var = new ed1(yc1.m25281a(this.f5233p.duration), this.f5224g);
                this.f5236s = ed1Var;
                ed1Var.m12760a();
                return;
            }
            return;
        }
        if ((state == AudioPlayer.State.stopped || state == AudioPlayer.State.finished) && this.f5226i) {
            if (state == AudioPlayer.State.finished) {
                this.f5236s.stop();
                this.f5236s = null;
            }
            this.f5226i = false;
            this.f5224g.setCompoundDrawablesWithIntrinsicBounds(x2c0.Qr, 0, 0, 0);
            this.f5224g.setText(String.format(Locale.getDefault(), "%d s", Integer.valueOf(yc1.m25281a(this.f5233p.duration))));
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m7419L(Random random, Long l2) {
        this.f5225h.setText(String.format(Locale.getDefault(), "%sx", String.valueOf((random.nextInt(5) + 17) / 10.0f)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        AudioPlayer audioPlayer = new AudioPlayer(getContext());
        this.f5229l = audioPlayer;
        this.f5228k = audioPlayer.obs().distinctUntilChanged().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.ad1
            public final void call(Object obj) {
                this.f9408a.m7418I((AudioPlayer.State) obj);
            }
        }));
        final Random random = new Random();
        this.f5227j = c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().compose(mkd0.C()).subscribe(mkd0.G(new e30() { // from class: l.bd1
            public final void call(Object obj) {
                this.f10019a.m7419L(random, (Long) obj);
            }
        }));
        this.f5223f.d(new String[]{"animations/boost/config.xml", "animations/boost/pic"});
        this.f5223f.b(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        this.f5229l.destroy();
        this.f5229l = null;
        mkd0.z(this.f5228k);
        mkd0.z(this.f5227j);
        super/*android.view.View*/.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7415r();
    }

    public AudioSignatureCardPlayView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AudioSignatureCardPlayView(Context context) {
        this(context, null);
    }
}
