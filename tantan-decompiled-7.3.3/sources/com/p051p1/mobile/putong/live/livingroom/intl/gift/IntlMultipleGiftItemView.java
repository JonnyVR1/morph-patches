package com.p051p1.mobile.putong.live.livingroom.intl.gift;

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
import com.p051p1.mobile.putong.live.base.data.BLiveGiftCombosGears;
import p153l.jjs;
import p153l.mno;
import p153l.n0k;
import p153l.obc0;

/* JADX INFO: loaded from: classes5.dex */
public class IntlMultipleGiftItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public IntlMultipleGiftItemView f51882a;

    /* JADX INFO: renamed from: b */
    public ImageView f51883b;

    /* JADX INFO: renamed from: c */
    public TextView f51884c;

    /* JADX INFO: renamed from: d */
    public BLiveGiftCombosGears f51885d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class IntlContinueType {
        private static final /* synthetic */ IntlContinueType[] $VALUES = $values();
        public static final IntlContinueType LARGE;
        public static final IntlContinueType MIDDLE;
        public static final IntlContinueType SMALL;

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftItemView$IntlContinueType$1 */
        public final enum C130411 extends IntlContinueType {
            private C130411(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftItemView.IntlContinueType
            public int getBgRes() {
                return obc0.f146293c3;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftItemView$IntlContinueType$2 */
        public final enum C130422 extends IntlContinueType {
            private C130422(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftItemView.IntlContinueType
            public int getBgRes() {
                return obc0.f146305d3;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftItemView$IntlContinueType$3 */
        public final enum C130433 extends IntlContinueType {
            private C130433(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftItemView.IntlContinueType
            public int getBgRes() {
                return obc0.f146281b3;
            }
        }

        private static /* synthetic */ IntlContinueType[] $values() {
            return new IntlContinueType[]{SMALL, MIDDLE, LARGE};
        }

        static {
            SMALL = new C130411("SMALL", 0);
            MIDDLE = new C130422("MIDDLE", 1);
            LARGE = new C130433("LARGE", 2);
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
    public final void m76529a(View view) {
        mno.m159192a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m76530b(IntlContinueType intlContinueType) {
        this.f51883b.setBackgroundResource(intlContinueType.getBgRes());
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: c */
    public void m76531c(BLiveGiftCombosGears bLiveGiftCombosGears, jjs jjsVar) {
        this.f51885d = bLiveGiftCombosGears;
        this.f51884c.setText(String.valueOf(bLiveGiftCombosGears.combosHitNum));
    }

    public BLiveGiftCombosGears getGears() {
        return this.f51885d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76529a(this);
        n0k.m161008e(this.f51884c, Typeface.DEFAULT_BOLD);
        this.f51884c.getPaint().setFakeBoldText(true);
    }

    public IntlMultipleGiftItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlMultipleGiftItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
