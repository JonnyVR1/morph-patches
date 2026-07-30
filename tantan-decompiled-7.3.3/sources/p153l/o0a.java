package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridView;
import com.p051p1.mobile.putong.core.p058ui.emoji.CoreMomentEmojiView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class o0a {
    /* JADX INFO: renamed from: a */
    public static void m165424a(CoreMomentEmojiView coreMomentEmojiView, View view) {
        coreMomentEmojiView.f29979a = (CoreMomentEmojiView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreMomentEmojiView.f29980b = (GridView) viewGroup.getChildAt(0);
        coreMomentEmojiView.f29981c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        coreMomentEmojiView.f29982d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        coreMomentEmojiView.f29983e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        coreMomentEmojiView.f29984f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
    }
}
