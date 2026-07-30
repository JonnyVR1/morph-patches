package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.FeedWriterLevelInProfileView;

/* JADX INFO: loaded from: classes12.dex */
public class oai {
    /* JADX INFO: renamed from: a */
    public static void m163299a(FeedWriterLevelInProfileView feedWriterLevelInProfileView, View view) {
        feedWriterLevelInProfileView.f41724a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedWriterLevelInProfileView.f41725b = (ImageView) viewGroup.getChildAt(0);
        feedWriterLevelInProfileView.f41726c = (TextView) viewGroup.getChildAt(1);
        feedWriterLevelInProfileView.f41727d = (TextView) viewGroup.getChildAt(2);
        feedWriterLevelInProfileView.f41728e = (ImageView) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m163300b(FeedWriterLevelInProfileView feedWriterLevelInProfileView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142108S3, viewGroup, false);
        m163299a(feedWriterLevelInProfileView, viewInflate);
        return viewInflate;
    }
}
