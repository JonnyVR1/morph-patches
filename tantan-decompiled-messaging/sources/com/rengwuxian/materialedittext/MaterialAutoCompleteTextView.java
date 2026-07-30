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
import p149l.c2c0;
import p149l.ie5;
import p149l.k3c0;
import p149l.q9c0;
import p149l.vtd;
import p149l.zgw;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class MaterialAutoCompleteTextView extends AutoCompleteTextView {

    /* JADX INFO: renamed from: A */
    private float f54928A;

    /* JADX INFO: renamed from: B */
    private float f54929B;

    /* JADX INFO: renamed from: C */
    private String f54930C;

    /* JADX INFO: renamed from: D */
    private int f54931D;

    /* JADX INFO: renamed from: E */
    private String f54932E;

    /* JADX INFO: renamed from: E0 */
    private boolean f54933E0;

    /* JADX INFO: renamed from: F */
    private float f54934F;

    /* JADX INFO: renamed from: F0 */
    private boolean f54935F0;

    /* JADX INFO: renamed from: G */
    private boolean f54936G;

    /* JADX INFO: renamed from: G0 */
    private ColorStateList f54937G0;

    /* JADX INFO: renamed from: H */
    private float f54938H;

    /* JADX INFO: renamed from: H0 */
    private ColorStateList f54939H0;

    /* JADX INFO: renamed from: I */
    private Typeface f54940I;

    /* JADX INFO: renamed from: I0 */
    private ArgbEvaluator f54941I0;

    /* JADX INFO: renamed from: J */
    private Typeface f54942J;

    /* JADX INFO: renamed from: J0 */
    Paint f54943J0;

    /* JADX INFO: renamed from: K */
    private CharSequence f54944K;

    /* JADX INFO: renamed from: K0 */
    TextPaint f54945K0;

    /* JADX INFO: renamed from: L */
    private boolean f54946L;

    /* JADX INFO: renamed from: L0 */
    StaticLayout f54947L0;

    /* JADX INFO: renamed from: M */
    private int f54948M;

    /* JADX INFO: renamed from: M0 */
    ObjectAnimator f54949M0;

    /* JADX INFO: renamed from: N */
    private boolean f54950N;

    /* JADX INFO: renamed from: N0 */
    ObjectAnimator f54951N0;

    /* JADX INFO: renamed from: O */
    private boolean f54952O;

    /* JADX INFO: renamed from: O0 */
    ObjectAnimator f54953O0;

    /* JADX INFO: renamed from: P */
    private boolean f54954P;

    /* JADX INFO: renamed from: P0 */
    View.OnFocusChangeListener f54955P0;

    /* JADX INFO: renamed from: Q */
    private Bitmap[] f54956Q;

    /* JADX INFO: renamed from: Q0 */
    View.OnFocusChangeListener f54957Q0;

    /* JADX INFO: renamed from: R */
    private Bitmap[] f54958R;

    /* JADX INFO: renamed from: R0 */
    private List<zgw> f54959R0;

    /* JADX INFO: renamed from: S */
    private Bitmap[] f54960S;

    /* JADX INFO: renamed from: T */
    private Bitmap[] f54961T;

    /* JADX INFO: renamed from: U */
    private boolean f54962U;

    /* JADX INFO: renamed from: V */
    private int f54963V;

    /* JADX INFO: renamed from: W */
    private int f54964W;

    /* JADX INFO: renamed from: a */
    private int f54965a;

    /* JADX INFO: renamed from: b */
    private int f54966b;

    /* JADX INFO: renamed from: c */
    private int f54967c;

    /* JADX INFO: renamed from: d */
    private int f54968d;

    /* JADX INFO: renamed from: e */
    private int f54969e;

    /* JADX INFO: renamed from: f */
    private int f54970f;

    /* JADX INFO: renamed from: g */
    private int f54971g;

    /* JADX INFO: renamed from: h */
    private int f54972h;

    /* JADX INFO: renamed from: i */
    private int f54973i;

    /* JADX INFO: renamed from: j */
    private boolean f54974j;

    /* JADX INFO: renamed from: k */
    private boolean f54975k;

    /* JADX INFO: renamed from: k0 */
    private int f54976k0;

    /* JADX INFO: renamed from: l */
    private int f54977l;

    /* JADX INFO: renamed from: m */
    private int f54978m;

    /* JADX INFO: renamed from: n */
    private int f54979n;

    /* JADX INFO: renamed from: o */
    private int f54980o;

    /* JADX INFO: renamed from: p */
    private int f54981p;

    /* JADX INFO: renamed from: p0 */
    private int f54982p0;

    /* JADX INFO: renamed from: q */
    private int f54983q;

    /* JADX INFO: renamed from: r */
    private int f54984r;

    /* JADX INFO: renamed from: s */
    private int f54985s;

    /* JADX INFO: renamed from: t */
    private int f54986t;

    /* JADX INFO: renamed from: u */
    private boolean f54987u;

    /* JADX INFO: renamed from: v */
    private boolean f54988v;

    /* JADX INFO: renamed from: w */
    private boolean f54989w;

    /* JADX INFO: renamed from: x */
    private int f54990x;

    /* JADX INFO: renamed from: y */
    private int f54991y;

    /* JADX INFO: renamed from: z */
    private int f54992z;

    /* JADX INFO: renamed from: com.rengwuxian.materialedittext.MaterialAutoCompleteTextView$a */
    public class C13189a implements TextWatcher {
        public C13189a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MaterialAutoCompleteTextView.this.m80395j();
            boolean z = MaterialAutoCompleteTextView.this.f54950N;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            if (z) {
                materialAutoCompleteTextView.m80412F();
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
    public class C13190b implements TextWatcher {
        public C13190b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (MaterialAutoCompleteTextView.this.f54974j) {
                int length = editable.length();
                MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
                if (length == 0) {
                    if (materialAutoCompleteTextView.f54936G) {
                        MaterialAutoCompleteTextView.this.f54936G = false;
                        MaterialAutoCompleteTextView.this.getLabelAnimator().reverse();
                        return;
                    }
                    return;
                }
                if (materialAutoCompleteTextView.f54936G) {
                    return;
                }
                MaterialAutoCompleteTextView.this.f54936G = true;
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
    public class ViewOnFocusChangeListenerC13191c implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC13191c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (MaterialAutoCompleteTextView.this.f54974j && MaterialAutoCompleteTextView.this.f54975k) {
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
            View.OnFocusChangeListener onFocusChangeListener = MaterialAutoCompleteTextView.this.f54957Q0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z);
            }
        }
    }

    public MaterialAutoCompleteTextView(Context context) {
        super(context);
        this.f54931D = -1;
        this.f54941I0 = new ArgbEvaluator();
        this.f54943J0 = new Paint(1);
        this.f54945K0 = new TextPaint(1);
        m80403r(context, null);
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: A */
    private boolean m80382A() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: C */
    private void m80383C() {
        ColorStateList colorStateList = this.f54939H0;
        if (colorStateList == null) {
            setHintTextColor((this.f54977l & 16777215) | 1140850688);
        } else {
            setHintTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: D */
    private void m80384D() {
        ColorStateList colorStateList = this.f54937G0;
        if (colorStateList != null) {
            setTextColor(colorStateList);
            return;
        }
        int[][] iArr = {new int[]{R.attr.state_enabled}, AutoCompleteTextView.EMPTY_STATE_SET};
        int i = this.f54977l;
        ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{(i & 16777215) | (-553648128), (i & 16777215) | 1140850688});
        this.f54937G0 = colorStateList2;
        setTextColor(colorStateList2);
    }

    /* JADX INFO: renamed from: E */
    private Bitmap m80385E(Bitmap bitmap) {
        int i;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMax = Math.max(width, height);
        int i2 = this.f54963V;
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
        if (this.f54987u) {
            return (this.f54990x * 5) + m80401p(4);
        }
        return 0;
    }

    private int getBottomTextLeftOffset() {
        return m80382A() ? getCharactersCounterWidth() : getBottomEllipsisWidth();
    }

    private int getBottomTextRightOffset() {
        return m80382A() ? getBottomEllipsisWidth() : getCharactersCounterWidth();
    }

    private int getButtonsCount() {
        return m80411B() ? 1 : 0;
    }

    private String getCharactersCounterText() {
        if (this.f54985s <= 0) {
            if (m80382A()) {
                return this.f54986t + " / " + getText().length();
            }
            return getText().length() + " / " + this.f54986t;
        }
        if (this.f54986t <= 0) {
            if (m80382A()) {
                return Marker.ANY_NON_NULL_MARKER + this.f54985s + " / " + getText().length();
            }
            return getText().length() + " / " + this.f54985s + Marker.ANY_NON_NULL_MARKER;
        }
        if (m80382A()) {
            return this.f54986t + "-" + this.f54985s + " / " + getText().length();
        }
        return getText().length() + " / " + this.f54985s + "-" + this.f54986t;
    }

    private int getCharactersCounterWidth() {
        if (m80402q()) {
            return (int) this.f54945K0.measureText(getCharactersCounterText());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator getLabelAnimator() {
        if (this.f54949M0 == null) {
            this.f54949M0 = ObjectAnimator.ofFloat(this, "floatingLabelFraction", 0.0f, 1.0f);
        }
        this.f54949M0.setDuration(this.f54954P ? 300L : 0L);
        return this.f54949M0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator getLabelFocusAnimator() {
        if (this.f54951N0 == null) {
            this.f54951N0 = ObjectAnimator.ofFloat(this, "focusFraction", 0.0f, 1.0f);
        }
        return this.f54951N0;
    }

    /* JADX INFO: renamed from: i */
    private boolean m80394i() {
        Layout.Alignment alignment;
        int iMax;
        if (getWidth() == 0) {
            return false;
        }
        this.f54945K0.setTextSize(this.f54971g);
        if (this.f54932E == null && this.f54930C == null) {
            iMax = this.f54991y;
        } else {
            if ((getGravity() & 5) == 5 || m80382A()) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = (getGravity() & 3) == 3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            String str = this.f54932E;
            if (str == null) {
                str = this.f54930C;
            }
            StaticLayout staticLayout = new StaticLayout(str, this.f54945K0, (((getWidth() - getBottomTextLeftOffset()) - getBottomTextRightOffset()) - getPaddingLeft()) - getPaddingRight(), alignment2, 1.0f, 0.0f, true);
            this.f54947L0 = staticLayout;
            iMax = Math.max(staticLayout.getLineCount(), this.f54992z);
        }
        float f = iMax;
        if (this.f54929B != f) {
            m80399n(f).start();
        }
        this.f54929B = f;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m80395j() {
        int i;
        boolean z = true;
        if (!m80402q()) {
            this.f54952O = true;
            return;
        }
        Editable text = getText();
        int length = text == null ? 0 : text.length();
        if (length < this.f54985s || ((i = this.f54986t) > 0 && length > i)) {
            z = false;
        }
        this.f54952O = z;
    }

    /* JADX INFO: renamed from: k */
    private void m80396k() {
        int buttonsCount = this.f54964W * getButtonsCount();
        int i = 0;
        if (!m80382A()) {
            i = buttonsCount;
            buttonsCount = 0;
        }
        super.setPadding(this.f54980o + this.f54967c + buttonsCount, this.f54978m + this.f54965a, this.f54981p + this.f54968d + i, this.f54979n + this.f54966b);
    }

    /* JADX INFO: renamed from: l */
    private Bitmap[] m80397l(@DrawableRes int i) {
        if (i == -1) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), i, options);
        int iMax = Math.max(options.outWidth, options.outHeight);
        int i2 = this.f54963V;
        options.inSampleSize = iMax > i2 ? iMax / i2 : 1;
        options.inJustDecodeBounds = false;
        return m80398m(BitmapFactory.decodeResource(getResources(), i, options));
    }

    /* JADX INFO: renamed from: m */
    private Bitmap[] m80398m(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap[] bitmapArr = new Bitmap[4];
        Bitmap bitmapM80385E = m80385E(bitmap);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        bitmapArr[0] = bitmapM80385E.copy(config, true);
        Canvas canvas = new Canvas(bitmapArr[0]);
        int i = this.f54977l;
        int i2 = (ie5.m135658a(i) ? RoundedDrawable.DEFAULT_BORDER_COLOR : -1979711488) | (i & 16777215);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        canvas.drawColor(i2, mode);
        bitmapArr[1] = bitmapM80385E.copy(config, true);
        new Canvas(bitmapArr[1]).drawColor(this.f54983q, mode);
        bitmapArr[2] = bitmapM80385E.copy(config, true);
        Canvas canvas2 = new Canvas(bitmapArr[2]);
        int i3 = this.f54977l;
        canvas2.drawColor((ie5.m135658a(i3) ? 1275068416 : 1107296256) | (16777215 & i3), mode);
        bitmapArr[3] = bitmapM80385E.copy(config, true);
        new Canvas(bitmapArr[3]).drawColor(this.f54984r, mode);
        return bitmapArr;
    }

    /* JADX INFO: renamed from: n */
    private ObjectAnimator m80399n(float f) {
        ObjectAnimator objectAnimator = this.f54953O0;
        if (objectAnimator == null) {
            this.f54953O0 = ObjectAnimator.ofFloat(this, "currentBottomLines", f);
        } else {
            objectAnimator.cancel();
            this.f54953O0.setFloatValues(f);
        }
        return this.f54953O0;
    }

    /* JADX INFO: renamed from: o */
    private Typeface m80400o(@NonNull String str) {
        return Typeface.createFromAsset(getContext().getResources().getAssets(), str);
    }

    /* JADX INFO: renamed from: p */
    private int m80401p(int i) {
        return vtd.m199996a(getContext(), i);
    }

    /* JADX INFO: renamed from: q */
    private boolean m80402q() {
        return this.f54985s > 0 || this.f54986t > 0;
    }

    /* JADX INFO: renamed from: r */
    private void m80403r(Context context, AttributeSet attributeSet) {
        int i;
        this.f54963V = m80401p(32);
        this.f54964W = m80401p(48);
        this.f54976k0 = m80401p(32);
        this.f54973i = getResources().getDimensionPixelSize(c2c0.f78349d);
        this.f54990x = getResources().getDimensionPixelSize(c2c0.f78346a);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q9c0.f153398a);
        this.f54937G0 = typedArrayObtainStyledAttributes.getColorStateList(q9c0.f153394E);
        this.f54939H0 = typedArrayObtainStyledAttributes.getColorStateList(q9c0.f153395F);
        this.f54977l = typedArrayObtainStyledAttributes.getColor(q9c0.f153401d, RoundedDrawable.DEFAULT_BORDER_COLOR);
        TypedValue typedValue = new TypedValue();
        try {
            try {
                context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                i = typedValue.data;
            } catch (Exception unused) {
                i = this.f54977l;
            }
        } catch (Exception unused2) {
            int identifier = getResources().getIdentifier("colorPrimary", "attr", getContext().getPackageName());
            if (identifier == 0) {
                throw new RuntimeException("colorPrimary not found");
            }
            context.getTheme().resolveAttribute(identifier, typedValue, true);
            i = typedValue.data;
        }
        this.f54983q = typedArrayObtainStyledAttributes.getColor(q9c0.f153392C, i);
        setFloatingLabelInternal(typedArrayObtainStyledAttributes.getInt(q9c0.f153407j, 0));
        this.f54984r = typedArrayObtainStyledAttributes.getColor(q9c0.f153406i, Color.parseColor("#e7492E"));
        this.f54985s = typedArrayObtainStyledAttributes.getInt(q9c0.f153391B, 0);
        this.f54986t = typedArrayObtainStyledAttributes.getInt(q9c0.f153423z, 0);
        this.f54987u = typedArrayObtainStyledAttributes.getBoolean(q9c0.f153393D, false);
        this.f54930C = typedArrayObtainStyledAttributes.getString(q9c0.f153414q);
        this.f54931D = typedArrayObtainStyledAttributes.getColor(q9c0.f153416s, -1);
        this.f54992z = typedArrayObtainStyledAttributes.getInt(q9c0.f153390A, 0);
        String string = typedArrayObtainStyledAttributes.getString(q9c0.f153399b);
        if (string != null && !isInEditMode()) {
            Typeface typefaceM80400o = m80400o(string);
            this.f54940I = typefaceM80400o;
            this.f54945K0.setTypeface(typefaceM80400o);
        }
        String string2 = typedArrayObtainStyledAttributes.getString(q9c0.f153396G);
        if (string2 != null && !isInEditMode()) {
            Typeface typefaceM80400o2 = m80400o(string2);
            this.f54942J = typefaceM80400o2;
            setTypeface(typefaceM80400o2);
        }
        String string3 = typedArrayObtainStyledAttributes.getString(q9c0.f153411n);
        this.f54944K = string3;
        if (string3 == null) {
            this.f54944K = getHint();
        }
        this.f54972h = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f153410m, this.f54973i);
        this.f54969e = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f153413p, getResources().getDimensionPixelSize(c2c0.f78348c));
        this.f54970f = typedArrayObtainStyledAttributes.getColor(q9c0.f153412o, -1);
        this.f54954P = typedArrayObtainStyledAttributes.getBoolean(q9c0.f153409l, true);
        this.f54971g = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f153403f, getResources().getDimensionPixelSize(c2c0.f78347b));
        this.f54946L = typedArrayObtainStyledAttributes.getBoolean(q9c0.f153417t, false);
        this.f54948M = typedArrayObtainStyledAttributes.getColor(q9c0.f153397H, -1);
        this.f54950N = typedArrayObtainStyledAttributes.getBoolean(q9c0.f153400c, false);
        this.f54956Q = m80397l(typedArrayObtainStyledAttributes.getResourceId(q9c0.f153419v, -1));
        this.f54958R = m80397l(typedArrayObtainStyledAttributes.getResourceId(q9c0.f153421x, -1));
        this.f54962U = typedArrayObtainStyledAttributes.getBoolean(q9c0.f153404g, false);
        this.f54960S = m80397l(k3c0.f120813a);
        this.f54961T = m80397l(k3c0.f120814b);
        this.f54982p0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f153420w, m80401p(16));
        this.f54988v = typedArrayObtainStyledAttributes.getBoolean(q9c0.f153408k, false);
        this.f54989w = typedArrayObtainStyledAttributes.getBoolean(q9c0.f153415r, false);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom});
        int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
        this.f54980o = typedArrayObtainStyledAttributes2.getDimensionPixelSize(1, dimensionPixelSize);
        this.f54978m = typedArrayObtainStyledAttributes2.getDimensionPixelSize(2, dimensionPixelSize);
        this.f54981p = typedArrayObtainStyledAttributes2.getDimensionPixelSize(3, dimensionPixelSize);
        this.f54979n = typedArrayObtainStyledAttributes2.getDimensionPixelSize(4, dimensionPixelSize);
        typedArrayObtainStyledAttributes2.recycle();
        setBackground(null);
        if (this.f54987u) {
            TransformationMethod transformationMethod = getTransformationMethod();
            setSingleLine();
            setTransformationMethod(transformationMethod);
        }
        m80405t();
        m80406u();
        m80407v();
        m80404s();
        m80408w();
        m80395j();
    }

    /* JADX INFO: renamed from: s */
    private void m80404s() {
        addTextChangedListener(new C13190b());
        ViewOnFocusChangeListenerC13191c viewOnFocusChangeListenerC13191c = new ViewOnFocusChangeListenerC13191c();
        this.f54955P0 = viewOnFocusChangeListenerC13191c;
        super.setOnFocusChangeListener(viewOnFocusChangeListenerC13191c);
    }

    private void setFloatingLabelInternal(int i) {
        if (i == 1) {
            this.f54974j = true;
            this.f54975k = false;
        } else if (i != 2) {
            this.f54974j = false;
            this.f54975k = false;
        } else {
            this.f54974j = true;
            this.f54975k = true;
        }
    }

    /* JADX INFO: renamed from: t */
    private void m80405t() {
        int i = 1;
        boolean z = this.f54985s > 0 || this.f54986t > 0 || this.f54987u || this.f54932E != null || this.f54930C != null;
        int i2 = this.f54992z;
        if (i2 > 0) {
            i = i2;
        } else if (!z) {
            i = 0;
        }
        this.f54991y = i;
        this.f54928A = i;
    }

    /* JADX INFO: renamed from: u */
    private void m80406u() {
        this.f54965a = this.f54974j ? this.f54969e + this.f54972h : this.f54972h;
        this.f54945K0.setTextSize(this.f54971g);
        Paint.FontMetrics fontMetrics = this.f54945K0.getFontMetrics();
        int i = (int) ((fontMetrics.descent - fontMetrics.ascent) * this.f54928A);
        boolean z = this.f54946L;
        int i2 = this.f54973i;
        if (!z) {
            i2 *= 2;
        }
        this.f54966b = i + i2;
        int i3 = 0;
        this.f54967c = this.f54956Q == null ? 0 : this.f54964W + this.f54982p0;
        if (this.f54958R != null) {
            i3 = this.f54982p0 + this.f54964W;
        }
        this.f54968d = i3;
        m80396k();
    }

    /* JADX INFO: renamed from: v */
    private void m80407v() {
        if (TextUtils.isEmpty(getText())) {
            m80383C();
        } else {
            Editable text = getText();
            setText((CharSequence) null);
            m80383C();
            setText(text);
            setSelection(text.length());
            this.f54934F = 1.0f;
            this.f54936G = true;
        }
        m80384D();
    }

    /* JADX INFO: renamed from: w */
    private void m80408w() {
        addTextChangedListener(new C13189a());
    }

    /* JADX INFO: renamed from: x */
    private boolean m80409x(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int scrollX = getScrollX() + (this.f54956Q == null ? 0 : this.f54964W + this.f54982p0);
        int scrollX2 = getScrollX() + (this.f54958R == null ? getWidth() : (getWidth() - this.f54964W) - this.f54982p0);
        if (!m80382A()) {
            scrollX = scrollX2 - this.f54964W;
        }
        int scrollY = ((getScrollY() + getHeight()) - getPaddingBottom()) + this.f54973i;
        int i = this.f54976k0;
        int i2 = scrollY - i;
        return x >= ((float) scrollX) && x < ((float) (scrollX + this.f54964W)) && y >= ((float) i2) && y < ((float) (i2 + i));
    }

    /* JADX INFO: renamed from: z */
    private boolean m80410z() {
        return this.f54932E == null && m80413y();
    }

    /* JADX INFO: renamed from: B */
    public boolean m80411B() {
        return this.f54962U;
    }

    /* JADX INFO: renamed from: F */
    public boolean m80412F() {
        List<zgw> list = this.f54959R0;
        if (list == null || list.isEmpty()) {
            return true;
        }
        Editable text = getText();
        boolean z = text.length() == 0;
        boolean z2 = true;
        for (zgw zgwVar : this.f54959R0) {
            z2 = z2 && zgwVar.m218723b(text, z);
            if (!z2) {
                setError(zgwVar.m218722a());
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
        return this.f54940I;
    }

    public int getBottomTextSize() {
        return this.f54971g;
    }

    public float getCurrentBottomLines() {
        return this.f54928A;
    }

    @Override // android.widget.TextView
    public CharSequence getError() {
        return this.f54932E;
    }

    public int getErrorColor() {
        return this.f54984r;
    }

    public float getFloatingLabelFraction() {
        return this.f54934F;
    }

    public int getFloatingLabelPadding() {
        return this.f54972h;
    }

    public CharSequence getFloatingLabelText() {
        return this.f54944K;
    }

    public int getFloatingLabelTextColor() {
        return this.f54970f;
    }

    public int getFloatingLabelTextSize() {
        return this.f54969e;
    }

    public float getFocusFraction() {
        return this.f54938H;
    }

    public String getHelperText() {
        return this.f54930C;
    }

    public int getHelperTextColor() {
        return this.f54931D;
    }

    public int getInnerPaddingBottom() {
        return this.f54979n;
    }

    public int getInnerPaddingLeft() {
        return this.f54980o;
    }

    public int getInnerPaddingRight() {
        return this.f54981p;
    }

    public int getInnerPaddingTop() {
        return this.f54978m;
    }

    public int getMaxCharacters() {
        return this.f54986t;
    }

    public int getMinBottomTextLines() {
        return this.f54992z;
    }

    public int getMinCharacters() {
        return this.f54985s;
    }

    public int getUnderlineColor() {
        return this.f54948M;
    }

    @Nullable
    public List<zgw> getValidators() {
        return this.f54959R0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int innerPaddingLeft;
        int i;
        char c;
        char c2;
        Canvas canvas2 = canvas;
        int scrollX = getScrollX() + (this.f54956Q == null ? 0 : this.f54964W + this.f54982p0);
        int scrollX2 = getScrollX() + (this.f54958R == null ? getWidth() : (getWidth() - this.f54964W) - this.f54982p0);
        int scrollY = (getScrollY() + getHeight()) - getPaddingBottom();
        this.f54943J0.setAlpha(255);
        Bitmap[] bitmapArr = this.f54956Q;
        if (bitmapArr != null) {
            if (!m80410z()) {
                c2 = 3;
            } else if (isEnabled()) {
                c2 = hasFocus() ? (char) 1 : (char) 0;
            } else {
                c2 = 2;
            }
            Bitmap bitmap = bitmapArr[c2];
            int i2 = scrollX - this.f54982p0;
            int i3 = this.f54964W;
            int width = (i2 - i3) + ((i3 - bitmap.getWidth()) / 2);
            int i4 = this.f54973i + scrollY;
            int i5 = this.f54976k0;
            canvas2.drawBitmap(bitmap, width, (i4 - i5) + ((i5 - bitmap.getHeight()) / 2), this.f54943J0);
        }
        Bitmap[] bitmapArr2 = this.f54958R;
        if (bitmapArr2 != null) {
            if (!m80410z()) {
                c = 3;
            } else if (isEnabled()) {
                c = hasFocus() ? (char) 1 : (char) 0;
            } else {
                c = 2;
            }
            Bitmap bitmap2 = bitmapArr2[c];
            int width2 = this.f54982p0 + scrollX2 + ((this.f54964W - bitmap2.getWidth()) / 2);
            int i6 = this.f54973i + scrollY;
            int i7 = this.f54976k0;
            canvas2.drawBitmap(bitmap2, width2, (i6 - i7) + ((i7 - bitmap2.getHeight()) / 2), this.f54943J0);
        }
        if (hasFocus() && this.f54962U) {
            this.f54943J0.setAlpha(255);
            int i8 = m80382A() ? scrollX : scrollX2 - this.f54964W;
            Bitmap bitmap3 = TextUtils.isEmpty(getText()) ? this.f54961T[0] : this.f54960S[0];
            int width3 = i8 + ((this.f54964W - bitmap3.getWidth()) / 2);
            int i9 = this.f54973i + scrollY;
            int i10 = this.f54976k0;
            canvas2.drawBitmap(bitmap3, width3, (i9 - i10) + ((i10 - bitmap3.getHeight()) / 2), this.f54943J0);
        }
        if (!this.f54946L) {
            int i11 = scrollY + this.f54973i;
            if (m80410z()) {
                if (isEnabled()) {
                    boolean zHasFocus = hasFocus();
                    Paint paint = this.f54943J0;
                    if (zHasFocus) {
                        paint.setColor(this.f54983q);
                        canvas2 = canvas;
                        canvas2.drawRect(scrollX, i11, scrollX2, m80401p(2) + i11, this.f54943J0);
                    } else {
                        int i12 = this.f54948M;
                        if (i12 == -1) {
                            i12 = (this.f54977l & 16777215) | 503316480;
                        }
                        paint.setColor(i12);
                        canvas2 = canvas;
                        canvas2.drawRect(scrollX, i11, scrollX2, m80401p(1) + i11, this.f54943J0);
                    }
                } else {
                    Paint paint2 = this.f54943J0;
                    int i13 = this.f54948M;
                    if (i13 == -1) {
                        i13 = (this.f54977l & 16777215) | 1140850688;
                    }
                    paint2.setColor(i13);
                    float fM80401p = m80401p(1);
                    float f = 0.0f;
                    while (f < getWidth()) {
                        float f2 = scrollX + f;
                        float f3 = fM80401p;
                        canvas.drawRect(f2, i11, f2 + fM80401p, m80401p(1) + i11, this.f54943J0);
                        f += 3.0f * f3;
                        fM80401p = f3;
                    }
                }
                scrollY = i11;
            } else {
                this.f54943J0.setColor(this.f54984r);
                canvas2.drawRect(scrollX, i11, scrollX2, m80401p(2) + i11, this.f54943J0);
            }
            canvas2 = canvas;
            scrollY = i11;
        }
        this.f54945K0.setTextSize(this.f54971g);
        Paint.FontMetrics fontMetrics = this.f54945K0.getFontMetrics();
        float f4 = fontMetrics.ascent;
        float f5 = fontMetrics.descent;
        float f6 = (-f4) - f5;
        float f7 = this.f54971g + f4 + f5;
        if ((hasFocus() && m80402q()) || !m80413y()) {
            this.f54945K0.setColor(m80413y() ? (this.f54977l & 16777215) | 1140850688 : this.f54984r);
            String charactersCounterText = getCharactersCounterText();
            canvas2.drawText(charactersCounterText, m80382A() ? scrollX : scrollX2 - this.f54945K0.measureText(charactersCounterText), this.f54973i + scrollY + f6, this.f54945K0);
        }
        if (this.f54947L0 != null && (this.f54932E != null || ((this.f54989w || hasFocus()) && !TextUtils.isEmpty(this.f54930C)))) {
            TextPaint textPaint = this.f54945K0;
            if (this.f54932E != null) {
                i = this.f54984r;
            } else {
                i = this.f54931D;
                if (i == -1) {
                    i = (this.f54977l & 16777215) | 1140850688;
                }
            }
            textPaint.setColor(i);
            canvas2.save();
            canvas2.translate(getBottomTextLeftOffset() + scrollX, (this.f54973i + scrollY) - f7);
            this.f54947L0.draw(canvas2);
            canvas2.restore();
        }
        if (this.f54974j && !TextUtils.isEmpty(this.f54944K)) {
            this.f54945K0.setTextSize(this.f54969e);
            TextPaint textPaint2 = this.f54945K0;
            ArgbEvaluator argbEvaluator = this.f54941I0;
            float f8 = this.f54938H;
            int i14 = this.f54970f;
            if (i14 == -1) {
                i14 = (16777215 & this.f54977l) | 1140850688;
            }
            textPaint2.setColor(((Integer) argbEvaluator.evaluate(f8, Integer.valueOf(i14), Integer.valueOf(this.f54983q))).intValue());
            float fMeasureText = this.f54945K0.measureText(this.f54944K.toString());
            if ((getGravity() & 5) == 5 || m80382A()) {
                innerPaddingLeft = (int) (scrollX2 - fMeasureText);
            } else {
                innerPaddingLeft = (getGravity() & 3) == 3 ? scrollX : ((int) (getInnerPaddingLeft() + ((((getWidth() - getInnerPaddingLeft()) - getInnerPaddingRight()) - fMeasureText) / 2.0f))) + scrollX;
            }
            int i15 = this.f54978m + this.f54969e;
            int i16 = this.f54972h;
            float f9 = i15 + i16;
            float f10 = i16;
            boolean z = this.f54988v;
            int i17 = (int) (f9 - (f10 * (z ? 1.0f : this.f54934F)));
            this.f54945K0.setAlpha((int) ((z ? 1.0f : this.f54934F) * 255.0f * (this.f54970f == -1 ? (this.f54938H * 0.74f) + 0.26f : 1.0f)));
            canvas2.drawText(this.f54944K.toString(), innerPaddingLeft, i17, this.f54945K0);
        }
        if (hasFocus() && this.f54987u && getScrollX() != 0) {
            this.f54943J0.setColor(this.f54983q);
            float f11 = scrollY + this.f54973i;
            if (m80382A()) {
                scrollX = scrollX2;
            }
            int i18 = m80382A() ? -1 : 1;
            int i19 = this.f54990x;
            canvas2.drawCircle(((i18 * i19) / 2) + scrollX, (i19 / 2) + f11, i19 / 2, this.f54943J0);
            int i20 = this.f54990x;
            canvas2.drawCircle((((i18 * i20) * 5) / 2) + scrollX, (i20 / 2) + f11, i20 / 2, this.f54943J0);
            int i21 = this.f54990x;
            canvas2.drawCircle(scrollX + (((i18 * i21) * 9) / 2), f11 + (i21 / 2), i21 / 2, this.f54943J0);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m80394i();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f54987u && getScrollX() > 0 && motionEvent.getAction() == 0 && motionEvent.getX() < m80401p(20) && motionEvent.getY() > (getHeight() - this.f54966b) - this.f54979n && motionEvent.getY() < getHeight() - this.f54979n) {
            setSelection(0);
            return false;
        }
        if (hasFocus() && this.f54962U) {
            int action = motionEvent.getAction();
            if (action == 0) {
                if (m80409x(motionEvent)) {
                    this.f54933E0 = true;
                    this.f54935F0 = true;
                }
                return true;
            }
            if (action == 1) {
                if (this.f54935F0) {
                    if (!TextUtils.isEmpty(getText())) {
                        setText((CharSequence) null);
                    }
                    this.f54935F0 = false;
                }
                if (this.f54933E0) {
                    this.f54933E0 = false;
                    return true;
                }
                this.f54933E0 = false;
            } else if (action == 2) {
                if (this.f54935F0 && !m80409x(motionEvent)) {
                    this.f54935F0 = false;
                }
                if (this.f54933E0) {
                    return true;
                }
            } else if (action == 3) {
                this.f54933E0 = false;
                this.f54935F0 = false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentTypeface(Typeface typeface) {
        this.f54940I = typeface;
        this.f54945K0.setTypeface(typeface);
        postInvalidate();
    }

    public void setAutoValidate(boolean z) {
        this.f54950N = z;
        if (z) {
            m80412F();
        }
    }

    public void setBaseColor(int i) {
        if (this.f54977l != i) {
            this.f54977l = i;
        }
        m80407v();
        postInvalidate();
    }

    public void setBottomTextSize(int i) {
        this.f54971g = i;
        m80406u();
    }

    public void setCurrentBottomLines(float f) {
        this.f54928A = f;
        m80406u();
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        this.f54932E = charSequence == null ? null : charSequence.toString();
        if (m80394i()) {
            postInvalidate();
        }
    }

    public void setErrorColor(int i) {
        this.f54984r = i;
        postInvalidate();
    }

    public void setFloatingLabel(int i) {
        setFloatingLabelInternal(i);
        m80406u();
    }

    public void setFloatingLabelAlwaysShown(boolean z) {
        this.f54988v = z;
        invalidate();
    }

    public void setFloatingLabelAnimating(boolean z) {
        this.f54954P = z;
    }

    public void setFloatingLabelFraction(float f) {
        this.f54934F = f;
        invalidate();
    }

    public void setFloatingLabelPadding(int i) {
        this.f54972h = i;
        postInvalidate();
    }

    public void setFloatingLabelText(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getHint();
        }
        this.f54944K = charSequence;
        postInvalidate();
    }

    public void setFloatingLabelTextColor(int i) {
        this.f54970f = i;
        postInvalidate();
    }

    public void setFloatingLabelTextSize(int i) {
        this.f54969e = i;
        m80406u();
    }

    public void setFocusFraction(float f) {
        this.f54938H = f;
        invalidate();
    }

    public void setHelperText(CharSequence charSequence) {
        this.f54930C = charSequence == null ? null : charSequence.toString();
        if (m80394i()) {
            postInvalidate();
        }
    }

    public void setHelperTextAlwaysShown(boolean z) {
        this.f54989w = z;
        invalidate();
    }

    public void setHelperTextColor(int i) {
        this.f54931D = i;
        postInvalidate();
    }

    public void setHideUnderline(boolean z) {
        this.f54946L = z;
        m80406u();
        postInvalidate();
    }

    public void setIconLeft(@DrawableRes int i) {
        this.f54956Q = m80397l(i);
        m80406u();
    }

    public void setIconRight(@DrawableRes int i) {
        this.f54958R = m80397l(i);
        m80406u();
    }

    public void setMaxCharacters(int i) {
        this.f54986t = i;
        m80405t();
        m80406u();
        postInvalidate();
    }

    public void setMetHintTextColor(int i) {
        this.f54939H0 = ColorStateList.valueOf(i);
        m80383C();
    }

    public void setMetTextColor(int i) {
        this.f54937G0 = ColorStateList.valueOf(i);
        m80384D();
    }

    public void setMinBottomTextLines(int i) {
        this.f54992z = i;
        m80405t();
        m80406u();
        postInvalidate();
    }

    public void setMinCharacters(int i) {
        this.f54985s = i;
        m80405t();
        m80406u();
        postInvalidate();
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        if (this.f54955P0 == null) {
            super.setOnFocusChangeListener(onFocusChangeListener);
        } else {
            this.f54957Q0 = onFocusChangeListener;
        }
    }

    @Override // android.widget.TextView, android.view.View
    @Deprecated
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    public void setPrimaryColor(int i) {
        this.f54983q = i;
        postInvalidate();
    }

    public void setShowClearButton(boolean z) {
        this.f54962U = z;
        m80396k();
    }

    public void setSingleLineEllipsis(boolean z) {
        this.f54987u = z;
        m80405t();
        m80406u();
        postInvalidate();
    }

    public void setUnderlineColor(int i) {
        this.f54948M = i;
        postInvalidate();
    }

    /* JADX INFO: renamed from: y */
    public boolean m80413y() {
        return this.f54952O;
    }

    public void setIconLeft(Bitmap bitmap) {
        this.f54956Q = m80398m(bitmap);
        m80406u();
    }

    public void setIconRight(Bitmap bitmap) {
        this.f54958R = m80398m(bitmap);
        m80406u();
    }

    public void setMetHintTextColor(ColorStateList colorStateList) {
        this.f54939H0 = colorStateList;
        m80383C();
    }

    public void setMetTextColor(ColorStateList colorStateList) {
        this.f54937G0 = colorStateList;
        m80384D();
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54931D = -1;
        this.f54941I0 = new ArgbEvaluator();
        this.f54943J0 = new Paint(1);
        this.f54945K0 = new TextPaint(1);
        m80403r(context, attributeSet);
    }

    @TargetApi(21)
    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54931D = -1;
        this.f54941I0 = new ArgbEvaluator();
        this.f54943J0 = new Paint(1);
        this.f54945K0 = new TextPaint(1);
        m80403r(context, attributeSet);
    }
}
