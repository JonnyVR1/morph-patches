package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.seepage.likers.FakeLikersItem;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class uyf {
    /* JADX INFO: renamed from: a */
    public static void m196290a(FakeLikersItem fakeLikersItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fakeLikersItem.f35782h = (VDraweeView) viewGroup.getChildAt(0);
        fakeLikersItem.f35783i = (VText) viewGroup.getChildAt(2);
        fakeLikersItem.f35784j = (FrameLayout) viewGroup.getChildAt(3);
        fakeLikersItem.f35785k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        fakeLikersItem.f35786l = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        fakeLikersItem.f35787m = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
