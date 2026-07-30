package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.view.MessageMatchTimeLayout;
import p151v.VDraweeView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class xzz {
    /* JADX INFO: renamed from: a */
    public static void m213823a(MessageMatchTimeLayout messageMatchTimeLayout, View view) {
        messageMatchTimeLayout.f37661c = (MessageMatchTimeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageMatchTimeLayout.f37662d = (VLinear) viewGroup.getChildAt(0);
        messageMatchTimeLayout.f37663e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageMatchTimeLayout.f37664f = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        messageMatchTimeLayout.f37665g = (VLinear) viewGroup.getChildAt(1);
        messageMatchTimeLayout.f37666h = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        messageMatchTimeLayout.f37667i = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        messageMatchTimeLayout.f37668j = (VLinear) viewGroup.getChildAt(2);
        messageMatchTimeLayout.f37669k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        messageMatchTimeLayout.f37670l = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        messageMatchTimeLayout.f37671m = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
