package com.p046p1.mobile.putong.core.p053ui.purchase.showcase;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import org.jetbrains.annotations.NotNull;
import p147v.VImage;
import p147v.VText;
import p147v.VText_AutoFit;
import p149l.sw40;

/* JADX INFO: loaded from: classes9.dex */
public class ODiamondPurchaseSectionView extends AbsPurchaseSectionView {

    /* JADX INFO: renamed from: b */
    public VImage f35259b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f35260c;

    /* JADX INFO: renamed from: d */
    public VText f35261d;

    /* JADX INFO: renamed from: e */
    public VText f35262e;

    /* JADX INFO: renamed from: f */
    public VText_AutoFit f35263f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f35264g;

    /* JADX INFO: renamed from: h */
    public VText_AutoFit f35265h;

    /* JADX INFO: renamed from: i */
    public TextView f35266i;

    public ODiamondPurchaseSectionView(@NonNull @NotNull Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.purchase.showcase.AbsPurchaseSectionView
    /* JADX INFO: renamed from: a */
    public void mo54324a(boolean z, boolean z2, C8765d.a aVar) {
        this.f35261d.setText(String.valueOf(aVar.m53605w()));
        this.f35262e.setText("个月");
        this.f35263f.setText(aVar.m53608z());
        this.f35265h.setText(aVar.m53581g().replace(Constants.SEPARATOR_COMMA, ""));
        this.f35266i.setText(aVar.m53600r());
    }

    /* JADX INFO: renamed from: c */
    public final void m54385c(View view) {
        sw40.m186124a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54385c(this);
    }

    public ODiamondPurchaseSectionView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ODiamondPurchaseSectionView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
