package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.gift.act.GiftWallOptItemVIew;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class m1k {
    /* JADX INFO: renamed from: a */
    public static void m156697a(GiftWallOptItemVIew giftWallOptItemVIew, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftWallOptItemVIew.f30037a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        giftWallOptItemVIew.f30038b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        giftWallOptItemVIew.f30039c = (VText) viewGroup.getChildAt(1);
    }
}
