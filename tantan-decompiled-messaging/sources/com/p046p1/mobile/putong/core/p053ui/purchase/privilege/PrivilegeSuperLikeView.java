package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import p147v.AutoVDraweeView;
import p149l.biq;
import p149l.d3c0;
import p149l.n3b0;
import p149l.ob90;
import p149l.qib0;
import p149l.sb90;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeSuperLikeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f35105a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f35106b;

    /* JADX INFO: renamed from: c */
    public ImageView f35107c;

    public PrivilegeSuperLikeView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m54278a(View view) {
        ob90.m163412a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m54279b() {
        this.f35105a.setImageUrl(CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url);
        if (!NullChecker.m81303a(n3b0.m157735j())) {
            qib0.f154691G.m102354Y0(this.f35106b, zz6.m221004u0() ? d3c0.f84176xc : d3c0.f84162wc);
            return;
        }
        boolean zM183207c = sb90.m183207c(n3b0.m157735j());
        AutoVDraweeView autoVDraweeView = this.f35106b;
        if (zM183207c) {
            autoVDraweeView.m222888y(n3b0.m157735j().m60124fp().url, new biq(4, 15));
        } else {
            autoVDraweeView.setImageUrl(n3b0.m157735j().m60124fp().url);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54278a(this);
    }

    public PrivilegeSuperLikeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeSuperLikeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
