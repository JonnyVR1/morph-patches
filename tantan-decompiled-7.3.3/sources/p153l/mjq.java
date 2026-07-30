package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemUnderstandShare;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class mjq {
    /* JADX INFO: renamed from: a */
    public static void m158596a(ItemUnderstandShare itemUnderstandShare, View view) {
        itemUnderstandShare.f32374a = (ItemUnderstandShare) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemUnderstandShare.f32375b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemUnderstandShare.f32376c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemUnderstandShare.f32377d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        itemUnderstandShare.f32378e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        itemUnderstandShare.f32379f = (TextView) viewGroup.getChildAt(1);
        itemUnderstandShare.f32380g = (TextView) viewGroup.getChildAt(2);
    }
}
