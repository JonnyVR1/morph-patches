package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestSubView;
import com.p051p1.mobile.putong.live.livingroom.common.roomsuggest.view.LiveRoomSuggestView;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class rit {
    /* JADX INFO: renamed from: a */
    public static void m181601a(qit qitVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qitVar.f157870k = (LiveRoomSuggestView) viewGroup.getChildAt(0);
        qitVar.f157871l = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qitVar.f157872m = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        qitVar.f157873n = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        qitVar.f157874o = (LiveRoomSuggestSubView) viewGroup.getChildAt(1);
        qitVar.f157875p = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        qitVar.f157876q = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        qitVar.f157877r = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        qitVar.f157878s = (FrameLayout) viewGroup.getChildAt(2);
        qitVar.f157879t = (FrameLayout) viewGroup.getChildAt(2);
        qitVar.f157880u = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        qitVar.f157881v = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        qitVar.f157882w = (LinearLayout) viewGroup.getChildAt(3);
        qitVar.f157883x = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        qitVar.f157884y = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
