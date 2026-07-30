package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.home.view.MarryAdCardView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class hyw {
    /* JADX INFO: renamed from: a */
    public static void m137784a(MarryAdCardView marryAdCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        marryAdCardView.f30565a = (VDraweeView) viewGroup.getChildAt(0);
        marryAdCardView.f30566b = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        marryAdCardView.f30567c = (VText_Bold) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(3);
        marryAdCardView.f30568d = (VText_Bold) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(4);
        marryAdCardView.f30569e = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
