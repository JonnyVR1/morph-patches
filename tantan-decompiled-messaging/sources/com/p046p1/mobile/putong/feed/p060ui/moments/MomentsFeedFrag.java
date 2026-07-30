package com.p046p1.mobile.putong.feed.p060ui.moments;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongMvpFrag;
import com.p046p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.ln00;
import p149l.roj0;

/* JADX INFO: loaded from: classes12.dex */
public class MomentsFeedFrag extends PutongMvpFrag<ln00, C11410b> {

    /* JADX INFO: renamed from: B */
    public boolean f43882B = true;

    /* JADX INFO: renamed from: C */
    public boolean f43883C = true;

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo29632B4() {
        return false;
    }

    /* JADX INFO: renamed from: O4 */
    public void m66833O4(boolean z) {
        ((C11410b) this.f17174A).m67058q(z);
    }

    /* JADX INFO: renamed from: P4 */
    public void m66834P4() {
        ((C11410b) this.f17174A).m67059s();
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public ln00 mo29641M4() {
        return new ln00(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public C11410b mo29642N4() {
        return new C11410b(this);
    }

    /* JADX INFO: renamed from: S4 */
    public boolean m66837S4() {
        return ((ln00) this.f17175z).m150641n0();
    }

    /* JADX INFO: renamed from: T4 */
    public void m66838T4(List<Media> list) {
        ((C11410b) this.f17174A).m67052G(list);
    }

    /* JADX INFO: renamed from: U4 */
    public void m66839U4(boolean z) {
        ((ln00) this.f17175z).m150646t0(z);
    }

    /* JADX INFO: renamed from: V4 */
    public C11410b m66840V4() {
        return (C11410b) this.f17174A;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((C11410b) this.f17174A).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (NullChecker.m81303a(this.f17174A)) {
            ((C11410b) this.f17174A).m67051F(i, i2, intent);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (NullChecker.m81303a(this.f17175z)) {
            ((ln00) this.f17175z).f128954b.onNext(roj0.f160388a);
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f43883C && this.f43882B) {
            ((ln00) this.f17175z).m150645s0();
            this.f43883C = false;
            this.f43882B = false;
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return ln00.pageId();
    }
}
