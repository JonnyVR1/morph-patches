package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.quickaudio.newquickchat.secondfloor.item.QuickChatPageItem;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wwb0 {
    /* JADX INFO: renamed from: a */
    public static void m10592a(QuickChatPageItem quickChatPageItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickChatPageItem.a = viewGroup.getChildAt(0);
        quickChatPageItem.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        quickChatPageItem.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        quickChatPageItem.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        quickChatPageItem.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        quickChatPageItem.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        quickChatPageItem.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        quickChatPageItem.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        quickChatPageItem.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m10593b(QuickChatPageItem quickChatPageItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Ee, viewGroup, true);
        m10592a(quickChatPageItem, viewInflate);
        return viewInflate;
    }
}
