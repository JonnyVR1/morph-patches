package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.campaignBanner;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VText;
import p153l.izs;
import p153l.jdc0;
import p153l.o3s;

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
    public void m68613h0(o3s.C19019a c19019a) {
        izs.m142868s("context_square", this.pic, c19019a.pic);
        izs.m142868s("context_square", this.bgView, c19019a.bgUrl);
        this.title.setText(c19019a.mainTitle);
        this.subTitle.setText(c19019a.subTitle);
        this.btn.setText(c19019a.btnText);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.pic = (VDraweeView) findViewById(jdc0.f120235v0);
        this.title = (VText) findViewById(jdc0.f120175Z0);
        this.subTitle = (VText) findViewById(jdc0.f120145K0);
        this.btn = (VButton) findViewById(jdc0.f120234v);
        this.bgView = (VDraweeView) findViewById(jdc0.f120226r);
    }

    public LiveCampaignBannerItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveCampaignBannerItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
