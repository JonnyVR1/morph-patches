package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumTagView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class llb0 {
    /* JADX INFO: renamed from: a */
    public static void m150466a(QATopicPhotoAlbumTagView qATopicPhotoAlbumTagView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qATopicPhotoAlbumTagView.f43104a = (VDraweeView) viewGroup.getChildAt(0);
        qATopicPhotoAlbumTagView.f43105b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        qATopicPhotoAlbumTagView.f43106c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
