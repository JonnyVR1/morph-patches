package p153l;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.BlockGroupList;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.SidesSlipActivity;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.SidesSlipItemData;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.SideBarIconsInfo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONObject;
import p151v.VFrame;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class kaf0 implements iam<eaf0>, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public VFrame f124653a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f124654b;

    /* JADX INFO: renamed from: c */
    public SidesSlipHeadItemView f124655c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f124656d;

    /* JADX INFO: renamed from: e */
    public View f124657e;

    /* JADX INFO: renamed from: f */
    public SidesSlipActivity f124658f;

    /* JADX INFO: renamed from: g */
    public eaf0 f124659g;

    /* JADX INFO: renamed from: h */
    public ValueAnimator f124660h;

    /* JADX INFO: renamed from: i */
    public p9f0 f124661i;

    /* JADX INFO: renamed from: j */
    public List<SidesSlipItemData> f124662j;

    /* JADX INFO: renamed from: k */
    public boolean f124663k;

    /* JADX INFO: renamed from: v */
    public SidesSlipItemData f124674v;

    /* JADX INFO: renamed from: w */
    public boolean f124675w;

    /* JADX INFO: renamed from: l */
    public boolean f124664l = false;

    /* JADX INFO: renamed from: m */
    public boolean f124665m = false;

    /* JADX INFO: renamed from: n */
    public boolean f124666n = false;

    /* JADX INFO: renamed from: o */
    public boolean f124667o = false;

    /* JADX INFO: renamed from: p */
    public boolean f124668p = false;

    /* JADX INFO: renamed from: q */
    public boolean f124669q = false;

    /* JADX INFO: renamed from: r */
    public boolean f124670r = false;

    /* JADX INFO: renamed from: s */
    public boolean f124671s = false;

    /* JADX INFO: renamed from: t */
    public boolean f124672t = false;

    /* JADX INFO: renamed from: u */
    public Map<String, Boolean> f124673u = new HashMap();

    /* JADX INFO: renamed from: x */
    public ArrayList<SidesSlipItemData> f124676x = new ArrayList<>();

    /* JADX INFO: renamed from: l.kaf0$a */
    public class C18126a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f124677a;

        public C18126a(boolean z) {
            this.f124677a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f124677a || kaf0.this.getAct().isFinishing()) {
                return;
            }
            kaf0.this.getAct().m48999H2();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
        }
    }

    public kaf0(SidesSlipActivity sidesSlipActivity) {
        this.f124658f = sidesSlipActivity;
    }

    /* JADX INFO: renamed from: n */
    private void m148951n() {
        bnl0.m105509E0(this.f124657e, new View.OnClickListener() { // from class: l.faf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97980a.m148966u(view);
            }
        });
        this.f124661i.m171360Q(new y20() { // from class: l.gaf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102981a.m148967v((SidesSlipItemData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public final void m148952A() {
        if (this.f124659g.m120061J0()) {
            i4g0.m138527y("e_red_dot_me_settings", OMSDialogPositon.p_navigation_view, i6e.m138811c("red_dot", "red_dot_normal", "setting_tab", "navigation_view_page", "no_location_permission_tips"));
        }
    }

    /* JADX INFO: renamed from: B */
    public void m148953B(int i, boolean z) {
        if (i != 0) {
            if (i == 1) {
                this.f124667o = z;
                m148969x("认证中心", Boolean.valueOf(z));
            } else if (i == 3) {
                CoreModule.f18264c.f20405m0.f20170l1.put(Boolean.valueOf(gra.m131579I1() && z));
                m148969x("群聊", Boolean.valueOf(z));
            } else if (i == 4) {
                this.f124664l = z;
                m148969x("帮助与反馈", Boolean.valueOf(z));
            } else if (i == 8) {
                this.f124666n = z;
                m148969x("邀好友领VIP", Boolean.valueOf(z));
            } else if (i == 10) {
                this.f124669q = z;
                m148969x("每日加曝光", Boolean.valueOf(z));
            } else if (i == 12) {
                this.f124671s = z;
                m148969x("聊天助手", Boolean.valueOf(z));
            } else if (i == 13) {
                this.f124672t = z;
                m148969x("心动开场白", Boolean.valueOf(z));
            }
        } else {
            this.f124665m = z;
            m148969x("设置", Boolean.valueOf(z));
        }
        m148954C();
    }

    /* JADX INFO: renamed from: C */
    public void m148954C() {
        if (this.f124664l || this.f124665m || this.f124666n || this.f124667o || this.f124668p || this.f124669q || this.f124670r || this.f124671s || this.f124672t) {
            CoreModule.f18264c.f20405m0.f20167k1.put(Boolean.TRUE);
        } else {
            CoreModule.f18264c.f20405m0.f20167k1.put(Boolean.FALSE);
        }
    }

    @Override // p153l.iam
    @NonNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f124658f;
    }

    /* JADX INFO: renamed from: E */
    public void m148955E(boolean z) {
        float fFloatValue = z ? 0.0f : 1.0f;
        float f = z ? 1.0f : 0.0f;
        ValueAnimator valueAnimator = this.f124660h;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) this.f124660h.getAnimatedValue()).floatValue();
            this.f124660h.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, f);
        this.f124660h = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        this.f124660h.setDuration(300L);
        this.f124660h.addUpdateListener(this);
        this.f124660h.addListener(new C18126a(z));
        this.f124660h.start();
    }

    /* JADX INFO: renamed from: f */
    public View m148956f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return laf0.m153474b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(eaf0 eaf0Var) {
        this.f124659g = eaf0Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m148956f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m148958j() {
        try {
            BlockGroupList blockGroupList = (BlockGroupList) RemoteConfig.m80481x().m80516v("mytab_group_remove", BlockGroupList.JSON_ADAPTER);
            if (!NullChecker.m82486a(blockGroupList)) {
                return false;
            }
            List<String> list = blockGroupList.blockList;
            String str = ls4.f133389a;
            if (jyb.m147479J(list) || TextUtils.isEmpty(str)) {
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
    public void m148959k() {
        if (!gra.m131600M2() || pzi0.m174454o() <= CoreModule.f18264c.f20401k2.f118659R.get().longValue()) {
            return;
        }
        int iM147476G = jyb.m147476G(this.f124662j, new qcj() { // from class: l.iaf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((SidesSlipItemData) obj).getTitle(), "惊喜礼盒"));
            }
        });
        if (!jyb.m147505e0(this.f124662j, new qcj() { // from class: l.jaf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((SidesSlipItemData) obj).getTitle(), "惊喜礼盒"));
            }
        }) || iM147476G < 0) {
            return;
        }
        this.f124661i.notifyItemRemoved(iM147476G);
        this.f124661i.notifyItemRangeChanged(iM147476G, this.f124662j.size() - iM147476G);
    }

    /* JADX INFO: renamed from: l */
    public void m148960l() {
        ValueAnimator valueAnimator = this.f124660h;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            m148955E(false);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m148961m() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        this.f124656d.setLayoutManager(linearLayoutManager);
        p9f0 p9f0Var = new p9f0(this, this.f124675w);
        this.f124661i = p9f0Var;
        this.f124656d.setAdapter(p9f0Var);
        this.f124661i.m171359P(this.f124662j);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f124654b.setTranslationX(qa00.m175859d(280.0f) * (1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    /* JADX INFO: renamed from: p */
    public final void m148962p() {
        ArrayList arrayList = new ArrayList();
        this.f124662j = arrayList;
        if (this.f124675w) {
            arrayList.add(new SidesSlipItemData());
        }
        int size = 0;
        boolean z = (pgj.m172246c() || nmp.m163833b()) ? false : true;
        this.f124663k = z;
        if (!z) {
            SidesSlipItemData sidesSlipItemData = new SidesSlipItemData();
            this.f124674v = sidesSlipItemData;
            sidesSlipItemData.setIndex(0);
            this.f124674v.setTitle("钱包");
            boolean zM131778z = gra.m131778z();
            SidesSlipItemData sidesSlipItemData2 = this.f124674v;
            if (zM131778z) {
                sidesSlipItemData2.setNativeIcon(dbc0.f87120jh);
            } else {
                sidesSlipItemData2.setNativeIcon(dbc0.f87088ih);
            }
            this.f124662j.add(this.f124674v);
        }
        if (gra.m131600M2() && pzi0.m174454o() < CoreModule.f18264c.f20401k2.f118659R.get().longValue()) {
            SidesSlipItemData sidesSlipItemData3 = new SidesSlipItemData();
            this.f124674v = sidesSlipItemData3;
            sidesSlipItemData3.setIndex(0);
            this.f124674v.setTitle("惊喜礼盒");
            boolean zM131778z2 = gra.m131778z();
            SidesSlipItemData sidesSlipItemData4 = this.f124674v;
            if (zM131778z2) {
                sidesSlipItemData4.setNativeIcon(dbc0.f87524vq);
            } else {
                sidesSlipItemData4.setNativeIcon(dbc0.f87492uq);
            }
            this.f124662j.add(this.f124674v);
            i4g0.m138526x("e_surprisebox_navigation", this.f124658f.pageId());
            size = 1;
        }
        if (CoreModule.m30930K().me_().isFemale() && eu4.m122523b().m122530h()) {
            this.f124671s = !CoreModule.f18264c.f20353U1.f98890R.get().booleanValue();
            SidesSlipItemData sidesSlipItemData5 = new SidesSlipItemData();
            this.f124674v = sidesSlipItemData5;
            sidesSlipItemData5.setIndex(size);
            this.f124674v.setTitle("聊天助手");
            this.f124674v.setNativeIcon(dbc0.f86729Xg);
            this.f124674v.setShowDot(Boolean.valueOf(this.f124671s));
            this.f124662j.add(this.f124674v);
            i4g0.m138526x("e_my_chat_assist_entrance", "p_my_page");
            size++;
        }
        if (h39.m133421J()) {
            SidesSlipItemData sidesSlipItemData6 = new SidesSlipItemData();
            this.f124674v = sidesSlipItemData6;
            sidesSlipItemData6.setIndex(size);
            this.f124674v.setTitle("我的开场白");
            this.f124674v.setNativeIcon(dbc0.f87306p5);
            this.f124662j.add(this.f124674v);
            i4g0.m138526x("e_opening_entrance", "p_my_page");
            size++;
        }
        if (gra.m131726o2() || gra.m131731p2()) {
            SidesSlipItemData sidesSlipItemData7 = new SidesSlipItemData();
            this.f124674v = sidesSlipItemData7;
            int i = size + 1;
            sidesSlipItemData7.setIndex(size);
            this.f124674v.setTitle("任务中心");
            boolean zM131778z3 = gra.m131778z();
            SidesSlipItemData sidesSlipItemData8 = this.f124674v;
            if (zM131778z3) {
                sidesSlipItemData8.setNativeIcon(dbc0.f86632Uf);
            } else {
                sidesSlipItemData8.setNativeIcon(dbc0.f86600Tf);
            }
            this.f124662j.add(this.f124674v);
            i4g0.m138526x("e_task_entrance", "p_my_page");
            size = i;
        }
        if (gra.m131579I1() && !m148958j()) {
            SidesSlipItemData sidesSlipItemData9 = new SidesSlipItemData();
            this.f124674v = sidesSlipItemData9;
            int i2 = size + 1;
            sidesSlipItemData9.setIndex(size);
            this.f124674v.setTitle("群聊");
            boolean zM131778z4 = gra.m131778z();
            SidesSlipItemData sidesSlipItemData10 = this.f124674v;
            if (zM131778z4) {
                sidesSlipItemData10.setNativeIcon(dbc0.f86826ah);
            } else {
                sidesSlipItemData10.setNativeIcon(dbc0.f86793Zg);
            }
            this.f124662j.add(this.f124674v);
            size = i2;
        }
        if (CoreModule.m30934Q().mo68438a().mo134414f() && gra.m131617Q1()) {
            SidesSlipItemData sidesSlipItemData11 = new SidesSlipItemData();
            this.f124674v = sidesSlipItemData11;
            int i3 = size + 1;
            sidesSlipItemData11.setIndex(size);
            this.f124674v.setTitle("直播");
            this.f124674v.setShowDot(Boolean.FALSE);
            boolean zM131778z5 = gra.m131778z();
            SidesSlipItemData sidesSlipItemData12 = this.f124674v;
            if (zM131778z5) {
                sidesSlipItemData12.setNativeIcon(dbc0.f86892ch);
            } else {
                sidesSlipItemData12.setNativeIcon(dbc0.f86859bh);
            }
            this.f124662j.add(this.f124674v);
            size = i3;
        }
        m148963q(size);
        if (!this.f124676x.isEmpty()) {
            this.f124662j.addAll(this.f124676x);
            size += this.f124676x.size();
        }
        SidesSlipItemData sidesSlipItemData13 = new SidesSlipItemData();
        this.f124674v = sidesSlipItemData13;
        int i4 = size + 1;
        sidesSlipItemData13.setIndex(size);
        this.f124674v.setTitle("关于探探");
        boolean zM131778z6 = gra.m131778z();
        SidesSlipItemData sidesSlipItemData14 = this.f124674v;
        if (zM131778z6) {
            sidesSlipItemData14.setNativeIcon(dbc0.f86697Wg);
        } else {
            sidesSlipItemData14.setNativeIcon(dbc0.f86665Vg);
        }
        this.f124662j.add(this.f124674v);
        this.f124665m = this.f124659g.m120063N0();
        SidesSlipItemData sidesSlipItemData15 = new SidesSlipItemData();
        this.f124674v = sidesSlipItemData15;
        sidesSlipItemData15.setIndex(i4);
        this.f124674v.setTitle("设置");
        boolean zM131778z7 = gra.m131778z();
        SidesSlipItemData sidesSlipItemData16 = this.f124674v;
        if (zM131778z7) {
            sidesSlipItemData16.setNativeIcon(dbc0.f86957eh);
        } else {
            sidesSlipItemData16.setNativeIcon(dbc0.f86925dh);
        }
        this.f124674v.setShowDot(Boolean.valueOf(this.f124659g.m120063N0()));
        this.f124662j.add(this.f124674v);
        if (gra.m131778z()) {
            this.f124662j.add(new SidesSlipItemData());
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m148963q(int i) {
        this.f124676x.clear();
        if (!jyb.m147479J(pk50.m172568j().m172578k()) && NullChecker.m82486a(pk50.m172568j().m172578k().get(0)) && NullChecker.m82486a(pk50.m172568j().m172578k().get(0).sidebarIcons)) {
            for (SideBarIconsInfo sideBarIconsInfo : pk50.m172568j().m172578k().get(0).sidebarIcons) {
                if (NullChecker.m82486a(sideBarIconsInfo.timeRange) && sideBarIconsInfo.timeRange.size() == 2 && sideBarIconsInfo.timeRange.get(0).longValue() <= pzi0.m174454o() / 1000 && sideBarIconsInfo.timeRange.get(1).longValue() >= pzi0.m174454o() / 1000 && NullChecker.m82486a(sideBarIconsInfo.picture) && !TextUtils.isEmpty(sideBarIconsInfo.picture.identifier)) {
                    SidesSlipItemData sidesSlipItemData = new SidesSlipItemData();
                    this.f124674v = sidesSlipItemData;
                    int i2 = i + 1;
                    sidesSlipItemData.setIndex(i);
                    this.f124674v.setType("online");
                    this.f124674v.setTitle(sideBarIconsInfo.title);
                    if (TextUtils.equals("邀好友领VIP", sideBarIconsInfo.title)) {
                        this.f124666n = CoreModule.f18264c.f20405m0.f20176n1.get().booleanValue();
                        this.f124674v.setShowDot(CoreModule.f18264c.f20405m0.f20176n1.get());
                    }
                    if (TextUtils.equals("每日加曝光", sideBarIconsInfo.title)) {
                        i4g0.m138526x("e_mypage_checkin", "p_my_page");
                        this.f124669q = CoreModule.f18264c.f20405m0.f20179o1.get().booleanValue();
                        this.f124674v.setShowDot(CoreModule.f18264c.f20405m0.f20179o1.get());
                    }
                    if (m148965s(this.f124674v)) {
                        try {
                            String str = CoreModule.f18264c.f20405m0.f20182p1.get();
                            JSONObject jSONObject = !TextUtils.isEmpty(str) ? new JSONObject(str) : new JSONObject();
                            boolean zOptBoolean = sideBarIconsInfo.redDotSwitch;
                            boolean zIsEmpty = TextUtils.isEmpty(str);
                            String str2 = sideBarIconsInfo.f39662id;
                            if (zIsEmpty) {
                                jSONObject.put(str2, sideBarIconsInfo.redDotSwitch);
                            } else {
                                zOptBoolean = jSONObject.optBoolean(str2, sideBarIconsInfo.redDotSwitch);
                                jSONObject.put(sideBarIconsInfo.f39662id, zOptBoolean);
                            }
                            this.f124674v.setShowDot(Boolean.valueOf(zOptBoolean));
                            this.f124673u.put(sideBarIconsInfo.f39662id, Boolean.valueOf(zOptBoolean));
                            CoreModule.f18264c.f20405m0.f20182p1.put(jSONObject.toString());
                        } catch (Exception unused) {
                        }
                    }
                    this.f124674v.setIconUrl(sideBarIconsInfo.picture.identifier);
                    this.f124674v.setDeepLink(sideBarIconsInfo.deeplink);
                    this.f124674v.setOmsId(sideBarIconsInfo.f39662id);
                    this.f124676x.add(this.f124674v);
                    i = i2;
                }
            }
            m148968w(this.f124673u);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m148964r() {
        this.f124675w = !gra.m131778z() && (gra.m131726o2() || gra.m131731p2() || e7d0.m119697f() || gra.m131646X2());
        m148962p();
        m148961m();
        m148951n();
        m148952A();
        m148954C();
        m148970y();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m148965s(SidesSlipItemData sidesSlipItemData) {
        return (!d09.m113371h() || TextUtils.equals("邀好友领VIP", sidesSlipItemData.getTitle()) || TextUtils.equals("每日加曝光", sidesSlipItemData.getTitle())) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m148966u(View view) {
        m148960l();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m148967v(SidesSlipItemData sidesSlipItemData) {
        byte b = 0;
        if (TextUtils.equals("online", sidesSlipItemData.getType())) {
            if (TextUtils.equals("邀好友领VIP", sidesSlipItemData.getTitle())) {
                this.f124659g.m120072r0();
            } else if (TextUtils.equals("每日加曝光", sidesSlipItemData.getTitle())) {
                this.f124659g.m120068n0();
            }
            if (m148965s(sidesSlipItemData)) {
                try {
                    String str = CoreModule.f18264c.f20405m0.f20182p1.get();
                    JSONObject jSONObject = !TextUtils.isEmpty(str) ? new JSONObject(str) : new JSONObject();
                    Map<String, Boolean> map = this.f124673u;
                    String omsId = sidesSlipItemData.getOmsId();
                    Boolean bool = Boolean.FALSE;
                    map.put(omsId, bool);
                    m148968w(this.f124673u);
                    m148954C();
                    m148969x(sidesSlipItemData.getTitle(), bool);
                    jSONObject.put(sidesSlipItemData.getOmsId(), false);
                    CoreModule.f18264c.f20405m0.f20182p1.put(jSONObject.toString());
                } catch (Exception unused) {
                }
            }
            this.f124659g.m120074t0(sidesSlipItemData.getDeepLink(), sidesSlipItemData.getOmsId());
        }
        String title = sidesSlipItemData.getTitle();
        title.getClass();
        switch (title.hashCode()) {
            case -1656856048:
                if (!title.equals("我的开场白")) {
                    b = -1;
                }
                break;
            case -328923044:
                b = !title.equals("账号与安全") ? (byte) -1 : (byte) 1;
                break;
            case 671077:
                b = !title.equals("分享") ? (byte) -1 : (byte) 2;
                break;
            case 969785:
                b = !title.equals("直播") ? (byte) -1 : (byte) 3;
                break;
            case 991405:
                b = !title.equals("礼物") ? (byte) -1 : (byte) 4;
                break;
            case 1045798:
                b = !title.equals("群聊") ? (byte) -1 : (byte) 5;
                break;
            case 1141616:
                b = !title.equals("设置") ? (byte) -1 : (byte) 6;
                break;
            case 1201268:
                b = !title.equals("钱包") ? (byte) -1 : (byte) 7;
                break;
            case 32292197:
                b = !title.equals("聊天室") ? (byte) -1 : (byte) 8;
                break;
            case 623317180:
                b = !title.equals("任务中心") ? (byte) -1 : (byte) 9;
                break;
            case 641314043:
                b = !title.equals("关于探探") ? (byte) -1 : (byte) 10;
                break;
            case 760215208:
                b = !title.equals("惊喜礼盒") ? (byte) -1 : (byte) 11;
                break;
            case 777813374:
                b = !title.equals("我的客服") ? (byte) -1 : (byte) 12;
                break;
            case 1001012001:
                b = !title.equals("聊天助手") ? (byte) -1 : HttpTokens.CARRIAGE_RETURN;
                break;
            case 1099995283:
                b = !title.equals("认证中心") ? (byte) -1 : (byte) 14;
                break;
            case 1819752478:
                b = !title.equals("心动开场白") ? (byte) -1 : (byte) 15;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                this.f124659g.m120075u0();
                break;
            case 1:
                this.f124659g.m120054A0();
                this.f124658f.m48999H2();
                break;
            case 2:
                i4g0.m138520r("e_sidebar_share", OMSDialogPositon.p_navigation_view);
                this.f124659g.m120055C0();
                break;
            case 3:
                this.f124659g.m120073s0();
                break;
            case 4:
                this.f124659g.m120069o0();
                this.f124658f.m48999H2();
                break;
            case 5:
                this.f124659g.m120070p0();
                this.f124658f.m48999H2();
                break;
            case 6:
                this.f124659g.m120078z0(true);
                this.f124658f.m48999H2();
                break;
            case 7:
                this.f124659g.m120060H0();
                this.f124658f.m48999H2();
                break;
            case 8:
                this.f124659g.m120059G0();
                this.f124658f.m48999H2();
                break;
            case 9:
                this.f124659g.m120057E0();
                this.f124658f.m48999H2();
                break;
            case 10:
                this.f124659g.m120067m0();
                this.f124658f.m48999H2();
                break;
            case 11:
                this.f124659g.m120056D0();
                break;
            case 12:
                this.f124659g.m120076x0();
                break;
            case 13:
                this.f124659g.m120064O0();
                this.f124658f.m48999H2();
                break;
            case 14:
                this.f124659g.m120058F0();
                this.f124658f.m48999H2();
                break;
            case 15:
                this.f124659g.m120071q0();
                break;
        }
    }

    /* JADX INFO: renamed from: w */
    public void m148968w(Map<String, Boolean> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        Iterator<Map.Entry<String, Boolean>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            boolean zBooleanValue = it.next().getValue().booleanValue();
            this.f124670r = zBooleanValue;
            if (zBooleanValue) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m148969x(final String str, Boolean bool) {
        int iM147476G = jyb.m147476G(this.f124662j, new qcj() { // from class: l.haf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((SidesSlipItemData) obj).getTitle()));
            }
        });
        if (iM147476G != -1) {
            this.f124662j.get(iM147476G).setShowDot(bool);
        }
        this.f124661i.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: y */
    public final void m148970y() {
        if (!this.f124663k) {
            sfj0.m185601h("e_wallet", this.f124658f.pageId(), new sfj0.C20032a[0]);
        }
        if (gra.m131579I1()) {
            sfj0.m185601h("e_group_entrance", this.f124658f.pageId(), new sfj0.C20032a[0]);
        }
        if (this.f124676x.isEmpty()) {
            return;
        }
        Iterator<SidesSlipItemData> it = this.f124676x.iterator();
        while (it.hasNext()) {
            i4g0.m138492A("e_oms_slot", this.f124658f.pageId(), jyb.m147494Y("oms_trace", it.next().getOmsId()));
        }
    }

    /* JADX INFO: renamed from: z */
    public void m148971z(User user) {
        bnl0.m105524M(this.f124655c, true);
        this.f124655c.m44670W(this.f124658f, user);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
