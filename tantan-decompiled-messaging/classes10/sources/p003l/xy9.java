package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.p001ui.emoji.CoreMomentEmojiNewView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xy9 {
    /* JADX INFO: renamed from: a */
    public static void m11070a(CoreMomentEmojiNewView coreMomentEmojiNewView, View view) {
        coreMomentEmojiNewView.f1504a = (CoreMomentEmojiNewView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreMomentEmojiNewView.f1505b = (LinearLayout) viewGroup.getChildAt(0);
        coreMomentEmojiNewView.f1506c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coreMomentEmojiNewView.f1507d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        coreMomentEmojiNewView.f1508e = viewGroup.getChildAt(1);
    }
}
