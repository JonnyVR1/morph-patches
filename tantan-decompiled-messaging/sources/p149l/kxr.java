package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.blacklist.LiveBlackListItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class kxr {
    /* JADX INFO: renamed from: a */
    public static void m147806a(LiveBlackListItemView liveBlackListItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveBlackListItemView._avatar = (VDraweeView) viewGroup.getChildAt(0);
        liveBlackListItemView._name = (VText) viewGroup.getChildAt(1);
        liveBlackListItemView._cancel = (VText) viewGroup.getChildAt(2);
    }
}
