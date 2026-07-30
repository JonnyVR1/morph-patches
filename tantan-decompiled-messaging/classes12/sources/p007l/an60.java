package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.FeedWriterLevelInProfileView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.PersonalFeedInProfileFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.TopicListView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class an60 {
    /* JADX INFO: renamed from: a */
    public static void m8583a(PersonalFeedInProfileFrag personalFeedInProfileFrag, View view) {
        personalFeedInProfileFrag.f3205z = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        personalFeedInProfileFrag.f3191A = (FeedWriterLevelInProfileView) viewGroup.getChildAt(0);
        personalFeedInProfileFrag.f3192B = (TopicListView) viewGroup.getChildAt(1);
        personalFeedInProfileFrag.f3193C = (FrameLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8584b(PersonalFeedInProfileFrag personalFeedInProfileFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11137U1, viewGroup, false);
        m8583a(personalFeedInProfileFrag, viewInflate);
        return viewInflate;
    }
}
