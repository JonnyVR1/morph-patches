package com.p046p1.mobile.putong.live.external.intl.common.gameoperation;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveGameOperationConfig;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantanapp.common.utils.CrashHelper;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.e30;
import p149l.hxs;
import p149l.kin;
import p149l.mep0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class IntlGameOperationItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public IntlGameOperationItemView f45546a;

    /* JADX INFO: renamed from: b */
    public VFrame f45547b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f45548c;

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f45549d;

    /* JADX INFO: renamed from: e */
    public GradientDrawable f45550e;

    /* JADX INFO: renamed from: f */
    public e30<BLiveGameOperationConfig> f45551f;

    public IntlGameOperationItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m69932b(View view) {
        kin.m146098a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m69933c(BLiveGameOperationConfig bLiveGameOperationConfig, View view) {
        e30<BLiveGameOperationConfig> e30Var = this.f45551f;
        if (e30Var != null) {
            e30Var.call(bLiveGameOperationConfig);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m69934d(final BLiveGameOperationConfig bLiveGameOperationConfig) {
        if (bLiveGameOperationConfig == null) {
            return;
        }
        xdl0.m208344M(this.f45549d, bLiveGameOperationConfig.isSvga);
        xdl0.m208344M(this.f45548c, !bLiveGameOperationConfig.isSvga);
        if (!TextUtils.isEmpty(bLiveGameOperationConfig.icon)) {
            if (bLiveGameOperationConfig.isSvga) {
                this.f45549d.m68500j(bLiveGameOperationConfig.icon, -1);
            } else {
                hxs.m133406s("context_single_room", this.f45548c, bLiveGameOperationConfig.icon);
            }
        }
        try {
            this.f45550e.setColors(new int[]{Color.parseColor(bLiveGameOperationConfig.startBackgroundColor), Color.parseColor(bLiveGameOperationConfig.endBackgroundColor)});
            this.f45546a.setBackground(this.f45550e);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        xdl0.m208329E0(this.f45546a, new View.OnClickListener() { // from class: l.jin
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118118a.m69933c(bLiveGameOperationConfig, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69932b(this);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f45550e = gradientDrawable;
        gradientDrawable.setGradientType(0);
        this.f45550e.setCornerRadius(t100.m186890d(12.0f));
        this.f45550e.setOrientation(GradientDrawable.Orientation.TL_BR);
        mep0.m154301c1(this.f45547b, 0, 0, 0, 0, t100.m186890d(8.0f));
    }

    public void setAction1(e30<BLiveGameOperationConfig> e30Var) {
        this.f45551f = e30Var;
    }

    public IntlGameOperationItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlGameOperationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
