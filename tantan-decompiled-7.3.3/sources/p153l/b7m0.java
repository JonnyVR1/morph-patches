package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.virtual.userCard.dressup.VirtualUserDressUpItemView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class b7m0 {
    /* JADX INFO: renamed from: a */
    public static void m102848a(VirtualUserDressUpItemView virtualUserDressUpItemView, View view) {
        virtualUserDressUpItemView.f53639a = (VirtualUserDressUpItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        virtualUserDressUpItemView.f53640b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        virtualUserDressUpItemView.f53641c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        virtualUserDressUpItemView.f53642d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        virtualUserDressUpItemView.f53643e = (TextView) viewGroup.getChildAt(2);
    }
}
