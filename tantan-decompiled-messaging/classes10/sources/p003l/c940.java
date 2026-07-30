package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.anim.view.NewQuickChatAudioReformBubbleView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class c940 {
    /* JADX INFO: renamed from: a */
    public static void m5871a(NewQuickChatAudioReformBubbleView newQuickChatAudioReformBubbleView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newQuickChatAudioReformBubbleView.f = viewGroup.getChildAt(0);
        newQuickChatAudioReformBubbleView.g = (TextView) viewGroup.getChildAt(1);
        newQuickChatAudioReformBubbleView.h = viewGroup.getChildAt(2);
        newQuickChatAudioReformBubbleView.i = viewGroup.getChildAt(3);
        newQuickChatAudioReformBubbleView.j = viewGroup.getChildAt(5);
        newQuickChatAudioReformBubbleView.k = (ImageView) viewGroup.getChildAt(6);
        newQuickChatAudioReformBubbleView.l = (TextView) viewGroup.getChildAt(7);
        newQuickChatAudioReformBubbleView.m = (TextView) viewGroup.getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m5872b(NewQuickChatAudioReformBubbleView newQuickChatAudioReformBubbleView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.xb, viewGroup, true);
        m5871a(newQuickChatAudioReformBubbleView, viewInflate);
        return viewInflate;
    }
}
