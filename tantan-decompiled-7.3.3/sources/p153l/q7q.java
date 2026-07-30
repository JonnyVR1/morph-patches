package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemLiveVirtualVoice;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class q7q {
    /* JADX INFO: renamed from: a */
    public static void m175706a(ItemLiveVirtualVoice itemLiveVirtualVoice, View view) {
        itemLiveVirtualVoice.f31922a = (ItemLiveVirtualVoice) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemLiveVirtualVoice.f31923b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemLiveVirtualVoice.f31924c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemLiveVirtualVoice.f31925d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
