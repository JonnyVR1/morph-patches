package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import com.p046p1.mobile.putong.core.p053ui.verification.remind.result.CoreAvatarVerificationFailLayout;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bz6 {
    /* JADX INFO: renamed from: a */
    public static void m104560a(CoreAvatarVerificationFailLayout coreAvatarVerificationFailLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        coreAvatarVerificationFailLayout.f36686c = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        coreAvatarVerificationFailLayout.f36687d = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        coreAvatarVerificationFailLayout.f36688e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        coreAvatarVerificationFailLayout.f36689f = (VText_Default_Bold) viewGroup.getChildAt(1);
    }
}
