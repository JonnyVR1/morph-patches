package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.archi.frag.teenmode.TeenModeRoomFrag;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class sgi0 {
    /* JADX INFO: renamed from: a */
    public static void m22466a(TeenModeRoomFrag teenModeRoomFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        teenModeRoomFrag.f3792z = viewGroup.getChildAt(0);
        teenModeRoomFrag.f3790A = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m22467b(TeenModeRoomFrag teenModeRoomFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19787b6, viewGroup, false);
        m22466a(teenModeRoomFrag, viewInflate);
        return viewInflate;
    }
}
