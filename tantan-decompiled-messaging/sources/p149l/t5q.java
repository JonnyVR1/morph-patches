package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemLocalUXQuestionnaire;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t5q {
    /* JADX INFO: renamed from: a */
    public static void m187338a(ItemLocalUXQuestionnaire itemLocalUXQuestionnaire, View view) {
        itemLocalUXQuestionnaire.f31083a = (ItemLocalUXQuestionnaire) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemLocalUXQuestionnaire.f31084b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        itemLocalUXQuestionnaire.f31085c = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
