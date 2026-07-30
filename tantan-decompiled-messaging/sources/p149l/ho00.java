package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsFeedHeadView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class ho00 {
    /* JADX INFO: renamed from: a */
    public static void m132035a(MomentsFeedHeadView momentsFeedHeadView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentsFeedHeadView.f43884a = (VImage) viewGroup.getChildAt(0);
        momentsFeedHeadView.f43885b = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        momentsFeedHeadView.f43886c = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        momentsFeedHeadView.f43887d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        momentsFeedHeadView.f43888e = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        momentsFeedHeadView.f43889f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        momentsFeedHeadView.f43890g = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        momentsFeedHeadView.f43891h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}
