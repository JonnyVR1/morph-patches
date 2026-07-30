package com.p000p1.mobile.putong.live.livingroom.intl.gift;

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
import com.p1.mobile.putong.live.base.data.BLiveGiftCombosGears;
import p002l.i3c0;
import p002l.ihs;
import p002l.mlo;
import p002l.xxj;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class IntlMultipleGiftItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public IntlMultipleGiftItemView f7076a;

    /* JADX INFO: renamed from: b */
    public ImageView f7077b;

    /* JADX INFO: renamed from: c */
    public TextView f7078c;

    /* JADX INFO: renamed from: d */
    public BLiveGiftCombosGears f7079d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class IntlContinueType {
        private static final /* synthetic */ IntlContinueType[] $VALUES = $values();
        public static final IntlContinueType LARGE;
        public static final IntlContinueType MIDDLE;
        public static final IntlContinueType SMALL;

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftItemView$IntlContinueType$1 */
        public final enum C04671 extends IntlContinueType {
            private C04671(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftItemView.IntlContinueType
            public int getBgRes() {
                return i3c0.f12750c3;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftItemView$IntlContinueType$2 */
        public final enum C04682 extends IntlContinueType {
            private C04682(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftItemView.IntlContinueType
            public int getBgRes() {
                return i3c0.f12762d3;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftItemView$IntlContinueType$3 */
        public final enum C04693 extends IntlContinueType {
            private C04693(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.livingroom.intl.gift.IntlMultipleGiftItemView.IntlContinueType
            public int getBgRes() {
                return i3c0.f12738b3;
            }
        }

        private static /* synthetic */ IntlContinueType[] $values() {
            return new IntlContinueType[]{SMALL, MIDDLE, LARGE};
        }

        static {
            SMALL = new C04671("SMALL", 0);
            MIDDLE = new C04682("MIDDLE", 1);
            LARGE = new C04693("LARGE", 2);
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
    public final void m8969a(View view) {
        mlo.m18011a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m8970b(IntlContinueType intlContinueType) {
        this.f7077b.setBackgroundResource(intlContinueType.getBgRes());
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: c */
    public void m8971c(BLiveGiftCombosGears bLiveGiftCombosGears, ihs ihsVar) {
        this.f7079d = bLiveGiftCombosGears;
        this.f7078c.setText(String.valueOf(bLiveGiftCombosGears.combosHitNum));
    }

    public BLiveGiftCombosGears getGears() {
        return this.f7079d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8969a(this);
        xxj.m26168e(this.f7078c, Typeface.DEFAULT_BOLD);
        this.f7078c.getPaint().setFakeBoldText(true);
    }

    public IntlMultipleGiftItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlMultipleGiftItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
