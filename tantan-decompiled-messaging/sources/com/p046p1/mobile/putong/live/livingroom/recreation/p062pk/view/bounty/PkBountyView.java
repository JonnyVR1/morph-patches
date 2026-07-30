package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.bounty;

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
import com.p046p1.mobile.putong.live.base.data.BLivePkBountyEffectExtras;
import com.p046p1.mobile.putong.live.base.data.BLivePkBountyResource;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkBountyData;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import p149l.cl70;
import p149l.d30;
import p149l.fl70;
import p149l.ksj0;
import p149l.s7m;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class PkBountyView extends FrameLayout implements s7m<cl70> {

    /* JADX INFO: renamed from: a */
    public MomoLayUpSVGAImageView f51768a;

    /* JADX INFO: renamed from: b */
    public PkBountyIndicatorView f51769b;

    /* JADX INFO: renamed from: c */
    public cl70 f51770c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.pk.view.bounty.PkBountyView$a */
    public class C12912a extends SVGAAnimListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f51771a;

        public C12912a(d30 d30Var) {
            this.f51771a = d30Var;
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onFinished() {
            super.onFinished();
            d30 d30Var = this.f51771a;
            if (d30Var != null) {
                d30Var.call();
            }
            xdl0.m208344M(PkBountyView.this.f51768a, false);
        }
    }

    public PkBountyView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: d */
    private void m76274d() {
        MomoLayUpSVGAImageView momoLayUpSVGAImageView = this.f51768a;
        if (momoLayUpSVGAImageView == null || !momoLayUpSVGAImageView.getIsAnimating()) {
            return;
        }
        this.f51768a.stopAnimation();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m76275b(View view) {
        fl70.m121963a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(cl70 cl70Var) {
        this.f51770c = cl70Var;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m76277e() {
        m76274d();
        this.f51769b.m76263f();
    }

    /* JADX INFO: renamed from: f */
    public List<InsertTextBean> m76278f(List<BLivePkBountyEffectExtras> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            BLivePkBountyEffectExtras bLivePkBountyEffectExtras = list.get(i);
            if (bLivePkBountyEffectExtras != null) {
                InsertTextBean insertTextBean = new InsertTextBean();
                insertTextBean.setKey(bLivePkBountyEffectExtras.f44423id);
                insertTextBean.setType(bLivePkBountyEffectExtras.type);
                insertTextBean.setText(bLivePkBountyEffectExtras.value);
                insertTextBean.setTextSize(bLivePkBountyEffectExtras.size);
                try {
                    insertTextBean.setTextColor(Color.parseColor(bLivePkBountyEffectExtras.color));
                } catch (Exception e) {
                    CrashHelper.m81296c(e);
                    insertTextBean.setTextColor(Color.parseColor("#FFFFFF"));
                }
                arrayList.add(insertTextBean);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m76279i(List list, String str, d30 d30Var) {
        this.f51768a.clearInsertData();
        this.f51768a.insertBeanList(new ArrayList(m76278f(list)));
        m76282l(str, d30Var);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m76280j(PkBountyData pkBountyData, final d30 d30Var) {
        BLivePkBountyResource anchorResource;
        if (pkBountyData == null || (anchorResource = pkBountyData.getAnchorResource()) == null) {
            return;
        }
        final String strM147081h = ksj0.m147081h(anchorResource.resourceId, 600);
        final List<BLivePkBountyEffectExtras> list = anchorResource.effectExtras;
        if (list == null) {
            return;
        }
        post(new Runnable() { // from class: l.dl70
            @Override // java.lang.Runnable
            public final void run() {
                this.f86784a.m76279i(list, strM147081h, d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m76281k(PkBountyData pkBountyData, boolean z) {
        if (pkBountyData == null) {
            return;
        }
        this.f51769b.m76268k(pkBountyData.getAnchorWinIndicator(), z);
    }

    /* JADX INFO: renamed from: l */
    public void m76282l(String str, d30 d30Var) {
        xdl0.m208344M(this.f51768a, true);
        this.f51768a.setLayoutType(MomoLayUpSVGAImageView.LayoutType.ALIGN_PARENT_BOTTOM);
        this.f51768a.startSVGAAnimWithLayJson(str, 1, null, new C12912a(d30Var));
    }

    /* JADX INFO: renamed from: m */
    public void m76283m() {
        this.f51769b.m76271n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m76274d();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76275b(this);
    }

    public PkBountyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkBountyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
