package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.settleList.view.CheckInUserItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class x35 {
    /* JADX INFO: renamed from: a */
    public static void m209192a(CheckInUserItemView checkInUserItemView, View view) {
        checkInUserItemView._root = (CheckInUserItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        checkInUserItemView._icon = (VDraweeView) viewGroup.getChildAt(0);
        checkInUserItemView._tag = (VText) viewGroup.getChildAt(1);
    }
}
