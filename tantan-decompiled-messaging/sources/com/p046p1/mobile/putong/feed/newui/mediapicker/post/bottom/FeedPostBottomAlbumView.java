package com.p046p1.mobile.putong.feed.newui.mediapicker.post.bottom;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.newui.mediapicker.NewPostAlbumFrag;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.C11245a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VFrame;
import p149l.b5c0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPostBottomAlbumView extends VFrame {

    /* JADX INFO: renamed from: b */
    public static String f40739b = "MediaPickerFrag";

    /* JADX INFO: renamed from: a */
    public NewPostAlbumFrag f40740a;

    public FeedPostBottomAlbumView(Context context) {
        super(context);
    }

    public int getMaxCount() {
        return this.f40740a.f40490P;
    }

    public String getSelectedFolderPath() {
        return NullChecker.m81303a(this.f40740a.f54013z.selectedFolder) ? this.f40740a.f54013z.selectedFolder.f114885b : "";
    }

    public ArrayList<Media> getSelectedImages() {
        return this.f40740a.f54013z.selectedImageMedias;
    }

    public Media getSelectedVideo() {
        return this.f40740a.f54013z.getSelectedVideo();
    }

    /* JADX INFO: renamed from: p */
    public void m62936p(Act act, C11245a c11245a) {
        FragmentManager supportFragmentManager = act.getSupportFragmentManager();
        if (supportFragmentManager.m2557i0(f40739b) != null) {
            NewPostAlbumFrag newPostAlbumFrag = (NewPostAlbumFrag) supportFragmentManager.m2557i0(f40739b);
            this.f40740a = newPostAlbumFrag;
            newPostAlbumFrag.m62542a6(c11245a.f40661d);
        } else {
            this.f40740a = new NewPostAlbumFrag();
            AbstractC0427k abstractC0427kM2567m = supportFragmentManager.m2567m();
            abstractC0427kM2567m.m2804c(b5c0.f73545b, this.f40740a, f40739b);
            abstractC0427kM2567m.mo2708j();
            this.f40740a.m62542a6(c11245a.f40661d);
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m62937s() {
        return this.f40740a == null;
    }

    public void setSelectedImages(ArrayList<Media> arrayList) {
        this.f40740a.f54013z.clearAllSelectedMedia();
        this.f40740a.f54013z.addAllSelectedMedia(arrayList);
    }

    /* JADX INFO: renamed from: u */
    public void m62938u(boolean z) {
        this.f40740a.m62535V5(z);
    }

    /* JADX INFO: renamed from: v */
    public void m62939v(ArrayList<Media> arrayList) {
        if (NullChecker.m81303a(this.f40740a)) {
            for (int i = 0; i < arrayList.size(); i++) {
                boolean zIsEmpty = TextUtils.isEmpty(arrayList.get(i).originUrl);
                NewPostAlbumFrag newPostAlbumFrag = this.f40740a;
                if (zIsEmpty) {
                    newPostAlbumFrag.f54005A.put(arrayList.get(i).url, Integer.valueOf(i));
                } else {
                    newPostAlbumFrag.f54005A.put(arrayList.get(i).originUrl, Integer.valueOf(i));
                }
            }
            if (arrayList.size() > 0) {
                Media media = arrayList.get(0);
                if (media instanceof Video) {
                    if (!TextUtils.isEmpty(((Video) arrayList.get(0)).originUrl)) {
                        this.f40740a.f54013z.clearSelectedVideo();
                        this.f40740a.f54013z.addSelectedVideo(arrayList.get(0));
                    }
                } else if (media instanceof Picture) {
                    this.f40740a.f54013z.clearAllSelectedMedia();
                    this.f40740a.f54013z.addAllSelectedMedia(arrayList);
                }
            }
            this.f40740a.m62533U5();
        }
    }

    /* JADX INFO: renamed from: w */
    public void m62940w(String str) {
        if (NullChecker.m81303a(this.f40740a)) {
            this.f40740a.m62544c6(str);
        }
    }

    public FeedPostBottomAlbumView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPostBottomAlbumView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
