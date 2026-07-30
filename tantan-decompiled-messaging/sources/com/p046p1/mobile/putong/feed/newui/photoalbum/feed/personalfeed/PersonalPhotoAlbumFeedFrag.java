package com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personalfeed;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import p149l.j760;
import p149l.po60;
import p149l.qn60;
import p149l.tzl;

/* JADX INFO: loaded from: classes12.dex */
public class PersonalPhotoAlbumFeedFrag extends PutongFrag implements tzl {

    /* JADX INFO: renamed from: A */
    public po60 f41685A;

    /* JADX INFO: renamed from: z */
    public qn60 f41686z;

    /* JADX INFO: renamed from: M4 */
    public static PersonalPhotoAlbumFeedFrag m64418M4(String str, String str2, int i, String str3, int i2, boolean z) {
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

    @Override // p149l.tzl
    /* JADX INFO: renamed from: B3 */
    public void mo62027B3(j760<User, Boolean> j760Var, boolean z) {
        this.f41686z.m175630t0(j760Var, z);
    }

    @Override // p149l.tzl
    /* JADX INFO: renamed from: N0 */
    public void mo62029N0() {
        this.f41686z.m175626X0();
    }

    /* JADX INFO: renamed from: N4 */
    public void m64419N4() {
        this.f41685A = new po60(this);
        qn60 qn60Var = new qn60(this);
        this.f41686z = qn60Var;
        qn60Var.mo51532C(this.f41685A);
    }

    @Override // p149l.tzl
    /* JADX INFO: renamed from: Q0 */
    public PhotoAlbumBaseFrag mo62031Q0() {
        return this.f41685A.f150457D;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m64419N4();
        this.f41686z.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f41685A.m170531X(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f41685A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        this.f41686z.m175614D0();
        super.mo20594n4(bundle);
    }

    @Override // p149l.tzl
    /* JADX INFO: renamed from: o */
    public void mo62034o() {
        act().m66873d2();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo20605y4() {
        this.f41685A.m170515H();
    }
}
