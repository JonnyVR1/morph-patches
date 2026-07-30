package p149l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.FateRadar;
import com.p046p1.mobile.putong.core.data.FateRadarGreeting;
import com.p046p1.mobile.putong.core.data.FateRadarSearchConditions;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView;
import com.p046p1.mobile.putong.core.newui.messages.addressbook.loveradar.FilterPairedUsersView;
import com.p046p1.mobile.putong.core.newui.messages.addressbook.loveradar.RadarSwitchView;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Interest;
import com.p046p1.mobile.putong.data.Profile;
import java.util.ArrayList;
import java.util.List;
import p147v.VButton;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class aew implements s7m<zdw> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f69105a;

    /* JADX INFO: renamed from: b */
    public NestedScrollView f69106b;

    /* JADX INFO: renamed from: c */
    public RadarSwitchView f69107c;

    /* JADX INFO: renamed from: d */
    public FilterPairedUsersView f69108d;

    /* JADX INFO: renamed from: e */
    public ChooseGreetingsView f69109e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f69110f;

    /* JADX INFO: renamed from: g */
    public VImage f69111g;

    /* JADX INFO: renamed from: h */
    public VText f69112h;

    /* JADX INFO: renamed from: i */
    public VButton f69113i;

    /* JADX INFO: renamed from: j */
    public VProgressBar f69114j;

    /* JADX INFO: renamed from: k */
    public final Act f69115k;

    /* JADX INFO: renamed from: l */
    public zdw f69116l;

    /* JADX INFO: renamed from: l.aew$a */
    public class ViewOnClickListenerC15592a implements View.OnClickListener {
        public ViewOnClickListenerC15592a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            aew.this.f69116l.m218228y0();
        }
    }

    /* JADX INFO: renamed from: l.aew$b */
    public class C15593b implements e30<String> {
        public C15593b() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            aew.this.f69116l.m218222p0(TextUtils.equals("open", str));
            zvf0.m220399u("e_love_radar_switch", aew.this.getAct().pageId(), vwb.m200311Y("change", TextUtils.equals("open", str) ? "off2on" : "on2off"));
        }
    }

    /* JADX INFO: renamed from: l.aew$c */
    public class C15594c implements e30<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FateRadar f69119a;

        public C15594c(FateRadar fateRadar) {
            this.f69119a = fateRadar;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            FateRadarSearchConditions fateRadarSearchConditions = this.f69119a.searchConditions;
            fateRadarSearchConditions.option = str;
            aew.this.f69116l.m218221A0(fateRadarSearchConditions);
        }
    }

    /* JADX INFO: renamed from: l.aew$d */
    public class C15595d implements e30<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FateRadar f69121a;

        public C15595d(FateRadar fateRadar) {
            this.f69121a = fateRadar;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            FateRadarGreeting fateRadarGreeting = this.f69121a.greetings;
            fateRadarGreeting.option = str;
            aew.this.f69116l.m218229z0(fateRadarGreeting);
        }
    }

    /* JADX INFO: renamed from: l.aew$e */
    public class C15596e implements e30<Integer> {
        public C15596e() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Integer num) {
            aew.this.f69116l.m218223q0(num.intValue());
        }
    }

    /* JADX INFO: renamed from: l.aew$f */
    public class RunnableC15597f implements Runnable {
        public RunnableC15597f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            aew.this.f69106b.m1373q(130);
        }
    }

    public aew(Act act) {
        this.f69115k = act;
    }

    /* JADX INFO: renamed from: c */
    private static List<NewTags> m96133c() {
        Extensions extensions;
        Interest interest;
        if (upa.m194665L3()) {
            return new ArrayList();
        }
        Profile profile = CoreModule.f17545c.f19639e0.m169527p9().profile;
        return (profile == null || (extensions = profile.extensions) == null || (interest = extensions.interest) == null || vwb.m200296J(interest.tags)) ? new ArrayList() : sa40.m182802o().m182818P(CoreModule.f17545c.f19639e0.m169527p9().profile.extensions.interest.tags).m182847b();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f69115k;
    }

    /* JADX INFO: renamed from: a */
    public View m96134a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bew.m101421b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(zdw zdwVar) {
        this.f69116l = zdwVar;
    }

    /* JADX INFO: renamed from: d */
    public void m96136d(Bundle bundle) {
        VText vText = new VText(this.f69115k);
        vText.setText("缘分雷达设置");
        vText.setTextSize(21.0f);
        vText.setTextColor(this.f69115k.getResources().getColor(v0c0.f179096c));
        vText.setPadding(0, t100.m186890d(2.0f), 0, 0);
        vText.setTypeface(null, 1);
        this.f69105a.setTitleView(vText);
        this.f69105a.setLeftIconAsBack(this.f69115k);
        xdl0.m208329E0(this.f69113i, new ViewOnClickListenerC15592a());
        boolean zM200296J = vwb.m200296J(m96133c());
        FilterPairedUsersView filterPairedUsersView = this.f69108d;
        if (zM200296J) {
            filterPairedUsersView.setShowInterest(false);
        } else {
            filterPairedUsersView.setShowInterest(true);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m96137e() {
        e51.m114743H(this.f69115k, new RunnableC15597f(), 100L);
    }

    /* JADX INFO: renamed from: f */
    public void m96138f() {
        xdl0.m208344M(this.f69106b, false);
        xdl0.m208344M(this.f69110f, true);
        xdl0.m208344M(this.f69114j, false);
    }

    /* JADX INFO: renamed from: i */
    public void m96139i() {
        xdl0.m208344M(this.f69106b, false);
        xdl0.m208344M(this.f69110f, false);
        xdl0.m208344M(this.f69114j, true);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m96134a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m96140j(FateRadar fateRadar) {
        if (fateRadar == null) {
            return;
        }
        int i = 1;
        xdl0.m208344M(this.f69106b, true);
        xdl0.m208344M(this.f69110f, false);
        xdl0.m208344M(this.f69114j, false);
        boolean z = fateRadar.switchSetting.status;
        RadarSwitchView radarSwitchView = this.f69107c;
        if (z) {
            radarSwitchView.setCurState("open");
        } else {
            radarSwitchView.setCurState("close");
            i = 0;
        }
        zvf0.m220368A("e_love_radar_switch", getAct().pageId(), vwb.m200311Y("switch_config_type", Integer.valueOf(i)));
        this.f69107c.setAfterChangeStateListener(new C15593b());
        this.f69108d.m41900c(fateRadar);
        boolean zEquals = TextUtils.equals(fateRadar.searchConditions.option, "custom");
        FilterPairedUsersView filterPairedUsersView = this.f69108d;
        if (zEquals) {
            filterPairedUsersView.m41901d();
        } else {
            filterPairedUsersView.m41902e();
        }
        this.f69108d.setAfterChangeStateListener(new C15594c(fateRadar));
        this.f69109e.m41891f(fateRadar);
        this.f69109e.setAfterChangeStateListener(new C15595d(fateRadar));
        this.f69109e.setDelGreetingListener(new C15596e());
        boolean zEquals2 = TextUtils.equals(fateRadar.greetings.option, "custom");
        ChooseGreetingsView chooseGreetingsView = this.f69109e;
        if (zEquals2) {
            chooseGreetingsView.m41894i();
        } else {
            chooseGreetingsView.m41895j();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m96141k(boolean z) {
        this.f69107c.m41916d(z ? "open" : "close");
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
