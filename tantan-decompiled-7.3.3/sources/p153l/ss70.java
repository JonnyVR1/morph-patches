package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.PkBottomMenuView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class ss70 {
    /* JADX INFO: renamed from: a */
    public static void m187690a(PkBottomMenuView pkBottomMenuView, View view) {
        pkBottomMenuView.f49376a = (PkBottomMenuView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        pkBottomMenuView.f49377b = (VDraweeView) viewGroup.getChildAt(0);
        pkBottomMenuView.f49378c = (AnimEffectPlayer) viewGroup.getChildAt(1);
        pkBottomMenuView.f49379d = viewGroup.getChildAt(2);
    }
}
