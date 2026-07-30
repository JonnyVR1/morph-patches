package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.messages.recommend.view.NewMatchItemLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jc30 {
    /* JADX INFO: renamed from: a */
    public static void m7391a(NewMatchItemLayout newMatchItemLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newMatchItemLayout.a = viewGroup.getChildAt(0);
        newMatchItemLayout.b = viewGroup.getChildAt(1);
        newMatchItemLayout.c = viewGroup.getChildAt(2);
        newMatchItemLayout.d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        newMatchItemLayout.e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        newMatchItemLayout.f = viewGroup.getChildAt(3);
        newMatchItemLayout.g = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }
}
