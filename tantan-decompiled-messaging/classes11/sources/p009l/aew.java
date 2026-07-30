package p009l;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import com.p000p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView;
import com.p000p1.mobile.putong.core.newui.messages.addressbook.loveradar.FilterPairedUsersView;
import com.p000p1.mobile.putong.core.newui.messages.addressbook.loveradar.RadarSwitchView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.FateRadar;
import com.p1.mobile.putong.core.data.FateRadarGreeting;
import com.p1.mobile.putong.core.data.FateRadarSearchConditions;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Interest;
import com.p1.mobile.putong.data.Profile;
import java.util.ArrayList;
import java.util.List;
import l.bew;
import l.e30;
import l.e51;
import l.j760;
import l.s7m;
import l.sa40;
import l.t100;
import l.upa;
import l.v0c0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VButton;
import v.VImage;
import v.VProgressBar;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class aew implements s7m<zdw> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f9440a;

    /* JADX INFO: renamed from: b */
    public NestedScrollView f9441b;

    /* JADX INFO: renamed from: c */
    public RadarSwitchView f9442c;

    /* JADX INFO: renamed from: d */
    public FilterPairedUsersView f9443d;

    /* JADX INFO: renamed from: e */
    public ChooseGreetingsView f9444e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f9445f;

    /* JADX INFO: renamed from: g */
    public VImage f9446g;

    /* JADX INFO: renamed from: h */
    public VText f9447h;

    /* JADX INFO: renamed from: i */
    public VButton f9448i;

    /* JADX INFO: renamed from: j */
    public VProgressBar f9449j;

    /* JADX INFO: renamed from: k */
    public final Act f9450k;

    /* JADX INFO: renamed from: l */
    public zdw f9451l;

    /* JADX INFO: renamed from: l.aew$a */
    public class ViewOnClickListenerC0750a implements View.OnClickListener {
        public ViewOnClickListenerC0750a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            aew.this.f9451l.m25736y0();
        }
    }

    /* JADX INFO: renamed from: l.aew$b */
    public class C0751b implements e30<String> {
        public C0751b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            aew.this.f9451l.m25730p0(TextUtils.equals("open", str));
            zvf0.u("e_love_radar_switch", aew.this.act().pageId(), new j760[]{vwb.Y("change", TextUtils.equals("open", str) ? "off2on" : "on2off")});
        }
    }

    /* JADX INFO: renamed from: l.aew$c */
    public class C0752c implements e30<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FateRadar f9454a;

        public C0752c(FateRadar fateRadar) {
            this.f9454a = fateRadar;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            FateRadarSearchConditions fateRadarSearchConditions = this.f9454a.searchConditions;
            fateRadarSearchConditions.option = str;
            aew.this.f9451l.m25728A0(fateRadarSearchConditions);
        }
    }

    /* JADX INFO: renamed from: l.aew$d */
    public class C0753d implements e30<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FateRadar f9456a;

        public C0753d(FateRadar fateRadar) {
            this.f9456a = fateRadar;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            FateRadarGreeting fateRadarGreeting = this.f9456a.greetings;
            fateRadarGreeting.option = str;
            aew.this.f9451l.m25737z0(fateRadarGreeting);
        }
    }

    /* JADX INFO: renamed from: l.aew$e */
    public class C0754e implements e30<Integer> {
        public C0754e() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Integer num) {
            aew.this.f9451l.m25731q0(num.intValue());
        }
    }

    /* JADX INFO: renamed from: l.aew$f */
    public class RunnableC0755f implements Runnable {
        public RunnableC0755f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            aew.this.f9441b.q(130);
        }
    }

    public aew(Act act) {
        this.f9450k = act;
    }

    /* JADX INFO: renamed from: c */
    private static List<NewTags> m11351c() {
        Extensions extensions;
        Interest interest;
        if (upa.L3()) {
            return new ArrayList();
        }
        Profile profile = CoreModule.c.e0.p9().profile;
        return (profile == null || (extensions = profile.extensions) == null || (interest = extensions.interest) == null || vwb.J(interest.tags)) ? new ArrayList() : sa40.o().P(CoreModule.c.e0.p9().profile.extensions.interest.tags).b();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m11352C0() {
        return this.f9450k;
    }

    /* JADX INFO: renamed from: a */
    public View m11353a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bew.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m11359i1(zdw zdwVar) {
        this.f9451l = zdwVar;
    }

    /* JADX INFO: renamed from: d */
    public void m11355d(Bundle bundle) {
        VText vText = new VText(this.f9450k);
        vText.setText("缘分雷达设置");
        vText.setTextSize(21.0f);
        vText.setTextColor(this.f9450k.getResources().getColor(v0c0.c));
        vText.setPadding(0, t100.d(2.0f), 0, 0);
        vText.setTypeface((Typeface) null, 1);
        this.f9440a.setTitleView(vText);
        this.f9440a.setLeftIconAsBack(this.f9450k);
        xdl0.E0(this.f9448i, new ViewOnClickListenerC0750a());
        boolean zJ = vwb.J(m11351c());
        FilterPairedUsersView filterPairedUsersView = this.f9443d;
        if (zJ) {
            filterPairedUsersView.setShowInterest(false);
        } else {
            filterPairedUsersView.setShowInterest(true);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m11356e() {
        e51.H(this.f9450k, new RunnableC0755f(), 100L);
    }

    /* JADX INFO: renamed from: f */
    public void m11357f() {
        xdl0.M(this.f9441b, false);
        xdl0.M(this.f9445f, true);
        xdl0.M(this.f9449j, false);
    }

    /* JADX INFO: renamed from: i */
    public void m11358i() {
        xdl0.M(this.f9441b, false);
        xdl0.M(this.f9445f, false);
        xdl0.M(this.f9449j, true);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m11353a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m11360j(FateRadar fateRadar) {
        if (fateRadar == null) {
            return;
        }
        int i = 1;
        xdl0.M(this.f9441b, true);
        xdl0.M(this.f9445f, false);
        xdl0.M(this.f9449j, false);
        boolean z = fateRadar.switchSetting.status;
        RadarSwitchView radarSwitchView = this.f9442c;
        if (z) {
            radarSwitchView.setCurState("open");
        } else {
            radarSwitchView.setCurState("close");
            i = 0;
        }
        zvf0.A("e_love_radar_switch", act().pageId(), new j760[]{vwb.Y("switch_config_type", Integer.valueOf(i))});
        this.f9442c.setAfterChangeStateListener(new C0751b());
        this.f9443d.m6036c(fateRadar);
        boolean zEquals = TextUtils.equals(fateRadar.searchConditions.option, "custom");
        FilterPairedUsersView filterPairedUsersView = this.f9443d;
        if (zEquals) {
            filterPairedUsersView.m6037d();
        } else {
            filterPairedUsersView.m6038e();
        }
        this.f9443d.setAfterChangeStateListener(new C0752c(fateRadar));
        this.f9444e.m6027f(fateRadar);
        this.f9444e.setAfterChangeStateListener(new C0753d(fateRadar));
        this.f9444e.setDelGreetingListener(new C0754e());
        boolean zEquals2 = TextUtils.equals(fateRadar.greetings.option, "custom");
        ChooseGreetingsView chooseGreetingsView = this.f9444e;
        if (zEquals2) {
            chooseGreetingsView.m6030i();
        } else {
            chooseGreetingsView.m6031j();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m11361k(boolean z) {
        this.f9442c.m6058d(z ? "open" : "close");
    }

    public void destroy() {
    }
}
