package p009l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.SidesSlipActivity;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.SidesSlipItemData;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemView;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.BlockGroupList;
import com.p1.mobile.putong.data.SideBarIconsInfo;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.bzc0;
import l.e2f0;
import l.e30;
import l.j760;
import l.mr4;
import l.nkp;
import l.o6j0;
import l.s7m;
import l.t100;
import l.upa;
import l.vdj;
import l.vwb;
import l.vy8;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.y19;
import l.zvf0;
import org.json.JSONObject;
import v.VFrame;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class d2f0 implements s7m<x1f0>, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public VFrame f10850a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f10851b;

    /* JADX INFO: renamed from: c */
    public SidesSlipHeadItemView f10852c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f10853d;

    /* JADX INFO: renamed from: e */
    public View f10854e;

    /* JADX INFO: renamed from: f */
    public SidesSlipActivity f10855f;

    /* JADX INFO: renamed from: g */
    public x1f0 f10856g;

    /* JADX INFO: renamed from: h */
    public ValueAnimator f10857h;

    /* JADX INFO: renamed from: i */
    public i1f0 f10858i;

    /* JADX INFO: renamed from: j */
    public List<SidesSlipItemData> f10859j;

    /* JADX INFO: renamed from: k */
    public boolean f10860k;

    /* JADX INFO: renamed from: v */
    public SidesSlipItemData f10871v;

    /* JADX INFO: renamed from: w */
    public boolean f10872w;

    /* JADX INFO: renamed from: l */
    public boolean f10861l = false;

    /* JADX INFO: renamed from: m */
    public boolean f10862m = false;

    /* JADX INFO: renamed from: n */
    public boolean f10863n = false;

    /* JADX INFO: renamed from: o */
    public boolean f10864o = false;

    /* JADX INFO: renamed from: p */
    public boolean f10865p = false;

    /* JADX INFO: renamed from: q */
    public boolean f10866q = false;

    /* JADX INFO: renamed from: r */
    public boolean f10867r = false;

    /* JADX INFO: renamed from: s */
    public boolean f10868s = false;

    /* JADX INFO: renamed from: t */
    public boolean f10869t = false;

    /* JADX INFO: renamed from: u */
    public Map<String, Boolean> f10870u = new HashMap();

    /* JADX INFO: renamed from: x */
    public ArrayList<SidesSlipItemData> f10873x = new ArrayList<>();

    /* JADX INFO: renamed from: l.d2f0$a */
    public class C0837a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f10874a;

        public C0837a(boolean z) {
            this.f10874a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f10874a || d2f0.this.act().isFinishing()) {
                return;
            }
            d2f0.this.act().finish();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
        }
    }

    public d2f0(SidesSlipActivity sidesSlipActivity) {
        this.f10855f = sidesSlipActivity;
    }

    /* JADX INFO: renamed from: n */
    private void m12908n() {
        xdl0.E0(this.f10854e, new View.OnClickListener() { // from class: l.y1f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22852a.m12925u(view);
            }
        });
        this.f10858i.m16170Q(new e30() { // from class: l.z1f0
            public final void call(Object obj) {
                this.f23318a.m12926v((SidesSlipItemData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public final void m12909A() {
        if (this.f10856g.m24659J0()) {
            zvf0.y("e_red_dot_me_settings", "p_navigation_view", u4e.m22746c("red_dot", "red_dot_normal", "setting_tab", "navigation_view_page", "no_location_permission_tips"));
        }
    }

    /* JADX INFO: renamed from: B */
    public void m12910B(int i, boolean z) {
        if (i != 0) {
            if (i == 1) {
                this.f10864o = z;
                m12928x("认证中心", Boolean.valueOf(z));
            } else if (i == 3) {
                CoreModule.c.m0.l1.put(Boolean.valueOf(upa.I1() && z));
                m12928x("群聊", Boolean.valueOf(z));
            } else if (i == 4) {
                this.f10861l = z;
                m12928x("帮助与反馈", Boolean.valueOf(z));
            } else if (i == 8) {
                this.f10863n = z;
                m12928x("邀好友领VIP", Boolean.valueOf(z));
            } else if (i == 10) {
                this.f10866q = z;
                m12928x("每日加曝光", Boolean.valueOf(z));
            } else if (i == 12) {
                this.f10868s = z;
                m12928x("聊天助手", Boolean.valueOf(z));
            } else if (i == 13) {
                this.f10869t = z;
                m12928x("心动开场白", Boolean.valueOf(z));
            }
        } else {
            this.f10862m = z;
            m12928x("设置", Boolean.valueOf(z));
        }
        m12911C();
    }

    /* JADX INFO: renamed from: C */
    public void m12911C() {
        if (this.f10861l || this.f10862m || this.f10863n || this.f10864o || this.f10865p || this.f10866q || this.f10867r || this.f10868s || this.f10869t) {
            CoreModule.c.m0.k1.put(Boolean.TRUE);
        } else {
            CoreModule.c.m0.k1.put(Boolean.FALSE);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: C0 */
    public Context m12912C0() {
        return this.f10855f;
    }

    /* JADX INFO: renamed from: E */
    public void m12913E(boolean z) {
        float fFloatValue = z ? 0.0f : 1.0f;
        float f = z ? 1.0f : 0.0f;
        ValueAnimator valueAnimator = this.f10857h;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) this.f10857h.getAnimatedValue()).floatValue();
            this.f10857h.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, f);
        this.f10857h = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        this.f10857h.setDuration(300L);
        this.f10857h.addUpdateListener(this);
        this.f10857h.addListener(new C0837a(z));
        this.f10857h.start();
    }

    /* JADX INFO: renamed from: f */
    public View m12914f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e2f0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m12916i1(x1f0 x1f0Var) {
        this.f10856g = x1f0Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m12914f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m12917j() {
        try {
            BlockGroupList blockGroupList = (BlockGroupList) RemoteConfig.m9619x().m9654v("mytab_group_remove", BlockGroupList.JSON_ADAPTER);
            if (!NullChecker.a(blockGroupList)) {
                return false;
            }
            List<String> list = blockGroupList.blockList;
            String str = mr4.a;
            if (vwb.J(list) || TextUtils.isEmpty(str)) {
                return false;
            }
            for (String str2 : list) {
                if (TextUtils.equals("all_channel", str2)) {
                    return true;
                }
                if (!TextUtils.isEmpty(str2) && str.toLowerCase().contains(str2)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m12918k() {
        if (!upa.M2() || mqi0.m18550o() <= ((Long) CoreModule.c.k2.R.get()).longValue()) {
            return;
        }
        int iG = vwb.G(this.f10859j, new w9j() { // from class: l.b2f0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((SidesSlipItemData) obj).getTitle(), "惊喜礼盒"));
            }
        });
        if (!vwb.e0(this.f10859j, new w9j() { // from class: l.c2f0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((SidesSlipItemData) obj).getTitle(), "惊喜礼盒"));
            }
        }) || iG < 0) {
            return;
        }
        this.f10858i.notifyItemRemoved(iG);
        this.f10858i.notifyItemRangeChanged(iG, this.f10859j.size() - iG);
    }

    /* JADX INFO: renamed from: l */
    public void m12919l() {
        ValueAnimator valueAnimator = this.f10857h;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            m12913E(false);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m12920m() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m12912C0());
        linearLayoutManager.setOrientation(1);
        this.f10853d.setLayoutManager(linearLayoutManager);
        i1f0 i1f0Var = new i1f0(this, this.f10872w);
        this.f10858i = i1f0Var;
        this.f10853d.setAdapter(i1f0Var);
        this.f10858i.m16169P(this.f10859j);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f10851b.setTranslationX(t100.d(280.0f) * (1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    /* JADX INFO: renamed from: p */
    public final void m12921p() {
        ArrayList arrayList = new ArrayList();
        this.f10859j = arrayList;
        if (this.f10872w) {
            arrayList.add(new SidesSlipItemData());
        }
        int size = 0;
        boolean z = (vdj.c() || nkp.b()) ? false : true;
        this.f10860k = z;
        if (!z) {
            SidesSlipItemData sidesSlipItemData = new SidesSlipItemData();
            this.f10871v = sidesSlipItemData;
            sidesSlipItemData.setIndex(0);
            this.f10871v.setTitle("钱包");
            boolean z2 = upa.z();
            SidesSlipItemData sidesSlipItemData2 = this.f10871v;
            if (z2) {
                sidesSlipItemData2.setNativeIcon(x2c0.vg);
            } else {
                sidesSlipItemData2.setNativeIcon(x2c0.ug);
            }
            this.f10859j.add(this.f10871v);
        }
        if (upa.M2() && mqi0.m18550o() < ((Long) CoreModule.c.k2.R.get()).longValue()) {
            SidesSlipItemData sidesSlipItemData3 = new SidesSlipItemData();
            this.f10871v = sidesSlipItemData3;
            sidesSlipItemData3.setIndex(0);
            this.f10871v.setTitle("惊喜礼盒");
            boolean z3 = upa.z();
            SidesSlipItemData sidesSlipItemData4 = this.f10871v;
            if (z3) {
                sidesSlipItemData4.setNativeIcon(x2c0.Hp);
            } else {
                sidesSlipItemData4.setNativeIcon(x2c0.Gp);
            }
            this.f10859j.add(this.f10871v);
            zvf0.x("e_surprisebox_navigation", this.f10855f.pageId());
            size = 1;
        }
        if (CoreModule.K().me_().isFemale() && ft4.m14580b().m14587h()) {
            this.f10868s = !((Boolean) CoreModule.c.U1.R.get()).booleanValue();
            SidesSlipItemData sidesSlipItemData5 = new SidesSlipItemData();
            this.f10871v = sidesSlipItemData5;
            sidesSlipItemData5.setIndex(size);
            this.f10871v.setTitle("聊天助手");
            this.f10871v.setNativeIcon(x2c0.jg);
            this.f10871v.setShowDot(Boolean.valueOf(this.f10868s));
            this.f10859j.add(this.f10871v);
            zvf0.x("e_my_chat_assist_entrance", "p_my_page");
            size++;
        }
        if (y19.J()) {
            SidesSlipItemData sidesSlipItemData6 = new SidesSlipItemData();
            this.f10871v = sidesSlipItemData6;
            sidesSlipItemData6.setIndex(size);
            this.f10871v.setTitle("我的开场白");
            this.f10871v.setNativeIcon(x2c0.o5);
            this.f10859j.add(this.f10871v);
            zvf0.x("e_opening_entrance", "p_my_page");
            size++;
        }
        if (upa.o2() || upa.p2()) {
            SidesSlipItemData sidesSlipItemData7 = new SidesSlipItemData();
            this.f10871v = sidesSlipItemData7;
            int i = size + 1;
            sidesSlipItemData7.setIndex(size);
            this.f10871v.setTitle("任务中心");
            boolean z4 = upa.z();
            SidesSlipItemData sidesSlipItemData8 = this.f10871v;
            if (z4) {
                sidesSlipItemData8.setNativeIcon(x2c0.ff);
            } else {
                sidesSlipItemData8.setNativeIcon(x2c0.ef);
            }
            this.f10859j.add(this.f10871v);
            zvf0.x("e_task_entrance", "p_my_page");
            size = i;
        }
        if (upa.I1() && !m12917j()) {
            SidesSlipItemData sidesSlipItemData9 = new SidesSlipItemData();
            this.f10871v = sidesSlipItemData9;
            int i2 = size + 1;
            sidesSlipItemData9.setIndex(size);
            this.f10871v.setTitle("群聊");
            boolean z5 = upa.z();
            SidesSlipItemData sidesSlipItemData10 = this.f10871v;
            if (z5) {
                sidesSlipItemData10.setNativeIcon(x2c0.mg);
            } else {
                sidesSlipItemData10.setNativeIcon(x2c0.lg);
            }
            this.f10859j.add(this.f10871v);
            size = i2;
        }
        if (CoreModule.Q().m9040a().m14851f() && upa.Q1()) {
            SidesSlipItemData sidesSlipItemData11 = new SidesSlipItemData();
            this.f10871v = sidesSlipItemData11;
            int i3 = size + 1;
            sidesSlipItemData11.setIndex(size);
            this.f10871v.setTitle("直播");
            this.f10871v.setShowDot(Boolean.FALSE);
            boolean z6 = upa.z();
            SidesSlipItemData sidesSlipItemData12 = this.f10871v;
            if (z6) {
                sidesSlipItemData12.setNativeIcon(x2c0.og);
            } else {
                sidesSlipItemData12.setNativeIcon(x2c0.ng);
            }
            this.f10859j.add(this.f10871v);
            size = i3;
        }
        m12922q(size);
        if (!this.f10873x.isEmpty()) {
            this.f10859j.addAll(this.f10873x);
            size += this.f10873x.size();
        }
        SidesSlipItemData sidesSlipItemData13 = new SidesSlipItemData();
        this.f10871v = sidesSlipItemData13;
        int i4 = size + 1;
        sidesSlipItemData13.setIndex(size);
        this.f10871v.setTitle("关于探探");
        boolean z7 = upa.z();
        SidesSlipItemData sidesSlipItemData14 = this.f10871v;
        if (z7) {
            sidesSlipItemData14.setNativeIcon(x2c0.ig);
        } else {
            sidesSlipItemData14.setNativeIcon(x2c0.hg);
        }
        this.f10859j.add(this.f10871v);
        this.f10862m = this.f10856g.m24661N0();
        SidesSlipItemData sidesSlipItemData15 = new SidesSlipItemData();
        this.f10871v = sidesSlipItemData15;
        sidesSlipItemData15.setIndex(i4);
        this.f10871v.setTitle("设置");
        boolean z8 = upa.z();
        SidesSlipItemData sidesSlipItemData16 = this.f10871v;
        if (z8) {
            sidesSlipItemData16.setNativeIcon(x2c0.qg);
        } else {
            sidesSlipItemData16.setNativeIcon(x2c0.pg);
        }
        this.f10871v.setShowDot(Boolean.valueOf(this.f10856g.m24661N0()));
        this.f10859j.add(this.f10871v);
        if (upa.z()) {
            this.f10859j.add(new SidesSlipItemData());
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m12922q(int i) {
        this.f10873x.clear();
        if (!vwb.J(ic50.m16316j().m16326k()) && NullChecker.a(ic50.m16316j().m16326k().get(0)) && NullChecker.a(ic50.m16316j().m16326k().get(0).sidebarIcons)) {
            for (SideBarIconsInfo sideBarIconsInfo : ic50.m16316j().m16326k().get(0).sidebarIcons) {
                if (NullChecker.a(sideBarIconsInfo.timeRange) && sideBarIconsInfo.timeRange.size() == 2 && ((Long) sideBarIconsInfo.timeRange.get(0)).longValue() <= mqi0.m18550o() / 1000 && ((Long) sideBarIconsInfo.timeRange.get(1)).longValue() >= mqi0.m18550o() / 1000 && NullChecker.a(sideBarIconsInfo.picture) && !TextUtils.isEmpty(sideBarIconsInfo.picture.identifier)) {
                    SidesSlipItemData sidesSlipItemData = new SidesSlipItemData();
                    this.f10871v = sidesSlipItemData;
                    int i2 = i + 1;
                    sidesSlipItemData.setIndex(i);
                    this.f10871v.setType("online");
                    this.f10871v.setTitle(sideBarIconsInfo.title);
                    if (TextUtils.equals("邀好友领VIP", sideBarIconsInfo.title)) {
                        this.f10863n = ((Boolean) CoreModule.c.m0.n1.get()).booleanValue();
                        this.f10871v.setShowDot((Boolean) CoreModule.c.m0.n1.get());
                    }
                    if (TextUtils.equals("每日加曝光", sideBarIconsInfo.title)) {
                        zvf0.x("e_mypage_checkin", "p_my_page");
                        this.f10866q = ((Boolean) CoreModule.c.m0.o1.get()).booleanValue();
                        this.f10871v.setShowDot((Boolean) CoreModule.c.m0.o1.get());
                    }
                    if (m12924s(this.f10871v)) {
                        try {
                            String str = (String) CoreModule.c.m0.p1.get();
                            JSONObject jSONObject = !TextUtils.isEmpty(str) ? new JSONObject(str) : new JSONObject();
                            boolean zOptBoolean = sideBarIconsInfo.redDotSwitch;
                            boolean zIsEmpty = TextUtils.isEmpty(str);
                            String str2 = sideBarIconsInfo.id;
                            if (zIsEmpty) {
                                jSONObject.put(str2, sideBarIconsInfo.redDotSwitch);
                            } else {
                                zOptBoolean = jSONObject.optBoolean(str2, sideBarIconsInfo.redDotSwitch);
                                jSONObject.put(sideBarIconsInfo.id, zOptBoolean);
                            }
                            this.f10871v.setShowDot(Boolean.valueOf(zOptBoolean));
                            this.f10870u.put(sideBarIconsInfo.id, Boolean.valueOf(zOptBoolean));
                            CoreModule.c.m0.p1.put(jSONObject.toString());
                        } catch (Exception unused) {
                        }
                    }
                    this.f10871v.setIconUrl(sideBarIconsInfo.picture.identifier);
                    this.f10871v.setDeepLink(sideBarIconsInfo.deeplink);
                    this.f10871v.setOmsId(sideBarIconsInfo.id);
                    this.f10873x.add(this.f10871v);
                    i = i2;
                }
            }
            m12927w(this.f10870u);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m12923r() {
        this.f10872w = !upa.z() && (upa.o2() || upa.p2() || bzc0.f() || upa.X2());
        m12921p();
        m12920m();
        m12908n();
        m12909A();
        m12911C();
        m12929y();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m12924s(SidesSlipItemData sidesSlipItemData) {
        return (!vy8.h() || TextUtils.equals("邀好友领VIP", sidesSlipItemData.getTitle()) || TextUtils.equals("每日加曝光", sidesSlipItemData.getTitle())) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m12925u(View view) {
        m12919l();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m12926v(SidesSlipItemData sidesSlipItemData) {
        if (TextUtils.equals("online", sidesSlipItemData.getType())) {
            if (TextUtils.equals("邀好友领VIP", sidesSlipItemData.getTitle())) {
                this.f10856g.m24671r0();
            } else if (TextUtils.equals("每日加曝光", sidesSlipItemData.getTitle())) {
                this.f10856g.m24667n0();
            }
            if (m12924s(sidesSlipItemData)) {
                try {
                    String str = (String) CoreModule.c.m0.p1.get();
                    JSONObject jSONObject = !TextUtils.isEmpty(str) ? new JSONObject(str) : new JSONObject();
                    Map<String, Boolean> map = this.f10870u;
                    String omsId = sidesSlipItemData.getOmsId();
                    Boolean bool = Boolean.FALSE;
                    map.put(omsId, bool);
                    m12927w(this.f10870u);
                    m12911C();
                    m12928x(sidesSlipItemData.getTitle(), bool);
                    jSONObject.put(sidesSlipItemData.getOmsId(), false);
                    CoreModule.c.m0.p1.put(jSONObject.toString());
                } catch (Exception unused) {
                }
            }
            this.f10856g.m24673t0(sidesSlipItemData.getDeepLink(), sidesSlipItemData.getOmsId());
        }
        String title = sidesSlipItemData.getTitle();
        title.getClass();
        switch (title) {
            case "我的开场白":
                this.f10856g.m24674u0();
                break;
            case "账号与安全":
                this.f10856g.m24652A0();
                this.f10855f.finish();
                break;
            case "分享":
                zvf0.r("e_sidebar_share", "p_navigation_view");
                this.f10856g.m24653C0();
                break;
            case "直播":
                this.f10856g.m24672s0();
                break;
            case "礼物":
                this.f10856g.m24668o0();
                this.f10855f.finish();
                break;
            case "群聊":
                this.f10856g.m24669p0();
                this.f10855f.finish();
                break;
            case "设置":
                this.f10856g.m24677z0(true);
                this.f10855f.finish();
                break;
            case "钱包":
                this.f10856g.m24658H0();
                this.f10855f.finish();
                break;
            case "聊天室":
                this.f10856g.m24657G0();
                this.f10855f.finish();
                break;
            case "任务中心":
                this.f10856g.m24655E0();
                this.f10855f.finish();
                break;
            case "关于探探":
                this.f10856g.m24666m0();
                this.f10855f.finish();
                break;
            case "惊喜礼盒":
                this.f10856g.m24654D0();
                break;
            case "我的客服":
                this.f10856g.m24675x0();
                break;
            case "聊天助手":
                this.f10856g.m24662O0();
                this.f10855f.finish();
                break;
            case "认证中心":
                this.f10856g.m24656F0();
                this.f10855f.finish();
                break;
            case "心动开场白":
                this.f10856g.m24670q0();
                break;
        }
    }

    /* JADX INFO: renamed from: w */
    public void m12927w(Map<String, Boolean> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        Iterator<Map.Entry<String, Boolean>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            boolean zBooleanValue = it.next().getValue().booleanValue();
            this.f10867r = zBooleanValue;
            if (zBooleanValue) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m12928x(final String str, Boolean bool) {
        int iG = vwb.G(this.f10859j, new w9j() { // from class: l.a2f0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((SidesSlipItemData) obj).getTitle()));
            }
        });
        if (iG != -1) {
            this.f10859j.get(iG).setShowDot(bool);
        }
        this.f10858i.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: y */
    public final void m12929y() {
        if (!this.f10860k) {
            o6j0.h("e_wallet", this.f10855f.pageId(), new o6j0.a[0]);
        }
        if (upa.I1()) {
            o6j0.h("e_group_entrance", this.f10855f.pageId(), new o6j0.a[0]);
        }
        if (this.f10873x.isEmpty()) {
            return;
        }
        Iterator<SidesSlipItemData> it = this.f10873x.iterator();
        while (it.hasNext()) {
            zvf0.A("e_oms_slot", this.f10855f.pageId(), new j760[]{vwb.Y("oms_trace", it.next().getOmsId())});
        }
    }

    /* JADX INFO: renamed from: z */
    public void m12930z(User user) {
        xdl0.M(this.f10852c, true);
        this.f10852c.m7730W(this.f10855f, user);
    }

    public void destroy() {
    }
}
