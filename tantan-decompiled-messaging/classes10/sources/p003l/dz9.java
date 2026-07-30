package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridView;
import com.p000p1.mobile.putong.core.p001ui.emoji.CoreMomentEmojiView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dz9 {
    /* JADX INFO: renamed from: a */
    public static void m6223a(CoreMomentEmojiView coreMomentEmojiView, View view) {
        coreMomentEmojiView.f1525a = (CoreMomentEmojiView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreMomentEmojiView.f1526b = (GridView) viewGroup.getChildAt(0);
        coreMomentEmojiView.f1527c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        coreMomentEmojiView.f1528d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        coreMomentEmojiView.f1529e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        coreMomentEmojiView.f1530f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
    }
}
