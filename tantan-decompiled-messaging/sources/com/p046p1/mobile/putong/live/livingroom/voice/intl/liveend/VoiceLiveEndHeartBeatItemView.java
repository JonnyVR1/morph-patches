package com.p046p1.mobile.putong.live.livingroom.voice.intl.liveend;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserRecord;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.fce;
import p149l.i3c0;
import p149l.mqv;
import p149l.t100;
import p149l.w9j;
import p149l.wk3;
import p149l.wnn0;
import p149l.won0;
import p149l.x8u;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceLiveEndHeartBeatItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53255a;

    /* JADX INFO: renamed from: b */
    public TextView f53256b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f53257c;

    /* JADX INFO: renamed from: d */
    public VImage f53258d;

    /* JADX INFO: renamed from: e */
    public VText f53259e;

    /* JADX INFO: renamed from: f */
    public VText f53260f;

    public VoiceLiveEndHeartBeatItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: d */
    public final void m78259d(View view) {
        wnn0.m204750a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m78260e(String str, int i) {
        this.f53258d.setBackgroundResource(TextUtils.equals(str, "male") ? i3c0.f110888V5 : i3c0.f110866T5);
        this.f53257c.setBackground(fce.m120425b(TextUtils.equals(str, "male") ? -10587906 : -509799, t100.m186890d(5.0f)));
        this.f53259e.setTypeface(Typeface.DEFAULT_BOLD);
        this.f53259e.setText(String.valueOf(i));
    }

    /* JADX INFO: renamed from: f */
    public void m78261f(final won0 won0Var, BLiveVoiceUserRecord bLiveVoiceUserRecord, final mqv<User> mqvVar) {
        if (mqvVar != null) {
            wk3.m203644c(this.f53255a, mqvVar, new w9j() { // from class: l.tnn0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((User) obj).m60124fp().profileSmall().formatted();
                }
            });
            this.f53256b.setText(mqvVar.f135304a.name);
            m78260e(mqvVar.f135304a.gender.toString(), mqvVar.f135304a.age.intValue());
            this.f53255a.setOnClickListener(new View.OnClickListener() { // from class: l.unn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    won0Var.m204842I0(mqvVar);
                }
            });
            this.f53256b.setOnClickListener(new View.OnClickListener() { // from class: l.vnn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    won0Var.m204842I0(mqvVar);
                }
            });
        }
        this.f53260f.setText(x8u.m207433c(bLiveVoiceUserRecord.heartbeatRewardPoint));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78259d(this);
    }

    public VoiceLiveEndHeartBeatItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
