package com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.multiple;

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
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;
import com.p1.mobile.putong.live.base.data.BLiveGiftCombosGears;
import l.e51;
import l.kvc0;
import l.t100;
import l.u6n;
import l.w8u;
import l.xdl0;
import p002l.h1c0;
import p002l.i3c0;
import p002l.ihs;
import p002l.mmj;
import p002l.nm10;
import p002l.r1e;
import p002l.xxj;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MultipleGiftItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MultipleGiftItemView f5919d;

    /* JADX INFO: renamed from: e */
    public TextView f5920e;

    /* JADX INFO: renamed from: f */
    public TextView f5921f;

    /* JADX INFO: renamed from: g */
    public LiveMarqueeTextView f5922g;

    /* JADX INFO: renamed from: h */
    public LiveMarqueeTextView f5923h;

    /* JADX INFO: renamed from: i */
    public BLiveGiftCombosGears f5924i;

    /* JADX INFO: renamed from: j */
    public Bitmap f5925j;

    /* JADX INFO: renamed from: k */
    public SpannableString f5926k;

    /* JADX INFO: renamed from: l */
    public final Runnable f5927l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class ContinueType2 {
        private static final /* synthetic */ ContinueType2[] $VALUES = $values();
        public static final ContinueType2 LARGE;
        public static final ContinueType2 MIDDLE;
        public static final ContinueType2 SMALL;

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView$ContinueType2$1 */
        public final enum C04011 extends ContinueType2 {
            private C04011(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView.ContinueType2
            public int getBgRes() {
                return i3c0.f12893o2;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView$ContinueType2$2 */
        public final enum C04022 extends ContinueType2 {
            private C04022(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView.ContinueType2
            public int getBgRes() {
                return i3c0.f12881n2;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView$ContinueType2$3 */
        public final enum C04033 extends ContinueType2 {
            private C04033(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.MultipleGiftItemView.ContinueType2
            public int getBgRes() {
                return i3c0.f12869m2;
            }
        }

        private static /* synthetic */ ContinueType2[] $values() {
            return new ContinueType2[]{SMALL, MIDDLE, LARGE};
        }

        static {
            SMALL = new C04011("SMALL", 0);
            MIDDLE = new C04022("MIDDLE", 1);
            LARGE = new C04033("LARGE", 2);
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
    public class RunnableC0404a implements Runnable {
        public RunnableC0404a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MultipleGiftItemView multipleGiftItemView = MultipleGiftItemView.this;
            multipleGiftItemView.f5923h.setText(multipleGiftItemView.f5926k);
            xdl0.M0(MultipleGiftItemView.this.f5922g, false);
            xdl0.M0(MultipleGiftItemView.this.f5923h, true);
        }
    }

    public MultipleGiftItemView(Context context) {
        super(context);
        this.f5927l = new RunnableC0404a();
    }

    /* JADX INFO: renamed from: j0 */
    private void m7445j0(int i) {
        this.f5925j = Bitmap.createBitmap(i, 5, Bitmap.Config.ALPHA_8);
    }

    /* JADX INFO: renamed from: k0 */
    private Bitmap m7446k0(int i) {
        if (i <= 0) {
            i = 1;
        }
        Bitmap bitmap = this.f5925j;
        if (bitmap == null || bitmap.isRecycled()) {
            m7445j0(i);
        }
        if (this.f5925j.getWidth() < i) {
            this.f5925j.recycle();
            m7445j0(i);
        }
        this.f5925j.setWidth(i);
        return this.f5925j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    private void m7447l0(String str, int i) {
        this.f5926k = new SpannableString(" " + str);
        this.f5926k.setSpan(new ImageSpan(getContext(), m7446k0(i)), 0, 1, 33);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    private void m7448n0(BLiveGiftCombosGears bLiveGiftCombosGears, ihs ihsVar) {
        String str;
        e51.J(this.f5927l);
        long jM21717d = (long) r1e.m21717d(ihsVar.m15160h(), (int) bLiveGiftCombosGears.combosHitNum);
        String strM18043D = mmj.m18043D(bLiveGiftCombosGears.previewText);
        String strU = w8u.u(u6n.a() ? R$string.f3543re : R$string.f3433me, Long.valueOf(jM21717d));
        this.f5922g.setText(strU);
        xdl0.M0(this.f5922g, true);
        xdl0.M0(this.f5923h, false);
        StringBuilder sb = new StringBuilder();
        sb.append(strU);
        if (TextUtils.isEmpty(strM18043D)) {
            str = "";
        } else {
            str = "    " + strM18043D;
        }
        sb.append(str);
        m7447l0(sb.toString(), (int) ((t100.d(70.0f) - this.f5922g.getPaint().measureText(strU)) / 2.0f));
        if (TextUtils.isEmpty(strM18043D)) {
            return;
        }
        e51.H(getContext(), this.f5927l, 1000L);
    }

    public BLiveGiftCombosGears getGears() {
        return this.f5924i;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m7449i0(View view) {
        nm10.m18864a(this, view);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: m0 */
    public void m7450m0(ContinueType2 continueType2) {
        this.f5919d.setBackgroundResource(continueType2.getBgRes());
        this.f5922g.setTextColor(kvc0.a(h1c0.f11815p1));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: o0 */
    public void m7451o0(BLiveGiftCombosGears bLiveGiftCombosGears, ihs ihsVar) {
        this.f5924i = bLiveGiftCombosGears;
        this.f5921f.setText(String.valueOf(bLiveGiftCombosGears.combosHitNum));
        m7448n0(bLiveGiftCombosGears, ihsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7449i0(this);
        TextView textView = this.f5921f;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        xxj.m26168e(textView, typeface);
        xxj.m26168e(this.f5920e, typeface);
        this.f5920e.getPaint().setFakeBoldText(true);
    }

    public MultipleGiftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5927l = new RunnableC0404a();
    }

    public MultipleGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5927l = new RunnableC0404a();
    }
}
