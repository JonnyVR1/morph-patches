package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsFeedHeadView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class qw00 {
    /* JADX INFO: renamed from: a */
    public static void m178418a(MomentsFeedHeadView momentsFeedHeadView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentsFeedHeadView.f44732a = (VImage) viewGroup.getChildAt(0);
        momentsFeedHeadView.f44733b = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        momentsFeedHeadView.f44734c = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        momentsFeedHeadView.f44735d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        momentsFeedHeadView.f44736e = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        momentsFeedHeadView.f44737f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        momentsFeedHeadView.f44738g = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        momentsFeedHeadView.f44739h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}
