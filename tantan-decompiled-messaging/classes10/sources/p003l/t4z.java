package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.messages.MessageHalfPageComposerAct;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class t4z {
    /* JADX INFO: renamed from: a */
    public static void m9540a(MessageHalfPageComposerAct messageHalfPageComposerAct, View view) {
        messageHalfPageComposerAct.c = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        messageHalfPageComposerAct.d = (LinearLayout) viewGroup.getChildAt(0);
        messageHalfPageComposerAct.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageHalfPageComposerAct.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        messageHalfPageComposerAct.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9541b(MessageHalfPageComposerAct messageHalfPageComposerAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5780C1, viewGroup, false);
        m9540a(messageHalfPageComposerAct, viewInflate);
        return viewInflate;
    }
}
