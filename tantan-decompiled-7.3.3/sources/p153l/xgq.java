package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemTantanTeamAnswer;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemText;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class xgq {
    /* JADX INFO: renamed from: a */
    public static void m210934a(ItemTantanTeamAnswer itemTantanTeamAnswer, View view) {
        itemTantanTeamAnswer.f32355c = (ItemTantanTeamAnswer) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemTantanTeamAnswer.f32356d = (ItemText) viewGroup.getChildAt(0);
        itemTantanTeamAnswer.f32357e = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemTantanTeamAnswer.f32358f = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
