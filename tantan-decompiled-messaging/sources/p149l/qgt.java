package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestSubView;
import com.p046p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestView;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class qgt {
    /* JADX INFO: renamed from: a */
    public static void m174456a(pgt pgtVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pgtVar.f148811k = (LiveRoomSuggestView) viewGroup.getChildAt(0);
        pgtVar.f148812l = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        pgtVar.f148813m = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        pgtVar.f148814n = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        pgtVar.f148815o = (LiveRoomSuggestSubView) viewGroup.getChildAt(1);
        pgtVar.f148816p = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        pgtVar.f148817q = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        pgtVar.f148818r = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        pgtVar.f148819s = (FrameLayout) viewGroup.getChildAt(2);
        pgtVar.f148820t = (FrameLayout) viewGroup.getChildAt(2);
        pgtVar.f148821u = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        pgtVar.f148822v = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        pgtVar.f148823w = (LinearLayout) viewGroup.getChildAt(3);
        pgtVar.f148824x = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        pgtVar.f148825y = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
