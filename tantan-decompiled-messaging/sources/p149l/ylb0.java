package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.FeedWriterLevelView;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumTopView;
import p147v.VDraweeView;
import p147v.VLinear_FillerMeasure;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class ylb0 {
    /* JADX INFO: renamed from: a */
    public static void m215260a(QATopicPhotoAlbumTopView qATopicPhotoAlbumTopView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qATopicPhotoAlbumTopView.f43110a = (RelativeLayout) viewGroup.getChildAt(0);
        qATopicPhotoAlbumTopView.f43111b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qATopicPhotoAlbumTopView.f43112c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        qATopicPhotoAlbumTopView.f43113d = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        qATopicPhotoAlbumTopView.f43114e = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        qATopicPhotoAlbumTopView.f43115f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        qATopicPhotoAlbumTopView.f43116g = (VLinear_FillerMeasure) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        qATopicPhotoAlbumTopView.f43117h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        qATopicPhotoAlbumTopView.f43118i = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        qATopicPhotoAlbumTopView.f43119j = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        qATopicPhotoAlbumTopView.f43120k = (FeedWriterLevelView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        qATopicPhotoAlbumTopView.f43121l = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        qATopicPhotoAlbumTopView.f43122m = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        qATopicPhotoAlbumTopView.f43123n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }
}
