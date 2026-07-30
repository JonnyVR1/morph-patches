package com.p046p1.mobile.putong.core.newui.intlmeet.tribe;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongMvpFrag;
import p149l.e30;
import p149l.mkd0;
import p149l.oho;
import p149l.qho;

/* JADX INFO: loaded from: classes11.dex */
public class IntlMeetTribeFrag extends PutongMvpFrag<oho, qho> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public /* synthetic */ void m39442R4(Boolean bool) {
        if (bool.booleanValue()) {
            mo29638J4().m109036l();
        } else {
            mo29638J4().m109035k();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public oho mo29641M4() {
        return new oho(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public qho mo29642N4() {
        return new qho(this);
    }

    /* JADX INFO: renamed from: S4 */
    public boolean m39445S4(int i, int i2, Intent intent) {
        return ((oho) this.f17175z).m164450I0(i, i2, intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m29640L4().subscribe(mkd0.m154955G(new e30() { // from class: l.aho
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f69674a.m39442R4((Boolean) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((qho) this.f17174A).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        ((oho) this.f17175z).m164451J0(z);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_intl_tribe_view";
    }
}
