package com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple;

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
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.view.multiple.LiveMarqueeTextView;
import p149l.e51;
import p149l.g1c0;
import p149l.h3c0;
import p149l.ihs;
import p149l.kvc0;
import p149l.nmj;
import p149l.r1e;
import p149l.t100;
import p149l.tnu;
import p149l.w8u;
import p149l.xdl0;
import p149l.xxj;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatMultipleGiftItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveVChatMultipleGiftItemView f45311d;

    /* JADX INFO: renamed from: e */
    public TextView f45312e;

    /* JADX INFO: renamed from: f */
    public TextView f45313f;

    /* JADX INFO: renamed from: g */
    public LiveMarqueeTextView f45314g;

    /* JADX INFO: renamed from: h */
    public LiveMarqueeTextView f45315h;

    /* JADX INFO: renamed from: i */
    public BLiveGiftCombosGears f45316i;

    /* JADX INFO: renamed from: j */
    public Bitmap f45317j;

    /* JADX INFO: renamed from: k */
    public SpannableString f45318k;

    /* JADX INFO: renamed from: l */
    public final Runnable f45319l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class ContinueType2 {
        private static final /* synthetic */ ContinueType2[] $VALUES = $values();
        public static final ContinueType2 LARGE;
        public static final ContinueType2 MIDDLE;
        public static final ContinueType2 SMALL;

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftItemView$ContinueType2$1 */
        public final enum C125261 extends ContinueType2 {
            private C125261(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftItemView.ContinueType2
            public int getBgRes() {
                return h3c0.f105723y;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftItemView$ContinueType2$2 */
        public final enum C125272 extends ContinueType2 {
            private C125272(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftItemView.ContinueType2
            public int getBgRes() {
                return h3c0.f105720x;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftItemView$ContinueType2$3 */
        public final enum C125283 extends ContinueType2 {
            private C125283(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.multiple.LiveVChatMultipleGiftItemView.ContinueType2
            public int getBgRes() {
                return h3c0.f105717w;
            }
        }

        private static /* synthetic */ ContinueType2[] $values() {
            return new ContinueType2[]{SMALL, MIDDLE, LARGE};
        }

        static {
            SMALL = new C125261("SMALL", 0);
            MIDDLE = new C125272("MIDDLE", 1);
            LARGE = new C125283("LARGE", 2);
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
    public class RunnableC12529a implements Runnable {
        public RunnableC12529a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LiveVChatMultipleGiftItemView liveVChatMultipleGiftItemView = LiveVChatMultipleGiftItemView.this;
            liveVChatMultipleGiftItemView.f45315h.setText(liveVChatMultipleGiftItemView.f45318k);
            xdl0.m208345M0(LiveVChatMultipleGiftItemView.this.f45314g, false);
            xdl0.m208345M0(LiveVChatMultipleGiftItemView.this.f45315h, true);
        }
    }

    public LiveVChatMultipleGiftItemView(Context context) {
        super(context);
        this.f45319l = new RunnableC12529a();
    }

    public BLiveGiftCombosGears getGears() {
        return this.f45316i;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m69657i0(View view) {
        tnu.m189824a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m69658j0(int i) {
        this.f45317j = Bitmap.createBitmap(i, 5, Bitmap.Config.ALPHA_8);
    }

    /* JADX INFO: renamed from: k0 */
    public final Bitmap m69659k0(int i) {
        if (i <= 0) {
            i = 1;
        }
        Bitmap bitmap = this.f45317j;
        if (bitmap == null || bitmap.isRecycled()) {
            m69658j0(i);
        }
        if (this.f45317j.getWidth() < i) {
            this.f45317j.recycle();
            m69658j0(i);
        }
        this.f45317j.setWidth(i);
        return this.f45317j;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m69660l0(String str, int i) {
        this.f45318k = new SpannableString(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str);
        this.f45318k.setSpan(new ImageSpan(getContext(), m69659k0(i)), 0, 1, 33);
    }

    /* JADX INFO: renamed from: m0 */
    public void m69661m0(ContinueType2 continueType2) {
        this.f45311d.setBackgroundResource(continueType2.getBgRes());
        this.f45314g.setTextColor(kvc0.m147352a(g1c0.f100139C));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m69662n0(BLiveGiftCombosGears bLiveGiftCombosGears, ihs ihsVar) {
        String str;
        e51.m114745J(this.f45319l);
        long jM177455d = (long) r1e.m177455d(ihsVar.m136283h(), (int) bLiveGiftCombosGears.combosHitNum);
        String strM160107s = nmj.m160107s(bLiveGiftCombosGears.previewText);
        String strM202218u = w8u.m202218u(R$string.f44892b0, Long.valueOf(jM177455d));
        this.f45314g.setText(strM202218u);
        xdl0.m208345M0(this.f45314g, true);
        xdl0.m208345M0(this.f45315h, false);
        StringBuilder sb = new StringBuilder();
        sb.append(strM202218u);
        if (TextUtils.isEmpty(strM160107s)) {
            str = "";
        } else {
            str = "    " + strM160107s;
        }
        sb.append(str);
        m69660l0(sb.toString(), (int) ((t100.m186890d(70.0f) - this.f45314g.getPaint().measureText(strM202218u)) / 2.0f));
        if (TextUtils.isEmpty(strM160107s)) {
            return;
        }
        e51.m114743H(getContext(), this.f45319l, 1000L);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: o0 */
    public void m69663o0(BLiveGiftCombosGears bLiveGiftCombosGears, ihs ihsVar) {
        this.f45316i = bLiveGiftCombosGears;
        this.f45313f.setText(String.valueOf(bLiveGiftCombosGears.combosHitNum));
        m69662n0(bLiveGiftCombosGears, ihsVar);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69657i0(this);
        TextView textView = this.f45313f;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        xxj.m211504e(textView, typeface);
        xxj.m211504e(this.f45312e, typeface);
        this.f45312e.getPaint().setFakeBoldText(true);
    }

    public LiveVChatMultipleGiftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45319l = new RunnableC12529a();
    }

    public LiveVChatMultipleGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45319l = new RunnableC12529a();
    }
}
