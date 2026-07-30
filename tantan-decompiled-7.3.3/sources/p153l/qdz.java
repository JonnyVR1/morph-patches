package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageHalfPageComposerAct;
import com.p051p1.mobile.putong.core.p058ui.messages.emoji.VEditTextEmojiCompat;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageInputEditRootLayout;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qdz {
    /* JADX INFO: renamed from: a */
    public static void m176213a(MessageHalfPageComposerAct messageHalfPageComposerAct, View view) {
        messageHalfPageComposerAct.f32456c = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageHalfPageComposerAct.f32457d = (LinearLayout) viewGroup.getChildAt(0);
        messageHalfPageComposerAct.f32458e = (MessageInputEditRootLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageHalfPageComposerAct.f32459f = (VEditTextEmojiCompat) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        messageHalfPageComposerAct.f32460g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m176214b(MessageHalfPageComposerAct messageHalfPageComposerAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f156827C1, viewGroup, false);
        m176213a(messageHalfPageComposerAct, viewInflate);
        return viewInflate;
    }
}
