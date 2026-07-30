package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.uib0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001e\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\"\u0010%\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\"\u0010-\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$¨\u0006."}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/privilege/PurchaseTrialSeePrivilegeView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "c", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "", "seconds", "", "b", "(J)Ljava/lang/String;", "Lv/VText;", "Lv/VText;", "get_promotion_title", "()Lv/VText;", "set_promotion_title", "(Lv/VText;)V", "_promotion_title", "get_promotion_tip", "set_promotion_tip", "_promotion_tip", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_privilege_1", "()Landroid/widget/TextView;", "set_privilege_1", "(Landroid/widget/TextView;)V", "_privilege_1", Constants.INAPP_DATA_TAG, "get_privilege_2", "set_privilege_2", "_privilege_2", "e", "get_privilege_3", "set_privilege_3", "_privilege_3", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PurchaseTrialSeePrivilegeView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m55477a(View view) {
        uib0.m196150a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final String m55478b(long seconds) {
        if (seconds >= 3600) {
            return ((long) Math.ceil(seconds / 3600.0d)) + "小时";
        }
        return ((long) Math.ceil(seconds / 60.0d)) + "分钟";
    }

    /* JADX INFO: renamed from: c */
    public final void m55479c() {
        long jM35754E = CoreModule.f18264c.f20340Q1.f20859R.m35754E();
        get_promotion_title().setText("试用版-解密谁喜欢我");
        get_promotion_tip().setText("限时配对" + m55478b(jM35754E) + "试用");
        get_privilege_1().setText("与近期新喜欢我的用户限时配对");
        get_privilege_2().setText("限时配对将于试用开始" + m55478b(jM35754E) + "后失效");
        long jM35755F = CoreModule.f18264c.f20340Q1.f20859R.m35755F();
        get_privilege_3().setText("失效配对在" + m55478b(jM35755F) + "内解锁SVIP可恢复");
    }

    @NotNull
    public final TextView get_privilege_1() {
        TextView textView = this._privilege_1;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_privilege_1");
        return null;
    }

    @NotNull
    public final TextView get_privilege_2() {
        TextView textView = this._privilege_2;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_privilege_2");
        return null;
    }

    @NotNull
    public final TextView get_privilege_3() {
        TextView textView = this._privilege_3;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_privilege_3");
        return null;
    }

    @NotNull
    public final VText get_promotion_tip() {
        VText vText = this._promotion_tip;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_promotion_tip");
        return null;
    }

    @NotNull
    public final VText get_promotion_title() {
        VText vText = this._promotion_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_promotion_title");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55477a(this);
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
