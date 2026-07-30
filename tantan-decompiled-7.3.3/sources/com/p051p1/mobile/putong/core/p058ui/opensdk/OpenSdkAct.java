package com.p051p1.mobile.putong.core.p058ui.opensdk;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.core.CoreModule;
import p153l.fy50;
import p153l.i4g0;
import p153l.iy50;
import p153l.pf60;
import p153l.uqb0;

/* JADX INFO: loaded from: classes4.dex */
public class OpenSdkAct extends PutongMvpAct<fy50, iy50> {
    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public fy50 mo29671X1() {
        return new fy50(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public iy50 mo29672Y1() {
        return new iy50(this);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        ((fy50) this.f17891c).m128073z0(menuItem);
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_tantan_oauth";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public boolean shouldBlockOnCreate(Bundle bundle) {
        if (uqb0.f180396b0 != null && CoreModule.m30929H() != null && CoreModule.m30929H().signedIn_()) {
            return super.shouldBlockOnCreate(bundle);
        }
        Intent intent = new Intent();
        intent.putExtra("errorMessage", "tantanApp has not login");
        i4g0.m138493B("e_tantan_oauth_failed", "", pf60.m172085a("tantan_oauth_failed_reason", "tantanApp has not login"));
        this.act.setResult(0, intent);
        this.act.m68056e2();
        return true;
    }
}
