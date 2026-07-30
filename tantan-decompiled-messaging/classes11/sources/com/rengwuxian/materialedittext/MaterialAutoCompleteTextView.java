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
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import java.util.List;
import p009l.c2c0;
import p009l.ie5;
import p009l.k3c0;
import p009l.q9c0;
import p009l.vtd;
import p009l.zgw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MaterialAutoCompleteTextView extends AutoCompleteTextView {

    /* JADX INFO: renamed from: A */
    private float f8534A;

    /* JADX INFO: renamed from: B */
    private float f8535B;

    /* JADX INFO: renamed from: C */
    private String f8536C;

    /* JADX INFO: renamed from: D */
    private int f8537D;

    /* JADX INFO: renamed from: E */
    private String f8538E;

    /* JADX INFO: renamed from: E0 */
    private boolean f8539E0;

    /* JADX INFO: renamed from: F */
    private float f8540F;

    /* JADX INFO: renamed from: F0 */
    private boolean f8541F0;

    /* JADX INFO: renamed from: G */
    private boolean f8542G;

    /* JADX INFO: renamed from: G0 */
    private ColorStateList f8543G0;

    /* JADX INFO: renamed from: H */
    private float f8544H;

    /* JADX INFO: renamed from: H0 */
    private ColorStateList f8545H0;

    /* JADX INFO: renamed from: I */
    private Typeface f8546I;

    /* JADX INFO: renamed from: I0 */
    private ArgbEvaluator f8547I0;

    /* JADX INFO: renamed from: J */
    private Typeface f8548J;

    /* JADX INFO: renamed from: J0 */
    Paint f8549J0;

    /* JADX INFO: renamed from: K */
    private CharSequence f8550K;

    /* JADX INFO: renamed from: K0 */
    TextPaint f8551K0;

    /* JADX INFO: renamed from: L */
    private boolean f8552L;

    /* JADX INFO: renamed from: L0 */
    StaticLayout f8553L0;

    /* JADX INFO: renamed from: M */
    private int f8554M;

    /* JADX INFO: renamed from: M0 */
    ObjectAnimator f8555M0;

    /* JADX INFO: renamed from: N */
    private boolean f8556N;

    /* JADX INFO: renamed from: N0 */
    ObjectAnimator f8557N0;

    /* JADX INFO: renamed from: O */
    private boolean f8558O;

    /* JADX INFO: renamed from: O0 */
    ObjectAnimator f8559O0;

    /* JADX INFO: renamed from: P */
    private boolean f8560P;

    /* JADX INFO: renamed from: P0 */
    View.OnFocusChangeListener f8561P0;

    /* JADX INFO: renamed from: Q */
    private Bitmap[] f8562Q;

    /* JADX INFO: renamed from: Q0 */
    View.OnFocusChangeListener f8563Q0;

    /* JADX INFO: renamed from: R */
    private Bitmap[] f8564R;

    /* JADX INFO: renamed from: R0 */
    private List<zgw> f8565R0;

    /* JADX INFO: renamed from: S */
    private Bitmap[] f8566S;

    /* JADX INFO: renamed from: T */
    private Bitmap[] f8567T;

    /* JADX INFO: renamed from: U */
    private boolean f8568U;

    /* JADX INFO: renamed from: V */
    private int f8569V;

    /* JADX INFO: renamed from: W */
    private int f8570W;

    /* JADX INFO: renamed from: a */
    private int f8571a;

    /* JADX INFO: renamed from: b */
    private int f8572b;

    /* JADX INFO: renamed from: c */
    private int f8573c;

    /* JADX INFO: renamed from: d */
    private int f8574d;

    /* JADX INFO: renamed from: e */
    private int f8575e;

    /* JADX INFO: renamed from: f */
    private int f8576f;

    /* JADX INFO: renamed from: g */
    private int f8577g;

    /* JADX INFO: renamed from: h */
    private int f8578h;

    /* JADX INFO: renamed from: i */
    private int f8579i;

    /* JADX INFO: renamed from: j */
    private boolean f8580j;

    /* JADX INFO: renamed from: k */
    private boolean f8581k;

    /* JADX INFO: renamed from: k0 */
    private int f8582k0;

    /* JADX INFO: renamed from: l */
    private int f8583l;

    /* JADX INFO: renamed from: m */
    private int f8584m;

    /* JADX INFO: renamed from: n */
    private int f8585n;

    /* JADX INFO: renamed from: o */
    private int f8586o;

    /* JADX INFO: renamed from: p */
    private int f8587p;

    /* JADX INFO: renamed from: p0 */
    private int f8588p0;

    /* JADX INFO: renamed from: q */
    private int f8589q;

    /* JADX INFO: renamed from: r */
    private int f8590r;

    /* JADX INFO: renamed from: s */
    private int f8591s;

    /* JADX INFO: renamed from: t */
    private int f8592t;

    /* JADX INFO: renamed from: u */
    private boolean f8593u;

    /* JADX INFO: renamed from: v */
    private boolean f8594v;

    /* JADX INFO: renamed from: w */
    private boolean f8595w;

    /* JADX INFO: renamed from: x */
    private int f8596x;

    /* JADX INFO: renamed from: y */
    private int f8597y;

    /* JADX INFO: renamed from: z */
    private int f8598z;

    /* JADX INFO: renamed from: com.rengwuxian.materialedittext.MaterialAutoCompleteTextView$a */
    public class C0591a implements TextWatcher {
        public C0591a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MaterialAutoCompleteTextView.this.m10746j();
            boolean z = MaterialAutoCompleteTextView.this.f8556N;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            if (z) {
                materialAutoCompleteTextView.m10763F();
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
    public class C0592b implements TextWatcher {
        public C0592b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (MaterialAutoCompleteTextView.this.f8580j) {
                int length = editable.length();
                MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
                if (length == 0) {
                    if (materialAutoCompleteTextView.f8542G) {
                        MaterialAutoCompleteTextView.this.f8542G = false;
                        MaterialAutoCompleteTextView.this.getLabelAnimator().reverse();
                        return;
                    }
                    return;
                }
                if (materialAutoCompleteTextView.f8542G) {
                    return;
                }
                MaterialAutoCompleteTextView.this.f8542G = true;
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
    public class ViewOnFocusChangeListenerC0593c implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC0593c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (MaterialAutoCompleteTextView.this.f8580j && MaterialAutoCompleteTextView.this.f8581k) {
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
            View.OnFocusChangeListener onFocusChangeListener = MaterialAutoCompleteTextView.this.f8563Q0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z);
            }
        }
    }

    public MaterialAutoCompleteTextView(Context context) {
        super(context);
        this.f8537D = -1;
        this.f8547I0 = new ArgbEvaluator();
        this.f8549J0 = new Paint(1);
        this.f8551K0 = new TextPaint(1);
        m10754r(context, null);
    }

    @TargetApi(MediaPickerParamsObject.FROM_PROFILE_PET)
    /* JADX INFO: renamed from: A */
    private boolean m10733A() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: C */
    private void m10734C() {
        ColorStateList colorStateList = this.f8545H0;
        if (colorStateList == null) {
            setHintTextColor((this.f8583l & 16777215) | 1140850688);
        } else {
            setHintTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: D */
    private void m10735D() {
        ColorStateList colorStateList = this.f8543G0;
        if (colorStateList != null) {
            setTextColor(colorStateList);
            return;
        }
        int[][] iArr = {new int[]{R.attr.state_enabled}, AutoCompleteTextView.EMPTY_STATE_SET};
        int i = this.f8583l;
        ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{(i & 16777215) | (-553648128), (i & 16777215) | 1140850688});
        this.f8543G0 = colorStateList2;
        setTextColor(colorStateList2);
    }

    /* JADX INFO: renamed from: E */
    private Bitmap m10736E(Bitmap bitmap) {
        int i;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMax = Math.max(width, height);
        int i2 = this.f8569V;
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
        if (this.f8593u) {
            return (this.f8596x * 5) + m10752p(4);
        }
        return 0;
    }

    private int getBottomTextLeftOffset() {
        return m10733A() ? getCharactersCounterWidth() : getBottomEllipsisWidth();
    }

    private int getBottomTextRightOffset() {
        return m10733A() ? getBottomEllipsisWidth() : getCharactersCounterWidth();
    }

    private int getButtonsCount() {
        return m10762B() ? 1 : 0;
    }

    private String getCharactersCounterText() {
        if (this.f8591s <= 0) {
            if (m10733A()) {
                return this.f8592t + " / " + getText().length();
            }
            return getText().length() + " / " + this.f8592t;
        }
        if (this.f8592t <= 0) {
            if (m10733A()) {
                return "+" + this.f8591s + " / " + getText().length();
            }
            return getText().length() + " / " + this.f8591s + "+";
        }
        if (m10733A()) {
            return this.f8592t + "-" + this.f8591s + " / " + getText().length();
        }
        return getText().length() + " / " + this.f8591s + "-" + this.f8592t;
    }

    private int getCharactersCounterWidth() {
        if (m10753q()) {
            return (int) this.f8551K0.measureText(getCharactersCounterText());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator getLabelAnimator() {
        if (this.f8555M0 == null) {
            this.f8555M0 = ObjectAnimator.ofFloat(this, "floatingLabelFraction", 0.0f, 1.0f);
        }
        this.f8555M0.setDuration(this.f8560P ? 300L : 0L);
        return this.f8555M0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator getLabelFocusAnimator() {
        if (this.f8557N0 == null) {
            this.f8557N0 = ObjectAnimator.ofFloat(this, "focusFraction", 0.0f, 1.0f);
        }
        return this.f8557N0;
    }

    /* JADX INFO: renamed from: i */
    private boolean m10745i() {
        Layout.Alignment alignment;
        int iMax;
        if (getWidth() == 0) {
            return false;
        }
        this.f8551K0.setTextSize(this.f8577g);
        if (this.f8538E == null && this.f8536C == null) {
            iMax = this.f8597y;
        } else {
            if ((getGravity() & 5) == 5 || m10733A()) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = (getGravity() & 3) == 3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            String str = this.f8538E;
            if (str == null) {
                str = this.f8536C;
            }
            StaticLayout staticLayout = new StaticLayout(str, this.f8551K0, (((getWidth() - getBottomTextLeftOffset()) - getBottomTextRightOffset()) - getPaddingLeft()) - getPaddingRight(), alignment2, 1.0f, 0.0f, true);
            this.f8553L0 = staticLayout;
            iMax = Math.max(staticLayout.getLineCount(), this.f8598z);
        }
        float f = iMax;
        if (this.f8535B != f) {
            m10750n(f).start();
        }
        this.f8535B = f;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m10746j() {
        int i;
        boolean z = true;
        if (!m10753q()) {
            this.f8558O = true;
            return;
        }
        Editable text = getText();
        int length = text == null ? 0 : text.length();
        if (length < this.f8591s || ((i = this.f8592t) > 0 && length > i)) {
            z = false;
        }
        this.f8558O = z;
    }

    /* JADX INFO: renamed from: k */
    private void m10747k() {
        int buttonsCount = this.f8570W * getButtonsCount();
        int i = 0;
        if (!m10733A()) {
            i = buttonsCount;
            buttonsCount = 0;
        }
        super.setPadding(this.f8586o + this.f8573c + buttonsCount, this.f8584m + this.f8571a, this.f8587p + this.f8574d + i, this.f8585n + this.f8572b);
    }

    /* JADX INFO: renamed from: l */
    private Bitmap[] m10748l(@DrawableRes int i) {
        if (i == -1) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), i, options);
        int iMax = Math.max(options.outWidth, options.outHeight);
        int i2 = this.f8569V;
        options.inSampleSize = iMax > i2 ? iMax / i2 : 1;
        options.inJustDecodeBounds = false;
        return m10749m(BitmapFactory.decodeResource(getResources(), i, options));
    }

    /* JADX INFO: renamed from: m */
    private Bitmap[] m10749m(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap[] bitmapArr = new Bitmap[4];
        Bitmap bitmapM10736E = m10736E(bitmap);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        bitmapArr[0] = bitmapM10736E.copy(config, true);
        Canvas canvas = new Canvas(bitmapArr[0]);
        int i = this.f8583l;
        int i2 = (ie5.m16504a(i) ? -16777216 : -1979711488) | (i & 16777215);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        canvas.drawColor(i2, mode);
        bitmapArr[1] = bitmapM10736E.copy(config, true);
        new Canvas(bitmapArr[1]).drawColor(this.f8589q, mode);
        bitmapArr[2] = bitmapM10736E.copy(config, true);
        Canvas canvas2 = new Canvas(bitmapArr[2]);
        int i3 = this.f8583l;
        canvas2.drawColor((ie5.m16504a(i3) ? 1275068416 : 1107296256) | (16777215 & i3), mode);
        bitmapArr[3] = bitmapM10736E.copy(config, true);
        new Canvas(bitmapArr[3]).drawColor(this.f8590r, mode);
        return bitmapArr;
    }

    /* JADX INFO: renamed from: n */
    private ObjectAnimator m10750n(float f) {
        ObjectAnimator objectAnimator = this.f8559O0;
        if (objectAnimator == null) {
            this.f8559O0 = ObjectAnimator.ofFloat(this, "currentBottomLines", f);
        } else {
            objectAnimator.cancel();
            this.f8559O0.setFloatValues(f);
        }
        return this.f8559O0;
    }

    /* JADX INFO: renamed from: o */
    private Typeface m10751o(@NonNull String str) {
        return Typeface.createFromAsset(getContext().getResources().getAssets(), str);
    }

    /* JADX INFO: renamed from: p */
    private int m10752p(int i) {
        return vtd.m23720a(getContext(), i);
    }

    /* JADX INFO: renamed from: q */
    private boolean m10753q() {
        return this.f8591s > 0 || this.f8592t > 0;
    }

    /* JADX INFO: renamed from: r */
    private void m10754r(Context context, AttributeSet attributeSet) {
        int i;
        this.f8569V = m10752p(32);
        this.f8570W = m10752p(48);
        this.f8582k0 = m10752p(32);
        this.f8579i = getResources().getDimensionPixelSize(c2c0.f10420d);
        this.f8596x = getResources().getDimensionPixelSize(c2c0.f10417a);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q9c0.f19081a);
        this.f8543G0 = typedArrayObtainStyledAttributes.getColorStateList(q9c0.f19077E);
        this.f8545H0 = typedArrayObtainStyledAttributes.getColorStateList(q9c0.f19078F);
        this.f8583l = typedArrayObtainStyledAttributes.getColor(q9c0.f19084d, -16777216);
        TypedValue typedValue = new TypedValue();
        try {
            try {
                context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                i = typedValue.data;
            } catch (Exception unused) {
                i = this.f8583l;
            }
        } catch (Exception unused2) {
            int identifier = getResources().getIdentifier("colorPrimary", "attr", getContext().getPackageName());
            if (identifier == 0) {
                throw new RuntimeException("colorPrimary not found");
            }
            context.getTheme().resolveAttribute(identifier, typedValue, true);
            i = typedValue.data;
        }
        this.f8589q = typedArrayObtainStyledAttributes.getColor(q9c0.f19075C, i);
        setFloatingLabelInternal(typedArrayObtainStyledAttributes.getInt(q9c0.f19090j, 0));
        this.f8590r = typedArrayObtainStyledAttributes.getColor(q9c0.f19089i, Color.parseColor("#e7492E"));
        this.f8591s = typedArrayObtainStyledAttributes.getInt(q9c0.f19074B, 0);
        this.f8592t = typedArrayObtainStyledAttributes.getInt(q9c0.f19106z, 0);
        this.f8593u = typedArrayObtainStyledAttributes.getBoolean(q9c0.f19076D, false);
        this.f8536C = typedArrayObtainStyledAttributes.getString(q9c0.f19097q);
        this.f8537D = typedArrayObtainStyledAttributes.getColor(q9c0.f19099s, -1);
        this.f8598z = typedArrayObtainStyledAttributes.getInt(q9c0.f19073A, 0);
        String string = typedArrayObtainStyledAttributes.getString(q9c0.f19082b);
        if (string != null && !isInEditMode()) {
            Typeface typefaceM10751o = m10751o(string);
            this.f8546I = typefaceM10751o;
            this.f8551K0.setTypeface(typefaceM10751o);
        }
        String string2 = typedArrayObtainStyledAttributes.getString(q9c0.f19079G);
        if (string2 != null && !isInEditMode()) {
            Typeface typefaceM10751o2 = m10751o(string2);
            this.f8548J = typefaceM10751o2;
            setTypeface(typefaceM10751o2);
        }
        String string3 = typedArrayObtainStyledAttributes.getString(q9c0.f19094n);
        this.f8550K = string3;
        if (string3 == null) {
            this.f8550K = getHint();
        }
        this.f8578h = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f19093m, this.f8579i);
        this.f8575e = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f19096p, getResources().getDimensionPixelSize(c2c0.f10419c));
        this.f8576f = typedArrayObtainStyledAttributes.getColor(q9c0.f19095o, -1);
        this.f8560P = typedArrayObtainStyledAttributes.getBoolean(q9c0.f19092l, true);
        this.f8577g = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f19086f, getResources().getDimensionPixelSize(c2c0.f10418b));
        this.f8552L = typedArrayObtainStyledAttributes.getBoolean(q9c0.f19100t, false);
        this.f8554M = typedArrayObtainStyledAttributes.getColor(q9c0.f19080H, -1);
        this.f8556N = typedArrayObtainStyledAttributes.getBoolean(q9c0.f19083c, false);
        this.f8562Q = m10748l(typedArrayObtainStyledAttributes.getResourceId(q9c0.f19102v, -1));
        this.f8564R = m10748l(typedArrayObtainStyledAttributes.getResourceId(q9c0.f19104x, -1));
        this.f8568U = typedArrayObtainStyledAttributes.getBoolean(q9c0.f19087g, false);
        this.f8566S = m10748l(k3c0.f15398a);
        this.f8567T = m10748l(k3c0.f15399b);
        this.f8588p0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f19103w, m10752p(16));
        this.f8594v = typedArrayObtainStyledAttributes.getBoolean(q9c0.f19091k, false);
        this.f8595w = typedArrayObtainStyledAttributes.getBoolean(q9c0.f19098r, false);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom});
        int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
        this.f8586o = typedArrayObtainStyledAttributes2.getDimensionPixelSize(1, dimensionPixelSize);
        this.f8584m = typedArrayObtainStyledAttributes2.getDimensionPixelSize(2, dimensionPixelSize);
        this.f8587p = typedArrayObtainStyledAttributes2.getDimensionPixelSize(3, dimensionPixelSize);
        this.f8585n = typedArrayObtainStyledAttributes2.getDimensionPixelSize(4, dimensionPixelSize);
        typedArrayObtainStyledAttributes2.recycle();
        setBackground(null);
        if (this.f8593u) {
            TransformationMethod transformationMethod = getTransformationMethod();
            setSingleLine();
            setTransformationMethod(transformationMethod);
        }
        m10756t();
        m10757u();
        m10758v();
        m10755s();
        m10759w();
        m10746j();
    }

    /* JADX INFO: renamed from: s */
    private void m10755s() {
        addTextChangedListener(new C0592b());
        ViewOnFocusChangeListenerC0593c viewOnFocusChangeListenerC0593c = new ViewOnFocusChangeListenerC0593c();
        this.f8561P0 = viewOnFocusChangeListenerC0593c;
        super.setOnFocusChangeListener(viewOnFocusChangeListenerC0593c);
    }

    private void setFloatingLabelInternal(int i) {
        if (i == 1) {
            this.f8580j = true;
            this.f8581k = false;
        } else if (i != 2) {
            this.f8580j = false;
            this.f8581k = false;
        } else {
            this.f8580j = true;
            this.f8581k = true;
        }
    }

    /* JADX INFO: renamed from: t */
    private void m10756t() {
        int i = 1;
        boolean z = this.f8591s > 0 || this.f8592t > 0 || this.f8593u || this.f8538E != null || this.f8536C != null;
        int i2 = this.f8598z;
        if (i2 > 0) {
            i = i2;
        } else if (!z) {
            i = 0;
        }
        this.f8597y = i;
        this.f8534A = i;
    }

    /* JADX INFO: renamed from: u */
    private void m10757u() {
        this.f8571a = this.f8580j ? this.f8575e + this.f8578h : this.f8578h;
        this.f8551K0.setTextSize(this.f8577g);
        Paint.FontMetrics fontMetrics = this.f8551K0.getFontMetrics();
        int i = (int) ((fontMetrics.descent - fontMetrics.ascent) * this.f8534A);
        boolean z = this.f8552L;
        int i2 = this.f8579i;
        if (!z) {
            i2 *= 2;
        }
        this.f8572b = i + i2;
        int i3 = 0;
        this.f8573c = this.f8562Q == null ? 0 : this.f8570W + this.f8588p0;
        if (this.f8564R != null) {
            i3 = this.f8588p0 + this.f8570W;
        }
        this.f8574d = i3;
        m10747k();
    }

    /* JADX INFO: renamed from: v */
    private void m10758v() {
        if (TextUtils.isEmpty(getText())) {
            m10734C();
        } else {
            Editable text = getText();
            setText((CharSequence) null);
            m10734C();
            setText(text);
            setSelection(text.length());
            this.f8540F = 1.0f;
            this.f8542G = true;
        }
        m10735D();
    }

    /* JADX INFO: renamed from: w */
    private void m10759w() {
        addTextChangedListener(new C0591a());
    }

    /* JADX INFO: renamed from: x */
    private boolean m10760x(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int scrollX = getScrollX() + (this.f8562Q == null ? 0 : this.f8570W + this.f8588p0);
        int scrollX2 = getScrollX() + (this.f8564R == null ? getWidth() : (getWidth() - this.f8570W) - this.f8588p0);
        if (!m10733A()) {
            scrollX = scrollX2 - this.f8570W;
        }
        int scrollY = ((getScrollY() + getHeight()) - getPaddingBottom()) + this.f8579i;
        int i = this.f8582k0;
        int i2 = scrollY - i;
        return x >= ((float) scrollX) && x < ((float) (scrollX + this.f8570W)) && y >= ((float) i2) && y < ((float) (i2 + i));
    }

    /* JADX INFO: renamed from: z */
    private boolean m10761z() {
        return this.f8538E == null && m10764y();
    }

    /* JADX INFO: renamed from: B */
    public boolean m10762B() {
        return this.f8568U;
    }

    /* JADX INFO: renamed from: F */
    public boolean m10763F() {
        List<zgw> list = this.f8565R0;
        if (list == null || list.isEmpty()) {
            return true;
        }
        Editable text = getText();
        boolean z = text.length() == 0;
        boolean z2 = true;
        for (zgw zgwVar : this.f8565R0) {
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
        return this.f8546I;
    }

    public int getBottomTextSize() {
        return this.f8577g;
    }

    public float getCurrentBottomLines() {
        return this.f8534A;
    }

    @Override // android.widget.TextView
    public CharSequence getError() {
        return this.f8538E;
    }

    public int getErrorColor() {
        return this.f8590r;
    }

    public float getFloatingLabelFraction() {
        return this.f8540F;
    }

    public int getFloatingLabelPadding() {
        return this.f8578h;
    }

    public CharSequence getFloatingLabelText() {
        return this.f8550K;
    }

    public int getFloatingLabelTextColor() {
        return this.f8576f;
    }

    public int getFloatingLabelTextSize() {
        return this.f8575e;
    }

    public float getFocusFraction() {
        return this.f8544H;
    }

    public String getHelperText() {
        return this.f8536C;
    }

    public int getHelperTextColor() {
        return this.f8537D;
    }

    public int getInnerPaddingBottom() {
        return this.f8585n;
    }

    public int getInnerPaddingLeft() {
        return this.f8586o;
    }

    public int getInnerPaddingRight() {
        return this.f8587p;
    }

    public int getInnerPaddingTop() {
        return this.f8584m;
    }

    public int getMaxCharacters() {
        return this.f8592t;
    }

    public int getMinBottomTextLines() {
        return this.f8598z;
    }

    public int getMinCharacters() {
        return this.f8591s;
    }

    public int getUnderlineColor() {
        return this.f8554M;
    }

    @Nullable
    public List<zgw> getValidators() {
        return this.f8565R0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int innerPaddingLeft;
        int i;
        char c;
        char c2;
        Canvas canvas2 = canvas;
        int scrollX = getScrollX() + (this.f8562Q == null ? 0 : this.f8570W + this.f8588p0);
        int scrollX2 = getScrollX() + (this.f8564R == null ? getWidth() : (getWidth() - this.f8570W) - this.f8588p0);
        int scrollY = (getScrollY() + getHeight()) - getPaddingBottom();
        this.f8549J0.setAlpha(255);
        Bitmap[] bitmapArr = this.f8562Q;
        if (bitmapArr != null) {
            if (!m10761z()) {
                c2 = 3;
            } else if (isEnabled()) {
                c2 = hasFocus() ? (char) 1 : (char) 0;
            } else {
                c2 = 2;
            }
            Bitmap bitmap = bitmapArr[c2];
            int i2 = scrollX - this.f8588p0;
            int i3 = this.f8570W;
            int width = (i2 - i3) + ((i3 - bitmap.getWidth()) / 2);
            int i4 = this.f8579i + scrollY;
            int i5 = this.f8582k0;
            canvas2.drawBitmap(bitmap, width, (i4 - i5) + ((i5 - bitmap.getHeight()) / 2), this.f8549J0);
        }
        Bitmap[] bitmapArr2 = this.f8564R;
        if (bitmapArr2 != null) {
            if (!m10761z()) {
                c = 3;
            } else if (isEnabled()) {
                c = hasFocus() ? (char) 1 : (char) 0;
            } else {
                c = 2;
            }
            Bitmap bitmap2 = bitmapArr2[c];
            int width2 = this.f8588p0 + scrollX2 + ((this.f8570W - bitmap2.getWidth()) / 2);
            int i6 = this.f8579i + scrollY;
            int i7 = this.f8582k0;
            canvas2.drawBitmap(bitmap2, width2, (i6 - i7) + ((i7 - bitmap2.getHeight()) / 2), this.f8549J0);
        }
        if (hasFocus() && this.f8568U) {
            this.f8549J0.setAlpha(255);
            int i8 = m10733A() ? scrollX : scrollX2 - this.f8570W;
            Bitmap bitmap3 = TextUtils.isEmpty(getText()) ? this.f8567T[0] : this.f8566S[0];
            int width3 = i8 + ((this.f8570W - bitmap3.getWidth()) / 2);
            int i9 = this.f8579i + scrollY;
            int i10 = this.f8582k0;
            canvas2.drawBitmap(bitmap3, width3, (i9 - i10) + ((i10 - bitmap3.getHeight()) / 2), this.f8549J0);
        }
        if (!this.f8552L) {
            int i11 = scrollY + this.f8579i;
            if (m10761z()) {
                if (isEnabled()) {
                    boolean zHasFocus = hasFocus();
                    Paint paint = this.f8549J0;
                    if (zHasFocus) {
                        paint.setColor(this.f8589q);
                        canvas2 = canvas;
                        canvas2.drawRect(scrollX, i11, scrollX2, m10752p(2) + i11, this.f8549J0);
                    } else {
                        int i12 = this.f8554M;
                        if (i12 == -1) {
                            i12 = (this.f8583l & 16777215) | 503316480;
                        }
                        paint.setColor(i12);
                        canvas2 = canvas;
                        canvas2.drawRect(scrollX, i11, scrollX2, m10752p(1) + i11, this.f8549J0);
                    }
                } else {
                    Paint paint2 = this.f8549J0;
                    int i13 = this.f8554M;
                    if (i13 == -1) {
                        i13 = (this.f8583l & 16777215) | 1140850688;
                    }
                    paint2.setColor(i13);
                    float fM10752p = m10752p(1);
                    float f = 0.0f;
                    while (f < getWidth()) {
                        float f2 = scrollX + f;
                        float f3 = fM10752p;
                        canvas.drawRect(f2, i11, f2 + fM10752p, m10752p(1) + i11, this.f8549J0);
                        f += 3.0f * f3;
                        fM10752p = f3;
                    }
                }
                scrollY = i11;
            } else {
                this.f8549J0.setColor(this.f8590r);
                canvas2.drawRect(scrollX, i11, scrollX2, m10752p(2) + i11, this.f8549J0);
            }
            canvas2 = canvas;
            scrollY = i11;
        }
        this.f8551K0.setTextSize(this.f8577g);
        Paint.FontMetrics fontMetrics = this.f8551K0.getFontMetrics();
        float f4 = fontMetrics.ascent;
        float f5 = fontMetrics.descent;
        float f6 = (-f4) - f5;
        float f7 = this.f8577g + f4 + f5;
        if ((hasFocus() && m10753q()) || !m10764y()) {
            this.f8551K0.setColor(m10764y() ? (this.f8583l & 16777215) | 1140850688 : this.f8590r);
            String charactersCounterText = getCharactersCounterText();
            canvas2.drawText(charactersCounterText, m10733A() ? scrollX : scrollX2 - this.f8551K0.measureText(charactersCounterText), this.f8579i + scrollY + f6, this.f8551K0);
        }
        if (this.f8553L0 != null && (this.f8538E != null || ((this.f8595w || hasFocus()) && !TextUtils.isEmpty(this.f8536C)))) {
            TextPaint textPaint = this.f8551K0;
            if (this.f8538E != null) {
                i = this.f8590r;
            } else {
                i = this.f8537D;
                if (i == -1) {
                    i = (this.f8583l & 16777215) | 1140850688;
                }
            }
            textPaint.setColor(i);
            canvas2.save();
            canvas2.translate(getBottomTextLeftOffset() + scrollX, (this.f8579i + scrollY) - f7);
            this.f8553L0.draw(canvas2);
            canvas2.restore();
        }
        if (this.f8580j && !TextUtils.isEmpty(this.f8550K)) {
            this.f8551K0.setTextSize(this.f8575e);
            TextPaint textPaint2 = this.f8551K0;
            ArgbEvaluator argbEvaluator = this.f8547I0;
            float f8 = this.f8544H;
            int i14 = this.f8576f;
            if (i14 == -1) {
                i14 = (16777215 & this.f8583l) | 1140850688;
            }
            textPaint2.setColor(((Integer) argbEvaluator.evaluate(f8, Integer.valueOf(i14), Integer.valueOf(this.f8589q))).intValue());
            float fMeasureText = this.f8551K0.measureText(this.f8550K.toString());
            if ((getGravity() & 5) == 5 || m10733A()) {
                innerPaddingLeft = (int) (scrollX2 - fMeasureText);
            } else {
                innerPaddingLeft = (getGravity() & 3) == 3 ? scrollX : ((int) (getInnerPaddingLeft() + ((((getWidth() - getInnerPaddingLeft()) - getInnerPaddingRight()) - fMeasureText) / 2.0f))) + scrollX;
            }
            int i15 = this.f8584m + this.f8575e;
            int i16 = this.f8578h;
            float f9 = i15 + i16;
            float f10 = i16;
            boolean z = this.f8594v;
            int i17 = (int) (f9 - (f10 * (z ? 1.0f : this.f8540F)));
            this.f8551K0.setAlpha((int) ((z ? 1.0f : this.f8540F) * 255.0f * (this.f8576f == -1 ? (this.f8544H * 0.74f) + 0.26f : 1.0f)));
            canvas2.drawText(this.f8550K.toString(), innerPaddingLeft, i17, this.f8551K0);
        }
        if (hasFocus() && this.f8593u && getScrollX() != 0) {
            this.f8549J0.setColor(this.f8589q);
            float f11 = scrollY + this.f8579i;
            if (m10733A()) {
                scrollX = scrollX2;
            }
            int i18 = m10733A() ? -1 : 1;
            int i19 = this.f8596x;
            canvas2.drawCircle(((i18 * i19) / 2) + scrollX, (i19 / 2) + f11, i19 / 2, this.f8549J0);
            int i20 = this.f8596x;
            canvas2.drawCircle((((i18 * i20) * 5) / 2) + scrollX, (i20 / 2) + f11, i20 / 2, this.f8549J0);
            int i21 = this.f8596x;
            canvas2.drawCircle(scrollX + (((i18 * i21) * 9) / 2), f11 + (i21 / 2), i21 / 2, this.f8549J0);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m10745i();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f8593u && getScrollX() > 0 && motionEvent.getAction() == 0 && motionEvent.getX() < m10752p(20) && motionEvent.getY() > (getHeight() - this.f8572b) - this.f8585n && motionEvent.getY() < getHeight() - this.f8585n) {
            setSelection(0);
            return false;
        }
        if (hasFocus() && this.f8568U) {
            int action = motionEvent.getAction();
            if (action == 0) {
                if (m10760x(motionEvent)) {
                    this.f8539E0 = true;
                    this.f8541F0 = true;
                }
                return true;
            }
            if (action == 1) {
                if (this.f8541F0) {
                    if (!TextUtils.isEmpty(getText())) {
                        setText((CharSequence) null);
                    }
                    this.f8541F0 = false;
                }
                if (this.f8539E0) {
                    this.f8539E0 = false;
                    return true;
                }
                this.f8539E0 = false;
            } else if (action == 2) {
                if (this.f8541F0 && !m10760x(motionEvent)) {
                    this.f8541F0 = false;
                }
                if (this.f8539E0) {
                    return true;
                }
            } else if (action == 3) {
                this.f8539E0 = false;
                this.f8541F0 = false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentTypeface(Typeface typeface) {
        this.f8546I = typeface;
        this.f8551K0.setTypeface(typeface);
        postInvalidate();
    }

    public void setAutoValidate(boolean z) {
        this.f8556N = z;
        if (z) {
            m10763F();
        }
    }

    public void setBaseColor(int i) {
        if (this.f8583l != i) {
            this.f8583l = i;
        }
        m10758v();
        postInvalidate();
    }

    public void setBottomTextSize(int i) {
        this.f8577g = i;
        m10757u();
    }

    public void setCurrentBottomLines(float f) {
        this.f8534A = f;
        m10757u();
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        this.f8538E = charSequence == null ? null : charSequence.toString();
        if (m10745i()) {
            postInvalidate();
        }
    }

    public void setErrorColor(int i) {
        this.f8590r = i;
        postInvalidate();
    }

    public void setFloatingLabel(int i) {
        setFloatingLabelInternal(i);
        m10757u();
    }

    public void setFloatingLabelAlwaysShown(boolean z) {
        this.f8594v = z;
        invalidate();
    }

    public void setFloatingLabelAnimating(boolean z) {
        this.f8560P = z;
    }

    public void setFloatingLabelFraction(float f) {
        this.f8540F = f;
        invalidate();
    }

    public void setFloatingLabelPadding(int i) {
        this.f8578h = i;
        postInvalidate();
    }

    public void setFloatingLabelText(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getHint();
        }
        this.f8550K = charSequence;
        postInvalidate();
    }

    public void setFloatingLabelTextColor(int i) {
        this.f8576f = i;
        postInvalidate();
    }

    public void setFloatingLabelTextSize(int i) {
        this.f8575e = i;
        m10757u();
    }

    public void setFocusFraction(float f) {
        this.f8544H = f;
        invalidate();
    }

    public void setHelperText(CharSequence charSequence) {
        this.f8536C = charSequence == null ? null : charSequence.toString();
        if (m10745i()) {
            postInvalidate();
        }
    }

    public void setHelperTextAlwaysShown(boolean z) {
        this.f8595w = z;
        invalidate();
    }

    public void setHelperTextColor(int i) {
        this.f8537D = i;
        postInvalidate();
    }

    public void setHideUnderline(boolean z) {
        this.f8552L = z;
        m10757u();
        postInvalidate();
    }

    public void setIconLeft(@DrawableRes int i) {
        this.f8562Q = m10748l(i);
        m10757u();
    }

    public void setIconRight(@DrawableRes int i) {
        this.f8564R = m10748l(i);
        m10757u();
    }

    public void setMaxCharacters(int i) {
        this.f8592t = i;
        m10756t();
        m10757u();
        postInvalidate();
    }

    public void setMetHintTextColor(int i) {
        this.f8545H0 = ColorStateList.valueOf(i);
        m10734C();
    }

    public void setMetTextColor(int i) {
        this.f8543G0 = ColorStateList.valueOf(i);
        m10735D();
    }

    public void setMinBottomTextLines(int i) {
        this.f8598z = i;
        m10756t();
        m10757u();
        postInvalidate();
    }

    public void setMinCharacters(int i) {
        this.f8591s = i;
        m10756t();
        m10757u();
        postInvalidate();
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        if (this.f8561P0 == null) {
            super.setOnFocusChangeListener(onFocusChangeListener);
        } else {
            this.f8563Q0 = onFocusChangeListener;
        }
    }

    @Override // android.widget.TextView, android.view.View
    @Deprecated
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    public void setPrimaryColor(int i) {
        this.f8589q = i;
        postInvalidate();
    }

    public void setShowClearButton(boolean z) {
        this.f8568U = z;
        m10747k();
    }

    public void setSingleLineEllipsis(boolean z) {
        this.f8593u = z;
        m10756t();
        m10757u();
        postInvalidate();
    }

    public void setUnderlineColor(int i) {
        this.f8554M = i;
        postInvalidate();
    }

    /* JADX INFO: renamed from: y */
    public boolean m10764y() {
        return this.f8558O;
    }

    public void setIconLeft(Bitmap bitmap) {
        this.f8562Q = m10749m(bitmap);
        m10757u();
    }

    public void setIconRight(Bitmap bitmap) {
        this.f8564R = m10749m(bitmap);
        m10757u();
    }

    public void setMetHintTextColor(ColorStateList colorStateList) {
        this.f8545H0 = colorStateList;
        m10734C();
    }

    public void setMetTextColor(ColorStateList colorStateList) {
        this.f8543G0 = colorStateList;
        m10735D();
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8537D = -1;
        this.f8547I0 = new ArgbEvaluator();
        this.f8549J0 = new Paint(1);
        this.f8551K0 = new TextPaint(1);
        m10754r(context, attributeSet);
    }

    @TargetApi(21)
    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8537D = -1;
        this.f8547I0 = new ArgbEvaluator();
        this.f8549J0 = new Paint(1);
        this.f8551K0 = new TextPaint(1);
        m10754r(context, attributeSet);
    }
}
