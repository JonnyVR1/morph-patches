package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemInviteMessage;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class e7q {
    /* JADX INFO: renamed from: a */
    public static void m119766a(ItemInviteMessage itemInviteMessage, View view) {
        itemInviteMessage.f31897a = (ItemInviteMessage) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemInviteMessage.f31898b = (VDraweeView) viewGroup.getChildAt(0);
        itemInviteMessage.f31899c = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        itemInviteMessage.f31900d = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
