package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.NewQuickChatAudioHeaderUserView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ah40 {
    /* JADX INFO: renamed from: a */
    public static void m97784a(NewQuickChatAudioHeaderUserView newQuickChatAudioHeaderUserView, View view) {
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
    public static View m97785b(NewQuickChatAudioHeaderUserView newQuickChatAudioHeaderUserView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125361Cb, viewGroup, true);
        m97784a(newQuickChatAudioHeaderUserView, viewInflate);
        return viewInflate;
    }
}
