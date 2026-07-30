package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.meet.likers.items.MeetLikersNewLikersItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class m3y {
    /* JADX INFO: renamed from: a */
    public static void m7953a(MeetLikersNewLikersItem meetLikersNewLikersItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetLikersNewLikersItem.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        meetLikersNewLikersItem.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        meetLikersNewLikersItem.e = viewGroup.getChildAt(1);
    }
}
