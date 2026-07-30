package com.p051p1.mobile.putong.live.livingroom.voice.intl.flymic;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveDynamicEffectExtend;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlFlyMicEffectConfig;
import com.p051p1.mobile.putong.live.base.view.XEGiftView;
import p153l.bnl0;
import p153l.hre;
import p153l.iam;
import p153l.jhe;
import p153l.jyb;
import p153l.sfn0;
import p153l.zfn0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceFlyMicContainer extends FrameLayout implements iam<zfn0> {

    /* JADX INFO: renamed from: a */
    public XEGiftView f53991a;

    public VoiceFlyMicContainer(@NonNull Context context) {
        super(context);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final BLiveDynamicEffectExtend m79329b(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig) {
        BLiveDynamicEffectExtend bLiveDynamicEffectExtendNew_ = BLiveDynamicEffectExtend.new_();
        bLiveDynamicEffectExtendNew_.key = "user_pos";
        bLiveDynamicEffectExtendNew_.value = jyb.m147507f0(jyb.m147490U(jyb.m147507f0(Integer.valueOf(bLiveIntlFlyMicEffectConfig.startPosition[0]), Integer.valueOf(bLiveIntlFlyMicEffectConfig.startPosition[1])), Constants.SEPARATOR_COMMA), jyb.m147490U(jyb.m147507f0(Integer.valueOf(bLiveIntlFlyMicEffectConfig.endPosition[0]), Integer.valueOf(bLiveIntlFlyMicEffectConfig.endPosition[1])), Constants.SEPARATOR_COMMA));
        return bLiveDynamicEffectExtendNew_;
    }

    /* JADX INFO: renamed from: c */
    public void m79330c(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig) {
        if (this.f53991a == null) {
            this.f53991a = new XEGiftView(getContext());
        }
        if (this.f53991a.getParent() == null) {
            XEGiftView xEGiftView = this.f53991a;
            int i = bnl0.f77544e;
            addView(xEGiftView, i, i);
        }
        BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfigMo225055clone = bLiveIntlFlyMicEffectConfig.mo225055clone();
        bLiveIntlFlyMicEffectConfigMo225055clone.dynamicEffectExtends.add(m79329b(bLiveIntlFlyMicEffectConfig));
        jhe.m144898s(this.f53991a, new hre(bLiveIntlFlyMicEffectConfigMo225055clone.resourceId).m136827j(bLiveIntlFlyMicEffectConfigMo225055clone.dynamicEffectExtends));
    }

    /* JADX INFO: renamed from: d */
    public void m79331d(BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfig, sfn0 sfn0Var, int i) {
        sfn0Var.m185657v(bLiveIntlFlyMicEffectConfig, i, this);
    }

    @Override // p153l.iam
    public void destroy() {
        XEGiftView xEGiftView = this.f53991a;
        if (xEGiftView != null) {
            xEGiftView.m70027j();
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public VoiceFlyMicContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceFlyMicContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(zfn0 zfn0Var) {
    }
}
