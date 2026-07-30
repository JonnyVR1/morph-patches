package com.p051p1.mobile.putong.core.p058ui.purchase.showcase;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import org.jetbrains.annotations.NotNull;
import p151v.VImage;
import p151v.VText;
import p151v.VText_AutoFit;
import p153l.h550;

/* JADX INFO: loaded from: classes12.dex */
public class ODiamondPurchaseSectionView extends AbsPurchaseSectionView {

    /* JADX INFO: renamed from: b */
    public VImage f36107b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f36108c;

    /* JADX INFO: renamed from: d */
    public VText f36109d;

    /* JADX INFO: renamed from: e */
    public VText f36110e;

    /* JADX INFO: renamed from: f */
    public VText_AutoFit f36111f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f36112g;

    /* JADX INFO: renamed from: h */
    public VText_AutoFit f36113h;

    /* JADX INFO: renamed from: i */
    public TextView f36114i;

    public ODiamondPurchaseSectionView(@NonNull @NotNull Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.showcase.AbsPurchaseSectionView
    /* JADX INFO: renamed from: a */
    public void mo55507a(boolean z, boolean z2, C8928d.a aVar) {
        this.f36109d.setText(String.valueOf(aVar.m54788w()));
        this.f36110e.setText("个月");
        this.f36111f.setText(aVar.m54791z());
        this.f36113h.setText(aVar.m54764g().replace(Constants.SEPARATOR_COMMA, ""));
        this.f36114i.setText(aVar.m54783r());
    }

    /* JADX INFO: renamed from: c */
    public final void m55568c(View view) {
        h550.m133626a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55568c(this);
    }

    public ODiamondPurchaseSectionView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ODiamondPurchaseSectionView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
