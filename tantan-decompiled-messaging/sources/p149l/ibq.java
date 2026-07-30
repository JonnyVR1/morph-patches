package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemPicCertGuide;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ibq {
    /* JADX INFO: renamed from: a */
    public static void m135267a(ItemPicCertGuide itemPicCertGuide, View view) {
        itemPicCertGuide.f31359a = (ItemPicCertGuide) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemPicCertGuide.f31360b = (ConstraintLayout) viewGroup.getChildAt(0);
        itemPicCertGuide.f31361c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemPicCertGuide.f31362d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemPicCertGuide.f31363e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemPicCertGuide.f31364f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}
