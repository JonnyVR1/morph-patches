package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.p058ui.result.VipContentItemView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class rpl0 {
    /* JADX INFO: renamed from: a */
    public static void m182533a(VipContentItemView vipContentItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vipContentItemView.f36529a = (ImageView) viewGroup.getChildAt(0);
        vipContentItemView.f36530b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        vipContentItemView.f36531c = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        vipContentItemView.f36532d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vipContentItemView.f36533e = (ImageView) viewGroup.getChildAt(2);
    }
}
