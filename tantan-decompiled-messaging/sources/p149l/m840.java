package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.NewQuickChatAudioHeaderUserView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class m840 {
    /* JADX INFO: renamed from: a */
    public static void m153449a(NewQuickChatAudioHeaderUserView newQuickChatAudioHeaderUserView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newQuickChatAudioHeaderUserView._mark = (TextView) viewGroup.getChildAt(0);
        newQuickChatAudioHeaderUserView._profile_user = (VDraweeView) viewGroup.getChildAt(1);
        newQuickChatAudioHeaderUserView._name = (VText) viewGroup.getChildAt(3);
        newQuickChatAudioHeaderUserView._avatar_icon = (VImage) viewGroup.getChildAt(4);
        newQuickChatAudioHeaderUserView._age = (VText) viewGroup.getChildAt(5);
        newQuickChatAudioHeaderUserView._say_hi = (VText) viewGroup.getChildAt(6);
        newQuickChatAudioHeaderUserView._gotochat = (VText) viewGroup.getChildAt(7);
        newQuickChatAudioHeaderUserView._close = (VImage) viewGroup.getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m153450b(NewQuickChatAudioHeaderUserView newQuickChatAudioHeaderUserView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96050vb, viewGroup, true);
        m153449a(newQuickChatAudioHeaderUserView, viewInflate);
        return viewInflate;
    }
}
