package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersNewLikersItem;
import p151v.VDraweeView;
import p151v.VIcon;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cho {
    /* JADX INFO: renamed from: a */
    public static void m109840a(IntlMeetLikersNewLikersItem intlMeetLikersNewLikersItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlMeetLikersNewLikersItem.f24993c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlMeetLikersNewLikersItem.f24994d = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlMeetLikersNewLikersItem.f24995e = (VText) viewGroup.getChildAt(1);
    }
}
