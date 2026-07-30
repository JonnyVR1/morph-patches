package com.p051p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveCoverLabel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.dwn;
import p153l.fc2;
import p153l.izs;
import p153l.n3d0;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/intl/view/widgets/IntlLiveNewLabelEView;", "Lv/VLinear;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveCoverLabel;", "data", "", "Q", "(Lcom/p1/mobile/putong/live/base/data/BLiveCoverLabel;)V", "P", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", "imageStart", "Lv/VText;", Constants.INAPP_DATA_TAG, "Lv/VText;", "textView", "Landroid/graphics/drawable/Drawable;", "e", "Landroid/graphics/drawable/Drawable;", "drawableBackground", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlLiveNewLabelEView extends VLinear {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public VDraweeView imageStart;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public VText textView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Drawable drawableBackground;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlLiveNewLabelEView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX INFO: renamed from: P */
    public final void m71518P(BLiveCoverLabel data) {
        removeAllViews();
        setOrientation(0);
        setGravity(16);
        int i = qa00.f156320g;
        int i2 = qa00.f156317d;
        setPadding(i, i2, i, i2);
        String str = data.icon;
        str.getClass();
        if (str.length() > 0) {
            this.imageStart = new VDraweeView(getContext());
            int i3 = qa00.f156324k;
            addView(this.imageStart, new LinearLayout.LayoutParams(i3, i3));
        }
        VText vText = new VText(getContext());
        this.textView = vText;
        vText.setTextSize(2, 10.0f);
        VText vText2 = this.textView;
        if (vText2 != null) {
            vText2.setMaxLines(1);
        }
        VText vText3 = this.textView;
        if (vText3 != null) {
            vText3.setEllipsize(TextUtils.TruncateAt.valueOf("END"));
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        String str2 = data.icon;
        str2.getClass();
        if (str2.length() > 0) {
            layoutParams.setMarginStart(i2);
        }
        addView(this.textView, layoutParams);
    }

    /* JADX INFO: renamed from: Q */
    public final void m71519Q(@NotNull BLiveCoverLabel data) {
        data.getClass();
        removeAllViews();
        setVisibility(0);
        m71518P(data);
        VText vText = this.textView;
        if (vText != null) {
            vText.setText(data.text);
        }
        String str = data.fontColor;
        str.getClass();
        int length = str.length();
        VText vText2 = this.textView;
        if (length > 0) {
            if (vText2 != null) {
                vText2.setTextColor(n3d0.m161283g(data.fontColor));
            }
        } else if (vText2 != null) {
            vText2.setTextColor(-1);
        }
        String str2 = data.icon;
        str2.getClass();
        if (str2.length() > 0) {
            izs.m142868s("context_square", this.imageStart, data.icon);
        }
        dwn dwnVar = dwn.INSTANCE;
        GradientDrawable gradientDrawableM124981k = fc2.m124981k(dwnVar.m118419c(data.background, 0), dwnVar.m118419c(data.background, 1), 6, dwnVar.m118420d(data.linearGradient));
        this.drawableBackground = gradientDrawableM124981k;
        setBackground(gradientDrawableM124981k);
    }
}
