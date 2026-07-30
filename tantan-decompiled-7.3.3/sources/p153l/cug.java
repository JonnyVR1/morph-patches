package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterTextView;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumTagView;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class cug {
    /* JADX INFO: renamed from: a */
    public static void m112685a(bug bugVar, View view) {
        bugVar.f78493a = (FeedCenterTextView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bugVar.f78494b = viewGroup.getChildAt(0);
        bugVar.f78495c = (VLinear) viewGroup.getChildAt(1);
        bugVar.f78496d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        bugVar.f78497e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        bugVar.f78498f = (VLinear) viewGroup.getChildAt(2);
        bugVar.f78499g = (VExpandableTextContainer) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        bugVar.f78500h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        bugVar.f78501i = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        bugVar.f78502j = (QATopicPhotoAlbumTagView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        bugVar.f78503k = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        bugVar.f78504l = viewGroup.getChildAt(3);
    }
}
