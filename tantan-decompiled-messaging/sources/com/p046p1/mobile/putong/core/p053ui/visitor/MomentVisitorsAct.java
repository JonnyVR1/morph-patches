package com.p046p1.mobile.putong.core.p053ui.visitor;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.visitor.visitorsme.VisitorsMeFrag;
import p149l.gr9;
import p149l.x4c0;

/* JADX INFO: loaded from: classes9.dex */
public class MomentVisitorsAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public MomentVisitorsFrag f38067c;

    /* JADX INFO: renamed from: d */
    public VisitorsMeFrag f38068d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m57783V1(Context context, boolean z) {
        return m57785Y1(context, z, "", false);
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m57784X1(Context context, boolean z, String str) {
        return m57785Y1(context, z, str, false);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m57785Y1(Context context, boolean z, String str, boolean z2) {
        Intent intent;
        boolean z3;
        if (CoreModule.m29935P().m94656g().mo35052d4()) {
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

    /* JADX INFO: renamed from: Z1 */
    public static Intent m57786Z1(Context context, boolean z, boolean z2) {
        return m57785Y1(context, z, "", z2);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(x4c0.f190987V);
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        Fragment fragmentM2557i0 = supportFragmentManager.m2557i0("visitor_frag");
        if (gr9.m127684i()) {
            if (fragmentM2557i0 instanceof VisitorsMeFrag) {
                this.f38068d = (VisitorsMeFrag) fragmentM2557i0;
                return frameLayout;
            }
            this.f38068d = new VisitorsMeFrag();
            Bundle bundle = new Bundle();
            String stringExtra = getIntent().getStringExtra("from");
            boolean booleanExtra = getIntent().getBooleanExtra("fromDeeplink", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("hasPermission", true);
            if (!TextUtils.isEmpty(stringExtra)) {
                bundle.putString("from", stringExtra);
            }
            bundle.putBoolean("fromDeeplink", booleanExtra);
            bundle.putBoolean("hasPermission", booleanExtra2);
            this.f38068d.setArguments(bundle);
            AbstractC0427k abstractC0427kM2567m = supportFragmentManager.m2567m();
            abstractC0427kM2567m.m2812t(x4c0.f190987V, this.f38068d, "visitor_frag");
            abstractC0427kM2567m.mo2708j();
            return frameLayout;
        }
        if (fragmentM2557i0 instanceof MomentVisitorsFrag) {
            this.f38067c = (MomentVisitorsFrag) fragmentM2557i0;
            return frameLayout;
        }
        this.f38067c = new MomentVisitorsFrag();
        Bundle bundle2 = new Bundle();
        String stringExtra2 = getIntent().getStringExtra("from");
        boolean booleanExtra3 = getIntent().getBooleanExtra("fromDeeplink", false);
        boolean booleanExtra4 = getIntent().getBooleanExtra("hasPermission", true);
        if (!TextUtils.isEmpty(stringExtra2)) {
            bundle2.putString("from", stringExtra2);
        }
        bundle2.putBoolean("fromDeeplink", booleanExtra3);
        bundle2.putBoolean("hasPermission", booleanExtra4);
        this.f38067c.setArguments(bundle2);
        AbstractC0427k abstractC0427kM2567m2 = supportFragmentManager.m2567m();
        abstractC0427kM2567m2.m2804c(x4c0.f190987V, this.f38067c, "visitor_frag");
        abstractC0427kM2567m2.mo2708j();
        return frameLayout;
    }
}
