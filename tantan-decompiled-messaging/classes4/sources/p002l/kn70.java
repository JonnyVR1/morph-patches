package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.recreation.pk.view.PkFriendItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kn70 {
    /* JADX INFO: renamed from: a */
    public static void m16698a(PkFriendItemView pkFriendItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pkFriendItemView.a = viewGroup.getChildAt(0);
        pkFriendItemView.b = (TextView) viewGroup.getChildAt(1);
        pkFriendItemView.c = (TextView) viewGroup.getChildAt(2);
    }
}
