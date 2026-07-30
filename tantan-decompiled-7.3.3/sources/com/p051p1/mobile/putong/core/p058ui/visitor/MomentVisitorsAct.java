package com.p051p1.mobile.putong.core.p058ui.visitor;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.visitor.visitorsme.VisitorsMeFrag;
import p153l.ddc0;
import p153l.rs9;

/* JADX INFO: loaded from: classes12.dex */
public class MomentVisitorsAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public MomentVisitorsFrag f38915c;

    /* JADX INFO: renamed from: d */
    public VisitorsMeFrag f38916d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m58966X1(Context context, boolean z) {
        return m58968Z1(context, z, "", false);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m58967Y1(Context context, boolean z, String str) {
        return m58968Z1(context, z, str, false);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m58968Z1(Context context, boolean z, String str, boolean z2) {
        Intent intent;
        boolean z3;
        if (CoreModule.m30933P().m143410g().mo36055d4()) {
            intent = new Intent(context, (Class<?>) VisitorsAct.class);
            z3 = true;
        } else {
            intent = new Intent(context, (Class<?>) MomentVisitorsAct.class);
            z3 = false;
        }
        intent.putExtra("hasPermission", z);
        intent.putExtra("fromDeeplink", z2);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("from", str);
        }
        intent.putExtra("hideNavigation", z3);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m58969a2(Context context, boolean z, boolean z2) {
        return m58968Z1(context, z, "", z2);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(ddc0.f87892V);
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        Fragment fragmentM2558i0 = supportFragmentManager.m2558i0("visitor_frag");
        if (rs9.m182940i()) {
            if (fragmentM2558i0 instanceof VisitorsMeFrag) {
                this.f38916d = (VisitorsMeFrag) fragmentM2558i0;
                return frameLayout;
            }
            this.f38916d = new VisitorsMeFrag();
            Bundle bundle = new Bundle();
            String stringExtra = getIntent().getStringExtra("from");
            boolean booleanExtra = getIntent().getBooleanExtra("fromDeeplink", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("hasPermission", true);
            if (!TextUtils.isEmpty(stringExtra)) {
                bundle.putString("from", stringExtra);
            }
            bundle.putBoolean("fromDeeplink", booleanExtra);
            bundle.putBoolean("hasPermission", booleanExtra2);
            this.f38916d.setArguments(bundle);
            AbstractC0428k abstractC0428kM2568m = supportFragmentManager.m2568m();
            abstractC0428kM2568m.m2813t(ddc0.f87892V, this.f38916d, "visitor_frag");
            abstractC0428kM2568m.mo2709j();
            return frameLayout;
        }
        if (fragmentM2558i0 instanceof MomentVisitorsFrag) {
            this.f38915c = (MomentVisitorsFrag) fragmentM2558i0;
            return frameLayout;
        }
        this.f38915c = new MomentVisitorsFrag();
        Bundle bundle2 = new Bundle();
        String stringExtra2 = getIntent().getStringExtra("from");
        boolean booleanExtra3 = getIntent().getBooleanExtra("fromDeeplink", false);
        boolean booleanExtra4 = getIntent().getBooleanExtra("hasPermission", true);
        if (!TextUtils.isEmpty(stringExtra2)) {
            bundle2.putString("from", stringExtra2);
        }
        bundle2.putBoolean("fromDeeplink", booleanExtra3);
        bundle2.putBoolean("hasPermission", booleanExtra4);
        this.f38915c.setArguments(bundle2);
        AbstractC0428k abstractC0428kM2568m2 = supportFragmentManager.m2568m();
        abstractC0428kM2568m2.m2805c(ddc0.f87892V, this.f38915c, "visitor_frag");
        abstractC0428kM2568m2.mo2709j();
        return frameLayout;
    }
}
