package com.p046p1.mobile.putong.core.newui.intlmeet.ilike;

import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.putong.app.PutongMvpFrag;
import p149l.apn;
import p149l.e30;
import p149l.gpn;
import p149l.mkd0;
import p149l.von;
import p149l.vwb;
import p149l.xma;

/* JADX INFO: loaded from: classes11.dex */
public class IntlILikeFrag extends PutongMvpFrag<apn, gpn> {

    /* JADX INFO: renamed from: B */
    public von f24211B;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public /* synthetic */ void m39371S4(Boolean bool) {
        if (bool.booleanValue()) {
            mo29638J4().m109036l();
            ((gpn) this.f17174A).m127414j();
        } else {
            mo29638J4().m109035k();
        }
        ((apn) this.f17175z).m98155b1(bool.booleanValue());
    }

    /* JADX INFO: renamed from: P4 */
    public von m39372P4() {
        if (this.f24211B == null) {
            this.f24211B = new von((apn) this.f17175z);
        }
        return this.f24211B;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public apn mo29641M4() {
        return new apn(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public gpn mo29642N4() {
        return new gpn(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.pageHelper.m109040p(vwb.m200311Y("is_privileged", Boolean.valueOf(!xma.m210071e4())));
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        duringCreated(m29640L4()).subscribe(mkd0.m154955G(new e30() { // from class: l.won
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187442a.m39371S4((Boolean) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        ((gpn) this.f17174A).m127410c();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((apn) this.f17175z).m184919I0(i, i2, intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        p p;
        super.onHiddenChanged(z);
        if (z || (p = this.f17175z) == 0) {
            return;
        }
        ((apn) p).m184920N0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_intl_meet_view";
    }
}
