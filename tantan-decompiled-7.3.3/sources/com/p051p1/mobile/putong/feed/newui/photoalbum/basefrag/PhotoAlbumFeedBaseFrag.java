package com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import p153l.kd70;
import p153l.ld70;
import p153l.r2m;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumFeedBaseFrag extends PhotoAlbumBaseFrag implements r2m {

    /* JADX INFO: renamed from: D */
    public HashMap<String, Boolean> f42303D;

    /* JADX INFO: renamed from: E */
    public ArrayList<String> f42304E = new ArrayList<>();

    /* JADX INFO: renamed from: F */
    public ArrayList<String> f42305F = new ArrayList<>();

    /* JADX INFO: renamed from: n5 */
    public static PhotoAlbumFeedBaseFrag m65216n5(String str, String str2, int i, String str3, int i2) {
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
    public static PhotoAlbumFeedBaseFrag m65217o5(String str, String str2, int i, String str3, int i2, String str4, String str5) {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFragM65216n5 = m65216n5(str, str2, i, str3, i2);
        photoAlbumFeedBaseFragM65216n5.getArguments().putString("keyHideNeedMatchUid", str4);
        photoAlbumFeedBaseFragM65216n5.getArguments().putString("keyOriginFrom", str5);
        return photoAlbumFeedBaseFragM65216n5;
    }

    /* JADX INFO: renamed from: p5 */
    public static PhotoAlbumFeedBaseFrag m65218p5(String str, String str2, int i, String str3, int i2, boolean z) {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFragM65216n5 = m65216n5(str, str2, i, str3, i2);
        photoAlbumFeedBaseFragM65216n5.getArguments().putBoolean("is_auto_refresh", z);
        return photoAlbumFeedBaseFragM65216n5;
    }

    /* JADX INFO: renamed from: q5 */
    public static PhotoAlbumFeedBaseFrag m65219q5(String str, String str2, String str3, int i) {
        PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = new PhotoAlbumFeedBaseFrag();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", str);
        bundle.putString("topic_id", str2);
        bundle.putString("from", str3);
        bundle.putInt("page_type", i);
        photoAlbumFeedBaseFrag.setArguments(bundle);
        return photoAlbumFeedBaseFrag;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag
    /* JADX INFO: renamed from: O4 */
    public void mo65190O4() {
        this.f42299A = new kd70(this);
        ld70 ld70Var = new ld70(this);
        this.f42302z = ld70Var;
        this.f42299A.mo52715C(ld70Var);
    }

    /* JADX INFO: renamed from: r5 */
    public void m65220r5() {
        ((ld70) this.f42302z).m153733Q();
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo21604y4() {
        ((ld70) this.f42302z).m153730N();
    }
}
