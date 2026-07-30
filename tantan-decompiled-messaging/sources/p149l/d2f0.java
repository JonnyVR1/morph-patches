package p149l;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.BlockGroupList;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.SidesSlipActivity;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.SidesSlipItemData;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.SideBarIconsInfo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONObject;
import p147v.VFrame;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class d2f0 implements s7m<x1f0>, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public VFrame f83358a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f83359b;

    /* JADX INFO: renamed from: c */
    public SidesSlipHeadItemView f83360c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f83361d;

    /* JADX INFO: renamed from: e */
    public View f83362e;

    /* JADX INFO: renamed from: f */
    public SidesSlipActivity f83363f;

    /* JADX INFO: renamed from: g */
    public x1f0 f83364g;

    /* JADX INFO: renamed from: h */
    public ValueAnimator f83365h;

    /* JADX INFO: renamed from: i */
    public i1f0 f83366i;

    /* JADX INFO: renamed from: j */
    public List<SidesSlipItemData> f83367j;

    /* JADX INFO: renamed from: k */
    public boolean f83368k;

    /* JADX INFO: renamed from: v */
    public SidesSlipItemData f83379v;

    /* JADX INFO: renamed from: w */
    public boolean f83380w;

    /* JADX INFO: renamed from: l */
    public boolean f83369l = false;

    /* JADX INFO: renamed from: m */
    public boolean f83370m = false;

    /* JADX INFO: renamed from: n */
    public boolean f83371n = false;

    /* JADX INFO: renamed from: o */
    public boolean f83372o = false;

    /* JADX INFO: renamed from: p */
    public boolean f83373p = false;

    /* JADX INFO: renamed from: q */
    public boolean f83374q = false;

    /* JADX INFO: renamed from: r */
    public boolean f83375r = false;

    /* JADX INFO: renamed from: s */
    public boolean f83376s = false;

    /* JADX INFO: renamed from: t */
    public boolean f83377t = false;

    /* JADX INFO: renamed from: u */
    public Map<String, Boolean> f83378u = new HashMap();

    /* JADX INFO: renamed from: x */
    public ArrayList<SidesSlipItemData> f83381x = new ArrayList<>();

    /* JADX INFO: renamed from: l.d2f0$a */
    public class C16290a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f83382a;

        public C16290a(boolean z) {
            this.f83382a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f83382a || d2f0.this.getAct().isFinishing()) {
                return;
            }
            d2f0.this.getAct().m47815F2();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
        }
    }

    public d2f0(SidesSlipActivity sidesSlipActivity) {
        this.f83363f = sidesSlipActivity;
    }

    /* JADX INFO: renamed from: n */
    private void m109732n() {
        xdl0.m208329E0(this.f83362e, new View.OnClickListener() { // from class: l.y1f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195409a.m109747u(view);
            }
        });
        this.f83366i.m133985Q(new e30() { // from class: l.z1f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201071a.m109748v((SidesSlipItemData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public final void m109733A() {
        if (this.f83364g.m206723J0()) {
            zvf0.m220403y("e_red_dot_me_settings", OMSDialogPositon.p_navigation_view, u4e.m191728c("red_dot", "red_dot_normal", "setting_tab", "navigation_view_page", "no_location_permission_tips"));
        }
    }

    /* JADX INFO: renamed from: B */
    public void m109734B(int i, boolean z) {
        if (i != 0) {
            if (i == 1) {
                this.f83372o = z;
                m109750x("认证中心", Boolean.valueOf(z));
            } else if (i == 3) {
                CoreModule.f17545c.f19663m0.f19428l1.put(Boolean.valueOf(upa.m194648I1() && z));
                m109750x("群聊", Boolean.valueOf(z));
            } else if (i == 4) {
                this.f83369l = z;
                m109750x("帮助与反馈", Boolean.valueOf(z));
            } else if (i == 8) {
                this.f83371n = z;
                m109750x("邀好友领VIP", Boolean.valueOf(z));
            } else if (i == 10) {
                this.f83374q = z;
                m109750x("每日加曝光", Boolean.valueOf(z));
            } else if (i == 12) {
                this.f83376s = z;
                m109750x("聊天助手", Boolean.valueOf(z));
            } else if (i == 13) {
                this.f83377t = z;
                m109750x("心动开场白", Boolean.valueOf(z));
            }
        } else {
            this.f83370m = z;
            m109750x("设置", Boolean.valueOf(z));
        }
        m109735C();
    }

    /* JADX INFO: renamed from: C */
    public void m109735C() {
        if (this.f83369l || this.f83370m || this.f83371n || this.f83372o || this.f83373p || this.f83374q || this.f83375r || this.f83376s || this.f83377t) {
            CoreModule.f17545c.f19663m0.f19425k1.put(Boolean.TRUE);
        } else {
            CoreModule.f17545c.f19663m0.f19425k1.put(Boolean.FALSE);
        }
    }

    @Override // p149l.s7m
    @NonNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f83363f;
    }

    /* JADX INFO: renamed from: E */
    public void m109736E(boolean z) {
        float fFloatValue = z ? 0.0f : 1.0f;
        float f = z ? 1.0f : 0.0f;
        ValueAnimator valueAnimator = this.f83365h;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) this.f83365h.getAnimatedValue()).floatValue();
            this.f83365h.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, f);
        this.f83365h = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        this.f83365h.setDuration(300L);
        this.f83365h.addUpdateListener(this);
        this.f83365h.addListener(new C16290a(z));
        this.f83365h.start();
    }

    /* JADX INFO: renamed from: f */
    public View m109737f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e2f0.m114499b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(x1f0 x1f0Var) {
        this.f83364g = x1f0Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m109737f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m109739j() {
        try {
            BlockGroupList blockGroupList = (BlockGroupList) RemoteConfig.m79298x().m79333v("mytab_group_remove", BlockGroupList.JSON_ADAPTER);
            if (!NullChecker.m81303a(blockGroupList)) {
                return false;
            }
            List<String> list = blockGroupList.blockList;
            String str = mr4.f135329a;
            if (vwb.m200296J(list) || TextUtils.isEmpty(str)) {
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
    public void m109740k() {
        if (!upa.m194669M2() || mqi0.m155944o() <= CoreModule.f17545c.f19659k2.f184656R.get().longValue()) {
            return;
        }
        int iM200293G = vwb.m200293G(this.f83367j, new w9j() { // from class: l.b2f0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((SidesSlipItemData) obj).getTitle(), "惊喜礼盒"));
            }
        });
        if (!vwb.m200322e0(this.f83367j, new w9j() { // from class: l.c2f0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((SidesSlipItemData) obj).getTitle(), "惊喜礼盒"));
            }
        }) || iM200293G < 0) {
            return;
        }
        this.f83366i.notifyItemRemoved(iM200293G);
        this.f83366i.notifyItemRangeChanged(iM200293G, this.f83367j.size() - iM200293G);
    }

    /* JADX INFO: renamed from: l */
    public void m109741l() {
        ValueAnimator valueAnimator = this.f83365h;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            m109736E(false);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m109742m() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        this.f83361d.setLayoutManager(linearLayoutManager);
        i1f0 i1f0Var = new i1f0(this, this.f83380w);
        this.f83366i = i1f0Var;
        this.f83361d.setAdapter(i1f0Var);
        this.f83366i.m133984P(this.f83367j);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f83359b.setTranslationX(t100.m186890d(280.0f) * (1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    /* JADX INFO: renamed from: p */
    public final void m109743p() {
        ArrayList arrayList = new ArrayList();
        this.f83367j = arrayList;
        if (this.f83380w) {
            arrayList.add(new SidesSlipItemData());
        }
        int size = 0;
        boolean z = (vdj.m198001c() || nkp.m159983b()) ? false : true;
        this.f83368k = z;
        if (!z) {
            SidesSlipItemData sidesSlipItemData = new SidesSlipItemData();
            this.f83379v = sidesSlipItemData;
            sidesSlipItemData.setIndex(0);
            this.f83379v.setTitle("钱包");
            boolean zM194847z = upa.m194847z();
            SidesSlipItemData sidesSlipItemData2 = this.f83379v;
            if (zM194847z) {
                sidesSlipItemData2.setNativeIcon(x2c0.f190651vg);
            } else {
                sidesSlipItemData2.setNativeIcon(x2c0.f190619ug);
            }
            this.f83367j.add(this.f83379v);
        }
        if (upa.m194669M2() && mqi0.m155944o() < CoreModule.f17545c.f19659k2.f184656R.get().longValue()) {
            SidesSlipItemData sidesSlipItemData3 = new SidesSlipItemData();
            this.f83379v = sidesSlipItemData3;
            sidesSlipItemData3.setIndex(0);
            this.f83379v.setTitle("惊喜礼盒");
            boolean zM194847z2 = upa.m194847z();
            SidesSlipItemData sidesSlipItemData4 = this.f83379v;
            if (zM194847z2) {
                sidesSlipItemData4.setNativeIcon(x2c0.f189402Hp);
            } else {
                sidesSlipItemData4.setNativeIcon(x2c0.f189371Gp);
            }
            this.f83367j.add(this.f83379v);
            zvf0.m220402x("e_surprisebox_navigation", this.f83363f.pageId());
            size = 1;
        }
        if (CoreModule.m29932K().me_().isFemale() && ft4.m123008b().m123015h()) {
            this.f83376s = !CoreModule.f17545c.f19611U1.f75277R.get().booleanValue();
            SidesSlipItemData sidesSlipItemData5 = new SidesSlipItemData();
            this.f83379v = sidesSlipItemData5;
            sidesSlipItemData5.setIndex(size);
            this.f83379v.setTitle("聊天助手");
            this.f83379v.setNativeIcon(x2c0.f190267jg);
            this.f83379v.setShowDot(Boolean.valueOf(this.f83376s));
            this.f83367j.add(this.f83379v);
            zvf0.m220402x("e_my_chat_assist_entrance", "p_my_page");
            size++;
        }
        if (y19.m212150J()) {
            SidesSlipItemData sidesSlipItemData6 = new SidesSlipItemData();
            this.f83379v = sidesSlipItemData6;
            sidesSlipItemData6.setIndex(size);
            this.f83379v.setTitle("我的开场白");
            this.f83379v.setNativeIcon(x2c0.f190416o5);
            this.f83367j.add(this.f83379v);
            zvf0.m220402x("e_opening_entrance", "p_my_page");
            size++;
        }
        if (upa.m194795o2() || upa.m194800p2()) {
            SidesSlipItemData sidesSlipItemData7 = new SidesSlipItemData();
            this.f83379v = sidesSlipItemData7;
            int i = size + 1;
            sidesSlipItemData7.setIndex(size);
            this.f83379v.setTitle("任务中心");
            boolean zM194847z3 = upa.m194847z();
            SidesSlipItemData sidesSlipItemData8 = this.f83379v;
            if (zM194847z3) {
                sidesSlipItemData8.setNativeIcon(x2c0.f190140ff);
            } else {
                sidesSlipItemData8.setNativeIcon(x2c0.f190108ef);
            }
            this.f83367j.add(this.f83379v);
            zvf0.m220402x("e_task_entrance", "p_my_page");
            size = i;
        }
        if (upa.m194648I1() && !m109739j()) {
            SidesSlipItemData sidesSlipItemData9 = new SidesSlipItemData();
            this.f83379v = sidesSlipItemData9;
            int i2 = size + 1;
            sidesSlipItemData9.setIndex(size);
            this.f83379v.setTitle("群聊");
            boolean zM194847z4 = upa.m194847z();
            SidesSlipItemData sidesSlipItemData10 = this.f83379v;
            if (zM194847z4) {
                sidesSlipItemData10.setNativeIcon(x2c0.f190363mg);
            } else {
                sidesSlipItemData10.setNativeIcon(x2c0.f190331lg);
            }
            this.f83367j.add(this.f83379v);
            size = i2;
        }
        if (CoreModule.m29936Q().mo67255a().mo124839f() && upa.m194686Q1()) {
            SidesSlipItemData sidesSlipItemData11 = new SidesSlipItemData();
            this.f83379v = sidesSlipItemData11;
            int i3 = size + 1;
            sidesSlipItemData11.setIndex(size);
            this.f83379v.setTitle("直播");
            this.f83379v.setShowDot(Boolean.FALSE);
            boolean zM194847z5 = upa.m194847z();
            SidesSlipItemData sidesSlipItemData12 = this.f83379v;
            if (zM194847z5) {
                sidesSlipItemData12.setNativeIcon(x2c0.f190427og);
            } else {
                sidesSlipItemData12.setNativeIcon(x2c0.f190395ng);
            }
            this.f83367j.add(this.f83379v);
            size = i3;
        }
        m109744q(size);
        if (!this.f83381x.isEmpty()) {
            this.f83367j.addAll(this.f83381x);
            size += this.f83381x.size();
        }
        SidesSlipItemData sidesSlipItemData13 = new SidesSlipItemData();
        this.f83379v = sidesSlipItemData13;
        int i4 = size + 1;
        sidesSlipItemData13.setIndex(size);
        this.f83379v.setTitle("关于探探");
        boolean zM194847z6 = upa.m194847z();
        SidesSlipItemData sidesSlipItemData14 = this.f83379v;
        if (zM194847z6) {
            sidesSlipItemData14.setNativeIcon(x2c0.f190236ig);
        } else {
            sidesSlipItemData14.setNativeIcon(x2c0.f190205hg);
        }
        this.f83367j.add(this.f83379v);
        this.f83370m = this.f83364g.m206725N0();
        SidesSlipItemData sidesSlipItemData15 = new SidesSlipItemData();
        this.f83379v = sidesSlipItemData15;
        sidesSlipItemData15.setIndex(i4);
        this.f83379v.setTitle("设置");
        boolean zM194847z7 = upa.m194847z();
        SidesSlipItemData sidesSlipItemData16 = this.f83379v;
        if (zM194847z7) {
            sidesSlipItemData16.setNativeIcon(x2c0.f190491qg);
        } else {
            sidesSlipItemData16.setNativeIcon(x2c0.f190459pg);
        }
        this.f83379v.setShowDot(Boolean.valueOf(this.f83364g.m206725N0()));
        this.f83367j.add(this.f83379v);
        if (upa.m194847z()) {
            this.f83367j.add(new SidesSlipItemData());
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m109744q(int i) {
        this.f83381x.clear();
        if (!vwb.m200296J(ic50.m135327j().m135337k()) && NullChecker.m81303a(ic50.m135327j().m135337k().get(0)) && NullChecker.m81303a(ic50.m135327j().m135337k().get(0).sidebarIcons)) {
            for (SideBarIconsInfo sideBarIconsInfo : ic50.m135327j().m135337k().get(0).sidebarIcons) {
                if (NullChecker.m81303a(sideBarIconsInfo.timeRange) && sideBarIconsInfo.timeRange.size() == 2 && sideBarIconsInfo.timeRange.get(0).longValue() <= mqi0.m155944o() / 1000 && sideBarIconsInfo.timeRange.get(1).longValue() >= mqi0.m155944o() / 1000 && NullChecker.m81303a(sideBarIconsInfo.picture) && !TextUtils.isEmpty(sideBarIconsInfo.picture.identifier)) {
                    SidesSlipItemData sidesSlipItemData = new SidesSlipItemData();
                    this.f83379v = sidesSlipItemData;
                    int i2 = i + 1;
                    sidesSlipItemData.setIndex(i);
                    this.f83379v.setType("online");
                    this.f83379v.setTitle(sideBarIconsInfo.title);
                    if (TextUtils.equals("邀好友领VIP", sideBarIconsInfo.title)) {
                        this.f83371n = CoreModule.f17545c.f19663m0.f19434n1.get().booleanValue();
                        this.f83379v.setShowDot(CoreModule.f17545c.f19663m0.f19434n1.get());
                    }
                    if (TextUtils.equals("每日加曝光", sideBarIconsInfo.title)) {
                        zvf0.m220402x("e_mypage_checkin", "p_my_page");
                        this.f83374q = CoreModule.f17545c.f19663m0.f19437o1.get().booleanValue();
                        this.f83379v.setShowDot(CoreModule.f17545c.f19663m0.f19437o1.get());
                    }
                    if (m109746s(this.f83379v)) {
                        try {
                            String str = CoreModule.f17545c.f19663m0.f19440p1.get();
                            JSONObject jSONObject = !TextUtils.isEmpty(str) ? new JSONObject(str) : new JSONObject();
                            boolean zOptBoolean = sideBarIconsInfo.redDotSwitch;
                            boolean zIsEmpty = TextUtils.isEmpty(str);
                            String str2 = sideBarIconsInfo.f38814id;
                            if (zIsEmpty) {
                                jSONObject.put(str2, sideBarIconsInfo.redDotSwitch);
                            } else {
                                zOptBoolean = jSONObject.optBoolean(str2, sideBarIconsInfo.redDotSwitch);
                                jSONObject.put(sideBarIconsInfo.f38814id, zOptBoolean);
                            }
                            this.f83379v.setShowDot(Boolean.valueOf(zOptBoolean));
                            this.f83378u.put(sideBarIconsInfo.f38814id, Boolean.valueOf(zOptBoolean));
                            CoreModule.f17545c.f19663m0.f19440p1.put(jSONObject.toString());
                        } catch (Exception unused) {
                        }
                    }
                    this.f83379v.setIconUrl(sideBarIconsInfo.picture.identifier);
                    this.f83379v.setDeepLink(sideBarIconsInfo.deeplink);
                    this.f83379v.setOmsId(sideBarIconsInfo.f38814id);
                    this.f83381x.add(this.f83379v);
                    i = i2;
                }
            }
            m109749w(this.f83378u);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m109745r() {
        this.f83380w = !upa.m194847z() && (upa.m194795o2() || upa.m194800p2() || bzc0.m104566f() || upa.m194715X2());
        m109743p();
        m109742m();
        m109732n();
        m109733A();
        m109735C();
        m109751y();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m109746s(SidesSlipItemData sidesSlipItemData) {
        return (!vy8.m200610h() || TextUtils.equals("邀好友领VIP", sidesSlipItemData.getTitle()) || TextUtils.equals("每日加曝光", sidesSlipItemData.getTitle())) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m109747u(View view) {
        m109741l();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m109748v(SidesSlipItemData sidesSlipItemData) {
        byte b = 0;
        if (TextUtils.equals("online", sidesSlipItemData.getType())) {
            if (TextUtils.equals("邀好友领VIP", sidesSlipItemData.getTitle())) {
                this.f83364g.m206734r0();
            } else if (TextUtils.equals("每日加曝光", sidesSlipItemData.getTitle())) {
                this.f83364g.m206730n0();
            }
            if (m109746s(sidesSlipItemData)) {
                try {
                    String str = CoreModule.f17545c.f19663m0.f19440p1.get();
                    JSONObject jSONObject = !TextUtils.isEmpty(str) ? new JSONObject(str) : new JSONObject();
                    Map<String, Boolean> map = this.f83378u;
                    String omsId = sidesSlipItemData.getOmsId();
                    Boolean bool = Boolean.FALSE;
                    map.put(omsId, bool);
                    m109749w(this.f83378u);
                    m109735C();
                    m109750x(sidesSlipItemData.getTitle(), bool);
                    jSONObject.put(sidesSlipItemData.getOmsId(), false);
                    CoreModule.f17545c.f19663m0.f19440p1.put(jSONObject.toString());
                } catch (Exception unused) {
                }
            }
            this.f83364g.m206736t0(sidesSlipItemData.getDeepLink(), sidesSlipItemData.getOmsId());
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
                this.f83364g.m206737u0();
                break;
            case 1:
                this.f83364g.m206716A0();
                this.f83363f.m47815F2();
                break;
            case 2:
                zvf0.m220396r("e_sidebar_share", OMSDialogPositon.p_navigation_view);
                this.f83364g.m206717C0();
                break;
            case 3:
                this.f83364g.m206735s0();
                break;
            case 4:
                this.f83364g.m206731o0();
                this.f83363f.m47815F2();
                break;
            case 5:
                this.f83364g.m206732p0();
                this.f83363f.m47815F2();
                break;
            case 6:
                this.f83364g.m206740z0(true);
                this.f83363f.m47815F2();
                break;
            case 7:
                this.f83364g.m206722H0();
                this.f83363f.m47815F2();
                break;
            case 8:
                this.f83364g.m206721G0();
                this.f83363f.m47815F2();
                break;
            case 9:
                this.f83364g.m206719E0();
                this.f83363f.m47815F2();
                break;
            case 10:
                this.f83364g.m206729m0();
                this.f83363f.m47815F2();
                break;
            case 11:
                this.f83364g.m206718D0();
                break;
            case 12:
                this.f83364g.m206738x0();
                break;
            case 13:
                this.f83364g.m206726O0();
                this.f83363f.m47815F2();
                break;
            case 14:
                this.f83364g.m206720F0();
                this.f83363f.m47815F2();
                break;
            case 15:
                this.f83364g.m206733q0();
                break;
        }
    }

    /* JADX INFO: renamed from: w */
    public void m109749w(Map<String, Boolean> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        Iterator<Map.Entry<String, Boolean>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            boolean zBooleanValue = it.next().getValue().booleanValue();
            this.f83375r = zBooleanValue;
            if (zBooleanValue) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m109750x(final String str, Boolean bool) {
        int iM200293G = vwb.m200293G(this.f83367j, new w9j() { // from class: l.a2f0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((SidesSlipItemData) obj).getTitle()));
            }
        });
        if (iM200293G != -1) {
            this.f83367j.get(iM200293G).setShowDot(bool);
        }
        this.f83366i.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: y */
    public final void m109751y() {
        if (!this.f83368k) {
            o6j0.m162864h("e_wallet", this.f83363f.pageId(), new o6j0.C18854a[0]);
        }
        if (upa.m194648I1()) {
            o6j0.m162864h("e_group_entrance", this.f83363f.pageId(), new o6j0.C18854a[0]);
        }
        if (this.f83381x.isEmpty()) {
            return;
        }
        Iterator<SidesSlipItemData> it = this.f83381x.iterator();
        while (it.hasNext()) {
            zvf0.m220368A("e_oms_slot", this.f83363f.pageId(), vwb.m200311Y("oms_trace", it.next().getOmsId()));
        }
    }

    /* JADX INFO: renamed from: z */
    public void m109752z(User user) {
        xdl0.m208344M(this.f83360c, true);
        this.f83360c.m43484W(this.f83363f, user);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
