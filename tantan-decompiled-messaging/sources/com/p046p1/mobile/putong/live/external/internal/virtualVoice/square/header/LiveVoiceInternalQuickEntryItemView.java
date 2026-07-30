package com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.header;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.arch.card.carddata.LiveQuickEntryCardData;
import p147v.VDraweeView;
import p147v.VLinear;
import p149l.hxs;
import p149l.q5v;
import p149l.t100;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceInternalQuickEntryItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public LiveVoiceInternalQuickEntryItemView f45520c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f45521d;

    /* JADX INFO: renamed from: e */
    public TextView f45522e;

    /* JADX INFO: renamed from: f */
    public TextView f45523f;

    public LiveVoiceInternalQuickEntryItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m69891r() {
        int iM208412y0 = (xdl0.m208412y0() - t100.f167274w) / 3;
        float f = iM208412y0;
        int i = (int) (f / 1.9333333f);
        xdl0.m208327D0(iM208412y0, this.f45520c);
        xdl0.m208325C0(this.f45520c, i);
        xdl0.m208327D0((int) ((f * 40.0f) / 116.0f), this.f45521d);
        xdl0.m208325C0(this.f45521d, (int) ((i * 40.0f) / 60.0f));
    }

    /* JADX INFO: renamed from: P */
    public final void m69892P(View view) {
        q5v.m173101a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final Drawable m69893Q(String str) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TR_BL);
        gradientDrawable.setCornerRadius(t100.m186890d(10.0f));
        gradientDrawable.setGradientType(0);
        gradientDrawable.setColor(Color.parseColor(str));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: R */
    public void m69894R(LiveQuickEntryCardData liveQuickEntryCardData) {
        this.f45522e.setText(liveQuickEntryCardData.getTitle());
        this.f45523f.setText(liveQuickEntryCardData.getSubTitle());
        this.f45520c.setBackground(m69893Q(liveQuickEntryCardData.getBgColor()));
        hxs.m133406s("context_square", this.f45521d, liveQuickEntryCardData.getIcon());
        zvf0.m220403y("e_audio_shortcut", "p_audio_explore_recommend", liveQuickEntryCardData.getTrackData());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69892P(this);
        m69891r();
    }

    public LiveVoiceInternalQuickEntryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceInternalQuickEntryItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
