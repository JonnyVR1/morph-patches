package com.p051p1.mobile.putong.live.external.page.setting.privacy.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.external.page.setting.privacy.view.HideWealthIconView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.kv80;
import p153l.u4l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/page/setting/privacy/view/HideWealthIconView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll/u4l;", "model", "", "i0", "(Ll/u4l;)V", Constants.INAPP_DATA_TAG, "Ll/u4l;", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class HideWealthIconView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public u4l model;

    public /* synthetic */ HideWealthIconView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m71981h0(HideWealthIconView hideWealthIconView, View view) {
        u4l u4lVar = hideWealthIconView.model;
        u4l u4lVar2 = null;
        if (u4lVar == null) {
            Intrinsics.m88391r("model");
            u4lVar = null;
        }
        kv80 kv80VarM217585H = u4lVar.m217585H();
        u4l u4lVar3 = hideWealthIconView.model;
        if (u4lVar3 == null) {
            Intrinsics.m88391r("model");
        } else {
            u4lVar2 = u4lVar3;
        }
        kv80VarM217585H.mo151654a(u4lVar2);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m71982i0(@NotNull u4l model) {
        model.getClass();
        this.model = model;
        setOnClickListener(new View.OnClickListener() { // from class: l.v4l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HideWealthIconView.m71981h0(this.f182382a, view);
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
