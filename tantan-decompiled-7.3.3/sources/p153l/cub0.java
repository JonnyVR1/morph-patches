package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinminetab.FeedWriterLevelView;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumTopView;
import p151v.VDraweeView;
import p151v.VLinear_FillerMeasure;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class cub0 {
    /* JADX INFO: renamed from: a */
    public static void m112664a(QATopicPhotoAlbumTopView qATopicPhotoAlbumTopView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qATopicPhotoAlbumTopView.f43958a = (RelativeLayout) viewGroup.getChildAt(0);
        qATopicPhotoAlbumTopView.f43959b = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qATopicPhotoAlbumTopView.f43960c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        qATopicPhotoAlbumTopView.f43961d = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        qATopicPhotoAlbumTopView.f43962e = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        qATopicPhotoAlbumTopView.f43963f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        qATopicPhotoAlbumTopView.f43964g = (VLinear_FillerMeasure) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        qATopicPhotoAlbumTopView.f43965h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        qATopicPhotoAlbumTopView.f43966i = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        qATopicPhotoAlbumTopView.f43967j = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        qATopicPhotoAlbumTopView.f43968k = (FeedWriterLevelView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3);
        qATopicPhotoAlbumTopView.f43969l = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        qATopicPhotoAlbumTopView.f43970m = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        qATopicPhotoAlbumTopView.f43971n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }
}
