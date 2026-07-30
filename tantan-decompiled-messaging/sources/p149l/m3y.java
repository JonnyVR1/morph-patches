package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.meet.likers.items.MeetLikersNewLikersItem;
import p147v.VDraweeView;
import p147v.VIcon;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class m3y {
    /* JADX INFO: renamed from: a */
    public static void m152962a(MeetLikersNewLikersItem meetLikersNewLikersItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetLikersNewLikersItem.f24554c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        meetLikersNewLikersItem.f24555d = (VIcon) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        meetLikersNewLikersItem.f24556e = (VText) viewGroup.getChildAt(1);
    }
}
