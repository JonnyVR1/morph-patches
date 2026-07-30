package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ItemLocalUXQuestionnaire;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class t5q {
    /* JADX INFO: renamed from: a */
    public static void m9544a(ItemLocalUXQuestionnaire itemLocalUXQuestionnaire, View view) {
        itemLocalUXQuestionnaire.a = (ItemLocalUXQuestionnaire) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemLocalUXQuestionnaire.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        itemLocalUXQuestionnaire.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
