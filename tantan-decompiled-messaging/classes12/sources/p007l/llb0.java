package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumTagView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class llb0 {
    /* JADX INFO: renamed from: a */
    public static void m11641a(QATopicPhotoAlbumTagView qATopicPhotoAlbumTagView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qATopicPhotoAlbumTagView.f4565a = viewGroup.getChildAt(0);
        qATopicPhotoAlbumTagView.f4566b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        qATopicPhotoAlbumTagView.f4567c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
