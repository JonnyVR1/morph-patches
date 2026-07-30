package com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.data.BLiveSkinConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveTopBarConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTab;
import p147v.VDraweeView;
import p149l.fpn0;
import p149l.fuo0;
import p149l.hxs;
import p149l.t100;
import p149l.xdl0;
import p149l.zb2;

/* JADX INFO: loaded from: classes13.dex */
public class VoiceTabView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f46528a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f46529b;

    /* JADX INFO: renamed from: c */
    public boolean f46530c;

    public VoiceTabView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m71137a(View view) {
        fuo0.m123206a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m71138b(BLiveVoiceTab bLiveVoiceTab) {
        ViewGroup.LayoutParams layoutParams = this.f46529b.getLayoutParams();
        int iM186890d = t100.m186890d(bLiveVoiceTab.width);
        if (iM186890d == 0) {
            iM186890d = t100.m186890d(72.0f);
        }
        layoutParams.width = iM186890d;
        this.f46529b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public void m71139c(boolean z, BLiveSkinConfig bLiveSkinConfig) {
        int iMo117892k;
        BLiveTopBarConfig bLiveTopBarConfig;
        TextView textView = this.f46528a;
        boolean z2 = this.f46530c;
        textView.setBackgroundResource(z ? fpn0.m122617g(z2).mo117885d() : fpn0.m122617g(z2).mo117893l());
        TextView textView2 = this.f46528a;
        if (z) {
            iMo117892k = fpn0.m122617g(this.f46530c).mo117884c();
        } else {
            iMo117892k = (bLiveSkinConfig == null || (bLiveTopBarConfig = bLiveSkinConfig.topTabBarConfig) == null || TextUtils.isEmpty(bLiveTopBarConfig.textColor)) ? fpn0.m122617g(this.f46530c).mo117892k() : zb2.m217816d(bLiveSkinConfig.topTabBarConfig.textColor);
        }
        textView2.setTextColor(iMo117892k);
        TextView textView3 = this.f46528a;
        boolean z3 = this.f46530c;
        textView3.setTextSize(z ? fpn0.m122617g(z3).mo117883b() : fpn0.m122617g(z3).mo117889h());
    }

    /* JADX INFO: renamed from: d */
    public void m71140d(BLiveVoiceTab bLiveVoiceTab, boolean z) {
        this.f46530c = z;
        boolean zIsEmpty = TextUtils.isEmpty(bLiveVoiceTab.tabSelectedUrl);
        VDraweeView vDraweeView = this.f46529b;
        if (zIsEmpty) {
            xdl0.m208344M(vDraweeView, false);
            xdl0.m208344M(this.f46528a, true);
            this.f46528a.setText(bLiveVoiceTab.name);
        } else {
            xdl0.m208344M(vDraweeView, true);
            xdl0.m208344M(this.f46528a, false);
            m71138b(bLiveVoiceTab);
            hxs.m133408u("context_square", this.f46529b, bLiveVoiceTab.tabDefaultUrl, t100.f167236K, t100.f167273v);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71137a(this);
    }

    public VoiceTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public VoiceTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
