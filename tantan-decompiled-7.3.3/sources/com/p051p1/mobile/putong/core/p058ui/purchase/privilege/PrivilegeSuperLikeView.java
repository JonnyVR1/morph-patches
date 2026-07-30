package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import p151v.AutoVDraweeView;
import p153l.bkq;
import p153l.c17;
import p153l.jbc0;
import p153l.rbb0;
import p153l.sj90;
import p153l.uqb0;
import p153l.wj90;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeSuperLikeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f35953a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f35954b;

    /* JADX INFO: renamed from: c */
    public ImageView f35955c;

    public PrivilegeSuperLikeView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55461a(View view) {
        sj90.m186064a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m55462b() {
        this.f35953a.setImageUrl(CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url);
        if (!NullChecker.m82486a(rbb0.m180737j())) {
            uqb0.f180374G.m127138Y0(this.f35954b, c17.m107528u0() ? jbc0.f119831xc : jbc0.f119817wc);
            return;
        }
        boolean zM206620c = wj90.m206620c(rbb0.m180737j());
        AutoVDraweeView autoVDraweeView = this.f35954b;
        if (zM206620c) {
            autoVDraweeView.m224134y(rbb0.m180737j().m61308fp().url, new bkq(4, 15));
        } else {
            autoVDraweeView.setImageUrl(rbb0.m180737j().m61308fp().url);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55461a(this);
    }

    public PrivilegeSuperLikeView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeSuperLikeView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
