package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.qab0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001e\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\"\u0010%\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\"\u0010-\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$¨\u0006."}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/privilege/PurchaseTrialSeePrivilegeView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "c", "Landroid/view/View;", "view", "a", "(Landroid/view/View;)V", "", "seconds", "", "b", "(J)Ljava/lang/String;", "Lv/VText;", "Lv/VText;", "get_promotion_title", "()Lv/VText;", "set_promotion_title", "(Lv/VText;)V", "_promotion_title", "get_promotion_tip", "set_promotion_tip", "_promotion_tip", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_privilege_1", "()Landroid/widget/TextView;", "set_privilege_1", "(Landroid/widget/TextView;)V", "_privilege_1", "d", "get_privilege_2", "set_privilege_2", "_privilege_2", "e", "get_privilege_3", "set_privilege_3", "_privilege_3", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PurchaseTrialSeePrivilegeView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VText _promotion_title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _promotion_tip;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public TextView _privilege_1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _privilege_2;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _privilege_3;

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public PurchaseTrialSeePrivilegeView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m7629a(View view) {
        qab0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final String m7630b(long seconds) {
        if (seconds >= 3600) {
            return ((long) Math.ceil(seconds / 3600.0d)) + "小时";
        }
        return ((long) Math.ceil(seconds / 60.0d)) + "分钟";
    }

    /* JADX INFO: renamed from: c */
    public final void m7631c() {
        long jM6688E = CoreModule.f1534c.f3587Q1.f4106R.m6688E();
        get_promotion_title().setText("试用版-解密谁喜欢我");
        get_promotion_tip().setText("限时配对" + m7630b(jM6688E) + "试用");
        get_privilege_1().setText("与近期新喜欢我的用户限时配对");
        get_privilege_2().setText("限时配对将于试用开始" + m7630b(jM6688E) + "后失效");
        long jM6689F = CoreModule.f1534c.f3587Q1.f4106R.m6689F();
        get_privilege_3().setText("失效配对在" + m7630b(jM6689F) + "内解锁SVIP可恢复");
    }

    @NotNull
    public final TextView get_privilege_1() {
        TextView textView = this._privilege_1;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_privilege_1");
        return null;
    }

    @NotNull
    public final TextView get_privilege_2() {
        TextView textView = this._privilege_2;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_privilege_2");
        return null;
    }

    @NotNull
    public final TextView get_privilege_3() {
        TextView textView = this._privilege_3;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_privilege_3");
        return null;
    }

    @NotNull
    public final VText get_promotion_tip() {
        VText vText = this._promotion_tip;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_promotion_tip");
        return null;
    }

    @NotNull
    public final VText get_promotion_title() {
        VText vText = this._promotion_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_promotion_title");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7629a(this);
    }

    public final void set_privilege_1(@NotNull TextView textView) {
        textView.getClass();
        this._privilege_1 = textView;
    }

    public final void set_privilege_2(@NotNull TextView textView) {
        textView.getClass();
        this._privilege_2 = textView;
    }

    public final void set_privilege_3(@NotNull TextView textView) {
        textView.getClass();
        this._privilege_3 = textView;
    }

    public final void set_promotion_tip(@NotNull VText vText) {
        vText.getClass();
        this._promotion_tip = vText;
    }

    public final void set_promotion_title(@NotNull VText vText) {
        vText.getClass();
        this._promotion_title = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchaseTrialSeePrivilegeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PurchaseTrialSeePrivilegeView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
