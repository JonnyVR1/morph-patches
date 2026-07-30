package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestSubView;
import com.p000p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qgt {
    /* JADX INFO: renamed from: a */
    public static void m21267a(pgt pgtVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pgtVar.f17323k = (LiveRoomSuggestView) viewGroup.getChildAt(0);
        pgtVar.f17324l = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        pgtVar.f17325m = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        pgtVar.f17326n = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        pgtVar.f17327o = (LiveRoomSuggestSubView) viewGroup.getChildAt(1);
        pgtVar.f17328p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        pgtVar.f17329q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        pgtVar.f17330r = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        pgtVar.f17331s = (FrameLayout) viewGroup.getChildAt(2);
        pgtVar.f17332t = (FrameLayout) viewGroup.getChildAt(2);
        pgtVar.f17333u = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        pgtVar.f17334v = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        pgtVar.f17335w = (LinearLayout) viewGroup.getChildAt(3);
        pgtVar.f17336x = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        pgtVar.f17337y = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
