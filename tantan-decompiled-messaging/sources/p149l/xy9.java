package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.emoji.CoreMomentEmojiNewView;
import p147v.VPager;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class xy9 {
    /* JADX INFO: renamed from: a */
    public static void m211743a(CoreMomentEmojiNewView coreMomentEmojiNewView, View view) {
        coreMomentEmojiNewView.f29110a = (CoreMomentEmojiNewView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreMomentEmojiNewView.f29111b = (LinearLayout) viewGroup.getChildAt(0);
        coreMomentEmojiNewView.f29112c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coreMomentEmojiNewView.f29113d = (VPager) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        coreMomentEmojiNewView.f29114e = (VRecyclerView) viewGroup.getChildAt(1);
    }
}
