package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.view.MessageLoveLetterGuideView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class s6z {
    /* JADX INFO: renamed from: a */
    public static void m9242a(MessageLoveLetterGuideView messageLoveLetterGuideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        messageLoveLetterGuideView.a = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        messageLoveLetterGuideView.b = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        messageLoveLetterGuideView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
