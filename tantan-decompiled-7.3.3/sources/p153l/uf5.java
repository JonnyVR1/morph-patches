package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.feed.newui.kankan.recorder.ComicFaceRecorderActivity;

/* JADX INFO: loaded from: classes13.dex */
public class uf5 {
    /* JADX INFO: renamed from: a */
    public static void m195822a(ComicFaceRecorderActivity comicFaceRecorderActivity, View view) {
        comicFaceRecorderActivity.f40979c = (FrameLayout) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m195823b(ComicFaceRecorderActivity comicFaceRecorderActivity, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173691k, viewGroup, false);
        m195822a(comicFaceRecorderActivity, viewInflate);
        return viewInflate;
    }
}
