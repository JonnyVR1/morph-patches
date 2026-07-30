package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioNewUiHeaderUserPeiLiaoView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ssb0 {
    /* JADX INFO: renamed from: a */
    public static void m9478a(QuickChatAudioNewUiHeaderUserPeiLiaoView quickChatAudioNewUiHeaderUserPeiLiaoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickChatAudioNewUiHeaderUserPeiLiaoView.d = (ImageView) viewGroup.getChildAt(0);
        quickChatAudioNewUiHeaderUserPeiLiaoView.e = (TextView) viewGroup.getChildAt(1);
        quickChatAudioNewUiHeaderUserPeiLiaoView.f = viewGroup.getChildAt(2);
        quickChatAudioNewUiHeaderUserPeiLiaoView.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        quickChatAudioNewUiHeaderUserPeiLiaoView.h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        quickChatAudioNewUiHeaderUserPeiLiaoView.i = (LinearLayout) viewGroup.getChildAt(3);
        quickChatAudioNewUiHeaderUserPeiLiaoView.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        quickChatAudioNewUiHeaderUserPeiLiaoView.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        quickChatAudioNewUiHeaderUserPeiLiaoView.l = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        quickChatAudioNewUiHeaderUserPeiLiaoView.m = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        quickChatAudioNewUiHeaderUserPeiLiaoView.n = viewGroup.getChildAt(4);
        quickChatAudioNewUiHeaderUserPeiLiaoView.o = viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m9479b(QuickChatAudioNewUiHeaderUserPeiLiaoView quickChatAudioNewUiHeaderUserPeiLiaoView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.pb, viewGroup, true);
        m9478a(quickChatAudioNewUiHeaderUserPeiLiaoView, viewInflate);
        return viewInflate;
    }
}
