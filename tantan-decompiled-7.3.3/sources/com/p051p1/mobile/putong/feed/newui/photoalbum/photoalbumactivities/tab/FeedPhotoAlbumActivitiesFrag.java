package com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.tab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongFrag;
import p153l.qmg;
import p153l.rmg;
import p153l.v370;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPhotoAlbumActivitiesFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public qmg f43120A;

    /* JADX INFO: renamed from: B */
    public rmg f43121B;

    /* JADX INFO: renamed from: z */
    public v370 f43122z = new v370();

    /* JADX INFO: renamed from: O4 */
    private void m66185O4() {
        this.f43120A = new qmg(this);
        rmg rmgVar = new rmg(this);
        this.f43121B = rmgVar;
        this.f43120A.mo52715C(rmgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public /* synthetic */ void m66186Q4(Bundle bundle) {
        m66189T4();
    }

    /* JADX INFO: renamed from: S4 */
    public static FeedPhotoAlbumActivitiesFrag m66188S4(int i, String str, boolean z) {
        FeedPhotoAlbumActivitiesFrag feedPhotoAlbumActivitiesFrag = new FeedPhotoAlbumActivitiesFrag();
        Bundle bundle = new Bundle();
        bundle.putInt("tab_tag", i);
        bundle.putString("from", str);
        bundle.putBoolean("needRefreshData", z);
        feedPhotoAlbumActivitiesFrag.setArguments(bundle);
        return feedPhotoAlbumActivitiesFrag;
    }

    /* JADX INFO: renamed from: T4 */
    private void m66189T4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4, reason: merged with bridge method [inline-methods] */
    public void m66187R4() {
    }

    /* JADX INFO: renamed from: P4 */
    public void m66191P4() {
        qmg qmgVar = this.f43120A;
        if (qmgVar == null) {
            return;
        }
        qmgVar.m196742d1();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m66185O4();
        this.f43120A.mo40473a0();
        creates(new y20() { // from class: l.jnh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121855a.m66186Q4((Bundle) obj);
            }
        }, new x20() { // from class: l.knh
            @Override // p153l.x20
            public final void call() {
                this.f127600a.m66187R4();
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f43121B.inflateView(layoutInflater, viewGroup);
    }
}
