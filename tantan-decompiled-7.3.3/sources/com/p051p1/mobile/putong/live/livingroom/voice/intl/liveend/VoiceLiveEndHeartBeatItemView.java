package com.p051p1.mobile.putong.live.livingroom.voice.intl.liveend;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserRecord;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.axn0;
import p153l.ayn0;
import p153l.jde;
import p153l.nsv;
import p153l.obc0;
import p153l.qa00;
import p153l.qcj;
import p153l.ql3;
import p153l.yau;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceLiveEndHeartBeatItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f54103a;

    /* JADX INFO: renamed from: b */
    public TextView f54104b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f54105c;

    /* JADX INFO: renamed from: d */
    public VImage f54106d;

    /* JADX INFO: renamed from: e */
    public VText f54107e;

    /* JADX INFO: renamed from: f */
    public VText f54108f;

    public VoiceLiveEndHeartBeatItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: d */
    public final void m79442d(View view) {
        axn0.m100782a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m79443e(String str, int i) {
        this.f54106d.setBackgroundResource(TextUtils.equals(str, "male") ? obc0.f146216V5 : obc0.f146194T5);
        this.f54105c.setBackground(jde.m144406b(TextUtils.equals(str, "male") ? -10587906 : -509799, qa00.m175859d(5.0f)));
        this.f54107e.setTypeface(Typeface.DEFAULT_BOLD);
        this.f54107e.setText(String.valueOf(i));
    }

    /* JADX INFO: renamed from: f */
    public void m79444f(final ayn0 ayn0Var, BLiveVoiceUserRecord bLiveVoiceUserRecord, final nsv<User> nsvVar) {
        if (nsvVar != null) {
            ql3.m176985c(this.f54103a, nsvVar, new qcj() { // from class: l.xwn0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((User) obj).m61308fp().profileSmall().formatted();
                }
            });
            this.f54104b.setText(nsvVar.f143542a.name);
            m79443e(nsvVar.f143542a.gender.toString(), nsvVar.f143542a.age.intValue());
            this.f54103a.setOnClickListener(new View.OnClickListener() { // from class: l.ywn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ayn0Var.m100900I0(nsvVar);
                }
            });
            this.f54104b.setOnClickListener(new View.OnClickListener() { // from class: l.zwn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ayn0Var.m100900I0(nsvVar);
                }
            });
        }
        this.f54108f.setText(yau.m214935c(bLiveVoiceUserRecord.heartbeatRewardPoint));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79442d(this);
    }

    public VoiceLiveEndHeartBeatItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
