package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import com.p046p1.mobile.putong.core.p053ui.profile.views.EditProfileItemTextView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jne {
    /* JADX INFO: renamed from: a */
    public static void m142376a(EditProfileItemTextView editProfileItemTextView, View view) {
        editProfileItemTextView.f34106c = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        editProfileItemTextView.f34107d = (VText_Default_Bold) viewGroup.getChildAt(0);
        editProfileItemTextView.f34108e = (VImage) viewGroup.getChildAt(1);
        editProfileItemTextView.f34109f = (VImage) viewGroup.getChildAt(2);
        editProfileItemTextView.f34110g = (VText) viewGroup.getChildAt(3);
        editProfileItemTextView.f34111h = (VImage) viewGroup.getChildAt(4);
    }
}
