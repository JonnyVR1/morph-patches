package com.p046p1.mobile.putong.live.livingroom.voice.applymanager.apply;

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
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.alk0;
import p149l.bmm0;
import p149l.bt0;
import p149l.d30;
import p149l.e30;
import p149l.h1c0;
import p149l.i3c0;
import p149l.mqv;
import p149l.w9j;
import p149l.wk3;
import p149l.x4s;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceCallApplyListItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VoiceCallApplyListItemView f52841a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f52842b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f52843c;

    /* JADX INFO: renamed from: d */
    public VImage f52844d;

    /* JADX INFO: renamed from: e */
    public TextView f52845e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f52846f;

    /* JADX INFO: renamed from: g */
    public TextView f52847g;

    /* JADX INFO: renamed from: h */
    public ImageView f52848h;

    public VoiceCallApplyListItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m77688d(View view) {
        bmm0.m102655a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m77689e(mqv<User> mqvVar, final BLiveVoiceCall bLiveVoiceCall, final d30 d30Var, final e30<String> e30Var, String str) {
        boolean zM207012b = x4s.m207012b(str);
        wk3.m203644c(this.f52843c, mqvVar, new w9j() { // from class: l.ylm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).m60124fp().profileSmall().formatted();
            }
        });
        this.f52845e.setText(mqvVar.f135304a.name);
        this.f52845e.setTextColor(Color.parseColor(zM207012b ? "#CCffffff" : "#ffffff"));
        this.f52848h.clearAnimation();
        xdl0.m208344M(this.f52847g, false);
        xdl0.m208344M(this.f52848h, false);
        if (alk0.m97314m(bLiveVoiceCall)) {
            xdl0.m208344M(this.f52847g, true);
            this.f52847g.setText(R$string.f46578B);
            this.f52847g.setTextColor(Color.parseColor(zM207012b ? "#CCffffff" : "#ffffff"));
        } else if (alk0.m97313l(bLiveVoiceCall)) {
            xdl0.m208344M(this.f52848h, true);
            ObjectAnimator objectAnimator = (ObjectAnimator) bt0.m103743p(this.f52848h, BLiveGiftItem.TYPE_ROTATION, 0L, 600L, new LinearInterpolator(), 0.0f, 360.0f);
            objectAnimator.setRepeatCount(-1);
            objectAnimator.start();
        }
        if (BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(str) && NullChecker.m81303a(bLiveVoiceCall) && bLiveVoiceCall.intendPosition == BLiveVoice.VOICE_NINE_MIC_BOSS_POSITION) {
            xdl0.m208344M(this.f52844d, true);
            this.f52841a.setBackgroundResource(i3c0.f110813O7);
            this.f52846f.setBackgroundResource(i3c0.f110857S7);
            this.f52847g.setTextColor(getResources().getColor(h1c0.f105366g));
        } else {
            xdl0.m208344M(this.f52844d, false);
            this.f52841a.setBackgroundResource(i3c0.f110804Na);
            this.f52846f.setBackgroundResource(i3c0.f111106o0);
            this.f52847g.setTextColor(getResources().getColor(h1c0.f105362e1));
        }
        xdl0.m208329E0(this.f52847g, new View.OnClickListener() { // from class: l.zlm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        xdl0.m208329E0(this.f52843c, new View.OnClickListener() { // from class: l.amm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveVoiceCall.user);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77688d(this);
    }

    public VoiceCallApplyListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceCallApplyListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
