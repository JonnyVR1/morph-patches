package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.gift.act.GiftWallOptItemVIew;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wyj {
    /* JADX INFO: renamed from: a */
    public static void m206110a(GiftWallOptItemVIew giftWallOptItemVIew, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        giftWallOptItemVIew.f29189a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        giftWallOptItemVIew.f29190b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        giftWallOptItemVIew.f29191c = (VText) viewGroup.getChildAt(1);
    }
}
