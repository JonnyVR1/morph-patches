package com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.header;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.arch.card.carddata.LiveQuickEntryCardData;
import p151v.VDraweeView;
import p151v.VLinear;
import p153l.bnl0;
import p153l.i4g0;
import p153l.izs;
import p153l.qa00;
import p153l.r7v;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVoiceInternalQuickEntryItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public LiveVoiceInternalQuickEntryItemView f46368c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f46369d;

    /* JADX INFO: renamed from: e */
    public TextView f46370e;

    /* JADX INFO: renamed from: f */
    public TextView f46371f;

    public LiveVoiceInternalQuickEntryItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m71074r() {
        int iM105592y0 = (bnl0.m105592y0() - qa00.f156336w) / 3;
        float f = iM105592y0;
        int i = (int) (f / 1.9333333f);
        bnl0.m105507D0(iM105592y0, this.f46368c);
        bnl0.m105505C0(this.f46368c, i);
        bnl0.m105507D0((int) ((f * 40.0f) / 116.0f), this.f46369d);
        bnl0.m105505C0(this.f46369d, (int) ((i * 40.0f) / 60.0f));
    }

    /* JADX INFO: renamed from: P */
    public final void m71075P(View view) {
        r7v.m180164a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final Drawable m71076Q(String str) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TR_BL);
        gradientDrawable.setCornerRadius(qa00.m175859d(10.0f));
        gradientDrawable.setGradientType(0);
        gradientDrawable.setColor(Color.parseColor(str));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: R */
    public void m71077R(LiveQuickEntryCardData liveQuickEntryCardData) {
        this.f46370e.setText(liveQuickEntryCardData.getTitle());
        this.f46371f.setText(liveQuickEntryCardData.getSubTitle());
        this.f46368c.setBackground(m71076Q(liveQuickEntryCardData.getBgColor()));
        izs.m142868s("context_square", this.f46369d, liveQuickEntryCardData.getIcon());
        i4g0.m138527y("e_audio_shortcut", "p_audio_explore_recommend", liveQuickEntryCardData.getTrackData());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71075P(this);
        m71074r();
    }

    public LiveVoiceInternalQuickEntryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceInternalQuickEntryItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
