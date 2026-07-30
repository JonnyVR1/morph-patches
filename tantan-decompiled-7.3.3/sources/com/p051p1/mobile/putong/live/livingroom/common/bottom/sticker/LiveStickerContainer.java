package com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer;
import p151v.VEditText;
import p151v.VText;
import p153l.c0s;
import p153l.iam;
import p153l.j5g0;
import p153l.jgc0;
import p153l.o1j0;
import p153l.pae;
import p153l.qa00;
import p153l.qcr;
import p153l.s7u;
import p153l.t7u;
import p153l.x20;

/* JADX INFO: loaded from: classes4.dex */
public class LiveStickerContainer extends FrameLayout implements iam<C12898b> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f49514a;

    /* JADX INFO: renamed from: b */
    public View f49515b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f49516c;

    /* JADX INFO: renamed from: d */
    public VEditText f49517d;

    /* JADX INFO: renamed from: e */
    public VText f49518e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f49519f;

    /* JADX INFO: renamed from: g */
    public VText f49520g;

    /* JADX INFO: renamed from: h */
    public Paint f49521h;

    /* JADX INFO: renamed from: i */
    public Path f49522i;

    /* JADX INFO: renamed from: j */
    public boolean f49523j;

    /* JADX INFO: renamed from: k */
    public boolean f49524k;

    /* JADX INFO: renamed from: l */
    public int f49525l;

    /* JADX INFO: renamed from: m */
    public int f49526m;

    /* JADX INFO: renamed from: n */
    public int f49527n;

    /* JADX INFO: renamed from: o */
    public int f49528o;

    /* JADX INFO: renamed from: p */
    public int f49529p;

    /* JADX INFO: renamed from: q */
    public int f49530q;

    /* JADX INFO: renamed from: r */
    public InterfaceC12899c f49531r;

    /* JADX INFO: renamed from: s */
    public boolean f49532s;

    /* JADX INFO: renamed from: t */
    public boolean f49533t;

    /* JADX INFO: renamed from: u */
    public InterfaceC12895b f49534u;

    /* JADX INFO: renamed from: v */
    public C12898b f49535v;

    /* JADX INFO: renamed from: w */
    public DialogC12774a f49536w;

    /* JADX INFO: renamed from: x */
    public InterfaceC12899c f49537x;

    /* JADX INFO: renamed from: y */
    public int f49538y;

    /* JADX INFO: renamed from: z */
    public Paint f49539z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer$a */
    public class C12894a implements TextWatcher {
        public C12894a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int length = editable.toString().trim().length();
            LiveStickerContainer liveStickerContainer = LiveStickerContainer.this;
            if (length > 0) {
                liveStickerContainer.f49518e.setEnabled(true);
            } else {
                liveStickerContainer.f49518e.setEnabled(false);
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
    public interface InterfaceC12895b {
        /* JADX INFO: renamed from: a */
        void mo73500a(InterfaceC12899c interfaceC12899c);

        /* JADX INFO: renamed from: b */
        void mo73501b(InterfaceC12899c interfaceC12899c);

        /* JADX INFO: renamed from: c */
        void mo73502c(InterfaceC12899c interfaceC12899c, boolean z);
    }

    public LiveStickerContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49538y = pae.m171419b();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m73471c(DialogInterface dialogInterface) {
    }

    private void init() {
        Paint paint = new Paint();
        this.f49521h = paint;
        paint.setAntiAlias(true);
        this.f49521h.setStrokeWidth(qa00.f156314a);
        this.f49521h.setColor(-1711276033);
        this.f49521h.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f49539z = paint2;
        paint2.setAntiAlias(true);
        this.f49539z.setColor(701975863);
        this.f49539z.setStyle(Paint.Style.FILL);
        this.f49522i = new Path();
        int i = qa00.f156319f;
        this.f49521h.setPathEffect(new DashPathEffect(new float[]{i, i}, 0.0f));
        this.f49525l = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private void setMaxCountFilter(int i) {
        this.f49517d.setFilters(new InputFilter[]{new qcr(i * 2, new x20() { // from class: l.k7u
            @Override // p153l.x20
            public final void call() {
                this.f124300a.m73482F();
            }
        })});
    }

    /* JADX INFO: renamed from: x */
    private void m73477x() {
        c0s c0sVar = new c0s(this.f49535v, jgc0.f120700g, m73489l(act().inflater(), null));
        this.f49536w = c0sVar;
        c0sVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.p7u
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                LiveStickerContainer.m73471c(dialogInterface);
            }
        });
        this.f49536w.m72954c0(jgc0.f120705l);
        this.f49515b.setOnClickListener(new View.OnClickListener() { // from class: l.q7u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156002a.m73479B(view);
            }
        });
        this.f49518e.setOnClickListener(new View.OnClickListener() { // from class: l.r7u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161640a.m73480C(view);
            }
        });
        this.f49517d.addTextChangedListener(new C12894a());
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m73478A(BLiveAddStickerResult bLiveAddStickerResult, View view) {
        this.f49535v.m213811F2().StickerEvent.openGiftStickerDialog().mo199273j(bLiveAddStickerResult.content);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m73479B(View view) {
        m73495u();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m73480C(View view) {
        this.f49535v.m73646T4(this.f49517d.getText().toString());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m73481E() {
        this.f49520g.setScaleX(1.0f);
        this.f49520g.setScaleY(1.0f);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m73482F() {
        if (TextUtils.isEmpty(this.f49517d.getText().toString().trim())) {
            return;
        }
        o1j0.m165634h(R$string.f47998be);
    }

    /* JADX INFO: renamed from: G */
    public InterfaceC12899c m73483G(String str) {
        InterfaceC12899c interfaceC12899c = this.f49537x;
        if (interfaceC12899c == null || TextUtils.equals(str, interfaceC12899c.getContent())) {
            return null;
        }
        this.f49537x.mo73432T(null, str);
        return this.f49537x;
    }

    /* JADX INFO: renamed from: H */
    public final void m73484H() {
        this.f49520g.setScaleX(1.0f);
        this.f49520g.setScaleY(1.0f);
        this.f49520g.animate().scaleX(1.2f).scaleY(1.2f).setDuration(200L).start();
    }

    /* JADX INFO: renamed from: I */
    public final void m73485I() {
        this.f49520g.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200L).withEndAction(new Runnable() { // from class: l.l7u
            @Override // java.lang.Runnable
            public final void run() {
                this.f130383a.m73481E();
            }
        }).start();
    }

    /* JADX INFO: renamed from: J */
    public void m73486J() {
        Object obj = this.f49537x;
        if (obj instanceof View) {
            removeView((View) obj);
        }
        this.f49537x = null;
    }

    /* JADX INFO: renamed from: K */
    public void m73487K(String str, int i) {
        if (this.f49536w == null) {
            m73477x();
        }
        setMaxCountFilter(i);
        if (this.f49536w.isShowing()) {
            return;
        }
        this.f49536w.show();
        this.f49517d.setText(str);
        this.f49517d.setSelection(str.length());
        this.f49517d.requestFocus();
    }

    @Override // p153l.iam
    public void destroy() {
        m73495u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f49523j) {
            this.f49522i.reset();
            float bottom = this.f49519f.getBottom() + 1;
            this.f49522i.moveTo(0.0f, bottom);
            this.f49522i.lineTo(getWidth(), bottom);
            canvas.drawPath(this.f49522i, this.f49521h);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if ((action == 1 || action == 3) && this.f49524k) {
            InterfaceC12899c interfaceC12899c = this.f49531r;
            if (interfaceC12899c != null && interfaceC12899c.mo73430L() && !this.f49533t) {
                this.f49531r.performClick();
            }
            this.f49524k = false;
            this.f49532s = false;
            boolean zM73494s = m73494s();
            InterfaceC12895b interfaceC12895b = this.f49534u;
            if (interfaceC12895b != null) {
                interfaceC12895b.mo73502c(this.f49531r, zM73494s);
            }
            this.f49531r = null;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public InterfaceC12899c getCurrentSticker() {
        return this.f49537x;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m73488k(View view) {
        s7u.m185036a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public View m73489l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t7u.m189636b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public InterfaceC12899c m73490m(final BLiveAddStickerResult bLiveAddStickerResult) {
        if (getChildCount() == 2) {
            removeView(getChildAt(1));
        }
        final InterfaceC12899c interfaceC12899cM143525a = j5g0.m143525a(bLiveAddStickerResult, this.f49535v.act());
        interfaceC12899cM143525a.setOnTouchListener(new InterfaceC12899c.b() { // from class: l.m7u
            @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c.b
            /* JADX INFO: renamed from: a */
            public final boolean mo73653a(InterfaceC12899c interfaceC12899c, MotionEvent motionEvent) {
                return this.f135107a.m73498y(interfaceC12899c, motionEvent);
            }
        });
        int width = (int) (bLiveAddStickerResult.position.f45278x * getWidth());
        int height = (int) ((bLiveAddStickerResult.position.f45279y * (getHeight() - this.f49519f.getBottom())) + this.f49519f.getBottom());
        FrameLayout.LayoutParams layoutParamsMo73429C = interfaceC12899cM143525a.mo73429C();
        layoutParamsMo73429C.leftMargin = width;
        layoutParamsMo73429C.topMargin = height;
        m73491n(interfaceC12899cM143525a, layoutParamsMo73429C);
        if ((interfaceC12899cM143525a instanceof InteractiveSticker) || (interfaceC12899cM143525a instanceof GiftSticker)) {
            interfaceC12899cM143525a.setOnClickListener(new InterfaceC12899c.a() { // from class: l.n7u
                @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c.a
                /* JADX INFO: renamed from: a */
                public final void mo73652a(InterfaceC12899c interfaceC12899c) {
                    this.f140630a.m73499z(interfaceC12899cM143525a, interfaceC12899c);
                }
            });
        }
        if (interfaceC12899cM143525a instanceof GiftSticker) {
            ((GiftSticker) interfaceC12899cM143525a).setGiftClick(new View.OnClickListener() { // from class: l.o7u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f145298a.m73478A(bLiveAddStickerResult, view);
                }
            });
        }
        this.f49537x = interfaceC12899cM143525a;
        return interfaceC12899cM143525a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final void m73491n(InterfaceC12899c interfaceC12899c, FrameLayout.LayoutParams layoutParams) {
        if (interfaceC12899c instanceof View) {
            addView((View) interfaceC12899c, layoutParams);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73488k(this);
        init();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f49526m = (int) motionEvent.getX();
            this.f49527n = (int) motionEvent.getY();
            this.f49528o = (int) motionEvent.getX();
            this.f49529p = (int) motionEvent.getY();
            this.f49530q = 0;
        }
        return this.f49524k || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC12899c interfaceC12899c;
        InterfaceC12895b interfaceC12895b;
        if (motionEvent.getAction() == 2) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (this.f49530q < this.f49525l) {
                this.f49530q = (int) Math.sqrt(Math.pow(x - this.f49526m, 2.0d) + Math.pow(y - this.f49527n, 2.0d));
            }
            if (this.f49530q > this.f49525l && (interfaceC12899c = this.f49531r) != null) {
                if (!this.f49532s && (interfaceC12895b = this.f49534u) != null) {
                    this.f49532s = true;
                    interfaceC12895b.mo73501b(interfaceC12899c);
                }
                m73496v(this.f49531r, x - this.f49528o, y - this.f49529p);
                this.f49533t = true;
            }
            this.f49528o = x;
            this.f49529p = y;
        }
        return this.f49524k;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C12898b c12898b) {
        this.f49535v = c12898b;
    }

    /* JADX INFO: renamed from: q */
    public void m73493q(int i) {
        this.f49538y = i;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m73494s() {
        if (this.f49519f.getBottom() - (this.f49531r.getSize().top + ((Integer) this.f49531r.getTranslation().second).intValue()) <= 0) {
            return false;
        }
        m73486J();
        return true;
    }

    public void setMaskVisibility(boolean z) {
        if (z != this.f49523j) {
            this.f49523j = z;
            this.f49519f.setVisibility(z ? 0 : 4);
            invalidate();
        }
    }

    public void setOnDragListener(InterfaceC12895b interfaceC12895b) {
        this.f49534u = interfaceC12895b;
    }

    /* JADX INFO: renamed from: u */
    public void m73495u() {
        DialogC12774a dialogC12774a = this.f49536w;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        Act act = act();
        if (act != null) {
            act.hideInput(this.f49517d);
        }
        this.f49536w.dismiss();
    }

    /* JADX INFO: renamed from: v */
    public final void m73496v(InterfaceC12899c interfaceC12899c, int i, int i2) {
        Pair<Integer, Integer> translation = interfaceC12899c.getTranslation();
        int[] iArrM73497w = m73497w(i + ((Integer) translation.first).intValue(), i2 + ((Integer) translation.second).intValue());
        int iIntValue = interfaceC12899c.getSize().top + ((Integer) interfaceC12899c.getTranslation().second).intValue();
        int iIntValue2 = interfaceC12899c.getSize().top + iArrM73497w[1] + ((Integer) interfaceC12899c.getTranslation().second).intValue();
        int bottom = this.f49519f.getBottom();
        boolean z = bottom - iIntValue > 0;
        boolean z2 = bottom - iIntValue2 > 0;
        if (z && !z2) {
            m73485I();
        } else if (!z && z2) {
            m73484H();
        }
        interfaceC12899c.mo73436n(iArrM73497w[0]);
        interfaceC12899c.mo73437v(iArrM73497w[1]);
        InterfaceC12895b interfaceC12895b = this.f49534u;
        if (interfaceC12895b != null) {
            interfaceC12895b.mo73500a(interfaceC12899c);
        }
    }

    /* JADX INFO: renamed from: w */
    public final int[] m73497w(int i, int i2) {
        int i3 = this.f49531r.getSize().left;
        int width = i + i3;
        int iWidth = this.f49531r.getSize().width();
        if (width < 0) {
            width = 0;
        } else {
            float f = iWidth * 1.0f;
            if (getWidth() - width < f) {
                width = (int) (getWidth() - f);
            }
        }
        Pair<Integer, Integer> translation = this.f49531r.getTranslation();
        int i4 = this.f49531r.getSize().top;
        int i5 = i2 + i4;
        int iHeight = this.f49531r.getSize().height();
        int height = (getHeight() - qa00.m175859d(60.0f)) - 1;
        int height2 = (getHeight() - qa00.m175859d(266.0f)) - 1;
        int i6 = this.f49538y + 1;
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
    public final /* synthetic */ boolean m73498y(InterfaceC12899c interfaceC12899c, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f49533t = false;
            this.f49531r = interfaceC12899c;
            this.f49524k = true;
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m73499z(InterfaceC12899c interfaceC12899c, InterfaceC12899c interfaceC12899c2) {
        m73487K(interfaceC12899c.getContent(), interfaceC12899c.getMaxCount());
    }

    public LiveStickerContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveStickerContainer(@NonNull Context context) {
        this(context, null);
    }
}
