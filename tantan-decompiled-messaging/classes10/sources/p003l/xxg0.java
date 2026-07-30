package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.home.virtualcard.SuperLikeOrUndoGuideCardView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xxg0 {
    /* JADX INFO: renamed from: a */
    public static void m10998a(SuperLikeOrUndoGuideCardView superLikeOrUndoGuideCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        superLikeOrUndoGuideCardView._card_bg = viewGroup.getChildAt(0);
        superLikeOrUndoGuideCardView._stage_view = viewGroup.getChildAt(1);
        superLikeOrUndoGuideCardView._icon = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        superLikeOrUndoGuideCardView._guide_title = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        superLikeOrUndoGuideCardView._guide_desc = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        superLikeOrUndoGuideCardView._button = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }
}
