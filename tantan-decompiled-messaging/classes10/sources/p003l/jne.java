package p003l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.ui.profile.views.EditProfileItemTextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jne {
    /* JADX INFO: renamed from: a */
    public static void m7433a(EditProfileItemTextView editProfileItemTextView, View view) {
        editProfileItemTextView.c = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        editProfileItemTextView.d = viewGroup.getChildAt(0);
        editProfileItemTextView.e = viewGroup.getChildAt(1);
        editProfileItemTextView.f = viewGroup.getChildAt(2);
        editProfileItemTextView.g = viewGroup.getChildAt(3);
        editProfileItemTextView.h = viewGroup.getChildAt(4);
    }
}
