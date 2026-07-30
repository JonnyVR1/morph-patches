package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostTopicItemView;
import p147v.VCheckBox;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
public class svh {
    /* JADX INFO: renamed from: a */
    public static void m186082a(FeedPostTopicItemView feedPostTopicItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostTopicItemView.f40040a = (VFrame) viewGroup.getChildAt(0);
        feedPostTopicItemView.f40041b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPostTopicItemView.f40042c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedPostTopicItemView.f40043d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedPostTopicItemView.f40044e = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedPostTopicItemView.f40045f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedPostTopicItemView.f40046g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedPostTopicItemView.f40047h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        feedPostTopicItemView.f40048i = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedPostTopicItemView.f40049j = (VCheckBox) viewGroup.getChildAt(2);
    }
}
