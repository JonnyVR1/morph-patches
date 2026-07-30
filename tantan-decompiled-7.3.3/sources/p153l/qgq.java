package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemSwitchPic;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class qgq {
    /* JADX INFO: renamed from: a */
    public static void m176502a(ItemSwitchPic itemSwitchPic, View view) {
        itemSwitchPic.f32339a = (ItemSwitchPic) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemSwitchPic.f32340b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemSwitchPic.f32341c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemSwitchPic.f32342d = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemSwitchPic.f32343e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemSwitchPic.f32344f = (TextView) viewGroup.getChildAt(1);
    }
}
