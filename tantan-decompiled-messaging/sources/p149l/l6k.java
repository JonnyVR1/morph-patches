package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;

/* JADX INFO: loaded from: classes4.dex */
public class l6k {
    /* JADX INFO: renamed from: a */
    public static void m148751a(k6k k6kVar, View view) {
        k6kVar.f121480k = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        k6kVar.f121481l = viewGroup.getChildAt(0);
        k6kVar.f121482m = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        k6kVar.f121483n = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        k6kVar.f121484o = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        k6kVar.f121485p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        k6kVar.f121486q = (CommonMaskAvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        k6kVar.f121487r = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
        k6kVar.f121488s = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(3);
        k6kVar.f121489t = (CommonMaskAvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(4);
    }
}
