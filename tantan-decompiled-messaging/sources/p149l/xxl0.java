package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.virtual.userCard.dressup.VirtualUserDressUpItemView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class xxl0 {
    /* JADX INFO: renamed from: a */
    public static void m211511a(VirtualUserDressUpItemView virtualUserDressUpItemView, View view) {
        virtualUserDressUpItemView.f52791a = (VirtualUserDressUpItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        virtualUserDressUpItemView.f52792b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        virtualUserDressUpItemView.f52793c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        virtualUserDressUpItemView.f52794d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        virtualUserDressUpItemView.f52795e = (TextView) viewGroup.getChildAt(2);
    }
}
