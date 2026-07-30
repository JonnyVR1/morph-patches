package com.p051p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;
import p153l.dbc0;
import p153l.fsb0;
import p153l.ji80;
import p153l.jph;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiCardItemMomentInfoView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public FeedPoiCardItemMomentInfoView f27136a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f27137b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f27138c;

    /* JADX INFO: renamed from: d */
    public VText f27139d;

    /* JADX INFO: renamed from: e */
    public VText f27140e;

    public FeedPoiCardItemMomentInfoView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m44163a(View view) {
        jph.m146499a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m44164b(ji80 ji80Var) {
        this.f27139d.setText(ji80Var.f121051c.value);
        if (NullChecker.m82486a(ji80Var.f121051c.location)) {
            this.f27140e.setText(ji80Var.f121051c.location.name);
        }
        if (NullChecker.m82486a(ji80Var.f121052d) && NullChecker.m82486a(ji80Var.f121052d.emotion) && !TextUtils.isEmpty(ji80Var.f121052d.emotion.emojiUrl)) {
            fsb0 fsb0Var = uqb0.f180374G;
            VDraweeView vDraweeView = this.f27138c;
            String str = ji80Var.f121052d.emotion.emojiUrl;
            int i = qa00.f156335v;
            fsb0Var.m127109I0(vDraweeView, str, i, i);
            return;
        }
        String str2 = "res://" + getContext().getPackageName() + "/" + dbc0.f87026gk;
        fsb0 fsb0Var2 = uqb0.f180374G;
        VDraweeView vDraweeView2 = this.f27138c;
        int i2 = qa00.f156335v;
        fsb0Var2.m127109I0(vDraweeView2, str2, i2, i2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44163a(this);
    }

    public FeedPoiCardItemMomentInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiCardItemMomentInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
