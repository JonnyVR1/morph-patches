package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegeShowcaseWrapper;
import p151v.VIcon;
import p151v.VMarqueeText;

/* JADX INFO: loaded from: classes10.dex */
public class v3p {
    /* JADX INFO: renamed from: a */
    public static void m199292a(IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlPrivilegeShowcaseWrapper.f38788a = (RelativeLayout) viewGroup.getChildAt(0);
        intlPrivilegeShowcaseWrapper.f38789b = (VMarqueeText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlPrivilegeShowcaseWrapper.f38790c = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
