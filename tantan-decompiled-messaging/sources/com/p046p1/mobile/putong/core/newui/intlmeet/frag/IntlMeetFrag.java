package com.p046p1.mobile.putong.core.newui.intlmeet.frag;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongMvpFrag;
import p149l.ldo;
import p149l.rdo;
import p149l.vwb;
import p149l.xma;

/* JADX INFO: loaded from: classes11.dex */
public class IntlMeetFrag extends PutongMvpFrag<ldo, rdo> {
    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo29632B4() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: O4, reason: merged with bridge method [inline-methods] */
    public ldo mo29641M4() {
        return new ldo(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public rdo mo29642N4() {
        return new rdo(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.pageHelper.m109040p(vwb.m200311Y("is_privileged", Boolean.valueOf(xma.m210040C3())));
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((rdo) this.f17174A).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (((ldo) this.f17175z).m149461m0(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        v v2 = this.f17174A;
        if (z) {
            ((rdo) v2).m178995x1();
        } else {
            ((rdo) v2).m178981D1();
        }
        ((ldo) this.f17175z).m149462n0(z);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_intl_meet_view";
    }
}
