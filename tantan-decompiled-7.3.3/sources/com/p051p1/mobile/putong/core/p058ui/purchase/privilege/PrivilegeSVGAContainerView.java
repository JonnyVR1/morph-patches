package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import p153l.a690;
import p153l.c17;
import p153l.nj90;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeSVGAContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f35944a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeSVGAContainerView$a */
    public class C8960a extends AnimListener {
        public C8960a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeSVGAContainerView$b */
    public class C8961b extends AnimListener {
        public C8961b() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeSVGAContainerView$c */
    public class C8962c extends AnimListener {
        public C8962c() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
        }
    }

    public PrivilegeSVGAContainerView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55451a(View view) {
        nj90.m163409a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m55452b(a690 a690Var, PurchaseType purchaseType) {
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        String str = userM116600p9.m61308fp().profileBig().formatted();
        if (!TextUtils.isEmpty(str)) {
            sVGADynamicEntity.setDynamicImage(str, "head01");
        }
        SVGALoader.with(getContext()).from(userM116600p9.isFemale() ? "https://auto.tancdn.com/v1/raw/a512b19c-5a9b-4d0f-8b6b-16ab2638077d14.pdf" : "https://auto.tancdn.com/v1/raw/111f5946-befb-45c1-875d-c4127848ca3f14.pdf").autoPlay(false).repeatCount(1).dynamic(sVGADynamicEntity).animListener(new C8960a()).into(this.f35944a);
    }

    /* JADX INFO: renamed from: c */
    public void m55453c(a690 a690Var, PurchaseType purchaseType) {
        m55455e(qa00.m175859d(140.0f));
        SVGALoader.with(getContext()).from("https://fe-static.tancdn.com/v1/raw/84570b50-d8bb-472f-b054-29051c568dec14.svga").autoPlay(false).repeatCount(1).animListener(new C8962c()).into(this.f35944a);
    }

    /* JADX INFO: renamed from: d */
    public void m55454d(a690 a690Var, PurchaseType purchaseType) {
        m55455e(qa00.m175859d(140.0f));
        SVGALoader.with(getContext()).from(c17.m107528u0() ? "https://fe-static.tancdn.com/v1/raw/8aebaed7-dff9-4bc9-9693-f2eb3509473214.svga" : "https://fe-static.tancdn.com/v1/raw/fc24b12c-e55f-404c-8da2-a7916aacc4a814.svga").autoPlay(false).repeatCount(1).animListener(new C8961b()).into(this.f35944a);
    }

    /* JADX INFO: renamed from: e */
    public final void m55455e(int i) {
        ViewGroup.LayoutParams layoutParams = this.f35944a.getLayoutParams();
        if (layoutParams.height != i) {
            layoutParams.height = i;
            this.f35944a.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m55456f() {
        this.f35944a.startAnimation();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55451a(this);
    }

    public PrivilegeSVGAContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeSVGAContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
