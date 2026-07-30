package com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.C0443a;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpConfig;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseTaskInfos;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetCpRecommendUser;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSweetCpTask;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.virtual.roomInfo.view.SvgAndImageView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import l.ap0;
import l.aqo0;
import l.d1q;
import l.f30;
import l.g30;
import l.osi0;
import l.s7m;
import l.t100;
import l.vwb;
import l.w8u;
import l.w9j;
import l.xdl0;
import p009l.coo0;
import p009l.cuo0;
import p009l.gpo0;
import p009l.ioo0;
import p009l.ito0;
import p009l.jno0;
import p009l.ypv;
import v.VImage;
import v.VRecyclerView;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceSweetCpView extends RelativeLayout implements s7m<gpo0> {

    /* JADX INFO: renamed from: a */
    public VoiceSweetSmoothSpeedRecycle f7150a;

    /* JADX INFO: renamed from: b */
    public VRelative f7151b;

    /* JADX INFO: renamed from: c */
    public VText f7152c;

    /* JADX INFO: renamed from: d */
    public VText f7153d;

    /* JADX INFO: renamed from: e */
    public VText f7154e;

    /* JADX INFO: renamed from: f */
    public VImage f7155f;

    /* JADX INFO: renamed from: g */
    public VText f7156g;

    /* JADX INFO: renamed from: h */
    public VRecyclerView f7157h;

    /* JADX INFO: renamed from: i */
    public VoiceSweetErrorView f7158i;

    /* JADX INFO: renamed from: j */
    public SvgAndImageView f7159j;

    /* JADX INFO: renamed from: k */
    public gpo0 f7160k;

    /* JADX INFO: renamed from: l */
    public SweetGalleryLayoutManager f7161l;

    /* JADX INFO: renamed from: m */
    public jno0 f7162m;

    /* JADX INFO: renamed from: n */
    public cuo0 f7163n;

    /* JADX INFO: renamed from: o */
    public ito0 f7164o;

    /* JADX INFO: renamed from: p */
    public BLiveVoiceCpHouseInfo f7165p;

    /* JADX INFO: renamed from: q */
    public List<BLiveVoiceCpHouseInfo> f7166q;

    /* JADX INFO: renamed from: r */
    public String f7167r;

    /* JADX INFO: renamed from: s */
    public boolean f7168s;

    public VoiceSweetCpView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m8713r() {
        this.f7150a.addItemDecoration(new jno0.C0978a());
        SweetGalleryLayoutManager sweetGalleryLayoutManager = new SweetGalleryLayoutManager(0);
        this.f7161l = sweetGalleryLayoutManager;
        sweetGalleryLayoutManager.m8691f(this.f7150a, 0);
        this.f7161l.m8695z(new C0443a());
        this.f7150a.setAdapter(this.f7162m);
        this.f7161l.m8694y(false);
        this.f7157h.setLayoutManager(new LinearLayoutManager(m8719C0()));
    }

    private void setBrandView(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        xdl0.M(this.f7151b, bLiveVoiceCpHouseInfo.isUnLock);
        this.f7153d.setText("LV." + bLiveVoiceCpHouseInfo.houseRank);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m8714v(View view) {
        this.f7160k.m15193J4(this.f7165p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m8715w(View view) {
        this.f7160k.m15196M4(this.f7165p, this.f7167r);
    }

    /* JADX INFO: renamed from: A */
    public void m8716A() {
        if (vwb.J(this.f7166q)) {
            return;
        }
        this.f7150a.smoothScrollToPosition(0);
    }

    /* JADX INFO: renamed from: B */
    public final void m8717B(int i) {
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfoM12753L;
        xdl0.M(this.f7158i, false);
        d1q d1qVarH = this.f7162m.H(i);
        if (d1qVarH == null || !(d1qVarH instanceof coo0) || (bLiveVoiceCpHouseInfoM12753L = ((coo0) d1qVarH).m12753L()) == null) {
            return;
        }
        this.f7165p = bLiveVoiceCpHouseInfoM12753L;
        setBrandView(bLiveVoiceCpHouseInfoM12753L);
        if (bLiveVoiceCpHouseInfoM12753L.isUnLock) {
            m8721F(true);
            this.f7160k.m15191H4(bLiveVoiceCpHouseInfoM12753L.houseId, bLiveVoiceCpHouseInfoM12753L.otherUserId);
        } else {
            m8721F(false);
            this.f7160k.m15192I4();
        }
    }

    /* JADX INFO: renamed from: C */
    public void m8718C(boolean z, boolean z2, int i) {
        ConstraintLayout constraintLayout = this.f7158i;
        if (z2) {
            xdl0.X(constraintLayout, t100.d(295.0f));
        } else {
            xdl0.X(constraintLayout, t100.d(379.0f));
        }
        this.f7158i.setStyle(z2);
        this.f7158i.setSubTitle(w8u.t(i));
        xdl0.M(this.f7158i, z);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8719C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public boolean m8720E() {
        return ypv.m25490k().l6() != null && ypv.m25490k().l6().isShow;
    }

    /* JADX INFO: renamed from: F */
    public final void m8721F(boolean z) {
        VRecyclerView vRecyclerView = this.f7157h;
        boolean z2 = false;
        if (!z) {
            vRecyclerView.setAdapter(this.f7163n);
            xdl0.M(this.f7156g, false);
            return;
        }
        vRecyclerView.setAdapter(this.f7164o);
        VText vText = this.f7156g;
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = this.f7165p;
        if (bLiveVoiceCpHouseInfo != null && !TextUtils.isEmpty(m8727m(bLiveVoiceCpHouseInfo))) {
            z2 = true;
        }
        xdl0.M(vText, z2);
    }

    /* JADX INFO: renamed from: G */
    public void m8722G(BLiveVoiceCpHouseTaskInfos bLiveVoiceCpHouseTaskInfos) {
        if (vwb.J(bLiveVoiceCpHouseTaskInfos.taskList)) {
            return;
        }
        this.f7167r = bLiveVoiceCpHouseTaskInfos.nextHouseId;
        this.f7164o.m16724f0(bLiveVoiceCpHouseTaskInfos.taskList, bLiveVoiceCpHouseTaskInfos.voiceCpHouseInfo);
        String strM8727m = m8727m(bLiveVoiceCpHouseTaskInfos.voiceCpHouseInfo);
        xdl0.M(this.f7156g, !TextUtils.isEmpty(strM8727m));
        this.f7156g.setText(w8u.u(R.string.cg, strM8727m));
        boolean zEquals = TextUtils.equals(this.f7167r, "-1");
        VText vText = this.f7154e;
        if (zEquals) {
            xdl0.M(vText, false);
            xdl0.M(this.f7155f, false);
        } else {
            xdl0.M(vText, true);
            xdl0.M(this.f7155f, true);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m8723H(List<BLiveVoiceSweetCpRecommendUser> list) {
        if (list == null) {
            return;
        }
        this.f7163n.m12850f0(list);
        m8718C(vwb.J(list), false, R.string.mg);
    }

    public void destroy() {
    }

    public BLiveVoiceCpHouseInfo getSelectCpInfo() {
        return this.f7165p;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m8725k(View view) {
        aqo0.a(this, view);
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m8724i1(gpo0 gpo0Var) {
        this.f7160k = gpo0Var;
    }

    /* JADX INFO: renamed from: m */
    public final String m8727m(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        double d = bLiveVoiceCpHouseInfo.houseLuxuryValue - bLiveVoiceCpHouseInfo.cpLuxuryValue;
        if (d <= 0.0d) {
            return "";
        }
        try {
            return ioo0.INSTANCE.m16658a(d);
        } catch (Exception e) {
            CrashHelper.c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m8728n(final String str) {
        return vwb.G(this.f7166q, new w9j() { // from class: l.zpo0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveVoiceCpHouseInfo) obj).otherUserId, str));
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SvgAndImageView svgAndImageView = this.f7159j;
        if (svgAndImageView != null) {
            svgAndImageView.a();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8725k(this);
        this.f7162m = new jno0();
        this.f7163n = new cuo0();
        this.f7164o = new ito0();
        m8713r();
        this.f7162m.m17178g0(new g30() { // from class: l.spo0
            /* JADX INFO: renamed from: a */
            public final void m22346a(Object obj, Object obj2, Object obj3) {
                this.f20415a.m8729p((BLiveVoiceCpHouseInfo) obj, (Boolean) obj2, (Boolean) obj3);
            }
        });
        this.f7163n.m12851g0(new f30() { // from class: l.tpo0
            public final void call(Object obj, Object obj2) {
                this.f20817a.m8730q((BLiveVoiceSweetCpRecommendUser) obj, (Boolean) obj2);
            }
        });
        this.f7164o.m16725g0(new f30() { // from class: l.upo0
            public final void call(Object obj, Object obj2) {
                this.f21305a.m8731s((BLiveVoiceSweetCpTask) obj, (BLiveVoiceCpHouseInfo) obj2);
            }
        });
        this.f7161l.m8690A(new SweetGalleryLayoutManager.InterfaceC0441e() { // from class: l.vpo0
            @Override // com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager.InterfaceC0441e
            /* JADX INFO: renamed from: a */
            public final void mo8699a(RecyclerView recyclerView, View view, int i) {
                this.f21739a.m8732u(recyclerView, view, i);
            }
        });
        xdl0.E0(this.f7152c, new View.OnClickListener() { // from class: l.wpo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22279a.m8714v(view);
            }
        });
        xdl0.E0(this.f7154e, new View.OnClickListener() { // from class: l.xpo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22692a.m8715w(view);
            }
        });
        if (m8720E()) {
            final BLiveVoiceCpConfig bLiveVoiceCpConfigL6 = ypv.m25490k().l6();
            xdl0.M(this.f7159j, true);
            boolean zEquals = "svga".equals(bLiveVoiceCpConfigL6.iconType);
            SvgAndImageView svgAndImageView = this.f7159j;
            if (zEquals) {
                svgAndImageView.d(bLiveVoiceCpConfigL6.icon, -1, (ap0) null);
            } else {
                svgAndImageView.c("context_single_room", bLiveVoiceCpConfigL6.icon);
            }
            xdl0.E0(this.f7159j, new View.OnClickListener() { // from class: l.ypo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f23194a.m8733x(bLiveVoiceCpConfigL6, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m8729p(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, Boolean bool, Boolean bool2) {
        if (!bool.booleanValue()) {
            this.f7160k.m15193J4(bLiveVoiceCpHouseInfo);
        } else if (bool2.booleanValue()) {
            this.f7160k.m15204U4(bLiveVoiceCpHouseInfo.userId);
        } else if (bLiveVoiceCpHouseInfo.isUnLock) {
            this.f7160k.m15204U4(bLiveVoiceCpHouseInfo.otherUserId);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m8730q(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        gpo0 gpo0Var = this.f7160k;
        if (zBooleanValue) {
            gpo0Var.m15204U4(bLiveVoiceSweetCpRecommendUser.userId);
        } else {
            gpo0Var.m15198O4(bLiveVoiceSweetCpRecommendUser, this.f7165p);
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m8731s(BLiveVoiceSweetCpTask bLiveVoiceSweetCpTask, BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        this.f7160k.m15197N4(bLiveVoiceSweetCpTask, bLiveVoiceCpHouseInfo);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m8732u(RecyclerView recyclerView, View view, int i) {
        m8717B(i);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m8733x(BLiveVoiceCpConfig bLiveVoiceCpConfig, View view) {
        this.f7160k.p3(1124, bLiveVoiceCpConfig.url);
    }

    /* JADX INFO: renamed from: y */
    public void m8734y(List<BLiveVoiceCpHouseInfo> list) {
        if (list == null) {
            xdl0.M(this.f7150a, false);
            xdl0.M(this.f7151b, false);
            xdl0.M(this.f7156g, false);
            xdl0.M(this.f7157h, false);
            this.f7168s = true;
            return;
        }
        this.f7168s = false;
        xdl0.M(this.f7150a, true);
        xdl0.M(this.f7157h, true);
        this.f7166q = list;
        if (vwb.J(list)) {
            return;
        }
        this.f7162m.m17177f0(list);
    }

    /* JADX INFO: renamed from: z */
    public void m8735z(String str) {
        if (vwb.J(this.f7166q)) {
            return;
        }
        if (str == null) {
            List<BLiveVoiceCpHouseInfo> list = this.f7166q;
            if (list.get(list.size() - 1).isUnLock) {
                osi0.f(R.string.lg);
                return;
            } else {
                this.f7150a.smoothScrollToPosition(this.f7166q.size() - 1);
                return;
            }
        }
        int iM8728n = m8728n(str);
        if (iM8728n == -1) {
            osi0.f(R.string.ng);
        } else {
            this.f7150a.smoothScrollToPosition(iM8728n);
        }
    }

    public VoiceSweetCpView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetCpView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
