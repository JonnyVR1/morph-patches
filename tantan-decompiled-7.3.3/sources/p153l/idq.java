package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemPicCertGuide;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class idq {
    /* JADX INFO: renamed from: a */
    public static void m139540a(ItemPicCertGuide itemPicCertGuide, View view) {
        itemPicCertGuide.f32207a = (ItemPicCertGuide) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemPicCertGuide.f32208b = (ConstraintLayout) viewGroup.getChildAt(0);
        itemPicCertGuide.f32209c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemPicCertGuide.f32210d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemPicCertGuide.f32211e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemPicCertGuide.f32212f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}
