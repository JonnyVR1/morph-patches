package com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import p007l.e570;
import p007l.f570;
import p007l.xzl;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumFeedBaseFrag extends PhotoAlbumBaseFrag implements xzl {

    /* JADX INFO: renamed from: D */
    public HashMap<String, Boolean> f2916D;

    /* JADX INFO: renamed from: E */
    public ArrayList<String> f2917E = new ArrayList<>();

    /* JADX INFO: renamed from: F */
    public ArrayList<String> f2918F = new ArrayList<>();

    /* JADX INFO: renamed from: n5 */
    public static PhotoAlbumFeedBaseFrag m5080n5(String str, String str2, int i, String str3, int i2) {
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
    public static PhotoAlbumFeedBaseFrag m5081o5(String str, String str2, int i, String str3, int i2, String str4, String str5) {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFragM5080n5 = m5080n5(str, str2, i, str3, i2);
        photoAlbumFeedBaseFragM5080n5.getArguments().putString("keyHideNeedMatchUid", str4);
        photoAlbumFeedBaseFragM5080n5.getArguments().putString("keyOriginFrom", str5);
        return photoAlbumFeedBaseFragM5080n5;
    }

    /* JADX INFO: renamed from: p5 */
    public static PhotoAlbumFeedBaseFrag m5082p5(String str, String str2, int i, String str3, int i2, boolean z) {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFragM5080n5 = m5080n5(str, str2, i, str3, i2);
        photoAlbumFeedBaseFragM5080n5.getArguments().putBoolean("is_auto_refresh", z);
        return photoAlbumFeedBaseFragM5080n5;
    }

    /* JADX INFO: renamed from: q5 */
    public static PhotoAlbumFeedBaseFrag m5083q5(String str, String str2, String str3, int i) {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = new PhotoAlbumFeedBaseFrag();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        bundle.putString("topic_id", str2);
        bundle.putString("from", str3);
        bundle.putInt("page_type", i);
        photoAlbumFeedBaseFrag.setArguments(bundle);
        return photoAlbumFeedBaseFrag;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag
    /* JADX INFO: renamed from: O4 */
    public void mo5050O4() {
        this.f2912A = new e570(this);
        f570 f570Var = new f570(this);
        this.f2915z = f570Var;
        this.f2912A.C(f570Var);
    }

    /* JADX INFO: renamed from: r5 */
    public void m5084r5() {
        ((f570) this.f2915z).m10056Q();
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag
    /* JADX INFO: renamed from: y4 */
    public void mo5079y4() {
        ((f570) this.f2915z).m10053N();
    }
}
