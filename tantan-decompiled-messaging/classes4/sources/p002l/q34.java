package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallManageItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class q34 {
    /* JADX INFO: renamed from: a */
    public static void m21018a(CallManageItemView callManageItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        callManageItemView.a = (ImageView) viewGroup.getChildAt(0);
        callManageItemView.b = (TextView) viewGroup.getChildAt(1);
        callManageItemView.c = (TextView) viewGroup.getChildAt(2);
        callManageItemView.d = (ImageView) viewGroup.getChildAt(3);
    }
}
