package com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetCpRecommendUser;
import com.p1.mobile.putong.live.base.data.BLiveVoiceWealthHierarchy;
import l.buo0;
import l.fce;
import l.hxs;
import l.i3c0;
import l.ney;
import l.sxj;
import l.t100;
import l.xdl0;
import p009l.fld0;
import p009l.ggv;
import p009l.ypv;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceSweetUserItemView extends RelativeLayout {

    /* JADX INFO: renamed from: h */
    public static final float f7236h = t100.h;

    /* JADX INFO: renamed from: a */
    public VDraweeView f7237a;

    /* JADX INFO: renamed from: b */
    public VText f7238b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f7239c;

    /* JADX INFO: renamed from: d */
    public VImage f7240d;

    /* JADX INFO: renamed from: e */
    public VText f7241e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f7242f;

    /* JADX INFO: renamed from: g */
    public VText f7243g;

    public VoiceSweetUserItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8800a(View view) {
        buo0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m8801b(String str, int i) {
        xdl0.M(this.f7239c, true);
        this.f7240d.setBackgroundResource(TextUtils.equals(str, "male") ? i3c0.V5 : i3c0.T5);
        this.f7239c.setBackground(fce.b(TextUtils.equals(str, "male") ? -10587906 : -509799, t100.d(7.0f)));
        this.f7241e.setTypeface(Typeface.DEFAULT_BOLD);
        this.f7241e.setText(String.valueOf(i));
    }

    /* JADX INFO: renamed from: c */
    public final void m8802c(BLiveUserLevel bLiveUserLevel) {
        if (bLiveUserLevel == null || TextUtils.isEmpty(bLiveUserLevel.backendUrl)) {
            xdl0.M(this.f7242f, false);
        } else {
            xdl0.M(this.f7242f, true);
            sxj.c(bLiveUserLevel.backendUrl, this.f7242f, ney.a(bLiveUserLevel.grade) ? sxj.b : sxj.a);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m8803d(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser) {
        hxs.t("context_single_room", this.f7237a, bLiveVoiceSweetCpRecommendUser.userAvatar, xdl0.w(55.0f));
        this.f7238b.setText(bLiveVoiceSweetCpRecommendUser.nickName);
        m8801b(bLiveVoiceSweetCpRecommendUser.gender, bLiveVoiceSweetCpRecommendUser.age);
        BLiveVoiceWealthHierarchy bLiveVoiceWealthHierarchy = bLiveVoiceSweetCpRecommendUser.wealthHierarchy;
        if (bLiveVoiceWealthHierarchy == null || bLiveVoiceWealthHierarchy.grade <= 0) {
            xdl0.M(this.f7242f, false);
        } else {
            m8802c(((ggv) ypv.m25491l(fld0.f13077c)).m15033v(bLiveVoiceSweetCpRecommendUser.wealthHierarchy.grade));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8800a(this);
    }

    public VoiceSweetUserItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetUserItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
