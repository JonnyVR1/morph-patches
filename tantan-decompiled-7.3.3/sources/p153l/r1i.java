package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedSquareBottomStickoutView;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedSquareVoiceItem;
import com.p051p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class r1i {
    /* JADX INFO: renamed from: a */
    public static void m179408a(FeedSquareVoiceItem feedSquareVoiceItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedSquareVoiceItem.f43650d = (FeedSquareBottomStickoutView) viewGroup.getChildAt(0);
        feedSquareVoiceItem.f43651e = (ConstraintLayout) viewGroup.getChildAt(1);
        feedSquareVoiceItem.f43652f = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedSquareVoiceItem.f43653g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedSquareVoiceItem.f43654h = (FeedUserHeaderView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        feedSquareVoiceItem.f43655i = (Space) viewGroup.getChildAt(2);
    }
}
