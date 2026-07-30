package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.group.CoreGroupChatHeaderView;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ly8 {
    /* JADX INFO: renamed from: a */
    public static void m152119a(CoreGroupChatHeaderView coreGroupChatHeaderView, View view) {
        coreGroupChatHeaderView.f21542a = (CoreGroupChatHeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreGroupChatHeaderView.f21543b = (VRelative) viewGroup.getChildAt(0);
        coreGroupChatHeaderView.f21544c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coreGroupChatHeaderView.f21545d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        coreGroupChatHeaderView.f21546e = (VLinear) viewGroup.getChildAt(1);
        coreGroupChatHeaderView.f21547f = (VRelative) viewGroup.getChildAt(2);
        coreGroupChatHeaderView.f21548g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        coreGroupChatHeaderView.f21549h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
