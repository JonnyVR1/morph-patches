package com.p000p1.mobile.putong.core.map;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.p1.mobile.putong.core.ui.map.intl.IntlMapBaseAct;
import com.p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import l.puw;
import l.pvl;
import l.pvv;
import l.qib0;
import l.u4c0;
import p003l.wvv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class IntlMapAct extends IntlMapBaseAct {
    /* JADX INFO: renamed from: e2 */
    public static Intent m756e2(Context context, int i, String str) {
        return IntlMapBaseAct.Z1(new Intent(context, (Class<?>) IntlMapAct.class), i, str);
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m757g2(Context context, int i, boolean z) {
        return IntlMapBaseAct.a2(new Intent(context, (Class<?>) IntlMapAct.class), i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d2 */
    public pvl m758d2() {
        puw.a(getApplicationContext());
        IntlMapFragment intlMapFragmentH0 = getSupportFragmentManager().h0(u4c0.P7);
        if (intlMapFragmentH0 != null) {
            return intlMapFragmentH0;
        }
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        Location locationQ = qib0.E.q();
        if (NullChecker.a(locationQ)) {
            googleMapOptions.h(CameraPosition.F().c(new LatLng(locationQ.u(), locationQ.x())).e(17.0f).b());
        }
        if (pvv.c()) {
            wvv.m10574h(act());
        }
        IntlMapFragment intlMapFragmentM767g4 = IntlMapFragment.m767g4(googleMapOptions);
        act().getSupportFragmentManager().m().s(u4c0.P7, intlMapFragmentM767g4).i();
        return intlMapFragmentM767g4;
    }

    public String pageId() {
        return "p_browse_map_and_select_location_view";
    }
}
