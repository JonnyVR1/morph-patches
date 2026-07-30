package com.p000p1.mobile.putong.feed.p005ui.moments;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Media;
import com.p1.mobile.putong.app.PutongMvpFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.roj0;
import p007l.ln00;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentsFeedFrag extends PutongMvpFrag<ln00, C2254b> {

    /* JADX INFO: renamed from: B */
    public boolean f5343B = true;

    /* JADX INFO: renamed from: C */
    public boolean f5344C = true;

    /* JADX INFO: renamed from: B4 */
    public boolean m8024B4() {
        return false;
    }

    /* JADX INFO: renamed from: O4 */
    public void m8027O4(boolean z) {
        ((C2254b) ((PutongMvpFrag) this).A).m8263q(z);
    }

    /* JADX INFO: renamed from: P4 */
    public void m8028P4() {
        ((C2254b) ((PutongMvpFrag) this).A).m8264s();
    }

    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public ln00 m8025M4() {
        return new ln00(this);
    }

    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public C2254b m8026N4() {
        return new C2254b(this);
    }

    /* JADX INFO: renamed from: S4 */
    public boolean m8031S4() {
        return ((ln00) ((PutongMvpFrag) this).z).m11664n0();
    }

    /* JADX INFO: renamed from: T4 */
    public void m8032T4(List<Media> list) {
        ((C2254b) ((PutongMvpFrag) this).A).m8256G(list);
    }

    /* JADX INFO: renamed from: U4 */
    public void m8033U4(boolean z) {
        ((ln00) ((PutongMvpFrag) this).z).m11669t0(z);
    }

    /* JADX INFO: renamed from: V4 */
    public C2254b m8034V4() {
        return (C2254b) ((PutongMvpFrag) this).A;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((C2254b) ((PutongMvpFrag) this).A).inflateView(layoutInflater, viewGroup);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (NullChecker.a(((PutongMvpFrag) this).A)) {
            ((C2254b) ((PutongMvpFrag) this).A).m8255F(i, i2, intent);
        }
    }

    public void onHiddenChanged(boolean z) {
        super/*com.p1.mobile.putong.app.PutongFrag*/.onHiddenChanged(z);
        if (NullChecker.a(((PutongMvpFrag) this).z)) {
            ((ln00) ((PutongMvpFrag) this).z).f10073b.onNext(roj0.a);
        }
    }

    public void onResume() {
        super/*com.p1.mobile.android.app.Frag*/.onResume();
        if (this.f5344C && this.f5343B) {
            ((ln00) ((PutongMvpFrag) this).z).m11668s0();
            this.f5344C = false;
            this.f5343B = false;
        }
    }

    public String pageId() {
        return ln00.pageId();
    }
}
