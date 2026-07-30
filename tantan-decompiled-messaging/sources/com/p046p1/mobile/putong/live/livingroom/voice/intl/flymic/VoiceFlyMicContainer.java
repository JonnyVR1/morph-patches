package com.p046p1.mobile.putong.live.livingroom.voice.intl.flymic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveDynamicEffectExtend;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlFlyMicEffectConfig;
import com.p046p1.mobile.putong.live.base.view.XEGiftView;
import p149l.dqe;
import p149l.fge;
import p149l.o6n0;
import p149l.s7m;
import p149l.v6n0;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceFlyMicContainer extends FrameLayout implements s7m<v6n0> {

    /* JADX INFO: renamed from: a */
    public XEGiftView f53143a;

    public VoiceFlyMicContainer(@NonNull Context context) {
        super(context);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final BLiveDynamicEffectExtend m78146b(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig) {
        BLiveDynamicEffectExtend bLiveDynamicEffectExtendNew_ = BLiveDynamicEffectExtend.new_();
        bLiveDynamicEffectExtendNew_.key = "user_pos";
        bLiveDynamicEffectExtendNew_.value = vwb.m200324f0(vwb.m200307U(vwb.m200324f0(Integer.valueOf(bLiveIntlFlyMicEffectConfig.startPosition[0]), Integer.valueOf(bLiveIntlFlyMicEffectConfig.startPosition[1])), Constants.SEPARATOR_COMMA), vwb.m200307U(vwb.m200324f0(Integer.valueOf(bLiveIntlFlyMicEffectConfig.endPosition[0]), Integer.valueOf(bLiveIntlFlyMicEffectConfig.endPosition[1])), Constants.SEPARATOR_COMMA));
        return bLiveDynamicEffectExtendNew_;
    }

    /* JADX INFO: renamed from: c */
    public void m78147c(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig) {
        if (this.f53143a == null) {
            this.f53143a = new XEGiftView(getContext());
        }
        if (this.f53143a.getParent() == null) {
            XEGiftView xEGiftView = this.f53143a;
            int i = xdl0.f192403e;
            addView(xEGiftView, i, i);
        }
        BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfigMo223809clone = bLiveIntlFlyMicEffectConfig.mo223809clone();
        bLiveIntlFlyMicEffectConfigMo223809clone.dynamicEffectExtends.add(m78146b(bLiveIntlFlyMicEffectConfig));
        fge.m121215s(this.f53143a, new dqe(bLiveIntlFlyMicEffectConfigMo223809clone.resourceId).m113016j(bLiveIntlFlyMicEffectConfigMo223809clone.dynamicEffectExtends));
    }

    /* JADX INFO: renamed from: d */
    public void m78148d(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig, o6n0 o6n0Var, int i) {
        o6n0Var.m162938v(bLiveIntlFlyMicEffectConfig, i, this);
    }

    @Override // p149l.s7m
    public void destroy() {
        XEGiftView xEGiftView = this.f53143a;
        if (xEGiftView != null) {
            xEGiftView.m68844j();
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public VoiceFlyMicContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceFlyMicContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(v6n0 v6n0Var) {
    }
}
