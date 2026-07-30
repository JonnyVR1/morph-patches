package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageHalfPageComposerAct;
import com.p046p1.mobile.putong.core.p053ui.messages.emoji.VEditTextEmojiCompat;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageInputEditRootLayout;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t4z {
    /* JADX INFO: renamed from: a */
    public static void m187231a(MessageHalfPageComposerAct messageHalfPageComposerAct, View view) {
        messageHalfPageComposerAct.f31608c = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageHalfPageComposerAct.f31609d = (LinearLayout) viewGroup.getChildAt(0);
        messageHalfPageComposerAct.f31610e = (MessageInputEditRootLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageHalfPageComposerAct.f31611f = (VEditTextEmojiCompat) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        messageHalfPageComposerAct.f31612g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m187232b(MessageHalfPageComposerAct messageHalfPageComposerAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126271C1, viewGroup, false);
        m187231a(messageHalfPageComposerAct, viewInflate);
        return viewInflate;
    }
}
