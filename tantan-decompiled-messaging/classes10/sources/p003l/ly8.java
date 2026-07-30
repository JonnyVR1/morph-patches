package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.group.CoreGroupChatHeaderView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ly8 {
    /* JADX INFO: renamed from: a */
    public static void m7929a(CoreGroupChatHeaderView coreGroupChatHeaderView, View view) {
        coreGroupChatHeaderView.a = (CoreGroupChatHeaderView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        coreGroupChatHeaderView.b = viewGroup.getChildAt(0);
        coreGroupChatHeaderView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coreGroupChatHeaderView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        coreGroupChatHeaderView.e = viewGroup.getChildAt(1);
        coreGroupChatHeaderView.f = viewGroup.getChildAt(2);
        coreGroupChatHeaderView.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        coreGroupChatHeaderView.h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
