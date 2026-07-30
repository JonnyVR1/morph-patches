package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.messages.NewOnlineMatchSuccessItem;
import p147v.VDraweeView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class mz30 {
    /* JADX INFO: renamed from: a */
    public static void m157104a(NewOnlineMatchSuccessItem newOnlineMatchSuccessItem, View view) {
        newOnlineMatchSuccessItem.f31669a = (NewOnlineMatchSuccessItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newOnlineMatchSuccessItem.f31670b = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        newOnlineMatchSuccessItem.f31671c = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        newOnlineMatchSuccessItem.f31672d = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        newOnlineMatchSuccessItem.f31673e = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        newOnlineMatchSuccessItem.f31674f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        newOnlineMatchSuccessItem.f31675g = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
