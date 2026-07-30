package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemUnderstandShare;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class mhq {
    /* JADX INFO: renamed from: a */
    public static void m154631a(ItemUnderstandShare itemUnderstandShare, View view) {
        itemUnderstandShare.f31526a = (ItemUnderstandShare) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemUnderstandShare.f31527b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemUnderstandShare.f31528c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemUnderstandShare.f31529d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        itemUnderstandShare.f31530e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        itemUnderstandShare.f31531f = (TextView) viewGroup.getChildAt(1);
        itemUnderstandShare.f31532g = (TextView) viewGroup.getChildAt(2);
    }
}
