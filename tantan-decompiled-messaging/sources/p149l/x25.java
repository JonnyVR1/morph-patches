package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.settleList.view.CheckInUserItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class x25 {
    /* JADX INFO: renamed from: a */
    public static void m206839a(CheckInUserItemView checkInUserItemView, View view) {
        checkInUserItemView._root = (CheckInUserItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        checkInUserItemView._icon = (VDraweeView) viewGroup.getChildAt(0);
        checkInUserItemView._tag = (VText) viewGroup.getChildAt(1);
    }
}
