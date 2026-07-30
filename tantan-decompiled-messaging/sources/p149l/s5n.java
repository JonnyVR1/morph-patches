package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlChatLivingStateView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class s5n {
    /* JADX INFO: renamed from: a */
    public static void m182366a(IntlChatLivingStateView intlChatLivingStateView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlChatLivingStateView.f45718d = (AnimEffectPlayer) viewGroup.getChildAt(0);
        intlChatLivingStateView.f45719e = (VDraweeView) viewGroup.getChildAt(1);
        intlChatLivingStateView.f45720f = (TextView) viewGroup.getChildAt(2);
        intlChatLivingStateView.f45721g = (AnimEffectPlayer) viewGroup.getChildAt(3);
        intlChatLivingStateView.f45722h = (TextView) viewGroup.getChildAt(4);
        intlChatLivingStateView.f45723i = (TextView) viewGroup.getChildAt(5);
    }
}
