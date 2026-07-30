package com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.multiple;

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
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;
import p153l.bnl0;
import p153l.cpj;
import p153l.f3e;
import p153l.jjs;
import p153l.l51;
import p153l.n0k;
import p153l.n3d0;
import p153l.n9c0;
import p153l.obc0;
import p153l.qa00;
import p153l.u8n;
import p153l.vu10;
import p153l.xau;

/* JADX INFO: loaded from: classes4.dex */
public class MultipleGiftItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MultipleGiftItemView f50725d;

    /* JADX INFO: renamed from: e */
    public TextView f50726e;

    /* JADX INFO: renamed from: f */
    public TextView f50727f;

    /* JADX INFO: renamed from: g */
    public LiveMarqueeTextView f50728g;

    /* JADX INFO: renamed from: h */
    public LiveMarqueeTextView f50729h;

    /* JADX INFO: renamed from: i */
    public BLiveGiftCombosGears f50730i;

    /* JADX INFO: renamed from: j */
    public Bitmap f50731j;

    /* JADX INFO: renamed from: k */
    public SpannableString f50732k;

    /* JADX INFO: renamed from: l */
    public final Runnable f50733l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class ContinueType2 {
        private static final /* synthetic */ ContinueType2[] $VALUES = $values();
        public static final ContinueType2 LARGE;
        public static final ContinueType2 MIDDLE;
        public static final ContinueType2 SMALL;

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView$ContinueType2$1 */
        public final enum C129751 extends ContinueType2 {
            private C129751(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView.ContinueType2
            public int getBgRes() {
                return obc0.f146436o2;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView$ContinueType2$2 */
        public final enum C129762 extends ContinueType2 {
            private C129762(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView.ContinueType2
            public int getBgRes() {
                return obc0.f146424n2;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView$ContinueType2$3 */
        public final enum C129773 extends ContinueType2 {
            private C129773(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView.ContinueType2
            public int getBgRes() {
                return obc0.f146412m2;
            }
        }

        private static /* synthetic */ ContinueType2[] $values() {
            return new ContinueType2[]{SMALL, MIDDLE, LARGE};
        }

        static {
            SMALL = new C129751("SMALL", 0);
            MIDDLE = new C129762("MIDDLE", 1);
            LARGE = new C129773("LARGE", 2);
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

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView$a */
    public class RunnableC12978a implements Runnable {
        public RunnableC12978a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MultipleGiftItemView multipleGiftItemView = MultipleGiftItemView.this;
            multipleGiftItemView.f50729h.setText(multipleGiftItemView.f50732k);
            bnl0.m105525M0(MultipleGiftItemView.this.f50728g, false);
            bnl0.m105525M0(MultipleGiftItemView.this.f50729h, true);
        }
    }

    public MultipleGiftItemView(Context context) {
        super(context);
        this.f50733l = new RunnableC12978a();
    }

    /* JADX INFO: renamed from: j0 */
    private void m75072j0(int i) {
        this.f50731j = Bitmap.createBitmap(i, 5, Bitmap.Config.ALPHA_8);
    }

    /* JADX INFO: renamed from: k0 */
    private Bitmap m75073k0(int i) {
        if (i <= 0) {
            i = 1;
        }
        Bitmap bitmap = this.f50731j;
        if (bitmap == null || bitmap.isRecycled()) {
            m75072j0(i);
        }
        if (this.f50731j.getWidth() < i) {
            this.f50731j.recycle();
            m75072j0(i);
        }
        this.f50731j.setWidth(i);
        return this.f50731j;
    }

    /* JADX INFO: renamed from: l0 */
    private void m75074l0(String str, int i) {
        this.f50732k = new SpannableString(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str);
        this.f50732k.setSpan(new ImageSpan(getContext(), m75073k0(i)), 0, 1, 33);
    }

    /* JADX INFO: renamed from: n0 */
    private void m75075n0(BLiveGiftCombosGears bLiveGiftCombosGears, jjs jjsVar) {
        String str;
        l51.m152890J(this.f50733l);
        long jM123725d = (long) f3e.m123725d(jjsVar.m145122h(), (int) bLiveGiftCombosGears.combosHitNum);
        String strM111768D = cpj.m111768D(bLiveGiftCombosGears.previewText);
        String strM209911u = xau.m209911u(u8n.m195065a() ? R$string.f48349re : R$string.f48239me, Long.valueOf(jM123725d));
        this.f50728g.setText(strM209911u);
        bnl0.m105525M0(this.f50728g, true);
        bnl0.m105525M0(this.f50729h, false);
        StringBuilder sb = new StringBuilder();
        sb.append(strM209911u);
        if (TextUtils.isEmpty(strM111768D)) {
            str = "";
        } else {
            str = "    " + strM111768D;
        }
        sb.append(str);
        m75074l0(sb.toString(), (int) ((qa00.m175859d(70.0f) - this.f50728g.getPaint().measureText(strM209911u)) / 2.0f));
        if (TextUtils.isEmpty(strM111768D)) {
            return;
        }
        l51.m152888H(getContext(), this.f50733l, 1000L);
    }

    public BLiveGiftCombosGears getGears() {
        return this.f50730i;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m75076i0(View view) {
        vu10.m202771a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public void m75077m0(ContinueType2 continueType2) {
        this.f50725d.setBackgroundResource(continueType2.getBgRes());
        this.f50728g.setTextColor(n3d0.m161277a(n9c0.f140856p1));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: o0 */
    public void m75078o0(BLiveGiftCombosGears bLiveGiftCombosGears, jjs jjsVar) {
        this.f50730i = bLiveGiftCombosGears;
        this.f50727f.setText(String.valueOf(bLiveGiftCombosGears.combosHitNum));
        m75075n0(bLiveGiftCombosGears, jjsVar);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75076i0(this);
        TextView textView = this.f50727f;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        n0k.m161008e(textView, typeface);
        n0k.m161008e(this.f50726e, typeface);
        this.f50726e.getPaint().setFakeBoldText(true);
    }

    public MultipleGiftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50733l = new RunnableC12978a();
    }

    public MultipleGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50733l = new RunnableC12978a();
    }
}
