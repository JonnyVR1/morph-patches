package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.view.LiveSquareMediaView;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.teenmode.TeenModeRoomFrag;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class sgi0 {
    /* JADX INFO: renamed from: a */
    public static void m184086a(TeenModeRoomFrag teenModeRoomFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        teenModeRoomFrag.f47750z = (LiveSquareMediaView) viewGroup.getChildAt(0);
        teenModeRoomFrag.f47748A = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m184087b(TeenModeRoomFrag teenModeRoomFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168291b6, viewGroup, false);
        m184086a(teenModeRoomFrag, viewInflate);
        return viewInflate;
    }
}
