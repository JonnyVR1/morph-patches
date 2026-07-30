package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.PrivilegeUnLimitLikeView;
import p151v.AutoVDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class zj90 {
    /* JADX INFO: renamed from: a */
    public static void m219968a(PrivilegeUnLimitLikeView privilegeUnLimitLikeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeUnLimitLikeView.f35956a = (FrameLayout) viewGroup.getChildAt(0);
        privilegeUnLimitLikeView.f35957b = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeUnLimitLikeView.f35958c = (AutoVDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeUnLimitLikeView.f35959d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeUnLimitLikeView.f35960e = (VImage) viewGroup.getChildAt(1);
    }
}
