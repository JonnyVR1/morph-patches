package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.NewQuickChatAudioReformBubbleView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class c940 {
    /* JADX INFO: renamed from: a */
    public static void m105838a(NewQuickChatAudioReformBubbleView newQuickChatAudioReformBubbleView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newQuickChatAudioReformBubbleView._bg = (VDraweeView) viewGroup.getChildAt(0);
        newQuickChatAudioReformBubbleView._mark = (TextView) viewGroup.getChildAt(1);
        newQuickChatAudioReformBubbleView._close = (VImage) viewGroup.getChildAt(2);
        newQuickChatAudioReformBubbleView._profile_user = (VDraweeView) viewGroup.getChildAt(3);
        newQuickChatAudioReformBubbleView._name_age_info = (VText) viewGroup.getChildAt(5);
        newQuickChatAudioReformBubbleView._quick_chat_pop_icon = (ImageView) viewGroup.getChildAt(6);
        newQuickChatAudioReformBubbleView._quick_chat_pop_info = (TextView) viewGroup.getChildAt(7);
        newQuickChatAudioReformBubbleView._gotochat = (TextView) viewGroup.getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m105839b(NewQuickChatAudioReformBubbleView newQuickChatAudioReformBubbleView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96084xb, viewGroup, true);
        m105838a(newQuickChatAudioReformBubbleView, viewInflate);
        return viewInflate;
    }
}
