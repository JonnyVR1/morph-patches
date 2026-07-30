package com.p051p1.mobile.putong.core.p058ui.main;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.R$string;
import com.tantanapp.common.utils.CrashHelper;
import p151v.VButton_FakeShadow;
import p151v.VText;
import p153l.bnl0;
import p153l.byv;
import p153l.fph0;
import p153l.hve0;
import p153l.o1j0;
import p153l.xxv;

/* JADX INFO: loaded from: classes3.dex */
public class LocationPermissionView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f31204a;

    /* JADX INFO: renamed from: b */
    public VText f31205b;

    /* JADX INFO: renamed from: c */
    public VButton_FakeShadow f31206c;

    /* JADX INFO: renamed from: d */
    public LocationPermissionState f31207d;

    public enum LocationPermissionState {
        none,
        requesting,
        requested
    }

    public LocationPermissionView(Context context) {
        super(context);
        this.f31207d = LocationPermissionState.none;
    }

    /* JADX INFO: renamed from: b */
    public final void m48541b(View view) {
        byv.m107089a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m48542c(Frag frag, int i, View view) {
        fph0.m126665e0();
        if (xxv.m213587n((Act) getContext())) {
            fph0.m126683n0(fph0.f100175h);
            frag.requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, i);
            return;
        }
        try {
            hve0.m137322x((Activity) getContext());
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("LocationAccessAct setLocation " + e.getMessage(), e));
            o1j0.m165649w(R$string.f18460Fj);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m48543d(final Frag frag, final int i) {
        this.f31206c.setOnClickListener(new View.OnClickListener() { // from class: l.ayv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74015a.m48542c(frag, i, view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m48544e(LocationPermissionState locationPermissionState) {
        this.f31207d = locationPermissionState;
        VText vText = this.f31204a;
        LocationPermissionState locationPermissionState2 = LocationPermissionState.requested;
        bnl0.m105524M(vText, locationPermissionState == locationPermissionState2);
        bnl0.m105524M(this.f31205b, locationPermissionState == locationPermissionState2);
        bnl0.m105524M(this.f31206c, locationPermissionState == locationPermissionState2);
        invalidate();
    }

    public LocationPermissionState getState() {
        return this.f31207d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48541b(this);
    }

    public LocationPermissionView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31207d = LocationPermissionState.none;
    }

    public LocationPermissionView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31207d = LocationPermissionState.none;
    }
}
