package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.group.allgroup.FeedAllGroupItemView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class zng {
    /* JADX INFO: renamed from: a */
    public static void m220597a(FeedAllGroupItemView feedAllGroupItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedAllGroupItemView.f40827d = (VDraweeView) viewGroup.getChildAt(0);
        feedAllGroupItemView.f40828e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedAllGroupItemView.f40829f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedAllGroupItemView.f40830g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedAllGroupItemView.f40831h = (VImage) viewGroup.getChildAt(2);
        feedAllGroupItemView.f40832i = (VFrame) viewGroup.getChildAt(3);
        feedAllGroupItemView.f40833j = (VFrame) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        feedAllGroupItemView.f40834k = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        feedAllGroupItemView.f40835l = (VFrame) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        feedAllGroupItemView.f40836m = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        feedAllGroupItemView.f40837n = (VFrame) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        feedAllGroupItemView.f40838o = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(0);
        feedAllGroupItemView.f40839p = (TextView) viewGroup.getChildAt(4);
    }
}
