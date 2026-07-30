package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.campaignBanner;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VText;
import p149l.d5c0;
import p149l.hxs;
import p149l.n1s;

/* JADX INFO: loaded from: classes13.dex */
public class LiveCampaignBannerItemView extends ConstraintLayout {
    public VDraweeView bgView;
    public VButton btn;
    public VDraweeView pic;
    public VText subTitle;
    public VText title;

    public LiveCampaignBannerItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public void m67430h0(n1s.C18603a c18603a) {
        hxs.m133406s("context_square", this.pic, c18603a.pic);
        hxs.m133406s("context_square", this.bgView, c18603a.bgUrl);
        this.title.setText(c18603a.mainTitle);
        this.subTitle.setText(c18603a.subTitle);
        this.btn.setText(c18603a.btnText);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.pic = (VDraweeView) findViewById(d5c0.f84517v0);
        this.title = (VText) findViewById(d5c0.f84457Z0);
        this.subTitle = (VText) findViewById(d5c0.f84427K0);
        this.btn = (VButton) findViewById(d5c0.f84516v);
        this.bgView = (VDraweeView) findViewById(d5c0.f84508r);
    }

    public LiveCampaignBannerItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveCampaignBannerItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
