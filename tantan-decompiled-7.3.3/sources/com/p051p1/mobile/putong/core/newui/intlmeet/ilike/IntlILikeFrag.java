package com.p051p1.mobile.putong.core.newui.intlmeet.ilike;

import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.putong.app.PutongMvpFrag;
import p153l.arn;
import p153l.grn;
import p153l.joa;
import p153l.jyb;
import p153l.psd0;
import p153l.vqn;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class IntlILikeFrag extends PutongMvpFrag<arn, grn> {

    /* JADX INFO: renamed from: B */
    public vqn f24953B;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public /* synthetic */ void m40374S4(Boolean bool) {
        if (bool.booleanValue()) {
            mo30636J4().m152777l();
            ((grn) this.f17893A).m131830j();
        } else {
            mo30636J4().m152776k();
        }
        ((arn) this.f17894z).m99757b1(bool.booleanValue());
    }

    /* JADX INFO: renamed from: P4 */
    public vqn m40375P4() {
        if (this.f24953B == null) {
            this.f24953B = new vqn((arn) this.f17894z);
        }
        return this.f24953B;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public arn mo30639M4() {
        return new arn(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public grn mo30640N4() {
        return new grn(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.pageHelper.m152781p(jyb.m147494Y("is_privileged", Boolean.valueOf(!joa.m146386f4())));
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        duringCreated(m30638L4()).subscribe(psd0.m173596G(new y20() { // from class: l.wqn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190422a.m40374S4((Boolean) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        ((grn) this.f17893A).m131826c();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((arn) this.f17894z).m98901I0(i, i2, intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        p p;
        super.onHiddenChanged(z);
        if (z || (p = this.f17894z) == 0) {
            return;
        }
        ((arn) p).m98906N0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_intl_meet_view";
    }
}
