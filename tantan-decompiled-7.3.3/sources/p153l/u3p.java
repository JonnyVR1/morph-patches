package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeShowcaseWrapper;
import p151v.VIcon;
import p151v.VMarqueeText;

/* JADX INFO: loaded from: classes10.dex */
public class u3p {
    /* JADX INFO: renamed from: a */
    public static void m194377a(IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeShowcaseWrapper.f38045a = (RelativeLayout) viewGroup.getChildAt(0);
        intlPrivilegeShowcaseWrapper.f38046b = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlPrivilegeShowcaseWrapper.f38047c = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
