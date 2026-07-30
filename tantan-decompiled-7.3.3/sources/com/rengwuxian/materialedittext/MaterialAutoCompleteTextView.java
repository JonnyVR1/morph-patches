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
import android.widget.AutoCompleteTextView;
import androidx.annotation.DrawableRes;
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
public class MaterialAutoCompleteTextView extends AutoCompleteTextView {

    /* JADX INFO: renamed from: A */
    private float f55776A;

    /* JADX INFO: renamed from: B */
    private float f55777B;

    /* JADX INFO: renamed from: C */
    private String f55778C;

    /* JADX INFO: renamed from: D */
    private int f55779D;

    /* JADX INFO: renamed from: E */
    private String f55780E;

    /* JADX INFO: renamed from: E0 */
    private boolean f55781E0;

    /* JADX INFO: renamed from: F */
    private float f55782F;

    /* JADX INFO: renamed from: F0 */
    private boolean f55783F0;

    /* JADX INFO: renamed from: G */
    private boolean f55784G;

    /* JADX INFO: renamed from: G0 */
    private ColorStateList f55785G0;

    /* JADX INFO: renamed from: H */
    private float f55786H;

    /* JADX INFO: renamed from: H0 */
    private ColorStateList f55787H0;

    /* JADX INFO: renamed from: I */
    private Typeface f55788I;

    /* JADX INFO: renamed from: I0 */
    private ArgbEvaluator f55789I0;

    /* JADX INFO: renamed from: J */
    private Typeface f55790J;

    /* JADX INFO: renamed from: J0 */
    Paint f55791J0;

    /* JADX INFO: renamed from: K */
    private CharSequence f55792K;

    /* JADX INFO: renamed from: K0 */
    TextPaint f55793K0;

    /* JADX INFO: renamed from: L */
    private boolean f55794L;

    /* JADX INFO: renamed from: L0 */
    StaticLayout f55795L0;

    /* JADX INFO: renamed from: M */
    private int f55796M;

    /* JADX INFO: renamed from: M0 */
    ObjectAnimator f55797M0;

    /* JADX INFO: renamed from: N */
    private boolean f55798N;

    /* JADX INFO: renamed from: N0 */
    ObjectAnimator f55799N0;

    /* JADX INFO: renamed from: O */
    private boolean f55800O;

    /* JADX INFO: renamed from: O0 */
    ObjectAnimator f55801O0;

    /* JADX INFO: renamed from: P */
    private boolean f55802P;

    /* JADX INFO: renamed from: P0 */
    View.OnFocusChangeListener f55803P0;

    /* JADX INFO: renamed from: Q */
    private Bitmap[] f55804Q;

    /* JADX INFO: renamed from: Q0 */
    View.OnFocusChangeListener f55805Q0;

    /* JADX INFO: renamed from: R */
    private Bitmap[] f55806R;

    /* JADX INFO: renamed from: R0 */
    private List<yiw> f55807R0;

    /* JADX INFO: renamed from: S */
    private Bitmap[] f55808S;

    /* JADX INFO: renamed from: T */
    private Bitmap[] f55809T;

    /* JADX INFO: renamed from: U */
    private boolean f55810U;

    /* JADX INFO: renamed from: V */
    private int f55811V;

    /* JADX INFO: renamed from: W */
    private int f55812W;

    /* JADX INFO: renamed from: a */
    private int f55813a;

    /* JADX INFO: renamed from: b */
    private int f55814b;

    /* JADX INFO: renamed from: c */
    private int f55815c;

    /* JADX INFO: renamed from: d */
    private int f55816d;

    /* JADX INFO: renamed from: e */
    private int f55817e;

    /* JADX INFO: renamed from: f */
    private int f55818f;

    /* JADX INFO: renamed from: g */
    private int f55819g;

    /* JADX INFO: renamed from: h */
    private int f55820h;

    /* JADX INFO: renamed from: i */
    private int f55821i;

    /* JADX INFO: renamed from: j */
    private boolean f55822j;

    /* JADX INFO: renamed from: k */
    private boolean f55823k;

    /* JADX INFO: renamed from: k0 */
    private int f55824k0;

    /* JADX INFO: renamed from: l */
    private int f55825l;

    /* JADX INFO: renamed from: m */
    private int f55826m;

    /* JADX INFO: renamed from: n */
    private int f55827n;

    /* JADX INFO: renamed from: o */
    private int f55828o;

    /* JADX INFO: renamed from: p */
    private int f55829p;

    /* JADX INFO: renamed from: p0 */
    private int f55830p0;

    /* JADX INFO: renamed from: q */
    private int f55831q;

    /* JADX INFO: renamed from: r */
    private int f55832r;

    /* JADX INFO: renamed from: s */
    private int f55833s;

    /* JADX INFO: renamed from: t */
    private int f55834t;

    /* JADX INFO: renamed from: u */
    private boolean f55835u;

    /* JADX INFO: renamed from: v */
    private boolean f55836v;

    /* JADX INFO: renamed from: w */
    private boolean f55837w;

    /* JADX INFO: renamed from: x */
    private int f55838x;

    /* JADX INFO: renamed from: y */
    private int f55839y;

    /* JADX INFO: renamed from: z */
    private int f55840z;

    /* JADX INFO: renamed from: com.rengwuxian.materialedittext.MaterialAutoCompleteTextView$a */
    public class C13352a implements TextWatcher {
        public C13352a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MaterialAutoCompleteTextView.this.m81578j();
            boolean z = MaterialAutoCompleteTextView.this.f55798N;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            if (z) {
                materialAutoCompleteTextView.m81595F();
            } else {
                materialAutoCompleteTextView.setError(null);
            }
            MaterialAutoCompleteTextView.this.postInvalidate();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.rengwuxian.materialedittext.MaterialAutoCompleteTextView$b */
    public class C13353b implements TextWatcher {
        public C13353b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (MaterialAutoCompleteTextView.this.f55822j) {
                int length = editable.length();
                MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
                if (length == 0) {
                    if (materialAutoCompleteTextView.f55784G) {
                        MaterialAutoCompleteTextView.this.f55784G = false;
                        MaterialAutoCompleteTextView.this.getLabelAnimator().reverse();
                        return;
                    }
                    return;
                }
                if (materialAutoCompleteTextView.f55784G) {
                    return;
                }
                MaterialAutoCompleteTextView.this.f55784G = true;
                boolean zIsStarted = MaterialAutoCompleteTextView.this.getLabelAnimator().isStarted();
                MaterialAutoCompleteTextView materialAutoCompleteTextView2 = MaterialAutoCompleteTextView.this;
                if (zIsStarted) {
                    materialAutoCompleteTextView2.getLabelAnimator().reverse();
                } else {
                    materialAutoCompleteTextView2.getLabelAnimator().start();
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

    /* JADX INFO: renamed from: com.rengwuxian.materialedittext.MaterialAutoCompleteTextView$c */
    public class ViewOnFocusChangeListenerC13354c implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC13354c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (MaterialAutoCompleteTextView.this.f55822j && MaterialAutoCompleteTextView.this.f55823k) {
                MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
                if (z) {
                    boolean zIsStarted = materialAutoCompleteTextView.getLabelFocusAnimator().isStarted();
                    MaterialAutoCompleteTextView materialAutoCompleteTextView2 = MaterialAutoCompleteTextView.this;
                    if (zIsStarted) {
                        materialAutoCompleteTextView2.getLabelFocusAnimator().reverse();
                    } else {
                        materialAutoCompleteTextView2.getLabelFocusAnimator().start();
                    }
                } else {
                    materialAutoCompleteTextView.getLabelFocusAnimator().reverse();
                }
            }
            View.OnFocusChangeListener onFocusChangeListener = MaterialAutoCompleteTextView.this.f55805Q0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z);
            }
        }
    }

    public MaterialAutoCompleteTextView(Context context) {
        super(context);
        this.f55779D = -1;
        this.f55789I0 = new ArgbEvaluator();
        this.f55791J0 = new Paint(1);
        this.f55793K0 = new TextPaint(1);
        m81586r(context, null);
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: A */
    private boolean m81565A() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: C */
    private void m81566C() {
        ColorStateList colorStateList = this.f55787H0;
        if (colorStateList == null) {
            setHintTextColor((this.f55825l & 16777215) | 1140850688);
        } else {
            setHintTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: D */
    private void m81567D() {
        ColorStateList colorStateList = this.f55785G0;
        if (colorStateList != null) {
            setTextColor(colorStateList);
            return;
        }
        int[][] iArr = {new int[]{R.attr.state_enabled}, AutoCompleteTextView.EMPTY_STATE_SET};
        int i = this.f55825l;
        ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{(i & 16777215) | (-553648128), (i & 16777215) | 1140850688});
        this.f55785G0 = colorStateList2;
        setTextColor(colorStateList2);
    }

    /* JADX INFO: renamed from: E */
    private Bitmap m81568E(Bitmap bitmap) {
        int i;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMax = Math.max(width, height);
        int i2 = this.f55811V;
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
        if (this.f55835u) {
            return (this.f55838x * 5) + m81584p(4);
        }
        return 0;
    }

    private int getBottomTextLeftOffset() {
        return m81565A() ? getCharactersCounterWidth() : getBottomEllipsisWidth();
    }

    private int getBottomTextRightOffset() {
        return m81565A() ? getBottomEllipsisWidth() : getCharactersCounterWidth();
    }

    private int getButtonsCount() {
        return m81594B() ? 1 : 0;
    }

    private String getCharactersCounterText() {
        if (this.f55833s <= 0) {
            if (m81565A()) {
                return this.f55834t + " / " + getText().length();
            }
            return getText().length() + " / " + this.f55834t;
        }
        if (this.f55834t <= 0) {
            if (m81565A()) {
                return Marker.ANY_NON_NULL_MARKER + this.f55833s + " / " + getText().length();
            }
            return getText().length() + " / " + this.f55833s + Marker.ANY_NON_NULL_MARKER;
        }
        if (m81565A()) {
            return this.f55834t + "-" + this.f55833s + " / " + getText().length();
        }
        return getText().length() + " / " + this.f55833s + "-" + this.f55834t;
    }

    private int getCharactersCounterWidth() {
        if (m81585q()) {
            return (int) this.f55793K0.measureText(getCharactersCounterText());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator getLabelAnimator() {
        if (this.f55797M0 == null) {
            this.f55797M0 = ObjectAnimator.ofFloat(this, "floatingLabelFraction", 0.0f, 1.0f);
        }
        this.f55797M0.setDuration(this.f55802P ? 300L : 0L);
        return this.f55797M0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator getLabelFocusAnimator() {
        if (this.f55799N0 == null) {
            this.f55799N0 = ObjectAnimator.ofFloat(this, "focusFraction", 0.0f, 1.0f);
        }
        return this.f55799N0;
    }

    /* JADX INFO: renamed from: i */
    private boolean m81577i() {
        Layout.Alignment alignment;
        int iMax;
        if (getWidth() == 0) {
            return false;
        }
        this.f55793K0.setTextSize(this.f55819g);
        if (this.f55780E == null && this.f55778C == null) {
            iMax = this.f55839y;
        } else {
            if ((getGravity() & 5) == 5 || m81565A()) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = (getGravity() & 3) == 3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            String str = this.f55780E;
            if (str == null) {
                str = this.f55778C;
            }
            StaticLayout staticLayout = new StaticLayout(str, this.f55793K0, (((getWidth() - getBottomTextLeftOffset()) - getBottomTextRightOffset()) - getPaddingLeft()) - getPaddingRight(), alignment2, 1.0f, 0.0f, true);
            this.f55795L0 = staticLayout;
            iMax = Math.max(staticLayout.getLineCount(), this.f55840z);
        }
        float f = iMax;
        if (this.f55777B != f) {
            m81582n(f).start();
        }
        this.f55777B = f;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m81578j() {
        int i;
        boolean z = true;
        if (!m81585q()) {
            this.f55800O = true;
            return;
        }
        Editable text = getText();
        int length = text == null ? 0 : text.length();
        if (length < this.f55833s || ((i = this.f55834t) > 0 && length > i)) {
            z = false;
        }
        this.f55800O = z;
    }

    /* JADX INFO: renamed from: k */
    private void m81579k() {
        int buttonsCount = this.f55812W * getButtonsCount();
        int i = 0;
        if (!m81565A()) {
            i = buttonsCount;
            buttonsCount = 0;
        }
        super.setPadding(this.f55828o + this.f55815c + buttonsCount, this.f55826m + this.f55813a, this.f55829p + this.f55816d + i, this.f55827n + this.f55814b);
    }

    /* JADX INFO: renamed from: l */
    private Bitmap[] m81580l(@DrawableRes int i) {
        if (i == -1) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), i, options);
        int iMax = Math.max(options.outWidth, options.outHeight);
        int i2 = this.f55811V;
        options.inSampleSize = iMax > i2 ? iMax / i2 : 1;
        options.inJustDecodeBounds = false;
        return m81581m(BitmapFactory.decodeResource(getResources(), i, options));
    }

    /* JADX INFO: renamed from: m */
    private Bitmap[] m81581m(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap[] bitmapArr = new Bitmap[4];
        Bitmap bitmapM81568E = m81568E(bitmap);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        bitmapArr[0] = bitmapM81568E.copy(config, true);
        Canvas canvas = new Canvas(bitmapArr[0]);
        int i = this.f55825l;
        int i2 = (if5.m139722a(i) ? RoundedDrawable.DEFAULT_BORDER_COLOR : -1979711488) | (i & 16777215);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        canvas.drawColor(i2, mode);
        bitmapArr[1] = bitmapM81568E.copy(config, true);
        new Canvas(bitmapArr[1]).drawColor(this.f55831q, mode);
        bitmapArr[2] = bitmapM81568E.copy(config, true);
        Canvas canvas2 = new Canvas(bitmapArr[2]);
        int i3 = this.f55825l;
        canvas2.drawColor((if5.m139722a(i3) ? 1275068416 : 1107296256) | (16777215 & i3), mode);
        bitmapArr[3] = bitmapM81568E.copy(config, true);
        new Canvas(bitmapArr[3]).drawColor(this.f55832r, mode);
        return bitmapArr;
    }

    /* JADX INFO: renamed from: n */
    private ObjectAnimator m81582n(float f) {
        ObjectAnimator objectAnimator = this.f55801O0;
        if (objectAnimator == null) {
            this.f55801O0 = ObjectAnimator.ofFloat(this, "currentBottomLines", f);
        } else {
            objectAnimator.cancel();
            this.f55801O0.setFloatValues(f);
        }
        return this.f55801O0;
    }

    /* JADX INFO: renamed from: o */
    private Typeface m81583o(@NonNull String str) {
        return Typeface.createFromAsset(getContext().getResources().getAssets(), str);
    }

    /* JADX INFO: renamed from: p */
    private int m81584p(int i) {
        return jvd.m147011a(getContext(), i);
    }

    /* JADX INFO: renamed from: q */
    private boolean m81585q() {
        return this.f55833s > 0 || this.f55834t > 0;
    }

    /* JADX INFO: renamed from: r */
    private void m81586r(Context context, AttributeSet attributeSet) {
        int i;
        this.f55811V = m81584p(32);
        this.f55812W = m81584p(48);
        this.f55824k0 = m81584p(32);
        this.f55821i = getResources().getDimensionPixelSize(jac0.f118973d);
        this.f55838x = getResources().getDimensionPixelSize(jac0.f118970a);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, whc0.f189119a);
        this.f55785G0 = typedArrayObtainStyledAttributes.getColorStateList(whc0.f189115E);
        this.f55787H0 = typedArrayObtainStyledAttributes.getColorStateList(whc0.f189116F);
        this.f55825l = typedArrayObtainStyledAttributes.getColor(whc0.f189122d, RoundedDrawable.DEFAULT_BORDER_COLOR);
        TypedValue typedValue = new TypedValue();
        try {
            try {
                context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                i = typedValue.data;
            } catch (Exception unused) {
                i = this.f55825l;
            }
        } catch (Exception unused2) {
            int identifier = getResources().getIdentifier("colorPrimary", "attr", getContext().getPackageName());
            if (identifier == 0) {
                throw new RuntimeException("colorPrimary not found");
            }
            context.getTheme().resolveAttribute(identifier, typedValue, true);
            i = typedValue.data;
        }
        this.f55831q = typedArrayObtainStyledAttributes.getColor(whc0.f189113C, i);
        setFloatingLabelInternal(typedArrayObtainStyledAttributes.getInt(whc0.f189128j, 0));
        this.f55832r = typedArrayObtainStyledAttributes.getColor(whc0.f189127i, Color.parseColor("#e7492E"));
        this.f55833s = typedArrayObtainStyledAttributes.getInt(whc0.f189112B, 0);
        this.f55834t = typedArrayObtainStyledAttributes.getInt(whc0.f189144z, 0);
        this.f55835u = typedArrayObtainStyledAttributes.getBoolean(whc0.f189114D, false);
        this.f55778C = typedArrayObtainStyledAttributes.getString(whc0.f189135q);
        this.f55779D = typedArrayObtainStyledAttributes.getColor(whc0.f189137s, -1);
        this.f55840z = typedArrayObtainStyledAttributes.getInt(whc0.f189111A, 0);
        String string = typedArrayObtainStyledAttributes.getString(whc0.f189120b);
        if (string != null && !isInEditMode()) {
            Typeface typefaceM81583o = m81583o(string);
            this.f55788I = typefaceM81583o;
            this.f55793K0.setTypeface(typefaceM81583o);
        }
        String string2 = typedArrayObtainStyledAttributes.getString(whc0.f189117G);
        if (string2 != null && !isInEditMode()) {
            Typeface typefaceM81583o2 = m81583o(string2);
            this.f55790J = typefaceM81583o2;
            setTypeface(typefaceM81583o2);
        }
        String string3 = typedArrayObtainStyledAttributes.getString(whc0.f189132n);
        this.f55792K = string3;
        if (string3 == null) {
            this.f55792K = getHint();
        }
        this.f55820h = typedArrayObtainStyledAttributes.getDimensionPixelSize(whc0.f189131m, this.f55821i);
        this.f55817e = typedArrayObtainStyledAttributes.getDimensionPixelSize(whc0.f189134p, getResources().getDimensionPixelSize(jac0.f118972c));
        this.f55818f = typedArrayObtainStyledAttributes.getColor(whc0.f189133o, -1);
        this.f55802P = typedArrayObtainStyledAttributes.getBoolean(whc0.f189130l, true);
        this.f55819g = typedArrayObtainStyledAttributes.getDimensionPixelSize(whc0.f189124f, getResources().getDimensionPixelSize(jac0.f118971b));
        this.f55794L = typedArrayObtainStyledAttributes.getBoolean(whc0.f189138t, false);
        this.f55796M = typedArrayObtainStyledAttributes.getColor(whc0.f189118H, -1);
        this.f55798N = typedArrayObtainStyledAttributes.getBoolean(whc0.f189121c, false);
        this.f55804Q = m81580l(typedArrayObtainStyledAttributes.getResourceId(whc0.f189140v, -1));
        this.f55806R = m81580l(typedArrayObtainStyledAttributes.getResourceId(whc0.f189142x, -1));
        this.f55810U = typedArrayObtainStyledAttributes.getBoolean(whc0.f189125g, false);
        this.f55808S = m81580l(qbc0.f156466a);
        this.f55809T = m81580l(qbc0.f156467b);
        this.f55830p0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(whc0.f189141w, m81584p(16));
        this.f55836v = typedArrayObtainStyledAttributes.getBoolean(whc0.f189129k, false);
        this.f55837w = typedArrayObtainStyledAttributes.getBoolean(whc0.f189136r, false);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom});
        int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
        this.f55828o = typedArrayObtainStyledAttributes2.getDimensionPixelSize(1, dimensionPixelSize);
        this.f55826m = typedArrayObtainStyledAttributes2.getDimensionPixelSize(2, dimensionPixelSize);
        this.f55829p = typedArrayObtainStyledAttributes2.getDimensionPixelSize(3, dimensionPixelSize);
        this.f55827n = typedArrayObtainStyledAttributes2.getDimensionPixelSize(4, dimensionPixelSize);
        typedArrayObtainStyledAttributes2.recycle();
        setBackground(null);
        if (this.f55835u) {
            TransformationMethod transformationMethod = getTransformationMethod();
            setSingleLine();
            setTransformationMethod(transformationMethod);
        }
        m81588t();
        m81589u();
        m81590v();
        m81587s();
        m81591w();
        m81578j();
    }

    /* JADX INFO: renamed from: s */
    private void m81587s() {
        addTextChangedListener(new C13353b());
        ViewOnFocusChangeListenerC13354c viewOnFocusChangeListenerC13354c = new ViewOnFocusChangeListenerC13354c();
        this.f55803P0 = viewOnFocusChangeListenerC13354c;
        super.setOnFocusChangeListener(viewOnFocusChangeListenerC13354c);
    }

    private void setFloatingLabelInternal(int i) {
        if (i == 1) {
            this.f55822j = true;
            this.f55823k = false;
        } else if (i != 2) {
            this.f55822j = false;
            this.f55823k = false;
        } else {
            this.f55822j = true;
            this.f55823k = true;
        }
    }

    /* JADX INFO: renamed from: t */
    private void m81588t() {
        int i = 1;
        boolean z = this.f55833s > 0 || this.f55834t > 0 || this.f55835u || this.f55780E != null || this.f55778C != null;
        int i2 = this.f55840z;
        if (i2 > 0) {
            i = i2;
        } else if (!z) {
            i = 0;
        }
        this.f55839y = i;
        this.f55776A = i;
    }

    /* JADX INFO: renamed from: u */
    private void m81589u() {
        this.f55813a = this.f55822j ? this.f55817e + this.f55820h : this.f55820h;
        this.f55793K0.setTextSize(this.f55819g);
        Paint.FontMetrics fontMetrics = this.f55793K0.getFontMetrics();
        int i = (int) ((fontMetrics.descent - fontMetrics.ascent) * this.f55776A);
        boolean z = this.f55794L;
        int i2 = this.f55821i;
        if (!z) {
            i2 *= 2;
        }
        this.f55814b = i + i2;
        int i3 = 0;
        this.f55815c = this.f55804Q == null ? 0 : this.f55812W + this.f55830p0;
        if (this.f55806R != null) {
            i3 = this.f55830p0 + this.f55812W;
        }
        this.f55816d = i3;
        m81579k();
    }

    /* JADX INFO: renamed from: v */
    private void m81590v() {
        if (TextUtils.isEmpty(getText())) {
            m81566C();
        } else {
            Editable text = getText();
            setText((CharSequence) null);
            m81566C();
            setText(text);
            setSelection(text.length());
            this.f55782F = 1.0f;
            this.f55784G = true;
        }
        m81567D();
    }

    /* JADX INFO: renamed from: w */
    private void m81591w() {
        addTextChangedListener(new C13352a());
    }

    /* JADX INFO: renamed from: x */
    private boolean m81592x(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int scrollX = getScrollX() + (this.f55804Q == null ? 0 : this.f55812W + this.f55830p0);
        int scrollX2 = getScrollX() + (this.f55806R == null ? getWidth() : (getWidth() - this.f55812W) - this.f55830p0);
        if (!m81565A()) {
            scrollX = scrollX2 - this.f55812W;
        }
        int scrollY = ((getScrollY() + getHeight()) - getPaddingBottom()) + this.f55821i;
        int i = this.f55824k0;
        int i2 = scrollY - i;
        return x >= ((float) scrollX) && x < ((float) (scrollX + this.f55812W)) && y >= ((float) i2) && y < ((float) (i2 + i));
    }

    /* JADX INFO: renamed from: z */
    private boolean m81593z() {
        return this.f55780E == null && m81596y();
    }

    /* JADX INFO: renamed from: B */
    public boolean m81594B() {
        return this.f55810U;
    }

    /* JADX INFO: renamed from: F */
    public boolean m81595F() {
        List<yiw> list = this.f55807R0;
        if (list == null || list.isEmpty()) {
            return true;
        }
        Editable text = getText();
        boolean z = text.length() == 0;
        boolean z2 = true;
        for (yiw yiwVar : this.f55807R0) {
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
        return this.f55788I;
    }

    public int getBottomTextSize() {
        return this.f55819g;
    }

    public float getCurrentBottomLines() {
        return this.f55776A;
    }

    @Override // android.widget.TextView
    public CharSequence getError() {
        return this.f55780E;
    }

    public int getErrorColor() {
        return this.f55832r;
    }

    public float getFloatingLabelFraction() {
        return this.f55782F;
    }

    public int getFloatingLabelPadding() {
        return this.f55820h;
    }

    public CharSequence getFloatingLabelText() {
        return this.f55792K;
    }

    public int getFloatingLabelTextColor() {
        return this.f55818f;
    }

    public int getFloatingLabelTextSize() {
        return this.f55817e;
    }

    public float getFocusFraction() {
        return this.f55786H;
    }

    public String getHelperText() {
        return this.f55778C;
    }

    public int getHelperTextColor() {
        return this.f55779D;
    }

    public int getInnerPaddingBottom() {
        return this.f55827n;
    }

    public int getInnerPaddingLeft() {
        return this.f55828o;
    }

    public int getInnerPaddingRight() {
        return this.f55829p;
    }

    public int getInnerPaddingTop() {
        return this.f55826m;
    }

    public int getMaxCharacters() {
        return this.f55834t;
    }

    public int getMinBottomTextLines() {
        return this.f55840z;
    }

    public int getMinCharacters() {
        return this.f55833s;
    }

    public int getUnderlineColor() {
        return this.f55796M;
    }

    @Nullable
    public List<yiw> getValidators() {
        return this.f55807R0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int innerPaddingLeft;
        int i;
        char c;
        char c2;
        Canvas canvas2 = canvas;
        int scrollX = getScrollX() + (this.f55804Q == null ? 0 : this.f55812W + this.f55830p0);
        int scrollX2 = getScrollX() + (this.f55806R == null ? getWidth() : (getWidth() - this.f55812W) - this.f55830p0);
        int scrollY = (getScrollY() + getHeight()) - getPaddingBottom();
        this.f55791J0.setAlpha(255);
        Bitmap[] bitmapArr = this.f55804Q;
        if (bitmapArr != null) {
            if (!m81593z()) {
                c2 = 3;
            } else if (isEnabled()) {
                c2 = hasFocus() ? (char) 1 : (char) 0;
            } else {
                c2 = 2;
            }
            Bitmap bitmap = bitmapArr[c2];
            int i2 = scrollX - this.f55830p0;
            int i3 = this.f55812W;
            int width = (i2 - i3) + ((i3 - bitmap.getWidth()) / 2);
            int i4 = this.f55821i + scrollY;
            int i5 = this.f55824k0;
            canvas2.drawBitmap(bitmap, width, (i4 - i5) + ((i5 - bitmap.getHeight()) / 2), this.f55791J0);
        }
        Bitmap[] bitmapArr2 = this.f55806R;
        if (bitmapArr2 != null) {
            if (!m81593z()) {
                c = 3;
            } else if (isEnabled()) {
                c = hasFocus() ? (char) 1 : (char) 0;
            } else {
                c = 2;
            }
            Bitmap bitmap2 = bitmapArr2[c];
            int width2 = this.f55830p0 + scrollX2 + ((this.f55812W - bitmap2.getWidth()) / 2);
            int i6 = this.f55821i + scrollY;
            int i7 = this.f55824k0;
            canvas2.drawBitmap(bitmap2, width2, (i6 - i7) + ((i7 - bitmap2.getHeight()) / 2), this.f55791J0);
        }
        if (hasFocus() && this.f55810U) {
            this.f55791J0.setAlpha(255);
            int i8 = m81565A() ? scrollX : scrollX2 - this.f55812W;
            Bitmap bitmap3 = TextUtils.isEmpty(getText()) ? this.f55809T[0] : this.f55808S[0];
            int width3 = i8 + ((this.f55812W - bitmap3.getWidth()) / 2);
            int i9 = this.f55821i + scrollY;
            int i10 = this.f55824k0;
            canvas2.drawBitmap(bitmap3, width3, (i9 - i10) + ((i10 - bitmap3.getHeight()) / 2), this.f55791J0);
        }
        if (!this.f55794L) {
            int i11 = scrollY + this.f55821i;
            if (m81593z()) {
                if (isEnabled()) {
                    boolean zHasFocus = hasFocus();
                    Paint paint = this.f55791J0;
                    if (zHasFocus) {
                        paint.setColor(this.f55831q);
                        canvas2 = canvas;
                        canvas2.drawRect(scrollX, i11, scrollX2, m81584p(2) + i11, this.f55791J0);
                    } else {
                        int i12 = this.f55796M;
                        if (i12 == -1) {
                            i12 = (this.f55825l & 16777215) | 503316480;
                        }
                        paint.setColor(i12);
                        canvas2 = canvas;
                        canvas2.drawRect(scrollX, i11, scrollX2, m81584p(1) + i11, this.f55791J0);
                    }
                } else {
                    Paint paint2 = this.f55791J0;
                    int i13 = this.f55796M;
                    if (i13 == -1) {
                        i13 = (this.f55825l & 16777215) | 1140850688;
                    }
                    paint2.setColor(i13);
                    float fM81584p = m81584p(1);
                    float f = 0.0f;
                    while (f < getWidth()) {
                        float f2 = scrollX + f;
                        float f3 = fM81584p;
                        canvas.drawRect(f2, i11, f2 + fM81584p, m81584p(1) + i11, this.f55791J0);
                        f += 3.0f * f3;
                        fM81584p = f3;
                    }
                }
                scrollY = i11;
            } else {
                this.f55791J0.setColor(this.f55832r);
                canvas2.drawRect(scrollX, i11, scrollX2, m81584p(2) + i11, this.f55791J0);
            }
            canvas2 = canvas;
            scrollY = i11;
        }
        this.f55793K0.setTextSize(this.f55819g);
        Paint.FontMetrics fontMetrics = this.f55793K0.getFontMetrics();
        float f4 = fontMetrics.ascent;
        float f5 = fontMetrics.descent;
        float f6 = (-f4) - f5;
        float f7 = this.f55819g + f4 + f5;
        if ((hasFocus() && m81585q()) || !m81596y()) {
            this.f55793K0.setColor(m81596y() ? (this.f55825l & 16777215) | 1140850688 : this.f55832r);
            String charactersCounterText = getCharactersCounterText();
            canvas2.drawText(charactersCounterText, m81565A() ? scrollX : scrollX2 - this.f55793K0.measureText(charactersCounterText), this.f55821i + scrollY + f6, this.f55793K0);
        }
        if (this.f55795L0 != null && (this.f55780E != null || ((this.f55837w || hasFocus()) && !TextUtils.isEmpty(this.f55778C)))) {
            TextPaint textPaint = this.f55793K0;
            if (this.f55780E != null) {
                i = this.f55832r;
            } else {
                i = this.f55779D;
                if (i == -1) {
                    i = (this.f55825l & 16777215) | 1140850688;
                }
            }
            textPaint.setColor(i);
            canvas2.save();
            canvas2.translate(getBottomTextLeftOffset() + scrollX, (this.f55821i + scrollY) - f7);
            this.f55795L0.draw(canvas2);
            canvas2.restore();
        }
        if (this.f55822j && !TextUtils.isEmpty(this.f55792K)) {
            this.f55793K0.setTextSize(this.f55817e);
            TextPaint textPaint2 = this.f55793K0;
            ArgbEvaluator argbEvaluator = this.f55789I0;
            float f8 = this.f55786H;
            int i14 = this.f55818f;
            if (i14 == -1) {
                i14 = (16777215 & this.f55825l) | 1140850688;
            }
            textPaint2.setColor(((Integer) argbEvaluator.evaluate(f8, Integer.valueOf(i14), Integer.valueOf(this.f55831q))).intValue());
            float fMeasureText = this.f55793K0.measureText(this.f55792K.toString());
            if ((getGravity() & 5) == 5 || m81565A()) {
                innerPaddingLeft = (int) (scrollX2 - fMeasureText);
            } else {
                innerPaddingLeft = (getGravity() & 3) == 3 ? scrollX : ((int) (getInnerPaddingLeft() + ((((getWidth() - getInnerPaddingLeft()) - getInnerPaddingRight()) - fMeasureText) / 2.0f))) + scrollX;
            }
            int i15 = this.f55826m + this.f55817e;
            int i16 = this.f55820h;
            float f9 = i15 + i16;
            float f10 = i16;
            boolean z = this.f55836v;
            int i17 = (int) (f9 - (f10 * (z ? 1.0f : this.f55782F)));
            this.f55793K0.setAlpha((int) ((z ? 1.0f : this.f55782F) * 255.0f * (this.f55818f == -1 ? (this.f55786H * 0.74f) + 0.26f : 1.0f)));
            canvas2.drawText(this.f55792K.toString(), innerPaddingLeft, i17, this.f55793K0);
        }
        if (hasFocus() && this.f55835u && getScrollX() != 0) {
            this.f55791J0.setColor(this.f55831q);
            float f11 = scrollY + this.f55821i;
            if (m81565A()) {
                scrollX = scrollX2;
            }
            int i18 = m81565A() ? -1 : 1;
            int i19 = this.f55838x;
            canvas2.drawCircle(((i18 * i19) / 2) + scrollX, (i19 / 2) + f11, i19 / 2, this.f55791J0);
            int i20 = this.f55838x;
            canvas2.drawCircle((((i18 * i20) * 5) / 2) + scrollX, (i20 / 2) + f11, i20 / 2, this.f55791J0);
            int i21 = this.f55838x;
            canvas2.drawCircle(scrollX + (((i18 * i21) * 9) / 2), f11 + (i21 / 2), i21 / 2, this.f55791J0);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m81577i();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f55835u && getScrollX() > 0 && motionEvent.getAction() == 0 && motionEvent.getX() < m81584p(20) && motionEvent.getY() > (getHeight() - this.f55814b) - this.f55827n && motionEvent.getY() < getHeight() - this.f55827n) {
            setSelection(0);
            return false;
        }
        if (hasFocus() && this.f55810U) {
            int action = motionEvent.getAction();
            if (action == 0) {
                if (m81592x(motionEvent)) {
                    this.f55781E0 = true;
                    this.f55783F0 = true;
                }
                return true;
            }
            if (action == 1) {
                if (this.f55783F0) {
                    if (!TextUtils.isEmpty(getText())) {
                        setText((CharSequence) null);
                    }
                    this.f55783F0 = false;
                }
                if (this.f55781E0) {
                    this.f55781E0 = false;
                    return true;
                }
                this.f55781E0 = false;
            } else if (action == 2) {
                if (this.f55783F0 && !m81592x(motionEvent)) {
                    this.f55783F0 = false;
                }
                if (this.f55781E0) {
                    return true;
                }
            } else if (action == 3) {
                this.f55781E0 = false;
                this.f55783F0 = false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentTypeface(Typeface typeface) {
        this.f55788I = typeface;
        this.f55793K0.setTypeface(typeface);
        postInvalidate();
    }

    public void setAutoValidate(boolean z) {
        this.f55798N = z;
        if (z) {
            m81595F();
        }
    }

    public void setBaseColor(int i) {
        if (this.f55825l != i) {
            this.f55825l = i;
        }
        m81590v();
        postInvalidate();
    }

    public void setBottomTextSize(int i) {
        this.f55819g = i;
        m81589u();
    }

    public void setCurrentBottomLines(float f) {
        this.f55776A = f;
        m81589u();
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        this.f55780E = charSequence == null ? null : charSequence.toString();
        if (m81577i()) {
            postInvalidate();
        }
    }

    public void setErrorColor(int i) {
        this.f55832r = i;
        postInvalidate();
    }

    public void setFloatingLabel(int i) {
        setFloatingLabelInternal(i);
        m81589u();
    }

    public void setFloatingLabelAlwaysShown(boolean z) {
        this.f55836v = z;
        invalidate();
    }

    public void setFloatingLabelAnimating(boolean z) {
        this.f55802P = z;
    }

    public void setFloatingLabelFraction(float f) {
        this.f55782F = f;
        invalidate();
    }

    public void setFloatingLabelPadding(int i) {
        this.f55820h = i;
        postInvalidate();
    }

    public void setFloatingLabelText(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getHint();
        }
        this.f55792K = charSequence;
        postInvalidate();
    }

    public void setFloatingLabelTextColor(int i) {
        this.f55818f = i;
        postInvalidate();
    }

    public void setFloatingLabelTextSize(int i) {
        this.f55817e = i;
        m81589u();
    }

    public void setFocusFraction(float f) {
        this.f55786H = f;
        invalidate();
    }

    public void setHelperText(CharSequence charSequence) {
        this.f55778C = charSequence == null ? null : charSequence.toString();
        if (m81577i()) {
            postInvalidate();
        }
    }

    public void setHelperTextAlwaysShown(boolean z) {
        this.f55837w = z;
        invalidate();
    }

    public void setHelperTextColor(int i) {
        this.f55779D = i;
        postInvalidate();
    }

    public void setHideUnderline(boolean z) {
        this.f55794L = z;
        m81589u();
        postInvalidate();
    }

    public void setIconLeft(@DrawableRes int i) {
        this.f55804Q = m81580l(i);
        m81589u();
    }

    public void setIconRight(@DrawableRes int i) {
        this.f55806R = m81580l(i);
        m81589u();
    }

    public void setMaxCharacters(int i) {
        this.f55834t = i;
        m81588t();
        m81589u();
        postInvalidate();
    }

    public void setMetHintTextColor(int i) {
        this.f55787H0 = ColorStateList.valueOf(i);
        m81566C();
    }

    public void setMetTextColor(int i) {
        this.f55785G0 = ColorStateList.valueOf(i);
        m81567D();
    }

    public void setMinBottomTextLines(int i) {
        this.f55840z = i;
        m81588t();
        m81589u();
        postInvalidate();
    }

    public void setMinCharacters(int i) {
        this.f55833s = i;
        m81588t();
        m81589u();
        postInvalidate();
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        if (this.f55803P0 == null) {
            super.setOnFocusChangeListener(onFocusChangeListener);
        } else {
            this.f55805Q0 = onFocusChangeListener;
        }
    }

    @Override // android.widget.TextView, android.view.View
    @Deprecated
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    public void setPrimaryColor(int i) {
        this.f55831q = i;
        postInvalidate();
    }

    public void setShowClearButton(boolean z) {
        this.f55810U = z;
        m81579k();
    }

    public void setSingleLineEllipsis(boolean z) {
        this.f55835u = z;
        m81588t();
        m81589u();
        postInvalidate();
    }

    public void setUnderlineColor(int i) {
        this.f55796M = i;
        postInvalidate();
    }

    /* JADX INFO: renamed from: y */
    public boolean m81596y() {
        return this.f55800O;
    }

    public void setIconLeft(Bitmap bitmap) {
        this.f55804Q = m81581m(bitmap);
        m81589u();
    }

    public void setIconRight(Bitmap bitmap) {
        this.f55806R = m81581m(bitmap);
        m81589u();
    }

    public void setMetHintTextColor(ColorStateList colorStateList) {
        this.f55787H0 = colorStateList;
        m81566C();
    }

    public void setMetTextColor(ColorStateList colorStateList) {
        this.f55785G0 = colorStateList;
        m81567D();
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55779D = -1;
        this.f55789I0 = new ArgbEvaluator();
        this.f55791J0 = new Paint(1);
        this.f55793K0 = new TextPaint(1);
        m81586r(context, attributeSet);
    }

    @TargetApi(21)
    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55779D = -1;
        this.f55789I0 = new ArgbEvaluator();
        this.f55791J0 = new Paint(1);
        this.f55793K0 = new TextPaint(1);
        m81586r(context, attributeSet);
    }
}
