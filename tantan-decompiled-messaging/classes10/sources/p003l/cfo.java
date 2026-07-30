package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersNewLikersItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cfo {
    /* JADX INFO: renamed from: a */
    public static void m5944a(IntlMeetLikersNewLikersItem intlMeetLikersNewLikersItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlMeetLikersNewLikersItem.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlMeetLikersNewLikersItem.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlMeetLikersNewLikersItem.e = viewGroup.getChildAt(1);
    }
}
