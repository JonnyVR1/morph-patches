package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import com.p046p1.mobile.putong.core.p053ui.animalfacial.AnimalFacialCardView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class up0 {
    /* JADX INFO: renamed from: a */
    public static void m194582a(AnimalFacialCardView animalFacialCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        animalFacialCardView._image = (VDraweeView) viewGroup.getChildAt(0);
        animalFacialCardView._title = (VText) viewGroup.getChildAt(1);
        animalFacialCardView._desc = (VText_Default_Bold) viewGroup.getChildAt(2);
    }
}
