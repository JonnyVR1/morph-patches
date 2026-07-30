package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.meet.likers.items.MeetLikersNewLikersItem;
import p151v.VDraweeView;
import p151v.VIcon;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jcy {
    /* JADX INFO: renamed from: a */
    public static void m144396a(MeetLikersNewLikersItem meetLikersNewLikersItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetLikersNewLikersItem.f25296c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        meetLikersNewLikersItem.f25297d = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        meetLikersNewLikersItem.f25298e = (VText) viewGroup.getChildAt(1);
    }
}
