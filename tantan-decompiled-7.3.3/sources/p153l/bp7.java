package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.p058ui.emoji.CoreCommendHintEmojiView;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class bp7 {
    /* JADX INFO: renamed from: a */
    public static void m105788a(CoreCommendHintEmojiView coreCommendHintEmojiView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        coreCommendHintEmojiView.f29931a = (RelativeLayout) viewGroup.getChildAt(0);
        coreCommendHintEmojiView.f29932b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coreCommendHintEmojiView.f29933c = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        coreCommendHintEmojiView.f29934d = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        coreCommendHintEmojiView.f29935e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        coreCommendHintEmojiView.f29936f = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }
}
