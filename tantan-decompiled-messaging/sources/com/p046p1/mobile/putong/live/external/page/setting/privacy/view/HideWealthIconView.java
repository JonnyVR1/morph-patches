package com.p046p1.mobile.putong.live.external.page.setting.privacy.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.external.page.setting.privacy.view.HideWealthIconView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.e2l;
import p149l.gn80;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/page/setting/privacy/view/HideWealthIconView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll/e2l;", "model", "", "i0", "(Ll/e2l;)V", Constants.INAPP_DATA_TAG, "Ll/e2l;", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class HideWealthIconView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public e2l model;

    public /* synthetic */ HideWealthIconView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m70798h0(HideWealthIconView hideWealthIconView, View view) {
        e2l e2lVar = hideWealthIconView.model;
        e2l e2lVar2 = null;
        if (e2lVar == null) {
            Intrinsics.m87502r("model");
            e2lVar = null;
        }
        gn80 gn80VarM194544H = e2lVar.m194544H();
        e2l e2lVar3 = hideWealthIconView.model;
        if (e2lVar3 == null) {
            Intrinsics.m87502r("model");
        } else {
            e2lVar2 = e2lVar3;
        }
        gn80VarM194544H.mo127116a(e2lVar2);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m70799i0(@NotNull e2l model) {
        model.getClass();
        this.model = model;
        setOnClickListener(new View.OnClickListener() { // from class: l.f2l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HideWealthIconView.m70798h0(this.f94221a, view);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HideWealthIconView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HideWealthIconView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HideWealthIconView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
