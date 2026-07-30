package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.intl.common.gameoperation.IntlGameOperationItemView;
import p147v.VDraweeView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class kin {
    /* JADX INFO: renamed from: a */
    public static void m146098a(IntlGameOperationItemView intlGameOperationItemView, View view) {
        intlGameOperationItemView.f45546a = (IntlGameOperationItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlGameOperationItemView.f45547b = (VFrame) viewGroup.getChildAt(0);
        intlGameOperationItemView.f45548c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlGameOperationItemView.f45549d = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
