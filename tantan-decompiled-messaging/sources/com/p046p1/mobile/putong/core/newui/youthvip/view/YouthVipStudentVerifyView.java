package com.p046p1.mobile.putong.core.newui.youthvip.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.youthvip.view.YouthVipStudentVerifyView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.StudentVerification;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Verification;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p149l.e30;
import p149l.mkd0;
import p149l.ofq0;
import p149l.osi0;
import p149l.qib0;
import p149l.svq;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0010R\"\u0010 \u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00104\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\"\u00108\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010+\u001a\u0004\b6\u0010-\"\u0004\b7\u0010/R\u0018\u0010;\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipStudentVerifyView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Frag;", "frag", "l0", "(Lcom/p1/mobile/android/app/Frag;)V", "Landroid/view/View;", OMSTemplateModeType.view, "j0", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/data/StudentVerificationStatus;", NotificationCompat.CATEGORY_STATUS, "m0", "(Lcom/p1/mobile/putong/data/StudentVerificationStatus;)V", "k0", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipStudentVerifyView;", "get_root_view", "()Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipStudentVerifyView;", "set_root_view", "(Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipStudentVerifyView;)V", "_root_view", "Lv/VDraweeView;", "e", "Lv/VDraweeView;", "get_user_head", "()Lv/VDraweeView;", "set_user_head", "(Lv/VDraweeView;)V", "_user_head", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "get_to_verify_btn", "()Landroid/widget/TextView;", "set_to_verify_btn", "(Landroid/widget/TextView;)V", "_to_verify_btn", "g", "get_title", "set_title", "_title", "h", "get_subtitle", "set_subtitle", "_subtitle", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/data/StudentVerificationStatus;", "curStudentVerifyState", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class YouthVipStudentVerifyView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public YouthVipStudentVerifyView _root_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VDraweeView _user_head;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _to_verify_btn;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public TextView _subtitle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public StudentVerificationStatus curStudentVerifyState;

    public /* synthetic */ YouthVipStudentVerifyView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m43876h0(YouthVipStudentVerifyView youthVipStudentVerifyView, Frag frag, View view) {
        zvf0.m220396r("e_youthvip_student", "p_youthvip_page");
        if (CoreModule.f17554l.m94656g().mo35035Wa()) {
            youthVipStudentVerifyView.m43879k0(frag);
        } else {
            osi0.m165783g("你已从青春专区毕业，去其他页面转转吧~");
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static void m43877i0(YouthVipStudentVerifyView youthVipStudentVerifyView, User user) {
        Verification verification;
        StudentVerification studentVerification;
        if (user != null) {
            qib0.f154691G.m102325I0(youthVipStudentVerifyView.get_user_head(), user.m60124fp().profileMiddle().formatted(), svq.m186103c(32), svq.m186103c(32));
            Settings settings = user.settings;
            youthVipStudentVerifyView.m43881m0((settings == null || (verification = settings.verification) == null || (studentVerification = verification.studies) == null) ? null : studentVerification.status);
        }
    }

    @NotNull
    public final YouthVipStudentVerifyView get_root_view() {
        YouthVipStudentVerifyView youthVipStudentVerifyView = this._root_view;
        if (youthVipStudentVerifyView != null) {
            return youthVipStudentVerifyView;
        }
        Intrinsics.m87502r("_root_view");
        return null;
    }

    @NotNull
    public final TextView get_subtitle() {
        TextView textView = this._subtitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_subtitle");
        return null;
    }

    @NotNull
    public final TextView get_title() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    @NotNull
    public final TextView get_to_verify_btn() {
        TextView textView = this._to_verify_btn;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_to_verify_btn");
        return null;
    }

    @NotNull
    public final VDraweeView get_user_head() {
        VDraweeView vDraweeView = this._user_head;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_user_head");
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m43878j0(View view) {
        ofq0.m164107a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m43879k0(Frag frag) {
        CoreModule.f17554l.m94658i().mo158318V1(frag.getActivity(), "p_youthvip_page", "");
    }

    /* JADX INFO: renamed from: l0 */
    public final void m43880l0(@NotNull final Frag frag) {
        frag.getClass();
        frag.duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.mfq0
            @Override // p149l.e30
            public final void call(Object obj) {
                YouthVipStudentVerifyView.m43877i0(this.f133614a, (User) obj);
            }
        }));
        xdl0.m208329E0(get_to_verify_btn(), new View.OnClickListener() { // from class: l.nfq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                YouthVipStudentVerifyView.m43876h0(this.f138811a, frag, view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final void m43881m0(StudentVerificationStatus status) {
        this.curStudentVerifyState = status;
        if (TEnum.equals(status, "verified")) {
            get_to_verify_btn().setClickable(false);
            get_to_verify_btn().setText("已认证");
            get_to_verify_btn().setTextColor(Color.parseColor("#1A000000"));
        } else if (TEnum.equals(status, "pending")) {
            get_to_verify_btn().setClickable(false);
            get_to_verify_btn().setText("审核中");
            get_to_verify_btn().setTextColor(Color.parseColor("#1A000000"));
        } else {
            get_to_verify_btn().setClickable(true);
            get_to_verify_btn().setText("未认证");
            get_to_verify_btn().setTextColor(Color.parseColor("#CC000000"));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43878j0(this);
    }

    public final void set_root_view(@NotNull YouthVipStudentVerifyView youthVipStudentVerifyView) {
        youthVipStudentVerifyView.getClass();
        this._root_view = youthVipStudentVerifyView;
    }

    public final void set_subtitle(@NotNull TextView textView) {
        textView.getClass();
        this._subtitle = textView;
    }

    public final void set_title(@NotNull TextView textView) {
        textView.getClass();
        this._title = textView;
    }

    public final void set_to_verify_btn(@NotNull TextView textView) {
        textView.getClass();
        this._to_verify_btn = textView;
    }

    public final void set_user_head(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._user_head = vDraweeView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public YouthVipStudentVerifyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public YouthVipStudentVerifyView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public YouthVipStudentVerifyView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
