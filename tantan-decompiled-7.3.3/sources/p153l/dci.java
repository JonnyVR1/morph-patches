package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.FeedWriterLevelInProfileView;

/* JADX INFO: loaded from: classes13.dex */
public class dci {
    /* JADX INFO: renamed from: a */
    public static void m115274a(FeedWriterLevelInProfileView feedWriterLevelInProfileView, View view) {
        feedWriterLevelInProfileView.f42572a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedWriterLevelInProfileView.f42573b = (ImageView) viewGroup.getChildAt(0);
        feedWriterLevelInProfileView.f42574c = (TextView) viewGroup.getChildAt(1);
        feedWriterLevelInProfileView.f42575d = (TextView) viewGroup.getChildAt(2);
        feedWriterLevelInProfileView.f42576e = (ImageView) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m115275b(FeedWriterLevelInProfileView feedWriterLevelInProfileView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173577S3, viewGroup, false);
        m115274a(feedWriterLevelInProfileView, viewInflate);
        return viewInflate;
    }
}
