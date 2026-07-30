package com.p051p1.mobile.putong.core.newui.container;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0428k;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.helpcenter.NewHelpCenterFrag;
import com.p051p1.mobile.putong.core.p058ui.helpcenter.HelpCenterFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.ProfileListFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListFragExpandedImpl;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListFragLocalImpl;
import com.p051p1.mobile.putong.core.p058ui.settings.SettingsFragOld;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p153l.adc0;
import p153l.crl;
import p153l.gra;
import p153l.kec0;
import p153l.psd0;
import p153l.tx0;
import p153l.y20;
import p153l.yyh0;

/* JADX INFO: loaded from: classes11.dex */
@Deprecated
public class NewUI1ContainerActivity extends PutongAct implements crl {

    /* JADX INFO: renamed from: c */
    public PutongFrag f22034c;

    /* JADX INFO: renamed from: a2 */
    private boolean m37188a2(MotionEvent motionEvent, boolean z) {
        PutongFrag putongFrag = this.f22034c;
        if (putongFrag != null) {
            return putongFrag.mo30632D4(motionEvent, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: Z1 */
    public final PutongFrag m37189Z1(String str, boolean z, boolean z2, int i, boolean z3, String str2, int i2, int i3) {
        PutongFrag putongFragM53589O4;
        Class<? extends PutongFrag> clsM37190b2 = m37190b2(str);
        if (clsM37190b2 == null) {
            return null;
        }
        if (clsM37190b2 == ProfileListFrag.class) {
            putongFragM53589O4 = ProfileListFrag.m53026D8(CoreModule.m30929H().userId(), false, false, "home_menu", false, z2);
        } else if (clsM37190b2 == ProfileListFragLocalImpl.class) {
            putongFragM53589O4 = ProfileListFragLocalImpl.m53842S4(CoreModule.m30929H().userId(), false, false, "home_menu", false, z2);
        } else {
            putongFragM53589O4 = clsM37190b2 == ProfileListFragExpandedImpl.class ? ProfileListFragExpandedImpl.m53589O4(CoreModule.m30929H().userId(), false, false, "home_menu", false, z2) : null;
        }
        if (putongFragM53589O4 != null) {
            return putongFragM53589O4;
        }
        if (clsM37190b2 == SettingsFragOld.class) {
            return (!yyh0.INSTANCE.m217993i() || TextUtils.isEmpty(str2)) ? SettingsFragOld.m56221O4(z) : SettingsFragOld.m56222P4(z, i, z3, str2, i2, i3);
        }
        try {
            return clsM37190b2.newInstance();
        } catch (IllegalAccessException e) {
            CrashHelper.m82479c(e);
            return null;
        } catch (InstantiationException e2) {
            CrashHelper.m82479c(e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b2 */
    public final Class<? extends PutongFrag> m37190b2(String str) {
        str.getClass();
        switch (str) {
            case "HelpCenterFrag":
                Locale locale = CoreModule.f18263b.getResources().getConfiguration().locale;
                return ("zh".equalsIgnoreCase(locale.getLanguage()) && "CN".equalsIgnoreCase(locale.getCountry())) ? HelpCenterFrag.class : NewHelpCenterFrag.class;
            case "ProfileListFrag":
            case "ProfileFrag":
                return gra.m131601M3() ? ProfileListFragExpandedImpl.class : ProfileListFrag.class;
            case "SettingsFragOld":
                return SettingsFragOld.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: c2 */
    public final void m37191c2() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.nj40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142268a.m37192d2((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m37192d2(C4470c c4470c) {
        if (c4470c == C4470c.f16267i && Act.isFromBackground) {
            tx0.m193439o().m193448K(act());
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return m37188a2(motionEvent, false) || super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e2 */
    public final void m37193e2(PutongFrag putongFrag, String str) {
        AbstractC0428k abstractC0428kM2568m = getSupportFragmentManager().m2568m();
        abstractC0428kM2568m.m2805c(adc0.f70037Nb, putongFrag, str);
        abstractC0428kM2568m.mo2709j();
    }

    /* JADX INFO: renamed from: g2 */
    public final void m37194g2(Bundle bundle) {
        if (NullChecker.m82486a(fragmentManager().m2555h0(adc0.f70037Nb))) {
            return;
        }
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("fragmentName");
        PutongFrag putongFragM37189Z1 = m37189Z1(stringExtra, intent.getBooleanExtra("setting_scroll_to_bottom", false), intent.getBooleanExtra("can_show_follow_button", false), intent.getIntExtra("searchRadius", 0), intent.getBooleanExtra("autoSearch", false), intent.getStringExtra("gender"), intent.getIntExtra("minAge", 0), intent.getIntExtra("maxAge", 0));
        this.f22034c = putongFragM37189Z1;
        if (putongFragM37189Z1 == null) {
            m48999H2();
        } else {
            m37193e2(putongFragM37189Z1, stringExtra);
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(kec0.f126073te, (ViewGroup) null);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new y20() { // from class: l.mj40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137056a.m37194g2((Bundle) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        m37191c2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        PutongFrag putongFrag = this.f22034c;
        if ((putongFrag instanceof SettingsFragOld) && ((SettingsFragOld) putongFrag).m56220o()) {
            return;
        }
        super.onBackPressed();
    }
}
