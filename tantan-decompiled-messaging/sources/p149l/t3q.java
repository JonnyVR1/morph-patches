package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.gift.message.ItemGiftMessageLeft;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t3q {
    /* JADX INFO: renamed from: a */
    public static void m187116a(ItemGiftMessageLeft itemGiftMessageLeft, View view) {
        itemGiftMessageLeft.f29216b = (ItemGiftMessageLeft) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemGiftMessageLeft.f29217c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        itemGiftMessageLeft.f29218d = (VText_Bold) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemGiftMessageLeft.f29219e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
    }
}
