package com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import p149l.e570;
import p149l.f570;
import p149l.xzl;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumFeedBaseFrag extends PhotoAlbumBaseFrag implements xzl {

    /* JADX INFO: renamed from: D */
    public HashMap<String, Boolean> f41455D;

    /* JADX INFO: renamed from: E */
    public ArrayList<String> f41456E = new ArrayList<>();

    /* JADX INFO: renamed from: F */
    public ArrayList<String> f41457F = new ArrayList<>();

    /* JADX INFO: renamed from: n5 */
    public static PhotoAlbumFeedBaseFrag m64033n5(String str, String str2, int i, String str3, int i2) {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = new PhotoAlbumFeedBaseFrag();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        bundle.putString("from", str2);
        bundle.putInt("selected_item_position", i);
        bundle.putString("target_moment_id", str3);
        bundle.putInt("page_type", i2);
        photoAlbumFeedBaseFrag.setArguments(bundle);
        return photoAlbumFeedBaseFrag;
    }

    /* JADX INFO: renamed from: o5 */
    public static PhotoAlbumFeedBaseFrag m64034o5(String str, String str2, int i, String str3, int i2, String str4, String str5) {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFragM64033n5 = m64033n5(str, str2, i, str3, i2);
        photoAlbumFeedBaseFragM64033n5.getArguments().putString("keyHideNeedMatchUid", str4);
        photoAlbumFeedBaseFragM64033n5.getArguments().putString("keyOriginFrom", str5);
        return photoAlbumFeedBaseFragM64033n5;
    }

    /* JADX INFO: renamed from: p5 */
    public static PhotoAlbumFeedBaseFrag m64035p5(String str, String str2, int i, String str3, int i2, boolean z) {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFragM64033n5 = m64033n5(str, str2, i, str3, i2);
        photoAlbumFeedBaseFragM64033n5.getArguments().putBoolean("is_auto_refresh", z);
        return photoAlbumFeedBaseFragM64033n5;
    }

    /* JADX INFO: renamed from: q5 */
    public static PhotoAlbumFeedBaseFrag m64036q5(String str, String str2, String str3, int i) {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = new PhotoAlbumFeedBaseFrag();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        bundle.putString("topic_id", str2);
        bundle.putString("from", str3);
        bundle.putInt("page_type", i);
        photoAlbumFeedBaseFrag.setArguments(bundle);
        return photoAlbumFeedBaseFrag;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag
    /* JADX INFO: renamed from: O4 */
    public void mo64007O4() {
        this.f41451A = new e570(this);
        f570 f570Var = new f570(this);
        this.f41454z = f570Var;
        this.f41451A.mo51532C(f570Var);
    }

    /* JADX INFO: renamed from: r5 */
    public void m64037r5() {
        ((f570) this.f41454z).m119481Q();
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo20605y4() {
        ((f570) this.f41454z).m119478N();
    }
}
