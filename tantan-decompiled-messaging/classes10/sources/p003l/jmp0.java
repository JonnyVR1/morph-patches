package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.p1.mobile.putong.core.newui.view.WechatNotifyBannerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jmp0 {
    /* JADX INFO: renamed from: a */
    public static void m7429a(WechatNotifyBannerView wechatNotifyBannerView, View view) {
        wechatNotifyBannerView.a = (WechatNotifyBannerView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        wechatNotifyBannerView.b = viewGroup.getChildAt(0);
        wechatNotifyBannerView.c = viewGroup.getChildAt(1);
        wechatNotifyBannerView.d = viewGroup.getChildAt(2);
        wechatNotifyBannerView.e = (Space) viewGroup.getChildAt(3);
        wechatNotifyBannerView.f = viewGroup.getChildAt(4);
    }
}
