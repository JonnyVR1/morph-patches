package com.p000p1.mobile.putong.core.newui.intlmeet.ilike;

import android.content.Intent;
import android.os.Bundle;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.app.PutongMvpFrag;
import l.e30;
import l.j760;
import l.jq2;
import l.mkd0;
import l.vwb;
import l.xma;
import p009l.apn;
import p009l.gpn;
import p009l.von;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlILikeFrag extends PutongMvpFrag<apn, gpn> {

    /* JADX INFO: renamed from: B */
    public von f2989B;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public /* synthetic */ void m3409S4(Boolean bool) {
        if (bool.booleanValue()) {
            J4().l();
            ((gpn) ((PutongMvpFrag) this).A).m15156j();
        } else {
            J4().k();
        }
        ((apn) ((PutongMvpFrag) this).z).m11580b1(bool.booleanValue());
    }

    /* JADX INFO: renamed from: P4 */
    public von m3412P4() {
        if (this.f2989B == null) {
            this.f2989B = new von((apn) ((PutongMvpFrag) this).z);
        }
        return this.f2989B;
    }

    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public apn m3410M4() {
        return new apn(this);
    }

    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public gpn m3411N4() {
        return new gpn(this);
    }

    /* JADX INFO: renamed from: d4 */
    public void m3415d4() {
        super.d4();
        ((PutongFrag) this).pageHelper.p(new j760[]{vwb.Y("is_privileged", Boolean.valueOf(!xma.e4()))});
    }

    /* JADX INFO: renamed from: f4 */
    public void m3416f4() {
        super.f4();
        duringCreated(L4()).subscribe(mkd0.G(new e30() { // from class: l.won
            public final void call(Object obj) {
                this.f22242a.m3409S4((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public void m3417g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        ((gpn) ((PutongMvpFrag) this).A).m15151c();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        ((apn) ((PutongMvpFrag) this).z).m22276I0(i, i2, intent);
    }

    public void onHiddenChanged(boolean z) {
        jq2 jq2Var;
        super/*com.p1.mobile.putong.app.PutongFrag*/.onHiddenChanged(z);
        if (z || (jq2Var = ((PutongMvpFrag) this).z) == null) {
            return;
        }
        ((apn) jq2Var).m22277N0();
    }

    public String pageId() {
        return "p_intl_meet_view";
    }
}
