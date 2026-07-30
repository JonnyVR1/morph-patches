package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.NewQuickChatAudioReformBubbleView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qh40 {
    /* JADX INFO: renamed from: a */
    public static void m176529a(NewQuickChatAudioReformBubbleView newQuickChatAudioReformBubbleView, View view) {
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
    public static View m176530b(NewQuickChatAudioReformBubbleView newQuickChatAudioReformBubbleView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125395Eb, viewGroup, true);
        m176529a(newQuickChatAudioReformBubbleView, viewInflate);
        return viewInflate;
    }
}
