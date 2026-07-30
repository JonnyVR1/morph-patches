package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridView;
import com.p046p1.mobile.putong.core.p053ui.emoji.CoreMomentEmojiView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dz9 {
    /* JADX INFO: renamed from: a */
    public static void m114112a(CoreMomentEmojiView coreMomentEmojiView, View view) {
        coreMomentEmojiView.f29131a = (CoreMomentEmojiView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreMomentEmojiView.f29132b = (GridView) viewGroup.getChildAt(0);
        coreMomentEmojiView.f29133c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        coreMomentEmojiView.f29134d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        coreMomentEmojiView.f29135e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        coreMomentEmojiView.f29136f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
    }
}
