package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatMessageView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class lou {
    /* JADX INFO: renamed from: a */
    public static void m155102a(LiveVChatMessageView liveVChatMessageView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatMessageView.f46238d = (VImage) viewGroup.getChildAt(0);
        liveVChatMessageView.f46239e = (VText) viewGroup.getChildAt(1);
        liveVChatMessageView.f46240f = (VText) viewGroup.getChildAt(2);
    }
}
