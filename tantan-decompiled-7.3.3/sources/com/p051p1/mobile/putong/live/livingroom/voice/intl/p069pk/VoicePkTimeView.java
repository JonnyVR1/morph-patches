package com.p051p1.mobile.putong.live.livingroom.voice.intl.p069pk;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePkInfo;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveStrokeTextView;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.cho0;
import p153l.gt0;
import p153l.it0;
import p153l.kdu;
import p153l.lyh0;
import p153l.obc0;
import p153l.pzi0;
import p153l.qa00;

/* JADX INFO: loaded from: classes10.dex */
public class VoicePkTimeView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f54169d;

    /* JADX INFO: renamed from: e */
    public VImage f54170e;

    /* JADX INFO: renamed from: f */
    public VImage f54171f;

    /* JADX INFO: renamed from: g */
    public VText f54172g;

    /* JADX INFO: renamed from: h */
    public LiveStrokeTextView f54173h;

    /* JADX INFO: renamed from: i */
    public VImage f54174i;

    /* JADX INFO: renamed from: j */
    public Animator f54175j;

    /* JADX INFO: renamed from: k */
    public List<Integer> f54176k;

    /* JADX INFO: renamed from: l */
    public final AnimListener f54177l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.pk.VoicePkTimeView$a */
    public class C13194a extends AnimListener {
        public C13194a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            bnl0.m105525M0(VoicePkTimeView.this.f54170e, false);
        }
    }

    public VoicePkTimeView(Context context) {
        super(context);
        this.f54176k = new ArrayList();
        this.f54177l = new C13194a();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m79520h0(View view) {
        cho0.m109841a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m79521i0(BLiveVoicePkInfo bLiveVoicePkInfo) {
        long jM174454o = (bLiveVoicePkInfo.endMill - pzi0.m174454o()) / 1000;
        it0.m142008B(this.f54175j);
        if (!bLiveVoicePkInfo.enable || bLiveVoicePkInfo.endMill < 0 || jM174454o <= 0) {
            bnl0.m105524M(this, false);
            return;
        }
        bnl0.m105524M(this, true);
        if (jM174454o > 30) {
            this.f54172g.setText(kdu.m149281Z(jM174454o));
            bnl0.m105524M(this.f54172g, true);
            bnl0.m105524M(this.f54173h, false);
            bnl0.m105524M(this.f54174i, false);
            bnl0.m105525M0(this.f54169d, false);
            bnl0.m105525M0(this.f54170e, true);
            this.f54169d.stopAnimation(true);
            return;
        }
        bnl0.m105525M0(this.f54169d, true);
        if (this.f54169d.isAnimating()) {
            bnl0.m105525M0(this.f54170e, false);
        } else {
            SVGALoader.with(getContext()).from("https://fe-static.tancdn.com/v1/raw/f041a549-e2fa-4b16-8acf-ed41b3d6a85a14.svga").autoPlay(true).animListener(this.f54177l).repeatCount(-1).into(this.f54169d);
        }
        if (jM174454o > 5) {
            bnl0.m105524M(this.f54172g, false);
            bnl0.m105524M(this.f54173h, true);
            bnl0.m105524M(this.f54174i, false);
            m79522j0(this.f54173h);
            this.f54173h.setText(kdu.m149273R(jM174454o));
            return;
        }
        m79522j0(this.f54174i);
        bnl0.m105524M(this.f54172g, false);
        bnl0.m105524M(this.f54173h, false);
        bnl0.m105524M(this.f54174i, true);
        if (jM174454o <= this.f54176k.size()) {
            this.f54174i.setImageResource(this.f54176k.get((int) (jM174454o - 1)).intValue());
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m79522j0(View view) {
        Animator animatorM132180z = gt0.m132180z(gt0.m132168n(view, View.ALPHA, 0.0f, 1.0f).setDuration(200L), gt0.m132168n(view, gt0.f106354i, 1.5f, 0.9f, 1.0f).setDuration(400L));
        this.f54175j = animatorM132180z;
        animatorM132180z.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79520h0(this);
        this.f54173h.setStrokeColor(Color.parseColor("#925737"));
        this.f54173h.setStrokeWidth(qa00.m175859d(2.0f));
        this.f54173h.setTypeface(lyh0.m156283c(11));
        this.f54176k.add(Integer.valueOf(obc0.f146253Y9));
        this.f54176k.add(Integer.valueOf(obc0.f146264Z9));
        this.f54176k.add(Integer.valueOf(obc0.f146276aa));
        this.f54176k.add(Integer.valueOf(obc0.f146288ba));
        this.f54176k.add(Integer.valueOf(obc0.f146300ca));
    }

    public VoicePkTimeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54176k = new ArrayList();
        this.f54177l = new C13194a();
    }

    public VoicePkTimeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54176k = new ArrayList();
        this.f54177l = new C13194a();
    }
}
