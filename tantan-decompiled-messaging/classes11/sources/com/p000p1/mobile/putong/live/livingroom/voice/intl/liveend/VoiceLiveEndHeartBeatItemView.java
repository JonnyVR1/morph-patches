package com.p000p1.mobile.putong.live.livingroom.voice.intl.liveend;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveVoiceUserRecord;
import l.fce;
import l.i3c0;
import l.mqv;
import l.t100;
import l.w9j;
import l.wk3;
import l.wnn0;
import p009l.won0;
import p009l.x8u;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceLiveEndHeartBeatItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f6861a;

    /* JADX INFO: renamed from: b */
    public TextView f6862b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f6863c;

    /* JADX INFO: renamed from: d */
    public VImage f6864d;

    /* JADX INFO: renamed from: e */
    public VText f6865e;

    /* JADX INFO: renamed from: f */
    public VText f6866f;

    public VoiceLiveEndHeartBeatItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: d */
    public final void m8448d(View view) {
        wnn0.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m8449e(String str, int i) {
        this.f6864d.setBackgroundResource(TextUtils.equals(str, "male") ? i3c0.V5 : i3c0.T5);
        this.f6863c.setBackground(fce.b(TextUtils.equals(str, "male") ? -10587906 : -509799, t100.d(5.0f)));
        this.f6865e.setTypeface(Typeface.DEFAULT_BOLD);
        this.f6865e.setText(String.valueOf(i));
    }

    /* JADX INFO: renamed from: f */
    public void m8450f(final won0 won0Var, BLiveVoiceUserRecord bLiveVoiceUserRecord, final mqv<User> mqvVar) {
        if (mqvVar != null) {
            wk3.c(this.f6861a, mqvVar, new w9j() { // from class: l.tnn0
                public final Object call(Object obj) {
                    return ((User) obj).fp().profileSmall().formatted();
                }
            });
            this.f6862b.setText(((User) mqvVar.a).name);
            m8449e(((User) mqvVar.a).gender.toString(), ((User) mqvVar.a).age.intValue());
            this.f6861a.setOnClickListener(new View.OnClickListener() { // from class: l.unn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    won0Var.m24437I0(mqvVar);
                }
            });
            this.f6862b.setOnClickListener(new View.OnClickListener() { // from class: l.vnn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    won0Var.m24437I0(mqvVar);
                }
            });
        }
        this.f6866f.setText(x8u.m24745c(bLiveVoiceUserRecord.heartbeatRewardPoint));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8448d(this);
    }

    public VoiceLiveEndHeartBeatItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
