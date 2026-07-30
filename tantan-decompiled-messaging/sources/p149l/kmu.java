package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatMessageView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class kmu {
    /* JADX INFO: renamed from: a */
    public static void m146554a(LiveVChatMessageView liveVChatMessageView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatMessageView.f45390d = (VImage) viewGroup.getChildAt(0);
        liveVChatMessageView.f45391e = (VText) viewGroup.getChildAt(1);
        liveVChatMessageView.f45392f = (VText) viewGroup.getChildAt(2);
    }
}
