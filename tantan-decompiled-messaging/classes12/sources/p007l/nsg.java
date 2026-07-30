package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterTextView;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumTagView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class nsg {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m12304a(msg msgVar, View view) {
        msgVar.f10552a = (FeedCenterTextView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        msgVar.f10553b = viewGroup.getChildAt(0);
        msgVar.f10554c = viewGroup.getChildAt(1);
        msgVar.f10555d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        msgVar.f10556e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        msgVar.f10557f = viewGroup.getChildAt(2);
        msgVar.f10558g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        msgVar.f10559h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        msgVar.f10560i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        msgVar.f10561j = (QATopicPhotoAlbumTagView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        msgVar.f10562k = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        msgVar.f10563l = viewGroup.getChildAt(3);
    }
}
