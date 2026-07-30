package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumTagView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class ptb0 {
    /* JADX INFO: renamed from: a */
    public static void m173765a(QATopicPhotoAlbumTagView qATopicPhotoAlbumTagView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qATopicPhotoAlbumTagView.f43952a = (VDraweeView) viewGroup.getChildAt(0);
        qATopicPhotoAlbumTagView.f43953b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        qATopicPhotoAlbumTagView.f43954c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
