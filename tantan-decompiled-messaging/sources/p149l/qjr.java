package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersNewLikeBubble;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class qjr {
    /* JADX INFO: renamed from: a */
    public static void m175034a(LikersNewLikeBubble likersNewLikeBubble, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likersNewLikeBubble.f37317a = (RelativeLayout) viewGroup.getChildAt(0);
        likersNewLikeBubble.f37318b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        likersNewLikeBubble.f37319c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        likersNewLikeBubble.f37320d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
