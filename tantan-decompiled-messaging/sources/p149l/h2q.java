package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.newui.messages.expirence.view.ItemCommonIconTitleDesClikeView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class h2q {
    /* JADX INFO: renamed from: a */
    public static void m129125a(ItemCommonIconTitleDesClikeView itemCommonIconTitleDesClikeView, View view) {
        itemCommonIconTitleDesClikeView.f25780a = (ItemCommonIconTitleDesClikeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemCommonIconTitleDesClikeView.f25781b = (RelativeLayout) viewGroup.getChildAt(0);
        itemCommonIconTitleDesClikeView.f25782c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemCommonIconTitleDesClikeView.f25783d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemCommonIconTitleDesClikeView.f25784e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemCommonIconTitleDesClikeView.f25785f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
