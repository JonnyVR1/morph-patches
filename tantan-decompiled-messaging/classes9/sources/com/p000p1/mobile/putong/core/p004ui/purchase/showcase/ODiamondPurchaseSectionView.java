package com.p000p1.mobile.putong.core.p004ui.purchase.showcase;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.ui.purchase.d;
import l.sw40;
import org.jetbrains.annotations.NotNull;
import v.VImage;
import v.VText;
import v.VText_AutoFit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ODiamondPurchaseSectionView extends AbsPurchaseSectionView {

    /* JADX INFO: renamed from: b */
    public VImage f5040b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f5041c;

    /* JADX INFO: renamed from: d */
    public VText f5042d;

    /* JADX INFO: renamed from: e */
    public VText f5043e;

    /* JADX INFO: renamed from: f */
    public VText_AutoFit f5044f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f5045g;

    /* JADX INFO: renamed from: h */
    public VText_AutoFit f5046h;

    /* JADX INFO: renamed from: i */
    public TextView f5047i;

    public ODiamondPurchaseSectionView(@NonNull @NotNull Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.purchase.showcase.AbsPurchaseSectionView
    /* JADX INFO: renamed from: a */
    public void mo7659a(boolean z, boolean z2, d.a aVar) {
        this.f5042d.setText(String.valueOf(aVar.w()));
        this.f5043e.setText("个月");
        this.f5044f.setText(aVar.z());
        this.f5046h.setText(aVar.g().replace(",", ""));
        this.f5047i.setText(aVar.r());
    }

    /* JADX INFO: renamed from: c */
    public final void m7720c(View view) {
        sw40.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7720c(this);
    }

    public ODiamondPurchaseSectionView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ODiamondPurchaseSectionView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
