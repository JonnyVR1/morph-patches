package com.p046p1.mobile.putong.live.livingroom.intl.gift;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftCombosGears;
import p149l.i3c0;
import p149l.ihs;
import p149l.mlo;
import p149l.xxj;

/* JADX INFO: loaded from: classes4.dex */
public class IntlMultipleGiftItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public IntlMultipleGiftItemView f51034a;

    /* JADX INFO: renamed from: b */
    public ImageView f51035b;

    /* JADX INFO: renamed from: c */
    public TextView f51036c;

    /* JADX INFO: renamed from: d */
    public BLiveGiftCombosGears f51037d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class IntlContinueType {
        private static final /* synthetic */ IntlContinueType[] $VALUES = $values();
        public static final IntlContinueType LARGE;
        public static final IntlContinueType MIDDLE;
        public static final IntlContinueType SMALL;

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftItemView$IntlContinueType$1 */
        public final enum C128781 extends IntlContinueType {
            private C128781(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftItemView.IntlContinueType
            public int getBgRes() {
                return i3c0.f110965c3;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftItemView$IntlContinueType$2 */
        public final enum C128792 extends IntlContinueType {
            private C128792(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftItemView.IntlContinueType
            public int getBgRes() {
                return i3c0.f110977d3;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftItemView$IntlContinueType$3 */
        public final enum C128803 extends IntlContinueType {
            private C128803(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftItemView.IntlContinueType
            public int getBgRes() {
                return i3c0.f110953b3;
            }
        }

        private static /* synthetic */ IntlContinueType[] $values() {
            return new IntlContinueType[]{SMALL, MIDDLE, LARGE};
        }

        static {
            SMALL = new C128781("SMALL", 0);
            MIDDLE = new C128792("MIDDLE", 1);
            LARGE = new C128803("LARGE", 2);
        }

        public static IntlContinueType valueOf(String str) {
            return (IntlContinueType) Enum.valueOf(IntlContinueType.class, str);
        }

        public static IntlContinueType[] values() {
            return (IntlContinueType[]) $VALUES.clone();
        }

        public abstract int getBgRes();

        private IntlContinueType(String str, int i) {
            super(str, i);
        }
    }

    public IntlMultipleGiftItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m75346a(View view) {
        mlo.m155168a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m75347b(IntlContinueType intlContinueType) {
        this.f51035b.setBackgroundResource(intlContinueType.getBgRes());
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: c */
    public void m75348c(BLiveGiftCombosGears bLiveGiftCombosGears, ihs ihsVar) {
        this.f51037d = bLiveGiftCombosGears;
        this.f51036c.setText(String.valueOf(bLiveGiftCombosGears.combosHitNum));
    }

    public BLiveGiftCombosGears getGears() {
        return this.f51037d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75346a(this);
        xxj.m211504e(this.f51036c, Typeface.DEFAULT_BOLD);
        this.f51036c.getPaint().setFakeBoldText(true);
    }

    public IntlMultipleGiftItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlMultipleGiftItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
