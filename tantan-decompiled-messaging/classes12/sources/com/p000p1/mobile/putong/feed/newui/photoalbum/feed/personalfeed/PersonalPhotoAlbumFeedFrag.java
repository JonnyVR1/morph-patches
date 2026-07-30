package com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personalfeed;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p1.mobile.putong.app.PutongFrag;
import l.j760;
import p007l.po60;
import p007l.qn60;
import p007l.tzl;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PersonalPhotoAlbumFeedFrag extends PutongFrag implements tzl {

    /* JADX INFO: renamed from: A */
    public po60 f3146A;

    /* JADX INFO: renamed from: z */
    public qn60 f3147z;

    /* JADX INFO: renamed from: M4 */
    public static PersonalPhotoAlbumFeedFrag m5498M4(String str, String str2, int i, String str3, int i2, boolean z) {
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

    @Override // p007l.tzl
    /* JADX INFO: renamed from: B3 */
    public void mo3002B3(j760<User, Boolean> j760Var, boolean z) {
        this.f3147z.m13632t0(j760Var, z);
    }

    @Override // p007l.tzl
    /* JADX INFO: renamed from: N0 */
    public void mo3005N0() {
        this.f3147z.m13627X0();
    }

    /* JADX INFO: renamed from: N4 */
    public void m5499N4() {
        this.f3146A = new po60(this);
        qn60 qn60Var = new qn60(this);
        this.f3147z = qn60Var;
        qn60Var.C(this.f3146A);
    }

    @Override // p007l.tzl
    /* JADX INFO: renamed from: Q0 */
    public PhotoAlbumBaseFrag mo3007Q0() {
        return this.f3146A.f11898D;
    }

    /* JADX INFO: renamed from: f4 */
    public void m5500f4() {
        super.f4();
        m5499N4();
        this.f3147z.m13629a0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m5501g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f3146A.m13131X(bundle);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f3146A.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n4 */
    public void m5502n4(Bundle bundle) {
        this.f3147z.m13615D0();
        super/*com.p1.mobile.android.app.Frag*/.n4(bundle);
    }

    @Override // p007l.tzl
    /* JADX INFO: renamed from: o */
    public void mo3012o() {
        act().finish();
    }

    public void onResume() {
        super/*com.p1.mobile.android.app.Frag*/.onResume();
    }

    /* JADX INFO: renamed from: y4 */
    public void m5503y4() {
        this.f3146A.m13115H();
    }
}
