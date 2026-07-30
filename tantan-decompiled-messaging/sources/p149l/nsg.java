package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterTextView;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumTagView;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class nsg {
    /* JADX INFO: renamed from: a */
    public static void m160769a(msg msgVar, View view) {
        msgVar.f135481a = (FeedCenterTextView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        msgVar.f135482b = viewGroup.getChildAt(0);
        msgVar.f135483c = (VLinear) viewGroup.getChildAt(1);
        msgVar.f135484d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        msgVar.f135485e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        msgVar.f135486f = (VLinear) viewGroup.getChildAt(2);
        msgVar.f135487g = (VExpandableTextContainer) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        msgVar.f135488h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        msgVar.f135489i = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        msgVar.f135490j = (QATopicPhotoAlbumTagView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        msgVar.f135491k = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        msgVar.f135492l = viewGroup.getChildAt(3);
    }
}
