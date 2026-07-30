package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.messages.NewOnlineMatchSuccessItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mz30 {
    /* JADX INFO: renamed from: a */
    public static void m8294a(NewOnlineMatchSuccessItem newOnlineMatchSuccessItem, View view) {
        newOnlineMatchSuccessItem.a = (NewOnlineMatchSuccessItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newOnlineMatchSuccessItem.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        newOnlineMatchSuccessItem.c = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        newOnlineMatchSuccessItem.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        newOnlineMatchSuccessItem.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        newOnlineMatchSuccessItem.f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        newOnlineMatchSuccessItem.g = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
