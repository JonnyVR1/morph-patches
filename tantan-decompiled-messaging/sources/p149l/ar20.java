package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.NewFilterTagItem;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ar20 {
    /* JADX INFO: renamed from: a */
    public static void m98368a(NewFilterTagItem newFilterTagItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newFilterTagItem.f36186a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newFilterTagItem.f36187b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        newFilterTagItem.f36188c = (VImage) viewGroup.getChildAt(1);
    }
}
