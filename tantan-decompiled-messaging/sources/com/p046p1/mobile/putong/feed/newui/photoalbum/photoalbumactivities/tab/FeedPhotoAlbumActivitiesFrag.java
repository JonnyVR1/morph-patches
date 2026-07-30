package com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.tab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongFrag;
import p149l.blg;
import p149l.clg;
import p149l.d30;
import p149l.e30;
import p149l.pv60;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPhotoAlbumActivitiesFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public blg f42272A;

    /* JADX INFO: renamed from: B */
    public clg f42273B;

    /* JADX INFO: renamed from: z */
    public pv60 f42274z = new pv60();

    /* JADX INFO: renamed from: O4 */
    private void m65002O4() {
        this.f42272A = new blg(this);
        clg clgVar = new clg(this);
        this.f42273B = clgVar;
        this.f42272A.mo51532C(clgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public /* synthetic */ void m65003Q4(Bundle bundle) {
        m65006T4();
    }

    /* JADX INFO: renamed from: S4 */
    public static FeedPhotoAlbumActivitiesFrag m65005S4(int i, String str, boolean z) {
        FeedPhotoAlbumActivitiesFrag feedPhotoAlbumActivitiesFrag = new FeedPhotoAlbumActivitiesFrag();
        Bundle bundle = new Bundle();
        bundle.putInt("tab_tag", i);
        bundle.putString("from", str);
        bundle.putBoolean("needRefreshData", z);
        feedPhotoAlbumActivitiesFrag.setArguments(bundle);
        return feedPhotoAlbumActivitiesFrag;
    }

    /* JADX INFO: renamed from: T4 */
    private void m65006T4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4, reason: merged with bridge method [inline-methods] */
    public void m65004R4() {
    }

    /* JADX INFO: renamed from: P4 */
    public void m65008P4() {
        blg blgVar = this.f42272A;
        if (blgVar == null) {
            return;
        }
        blgVar.m122054d1();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m65002O4();
        this.f42272A.mo39470a0();
        creates(new e30() { // from class: l.ulh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177066a.m65003Q4((Bundle) obj);
            }
        }, new d30() { // from class: l.vlh
            @Override // p149l.d30
            public final void call() {
                this.f181950a.m65004R4();
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f42273B.inflateView(layoutInflater, viewGroup);
    }
}
