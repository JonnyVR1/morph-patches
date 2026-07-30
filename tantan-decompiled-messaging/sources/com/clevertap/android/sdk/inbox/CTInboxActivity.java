package com.clevertap.android.sdk.inbox;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.C1198i;
import com.clevertap.android.sdk.CTInboxStyleConfig;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.R$string;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import p149l.a7c0;
import p149l.c4c0;
import p149l.lv3;
import p149l.q3c0;
import p149l.ywc0;
import p149l.z0e;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class CTInboxActivity extends FragmentActivity implements CTInboxListViewFragment.InterfaceC1279b, z0e {

    /* JADX INFO: renamed from: k */
    public static int f5256k;

    /* JADX INFO: renamed from: c */
    lv3 f5257c;

    /* JADX INFO: renamed from: d */
    CTInboxStyleConfig f5258d;

    /* JADX INFO: renamed from: e */
    TabLayout f5259e;

    /* JADX INFO: renamed from: f */
    ViewPager f5260f;

    /* JADX INFO: renamed from: g */
    private CleverTapInstanceConfig f5261g;

    /* JADX INFO: renamed from: h */
    private WeakReference<InterfaceC1277b> f5262h;

    /* JADX INFO: renamed from: i */
    private CleverTapAPI f5263i;

    /* JADX INFO: renamed from: j */
    private C1198i f5264j;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.CTInboxActivity$a */
    public class ViewOnClickListenerC1276a implements View.OnClickListener {
        public ViewOnClickListenerC1276a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CTInboxActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.CTInboxActivity$b */
    public interface InterfaceC1277b {
        /* JADX INFO: renamed from: a */
        void mo5799a(CTInboxActivity cTInboxActivity, int i, CTInboxMessage cTInboxMessage, Bundle bundle, HashMap<String, String> map, int i2);

        /* JADX INFO: renamed from: b */
        void mo5800b(CTInboxActivity cTInboxActivity, CTInboxMessage cTInboxMessage, Bundle bundle);
    }

    /* JADX INFO: renamed from: I0 */
    private String m6657I0() {
        return this.f5261g.getAccountId() + ":CT_INBOX_LIST_VIEW_FRAGMENT";
    }

    @Override // com.clevertap.android.sdk.inbox.CTInboxListViewFragment.InterfaceC1279b
    /* JADX INFO: renamed from: A */
    public void mo6658A(Context context, int i, CTInboxMessage cTInboxMessage, Bundle bundle, HashMap<String, String> map, int i2) {
        m6659G0(bundle, i, cTInboxMessage, map, i2);
    }

    /* JADX INFO: renamed from: G0 */
    public void m6659G0(Bundle bundle, int i, CTInboxMessage cTInboxMessage, HashMap<String, String> map, int i2) {
        InterfaceC1277b interfaceC1277bM6661J0 = m6661J0();
        if (interfaceC1277bM6661J0 != null) {
            interfaceC1277bM6661J0.mo5799a(this, i, cTInboxMessage, bundle, map, i2);
        }
    }

    @Override // p149l.z0e
    /* JADX INFO: renamed from: H */
    public void mo5853H() {
        C1198i c1198i = this.f5264j;
        if (c1198i != null) {
            c1198i.m6105e(this);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m6660H0(Bundle bundle, CTInboxMessage cTInboxMessage) {
        Logger.m5873v("CTInboxActivity:didShow() called with: data = [" + bundle + "], inboxMessage = [" + cTInboxMessage.m6683e() + Constants.AES_SUFFIX);
        InterfaceC1277b interfaceC1277bM6661J0 = m6661J0();
        if (interfaceC1277bM6661J0 != null) {
            interfaceC1277bM6661J0.mo5800b(this, cTInboxMessage, bundle);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public InterfaceC1277b m6661J0() {
        InterfaceC1277b interfaceC1277b;
        try {
            interfaceC1277b = this.f5262h.get();
        } catch (Throwable unused) {
            interfaceC1277b = null;
        }
        if (interfaceC1277b == null) {
            this.f5261g.getLogger().verbose(this.f5261g.getAccountId(), "InboxActivityListener is null for notification inbox ");
        }
        return interfaceC1277b;
    }

    /* JADX INFO: renamed from: K0 */
    public void m6662K0(InterfaceC1277b interfaceC1277b) {
        this.f5262h = new WeakReference<>(interfaceC1277b);
    }

    @Override // p149l.z0e
    /* JADX INFO: renamed from: P */
    public void mo5858P(boolean z) {
        C1198i c1198i = this.f5264j;
        if (c1198i != null) {
            c1198i.m6109i(this, z);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                throw new IllegalArgumentException();
            }
            this.f5258d = (CTInboxStyleConfig) extras.getParcelable("styleConfig");
            Bundle bundle2 = extras.getBundle("configBundle");
            if (bundle2 != null) {
                this.f5261g = (CleverTapInstanceConfig) bundle2.getParcelable(Constants.KEY_CONFIG);
            }
            CleverTapAPI cleverTapAPIM5760U = CleverTapAPI.m5760U(getApplicationContext(), this.f5261g);
            this.f5263i = cleverTapAPIM5760U;
            if (cleverTapAPIM5760U != null) {
                m6662K0(cleverTapAPIM5760U);
                this.f5264j = new C1198i(this.f5261g, this.f5263i.m5793H().getCallbackManager().mo100743q());
            }
            f5256k = getResources().getConfiguration().orientation;
            setContentView(a7c0.f67905n);
            this.f5263i.m5793H().getCoreMetaData().m176184M(this);
            Toolbar toolbar = (Toolbar) findViewById(c4c0.f79199Q0);
            toolbar.setTitle(this.f5258d.m5734e());
            toolbar.setTitleTextColor(Color.parseColor(this.f5258d.m5735f()));
            toolbar.setBackgroundColor(Color.parseColor(this.f5258d.m5733d()));
            Drawable drawableM216334e = ywc0.m216334e(getResources(), q3c0.f152401b, null);
            if (drawableM216334e != null) {
                drawableM216334e.setColorFilter(Color.parseColor(this.f5258d.m5730a()), PorterDuff.Mode.SRC_IN);
            }
            toolbar.setNavigationIcon(drawableM216334e);
            toolbar.setNavigationContentDescription(getString(R$string.f4826d));
            toolbar.setNavigationOnClickListener(new ViewOnClickListenerC1276a());
            LinearLayout linearLayout = (LinearLayout) findViewById(c4c0.f79242p0);
            linearLayout.setBackgroundColor(Color.parseColor(this.f5258d.m5732c()));
            this.f5259e = (TabLayout) linearLayout.findViewById(c4c0.f79195O0);
            this.f5260f = (ViewPager) linearLayout.findViewById(c4c0.f79203S0);
            TextView textView = (TextView) findViewById(c4c0.f79179G0);
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable(Constants.KEY_CONFIG, this.f5261g);
            bundle3.putParcelable("styleConfig", this.f5258d);
            boolean zM5743o = this.f5258d.m5743o();
            ViewPager viewPager = this.f5260f;
            int i = 0;
            if (!zM5743o) {
                viewPager.setVisibility(8);
                this.f5259e.setVisibility(8);
                CleverTapAPI cleverTapAPI = this.f5263i;
                if (cleverTapAPI != null && cleverTapAPI.m5794N() == 0) {
                    textView.setBackgroundColor(Color.parseColor(this.f5258d.m5732c()));
                    textView.setVisibility(0);
                    textView.setText(this.f5258d.m5736g());
                    textView.setTextColor(Color.parseColor(this.f5258d.m5737h()));
                    return;
                }
                ((FrameLayout) findViewById(c4c0.f79260y0)).setVisibility(0);
                textView.setVisibility(8);
                for (Fragment fragment : getSupportFragmentManager().m2589t0()) {
                    if (fragment.getTag() != null && !fragment.getTag().equalsIgnoreCase(m6657I0())) {
                        i = 1;
                    }
                }
                if (i == 0) {
                    Fragment cTInboxListViewFragment = new CTInboxListViewFragment();
                    cTInboxListViewFragment.setArguments(bundle3);
                    getSupportFragmentManager().m2567m().m2804c(c4c0.f79260y0, cTInboxListViewFragment, m6657I0()).mo2707i();
                    return;
                }
                return;
            }
            viewPager.setVisibility(0);
            ArrayList<String> arrayListM5741m = this.f5258d.m5741m();
            this.f5257c = new lv3(getSupportFragmentManager(), arrayListM5741m.size() + 1);
            this.f5259e.setVisibility(0);
            this.f5259e.setTabGravity(0);
            this.f5259e.setTabMode(1);
            this.f5259e.setSelectedTabIndicatorColor(Color.parseColor(this.f5258d.m5739k()));
            this.f5259e.setTabTextColors(Color.parseColor(this.f5258d.m5742n()), Color.parseColor(this.f5258d.m5738i()));
            this.f5259e.setBackgroundColor(Color.parseColor(this.f5258d.m5740l()));
            Bundle bundle4 = (Bundle) bundle3.clone();
            bundle4.putInt("position", 0);
            CTInboxListViewFragment cTInboxListViewFragment2 = new CTInboxListViewFragment();
            cTInboxListViewFragment2.setArguments(bundle4);
            this.f5257c.m151834j(cTInboxListViewFragment2, this.f5258d.m5731b(), 0);
            while (i < arrayListM5741m.size()) {
                String str = arrayListM5741m.get(i);
                i++;
                Bundle bundle5 = (Bundle) bundle3.clone();
                bundle5.putInt("position", i);
                bundle5.putString("filter", str);
                CTInboxListViewFragment cTInboxListViewFragment3 = new CTInboxListViewFragment();
                cTInboxListViewFragment3.setArguments(bundle5);
                this.f5257c.m151834j(cTInboxListViewFragment3, str, i);
                this.f5260f.setOffscreenPageLimit(i);
            }
            this.f5260f.setAdapter(this.f5257c);
            this.f5257c.notifyDataSetChanged();
            this.f5260f.m4185d(new TabLayout.TabLayoutOnPageChangeListener(this.f5259e));
            this.f5259e.setupWithViewPager(this.f5260f);
        } catch (Throwable th) {
            Logger.m5876v("Cannot find a valid notification inbox bundle to show!", th);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.f5263i.m5793H().getCoreMetaData().m176184M(null);
        if (this.f5258d.m5743o()) {
            for (Fragment fragment : getSupportFragmentManager().m2589t0()) {
                if (fragment instanceof CTInboxListViewFragment) {
                    Logger.m5873v("Removing fragment - " + fragment.toString());
                    getSupportFragmentManager().m2589t0().remove(fragment);
                }
            }
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C1198i c1198i = this.f5264j;
        if (c1198i != null) {
            c1198i.m6108h(this, i, iArr);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C1198i c1198i = this.f5264j;
        if (c1198i != null) {
            c1198i.m6107g(this);
        }
    }

    @Override // com.clevertap.android.sdk.inbox.CTInboxListViewFragment.InterfaceC1279b
    /* JADX INFO: renamed from: q */
    public void mo6663q(Context context, CTInboxMessage cTInboxMessage, Bundle bundle) {
        Logger.m5873v("CTInboxActivity:messageDidShow() called with: data = [" + bundle + "], inboxMessage = [" + cTInboxMessage.m6683e() + Constants.AES_SUFFIX);
        m6660H0(bundle, cTInboxMessage);
    }
}
