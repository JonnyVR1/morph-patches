package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.FakeLikersItem;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class i0g {
    /* JADX INFO: renamed from: a */
    public static void m137971a(FakeLikersItem fakeLikersItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fakeLikersItem.f36630h = (VDraweeView) viewGroup.getChildAt(0);
        fakeLikersItem.f36631i = (VText) viewGroup.getChildAt(2);
        fakeLikersItem.f36632j = (FrameLayout) viewGroup.getChildAt(3);
        fakeLikersItem.f36633k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        fakeLikersItem.f36634l = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        fakeLikersItem.f36635m = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
