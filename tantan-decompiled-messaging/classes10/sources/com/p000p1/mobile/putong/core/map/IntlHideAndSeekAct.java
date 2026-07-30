package com.p000p1.mobile.putong.core.map;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.d30;
import l.j760;
import l.puw;
import l.pvl;
import l.qib0;
import l.u4c0;
import l.vwb;
import p003l.gon;
import p003l.snn;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class IntlHideAndSeekAct extends PutongMvpAct<snn, gon> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m722Y1(Context context) {
        return new Intent(context, (Class<?>) IntlHideAndSeekAct.class);
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public snn m723V1() {
        return new snn(this, this);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public gon m724X1() {
        return new gon(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b2 */
    public pvl m727b2() {
        puw.a(getApplicationContext());
        IntlHideAndSeekFragment intlHideAndSeekFragmentH0 = getSupportFragmentManager().h0(u4c0.P7);
        if (intlHideAndSeekFragmentH0 != null) {
            return intlHideAndSeekFragmentH0;
        }
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        Location locationQ = qib0.E.q();
        if (NullChecker.a(locationQ)) {
            googleMapOptions.h(CameraPosition.F().c(new LatLng(locationQ.u(), locationQ.x())).e(17.0f).b());
        }
        IntlHideAndSeekFragment intlHideAndSeekFragmentM734h4 = IntlHideAndSeekFragment.m734h4(googleMapOptions);
        act().getSupportFragmentManager().m().s(u4c0.P7, intlHideAndSeekFragmentM734h4).i();
        return intlHideAndSeekFragmentM734h4;
    }

    public ArrayList<j760<String, d30>> debugItems() {
        ArrayList<j760<String, d30>> arrayListF0 = vwb.f0(new j760[0]);
        arrayListF0.addAll(((snn) ((PutongMvpAct) this).c).m9464u0());
        return arrayListF0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
        getWindow().addFlags(128);
        ((snn) ((PutongMvpAct) this).c).m9451A0();
    }

    public void setTransparentStatusBar() {
        super/*com.p1.mobile.putong.app.PutongAct*/.setTransparentStatusBar();
        PutongAct.setLightStatusBar(((Act) this).act.getWindow(), 1024);
    }

    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
