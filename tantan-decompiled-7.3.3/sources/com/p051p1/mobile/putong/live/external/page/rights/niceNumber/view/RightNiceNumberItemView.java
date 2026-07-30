package com.p051p1.mobile.putong.live.external.page.rights.niceNumber.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.page.rights.niceNumber.view.RightNiceNumberItemView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.bnl0;
import p153l.ccd0;
import p153l.fcd0;
import p153l.m9c0;
import p153l.n3d0;
import p153l.nbc0;
import p153l.o1j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\fR\"\u0010 \u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/page/rights/niceNumber/view/RightNiceNumberItemView;", "Lv/VText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "", "number", "Ll/ccd0;", "actionListener", "q", "(Ljava/lang/String;Ll/ccd0;)V", "p", "r", "Landroid/view/View;", OMSTemplateModeType.view, "o", "(Landroid/view/View;)V", BLiveStormDanmakuGiftResourceType.f45294s, RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/live/external/page/rights/niceNumber/view/RightNiceNumberItemView;", "get_root", "()Lcom/p1/mobile/putong/live/external/page/rights/niceNumber/view/RightNiceNumberItemView;", "set_root", "(Lcom/p1/mobile/putong/live/external/page/rights/niceNumber/view/RightNiceNumberItemView;)V", "_root", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class RightNiceNumberItemView extends VText {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public RightNiceNumberItemView _root;

    public /* synthetic */ RightNiceNumberItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: l */
    public static void m71844l(ccd0 ccd0Var, RightNiceNumberItemView rightNiceNumberItemView, View view) {
        if (!ccd0Var.mo71861a()) {
            o1j0.m165649w(R$string.f45752h0);
        } else {
            ccd0Var.mo71862b(rightNiceNumberItemView);
            rightNiceNumberItemView.m71849s();
        }
    }

    @NotNull
    public final RightNiceNumberItemView get_root() {
        RightNiceNumberItemView rightNiceNumberItemView = this._root;
        if (rightNiceNumberItemView != null) {
            return rightNiceNumberItemView;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final void m71845o(View view) {
        fcd0.m125006a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71845o(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m71846p() {
        m71848r();
        bnl0.m105525M0(this, false);
        bnl0.m105509E0(this, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m71847q(@NotNull String number, @NotNull final ccd0 actionListener) {
        number.getClass();
        actionListener.getClass();
        bnl0.m105525M0(this, true);
        m71848r();
        setText(number);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.ecd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RightNiceNumberItemView.m71844l(actionListener, this, view);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m71848r() {
        setTextColor(n3d0.m161277a(m9c0.f135386k));
        setBackgroundResource(nbc0.f141203u0);
    }

    /* JADX INFO: renamed from: s */
    public final void m71849s() {
        setTextColor(n3d0.m161277a(m9c0.f135389n));
        setBackgroundResource(nbc0.f141163h);
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
