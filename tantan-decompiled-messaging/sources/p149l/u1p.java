package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeShowcaseWrapper;
import p147v.VIcon;
import p147v.VMarqueeText;

/* JADX INFO: loaded from: classes10.dex */
public class u1p {
    /* JADX INFO: renamed from: a */
    public static void m191428a(IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeShowcaseWrapper.f37197a = (RelativeLayout) viewGroup.getChildAt(0);
        intlPrivilegeShowcaseWrapper.f37198b = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlPrivilegeShowcaseWrapper.f37199c = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
