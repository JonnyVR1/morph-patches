package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.PkBottomMenuView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class mk70 {
    /* JADX INFO: renamed from: a */
    public static void m154925a(PkBottomMenuView pkBottomMenuView, View view) {
        pkBottomMenuView.f48528a = (PkBottomMenuView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        pkBottomMenuView.f48529b = (VDraweeView) viewGroup.getChildAt(0);
        pkBottomMenuView.f48530c = (AnimEffectPlayer) viewGroup.getChildAt(1);
        pkBottomMenuView.f48531d = viewGroup.getChildAt(2);
    }
}
