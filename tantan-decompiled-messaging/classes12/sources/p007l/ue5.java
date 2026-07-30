package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.feed.newui.kankan.recorder.ComicFaceRecorderActivity;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ue5 {
    /* JADX INFO: renamed from: a */
    public static void m15088a(ComicFaceRecorderActivity comicFaceRecorderActivity, View view) {
        comicFaceRecorderActivity.f1592c = (FrameLayout) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m15089b(ComicFaceRecorderActivity comicFaceRecorderActivity, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11241k, viewGroup, false);
        m15088a(comicFaceRecorderActivity, viewInflate);
        return viewInflate;
    }
}
