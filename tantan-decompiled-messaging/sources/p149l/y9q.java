package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageWCInviteAfter;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class y9q {
    /* JADX INFO: renamed from: a */
    public static void m213548a(ItemMessageWCInviteAfter itemMessageWCInviteAfter, View view) {
        itemMessageWCInviteAfter.f31266a = (ItemMessageWCInviteAfter) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemMessageWCInviteAfter.f31267b = (RelativeLayout) viewGroup.getChildAt(0);
        itemMessageWCInviteAfter.f31268c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemMessageWCInviteAfter.f31269d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemMessageWCInviteAfter.f31270e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemMessageWCInviteAfter.f31271f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}
