package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageWCInviteAfter;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ybq {
    /* JADX INFO: renamed from: a */
    public static void m215108a(ItemMessageWCInviteAfter itemMessageWCInviteAfter, View view) {
        itemMessageWCInviteAfter.f32114a = (ItemMessageWCInviteAfter) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemMessageWCInviteAfter.f32115b = (RelativeLayout) viewGroup.getChildAt(0);
        itemMessageWCInviteAfter.f32116c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemMessageWCInviteAfter.f32117d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemMessageWCInviteAfter.f32118e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemMessageWCInviteAfter.f32119f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}
