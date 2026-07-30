package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import l.mvm;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class nvm {
    /* JADX INFO: renamed from: a */
    public static void m8374a(mvm mvmVar, View view) {
        mvmVar.a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mvmVar.b = (FrameLayout) viewGroup.getChildAt(0);
        mvmVar.c = (LinearLayout) viewGroup.getChildAt(1);
        mvmVar.d = (LinearLayout) viewGroup.getChildAt(2);
    }
}
