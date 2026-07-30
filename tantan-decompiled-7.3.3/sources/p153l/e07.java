package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import com.p051p1.mobile.putong.core.p058ui.verification.remind.result.CoreAvatarVerificationFailLayout;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class e07 {
    /* JADX INFO: renamed from: a */
    public static void m118787a(CoreAvatarVerificationFailLayout coreAvatarVerificationFailLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        coreAvatarVerificationFailLayout.f37534c = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        coreAvatarVerificationFailLayout.f37535d = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        coreAvatarVerificationFailLayout.f37536e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        coreAvatarVerificationFailLayout.f37537f = (VText_Default_Bold) viewGroup.getChildAt(1);
    }
}
