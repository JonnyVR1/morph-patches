package com.p000p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongMvpFrag;
import l.e30;
import l.mkd0;
import p009l.oho;
import p009l.qho;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlMeetTribeFrag extends PutongMvpFrag<oho, qho> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public /* synthetic */ void m3493R4(Boolean bool) {
        if (bool.booleanValue()) {
            J4().l();
        } else {
            J4().k();
        }
    }

    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public oho m3494M4() {
        return new oho(this);
    }

    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public qho m3495N4() {
        return new qho(this);
    }

    /* JADX INFO: renamed from: S4 */
    public boolean m3498S4(int i, int i2, Intent intent) {
        return ((oho) ((PutongMvpFrag) this).z).m19785I0(i, i2, intent);
    }

    /* JADX INFO: renamed from: f4 */
    public void m3499f4() {
        super.f4();
        L4().subscribe(mkd0.G(new e30() { // from class: l.aho
            public final void call(Object obj) {
                this.f9517a.m3493R4((Boolean) obj);
            }
        }));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((qho) ((PutongMvpFrag) this).A).inflateView(layoutInflater, viewGroup);
    }

    public void onHiddenChanged(boolean z) {
        super/*com.p1.mobile.putong.app.PutongFrag*/.onHiddenChanged(z);
        ((oho) ((PutongMvpFrag) this).z).m19786J0(z);
    }

    public String pageId() {
        return "p_intl_tribe_view";
    }
}
