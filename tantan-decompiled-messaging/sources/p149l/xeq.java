package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemTantanTeamAnswer;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemText;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class xeq {
    /* JADX INFO: renamed from: a */
    public static void m208587a(ItemTantanTeamAnswer itemTantanTeamAnswer, View view) {
        itemTantanTeamAnswer.f31507c = (ItemTantanTeamAnswer) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemTantanTeamAnswer.f31508d = (ItemText) viewGroup.getChildAt(0);
        itemTantanTeamAnswer.f31509e = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemTantanTeamAnswer.f31510f = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
