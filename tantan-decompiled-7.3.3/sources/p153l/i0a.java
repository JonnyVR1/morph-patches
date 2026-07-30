package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.emoji.CoreMomentEmojiNewView;
import p151v.VPager;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class i0a {
    /* JADX INFO: renamed from: a */
    public static void m137956a(CoreMomentEmojiNewView coreMomentEmojiNewView, View view) {
        coreMomentEmojiNewView.f29958a = (CoreMomentEmojiNewView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreMomentEmojiNewView.f29959b = (LinearLayout) viewGroup.getChildAt(0);
        coreMomentEmojiNewView.f29960c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coreMomentEmojiNewView.f29961d = (VPager) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        coreMomentEmojiNewView.f29962e = (VRecyclerView) viewGroup.getChildAt(1);
    }
}
