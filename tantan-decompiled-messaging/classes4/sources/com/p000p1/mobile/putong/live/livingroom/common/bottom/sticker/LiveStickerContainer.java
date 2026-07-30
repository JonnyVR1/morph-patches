package com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.a;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import l.d30;
import l.l9e;
import l.lsi0;
import l.oar;
import l.s7m;
import l.t100;
import p002l.byr;
import p002l.d8c0;
import p002l.r5u;
import p002l.s5u;
import p002l.zwf0;
import v.VEditText;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveStickerContainer extends FrameLayout implements s7m<C0324b> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f4708a;

    /* JADX INFO: renamed from: b */
    public View f4709b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f4710c;

    /* JADX INFO: renamed from: d */
    public VEditText f4711d;

    /* JADX INFO: renamed from: e */
    public VText f4712e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f4713f;

    /* JADX INFO: renamed from: g */
    public VText f4714g;

    /* JADX INFO: renamed from: h */
    public Paint f4715h;

    /* JADX INFO: renamed from: i */
    public Path f4716i;

    /* JADX INFO: renamed from: j */
    public boolean f4717j;

    /* JADX INFO: renamed from: k */
    public boolean f4718k;

    /* JADX INFO: renamed from: l */
    public int f4719l;

    /* JADX INFO: renamed from: m */
    public int f4720m;

    /* JADX INFO: renamed from: n */
    public int f4721n;

    /* JADX INFO: renamed from: o */
    public int f4722o;

    /* JADX INFO: renamed from: p */
    public int f4723p;

    /* JADX INFO: renamed from: q */
    public int f4724q;

    /* JADX INFO: renamed from: r */
    public InterfaceC0325c f4725r;

    /* JADX INFO: renamed from: s */
    public boolean f4726s;

    /* JADX INFO: renamed from: t */
    public boolean f4727t;

    /* JADX INFO: renamed from: u */
    public InterfaceC0321b f4728u;

    /* JADX INFO: renamed from: v */
    public C0324b f4729v;

    /* JADX INFO: renamed from: w */
    public C0200a f4730w;

    /* JADX INFO: renamed from: x */
    public InterfaceC0325c f4731x;

    /* JADX INFO: renamed from: y */
    public int f4732y;

    /* JADX INFO: renamed from: z */
    public Paint f4733z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer$a */
    public class C0320a implements TextWatcher {
        public C0320a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int length = editable.toString().trim().length();
            LiveStickerContainer liveStickerContainer = LiveStickerContainer.this;
            if (length > 0) {
                liveStickerContainer.f4712e.setEnabled(true);
            } else {
                liveStickerContainer.f4712e.setEnabled(false);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer$b */
    public interface InterfaceC0321b {
        /* JADX INFO: renamed from: a */
        void mo5792a(InterfaceC0325c interfaceC0325c);

        /* JADX INFO: renamed from: b */
        void mo5793b(InterfaceC0325c interfaceC0325c);

        /* JADX INFO: renamed from: c */
        void mo5794c(InterfaceC0325c interfaceC0325c, boolean z);
    }

    public LiveStickerContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4732y = l9e.b();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m5761c(DialogInterface dialogInterface) {
    }

    private void init() {
        Paint paint = new Paint();
        this.f4715h = paint;
        paint.setAntiAlias(true);
        this.f4715h.setStrokeWidth(t100.a);
        this.f4715h.setColor(-1711276033);
        this.f4715h.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f4733z = paint2;
        paint2.setAntiAlias(true);
        this.f4733z.setColor(701975863);
        this.f4733z.setStyle(Paint.Style.FILL);
        this.f4716i = new Path();
        int i = t100.f;
        this.f4715h.setPathEffect(new DashPathEffect(new float[]{i, i}, 0.0f));
        this.f4719l = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private void setMaxCountFilter(int i) {
        this.f4711d.setFilters(new InputFilter[]{new oar(i * 2, new d30() { // from class: l.j5u
            public final void call() {
                this.f13598a.m5773F();
            }
        })});
    }

    /* JADX INFO: renamed from: x */
    private void m5767x() {
        byr byrVar = new byr(this.f4729v, d8c0.f9102g, m5781l(act().inflater(), null));
        this.f4730w = byrVar;
        byrVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.o5u
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                LiveStickerContainer.m5761c(dialogInterface);
            }
        });
        this.f4730w.m5139c0(d8c0.f9107l);
        this.f4709b.setOnClickListener(new View.OnClickListener() { // from class: l.p5u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17015a.m5769B(view);
            }
        });
        this.f4712e.setOnClickListener(new View.OnClickListener() { // from class: l.q5u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17820a.m5770C(view);
            }
        });
        this.f4711d.addTextChangedListener(new C0320a());
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m5768A(BLiveAddStickerResult bLiveAddStickerResult, View view) {
        this.f4729v.m25548F2().StickerEvent.openGiftStickerDialog().j(bLiveAddStickerResult.content);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m5769B(View view) {
        m5787u();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m5770C(View view) {
        this.f4729v.m5947T4(this.f4711d.getText().toString());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m5771C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m5772E() {
        this.f4714g.setScaleX(1.0f);
        this.f4714g.setScaleY(1.0f);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m5773F() {
        if (TextUtils.isEmpty(this.f4711d.getText().toString().trim())) {
            return;
        }
        lsi0.h(R$string.f3192be);
    }

    /* JADX INFO: renamed from: G */
    public InterfaceC0325c m5774G(String str) {
        InterfaceC0325c interfaceC0325c = this.f4731x;
        if (interfaceC0325c == null || TextUtils.equals(str, interfaceC0325c.getContent())) {
            return null;
        }
        this.f4731x.mo5722T(null, str);
        return this.f4731x;
    }

    /* JADX INFO: renamed from: H */
    public final void m5775H() {
        this.f4714g.setScaleX(1.0f);
        this.f4714g.setScaleY(1.0f);
        this.f4714g.animate().scaleX(1.2f).scaleY(1.2f).setDuration(200L).start();
    }

    /* JADX INFO: renamed from: I */
    public final void m5776I() {
        this.f4714g.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200L).withEndAction(new Runnable() { // from class: l.k5u
            @Override // java.lang.Runnable
            public final void run() {
                this.f14214a.m5772E();
            }
        }).start();
    }

    /* JADX INFO: renamed from: J */
    public void m5777J() {
        Object obj = this.f4731x;
        if (obj instanceof View) {
            removeView((View) obj);
        }
        this.f4731x = null;
    }

    /* JADX INFO: renamed from: K */
    public void m5778K(String str, int i) {
        if (this.f4730w == null) {
            m5767x();
        }
        setMaxCountFilter(i);
        if (this.f4730w.isShowing()) {
            return;
        }
        this.f4730w.show();
        this.f4711d.setText(str);
        this.f4711d.setSelection(str.length());
        this.f4711d.requestFocus();
    }

    public void destroy() {
        m5787u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f4717j) {
            this.f4716i.reset();
            float bottom = this.f4713f.getBottom() + 1;
            this.f4716i.moveTo(0.0f, bottom);
            this.f4716i.lineTo(getWidth(), bottom);
            canvas.drawPath(this.f4716i, this.f4715h);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if ((action == 1 || action == 3) && this.f4718k) {
            InterfaceC0325c interfaceC0325c = this.f4725r;
            if (interfaceC0325c != null && interfaceC0325c.mo5720L() && !this.f4727t) {
                this.f4725r.performClick();
            }
            this.f4718k = false;
            this.f4726s = false;
            boolean zM5786s = m5786s();
            InterfaceC0321b interfaceC0321b = this.f4728u;
            if (interfaceC0321b != null) {
                interfaceC0321b.mo5794c(this.f4725r, zM5786s);
            }
            this.f4725r = null;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public InterfaceC0325c getCurrentSticker() {
        return this.f4731x;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m5780k(View view) {
        r5u.m21780a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public View m5781l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s5u.m22211b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public InterfaceC0325c m5782m(final BLiveAddStickerResult bLiveAddStickerResult) {
        if (getChildCount() == 2) {
            removeView(getChildAt(1));
        }
        final InterfaceC0325c interfaceC0325cM27668a = zwf0.m27668a(bLiveAddStickerResult, this.f4729v.act());
        interfaceC0325cM27668a.setOnTouchListener(new InterfaceC0325c.b() { // from class: l.l5u
            @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c.b
            /* JADX INFO: renamed from: a */
            public final boolean mo5955a(InterfaceC0325c interfaceC0325c, MotionEvent motionEvent) {
                return this.f14685a.m5790y(interfaceC0325c, motionEvent);
            }
        });
        int width = (int) (bLiveAddStickerResult.position.x * getWidth());
        int height = (int) ((bLiveAddStickerResult.position.y * (getHeight() - this.f4713f.getBottom())) + this.f4713f.getBottom());
        FrameLayout.LayoutParams layoutParamsMo5719C = interfaceC0325cM27668a.mo5719C();
        layoutParamsMo5719C.leftMargin = width;
        layoutParamsMo5719C.topMargin = height;
        m5783n(interfaceC0325cM27668a, layoutParamsMo5719C);
        if ((interfaceC0325cM27668a instanceof InteractiveSticker) || (interfaceC0325cM27668a instanceof GiftSticker)) {
            interfaceC0325cM27668a.setOnClickListener(new InterfaceC0325c.a() { // from class: l.m5u
                @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c.a
                /* JADX INFO: renamed from: a */
                public final void mo5954a(InterfaceC0325c interfaceC0325c) {
                    this.f15247a.m5791z(interfaceC0325cM27668a, interfaceC0325c);
                }
            });
        }
        if (interfaceC0325cM27668a instanceof GiftSticker) {
            ((GiftSticker) interfaceC0325cM27668a).setGiftClick(new View.OnClickListener() { // from class: l.n5u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15833a.m5768A(bLiveAddStickerResult, view);
                }
            });
        }
        this.f4731x = interfaceC0325cM27668a;
        return interfaceC0325cM27668a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final void m5783n(InterfaceC0325c interfaceC0325c, FrameLayout.LayoutParams layoutParams) {
        if (interfaceC0325c instanceof View) {
            addView((View) interfaceC0325c, layoutParams);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5780k(this);
        init();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f4720m = (int) motionEvent.getX();
            this.f4721n = (int) motionEvent.getY();
            this.f4722o = (int) motionEvent.getX();
            this.f4723p = (int) motionEvent.getY();
            this.f4724q = 0;
        }
        return this.f4718k || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC0325c interfaceC0325c;
        InterfaceC0321b interfaceC0321b;
        if (motionEvent.getAction() == 2) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (this.f4724q < this.f4719l) {
                this.f4724q = (int) Math.sqrt(Math.pow(x - this.f4720m, 2.0d) + Math.pow(y - this.f4721n, 2.0d));
            }
            if (this.f4724q > this.f4719l && (interfaceC0325c = this.f4725r) != null) {
                if (!this.f4726s && (interfaceC0321b = this.f4728u) != null) {
                    this.f4726s = true;
                    interfaceC0321b.mo5793b(interfaceC0325c);
                }
                m5788v(this.f4725r, x - this.f4722o, y - this.f4723p);
                this.f4727t = true;
            }
            this.f4722o = x;
            this.f4723p = y;
        }
        return this.f4718k;
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m5779i1(C0324b c0324b) {
        this.f4729v = c0324b;
    }

    /* JADX INFO: renamed from: q */
    public void m5785q(int i) {
        this.f4732y = i;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m5786s() {
        if (this.f4713f.getBottom() - (this.f4725r.getSize().top + ((Integer) this.f4725r.getTranslation().second).intValue()) <= 0) {
            return false;
        }
        m5777J();
        return true;
    }

    public void setMaskVisibility(boolean z) {
        if (z != this.f4717j) {
            this.f4717j = z;
            this.f4713f.setVisibility(z ? 0 : 4);
            invalidate();
        }
    }

    public void setOnDragListener(InterfaceC0321b interfaceC0321b) {
        this.f4728u = interfaceC0321b;
    }

    /* JADX INFO: renamed from: u */
    public void m5787u() {
        a aVar = this.f4730w;
        if (aVar == null || !aVar.isShowing()) {
            return;
        }
        Act act = act();
        if (act != null) {
            act.hideInput(this.f4711d);
        }
        this.f4730w.dismiss();
    }

    /* JADX INFO: renamed from: v */
    public final void m5788v(InterfaceC0325c interfaceC0325c, int i, int i2) {
        Pair<Integer, Integer> translation = interfaceC0325c.getTranslation();
        int[] iArrM5789w = m5789w(i + ((Integer) translation.first).intValue(), i2 + ((Integer) translation.second).intValue());
        int iIntValue = interfaceC0325c.getSize().top + ((Integer) interfaceC0325c.getTranslation().second).intValue();
        int iIntValue2 = interfaceC0325c.getSize().top + iArrM5789w[1] + ((Integer) interfaceC0325c.getTranslation().second).intValue();
        int bottom = this.f4713f.getBottom();
        boolean z = bottom - iIntValue > 0;
        boolean z2 = bottom - iIntValue2 > 0;
        if (z && !z2) {
            m5776I();
        } else if (!z && z2) {
            m5775H();
        }
        interfaceC0325c.mo5726n(iArrM5789w[0]);
        interfaceC0325c.mo5727v(iArrM5789w[1]);
        InterfaceC0321b interfaceC0321b = this.f4728u;
        if (interfaceC0321b != null) {
            interfaceC0321b.mo5792a(interfaceC0325c);
        }
    }

    /* JADX INFO: renamed from: w */
    public final int[] m5789w(int i, int i2) {
        int i3 = this.f4725r.getSize().left;
        int width = i + i3;
        int iWidth = this.f4725r.getSize().width();
        if (width < 0) {
            width = 0;
        } else {
            float f = iWidth * 1.0f;
            if (getWidth() - width < f) {
                width = (int) (getWidth() - f);
            }
        }
        Pair<Integer, Integer> translation = this.f4725r.getTranslation();
        int i4 = this.f4725r.getSize().top;
        int i5 = i2 + i4;
        int iHeight = this.f4725r.getSize().height();
        int height = (getHeight() - t100.d(60.0f)) - 1;
        int height2 = (getHeight() - t100.d(266.0f)) - 1;
        int i6 = this.f4732y + 1;
        int iIntValue = ((Integer) translation.first).intValue() + i3;
        if (i5 + iHeight > height) {
            i5 = height - iHeight;
        }
        int iMax = i6 - Math.max(iWidth / 2, iWidth - (getWidth() - i6));
        if (width < iMax && i5 + iHeight > height2) {
            if (iIntValue < iMax) {
                i5 = height2 - iHeight;
            } else {
                width = iMax;
            }
        }
        return new int[]{(width - i3) - ((Integer) translation.first).intValue(), (i5 - i4) - ((Integer) translation.second).intValue()};
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean m5790y(InterfaceC0325c interfaceC0325c, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f4727t = false;
            this.f4725r = interfaceC0325c;
            this.f4718k = true;
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m5791z(InterfaceC0325c interfaceC0325c, InterfaceC0325c interfaceC0325c2) {
        m5778K(interfaceC0325c.getContent(), interfaceC0325c.getMaxCount());
    }

    public LiveStickerContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveStickerContainer(@NonNull Context context) {
        this(context, null);
    }
}
