package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.PersonalFeedInMineFrag;

/* JADX INFO: loaded from: classes12.dex */
public class om60 {
    /* JADX INFO: renamed from: a */
    public static void m165009a(PersonalFeedInMineFrag personalFeedInMineFrag, View view) {
        personalFeedInMineFrag.f41715z = (LinearLayout) view;
        personalFeedInMineFrag.f41692A = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m165010b(PersonalFeedInMineFrag personalFeedInMineFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142112T1, viewGroup, false);
        m165009a(personalFeedInMineFrag, viewInflate);
        return viewInflate;
    }
}
