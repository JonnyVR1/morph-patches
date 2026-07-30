package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.quickaudio.newquickchat.secondfloor.item.QuickChatLoftChatItem;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hvb0 {
    /* JADX INFO: renamed from: a */
    public static void m7081a(QuickChatLoftChatItem quickChatLoftChatItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickChatLoftChatItem.a = viewGroup.getChildAt(0);
        quickChatLoftChatItem.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        quickChatLoftChatItem.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        quickChatLoftChatItem.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        quickChatLoftChatItem.e = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        quickChatLoftChatItem.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        quickChatLoftChatItem.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        quickChatLoftChatItem.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        quickChatLoftChatItem.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m7082b(QuickChatLoftChatItem quickChatLoftChatItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.De, viewGroup, true);
        m7081a(quickChatLoftChatItem, viewInflate);
        return viewInflate;
    }
}
