package com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetCpRecommendUser;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceWealthHierarchy;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.buo0;
import p149l.fce;
import p149l.fld0;
import p149l.ggv;
import p149l.hxs;
import p149l.i3c0;
import p149l.ney;
import p149l.sxj;
import p149l.t100;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceSweetUserItemView extends RelativeLayout {

    /* JADX INFO: renamed from: h */
    public static final float f53630h = t100.f167259h;

    /* JADX INFO: renamed from: a */
    public VDraweeView f53631a;

    /* JADX INFO: renamed from: b */
    public VText f53632b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f53633c;

    /* JADX INFO: renamed from: d */
    public VImage f53634d;

    /* JADX INFO: renamed from: e */
    public VText f53635e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f53636f;

    /* JADX INFO: renamed from: g */
    public VText f53637g;

    public VoiceSweetUserItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m78587a(View view) {
        buo0.m103976a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m78588b(String str, int i) {
        xdl0.m208344M(this.f53633c, true);
        this.f53634d.setBackgroundResource(TextUtils.equals(str, "male") ? i3c0.f110888V5 : i3c0.f110866T5);
        this.f53633c.setBackground(fce.m120425b(TextUtils.equals(str, "male") ? -10587906 : -509799, t100.m186890d(7.0f)));
        this.f53635e.setTypeface(Typeface.DEFAULT_BOLD);
        this.f53635e.setText(String.valueOf(i));
    }

    /* JADX INFO: renamed from: c */
    public final void m78589c(BLiveUserLevel bLiveUserLevel) {
        if (bLiveUserLevel == null || TextUtils.isEmpty(bLiveUserLevel.backendUrl)) {
            xdl0.m208344M(this.f53636f, false);
        } else {
            xdl0.m208344M(this.f53636f, true);
            sxj.m186442c(bLiveUserLevel.backendUrl, this.f53636f, ney.m159134a(bLiveUserLevel.grade) ? sxj.f166798b : sxj.f166797a);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m78590d(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser) {
        hxs.m133407t("context_single_room", this.f53631a, bLiveVoiceSweetCpRecommendUser.userAvatar, xdl0.m208407w(55.0f));
        this.f53632b.setText(bLiveVoiceSweetCpRecommendUser.nickName);
        m78588b(bLiveVoiceSweetCpRecommendUser.gender, bLiveVoiceSweetCpRecommendUser.age);
        BLiveVoiceWealthHierarchy bLiveVoiceWealthHierarchy = bLiveVoiceSweetCpRecommendUser.wealthHierarchy;
        if (bLiveVoiceWealthHierarchy == null || bLiveVoiceWealthHierarchy.grade <= 0) {
            xdl0.m208344M(this.f53636f, false);
        } else {
            m78589c(((ggv) ypv.m215673l(fld0.f98148c)).m126036v(bLiveVoiceSweetCpRecommendUser.wealthHierarchy.grade));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78587a(this);
    }

    public VoiceSweetUserItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetUserItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
