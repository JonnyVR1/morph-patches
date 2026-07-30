package com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroupKt;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b3c0;
import p149l.pe5;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b3\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u000eR\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010+\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010\u001d\"\u0004\b*\u0010\u001fR\"\u0010/\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010\u001b\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR\"\u00103\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010\u001b\u001a\u0004\b1\u0010\u001d\"\u0004\b2\u0010\u001fR\"\u00107\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010\u001b\u001a\u0004\b5\u0010\u001d\"\u0004\b6\u0010\u001fR\"\u0010;\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010\u001b\u001a\u0004\b9\u0010\u001d\"\u0004\b:\u0010\u001fR\"\u0010?\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010\"\u001a\u0004\b=\u0010$\"\u0004\b>\u0010&R\"\u0010C\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010\u001b\u001a\u0004\bA\u0010\u001d\"\u0004\bB\u0010\u001fR\"\u0010G\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010\u001b\u001a\u0004\bE\u0010\u001d\"\u0004\bF\u0010\u001fR\"\u0010K\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010\u001b\u001a\u0004\bI\u0010\u001d\"\u0004\bJ\u0010\u001fR\"\u0010O\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010\u001b\u001a\u0004\bM\u0010\u001d\"\u0004\bN\u0010\u001fR\"\u0010S\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010\u001b\u001a\u0004\bQ\u0010\u001d\"\u0004\bR\u0010\u001f¨\u0006T"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/superlikeopt/upgrade/ComboNumView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "a", "(Landroid/view/View;)V", "onFinishInflate", "()V", "c", "num", "b", "(I)V", "Landroid/view/View;", "get_white_bg", "()Landroid/view/View;", "set_white_bg", "_white_bg", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "get_nums", "()Landroid/widget/ImageView;", "set_nums", "(Landroid/widget/ImageView;)V", "_nums", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "get_digits_bg", "()Landroid/widget/LinearLayout;", "set_digits_bg", "(Landroid/widget/LinearLayout;)V", "_digits_bg", Constants.INAPP_DATA_TAG, "get_digits_bg_thousands_bg", "set_digits_bg_thousands_bg", "_digits_bg_thousands_bg", "e", "get_digits_bg_hundreds_bg", "set_digits_bg_hundreds_bg", "_digits_bg_hundreds_bg", "f", "get_digits_bg_tens_bg", "set_digits_bg_tens_bg", "_digits_bg_tens_bg", "g", "get_digits_bg_ones_bg", "set_digits_bg_ones_bg", "_digits_bg_ones_bg", "h", "get_digits_bg_plus_bg", "set_digits_bg_plus_bg", "_digits_bg_plus_bg", RXScreenCaptureService.KEY_INDEX, "get_digits", "set_digits", "_digits", "j", "get_digits_thousands", "set_digits_thousands", "_digits_thousands", "k", "get_digits_hundreds", "set_digits_hundreds", "_digits_hundreds", BLiveStormDanmakuGiftResourceType.f44444l, "get_digits_tens", "set_digits_tens", "_digits_tens", "m", "get_digits_ones", "set_digits_ones", "_digits_ones", "n", "get_digits_plus", "set_digits_plus", "_digits_plus", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ComboNumView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public View _white_bg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public ImageView _nums;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public LinearLayout _digits_bg;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ImageView _digits_bg_thousands_bg;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public ImageView _digits_bg_hundreds_bg;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ImageView _digits_bg_tens_bg;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public ImageView _digits_bg_ones_bg;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public ImageView _digits_bg_plus_bg;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public LinearLayout _digits;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public ImageView _digits_thousands;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public ImageView _digits_hundreds;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public ImageView _digits_tens;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public ImageView _digits_ones;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public ImageView _digits_plus;

    public /* synthetic */ ComboNumView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public final void m55764a(View view) {
        pe5.m168502a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m55765b(int num) {
        C8910a.Companion companion = C8910a.INSTANCE;
        if (num <= companion.m55813a().size()) {
            xdl0.m208344M(get_nums(), true);
            xdl0.m208344M(get_digits_bg(), false);
            xdl0.m208344M(get_digits(), false);
            Integer num2 = companion.m55813a().get(Integer.valueOf(num));
            if (num2 != null) {
                get_nums().setImageResource(num2.intValue());
            }
            get_white_bg().getLayoutParams().width = t100.f167266o;
            return;
        }
        xdl0.m208344M(get_nums(), false);
        xdl0.m208344M(get_digits_bg(), true);
        xdl0.m208344M(get_digits(), true);
        ArrayList arrayList = new ArrayList();
        for (int i = num >= 10000 ? 9999 : num; i > 0; i /= 10) {
            arrayList.add(Integer.valueOf(i % 10));
        }
        if (num > 0) {
            get_white_bg().getLayoutParams().width = t100.f167266o;
            int iIntValue = ((Number) arrayList.get(0)).intValue();
            xdl0.m208344M(get_digits_ones(), true);
            xdl0.m208344M(get_digits_bg_ones_bg(), true);
            xdl0.m208358V(get_digits_ones(), 0);
            xdl0.m208358V(get_digits_bg_ones_bg(), 0);
            C8910a.Companion companion2 = C8910a.INSTANCE;
            Integer num3 = companion2.m55815c().get(Integer.valueOf(iIntValue));
            if (num3 != null) {
                get_digits_ones().setImageResource(num3.intValue());
            }
            Integer num4 = companion2.m55814b().get(Integer.valueOf(iIntValue));
            if (num4 != null) {
                get_digits_bg_ones_bg().setImageResource(num4.intValue());
            }
            if (!(num / 10 > 0)) {
                xdl0.m208344M(get_digits_tens(), false);
                xdl0.m208344M(get_digits_bg_tens_bg(), false);
                return;
            }
            get_white_bg().getLayoutParams().width = t100.m186890d(47.0f);
            int iIntValue2 = ((Number) arrayList.get(1)).intValue();
            xdl0.m208344M(get_digits_tens(), true);
            xdl0.m208344M(get_digits_bg_tens_bg(), true);
            xdl0.m208358V(get_digits_tens(), 0);
            xdl0.m208358V(get_digits_bg_tens_bg(), 0);
            xdl0.m208358V(get_digits_ones(), t100.m186890d(-13.0f));
            xdl0.m208358V(get_digits_bg_ones_bg(), t100.m186890d(-13.0f));
            Integer num5 = companion2.m55815c().get(Integer.valueOf(iIntValue2));
            if (num5 != null) {
                get_digits_tens().setImageResource(num5.intValue());
            }
            Integer num6 = companion2.m55814b().get(Integer.valueOf(iIntValue2));
            if (num6 != null) {
                get_digits_bg_tens_bg().setImageResource(num6.intValue());
            }
            if (!(num / 100 > 0)) {
                xdl0.m208344M(get_digits_hundreds(), false);
                xdl0.m208344M(get_digits_bg_hundreds_bg(), false);
                return;
            }
            get_white_bg().getLayoutParams().width = t100.m186890d(74.0f);
            int iIntValue3 = ((Number) arrayList.get(2)).intValue();
            xdl0.m208344M(get_digits_hundreds(), true);
            xdl0.m208344M(get_digits_bg_hundreds_bg(), true);
            xdl0.m208358V(get_digits_hundreds(), 0);
            xdl0.m208358V(get_digits_bg_hundreds_bg(), 0);
            xdl0.m208358V(get_digits_tens(), t100.m186890d(-13.0f));
            xdl0.m208358V(get_digits_bg_tens_bg(), t100.m186890d(-13.0f));
            Integer num7 = companion2.m55815c().get(Integer.valueOf(iIntValue3));
            if (num7 != null) {
                get_digits_hundreds().setImageResource(num7.intValue());
            }
            Integer num8 = companion2.m55814b().get(Integer.valueOf(iIntValue3));
            if (num8 != null) {
                get_digits_bg_hundreds_bg().setImageResource(num8.intValue());
            }
            if (!(num / 1000 > 0)) {
                xdl0.m208344M(get_digits_thousands(), false);
                xdl0.m208344M(get_digits_bg_thousands_bg(), false);
                return;
            }
            get_white_bg().getLayoutParams().width = t100.m186890d(101.0f);
            int iIntValue4 = ((Number) arrayList.get(3)).intValue();
            xdl0.m208344M(get_digits_thousands(), true);
            xdl0.m208344M(get_digits_bg_thousands_bg(), true);
            xdl0.m208358V(get_digits_thousands(), 0);
            xdl0.m208358V(get_digits_bg_thousands_bg(), 0);
            xdl0.m208358V(get_digits_hundreds(), t100.m186890d(-13.0f));
            xdl0.m208358V(get_digits_bg_hundreds_bg(), t100.m186890d(-13.0f));
            Integer num9 = companion2.m55815c().get(Integer.valueOf(iIntValue4));
            if (num9 != null) {
                get_digits_thousands().setImageResource(num9.intValue());
            }
            Integer num10 = companion2.m55814b().get(Integer.valueOf(iIntValue4));
            if (num10 != null) {
                get_digits_bg_thousands_bg().setImageResource(num10.intValue());
            }
            if (!(num / 10000 > 0)) {
                xdl0.m208344M(get_digits_plus(), false);
                xdl0.m208344M(get_digits_bg_plus_bg(), false);
                return;
            }
            get_white_bg().getLayoutParams().width = t100.m186890d(128.0f);
            xdl0.m208344M(get_digits_plus(), true);
            xdl0.m208344M(get_digits_bg_plus_bg(), true);
            get_digits_plus().setImageResource(b3c0.f72865G2);
            get_digits_bg_thousands_bg().setImageResource(b3c0.f72858F2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m55766c() {
        Integer num = C8910a.INSTANCE.m55813a().get(1);
        if (num != null) {
            get_nums().setImageResource(num.intValue());
        }
        xdl0.m208344M(get_nums(), true);
        xdl0.m208344M(get_digits_bg(), false);
        xdl0.m208344M(get_digits(), false);
        get_white_bg().getLayoutParams().width = t100.f167266o;
        get_white_bg().getLayoutParams().height = getHeight() / 2;
        Iterator<View> it = ViewGroupKt.m1329b(get_digits_bg()).iterator();
        while (it.hasNext()) {
            xdl0.m208344M(it.next(), false);
        }
        Iterator<View> it2 = ViewGroupKt.m1329b(get_digits()).iterator();
        while (it2.hasNext()) {
            xdl0.m208344M(it2.next(), false);
        }
    }

    @NotNull
    public final LinearLayout get_digits() {
        LinearLayout linearLayout = this._digits;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_digits");
        return null;
    }

    @NotNull
    public final LinearLayout get_digits_bg() {
        LinearLayout linearLayout = this._digits_bg;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_digits_bg");
        return null;
    }

    @NotNull
    public final ImageView get_digits_bg_hundreds_bg() {
        ImageView imageView = this._digits_bg_hundreds_bg;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_digits_bg_hundreds_bg");
        return null;
    }

    @NotNull
    public final ImageView get_digits_bg_ones_bg() {
        ImageView imageView = this._digits_bg_ones_bg;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_digits_bg_ones_bg");
        return null;
    }

    @NotNull
    public final ImageView get_digits_bg_plus_bg() {
        ImageView imageView = this._digits_bg_plus_bg;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_digits_bg_plus_bg");
        return null;
    }

    @NotNull
    public final ImageView get_digits_bg_tens_bg() {
        ImageView imageView = this._digits_bg_tens_bg;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_digits_bg_tens_bg");
        return null;
    }

    @NotNull
    public final ImageView get_digits_bg_thousands_bg() {
        ImageView imageView = this._digits_bg_thousands_bg;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_digits_bg_thousands_bg");
        return null;
    }

    @NotNull
    public final ImageView get_digits_hundreds() {
        ImageView imageView = this._digits_hundreds;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_digits_hundreds");
        return null;
    }

    @NotNull
    public final ImageView get_digits_ones() {
        ImageView imageView = this._digits_ones;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_digits_ones");
        return null;
    }

    @NotNull
    public final ImageView get_digits_plus() {
        ImageView imageView = this._digits_plus;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_digits_plus");
        return null;
    }

    @NotNull
    public final ImageView get_digits_tens() {
        ImageView imageView = this._digits_tens;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_digits_tens");
        return null;
    }

    @NotNull
    public final ImageView get_digits_thousands() {
        ImageView imageView = this._digits_thousands;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_digits_thousands");
        return null;
    }

    @NotNull
    public final ImageView get_nums() {
        ImageView imageView = this._nums;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_nums");
        return null;
    }

    @NotNull
    public final View get_white_bg() {
        View view = this._white_bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_white_bg");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55764a(this);
    }

    public final void set_digits(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._digits = linearLayout;
    }

    public final void set_digits_bg(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._digits_bg = linearLayout;
    }

    public final void set_digits_bg_hundreds_bg(@NotNull ImageView imageView) {
        imageView.getClass();
        this._digits_bg_hundreds_bg = imageView;
    }

    public final void set_digits_bg_ones_bg(@NotNull ImageView imageView) {
        imageView.getClass();
        this._digits_bg_ones_bg = imageView;
    }

    public final void set_digits_bg_plus_bg(@NotNull ImageView imageView) {
        imageView.getClass();
        this._digits_bg_plus_bg = imageView;
    }

    public final void set_digits_bg_tens_bg(@NotNull ImageView imageView) {
        imageView.getClass();
        this._digits_bg_tens_bg = imageView;
    }

    public final void set_digits_bg_thousands_bg(@NotNull ImageView imageView) {
        imageView.getClass();
        this._digits_bg_thousands_bg = imageView;
    }

    public final void set_digits_hundreds(@NotNull ImageView imageView) {
        imageView.getClass();
        this._digits_hundreds = imageView;
    }

    public final void set_digits_ones(@NotNull ImageView imageView) {
        imageView.getClass();
        this._digits_ones = imageView;
    }

    public final void set_digits_plus(@NotNull ImageView imageView) {
        imageView.getClass();
        this._digits_plus = imageView;
    }

    public final void set_digits_tens(@NotNull ImageView imageView) {
        imageView.getClass();
        this._digits_tens = imageView;
    }

    public final void set_digits_thousands(@NotNull ImageView imageView) {
        imageView.getClass();
        this._digits_thousands = imageView;
    }

    public final void set_nums(@NotNull ImageView imageView) {
        imageView.getClass();
        this._nums = imageView;
    }

    public final void set_white_bg(@NotNull View view) {
        view.getClass();
        this._white_bg = view;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ComboNumView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ComboNumView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ComboNumView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
