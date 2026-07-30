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
import com.clevertap.android.sdk.C1221i;
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
import p153l.c5d0;
import p153l.efc0;
import p153l.icc0;
import p153l.kw3;
import p153l.n2e;
import p153l.wbc0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class CTInboxActivity extends FragmentActivity implements CTInboxListViewFragment.InterfaceC1302b, n2e {

    /* JADX INFO: renamed from: k */
    public static int f5293k;

    /* JADX INFO: renamed from: c */
    kw3 f5294c;

    /* JADX INFO: renamed from: d */
    CTInboxStyleConfig f5295d;

    /* JADX INFO: renamed from: e */
    TabLayout f5296e;

    /* JADX INFO: renamed from: f */
    ViewPager f5297f;

    /* JADX INFO: renamed from: g */
    private CleverTapInstanceConfig f5298g;

    /* JADX INFO: renamed from: h */
    private WeakReference<InterfaceC1300b> f5299h;

    /* JADX INFO: renamed from: i */
    private CleverTapAPI f5300i;

    /* JADX INFO: renamed from: j */
    private C1221i f5301j;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.CTInboxActivity$a */
    public class ViewOnClickListenerC1299a implements View.OnClickListener {
        public ViewOnClickListenerC1299a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CTInboxActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.CTInboxActivity$b */
    public interface InterfaceC1300b {
        /* JADX INFO: renamed from: a */
        void mo5853a(CTInboxActivity cTInboxActivity, int i, CTInboxMessage cTInboxMessage, Bundle bundle, HashMap<String, String> map, int i2);

        /* JADX INFO: renamed from: b */
        void mo5854b(CTInboxActivity cTInboxActivity, CTInboxMessage cTInboxMessage, Bundle bundle);
    }

    /* JADX INFO: renamed from: J0 */
    private String m6711J0() {
        return this.f5298g.getAccountId() + ":CT_INBOX_LIST_VIEW_FRAGMENT";
    }

    @Override // com.clevertap.android.sdk.inbox.CTInboxListViewFragment.InterfaceC1302b
    /* JADX INFO: renamed from: A */
    public void mo6712A(Context context, int i, CTInboxMessage cTInboxMessage, Bundle bundle, HashMap<String, String> map, int i2) {
        m6713H0(bundle, i, cTInboxMessage, map, i2);
    }

    /* JADX INFO: renamed from: H0 */
    public void m6713H0(Bundle bundle, int i, CTInboxMessage cTInboxMessage, HashMap<String, String> map, int i2) {
        InterfaceC1300b interfaceC1300bM6715K0 = m6715K0();
        if (interfaceC1300bM6715K0 != null) {
            interfaceC1300bM6715K0.mo5853a(this, i, cTInboxMessage, bundle, map, i2);
        }
    }

    @Override // p153l.n2e
    /* JADX INFO: renamed from: I */
    public void mo5908I() {
        C1221i c1221i = this.f5301j;
        if (c1221i != null) {
            c1221i.m6159e(this);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m6714I0(Bundle bundle, CTInboxMessage cTInboxMessage) {
        Logger.m5927v("CTInboxActivity:didShow() called with: data = [" + bundle + "], inboxMessage = [" + cTInboxMessage.m6737e() + Constants.AES_SUFFIX);
        InterfaceC1300b interfaceC1300bM6715K0 = m6715K0();
        if (interfaceC1300bM6715K0 != null) {
            interfaceC1300bM6715K0.mo5854b(this, cTInboxMessage, bundle);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public InterfaceC1300b m6715K0() {
        InterfaceC1300b interfaceC1300b;
        try {
            interfaceC1300b = this.f5299h.get();
        } catch (Throwable unused) {
            interfaceC1300b = null;
        }
        if (interfaceC1300b == null) {
            this.f5298g.getLogger().verbose(this.f5298g.getAccountId(), "InboxActivityListener is null for notification inbox ");
        }
        return interfaceC1300b;
    }

    /* JADX INFO: renamed from: L0 */
    public void m6716L0(InterfaceC1300b interfaceC1300b) {
        this.f5299h = new WeakReference<>(interfaceC1300b);
    }

    @Override // p153l.n2e
    /* JADX INFO: renamed from: Q */
    public void mo5913Q(boolean z) {
        C1221i c1221i = this.f5301j;
        if (c1221i != null) {
            c1221i.m6163i(this, z);
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
            this.f5295d = (CTInboxStyleConfig) extras.getParcelable("styleConfig");
            Bundle bundle2 = extras.getBundle("configBundle");
            if (bundle2 != null) {
                this.f5298g = (CleverTapInstanceConfig) bundle2.getParcelable(Constants.KEY_CONFIG);
            }
            CleverTapAPI cleverTapAPIM5814U = CleverTapAPI.m5814U(getApplicationContext(), this.f5298g);
            this.f5300i = cleverTapAPIM5814U;
            if (cleverTapAPIM5814U != null) {
                m6716L0(cleverTapAPIM5814U);
                this.f5301j = new C1221i(this.f5298g, this.f5300i.m5847H().getCallbackManager().mo96523q());
            }
            f5293k = getResources().getConfiguration().orientation;
            setContentView(efc0.f93757n);
            this.f5300i.m5847H().getCoreMetaData().m106451M(this);
            Toolbar toolbar = (Toolbar) findViewById(icc0.f114335Q0);
            toolbar.setTitle(this.f5295d.m5788e());
            toolbar.setTitleTextColor(Color.parseColor(this.f5295d.m5789f()));
            toolbar.setBackgroundColor(Color.parseColor(this.f5295d.m5787d()));
            Drawable drawableM108035e = c5d0.m108035e(getResources(), wbc0.f188229b, null);
            if (drawableM108035e != null) {
                drawableM108035e.setColorFilter(Color.parseColor(this.f5295d.m5784a()), PorterDuff.Mode.SRC_IN);
            }
            toolbar.setNavigationIcon(drawableM108035e);
            toolbar.setNavigationContentDescription(getString(R$string.f4863d));
            toolbar.setNavigationOnClickListener(new ViewOnClickListenerC1299a());
            LinearLayout linearLayout = (LinearLayout) findViewById(icc0.f114378p0);
            linearLayout.setBackgroundColor(Color.parseColor(this.f5295d.m5786c()));
            this.f5296e = (TabLayout) linearLayout.findViewById(icc0.f114331O0);
            this.f5297f = (ViewPager) linearLayout.findViewById(icc0.f114339S0);
            TextView textView = (TextView) findViewById(icc0.f114315G0);
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable(Constants.KEY_CONFIG, this.f5298g);
            bundle3.putParcelable("styleConfig", this.f5295d);
            boolean zM5797o = this.f5295d.m5797o();
            ViewPager viewPager = this.f5297f;
            int i = 0;
            if (!zM5797o) {
                viewPager.setVisibility(8);
                this.f5296e.setVisibility(8);
                CleverTapAPI cleverTapAPI = this.f5300i;
                if (cleverTapAPI != null && cleverTapAPI.m5848N() == 0) {
                    textView.setBackgroundColor(Color.parseColor(this.f5295d.m5786c()));
                    textView.setVisibility(0);
                    textView.setText(this.f5295d.m5790g());
                    textView.setTextColor(Color.parseColor(this.f5295d.m5791h()));
                    return;
                }
                ((FrameLayout) findViewById(icc0.f114396y0)).setVisibility(0);
                textView.setVisibility(8);
                for (Fragment fragment : getSupportFragmentManager().m2590t0()) {
                    if (fragment.getTag() != null && !fragment.getTag().equalsIgnoreCase(m6711J0())) {
                        i = 1;
                    }
                }
                if (i == 0) {
                    Fragment cTInboxListViewFragment = new CTInboxListViewFragment();
                    cTInboxListViewFragment.setArguments(bundle3);
                    getSupportFragmentManager().m2568m().m2805c(icc0.f114396y0, cTInboxListViewFragment, m6711J0()).mo2708i();
                    return;
                }
                return;
            }
            viewPager.setVisibility(0);
            ArrayList<String> arrayListM5795m = this.f5295d.m5795m();
            this.f5294c = new kw3(getSupportFragmentManager(), arrayListM5795m.size() + 1);
            this.f5296e.setVisibility(0);
            this.f5296e.setTabGravity(0);
            this.f5296e.setTabMode(1);
            this.f5296e.setSelectedTabIndicatorColor(Color.parseColor(this.f5295d.m5793k()));
            this.f5296e.setTabTextColors(Color.parseColor(this.f5295d.m5796n()), Color.parseColor(this.f5295d.m5792i()));
            this.f5296e.setBackgroundColor(Color.parseColor(this.f5295d.m5794l()));
            Bundle bundle4 = (Bundle) bundle3.clone();
            bundle4.putInt("position", 0);
            CTInboxListViewFragment cTInboxListViewFragment2 = new CTInboxListViewFragment();
            cTInboxListViewFragment2.setArguments(bundle4);
            this.f5294c.m151679j(cTInboxListViewFragment2, this.f5295d.m5785b(), 0);
            while (i < arrayListM5795m.size()) {
                String str = arrayListM5795m.get(i);
                i++;
                Bundle bundle5 = (Bundle) bundle3.clone();
                bundle5.putInt("position", i);
                bundle5.putString("filter", str);
                CTInboxListViewFragment cTInboxListViewFragment3 = new CTInboxListViewFragment();
                cTInboxListViewFragment3.setArguments(bundle5);
                this.f5294c.m151679j(cTInboxListViewFragment3, str, i);
                this.f5297f.setOffscreenPageLimit(i);
            }
            this.f5297f.setAdapter(this.f5294c);
            this.f5294c.notifyDataSetChanged();
            this.f5297f.m4187d(new TabLayout.TabLayoutOnPageChangeListener(this.f5296e));
            this.f5296e.setupWithViewPager(this.f5297f);
        } catch (Throwable th) {
            Logger.m5930v("Cannot find a valid notification inbox bundle to show!", th);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.f5300i.m5847H().getCoreMetaData().m106451M(null);
        if (this.f5295d.m5797o()) {
            for (Fragment fragment : getSupportFragmentManager().m2590t0()) {
                if (fragment instanceof CTInboxListViewFragment) {
                    Logger.m5927v("Removing fragment - " + fragment.toString());
                    getSupportFragmentManager().m2590t0().remove(fragment);
                }
            }
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C1221i c1221i = this.f5301j;
        if (c1221i != null) {
            c1221i.m6162h(this, i, iArr);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C1221i c1221i = this.f5301j;
        if (c1221i != null) {
            c1221i.m6161g(this);
        }
    }

    @Override // com.clevertap.android.sdk.inbox.CTInboxListViewFragment.InterfaceC1302b
    /* JADX INFO: renamed from: p */
    public void mo6717p(Context context, CTInboxMessage cTInboxMessage, Bundle bundle) {
        Logger.m5927v("CTInboxActivity:messageDidShow() called with: data = [" + bundle + "], inboxMessage = [" + cTInboxMessage.m6737e() + Constants.AES_SUFFIX);
        m6714I0(bundle, cTInboxMessage);
    }
}
