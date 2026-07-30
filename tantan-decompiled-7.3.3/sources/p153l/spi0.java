package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.view.LiveSquareMediaView;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.teenmode.TeenModeRoomFrag;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class spi0 {
    /* JADX INFO: renamed from: a */
    public static void m187344a(TeenModeRoomFrag teenModeRoomFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        teenModeRoomFrag.f48598z = (LiveSquareMediaView) viewGroup.getChildAt(0);
        teenModeRoomFrag.f48596A = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m187345b(TeenModeRoomFrag teenModeRoomFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199023b6, viewGroup, false);
        m187344a(teenModeRoomFrag, viewInflate);
        return viewInflate;
    }
}
