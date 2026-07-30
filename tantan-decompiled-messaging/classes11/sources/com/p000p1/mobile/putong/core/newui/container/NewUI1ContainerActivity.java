package com.p000p1.mobile.putong.core.newui.container;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.core.newui.helpcenter.NewHelpCenterFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.helpcenter.HelpCenterFrag;
import com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag;
import com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragExpandedImpl;
import com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalImpl;
import com.p1.mobile.putong.core.ui.settings.SettingsFragOld;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import l.e30;
import l.f6c0;
import l.mkd0;
import l.mx0;
import l.rol;
import l.u4c0;
import l.upa;
import p009l.qqh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Deprecated
public class NewUI1ContainerActivity extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public PutongFrag f70c;

    /* JADX INFO: renamed from: Z1 */
    private boolean m86Z1(MotionEvent motionEvent, boolean z) {
        PutongFrag putongFrag = this.f70c;
        if (putongFrag != null) {
            return putongFrag.D4(motionEvent, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: Y1 */
    public final PutongFrag m87Y1(String str, boolean z, boolean z2, int i, boolean z3, String str2, int i2, int i3) {
        ProfileListFrag profileListFragO4;
        Class<? extends PutongFrag> clsM88a2 = m88a2(str);
        if (clsM88a2 == null) {
            return null;
        }
        if (clsM88a2 == ProfileListFrag.class) {
            profileListFragO4 = ProfileListFrag.D8(CoreModule.H().userId(), false, false, "home_menu", false, z2);
        } else if (clsM88a2 == ProfileListFragLocalImpl.class) {
            profileListFragO4 = ProfileListFragLocalImpl.S4(CoreModule.H().userId(), false, false, "home_menu", false, z2);
        } else {
            profileListFragO4 = clsM88a2 == ProfileListFragExpandedImpl.class ? ProfileListFragExpandedImpl.O4(CoreModule.H().userId(), false, false, "home_menu", false, z2) : null;
        }
        if (profileListFragO4 != null) {
            return profileListFragO4;
        }
        if (clsM88a2 == SettingsFragOld.class) {
            return (!qqh0.INSTANCE.m21182i() || TextUtils.isEmpty(str2)) ? SettingsFragOld.O4(z) : SettingsFragOld.P4(z, i, z3, str2, i2, i3);
        }
        try {
            return clsM88a2.newInstance();
        } catch (IllegalAccessException e) {
            CrashHelper.c(e);
            return null;
        } catch (InstantiationException e2) {
            CrashHelper.c(e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: a2 */
    public final Class<? extends PutongFrag> m88a2(String str) {
        str.getClass();
        switch (str) {
            case "HelpCenterFrag":
                Locale locale = CoreModule.b.getResources().getConfiguration().locale;
                return ("zh".equalsIgnoreCase(locale.getLanguage()) && "CN".equalsIgnoreCase(locale.getCountry())) ? HelpCenterFrag.class : NewHelpCenterFrag.class;
            case "ProfileListFrag":
            case "ProfileFrag":
                return upa.M3() ? ProfileListFragExpandedImpl.class : ProfileListFrag.class;
            case "SettingsFragOld":
                return SettingsFragOld.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: b2 */
    public final void m89b2() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.za40
            public final void call(Object obj) {
                this.f23534a.m90c2((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m90c2(c cVar) {
        if (cVar == c.i && Act.isFromBackground) {
            mx0.o().K(act());
        }
    }

    /* JADX INFO: renamed from: d2 */
    public final void m91d2(PutongFrag putongFrag, String str) {
        k kVarM = getSupportFragmentManager().m();
        kVarM.c(u4c0.Lb, putongFrag, str);
        kVarM.j();
    }

    public boolean disableAutoPV() {
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return m86Z1(motionEvent, false) || super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e2 */
    public final void m92e2(Bundle bundle) {
        if (NullChecker.a(fragmentManager().h0(u4c0.Lb))) {
            return;
        }
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("fragmentName");
        PutongFrag putongFragM87Y1 = m87Y1(stringExtra, intent.getBooleanExtra("setting_scroll_to_bottom", false), intent.getBooleanExtra("can_show_follow_button", false), intent.getIntExtra("searchRadius", 0), intent.getBooleanExtra("autoSearch", false), intent.getStringExtra("gender"), intent.getIntExtra("minAge", 0), intent.getIntExtra("maxAge", 0));
        this.f70c = putongFragM87Y1;
        if (putongFragM87Y1 == null) {
            finish();
        } else {
            m91d2(putongFragM87Y1, stringExtra);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(f6c0.me, (ViewGroup) null);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.ya40
            public final void call(Object obj) {
                this.f22948a.m92e2((Bundle) obj);
            }
        });
    }

    public void initSubscription() {
        super.initSubscription();
        m89b2();
    }

    public boolean needBindBillingService() {
        return true;
    }

    public void onBackPressed() {
        SettingsFragOld settingsFragOld = this.f70c;
        if ((settingsFragOld instanceof SettingsFragOld) && settingsFragOld.o()) {
            return;
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }
}
