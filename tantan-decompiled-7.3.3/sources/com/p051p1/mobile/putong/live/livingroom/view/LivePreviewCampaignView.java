package com.p051p1.mobile.putong.live.livingroom.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaignLink;
import com.p051p1.mobile.putong.live.base.data.BLivePageCampaign;
import com.p051p1.mobile.putong.live.livingroom.view.LivePreviewCampaignView;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.ddt;
import p153l.jyb;
import p153l.qcj;
import p153l.us80;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
public class LivePreviewCampaignView extends VRelative {

    /* JADX INFO: renamed from: d */
    public RelativeLayout f52851d;

    /* JADX INFO: renamed from: e */
    public VText f52852e;

    /* JADX INFO: renamed from: f */
    public AutoRollView f52853f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f52854g;

    /* JADX INFO: renamed from: h */
    public ObjectAnimator f52855h;

    /* JADX INFO: renamed from: i */
    public us80 f52856i;

    public LivePreviewCampaignView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m77721q(y20 y20Var, BLivePageCampaign bLivePageCampaign, int i) {
        if (y20Var != null) {
            y20Var.call(bLivePageCampaign.campaignLinks.get(i));
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m77723B(View view) {
        ddt.m115366a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public void m77724H(final BLivePageCampaign bLivePageCampaign, final y20<BLiveCampaignLink> y20Var, final x20 x20Var) {
        this.f52852e.setText(bLivePageCampaign.title);
        this.f52853f.setTextList(jyb.m147486Q(bLivePageCampaign.campaignLinks, new qcj() { // from class: l.adt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveCampaignLink) obj).text;
            }
        }));
        this.f52853f.setTextStillTime(3000L);
        this.f52853f.setAnimTime(600L);
        this.f52853f.m77576h();
        this.f52853f.setOnItemClickListener(new AutoRollView.InterfaceC13079a() { // from class: l.bdt
            @Override // com.p051p1.mobile.putong.live.livingroom.view.AutoRollView.InterfaceC13079a
            /* JADX INFO: renamed from: a */
            public final void mo77577a(int i) {
                LivePreviewCampaignView.m77721q(y20Var, bLivePageCampaign, i);
            }
        });
        bnl0.m105509E0(this.f52854g, new View.OnClickListener() { // from class: l.cdt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f52855h;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f52855h.cancel();
            this.f52855h = null;
        }
        if (this.f52856i != null) {
            this.f52856i = null;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77723B(this);
    }

    public LivePreviewCampaignView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LivePreviewCampaignView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
