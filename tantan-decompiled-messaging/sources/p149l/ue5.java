package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.feed.newui.kankan.recorder.ComicFaceRecorderActivity;

/* JADX INFO: loaded from: classes12.dex */
public class ue5 {
    /* JADX INFO: renamed from: a */
    public static void m193219a(ComicFaceRecorderActivity comicFaceRecorderActivity, View view) {
        comicFaceRecorderActivity.f40131c = (FrameLayout) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m193220b(ComicFaceRecorderActivity comicFaceRecorderActivity, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142222k, viewGroup, false);
        m193219a(comicFaceRecorderActivity, viewInflate);
        return viewInflate;
    }
}
