package com.p046p1.mobile.putong.core.p053ui.main;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.R$string;
import com.tantanapp.common.utils.CrashHelper;
import p147v.VButton_FakeShadow;
import p147v.VText;
import p149l.ane0;
import p149l.awv;
import p149l.lsi0;
import p149l.wvv;
import p149l.xdl0;
import p149l.ygh0;

/* JADX INFO: loaded from: classes3.dex */
public class LocationPermissionView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f30356a;

    /* JADX INFO: renamed from: b */
    public VText f30357b;

    /* JADX INFO: renamed from: c */
    public VButton_FakeShadow f30358c;

    /* JADX INFO: renamed from: d */
    public LocationPermissionState f30359d;

    public enum LocationPermissionState {
        none,
        requesting,
        requested
    }

    public LocationPermissionView(Context context) {
        super(context);
        this.f30359d = LocationPermissionState.none;
    }

    /* JADX INFO: renamed from: b */
    public final void m47358b(View view) {
        awv.m99328a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m47359c(Frag frag, int i, View view) {
        ygh0.m214677e0();
        if (wvv.m205774n((Act) getContext())) {
            ygh0.m214695n0(ygh0.f198173h);
            frag.requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, i);
            return;
        }
        try {
            ane0.m97752x((Activity) getContext());
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("LocationAccessAct setLocation " + e.getMessage(), e));
            lsi0.m151593w(R$string.f18642jj);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m47360d(final Frag frag, final int i) {
        this.f30358c.setOnClickListener(new View.OnClickListener() { // from class: l.zvv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205066a.m47359c(frag, i, view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m47361e(LocationPermissionState locationPermissionState) {
        this.f30359d = locationPermissionState;
        VText vText = this.f30356a;
        LocationPermissionState locationPermissionState2 = LocationPermissionState.requested;
        xdl0.m208344M(vText, locationPermissionState == locationPermissionState2);
        xdl0.m208344M(this.f30357b, locationPermissionState == locationPermissionState2);
        xdl0.m208344M(this.f30358c, locationPermissionState == locationPermissionState2);
        invalidate();
    }

    public LocationPermissionState getState() {
        return this.f30359d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47358b(this);
    }

    public LocationPermissionView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30359d = LocationPermissionState.none;
    }

    public LocationPermissionView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30359d = LocationPermissionState.none;
    }
}
