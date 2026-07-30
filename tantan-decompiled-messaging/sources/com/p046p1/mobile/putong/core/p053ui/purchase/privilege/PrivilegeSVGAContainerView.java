package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.data.User;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import p149l.jb90;
import p149l.t100;
import p149l.wx80;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeSVGAContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public SVGAnimationView f35096a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeSVGAContainerView$a */
    public class C8797a extends AnimListener {
        public C8797a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeSVGAContainerView$b */
    public class C8798b extends AnimListener {
        public C8798b() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeSVGAContainerView$c */
    public class C8799c extends AnimListener {
        public C8799c() {
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
    public final void m54268a(View view) {
        jb90.m140744a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m54269b(wx80 wx80Var, PurchaseType purchaseType) {
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        String str = userM169527p9.m60124fp().profileBig().formatted();
        if (!TextUtils.isEmpty(str)) {
            sVGADynamicEntity.setDynamicImage(str, "head01");
        }
        SVGALoader.with(getContext()).from(userM169527p9.isFemale() ? "https://auto.tancdn.com/v1/raw/a512b19c-5a9b-4d0f-8b6b-16ab2638077d14.pdf" : "https://auto.tancdn.com/v1/raw/111f5946-befb-45c1-875d-c4127848ca3f14.pdf").autoPlay(false).repeatCount(1).dynamic(sVGADynamicEntity).animListener(new C8797a()).into(this.f35096a);
    }

    /* JADX INFO: renamed from: c */
    public void m54270c(wx80 wx80Var, PurchaseType purchaseType) {
        m54272e(t100.m186890d(140.0f));
        SVGALoader.with(getContext()).from("https://fe-static.tancdn.com/v1/raw/84570b50-d8bb-472f-b054-29051c568dec14.svga").autoPlay(false).repeatCount(1).animListener(new C8799c()).into(this.f35096a);
    }

    /* JADX INFO: renamed from: d */
    public void m54271d(wx80 wx80Var, PurchaseType purchaseType) {
        m54272e(t100.m186890d(140.0f));
        SVGALoader.with(getContext()).from(zz6.m221004u0() ? "https://fe-static.tancdn.com/v1/raw/8aebaed7-dff9-4bc9-9693-f2eb3509473214.svga" : "https://fe-static.tancdn.com/v1/raw/fc24b12c-e55f-404c-8da2-a7916aacc4a814.svga").autoPlay(false).repeatCount(1).animListener(new C8798b()).into(this.f35096a);
    }

    /* JADX INFO: renamed from: e */
    public final void m54272e(int i) {
        ViewGroup.LayoutParams layoutParams = this.f35096a.getLayoutParams();
        if (layoutParams.height != i) {
            layoutParams.height = i;
            this.f35096a.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m54273f() {
        this.f35096a.startAnimation();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54268a(this);
    }

    public PrivilegeSVGAContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeSVGAContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
