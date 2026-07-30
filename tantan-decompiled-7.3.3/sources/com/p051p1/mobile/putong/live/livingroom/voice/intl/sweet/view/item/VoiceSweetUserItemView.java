package com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.item;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetCpRecommendUser;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceWealthHierarchy;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.f3p0;
import p153l.hiv;
import p153l.htd0;
import p153l.i0k;
import p153l.izs;
import p153l.jde;
import p153l.kny;
import p153l.obc0;
import p153l.qa00;
import p153l.zrv;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceSweetUserItemView extends RelativeLayout {

    /* JADX INFO: renamed from: h */
    public static final float f54478h = qa00.f156321h;

    /* JADX INFO: renamed from: a */
    public VDraweeView f54479a;

    /* JADX INFO: renamed from: b */
    public VText f54480b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f54481c;

    /* JADX INFO: renamed from: d */
    public VImage f54482d;

    /* JADX INFO: renamed from: e */
    public VText f54483e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f54484f;

    /* JADX INFO: renamed from: g */
    public VText f54485g;

    public VoiceSweetUserItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79770a(View view) {
        f3p0.m123772a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m79771b(String str, int i) {
        bnl0.m105524M(this.f54481c, true);
        this.f54482d.setBackgroundResource(TextUtils.equals(str, "male") ? obc0.f146216V5 : obc0.f146194T5);
        this.f54481c.setBackground(jde.m144406b(TextUtils.equals(str, "male") ? -10587906 : -509799, qa00.m175859d(7.0f)));
        this.f54483e.setTypeface(Typeface.DEFAULT_BOLD);
        this.f54483e.setText(String.valueOf(i));
    }

    /* JADX INFO: renamed from: c */
    public final void m79772c(BLiveUserLevel bLiveUserLevel) {
        if (bLiveUserLevel == null || TextUtils.isEmpty(bLiveUserLevel.backendUrl)) {
            bnl0.m105524M(this.f54484f, false);
        } else {
            bnl0.m105524M(this.f54484f, true);
            i0k.m137976c(bLiveUserLevel.backendUrl, this.f54484f, kny.m150553a(bLiveUserLevel.grade) ? i0k.f112379b : i0k.f112378a);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m79773d(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser) {
        izs.m142869t("context_single_room", this.f54479a, bLiveVoiceSweetCpRecommendUser.userAvatar, bnl0.m105587w(55.0f));
        this.f54480b.setText(bLiveVoiceSweetCpRecommendUser.nickName);
        m79771b(bLiveVoiceSweetCpRecommendUser.gender, bLiveVoiceSweetCpRecommendUser.age);
        BLiveVoiceWealthHierarchy bLiveVoiceWealthHierarchy = bLiveVoiceSweetCpRecommendUser.wealthHierarchy;
        if (bLiveVoiceWealthHierarchy == null || bLiveVoiceWealthHierarchy.grade <= 0) {
            bnl0.m105524M(this.f54484f, false);
        } else {
            m79772c(((hiv) zrv.m221194l(htd0.f111521c)).m135170v(bLiveVoiceSweetCpRecommendUser.wealthHierarchy.grade));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79770a(this);
    }

    public VoiceSweetUserItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetUserItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
