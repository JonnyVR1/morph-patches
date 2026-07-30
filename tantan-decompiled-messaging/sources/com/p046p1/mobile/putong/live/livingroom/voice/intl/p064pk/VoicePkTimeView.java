package com.p046p1.mobile.putong.live.livingroom.voice.intl.p064pk;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePkInfo;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveStrokeTextView;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VText;
import p149l.bt0;
import p149l.dt0;
import p149l.eqh0;
import p149l.i3c0;
import p149l.jbu;
import p149l.mqi0;
import p149l.t100;
import p149l.xdl0;
import p149l.y7o0;

/* JADX INFO: loaded from: classes11.dex */
public class VoicePkTimeView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f53321d;

    /* JADX INFO: renamed from: e */
    public VImage f53322e;

    /* JADX INFO: renamed from: f */
    public VImage f53323f;

    /* JADX INFO: renamed from: g */
    public VText f53324g;

    /* JADX INFO: renamed from: h */
    public LiveStrokeTextView f53325h;

    /* JADX INFO: renamed from: i */
    public VImage f53326i;

    /* JADX INFO: renamed from: j */
    public Animator f53327j;

    /* JADX INFO: renamed from: k */
    public List<Integer> f53328k;

    /* JADX INFO: renamed from: l */
    public final AnimListener f53329l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.pk.VoicePkTimeView$a */
    public class C13031a extends AnimListener {
        public C13031a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            xdl0.m208345M0(VoicePkTimeView.this.f53322e, false);
        }
    }

    public VoicePkTimeView(Context context) {
        super(context);
        this.f53328k = new ArrayList();
        this.f53329l = new C13031a();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m78337h0(View view) {
        y7o0.m213316a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m78338i0(BLiveVoicePkInfo bLiveVoicePkInfo) {
        long jM155944o = (bLiveVoicePkInfo.endMill - mqi0.m155944o()) / 1000;
        dt0.m113502B(this.f53327j);
        if (!bLiveVoicePkInfo.enable || bLiveVoicePkInfo.endMill < 0 || jM155944o <= 0) {
            xdl0.m208344M(this, false);
            return;
        }
        xdl0.m208344M(this, true);
        if (jM155944o > 30) {
            this.f53324g.setText(jbu.m140818Z(jM155944o));
            xdl0.m208344M(this.f53324g, true);
            xdl0.m208344M(this.f53325h, false);
            xdl0.m208344M(this.f53326i, false);
            xdl0.m208345M0(this.f53321d, false);
            xdl0.m208345M0(this.f53322e, true);
            this.f53321d.stopAnimation(true);
            return;
        }
        xdl0.m208345M0(this.f53321d, true);
        if (this.f53321d.isAnimating()) {
            xdl0.m208345M0(this.f53322e, false);
        } else {
            SVGALoader.with(getContext()).from("https://fe-static.tancdn.com/v1/raw/f041a549-e2fa-4b16-8acf-ed41b3d6a85a14.svga").autoPlay(true).animListener(this.f53329l).repeatCount(-1).into(this.f53321d);
        }
        if (jM155944o > 5) {
            xdl0.m208344M(this.f53324g, false);
            xdl0.m208344M(this.f53325h, true);
            xdl0.m208344M(this.f53326i, false);
            m78339j0(this.f53325h);
            this.f53325h.setText(jbu.m140810R(jM155944o));
            return;
        }
        m78339j0(this.f53326i);
        xdl0.m208344M(this.f53324g, false);
        xdl0.m208344M(this.f53325h, false);
        xdl0.m208344M(this.f53326i, true);
        if (jM155944o <= this.f53328k.size()) {
            this.f53326i.setImageResource(this.f53328k.get((int) (jM155944o - 1)).intValue());
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m78339j0(View view) {
        Animator animatorM103753z = bt0.m103753z(bt0.m103741n(view, View.ALPHA, 0.0f, 1.0f).setDuration(200L), bt0.m103741n(view, bt0.f77162i, 1.5f, 0.9f, 1.0f).setDuration(400L));
        this.f53327j = animatorM103753z;
        animatorM103753z.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78337h0(this);
        this.f53325h.setStrokeColor(Color.parseColor("#925737"));
        this.f53325h.setStrokeWidth(t100.m186890d(2.0f));
        this.f53325h.setTypeface(eqh0.m117752c(11));
        this.f53328k.add(Integer.valueOf(i3c0.f110925Y9));
        this.f53328k.add(Integer.valueOf(i3c0.f110936Z9));
        this.f53328k.add(Integer.valueOf(i3c0.f110948aa));
        this.f53328k.add(Integer.valueOf(i3c0.f110960ba));
        this.f53328k.add(Integer.valueOf(i3c0.f110972ca));
    }

    public VoicePkTimeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53328k = new ArrayList();
        this.f53329l = new C13031a();
    }

    public VoicePkTimeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53328k = new ArrayList();
        this.f53329l = new C13031a();
    }
}
