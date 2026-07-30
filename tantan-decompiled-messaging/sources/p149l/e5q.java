package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemInviteMessage;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class e5q {
    /* JADX INFO: renamed from: a */
    public static void m114890a(ItemInviteMessage itemInviteMessage, View view) {
        itemInviteMessage.f31049a = (ItemInviteMessage) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemInviteMessage.f31050b = (VDraweeView) viewGroup.getChildAt(0);
        itemInviteMessage.f31051c = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemInviteMessage.f31052d = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
