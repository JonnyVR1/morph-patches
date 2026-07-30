package com.p046p1.mobile.putong.core.p053ui.opensdk;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.core.CoreModule;
import p149l.cq50;
import p149l.j760;
import p149l.qib0;
import p149l.zp50;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class OpenSdkAct extends PutongMvpAct<zp50, cq50> {
    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public zp50 mo28672V1() {
        return new zp50(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public cq50 mo28673X1() {
        return new cq50(this);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        ((zp50) this.f17172c).m219628z0(menuItem);
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_tantan_oauth";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public boolean shouldBlockOnCreate(Bundle bundle) {
        if (qib0.f154713b0 != null && CoreModule.m29931H() != null && CoreModule.m29931H().signedIn_()) {
            return super.shouldBlockOnCreate(bundle);
        }
        Intent intent = new Intent();
        intent.putExtra("errorMessage", "tantanApp has not login");
        zvf0.m220369B("e_tantan_oauth_failed", "", j760.m140076a("tantan_oauth_failed_reason", "tantanApp has not login"));
        this.act.setResult(0, intent);
        this.act.m66873d2();
        return true;
    }
}
