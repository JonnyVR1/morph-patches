package com.p051p1.mobile.putong.core.newui.intlmeet.likers.items;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeTurboItem;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p153l.gta;
import p153l.qeo;
import p153l.uqb0;
import p153l.x20;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u000eR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/intlmeet/likers/items/IntlMeetFakeTurboItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "k0", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "l0", "(Lcom/p1/mobile/android/app/Act;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/view/View;", OMSTemplateModeType.view, "i0", "(Landroid/view/View;)V", "j0", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "get_icon", "()Lv/VDraweeView;", "set_icon", "(Lv/VDraweeView;)V", "_icon", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "get_desc", "()Landroid/widget/TextView;", "set_desc", "(Landroid/widget/TextView;)V", "_desc", "", "f", "Ljava/lang/String;", "TURBO_ICON_URL", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlMeetFakeTurboItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _desc;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String TURBO_ICON_URL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlMeetFakeTurboItem(@NotNull Context context) {
        super(context);
        context.getClass();
        this.TURBO_ICON_URL = "https://auto.tancdn.com/v1/images/eyJpZCI6IkY0VVBNQUNKNUhQNUU2MlNYT0tTSFVQR0daNlU0TzEzIiwidyI6Mjg0LCJoIjozNDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjYyMjA5ODE3OTkwNTA4MTkxfQ.png";
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m40400m0(IntlMeetFakeTurboItem intlMeetFakeTurboItem) {
        intlMeetFakeTurboItem.m40402j0();
    }

    @NotNull
    public final TextView get_desc() {
        TextView textView = this._desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_desc");
        return null;
    }

    @NotNull
    public final VDraweeView get_icon() {
        VDraweeView vDraweeView = this._icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_icon");
        return null;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m40401i0(View view) {
        qeo.m176258a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m40402j0() {
        if (CoreModule.f18264c.f20318J0.m156766F3()) {
            setAlpha(0.3f);
        } else {
            setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m40403k0() {
        uqb0.f180374G.m127115L0(get_icon(), this.TURBO_ICON_URL);
        m40402j0();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m40404l0(@Nullable Act act) {
        if (act == null || act.isFinishing() || act.isDestroyed()) {
            return;
        }
        gta.m132210e().m132214d().mo34744Qg(act, false, new x20() { // from class: l.peo
            @Override // p153l.x20
            public final void call() {
                IntlMeetFakeTurboItem.m40400m0(this.f152113a);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40401i0(this);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
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
    public IntlMeetFakeTurboItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.TURBO_ICON_URL = "https://auto.tancdn.com/v1/images/eyJpZCI6IkY0VVBNQUNKNUhQNUU2MlNYT0tTSFVQR0daNlU0TzEzIiwidyI6Mjg0LCJoIjozNDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjYyMjA5ODE3OTkwNTA4MTkxfQ.png";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlMeetFakeTurboItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.TURBO_ICON_URL = "https://auto.tancdn.com/v1/images/eyJpZCI6IkY0VVBNQUNKNUhQNUU2MlNYT0tTSFVQR0daNlU0TzEzIiwidyI6Mjg0LCJoIjozNDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjYyMjA5ODE3OTkwNTA4MTkxfQ.png";
    }
}
