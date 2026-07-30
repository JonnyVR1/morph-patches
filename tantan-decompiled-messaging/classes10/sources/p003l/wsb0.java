package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioNewUiHeaderUserView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wsb0 {
    /* JADX INFO: renamed from: a */
    public static void m10541a(QuickChatAudioNewUiHeaderUserView quickChatAudioNewUiHeaderUserView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickChatAudioNewUiHeaderUserView.f = (TextView) viewGroup.getChildAt(0);
        quickChatAudioNewUiHeaderUserView.g = viewGroup.getChildAt(1);
        quickChatAudioNewUiHeaderUserView.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        quickChatAudioNewUiHeaderUserView.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        quickChatAudioNewUiHeaderUserView.j = (LinearLayout) viewGroup.getChildAt(2);
        quickChatAudioNewUiHeaderUserView.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        quickChatAudioNewUiHeaderUserView.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        quickChatAudioNewUiHeaderUserView.m = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        quickChatAudioNewUiHeaderUserView.n = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        quickChatAudioNewUiHeaderUserView.o = viewGroup.getChildAt(3);
        quickChatAudioNewUiHeaderUserView.p = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m10542b(QuickChatAudioNewUiHeaderUserView quickChatAudioNewUiHeaderUserView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.ob, viewGroup, true);
        m10541a(quickChatAudioNewUiHeaderUserView, viewInflate);
        return viewInflate;
    }
}
