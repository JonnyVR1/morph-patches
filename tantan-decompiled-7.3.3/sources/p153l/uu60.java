package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.PersonalFeedInMineFrag;

/* JADX INFO: loaded from: classes13.dex */
public class uu60 {
    /* JADX INFO: renamed from: a */
    public static void m198171a(PersonalFeedInMineFrag personalFeedInMineFrag, View view) {
        personalFeedInMineFrag.f42563z = (LinearLayout) view;
        personalFeedInMineFrag.f42540A = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m198172b(PersonalFeedInMineFrag personalFeedInMineFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173581T1, viewGroup, false);
        m198171a(personalFeedInMineFrag, viewInflate);
        return viewInflate;
    }
}
