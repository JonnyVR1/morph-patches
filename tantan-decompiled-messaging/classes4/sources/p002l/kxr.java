package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.blacklist.LiveBlackListItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kxr {
    /* JADX INFO: renamed from: a */
    public static void m16866a(LiveBlackListItemView liveBlackListItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveBlackListItemView._avatar = viewGroup.getChildAt(0);
        liveBlackListItemView._name = viewGroup.getChildAt(1);
        liveBlackListItemView._cancel = viewGroup.getChildAt(2);
    }
}
