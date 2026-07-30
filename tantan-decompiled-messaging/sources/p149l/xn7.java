package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.p053ui.emoji.CoreCommendHintEmojiView;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class xn7 {
    /* JADX INFO: renamed from: a */
    public static void m210153a(CoreCommendHintEmojiView coreCommendHintEmojiView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        coreCommendHintEmojiView.f29083a = (RelativeLayout) viewGroup.getChildAt(0);
        coreCommendHintEmojiView.f29084b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coreCommendHintEmojiView.f29085c = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        coreCommendHintEmojiView.f29086d = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        coreCommendHintEmojiView.f29087e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        coreCommendHintEmojiView.f29088f = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }
}
