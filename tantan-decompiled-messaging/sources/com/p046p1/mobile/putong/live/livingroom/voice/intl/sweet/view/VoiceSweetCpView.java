package com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

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
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseTaskInfos;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetCpRecommendUser;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSweetCpTask;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.SvgAndImageView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.C13041a;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.VText;
import p149l.aqo0;
import p149l.coo0;
import p149l.cuo0;
import p149l.d1q;
import p149l.f30;
import p149l.g30;
import p149l.gpo0;
import p149l.ioo0;
import p149l.ito0;
import p149l.jno0;
import p149l.osi0;
import p149l.s7m;
import p149l.t100;
import p149l.vwb;
import p149l.w8u;
import p149l.w9j;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceSweetCpView extends RelativeLayout implements s7m<gpo0> {

    /* JADX INFO: renamed from: a */
    public VoiceSweetSmoothSpeedRecycle f53544a;

    /* JADX INFO: renamed from: b */
    public VRelative f53545b;

    /* JADX INFO: renamed from: c */
    public VText f53546c;

    /* JADX INFO: renamed from: d */
    public VText f53547d;

    /* JADX INFO: renamed from: e */
    public VText f53548e;

    /* JADX INFO: renamed from: f */
    public VImage f53549f;

    /* JADX INFO: renamed from: g */
    public VText f53550g;

    /* JADX INFO: renamed from: h */
    public VRecyclerView f53551h;

    /* JADX INFO: renamed from: i */
    public VoiceSweetErrorView f53552i;

    /* JADX INFO: renamed from: j */
    public SvgAndImageView f53553j;

    /* JADX INFO: renamed from: k */
    public gpo0 f53554k;

    /* JADX INFO: renamed from: l */
    public SweetGalleryLayoutManager f53555l;

    /* JADX INFO: renamed from: m */
    public jno0 f53556m;

    /* JADX INFO: renamed from: n */
    public cuo0 f53557n;

    /* JADX INFO: renamed from: o */
    public ito0 f53558o;

    /* JADX INFO: renamed from: p */
    public BLiveVoiceCpHouseInfo f53559p;

    /* JADX INFO: renamed from: q */
    public List<BLiveVoiceCpHouseInfo> f53560q;

    /* JADX INFO: renamed from: r */
    public String f53561r;

    /* JADX INFO: renamed from: s */
    public boolean f53562s;

    public VoiceSweetCpView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m78504r() {
        this.f53544a.addItemDecoration(new jno0.C17826a());
        SweetGalleryLayoutManager sweetGalleryLayoutManager = new SweetGalleryLayoutManager(0);
        this.f53555l = sweetGalleryLayoutManager;
        sweetGalleryLayoutManager.m78482f(this.f53544a, 0);
        this.f53555l.m78486z(new C13041a());
        this.f53544a.setAdapter(this.f53556m);
        this.f53555l.m78485y(false);
        this.f53551h.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private void setBrandView(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        xdl0.m208344M(this.f53545b, bLiveVoiceCpHouseInfo.isUnLock);
        this.f53547d.setText("LV." + bLiveVoiceCpHouseInfo.houseRank);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m78505v(View view) {
        this.f53554k.m127452J4(this.f53559p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m78506w(View view) {
        this.f53554k.m127455M4(this.f53559p, this.f53561r);
    }

    /* JADX INFO: renamed from: A */
    public void m78507A() {
        if (vwb.m200296J(this.f53560q)) {
            return;
        }
        this.f53544a.smoothScrollToPosition(0);
    }

    /* JADX INFO: renamed from: B */
    public final void m78508B(int i) {
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfoM108027L;
        xdl0.m208344M(this.f53552i, false);
        d1q d1qVarM67353H = this.f53556m.m67353H(i);
        if (d1qVarM67353H == null || !(d1qVarM67353H instanceof coo0) || (bLiveVoiceCpHouseInfoM108027L = ((coo0) d1qVarM67353H).m108027L()) == null) {
            return;
        }
        this.f53559p = bLiveVoiceCpHouseInfoM108027L;
        setBrandView(bLiveVoiceCpHouseInfoM108027L);
        if (bLiveVoiceCpHouseInfoM108027L.isUnLock) {
            m78511F(true);
            this.f53554k.m127450H4(bLiveVoiceCpHouseInfoM108027L.houseId, bLiveVoiceCpHouseInfoM108027L.otherUserId);
        } else {
            m78511F(false);
            this.f53554k.m127451I4();
        }
    }

    /* JADX INFO: renamed from: C */
    public void m78509C(boolean z, boolean z2, int i) {
        VoiceSweetErrorView voiceSweetErrorView = this.f53552i;
        if (z2) {
            xdl0.m208360X(voiceSweetErrorView, t100.m186890d(295.0f));
        } else {
            xdl0.m208360X(voiceSweetErrorView, t100.m186890d(379.0f));
        }
        this.f53552i.setStyle(z2);
        this.f53552i.setSubTitle(w8u.m202217t(i));
        xdl0.m208344M(this.f53552i, z);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public boolean m78510E() {
        return ypv.m215672k().m195881l6() != null && ypv.m215672k().m195881l6().isShow;
    }

    /* JADX INFO: renamed from: F */
    public final void m78511F(boolean z) {
        VRecyclerView vRecyclerView = this.f53551h;
        boolean z2 = false;
        if (!z) {
            vRecyclerView.setAdapter(this.f53557n);
            xdl0.m208344M(this.f53550g, false);
            return;
        }
        vRecyclerView.setAdapter(this.f53558o);
        VText vText = this.f53550g;
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = this.f53559p;
        if (bLiveVoiceCpHouseInfo != null && !TextUtils.isEmpty(m78516m(bLiveVoiceCpHouseInfo))) {
            z2 = true;
        }
        xdl0.m208344M(vText, z2);
    }

    /* JADX INFO: renamed from: G */
    public void m78512G(BLiveVoiceCpHouseTaskInfos bLiveVoiceCpHouseTaskInfos) {
        if (vwb.m200296J(bLiveVoiceCpHouseTaskInfos.taskList)) {
            return;
        }
        this.f53561r = bLiveVoiceCpHouseTaskInfos.nextHouseId;
        this.f53558o.m138231f0(bLiveVoiceCpHouseTaskInfos.taskList, bLiveVoiceCpHouseTaskInfos.voiceCpHouseInfo);
        String strM78516m = m78516m(bLiveVoiceCpHouseTaskInfos.voiceCpHouseInfo);
        xdl0.m208344M(this.f53550g, !TextUtils.isEmpty(strM78516m));
        this.f53550g.setText(w8u.m202218u(R$string.f47174cg, strM78516m));
        boolean zEquals = TextUtils.equals(this.f53561r, User.ID_TEAM_ACCOUNT);
        VText vText = this.f53548e;
        if (zEquals) {
            xdl0.m208344M(vText, false);
            xdl0.m208344M(this.f53549f, false);
        } else {
            xdl0.m208344M(vText, true);
            xdl0.m208344M(this.f53549f, true);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m78513H(List<BLiveVoiceSweetCpRecommendUser> list) {
        if (list == null) {
            return;
        }
        this.f53557n.m108802f0(list);
        m78509C(vwb.m200296J(list), false, R$string.f47393mg);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public BLiveVoiceCpHouseInfo getSelectCpInfo() {
        return this.f53559p;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m78514k(View view) {
        aqo0.m98324a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(gpo0 gpo0Var) {
        this.f53554k = gpo0Var;
    }

    /* JADX INFO: renamed from: m */
    public final String m78516m(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        double d = bLiveVoiceCpHouseInfo.houseLuxuryValue - bLiveVoiceCpHouseInfo.cpLuxuryValue;
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return "";
        }
        try {
            return ioo0.INSTANCE.m137367a(d);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m78517n(final String str) {
        return vwb.m200293G(this.f53560q, new w9j() { // from class: l.zpo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveVoiceCpHouseInfo) obj).otherUserId, str));
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SvgAndImageView svgAndImageView = this.f53553j;
        if (svgAndImageView != null) {
            svgAndImageView.m77474a();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78514k(this);
        this.f53556m = new jno0();
        this.f53557n = new cuo0();
        this.f53558o = new ito0();
        m78504r();
        this.f53556m.m142381g0(new g30() { // from class: l.spo0
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                this.f165873a.m78518p((BLiveVoiceCpHouseInfo) obj, (Boolean) obj2, (Boolean) obj3);
            }
        });
        this.f53557n.m108803g0(new f30() { // from class: l.tpo0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f171497a.m78519q((BLiveVoiceSweetCpRecommendUser) obj, (Boolean) obj2);
            }
        });
        this.f53558o.m138232g0(new f30() { // from class: l.upo0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f177651a.m78520s((BLiveVoiceSweetCpTask) obj, (BLiveVoiceCpHouseInfo) obj2);
            }
        });
        this.f53555l.m78481A(new SweetGalleryLayoutManager.InterfaceC13039e() { // from class: l.vpo0
            @Override // com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager.InterfaceC13039e
            /* JADX INFO: renamed from: a */
            public final void mo78490a(RecyclerView recyclerView, View view, int i) {
                this.f182515a.m78521u(recyclerView, view, i);
            }
        });
        xdl0.m208329E0(this.f53546c, new View.OnClickListener() { // from class: l.wpo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187571a.m78505v(view);
            }
        });
        xdl0.m208329E0(this.f53548e, new View.OnClickListener() { // from class: l.xpo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193947a.m78506w(view);
            }
        });
        if (m78510E()) {
            final BLiveVoiceCpConfig bLiveVoiceCpConfigM195881l6 = ypv.m215672k().m195881l6();
            xdl0.m208344M(this.f53553j, true);
            boolean zEquals = "svga".equals(bLiveVoiceCpConfigM195881l6.iconType);
            SvgAndImageView svgAndImageView = this.f53553j;
            if (zEquals) {
                svgAndImageView.m77477d(bLiveVoiceCpConfigM195881l6.icon, -1, null);
            } else {
                svgAndImageView.m77476c("context_single_room", bLiveVoiceCpConfigM195881l6.icon);
            }
            xdl0.m208329E0(this.f53553j, new View.OnClickListener() { // from class: l.ypo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f199473a.m78522x(bLiveVoiceCpConfigM195881l6, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m78518p(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, Boolean bool, Boolean bool2) {
        if (!bool.booleanValue()) {
            this.f53554k.m127452J4(bLiveVoiceCpHouseInfo);
        } else if (bool2.booleanValue()) {
            this.f53554k.m127463U4(bLiveVoiceCpHouseInfo.userId);
        } else if (bLiveVoiceCpHouseInfo.isUnLock) {
            this.f53554k.m127463U4(bLiveVoiceCpHouseInfo.otherUserId);
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m78519q(BLiveVoiceSweetCpRecommendUser bLiveVoiceSweetCpRecommendUser, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        gpo0 gpo0Var = this.f53554k;
        if (zBooleanValue) {
            gpo0Var.m127463U4(bLiveVoiceSweetCpRecommendUser.userId);
        } else {
            gpo0Var.m127457O4(bLiveVoiceSweetCpRecommendUser, this.f53559p);
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m78520s(BLiveVoiceSweetCpTask bLiveVoiceSweetCpTask, BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo) {
        this.f53554k.m127456N4(bLiveVoiceSweetCpTask, bLiveVoiceCpHouseInfo);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m78521u(RecyclerView recyclerView, View view, int i) {
        m78508B(i);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m78522x(BLiveVoiceCpConfig bLiveVoiceCpConfig, View view) {
        this.f53554k.mo129310p3(1124, bLiveVoiceCpConfig.url);
    }

    /* JADX INFO: renamed from: y */
    public void m78523y(List<BLiveVoiceCpHouseInfo> list) {
        if (list == null) {
            xdl0.m208344M(this.f53544a, false);
            xdl0.m208344M(this.f53545b, false);
            xdl0.m208344M(this.f53550g, false);
            xdl0.m208344M(this.f53551h, false);
            this.f53562s = true;
            return;
        }
        this.f53562s = false;
        xdl0.m208344M(this.f53544a, true);
        xdl0.m208344M(this.f53551h, true);
        this.f53560q = list;
        if (vwb.m200296J(list)) {
            return;
        }
        this.f53556m.m142380f0(list);
    }

    /* JADX INFO: renamed from: z */
    public void m78524z(String str) {
        if (vwb.m200296J(this.f53560q)) {
            return;
        }
        if (str == null) {
            List<BLiveVoiceCpHouseInfo> list = this.f53560q;
            if (list.get(list.size() - 1).isUnLock) {
                osi0.m165782f(R$string.f47371lg);
                return;
            } else {
                this.f53544a.smoothScrollToPosition(this.f53560q.size() - 1);
                return;
            }
        }
        int iM78517n = m78517n(str);
        if (iM78517n == -1) {
            osi0.m165782f(R$string.f47415ng);
        } else {
            this.f53544a.smoothScrollToPosition(iM78517n);
        }
    }

    public VoiceSweetCpView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetCpView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
