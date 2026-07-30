package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.FollowActionPopupView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class mwi {
    /* JADX INFO: renamed from: a */
    public static void m160552a(FollowActionPopupView followActionPopupView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        followActionPopupView.f41741a = (ImageView) viewGroup.getChildAt(1);
        followActionPopupView.f41742b = (VFrame) viewGroup.getChildAt(2);
        followActionPopupView.f41743c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        followActionPopupView.f41744d = (TextView) viewGroup.getChildAt(3);
        followActionPopupView.f41745e = (TextView) viewGroup.getChildAt(4);
        followActionPopupView.f41746f = (VButton) viewGroup.getChildAt(5);
    }
}
