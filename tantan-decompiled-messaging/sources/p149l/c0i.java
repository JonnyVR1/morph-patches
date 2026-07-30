package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedSquareBottomStickoutView;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedSquareVoiceItem;
import com.p046p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class c0i {
    /* JADX INFO: renamed from: a */
    public static void m104752a(FeedSquareVoiceItem feedSquareVoiceItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedSquareVoiceItem.f42802d = (FeedSquareBottomStickoutView) viewGroup.getChildAt(0);
        feedSquareVoiceItem.f42803e = (ConstraintLayout) viewGroup.getChildAt(1);
        feedSquareVoiceItem.f42804f = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedSquareVoiceItem.f42805g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedSquareVoiceItem.f42806h = (FeedUserHeaderView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        feedSquareVoiceItem.f42807i = (Space) viewGroup.getChildAt(2);
    }
}
