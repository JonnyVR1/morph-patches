package com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer;
import p147v.VEditText;
import p147v.VText;
import p149l.byr;
import p149l.d30;
import p149l.d8c0;
import p149l.l9e;
import p149l.lsi0;
import p149l.oar;
import p149l.r5u;
import p149l.s5u;
import p149l.s7m;
import p149l.t100;
import p149l.zwf0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveStickerContainer extends FrameLayout implements s7m<C12735b> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f48666a;

    /* JADX INFO: renamed from: b */
    public View f48667b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f48668c;

    /* JADX INFO: renamed from: d */
    public VEditText f48669d;

    /* JADX INFO: renamed from: e */
    public VText f48670e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f48671f;

    /* JADX INFO: renamed from: g */
    public VText f48672g;

    /* JADX INFO: renamed from: h */
    public Paint f48673h;

    /* JADX INFO: renamed from: i */
    public Path f48674i;

    /* JADX INFO: renamed from: j */
    public boolean f48675j;

    /* JADX INFO: renamed from: k */
    public boolean f48676k;

    /* JADX INFO: renamed from: l */
    public int f48677l;

    /* JADX INFO: renamed from: m */
    public int f48678m;

    /* JADX INFO: renamed from: n */
    public int f48679n;

    /* JADX INFO: renamed from: o */
    public int f48680o;

    /* JADX INFO: renamed from: p */
    public int f48681p;

    /* JADX INFO: renamed from: q */
    public int f48682q;

    /* JADX INFO: renamed from: r */
    public InterfaceC12736c f48683r;

    /* JADX INFO: renamed from: s */
    public boolean f48684s;

    /* JADX INFO: renamed from: t */
    public boolean f48685t;

    /* JADX INFO: renamed from: u */
    public InterfaceC12732b f48686u;

    /* JADX INFO: renamed from: v */
    public C12735b f48687v;

    /* JADX INFO: renamed from: w */
    public DialogC12611a f48688w;

    /* JADX INFO: renamed from: x */
    public InterfaceC12736c f48689x;

    /* JADX INFO: renamed from: y */
    public int f48690y;

    /* JADX INFO: renamed from: z */
    public Paint f48691z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer$a */
    public class C12731a implements TextWatcher {
        public C12731a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int length = editable.toString().trim().length();
            LiveStickerContainer liveStickerContainer = LiveStickerContainer.this;
            if (length > 0) {
                liveStickerContainer.f48670e.setEnabled(true);
            } else {
                liveStickerContainer.f48670e.setEnabled(false);
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
    public interface InterfaceC12732b {
        /* JADX INFO: renamed from: a */
        void mo72317a(InterfaceC12736c interfaceC12736c);

        /* JADX INFO: renamed from: b */
        void mo72318b(InterfaceC12736c interfaceC12736c);

        /* JADX INFO: renamed from: c */
        void mo72319c(InterfaceC12736c interfaceC12736c, boolean z);
    }

    public LiveStickerContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48690y = l9e.m149018b();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m72288c(DialogInterface dialogInterface) {
    }

    private void init() {
        Paint paint = new Paint();
        this.f48673h = paint;
        paint.setAntiAlias(true);
        this.f48673h.setStrokeWidth(t100.f167252a);
        this.f48673h.setColor(-1711276033);
        this.f48673h.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f48691z = paint2;
        paint2.setAntiAlias(true);
        this.f48691z.setColor(701975863);
        this.f48691z.setStyle(Paint.Style.FILL);
        this.f48674i = new Path();
        int i = t100.f167257f;
        this.f48673h.setPathEffect(new DashPathEffect(new float[]{i, i}, 0.0f));
        this.f48677l = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private void setMaxCountFilter(int i) {
        this.f48669d.setFilters(new InputFilter[]{new oar(i * 2, new d30() { // from class: l.j5u
            @Override // p149l.d30
            public final void call() {
                this.f116351a.m72299F();
            }
        })});
    }

    /* JADX INFO: renamed from: x */
    private void m72294x() {
        byr byrVar = new byr(this.f48687v, d8c0.f84852g, m72306l(act().inflater(), null));
        this.f48688w = byrVar;
        byrVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.o5u
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                LiveStickerContainer.m72288c(dialogInterface);
            }
        });
        this.f48688w.m71771c0(d8c0.f84857l);
        this.f48667b.setOnClickListener(new View.OnClickListener() { // from class: l.p5u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147325a.m72296B(view);
            }
        });
        this.f48670e.setOnClickListener(new View.OnClickListener() { // from class: l.q5u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152823a.m72297C(view);
            }
        });
        this.f48669d.addTextChangedListener(new C12731a());
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m72295A(BLiveAddStickerResult bLiveAddStickerResult, View view) {
        this.f48687v.m206028F2().StickerEvent.openGiftStickerDialog().mo172463j(bLiveAddStickerResult.content);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m72296B(View view) {
        m72312u();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m72297C(View view) {
        this.f48687v.m72463T4(this.f48669d.getText().toString());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m72298E() {
        this.f48672g.setScaleX(1.0f);
        this.f48672g.setScaleY(1.0f);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m72299F() {
        if (TextUtils.isEmpty(this.f48669d.getText().toString().trim())) {
            return;
        }
        lsi0.m151578h(R$string.f47150be);
    }

    /* JADX INFO: renamed from: G */
    public InterfaceC12736c m72300G(String str) {
        InterfaceC12736c interfaceC12736c = this.f48689x;
        if (interfaceC12736c == null || TextUtils.equals(str, interfaceC12736c.getContent())) {
            return null;
        }
        this.f48689x.mo72249T(null, str);
        return this.f48689x;
    }

    /* JADX INFO: renamed from: H */
    public final void m72301H() {
        this.f48672g.setScaleX(1.0f);
        this.f48672g.setScaleY(1.0f);
        this.f48672g.animate().scaleX(1.2f).scaleY(1.2f).setDuration(200L).start();
    }

    /* JADX INFO: renamed from: I */
    public final void m72302I() {
        this.f48672g.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200L).withEndAction(new Runnable() { // from class: l.k5u
            @Override // java.lang.Runnable
            public final void run() {
                this.f121234a.m72298E();
            }
        }).start();
    }

    /* JADX INFO: renamed from: J */
    public void m72303J() {
        Object obj = this.f48689x;
        if (obj instanceof View) {
            removeView((View) obj);
        }
        this.f48689x = null;
    }

    /* JADX INFO: renamed from: K */
    public void m72304K(String str, int i) {
        if (this.f48688w == null) {
            m72294x();
        }
        setMaxCountFilter(i);
        if (this.f48688w.isShowing()) {
            return;
        }
        this.f48688w.show();
        this.f48669d.setText(str);
        this.f48669d.setSelection(str.length());
        this.f48669d.requestFocus();
    }

    @Override // p149l.s7m
    public void destroy() {
        m72312u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f48675j) {
            this.f48674i.reset();
            float bottom = this.f48671f.getBottom() + 1;
            this.f48674i.moveTo(0.0f, bottom);
            this.f48674i.lineTo(getWidth(), bottom);
            canvas.drawPath(this.f48674i, this.f48673h);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if ((action == 1 || action == 3) && this.f48676k) {
            InterfaceC12736c interfaceC12736c = this.f48683r;
            if (interfaceC12736c != null && interfaceC12736c.mo72247L() && !this.f48685t) {
                this.f48683r.performClick();
            }
            this.f48676k = false;
            this.f48684s = false;
            boolean zM72311s = m72311s();
            InterfaceC12732b interfaceC12732b = this.f48686u;
            if (interfaceC12732b != null) {
                interfaceC12732b.mo72319c(this.f48683r, zM72311s);
            }
            this.f48683r = null;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public InterfaceC12736c getCurrentSticker() {
        return this.f48689x;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m72305k(View view) {
        r5u.m177957a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public View m72306l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s5u.m182379b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public InterfaceC12736c m72307m(final BLiveAddStickerResult bLiveAddStickerResult) {
        if (getChildCount() == 2) {
            removeView(getChildAt(1));
        }
        final InterfaceC12736c interfaceC12736cM220591a = zwf0.m220591a(bLiveAddStickerResult, this.f48687v.act());
        interfaceC12736cM220591a.setOnTouchListener(new InterfaceC12736c.b() { // from class: l.l5u
            @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c.b
            /* JADX INFO: renamed from: a */
            public final boolean mo72470a(InterfaceC12736c interfaceC12736c, MotionEvent motionEvent) {
                return this.f126203a.m72315y(interfaceC12736c, motionEvent);
            }
        });
        int width = (int) (bLiveAddStickerResult.position.f44430x * getWidth());
        int height = (int) ((bLiveAddStickerResult.position.f44431y * (getHeight() - this.f48671f.getBottom())) + this.f48671f.getBottom());
        FrameLayout.LayoutParams layoutParamsMo72246C = interfaceC12736cM220591a.mo72246C();
        layoutParamsMo72246C.leftMargin = width;
        layoutParamsMo72246C.topMargin = height;
        m72308n(interfaceC12736cM220591a, layoutParamsMo72246C);
        if ((interfaceC12736cM220591a instanceof InteractiveSticker) || (interfaceC12736cM220591a instanceof GiftSticker)) {
            interfaceC12736cM220591a.setOnClickListener(new InterfaceC12736c.a() { // from class: l.m5u
                @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c.a
                /* JADX INFO: renamed from: a */
                public final void mo72469a(InterfaceC12736c interfaceC12736c) {
                    this.f131421a.m72316z(interfaceC12736cM220591a, interfaceC12736c);
                }
            });
        }
        if (interfaceC12736cM220591a instanceof GiftSticker) {
            ((GiftSticker) interfaceC12736cM220591a).setGiftClick(new View.OnClickListener() { // from class: l.n5u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f137233a.m72295A(bLiveAddStickerResult, view);
                }
            });
        }
        this.f48689x = interfaceC12736cM220591a;
        return interfaceC12736cM220591a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final void m72308n(InterfaceC12736c interfaceC12736c, FrameLayout.LayoutParams layoutParams) {
        if (interfaceC12736c instanceof View) {
            addView((View) interfaceC12736c, layoutParams);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72305k(this);
        init();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f48678m = (int) motionEvent.getX();
            this.f48679n = (int) motionEvent.getY();
            this.f48680o = (int) motionEvent.getX();
            this.f48681p = (int) motionEvent.getY();
            this.f48682q = 0;
        }
        return this.f48676k || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC12736c interfaceC12736c;
        InterfaceC12732b interfaceC12732b;
        if (motionEvent.getAction() == 2) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (this.f48682q < this.f48677l) {
                this.f48682q = (int) Math.sqrt(Math.pow(x - this.f48678m, 2.0d) + Math.pow(y - this.f48679n, 2.0d));
            }
            if (this.f48682q > this.f48677l && (interfaceC12736c = this.f48683r) != null) {
                if (!this.f48684s && (interfaceC12732b = this.f48686u) != null) {
                    this.f48684s = true;
                    interfaceC12732b.mo72318b(interfaceC12736c);
                }
                m72313v(this.f48683r, x - this.f48680o, y - this.f48681p);
                this.f48685t = true;
            }
            this.f48680o = x;
            this.f48681p = y;
        }
        return this.f48676k;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C12735b c12735b) {
        this.f48687v = c12735b;
    }

    /* JADX INFO: renamed from: q */
    public void m72310q(int i) {
        this.f48690y = i;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m72311s() {
        if (this.f48671f.getBottom() - (this.f48683r.getSize().top + ((Integer) this.f48683r.getTranslation().second).intValue()) <= 0) {
            return false;
        }
        m72303J();
        return true;
    }

    public void setMaskVisibility(boolean z) {
        if (z != this.f48675j) {
            this.f48675j = z;
            this.f48671f.setVisibility(z ? 0 : 4);
            invalidate();
        }
    }

    public void setOnDragListener(InterfaceC12732b interfaceC12732b) {
        this.f48686u = interfaceC12732b;
    }

    /* JADX INFO: renamed from: u */
    public void m72312u() {
        DialogC12611a dialogC12611a = this.f48688w;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        Act act = act();
        if (act != null) {
            act.hideInput(this.f48669d);
        }
        this.f48688w.dismiss();
    }

    /* JADX INFO: renamed from: v */
    public final void m72313v(InterfaceC12736c interfaceC12736c, int i, int i2) {
        Pair<Integer, Integer> translation = interfaceC12736c.getTranslation();
        int[] iArrM72314w = m72314w(i + ((Integer) translation.first).intValue(), i2 + ((Integer) translation.second).intValue());
        int iIntValue = interfaceC12736c.getSize().top + ((Integer) interfaceC12736c.getTranslation().second).intValue();
        int iIntValue2 = interfaceC12736c.getSize().top + iArrM72314w[1] + ((Integer) interfaceC12736c.getTranslation().second).intValue();
        int bottom = this.f48671f.getBottom();
        boolean z = bottom - iIntValue > 0;
        boolean z2 = bottom - iIntValue2 > 0;
        if (z && !z2) {
            m72302I();
        } else if (!z && z2) {
            m72301H();
        }
        interfaceC12736c.mo72253n(iArrM72314w[0]);
        interfaceC12736c.mo72254v(iArrM72314w[1]);
        InterfaceC12732b interfaceC12732b = this.f48686u;
        if (interfaceC12732b != null) {
            interfaceC12732b.mo72317a(interfaceC12736c);
        }
    }

    /* JADX INFO: renamed from: w */
    public final int[] m72314w(int i, int i2) {
        int i3 = this.f48683r.getSize().left;
        int width = i + i3;
        int iWidth = this.f48683r.getSize().width();
        if (width < 0) {
            width = 0;
        } else {
            float f = iWidth * 1.0f;
            if (getWidth() - width < f) {
                width = (int) (getWidth() - f);
            }
        }
        Pair<Integer, Integer> translation = this.f48683r.getTranslation();
        int i4 = this.f48683r.getSize().top;
        int i5 = i2 + i4;
        int iHeight = this.f48683r.getSize().height();
        int height = (getHeight() - t100.m186890d(60.0f)) - 1;
        int height2 = (getHeight() - t100.m186890d(266.0f)) - 1;
        int i6 = this.f48690y + 1;
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
    public final /* synthetic */ boolean m72315y(InterfaceC12736c interfaceC12736c, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f48685t = false;
            this.f48683r = interfaceC12736c;
            this.f48676k = true;
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m72316z(InterfaceC12736c interfaceC12736c, InterfaceC12736c interfaceC12736c2) {
        m72304K(interfaceC12736c.getContent(), interfaceC12736c.getMaxCount());
    }

    public LiveStickerContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveStickerContainer(@NonNull Context context) {
        this(context, null);
    }
}
