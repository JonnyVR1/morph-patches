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
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import java.util.List;
import p009l.c2c0;
import p009l.ie5;
import p009l.k3c0;
import p009l.q9c0;
import p009l.vtd;
import p009l.zgw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MaterialEditText extends EditText {

    /* JADX INFO: renamed from: A */
    private int f8602A;

    /* JADX INFO: renamed from: B */
    private int f8603B;

    /* JADX INFO: renamed from: C */
    private int f8604C;

    /* JADX INFO: renamed from: D */
    private float f8605D;

    /* JADX INFO: renamed from: E */
    private float f8606E;

    /* JADX INFO: renamed from: E0 */
    private int f8607E0;

    /* JADX INFO: renamed from: F */
    private String f8608F;

    /* JADX INFO: renamed from: F0 */
    private int f8609F0;

    /* JADX INFO: renamed from: G */
    private int f8610G;

    /* JADX INFO: renamed from: G0 */
    private int f8611G0;

    /* JADX INFO: renamed from: H */
    private String f8612H;

    /* JADX INFO: renamed from: H0 */
    private int f8613H0;

    /* JADX INFO: renamed from: I */
    private float f8614I;

    /* JADX INFO: renamed from: I0 */
    private boolean f8615I0;

    /* JADX INFO: renamed from: J */
    private boolean f8616J;

    /* JADX INFO: renamed from: J0 */
    private boolean f8617J0;

    /* JADX INFO: renamed from: K */
    private float f8618K;

    /* JADX INFO: renamed from: K0 */
    private ColorStateList f8619K0;

    /* JADX INFO: renamed from: L */
    private Typeface f8620L;

    /* JADX INFO: renamed from: L0 */
    private ColorStateList f8621L0;

    /* JADX INFO: renamed from: M */
    private Typeface f8622M;

    /* JADX INFO: renamed from: M0 */
    private ArgbEvaluator f8623M0;

    /* JADX INFO: renamed from: N */
    private CharSequence f8624N;

    /* JADX INFO: renamed from: N0 */
    Paint f8625N0;

    /* JADX INFO: renamed from: O */
    private boolean f8626O;

    /* JADX INFO: renamed from: O0 */
    TextPaint f8627O0;

    /* JADX INFO: renamed from: P */
    private int f8628P;

    /* JADX INFO: renamed from: P0 */
    StaticLayout f8629P0;

    /* JADX INFO: renamed from: Q */
    private int f8630Q;

    /* JADX INFO: renamed from: Q0 */
    ObjectAnimator f8631Q0;

    /* JADX INFO: renamed from: R */
    private boolean f8632R;

    /* JADX INFO: renamed from: R0 */
    ObjectAnimator f8633R0;

    /* JADX INFO: renamed from: S */
    private boolean f8634S;

    /* JADX INFO: renamed from: S0 */
    ObjectAnimator f8635S0;

    /* JADX INFO: renamed from: T */
    private boolean f8636T;

    /* JADX INFO: renamed from: T0 */
    View.OnFocusChangeListener f8637T0;

    /* JADX INFO: renamed from: U */
    private Bitmap[] f8638U;

    /* JADX INFO: renamed from: U0 */
    View.OnFocusChangeListener f8639U0;

    /* JADX INFO: renamed from: V */
    private Bitmap[] f8640V;

    /* JADX INFO: renamed from: V0 */
    private List<zgw> f8641V0;

    /* JADX INFO: renamed from: W */
    private Bitmap[] f8642W;

    /* JADX INFO: renamed from: W0 */
    int f8643W0;

    /* JADX INFO: renamed from: X0 */
    public boolean f8644X0;

    /* JADX INFO: renamed from: a */
    private int f8645a;

    /* JADX INFO: renamed from: b */
    private int f8646b;

    /* JADX INFO: renamed from: c */
    private int f8647c;

    /* JADX INFO: renamed from: d */
    private int f8648d;

    /* JADX INFO: renamed from: e */
    private int f8649e;

    /* JADX INFO: renamed from: f */
    private int f8650f;

    /* JADX INFO: renamed from: g */
    private int f8651g;

    /* JADX INFO: renamed from: h */
    private int f8652h;

    /* JADX INFO: renamed from: i */
    private int f8653i;

    /* JADX INFO: renamed from: j */
    private int f8654j;

    /* JADX INFO: renamed from: k */
    private boolean f8655k;

    /* JADX INFO: renamed from: k0 */
    private Bitmap[] f8656k0;

    /* JADX INFO: renamed from: l */
    private boolean f8657l;

    /* JADX INFO: renamed from: m */
    private int f8658m;

    /* JADX INFO: renamed from: n */
    private int f8659n;

    /* JADX INFO: renamed from: o */
    private int f8660o;

    /* JADX INFO: renamed from: p */
    private int f8661p;

    /* JADX INFO: renamed from: p0 */
    private boolean f8662p0;

    /* JADX INFO: renamed from: q */
    private int f8663q;

    /* JADX INFO: renamed from: r */
    private int f8664r;

    /* JADX INFO: renamed from: s */
    private boolean f8665s;

    /* JADX INFO: renamed from: t */
    private int f8666t;

    /* JADX INFO: renamed from: u */
    private boolean f8667u;

    /* JADX INFO: renamed from: v */
    private int f8668v;

    /* JADX INFO: renamed from: w */
    private int f8669w;

    /* JADX INFO: renamed from: x */
    private boolean f8670x;

    /* JADX INFO: renamed from: y */
    private boolean f8671y;

    /* JADX INFO: renamed from: z */
    private boolean f8672z;

    /* JADX INFO: renamed from: com.rengwuxian.materialedittext.MaterialEditText$a */
    public class C0594a implements TextWatcher {
        public C0594a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MaterialEditText.this.m10778j();
            boolean z = MaterialEditText.this.f8632R;
            MaterialEditText materialEditText = MaterialEditText.this;
            if (z) {
                materialEditText.m10795F();
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
    public class C0595b implements TextWatcher {
        public C0595b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (MaterialEditText.this.f8655k) {
                int length = editable.length();
                MaterialEditText materialEditText = MaterialEditText.this;
                if (length == 0) {
                    if (materialEditText.f8616J) {
                        MaterialEditText.this.f8616J = false;
                        MaterialEditText.this.getLabelAnimator().reverse();
                        return;
                    }
                    return;
                }
                if (materialEditText.f8616J) {
                    return;
                }
                MaterialEditText.this.f8616J = true;
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
    public class ViewOnFocusChangeListenerC0596c implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC0596c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (MaterialEditText.this.f8655k && MaterialEditText.this.f8657l) {
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
            View.OnFocusChangeListener onFocusChangeListener = MaterialEditText.this.f8639U0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z);
            }
        }
    }

    public MaterialEditText(Context context) {
        super(context);
        this.f8665s = false;
        this.f8610G = -1;
        this.f8623M0 = new ArgbEvaluator();
        this.f8625N0 = new Paint(1);
        this.f8627O0 = new TextPaint(1);
        this.f8643W0 = 0;
        this.f8644X0 = false;
        m10786r(context, null);
    }

    @TargetApi(MediaPickerParamsObject.FROM_PROFILE_PET)
    /* JADX INFO: renamed from: A */
    private boolean m10765A() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: B */
    private void m10766B() {
        ColorStateList colorStateList = this.f8621L0;
        if (colorStateList == null) {
            setHintTextColor((this.f8658m & 16777215) | 1140850688);
        } else {
            setHintTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: C */
    private void m10767C() {
        ColorStateList colorStateList = this.f8619K0;
        if (colorStateList != null) {
            setTextColor(colorStateList);
            return;
        }
        int[][] iArr = {new int[]{R.attr.state_enabled}, EditText.EMPTY_STATE_SET};
        int i = this.f8658m;
        ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{(i & 16777215) | (-553648128), (i & 16777215) | 1140850688});
        this.f8619K0 = colorStateList2;
        setTextColor(colorStateList2);
    }

    /* JADX INFO: renamed from: D */
    private Bitmap m10768D(Bitmap bitmap) {
        int i;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMax = Math.max(width, height);
        int i2 = this.f8607E0;
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
        if (this.f8670x) {
            return (this.f8602A * 5) + m10784p(4);
        }
        return 0;
    }

    private int getBottomTextLeftOffset() {
        return m10765A() ? getCharactersCounterWidth() : getBottomEllipsisWidth();
    }

    private int getBottomTextRightOffset() {
        return m10765A() ? getBottomEllipsisWidth() : getCharactersCounterWidth();
    }

    private int getButtonsCount() {
        return isShowClearButton() ? 1 : 0;
    }

    private String getCharactersCounterText() {
        if (this.f8668v <= 0) {
            if (m10765A()) {
                return this.f8669w + " / " + getText().length();
            }
            return getText().length() + " / " + this.f8669w;
        }
        if (this.f8669w <= 0) {
            if (m10765A()) {
                return "+" + this.f8668v + " / " + getText().length();
            }
            return getText().length() + " / " + this.f8668v + "+";
        }
        if (m10765A()) {
            return this.f8669w + "-" + this.f8668v + " / " + getText().length();
        }
        return getText().length() + " / " + this.f8668v + "-" + this.f8669w;
    }

    private int getCharactersCounterWidth() {
        if (m10785q()) {
            return (int) this.f8627O0.measureText(getCharactersCounterText());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator getLabelAnimator() {
        if (this.f8631Q0 == null) {
            this.f8631Q0 = ObjectAnimator.ofFloat(this, "floatingLabelFraction", 0.0f, 1.0f);
        }
        this.f8631Q0.setDuration(this.f8636T ? 300L : 0L);
        return this.f8631Q0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator getLabelFocusAnimator() {
        if (this.f8633R0 == null) {
            this.f8633R0 = ObjectAnimator.ofFloat(this, "focusFraction", 0.0f, 1.0f);
        }
        return this.f8633R0;
    }

    /* JADX INFO: renamed from: i */
    private boolean m10777i() {
        Layout.Alignment alignment;
        int iMax;
        if (getWidth() == 0) {
            return false;
        }
        this.f8627O0.setTextSize(this.f8651g);
        if (this.f8612H == null && this.f8608F == null) {
            iMax = this.f8603B;
        } else {
            if ((getGravity() & 5) == 5 || m10765A()) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = (getGravity() & 3) == 3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            String str = this.f8612H;
            if (str == null) {
                str = this.f8608F;
            }
            StaticLayout staticLayout = new StaticLayout(str, this.f8627O0, (getWidth() - getBottomTextLeftOffset()) - getBottomTextRightOffset(), alignment2, 1.0f, 0.0f, true);
            this.f8629P0 = staticLayout;
            iMax = Math.max(staticLayout.getLineCount(), this.f8604C);
        }
        float f = iMax;
        if (this.f8606E != f) {
            m10782n(f).start();
        }
        this.f8606E = f;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m10778j() {
        int i;
        Editable text = getText();
        boolean z = false;
        int length = text == null ? 0 : text.length();
        if (Math.abs(this.f8643W0 - length) > 3) {
            this.f8644X0 = true;
        }
        this.f8643W0 = length;
        if (!m10785q()) {
            this.f8634S = true;
            return;
        }
        if (length >= this.f8668v && ((i = this.f8669w) <= 0 || length <= i)) {
            z = true;
        }
        this.f8634S = z;
    }

    /* JADX INFO: renamed from: k */
    private void m10779k() {
        int i;
        int buttonsCount = this.f8609F0 * getButtonsCount();
        int i2 = 0;
        if (m10765A()) {
            i = 0;
        } else {
            i = buttonsCount;
            buttonsCount = 0;
        }
        if (TextUtils.isEmpty(getText()) && this.f8662p0) {
            i = 0;
        } else {
            i2 = buttonsCount;
        }
        super.setPadding(this.f8661p + this.f8647c + i2, this.f8659n + this.f8645a, this.f8663q + this.f8648d + i, this.f8660o + this.f8646b);
    }

    /* JADX INFO: renamed from: l */
    private Bitmap[] m10780l(@DrawableRes int i) {
        if (i == -1) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), i, options);
        int iMax = Math.max(options.outWidth, options.outHeight);
        int i2 = this.f8607E0;
        options.inSampleSize = iMax > i2 ? iMax / i2 : 1;
        options.inJustDecodeBounds = false;
        return m10781m(BitmapFactory.decodeResource(getResources(), i, options));
    }

    /* JADX INFO: renamed from: m */
    private Bitmap[] m10781m(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap[] bitmapArr = new Bitmap[4];
        Bitmap bitmapM10768D = m10768D(bitmap);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        bitmapArr[0] = bitmapM10768D.copy(config, true);
        bitmapArr[1] = bitmapM10768D.copy(config, true);
        Canvas canvas = new Canvas(bitmapArr[1]);
        int i = this.f8664r;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        canvas.drawColor(i, mode);
        bitmapArr[2] = bitmapM10768D.copy(config, true);
        Canvas canvas2 = new Canvas(bitmapArr[2]);
        int i2 = this.f8658m;
        canvas2.drawColor((ie5.m16504a(i2) ? 1275068416 : 1107296256) | (16777215 & i2), mode);
        bitmapArr[3] = bitmapM10768D.copy(config, true);
        new Canvas(bitmapArr[3]).drawColor(this.f8666t, mode);
        return bitmapArr;
    }

    /* JADX INFO: renamed from: n */
    private ObjectAnimator m10782n(float f) {
        ObjectAnimator objectAnimator = this.f8635S0;
        if (objectAnimator == null) {
            this.f8635S0 = ObjectAnimator.ofFloat(this, "currentBottomLines", f);
        } else {
            objectAnimator.cancel();
            this.f8635S0.setFloatValues(f);
        }
        return this.f8635S0;
    }

    /* JADX INFO: renamed from: o */
    private Typeface m10783o(@NonNull String str) {
        return Typeface.createFromAsset(getContext().getResources().getAssets(), str);
    }

    /* JADX INFO: renamed from: p */
    private int m10784p(int i) {
        return vtd.m23720a(getContext(), i);
    }

    /* JADX INFO: renamed from: q */
    private boolean m10785q() {
        return this.f8668v > 0 || this.f8669w > 0;
    }

    /* JADX INFO: renamed from: r */
    private void m10786r(Context context, AttributeSet attributeSet) {
        int i;
        this.f8607E0 = m10784p(32);
        this.f8609F0 = m10784p(48);
        this.f8611G0 = m10784p(32);
        this.f8653i = getResources().getDimensionPixelSize(c2c0.f10420d);
        this.f8602A = getResources().getDimensionPixelSize(c2c0.f10417a);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q9c0.f19081a);
        this.f8619K0 = typedArrayObtainStyledAttributes.getColorStateList(q9c0.f19077E);
        this.f8621L0 = typedArrayObtainStyledAttributes.getColorStateList(q9c0.f19078F);
        this.f8658m = typedArrayObtainStyledAttributes.getColor(q9c0.f19084d, -16777216);
        TypedValue typedValue = new TypedValue();
        try {
            try {
                context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                i = typedValue.data;
            } catch (Exception unused) {
                i = this.f8658m;
            }
        } catch (Exception unused2) {
            int identifier = getResources().getIdentifier("colorPrimary", "attr", getContext().getPackageName());
            if (identifier == 0) {
                throw new RuntimeException("colorPrimary not found");
            }
            context.getTheme().resolveAttribute(identifier, typedValue, true);
            i = typedValue.data;
        }
        this.f8653i = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f19085e, this.f8653i);
        this.f8654j = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f19088h, this.f8654j);
        this.f8664r = typedArrayObtainStyledAttributes.getColor(q9c0.f19075C, i);
        setFloatingLabelInternal(typedArrayObtainStyledAttributes.getInt(q9c0.f19090j, 0));
        this.f8666t = typedArrayObtainStyledAttributes.getColor(q9c0.f19089i, Color.parseColor("#e7492E"));
        this.f8667u = typedArrayObtainStyledAttributes.getBoolean(q9c0.f19105y, true);
        this.f8668v = typedArrayObtainStyledAttributes.getInt(q9c0.f19074B, 0);
        this.f8669w = typedArrayObtainStyledAttributes.getInt(q9c0.f19106z, 0);
        this.f8670x = typedArrayObtainStyledAttributes.getBoolean(q9c0.f19076D, false);
        this.f8608F = typedArrayObtainStyledAttributes.getString(q9c0.f19097q);
        this.f8610G = typedArrayObtainStyledAttributes.getColor(q9c0.f19099s, -1);
        this.f8604C = typedArrayObtainStyledAttributes.getInt(q9c0.f19073A, 0);
        String string = typedArrayObtainStyledAttributes.getString(q9c0.f19082b);
        if (string != null && !isInEditMode()) {
            Typeface typefaceM10783o = m10783o(string);
            this.f8620L = typefaceM10783o;
            this.f8627O0.setTypeface(typefaceM10783o);
        }
        String string2 = typedArrayObtainStyledAttributes.getString(q9c0.f19079G);
        if (string2 != null && !isInEditMode()) {
            Typeface typefaceM10783o2 = m10783o(string2);
            this.f8622M = typefaceM10783o2;
            setTypeface(typefaceM10783o2);
        }
        String string3 = typedArrayObtainStyledAttributes.getString(q9c0.f19094n);
        this.f8624N = string3;
        if (string3 == null) {
            this.f8624N = getHint();
        }
        this.f8652h = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f19093m, this.f8653i);
        this.f8649e = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f19096p, getResources().getDimensionPixelSize(c2c0.f10419c));
        this.f8650f = typedArrayObtainStyledAttributes.getColor(q9c0.f19095o, -1);
        this.f8636T = typedArrayObtainStyledAttributes.getBoolean(q9c0.f19092l, true);
        this.f8651g = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f19086f, getResources().getDimensionPixelSize(c2c0.f10418b));
        this.f8626O = typedArrayObtainStyledAttributes.getBoolean(q9c0.f19100t, false);
        this.f8628P = typedArrayObtainStyledAttributes.getColor(q9c0.f19080H, -1);
        this.f8630Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f19101u, -1);
        this.f8632R = typedArrayObtainStyledAttributes.getBoolean(q9c0.f19083c, false);
        this.f8638U = m10780l(typedArrayObtainStyledAttributes.getResourceId(q9c0.f19102v, -1));
        this.f8640V = m10780l(typedArrayObtainStyledAttributes.getResourceId(q9c0.f19104x, -1));
        this.f8662p0 = typedArrayObtainStyledAttributes.getBoolean(q9c0.f19087g, false);
        this.f8642W = m10780l(k3c0.f15398a);
        this.f8656k0 = m10780l(k3c0.f15399b);
        this.f8613H0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f19103w, m10784p(16));
        this.f8671y = typedArrayObtainStyledAttributes.getBoolean(q9c0.f19091k, false);
        this.f8672z = typedArrayObtainStyledAttributes.getBoolean(q9c0.f19098r, false);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom});
        int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
        this.f8661p = typedArrayObtainStyledAttributes2.getDimensionPixelSize(1, dimensionPixelSize);
        this.f8659n = typedArrayObtainStyledAttributes2.getDimensionPixelSize(2, dimensionPixelSize);
        this.f8663q = typedArrayObtainStyledAttributes2.getDimensionPixelSize(3, dimensionPixelSize);
        this.f8660o = typedArrayObtainStyledAttributes2.getDimensionPixelSize(4, dimensionPixelSize);
        typedArrayObtainStyledAttributes2.recycle();
        setBackground(null);
        if (this.f8670x) {
            TransformationMethod transformationMethod = getTransformationMethod();
            setSingleLine();
            setTransformationMethod(transformationMethod);
        }
        m10788t();
        m10789u();
        m10790v();
        m10787s();
        m10791w();
        m10778j();
    }

    /* JADX INFO: renamed from: s */
    private void m10787s() {
        addTextChangedListener(new C0595b());
        ViewOnFocusChangeListenerC0596c viewOnFocusChangeListenerC0596c = new ViewOnFocusChangeListenerC0596c();
        this.f8637T0 = viewOnFocusChangeListenerC0596c;
        super.setOnFocusChangeListener(viewOnFocusChangeListenerC0596c);
    }

    private void setFloatingLabelInternal(int i) {
        if (i == 1) {
            this.f8655k = true;
            this.f8657l = false;
        } else if (i != 2) {
            this.f8655k = false;
            this.f8657l = false;
        } else {
            this.f8655k = true;
            this.f8657l = true;
        }
    }

    /* JADX INFO: renamed from: t */
    private void m10788t() {
        int i = 1;
        boolean z = this.f8668v > 0 || this.f8669w > 0 || this.f8670x || this.f8612H != null || this.f8608F != null;
        int i2 = this.f8604C;
        if (i2 > 0) {
            i = i2;
        } else if (!z) {
            i = 0;
        }
        this.f8603B = i;
        this.f8605D = i;
    }

    /* JADX INFO: renamed from: u */
    private void m10789u() {
        this.f8645a = this.f8655k ? this.f8649e + this.f8652h : this.f8652h;
        this.f8627O0.setTextSize(this.f8651g);
        Paint.FontMetrics fontMetrics = this.f8627O0.getFontMetrics();
        int i = (int) ((fontMetrics.descent - fontMetrics.ascent) * this.f8605D);
        boolean z = this.f8626O;
        int i2 = this.f8653i;
        if (!z) {
            i2 *= 2;
        }
        this.f8646b = i + i2;
        int i3 = 0;
        this.f8647c = this.f8638U == null ? 0 : this.f8609F0 + this.f8613H0;
        if (this.f8640V != null) {
            i3 = this.f8613H0 + this.f8609F0;
        }
        this.f8648d = i3;
        m10779k();
    }

    /* JADX INFO: renamed from: v */
    private void m10790v() {
        if (TextUtils.isEmpty(getText())) {
            m10766B();
        } else {
            Editable text = getText();
            setText((CharSequence) null);
            m10766B();
            setText(text);
            setSelection(text.length());
            this.f8614I = 1.0f;
            this.f8616J = true;
            this.f8643W0 = text.length();
        }
        m10767C();
    }

    /* JADX INFO: renamed from: w */
    private void m10791w() {
        addTextChangedListener(new C0594a());
        this.f8643W0 = getText().length();
    }

    /* JADX INFO: renamed from: x */
    private boolean m10792x(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int scrollX = getScrollX() + (this.f8638U == null ? 0 : this.f8609F0 + this.f8613H0);
        int width = this.f8640V == null ? getWidth() : (getWidth() - this.f8609F0) - this.f8613H0;
        if (!m10765A()) {
            scrollX = (width - this.f8609F0) - this.f8663q;
        }
        int scrollY = (((((getScrollY() + getHeight()) - getPaddingBottom()) + this.f8653i) - this.f8611G0) - m10784p(9)) - this.f8654j;
        return x >= ((float) scrollX) && x < ((float) (scrollX + this.f8609F0)) && y >= ((float) scrollY) && y < ((float) (scrollY + this.f8611G0));
    }

    /* JADX INFO: renamed from: z */
    private boolean m10793z() {
        return this.f8612H == null;
    }

    /* JADX INFO: renamed from: E */
    public void m10794E(int i, int i2, int i3, int i4) {
        this.f8659n = i2;
        this.f8660o = i4;
        this.f8661p = i;
        this.f8663q = i3;
        m10779k();
    }

    /* JADX INFO: renamed from: F */
    public boolean m10795F() {
        List<zgw> list = this.f8641V0;
        if (list == null || list.isEmpty()) {
            return true;
        }
        Editable text = getText();
        boolean z = text.length() == 0;
        boolean z2 = true;
        for (zgw zgwVar : this.f8641V0) {
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
        return this.f8620L;
    }

    public int getBottomTextSize() {
        return this.f8651g;
    }

    @Keep
    public float getCurrentBottomLines() {
        return this.f8605D;
    }

    @Override // android.widget.TextView
    public CharSequence getError() {
        return this.f8612H;
    }

    public int getErrorColor() {
        return this.f8666t;
    }

    @Keep
    public float getFloatingLabelFraction() {
        return this.f8614I;
    }

    public int getFloatingLabelPadding() {
        return this.f8652h;
    }

    public CharSequence getFloatingLabelText() {
        return this.f8624N;
    }

    public int getFloatingLabelTextColor() {
        return this.f8650f;
    }

    public int getFloatingLabelTextSize() {
        return this.f8649e;
    }

    @Keep
    public float getFocusFraction() {
        return this.f8618K;
    }

    public String getHelperText() {
        return this.f8608F;
    }

    public int getHelperTextColor() {
        return this.f8610G;
    }

    public int getInnerPaddingBottom() {
        return this.f8660o;
    }

    public int getInnerPaddingLeft() {
        return this.f8661p;
    }

    public int getInnerPaddingRight() {
        return this.f8663q;
    }

    public int getInnerPaddingTop() {
        return this.f8659n;
    }

    public int getMaxCharacters() {
        return this.f8669w;
    }

    @Keep
    public int getMinBottomTextLines() {
        return this.f8604C;
    }

    @Keep
    public int getMinCharacters() {
        return this.f8668v;
    }

    public int getUnderlineColor() {
        return this.f8628P;
    }

    @Nullable
    public List<zgw> getValidators() {
        return this.f8641V0;
    }

    @Keep
    public boolean isShowClearButton() {
        return this.f8662p0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int innerPaddingLeft;
        int i;
        int i2;
        char c;
        char c2;
        Canvas canvas2 = canvas;
        int scrollX = getScrollX() + (this.f8638U == null ? 0 : this.f8609F0 + this.f8613H0);
        int scrollX2 = getScrollX() + (this.f8640V == null ? getWidth() : (getWidth() - this.f8609F0) - this.f8613H0);
        int scrollY = (getScrollY() + getHeight()) - getPaddingBottom();
        this.f8625N0.setAlpha(255);
        Bitmap[] bitmapArr = this.f8638U;
        if (bitmapArr != null) {
            if (!m10793z()) {
                c2 = 3;
            } else if (isEnabled()) {
                c2 = hasFocus() ? (char) 1 : (char) 0;
            } else {
                c2 = 2;
            }
            Bitmap bitmap = bitmapArr[c2];
            int i3 = scrollX - this.f8613H0;
            int i4 = this.f8609F0;
            int width = (i3 - i4) + ((i4 - bitmap.getWidth()) / 2);
            int i5 = this.f8653i + scrollY;
            int i6 = this.f8611G0;
            canvas2.drawBitmap(bitmap, width, (i5 - i6) + ((i6 - bitmap.getHeight()) / 2), this.f8625N0);
        }
        Bitmap[] bitmapArr2 = this.f8640V;
        if (bitmapArr2 != null) {
            if (!m10793z()) {
                c = 3;
            } else if (isEnabled()) {
                c = hasFocus() ? (char) 1 : (char) 0;
            } else {
                c = 2;
            }
            Bitmap bitmap2 = bitmapArr2[c];
            int width2 = this.f8613H0 + scrollX2 + ((this.f8609F0 - bitmap2.getWidth()) / 2);
            int i7 = this.f8653i + scrollY;
            int i8 = this.f8611G0;
            canvas2.drawBitmap(bitmap2, width2, (i7 - i8) + ((i8 - bitmap2.getHeight()) / 2), this.f8625N0);
        }
        if (hasFocus() && this.f8662p0) {
            this.f8625N0.setAlpha(255);
            int i9 = m10765A() ? scrollX : (scrollX2 - this.f8609F0) - this.f8663q;
            Bitmap bitmap3 = TextUtils.isEmpty(getText()) ? this.f8656k0[0] : this.f8642W[0];
            int width3 = i9 + ((this.f8609F0 - bitmap3.getWidth()) / 2);
            int i10 = this.f8653i + scrollY;
            int i11 = this.f8611G0;
            int height = (((i10 - i11) + ((i11 - bitmap3.getHeight()) / 2)) - m10784p(9)) - this.f8654j;
            if (!TextUtils.isEmpty(getText())) {
                canvas2.drawBitmap(bitmap3, width3, height, this.f8625N0);
            }
        }
        if (!this.f8626O) {
            int i12 = scrollY + this.f8653i;
            if (m10793z() || !this.f8667u) {
                i2 = i12;
                if (!isEnabled()) {
                    Paint paint = this.f8625N0;
                    int i13 = this.f8628P;
                    if (i13 == -1) {
                        i13 = (this.f8658m & 16777215) | 1140850688;
                    }
                    paint.setColor(i13);
                    float fM10784p = m10784p(1);
                    float f = 0.0f;
                    while (f < getWidth()) {
                        float f2 = scrollX + f;
                        float f3 = fM10784p;
                        canvas.drawRect(f2, i2, f2 + fM10784p, m10784p(1) + i2, this.f8625N0);
                        f += 3.0f * f3;
                        fM10784p = f3;
                    }
                } else if (hasFocus()) {
                    this.f8625N0.setColor(this.f8664r);
                    float f4 = scrollX;
                    float f5 = i2;
                    float f6 = scrollX2;
                    int iM10784p = this.f8630Q;
                    if (iM10784p == -1) {
                        iM10784p = m10784p(2);
                    }
                    canvas2 = canvas;
                    canvas2.drawRect(f4, f5, f6, iM10784p + i2, this.f8625N0);
                } else {
                    boolean z = this.f8665s;
                    Paint paint2 = this.f8625N0;
                    if (z) {
                        paint2.setColor(this.f8664r);
                        float f7 = scrollX;
                        float f8 = i2;
                        float f9 = scrollX2;
                        int iM10784p2 = this.f8630Q;
                        if (iM10784p2 == -1) {
                            iM10784p2 = m10784p(2);
                        }
                        canvas2 = canvas;
                        canvas2.drawRect(f7, f8, f9, iM10784p2 + i2, this.f8625N0);
                    } else {
                        int i14 = this.f8628P;
                        if (i14 == -1) {
                            i14 = (this.f8658m & 16777215) | 503316480;
                        }
                        paint2.setColor(i14);
                        canvas2 = canvas;
                        canvas2.drawRect(scrollX, i2, scrollX2, m10784p(1) + i2, this.f8625N0);
                    }
                }
                scrollY = i2;
            } else {
                this.f8625N0.setColor(this.f8666t);
                float f10 = scrollX;
                float f11 = i12;
                float f12 = scrollX2;
                int iM10784p3 = this.f8630Q;
                if (iM10784p3 == -1) {
                    iM10784p3 = m10784p(2);
                }
                i2 = i12;
                canvas2.drawRect(f10, f11, f12, iM10784p3 + i12, this.f8625N0);
            }
            canvas2 = canvas;
            scrollY = i2;
        }
        this.f8627O0.setTextSize(this.f8651g);
        Paint.FontMetrics fontMetrics = this.f8627O0.getFontMetrics();
        float f13 = fontMetrics.ascent;
        float f14 = fontMetrics.descent;
        float f15 = (-f13) - f14;
        float f16 = this.f8651g + f13 + f14;
        if (hasFocus() && m10785q()) {
            this.f8627O0.setColor(m10796y() ? (this.f8658m & 16777215) | 1140850688 : this.f8666t);
            String charactersCounterText = getCharactersCounterText();
            canvas2.drawText(charactersCounterText, m10765A() ? scrollX : scrollX2 - this.f8627O0.measureText(charactersCounterText), this.f8653i + scrollY + f15, this.f8627O0);
        }
        if (this.f8629P0 != null && (this.f8612H != null || ((this.f8672z || hasFocus()) && !TextUtils.isEmpty(this.f8608F)))) {
            TextPaint textPaint = this.f8627O0;
            if (this.f8612H != null) {
                i = this.f8666t;
            } else {
                i = this.f8610G;
                if (i == -1) {
                    i = (this.f8658m & 16777215) | 1140850688;
                }
            }
            textPaint.setColor(i);
            canvas2.save();
            canvas2.translate(getBottomTextLeftOffset() + scrollX, (this.f8653i + scrollY) - f16);
            this.f8629P0.draw(canvas2);
            canvas2.restore();
        }
        if (this.f8655k && !TextUtils.isEmpty(this.f8624N)) {
            this.f8627O0.setTextSize(this.f8649e);
            TextPaint textPaint2 = this.f8627O0;
            ArgbEvaluator argbEvaluator = this.f8623M0;
            float f17 = this.f8618K;
            int i15 = this.f8650f;
            if (i15 == -1) {
                i15 = (this.f8658m & 16777215) | 1140850688;
            }
            textPaint2.setColor(((Integer) argbEvaluator.evaluate(f17, Integer.valueOf(i15), Integer.valueOf(this.f8664r))).intValue());
            float fMeasureText = this.f8627O0.measureText(this.f8624N.toString());
            if ((getGravity() & 5) == 5 || m10765A()) {
                innerPaddingLeft = (int) (scrollX2 - fMeasureText);
            } else {
                innerPaddingLeft = (getGravity() & 3) == 3 ? scrollX : ((int) (getInnerPaddingLeft() + ((((getWidth() - getInnerPaddingLeft()) - getInnerPaddingRight()) - fMeasureText) / 2.0f))) + scrollX;
            }
            int i16 = this.f8659n + this.f8649e;
            int i17 = this.f8652h;
            float f18 = i16 + i17;
            float f19 = i17;
            boolean z2 = this.f8671y;
            int i18 = (int) (f18 - (f19 * (z2 ? 1.0f : this.f8614I)));
            this.f8627O0.setAlpha((int) ((z2 ? 1.0f : this.f8614I) * 255.0f * (this.f8650f == -1 ? (this.f8618K * 0.74f) + 0.26f : 1.0f)));
            canvas2.drawText(this.f8624N.toString(), innerPaddingLeft, i18, this.f8627O0);
        }
        if (hasFocus() && this.f8670x && getScrollX() != 0) {
            this.f8625N0.setColor(this.f8664r);
            float f20 = scrollY + this.f8653i;
            if (m10765A()) {
                scrollX = scrollX2;
            }
            int i19 = m10765A() ? -1 : 1;
            int i20 = this.f8602A;
            canvas2.drawCircle(((i19 * i20) / 2) + scrollX, (i20 / 2) + f20, i20 / 2, this.f8625N0);
            int i21 = this.f8602A;
            canvas2.drawCircle((((i19 * i21) * 5) / 2) + scrollX, (i21 / 2) + f20, i21 / 2, this.f8625N0);
            int i22 = this.f8602A;
            canvas2.drawCircle(scrollX + (((i19 * i22) * 9) / 2), f20 + (i22 / 2), i22 / 2, this.f8625N0);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m10777i();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f8670x && getScrollX() > 0 && motionEvent.getAction() == 0 && motionEvent.getX() < m10784p(20) && motionEvent.getY() > (getHeight() - this.f8646b) - this.f8660o && motionEvent.getY() < getHeight() - this.f8660o) {
            setSelection(0);
            return false;
        }
        if (hasFocus() && this.f8662p0) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    if (this.f8617J0) {
                        if (!TextUtils.isEmpty(getText())) {
                            setText((CharSequence) null);
                        }
                        this.f8617J0 = false;
                    }
                    if (this.f8615I0) {
                        this.f8615I0 = false;
                        return true;
                    }
                    this.f8615I0 = false;
                } else if (action == 2) {
                    if (this.f8617J0 && !m10792x(motionEvent)) {
                        this.f8617J0 = false;
                    }
                    if (this.f8615I0) {
                        return true;
                    }
                } else if (action == 3) {
                    this.f8615I0 = false;
                    this.f8617J0 = false;
                }
            } else if (m10792x(motionEvent)) {
                this.f8615I0 = true;
                this.f8617J0 = true;
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentTypeface(Typeface typeface) {
        this.f8620L = typeface;
        this.f8627O0.setTypeface(typeface);
        postInvalidate();
    }

    public void setAutoValidate(boolean z) {
        this.f8632R = z;
        if (z) {
            m10795F();
        }
    }

    public void setBaseColor(int i) {
        if (this.f8658m != i) {
            this.f8658m = i;
        }
        m10790v();
        postInvalidate();
    }

    public void setBottomTextSize(int i) {
        this.f8651g = i;
        m10789u();
    }

    @Keep
    public void setCurrentBottomLines(float f) {
        this.f8605D = f;
        m10789u();
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        this.f8612H = charSequence == null ? null : charSequence.toString();
        if (m10777i()) {
            postInvalidate();
        }
    }

    public void setErrorBottomLineShown(boolean z) {
        this.f8667u = z;
    }

    public void setErrorColor(int i) {
        this.f8666t = i;
        postInvalidate();
    }

    public void setFloatingLabel(int i) {
        setFloatingLabelInternal(i);
        m10789u();
    }

    public void setFloatingLabelAlwaysShown(boolean z) {
        this.f8671y = z;
        invalidate();
    }

    public void setFloatingLabelAnimating(boolean z) {
        this.f8636T = z;
    }

    @Keep
    public void setFloatingLabelFraction(float f) {
        this.f8614I = f;
        invalidate();
    }

    public void setFloatingLabelPadding(int i) {
        this.f8652h = i;
        postInvalidate();
    }

    public void setFloatingLabelText(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getHint();
        }
        this.f8624N = charSequence;
        postInvalidate();
    }

    public void setFloatingLabelTextColor(int i) {
        this.f8650f = i;
        postInvalidate();
    }

    public void setFloatingLabelTextSize(int i) {
        this.f8649e = i;
        m10789u();
    }

    @Keep
    public void setFocusFraction(float f) {
        this.f8618K = f;
        invalidate();
    }

    public void setForcePrimaryColor(boolean z) {
        this.f8665s = z;
        postInvalidate();
    }

    public void setHelperText(CharSequence charSequence) {
        this.f8608F = charSequence == null ? null : charSequence.toString();
        if (m10777i()) {
            postInvalidate();
        }
    }

    public void setHelperTextAlwaysShown(boolean z) {
        this.f8672z = z;
        invalidate();
    }

    public void setHelperTextColor(int i) {
        this.f8610G = i;
        postInvalidate();
    }

    public void setHideUnderline(boolean z) {
        this.f8626O = z;
        m10789u();
        postInvalidate();
    }

    public void setHighLightUnderlineWidth(int i) {
        this.f8630Q = i;
        postInvalidate();
    }

    @Keep
    public void setIconLeft(@DrawableRes int i) {
        this.f8638U = m10780l(i);
        m10789u();
    }

    @Keep
    public void setIconRight(@DrawableRes int i) {
        this.f8640V = m10780l(i);
        m10789u();
    }

    public void setMaxCharacters(int i) {
        this.f8669w = i;
        m10788t();
        m10789u();
        postInvalidate();
    }

    public void setMetHintTextColor(int i) {
        this.f8621L0 = ColorStateList.valueOf(i);
        m10766B();
    }

    public void setMetTextColor(int i) {
        this.f8619K0 = ColorStateList.valueOf(i);
        m10767C();
    }

    @Keep
    public void setMinBottomTextLines(int i) {
        this.f8604C = i;
        m10788t();
        m10789u();
        postInvalidate();
    }

    @Keep
    public void setMinCharacters(int i) {
        this.f8668v = i;
        m10788t();
        m10789u();
        postInvalidate();
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        if (this.f8637T0 == null) {
            super.setOnFocusChangeListener(onFocusChangeListener);
        } else {
            this.f8639U0 = onFocusChangeListener;
        }
    }

    @Override // android.widget.TextView, android.view.View
    @Deprecated
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    public void setPrimaryColor(int i) {
        this.f8664r = i;
        postInvalidate();
    }

    @Keep
    public void setShowClearButton(boolean z) {
        this.f8662p0 = z;
        m10779k();
    }

    public void setSingleLineEllipsis(boolean z) {
        this.f8670x = z;
        m10788t();
        m10789u();
        postInvalidate();
    }

    public void setUnderlineColor(int i) {
        this.f8628P = i;
        postInvalidate();
    }

    /* JADX INFO: renamed from: y */
    public boolean m10796y() {
        return this.f8634S;
    }

    @Keep
    public void setIconLeft(Bitmap bitmap) {
        this.f8638U = m10781m(bitmap);
        m10789u();
    }

    @Keep
    public void setIconRight(Bitmap bitmap) {
        this.f8640V = m10781m(bitmap);
        m10789u();
    }

    public void setMetHintTextColor(ColorStateList colorStateList) {
        this.f8621L0 = colorStateList;
        m10766B();
    }

    public void setMetTextColor(ColorStateList colorStateList) {
        this.f8619K0 = colorStateList;
        m10767C();
    }

    public MaterialEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8665s = false;
        this.f8610G = -1;
        this.f8623M0 = new ArgbEvaluator();
        this.f8625N0 = new Paint(1);
        this.f8627O0 = new TextPaint(1);
        this.f8643W0 = 0;
        this.f8644X0 = false;
        m10786r(context, attributeSet);
    }

    @TargetApi(21)
    public MaterialEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8665s = false;
        this.f8610G = -1;
        this.f8623M0 = new ArgbEvaluator();
        this.f8625N0 = new Paint(1);
        this.f8627O0 = new TextPaint(1);
        this.f8643W0 = 0;
        this.f8644X0 = false;
        m10786r(context, attributeSet);
    }
}
