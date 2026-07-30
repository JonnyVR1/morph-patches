package com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personalfeed;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import p153l.n2m;
import p153l.pf60;
import p153l.vw60;
import p153l.wv60;

/* JADX INFO: loaded from: classes13.dex */
public class PersonalPhotoAlbumFeedFrag extends PutongFrag implements n2m {

    /* JADX INFO: renamed from: A */
    public vw60 f42533A;

    /* JADX INFO: renamed from: z */
    public wv60 f42534z;

    /* JADX INFO: renamed from: M4 */
    public static PersonalPhotoAlbumFeedFrag m65601M4(String str, String str2, int i, String str3, int i2, boolean z) {
        PersonalPhotoAlbumFeedFrag personalPhotoAlbumFeedFrag = new PersonalPhotoAlbumFeedFrag();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        bundle.putString("from", str2);
        bundle.putInt("selected_item_position", i);
        bundle.putString("target_moment_id", str3);
        bundle.putInt("page_type", i2);
        bundle.putBoolean("start_home_card", z);
        personalPhotoAlbumFeedFrag.setArguments(bundle);
        return personalPhotoAlbumFeedFrag;
    }

    @Override // p153l.n2m
    /* JADX INFO: renamed from: B3 */
    public void mo63210B3(pf60<User, Boolean> pf60Var, boolean z) {
        this.f42534z.m208030t0(pf60Var, z);
    }

    @Override // p153l.n2m
    /* JADX INFO: renamed from: N0 */
    public void mo63212N0() {
        this.f42534z.m208026X0();
    }

    /* JADX INFO: renamed from: N4 */
    public void m65602N4() {
        this.f42533A = new vw60(this);
        wv60 wv60Var = new wv60(this);
        this.f42534z = wv60Var;
        wv60Var.mo52715C(this.f42533A);
    }

    @Override // p153l.n2m
    /* JADX INFO: renamed from: Q0 */
    public PhotoAlbumBaseFrag mo63214Q0() {
        return this.f42533A.f186071D;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m65602N4();
        this.f42534z.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f42533A.m203124X(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f42533A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        this.f42534z.m208014D0();
        super.mo21593n4(bundle);
    }

    @Override // p153l.n2m
    /* JADX INFO: renamed from: o */
    public void mo63217o() {
        act().m68056e2();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo21604y4() {
        this.f42533A.m203108H();
    }
}
