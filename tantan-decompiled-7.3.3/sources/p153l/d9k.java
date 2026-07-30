package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;

/* JADX INFO: loaded from: classes4.dex */
public class d9k {
    /* JADX INFO: renamed from: a */
    public static void m115080a(c9k c9kVar, View view) {
        c9kVar.f80493k = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c9kVar.f80494l = viewGroup.getChildAt(0);
        c9kVar.f80495m = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        c9kVar.f80496n = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        c9kVar.f80497o = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        c9kVar.f80498p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        c9kVar.f80499q = (CommonMaskAvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        c9kVar.f80500r = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
        c9kVar.f80501s = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(3);
        c9kVar.f80502t = (CommonMaskAvatarView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(4);
    }
}
