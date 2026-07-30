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
public class MaterialMultiAutoCompleteTextView extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: A */
    private float f55918A;

    /* JADX INFO: renamed from: B */
    private float f55919B;

    /* JADX INFO: renamed from: C */
    private String f55920C;

    /* JADX INFO: renamed from: D */
    private int f55921D;

    /* JADX INFO: renamed from: E */
    private String f55922E;

    /* JADX INFO: renamed from: E0 */
    private boolean f55923E0;

    /* JADX INFO: renamed from: F */
    private float f55924F;

    /* JADX INFO: renamed from: F0 */
    private boolean f55925F0;

    /* JADX INFO: renamed from: G */
    private boolean f55926G;

    /* JADX INFO: renamed from: G0 */
    private ColorStateList f55927G0;

    /* JADX INFO: renamed from: H */
    private float f55928H;

    /* JADX INFO: renamed from: H0 */
    private ColorStateList f55929H0;

    /* JADX INFO: renamed from: I */
    private Typeface f55930I;

    /* JADX INFO: renamed from: I0 */
    private ArgbEvaluator f55931I0;

    /* JADX INFO: renamed from: J */
    private Typeface f55932J;

    /* JADX INFO: renamed from: J0 */
    Paint f55933J0;

    /* JADX INFO: renamed from: K */
    private CharSequence f55934K;

    /* JADX INFO: renamed from: K0 */
    TextPaint f55935K0;

    /* JADX INFO: renamed from: L */
    private boolean f55936L;

    /* JADX INFO: renamed from: L0 */
    StaticLayout f55937L0;

    /* JADX INFO: renamed from: M */
    private int f55938M;

    /* JADX INFO: renamed from: M0 */
    ObjectAnimator f55939M0;

    /* JADX INFO: renamed from: N */
    private boolean f55940N;

    /* JADX INFO: renamed from: N0 */
    ObjectAnimator f55941N0;

    /* JADX INFO: renamed from: O */
    private boolean f55942O;

    /* JADX INFO: renamed from: O0 */
    ObjectAnimator f55943O0;

    /* JADX INFO: renamed from: P */
    private boolean f55944P;

    /* JADX INFO: renamed from: P0 */
    View.OnFocusChangeListener f55945P0;

    /* JADX INFO: renamed from: Q */
    private Bitmap[] f55946Q;

    /* JADX INFO: renamed from: Q0 */
    View.OnFocusChangeListener f55947Q0;

    /* JADX INFO: renamed from: R */
    private Bitmap[] f55948R;

    /* JADX INFO: renamed from: R0 */
    private List<yiw> f55949R0;

    /* JADX INFO: renamed from: S */
    private Bitmap[] f55950S;

    /* JADX INFO: renamed from: T */
    private Bitmap[] f55951T;

    /* JADX INFO: renamed from: U */
    private boolean f55952U;

    /* JADX INFO: renamed from: V */
    private int f55953V;

    /* JADX INFO: renamed from: W */
    private int f55954W;

    /* JADX INFO: renamed from: a */
    private int f55955a;

    /* JADX INFO: renamed from: b */
    private int f55956b;

    /* JADX INFO: renamed from: c */
    private int f55957c;

    /* JADX INFO: renamed from: d */
    private int f55958d;

    /* JADX INFO: renamed from: e */
    private int f55959e;

    /* JADX INFO: renamed from: f */
    private int f55960f;

    /* JADX INFO: renamed from: g */
    private int f55961g;

    /* JADX INFO: renamed from: h */
    private int f55962h;

    /* JADX INFO: renamed from: i */
    private int f55963i;

    /* JADX INFO: renamed from: j */
    private boolean f55964j;

    /* JADX INFO: renamed from: k */
    private boolean f55965k;

    /* JADX INFO: renamed from: k0 */
    private int f55966k0;

    /* JADX INFO: renamed from: l */
    private int f55967l;

    /* JADX INFO: renamed from: m */
    private int f55968m;

    /* JADX INFO: renamed from: n */
    private int f55969n;

    /* JADX INFO: renamed from: o */
    private int f55970o;

    /* JADX INFO: renamed from: p */
    private int f55971p;

    /* JADX INFO: renamed from: p0 */
    private int f55972p0;

    /* JADX INFO: renamed from: q */
    private int f55973q;

    /* JADX INFO: renamed from: r */
    private int f55974r;

    /* JADX INFO: renamed from: s */
    private int f55975s;

    /* JADX INFO: renamed from: t */
    private int f55976t;

    /* JADX INFO: renamed from: u */
    private boolean f55977u;

    /* JADX INFO: renamed from: v */
    private boolean f55978v;

    /* JADX INFO: renamed from: w */
    private boolean f55979w;

    /* JADX INFO: renamed from: x */
    private int f55980x;

    /* JADX INFO: renamed from: y */
    private int f55981y;

    /* JADX INFO: renamed from: z */
    private int f55982z;

    /* JADX INFO: renamed from: com.rengwuxian.materialedittext.MaterialMultiAutoCompleteTextView$a */
    public class C13358a implements TextWatcher {
        public C13358a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MaterialMultiAutoCompleteTextView.this.m81642j();
            boolean z = MaterialMultiAutoCompleteTextView.this.f55940N;
            MaterialMultiAutoCompleteTextView materialMultiAutoCompleteTextView = MaterialMultiAutoCompleteTextView.this;
            if (z) {
                materialMultiAutoCompleteTextView.m81659F();
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
    public class C13359b implements TextWatcher {
        public C13359b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (MaterialMultiAutoCompleteTextView.this.f55964j) {
                int length = editable.length();
                MaterialMultiAutoCompleteTextView materialMultiAutoCompleteTextView = MaterialMultiAutoCompleteTextView.this;
                if (length == 0) {
                    if (materialMultiAutoCompleteTextView.f55926G) {
                        MaterialMultiAutoCompleteTextView.this.f55926G = false;
                        MaterialMultiAutoCompleteTextView.this.getLabelAnimator().reverse();
                        return;
                    }
                    return;
                }
                if (materialMultiAutoCompleteTextView.f55926G) {
                    return;
                }
                MaterialMultiAutoCompleteTextView.this.f55926G = true;
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
    public class ViewOnFocusChangeListenerC13360c implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC13360c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (MaterialMultiAutoCompleteTextView.this.f55964j && MaterialMultiAutoCompleteTextView.this.f55965k) {
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
            View.OnFocusChangeListener onFocusChangeListener = MaterialMultiAutoCompleteTextView.this.f55947Q0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z);
            }
        }
    }

    public MaterialMultiAutoCompleteTextView(Context context) {
        super(context);
        this.f55921D = -1;
        this.f55931I0 = new ArgbEvaluator();
        this.f55933J0 = new Paint(1);
        this.f55935K0 = new TextPaint(1);
        m81650r(context, null);
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: A */
    private boolean m81629A() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: C */
    private void m81630C() {
        ColorStateList colorStateList = this.f55929H0;
        if (colorStateList == null) {
            setHintTextColor((this.f55967l & 16777215) | 1140850688);
        } else {
            setHintTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: D */
    private void m81631D() {
        ColorStateList colorStateList = this.f55927G0;
        if (colorStateList != null) {
            setTextColor(colorStateList);
            return;
        }
        int[][] iArr = {new int[]{R.attr.state_enabled}, MultiAutoCompleteTextView.EMPTY_STATE_SET};
        int i = this.f55967l;
        ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{(i & 16777215) | (-553648128), (i & 16777215) | 1140850688});
        this.f55927G0 = colorStateList2;
        setTextColor(colorStateList2);
    }

    /* JADX INFO: renamed from: E */
    private Bitmap m81632E(Bitmap bitmap) {
        int i;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMax = Math.max(width, height);
        int i2 = this.f55953V;
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
        if (this.f55977u) {
            return (this.f55980x * 5) + m81648p(4);
        }
        return 0;
    }

    private int getBottomTextLeftOffset() {
        return m81629A() ? getCharactersCounterWidth() : getBottomEllipsisWidth();
    }

    private int getBottomTextRightOffset() {
        return m81629A() ? getBottomEllipsisWidth() : getCharactersCounterWidth();
    }

    private int getButtonsCount() {
        return m81658B() ? 1 : 0;
    }

    private String getCharactersCounterText() {
        if (this.f55975s <= 0) {
            if (m81629A()) {
                return this.f55976t + " / " + getText().length();
            }
            return getText().length() + " / " + this.f55976t;
        }
        if (this.f55976t <= 0) {
            if (m81629A()) {
                return Marker.ANY_NON_NULL_MARKER + this.f55975s + " / " + getText().length();
            }
            return getText().length() + " / " + this.f55975s + Marker.ANY_NON_NULL_MARKER;
        }
        if (m81629A()) {
            return this.f55976t + "-" + this.f55975s + " / " + getText().length();
        }
        return getText().length() + " / " + this.f55975s + "-" + this.f55976t;
    }

    private int getCharactersCounterWidth() {
        if (m81649q()) {
            return (int) this.f55935K0.measureText(getCharactersCounterText());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator getLabelAnimator() {
        if (this.f55939M0 == null) {
            this.f55939M0 = ObjectAnimator.ofFloat(this, "floatingLabelFraction", 0.0f, 1.0f);
        }
        this.f55939M0.setDuration(this.f55944P ? 300L : 0L);
        return this.f55939M0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator getLabelFocusAnimator() {
        if (this.f55941N0 == null) {
            this.f55941N0 = ObjectAnimator.ofFloat(this, "focusFraction", 0.0f, 1.0f);
        }
        return this.f55941N0;
    }

    /* JADX INFO: renamed from: i */
    private boolean m81641i() {
        Layout.Alignment alignment;
        int iMax;
        if (getWidth() == 0) {
            return false;
        }
        this.f55935K0.setTextSize(this.f55961g);
        if (this.f55922E == null && this.f55920C == null) {
            iMax = this.f55981y;
        } else {
            if ((getGravity() & 5) == 5 || m81629A()) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = (getGravity() & 3) == 3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            String str = this.f55922E;
            if (str == null) {
                str = this.f55920C;
            }
            StaticLayout staticLayout = new StaticLayout(str, this.f55935K0, (((getWidth() - getBottomTextLeftOffset()) - getBottomTextRightOffset()) - getPaddingLeft()) - getPaddingRight(), alignment2, 1.0f, 0.0f, true);
            this.f55937L0 = staticLayout;
            iMax = Math.max(staticLayout.getLineCount(), this.f55982z);
        }
        float f = iMax;
        if (this.f55919B != f) {
            m81646n(f).start();
        }
        this.f55919B = f;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m81642j() {
        int i;
        boolean z = true;
        if (!m81649q()) {
            this.f55942O = true;
            return;
        }
        Editable text = getText();
        int length = text == null ? 0 : text.length();
        if (length < this.f55975s || ((i = this.f55976t) > 0 && length > i)) {
            z = false;
        }
        this.f55942O = z;
    }

    /* JADX INFO: renamed from: k */
    private void m81643k() {
        int buttonsCount = this.f55954W * getButtonsCount();
        int i = 0;
        if (!m81629A()) {
            i = buttonsCount;
            buttonsCount = 0;
        }
        super.setPadding(this.f55970o + this.f55957c + buttonsCount, this.f55968m + this.f55955a, this.f55971p + this.f55958d + i, this.f55969n + this.f55956b);
    }

    /* JADX INFO: renamed from: l */
    private Bitmap[] m81644l(@DrawableRes int i) {
        if (i == -1) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), i, options);
        int iMax = Math.max(options.outWidth, options.outHeight);
        int i2 = this.f55953V;
        options.inSampleSize = iMax > i2 ? iMax / i2 : 1;
        options.inJustDecodeBounds = false;
        return m81645m(BitmapFactory.decodeResource(getResources(), i, options));
    }

    /* JADX INFO: renamed from: m */
    private Bitmap[] m81645m(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap[] bitmapArr = new Bitmap[4];
        Bitmap bitmapM81632E = m81632E(bitmap);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        bitmapArr[0] = bitmapM81632E.copy(config, true);
        Canvas canvas = new Canvas(bitmapArr[0]);
        int i = this.f55967l;
        int i2 = (if5.m139722a(i) ? RoundedDrawable.DEFAULT_BORDER_COLOR : -1979711488) | (i & 16777215);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        canvas.drawColor(i2, mode);
        bitmapArr[1] = bitmapM81632E.copy(config, true);
        new Canvas(bitmapArr[1]).drawColor(this.f55973q, mode);
        bitmapArr[2] = bitmapM81632E.copy(config, true);
        Canvas canvas2 = new Canvas(bitmapArr[2]);
        int i3 = this.f55967l;
        canvas2.drawColor((if5.m139722a(i3) ? 1275068416 : 1107296256) | (16777215 & i3), mode);
        bitmapArr[3] = bitmapM81632E.copy(config, true);
        new Canvas(bitmapArr[3]).drawColor(this.f55974r, mode);
        return bitmapArr;
    }

    /* JADX INFO: renamed from: n */
    private ObjectAnimator m81646n(float f) {
        ObjectAnimator objectAnimator = this.f55943O0;
        if (objectAnimator == null) {
            this.f55943O0 = ObjectAnimator.ofFloat(this, "currentBottomLines", f);
        } else {
            objectAnimator.cancel();
            this.f55943O0.setFloatValues(f);
        }
        return this.f55943O0;
    }

    /* JADX INFO: renamed from: o */
    private Typeface m81647o(@NonNull String str) {
        return Typeface.createFromAsset(getContext().getResources().getAssets(), str);
    }

    /* JADX INFO: renamed from: p */
    private int m81648p(int i) {
        return jvd.m147011a(getContext(), i);
    }

    /* JADX INFO: renamed from: q */
    private boolean m81649q() {
        return this.f55975s > 0 || this.f55976t > 0;
    }

    /* JADX INFO: renamed from: r */
    private void m81650r(Context context, AttributeSet attributeSet) {
        int i;
        this.f55953V = m81648p(32);
        this.f55954W = m81648p(48);
        this.f55966k0 = m81648p(32);
        this.f55963i = getResources().getDimensionPixelSize(jac0.f118973d);
        this.f55980x = getResources().getDimensionPixelSize(jac0.f118970a);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, whc0.f189119a);
        this.f55927G0 = typedArrayObtainStyledAttributes.getColorStateList(whc0.f189115E);
        this.f55929H0 = typedArrayObtainStyledAttributes.getColorStateList(whc0.f189116F);
        this.f55967l = typedArrayObtainStyledAttributes.getColor(whc0.f189122d, RoundedDrawable.DEFAULT_BORDER_COLOR);
        TypedValue typedValue = new TypedValue();
        try {
            try {
                context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                i = typedValue.data;
            } catch (Exception unused) {
                i = this.f55967l;
            }
        } catch (Exception unused2) {
            int identifier = getResources().getIdentifier("colorPrimary", "attr", getContext().getPackageName());
            if (identifier == 0) {
                throw new RuntimeException("colorPrimary not found");
            }
            context.getTheme().resolveAttribute(identifier, typedValue, true);
            i = typedValue.data;
        }
        this.f55973q = typedArrayObtainStyledAttributes.getColor(whc0.f189113C, i);
        setFloatingLabelInternal(typedArrayObtainStyledAttributes.getInt(whc0.f189128j, 0));
        this.f55974r = typedArrayObtainStyledAttributes.getColor(whc0.f189127i, Color.parseColor("#e7492E"));
        this.f55975s = typedArrayObtainStyledAttributes.getInt(whc0.f189112B, 0);
        this.f55976t = typedArrayObtainStyledAttributes.getInt(whc0.f189144z, 0);
        this.f55977u = typedArrayObtainStyledAttributes.getBoolean(whc0.f189114D, false);
        this.f55920C = typedArrayObtainStyledAttributes.getString(whc0.f189135q);
        this.f55921D = typedArrayObtainStyledAttributes.getColor(whc0.f189137s, -1);
        this.f55982z = typedArrayObtainStyledAttributes.getInt(whc0.f189111A, 0);
        String string = typedArrayObtainStyledAttributes.getString(whc0.f189120b);
        if (string != null && !isInEditMode()) {
            Typeface typefaceM81647o = m81647o(string);
            this.f55930I = typefaceM81647o;
            this.f55935K0.setTypeface(typefaceM81647o);
        }
        String string2 = typedArrayObtainStyledAttributes.getString(whc0.f189117G);
        if (string2 != null && !isInEditMode()) {
            Typeface typefaceM81647o2 = m81647o(string2);
            this.f55932J = typefaceM81647o2;
            setTypeface(typefaceM81647o2);
        }
        String string3 = typedArrayObtainStyledAttributes.getString(whc0.f189132n);
        this.f55934K = string3;
        if (string3 == null) {
            this.f55934K = getHint();
        }
        this.f55962h = typedArrayObtainStyledAttributes.getDimensionPixelSize(whc0.f189131m, this.f55963i);
        this.f55959e = typedArrayObtainStyledAttributes.getDimensionPixelSize(whc0.f189134p, getResources().getDimensionPixelSize(jac0.f118972c));
        this.f55960f = typedArrayObtainStyledAttributes.getColor(whc0.f189133o, -1);
        this.f55944P = typedArrayObtainStyledAttributes.getBoolean(whc0.f189130l, true);
        this.f55961g = typedArrayObtainStyledAttributes.getDimensionPixelSize(whc0.f189124f, getResources().getDimensionPixelSize(jac0.f118971b));
        this.f55936L = typedArrayObtainStyledAttributes.getBoolean(whc0.f189138t, false);
        this.f55938M = typedArrayObtainStyledAttributes.getColor(whc0.f189118H, -1);
        this.f55940N = typedArrayObtainStyledAttributes.getBoolean(whc0.f189121c, false);
        this.f55946Q = m81644l(typedArrayObtainStyledAttributes.getResourceId(whc0.f189140v, -1));
        this.f55948R = m81644l(typedArrayObtainStyledAttributes.getResourceId(whc0.f189142x, -1));
        this.f55952U = typedArrayObtainStyledAttributes.getBoolean(whc0.f189125g, false);
        this.f55950S = m81644l(qbc0.f156466a);
        this.f55951T = m81644l(qbc0.f156467b);
        this.f55972p0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(whc0.f189141w, m81648p(16));
        this.f55978v = typedArrayObtainStyledAttributes.getBoolean(whc0.f189129k, false);
        this.f55979w = typedArrayObtainStyledAttributes.getBoolean(whc0.f189136r, false);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom});
        int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
        this.f55970o = typedArrayObtainStyledAttributes2.getDimensionPixelSize(1, dimensionPixelSize);
        this.f55968m = typedArrayObtainStyledAttributes2.getDimensionPixelSize(2, dimensionPixelSize);
        this.f55971p = typedArrayObtainStyledAttributes2.getDimensionPixelSize(3, dimensionPixelSize);
        this.f55969n = typedArrayObtainStyledAttributes2.getDimensionPixelSize(4, dimensionPixelSize);
        typedArrayObtainStyledAttributes2.recycle();
        setBackground(null);
        if (this.f55977u) {
            TransformationMethod transformationMethod = getTransformationMethod();
            setSingleLine();
            setTransformationMethod(transformationMethod);
        }
        m81652t();
        m81653u();
        m81654v();
        m81651s();
        m81655w();
        m81642j();
    }

    /* JADX INFO: renamed from: s */
    private void m81651s() {
        addTextChangedListener(new C13359b());
        ViewOnFocusChangeListenerC13360c viewOnFocusChangeListenerC13360c = new ViewOnFocusChangeListenerC13360c();
        this.f55945P0 = viewOnFocusChangeListenerC13360c;
        super.setOnFocusChangeListener(viewOnFocusChangeListenerC13360c);
    }

    private void setFloatingLabelInternal(int i) {
        if (i == 1) {
            this.f55964j = true;
            this.f55965k = false;
        } else if (i != 2) {
            this.f55964j = false;
            this.f55965k = false;
        } else {
            this.f55964j = true;
            this.f55965k = true;
        }
    }

    /* JADX INFO: renamed from: t */
    private void m81652t() {
        int i = 1;
        boolean z = this.f55975s > 0 || this.f55976t > 0 || this.f55977u || this.f55922E != null || this.f55920C != null;
        int i2 = this.f55982z;
        if (i2 > 0) {
            i = i2;
        } else if (!z) {
            i = 0;
        }
        this.f55981y = i;
        this.f55918A = i;
    }

    /* JADX INFO: renamed from: u */
    private void m81653u() {
        this.f55955a = this.f55964j ? this.f55959e + this.f55962h : this.f55962h;
        this.f55935K0.setTextSize(this.f55961g);
        Paint.FontMetrics fontMetrics = this.f55935K0.getFontMetrics();
        int i = (int) ((fontMetrics.descent - fontMetrics.ascent) * this.f55918A);
        boolean z = this.f55936L;
        int i2 = this.f55963i;
        if (!z) {
            i2 *= 2;
        }
        this.f55956b = i + i2;
        int i3 = 0;
        this.f55957c = this.f55946Q == null ? 0 : this.f55954W + this.f55972p0;
        if (this.f55948R != null) {
            i3 = this.f55972p0 + this.f55954W;
        }
        this.f55958d = i3;
        m81643k();
    }

    /* JADX INFO: renamed from: v */
    private void m81654v() {
        if (TextUtils.isEmpty(getText())) {
            m81630C();
        } else {
            Editable text = getText();
            setText((CharSequence) null);
            m81630C();
            setText(text);
            setSelection(text.length());
            this.f55924F = 1.0f;
            this.f55926G = true;
        }
        m81631D();
    }

    /* JADX INFO: renamed from: w */
    private void m81655w() {
        addTextChangedListener(new C13358a());
    }

    /* JADX INFO: renamed from: x */
    private boolean m81656x(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int scrollX = getScrollX() + (this.f55946Q == null ? 0 : this.f55954W + this.f55972p0);
        int scrollX2 = getScrollX() + (this.f55948R == null ? getWidth() : (getWidth() - this.f55954W) - this.f55972p0);
        if (!m81629A()) {
            scrollX = scrollX2 - this.f55954W;
        }
        int scrollY = ((getScrollY() + getHeight()) - getPaddingBottom()) + this.f55963i;
        int i = this.f55966k0;
        int i2 = scrollY - i;
        return x >= ((float) scrollX) && x < ((float) (scrollX + this.f55954W)) && y >= ((float) i2) && y < ((float) (i2 + i));
    }

    /* JADX INFO: renamed from: z */
    private boolean m81657z() {
        return this.f55922E == null && m81660y();
    }

    /* JADX INFO: renamed from: B */
    public boolean m81658B() {
        return this.f55952U;
    }

    /* JADX INFO: renamed from: F */
    public boolean m81659F() {
        List<yiw> list = this.f55949R0;
        if (list == null || list.isEmpty()) {
            return true;
        }
        Editable text = getText();
        boolean z = text.length() == 0;
        boolean z2 = true;
        for (yiw yiwVar : this.f55949R0) {
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
        return this.f55930I;
    }

    public int getBottomTextSize() {
        return this.f55961g;
    }

    public float getCurrentBottomLines() {
        return this.f55918A;
    }

    @Override // android.widget.TextView
    public CharSequence getError() {
        return this.f55922E;
    }

    public int getErrorColor() {
        return this.f55974r;
    }

    public float getFloatingLabelFraction() {
        return this.f55924F;
    }

    public int getFloatingLabelPadding() {
        return this.f55962h;
    }

    public CharSequence getFloatingLabelText() {
        return this.f55934K;
    }

    public int getFloatingLabelTextColor() {
        return this.f55960f;
    }

    public int getFloatingLabelTextSize() {
        return this.f55959e;
    }

    public float getFocusFraction() {
        return this.f55928H;
    }

    public String getHelperText() {
        return this.f55920C;
    }

    public int getHelperTextColor() {
        return this.f55921D;
    }

    public int getInnerPaddingBottom() {
        return this.f55969n;
    }

    public int getInnerPaddingLeft() {
        return this.f55970o;
    }

    public int getInnerPaddingRight() {
        return this.f55971p;
    }

    public int getInnerPaddingTop() {
        return this.f55968m;
    }

    public int getMaxCharacters() {
        return this.f55976t;
    }

    public int getMinBottomTextLines() {
        return this.f55982z;
    }

    public int getMinCharacters() {
        return this.f55975s;
    }

    public int getUnderlineColor() {
        return this.f55938M;
    }

    @Nullable
    public List<yiw> getValidators() {
        return this.f55949R0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int innerPaddingLeft;
        int i;
        char c;
        char c2;
        Canvas canvas2 = canvas;
        int scrollX = getScrollX() + (this.f55946Q == null ? 0 : this.f55954W + this.f55972p0);
        int scrollX2 = getScrollX() + (this.f55948R == null ? getWidth() : (getWidth() - this.f55954W) - this.f55972p0);
        int scrollY = (getScrollY() + getHeight()) - getPaddingBottom();
        this.f55933J0.setAlpha(255);
        Bitmap[] bitmapArr = this.f55946Q;
        if (bitmapArr != null) {
            if (!m81657z()) {
                c2 = 3;
            } else if (isEnabled()) {
                c2 = hasFocus() ? (char) 1 : (char) 0;
            } else {
                c2 = 2;
            }
            Bitmap bitmap = bitmapArr[c2];
            int i2 = scrollX - this.f55972p0;
            int i3 = this.f55954W;
            int width = (i2 - i3) + ((i3 - bitmap.getWidth()) / 2);
            int i4 = this.f55963i + scrollY;
            int i5 = this.f55966k0;
            canvas2.drawBitmap(bitmap, width, (i4 - i5) + ((i5 - bitmap.getHeight()) / 2), this.f55933J0);
        }
        Bitmap[] bitmapArr2 = this.f55948R;
        if (bitmapArr2 != null) {
            if (!m81657z()) {
                c = 3;
            } else if (isEnabled()) {
                c = hasFocus() ? (char) 1 : (char) 0;
            } else {
                c = 2;
            }
            Bitmap bitmap2 = bitmapArr2[c];
            int width2 = this.f55972p0 + scrollX2 + ((this.f55954W - bitmap2.getWidth()) / 2);
            int i6 = this.f55963i + scrollY;
            int i7 = this.f55966k0;
            canvas2.drawBitmap(bitmap2, width2, (i6 - i7) + ((i7 - bitmap2.getHeight()) / 2), this.f55933J0);
        }
        if (hasFocus() && this.f55952U) {
            this.f55933J0.setAlpha(255);
            int i8 = m81629A() ? scrollX : scrollX2 - this.f55954W;
            Bitmap bitmap3 = TextUtils.isEmpty(getText()) ? this.f55951T[0] : this.f55950S[0];
            int width3 = i8 + ((this.f55954W - bitmap3.getWidth()) / 2);
            int i9 = this.f55963i + scrollY;
            int i10 = this.f55966k0;
            canvas2.drawBitmap(bitmap3, width3, (i9 - i10) + ((i10 - bitmap3.getHeight()) / 2), this.f55933J0);
        }
        if (!this.f55936L) {
            int i11 = scrollY + this.f55963i;
            if (m81657z()) {
                if (isEnabled()) {
                    boolean zHasFocus = hasFocus();
                    Paint paint = this.f55933J0;
                    if (zHasFocus) {
                        paint.setColor(this.f55973q);
                        canvas2 = canvas;
                        canvas2.drawRect(scrollX, i11, scrollX2, m81648p(2) + i11, this.f55933J0);
                    } else {
                        int i12 = this.f55938M;
                        if (i12 == -1) {
                            i12 = (this.f55967l & 16777215) | 503316480;
                        }
                        paint.setColor(i12);
                        canvas2 = canvas;
                        canvas2.drawRect(scrollX, i11, scrollX2, m81648p(1) + i11, this.f55933J0);
                    }
                } else {
                    Paint paint2 = this.f55933J0;
                    int i13 = this.f55938M;
                    if (i13 == -1) {
                        i13 = (this.f55967l & 16777215) | 1140850688;
                    }
                    paint2.setColor(i13);
                    float fM81648p = m81648p(1);
                    float f = 0.0f;
                    while (f < getWidth()) {
                        float f2 = scrollX + f;
                        float f3 = fM81648p;
                        canvas.drawRect(f2, i11, f2 + fM81648p, m81648p(1) + i11, this.f55933J0);
                        f += 3.0f * f3;
                        fM81648p = f3;
                    }
                }
                scrollY = i11;
            } else {
                this.f55933J0.setColor(this.f55974r);
                canvas2.drawRect(scrollX, i11, scrollX2, m81648p(2) + i11, this.f55933J0);
            }
            canvas2 = canvas;
            scrollY = i11;
        }
        this.f55935K0.setTextSize(this.f55961g);
        Paint.FontMetrics fontMetrics = this.f55935K0.getFontMetrics();
        float f4 = fontMetrics.ascent;
        float f5 = fontMetrics.descent;
        float f6 = (-f4) - f5;
        float f7 = this.f55961g + f4 + f5;
        if ((hasFocus() && m81649q()) || !m81660y()) {
            this.f55935K0.setColor(m81660y() ? (this.f55967l & 16777215) | 1140850688 : this.f55974r);
            String charactersCounterText = getCharactersCounterText();
            canvas2.drawText(charactersCounterText, m81629A() ? scrollX : scrollX2 - this.f55935K0.measureText(charactersCounterText), this.f55963i + scrollY + f6, this.f55935K0);
        }
        if (this.f55937L0 != null && (this.f55922E != null || ((this.f55979w || hasFocus()) && !TextUtils.isEmpty(this.f55920C)))) {
            TextPaint textPaint = this.f55935K0;
            if (this.f55922E != null) {
                i = this.f55974r;
            } else {
                i = this.f55921D;
                if (i == -1) {
                    i = (this.f55967l & 16777215) | 1140850688;
                }
            }
            textPaint.setColor(i);
            canvas2.save();
            canvas2.translate(getBottomTextLeftOffset() + scrollX, (this.f55963i + scrollY) - f7);
            this.f55937L0.draw(canvas2);
            canvas2.restore();
        }
        if (this.f55964j && !TextUtils.isEmpty(this.f55934K)) {
            this.f55935K0.setTextSize(this.f55959e);
            TextPaint textPaint2 = this.f55935K0;
            ArgbEvaluator argbEvaluator = this.f55931I0;
            float f8 = this.f55928H;
            int i14 = this.f55960f;
            if (i14 == -1) {
                i14 = (16777215 & this.f55967l) | 1140850688;
            }
            textPaint2.setColor(((Integer) argbEvaluator.evaluate(f8, Integer.valueOf(i14), Integer.valueOf(this.f55973q))).intValue());
            float fMeasureText = this.f55935K0.measureText(this.f55934K.toString());
            if ((getGravity() & 5) == 5 || m81629A()) {
                innerPaddingLeft = (int) (scrollX2 - fMeasureText);
            } else {
                innerPaddingLeft = (getGravity() & 3) == 3 ? scrollX : ((int) (getInnerPaddingLeft() + ((((getWidth() - getInnerPaddingLeft()) - getInnerPaddingRight()) - fMeasureText) / 2.0f))) + scrollX;
            }
            int i15 = this.f55968m + this.f55959e;
            int i16 = this.f55962h;
            float f9 = i15 + i16;
            float f10 = i16;
            boolean z = this.f55978v;
            int i17 = (int) (f9 - (f10 * (z ? 1.0f : this.f55924F)));
            this.f55935K0.setAlpha((int) ((z ? 1.0f : this.f55924F) * 255.0f * (this.f55960f == -1 ? (this.f55928H * 0.74f) + 0.26f : 1.0f)));
            canvas2.drawText(this.f55934K.toString(), innerPaddingLeft, i17, this.f55935K0);
        }
        if (hasFocus() && this.f55977u && getScrollX() != 0) {
            this.f55933J0.setColor(this.f55973q);
            float f11 = scrollY + this.f55963i;
            if (m81629A()) {
                scrollX = scrollX2;
            }
            int i18 = m81629A() ? -1 : 1;
            int i19 = this.f55980x;
            canvas2.drawCircle(((i18 * i19) / 2) + scrollX, (i19 / 2) + f11, i19 / 2, this.f55933J0);
            int i20 = this.f55980x;
            canvas2.drawCircle((((i18 * i20) * 5) / 2) + scrollX, (i20 / 2) + f11, i20 / 2, this.f55933J0);
            int i21 = this.f55980x;
            canvas2.drawCircle(scrollX + (((i18 * i21) * 9) / 2), f11 + (i21 / 2), i21 / 2, this.f55933J0);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m81641i();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f55977u && getScrollX() > 0 && motionEvent.getAction() == 0 && motionEvent.getX() < m81648p(20) && motionEvent.getY() > (getHeight() - this.f55956b) - this.f55969n && motionEvent.getY() < getHeight() - this.f55969n) {
            setSelection(0);
            return false;
        }
        if (hasFocus() && this.f55952U) {
            int action = motionEvent.getAction();
            if (action == 0) {
                if (m81656x(motionEvent)) {
                    this.f55923E0 = true;
                    this.f55925F0 = true;
                }
                return true;
            }
            if (action == 1) {
                if (this.f55925F0) {
                    if (!TextUtils.isEmpty(getText())) {
                        setText((CharSequence) null);
                    }
                    this.f55925F0 = false;
                }
                if (this.f55923E0) {
                    this.f55923E0 = false;
                    return true;
                }
                this.f55923E0 = false;
            } else if (action == 2) {
                if (this.f55925F0 && !m81656x(motionEvent)) {
                    this.f55925F0 = false;
                }
                if (this.f55923E0) {
                    return true;
                }
            } else if (action == 3) {
                this.f55923E0 = false;
                this.f55925F0 = false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentTypeface(Typeface typeface) {
        this.f55930I = typeface;
        this.f55935K0.setTypeface(typeface);
        postInvalidate();
    }

    public void setAutoValidate(boolean z) {
        this.f55940N = z;
        if (z) {
            m81659F();
        }
    }

    public void setBaseColor(int i) {
        if (this.f55967l != i) {
            this.f55967l = i;
        }
        m81654v();
        postInvalidate();
    }

    public void setBottomTextSize(int i) {
        this.f55961g = i;
        m81653u();
    }

    public void setCurrentBottomLines(float f) {
        this.f55918A = f;
        m81653u();
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        this.f55922E = charSequence == null ? null : charSequence.toString();
        if (m81641i()) {
            postInvalidate();
        }
    }

    public void setErrorColor(int i) {
        this.f55974r = i;
        postInvalidate();
    }

    public void setFloatingLabel(int i) {
        setFloatingLabelInternal(i);
        m81653u();
    }

    public void setFloatingLabelAlwaysShown(boolean z) {
        this.f55978v = z;
        invalidate();
    }

    public void setFloatingLabelAnimating(boolean z) {
        this.f55944P = z;
    }

    public void setFloatingLabelFraction(float f) {
        this.f55924F = f;
        invalidate();
    }

    public void setFloatingLabelPadding(int i) {
        this.f55962h = i;
        postInvalidate();
    }

    public void setFloatingLabelText(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getHint();
        }
        this.f55934K = charSequence;
        postInvalidate();
    }

    public void setFloatingLabelTextColor(int i) {
        this.f55960f = i;
        postInvalidate();
    }

    public void setFloatingLabelTextSize(int i) {
        this.f55959e = i;
        m81653u();
    }

    public void setFocusFraction(float f) {
        this.f55928H = f;
        invalidate();
    }

    public void setHelperText(CharSequence charSequence) {
        this.f55920C = charSequence == null ? null : charSequence.toString();
        if (m81641i()) {
            postInvalidate();
        }
    }

    public void setHelperTextAlwaysShown(boolean z) {
        this.f55979w = z;
        invalidate();
    }

    public void setHelperTextColor(int i) {
        this.f55921D = i;
        postInvalidate();
    }

    public void setHideUnderline(boolean z) {
        this.f55936L = z;
        m81653u();
        postInvalidate();
    }

    public void setIconLeft(@DrawableRes int i) {
        this.f55946Q = m81644l(i);
        m81653u();
    }

    public void setIconRight(@DrawableRes int i) {
        this.f55948R = m81644l(i);
        m81653u();
    }

    public void setMaxCharacters(int i) {
        this.f55976t = i;
        m81652t();
        m81653u();
        postInvalidate();
    }

    public void setMetHintTextColor(int i) {
        this.f55929H0 = ColorStateList.valueOf(i);
        m81630C();
    }

    public void setMetTextColor(int i) {
        this.f55927G0 = ColorStateList.valueOf(i);
        m81631D();
    }

    public void setMinBottomTextLines(int i) {
        this.f55982z = i;
        m81652t();
        m81653u();
        postInvalidate();
    }

    public void setMinCharacters(int i) {
        this.f55975s = i;
        m81652t();
        m81653u();
        postInvalidate();
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        if (this.f55945P0 == null) {
            super.setOnFocusChangeListener(onFocusChangeListener);
        } else {
            this.f55947Q0 = onFocusChangeListener;
        }
    }

    @Override // android.widget.TextView, android.view.View
    @Deprecated
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    public void setPrimaryColor(int i) {
        this.f55973q = i;
        postInvalidate();
    }

    public void setShowClearButton(boolean z) {
        this.f55952U = z;
        m81643k();
    }

    public void setSingleLineEllipsis(boolean z) {
        this.f55977u = z;
        m81652t();
        m81653u();
        postInvalidate();
    }

    public void setUnderlineColor(int i) {
        this.f55938M = i;
        postInvalidate();
    }

    /* JADX INFO: renamed from: y */
    public boolean m81660y() {
        return this.f55942O;
    }

    public void setIconLeft(Bitmap bitmap) {
        this.f55946Q = m81645m(bitmap);
        m81653u();
    }

    public void setIconRight(Bitmap bitmap) {
        this.f55948R = m81645m(bitmap);
        m81653u();
    }

    public void setMetHintTextColor(ColorStateList colorStateList) {
        this.f55929H0 = colorStateList;
        m81630C();
    }

    public void setMetTextColor(ColorStateList colorStateList) {
        this.f55927G0 = colorStateList;
        m81631D();
    }

    public MaterialMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55921D = -1;
        this.f55931I0 = new ArgbEvaluator();
        this.f55933J0 = new Paint(1);
        this.f55935K0 = new TextPaint(1);
        m81650r(context, attributeSet);
    }

    @TargetApi(21)
    public MaterialMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55921D = -1;
        this.f55931I0 = new ArgbEvaluator();
        this.f55933J0 = new Paint(1);
        this.f55935K0 = new TextPaint(1);
        m81650r(context, attributeSet);
    }
}
