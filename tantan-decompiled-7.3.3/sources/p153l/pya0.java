package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.p051p1.mobile.putong.core.newui.profile.newme.ProfilePrivilegePayGuide;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pya0 {
    /* JADX INFO: renamed from: a */
    public static void m174274a(ProfilePrivilegePayGuide profilePrivilegePayGuide, View view) {
        profilePrivilegePayGuide._container = (ProfilePrivilegePayGuide) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profilePrivilegePayGuide._privilege_icon = (VDraweeView) viewGroup.getChildAt(0);
        profilePrivilegePayGuide._title = (VText) viewGroup.getChildAt(1);
        profilePrivilegePayGuide._desc = (AppCompatTextView) viewGroup.getChildAt(2);
        profilePrivilegePayGuide._buy = (VText) viewGroup.getChildAt(3);
    }
}
