package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegeShowcaseWrapper;
import p147v.VIcon;
import p147v.VMarqueeText;

/* JADX INFO: loaded from: classes10.dex */
public class v1p {
    /* JADX INFO: renamed from: a */
    public static void m196649a(IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeShowcaseWrapper.f37940a = (RelativeLayout) viewGroup.getChildAt(0);
        intlPrivilegeShowcaseWrapper.f37941b = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlPrivilegeShowcaseWrapper.f37942c = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
