package com.p000p1.mobile.putong.core.p004ui.seepage.likers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.seepage.likers.IntlFakeTurboItem;
import com.p1.mobile.android.app.Act;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.d30;
import l.j760;
import l.lcn;
import l.vwb;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.qib0;
import p006l.ura;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0012\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010\u0011R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082D¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/p1/mobile/putong/core/ui/seepage/likers/IntlFakeTurboItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "j0", "()V", "position", "l0", "(I)V", "onFinishInflate", "k0", "Lcom/p1/mobile/android/app/Act;", "act", "n0", "(ILcom/p1/mobile/android/app/Act;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/view/View;", "view", "i0", "(Landroid/view/View;)V", "m0", "Lv/VDraweeView;", "d", "Lv/VDraweeView;", "get_icon", "()Lv/VDraweeView;", "set_icon", "(Lv/VDraweeView;)V", "_icon", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "get_desc", "()Landroid/widget/TextView;", "set_desc", "(Landroid/widget/TextView;)V", "_desc", "", "f", "Ljava/lang/String;", "TURBO_ICON_URL", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntlFakeTurboItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _desc;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String TURBO_ICON_URL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlFakeTurboItem(@NotNull Context context) {
        super(context);
        context.getClass();
        this.TURBO_ICON_URL = "https://auto.tancdn.com/v1/images/eyJpZCI6IkY0VVBNQUNKNUhQNUU2MlNYT0tTSFVQR0daNlU0TzEzIiwidyI6Mjg0LCJoIjozNDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjYyMjA5ODE3OTkwNTA4MTkxfQ.png";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    private final void m8338j0() {
        if (CoreModule.f1534c.f3565J0.m17204F3()) {
            setAlpha(0.3f);
        } else {
            setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: l0 */
    private final void m8339l0(int position) {
        zvf0.u("e_intl_plm_turbo_card", "p_intl_plm", new j760[]{vwb.Y("plm_list", Integer.valueOf(position))});
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m8340o0(IntlFakeTurboItem intlFakeTurboItem) {
        intlFakeTurboItem.m8338j0();
    }

    @NotNull
    public final TextView get_desc() {
        TextView textView = this._desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_desc");
        return null;
    }

    @NotNull
    public final VDraweeView get_icon() {
        VDraweeView vDraweeView = this._icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_icon");
        return null;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m8341i0(View view) {
        lcn.a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m8342k0(int position) {
        qib0.f19782G.m12744L0(get_icon(), this.TURBO_ICON_URL);
        m8338j0();
        m8343m0(position);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m8343m0(int position) {
        zvf0.A("e_intl_plm_turbo_card", "p_intl_plm", new j760[]{vwb.Y("plm_list", Integer.valueOf(position))});
    }

    /* JADX INFO: renamed from: n0 */
    public final void m8344n0(int position, @Nullable Act act) {
        if (act == null || act.isFinishing() || act.isDestroyed()) {
            return;
        }
        m8339l0(position);
        ura.m25555e().m25559d().m5678Qg(act, false, new d30() { // from class: l.kcn
            public final void call() {
                IntlFakeTurboItem.m8340o0(this.f15745a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8341i0(this);
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(widthMeasureSpec) * 1.33f), 1073741824));
    }

    public final void set_desc(@NotNull TextView textView) {
        textView.getClass();
        this._desc = textView;
    }

    public final void set_icon(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._icon = vDraweeView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlFakeTurboItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.TURBO_ICON_URL = "https://auto.tancdn.com/v1/images/eyJpZCI6IkY0VVBNQUNKNUhQNUU2MlNYT0tTSFVQR0daNlU0TzEzIiwidyI6Mjg0LCJoIjozNDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjYyMjA5ODE3OTkwNTA4MTkxfQ.png";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlFakeTurboItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.TURBO_ICON_URL = "https://auto.tancdn.com/v1/images/eyJpZCI6IkY0VVBNQUNKNUhQNUU2MlNYT0tTSFVQR0daNlU0TzEzIiwidyI6Mjg0LCJoIjozNDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjYyMjA5ODE3OTkwNTA4MTkxfQ.png";
    }
}
