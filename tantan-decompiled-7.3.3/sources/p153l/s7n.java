package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlChatLivingStateView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class s7n {
    /* JADX INFO: renamed from: a */
    public static void m185026a(IntlChatLivingStateView intlChatLivingStateView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlChatLivingStateView.f46566d = (AnimEffectPlayer) viewGroup.getChildAt(0);
        intlChatLivingStateView.f46567e = (VDraweeView) viewGroup.getChildAt(1);
        intlChatLivingStateView.f46568f = (TextView) viewGroup.getChildAt(2);
        intlChatLivingStateView.f46569g = (AnimEffectPlayer) viewGroup.getChildAt(3);
        intlChatLivingStateView.f46570h = (TextView) viewGroup.getChildAt(4);
        intlChatLivingStateView.f46571i = (TextView) viewGroup.getChildAt(5);
    }
}
