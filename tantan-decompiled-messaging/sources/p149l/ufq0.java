package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.newui.youthvip.YouthVipTabFrag;
import com.p046p1.mobile.putong.core.newui.youthvip.view.YouthVipBasePrivilegeView;
import com.p046p1.mobile.putong.core.newui.youthvip.view.YouthVipLocationView;
import com.p046p1.mobile.putong.core.newui.youthvip.view.YouthVipStudentVerifyView;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.crypto.tls.CipherSuite;
import p147v.VLinear;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\tJ\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010.\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\u001f\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R\"\u00105\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00108\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010\u001f\u001a\u0004\b6\u0010!\"\u0004\b7\u0010#R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010D\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010;\u001a\u0004\bB\u0010=\"\u0004\bC\u0010?R\"\u0010K\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010Z\u001a\u00020T8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bU\u0010W\"\u0004\bX\u0010YR\"\u0010\\\u001a\u00020T8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010V\u001a\u0004\bM\u0010W\"\u0004\b[\u0010YR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010\u0013R\u0014\u0010c\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010f¨\u0006h"}, m87232d2 = {"Ll/ufq0;", "Ll/s7m;", "Ll/sfq0;", "Lcom/p1/mobile/putong/core/newui/youthvip/YouthVipTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/youthvip/YouthVipTabFrag;)V", "", Constants.INAPP_DATA_TAG, "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "b", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "c", "(Ll/sfq0;)V", "inflateView", "r", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "a", "Lcom/p1/mobile/putong/core/newui/youthvip/YouthVipTabFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/newui/youthvip/YouthVipTabFrag;", "Lv/VLinear;", "Lv/VLinear;", "e", "()Lv/VLinear;", "set_root_view", "(Lv/VLinear;)V", "_root_view", "Landroidx/core/widget/NestedScrollView;", "Landroidx/core/widget/NestedScrollView;", "get_nested_scroll_view", "()Landroidx/core/widget/NestedScrollView;", "set_nested_scroll_view", "(Landroidx/core/widget/NestedScrollView;)V", "_nested_scroll_view", "get_content_container", "set_content_container", "_content_container", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "f", "()Landroid/widget/ImageView;", "set_top_texture_bg", "(Landroid/widget/ImageView;)V", "_top_texture_bg", RXScreenCaptureService.KEY_INDEX, "set_top_title_container", "_top_title_container", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "get_top_title", "()Landroid/widget/TextView;", "set_top_title", "(Landroid/widget/TextView;)V", "_top_title", "h", "get_top_sub_title", "set_top_sub_title", "_top_sub_title", "Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipStudentVerifyView;", "Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipStudentVerifyView;", "m", "()Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipStudentVerifyView;", "set_youthvip_student_verify", "(Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipStudentVerifyView;)V", "_youthvip_student_verify", "Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipLocationView;", "j", "Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipLocationView;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipLocationView;", "set_youthvip_location", "(Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipLocationView;)V", "_youthvip_location", "Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipBasePrivilegeView;", "k", "Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipBasePrivilegeView;", "()Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipBasePrivilegeView;", "set_youthvip_daizi", "(Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipBasePrivilegeView;)V", "_youthvip_daizi", "set_youthvip_blindbox", "_youthvip_blindbox", "Ll/sfq0;", "getPresenter", "()Ll/sfq0;", "n", "Ll/feq0;", "Ll/feq0;", "blindboxViewHolder", "Ll/heq0;", "o", "Ll/heq0;", "daziViewHolder", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ufq0 implements s7m<sfq0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final YouthVipTabFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VLinear _root_view;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public NestedScrollView _nested_scroll_view;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VLinear _content_container;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public ImageView _top_texture_bg;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VLinear _top_title_container;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public TextView _top_title;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public TextView _top_sub_title;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public YouthVipStudentVerifyView _youthvip_student_verify;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public YouthVipLocationView _youthvip_location;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public YouthVipBasePrivilegeView _youthvip_daizi;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public YouthVipBasePrivilegeView _youthvip_blindbox;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public sfq0 presenter;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final feq0 blindboxViewHolder;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final heq0 daziViewHolder;

    public ufq0(@NotNull YouthVipTabFrag youthVipTabFrag) {
        youthVipTabFrag.getClass();
        this.frag = youthVipTabFrag;
        this.blindboxViewHolder = new feq0();
        this.daziViewHolder = new heq0();
    }

    /* JADX INFO: renamed from: a */
    public static void m193457a(ufq0 ufq0Var) {
        if (ufq0Var.m193461e().getHeight() > svq.m186103c(696) + svq.m186103c(20)) {
            ViewGroup.LayoutParams layoutParams = ufq0Var.m193462f().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = svq.m186103c(50);
            }
            ufq0Var.m193462f().getLayoutParams().width = svq.m186103c(430);
            ufq0Var.m193462f().getLayoutParams().height = svq.m186103c(CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256);
            ViewGroup.LayoutParams layoutParams2 = ufq0Var.m193463i().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = svq.m186103c(90);
            }
            ViewGroup.LayoutParams layoutParams3 = ufq0Var.m193467m().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.topMargin = svq.m186103c(24);
            }
            ViewGroup.LayoutParams layoutParams4 = ufq0Var.m193466l().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            if (marginLayoutParams4 != null) {
                marginLayoutParams4.topMargin = svq.m186103c(48);
            }
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.frag.getActivity();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final View m193458b(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM198288b = vfq0.m198288b(this, inflater, parent);
        viewM198288b.getClass();
        return viewM198288b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable sfq0 presenter) {
        if (presenter != null) {
            m193468n(presenter);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m193460d() {
        m193461e().post(new Runnable() { // from class: l.tfq0
            @Override // java.lang.Runnable
            public final void run() {
                ufq0.m193457a(this.f170013a);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final VLinear m193461e() {
        VLinear vLinear = this._root_view;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_root_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final ImageView m193462f() {
        ImageView imageView = this._top_texture_bg;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_top_texture_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final VLinear m193463i() {
        VLinear vLinear = this._top_title_container;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_top_title_container");
        return null;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM193458b = m193458b(inflater, parent);
        if (ura.m195053e().m195057d().mo33699I4()) {
            viewM193458b.setBackgroundColor(0);
        }
        return viewM193458b;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final YouthVipBasePrivilegeView m193464j() {
        YouthVipBasePrivilegeView youthVipBasePrivilegeView = this._youthvip_blindbox;
        if (youthVipBasePrivilegeView != null) {
            return youthVipBasePrivilegeView;
        }
        Intrinsics.m87502r("_youthvip_blindbox");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final YouthVipBasePrivilegeView m193465k() {
        YouthVipBasePrivilegeView youthVipBasePrivilegeView = this._youthvip_daizi;
        if (youthVipBasePrivilegeView != null) {
            return youthVipBasePrivilegeView;
        }
        Intrinsics.m87502r("_youthvip_daizi");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final YouthVipLocationView m193466l() {
        YouthVipLocationView youthVipLocationView = this._youthvip_location;
        if (youthVipLocationView != null) {
            return youthVipLocationView;
        }
        Intrinsics.m87502r("_youthvip_location");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final YouthVipStudentVerifyView m193467m() {
        YouthVipStudentVerifyView youthVipStudentVerifyView = this._youthvip_student_verify;
        if (youthVipStudentVerifyView != null) {
            return youthVipStudentVerifyView;
        }
        Intrinsics.m87502r("_youthvip_student_verify");
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m193468n(@NotNull sfq0 sfq0Var) {
        sfq0Var.getClass();
        this.presenter = sfq0Var;
    }

    /* JADX INFO: renamed from: r */
    public final void m193469r() {
        m193460d();
        xdl0.m208360X(m193461e(), xdl0.m208331F0());
        this.daziViewHolder.m130680b(m193465k());
        this.blindboxViewHolder.m121061b(m193464j());
        this.daziViewHolder.m130682d(this.frag);
        this.blindboxViewHolder.m121063d(this.frag);
        m193467m().m43880l0(this.frag);
        m193466l().m43874y0(this.frag);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
