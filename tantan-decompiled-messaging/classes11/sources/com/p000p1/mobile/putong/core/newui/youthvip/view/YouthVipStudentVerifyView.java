package com.p000p1.mobile.putong.core.newui.youthvip.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.newui.youthvip.view.YouthVipStudentVerifyView;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.StudentVerification;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Verification;
import com.p1.mobile.putong.data.tenum.TEnum;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.e30;
import l.mkd0;
import l.ofq0;
import l.osi0;
import l.qib0;
import l.svq;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0010R\"\u0010 \u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00104\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\"\u00108\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010+\u001a\u0004\b6\u0010-\"\u0004\b7\u0010/R\u0018\u0010;\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipStudentVerifyView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Frag;", "frag", "l0", "(Lcom/p1/mobile/android/app/Frag;)V", "Landroid/view/View;", "view", "j0", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/data/StudentVerificationStatus;", "status", "m0", "(Lcom/p1/mobile/putong/data/StudentVerificationStatus;)V", "k0", "d", "Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipStudentVerifyView;", "get_root_view", "()Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipStudentVerifyView;", "set_root_view", "(Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipStudentVerifyView;)V", "_root_view", "Lv/VDraweeView;", "e", "Lv/VDraweeView;", "get_user_head", "()Lv/VDraweeView;", "set_user_head", "(Lv/VDraweeView;)V", "_user_head", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "get_to_verify_btn", "()Landroid/widget/TextView;", "set_to_verify_btn", "(Landroid/widget/TextView;)V", "_to_verify_btn", "g", "get_title", "set_title", "_title", "h", "get_subtitle", "set_subtitle", "_subtitle", "i", "Lcom/p1/mobile/putong/data/StudentVerificationStatus;", "curStudentVerifyState", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static void m8145h0(YouthVipStudentVerifyView youthVipStudentVerifyView, Frag frag, View view) {
        zvf0.r("e_youthvip_student", "p_youthvip_page");
        if (CoreModule.l.g().Wa()) {
            youthVipStudentVerifyView.m8148k0(frag);
        } else {
            osi0.g("你已从青春专区毕业，去其他页面转转吧~");
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static void m8146i0(YouthVipStudentVerifyView youthVipStudentVerifyView, User user) {
        Verification verification;
        StudentVerification studentVerification;
        if (user != null) {
            qib0.G.I0(youthVipStudentVerifyView.get_user_head(), user.fp().profileMiddle().formatted(), svq.c(32), svq.c(32));
            Settings settings = user.settings;
            youthVipStudentVerifyView.m8150m0((settings == null || (verification = settings.verification) == null || (studentVerification = verification.studies) == null) ? null : studentVerification.status);
        }
    }

    @NotNull
    public final YouthVipStudentVerifyView get_root_view() {
        YouthVipStudentVerifyView youthVipStudentVerifyView = this._root_view;
        if (youthVipStudentVerifyView != null) {
            return youthVipStudentVerifyView;
        }
        Intrinsics.r("_root_view");
        return null;
    }

    @NotNull
    public final TextView get_subtitle() {
        TextView textView = this._subtitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_subtitle");
        return null;
    }

    @NotNull
    public final TextView get_title() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_title");
        return null;
    }

    @NotNull
    public final TextView get_to_verify_btn() {
        TextView textView = this._to_verify_btn;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_to_verify_btn");
        return null;
    }

    @NotNull
    public final VDraweeView get_user_head() {
        VDraweeView vDraweeView = this._user_head;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_user_head");
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m8147j0(View view) {
        ofq0.a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m8148k0(Frag frag) {
        CoreModule.l.i().V1(frag.getActivity(), "p_youthvip_page", "");
    }

    /* JADX INFO: renamed from: l0 */
    public final void m8149l0(@NotNull final Frag frag) {
        frag.getClass();
        frag.duringCreated(CoreModule.c.e0.o9()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.mfq0
            public final void call(Object obj) {
                YouthVipStudentVerifyView.m8146i0(this.f16880a, (User) obj);
            }
        }));
        xdl0.E0(get_to_verify_btn(), new View.OnClickListener() { // from class: l.nfq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                YouthVipStudentVerifyView.m8145h0(this.f17444a, frag, view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final void m8150m0(StudentVerificationStatus status) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8147j0(this);
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
