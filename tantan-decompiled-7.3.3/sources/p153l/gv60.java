package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.FeedWriterLevelInProfileView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.PersonalFeedInProfileFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.TopicListView;

/* JADX INFO: loaded from: classes13.dex */
public class gv60 {
    /* JADX INFO: renamed from: a */
    public static void m132493a(PersonalFeedInProfileFrag personalFeedInProfileFrag, View view) {
        personalFeedInProfileFrag.f42592z = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        personalFeedInProfileFrag.f42578A = (FeedWriterLevelInProfileView) viewGroup.getChildAt(0);
        personalFeedInProfileFrag.f42579B = (TopicListView) viewGroup.getChildAt(1);
        personalFeedInProfileFrag.f42580C = (FrameLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m132494b(PersonalFeedInProfileFrag personalFeedInProfileFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173587U1, viewGroup, false);
        m132493a(personalFeedInProfileFrag, viewInflate);
        return viewInflate;
    }
}
