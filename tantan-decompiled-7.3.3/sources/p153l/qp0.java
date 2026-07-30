package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import com.p051p1.mobile.putong.core.p058ui.animalfacial.AnimalFacialCardView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qp0 {
    /* JADX INFO: renamed from: a */
    public static void m177389a(AnimalFacialCardView animalFacialCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        animalFacialCardView._image = (VDraweeView) viewGroup.getChildAt(0);
        animalFacialCardView._title = (VText) viewGroup.getChildAt(1);
        animalFacialCardView._desc = (VText_Default_Bold) viewGroup.getChildAt(2);
    }
}
