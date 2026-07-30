package com.p051p1.mobile.putong.live.livingroom.voice.applymanager.apply;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.fvm0;
import p153l.gt0;
import p153l.guk0;
import p153l.n9c0;
import p153l.nsv;
import p153l.obc0;
import p153l.qcj;
import p153l.ql3;
import p153l.x20;
import p153l.y20;
import p153l.y6s;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceCallApplyListItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VoiceCallApplyListItemView f53689a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f53690b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f53691c;

    /* JADX INFO: renamed from: d */
    public VImage f53692d;

    /* JADX INFO: renamed from: e */
    public TextView f53693e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f53694f;

    /* JADX INFO: renamed from: g */
    public TextView f53695g;

    /* JADX INFO: renamed from: h */
    public ImageView f53696h;

    public VoiceCallApplyListItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m78871d(View view) {
        fvm0.m127676a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m78872e(nsv<User> nsvVar, final BLiveVoiceCall bLiveVoiceCall, final x20 x20Var, final y20<String> y20Var, String str) {
        boolean zM214494b = y6s.m214494b(str);
        ql3.m176985c(this.f53691c, nsvVar, new qcj() { // from class: l.cvm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).m61308fp().profileSmall().formatted();
            }
        });
        this.f53693e.setText(nsvVar.f143542a.name);
        this.f53693e.setTextColor(Color.parseColor(zM214494b ? "#CCffffff" : "#ffffff"));
        this.f53696h.clearAnimation();
        bnl0.m105524M(this.f53695g, false);
        bnl0.m105524M(this.f53696h, false);
        if (guk0.m132334m(bLiveVoiceCall)) {
            bnl0.m105524M(this.f53695g, true);
            this.f53695g.setText(R$string.f47426B);
            this.f53695g.setTextColor(Color.parseColor(zM214494b ? "#CCffffff" : "#ffffff"));
        } else if (guk0.m132333l(bLiveVoiceCall)) {
            bnl0.m105524M(this.f53696h, true);
            ObjectAnimator objectAnimator = (ObjectAnimator) gt0.m132170p(this.f53696h, BLiveGiftItem.TYPE_ROTATION, 0L, 600L, new LinearInterpolator(), 0.0f, 360.0f);
            objectAnimator.setRepeatCount(-1);
            objectAnimator.start();
        }
        if (BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(str) && NullChecker.m82486a(bLiveVoiceCall) && bLiveVoiceCall.intendPosition == BLiveVoice.VOICE_NINE_MIC_BOSS_POSITION) {
            bnl0.m105524M(this.f53692d, true);
            this.f53689a.setBackgroundResource(obc0.f146141O7);
            this.f53694f.setBackgroundResource(obc0.f146185S7);
            this.f53695g.setTextColor(getResources().getColor(n9c0.f140827g));
        } else {
            bnl0.m105524M(this.f53692d, false);
            this.f53689a.setBackgroundResource(obc0.f146132Na);
            this.f53694f.setBackgroundResource(obc0.f146434o0);
            this.f53695g.setTextColor(getResources().getColor(n9c0.f140823e1));
        }
        bnl0.m105509E0(this.f53695g, new View.OnClickListener() { // from class: l.dvm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
        bnl0.m105509E0(this.f53691c, new View.OnClickListener() { // from class: l.evm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(bLiveVoiceCall.user);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78871d(this);
    }

    public VoiceCallApplyListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceCallApplyListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
