package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemLiveVirtualVoice;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class q5q {
    /* JADX INFO: renamed from: a */
    public static void m173098a(ItemLiveVirtualVoice itemLiveVirtualVoice, View view) {
        itemLiveVirtualVoice.f31074a = (ItemLiveVirtualVoice) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemLiveVirtualVoice.f31075b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemLiveVirtualVoice.f31076c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemLiveVirtualVoice.f31077d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
