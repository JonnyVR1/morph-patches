package com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.gjl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010&\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019¨\u0006'"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardMainlandFooter;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "r", "()V", "onFinishInflate", "i0", "Landroid/view/View;", OMSTemplateModeType.view, "h0", "(Landroid/view/View;)V", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", "get_left", "()Lv/VImage;", "set_left", "(Lv/VImage;)V", "_left", "Lv/VText;", "e", "Lv/VText;", "get_text", "()Lv/VText;", "set_text", "(Lv/VText;)V", "_text", "f", "get_right", "set_right", "_right", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class HourBoardMainlandFooter extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage _left;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _text;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VImage _right;

    public /* synthetic */ HourBoardMainlandFooter(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: r */
    private final void m76032r() {
        bnl0.m105507D0((int) (bnl0.m105592y0() * 0.53866667f), get_text());
    }

    @NotNull
    public final VImage get_left() {
        VImage vImage = this._left;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_left");
        return null;
    }

    @NotNull
    public final VImage get_right() {
        VImage vImage = this._right;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_right");
        return null;
    }

    @NotNull
    public final VText get_text() {
        VText vText = this._text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_text");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m76033h0(View view) {
        gjl.m130521a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m76034i0() {
        bnl0.m105524M(get_left(), false);
        bnl0.m105524M(get_right(), false);
        get_text().setText("已经到底了");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76033h0(this);
        m76032r();
    }

    public final void set_left(@NotNull VImage vImage) {
        vImage.getClass();
        this._left = vImage;
    }

    public final void set_right(@NotNull VImage vImage) {
        vImage.getClass();
        this._right = vImage;
    }

    public final void set_text(@NotNull VText vText) {
        vText.getClass();
        this._text = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardMainlandFooter(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardMainlandFooter(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardMainlandFooter(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
