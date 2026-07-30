package com.p046p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bkb0;
import p149l.da80;
import p149l.qib0;
import p149l.t100;
import p149l.unh;
import p149l.x2c0;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiCardItemMomentInfoView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public FeedPoiCardItemMomentInfoView f26394a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f26395b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f26396c;

    /* JADX INFO: renamed from: d */
    public VText f26397d;

    /* JADX INFO: renamed from: e */
    public VText f26398e;

    public FeedPoiCardItemMomentInfoView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m43152a(View view) {
        unh.m194422a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m43153b(da80 da80Var) {
        this.f26397d.setText(da80Var.f85199c.value);
        if (NullChecker.m81303a(da80Var.f85199c.location)) {
            this.f26398e.setText(da80Var.f85199c.location.name);
        }
        if (NullChecker.m81303a(da80Var.f85200d) && NullChecker.m81303a(da80Var.f85200d.emotion) && !TextUtils.isEmpty(da80Var.f85200d.emotion.emojiUrl)) {
            bkb0 bkb0Var = qib0.f154691G;
            VDraweeView vDraweeView = this.f26396c;
            String str = da80Var.f85200d.emotion.emojiUrl;
            int i = t100.f167273v;
            bkb0Var.m102325I0(vDraweeView, str, i, i);
            return;
        }
        String str2 = "res://" + getContext().getPackageName() + "/" + x2c0.f190558sj;
        bkb0 bkb0Var2 = qib0.f154691G;
        VDraweeView vDraweeView2 = this.f26396c;
        int i2 = t100.f167273v;
        bkb0Var2.m102325I0(vDraweeView2, str2, i2, i2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43152a(this);
    }

    public FeedPoiCardItemMomentInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiCardItemMomentInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
