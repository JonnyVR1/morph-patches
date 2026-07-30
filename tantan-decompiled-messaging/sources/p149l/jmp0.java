package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.p046p1.mobile.putong.core.newui.view.WechatNotifyBannerView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jmp0 {
    /* JADX INFO: renamed from: a */
    public static void m142218a(WechatNotifyBannerView wechatNotifyBannerView, View view) {
        wechatNotifyBannerView.f27039a = (WechatNotifyBannerView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        wechatNotifyBannerView.f27040b = (VImage) viewGroup.getChildAt(0);
        wechatNotifyBannerView.f27041c = (VText) viewGroup.getChildAt(1);
        wechatNotifyBannerView.f27042d = (VText) viewGroup.getChildAt(2);
        wechatNotifyBannerView.f27043e = (Space) viewGroup.getChildAt(3);
        wechatNotifyBannerView.f27044f = (VImage) viewGroup.getChildAt(4);
    }
}
