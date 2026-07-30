package com.p046p1.mobile.putong.live.external.page.rights.niceNumber.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.page.rights.niceNumber.view.RightNiceNumberItemView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.c4d0;
import p149l.g1c0;
import p149l.h3c0;
import p149l.kvc0;
import p149l.lsi0;
import p149l.xdl0;
import p149l.z3d0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\fR\"\u0010 \u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/page/rights/niceNumber/view/RightNiceNumberItemView;", "Lv/VText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "", "number", "Ll/z3d0;", "actionListener", "q", "(Ljava/lang/String;Ll/z3d0;)V", "p", "r", "Landroid/view/View;", OMSTemplateModeType.view, "o", "(Landroid/view/View;)V", BLiveStormDanmakuGiftResourceType.f44446s, RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/live/external/page/rights/niceNumber/view/RightNiceNumberItemView;", "get_root", "()Lcom/p1/mobile/putong/live/external/page/rights/niceNumber/view/RightNiceNumberItemView;", "set_root", "(Lcom/p1/mobile/putong/live/external/page/rights/niceNumber/view/RightNiceNumberItemView;)V", "_root", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class RightNiceNumberItemView extends VText {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public RightNiceNumberItemView _root;

    public /* synthetic */ RightNiceNumberItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: l */
    public static void m70661l(z3d0 z3d0Var, RightNiceNumberItemView rightNiceNumberItemView, View view) {
        if (!z3d0Var.mo70678a()) {
            lsi0.m151593w(R$string.f44904h0);
        } else {
            z3d0Var.mo70679b(rightNiceNumberItemView);
            rightNiceNumberItemView.m70666s();
        }
    }

    @NotNull
    public final RightNiceNumberItemView get_root() {
        RightNiceNumberItemView rightNiceNumberItemView = this._root;
        if (rightNiceNumberItemView != null) {
            return rightNiceNumberItemView;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final void m70662o(View view) {
        c4d0.m105213a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70662o(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m70663p() {
        m70665r();
        xdl0.m208345M0(this, false);
        xdl0.m208329E0(this, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m70664q(@NotNull String number, @NotNull final z3d0 actionListener) {
        number.getClass();
        actionListener.getClass();
        xdl0.m208345M0(this, true);
        m70665r();
        setText(number);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.b4d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RightNiceNumberItemView.m70661l(actionListener, this, view);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m70665r() {
        setTextColor(kvc0.m147352a(g1c0.f100156k));
        setBackgroundResource(h3c0.f105712u0);
    }

    /* JADX INFO: renamed from: s */
    public final void m70666s() {
        setTextColor(kvc0.m147352a(g1c0.f100159n));
        setBackgroundResource(h3c0.f105672h);
    }

    public final void set_root(@NotNull RightNiceNumberItemView rightNiceNumberItemView) {
        rightNiceNumberItemView.getClass();
        this._root = rightNiceNumberItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RightNiceNumberItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RightNiceNumberItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RightNiceNumberItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
