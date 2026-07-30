package p149l;

import android.net.Uri;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.youthvip.view.YouthVipBasePrivilegeView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\b¨\u0006\u0013"}, m87232d2 = {"Ll/heq0;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipBasePrivilegeView;", OMSTemplateModeType.view, "", "b", "(Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipBasePrivilegeView;)V", "Lcom/p1/mobile/android/app/Frag;", "frag", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/android/app/Frag;)V", "a", "Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipBasePrivilegeView;", "c", "()Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipBasePrivilegeView;", "e", "youthVipBasePrivilegeView", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class heq0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public YouthVipBasePrivilegeView youthVipBasePrivilegeView;

    /* JADX INFO: renamed from: a */
    public static void m130679a(Frag frag, View view) {
        zvf0.m220396r("e_youthvip_find_partner", "p_youthvip_page");
        if (CoreModule.f17554l.m94656g().mo35035Wa()) {
            j2e0.m139446m(frag.act(), Uri.parse("tantan://webview?url=".concat(juk.m143323e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/find-partner/index.html?speed=true&_bid=1004357&hideNavigationBar=1&hideNotch=1&from=youth_vip#/" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/find-partner/index.html?speed=true&_bid=1004357&hideNavigationBar=1&hideNotch=1&from=youth_vip#/")));
        } else {
            osi0.m165783g("你已从青春专区毕业，去其他页面转转吧~");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m130680b(@NotNull YouthVipBasePrivilegeView view) {
        view.getClass();
        m130683e(view);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final YouthVipBasePrivilegeView m130681c() {
        YouthVipBasePrivilegeView youthVipBasePrivilegeView = this.youthVipBasePrivilegeView;
        if (youthVipBasePrivilegeView != null) {
            return youthVipBasePrivilegeView;
        }
        Intrinsics.m87502r("youthVipBasePrivilegeView");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m130682d(@NotNull final Frag frag) {
        frag.getClass();
        if (this.youthVipBasePrivilegeView != null) {
            m130681c().get_root_view().setBackgroundResource(b3c0.f72959T5);
            qib0.f154691G.m102354Y0(m130681c().get_texture(), b3c0.f73017b6);
            m130681c().get_icon().setImageResource(b3c0.f72994Y5);
            m130681c().get_title().setText("找搭子专区");
            m130681c().get_subtitle().setText("找人一起吃饭，运动");
            m130681c().get_model_icon().setImageResource(zz6.m221004u0() ? b3c0.f73001Z5 : b3c0.f73009a6);
            m130681c().get_go_btn().setText("点击进入");
            xdl0.m208329E0(m130681c().get_root_view(), new View.OnClickListener() { // from class: l.geq0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    heq0.m130679a(frag, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m130683e(@NotNull YouthVipBasePrivilegeView youthVipBasePrivilegeView) {
        youthVipBasePrivilegeView.getClass();
        this.youthVipBasePrivilegeView = youthVipBasePrivilegeView;
    }
}
