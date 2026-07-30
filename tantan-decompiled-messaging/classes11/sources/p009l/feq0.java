package p009l;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.youthvip.view.YouthVipBasePrivilegeView;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.CoreModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.b3c0;
import l.j2e0;
import l.osi0;
import l.qib0;
import l.xdl0;
import l.zvf0;
import l.zz6;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Ll/feq0;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipBasePrivilegeView;", "view", "", "b", "(Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipBasePrivilegeView;)V", "Lcom/p1/mobile/android/app/Frag;", "frag", "d", "(Lcom/p1/mobile/android/app/Frag;)V", "a", "Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipBasePrivilegeView;", "c", "()Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipBasePrivilegeView;", "e", "youthVipBasePrivilegeView", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class feq0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public YouthVipBasePrivilegeView youthVipBasePrivilegeView;

    /* JADX INFO: renamed from: a */
    public static void m14428a(Frag frag, View view) {
        zvf0.r("e_youthvip_blindbox", "p_youthvip_page");
        if (!CoreModule.l.g().Wa()) {
            osi0.g("你已从青春专区毕业，去其他页面转转吧~");
            return;
        }
        String strG3 = CoreModule.c.g2.g3();
        if (TextUtils.isEmpty(strG3)) {
            osi0.g("获取盲盒数据失败");
            return;
        }
        j2e0.m(frag.act(), Uri.parse("tantan://webview?url=" + strG3));
    }

    /* JADX INFO: renamed from: b */
    public final void m14429b(@NotNull YouthVipBasePrivilegeView view) {
        view.getClass();
        m14432e(view);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final YouthVipBasePrivilegeView m14430c() {
        YouthVipBasePrivilegeView youthVipBasePrivilegeView = this.youthVipBasePrivilegeView;
        if (youthVipBasePrivilegeView != null) {
            return youthVipBasePrivilegeView;
        }
        Intrinsics.r("youthVipBasePrivilegeView");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m14431d(@NotNull final Frag frag) {
        frag.getClass();
        if (this.youthVipBasePrivilegeView != null) {
            m14430c().get_root_view().setBackgroundResource(b3c0.R5);
            qib0.G.Y0(m14430c().get_texture(), b3c0.X5);
            m14430c().get_icon().setImageResource(b3c0.U5);
            m14430c().get_title().setText("拆盲盒");
            m14430c().get_subtitle().setText("认识和你一样有趣的人");
            m14430c().get_model_icon().setImageResource(zz6.u0() ? b3c0.V5 : b3c0.W5);
            m14430c().get_go_btn().setText("点击进入");
            xdl0.E0(m14430c().get_root_view(), new View.OnClickListener() { // from class: l.eeq0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    feq0.m14428a(frag, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m14432e(@NotNull YouthVipBasePrivilegeView youthVipBasePrivilegeView) {
        youthVipBasePrivilegeView.getClass();
        this.youthVipBasePrivilegeView = youthVipBasePrivilegeView;
    }
}
