package com.p051p1.mobile.putong.live.external.intl.common.gameoperation;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveGameOperationConfig;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantanapp.common.utils.CrashHelper;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.bnl0;
import p153l.izs;
import p153l.kkn;
import p153l.qa00;
import p153l.qnp0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class IntlGameOperationItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public IntlGameOperationItemView f46394a;

    /* JADX INFO: renamed from: b */
    public VFrame f46395b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f46396c;

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f46397d;

    /* JADX INFO: renamed from: e */
    public GradientDrawable f46398e;

    /* JADX INFO: renamed from: f */
    public y20<BLiveGameOperationConfig> f46399f;

    public IntlGameOperationItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m71115b(View view) {
        kkn.m150270a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m71116c(BLiveGameOperationConfig bLiveGameOperationConfig, View view) {
        y20<BLiveGameOperationConfig> y20Var = this.f46399f;
        if (y20Var != null) {
            y20Var.call(bLiveGameOperationConfig);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m71117d(final BLiveGameOperationConfig bLiveGameOperationConfig) {
        if (bLiveGameOperationConfig == null) {
            return;
        }
        bnl0.m105524M(this.f46397d, bLiveGameOperationConfig.isSvga);
        bnl0.m105524M(this.f46396c, !bLiveGameOperationConfig.isSvga);
        if (!TextUtils.isEmpty(bLiveGameOperationConfig.icon)) {
            if (bLiveGameOperationConfig.isSvga) {
                this.f46397d.m69683j(bLiveGameOperationConfig.icon, -1);
            } else {
                izs.m142868s("context_single_room", this.f46396c, bLiveGameOperationConfig.icon);
            }
        }
        try {
            this.f46398e.setColors(new int[]{Color.parseColor(bLiveGameOperationConfig.startBackgroundColor), Color.parseColor(bLiveGameOperationConfig.endBackgroundColor)});
            this.f46394a.setBackground(this.f46398e);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        bnl0.m105509E0(this.f46394a, new View.OnClickListener() { // from class: l.jkn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121434a.m71116c(bLiveGameOperationConfig, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71115b(this);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f46398e = gradientDrawable;
        gradientDrawable.setGradientType(0);
        this.f46398e.setCornerRadius(qa00.m175859d(12.0f));
        this.f46398e.setOrientation(GradientDrawable.Orientation.TL_BR);
        qnp0.m177260c1(this.f46395b, 0, 0, 0, 0, qa00.m175859d(8.0f));
    }

    public void setAction1(y20<BLiveGameOperationConfig> y20Var) {
        this.f46399f = y20Var;
    }

    public IntlGameOperationItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlGameOperationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
