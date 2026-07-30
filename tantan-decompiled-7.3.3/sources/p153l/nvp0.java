package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.p051p1.mobile.putong.core.newui.view.WechatNotifyBannerView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class nvp0 {
    /* JADX INFO: renamed from: a */
    public static void m164910a(WechatNotifyBannerView wechatNotifyBannerView, View view) {
        wechatNotifyBannerView.f27887a = (WechatNotifyBannerView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        wechatNotifyBannerView.f27888b = (VImage) viewGroup.getChildAt(0);
        wechatNotifyBannerView.f27889c = (VText) viewGroup.getChildAt(1);
        wechatNotifyBannerView.f27890d = (VText) viewGroup.getChildAt(2);
        wechatNotifyBannerView.f27891e = (Space) viewGroup.getChildAt(3);
        wechatNotifyBannerView.f27892f = (VImage) viewGroup.getChildAt(4);
    }
}
