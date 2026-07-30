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
import p149l.c2c0;
import p149l.ie5;
import p149l.k3c0;
import p149l.q9c0;
import p149l.vtd;
import p149l.zgw;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class MaterialEditText extends EditText {

    /* JADX INFO: renamed from: A */
    private int f54996A;

    /* JADX INFO: renamed from: B */
    private int f54997B;

    /* JADX INFO: renamed from: C */
    private int f54998C;

    /* JADX INFO: renamed from: D */
    private float f54999D;

    /* JADX INFO: renamed from: E */
    private float f55000E;

    /* JADX INFO: renamed from: E0 */
    private int f55001E0;

    /* JADX INFO: renamed from: F */
    private String f55002F;

    /* JADX INFO: renamed from: F0 */
    private int f55003F0;

    /* JADX INFO: renamed from: G */
    private int f55004G;

    /* JADX INFO: renamed from: G0 */
    private int f55005G0;

    /* JADX INFO: renamed from: H */
    private String f55006H;

    /* JADX INFO: renamed from: H0 */
    private int f55007H0;

    /* JADX INFO: renamed from: I */
    private float f55008I;

    /* JADX INFO: renamed from: I0 */
    private boolean f55009I0;

    /* JADX INFO: renamed from: J */
    private boolean f55010J;

    /* JADX INFO: renamed from: J0 */
    private boolean f55011J0;

    /* JADX INFO: renamed from: K */
    private float f55012K;

    /* JADX INFO: renamed from: K0 */
    private ColorStateList f55013K0;

    /* JADX INFO: renamed from: L */
    private Typeface f55014L;

    /* JADX INFO: renamed from: L0 */
    private ColorStateList f55015L0;

    /* JADX INFO: renamed from: M */
    private Typeface f55016M;

    /* JADX INFO: renamed from: M0 */
    private ArgbEvaluator f55017M0;

    /* JADX INFO: renamed from: N */
    private CharSequence f55018N;

    /* JADX INFO: renamed from: N0 */
    Paint f55019N0;

    /* JADX INFO: renamed from: O */
    private boolean f55020O;

    /* JADX INFO: renamed from: O0 */
    TextPaint f55021O0;

    /* JADX INFO: renamed from: P */
    private int f55022P;

    /* JADX INFO: renamed from: P0 */
    StaticLayout f55023P0;

    /* JADX INFO: renamed from: Q */
    private int f55024Q;

    /* JADX INFO: renamed from: Q0 */
    ObjectAnimator f55025Q0;

    /* JADX INFO: renamed from: R */
    private boolean f55026R;

    /* JADX INFO: renamed from: R0 */
    ObjectAnimator f55027R0;

    /* JADX INFO: renamed from: S */
    private boolean f55028S;

    /* JADX INFO: renamed from: S0 */
    ObjectAnimator f55029S0;

    /* JADX INFO: renamed from: T */
    private boolean f55030T;

    /* JADX INFO: renamed from: T0 */
    View.OnFocusChangeListener f55031T0;

    /* JADX INFO: renamed from: U */
    private Bitmap[] f55032U;

    /* JADX INFO: renamed from: U0 */
    View.OnFocusChangeListener f55033U0;

    /* JADX INFO: renamed from: V */
    private Bitmap[] f55034V;

    /* JADX INFO: renamed from: V0 */
    private List<zgw> f55035V0;

    /* JADX INFO: renamed from: W */
    private Bitmap[] f55036W;

    /* JADX INFO: renamed from: W0 */
    int f55037W0;

    /* JADX INFO: renamed from: X0 */
    public boolean f55038X0;

    /* JADX INFO: renamed from: a */
    private int f55039a;

    /* JADX INFO: renamed from: b */
    private int f55040b;

    /* JADX INFO: renamed from: c */
    private int f55041c;

    /* JADX INFO: renamed from: d */
    private int f55042d;

    /* JADX INFO: renamed from: e */
    private int f55043e;

    /* JADX INFO: renamed from: f */
    private int f55044f;

    /* JADX INFO: renamed from: g */
    private int f55045g;

    /* JADX INFO: renamed from: h */
    private int f55046h;

    /* JADX INFO: renamed from: i */
    private int f55047i;

    /* JADX INFO: renamed from: j */
    private int f55048j;

    /* JADX INFO: renamed from: k */
    private boolean f55049k;

    /* JADX INFO: renamed from: k0 */
    private Bitmap[] f55050k0;

    /* JADX INFO: renamed from: l */
    private boolean f55051l;

    /* JADX INFO: renamed from: m */
    private int f55052m;

    /* JADX INFO: renamed from: n */
    private int f55053n;

    /* JADX INFO: renamed from: o */
    private int f55054o;

    /* JADX INFO: renamed from: p */
    private int f55055p;

    /* JADX INFO: renamed from: p0 */
    private boolean f55056p0;

    /* JADX INFO: renamed from: q */
    private int f55057q;

    /* JADX INFO: renamed from: r */
    private int f55058r;

    /* JADX INFO: renamed from: s */
    private boolean f55059s;

    /* JADX INFO: renamed from: t */
    private int f55060t;

    /* JADX INFO: renamed from: u */
    private boolean f55061u;

    /* JADX INFO: renamed from: v */
    private int f55062v;

    /* JADX INFO: renamed from: w */
    private int f55063w;

    /* JADX INFO: renamed from: x */
    private boolean f55064x;

    /* JADX INFO: renamed from: y */
    private boolean f55065y;

    /* JADX INFO: renamed from: z */
    private boolean f55066z;

    /* JADX INFO: renamed from: com.rengwuxian.materialedittext.MaterialEditText$a */
    public class C13192a implements TextWatcher {
        public C13192a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MaterialEditText.this.m80427j();
            boolean z = MaterialEditText.this.f55026R;
            MaterialEditText materialEditText = MaterialEditText.this;
            if (z) {
                materialEditText.m80444F();
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
    public class C13193b implements TextWatcher {
        public C13193b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (MaterialEditText.this.f55049k) {
                int length = editable.length();
                MaterialEditText materialEditText = MaterialEditText.this;
                if (length == 0) {
                    if (materialEditText.f55010J) {
                        MaterialEditText.this.f55010J = false;
                        MaterialEditText.this.getLabelAnimator().reverse();
                        return;
                    }
                    return;
                }
                if (materialEditText.f55010J) {
                    return;
                }
                MaterialEditText.this.f55010J = true;
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
    public class ViewOnFocusChangeListenerC13194c implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC13194c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (MaterialEditText.this.f55049k && MaterialEditText.this.f55051l) {
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
            View.OnFocusChangeListener onFocusChangeListener = MaterialEditText.this.f55033U0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z);
            }
        }
    }

    public MaterialEditText(Context context) {
        super(context);
        this.f55059s = false;
        this.f55004G = -1;
        this.f55017M0 = new ArgbEvaluator();
        this.f55019N0 = new Paint(1);
        this.f55021O0 = new TextPaint(1);
        this.f55037W0 = 0;
        this.f55038X0 = false;
        m80435r(context, null);
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: A */
    private boolean m80414A() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: B */
    private void m80415B() {
        ColorStateList colorStateList = this.f55015L0;
        if (colorStateList == null) {
            setHintTextColor((this.f55052m & 16777215) | 1140850688);
        } else {
            setHintTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: C */
    private void m80416C() {
        ColorStateList colorStateList = this.f55013K0;
        if (colorStateList != null) {
            setTextColor(colorStateList);
            return;
        }
        int[][] iArr = {new int[]{R.attr.state_enabled}, EditText.EMPTY_STATE_SET};
        int i = this.f55052m;
        ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{(i & 16777215) | (-553648128), (i & 16777215) | 1140850688});
        this.f55013K0 = colorStateList2;
        setTextColor(colorStateList2);
    }

    /* JADX INFO: renamed from: D */
    private Bitmap m80417D(Bitmap bitmap) {
        int i;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMax = Math.max(width, height);
        int i2 = this.f55001E0;
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
        if (this.f55064x) {
            return (this.f54996A * 5) + m80433p(4);
        }
        return 0;
    }

    private int getBottomTextLeftOffset() {
        return m80414A() ? getCharactersCounterWidth() : getBottomEllipsisWidth();
    }

    private int getBottomTextRightOffset() {
        return m80414A() ? getBottomEllipsisWidth() : getCharactersCounterWidth();
    }

    private int getButtonsCount() {
        return isShowClearButton() ? 1 : 0;
    }

    private String getCharactersCounterText() {
        if (this.f55062v <= 0) {
            if (m80414A()) {
                return this.f55063w + " / " + getText().length();
            }
            return getText().length() + " / " + this.f55063w;
        }
        if (this.f55063w <= 0) {
            if (m80414A()) {
                return Marker.ANY_NON_NULL_MARKER + this.f55062v + " / " + getText().length();
            }
            return getText().length() + " / " + this.f55062v + Marker.ANY_NON_NULL_MARKER;
        }
        if (m80414A()) {
            return this.f55063w + "-" + this.f55062v + " / " + getText().length();
        }
        return getText().length() + " / " + this.f55062v + "-" + this.f55063w;
    }

    private int getCharactersCounterWidth() {
        if (m80434q()) {
            return (int) this.f55021O0.measureText(getCharactersCounterText());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator getLabelAnimator() {
        if (this.f55025Q0 == null) {
            this.f55025Q0 = ObjectAnimator.ofFloat(this, "floatingLabelFraction", 0.0f, 1.0f);
        }
        this.f55025Q0.setDuration(this.f55030T ? 300L : 0L);
        return this.f55025Q0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator getLabelFocusAnimator() {
        if (this.f55027R0 == null) {
            this.f55027R0 = ObjectAnimator.ofFloat(this, "focusFraction", 0.0f, 1.0f);
        }
        return this.f55027R0;
    }

    /* JADX INFO: renamed from: i */
    private boolean m80426i() {
        Layout.Alignment alignment;
        int iMax;
        if (getWidth() == 0) {
            return false;
        }
        this.f55021O0.setTextSize(this.f55045g);
        if (this.f55006H == null && this.f55002F == null) {
            iMax = this.f54997B;
        } else {
            if ((getGravity() & 5) == 5 || m80414A()) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = (getGravity() & 3) == 3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            String str = this.f55006H;
            if (str == null) {
                str = this.f55002F;
            }
            StaticLayout staticLayout = new StaticLayout(str, this.f55021O0, (getWidth() - getBottomTextLeftOffset()) - getBottomTextRightOffset(), alignment2, 1.0f, 0.0f, true);
            this.f55023P0 = staticLayout;
            iMax = Math.max(staticLayout.getLineCount(), this.f54998C);
        }
        float f = iMax;
        if (this.f55000E != f) {
            m80431n(f).start();
        }
        this.f55000E = f;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m80427j() {
        int i;
        Editable text = getText();
        boolean z = false;
        int length = text == null ? 0 : text.length();
        if (Math.abs(this.f55037W0 - length) > 3) {
            this.f55038X0 = true;
        }
        this.f55037W0 = length;
        if (!m80434q()) {
            this.f55028S = true;
            return;
        }
        if (length >= this.f55062v && ((i = this.f55063w) <= 0 || length <= i)) {
            z = true;
        }
        this.f55028S = z;
    }

    /* JADX INFO: renamed from: k */
    private void m80428k() {
        int i;
        int buttonsCount = this.f55003F0 * getButtonsCount();
        int i2 = 0;
        if (m80414A()) {
            i = 0;
        } else {
            i = buttonsCount;
            buttonsCount = 0;
        }
        if (TextUtils.isEmpty(getText()) && this.f55056p0) {
            i = 0;
        } else {
            i2 = buttonsCount;
        }
        super.setPadding(this.f55055p + this.f55041c + i2, this.f55053n + this.f55039a, this.f55057q + this.f55042d + i, this.f55054o + this.f55040b);
    }

    /* JADX INFO: renamed from: l */
    private Bitmap[] m80429l(@DrawableRes int i) {
        if (i == -1) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), i, options);
        int iMax = Math.max(options.outWidth, options.outHeight);
        int i2 = this.f55001E0;
        options.inSampleSize = iMax > i2 ? iMax / i2 : 1;
        options.inJustDecodeBounds = false;
        return m80430m(BitmapFactory.decodeResource(getResources(), i, options));
    }

    /* JADX INFO: renamed from: m */
    private Bitmap[] m80430m(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap[] bitmapArr = new Bitmap[4];
        Bitmap bitmapM80417D = m80417D(bitmap);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        bitmapArr[0] = bitmapM80417D.copy(config, true);
        bitmapArr[1] = bitmapM80417D.copy(config, true);
        Canvas canvas = new Canvas(bitmapArr[1]);
        int i = this.f55058r;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        canvas.drawColor(i, mode);
        bitmapArr[2] = bitmapM80417D.copy(config, true);
        Canvas canvas2 = new Canvas(bitmapArr[2]);
        int i2 = this.f55052m;
        canvas2.drawColor((ie5.m135658a(i2) ? 1275068416 : 1107296256) | (16777215 & i2), mode);
        bitmapArr[3] = bitmapM80417D.copy(config, true);
        new Canvas(bitmapArr[3]).drawColor(this.f55060t, mode);
        return bitmapArr;
    }

    /* JADX INFO: renamed from: n */
    private ObjectAnimator m80431n(float f) {
        ObjectAnimator objectAnimator = this.f55029S0;
        if (objectAnimator == null) {
            this.f55029S0 = ObjectAnimator.ofFloat(this, "currentBottomLines", f);
        } else {
            objectAnimator.cancel();
            this.f55029S0.setFloatValues(f);
        }
        return this.f55029S0;
    }

    /* JADX INFO: renamed from: o */
    private Typeface m80432o(@NonNull String str) {
        return Typeface.createFromAsset(getContext().getResources().getAssets(), str);
    }

    /* JADX INFO: renamed from: p */
    private int m80433p(int i) {
        return vtd.m199996a(getContext(), i);
    }

    /* JADX INFO: renamed from: q */
    private boolean m80434q() {
        return this.f55062v > 0 || this.f55063w > 0;
    }

    /* JADX INFO: renamed from: r */
    private void m80435r(Context context, AttributeSet attributeSet) {
        int i;
        this.f55001E0 = m80433p(32);
        this.f55003F0 = m80433p(48);
        this.f55005G0 = m80433p(32);
        this.f55047i = getResources().getDimensionPixelSize(c2c0.f78349d);
        this.f54996A = getResources().getDimensionPixelSize(c2c0.f78346a);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q9c0.f153398a);
        this.f55013K0 = typedArrayObtainStyledAttributes.getColorStateList(q9c0.f153394E);
        this.f55015L0 = typedArrayObtainStyledAttributes.getColorStateList(q9c0.f153395F);
        this.f55052m = typedArrayObtainStyledAttributes.getColor(q9c0.f153401d, RoundedDrawable.DEFAULT_BORDER_COLOR);
        TypedValue typedValue = new TypedValue();
        try {
            try {
                context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                i = typedValue.data;
            } catch (Exception unused) {
                i = this.f55052m;
            }
        } catch (Exception unused2) {
            int identifier = getResources().getIdentifier("colorPrimary", "attr", getContext().getPackageName());
            if (identifier == 0) {
                throw new RuntimeException("colorPrimary not found");
            }
            context.getTheme().resolveAttribute(identifier, typedValue, true);
            i = typedValue.data;
        }
        this.f55047i = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f153402e, this.f55047i);
        this.f55048j = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f153405h, this.f55048j);
        this.f55058r = typedArrayObtainStyledAttributes.getColor(q9c0.f153392C, i);
        setFloatingLabelInternal(typedArrayObtainStyledAttributes.getInt(q9c0.f153407j, 0));
        this.f55060t = typedArrayObtainStyledAttributes.getColor(q9c0.f153406i, Color.parseColor("#e7492E"));
        this.f55061u = typedArrayObtainStyledAttributes.getBoolean(q9c0.f153422y, true);
        this.f55062v = typedArrayObtainStyledAttributes.getInt(q9c0.f153391B, 0);
        this.f55063w = typedArrayObtainStyledAttributes.getInt(q9c0.f153423z, 0);
        this.f55064x = typedArrayObtainStyledAttributes.getBoolean(q9c0.f153393D, false);
        this.f55002F = typedArrayObtainStyledAttributes.getString(q9c0.f153414q);
        this.f55004G = typedArrayObtainStyledAttributes.getColor(q9c0.f153416s, -1);
        this.f54998C = typedArrayObtainStyledAttributes.getInt(q9c0.f153390A, 0);
        String string = typedArrayObtainStyledAttributes.getString(q9c0.f153399b);
        if (string != null && !isInEditMode()) {
            Typeface typefaceM80432o = m80432o(string);
            this.f55014L = typefaceM80432o;
            this.f55021O0.setTypeface(typefaceM80432o);
        }
        String string2 = typedArrayObtainStyledAttributes.getString(q9c0.f153396G);
        if (string2 != null && !isInEditMode()) {
            Typeface typefaceM80432o2 = m80432o(string2);
            this.f55016M = typefaceM80432o2;
            setTypeface(typefaceM80432o2);
        }
        String string3 = typedArrayObtainStyledAttributes.getString(q9c0.f153411n);
        this.f55018N = string3;
        if (string3 == null) {
            this.f55018N = getHint();
        }
        this.f55046h = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f153410m, this.f55047i);
        this.f55043e = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f153413p, getResources().getDimensionPixelSize(c2c0.f78348c));
        this.f55044f = typedArrayObtainStyledAttributes.getColor(q9c0.f153412o, -1);
        this.f55030T = typedArrayObtainStyledAttributes.getBoolean(q9c0.f153409l, true);
        this.f55045g = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f153403f, getResources().getDimensionPixelSize(c2c0.f78347b));
        this.f55020O = typedArrayObtainStyledAttributes.getBoolean(q9c0.f153417t, false);
        this.f55022P = typedArrayObtainStyledAttributes.getColor(q9c0.f153397H, -1);
        this.f55024Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f153418u, -1);
        this.f55026R = typedArrayObtainStyledAttributes.getBoolean(q9c0.f153400c, false);
        this.f55032U = m80429l(typedArrayObtainStyledAttributes.getResourceId(q9c0.f153419v, -1));
        this.f55034V = m80429l(typedArrayObtainStyledAttributes.getResourceId(q9c0.f153421x, -1));
        this.f55056p0 = typedArrayObtainStyledAttributes.getBoolean(q9c0.f153404g, false);
        this.f55036W = m80429l(k3c0.f120813a);
        this.f55050k0 = m80429l(k3c0.f120814b);
        this.f55007H0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f153420w, m80433p(16));
        this.f55065y = typedArrayObtainStyledAttributes.getBoolean(q9c0.f153408k, false);
        this.f55066z = typedArrayObtainStyledAttributes.getBoolean(q9c0.f153415r, false);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom});
        int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
        this.f55055p = typedArrayObtainStyledAttributes2.getDimensionPixelSize(1, dimensionPixelSize);
        this.f55053n = typedArrayObtainStyledAttributes2.getDimensionPixelSize(2, dimensionPixelSize);
        this.f55057q = typedArrayObtainStyledAttributes2.getDimensionPixelSize(3, dimensionPixelSize);
        this.f55054o = typedArrayObtainStyledAttributes2.getDimensionPixelSize(4, dimensionPixelSize);
        typedArrayObtainStyledAttributes2.recycle();
        setBackground(null);
        if (this.f55064x) {
            TransformationMethod transformationMethod = getTransformationMethod();
            setSingleLine();
            setTransformationMethod(transformationMethod);
        }
        m80437t();
        m80438u();
        m80439v();
        m80436s();
        m80440w();
        m80427j();
    }

    /* JADX INFO: renamed from: s */
    private void m80436s() {
        addTextChangedListener(new C13193b());
        ViewOnFocusChangeListenerC13194c viewOnFocusChangeListenerC13194c = new ViewOnFocusChangeListenerC13194c();
        this.f55031T0 = viewOnFocusChangeListenerC13194c;
        super.setOnFocusChangeListener(viewOnFocusChangeListenerC13194c);
    }

    private void setFloatingLabelInternal(int i) {
        if (i == 1) {
            this.f55049k = true;
            this.f55051l = false;
        } else if (i != 2) {
            this.f55049k = false;
            this.f55051l = false;
        } else {
            this.f55049k = true;
            this.f55051l = true;
        }
    }

    /* JADX INFO: renamed from: t */
    private void m80437t() {
        int i = 1;
        boolean z = this.f55062v > 0 || this.f55063w > 0 || this.f55064x || this.f55006H != null || this.f55002F != null;
        int i2 = this.f54998C;
        if (i2 > 0) {
            i = i2;
        } else if (!z) {
            i = 0;
        }
        this.f54997B = i;
        this.f54999D = i;
    }

    /* JADX INFO: renamed from: u */
    private void m80438u() {
        this.f55039a = this.f55049k ? this.f55043e + this.f55046h : this.f55046h;
        this.f55021O0.setTextSize(this.f55045g);
        Paint.FontMetrics fontMetrics = this.f55021O0.getFontMetrics();
        int i = (int) ((fontMetrics.descent - fontMetrics.ascent) * this.f54999D);
        boolean z = this.f55020O;
        int i2 = this.f55047i;
        if (!z) {
            i2 *= 2;
        }
        this.f55040b = i + i2;
        int i3 = 0;
        this.f55041c = this.f55032U == null ? 0 : this.f55003F0 + this.f55007H0;
        if (this.f55034V != null) {
            i3 = this.f55007H0 + this.f55003F0;
        }
        this.f55042d = i3;
        m80428k();
    }

    /* JADX INFO: renamed from: v */
    private void m80439v() {
        if (TextUtils.isEmpty(getText())) {
            m80415B();
        } else {
            Editable text = getText();
            setText((CharSequence) null);
            m80415B();
            setText(text);
            setSelection(text.length());
            this.f55008I = 1.0f;
            this.f55010J = true;
            this.f55037W0 = text.length();
        }
        m80416C();
    }

    /* JADX INFO: renamed from: w */
    private void m80440w() {
        addTextChangedListener(new C13192a());
        this.f55037W0 = getText().length();
    }

    /* JADX INFO: renamed from: x */
    private boolean m80441x(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int scrollX = getScrollX() + (this.f55032U == null ? 0 : this.f55003F0 + this.f55007H0);
        int width = this.f55034V == null ? getWidth() : (getWidth() - this.f55003F0) - this.f55007H0;
        if (!m80414A()) {
            scrollX = (width - this.f55003F0) - this.f55057q;
        }
        int scrollY = (((((getScrollY() + getHeight()) - getPaddingBottom()) + this.f55047i) - this.f55005G0) - m80433p(9)) - this.f55048j;
        return x >= ((float) scrollX) && x < ((float) (scrollX + this.f55003F0)) && y >= ((float) scrollY) && y < ((float) (scrollY + this.f55005G0));
    }

    /* JADX INFO: renamed from: z */
    private boolean m80442z() {
        return this.f55006H == null;
    }

    /* JADX INFO: renamed from: E */
    public void m80443E(int i, int i2, int i3, int i4) {
        this.f55053n = i2;
        this.f55054o = i4;
        this.f55055p = i;
        this.f55057q = i3;
        m80428k();
    }

    /* JADX INFO: renamed from: F */
    public boolean m80444F() {
        List<zgw> list = this.f55035V0;
        if (list == null || list.isEmpty()) {
            return true;
        }
        Editable text = getText();
        boolean z = text.length() == 0;
        boolean z2 = true;
        for (zgw zgwVar : this.f55035V0) {
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
        return this.f55014L;
    }

    public int getBottomTextSize() {
        return this.f55045g;
    }

    @Keep
    public float getCurrentBottomLines() {
        return this.f54999D;
    }

    @Override // android.widget.TextView
    public CharSequence getError() {
        return this.f55006H;
    }

    public int getErrorColor() {
        return this.f55060t;
    }

    @Keep
    public float getFloatingLabelFraction() {
        return this.f55008I;
    }

    public int getFloatingLabelPadding() {
        return this.f55046h;
    }

    public CharSequence getFloatingLabelText() {
        return this.f55018N;
    }

    public int getFloatingLabelTextColor() {
        return this.f55044f;
    }

    public int getFloatingLabelTextSize() {
        return this.f55043e;
    }

    @Keep
    public float getFocusFraction() {
        return this.f55012K;
    }

    public String getHelperText() {
        return this.f55002F;
    }

    public int getHelperTextColor() {
        return this.f55004G;
    }

    public int getInnerPaddingBottom() {
        return this.f55054o;
    }

    public int getInnerPaddingLeft() {
        return this.f55055p;
    }

    public int getInnerPaddingRight() {
        return this.f55057q;
    }

    public int getInnerPaddingTop() {
        return this.f55053n;
    }

    public int getMaxCharacters() {
        return this.f55063w;
    }

    @Keep
    public int getMinBottomTextLines() {
        return this.f54998C;
    }

    @Keep
    public int getMinCharacters() {
        return this.f55062v;
    }

    public int getUnderlineColor() {
        return this.f55022P;
    }

    @Nullable
    public List<zgw> getValidators() {
        return this.f55035V0;
    }

    @Keep
    public boolean isShowClearButton() {
        return this.f55056p0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int innerPaddingLeft;
        int i;
        int i2;
        char c;
        char c2;
        Canvas canvas2 = canvas;
        int scrollX = getScrollX() + (this.f55032U == null ? 0 : this.f55003F0 + this.f55007H0);
        int scrollX2 = getScrollX() + (this.f55034V == null ? getWidth() : (getWidth() - this.f55003F0) - this.f55007H0);
        int scrollY = (getScrollY() + getHeight()) - getPaddingBottom();
        this.f55019N0.setAlpha(255);
        Bitmap[] bitmapArr = this.f55032U;
        if (bitmapArr != null) {
            if (!m80442z()) {
                c2 = 3;
            } else if (isEnabled()) {
                c2 = hasFocus() ? (char) 1 : (char) 0;
            } else {
                c2 = 2;
            }
            Bitmap bitmap = bitmapArr[c2];
            int i3 = scrollX - this.f55007H0;
            int i4 = this.f55003F0;
            int width = (i3 - i4) + ((i4 - bitmap.getWidth()) / 2);
            int i5 = this.f55047i + scrollY;
            int i6 = this.f55005G0;
            canvas2.drawBitmap(bitmap, width, (i5 - i6) + ((i6 - bitmap.getHeight()) / 2), this.f55019N0);
        }
        Bitmap[] bitmapArr2 = this.f55034V;
        if (bitmapArr2 != null) {
            if (!m80442z()) {
                c = 3;
            } else if (isEnabled()) {
                c = hasFocus() ? (char) 1 : (char) 0;
            } else {
                c = 2;
            }
            Bitmap bitmap2 = bitmapArr2[c];
            int width2 = this.f55007H0 + scrollX2 + ((this.f55003F0 - bitmap2.getWidth()) / 2);
            int i7 = this.f55047i + scrollY;
            int i8 = this.f55005G0;
            canvas2.drawBitmap(bitmap2, width2, (i7 - i8) + ((i8 - bitmap2.getHeight()) / 2), this.f55019N0);
        }
        if (hasFocus() && this.f55056p0) {
            this.f55019N0.setAlpha(255);
            int i9 = m80414A() ? scrollX : (scrollX2 - this.f55003F0) - this.f55057q;
            Bitmap bitmap3 = TextUtils.isEmpty(getText()) ? this.f55050k0[0] : this.f55036W[0];
            int width3 = i9 + ((this.f55003F0 - bitmap3.getWidth()) / 2);
            int i10 = this.f55047i + scrollY;
            int i11 = this.f55005G0;
            int height = (((i10 - i11) + ((i11 - bitmap3.getHeight()) / 2)) - m80433p(9)) - this.f55048j;
            if (!TextUtils.isEmpty(getText())) {
                canvas2.drawBitmap(bitmap3, width3, height, this.f55019N0);
            }
        }
        if (!this.f55020O) {
            int i12 = scrollY + this.f55047i;
            if (m80442z() || !this.f55061u) {
                i2 = i12;
                if (!isEnabled()) {
                    Paint paint = this.f55019N0;
                    int i13 = this.f55022P;
                    if (i13 == -1) {
                        i13 = (this.f55052m & 16777215) | 1140850688;
                    }
                    paint.setColor(i13);
                    float fM80433p = m80433p(1);
                    float f = 0.0f;
                    while (f < getWidth()) {
                        float f2 = scrollX + f;
                        float f3 = fM80433p;
                        canvas.drawRect(f2, i2, f2 + fM80433p, m80433p(1) + i2, this.f55019N0);
                        f += 3.0f * f3;
                        fM80433p = f3;
                    }
                } else if (hasFocus()) {
                    this.f55019N0.setColor(this.f55058r);
                    float f4 = scrollX;
                    float f5 = i2;
                    float f6 = scrollX2;
                    int iM80433p = this.f55024Q;
                    if (iM80433p == -1) {
                        iM80433p = m80433p(2);
                    }
                    canvas2 = canvas;
                    canvas2.drawRect(f4, f5, f6, iM80433p + i2, this.f55019N0);
                } else {
                    boolean z = this.f55059s;
                    Paint paint2 = this.f55019N0;
                    if (z) {
                        paint2.setColor(this.f55058r);
                        float f7 = scrollX;
                        float f8 = i2;
                        float f9 = scrollX2;
                        int iM80433p2 = this.f55024Q;
                        if (iM80433p2 == -1) {
                            iM80433p2 = m80433p(2);
                        }
                        canvas2 = canvas;
                        canvas2.drawRect(f7, f8, f9, iM80433p2 + i2, this.f55019N0);
                    } else {
                        int i14 = this.f55022P;
                        if (i14 == -1) {
                            i14 = (this.f55052m & 16777215) | 503316480;
                        }
                        paint2.setColor(i14);
                        canvas2 = canvas;
                        canvas2.drawRect(scrollX, i2, scrollX2, m80433p(1) + i2, this.f55019N0);
                    }
                }
                scrollY = i2;
            } else {
                this.f55019N0.setColor(this.f55060t);
                float f10 = scrollX;
                float f11 = i12;
                float f12 = scrollX2;
                int iM80433p3 = this.f55024Q;
                if (iM80433p3 == -1) {
                    iM80433p3 = m80433p(2);
                }
                i2 = i12;
                canvas2.drawRect(f10, f11, f12, iM80433p3 + i12, this.f55019N0);
            }
            canvas2 = canvas;
            scrollY = i2;
        }
        this.f55021O0.setTextSize(this.f55045g);
        Paint.FontMetrics fontMetrics = this.f55021O0.getFontMetrics();
        float f13 = fontMetrics.ascent;
        float f14 = fontMetrics.descent;
        float f15 = (-f13) - f14;
        float f16 = this.f55045g + f13 + f14;
        if (hasFocus() && m80434q()) {
            this.f55021O0.setColor(m80445y() ? (this.f55052m & 16777215) | 1140850688 : this.f55060t);
            String charactersCounterText = getCharactersCounterText();
            canvas2.drawText(charactersCounterText, m80414A() ? scrollX : scrollX2 - this.f55021O0.measureText(charactersCounterText), this.f55047i + scrollY + f15, this.f55021O0);
        }
        if (this.f55023P0 != null && (this.f55006H != null || ((this.f55066z || hasFocus()) && !TextUtils.isEmpty(this.f55002F)))) {
            TextPaint textPaint = this.f55021O0;
            if (this.f55006H != null) {
                i = this.f55060t;
            } else {
                i = this.f55004G;
                if (i == -1) {
                    i = (this.f55052m & 16777215) | 1140850688;
                }
            }
            textPaint.setColor(i);
            canvas2.save();
            canvas2.translate(getBottomTextLeftOffset() + scrollX, (this.f55047i + scrollY) - f16);
            this.f55023P0.draw(canvas2);
            canvas2.restore();
        }
        if (this.f55049k && !TextUtils.isEmpty(this.f55018N)) {
            this.f55021O0.setTextSize(this.f55043e);
            TextPaint textPaint2 = this.f55021O0;
            ArgbEvaluator argbEvaluator = this.f55017M0;
            float f17 = this.f55012K;
            int i15 = this.f55044f;
            if (i15 == -1) {
                i15 = (this.f55052m & 16777215) | 1140850688;
            }
            textPaint2.setColor(((Integer) argbEvaluator.evaluate(f17, Integer.valueOf(i15), Integer.valueOf(this.f55058r))).intValue());
            float fMeasureText = this.f55021O0.measureText(this.f55018N.toString());
            if ((getGravity() & 5) == 5 || m80414A()) {
                innerPaddingLeft = (int) (scrollX2 - fMeasureText);
            } else {
                innerPaddingLeft = (getGravity() & 3) == 3 ? scrollX : ((int) (getInnerPaddingLeft() + ((((getWidth() - getInnerPaddingLeft()) - getInnerPaddingRight()) - fMeasureText) / 2.0f))) + scrollX;
            }
            int i16 = this.f55053n + this.f55043e;
            int i17 = this.f55046h;
            float f18 = i16 + i17;
            float f19 = i17;
            boolean z2 = this.f55065y;
            int i18 = (int) (f18 - (f19 * (z2 ? 1.0f : this.f55008I)));
            this.f55021O0.setAlpha((int) ((z2 ? 1.0f : this.f55008I) * 255.0f * (this.f55044f == -1 ? (this.f55012K * 0.74f) + 0.26f : 1.0f)));
            canvas2.drawText(this.f55018N.toString(), innerPaddingLeft, i18, this.f55021O0);
        }
        if (hasFocus() && this.f55064x && getScrollX() != 0) {
            this.f55019N0.setColor(this.f55058r);
            float f20 = scrollY + this.f55047i;
            if (m80414A()) {
                scrollX = scrollX2;
            }
            int i19 = m80414A() ? -1 : 1;
            int i20 = this.f54996A;
            canvas2.drawCircle(((i19 * i20) / 2) + scrollX, (i20 / 2) + f20, i20 / 2, this.f55019N0);
            int i21 = this.f54996A;
            canvas2.drawCircle((((i19 * i21) * 5) / 2) + scrollX, (i21 / 2) + f20, i21 / 2, this.f55019N0);
            int i22 = this.f54996A;
            canvas2.drawCircle(scrollX + (((i19 * i22) * 9) / 2), f20 + (i22 / 2), i22 / 2, this.f55019N0);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m80426i();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f55064x && getScrollX() > 0 && motionEvent.getAction() == 0 && motionEvent.getX() < m80433p(20) && motionEvent.getY() > (getHeight() - this.f55040b) - this.f55054o && motionEvent.getY() < getHeight() - this.f55054o) {
            setSelection(0);
            return false;
        }
        if (hasFocus() && this.f55056p0) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    if (this.f55011J0) {
                        if (!TextUtils.isEmpty(getText())) {
                            setText((CharSequence) null);
                        }
                        this.f55011J0 = false;
                    }
                    if (this.f55009I0) {
                        this.f55009I0 = false;
                        return true;
                    }
                    this.f55009I0 = false;
                } else if (action == 2) {
                    if (this.f55011J0 && !m80441x(motionEvent)) {
                        this.f55011J0 = false;
                    }
                    if (this.f55009I0) {
                        return true;
                    }
                } else if (action == 3) {
                    this.f55009I0 = false;
                    this.f55011J0 = false;
                }
            } else if (m80441x(motionEvent)) {
                this.f55009I0 = true;
                this.f55011J0 = true;
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentTypeface(Typeface typeface) {
        this.f55014L = typeface;
        this.f55021O0.setTypeface(typeface);
        postInvalidate();
    }

    public void setAutoValidate(boolean z) {
        this.f55026R = z;
        if (z) {
            m80444F();
        }
    }

    public void setBaseColor(int i) {
        if (this.f55052m != i) {
            this.f55052m = i;
        }
        m80439v();
        postInvalidate();
    }

    public void setBottomTextSize(int i) {
        this.f55045g = i;
        m80438u();
    }

    @Keep
    public void setCurrentBottomLines(float f) {
        this.f54999D = f;
        m80438u();
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        this.f55006H = charSequence == null ? null : charSequence.toString();
        if (m80426i()) {
            postInvalidate();
        }
    }

    public void setErrorBottomLineShown(boolean z) {
        this.f55061u = z;
    }

    public void setErrorColor(int i) {
        this.f55060t = i;
        postInvalidate();
    }

    public void setFloatingLabel(int i) {
        setFloatingLabelInternal(i);
        m80438u();
    }

    public void setFloatingLabelAlwaysShown(boolean z) {
        this.f55065y = z;
        invalidate();
    }

    public void setFloatingLabelAnimating(boolean z) {
        this.f55030T = z;
    }

    @Keep
    public void setFloatingLabelFraction(float f) {
        this.f55008I = f;
        invalidate();
    }

    public void setFloatingLabelPadding(int i) {
        this.f55046h = i;
        postInvalidate();
    }

    public void setFloatingLabelText(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getHint();
        }
        this.f55018N = charSequence;
        postInvalidate();
    }

    public void setFloatingLabelTextColor(int i) {
        this.f55044f = i;
        postInvalidate();
    }

    public void setFloatingLabelTextSize(int i) {
        this.f55043e = i;
        m80438u();
    }

    @Keep
    public void setFocusFraction(float f) {
        this.f55012K = f;
        invalidate();
    }

    public void setForcePrimaryColor(boolean z) {
        this.f55059s = z;
        postInvalidate();
    }

    public void setHelperText(CharSequence charSequence) {
        this.f55002F = charSequence == null ? null : charSequence.toString();
        if (m80426i()) {
            postInvalidate();
        }
    }

    public void setHelperTextAlwaysShown(boolean z) {
        this.f55066z = z;
        invalidate();
    }

    public void setHelperTextColor(int i) {
        this.f55004G = i;
        postInvalidate();
    }

    public void setHideUnderline(boolean z) {
        this.f55020O = z;
        m80438u();
        postInvalidate();
    }

    public void setHighLightUnderlineWidth(int i) {
        this.f55024Q = i;
        postInvalidate();
    }

    @Keep
    public void setIconLeft(@DrawableRes int i) {
        this.f55032U = m80429l(i);
        m80438u();
    }

    @Keep
    public void setIconRight(@DrawableRes int i) {
        this.f55034V = m80429l(i);
        m80438u();
    }

    public void setMaxCharacters(int i) {
        this.f55063w = i;
        m80437t();
        m80438u();
        postInvalidate();
    }

    public void setMetHintTextColor(int i) {
        this.f55015L0 = ColorStateList.valueOf(i);
        m80415B();
    }

    public void setMetTextColor(int i) {
        this.f55013K0 = ColorStateList.valueOf(i);
        m80416C();
    }

    @Keep
    public void setMinBottomTextLines(int i) {
        this.f54998C = i;
        m80437t();
        m80438u();
        postInvalidate();
    }

    @Keep
    public void setMinCharacters(int i) {
        this.f55062v = i;
        m80437t();
        m80438u();
        postInvalidate();
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        if (this.f55031T0 == null) {
            super.setOnFocusChangeListener(onFocusChangeListener);
        } else {
            this.f55033U0 = onFocusChangeListener;
        }
    }

    @Override // android.widget.TextView, android.view.View
    @Deprecated
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    public void setPrimaryColor(int i) {
        this.f55058r = i;
        postInvalidate();
    }

    @Keep
    public void setShowClearButton(boolean z) {
        this.f55056p0 = z;
        m80428k();
    }

    public void setSingleLineEllipsis(boolean z) {
        this.f55064x = z;
        m80437t();
        m80438u();
        postInvalidate();
    }

    public void setUnderlineColor(int i) {
        this.f55022P = i;
        postInvalidate();
    }

    /* JADX INFO: renamed from: y */
    public boolean m80445y() {
        return this.f55028S;
    }

    @Keep
    public void setIconLeft(Bitmap bitmap) {
        this.f55032U = m80430m(bitmap);
        m80438u();
    }

    @Keep
    public void setIconRight(Bitmap bitmap) {
        this.f55034V = m80430m(bitmap);
        m80438u();
    }

    public void setMetHintTextColor(ColorStateList colorStateList) {
        this.f55015L0 = colorStateList;
        m80415B();
    }

    public void setMetTextColor(ColorStateList colorStateList) {
        this.f55013K0 = colorStateList;
        m80416C();
    }

    public MaterialEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55059s = false;
        this.f55004G = -1;
        this.f55017M0 = new ArgbEvaluator();
        this.f55019N0 = new Paint(1);
        this.f55021O0 = new TextPaint(1);
        this.f55037W0 = 0;
        this.f55038X0 = false;
        m80435r(context, attributeSet);
    }

    @TargetApi(21)
    public MaterialEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55059s = false;
        this.f55004G = -1;
        this.f55017M0 = new ArgbEvaluator();
        this.f55019N0 = new Paint(1);
        this.f55021O0 = new TextPaint(1);
        this.f55037W0 = 0;
        this.f55038X0 = false;
        m80435r(context, attributeSet);
    }
}
