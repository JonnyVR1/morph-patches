package com.p046p1.mobile.putong.live.livingroom.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveCampaignLink;
import com.p046p1.mobile.putong.live.base.data.BLivePageCampaign;
import com.p046p1.mobile.putong.live.livingroom.view.LivePreviewCampaignView;
import p147v.VRelative;
import p147v.VText;
import p149l.cbt;
import p149l.d30;
import p149l.e30;
import p149l.qk80;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class LivePreviewCampaignView extends VRelative {

    /* JADX INFO: renamed from: d */
    public RelativeLayout f52003d;

    /* JADX INFO: renamed from: e */
    public VText f52004e;

    /* JADX INFO: renamed from: f */
    public AutoRollView f52005f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f52006g;

    /* JADX INFO: renamed from: h */
    public ObjectAnimator f52007h;

    /* JADX INFO: renamed from: i */
    public qk80 f52008i;

    public LivePreviewCampaignView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m76538q(e30 e30Var, BLivePageCampaign bLivePageCampaign, int i) {
        if (e30Var != null) {
            e30Var.call(bLivePageCampaign.campaignLinks.get(i));
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m76540B(View view) {
        cbt.m106025a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public void m76541H(final BLivePageCampaign bLivePageCampaign, final e30<BLiveCampaignLink> e30Var, final d30 d30Var) {
        this.f52004e.setText(bLivePageCampaign.title);
        this.f52005f.setTextList(vwb.m200303Q(bLivePageCampaign.campaignLinks, new w9j() { // from class: l.zat
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveCampaignLink) obj).text;
            }
        }));
        this.f52005f.setTextStillTime(3000L);
        this.f52005f.setAnimTime(600L);
        this.f52005f.m76393h();
        this.f52005f.setOnItemClickListener(new AutoRollView.InterfaceC12916a() { // from class: l.abt
            @Override // com.p046p1.mobile.putong.live.livingroom.view.AutoRollView.InterfaceC12916a
            /* JADX INFO: renamed from: a */
            public final void mo76394a(int i) {
                LivePreviewCampaignView.m76538q(e30Var, bLivePageCampaign, i);
            }
        });
        xdl0.m208329E0(this.f52006g, new View.OnClickListener() { // from class: l.bbt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f52007h;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f52007h.cancel();
            this.f52007h = null;
        }
        if (this.f52008i != null) {
            this.f52008i = null;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76540B(this);
    }

    public LivePreviewCampaignView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LivePreviewCampaignView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
