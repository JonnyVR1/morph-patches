package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostTopicItemView;
import p151v.VCheckBox;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class hxh {
    /* JADX INFO: renamed from: a */
    public static void m137607a(FeedPostTopicItemView feedPostTopicItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostTopicItemView.f40888a = (VFrame) viewGroup.getChildAt(0);
        feedPostTopicItemView.f40889b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPostTopicItemView.f40890c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedPostTopicItemView.f40891d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedPostTopicItemView.f40892e = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedPostTopicItemView.f40893f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedPostTopicItemView.f40894g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedPostTopicItemView.f40895h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        feedPostTopicItemView.f40896i = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedPostTopicItemView.f40897j = (VCheckBox) viewGroup.getChildAt(2);
    }
}
