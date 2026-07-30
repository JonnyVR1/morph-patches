package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersNewLikersItem;
import p147v.VDraweeView;
import p147v.VIcon;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cfo {
    /* JADX INFO: renamed from: a */
    public static void m106596a(IntlMeetLikersNewLikersItem intlMeetLikersNewLikersItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlMeetLikersNewLikersItem.f24251c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlMeetLikersNewLikersItem.f24252d = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlMeetLikersNewLikersItem.f24253e = (VText) viewGroup.getChildAt(1);
    }
}
