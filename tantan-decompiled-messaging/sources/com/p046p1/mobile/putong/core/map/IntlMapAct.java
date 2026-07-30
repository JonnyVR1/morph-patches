package com.p046p1.mobile.putong.core.map;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.p046p1.mobile.putong.core.p053ui.map.intl.IntlMapBaseAct;
import com.p046p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import p149l.puw;
import p149l.pvl;
import p149l.pvv;
import p149l.qib0;
import p149l.u4c0;
import p149l.wvv;

/* JADX INFO: loaded from: classes10.dex */
public class IntlMapAct extends IntlMapBaseAct {
    /* JADX INFO: renamed from: e2 */
    public static Intent m35946e2(Context context, int i, String str) {
        return IntlMapBaseAct.m47380Z1(new Intent(context, (Class<?>) IntlMapAct.class), i, str);
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m35947g2(Context context, int i, boolean z) {
        return IntlMapBaseAct.m47381a2(new Intent(context, (Class<?>) IntlMapAct.class), i, z);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.map.intl.IntlMapBaseAct
    /* JADX INFO: renamed from: d2 */
    public pvl mo35948d2() {
        puw.m171483a(getApplicationContext());
        IntlMapFragment intlMapFragment = (IntlMapFragment) getSupportFragmentManager().m2554h0(u4c0.f173979P7);
        if (intlMapFragment != null) {
            return intlMapFragment;
        }
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        Location locationM78865q = qib0.f154687E.m78865q();
        if (NullChecker.m81303a(locationM78865q)) {
            googleMapOptions.m14981h(CameraPosition.m15033F().m15036c(new LatLng(locationM78865q.m78831u(), locationM78865q.m78833x())).m15038e(17.0f).m15035b());
        }
        if (pvv.m171693c()) {
            wvv.m205768h(act());
        }
        IntlMapFragment intlMapFragmentM35957g4 = IntlMapFragment.m35957g4(googleMapOptions);
        act().getSupportFragmentManager().m2567m().m2811s(u4c0.f173979P7, intlMapFragmentM35957g4).mo2707i();
        return intlMapFragmentM35957g4;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.map.intl.IntlMapBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_browse_map_and_select_location_view";
    }
}
