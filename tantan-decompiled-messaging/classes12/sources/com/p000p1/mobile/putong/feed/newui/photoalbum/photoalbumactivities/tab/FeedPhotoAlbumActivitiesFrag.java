package com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.tab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongFrag;
import l.d30;
import l.e30;
import p007l.blg;
import p007l.clg;
import p007l.pv60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPhotoAlbumActivitiesFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public blg f3733A;

    /* JADX INFO: renamed from: B */
    public clg f3734B;

    /* JADX INFO: renamed from: z */
    public pv60 f3735z = new pv60();

    /* JADX INFO: renamed from: O4 */
    private void m6102O4() {
        this.f3733A = new blg(this);
        clg clgVar = new clg(this);
        this.f3734B = clgVar;
        this.f3733A.C(clgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public /* synthetic */ void m6103Q4(Bundle bundle) {
        m6106T4();
    }

    /* JADX INFO: renamed from: S4 */
    public static FeedPhotoAlbumActivitiesFrag m6105S4(int i, String str, boolean z) {
        FeedPhotoAlbumActivitiesFrag feedPhotoAlbumActivitiesFrag = new FeedPhotoAlbumActivitiesFrag();
        Bundle bundle = new Bundle();
        bundle.putInt("tab_tag", i);
        bundle.putString("from", str);
        bundle.putBoolean("needRefreshData", z);
        feedPhotoAlbumActivitiesFrag.setArguments(bundle);
        return feedPhotoAlbumActivitiesFrag;
    }

    /* JADX INFO: renamed from: T4 */
    private void m6106T4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4, reason: merged with bridge method [inline-methods] */
    public void m6104R4() {
    }

    /* JADX INFO: renamed from: P4 */
    public void m6108P4() {
        blg blgVar = this.f3733A;
        if (blgVar == null) {
            return;
        }
        blgVar.m10197d1();
    }

    /* JADX INFO: renamed from: f4 */
    public void m6109f4() {
        super.f4();
        m6102O4();
        this.f3733A.mo8909a0();
        creates(new e30() { // from class: l.ulh
            public final void call(Object obj) {
                this.f13857a.m6103Q4((Bundle) obj);
            }
        }, new d30() { // from class: l.vlh
            public final void call() {
                this.f14230a.m6104R4();
            }
        });
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f3734B.inflateView(layoutInflater, viewGroup);
    }
}
