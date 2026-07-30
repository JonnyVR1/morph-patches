package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.newui.messages.expirence.view.ItemCommonIconTitleDesClikeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class h2q {
    /* JADX INFO: renamed from: a */
    public static void m6906a(ItemCommonIconTitleDesClikeView itemCommonIconTitleDesClikeView, View view) {
        itemCommonIconTitleDesClikeView.a = (ItemCommonIconTitleDesClikeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemCommonIconTitleDesClikeView.b = (RelativeLayout) viewGroup.getChildAt(0);
        itemCommonIconTitleDesClikeView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemCommonIconTitleDesClikeView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemCommonIconTitleDesClikeView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemCommonIconTitleDesClikeView.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
