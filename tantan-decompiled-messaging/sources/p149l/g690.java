package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.PrivilegeODiamondCard;
import com.tantan.library.svga.SVGAnimationView;

/* JADX INFO: loaded from: classes10.dex */
public class g690 {
    /* JADX INFO: renamed from: a */
    public static void m124552a(PrivilegeODiamondCard privilegeODiamondCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeODiamondCard._background = viewGroup.getChildAt(0);
        privilegeODiamondCard._background_svga = (SVGAnimationView) viewGroup.getChildAt(1);
        privilegeODiamondCard._icon = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        privilegeODiamondCard._title = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        privilegeODiamondCard._subtitle = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
