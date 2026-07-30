package com.p000p1.mobile.putong.live.livingroom.voice.intl.p003pk;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.base.data.BLiveVoicePkInfo;
import com.p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveStrokeTextView;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import java.util.ArrayList;
import java.util.List;
import l.bt0;
import l.dt0;
import l.eqh0;
import l.i3c0;
import l.jbu;
import l.t100;
import l.xdl0;
import l.y7o0;
import p009l.mqi0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoicePkTimeView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f6927d;

    /* JADX INFO: renamed from: e */
    public VImage f6928e;

    /* JADX INFO: renamed from: f */
    public VImage f6929f;

    /* JADX INFO: renamed from: g */
    public VText f6930g;

    /* JADX INFO: renamed from: h */
    public LiveStrokeTextView f6931h;

    /* JADX INFO: renamed from: i */
    public VImage f6932i;

    /* JADX INFO: renamed from: j */
    public Animator f6933j;

    /* JADX INFO: renamed from: k */
    public List<Integer> f6934k;

    /* JADX INFO: renamed from: l */
    public final AnimListener f6935l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.pk.VoicePkTimeView$a */
    public class C0433a extends AnimListener {
        public C0433a() {
        }

        public void onStart() {
            super.onStart();
            xdl0.M0(VoicePkTimeView.this.f6928e, false);
        }
    }

    public VoicePkTimeView(Context context) {
        super(context);
        this.f6934k = new ArrayList();
        this.f6935l = new C0433a();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8534h0(View view) {
        y7o0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public void m8535i0(BLiveVoicePkInfo bLiveVoicePkInfo) {
        long jM18550o = (bLiveVoicePkInfo.endMill - mqi0.m18550o()) / 1000;
        dt0.B(this.f6933j);
        if (!bLiveVoicePkInfo.enable || bLiveVoicePkInfo.endMill < 0 || jM18550o <= 0) {
            xdl0.M(this, false);
            return;
        }
        xdl0.M(this, true);
        if (jM18550o > 30) {
            this.f6930g.setText(jbu.Z(jM18550o));
            xdl0.M(this.f6930g, true);
            xdl0.M(this.f6931h, false);
            xdl0.M(this.f6932i, false);
            xdl0.M0(this.f6927d, false);
            xdl0.M0(this.f6928e, true);
            this.f6927d.stopAnimation(true);
            return;
        }
        xdl0.M0(this.f6927d, true);
        if (this.f6927d.isAnimating()) {
            xdl0.M0(this.f6928e, false);
        } else {
            SVGALoader.with(getContext()).from("https://fe-static.tancdn.com/v1/raw/f041a549-e2fa-4b16-8acf-ed41b3d6a85a14.svga").autoPlay(true).animListener(this.f6935l).repeatCount(-1).into(this.f6927d);
        }
        if (jM18550o > 5) {
            xdl0.M(this.f6930g, false);
            xdl0.M(this.f6931h, true);
            xdl0.M(this.f6932i, false);
            m8536j0(this.f6931h);
            this.f6931h.setText(jbu.R(jM18550o));
            return;
        }
        m8536j0(this.f6932i);
        xdl0.M(this.f6930g, false);
        xdl0.M(this.f6931h, false);
        xdl0.M(this.f6932i, true);
        if (jM18550o <= this.f6934k.size()) {
            this.f6932i.setImageResource(this.f6934k.get((int) (jM18550o - 1)).intValue());
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m8536j0(View view) {
        Animator animatorZ = bt0.z(new Animator[]{bt0.n(view, View.ALPHA, new float[]{0.0f, 1.0f}).setDuration(200L), bt0.n(view, bt0.i, new float[]{1.5f, 0.9f, 1.0f}).setDuration(400L)});
        this.f6933j = animatorZ;
        animatorZ.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8534h0(this);
        this.f6931h.setStrokeColor(Color.parseColor("#925737"));
        this.f6931h.setStrokeWidth(t100.d(2.0f));
        this.f6931h.setTypeface(eqh0.c(11));
        this.f6934k.add(Integer.valueOf(i3c0.Y9));
        this.f6934k.add(Integer.valueOf(i3c0.Z9));
        this.f6934k.add(Integer.valueOf(i3c0.aa));
        this.f6934k.add(Integer.valueOf(i3c0.ba));
        this.f6934k.add(Integer.valueOf(i3c0.ca));
    }

    public VoicePkTimeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6934k = new ArrayList();
        this.f6935l = new C0433a();
    }

    public VoicePkTimeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6934k = new ArrayList();
        this.f6935l = new C0433a();
    }
}
