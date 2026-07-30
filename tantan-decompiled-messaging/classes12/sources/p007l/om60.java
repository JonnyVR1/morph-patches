package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.PersonalFeedInMineFrag;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class om60 {
    /* JADX INFO: renamed from: a */
    public static void m12655a(PersonalFeedInMineFrag personalFeedInMineFrag, View view) {
        personalFeedInMineFrag.f3176z = (LinearLayout) view;
        personalFeedInMineFrag.f3153A = (FrameLayout) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m12656b(PersonalFeedInMineFrag personalFeedInMineFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11131T1, viewGroup, false);
        m12655a(personalFeedInMineFrag, viewInflate);
        return viewInflate;
    }
}
