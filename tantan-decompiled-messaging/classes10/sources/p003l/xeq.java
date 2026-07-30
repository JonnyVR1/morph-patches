package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ItemTantanTeamAnswer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xeq {
    /* JADX INFO: renamed from: a */
    public static void m10792a(ItemTantanTeamAnswer itemTantanTeamAnswer, View view) {
        itemTantanTeamAnswer.c = (ItemTantanTeamAnswer) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemTantanTeamAnswer.d = viewGroup.getChildAt(0);
        itemTantanTeamAnswer.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemTantanTeamAnswer.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
