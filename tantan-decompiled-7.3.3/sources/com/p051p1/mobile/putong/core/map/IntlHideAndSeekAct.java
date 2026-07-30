package com.p051p1.mobile.putong.core.map;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p153l.adc0;
import p153l.gqn;
import p153l.hyl;
import p153l.jyb;
import p153l.oxw;
import p153l.pf60;
import p153l.spn;
import p153l.uqb0;
import p153l.x20;

/* JADX INFO: loaded from: classes10.dex */
public class IntlHideAndSeekAct extends PutongMvpAct<spn, gqn> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m36917Z1(Context context) {
        return new Intent(context, (Class<?>) IntlHideAndSeekAct.class);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public spn mo29671X1() {
        return new spn(this, this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public gqn mo29672Y1() {
        return new gqn(this);
    }

    /* JADX INFO: renamed from: c2 */
    public hyl m36920c2() {
        oxw.m169737a(getApplicationContext());
        IntlHideAndSeekFragment intlHideAndSeekFragment = (IntlHideAndSeekFragment) getSupportFragmentManager().m2555h0(adc0.f70101R7);
        if (intlHideAndSeekFragment != null) {
            return intlHideAndSeekFragment;
        }
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        Location locationM80048q = uqb0.f180370E.m80048q();
        if (NullChecker.m82486a(locationM80048q)) {
            googleMapOptions.m15034h(CameraPosition.m15087F().m15090c(new LatLng(locationM80048q.m80014u(), locationM80048q.m80016x())).m15092e(17.0f).m15089b());
        }
        IntlHideAndSeekFragment intlHideAndSeekFragmentM36927h4 = IntlHideAndSeekFragment.m36927h4(googleMapOptions);
        act().getSupportFragmentManager().m2568m().m2812s(adc0.f70101R7, intlHideAndSeekFragmentM36927h4).mo2708i();
        return intlHideAndSeekFragmentM36927h4;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public ArrayList<pf60<String, x20>> debugItems() {
        ArrayList<pf60<String, x20>> arrayListM147507f0 = jyb.m147507f0(new pf60[0]);
        arrayListM147507f0.addAll(((spn) this.f17891c).m187429u0());
        return arrayListM147507f0;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        getWindow().addFlags(128);
        ((spn) this.f17891c).m187418A0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        super.setTransparentStatusBar();
        PutongAct.setLightStatusBar(this.act.getWindow(), 1024);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
