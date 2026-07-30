package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.live.external.internal.vchat.end.LiveVChatEndAct;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class shu {
    /* JADX INFO: renamed from: a */
    public static void m184266a(LiveVChatEndAct liveVChatEndAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveVChatEndAct.f45098c = (VImage) viewGroup.getChildAt(0);
        liveVChatEndAct.f45099d = (VText) viewGroup.getChildAt(1);
        liveVChatEndAct.f45100e = (VText) viewGroup.getChildAt(2);
        liveVChatEndAct.f45101f = (VText) viewGroup.getChildAt(3);
        liveVChatEndAct.f45102g = viewGroup.getChildAt(4);
        liveVChatEndAct.f45103h = (ImageView) viewGroup.getChildAt(5);
        liveVChatEndAct.f45104i = (VText) viewGroup.getChildAt(6);
        liveVChatEndAct.f45105j = viewGroup.getChildAt(7);
        liveVChatEndAct.f45106k = (ImageView) viewGroup.getChildAt(8);
        liveVChatEndAct.f45107l = (VText) viewGroup.getChildAt(9);
        liveVChatEndAct.f45108m = viewGroup.getChildAt(10);
        liveVChatEndAct.f45109n = (ImageView) viewGroup.getChildAt(11);
        liveVChatEndAct.f45110o = (VText) viewGroup.getChildAt(12);
        liveVChatEndAct.f45111p = (VText) viewGroup.getChildAt(13);
    }

    /* JADX INFO: renamed from: b */
    public static View m184267b(LiveVChatEndAct liveVChatEndAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162687M1, viewGroup, false);
        m184266a(liveVChatEndAct, viewInflate);
        return viewInflate;
    }
}
