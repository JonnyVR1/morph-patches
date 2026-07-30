package com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.multiple;

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
import com.p046p1.mobile.putong.live.base.data.BLiveGiftCombosGears;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;
import p149l.e51;
import p149l.h1c0;
import p149l.i3c0;
import p149l.ihs;
import p149l.kvc0;
import p149l.mmj;
import p149l.nm10;
import p149l.r1e;
import p149l.t100;
import p149l.u6n;
import p149l.w8u;
import p149l.xdl0;
import p149l.xxj;

/* JADX INFO: loaded from: classes4.dex */
public class MultipleGiftItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MultipleGiftItemView f49877d;

    /* JADX INFO: renamed from: e */
    public TextView f49878e;

    /* JADX INFO: renamed from: f */
    public TextView f49879f;

    /* JADX INFO: renamed from: g */
    public LiveMarqueeTextView f49880g;

    /* JADX INFO: renamed from: h */
    public LiveMarqueeTextView f49881h;

    /* JADX INFO: renamed from: i */
    public BLiveGiftCombosGears f49882i;

    /* JADX INFO: renamed from: j */
    public Bitmap f49883j;

    /* JADX INFO: renamed from: k */
    public SpannableString f49884k;

    /* JADX INFO: renamed from: l */
    public final Runnable f49885l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class ContinueType2 {
        private static final /* synthetic */ ContinueType2[] $VALUES = $values();
        public static final ContinueType2 LARGE;
        public static final ContinueType2 MIDDLE;
        public static final ContinueType2 SMALL;

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView$ContinueType2$1 */
        public final enum C128121 extends ContinueType2 {
            private C128121(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView.ContinueType2
            public int getBgRes() {
                return i3c0.f111108o2;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView$ContinueType2$2 */
        public final enum C128132 extends ContinueType2 {
            private C128132(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView.ContinueType2
            public int getBgRes() {
                return i3c0.f111096n2;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView$ContinueType2$3 */
        public final enum C128143 extends ContinueType2 {
            private C128143(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView.ContinueType2
            public int getBgRes() {
                return i3c0.f111084m2;
            }
        }

        private static /* synthetic */ ContinueType2[] $values() {
            return new ContinueType2[]{SMALL, MIDDLE, LARGE};
        }

        static {
            SMALL = new C128121("SMALL", 0);
            MIDDLE = new C128132("MIDDLE", 1);
            LARGE = new C128143("LARGE", 2);
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
    public class RunnableC12815a implements Runnable {
        public RunnableC12815a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MultipleGiftItemView multipleGiftItemView = MultipleGiftItemView.this;
            multipleGiftItemView.f49881h.setText(multipleGiftItemView.f49884k);
            xdl0.m208345M0(MultipleGiftItemView.this.f49880g, false);
            xdl0.m208345M0(MultipleGiftItemView.this.f49881h, true);
        }
    }

    public MultipleGiftItemView(Context context) {
        super(context);
        this.f49885l = new RunnableC12815a();
    }

    /* JADX INFO: renamed from: j0 */
    private void m73889j0(int i) {
        this.f49883j = Bitmap.createBitmap(i, 5, Bitmap.Config.ALPHA_8);
    }

    /* JADX INFO: renamed from: k0 */
    private Bitmap m73890k0(int i) {
        if (i <= 0) {
            i = 1;
        }
        Bitmap bitmap = this.f49883j;
        if (bitmap == null || bitmap.isRecycled()) {
            m73889j0(i);
        }
        if (this.f49883j.getWidth() < i) {
            this.f49883j.recycle();
            m73889j0(i);
        }
        this.f49883j.setWidth(i);
        return this.f49883j;
    }

    /* JADX INFO: renamed from: l0 */
    private void m73891l0(String str, int i) {
        this.f49884k = new SpannableString(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str);
        this.f49884k.setSpan(new ImageSpan(getContext(), m73890k0(i)), 0, 1, 33);
    }

    /* JADX INFO: renamed from: n0 */
    private void m73892n0(BLiveGiftCombosGears bLiveGiftCombosGears, ihs ihsVar) {
        String str;
        e51.m114745J(this.f49885l);
        long jM177455d = (long) r1e.m177455d(ihsVar.m136283h(), (int) bLiveGiftCombosGears.combosHitNum);
        String strM155401D = mmj.m155401D(bLiveGiftCombosGears.previewText);
        String strM202218u = w8u.m202218u(u6n.m192015a() ? R$string.f47501re : R$string.f47391me, Long.valueOf(jM177455d));
        this.f49880g.setText(strM202218u);
        xdl0.m208345M0(this.f49880g, true);
        xdl0.m208345M0(this.f49881h, false);
        StringBuilder sb = new StringBuilder();
        sb.append(strM202218u);
        if (TextUtils.isEmpty(strM155401D)) {
            str = "";
        } else {
            str = "    " + strM155401D;
        }
        sb.append(str);
        m73891l0(sb.toString(), (int) ((t100.m186890d(70.0f) - this.f49880g.getPaint().measureText(strM202218u)) / 2.0f));
        if (TextUtils.isEmpty(strM155401D)) {
            return;
        }
        e51.m114743H(getContext(), this.f49885l, 1000L);
    }

    public BLiveGiftCombosGears getGears() {
        return this.f49882i;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m73893i0(View view) {
        nm10.m160084a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public void m73894m0(ContinueType2 continueType2) {
        this.f49877d.setBackgroundResource(continueType2.getBgRes());
        this.f49880g.setTextColor(kvc0.m147352a(h1c0.f105395p1));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: o0 */
    public void m73895o0(BLiveGiftCombosGears bLiveGiftCombosGears, ihs ihsVar) {
        this.f49882i = bLiveGiftCombosGears;
        this.f49879f.setText(String.valueOf(bLiveGiftCombosGears.combosHitNum));
        m73892n0(bLiveGiftCombosGears, ihsVar);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73893i0(this);
        TextView textView = this.f49879f;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        xxj.m211504e(textView, typeface);
        xxj.m211504e(this.f49878e, typeface);
        this.f49878e.getPaint().setFakeBoldText(true);
    }

    public MultipleGiftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49885l = new RunnableC12815a();
    }

    public MultipleGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49885l = new RunnableC12815a();
    }
}
