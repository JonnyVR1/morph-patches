package com.p000p1.mobile.putong.core.p004ui.visitor;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.visitor.visitorsme.VisitorsMeFrag;
import com.p1.mobile.android.app.Act;
import l.x4c0;
import p006l.gr9;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class MomentVisitorsAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public MomentVisitorsFrag f7848c;

    /* JADX INFO: renamed from: d */
    public VisitorsMeFrag f7849d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m11283V1(Context context, boolean z) {
        return m11285Y1(context, z, "", false);
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m11284X1(Context context, boolean z, String str) {
        return m11285Y1(context, z, str, false);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m11285Y1(Context context, boolean z, String str, boolean z2) {
        Intent intent;
        boolean z3;
        if (CoreModule.m1854P().m11711g().m6989d4()) {
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
    public static Intent m11286Z1(Context context, boolean z, boolean z2) {
        return m11285Y1(context, z, "", z2);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean disableAutoPV() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(x4c0.V);
        FragmentManager supportFragmentManager = ((Act) this).act.getSupportFragmentManager();
        Fragment fragmentI0 = supportFragmentManager.i0("visitor_frag");
        if (gr9.m15940i()) {
            if (fragmentI0 instanceof VisitorsMeFrag) {
                this.f7849d = (VisitorsMeFrag) fragmentI0;
                return frameLayout;
            }
            this.f7849d = new VisitorsMeFrag();
            Bundle bundle = new Bundle();
            String stringExtra = getIntent().getStringExtra("from");
            boolean booleanExtra = getIntent().getBooleanExtra("fromDeeplink", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("hasPermission", true);
            if (!TextUtils.isEmpty(stringExtra)) {
                bundle.putString("from", stringExtra);
            }
            bundle.putBoolean("fromDeeplink", booleanExtra);
            bundle.putBoolean("hasPermission", booleanExtra2);
            this.f7849d.setArguments(bundle);
            k kVarM = supportFragmentManager.m();
            kVarM.t(x4c0.V, this.f7849d, "visitor_frag");
            kVarM.j();
            return frameLayout;
        }
        if (fragmentI0 instanceof MomentVisitorsFrag) {
            this.f7848c = (MomentVisitorsFrag) fragmentI0;
            return frameLayout;
        }
        this.f7848c = new MomentVisitorsFrag();
        Bundle bundle2 = new Bundle();
        String stringExtra2 = getIntent().getStringExtra("from");
        boolean booleanExtra3 = getIntent().getBooleanExtra("fromDeeplink", false);
        boolean booleanExtra4 = getIntent().getBooleanExtra("hasPermission", true);
        if (!TextUtils.isEmpty(stringExtra2)) {
            bundle2.putString("from", stringExtra2);
        }
        bundle2.putBoolean("fromDeeplink", booleanExtra3);
        bundle2.putBoolean("hasPermission", booleanExtra4);
        this.f7848c.setArguments(bundle2);
        k kVarM2 = supportFragmentManager.m();
        kVarM2.c(x4c0.V, this.f7848c, "visitor_frag");
        kVarM2.j();
        return frameLayout;
    }
}
