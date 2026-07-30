package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.feed;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.ft5;
import p153l.izs;
import p153l.jdc0;
import p153l.jyb;
import p153l.mbc0;
import p153l.mes;
import p153l.ner;
import p153l.qa00;
import p153l.qcj;
import p153l.qnp0;
import p153l.vl4;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceFeedCardView extends FrameLayout {
    private TextView attributeTextView;
    private LiveAvatarNumberViewNew avatarNumberView;
    private mes cardData;
    private VDraweeView staticBgView;
    private VDraweeView subTitleIcon;
    private TextView subTitleView;
    private TextView titleView;

    public LiveVoiceFeedCardView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m68644a(mes mesVar, ner nerVar, ft5 ft5Var) {
        this.cardData = mesVar;
        bnl0.m105524M(this.staticBgView, false);
        bnl0.m105524M(this.subTitleIcon, false);
        vl4.m201592d(this.attributeTextView, mesVar.m158087k());
        vl4.m201592d(this.subTitleView, mesVar.m158083g());
        vl4.m201594f(mesVar.m158085i(), mesVar.m158086j(), ft5Var, this.titleView, nerVar);
        this.avatarNumberView.setImageData(jyb.m147486Q(mesVar.m158080d(), new qcj() { // from class: l.i6v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((vzk) obj).m204114a();
            }
        }));
        this.avatarNumberView.setNumberView(mesVar.m158079c());
        this.avatarNumberView.getNumberView().setBackgroundResource(mbc0.f135712y);
        this.avatarNumberView.getNumberView().setTypeface(Typeface.defaultFromStyle(0));
        if (!TextUtils.isEmpty(mesVar.m158084h())) {
            bnl0.m105524M(this.subTitleIcon, true);
            VDraweeView vDraweeView = this.subTitleIcon;
            String strM158084h = mesVar.m158084h();
            int i = qa00.f156326m;
            izs.m142870u("context_square", vDraweeView, strM158084h, i, i);
        }
        if (TextUtils.isEmpty(mesVar.m158077a())) {
            return;
        }
        bnl0.m105524M(this.staticBgView, true);
        izs.m142870u("context_square", this.staticBgView, mesVar.m158077a(), qa00.f156309V, qa00.f156311X);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.attributeTextView = (TextView) findViewById(jdc0.f120200i);
        this.titleView = (TextView) findViewById(jdc0.f120175Z0);
        this.avatarNumberView = (LiveAvatarNumberViewNew) findViewById(jdc0.f120218o);
        this.staticBgView = (VDraweeView) findViewById(jdc0.f120226r);
        this.subTitleIcon = (VDraweeView) findViewById(jdc0.f120149M0);
        this.subTitleView = (TextView) findViewById(jdc0.f120147L0);
        int iM105592y0 = (int) ((((bnl0.m105592y0() - qa00.f156330q) / 2) * 200.0f) / 176.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = iM105592y0;
        setLayoutParams(layoutParams);
        qnp0.m177261d1(this, qa00.f156322i);
    }

    public LiveVoiceFeedCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceFeedCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
