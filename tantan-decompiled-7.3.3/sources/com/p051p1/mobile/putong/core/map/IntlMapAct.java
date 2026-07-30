package com.p051p1.mobile.putong.core.map;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.p051p1.mobile.putong.core.p058ui.map.intl.IntlMapBaseAct;
import com.p051p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import p153l.adc0;
import p153l.hyl;
import p153l.oxw;
import p153l.qxv;
import p153l.uqb0;
import p153l.xxv;

/* JADX INFO: loaded from: classes10.dex */
public class IntlMapAct extends IntlMapBaseAct {
    /* JADX INFO: renamed from: g2 */
    public static Intent m36949g2(Context context, int i, String str) {
        return IntlMapBaseAct.m48563a2(new Intent(context, (Class<?>) IntlMapAct.class), i, str);
    }

    /* JADX INFO: renamed from: h2 */
    public static Intent m36950h2(Context context, int i, boolean z) {
        return IntlMapBaseAct.m48564b2(new Intent(context, (Class<?>) IntlMapAct.class), i, z);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.map.intl.IntlMapBaseAct
    /* JADX INFO: renamed from: e2 */
    public hyl mo36951e2() {
        oxw.m169737a(getApplicationContext());
        IntlMapFragment intlMapFragment = (IntlMapFragment) getSupportFragmentManager().m2555h0(adc0.f70101R7);
        if (intlMapFragment != null) {
            return intlMapFragment;
        }
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        Location locationM80048q = uqb0.f180370E.m80048q();
        if (NullChecker.m82486a(locationM80048q)) {
            googleMapOptions.m15034h(CameraPosition.m15087F().m15090c(new LatLng(locationM80048q.m80014u(), locationM80048q.m80016x())).m15092e(17.0f).m15089b());
        }
        if (qxv.m178618c()) {
            xxv.m213581h(act());
        }
        IntlMapFragment intlMapFragmentM36960g4 = IntlMapFragment.m36960g4(googleMapOptions);
        act().getSupportFragmentManager().m2568m().m2812s(adc0.f70101R7, intlMapFragmentM36960g4).mo2708i();
        return intlMapFragmentM36960g4;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.map.intl.IntlMapBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_browse_map_and_select_location_view";
    }
}
