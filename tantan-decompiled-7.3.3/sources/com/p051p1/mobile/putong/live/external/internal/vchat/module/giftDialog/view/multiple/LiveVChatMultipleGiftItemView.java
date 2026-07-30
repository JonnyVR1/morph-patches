package com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftCombosGears;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;
import p153l.bnl0;
import p153l.dpj;
import p153l.f3e;
import p153l.jjs;
import p153l.l51;
import p153l.m9c0;
import p153l.n0k;
import p153l.n3d0;
import p153l.nbc0;
import p153l.qa00;
import p153l.upu;
import p153l.xau;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatMultipleGiftItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveVChatMultipleGiftItemView f46159d;

    /* JADX INFO: renamed from: e */
    public TextView f46160e;

    /* JADX INFO: renamed from: f */
    public TextView f46161f;

    /* JADX INFO: renamed from: g */
    public LiveMarqueeTextView f46162g;

    /* JADX INFO: renamed from: h */
    public LiveMarqueeTextView f46163h;

    /* JADX INFO: renamed from: i */
    public BLiveGiftCombosGears f46164i;

    /* JADX INFO: renamed from: j */
    public Bitmap f46165j;

    /* JADX INFO: renamed from: k */
    public SpannableString f46166k;

    /* JADX INFO: renamed from: l */
    public final Runnable f46167l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class ContinueType2 {
        private static final /* synthetic */ ContinueType2[] $VALUES = $values();
        public static final ContinueType2 LARGE;
        public static final ContinueType2 MIDDLE;
        public static final ContinueType2 SMALL;

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftItemView$ContinueType2$1 */
        public final enum C126891 extends ContinueType2 {
            private C126891(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftItemView.ContinueType2
            public int getBgRes() {
                return nbc0.f141214y;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftItemView$ContinueType2$2 */
        public final enum C126902 extends ContinueType2 {
            private C126902(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftItemView.ContinueType2
            public int getBgRes() {
                return nbc0.f141211x;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftItemView$ContinueType2$3 */
        public final enum C126913 extends ContinueType2 {
            private C126913(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftItemView.ContinueType2
            public int getBgRes() {
                return nbc0.f141208w;
            }
        }

        private static /* synthetic */ ContinueType2[] $values() {
            return new ContinueType2[]{SMALL, MIDDLE, LARGE};
        }

        static {
            SMALL = new C126891("SMALL", 0);
            MIDDLE = new C126902("MIDDLE", 1);
            LARGE = new C126913("LARGE", 2);
        }

        public static ContinueType2 valueOf(String str) {
            return (ContinueType2) Enum.valueOf(ContinueType2.class, str);
        }

        public static ContinueType2[] values() {
            return (ContinueType2[]) $VALUES.clone();
        }

        public abstract int getBgRes();

        private ContinueType2(String str, int i) {
            super(str, i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftItemView$a */
    public class RunnableC12692a implements Runnable {
        public RunnableC12692a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LiveVChatMultipleGiftItemView liveVChatMultipleGiftItemView = LiveVChatMultipleGiftItemView.this;
            liveVChatMultipleGiftItemView.f46163h.setText(liveVChatMultipleGiftItemView.f46166k);
            bnl0.m105525M0(LiveVChatMultipleGiftItemView.this.f46162g, false);
            bnl0.m105525M0(LiveVChatMultipleGiftItemView.this.f46163h, true);
        }
    }

    public LiveVChatMultipleGiftItemView(Context context) {
        super(context);
        this.f46167l = new RunnableC12692a();
    }

    public BLiveGiftCombosGears getGears() {
        return this.f46164i;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m70840i0(View view) {
        upu.m197189a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m70841j0(int i) {
        this.f46165j = Bitmap.createBitmap(i, 5, Bitmap.Config.ALPHA_8);
    }

    /* JADX INFO: renamed from: k0 */
    public final Bitmap m70842k0(int i) {
        if (i <= 0) {
            i = 1;
        }
        Bitmap bitmap = this.f46165j;
        if (bitmap == null || bitmap.isRecycled()) {
            m70841j0(i);
        }
        if (this.f46165j.getWidth() < i) {
            this.f46165j.recycle();
            m70841j0(i);
        }
        this.f46165j.setWidth(i);
        return this.f46165j;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m70843l0(String str, int i) {
        this.f46166k = new SpannableString(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str);
        this.f46166k.setSpan(new ImageSpan(getContext(), m70842k0(i)), 0, 1, 33);
    }

    /* JADX INFO: renamed from: m0 */
    public void m70844m0(ContinueType2 continueType2) {
        this.f46159d.setBackgroundResource(continueType2.getBgRes());
        this.f46162g.setTextColor(n3d0.m161277a(m9c0.f135369C));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m70845n0(BLiveGiftCombosGears bLiveGiftCombosGears, jjs jjsVar) {
        String str;
        l51.m152890J(this.f46167l);
        long jM123725d = (long) f3e.m123725d(jjsVar.m145122h(), (int) bLiveGiftCombosGears.combosHitNum);
        String strM117399s = dpj.m117399s(bLiveGiftCombosGears.previewText);
        String strM209911u = xau.m209911u(R$string.f45740b0, Long.valueOf(jM123725d));
        this.f46162g.setText(strM209911u);
        bnl0.m105525M0(this.f46162g, true);
        bnl0.m105525M0(this.f46163h, false);
        StringBuilder sb = new StringBuilder();
        sb.append(strM209911u);
        if (TextUtils.isEmpty(strM117399s)) {
            str = "";
        } else {
            str = "    " + strM117399s;
        }
        sb.append(str);
        m70843l0(sb.toString(), (int) ((qa00.m175859d(70.0f) - this.f46162g.getPaint().measureText(strM209911u)) / 2.0f));
        if (TextUtils.isEmpty(strM117399s)) {
            return;
        }
        l51.m152888H(getContext(), this.f46167l, 1000L);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: o0 */
    public void m70846o0(BLiveGiftCombosGears bLiveGiftCombosGears, jjs jjsVar) {
        this.f46164i = bLiveGiftCombosGears;
        this.f46161f.setText(String.valueOf(bLiveGiftCombosGears.combosHitNum));
        m70845n0(bLiveGiftCombosGears, jjsVar);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70840i0(this);
        TextView textView = this.f46161f;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        n0k.m161008e(textView, typeface);
        n0k.m161008e(this.f46160e, typeface);
        this.f46160e.getPaint().setFakeBoldText(true);
    }

    public LiveVChatMultipleGiftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46167l = new RunnableC12692a();
    }

    public LiveVChatMultipleGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46167l = new RunnableC12692a();
    }
}
