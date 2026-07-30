package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.messages.ItemSwitchPic;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qeq {
    /* JADX INFO: renamed from: a */
    public static void m8982a(ItemSwitchPic itemSwitchPic, View view) {
        itemSwitchPic.a = (ItemSwitchPic) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemSwitchPic.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemSwitchPic.c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemSwitchPic.d = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemSwitchPic.e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemSwitchPic.f = (TextView) viewGroup.getChildAt(1);
    }
}
