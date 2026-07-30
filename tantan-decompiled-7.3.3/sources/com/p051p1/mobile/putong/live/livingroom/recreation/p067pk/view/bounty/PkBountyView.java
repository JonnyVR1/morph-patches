package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.bounty;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.immomo.svgaplayer.bean.InsertTextBean;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p051p1.mobile.putong.live.base.data.BLivePkBountyEffectExtras;
import com.p051p1.mobile.putong.live.base.data.BLivePkBountyResource;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkBountyData;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import p153l.bnl0;
import p153l.iam;
import p153l.it70;
import p153l.lt70;
import p153l.n1k0;
import p153l.x20;

/* JADX INFO: loaded from: classes5.dex */
public class PkBountyView extends FrameLayout implements iam<it70> {

    /* JADX INFO: renamed from: a */
    public MomoLayUpSVGAImageView f52616a;

    /* JADX INFO: renamed from: b */
    public PkBountyIndicatorView f52617b;

    /* JADX INFO: renamed from: c */
    public it70 f52618c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.pk.view.bounty.PkBountyView$a */
    public class C13075a extends SVGAAnimListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f52619a;

        public C13075a(x20 x20Var) {
            this.f52619a = x20Var;
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onFinished() {
            super.onFinished();
            x20 x20Var = this.f52619a;
            if (x20Var != null) {
                x20Var.call();
            }
            bnl0.m105524M(PkBountyView.this.f52616a, false);
        }
    }

    public PkBountyView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: d */
    private void m77457d() {
        MomoLayUpSVGAImageView momoLayUpSVGAImageView = this.f52616a;
        if (momoLayUpSVGAImageView == null || !momoLayUpSVGAImageView.getIsAnimating()) {
            return;
        }
        this.f52616a.stopAnimation();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m77458b(View view) {
        lt70.m155745a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(it70 it70Var) {
        this.f52618c = it70Var;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m77460e() {
        m77457d();
        this.f52617b.m77446f();
    }

    /* JADX INFO: renamed from: f */
    public List<InsertTextBean> m77461f(List<BLivePkBountyEffectExtras> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            BLivePkBountyEffectExtras bLivePkBountyEffectExtras = list.get(i);
            if (bLivePkBountyEffectExtras != null) {
                InsertTextBean insertTextBean = new InsertTextBean();
                insertTextBean.setKey(bLivePkBountyEffectExtras.f45271id);
                insertTextBean.setType(bLivePkBountyEffectExtras.type);
                insertTextBean.setText(bLivePkBountyEffectExtras.value);
                insertTextBean.setTextSize(bLivePkBountyEffectExtras.size);
                try {
                    insertTextBean.setTextColor(Color.parseColor(bLivePkBountyEffectExtras.color));
                } catch (Exception e) {
                    CrashHelper.m82479c(e);
                    insertTextBean.setTextColor(Color.parseColor("#FFFFFF"));
                }
                arrayList.add(insertTextBean);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m77462i(List list, String str, x20 x20Var) {
        this.f52616a.clearInsertData();
        this.f52616a.insertBeanList(new ArrayList(m77461f(list)));
        m77465l(str, x20Var);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m77463j(PkBountyData pkBountyData, final x20 x20Var) {
        BLivePkBountyResource anchorResource;
        if (pkBountyData == null || (anchorResource = pkBountyData.getAnchorResource()) == null) {
            return;
        }
        final String strM161123h = n1k0.m161123h(anchorResource.resourceId, 600);
        final List<BLivePkBountyEffectExtras> list = anchorResource.effectExtras;
        if (list == null) {
            return;
        }
        post(new Runnable() { // from class: l.jt70
            @Override // java.lang.Runnable
            public final void run() {
                this.f122561a.m77462i(list, strM161123h, x20Var);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m77464k(PkBountyData pkBountyData, boolean z) {
        if (pkBountyData == null) {
            return;
        }
        this.f52617b.m77451k(pkBountyData.getAnchorWinIndicator(), z);
    }

    /* JADX INFO: renamed from: l */
    public void m77465l(String str, x20 x20Var) {
        bnl0.m105524M(this.f52616a, true);
        this.f52616a.setLayoutType(MomoLayUpSVGAImageView.LayoutType.ALIGN_PARENT_BOTTOM);
        this.f52616a.startSVGAAnimWithLayJson(str, 1, null, new C13075a(x20Var));
    }

    /* JADX INFO: renamed from: m */
    public void m77466m() {
        this.f52617b.m77454n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m77457d();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77458b(this);
    }

    public PkBountyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkBountyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
