package p149l;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.WebSubscriptionLandPageConfig;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.HelperManagerAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VFrame;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\r\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010B\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010I\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010U\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010=\u001a\u0004\bS\u0010?\"\u0004\bT\u0010AR\"\u0010X\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u0010D\u001a\u0004\bV\u0010F\"\u0004\bW\u0010HR\"\u0010[\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010L\u001a\u0004\bY\u0010N\"\u0004\bZ\u0010PR\"\u0010^\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u0010=\u001a\u0004\b\\\u0010?\"\u0004\b]\u0010AR\"\u0010a\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010D\u001a\u0004\b_\u0010F\"\u0004\b`\u0010H¨\u0006b"}, m87232d2 = {"Ll/mzk;", "Ll/s7m;", "Ll/hzk;", "Lcom/p1/mobile/putong/core/ui/vip/privilegeNewUi/HelperManagerAct;", "helperManagerAct", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/privilegeNewUi/HelperManagerAct;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", "f", "(Ll/hzk;)V", "inflateView", "r", "()V", "destroy", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "()Lcom/p1/mobile/android/app/Act;", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/core/data/WebSubscriptionLandPageConfig;", "data", "q", "(Lcom/p1/mobile/putong/core/data/WebSubscriptionLandPageConfig;)V", "a", "Lcom/p1/mobile/putong/core/ui/vip/privilegeNewUi/HelperManagerAct;", "getHelperManagerAct", "()Lcom/p1/mobile/putong/core/ui/vip/privilegeNewUi/HelperManagerAct;", "Landroid/widget/LinearLayout;", "b", "Landroid/widget/LinearLayout;", "get_root", "()Landroid/widget/LinearLayout;", "set_root", "(Landroid/widget/LinearLayout;)V", "_root", "Lv/navigationbar/VNavigationBar;", "c", "Lv/navigationbar/VNavigationBar;", "k", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Lv/VRelative;", Constants.INAPP_DATA_TAG, "Lv/VRelative;", RXScreenCaptureService.KEY_INDEX, "()Lv/VRelative;", "set_help_layout", "(Lv/VRelative;)V", "_help_layout", "Lv/VText;", "Lv/VText;", "j", "()Lv/VText;", "set_help_layout_tv_helper", "(Lv/VText;)V", "_help_layout_tv_helper", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "get_help_layout_helper_arrow", "()Landroid/widget/ImageView;", "set_help_layout_helper_arrow", "(Landroid/widget/ImageView;)V", "_help_layout_helper_arrow", "Lv/VFrame;", "g", "Lv/VFrame;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lv/VFrame;", "set_official_layout", "(Lv/VFrame;)V", "_official_layout", "h", "m", "set_official_layout_official_helper", "_official_layout_official_helper", "get_official_layout_official_arrow", "set_official_layout_official_arrow", "_official_layout_official_arrow", "n", "set_web_subscription_layout", "_web_subscription_layout", "p", "set_web_subscription_layout_web_subscription_desc", "_web_subscription_layout_web_subscription_desc", "get_web_subscription_layout_web_subscription_arrow", "set_web_subscription_layout_web_subscription_arrow", "_web_subscription_layout_web_subscription_arrow", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class mzk implements s7m<hzk> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final HelperManagerAct helperManagerAct;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public LinearLayout _root;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VNavigationBar _navigation_bar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VRelative _help_layout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _help_layout_tv_helper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ImageView _help_layout_helper_arrow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VFrame _official_layout;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _official_layout_official_helper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public ImageView _official_layout_official_arrow;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VFrame _web_subscription_layout;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _web_subscription_layout_web_subscription_desc;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public ImageView _web_subscription_layout_web_subscription_arrow;

    public mzk(@NotNull HelperManagerAct helperManagerAct) {
        helperManagerAct.getClass();
        this.helperManagerAct = helperManagerAct;
    }

    /* JADX INFO: renamed from: a */
    public static void m157145a(mzk mzkVar, View view) {
        zvf0.m220396r("e_intl_official_topup_home_entrance", OMSDialogPositon.p_privileges_view);
        j2e0.m139446m(mzkVar.act(), Uri.parse(CoreModule.f17545c.f19620X1.m115684y3()).buildUpon().build());
    }

    /* JADX INFO: renamed from: b */
    public static Unit m157146b(mzk mzkVar, View view) {
        view.getClass();
        nb90.m158766d();
        new ukf0(mzkVar.helperManagerAct).m194154a();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static void m157147c(mzk mzkVar, View view) {
        mzkVar.helperManagerAct.onBackPressed();
    }

    /* JADX INFO: renamed from: d */
    public static void m157148d(WebSubscriptionLandPageConfig webSubscriptionLandPageConfig, mzk mzkVar, View view) {
        j2e0.m139446m(mzkVar.act(), Uri.parse(webSubscriptionLandPageConfig.webSubscriptionLandPage).buildUpon().build());
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.helperManagerAct;
    }

    @Override // p149l.s7m
    @NotNull
    public Act act() {
        return this.helperManagerAct;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m157149e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM162070b = nzk.m162070b(this, inflater, parent);
        viewM162070b.getClass();
        return viewM162070b;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final VRelative m157151i() {
        VRelative vRelative = this._help_layout;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.m87502r("_help_layout");
        return null;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m157149e(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VText m157152j() {
        VText vText = this._help_layout_tv_helper;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_help_layout_tv_helper");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VNavigationBar m157153k() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m87502r("_navigation_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VFrame m157154l() {
        VFrame vFrame = this._official_layout;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_official_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VText m157155m() {
        VText vText = this._official_layout_official_helper;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_official_layout_official_helper");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VFrame m157156n() {
        VFrame vFrame = this._web_subscription_layout;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_web_subscription_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VText m157157p() {
        VText vText = this._web_subscription_layout_web_subscription_desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_web_subscription_layout_web_subscription_desc");
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m157158q(@NotNull final WebSubscriptionLandPageConfig data) {
        data.getClass();
        boolean z = data.visible && !CoreModule.f17545c.f19620X1.m115675p3();
        m157156n().setVisibility(z ? 0 : 8);
        if (z) {
            xdl0.m208329E0(m157156n(), new View.OnClickListener() { // from class: l.izk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    mzk.m157148d(data, this, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m157159r() {
        m157152j().getPaint().setFakeBoldText(true);
        m157157p().getPaint().setFakeBoldText(true);
        m157153k().setTitle(this.helperManagerAct.getString(R$string.f17846J9));
        if (m157153k().getTitleContainer().getChildCount() > 0 && (m157153k().getTitleContainer().getChildAt(0) instanceof TextView)) {
            View childAt = m157153k().getTitleContainer().getChildAt(0);
            childAt.getClass();
            ((TextView) childAt).setTextColor(Color.parseColor("#b8000000"));
        }
        m157153k().setLeftIconOnClick(new View.OnClickListener() { // from class: l.jzk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mzk.m157147c(this.f120396a, view);
            }
        });
        cxq.m109105c(m157151i(), new Function1() { // from class: l.kzk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return mzk.m157146b(this.f125392a, (View) obj);
            }
        });
        if (CoreModule.f17545c.f19620X1.m115675p3()) {
            zvf0.m220402x("e_intl_official_topup_home_entrance", OMSDialogPositon.p_privileges_view);
            xdl0.m208344M(m157154l(), true);
            m157155m().getPaint().setFakeBoldText(true);
            xdl0.m208329E0(m157154l(), new View.OnClickListener() { // from class: l.lzk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    mzk.m157145a(this.f130656a, view);
                }
            });
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable hzk presenter) {
    }
}
