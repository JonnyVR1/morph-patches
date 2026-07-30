package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.anim.view.NewQuickChatAudioHeaderUserView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class m840 {
    /* JADX INFO: renamed from: a */
    public static void m8001a(NewQuickChatAudioHeaderUserView newQuickChatAudioHeaderUserView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newQuickChatAudioHeaderUserView.f = (TextView) viewGroup.getChildAt(0);
        newQuickChatAudioHeaderUserView.g = viewGroup.getChildAt(1);
        newQuickChatAudioHeaderUserView.h = viewGroup.getChildAt(3);
        newQuickChatAudioHeaderUserView.i = viewGroup.getChildAt(4);
        newQuickChatAudioHeaderUserView.j = viewGroup.getChildAt(5);
        newQuickChatAudioHeaderUserView.k = viewGroup.getChildAt(6);
        newQuickChatAudioHeaderUserView.l = viewGroup.getChildAt(7);
        newQuickChatAudioHeaderUserView.m = viewGroup.getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m8002b(NewQuickChatAudioHeaderUserView newQuickChatAudioHeaderUserView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.vb, viewGroup, true);
        m8001a(newQuickChatAudioHeaderUserView, viewInflate);
        return viewInflate;
    }
}
