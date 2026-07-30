package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.newui.messages.expirence.view.ItemCommonIconTitleDesClikeView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class h4q {
    /* JADX INFO: renamed from: a */
    public static void m133592a(ItemCommonIconTitleDesClikeView itemCommonIconTitleDesClikeView, View view) {
        itemCommonIconTitleDesClikeView.f26522a = (ItemCommonIconTitleDesClikeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemCommonIconTitleDesClikeView.f26523b = (RelativeLayout) viewGroup.getChildAt(0);
        itemCommonIconTitleDesClikeView.f26524c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemCommonIconTitleDesClikeView.f26525d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemCommonIconTitleDesClikeView.f26526e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemCommonIconTitleDesClikeView.f26527f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
