package com.p046p1.mobile.putong.core.newui.container;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0427k;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.helpcenter.NewHelpCenterFrag;
import com.p046p1.mobile.putong.core.p053ui.helpcenter.HelpCenterFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.ProfileListFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListFragExpandedImpl;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListFragLocalImpl;
import com.p046p1.mobile.putong.core.p053ui.settings.SettingsFragOld;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p149l.e30;
import p149l.f6c0;
import p149l.mkd0;
import p149l.mx0;
import p149l.qqh0;
import p149l.rol;
import p149l.u4c0;
import p149l.upa;

/* JADX INFO: loaded from: classes11.dex */
@Deprecated
public class NewUI1ContainerActivity extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public PutongFrag f21292c;

    /* JADX INFO: renamed from: Z1 */
    private boolean m36185Z1(MotionEvent motionEvent, boolean z) {
        PutongFrag putongFrag = this.f21292c;
        if (putongFrag != null) {
            return putongFrag.mo29634D4(motionEvent, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: Y1 */
    public final PutongFrag m36186Y1(String str, boolean z, boolean z2, int i, boolean z3, String str2, int i2, int i3) {
        PutongFrag putongFragM52406O4;
        Class<? extends PutongFrag> clsM36187a2 = m36187a2(str);
        if (clsM36187a2 == null) {
            return null;
        }
        if (clsM36187a2 == ProfileListFrag.class) {
            putongFragM52406O4 = ProfileListFrag.m51843D8(CoreModule.m29931H().userId(), false, false, "home_menu", false, z2);
        } else if (clsM36187a2 == ProfileListFragLocalImpl.class) {
            putongFragM52406O4 = ProfileListFragLocalImpl.m52659S4(CoreModule.m29931H().userId(), false, false, "home_menu", false, z2);
        } else {
            putongFragM52406O4 = clsM36187a2 == ProfileListFragExpandedImpl.class ? ProfileListFragExpandedImpl.m52406O4(CoreModule.m29931H().userId(), false, false, "home_menu", false, z2) : null;
        }
        if (putongFragM52406O4 != null) {
            return putongFragM52406O4;
        }
        if (clsM36187a2 == SettingsFragOld.class) {
            return (!qqh0.INSTANCE.m175930i() || TextUtils.isEmpty(str2)) ? SettingsFragOld.m55038O4(z) : SettingsFragOld.m55039P4(z, i, z3, str2, i2, i3);
        }
        try {
            return clsM36187a2.newInstance();
        } catch (IllegalAccessException e) {
            CrashHelper.m81296c(e);
            return null;
        } catch (InstantiationException e2) {
            CrashHelper.m81296c(e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: a2 */
    public final Class<? extends PutongFrag> m36187a2(String str) {
        str.getClass();
        switch (str) {
            case "HelpCenterFrag":
                Locale locale = CoreModule.f17544b.getResources().getConfiguration().locale;
                return ("zh".equalsIgnoreCase(locale.getLanguage()) && "CN".equalsIgnoreCase(locale.getCountry())) ? HelpCenterFrag.class : NewHelpCenterFrag.class;
            case "ProfileListFrag":
            case "ProfileFrag":
                return upa.m194670M3() ? ProfileListFragExpandedImpl.class : ProfileListFrag.class;
            case "SettingsFragOld":
                return SettingsFragOld.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: b2 */
    public final void m36188b2() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.za40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202328a.m36189c2((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m36189c2(C4319c c4319c) {
        if (c4319c == C4319c.f15548i && Act.isFromBackground) {
            mx0.m156802o().m156811K(act());
        }
    }

    /* JADX INFO: renamed from: d2 */
    public final void m36190d2(PutongFrag putongFrag, String str) {
        AbstractC0427k abstractC0427kM2567m = getSupportFragmentManager().m2567m();
        abstractC0427kM2567m.m2804c(u4c0.f173915Lb, putongFrag, str);
        abstractC0427kM2567m.mo2708j();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return m36185Z1(motionEvent, false) || super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e2 */
    public final void m36191e2(Bundle bundle) {
        if (NullChecker.m81303a(fragmentManager().m2554h0(u4c0.f173915Lb))) {
            return;
        }
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("fragmentName");
        PutongFrag putongFragM36186Y1 = m36186Y1(stringExtra, intent.getBooleanExtra("setting_scroll_to_bottom", false), intent.getBooleanExtra("can_show_follow_button", false), intent.getIntExtra("searchRadius", 0), intent.getBooleanExtra("autoSearch", false), intent.getStringExtra("gender"), intent.getIntExtra("minAge", 0), intent.getIntExtra("maxAge", 0));
        this.f21292c = putongFragM36186Y1;
        if (putongFragM36186Y1 == null) {
            m47815F2();
        } else {
            m36190d2(putongFragM36186Y1, stringExtra);
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(f6c0.f95900me, (ViewGroup) null);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.ya40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197139a.m36191e2((Bundle) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        m36188b2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        PutongFrag putongFrag = this.f21292c;
        if ((putongFrag instanceof SettingsFragOld) && ((SettingsFragOld) putongFrag).m55037o()) {
            return;
        }
        super.onBackPressed();
    }
}
