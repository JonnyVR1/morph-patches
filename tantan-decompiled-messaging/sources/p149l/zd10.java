package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.view.MultiCallPkBoardItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class zd10 {
    /* JADX INFO: renamed from: a */
    public static void m218122a(MultiCallPkBoardItemView multiCallPkBoardItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        multiCallPkBoardItemView.f51425d = (AnimEffectPlayer) viewGroup.getChildAt(0);
        multiCallPkBoardItemView.f51426e = (VText) viewGroup.getChildAt(1);
        multiCallPkBoardItemView.f51427f = (VDraweeView) viewGroup.getChildAt(2);
        multiCallPkBoardItemView.f51428g = (VImage) viewGroup.getChildAt(3);
        multiCallPkBoardItemView.f51429h = (VText) viewGroup.getChildAt(4);
        multiCallPkBoardItemView.f51430i = (LinearLayout) viewGroup.getChildAt(5);
        multiCallPkBoardItemView.f51431j = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        multiCallPkBoardItemView.f51432k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        multiCallPkBoardItemView.f51433l = (VText) viewGroup.getChildAt(6);
    }
}
