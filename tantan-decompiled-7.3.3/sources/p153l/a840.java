package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.messages.NewOnlineMatchSuccessItem;
import p151v.VDraweeView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class a840 {
    /* JADX INFO: renamed from: a */
    public static void m96413a(NewOnlineMatchSuccessItem newOnlineMatchSuccessItem, View view) {
        newOnlineMatchSuccessItem.f32517a = (NewOnlineMatchSuccessItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        newOnlineMatchSuccessItem.f32518b = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        newOnlineMatchSuccessItem.f32519c = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        newOnlineMatchSuccessItem.f32520d = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        newOnlineMatchSuccessItem.f32521e = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        newOnlineMatchSuccessItem.f32522f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        newOnlineMatchSuccessItem.f32523g = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
