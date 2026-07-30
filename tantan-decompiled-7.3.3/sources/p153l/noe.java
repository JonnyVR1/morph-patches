package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import com.p051p1.mobile.putong.core.p058ui.profile.views.EditProfileItemTextView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class noe {
    /* JADX INFO: renamed from: a */
    public static void m164115a(EditProfileItemTextView editProfileItemTextView, View view) {
        editProfileItemTextView.f34954c = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        editProfileItemTextView.f34955d = (VText_Default_Bold) viewGroup.getChildAt(0);
        editProfileItemTextView.f34956e = (VImage) viewGroup.getChildAt(1);
        editProfileItemTextView.f34957f = (VImage) viewGroup.getChildAt(2);
        editProfileItemTextView.f34958g = (VText) viewGroup.getChildAt(3);
        editProfileItemTextView.f34959h = (VImage) viewGroup.getChildAt(4);
    }
}
