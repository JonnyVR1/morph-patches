package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemSwitchPic;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class qeq {
    /* JADX INFO: renamed from: a */
    public static void m174228a(ItemSwitchPic itemSwitchPic, View view) {
        itemSwitchPic.f31491a = (ItemSwitchPic) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemSwitchPic.f31492b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemSwitchPic.f31493c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemSwitchPic.f31494d = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemSwitchPic.f31495e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemSwitchPic.f31496f = (TextView) viewGroup.getChildAt(1);
    }
}
