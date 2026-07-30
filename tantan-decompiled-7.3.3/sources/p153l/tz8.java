package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.group.CoreGroupChatHeaderView;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tz8 {
    /* JADX INFO: renamed from: a */
    public static void m193651a(CoreGroupChatHeaderView coreGroupChatHeaderView, View view) {
        coreGroupChatHeaderView.f22284a = (CoreGroupChatHeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreGroupChatHeaderView.f22285b = (VRelative) viewGroup.getChildAt(0);
        coreGroupChatHeaderView.f22286c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coreGroupChatHeaderView.f22287d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        coreGroupChatHeaderView.f22288e = (VLinear) viewGroup.getChildAt(1);
        coreGroupChatHeaderView.f22289f = (VRelative) viewGroup.getChildAt(2);
        coreGroupChatHeaderView.f22290g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        coreGroupChatHeaderView.f22291h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
