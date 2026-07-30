package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p1.mobile.putong.core.ui.vip.DynamicAvatarRoundView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class yee {
    /* JADX INFO: renamed from: a */
    public static void m11172a(DynamicAvatarRoundView dynamicAvatarRoundView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        dynamicAvatarRoundView.a = (ViewStub) viewGroup.getChildAt(0);
        dynamicAvatarRoundView.b = (ViewStub) viewGroup.getChildAt(1);
        dynamicAvatarRoundView.c = (ViewStub) viewGroup.getChildAt(2);
    }
}
