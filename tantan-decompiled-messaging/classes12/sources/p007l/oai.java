package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.FeedWriterLevelInProfileView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class oai {
    /* JADX INFO: renamed from: a */
    public static void m12509a(FeedWriterLevelInProfileView feedWriterLevelInProfileView, View view) {
        feedWriterLevelInProfileView.f3185a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedWriterLevelInProfileView.f3186b = (ImageView) viewGroup.getChildAt(0);
        feedWriterLevelInProfileView.f3187c = (TextView) viewGroup.getChildAt(1);
        feedWriterLevelInProfileView.f3188d = (TextView) viewGroup.getChildAt(2);
        feedWriterLevelInProfileView.f3189e = (ImageView) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m12510b(FeedWriterLevelInProfileView feedWriterLevelInProfileView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11127S3, viewGroup, false);
        m12509a(feedWriterLevelInProfileView, viewInflate);
        return viewInflate;
    }
}
