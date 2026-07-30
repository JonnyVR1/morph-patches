package com.p046p1.mobile.putong.core.map;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p149l.d30;
import p149l.gon;
import p149l.j760;
import p149l.puw;
import p149l.pvl;
import p149l.qib0;
import p149l.snn;
import p149l.u4c0;
import p149l.vwb;

/* JADX INFO: loaded from: classes10.dex */
public class IntlHideAndSeekAct extends PutongMvpAct<snn, gon> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m35914Y1(Context context) {
        return new Intent(context, (Class<?>) IntlHideAndSeekAct.class);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public snn mo28672V1() {
        return new snn(this, this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public gon mo28673X1() {
        return new gon(this);
    }

    /* JADX INFO: renamed from: b2 */
    public pvl m35917b2() {
        puw.m171483a(getApplicationContext());
        IntlHideAndSeekFragment intlHideAndSeekFragment = (IntlHideAndSeekFragment) getSupportFragmentManager().m2554h0(u4c0.f173979P7);
        if (intlHideAndSeekFragment != null) {
            return intlHideAndSeekFragment;
        }
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        Location locationM78865q = qib0.f154687E.m78865q();
        if (NullChecker.m81303a(locationM78865q)) {
            googleMapOptions.m14981h(CameraPosition.m15033F().m15036c(new LatLng(locationM78865q.m78831u(), locationM78865q.m78833x())).m15038e(17.0f).m15035b());
        }
        IntlHideAndSeekFragment intlHideAndSeekFragmentM35924h4 = IntlHideAndSeekFragment.m35924h4(googleMapOptions);
        act().getSupportFragmentManager().m2567m().m2811s(u4c0.f173979P7, intlHideAndSeekFragmentM35924h4).mo2707i();
        return intlHideAndSeekFragmentM35924h4;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public ArrayList<j760<String, d30>> debugItems() {
        ArrayList<j760<String, d30>> arrayListM200324f0 = vwb.m200324f0(new j760[0]);
        arrayListM200324f0.addAll(((snn) this.f17172c).m185160u0());
        return arrayListM200324f0;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        getWindow().addFlags(128);
        ((snn) this.f17172c).m185149A0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        super.setTransparentStatusBar();
        PutongAct.setLightStatusBar(this.act.getWindow(), 1024);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
