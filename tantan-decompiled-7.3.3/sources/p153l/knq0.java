package p153l;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.youthvip.view.YouthVipBasePrivilegeView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\b¨\u0006\u0013"}, m88121d2 = {"Ll/knq0;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipBasePrivilegeView;", OMSTemplateModeType.view, "", "b", "(Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipBasePrivilegeView;)V", "Lcom/p1/mobile/android/app/Frag;", "frag", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/android/app/Frag;)V", "a", "Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipBasePrivilegeView;", "c", "()Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipBasePrivilegeView;", "e", "youthVipBasePrivilegeView", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class knq0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public YouthVipBasePrivilegeView youthVipBasePrivilegeView;

    /* JADX INFO: renamed from: a */
    public static void m150545a(Frag frag, View view) {
        i4g0.m138520r("e_youthvip_blindbox", "p_youthvip_page");
        if (!CoreModule.f18273l.m143410g().mo36038Wa()) {
            r1j0.m179420g("你已从青春专区毕业，去其他页面转转吧~");
            return;
        }
        String strM192264g3 = CoreModule.f18264c.f20389g2.m192264g3();
        if (TextUtils.isEmpty(strM192264g3)) {
            r1j0.m179420g("获取盲盒数据失败");
            return;
        }
        nae0.m162083m(frag.act(), Uri.parse("tantan://webview?url=" + strM192264g3));
    }

    /* JADX INFO: renamed from: b */
    public final void m150546b(@NotNull YouthVipBasePrivilegeView view) {
        view.getClass();
        m150549e(view);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final YouthVipBasePrivilegeView m150547c() {
        YouthVipBasePrivilegeView youthVipBasePrivilegeView = this.youthVipBasePrivilegeView;
        if (youthVipBasePrivilegeView != null) {
            return youthVipBasePrivilegeView;
        }
        Intrinsics.m88391r("youthVipBasePrivilegeView");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m150548d(@NotNull final Frag frag) {
        frag.getClass();
        if (this.youthVipBasePrivilegeView != null) {
            m150547c().get_root_view().setBackgroundResource(gbc0.f103196R5);
            uqb0.f180374G.m127138Y0(m150547c().get_texture(), gbc0.f103238X5);
            m150547c().get_icon().setImageResource(gbc0.f103217U5);
            m150547c().get_title().setText("拆盲盒");
            m150547c().get_subtitle().setText("认识和你一样有趣的人");
            m150547c().get_model_icon().setImageResource(c17.m107528u0() ? gbc0.f103224V5 : gbc0.f103231W5);
            m150547c().get_go_btn().setText("点击进入");
            bnl0.m105509E0(m150547c().get_root_view(), new View.OnClickListener() { // from class: l.jnq0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    knq0.m150545a(frag, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m150549e(@NotNull YouthVipBasePrivilegeView youthVipBasePrivilegeView) {
        youthVipBasePrivilegeView.getClass();
        this.youthVipBasePrivilegeView = youthVipBasePrivilegeView;
    }
}
