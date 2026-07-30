package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.FeedWriterLevelInProfileView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.PersonalFeedInProfileFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.TopicListView;

/* JADX INFO: loaded from: classes12.dex */
public class an60 {
    /* JADX INFO: renamed from: a */
    public static void m97716a(PersonalFeedInProfileFrag personalFeedInProfileFrag, View view) {
        personalFeedInProfileFrag.f41744z = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        personalFeedInProfileFrag.f41730A = (FeedWriterLevelInProfileView) viewGroup.getChildAt(0);
        personalFeedInProfileFrag.f41731B = (TopicListView) viewGroup.getChildAt(1);
        personalFeedInProfileFrag.f41732C = (FrameLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m97717b(PersonalFeedInProfileFrag personalFeedInProfileFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142118U1, viewGroup, false);
        m97716a(personalFeedInProfileFrag, viewInflate);
        return viewInflate;
    }
}
