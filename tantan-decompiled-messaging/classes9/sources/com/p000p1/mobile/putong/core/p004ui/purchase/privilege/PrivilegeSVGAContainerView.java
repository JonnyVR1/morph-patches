package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import l.jb90;
import l.t100;
import l.zz6;
import p006l.wx80;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeSVGAContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f4877a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeSVGAContainerView$a */
    public class C0233a extends AnimListener {
        public C0233a() {
        }

        public void onFinished() {
            super.onFinished();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeSVGAContainerView$b */
    public class C0234b extends AnimListener {
        public C0234b() {
        }

        public void onFinished() {
            super.onFinished();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeSVGAContainerView$c */
    public class C0235c extends AnimListener {
        public C0235c() {
        }

        public void onFinished() {
            super.onFinished();
        }
    }

    public PrivilegeSVGAContainerView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7603a(View view) {
        jb90.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7604b(wx80 wx80Var, PurchaseType purchaseType) {
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        String str = userM21490p9.fp().profileBig().formatted();
        if (!TextUtils.isEmpty(str)) {
            sVGADynamicEntity.setDynamicImage(str, "head01");
        }
        SVGALoader.with(getContext()).from(userM21490p9.isFemale() ? "https://auto.tancdn.com/v1/raw/a512b19c-5a9b-4d0f-8b6b-16ab2638077d14.pdf" : "https://auto.tancdn.com/v1/raw/111f5946-befb-45c1-875d-c4127848ca3f14.pdf").autoPlay(false).repeatCount(1).dynamic(sVGADynamicEntity).animListener(new C0233a()).into(this.f4877a);
    }

    /* JADX INFO: renamed from: c */
    public void m7605c(wx80 wx80Var, PurchaseType purchaseType) {
        m7607e(t100.d(140.0f));
        SVGALoader.with(getContext()).from("https://fe-static.tancdn.com/v1/raw/84570b50-d8bb-472f-b054-29051c568dec14.svga").autoPlay(false).repeatCount(1).animListener(new C0235c()).into(this.f4877a);
    }

    /* JADX INFO: renamed from: d */
    public void m7606d(wx80 wx80Var, PurchaseType purchaseType) {
        m7607e(t100.d(140.0f));
        SVGALoader.with(getContext()).from(zz6.u0() ? "https://fe-static.tancdn.com/v1/raw/8aebaed7-dff9-4bc9-9693-f2eb3509473214.svga" : "https://fe-static.tancdn.com/v1/raw/fc24b12c-e55f-404c-8da2-a7916aacc4a814.svga").autoPlay(false).repeatCount(1).animListener(new C0234b()).into(this.f4877a);
    }

    /* JADX INFO: renamed from: e */
    public final void m7607e(int i) {
        ViewGroup.LayoutParams layoutParams = this.f4877a.getLayoutParams();
        if (layoutParams.height != i) {
            layoutParams.height = i;
            this.f4877a.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m7608f() {
        this.f4877a.startAnimation();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7603a(this);
    }

    public PrivilegeSVGAContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeSVGAContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
