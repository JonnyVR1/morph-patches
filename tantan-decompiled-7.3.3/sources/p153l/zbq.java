package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageWCInvite;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zbq {
    /* JADX INFO: renamed from: a */
    public static void m219211a(ItemMessageWCInvite itemMessageWCInvite, View view) {
        itemMessageWCInvite.f32108a = (ItemMessageWCInvite) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemMessageWCInvite.f32109b = (VDraweeView) viewGroup.getChildAt(0);
        itemMessageWCInvite.f32110c = (VText) viewGroup.getChildAt(1);
        itemMessageWCInvite.f32111d = (VText) viewGroup.getChildAt(2);
    }
}
