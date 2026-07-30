package com.rengwuxian.materialedittext;

import android.R;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import org.slf4j.Marker;
import p153l.if5;
import p153l.jac0;
import p153l.jvd;
import p153l.qbc0;
import p153l.whc0;
import p153l.yiw;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes10.dex */
public class MaterialEditText extends EditText {

    /* JADX INFO: renamed from: A */
    private int f55844A;

    /* JADX INFO: renamed from: B */
    private int f55845B;

    /* JADX INFO: renamed from: C */
    private int f55846C;

    /* JADX INFO: renamed from: D */
    private float f55847D;

    /* JADX INFO: renamed from: E */
    private float f55848E;

    /* JADX INFO: renamed from: E0 */
    private int f55849E0;

    /* JADX INFO: renamed from: F */
    private String f55850F;

    /* JADX INFO: renamed from: F0 */
    private int f55851F0;

    /* JADX INFO: renamed from: G */
    private int f55852G;

    /* JADX INFO: renamed from: G0 */
    private int f55853G0;

    /* JADX INFO: renamed from: H */
    private String f55854H;

    /* JADX INFO: renamed from: H0 */
    private int f55855H0;

    /* JADX INFO: renamed from: I */
    private float f55856I;

    /* JADX INFO: renamed from: I0 */
    private boolean f55857I0;

    /* JADX INFO: renamed from: J */
    private boolean f55858J;

    /* JADX INFO: renamed from: J0 */
    private boolean f55859J0;

    /* JADX INFO: renamed from: K */
    private float f55860K;

    /* JADX INFO: renamed from: K0 */
    private ColorStateList f55861K0;

    /* JADX INFO: renamed from: L */
    private Typeface f55862L;

    /* JADX INFO: renamed from: L0 */
    private ColorStateList f55863L0;

    /* JADX INFO: renamed from: M */
    private Typeface f55864M;

    /* JADX INFO: renamed from: M0 */
    private ArgbEvaluator f55865M0;

    /* JADX INFO: renamed from: N */
    private CharSequence f55866N;

    /* JADX INFO: renamed from: N0 */
    Paint f55867N0;

    /* JADX INFO: renamed from: O */
    private boolean f55868O;

    /* JADX INFO: renamed from: O0 */
    TextPaint f55869O0;

    /* JADX INFO: renamed from: P */
    private int f55870P;

    /* JADX INFO: renamed from: P0 */
    StaticLayout f55871P0;

    /* JADX INFO: renamed from: Q */
    private int f55872Q;

    /* JADX INFO: renamed from: Q0 */
    ObjectAnimator f55873Q0;

    /* JADX INFO: renamed from: R */
    private boolean f55874R;

    /* JADX INFO: renamed from: R0 */
    ObjectAnimator f55875R0;

    /* JADX INFO: renamed from: S */
    private boolean f55876S;

    /* JADX INFO: renamed from: S0 */
    ObjectAnimator f55877S0;

    /* JADX INFO: renamed from: T */
    private boolean f55878T;

    /* JADX INFO: renamed from: T0 */
    View.OnFocusChangeListener f55879T0;

    /* JADX INFO: renamed from: U */
    private Bitmap[] f55880U;

    /* JADX INFO: renamed from: U0 */
    View.OnFocusChangeListener f55881U0;

    /* JADX INFO: renamed from: V */
    private Bitmap[] f55882V;

    /* JADX INFO: renamed from: V0 */
    private List<yiw> f55883V0;

    /* JADX INFO: renamed from: W */
    private Bitmap[] f55884W;

    /* JADX INFO: renamed from: W0 */
    int f55885W0;

    /* JADX INFO: renamed from: X0 */
    public boolean f55886X0;

    /* JADX INFO: renamed from: a */
    private int f55887a;

    /* JADX INFO: renamed from: b */
    private int f55888b;

    /* JADX INFO: renamed from: c */
    private int f55889c;

    /* JADX INFO: renamed from: d */
    private int f55890d;

    /* JADX INFO: renamed from: e */
    private int f55891e;

    /* JADX INFO: renamed from: f */
    private int f55892f;

    /* JADX INFO: renamed from: g */
    private int f55893g;

    /* JADX INFO: renamed from: h */
    private int f55894h;

    /* JADX INFO: renamed from: i */
    private int f55895i;

    /* JADX INFO: renamed from: j */
    private int f55896j;

    /* JADX INFO: renamed from: k */
    private boolean f55897k;

    /* JADX INFO: renamed from: k0 */
    private Bitmap[] f55898k0;

    /* JADX INFO: renamed from: l */
    private boolean f55899l;

    /* JADX INFO: renamed from: m */
    private int f55900m;

    /* JADX INFO: renamed from: n */
    private int f55901n;

    /* JADX INFO: renamed from: o */
    private int f55902o;

    /* JADX INFO: renamed from: p */
    private int f55903p;

    /* JADX INFO: renamed from: p0 */
    private boolean f55904p0;

    /* JADX INFO: renamed from: q */
    private int f55905q;

    /* JADX INFO: renamed from: r */
    private int f55906r;

    /* JADX INFO: renamed from: s */
    private boolean f55907s;

    /* JADX INFO: renamed from: t */
    private int f55908t;

    /* JADX INFO: renamed from: u */
    private boolean f55909u;

    /* JADX INFO: renamed from: v */
    private int f55910v;

    /* JADX INFO: renamed from: w */
    private int f55911w;

    /* JADX INFO: renamed from: x */
    private boolean f55912x;

    /* JADX INFO: renamed from: y */
    private boolean f55913y;

    /* JADX INFO: renamed from: z */
    private boolean f55914z;

    /* JADX INFO: renamed from: com.rengwuxian.materialedittext.MaterialEditText$a */
    public class C13355a implements TextWatcher {
        public C13355a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MaterialEditText.this.m81610j();
            boolean z = MaterialEditText.this.f55874R;
            MaterialEditText materialEditText = MaterialEditText.this;
            if (z) {
                materialEditText.m81627F();
            } else {
                materialEditText.setError(null);
            }
            MaterialEditText.this.postInvalidate();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.rengwuxian.materialedittext.MaterialEditText$b */
    public class C13356b implements TextWatcher {
        public C13356b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (MaterialEditText.this.f55897k) {
                int length = editable.length();
                MaterialEditText materialEditText = MaterialEditText.this;
                if (length == 0) {
                    if (materialEditText.f55858J) {
                        MaterialEditText.this.f55858J = false;
                        MaterialEditText.this.getLabelAnimator().reverse();
                        return;
                    }
                    return;
                }
                if (materialEditText.f55858J) {
                    return;
                }
                MaterialEditText.this.f55858J = true;
                boolean zIsStarted = MaterialEditText.this.getLabelAnimator().isStarted();
                MaterialEditText materialEditText2 = MaterialEditText.this;
                if (zIsStarted) {
                    materialEditText2.getLabelAnimator().reverse();
                } else {
                    materialEditText2.getLabelAnimator().start();
                }
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.rengwuxian.materialedittext.MaterialEditText$c */
    public class ViewOnFocusChangeListenerC13357c implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC13357c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (MaterialEditText.this.f55897k && MaterialEditText.this.f55899l) {
                MaterialEditText materialEditText = MaterialEditText.this;
                if (z) {
                    boolean zIsStarted = materialEditText.getLabelFocusAnimator().isStarted();
                    MaterialEditText materialEditText2 = MaterialEditText.this;
                    if (zIsStarted) {
                        materialEditText2.getLabelFocusAnimator().reverse();
                    } else {
                        materialEditText2.getLabelFocusAnimator().start();
                    }
                } else {
                    materialEditText.getLabelFocusAnimator().reverse();
                }
            }
            View.OnFocusChangeListener onFocusChangeListener = MaterialEditText.this.f55881U0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z);
            }
        }
    }

    public MaterialEditText(Context context) {
        super(context);
        this.f55907s = false;
        this.f55852G = -1;
        this.f55865M0 = new ArgbEvaluator();
        this.f55867N0 = new Paint(1);
        this.f55869O0 = new TextPaint(1);
        this.f55885W0 = 0;
        this.f55886X0 = false;
        m81618r(context, null);
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: A */
    private boolean m81597A() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: B */
    private void m81598B() {
        ColorStateList colorStateList = this.f55863L0;
        if (colorStateList == null) {
            setHintTextColor((this.f55900m & 16777215) | 1140850688);
        } else {
            setHintTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: C */
    private void m81599C() {
        ColorStateList colorStateList = this.f55861K0;
        if (colorStateList != null) {
            setTextColor(colorStateList);
            return;
        }
        int[][] iArr = {new int[]{R.attr.state_enabled}, EditText.EMPTY_STATE_SET};
        int i = this.f55900m;
        ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{(i & 16777215) | (-553648128), (i & 16777215) | 1140850688});
        this.f55861K0 = colorStateList2;
        setTextColor(colorStateList2);
    }

    /* JADX INFO: renamed from: D */
    private Bitmap m81600D(Bitmap bitmap) {
        int i;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMax = Math.max(width, height);
        int i2 = this.f55849E0;
        if (iMax == i2 || iMax <= i2) {
            return bitmap;
        }
        if (width > i2) {
            i = (int) (i2 * (height / width));
        } else {
            int i3 = (int) (i2 * (width / height));
            i = i2;
            i2 = i3;
        }
        return Bitmap.createScaledBitmap(bitmap, i2, i, false);
    }

    private int getBottomEllipsisWidth() {
        if (this.f55912x) {
            return (this.f55844A * 5) + m81616p(4);
        }
        return 0;
    }

    private int getBottomTextLeftOffset() {
        return m81597A() ? getCharactersCounterWidth() : getBottomEllipsisWidth();
    }

    private int getBottomTextRightOffset() {
        return m81597A() ? getBottomEllipsisWidth() : getCharactersCounterWidth();
    }

    private int getButtonsCount() {
        return isShowClearButton() ? 1 : 0;
    }

    private String getCharactersCounterText() {
        if (this.f55910v <= 0) {
            if (m81597A()) {
                return this.f55911w + " / " + getText().length();
            }
            return getText().length() + " / " + this.f55911w;
        }
        if (this.f55911w <= 0) {
            if (m81597A()) {
                return Marker.ANY_NON_NULL_MARKER + this.f55910v + " / " + getText().length();
            }
            return getText().length() + " / " + this.f55910v + Marker.ANY_NON_NULL_MARKER;
        }
        if (m81597A()) {
            return this.f55911w + "-" + this.f55910v + " / " + getText().length();
        }
        return getText().length() + " / " + this.f55910v + "-" + this.f55911w;
    }

    private int getCharactersCounterWidth() {
        if (m81617q()) {
            return (int) this.f55869O0.measureText(getCharactersCounterText());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator getLabelAnimator() {
        if (this.f55873Q0 == null) {
            this.f55873Q0 = ObjectAnimator.ofFloat(this, "floatingLabelFraction", 0.0f, 1.0f);
        }
        this.f55873Q0.setDuration(this.f55878T ? 300L : 0L);
        return this.f55873Q0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator getLabelFocusAnimator() {
        if (this.f55875R0 == null) {
            this.f55875R0 = ObjectAnimator.ofFloat(this, "focusFraction", 0.0f, 1.0f);
        }
        return this.f55875R0;
    }

    /* JADX INFO: renamed from: i */
    private boolean m81609i() {
        Layout.Alignment alignment;
        int iMax;
        if (getWidth() == 0) {
            return false;
        }
        this.f55869O0.setTextSize(this.f55893g);
        if (this.f55854H == null && this.f55850F == null) {
            iMax = this.f55845B;
        } else {
            if ((getGravity() & 5) == 5 || m81597A()) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = (getGravity() & 3) == 3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            String str = this.f55854H;
            if (str == null) {
                str = this.f55850F;
            }
            StaticLayout staticLayout = new StaticLayout(str, this.f55869O0, (getWidth() - getBottomTextLeftOffset()) - getBottomTextRightOffset(), alignment2, 1.0f, 0.0f, true);
            this.f55871P0 = staticLayout;
            iMax = Math.max(staticLayout.getLineCount(), this.f55846C);
        }
        float f = iMax;
        if (this.f55848E != f) {
            m81614n(f).start();
        }
        this.f55848E = f;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m81610j() {
        int i;
        Editable text = getText();
        boolean z = false;
        int length = text == null ? 0 : text.length();
        if (Math.abs(this.f55885W0 - length) > 3) {
            this.f55886X0 = true;
        }
        this.f55885W0 = length;
        if (!m81617q()) {
            this.f55876S = true;
            return;
        }
        if (length >= this.f55910v && ((i = this.f55911w) <= 0 || length <= i)) {
            z = true;
        }
        this.f55876S = z;
    }

    /* JADX INFO: renamed from: k */
    private void m81611k() {
        int i;
        int buttonsCount = this.f55851F0 * getButtonsCount();
        int i2 = 0;
        if (m81597A()) {
            i = 0;
        } else {
            i = buttonsCount;
            buttonsCount = 0;
        }
        if (TextUtils.isEmpty(getText()) && this.f55904p0) {
            i = 0;
        } else {
            i2 = buttonsCount;
        }
        super.setPadding(this.f55903p + this.f55889c + i2, this.f55901n + this.f55887a, this.f55905q + this.f55890d + i, this.f55902o + this.f55888b);
    }

    /* JADX INFO: renamed from: l */
    private Bitmap[] m81612l(@DrawableRes int i) {
        if (i == -1) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), i, options);
        int iMax = Math.max(options.outWidth, options.outHeight);
        int i2 = this.f55849E0;
        options.inSampleSize = iMax > i2 ? iMax / i2 : 1;
        options.inJustDecodeBounds = false;
        return m81613m(BitmapFactory.decodeResource(getResources(), i, options));
    }

    /* JADX INFO: renamed from: m */
    private Bitmap[] m81613m(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap[] bitmapArr = new Bitmap[4];
        Bitmap bitmapM81600D = m81600D(bitmap);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        bitmapArr[0] = bitmapM81600D.copy(config, true);
        bitmapArr[1] = bitmapM81600D.copy(config, true);
        Canvas canvas = new Canvas(bitmapArr[1]);
        int i = this.f55906r;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        canvas.drawColor(i, mode);
        bitmapArr[2] = bitmapM81600D.copy(config, true);
        Canvas canvas2 = new Canvas(bitmapArr[2]);
        int i2 = this.f55900m;
        canvas2.drawColor((if5.m139722a(i2) ? 1275068416 : 1107296256) | (16777215 & i2), mode);
        bitmapArr[3] = bitmapM81600D.copy(config, true);
        new Canvas(bitmapArr[3]).drawColor(this.f55908t, mode);
        return bitmapArr;
    }

    /* JADX INFO: renamed from: n */
    private ObjectAnimator m81614n(float f) {
        ObjectAnimator objectAnimator = this.f55877S0;
        if (objectAnimator == null) {
            this.f55877S0 = ObjectAnimator.ofFloat(this, "currentBottomLines", f);
        } else {
            objectAnimator.cancel();
            this.f55877S0.setFloatValues(f);
        }
        return this.f55877S0;
    }

    /* JADX INFO: renamed from: o */
    private Typeface m81615o(@NonNull String str) {
        return Typeface.createFromAsset(getContext().getResources().getAssets(), str);
    }

    /* JADX INFO: renamed from: p */
    private int m81616p(int i) {
        return jvd.m147011a(getContext(), i);
    }

    /* JADX INFO: renamed from: q */
    private boolean m81617q() {
        return this.f55910v > 0 || this.f55911w > 0;
    }

    /* JADX INFO: renamed from: r */
    private void m81618r(Context context, AttributeSet attributeSet) {
        int i;
        this.f55849E0 = m81616p(32);
        this.f55851F0 = m81616p(48);
        this.f55853G0 = m81616p(32);
        this.f55895i = getResources().getDimensionPixelSize(jac0.f118973d);
        this.f55844A = getResources().getDimensionPixelSize(jac0.f118970a);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, whc0.f189119a);
        this.f55861K0 = typedArrayObtainStyledAttributes.getColorStateList(whc0.f189115E);
        this.f55863L0 = typedArrayObtainStyledAttributes.getColorStateList(whc0.f189116F);
        this.f55900m = typedArrayObtainStyledAttributes.getColor(whc0.f189122d, RoundedDrawable.DEFAULT_BORDER_COLOR);
        TypedValue typedValue = new TypedValue();
        try {
            try {
                context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                i = typedValue.data;
            } catch (Exception unused) {
                i = this.f55900m;
            }
        } catch (Exception unused2) {
            int identifier = getResources().getIdentifier("colorPrimary", "attr", getContext().getPackageName());
            if (identifier == 0) {
                throw new RuntimeException("colorPrimary not found");
            }
            context.getTheme().resolveAttribute(identifier, typedValue, true);
            i = typedValue.data;
        }
        this.f55895i = typedArrayObtainStyledAttributes.getDimensionPixelSize(whc0.f189123e, this.f55895i);
        this.f55896j = typedArrayObtainStyledAttributes.getDimensionPixelSize(whc0.f189126h, this.f55896j);
        this.f55906r = typedArrayObtainStyledAttributes.getColor(whc0.f189113C, i);
        setFloatingLabelInternal(typedArrayObtainStyledAttributes.getInt(whc0.f189128j, 0));
        this.f55908t = typedArrayObtainStyledAttributes.getColor(whc0.f189127i, Color.parseColor("#e7492E"));
        this.f55909u = typedArrayObtainStyledAttributes.getBoolean(whc0.f189143y, true);
        this.f55910v = typedArrayObtainStyledAttributes.getInt(whc0.f189112B, 0);
        this.f55911w = typedArrayObtainStyledAttributes.getInt(whc0.f189144z, 0);
        this.f55912x = typedArrayObtainStyledAttributes.getBoolean(whc0.f189114D, false);
        this.f55850F = typedArrayObtainStyledAttributes.getString(whc0.f189135q);
        this.f55852G = typedArrayObtainStyledAttributes.getColor(whc0.f189137s, -1);
        this.f55846C = typedArrayObtainStyledAttributes.getInt(whc0.f189111A, 0);
        String string = typedArrayObtainStyledAttributes.getString(whc0.f189120b);
        if (string != null && !isInEditMode()) {
            Typeface typefaceM81615o = m81615o(string);
            this.f55862L = typefaceM81615o;
            this.f55869O0.setTypeface(typefaceM81615o);
        }
        String string2 = typedArrayObtainStyledAttributes.getString(whc0.f189117G);
        if (string2 != null && !isInEditMode()) {
            Typeface typefaceM81615o2 = m81615o(string2);
            this.f55864M = typefaceM81615o2;
            setTypeface(typefaceM81615o2);
        }
        String string3 = typedArrayObtainStyledAttributes.getString(whc0.f189132n);
        this.f55866N = string3;
        if (string3 == null) {
            this.f55866N = getHint();
        }
        this.f55894h = typedArrayObtainStyledAttributes.getDimensionPixelSize(whc0.f189131m, this.f55895i);
        this.f55891e = typedArrayObtainStyledAttributes.getDimensionPixelSize(whc0.f189134p, getResources().getDimensionPixelSize(jac0.f118972c));
        this.f55892f = typedArrayObtainStyledAttributes.getColor(whc0.f189133o, -1);
        this.f55878T = typedArrayObtainStyledAttributes.getBoolean(whc0.f189130l, true);
        this.f55893g = typedArrayObtainStyledAttributes.getDimensionPixelSize(whc0.f189124f, getResources().getDimensionPixelSize(jac0.f118971b));
        this.f55868O = typedArrayObtainStyledAttributes.getBoolean(whc0.f189138t, false);
        this.f55870P = typedArrayObtainStyledAttributes.getColor(whc0.f189118H, -1);
        this.f55872Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(whc0.f189139u, -1);
        this.f55874R = typedArrayObtainStyledAttributes.getBoolean(whc0.f189121c, false);
        this.f55880U = m81612l(typedArrayObtainStyledAttributes.getResourceId(whc0.f189140v, -1));
        this.f55882V = m81612l(typedArrayObtainStyledAttributes.getResourceId(whc0.f189142x, -1));
        this.f55904p0 = typedArrayObtainStyledAttributes.getBoolean(whc0.f189125g, false);
        this.f55884W = m81612l(qbc0.f156466a);
        this.f55898k0 = m81612l(qbc0.f156467b);
        this.f55855H0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(whc0.f189141w, m81616p(16));
        this.f55913y = typedArrayObtainStyledAttributes.getBoolean(whc0.f189129k, false);
        this.f55914z = typedArrayObtainStyledAttributes.getBoolean(whc0.f189136r, false);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom});
        int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
        this.f55903p = typedArrayObtainStyledAttributes2.getDimensionPixelSize(1, dimensionPixelSize);
        this.f55901n = typedArrayObtainStyledAttributes2.getDimensionPixelSize(2, dimensionPixelSize);
        this.f55905q = typedArrayObtainStyledAttributes2.getDimensionPixelSize(3, dimensionPixelSize);
        this.f55902o = typedArrayObtainStyledAttributes2.getDimensionPixelSize(4, dimensionPixelSize);
        typedArrayObtainStyledAttributes2.recycle();
        setBackground(null);
        if (this.f55912x) {
            TransformationMethod transformationMethod = getTransformationMethod();
            setSingleLine();
            setTransformationMethod(transformationMethod);
        }
        m81620t();
        m81621u();
        m81622v();
        m81619s();
        m81623w();
        m81610j();
    }

    /* JADX INFO: renamed from: s */
    private void m81619s() {
        addTextChangedListener(new C13356b());
        ViewOnFocusChangeListenerC13357c viewOnFocusChangeListenerC13357c = new ViewOnFocusChangeListenerC13357c();
        this.f55879T0 = viewOnFocusChangeListenerC13357c;
        super.setOnFocusChangeListener(viewOnFocusChangeListenerC13357c);
    }

    private void setFloatingLabelInternal(int i) {
        if (i == 1) {
            this.f55897k = true;
            this.f55899l = false;
        } else if (i != 2) {
            this.f55897k = false;
            this.f55899l = false;
        } else {
            this.f55897k = true;
            this.f55899l = true;
        }
    }

    /* JADX INFO: renamed from: t */
    private void m81620t() {
        int i = 1;
        boolean z = this.f55910v > 0 || this.f55911w > 0 || this.f55912x || this.f55854H != null || this.f55850F != null;
        int i2 = this.f55846C;
        if (i2 > 0) {
            i = i2;
        } else if (!z) {
            i = 0;
        }
        this.f55845B = i;
        this.f55847D = i;
    }

    /* JADX INFO: renamed from: u */
    private void m81621u() {
        this.f55887a = this.f55897k ? this.f55891e + this.f55894h : this.f55894h;
        this.f55869O0.setTextSize(this.f55893g);
        Paint.FontMetrics fontMetrics = this.f55869O0.getFontMetrics();
        int i = (int) ((fontMetrics.descent - fontMetrics.ascent) * this.f55847D);
        boolean z = this.f55868O;
        int i2 = this.f55895i;
        if (!z) {
            i2 *= 2;
        }
        this.f55888b = i + i2;
        int i3 = 0;
        this.f55889c = this.f55880U == null ? 0 : this.f55851F0 + this.f55855H0;
        if (this.f55882V != null) {
            i3 = this.f55855H0 + this.f55851F0;
        }
        this.f55890d = i3;
        m81611k();
    }

    /* JADX INFO: renamed from: v */
    private void m81622v() {
        if (TextUtils.isEmpty(getText())) {
            m81598B();
        } else {
            Editable text = getText();
            setText((CharSequence) null);
            m81598B();
            setText(text);
            setSelection(text.length());
            this.f55856I = 1.0f;
            this.f55858J = true;
            this.f55885W0 = text.length();
        }
        m81599C();
    }

    /* JADX INFO: renamed from: w */
    private void m81623w() {
        addTextChangedListener(new C13355a());
        this.f55885W0 = getText().length();
    }

    /* JADX INFO: renamed from: x */
    private boolean m81624x(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int scrollX = getScrollX() + (this.f55880U == null ? 0 : this.f55851F0 + this.f55855H0);
        int width = this.f55882V == null ? getWidth() : (getWidth() - this.f55851F0) - this.f55855H0;
        if (!m81597A()) {
            scrollX = (width - this.f55851F0) - this.f55905q;
        }
        int scrollY = (((((getScrollY() + getHeight()) - getPaddingBottom()) + this.f55895i) - this.f55853G0) - m81616p(9)) - this.f55896j;
        return x >= ((float) scrollX) && x < ((float) (scrollX + this.f55851F0)) && y >= ((float) scrollY) && y < ((float) (scrollY + this.f55853G0));
    }

    /* JADX INFO: renamed from: z */
    private boolean m81625z() {
        return this.f55854H == null;
    }

    /* JADX INFO: renamed from: E */
    public void m81626E(int i, int i2, int i3, int i4) {
        this.f55901n = i2;
        this.f55902o = i4;
        this.f55903p = i;
        this.f55905q = i3;
        m81611k();
    }

    /* JADX INFO: renamed from: F */
    public boolean m81627F() {
        List<yiw> list = this.f55883V0;
        if (list == null || list.isEmpty()) {
            return true;
        }
        Editable text = getText();
        boolean z = text.length() == 0;
        boolean z2 = true;
        for (yiw yiwVar : this.f55883V0) {
            z2 = z2 && yiwVar.m216350b(text, z);
            if (!z2) {
                setError(yiwVar.m216349a());
                break;
            }
        }
        if (z2) {
            setError(null);
        }
        postInvalidate();
        return z2;
    }

    @Nullable
    public Typeface getAccentTypeface() {
        return this.f55862L;
    }

    public int getBottomTextSize() {
        return this.f55893g;
    }

    @Keep
    public float getCurrentBottomLines() {
        return this.f55847D;
    }

    @Override // android.widget.TextView
    public CharSequence getError() {
        return this.f55854H;
    }

    public int getErrorColor() {
        return this.f55908t;
    }

    @Keep
    public float getFloatingLabelFraction() {
        return this.f55856I;
    }

    public int getFloatingLabelPadding() {
        return this.f55894h;
    }

    public CharSequence getFloatingLabelText() {
        return this.f55866N;
    }

    public int getFloatingLabelTextColor() {
        return this.f55892f;
    }

    public int getFloatingLabelTextSize() {
        return this.f55891e;
    }

    @Keep
    public float getFocusFraction() {
        return this.f55860K;
    }

    public String getHelperText() {
        return this.f55850F;
    }

    public int getHelperTextColor() {
        return this.f55852G;
    }

    public int getInnerPaddingBottom() {
        return this.f55902o;
    }

    public int getInnerPaddingLeft() {
        return this.f55903p;
    }

    public int getInnerPaddingRight() {
        return this.f55905q;
    }

    public int getInnerPaddingTop() {
        return this.f55901n;
    }

    public int getMaxCharacters() {
        return this.f55911w;
    }

    @Keep
    public int getMinBottomTextLines() {
        return this.f55846C;
    }

    @Keep
    public int getMinCharacters() {
        return this.f55910v;
    }

    public int getUnderlineColor() {
        return this.f55870P;
    }

    @Nullable
    public List<yiw> getValidators() {
        return this.f55883V0;
    }

    @Keep
    public boolean isShowClearButton() {
        return this.f55904p0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int innerPaddingLeft;
        int i;
        int i2;
        char c;
        char c2;
        Canvas canvas2 = canvas;
        int scrollX = getScrollX() + (this.f55880U == null ? 0 : this.f55851F0 + this.f55855H0);
        int scrollX2 = getScrollX() + (this.f55882V == null ? getWidth() : (getWidth() - this.f55851F0) - this.f55855H0);
        int scrollY = (getScrollY() + getHeight()) - getPaddingBottom();
        this.f55867N0.setAlpha(255);
        Bitmap[] bitmapArr = this.f55880U;
        if (bitmapArr != null) {
            if (!m81625z()) {
                c2 = 3;
            } else if (isEnabled()) {
                c2 = hasFocus() ? (char) 1 : (char) 0;
            } else {
                c2 = 2;
            }
            Bitmap bitmap = bitmapArr[c2];
            int i3 = scrollX - this.f55855H0;
            int i4 = this.f55851F0;
            int width = (i3 - i4) + ((i4 - bitmap.getWidth()) / 2);
            int i5 = this.f55895i + scrollY;
            int i6 = this.f55853G0;
            canvas2.drawBitmap(bitmap, width, (i5 - i6) + ((i6 - bitmap.getHeight()) / 2), this.f55867N0);
        }
        Bitmap[] bitmapArr2 = this.f55882V;
        if (bitmapArr2 != null) {
            if (!m81625z()) {
                c = 3;
            } else if (isEnabled()) {
                c = hasFocus() ? (char) 1 : (char) 0;
            } else {
                c = 2;
            }
            Bitmap bitmap2 = bitmapArr2[c];
            int width2 = this.f55855H0 + scrollX2 + ((this.f55851F0 - bitmap2.getWidth()) / 2);
            int i7 = this.f55895i + scrollY;
            int i8 = this.f55853G0;
            canvas2.drawBitmap(bitmap2, width2, (i7 - i8) + ((i8 - bitmap2.getHeight()) / 2), this.f55867N0);
        }
        if (hasFocus() && this.f55904p0) {
            this.f55867N0.setAlpha(255);
            int i9 = m81597A() ? scrollX : (scrollX2 - this.f55851F0) - this.f55905q;
            Bitmap bitmap3 = TextUtils.isEmpty(getText()) ? this.f55898k0[0] : this.f55884W[0];
            int width3 = i9 + ((this.f55851F0 - bitmap3.getWidth()) / 2);
            int i10 = this.f55895i + scrollY;
            int i11 = this.f55853G0;
            int height = (((i10 - i11) + ((i11 - bitmap3.getHeight()) / 2)) - m81616p(9)) - this.f55896j;
            if (!TextUtils.isEmpty(getText())) {
                canvas2.drawBitmap(bitmap3, width3, height, this.f55867N0);
            }
        }
        if (!this.f55868O) {
            int i12 = scrollY + this.f55895i;
            if (m81625z() || !this.f55909u) {
                i2 = i12;
                if (!isEnabled()) {
                    Paint paint = this.f55867N0;
                    int i13 = this.f55870P;
                    if (i13 == -1) {
                        i13 = (this.f55900m & 16777215) | 1140850688;
                    }
                    paint.setColor(i13);
                    float fM81616p = m81616p(1);
                    float f = 0.0f;
                    while (f < getWidth()) {
                        float f2 = scrollX + f;
                        float f3 = fM81616p;
                        canvas.drawRect(f2, i2, f2 + fM81616p, m81616p(1) + i2, this.f55867N0);
                        f += 3.0f * f3;
                        fM81616p = f3;
                    }
                } else if (hasFocus()) {
                    this.f55867N0.setColor(this.f55906r);
                    float f4 = scrollX;
                    float f5 = i2;
                    float f6 = scrollX2;
                    int iM81616p = this.f55872Q;
                    if (iM81616p == -1) {
                        iM81616p = m81616p(2);
                    }
                    canvas2 = canvas;
                    canvas2.drawRect(f4, f5, f6, iM81616p + i2, this.f55867N0);
                } else {
                    boolean z = this.f55907s;
                    Paint paint2 = this.f55867N0;
                    if (z) {
                        paint2.setColor(this.f55906r);
                        float f7 = scrollX;
                        float f8 = i2;
                        float f9 = scrollX2;
                        int iM81616p2 = this.f55872Q;
                        if (iM81616p2 == -1) {
                            iM81616p2 = m81616p(2);
                        }
                        canvas2 = canvas;
                        canvas2.drawRect(f7, f8, f9, iM81616p2 + i2, this.f55867N0);
                    } else {
                        int i14 = this.f55870P;
                        if (i14 == -1) {
                            i14 = (this.f55900m & 16777215) | 503316480;
                        }
                        paint2.setColor(i14);
                        canvas2 = canvas;
                        canvas2.drawRect(scrollX, i2, scrollX2, m81616p(1) + i2, this.f55867N0);
                    }
                }
                scrollY = i2;
            } else {
                this.f55867N0.setColor(this.f55908t);
                float f10 = scrollX;
                float f11 = i12;
                float f12 = scrollX2;
                int iM81616p3 = this.f55872Q;
                if (iM81616p3 == -1) {
                    iM81616p3 = m81616p(2);
                }
                i2 = i12;
                canvas2.drawRect(f10, f11, f12, iM81616p3 + i12, this.f55867N0);
            }
            canvas2 = canvas;
            scrollY = i2;
        }
        this.f55869O0.setTextSize(this.f55893g);
        Paint.FontMetrics fontMetrics = this.f55869O0.getFontMetrics();
        float f13 = fontMetrics.ascent;
        float f14 = fontMetrics.descent;
        float f15 = (-f13) - f14;
        float f16 = this.f55893g + f13 + f14;
        if (hasFocus() && m81617q()) {
            this.f55869O0.setColor(m81628y() ? (this.f55900m & 16777215) | 1140850688 : this.f55908t);
            String charactersCounterText = getCharactersCounterText();
            canvas2.drawText(charactersCounterText, m81597A() ? scrollX : scrollX2 - this.f55869O0.measureText(charactersCounterText), this.f55895i + scrollY + f15, this.f55869O0);
        }
        if (this.f55871P0 != null && (this.f55854H != null || ((this.f55914z || hasFocus()) && !TextUtils.isEmpty(this.f55850F)))) {
            TextPaint textPaint = this.f55869O0;
            if (this.f55854H != null) {
                i = this.f55908t;
            } else {
                i = this.f55852G;
                if (i == -1) {
                    i = (this.f55900m & 16777215) | 1140850688;
                }
            }
            textPaint.setColor(i);
            canvas2.save();
            canvas2.translate(getBottomTextLeftOffset() + scrollX, (this.f55895i + scrollY) - f16);
            this.f55871P0.draw(canvas2);
            canvas2.restore();
        }
        if (this.f55897k && !TextUtils.isEmpty(this.f55866N)) {
            this.f55869O0.setTextSize(this.f55891e);
            TextPaint textPaint2 = this.f55869O0;
            ArgbEvaluator argbEvaluator = this.f55865M0;
            float f17 = this.f55860K;
            int i15 = this.f55892f;
            if (i15 == -1) {
                i15 = (this.f55900m & 16777215) | 1140850688;
            }
            textPaint2.setColor(((Integer) argbEvaluator.evaluate(f17, Integer.valueOf(i15), Integer.valueOf(this.f55906r))).intValue());
            float fMeasureText = this.f55869O0.measureText(this.f55866N.toString());
            if ((getGravity() & 5) == 5 || m81597A()) {
                innerPaddingLeft = (int) (scrollX2 - fMeasureText);
            } else {
                innerPaddingLeft = (getGravity() & 3) == 3 ? scrollX : ((int) (getInnerPaddingLeft() + ((((getWidth() - getInnerPaddingLeft()) - getInnerPaddingRight()) - fMeasureText) / 2.0f))) + scrollX;
            }
            int i16 = this.f55901n + this.f55891e;
            int i17 = this.f55894h;
            float f18 = i16 + i17;
            float f19 = i17;
            boolean z2 = this.f55913y;
            int i18 = (int) (f18 - (f19 * (z2 ? 1.0f : this.f55856I)));
            this.f55869O0.setAlpha((int) ((z2 ? 1.0f : this.f55856I) * 255.0f * (this.f55892f == -1 ? (this.f55860K * 0.74f) + 0.26f : 1.0f)));
            canvas2.drawText(this.f55866N.toString(), innerPaddingLeft, i18, this.f55869O0);
        }
        if (hasFocus() && this.f55912x && getScrollX() != 0) {
            this.f55867N0.setColor(this.f55906r);
            float f20 = scrollY + this.f55895i;
            if (m81597A()) {
                scrollX = scrollX2;
            }
            int i19 = m81597A() ? -1 : 1;
            int i20 = this.f55844A;
            canvas2.drawCircle(((i19 * i20) / 2) + scrollX, (i20 / 2) + f20, i20 / 2, this.f55867N0);
            int i21 = this.f55844A;
            canvas2.drawCircle((((i19 * i21) * 5) / 2) + scrollX, (i21 / 2) + f20, i21 / 2, this.f55867N0);
            int i22 = this.f55844A;
            canvas2.drawCircle(scrollX + (((i19 * i22) * 9) / 2), f20 + (i22 / 2), i22 / 2, this.f55867N0);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m81609i();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f55912x && getScrollX() > 0 && motionEvent.getAction() == 0 && motionEvent.getX() < m81616p(20) && motionEvent.getY() > (getHeight() - this.f55888b) - this.f55902o && motionEvent.getY() < getHeight() - this.f55902o) {
            setSelection(0);
            return false;
        }
        if (hasFocus() && this.f55904p0) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    if (this.f55859J0) {
                        if (!TextUtils.isEmpty(getText())) {
                            setText((CharSequence) null);
                        }
                        this.f55859J0 = false;
                    }
                    if (this.f55857I0) {
                        this.f55857I0 = false;
                        return true;
                    }
                    this.f55857I0 = false;
                } else if (action == 2) {
                    if (this.f55859J0 && !m81624x(motionEvent)) {
                        this.f55859J0 = false;
                    }
                    if (this.f55857I0) {
                        return true;
                    }
                } else if (action == 3) {
                    this.f55857I0 = false;
                    this.f55859J0 = false;
                }
            } else if (m81624x(motionEvent)) {
                this.f55857I0 = true;
                this.f55859J0 = true;
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentTypeface(Typeface typeface) {
        this.f55862L = typeface;
        this.f55869O0.setTypeface(typeface);
        postInvalidate();
    }

    public void setAutoValidate(boolean z) {
        this.f55874R = z;
        if (z) {
            m81627F();
        }
    }

    public void setBaseColor(int i) {
        if (this.f55900m != i) {
            this.f55900m = i;
        }
        m81622v();
        postInvalidate();
    }

    public void setBottomTextSize(int i) {
        this.f55893g = i;
        m81621u();
    }

    @Keep
    public void setCurrentBottomLines(float f) {
        this.f55847D = f;
        m81621u();
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        this.f55854H = charSequence == null ? null : charSequence.toString();
        if (m81609i()) {
            postInvalidate();
        }
    }

    public void setErrorBottomLineShown(boolean z) {
        this.f55909u = z;
    }

    public void setErrorColor(int i) {
        this.f55908t = i;
        postInvalidate();
    }

    public void setFloatingLabel(int i) {
        setFloatingLabelInternal(i);
        m81621u();
    }

    public void setFloatingLabelAlwaysShown(boolean z) {
        this.f55913y = z;
        invalidate();
    }

    public void setFloatingLabelAnimating(boolean z) {
        this.f55878T = z;
    }

    @Keep
    public void setFloatingLabelFraction(float f) {
        this.f55856I = f;
        invalidate();
    }

    public void setFloatingLabelPadding(int i) {
        this.f55894h = i;
        postInvalidate();
    }

    public void setFloatingLabelText(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getHint();
        }
        this.f55866N = charSequence;
        postInvalidate();
    }

    public void setFloatingLabelTextColor(int i) {
        this.f55892f = i;
        postInvalidate();
    }

    public void setFloatingLabelTextSize(int i) {
        this.f55891e = i;
        m81621u();
    }

    @Keep
    public void setFocusFraction(float f) {
        this.f55860K = f;
        invalidate();
    }

    public void setForcePrimaryColor(boolean z) {
        this.f55907s = z;
        postInvalidate();
    }

    public void setHelperText(CharSequence charSequence) {
        this.f55850F = charSequence == null ? null : charSequence.toString();
        if (m81609i()) {
            postInvalidate();
        }
    }

    public void setHelperTextAlwaysShown(boolean z) {
        this.f55914z = z;
        invalidate();
    }

    public void setHelperTextColor(int i) {
        this.f55852G = i;
        postInvalidate();
    }

    public void setHideUnderline(boolean z) {
        this.f55868O = z;
        m81621u();
        postInvalidate();
    }

    public void setHighLightUnderlineWidth(int i) {
        this.f55872Q = i;
        postInvalidate();
    }

    @Keep
    public void setIconLeft(@DrawableRes int i) {
        this.f55880U = m81612l(i);
        m81621u();
    }

    @Keep
    public void setIconRight(@DrawableRes int i) {
        this.f55882V = m81612l(i);
        m81621u();
    }

    public void setMaxCharacters(int i) {
        this.f55911w = i;
        m81620t();
        m81621u();
        postInvalidate();
    }

    public void setMetHintTextColor(int i) {
        this.f55863L0 = ColorStateList.valueOf(i);
        m81598B();
    }

    public void setMetTextColor(int i) {
        this.f55861K0 = ColorStateList.valueOf(i);
        m81599C();
    }

    @Keep
    public void setMinBottomTextLines(int i) {
        this.f55846C = i;
        m81620t();
        m81621u();
        postInvalidate();
    }

    @Keep
    public void setMinCharacters(int i) {
        this.f55910v = i;
        m81620t();
        m81621u();
        postInvalidate();
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        if (this.f55879T0 == null) {
            super.setOnFocusChangeListener(onFocusChangeListener);
        } else {
            this.f55881U0 = onFocusChangeListener;
        }
    }

    @Override // android.widget.TextView, android.view.View
    @Deprecated
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    public void setPrimaryColor(int i) {
        this.f55906r = i;
        postInvalidate();
    }

    @Keep
    public void setShowClearButton(boolean z) {
        this.f55904p0 = z;
        m81611k();
    }

    public void setSingleLineEllipsis(boolean z) {
        this.f55912x = z;
        m81620t();
        m81621u();
        postInvalidate();
    }

    public void setUnderlineColor(int i) {
        this.f55870P = i;
        postInvalidate();
    }

    /* JADX INFO: renamed from: y */
    public boolean m81628y() {
        return this.f55876S;
    }

    @Keep
    public void setIconLeft(Bitmap bitmap) {
        this.f55880U = m81613m(bitmap);
        m81621u();
    }

    @Keep
    public void setIconRight(Bitmap bitmap) {
        this.f55882V = m81613m(bitmap);
        m81621u();
    }

    public void setMetHintTextColor(ColorStateList colorStateList) {
        this.f55863L0 = colorStateList;
        m81598B();
    }

    public void setMetTextColor(ColorStateList colorStateList) {
        this.f55861K0 = colorStateList;
        m81599C();
    }

    public MaterialEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55907s = false;
        this.f55852G = -1;
        this.f55865M0 = new ArgbEvaluator();
        this.f55867N0 = new Paint(1);
        this.f55869O0 = new TextPaint(1);
        this.f55885W0 = 0;
        this.f55886X0 = false;
        m81618r(context, attributeSet);
    }

    @TargetApi(21)
    public MaterialEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55907s = false;
        this.f55852G = -1;
        this.f55865M0 = new ArgbEvaluator();
        this.f55867N0 = new Paint(1);
        this.f55869O0 = new TextPaint(1);
        this.f55885W0 = 0;
        this.f55886X0 = false;
        m81618r(context, attributeSet);
    }
}
