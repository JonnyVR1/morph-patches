package com.p051p1.mobile.putong.live.external.page.rights.list.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightMedalTipsView;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p151v.VText;
import p153l.bcd0;
import p153l.biv;
import p153l.mbc0;
import p153l.mbs;
import p153l.qa00;
import p153l.zbd0;

/* JADX INFO: loaded from: classes9.dex */
public class RightMedalTipsView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RightMedalTipsView f46938a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f46939b;

    /* JADX INFO: renamed from: c */
    public VText f46940c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f46941d;

    /* JADX INFO: renamed from: e */
    public VText f46942e;

    /* JADX INFO: renamed from: f */
    public CommonMedalView f46943f;

    /* JADX INFO: renamed from: g */
    public CommonMedalView f46944g;

    /* JADX INFO: renamed from: h */
    public TextView f46945h;

    /* JADX INFO: renamed from: i */
    public TextView f46946i;

    /* JADX INFO: renamed from: j */
    public final int f46947j;

    /* JADX INFO: renamed from: k */
    public final int f46948k;

    /* JADX INFO: renamed from: l */
    public final int f46949l;

    public RightMedalTipsView(Context context) {
        super(context);
        this.f46947j = qa00.m175859d(4.0f);
        this.f46948k = qa00.m175859d(6.0f);
        this.f46949l = qa00.m175859d(14.0f);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m71806a(BLiveRightItem bLiveRightItem, BLiveRightItem bLiveRightItem2) {
        return (int) (bLiveRightItem.updatedTimeInSeconds - bLiveRightItem2.updatedTimeInSeconds);
    }

    /* JADX INFO: renamed from: b */
    public final void m71807b(View view) {
        bcd0.m103494a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m71808c(zbd0 zbd0Var) {
        int childCount = this.f46941d.getChildCount();
        if (childCount == 0) {
            this.f46941d.addView(this.f46945h, m71809d(0));
            if (zbd0Var.m219188I()) {
                return;
            }
            this.f46941d.addView(this.f46946i, m71809d(this.f46947j));
            return;
        }
        if (childCount != 1 || zbd0Var.m219188I()) {
            return;
        }
        this.f46941d.addView(this.f46946i, m71809d(this.f46947j));
    }

    /* JADX INFO: renamed from: d */
    public final LinearLayout.LayoutParams m71809d(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, this.f46949l);
        if (i > 0) {
            layoutParams.leftMargin = i;
        }
        return layoutParams;
    }

    /* JADX INFO: renamed from: e */
    public final TextView m71810e(int i) {
        TextView textView = new TextView(getContext());
        textView.setText(i);
        int i2 = this.f46948k;
        textView.setPadding(i2, 0, i2, 0);
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setTextSize(10.0f);
        textView.setBackgroundResource(mbc0.f135675e);
        return textView;
    }

    /* JADX INFO: renamed from: f */
    public final void m71811f() {
        this.f46943f = new CommonMedalView(getContext());
        this.f46944g = new CommonMedalView(getContext());
        this.f46945h = m71810e(R$string.f44996Z0);
        this.f46946i = m71810e(R$string.f44999a1);
    }

    /* JADX INFO: renamed from: g */
    public final void m71812g(zbd0 zbd0Var) {
        int size = zbd0Var.m219187H().size();
        StringBuilder sb = new StringBuilder();
        sb.append(size);
        sb.append("/");
        sb.append(zbd0Var.m219188I() ? 1 : 2);
        this.f46942e.setText(String.format(getContext().getString(R$string.f45005c1), sb.toString()));
        this.f46942e.setTextColor(Color.parseColor(size > 0 ? "#212121" : "#999999"));
    }

    /* JADX INFO: renamed from: h */
    public final void m71813h(BLiveRightItem bLiveRightItem, CommonMedalView commonMedalView) {
        biv.m104524i(commonMedalView, 0, bLiveRightItem.getThumbnailUrl(), bLiveRightItem.dynamicUrl);
    }

    /* JADX INFO: renamed from: i */
    public final void m71814i(zbd0 zbd0Var) {
        List<BLiveRightItem> listM219187H = zbd0Var.m219187H();
        int size = listM219187H.size();
        this.f46941d.removeAllViews();
        Collections.sort(listM219187H, new Comparator() { // from class: l.acd0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return RightMedalTipsView.m71806a((BLiveRightItem) obj, (BLiveRightItem) obj2);
            }
        });
        if (size == 1) {
            m71813h(listM219187H.get(0), this.f46943f);
            this.f46941d.addView(this.f46943f, m71809d(0));
        } else if (size == 2) {
            m71813h(listM219187H.get(0), this.f46943f);
            m71813h(listM219187H.get(1), this.f46944g);
            this.f46941d.addView(this.f46943f, m71809d(0));
            this.f46941d.addView(this.f46944g, m71809d(this.f46947j));
        }
        m71808c(zbd0Var);
    }

    /* JADX INFO: renamed from: j */
    public final void m71815j() {
        this.f46940c.setText(mbs.m157824J().name);
    }

    /* JADX INFO: renamed from: k */
    public void m71816k(zbd0 zbd0Var) {
        m71815j();
        m71814i(zbd0Var);
        m71812g(zbd0Var);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71807b(this);
        m71811f();
    }

    public RightMedalTipsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46947j = qa00.m175859d(4.0f);
        this.f46948k = qa00.m175859d(6.0f);
        this.f46949l = qa00.m175859d(14.0f);
    }

    public RightMedalTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46947j = qa00.m175859d(4.0f);
        this.f46948k = qa00.m175859d(6.0f);
        this.f46949l = qa00.m175859d(14.0f);
    }
}
