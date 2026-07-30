package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.intl.common.gameoperation.IntlGameOperationItemView;
import p151v.VDraweeView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes9.dex */
public class kkn {
    /* JADX INFO: renamed from: a */
    public static void m150270a(IntlGameOperationItemView intlGameOperationItemView, View view) {
        intlGameOperationItemView.f46394a = (IntlGameOperationItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlGameOperationItemView.f46395b = (VFrame) viewGroup.getChildAt(0);
        intlGameOperationItemView.f46396c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlGameOperationItemView.f46397d = (AnimEffectPlayer) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
