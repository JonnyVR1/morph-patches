package com.p000p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.tantanapp.common.utils.NullChecker;
import l.bkb0;
import l.qib0;
import l.t100;
import l.unh;
import l.x2c0;
import p009l.da80;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FeedPoiCardItemMomentInfoView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public FeedPoiCardItemMomentInfoView f5172a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f5173b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f5174c;

    /* JADX INFO: renamed from: d */
    public VText f5175d;

    /* JADX INFO: renamed from: e */
    public VText f5176e;

    public FeedPoiCardItemMomentInfoView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7367a(View view) {
        unh.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7368b(da80 da80Var) {
        this.f5175d.setText(da80Var.f11696c.value);
        if (NullChecker.a(da80Var.f11696c.location)) {
            this.f5176e.setText(da80Var.f11696c.location.name);
        }
        if (NullChecker.a(da80Var.f11697d) && NullChecker.a(da80Var.f11697d.emotion) && !TextUtils.isEmpty(da80Var.f11697d.emotion.emojiUrl)) {
            bkb0 bkb0Var = qib0.G;
            VDraweeView vDraweeView = this.f5174c;
            String str = da80Var.f11697d.emotion.emojiUrl;
            int i = t100.v;
            bkb0Var.I0(vDraweeView, str, i, i);
            return;
        }
        String str2 = "res://" + getContext().getPackageName() + "/" + x2c0.sj;
        bkb0 bkb0Var2 = qib0.G;
        VDraweeView vDraweeView2 = this.f5174c;
        int i2 = t100.v;
        bkb0Var2.I0(vDraweeView2, str2, i2, i2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7367a(this);
    }

    public FeedPoiCardItemMomentInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiCardItemMomentInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
