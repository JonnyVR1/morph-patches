package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.ui.vip.likers.LikersNewLikeBubble;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qjr {
    /* JADX INFO: renamed from: a */
    public static void m9009a(LikersNewLikeBubble likersNewLikeBubble, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likersNewLikeBubble.a = (RelativeLayout) viewGroup.getChildAt(0);
        likersNewLikeBubble.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        likersNewLikeBubble.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        likersNewLikeBubble.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
