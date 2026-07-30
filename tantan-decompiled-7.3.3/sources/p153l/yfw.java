package p153l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.FateRadar;
import com.p051p1.mobile.putong.core.data.FateRadarGreeting;
import com.p051p1.mobile.putong.core.data.FateRadarSearchConditions;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.newui.messages.addressbook.loveradar.ChooseGreetingsView;
import com.p051p1.mobile.putong.core.newui.messages.addressbook.loveradar.FilterPairedUsersView;
import com.p051p1.mobile.putong.core.newui.messages.addressbook.loveradar.RadarSwitchView;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.Interest;
import com.p051p1.mobile.putong.data.Profile;
import java.util.ArrayList;
import java.util.List;
import p151v.VButton;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class yfw implements iam<xfw> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f199655a;

    /* JADX INFO: renamed from: b */
    public NestedScrollView f199656b;

    /* JADX INFO: renamed from: c */
    public RadarSwitchView f199657c;

    /* JADX INFO: renamed from: d */
    public FilterPairedUsersView f199658d;

    /* JADX INFO: renamed from: e */
    public ChooseGreetingsView f199659e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f199660f;

    /* JADX INFO: renamed from: g */
    public VImage f199661g;

    /* JADX INFO: renamed from: h */
    public VText f199662h;

    /* JADX INFO: renamed from: i */
    public VButton f199663i;

    /* JADX INFO: renamed from: j */
    public VProgressBar f199664j;

    /* JADX INFO: renamed from: k */
    public final Act f199665k;

    /* JADX INFO: renamed from: l */
    public xfw f199666l;

    /* JADX INFO: renamed from: l.yfw$a */
    public class ViewOnClickListenerC21578a implements View.OnClickListener {
        public ViewOnClickListenerC21578a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            yfw.this.f199666l.m210843y0();
        }
    }

    /* JADX INFO: renamed from: l.yfw$b */
    public class C21579b implements y20<String> {
        public C21579b() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            yfw.this.f199666l.m210837p0(TextUtils.equals("open", str));
            i4g0.m138523u("e_love_radar_switch", yfw.this.getAct().pageId(), jyb.m147494Y("change", TextUtils.equals("open", str) ? "off2on" : "on2off"));
        }
    }

    /* JADX INFO: renamed from: l.yfw$c */
    public class C21580c implements y20<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FateRadar f199669a;

        public C21580c(FateRadar fateRadar) {
            this.f199669a = fateRadar;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            FateRadarSearchConditions fateRadarSearchConditions = this.f199669a.searchConditions;
            fateRadarSearchConditions.option = str;
            yfw.this.f199666l.m210836A0(fateRadarSearchConditions);
        }
    }

    /* JADX INFO: renamed from: l.yfw$d */
    public class C21581d implements y20<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FateRadar f199671a;

        public C21581d(FateRadar fateRadar) {
            this.f199671a = fateRadar;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            FateRadarGreeting fateRadarGreeting = this.f199671a.greetings;
            fateRadarGreeting.option = str;
            yfw.this.f199666l.m210844z0(fateRadarGreeting);
        }
    }

    /* JADX INFO: renamed from: l.yfw$e */
    public class C21582e implements y20<Integer> {
        public C21582e() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Integer num) {
            yfw.this.f199666l.m210838q0(num.intValue());
        }
    }

    /* JADX INFO: renamed from: l.yfw$f */
    public class RunnableC21583f implements Runnable {
        public RunnableC21583f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            yfw.this.f199656b.m1374q(130);
        }
    }

    public yfw(Act act) {
        this.f199665k = act;
    }

    /* JADX INFO: renamed from: c */
    private static List<NewTags> m215815c() {
        Extensions extensions;
        Interest interest;
        if (gra.m131596L3()) {
            return new ArrayList();
        }
        Profile profile = CoreModule.f18264c.f20381e0.m116600p9().profile;
        return (profile == null || (extensions = profile.extensions) == null || (interest = extensions.interest) == null || jyb.m147479J(interest.tags)) ? new ArrayList() : gj40.m130415o().m130431P(CoreModule.f18264c.f20381e0.m116600p9().profile.extensions.interest.tags).m130460b();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f199665k;
    }

    /* JADX INFO: renamed from: a */
    public View m215816a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zfw.m219586b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(xfw xfwVar) {
        this.f199666l = xfwVar;
    }

    /* JADX INFO: renamed from: d */
    public void m215818d(Bundle bundle) {
        VText vText = new VText(this.f199665k);
        vText.setText("缘分雷达设置");
        vText.setTextSize(21.0f);
        vText.setTextColor(this.f199665k.getResources().getColor(b9c0.f75557c));
        vText.setPadding(0, qa00.m175859d(2.0f), 0, 0);
        vText.setTypeface(null, 1);
        this.f199655a.setTitleView(vText);
        this.f199655a.setLeftIconAsBack(this.f199665k);
        bnl0.m105509E0(this.f199663i, new ViewOnClickListenerC21578a());
        boolean zM147479J = jyb.m147479J(m215815c());
        FilterPairedUsersView filterPairedUsersView = this.f199658d;
        if (zM147479J) {
            filterPairedUsersView.setShowInterest(false);
        } else {
            filterPairedUsersView.setShowInterest(true);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m215819e() {
        l51.m152888H(this.f199665k, new RunnableC21583f(), 100L);
    }

    /* JADX INFO: renamed from: f */
    public void m215820f() {
        bnl0.m105524M(this.f199656b, false);
        bnl0.m105524M(this.f199660f, true);
        bnl0.m105524M(this.f199664j, false);
    }

    /* JADX INFO: renamed from: i */
    public void m215821i() {
        bnl0.m105524M(this.f199656b, false);
        bnl0.m105524M(this.f199660f, false);
        bnl0.m105524M(this.f199664j, true);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m215816a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m215822j(FateRadar fateRadar) {
        if (fateRadar == null) {
            return;
        }
        int i = 1;
        bnl0.m105524M(this.f199656b, true);
        bnl0.m105524M(this.f199660f, false);
        bnl0.m105524M(this.f199664j, false);
        boolean z = fateRadar.switchSetting.status;
        RadarSwitchView radarSwitchView = this.f199657c;
        if (z) {
            radarSwitchView.setCurState("open");
        } else {
            radarSwitchView.setCurState("close");
            i = 0;
        }
        i4g0.m138492A("e_love_radar_switch", getAct().pageId(), jyb.m147494Y("switch_config_type", Integer.valueOf(i)));
        this.f199657c.setAfterChangeStateListener(new C21579b());
        this.f199658d.m42911c(fateRadar);
        boolean zEquals = TextUtils.equals(fateRadar.searchConditions.option, "custom");
        FilterPairedUsersView filterPairedUsersView = this.f199658d;
        if (zEquals) {
            filterPairedUsersView.m42912d();
        } else {
            filterPairedUsersView.m42913e();
        }
        this.f199658d.setAfterChangeStateListener(new C21580c(fateRadar));
        this.f199659e.m42902f(fateRadar);
        this.f199659e.setAfterChangeStateListener(new C21581d(fateRadar));
        this.f199659e.setDelGreetingListener(new C21582e());
        boolean zEquals2 = TextUtils.equals(fateRadar.greetings.option, "custom");
        ChooseGreetingsView chooseGreetingsView = this.f199659e;
        if (zEquals2) {
            chooseGreetingsView.m42905i();
        } else {
            chooseGreetingsView.m42906j();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m215823k(boolean z) {
        this.f199657c.m42927d(z ? "open" : "close");
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
