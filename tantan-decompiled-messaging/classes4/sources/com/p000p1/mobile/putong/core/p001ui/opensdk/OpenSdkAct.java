package com.p000p1.mobile.putong.core.p001ui.opensdk;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.core.CoreModule;
import l.j760;
import l.qib0;
import l.zvf0;
import p002l.cq50;
import p002l.zp50;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OpenSdkAct extends PutongMvpAct<zp50, cq50> {
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public zp50 m832V1() {
        return new zp50(this);
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public cq50 m833X1() {
        return new cq50(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        ((zp50) ((PutongMvpAct) this).c).m27484z0(menuItem);
        return super/*com.p1.mobile.android.app.Act*/.onOptionsItemSelected(menuItem);
    }

    public String pageId() {
        return "p_tantan_oauth";
    }

    public boolean shouldBlockOnCreate(Bundle bundle) {
        if (qib0.b0 != null && CoreModule.H() != null && CoreModule.H().signedIn_()) {
            return super/*com.p1.mobile.putong.app.PutongAct*/.shouldBlockOnCreate(bundle);
        }
        Intent intent = new Intent();
        intent.putExtra("errorMessage", "tantanApp has not login");
        zvf0.B("e_tantan_oauth_failed", "", new j760[]{j760.a("tantan_oauth_failed_reason", "tantanApp has not login")});
        ((Act) this).act.setResult(0, intent);
        ((Act) this).act.finish();
        return true;
    }
}
