package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioHeaderView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class osb0 {
    /* JADX INFO: renamed from: a */
    public static void m8585a(QuickChatAudioHeaderView quickChatAudioHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickChatAudioHeaderView.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        quickChatAudioHeaderView.i = viewGroup.getChildAt(1);
        quickChatAudioHeaderView.j = viewGroup.getChildAt(2);
        quickChatAudioHeaderView.k = viewGroup.getChildAt(3);
        quickChatAudioHeaderView.l = viewGroup.getChildAt(4);
        quickChatAudioHeaderView.m = (FrameLayout) viewGroup.getChildAt(5);
        quickChatAudioHeaderView.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0);
        quickChatAudioHeaderView.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(1);
        quickChatAudioHeaderView.p = viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m8586b(QuickChatAudioHeaderView quickChatAudioHeaderView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.mb, viewGroup, true);
        m8585a(quickChatAudioHeaderView, viewInflate);
        return viewInflate;
    }
}
