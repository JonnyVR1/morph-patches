package com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseTaskInfos;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetCpRecommendUser;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSweetCpTask;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.SvgAndImageView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.C13204a;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.VText;
import p153l.a30;
import p153l.bnl0;
import p153l.d3q;
import p153l.ezo0;
import p153l.g3p0;
import p153l.gxo0;
import p153l.iam;
import p153l.jyb;
import p153l.kyo0;
import p153l.m2p0;
import p153l.mxo0;
import p153l.nwo0;
import p153l.qa00;
import p153l.qcj;
import p153l.r1j0;
import p153l.xau;
import p153l.z20;
import p153l.zrv;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceSweetCpView extends RelativeLayout implements iam<kyo0> {

    /* JADX INFO: renamed from: a */
    public VoiceSweetSmoothSpeedRecycle f54392a;

    /* JADX INFO: renamed from: b */
    public VRelative f54393b;

    /* JADX INFO: renamed from: c */
    public VText f54394c;

    /* JADX INFO: renamed from: d */
    public VText f54395d;

    /* JADX INFO: renamed from: e */
    public VText f54396e;

    /* JADX INFO: renamed from: f */
    public VImage f54397f;

    /* JADX INFO: renamed from: g */
    public VText f54398g;

    /* JADX INFO: renamed from: h */
    public VRecyclerView f54399h;

    /* JADX INFO: renamed from: i */
    public VoiceSweetErrorView f54400i;

    /* JADX INFO: renamed from: j */
    public SvgAndImageView f54401j;

    /* JADX INFO: renamed from: k */
    public kyo0 f54402k;

    /* JADX INFO: renamed from: l */
    public SweetGalleryLayoutManager f54403l;

    /* JADX INFO: renamed from: m */
    public nwo0 f54404m;

    /* JADX INFO: renamed from: n */
    public g3p0 f54405n;

    /* JADX INFO: renamed from: o */
    public m2p0 f54406o;

    /* JADX INFO: renamed from: p */
    public BLiveVoiceCpHouseInfo f54407p;

    /* JADX INFO: renamed from: q */
    public List<BLiveVoiceCpHouseInfo> f54408q;

    /* JADX INFO: renamed from: r */
    public String f54409r;

    /* JADX INFO: renamed from: s */
    public boolean f54410s;

    public VoiceSweetCpView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m79687r() {
        this.f54392a.addItemDecoration(new nwo0.C18967a());
        SweetGalleryLayoutManager sweetGalleryLayoutManager = new SweetGalleryLayoutManager(0);
        this.f54403l = sweetGalleryLayoutManager;
        sweetGalleryLayoutManager.m79665f(this.f54392a, 0);
        this.f54403l.m79669z(new C13204a());
        this.f54392a.setAdapter(this.f54404m);
        this.f54403l.m79668y(false);
        this.f54399h.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private void setBrandView(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        bnl0.m105524M(this.f54393b, bLiveVoiceCpHouseInfo.isUnLock);
        this.f54395d.setText("LV." + bLiveVoiceCpHouseInfo.houseRank);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m79688v(View view) {
        this.f54402k.m152099J4(this.f54407p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m79689w(View view) {
        this.f54402k.m152102M4(this.f54407p, this.f54409r);
    }

    /* JADX INFO: renamed from: A */
    public void m79690A() {
        if (jyb.m147479J(this.f54408q)) {
            return;
        }
        this.f54392a.smoothScrollToPosition(0);
    }

    /* JADX INFO: renamed from: B */
    public final void m79691B(int i) {
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfoM132892L;
        bnl0.m105524M(this.f54400i, false);
        d3q d3qVarM68536H = this.f54404m.m68536H(i);
        if (d3qVarM68536H == null || !(d3qVarM68536H instanceof gxo0) || (bLiveVoiceCpHouseInfoM132892L = ((gxo0) d3qVarM68536H).m132892L()) == null) {
            return;
        }
        this.f54407p = bLiveVoiceCpHouseInfoM132892L;
        setBrandView(bLiveVoiceCpHouseInfoM132892L);
        if (bLiveVoiceCpHouseInfoM132892L.isUnLock) {
            m79694F(true);
            this.f54402k.m152097H4(bLiveVoiceCpHouseInfoM132892L.houseId, bLiveVoiceCpHouseInfoM132892L.otherUserId);
        } else {
            m79694F(false);
            this.f54402k.m152098I4();
        }
    }

    /* JADX INFO: renamed from: C */
    public void m79692C(boolean z, boolean z2, int i) {
        VoiceSweetErrorView voiceSweetErrorView = this.f54400i;
        if (z2) {
            bnl0.m105540X(voiceSweetErrorView, qa00.m175859d(295.0f));
        } else {
            bnl0.m105540X(voiceSweetErrorView, qa00.m175859d(379.0f));
        }
        this.f54400i.setStyle(z2);
        this.f54400i.setSubTitle(xau.m209910t(i));
        bnl0.m105524M(this.f54400i, z);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public boolean m79693E() {
        return zrv.m221193k().m203668l6() != null && zrv.m221193k().m203668l6().isShow;
    }

    /* JADX INFO: renamed from: F */
    public final void m79694F(boolean z) {
        VRecyclerView vRecyclerView = this.f54399h;
        boolean z2 = false;
        if (!z) {
            vRecyclerView.setAdapter(this.f54405n);
            bnl0.m105524M(this.f54398g, false);
            return;
        }
        vRecyclerView.setAdapter(this.f54406o);
        VText vText = this.f54398g;
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = this.f54407p;
        if (bLiveVoiceCpHouseInfo != null && !TextUtils.isEmpty(m79699m(bLiveVoiceCpHouseInfo))) {
            z2 = true;
        }
        bnl0.m105524M(vText, z2);
    }

    /* JADX INFO: renamed from: G */
    public void m79695G(BLiveVoiceCpHouseTaskInfos bLiveVoiceCpHouseTaskInfos) {
        if (jyb.m147479J(bLiveVoiceCpHouseTaskInfos.taskList)) {
            return;
        }
        this.f54409r = bLiveVoiceCpHouseTaskInfos.nextHouseId;
        this.f54406o.m156880f0(bLiveVoiceCpHouseTaskInfos.taskList, bLiveVoiceCpHouseTaskInfos.voiceCpHouseInfo);
        String strM79699m = m79699m(bLiveVoiceCpHouseTaskInfos.voiceCpHouseInfo);
        bnl0.m105524M(this.f54398g, !TextUtils.isEmpty(strM79699m));
        this.f54398g.setText(xau.m209911u(R$string.f48022cg, strM79699m));
        boolean zEquals = TextUtils.equals(this.f54409r, User.ID_TEAM_ACCOUNT);
        VText vText = this.f54396e;
        if (zEquals) {
            bnl0.m105524M(vText, false);
            bnl0.m105524M(this.f54397f, false);
        } else {
            bnl0.m105524M(vText, true);
            bnl0.m105524M(this.f54397f, true);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m79696H(List<BLiveVoiceSweetCpRecommendUser> list) {
        if (list == null) {
            return;
        }
        this.f54405n.m128754f0(list);
        m79692C(jyb.m147479J(list), false, R$string.f48241mg);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public BLiveVoiceCpHouseInfo getSelectCpInfo() {
        return this.f54407p;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m79697k(View view) {
        ezo0.m123395a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(kyo0 kyo0Var) {
        this.f54402k = kyo0Var;
    }

    /* JADX INFO: renamed from: m */
    public final String m79699m(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        double d = bLiveVoiceCpHouseInfo.houseLuxuryValue - bLiveVoiceCpHouseInfo.cpLuxuryValue;
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return "";
        }
        try {
            return mxo0.INSTANCE.m160692a(d);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m79700n(final String str) {
        return jyb.m147476G(this.f54408q, new qcj() { // from class: l.dzo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveVoiceCpHouseInfo) obj).otherUserId, str));
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SvgAndImageView svgAndImageView = this.f54401j;
        if (svgAndImageView != null) {
            svgAndImageView.m78657a();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79697k(this);
        this.f54404m = new nwo0();
        this.f54405n = new g3p0();
        this.f54406o = new m2p0();
        m79687r();
        this.f54404m.m165001g0(new a30() { // from class: l.wyo0
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                this.f191671a.m79701p((BLiveVoiceCpHouseInfo) obj, (Boolean) obj2, (Boolean) obj3);
            }
        });
        this.f54405n.m128755g0(new z20() { // from class: l.xyo0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f196770a.m79702q((BLiveVoiceSweetCpRecommendUser) obj, (Boolean) obj2);
            }
        });
        this.f54406o.m156881g0(new z20() { // from class: l.yyo0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f202122a.m79703s((BLiveVoiceSweetCpTask) obj, (BLiveVoiceCpHouseInfo) obj2);
            }
        });
        this.f54403l.m79664A(new SweetGalleryLayoutManager.InterfaceC13202e() { // from class: l.zyo0
            @Override // com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager.InterfaceC13202e
            /* JADX INFO: renamed from: a */
            public final void mo79673a(RecyclerView recyclerView, View view, int i) {
                this.f206621a.m79704u(recyclerView, view, i);
            }
        });
        bnl0.m105509E0(this.f54394c, new View.OnClickListener() { // from class: l.azo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74176a.m79688v(view);
            }
        });
        bnl0.m105509E0(this.f54396e, new View.OnClickListener() { // from class: l.bzo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79170a.m79689w(view);
            }
        });
        if (m79693E()) {
            final BLiveVoiceCpConfig bLiveVoiceCpConfigM203668l6 = zrv.m221193k().m203668l6();
            bnl0.m105524M(this.f54401j, true);
            boolean zEquals = "svga".equals(bLiveVoiceCpConfigM203668l6.iconType);
            SvgAndImageView svgAndImageView = this.f54401j;
            if (zEquals) {
                svgAndImageView.m78660d(bLiveVoiceCpConfigM203668l6.icon, -1, null);
            } else {
                svgAndImageView.m78659c("context_single_room", bLiveVoiceCpConfigM203668l6.icon);
            }
            bnl0.m105509E0(this.f54401j, new View.OnClickListener() { // from class: l.czo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f84489a.m79705x(bLiveVoiceCpConfigM203668l6, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m79701p(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, Boolean bool, Boolean bool2) {
        if (!bool.booleanValue()) {
            this.f54402k.m152099J4(bLiveVoiceCpHouseInfo);
        } else if (bool2.booleanValue()) {
            this.f54402k.m152110U4(bLiveVoiceCpHouseInfo.userId);
        } else if (bLiveVoiceCpHouseInfo.isUnLock) {
            this.f54402k.m152110U4(bLiveVoiceCpHouseInfo.otherUserId);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m79702q(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        kyo0 kyo0Var = this.f54402k;
        if (zBooleanValue) {
            kyo0Var.m152110U4(bLiveVoiceSweetCpRecommendUser.userId);
        } else {
            kyo0Var.m152104O4(bLiveVoiceSweetCpRecommendUser, this.f54407p);
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m79703s(BLiveVoiceSweetCpTask bLiveVoiceSweetCpTask, BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        this.f54402k.m152103N4(bLiveVoiceSweetCpTask, bLiveVoiceCpHouseInfo);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m79704u(RecyclerView recyclerView, View view, int i) {
        m79691B(i);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m79705x(BLiveVoiceCpConfig bLiveVoiceCpConfig, View view) {
        this.f54402k.mo138869p3(1124, bLiveVoiceCpConfig.url);
    }

    /* JADX INFO: renamed from: y */
    public void m79706y(List<BLiveVoiceCpHouseInfo> list) {
        if (list == null) {
            bnl0.m105524M(this.f54392a, false);
            bnl0.m105524M(this.f54393b, false);
            bnl0.m105524M(this.f54398g, false);
            bnl0.m105524M(this.f54399h, false);
            this.f54410s = true;
            return;
        }
        this.f54410s = false;
        bnl0.m105524M(this.f54392a, true);
        bnl0.m105524M(this.f54399h, true);
        this.f54408q = list;
        if (jyb.m147479J(list)) {
            return;
        }
        this.f54404m.m165000f0(list);
    }

    /* JADX INFO: renamed from: z */
    public void m79707z(String str) {
        if (jyb.m147479J(this.f54408q)) {
            return;
        }
        if (str == null) {
            List<BLiveVoiceCpHouseInfo> list = this.f54408q;
            if (list.get(list.size() - 1).isUnLock) {
                r1j0.m179419f(R$string.f48219lg);
                return;
            } else {
                this.f54392a.smoothScrollToPosition(this.f54408q.size() - 1);
                return;
            }
        }
        int iM79700n = m79700n(str);
        if (iM79700n == -1) {
            r1j0.m179419f(R$string.f48263ng);
        } else {
            this.f54392a.smoothScrollToPosition(iM79700n);
        }
    }

    public VoiceSweetCpView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetCpView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
