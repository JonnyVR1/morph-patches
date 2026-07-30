package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemLocalUXQuestionnaire;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t7q {
    /* JADX INFO: renamed from: a */
    public static void m189629a(ItemLocalUXQuestionnaire itemLocalUXQuestionnaire, View view) {
        itemLocalUXQuestionnaire.f31931a = (ItemLocalUXQuestionnaire) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemLocalUXQuestionnaire.f31932b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        itemLocalUXQuestionnaire.f31933c = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
