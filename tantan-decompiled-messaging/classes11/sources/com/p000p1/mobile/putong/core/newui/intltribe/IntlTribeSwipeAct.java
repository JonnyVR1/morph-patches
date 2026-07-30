package com.p000p1.mobile.putong.core.newui.intltribe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.ui.AutoReleaseVideoAct;
import com.tantanapp.common.utils.NullChecker;
import l.f6c0;
import l.j760;
import l.u4c0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlTribeSwipeAct extends AutoReleaseVideoAct {

    /* JADX INFO: renamed from: c */
    public View f3117c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f3118d;

    /* JADX INFO: renamed from: e */
    public String f3119e = "IntlTribeSwipeAct";

    /* JADX INFO: renamed from: f */
    public IntlTribeSlideFrag f3120f;

    /* JADX INFO: renamed from: g */
    public String f3121g;

    /* JADX INFO: renamed from: h */
    public String f3122h;

    /* JADX INFO: renamed from: i */
    public String f3123i;

    /* JADX INFO: renamed from: j */
    public String f3124j;

    /* JADX INFO: renamed from: k */
    public String f3125k;

    /* JADX INFO: renamed from: X1 */
    public static Intent m3594X1(Context context, String str, String str2, String str3, String str4, String str5) {
        Intent intent = new Intent(context, (Class<?>) IntlTribeSwipeAct.class);
        intent.putExtra("groupCategory", str);
        intent.putExtra("subType", str2);
        intent.putExtra("title", str3);
        intent.putExtra("icon", str4);
        intent.putExtra("bigCoverUrl", str5);
        intent.setFlags(67108864);
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y1 */
    private void m3595Y1() {
        if (NullChecker.a(getIntent())) {
            this.f3121g = getIntent().getStringExtra("groupCategory");
            this.f3122h = getIntent().getStringExtra("subType");
            this.f3123i = getIntent().getStringExtra("title");
            this.f3124j = getIntent().getStringExtra("icon");
            this.f3125k = getIntent().getStringExtra("bigCoverUrl");
        }
    }

    /* JADX INFO: renamed from: Z1 */
    private void m3596Z1() {
        FragmentManager supportFragmentManager = ((Act) this).act.getSupportFragmentManager();
        IntlTribeSlideFrag intlTribeSlideFragI0 = supportFragmentManager.i0(this.f3119e);
        this.f3120f = intlTribeSlideFragI0;
        if (intlTribeSlideFragI0 == null) {
            this.f3120f = new IntlTribeSlideFrag();
            Bundle bundle = new Bundle();
            bundle.putString("groupCategory", this.f3121g);
            bundle.putString("subType", this.f3122h);
            bundle.putString("title", this.f3123i);
            bundle.putString("icon", this.f3124j);
            bundle.putString("bigCoverUrl", this.f3125k);
            this.f3120f.setArguments(bundle);
        }
        k kVarM = supportFragmentManager.m();
        kVarM.t(u4c0.y4, this.f3120f, this.f3119e);
        kVarM.j();
        supportFragmentManager.e0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.V5, viewGroup, false);
        this.f3117c = viewInflate;
        this.f3118d = (FrameLayout) viewInflate.findViewById(u4c0.y4);
        m3596Z1();
        return this.f3117c;
    }

    public void initDataOnCreate() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initDataOnCreate();
        m3595Y1();
        ((PutongAct) this).pageHelper.p(new j760[]{vwb.Y("intl_tribe_source_name", this.f3122h)});
    }

    public void initSubscription() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initSubscription();
    }

    public boolean needBindBillingService() {
        return true;
    }

    public String pageId() {
        return "p_intl_tribe_swipe_view";
    }

    public void preCreateView(Bundle bundle) {
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
        setTransparentStatusBar();
    }

    public void setTransparentStatusBar() {
        super/*com.p1.mobile.putong.app.PutongAct*/.setTransparentStatusBar();
        setLightStatusBar(1024);
    }
}
