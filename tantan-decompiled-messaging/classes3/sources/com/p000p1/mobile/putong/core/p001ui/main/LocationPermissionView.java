package com.p000p1.mobile.putong.core.p001ui.main;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.R;
import com.tantanapp.common.utils.CrashHelper;
import l.ane0;
import l.awv;
import l.lsi0;
import l.wvv;
import l.xdl0;
import l.ygh0;
import p028v.VButton_FakeShadow;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class LocationPermissionView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f247a;

    /* JADX INFO: renamed from: b */
    public VText f248b;

    /* JADX INFO: renamed from: c */
    public VButton_FakeShadow f249c;

    /* JADX INFO: renamed from: d */
    public LocationPermissionState f250d;

    public enum LocationPermissionState {
        none,
        requesting,
        requested
    }

    public LocationPermissionView(Context context) {
        super(context);
        this.f250d = LocationPermissionState.none;
    }

    /* JADX INFO: renamed from: b */
    public final void m391b(View view) {
        awv.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m392c(Frag frag, int i, View view) {
        ygh0.e0();
        if (wvv.n(getContext())) {
            ygh0.n0(ygh0.h);
            frag.requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, i);
            return;
        }
        try {
            ane0.x((Activity) getContext());
        } catch (Exception e) {
            CrashHelper.c(new Exception("LocationAccessAct setLocation " + e.getMessage(), e));
            lsi0.w(R.string.jj);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m393d(final Frag frag, final int i) {
        this.f249c.setOnClickListener(new View.OnClickListener() { // from class: l.zvv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9453a.m392c(frag, i, view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m394e(LocationPermissionState locationPermissionState) {
        this.f250d = locationPermissionState;
        AppCompatTextView appCompatTextView = this.f247a;
        LocationPermissionState locationPermissionState2 = LocationPermissionState.requested;
        xdl0.M(appCompatTextView, locationPermissionState == locationPermissionState2);
        xdl0.M(this.f248b, locationPermissionState == locationPermissionState2);
        xdl0.M(this.f249c, locationPermissionState == locationPermissionState2);
        invalidate();
    }

    public LocationPermissionState getState() {
        return this.f250d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m391b(this);
    }

    public LocationPermissionView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f250d = LocationPermissionState.none;
    }

    public LocationPermissionView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f250d = LocationPermissionState.none;
    }
}
