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
import android.widget.MultiAutoCompleteTextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import java.util.List;
import p009l.c2c0;
import p009l.ie5;
import p009l.k3c0;
import p009l.q9c0;
import p009l.vtd;
import p009l.zgw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MaterialMultiAutoCompleteTextView extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: A */
    private float f8676A;

    /* JADX INFO: renamed from: B */
    private float f8677B;

    /* JADX INFO: renamed from: C */
    private String f8678C;

    /* JADX INFO: renamed from: D */
    private int f8679D;

    /* JADX INFO: renamed from: E */
    private String f8680E;

    /* JADX INFO: renamed from: E0 */
    private boolean f8681E0;

    /* JADX INFO: renamed from: F */
    private float f8682F;

    /* JADX INFO: renamed from: F0 */
    private boolean f8683F0;

    /* JADX INFO: renamed from: G */
    private boolean f8684G;

    /* JADX INFO: renamed from: G0 */
    private ColorStateList f8685G0;

    /* JADX INFO: renamed from: H */
    private float f8686H;

    /* JADX INFO: renamed from: H0 */
    private ColorStateList f8687H0;

    /* JADX INFO: renamed from: I */
    private Typeface f8688I;

    /* JADX INFO: renamed from: I0 */
    private ArgbEvaluator f8689I0;

    /* JADX INFO: renamed from: J */
    private Typeface f8690J;

    /* JADX INFO: renamed from: J0 */
    Paint f8691J0;

    /* JADX INFO: renamed from: K */
    private CharSequence f8692K;

    /* JADX INFO: renamed from: K0 */
    TextPaint f8693K0;

    /* JADX INFO: renamed from: L */
    private boolean f8694L;

    /* JADX INFO: renamed from: L0 */
    StaticLayout f8695L0;

    /* JADX INFO: renamed from: M */
    private int f8696M;

    /* JADX INFO: renamed from: M0 */
    ObjectAnimator f8697M0;

    /* JADX INFO: renamed from: N */
    private boolean f8698N;

    /* JADX INFO: renamed from: N0 */
    ObjectAnimator f8699N0;

    /* JADX INFO: renamed from: O */
    private boolean f8700O;

    /* JADX INFO: renamed from: O0 */
    ObjectAnimator f8701O0;

    /* JADX INFO: renamed from: P */
    private boolean f8702P;

    /* JADX INFO: renamed from: P0 */
    View.OnFocusChangeListener f8703P0;

    /* JADX INFO: renamed from: Q */
    private Bitmap[] f8704Q;

    /* JADX INFO: renamed from: Q0 */
    View.OnFocusChangeListener f8705Q0;

    /* JADX INFO: renamed from: R */
    private Bitmap[] f8706R;

    /* JADX INFO: renamed from: R0 */
    private List<zgw> f8707R0;

    /* JADX INFO: renamed from: S */
    private Bitmap[] f8708S;

    /* JADX INFO: renamed from: T */
    private Bitmap[] f8709T;

    /* JADX INFO: renamed from: U */
    private boolean f8710U;

    /* JADX INFO: renamed from: V */
    private int f8711V;

    /* JADX INFO: renamed from: W */
    private int f8712W;

    /* JADX INFO: renamed from: a */
    private int f8713a;

    /* JADX INFO: renamed from: b */
    private int f8714b;

    /* JADX INFO: renamed from: c */
    private int f8715c;

    /* JADX INFO: renamed from: d */
    private int f8716d;

    /* JADX INFO: renamed from: e */
    private int f8717e;

    /* JADX INFO: renamed from: f */
    private int f8718f;

    /* JADX INFO: renamed from: g */
    private int f8719g;

    /* JADX INFO: renamed from: h */
    private int f8720h;

    /* JADX INFO: renamed from: i */
    private int f8721i;

    /* JADX INFO: renamed from: j */
    private boolean f8722j;

    /* JADX INFO: renamed from: k */
    private boolean f8723k;

    /* JADX INFO: renamed from: k0 */
    private int f8724k0;

    /* JADX INFO: renamed from: l */
    private int f8725l;

    /* JADX INFO: renamed from: m */
    private int f8726m;

    /* JADX INFO: renamed from: n */
    private int f8727n;

    /* JADX INFO: renamed from: o */
    private int f8728o;

    /* JADX INFO: renamed from: p */
    private int f8729p;

    /* JADX INFO: renamed from: p0 */
    private int f8730p0;

    /* JADX INFO: renamed from: q */
    private int f8731q;

    /* JADX INFO: renamed from: r */
    private int f8732r;

    /* JADX INFO: renamed from: s */
    private int f8733s;

    /* JADX INFO: renamed from: t */
    private int f8734t;

    /* JADX INFO: renamed from: u */
    private boolean f8735u;

    /* JADX INFO: renamed from: v */
    private boolean f8736v;

    /* JADX INFO: renamed from: w */
    private boolean f8737w;

    /* JADX INFO: renamed from: x */
    private int f8738x;

    /* JADX INFO: renamed from: y */
    private int f8739y;

    /* JADX INFO: renamed from: z */
    private int f8740z;

    /* JADX INFO: renamed from: com.rengwuxian.materialedittext.MaterialMultiAutoCompleteTextView$a */
    public class C0597a implements TextWatcher {
        public C0597a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MaterialMultiAutoCompleteTextView.this.m10810j();
            boolean z = MaterialMultiAutoCompleteTextView.this.f8698N;
            MaterialMultiAutoCompleteTextView materialMultiAutoCompleteTextView = MaterialMultiAutoCompleteTextView.this;
            if (z) {
                materialMultiAutoCompleteTextView.m10827F();
            } else {
                materialMultiAutoCompleteTextView.setError(null);
            }
            MaterialMultiAutoCompleteTextView.this.postInvalidate();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.rengwuxian.materialedittext.MaterialMultiAutoCompleteTextView$b */
    public class C0598b implements TextWatcher {
        public C0598b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (MaterialMultiAutoCompleteTextView.this.f8722j) {
                int length = editable.length();
                MaterialMultiAutoCompleteTextView materialMultiAutoCompleteTextView = MaterialMultiAutoCompleteTextView.this;
                if (length == 0) {
                    if (materialMultiAutoCompleteTextView.f8684G) {
                        MaterialMultiAutoCompleteTextView.this.f8684G = false;
                        MaterialMultiAutoCompleteTextView.this.getLabelAnimator().reverse();
                        return;
                    }
                    return;
                }
                if (materialMultiAutoCompleteTextView.f8684G) {
                    return;
                }
                MaterialMultiAutoCompleteTextView.this.f8684G = true;
                boolean zIsStarted = MaterialMultiAutoCompleteTextView.this.getLabelAnimator().isStarted();
                MaterialMultiAutoCompleteTextView materialMultiAutoCompleteTextView2 = MaterialMultiAutoCompleteTextView.this;
                if (zIsStarted) {
                    materialMultiAutoCompleteTextView2.getLabelAnimator().reverse();
                } else {
                    materialMultiAutoCompleteTextView2.getLabelAnimator().start();
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

    /* JADX INFO: renamed from: com.rengwuxian.materialedittext.MaterialMultiAutoCompleteTextView$c */
    public class ViewOnFocusChangeListenerC0599c implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC0599c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (MaterialMultiAutoCompleteTextView.this.f8722j && MaterialMultiAutoCompleteTextView.this.f8723k) {
                MaterialMultiAutoCompleteTextView materialMultiAutoCompleteTextView = MaterialMultiAutoCompleteTextView.this;
                if (z) {
                    boolean zIsStarted = materialMultiAutoCompleteTextView.getLabelFocusAnimator().isStarted();
                    MaterialMultiAutoCompleteTextView materialMultiAutoCompleteTextView2 = MaterialMultiAutoCompleteTextView.this;
                    if (zIsStarted) {
                        materialMultiAutoCompleteTextView2.getLabelFocusAnimator().reverse();
                    } else {
                        materialMultiAutoCompleteTextView2.getLabelFocusAnimator().start();
                    }
                } else {
                    materialMultiAutoCompleteTextView.getLabelFocusAnimator().reverse();
                }
            }
            View.OnFocusChangeListener onFocusChangeListener = MaterialMultiAutoCompleteTextView.this.f8705Q0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z);
            }
        }
    }

    public MaterialMultiAutoCompleteTextView(Context context) {
        super(context);
        this.f8679D = -1;
        this.f8689I0 = new ArgbEvaluator();
        this.f8691J0 = new Paint(1);
        this.f8693K0 = new TextPaint(1);
        m10818r(context, null);
    }

    @TargetApi(MediaPickerParamsObject.FROM_PROFILE_PET)
    /* JADX INFO: renamed from: A */
    private boolean m10797A() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: C */
    private void m10798C() {
        ColorStateList colorStateList = this.f8687H0;
        if (colorStateList == null) {
            setHintTextColor((this.f8725l & 16777215) | 1140850688);
        } else {
            setHintTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: D */
    private void m10799D() {
        ColorStateList colorStateList = this.f8685G0;
        if (colorStateList != null) {
            setTextColor(colorStateList);
            return;
        }
        int[][] iArr = {new int[]{R.attr.state_enabled}, MultiAutoCompleteTextView.EMPTY_STATE_SET};
        int i = this.f8725l;
        ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{(i & 16777215) | (-553648128), (i & 16777215) | 1140850688});
        this.f8685G0 = colorStateList2;
        setTextColor(colorStateList2);
    }

    /* JADX INFO: renamed from: E */
    private Bitmap m10800E(Bitmap bitmap) {
        int i;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMax = Math.max(width, height);
        int i2 = this.f8711V;
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
        if (this.f8735u) {
            return (this.f8738x * 5) + m10816p(4);
        }
        return 0;
    }

    private int getBottomTextLeftOffset() {
        return m10797A() ? getCharactersCounterWidth() : getBottomEllipsisWidth();
    }

    private int getBottomTextRightOffset() {
        return m10797A() ? getBottomEllipsisWidth() : getCharactersCounterWidth();
    }

    private int getButtonsCount() {
        return m10826B() ? 1 : 0;
    }

    private String getCharactersCounterText() {
        if (this.f8733s <= 0) {
            if (m10797A()) {
                return this.f8734t + " / " + getText().length();
            }
            return getText().length() + " / " + this.f8734t;
        }
        if (this.f8734t <= 0) {
            if (m10797A()) {
                return "+" + this.f8733s + " / " + getText().length();
            }
            return getText().length() + " / " + this.f8733s + "+";
        }
        if (m10797A()) {
            return this.f8734t + "-" + this.f8733s + " / " + getText().length();
        }
        return getText().length() + " / " + this.f8733s + "-" + this.f8734t;
    }

    private int getCharactersCounterWidth() {
        if (m10817q()) {
            return (int) this.f8693K0.measureText(getCharactersCounterText());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator getLabelAnimator() {
        if (this.f8697M0 == null) {
            this.f8697M0 = ObjectAnimator.ofFloat(this, "floatingLabelFraction", 0.0f, 1.0f);
        }
        this.f8697M0.setDuration(this.f8702P ? 300L : 0L);
        return this.f8697M0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator getLabelFocusAnimator() {
        if (this.f8699N0 == null) {
            this.f8699N0 = ObjectAnimator.ofFloat(this, "focusFraction", 0.0f, 1.0f);
        }
        return this.f8699N0;
    }

    /* JADX INFO: renamed from: i */
    private boolean m10809i() {
        Layout.Alignment alignment;
        int iMax;
        if (getWidth() == 0) {
            return false;
        }
        this.f8693K0.setTextSize(this.f8719g);
        if (this.f8680E == null && this.f8678C == null) {
            iMax = this.f8739y;
        } else {
            if ((getGravity() & 5) == 5 || m10797A()) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = (getGravity() & 3) == 3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            String str = this.f8680E;
            if (str == null) {
                str = this.f8678C;
            }
            StaticLayout staticLayout = new StaticLayout(str, this.f8693K0, (((getWidth() - getBottomTextLeftOffset()) - getBottomTextRightOffset()) - getPaddingLeft()) - getPaddingRight(), alignment2, 1.0f, 0.0f, true);
            this.f8695L0 = staticLayout;
            iMax = Math.max(staticLayout.getLineCount(), this.f8740z);
        }
        float f = iMax;
        if (this.f8677B != f) {
            m10814n(f).start();
        }
        this.f8677B = f;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m10810j() {
        int i;
        boolean z = true;
        if (!m10817q()) {
            this.f8700O = true;
            return;
        }
        Editable text = getText();
        int length = text == null ? 0 : text.length();
        if (length < this.f8733s || ((i = this.f8734t) > 0 && length > i)) {
            z = false;
        }
        this.f8700O = z;
    }

    /* JADX INFO: renamed from: k */
    private void m10811k() {
        int buttonsCount = this.f8712W * getButtonsCount();
        int i = 0;
        if (!m10797A()) {
            i = buttonsCount;
            buttonsCount = 0;
        }
        super.setPadding(this.f8728o + this.f8715c + buttonsCount, this.f8726m + this.f8713a, this.f8729p + this.f8716d + i, this.f8727n + this.f8714b);
    }

    /* JADX INFO: renamed from: l */
    private Bitmap[] m10812l(@DrawableRes int i) {
        if (i == -1) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), i, options);
        int iMax = Math.max(options.outWidth, options.outHeight);
        int i2 = this.f8711V;
        options.inSampleSize = iMax > i2 ? iMax / i2 : 1;
        options.inJustDecodeBounds = false;
        return m10813m(BitmapFactory.decodeResource(getResources(), i, options));
    }

    /* JADX INFO: renamed from: m */
    private Bitmap[] m10813m(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap[] bitmapArr = new Bitmap[4];
        Bitmap bitmapM10800E = m10800E(bitmap);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        bitmapArr[0] = bitmapM10800E.copy(config, true);
        Canvas canvas = new Canvas(bitmapArr[0]);
        int i = this.f8725l;
        int i2 = (ie5.m16504a(i) ? -16777216 : -1979711488) | (i & 16777215);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        canvas.drawColor(i2, mode);
        bitmapArr[1] = bitmapM10800E.copy(config, true);
        new Canvas(bitmapArr[1]).drawColor(this.f8731q, mode);
        bitmapArr[2] = bitmapM10800E.copy(config, true);
        Canvas canvas2 = new Canvas(bitmapArr[2]);
        int i3 = this.f8725l;
        canvas2.drawColor((ie5.m16504a(i3) ? 1275068416 : 1107296256) | (16777215 & i3), mode);
        bitmapArr[3] = bitmapM10800E.copy(config, true);
        new Canvas(bitmapArr[3]).drawColor(this.f8732r, mode);
        return bitmapArr;
    }

    /* JADX INFO: renamed from: n */
    private ObjectAnimator m10814n(float f) {
        ObjectAnimator objectAnimator = this.f8701O0;
        if (objectAnimator == null) {
            this.f8701O0 = ObjectAnimator.ofFloat(this, "currentBottomLines", f);
        } else {
            objectAnimator.cancel();
            this.f8701O0.setFloatValues(f);
        }
        return this.f8701O0;
    }

    /* JADX INFO: renamed from: o */
    private Typeface m10815o(@NonNull String str) {
        return Typeface.createFromAsset(getContext().getResources().getAssets(), str);
    }

    /* JADX INFO: renamed from: p */
    private int m10816p(int i) {
        return vtd.m23720a(getContext(), i);
    }

    /* JADX INFO: renamed from: q */
    private boolean m10817q() {
        return this.f8733s > 0 || this.f8734t > 0;
    }

    /* JADX INFO: renamed from: r */
    private void m10818r(Context context, AttributeSet attributeSet) {
        int i;
        this.f8711V = m10816p(32);
        this.f8712W = m10816p(48);
        this.f8724k0 = m10816p(32);
        this.f8721i = getResources().getDimensionPixelSize(c2c0.f10420d);
        this.f8738x = getResources().getDimensionPixelSize(c2c0.f10417a);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q9c0.f19081a);
        this.f8685G0 = typedArrayObtainStyledAttributes.getColorStateList(q9c0.f19077E);
        this.f8687H0 = typedArrayObtainStyledAttributes.getColorStateList(q9c0.f19078F);
        this.f8725l = typedArrayObtainStyledAttributes.getColor(q9c0.f19084d, -16777216);
        TypedValue typedValue = new TypedValue();
        try {
            try {
                context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                i = typedValue.data;
            } catch (Exception unused) {
                i = this.f8725l;
            }
        } catch (Exception unused2) {
            int identifier = getResources().getIdentifier("colorPrimary", "attr", getContext().getPackageName());
            if (identifier == 0) {
                throw new RuntimeException("colorPrimary not found");
            }
            context.getTheme().resolveAttribute(identifier, typedValue, true);
            i = typedValue.data;
        }
        this.f8731q = typedArrayObtainStyledAttributes.getColor(q9c0.f19075C, i);
        setFloatingLabelInternal(typedArrayObtainStyledAttributes.getInt(q9c0.f19090j, 0));
        this.f8732r = typedArrayObtainStyledAttributes.getColor(q9c0.f19089i, Color.parseColor("#e7492E"));
        this.f8733s = typedArrayObtainStyledAttributes.getInt(q9c0.f19074B, 0);
        this.f8734t = typedArrayObtainStyledAttributes.getInt(q9c0.f19106z, 0);
        this.f8735u = typedArrayObtainStyledAttributes.getBoolean(q9c0.f19076D, false);
        this.f8678C = typedArrayObtainStyledAttributes.getString(q9c0.f19097q);
        this.f8679D = typedArrayObtainStyledAttributes.getColor(q9c0.f19099s, -1);
        this.f8740z = typedArrayObtainStyledAttributes.getInt(q9c0.f19073A, 0);
        String string = typedArrayObtainStyledAttributes.getString(q9c0.f19082b);
        if (string != null && !isInEditMode()) {
            Typeface typefaceM10815o = m10815o(string);
            this.f8688I = typefaceM10815o;
            this.f8693K0.setTypeface(typefaceM10815o);
        }
        String string2 = typedArrayObtainStyledAttributes.getString(q9c0.f19079G);
        if (string2 != null && !isInEditMode()) {
            Typeface typefaceM10815o2 = m10815o(string2);
            this.f8690J = typefaceM10815o2;
            setTypeface(typefaceM10815o2);
        }
        String string3 = typedArrayObtainStyledAttributes.getString(q9c0.f19094n);
        this.f8692K = string3;
        if (string3 == null) {
            this.f8692K = getHint();
        }
        this.f8720h = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f19093m, this.f8721i);
        this.f8717e = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f19096p, getResources().getDimensionPixelSize(c2c0.f10419c));
        this.f8718f = typedArrayObtainStyledAttributes.getColor(q9c0.f19095o, -1);
        this.f8702P = typedArrayObtainStyledAttributes.getBoolean(q9c0.f19092l, true);
        this.f8719g = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f19086f, getResources().getDimensionPixelSize(c2c0.f10418b));
        this.f8694L = typedArrayObtainStyledAttributes.getBoolean(q9c0.f19100t, false);
        this.f8696M = typedArrayObtainStyledAttributes.getColor(q9c0.f19080H, -1);
        this.f8698N = typedArrayObtainStyledAttributes.getBoolean(q9c0.f19083c, false);
        this.f8704Q = m10812l(typedArrayObtainStyledAttributes.getResourceId(q9c0.f19102v, -1));
        this.f8706R = m10812l(typedArrayObtainStyledAttributes.getResourceId(q9c0.f19104x, -1));
        this.f8710U = typedArrayObtainStyledAttributes.getBoolean(q9c0.f19087g, false);
        this.f8708S = m10812l(k3c0.f15398a);
        this.f8709T = m10812l(k3c0.f15399b);
        this.f8730p0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f19103w, m10816p(16));
        this.f8736v = typedArrayObtainStyledAttributes.getBoolean(q9c0.f19091k, false);
        this.f8737w = typedArrayObtainStyledAttributes.getBoolean(q9c0.f19098r, false);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom});
        int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
        this.f8728o = typedArrayObtainStyledAttributes2.getDimensionPixelSize(1, dimensionPixelSize);
        this.f8726m = typedArrayObtainStyledAttributes2.getDimensionPixelSize(2, dimensionPixelSize);
        this.f8729p = typedArrayObtainStyledAttributes2.getDimensionPixelSize(3, dimensionPixelSize);
        this.f8727n = typedArrayObtainStyledAttributes2.getDimensionPixelSize(4, dimensionPixelSize);
        typedArrayObtainStyledAttributes2.recycle();
        setBackground(null);
        if (this.f8735u) {
            TransformationMethod transformationMethod = getTransformationMethod();
            setSingleLine();
            setTransformationMethod(transformationMethod);
        }
        m10820t();
        m10821u();
        m10822v();
        m10819s();
        m10823w();
        m10810j();
    }

    /* JADX INFO: renamed from: s */
    private void m10819s() {
        addTextChangedListener(new C0598b());
        ViewOnFocusChangeListenerC0599c viewOnFocusChangeListenerC0599c = new ViewOnFocusChangeListenerC0599c();
        this.f8703P0 = viewOnFocusChangeListenerC0599c;
        super.setOnFocusChangeListener(viewOnFocusChangeListenerC0599c);
    }

    private void setFloatingLabelInternal(int i) {
        if (i == 1) {
            this.f8722j = true;
            this.f8723k = false;
        } else if (i != 2) {
            this.f8722j = false;
            this.f8723k = false;
        } else {
            this.f8722j = true;
            this.f8723k = true;
        }
    }

    /* JADX INFO: renamed from: t */
    private void m10820t() {
        int i = 1;
        boolean z = this.f8733s > 0 || this.f8734t > 0 || this.f8735u || this.f8680E != null || this.f8678C != null;
        int i2 = this.f8740z;
        if (i2 > 0) {
            i = i2;
        } else if (!z) {
            i = 0;
        }
        this.f8739y = i;
        this.f8676A = i;
    }

    /* JADX INFO: renamed from: u */
    private void m10821u() {
        this.f8713a = this.f8722j ? this.f8717e + this.f8720h : this.f8720h;
        this.f8693K0.setTextSize(this.f8719g);
        Paint.FontMetrics fontMetrics = this.f8693K0.getFontMetrics();
        int i = (int) ((fontMetrics.descent - fontMetrics.ascent) * this.f8676A);
        boolean z = this.f8694L;
        int i2 = this.f8721i;
        if (!z) {
            i2 *= 2;
        }
        this.f8714b = i + i2;
        int i3 = 0;
        this.f8715c = this.f8704Q == null ? 0 : this.f8712W + this.f8730p0;
        if (this.f8706R != null) {
            i3 = this.f8730p0 + this.f8712W;
        }
        this.f8716d = i3;
        m10811k();
    }

    /* JADX INFO: renamed from: v */
    private void m10822v() {
        if (TextUtils.isEmpty(getText())) {
            m10798C();
        } else {
            Editable text = getText();
            setText((CharSequence) null);
            m10798C();
            setText(text);
            setSelection(text.length());
            this.f8682F = 1.0f;
            this.f8684G = true;
        }
        m10799D();
    }

    /* JADX INFO: renamed from: w */
    private void m10823w() {
        addTextChangedListener(new C0597a());
    }

    /* JADX INFO: renamed from: x */
    private boolean m10824x(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int scrollX = getScrollX() + (this.f8704Q == null ? 0 : this.f8712W + this.f8730p0);
        int scrollX2 = getScrollX() + (this.f8706R == null ? getWidth() : (getWidth() - this.f8712W) - this.f8730p0);
        if (!m10797A()) {
            scrollX = scrollX2 - this.f8712W;
        }
        int scrollY = ((getScrollY() + getHeight()) - getPaddingBottom()) + this.f8721i;
        int i = this.f8724k0;
        int i2 = scrollY - i;
        return x >= ((float) scrollX) && x < ((float) (scrollX + this.f8712W)) && y >= ((float) i2) && y < ((float) (i2 + i));
    }

    /* JADX INFO: renamed from: z */
    private boolean m10825z() {
        return this.f8680E == null && m10828y();
    }

    /* JADX INFO: renamed from: B */
    public boolean m10826B() {
        return this.f8710U;
    }

    /* JADX INFO: renamed from: F */
    public boolean m10827F() {
        List<zgw> list = this.f8707R0;
        if (list == null || list.isEmpty()) {
            return true;
        }
        Editable text = getText();
        boolean z = text.length() == 0;
        boolean z2 = true;
        for (zgw zgwVar : this.f8707R0) {
            z2 = z2 && zgwVar.m25767b(text, z);
            if (!z2) {
                setError(zgwVar.m25766a());
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
        return this.f8688I;
    }

    public int getBottomTextSize() {
        return this.f8719g;
    }

    public float getCurrentBottomLines() {
        return this.f8676A;
    }

    @Override // android.widget.TextView
    public CharSequence getError() {
        return this.f8680E;
    }

    public int getErrorColor() {
        return this.f8732r;
    }

    public float getFloatingLabelFraction() {
        return this.f8682F;
    }

    public int getFloatingLabelPadding() {
        return this.f8720h;
    }

    public CharSequence getFloatingLabelText() {
        return this.f8692K;
    }

    public int getFloatingLabelTextColor() {
        return this.f8718f;
    }

    public int getFloatingLabelTextSize() {
        return this.f8717e;
    }

    public float getFocusFraction() {
        return this.f8686H;
    }

    public String getHelperText() {
        return this.f8678C;
    }

    public int getHelperTextColor() {
        return this.f8679D;
    }

    public int getInnerPaddingBottom() {
        return this.f8727n;
    }

    public int getInnerPaddingLeft() {
        return this.f8728o;
    }

    public int getInnerPaddingRight() {
        return this.f8729p;
    }

    public int getInnerPaddingTop() {
        return this.f8726m;
    }

    public int getMaxCharacters() {
        return this.f8734t;
    }

    public int getMinBottomTextLines() {
        return this.f8740z;
    }

    public int getMinCharacters() {
        return this.f8733s;
    }

    public int getUnderlineColor() {
        return this.f8696M;
    }

    @Nullable
    public List<zgw> getValidators() {
        return this.f8707R0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int innerPaddingLeft;
        int i;
        char c;
        char c2;
        Canvas canvas2 = canvas;
        int scrollX = getScrollX() + (this.f8704Q == null ? 0 : this.f8712W + this.f8730p0);
        int scrollX2 = getScrollX() + (this.f8706R == null ? getWidth() : (getWidth() - this.f8712W) - this.f8730p0);
        int scrollY = (getScrollY() + getHeight()) - getPaddingBottom();
        this.f8691J0.setAlpha(255);
        Bitmap[] bitmapArr = this.f8704Q;
        if (bitmapArr != null) {
            if (!m10825z()) {
                c2 = 3;
            } else if (isEnabled()) {
                c2 = hasFocus() ? (char) 1 : (char) 0;
            } else {
                c2 = 2;
            }
            Bitmap bitmap = bitmapArr[c2];
            int i2 = scrollX - this.f8730p0;
            int i3 = this.f8712W;
            int width = (i2 - i3) + ((i3 - bitmap.getWidth()) / 2);
            int i4 = this.f8721i + scrollY;
            int i5 = this.f8724k0;
            canvas2.drawBitmap(bitmap, width, (i4 - i5) + ((i5 - bitmap.getHeight()) / 2), this.f8691J0);
        }
        Bitmap[] bitmapArr2 = this.f8706R;
        if (bitmapArr2 != null) {
            if (!m10825z()) {
                c = 3;
            } else if (isEnabled()) {
                c = hasFocus() ? (char) 1 : (char) 0;
            } else {
                c = 2;
            }
            Bitmap bitmap2 = bitmapArr2[c];
            int width2 = this.f8730p0 + scrollX2 + ((this.f8712W - bitmap2.getWidth()) / 2);
            int i6 = this.f8721i + scrollY;
            int i7 = this.f8724k0;
            canvas2.drawBitmap(bitmap2, width2, (i6 - i7) + ((i7 - bitmap2.getHeight()) / 2), this.f8691J0);
        }
        if (hasFocus() && this.f8710U) {
            this.f8691J0.setAlpha(255);
            int i8 = m10797A() ? scrollX : scrollX2 - this.f8712W;
            Bitmap bitmap3 = TextUtils.isEmpty(getText()) ? this.f8709T[0] : this.f8708S[0];
            int width3 = i8 + ((this.f8712W - bitmap3.getWidth()) / 2);
            int i9 = this.f8721i + scrollY;
            int i10 = this.f8724k0;
            canvas2.drawBitmap(bitmap3, width3, (i9 - i10) + ((i10 - bitmap3.getHeight()) / 2), this.f8691J0);
        }
        if (!this.f8694L) {
            int i11 = scrollY + this.f8721i;
            if (m10825z()) {
                if (isEnabled()) {
                    boolean zHasFocus = hasFocus();
                    Paint paint = this.f8691J0;
                    if (zHasFocus) {
                        paint.setColor(this.f8731q);
                        canvas2 = canvas;
                        canvas2.drawRect(scrollX, i11, scrollX2, m10816p(2) + i11, this.f8691J0);
                    } else {
                        int i12 = this.f8696M;
                        if (i12 == -1) {
                            i12 = (this.f8725l & 16777215) | 503316480;
                        }
                        paint.setColor(i12);
                        canvas2 = canvas;
                        canvas2.drawRect(scrollX, i11, scrollX2, m10816p(1) + i11, this.f8691J0);
                    }
                } else {
                    Paint paint2 = this.f8691J0;
                    int i13 = this.f8696M;
                    if (i13 == -1) {
                        i13 = (this.f8725l & 16777215) | 1140850688;
                    }
                    paint2.setColor(i13);
                    float fM10816p = m10816p(1);
                    float f = 0.0f;
                    while (f < getWidth()) {
                        float f2 = scrollX + f;
                        float f3 = fM10816p;
                        canvas.drawRect(f2, i11, f2 + fM10816p, m10816p(1) + i11, this.f8691J0);
                        f += 3.0f * f3;
                        fM10816p = f3;
                    }
                }
                scrollY = i11;
            } else {
                this.f8691J0.setColor(this.f8732r);
                canvas2.drawRect(scrollX, i11, scrollX2, m10816p(2) + i11, this.f8691J0);
            }
            canvas2 = canvas;
            scrollY = i11;
        }
        this.f8693K0.setTextSize(this.f8719g);
        Paint.FontMetrics fontMetrics = this.f8693K0.getFontMetrics();
        float f4 = fontMetrics.ascent;
        float f5 = fontMetrics.descent;
        float f6 = (-f4) - f5;
        float f7 = this.f8719g + f4 + f5;
        if ((hasFocus() && m10817q()) || !m10828y()) {
            this.f8693K0.setColor(m10828y() ? (this.f8725l & 16777215) | 1140850688 : this.f8732r);
            String charactersCounterText = getCharactersCounterText();
            canvas2.drawText(charactersCounterText, m10797A() ? scrollX : scrollX2 - this.f8693K0.measureText(charactersCounterText), this.f8721i + scrollY + f6, this.f8693K0);
        }
        if (this.f8695L0 != null && (this.f8680E != null || ((this.f8737w || hasFocus()) && !TextUtils.isEmpty(this.f8678C)))) {
            TextPaint textPaint = this.f8693K0;
            if (this.f8680E != null) {
                i = this.f8732r;
            } else {
                i = this.f8679D;
                if (i == -1) {
                    i = (this.f8725l & 16777215) | 1140850688;
                }
            }
            textPaint.setColor(i);
            canvas2.save();
            canvas2.translate(getBottomTextLeftOffset() + scrollX, (this.f8721i + scrollY) - f7);
            this.f8695L0.draw(canvas2);
            canvas2.restore();
        }
        if (this.f8722j && !TextUtils.isEmpty(this.f8692K)) {
            this.f8693K0.setTextSize(this.f8717e);
            TextPaint textPaint2 = this.f8693K0;
            ArgbEvaluator argbEvaluator = this.f8689I0;
            float f8 = this.f8686H;
            int i14 = this.f8718f;
            if (i14 == -1) {
                i14 = (16777215 & this.f8725l) | 1140850688;
            }
            textPaint2.setColor(((Integer) argbEvaluator.evaluate(f8, Integer.valueOf(i14), Integer.valueOf(this.f8731q))).intValue());
            float fMeasureText = this.f8693K0.measureText(this.f8692K.toString());
            if ((getGravity() & 5) == 5 || m10797A()) {
                innerPaddingLeft = (int) (scrollX2 - fMeasureText);
            } else {
                innerPaddingLeft = (getGravity() & 3) == 3 ? scrollX : ((int) (getInnerPaddingLeft() + ((((getWidth() - getInnerPaddingLeft()) - getInnerPaddingRight()) - fMeasureText) / 2.0f))) + scrollX;
            }
            int i15 = this.f8726m + this.f8717e;
            int i16 = this.f8720h;
            float f9 = i15 + i16;
            float f10 = i16;
            boolean z = this.f8736v;
            int i17 = (int) (f9 - (f10 * (z ? 1.0f : this.f8682F)));
            this.f8693K0.setAlpha((int) ((z ? 1.0f : this.f8682F) * 255.0f * (this.f8718f == -1 ? (this.f8686H * 0.74f) + 0.26f : 1.0f)));
            canvas2.drawText(this.f8692K.toString(), innerPaddingLeft, i17, this.f8693K0);
        }
        if (hasFocus() && this.f8735u && getScrollX() != 0) {
            this.f8691J0.setColor(this.f8731q);
            float f11 = scrollY + this.f8721i;
            if (m10797A()) {
                scrollX = scrollX2;
            }
            int i18 = m10797A() ? -1 : 1;
            int i19 = this.f8738x;
            canvas2.drawCircle(((i18 * i19) / 2) + scrollX, (i19 / 2) + f11, i19 / 2, this.f8691J0);
            int i20 = this.f8738x;
            canvas2.drawCircle((((i18 * i20) * 5) / 2) + scrollX, (i20 / 2) + f11, i20 / 2, this.f8691J0);
            int i21 = this.f8738x;
            canvas2.drawCircle(scrollX + (((i18 * i21) * 9) / 2), f11 + (i21 / 2), i21 / 2, this.f8691J0);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m10809i();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f8735u && getScrollX() > 0 && motionEvent.getAction() == 0 && motionEvent.getX() < m10816p(20) && motionEvent.getY() > (getHeight() - this.f8714b) - this.f8727n && motionEvent.getY() < getHeight() - this.f8727n) {
            setSelection(0);
            return false;
        }
        if (hasFocus() && this.f8710U) {
            int action = motionEvent.getAction();
            if (action == 0) {
                if (m10824x(motionEvent)) {
                    this.f8681E0 = true;
                    this.f8683F0 = true;
                }
                return true;
            }
            if (action == 1) {
                if (this.f8683F0) {
                    if (!TextUtils.isEmpty(getText())) {
                        setText((CharSequence) null);
                    }
                    this.f8683F0 = false;
                }
                if (this.f8681E0) {
                    this.f8681E0 = false;
                    return true;
                }
                this.f8681E0 = false;
            } else if (action == 2) {
                if (this.f8683F0 && !m10824x(motionEvent)) {
                    this.f8683F0 = false;
                }
                if (this.f8681E0) {
                    return true;
                }
            } else if (action == 3) {
                this.f8681E0 = false;
                this.f8683F0 = false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentTypeface(Typeface typeface) {
        this.f8688I = typeface;
        this.f8693K0.setTypeface(typeface);
        postInvalidate();
    }

    public void setAutoValidate(boolean z) {
        this.f8698N = z;
        if (z) {
            m10827F();
        }
    }

    public void setBaseColor(int i) {
        if (this.f8725l != i) {
            this.f8725l = i;
        }
        m10822v();
        postInvalidate();
    }

    public void setBottomTextSize(int i) {
        this.f8719g = i;
        m10821u();
    }

    public void setCurrentBottomLines(float f) {
        this.f8676A = f;
        m10821u();
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        this.f8680E = charSequence == null ? null : charSequence.toString();
        if (m10809i()) {
            postInvalidate();
        }
    }

    public void setErrorColor(int i) {
        this.f8732r = i;
        postInvalidate();
    }

    public void setFloatingLabel(int i) {
        setFloatingLabelInternal(i);
        m10821u();
    }

    public void setFloatingLabelAlwaysShown(boolean z) {
        this.f8736v = z;
        invalidate();
    }

    public void setFloatingLabelAnimating(boolean z) {
        this.f8702P = z;
    }

    public void setFloatingLabelFraction(float f) {
        this.f8682F = f;
        invalidate();
    }

    public void setFloatingLabelPadding(int i) {
        this.f8720h = i;
        postInvalidate();
    }

    public void setFloatingLabelText(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getHint();
        }
        this.f8692K = charSequence;
        postInvalidate();
    }

    public void setFloatingLabelTextColor(int i) {
        this.f8718f = i;
        postInvalidate();
    }

    public void setFloatingLabelTextSize(int i) {
        this.f8717e = i;
        m10821u();
    }

    public void setFocusFraction(float f) {
        this.f8686H = f;
        invalidate();
    }

    public void setHelperText(CharSequence charSequence) {
        this.f8678C = charSequence == null ? null : charSequence.toString();
        if (m10809i()) {
            postInvalidate();
        }
    }

    public void setHelperTextAlwaysShown(boolean z) {
        this.f8737w = z;
        invalidate();
    }

    public void setHelperTextColor(int i) {
        this.f8679D = i;
        postInvalidate();
    }

    public void setHideUnderline(boolean z) {
        this.f8694L = z;
        m10821u();
        postInvalidate();
    }

    public void setIconLeft(@DrawableRes int i) {
        this.f8704Q = m10812l(i);
        m10821u();
    }

    public void setIconRight(@DrawableRes int i) {
        this.f8706R = m10812l(i);
        m10821u();
    }

    public void setMaxCharacters(int i) {
        this.f8734t = i;
        m10820t();
        m10821u();
        postInvalidate();
    }

    public void setMetHintTextColor(int i) {
        this.f8687H0 = ColorStateList.valueOf(i);
        m10798C();
    }

    public void setMetTextColor(int i) {
        this.f8685G0 = ColorStateList.valueOf(i);
        m10799D();
    }

    public void setMinBottomTextLines(int i) {
        this.f8740z = i;
        m10820t();
        m10821u();
        postInvalidate();
    }

    public void setMinCharacters(int i) {
        this.f8733s = i;
        m10820t();
        m10821u();
        postInvalidate();
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        if (this.f8703P0 == null) {
            super.setOnFocusChangeListener(onFocusChangeListener);
        } else {
            this.f8705Q0 = onFocusChangeListener;
        }
    }

    @Override // android.widget.TextView, android.view.View
    @Deprecated
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    public void setPrimaryColor(int i) {
        this.f8731q = i;
        postInvalidate();
    }

    public void setShowClearButton(boolean z) {
        this.f8710U = z;
        m10811k();
    }

    public void setSingleLineEllipsis(boolean z) {
        this.f8735u = z;
        m10820t();
        m10821u();
        postInvalidate();
    }

    public void setUnderlineColor(int i) {
        this.f8696M = i;
        postInvalidate();
    }

    /* JADX INFO: renamed from: y */
    public boolean m10828y() {
        return this.f8700O;
    }

    public void setIconLeft(Bitmap bitmap) {
        this.f8704Q = m10813m(bitmap);
        m10821u();
    }

    public void setIconRight(Bitmap bitmap) {
        this.f8706R = m10813m(bitmap);
        m10821u();
    }

    public void setMetHintTextColor(ColorStateList colorStateList) {
        this.f8687H0 = colorStateList;
        m10798C();
    }

    public void setMetTextColor(ColorStateList colorStateList) {
        this.f8685G0 = colorStateList;
        m10799D();
    }

    public MaterialMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8679D = -1;
        this.f8689I0 = new ArgbEvaluator();
        this.f8691J0 = new Paint(1);
        this.f8693K0 = new TextPaint(1);
        m10818r(context, attributeSet);
    }

    @TargetApi(21)
    public MaterialMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8679D = -1;
        this.f8689I0 = new ArgbEvaluator();
        this.f8691J0 = new Paint(1);
        this.f8693K0 = new TextPaint(1);
        m10818r(context, attributeSet);
    }
}
