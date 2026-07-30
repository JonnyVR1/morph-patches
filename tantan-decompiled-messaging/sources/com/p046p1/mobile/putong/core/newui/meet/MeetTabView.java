package com.p046p1.mobile.putong.core.newui.meet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import androidx.room.RoomDatabase;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VOnlineIndicator;
import p147v.VText;
import p149l.b7y;
import p149l.ew40;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\fJ\u001d\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006E"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/meet/MeetTabView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "", "text", "k0", "(Ljava/lang/CharSequence;)V", "", "show", "n0", "(Z)V", "i0", "totalCount", "newCount", "l0", "(II)V", "newLikersCount", "j0", "(I)V", "Landroid/view/View;", OMSTemplateModeType.view, "h0", "(Landroid/view/View;)V", "", "count", "m0", "(Ljava/lang/String;)V", "Landroid/widget/TextView;", Constants.INAPP_DATA_TAG, "Landroid/widget/TextView;", "get_title_tv", "()Landroid/widget/TextView;", "set_title_tv", "(Landroid/widget/TextView;)V", "_title_tv", "Landroidx/legacy/widget/Space;", "e", "Landroidx/legacy/widget/Space;", "get_red_dot_reference_point", "()Landroidx/legacy/widget/Space;", "set_red_dot_reference_point", "(Landroidx/legacy/widget/Space;)V", "_red_dot_reference_point", "Lv/VOnlineIndicator;", "f", "Lv/VOnlineIndicator;", "get_red_dot", "()Lv/VOnlineIndicator;", "set_red_dot", "(Lv/VOnlineIndicator;)V", "_red_dot", "Lv/VText;", "g", "Lv/VText;", "get_num_badge_tv", "()Lv/VText;", "set_num_badge_tv", "(Lv/VText;)V", "_num_badge_tv", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class MeetTabView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _title_tv;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public Space _red_dot_reference_point;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VOnlineIndicator _red_dot;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _num_badge_tv;

    public /* synthetic */ MeetTabView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @NotNull
    public final VText get_num_badge_tv() {
        VText vText = this._num_badge_tv;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_num_badge_tv");
        return null;
    }

    @NotNull
    public final VOnlineIndicator get_red_dot() {
        VOnlineIndicator vOnlineIndicator = this._red_dot;
        if (vOnlineIndicator != null) {
            return vOnlineIndicator;
        }
        Intrinsics.m87502r("_red_dot");
        return null;
    }

    @NotNull
    public final Space get_red_dot_reference_point() {
        Space space = this._red_dot_reference_point;
        if (space != null) {
            return space;
        }
        Intrinsics.m87502r("_red_dot_reference_point");
        return null;
    }

    @NotNull
    public final TextView get_title_tv() {
        TextView textView = this._title_tv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_title_tv");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m40497h0(View view) {
        b7y.m100702a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m40498i0() {
        xdl0.m208344M(get_num_badge_tv(), false);
        xdl0.m208344M(get_red_dot(), false);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m40499j0(int newLikersCount) {
        if (newLikersCount > 0) {
            m40502m0(String.valueOf(Math.min(RoomDatabase.MAX_BIND_PARAMETER_CNT, newLikersCount)));
        } else {
            m40498i0();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m40500k0(@NotNull CharSequence text) {
        text.getClass();
        get_title_tv().setText(text);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m40501l0(int totalCount, int newCount) {
        m40498i0();
        if (newCount > 0) {
            if (ew40.m118399k()) {
                m40502m0(String.valueOf(Math.min(RoomDatabase.MAX_BIND_PARAMETER_CNT, newCount)));
                return;
            } else {
                m40503n0(true);
                return;
            }
        }
        if (totalCount <= 0 || !CoreModule.f17545c.f19664m1.m34716j4()) {
            m40503n0(false);
        } else {
            m40503n0(true);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m40502m0(String count) {
        get_num_badge_tv().setText(count);
        xdl0.m208344M(get_num_badge_tv(), true);
        xdl0.m208344M(get_red_dot(), false);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m40503n0(boolean show) {
        xdl0.m208344M(get_red_dot(), show);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40497h0(this);
    }

    public final void set_num_badge_tv(@NotNull VText vText) {
        vText.getClass();
        this._num_badge_tv = vText;
    }

    public final void set_red_dot(@NotNull VOnlineIndicator vOnlineIndicator) {
        vOnlineIndicator.getClass();
        this._red_dot = vOnlineIndicator;
    }

    public final void set_red_dot_reference_point(@NotNull Space space) {
        space.getClass();
        this._red_dot_reference_point = space;
    }

    public final void set_title_tv(@NotNull TextView textView) {
        textView.getClass();
        this._title_tv = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MeetTabView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MeetTabView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MeetTabView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
