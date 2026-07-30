package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.live.external.internal.vchat.end.LiveVChatEndAct;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class tju {
    /* JADX INFO: renamed from: a */
    public static void m191456a(LiveVChatEndAct liveVChatEndAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatEndAct.f45946c = (VImage) viewGroup.getChildAt(0);
        liveVChatEndAct.f45947d = (VText) viewGroup.getChildAt(1);
        liveVChatEndAct.f45948e = (VText) viewGroup.getChildAt(2);
        liveVChatEndAct.f45949f = (VText) viewGroup.getChildAt(3);
        liveVChatEndAct.f45950g = viewGroup.getChildAt(4);
        liveVChatEndAct.f45951h = (ImageView) viewGroup.getChildAt(5);
        liveVChatEndAct.f45952i = (VText) viewGroup.getChildAt(6);
        liveVChatEndAct.f45953j = viewGroup.getChildAt(7);
        liveVChatEndAct.f45954k = (ImageView) viewGroup.getChildAt(8);
        liveVChatEndAct.f45955l = (VText) viewGroup.getChildAt(9);
        liveVChatEndAct.f45956m = viewGroup.getChildAt(10);
        liveVChatEndAct.f45957n = (ImageView) viewGroup.getChildAt(11);
        liveVChatEndAct.f45958o = (VText) viewGroup.getChildAt(12);
        liveVChatEndAct.f45959p = (VText) viewGroup.getChildAt(13);
    }

    /* JADX INFO: renamed from: b */
    public static View m191457b(LiveVChatEndAct liveVChatEndAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193801M1, viewGroup, false);
        m191456a(liveVChatEndAct, viewInflate);
        return viewInflate;
    }
}
