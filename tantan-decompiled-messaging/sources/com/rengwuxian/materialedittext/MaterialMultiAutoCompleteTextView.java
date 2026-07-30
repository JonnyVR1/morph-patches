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
import p149l.c2c0;
import p149l.ie5;
import p149l.k3c0;
import p149l.q9c0;
import p149l.vtd;
import p149l.zgw;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class MaterialMultiAutoCompleteTextView extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: A */
    private float f55070A;

    /* JADX INFO: renamed from: B */
    private float f55071B;

    /* JADX INFO: renamed from: C */
    private String f55072C;

    /* JADX INFO: renamed from: D */
    private int f55073D;

    /* JADX INFO: renamed from: E */
    private String f55074E;

    /* JADX INFO: renamed from: E0 */
    private boolean f55075E0;

    /* JADX INFO: renamed from: F */
    private float f55076F;

    /* JADX INFO: renamed from: F0 */
    private boolean f55077F0;

    /* JADX INFO: renamed from: G */
    private boolean f55078G;

    /* JADX INFO: renamed from: G0 */
    private ColorStateList f55079G0;

    /* JADX INFO: renamed from: H */
    private float f55080H;

    /* JADX INFO: renamed from: H0 */
    private ColorStateList f55081H0;

    /* JADX INFO: renamed from: I */
    private Typeface f55082I;

    /* JADX INFO: renamed from: I0 */
    private ArgbEvaluator f55083I0;

    /* JADX INFO: renamed from: J */
    private Typeface f55084J;

    /* JADX INFO: renamed from: J0 */
    Paint f55085J0;

    /* JADX INFO: renamed from: K */
    private CharSequence f55086K;

    /* JADX INFO: renamed from: K0 */
    TextPaint f55087K0;

    /* JADX INFO: renamed from: L */
    private boolean f55088L;

    /* JADX INFO: renamed from: L0 */
    StaticLayout f55089L0;

    /* JADX INFO: renamed from: M */
    private int f55090M;

    /* JADX INFO: renamed from: M0 */
    ObjectAnimator f55091M0;

    /* JADX INFO: renamed from: N */
    private boolean f55092N;

    /* JADX INFO: renamed from: N0 */
    ObjectAnimator f55093N0;

    /* JADX INFO: renamed from: O */
    private boolean f55094O;

    /* JADX INFO: renamed from: O0 */
    ObjectAnimator f55095O0;

    /* JADX INFO: renamed from: P */
    private boolean f55096P;

    /* JADX INFO: renamed from: P0 */
    View.OnFocusChangeListener f55097P0;

    /* JADX INFO: renamed from: Q */
    private Bitmap[] f55098Q;

    /* JADX INFO: renamed from: Q0 */
    View.OnFocusChangeListener f55099Q0;

    /* JADX INFO: renamed from: R */
    private Bitmap[] f55100R;

    /* JADX INFO: renamed from: R0 */
    private List<zgw> f55101R0;

    /* JADX INFO: renamed from: S */
    private Bitmap[] f55102S;

    /* JADX INFO: renamed from: T */
    private Bitmap[] f55103T;

    /* JADX INFO: renamed from: U */
    private boolean f55104U;

    /* JADX INFO: renamed from: V */
    private int f55105V;

    /* JADX INFO: renamed from: W */
    private int f55106W;

    /* JADX INFO: renamed from: a */
    private int f55107a;

    /* JADX INFO: renamed from: b */
    private int f55108b;

    /* JADX INFO: renamed from: c */
    private int f55109c;

    /* JADX INFO: renamed from: d */
    private int f55110d;

    /* JADX INFO: renamed from: e */
    private int f55111e;

    /* JADX INFO: renamed from: f */
    private int f55112f;

    /* JADX INFO: renamed from: g */
    private int f55113g;

    /* JADX INFO: renamed from: h */
    private int f55114h;

    /* JADX INFO: renamed from: i */
    private int f55115i;

    /* JADX INFO: renamed from: j */
    private boolean f55116j;

    /* JADX INFO: renamed from: k */
    private boolean f55117k;

    /* JADX INFO: renamed from: k0 */
    private int f55118k0;

    /* JADX INFO: renamed from: l */
    private int f55119l;

    /* JADX INFO: renamed from: m */
    private int f55120m;

    /* JADX INFO: renamed from: n */
    private int f55121n;

    /* JADX INFO: renamed from: o */
    private int f55122o;

    /* JADX INFO: renamed from: p */
    private int f55123p;

    /* JADX INFO: renamed from: p0 */
    private int f55124p0;

    /* JADX INFO: renamed from: q */
    private int f55125q;

    /* JADX INFO: renamed from: r */
    private int f55126r;

    /* JADX INFO: renamed from: s */
    private int f55127s;

    /* JADX INFO: renamed from: t */
    private int f55128t;

    /* JADX INFO: renamed from: u */
    private boolean f55129u;

    /* JADX INFO: renamed from: v */
    private boolean f55130v;

    /* JADX INFO: renamed from: w */
    private boolean f55131w;

    /* JADX INFO: renamed from: x */
    private int f55132x;

    /* JADX INFO: renamed from: y */
    private int f55133y;

    /* JADX INFO: renamed from: z */
    private int f55134z;

    /* JADX INFO: renamed from: com.rengwuxian.materialedittext.MaterialMultiAutoCompleteTextView$a */
    public class C13195a implements TextWatcher {
        public C13195a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MaterialMultiAutoCompleteTextView.this.m80459j();
            boolean z = MaterialMultiAutoCompleteTextView.this.f55092N;
            MaterialMultiAutoCompleteTextView materialMultiAutoCompleteTextView = MaterialMultiAutoCompleteTextView.this;
            if (z) {
                materialMultiAutoCompleteTextView.m80476F();
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
    public class C13196b implements TextWatcher {
        public C13196b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (MaterialMultiAutoCompleteTextView.this.f55116j) {
                int length = editable.length();
                MaterialMultiAutoCompleteTextView materialMultiAutoCompleteTextView = MaterialMultiAutoCompleteTextView.this;
                if (length == 0) {
                    if (materialMultiAutoCompleteTextView.f55078G) {
                        MaterialMultiAutoCompleteTextView.this.f55078G = false;
                        MaterialMultiAutoCompleteTextView.this.getLabelAnimator().reverse();
                        return;
                    }
                    return;
                }
                if (materialMultiAutoCompleteTextView.f55078G) {
                    return;
                }
                MaterialMultiAutoCompleteTextView.this.f55078G = true;
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
    public class ViewOnFocusChangeListenerC13197c implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC13197c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (MaterialMultiAutoCompleteTextView.this.f55116j && MaterialMultiAutoCompleteTextView.this.f55117k) {
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
            View.OnFocusChangeListener onFocusChangeListener = MaterialMultiAutoCompleteTextView.this.f55099Q0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z);
            }
        }
    }

    public MaterialMultiAutoCompleteTextView(Context context) {
        super(context);
        this.f55073D = -1;
        this.f55083I0 = new ArgbEvaluator();
        this.f55085J0 = new Paint(1);
        this.f55087K0 = new TextPaint(1);
        m80467r(context, null);
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: A */
    private boolean m80446A() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: C */
    private void m80447C() {
        ColorStateList colorStateList = this.f55081H0;
        if (colorStateList == null) {
            setHintTextColor((this.f55119l & 16777215) | 1140850688);
        } else {
            setHintTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: D */
    private void m80448D() {
        ColorStateList colorStateList = this.f55079G0;
        if (colorStateList != null) {
            setTextColor(colorStateList);
            return;
        }
        int[][] iArr = {new int[]{R.attr.state_enabled}, MultiAutoCompleteTextView.EMPTY_STATE_SET};
        int i = this.f55119l;
        ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{(i & 16777215) | (-553648128), (i & 16777215) | 1140850688});
        this.f55079G0 = colorStateList2;
        setTextColor(colorStateList2);
    }

    /* JADX INFO: renamed from: E */
    private Bitmap m80449E(Bitmap bitmap) {
        int i;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMax = Math.max(width, height);
        int i2 = this.f55105V;
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
        if (this.f55129u) {
            return (this.f55132x * 5) + m80465p(4);
        }
        return 0;
    }

    private int getBottomTextLeftOffset() {
        return m80446A() ? getCharactersCounterWidth() : getBottomEllipsisWidth();
    }

    private int getBottomTextRightOffset() {
        return m80446A() ? getBottomEllipsisWidth() : getCharactersCounterWidth();
    }

    private int getButtonsCount() {
        return m80475B() ? 1 : 0;
    }

    private String getCharactersCounterText() {
        if (this.f55127s <= 0) {
            if (m80446A()) {
                return this.f55128t + " / " + getText().length();
            }
            return getText().length() + " / " + this.f55128t;
        }
        if (this.f55128t <= 0) {
            if (m80446A()) {
                return Marker.ANY_NON_NULL_MARKER + this.f55127s + " / " + getText().length();
            }
            return getText().length() + " / " + this.f55127s + Marker.ANY_NON_NULL_MARKER;
        }
        if (m80446A()) {
            return this.f55128t + "-" + this.f55127s + " / " + getText().length();
        }
        return getText().length() + " / " + this.f55127s + "-" + this.f55128t;
    }

    private int getCharactersCounterWidth() {
        if (m80466q()) {
            return (int) this.f55087K0.measureText(getCharactersCounterText());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator getLabelAnimator() {
        if (this.f55091M0 == null) {
            this.f55091M0 = ObjectAnimator.ofFloat(this, "floatingLabelFraction", 0.0f, 1.0f);
        }
        this.f55091M0.setDuration(this.f55096P ? 300L : 0L);
        return this.f55091M0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator getLabelFocusAnimator() {
        if (this.f55093N0 == null) {
            this.f55093N0 = ObjectAnimator.ofFloat(this, "focusFraction", 0.0f, 1.0f);
        }
        return this.f55093N0;
    }

    /* JADX INFO: renamed from: i */
    private boolean m80458i() {
        Layout.Alignment alignment;
        int iMax;
        if (getWidth() == 0) {
            return false;
        }
        this.f55087K0.setTextSize(this.f55113g);
        if (this.f55074E == null && this.f55072C == null) {
            iMax = this.f55133y;
        } else {
            if ((getGravity() & 5) == 5 || m80446A()) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = (getGravity() & 3) == 3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            String str = this.f55074E;
            if (str == null) {
                str = this.f55072C;
            }
            StaticLayout staticLayout = new StaticLayout(str, this.f55087K0, (((getWidth() - getBottomTextLeftOffset()) - getBottomTextRightOffset()) - getPaddingLeft()) - getPaddingRight(), alignment2, 1.0f, 0.0f, true);
            this.f55089L0 = staticLayout;
            iMax = Math.max(staticLayout.getLineCount(), this.f55134z);
        }
        float f = iMax;
        if (this.f55071B != f) {
            m80463n(f).start();
        }
        this.f55071B = f;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m80459j() {
        int i;
        boolean z = true;
        if (!m80466q()) {
            this.f55094O = true;
            return;
        }
        Editable text = getText();
        int length = text == null ? 0 : text.length();
        if (length < this.f55127s || ((i = this.f55128t) > 0 && length > i)) {
            z = false;
        }
        this.f55094O = z;
    }

    /* JADX INFO: renamed from: k */
    private void m80460k() {
        int buttonsCount = this.f55106W * getButtonsCount();
        int i = 0;
        if (!m80446A()) {
            i = buttonsCount;
            buttonsCount = 0;
        }
        super.setPadding(this.f55122o + this.f55109c + buttonsCount, this.f55120m + this.f55107a, this.f55123p + this.f55110d + i, this.f55121n + this.f55108b);
    }

    /* JADX INFO: renamed from: l */
    private Bitmap[] m80461l(@DrawableRes int i) {
        if (i == -1) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), i, options);
        int iMax = Math.max(options.outWidth, options.outHeight);
        int i2 = this.f55105V;
        options.inSampleSize = iMax > i2 ? iMax / i2 : 1;
        options.inJustDecodeBounds = false;
        return m80462m(BitmapFactory.decodeResource(getResources(), i, options));
    }

    /* JADX INFO: renamed from: m */
    private Bitmap[] m80462m(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap[] bitmapArr = new Bitmap[4];
        Bitmap bitmapM80449E = m80449E(bitmap);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        bitmapArr[0] = bitmapM80449E.copy(config, true);
        Canvas canvas = new Canvas(bitmapArr[0]);
        int i = this.f55119l;
        int i2 = (ie5.m135658a(i) ? RoundedDrawable.DEFAULT_BORDER_COLOR : -1979711488) | (i & 16777215);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        canvas.drawColor(i2, mode);
        bitmapArr[1] = bitmapM80449E.copy(config, true);
        new Canvas(bitmapArr[1]).drawColor(this.f55125q, mode);
        bitmapArr[2] = bitmapM80449E.copy(config, true);
        Canvas canvas2 = new Canvas(bitmapArr[2]);
        int i3 = this.f55119l;
        canvas2.drawColor((ie5.m135658a(i3) ? 1275068416 : 1107296256) | (16777215 & i3), mode);
        bitmapArr[3] = bitmapM80449E.copy(config, true);
        new Canvas(bitmapArr[3]).drawColor(this.f55126r, mode);
        return bitmapArr;
    }

    /* JADX INFO: renamed from: n */
    private ObjectAnimator m80463n(float f) {
        ObjectAnimator objectAnimator = this.f55095O0;
        if (objectAnimator == null) {
            this.f55095O0 = ObjectAnimator.ofFloat(this, "currentBottomLines", f);
        } else {
            objectAnimator.cancel();
            this.f55095O0.setFloatValues(f);
        }
        return this.f55095O0;
    }

    /* JADX INFO: renamed from: o */
    private Typeface m80464o(@NonNull String str) {
        return Typeface.createFromAsset(getContext().getResources().getAssets(), str);
    }

    /* JADX INFO: renamed from: p */
    private int m80465p(int i) {
        return vtd.m199996a(getContext(), i);
    }

    /* JADX INFO: renamed from: q */
    private boolean m80466q() {
        return this.f55127s > 0 || this.f55128t > 0;
    }

    /* JADX INFO: renamed from: r */
    private void m80467r(Context context, AttributeSet attributeSet) {
        int i;
        this.f55105V = m80465p(32);
        this.f55106W = m80465p(48);
        this.f55118k0 = m80465p(32);
        this.f55115i = getResources().getDimensionPixelSize(c2c0.f78349d);
        this.f55132x = getResources().getDimensionPixelSize(c2c0.f78346a);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q9c0.f153398a);
        this.f55079G0 = typedArrayObtainStyledAttributes.getColorStateList(q9c0.f153394E);
        this.f55081H0 = typedArrayObtainStyledAttributes.getColorStateList(q9c0.f153395F);
        this.f55119l = typedArrayObtainStyledAttributes.getColor(q9c0.f153401d, RoundedDrawable.DEFAULT_BORDER_COLOR);
        TypedValue typedValue = new TypedValue();
        try {
            try {
                context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                i = typedValue.data;
            } catch (Exception unused) {
                i = this.f55119l;
            }
        } catch (Exception unused2) {
            int identifier = getResources().getIdentifier("colorPrimary", "attr", getContext().getPackageName());
            if (identifier == 0) {
                throw new RuntimeException("colorPrimary not found");
            }
            context.getTheme().resolveAttribute(identifier, typedValue, true);
            i = typedValue.data;
        }
        this.f55125q = typedArrayObtainStyledAttributes.getColor(q9c0.f153392C, i);
        setFloatingLabelInternal(typedArrayObtainStyledAttributes.getInt(q9c0.f153407j, 0));
        this.f55126r = typedArrayObtainStyledAttributes.getColor(q9c0.f153406i, Color.parseColor("#e7492E"));
        this.f55127s = typedArrayObtainStyledAttributes.getInt(q9c0.f153391B, 0);
        this.f55128t = typedArrayObtainStyledAttributes.getInt(q9c0.f153423z, 0);
        this.f55129u = typedArrayObtainStyledAttributes.getBoolean(q9c0.f153393D, false);
        this.f55072C = typedArrayObtainStyledAttributes.getString(q9c0.f153414q);
        this.f55073D = typedArrayObtainStyledAttributes.getColor(q9c0.f153416s, -1);
        this.f55134z = typedArrayObtainStyledAttributes.getInt(q9c0.f153390A, 0);
        String string = typedArrayObtainStyledAttributes.getString(q9c0.f153399b);
        if (string != null && !isInEditMode()) {
            Typeface typefaceM80464o = m80464o(string);
            this.f55082I = typefaceM80464o;
            this.f55087K0.setTypeface(typefaceM80464o);
        }
        String string2 = typedArrayObtainStyledAttributes.getString(q9c0.f153396G);
        if (string2 != null && !isInEditMode()) {
            Typeface typefaceM80464o2 = m80464o(string2);
            this.f55084J = typefaceM80464o2;
            setTypeface(typefaceM80464o2);
        }
        String string3 = typedArrayObtainStyledAttributes.getString(q9c0.f153411n);
        this.f55086K = string3;
        if (string3 == null) {
            this.f55086K = getHint();
        }
        this.f55114h = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f153410m, this.f55115i);
        this.f55111e = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f153413p, getResources().getDimensionPixelSize(c2c0.f78348c));
        this.f55112f = typedArrayObtainStyledAttributes.getColor(q9c0.f153412o, -1);
        this.f55096P = typedArrayObtainStyledAttributes.getBoolean(q9c0.f153409l, true);
        this.f55113g = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f153403f, getResources().getDimensionPixelSize(c2c0.f78347b));
        this.f55088L = typedArrayObtainStyledAttributes.getBoolean(q9c0.f153417t, false);
        this.f55090M = typedArrayObtainStyledAttributes.getColor(q9c0.f153397H, -1);
        this.f55092N = typedArrayObtainStyledAttributes.getBoolean(q9c0.f153400c, false);
        this.f55098Q = m80461l(typedArrayObtainStyledAttributes.getResourceId(q9c0.f153419v, -1));
        this.f55100R = m80461l(typedArrayObtainStyledAttributes.getResourceId(q9c0.f153421x, -1));
        this.f55104U = typedArrayObtainStyledAttributes.getBoolean(q9c0.f153404g, false);
        this.f55102S = m80461l(k3c0.f120813a);
        this.f55103T = m80461l(k3c0.f120814b);
        this.f55124p0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(q9c0.f153420w, m80465p(16));
        this.f55130v = typedArrayObtainStyledAttributes.getBoolean(q9c0.f153408k, false);
        this.f55131w = typedArrayObtainStyledAttributes.getBoolean(q9c0.f153415r, false);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.padding, R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom});
        int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
        this.f55122o = typedArrayObtainStyledAttributes2.getDimensionPixelSize(1, dimensionPixelSize);
        this.f55120m = typedArrayObtainStyledAttributes2.getDimensionPixelSize(2, dimensionPixelSize);
        this.f55123p = typedArrayObtainStyledAttributes2.getDimensionPixelSize(3, dimensionPixelSize);
        this.f55121n = typedArrayObtainStyledAttributes2.getDimensionPixelSize(4, dimensionPixelSize);
        typedArrayObtainStyledAttributes2.recycle();
        setBackground(null);
        if (this.f55129u) {
            TransformationMethod transformationMethod = getTransformationMethod();
            setSingleLine();
            setTransformationMethod(transformationMethod);
        }
        m80469t();
        m80470u();
        m80471v();
        m80468s();
        m80472w();
        m80459j();
    }

    /* JADX INFO: renamed from: s */
    private void m80468s() {
        addTextChangedListener(new C13196b());
        ViewOnFocusChangeListenerC13197c viewOnFocusChangeListenerC13197c = new ViewOnFocusChangeListenerC13197c();
        this.f55097P0 = viewOnFocusChangeListenerC13197c;
        super.setOnFocusChangeListener(viewOnFocusChangeListenerC13197c);
    }

    private void setFloatingLabelInternal(int i) {
        if (i == 1) {
            this.f55116j = true;
            this.f55117k = false;
        } else if (i != 2) {
            this.f55116j = false;
            this.f55117k = false;
        } else {
            this.f55116j = true;
            this.f55117k = true;
        }
    }

    /* JADX INFO: renamed from: t */
    private void m80469t() {
        int i = 1;
        boolean z = this.f55127s > 0 || this.f55128t > 0 || this.f55129u || this.f55074E != null || this.f55072C != null;
        int i2 = this.f55134z;
        if (i2 > 0) {
            i = i2;
        } else if (!z) {
            i = 0;
        }
        this.f55133y = i;
        this.f55070A = i;
    }

    /* JADX INFO: renamed from: u */
    private void m80470u() {
        this.f55107a = this.f55116j ? this.f55111e + this.f55114h : this.f55114h;
        this.f55087K0.setTextSize(this.f55113g);
        Paint.FontMetrics fontMetrics = this.f55087K0.getFontMetrics();
        int i = (int) ((fontMetrics.descent - fontMetrics.ascent) * this.f55070A);
        boolean z = this.f55088L;
        int i2 = this.f55115i;
        if (!z) {
            i2 *= 2;
        }
        this.f55108b = i + i2;
        int i3 = 0;
        this.f55109c = this.f55098Q == null ? 0 : this.f55106W + this.f55124p0;
        if (this.f55100R != null) {
            i3 = this.f55124p0 + this.f55106W;
        }
        this.f55110d = i3;
        m80460k();
    }

    /* JADX INFO: renamed from: v */
    private void m80471v() {
        if (TextUtils.isEmpty(getText())) {
            m80447C();
        } else {
            Editable text = getText();
            setText((CharSequence) null);
            m80447C();
            setText(text);
            setSelection(text.length());
            this.f55076F = 1.0f;
            this.f55078G = true;
        }
        m80448D();
    }

    /* JADX INFO: renamed from: w */
    private void m80472w() {
        addTextChangedListener(new C13195a());
    }

    /* JADX INFO: renamed from: x */
    private boolean m80473x(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int scrollX = getScrollX() + (this.f55098Q == null ? 0 : this.f55106W + this.f55124p0);
        int scrollX2 = getScrollX() + (this.f55100R == null ? getWidth() : (getWidth() - this.f55106W) - this.f55124p0);
        if (!m80446A()) {
            scrollX = scrollX2 - this.f55106W;
        }
        int scrollY = ((getScrollY() + getHeight()) - getPaddingBottom()) + this.f55115i;
        int i = this.f55118k0;
        int i2 = scrollY - i;
        return x >= ((float) scrollX) && x < ((float) (scrollX + this.f55106W)) && y >= ((float) i2) && y < ((float) (i2 + i));
    }

    /* JADX INFO: renamed from: z */
    private boolean m80474z() {
        return this.f55074E == null && m80477y();
    }

    /* JADX INFO: renamed from: B */
    public boolean m80475B() {
        return this.f55104U;
    }

    /* JADX INFO: renamed from: F */
    public boolean m80476F() {
        List<zgw> list = this.f55101R0;
        if (list == null || list.isEmpty()) {
            return true;
        }
        Editable text = getText();
        boolean z = text.length() == 0;
        boolean z2 = true;
        for (zgw zgwVar : this.f55101R0) {
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
        return this.f55082I;
    }

    public int getBottomTextSize() {
        return this.f55113g;
    }

    public float getCurrentBottomLines() {
        return this.f55070A;
    }

    @Override // android.widget.TextView
    public CharSequence getError() {
        return this.f55074E;
    }

    public int getErrorColor() {
        return this.f55126r;
    }

    public float getFloatingLabelFraction() {
        return this.f55076F;
    }

    public int getFloatingLabelPadding() {
        return this.f55114h;
    }

    public CharSequence getFloatingLabelText() {
        return this.f55086K;
    }

    public int getFloatingLabelTextColor() {
        return this.f55112f;
    }

    public int getFloatingLabelTextSize() {
        return this.f55111e;
    }

    public float getFocusFraction() {
        return this.f55080H;
    }

    public String getHelperText() {
        return this.f55072C;
    }

    public int getHelperTextColor() {
        return this.f55073D;
    }

    public int getInnerPaddingBottom() {
        return this.f55121n;
    }

    public int getInnerPaddingLeft() {
        return this.f55122o;
    }

    public int getInnerPaddingRight() {
        return this.f55123p;
    }

    public int getInnerPaddingTop() {
        return this.f55120m;
    }

    public int getMaxCharacters() {
        return this.f55128t;
    }

    public int getMinBottomTextLines() {
        return this.f55134z;
    }

    public int getMinCharacters() {
        return this.f55127s;
    }

    public int getUnderlineColor() {
        return this.f55090M;
    }

    @Nullable
    public List<zgw> getValidators() {
        return this.f55101R0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int innerPaddingLeft;
        int i;
        char c;
        char c2;
        Canvas canvas2 = canvas;
        int scrollX = getScrollX() + (this.f55098Q == null ? 0 : this.f55106W + this.f55124p0);
        int scrollX2 = getScrollX() + (this.f55100R == null ? getWidth() : (getWidth() - this.f55106W) - this.f55124p0);
        int scrollY = (getScrollY() + getHeight()) - getPaddingBottom();
        this.f55085J0.setAlpha(255);
        Bitmap[] bitmapArr = this.f55098Q;
        if (bitmapArr != null) {
            if (!m80474z()) {
                c2 = 3;
            } else if (isEnabled()) {
                c2 = hasFocus() ? (char) 1 : (char) 0;
            } else {
                c2 = 2;
            }
            Bitmap bitmap = bitmapArr[c2];
            int i2 = scrollX - this.f55124p0;
            int i3 = this.f55106W;
            int width = (i2 - i3) + ((i3 - bitmap.getWidth()) / 2);
            int i4 = this.f55115i + scrollY;
            int i5 = this.f55118k0;
            canvas2.drawBitmap(bitmap, width, (i4 - i5) + ((i5 - bitmap.getHeight()) / 2), this.f55085J0);
        }
        Bitmap[] bitmapArr2 = this.f55100R;
        if (bitmapArr2 != null) {
            if (!m80474z()) {
                c = 3;
            } else if (isEnabled()) {
                c = hasFocus() ? (char) 1 : (char) 0;
            } else {
                c = 2;
            }
            Bitmap bitmap2 = bitmapArr2[c];
            int width2 = this.f55124p0 + scrollX2 + ((this.f55106W - bitmap2.getWidth()) / 2);
            int i6 = this.f55115i + scrollY;
            int i7 = this.f55118k0;
            canvas2.drawBitmap(bitmap2, width2, (i6 - i7) + ((i7 - bitmap2.getHeight()) / 2), this.f55085J0);
        }
        if (hasFocus() && this.f55104U) {
            this.f55085J0.setAlpha(255);
            int i8 = m80446A() ? scrollX : scrollX2 - this.f55106W;
            Bitmap bitmap3 = TextUtils.isEmpty(getText()) ? this.f55103T[0] : this.f55102S[0];
            int width3 = i8 + ((this.f55106W - bitmap3.getWidth()) / 2);
            int i9 = this.f55115i + scrollY;
            int i10 = this.f55118k0;
            canvas2.drawBitmap(bitmap3, width3, (i9 - i10) + ((i10 - bitmap3.getHeight()) / 2), this.f55085J0);
        }
        if (!this.f55088L) {
            int i11 = scrollY + this.f55115i;
            if (m80474z()) {
                if (isEnabled()) {
                    boolean zHasFocus = hasFocus();
                    Paint paint = this.f55085J0;
                    if (zHasFocus) {
                        paint.setColor(this.f55125q);
                        canvas2 = canvas;
                        canvas2.drawRect(scrollX, i11, scrollX2, m80465p(2) + i11, this.f55085J0);
                    } else {
                        int i12 = this.f55090M;
                        if (i12 == -1) {
                            i12 = (this.f55119l & 16777215) | 503316480;
                        }
                        paint.setColor(i12);
                        canvas2 = canvas;
                        canvas2.drawRect(scrollX, i11, scrollX2, m80465p(1) + i11, this.f55085J0);
                    }
                } else {
                    Paint paint2 = this.f55085J0;
                    int i13 = this.f55090M;
                    if (i13 == -1) {
                        i13 = (this.f55119l & 16777215) | 1140850688;
                    }
                    paint2.setColor(i13);
                    float fM80465p = m80465p(1);
                    float f = 0.0f;
                    while (f < getWidth()) {
                        float f2 = scrollX + f;
                        float f3 = fM80465p;
                        canvas.drawRect(f2, i11, f2 + fM80465p, m80465p(1) + i11, this.f55085J0);
                        f += 3.0f * f3;
                        fM80465p = f3;
                    }
                }
                scrollY = i11;
            } else {
                this.f55085J0.setColor(this.f55126r);
                canvas2.drawRect(scrollX, i11, scrollX2, m80465p(2) + i11, this.f55085J0);
            }
            canvas2 = canvas;
            scrollY = i11;
        }
        this.f55087K0.setTextSize(this.f55113g);
        Paint.FontMetrics fontMetrics = this.f55087K0.getFontMetrics();
        float f4 = fontMetrics.ascent;
        float f5 = fontMetrics.descent;
        float f6 = (-f4) - f5;
        float f7 = this.f55113g + f4 + f5;
        if ((hasFocus() && m80466q()) || !m80477y()) {
            this.f55087K0.setColor(m80477y() ? (this.f55119l & 16777215) | 1140850688 : this.f55126r);
            String charactersCounterText = getCharactersCounterText();
            canvas2.drawText(charactersCounterText, m80446A() ? scrollX : scrollX2 - this.f55087K0.measureText(charactersCounterText), this.f55115i + scrollY + f6, this.f55087K0);
        }
        if (this.f55089L0 != null && (this.f55074E != null || ((this.f55131w || hasFocus()) && !TextUtils.isEmpty(this.f55072C)))) {
            TextPaint textPaint = this.f55087K0;
            if (this.f55074E != null) {
                i = this.f55126r;
            } else {
                i = this.f55073D;
                if (i == -1) {
                    i = (this.f55119l & 16777215) | 1140850688;
                }
            }
            textPaint.setColor(i);
            canvas2.save();
            canvas2.translate(getBottomTextLeftOffset() + scrollX, (this.f55115i + scrollY) - f7);
            this.f55089L0.draw(canvas2);
            canvas2.restore();
        }
        if (this.f55116j && !TextUtils.isEmpty(this.f55086K)) {
            this.f55087K0.setTextSize(this.f55111e);
            TextPaint textPaint2 = this.f55087K0;
            ArgbEvaluator argbEvaluator = this.f55083I0;
            float f8 = this.f55080H;
            int i14 = this.f55112f;
            if (i14 == -1) {
                i14 = (16777215 & this.f55119l) | 1140850688;
            }
            textPaint2.setColor(((Integer) argbEvaluator.evaluate(f8, Integer.valueOf(i14), Integer.valueOf(this.f55125q))).intValue());
            float fMeasureText = this.f55087K0.measureText(this.f55086K.toString());
            if ((getGravity() & 5) == 5 || m80446A()) {
                innerPaddingLeft = (int) (scrollX2 - fMeasureText);
            } else {
                innerPaddingLeft = (getGravity() & 3) == 3 ? scrollX : ((int) (getInnerPaddingLeft() + ((((getWidth() - getInnerPaddingLeft()) - getInnerPaddingRight()) - fMeasureText) / 2.0f))) + scrollX;
            }
            int i15 = this.f55120m + this.f55111e;
            int i16 = this.f55114h;
            float f9 = i15 + i16;
            float f10 = i16;
            boolean z = this.f55130v;
            int i17 = (int) (f9 - (f10 * (z ? 1.0f : this.f55076F)));
            this.f55087K0.setAlpha((int) ((z ? 1.0f : this.f55076F) * 255.0f * (this.f55112f == -1 ? (this.f55080H * 0.74f) + 0.26f : 1.0f)));
            canvas2.drawText(this.f55086K.toString(), innerPaddingLeft, i17, this.f55087K0);
        }
        if (hasFocus() && this.f55129u && getScrollX() != 0) {
            this.f55085J0.setColor(this.f55125q);
            float f11 = scrollY + this.f55115i;
            if (m80446A()) {
                scrollX = scrollX2;
            }
            int i18 = m80446A() ? -1 : 1;
            int i19 = this.f55132x;
            canvas2.drawCircle(((i18 * i19) / 2) + scrollX, (i19 / 2) + f11, i19 / 2, this.f55085J0);
            int i20 = this.f55132x;
            canvas2.drawCircle((((i18 * i20) * 5) / 2) + scrollX, (i20 / 2) + f11, i20 / 2, this.f55085J0);
            int i21 = this.f55132x;
            canvas2.drawCircle(scrollX + (((i18 * i21) * 9) / 2), f11 + (i21 / 2), i21 / 2, this.f55085J0);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m80458i();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f55129u && getScrollX() > 0 && motionEvent.getAction() == 0 && motionEvent.getX() < m80465p(20) && motionEvent.getY() > (getHeight() - this.f55108b) - this.f55121n && motionEvent.getY() < getHeight() - this.f55121n) {
            setSelection(0);
            return false;
        }
        if (hasFocus() && this.f55104U) {
            int action = motionEvent.getAction();
            if (action == 0) {
                if (m80473x(motionEvent)) {
                    this.f55075E0 = true;
                    this.f55077F0 = true;
                }
                return true;
            }
            if (action == 1) {
                if (this.f55077F0) {
                    if (!TextUtils.isEmpty(getText())) {
                        setText((CharSequence) null);
                    }
                    this.f55077F0 = false;
                }
                if (this.f55075E0) {
                    this.f55075E0 = false;
                    return true;
                }
                this.f55075E0 = false;
            } else if (action == 2) {
                if (this.f55077F0 && !m80473x(motionEvent)) {
                    this.f55077F0 = false;
                }
                if (this.f55075E0) {
                    return true;
                }
            } else if (action == 3) {
                this.f55075E0 = false;
                this.f55077F0 = false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentTypeface(Typeface typeface) {
        this.f55082I = typeface;
        this.f55087K0.setTypeface(typeface);
        postInvalidate();
    }

    public void setAutoValidate(boolean z) {
        this.f55092N = z;
        if (z) {
            m80476F();
        }
    }

    public void setBaseColor(int i) {
        if (this.f55119l != i) {
            this.f55119l = i;
        }
        m80471v();
        postInvalidate();
    }

    public void setBottomTextSize(int i) {
        this.f55113g = i;
        m80470u();
    }

    public void setCurrentBottomLines(float f) {
        this.f55070A = f;
        m80470u();
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence) {
        this.f55074E = charSequence == null ? null : charSequence.toString();
        if (m80458i()) {
            postInvalidate();
        }
    }

    public void setErrorColor(int i) {
        this.f55126r = i;
        postInvalidate();
    }

    public void setFloatingLabel(int i) {
        setFloatingLabelInternal(i);
        m80470u();
    }

    public void setFloatingLabelAlwaysShown(boolean z) {
        this.f55130v = z;
        invalidate();
    }

    public void setFloatingLabelAnimating(boolean z) {
        this.f55096P = z;
    }

    public void setFloatingLabelFraction(float f) {
        this.f55076F = f;
        invalidate();
    }

    public void setFloatingLabelPadding(int i) {
        this.f55114h = i;
        postInvalidate();
    }

    public void setFloatingLabelText(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getHint();
        }
        this.f55086K = charSequence;
        postInvalidate();
    }

    public void setFloatingLabelTextColor(int i) {
        this.f55112f = i;
        postInvalidate();
    }

    public void setFloatingLabelTextSize(int i) {
        this.f55111e = i;
        m80470u();
    }

    public void setFocusFraction(float f) {
        this.f55080H = f;
        invalidate();
    }

    public void setHelperText(CharSequence charSequence) {
        this.f55072C = charSequence == null ? null : charSequence.toString();
        if (m80458i()) {
            postInvalidate();
        }
    }

    public void setHelperTextAlwaysShown(boolean z) {
        this.f55131w = z;
        invalidate();
    }

    public void setHelperTextColor(int i) {
        this.f55073D = i;
        postInvalidate();
    }

    public void setHideUnderline(boolean z) {
        this.f55088L = z;
        m80470u();
        postInvalidate();
    }

    public void setIconLeft(@DrawableRes int i) {
        this.f55098Q = m80461l(i);
        m80470u();
    }

    public void setIconRight(@DrawableRes int i) {
        this.f55100R = m80461l(i);
        m80470u();
    }

    public void setMaxCharacters(int i) {
        this.f55128t = i;
        m80469t();
        m80470u();
        postInvalidate();
    }

    public void setMetHintTextColor(int i) {
        this.f55081H0 = ColorStateList.valueOf(i);
        m80447C();
    }

    public void setMetTextColor(int i) {
        this.f55079G0 = ColorStateList.valueOf(i);
        m80448D();
    }

    public void setMinBottomTextLines(int i) {
        this.f55134z = i;
        m80469t();
        m80470u();
        postInvalidate();
    }

    public void setMinCharacters(int i) {
        this.f55127s = i;
        m80469t();
        m80470u();
        postInvalidate();
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        if (this.f55097P0 == null) {
            super.setOnFocusChangeListener(onFocusChangeListener);
        } else {
            this.f55099Q0 = onFocusChangeListener;
        }
    }

    @Override // android.widget.TextView, android.view.View
    @Deprecated
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    public void setPrimaryColor(int i) {
        this.f55125q = i;
        postInvalidate();
    }

    public void setShowClearButton(boolean z) {
        this.f55104U = z;
        m80460k();
    }

    public void setSingleLineEllipsis(boolean z) {
        this.f55129u = z;
        m80469t();
        m80470u();
        postInvalidate();
    }

    public void setUnderlineColor(int i) {
        this.f55090M = i;
        postInvalidate();
    }

    /* JADX INFO: renamed from: y */
    public boolean m80477y() {
        return this.f55094O;
    }

    public void setIconLeft(Bitmap bitmap) {
        this.f55098Q = m80462m(bitmap);
        m80470u();
    }

    public void setIconRight(Bitmap bitmap) {
        this.f55100R = m80462m(bitmap);
        m80470u();
    }

    public void setMetHintTextColor(ColorStateList colorStateList) {
        this.f55081H0 = colorStateList;
        m80447C();
    }

    public void setMetTextColor(ColorStateList colorStateList) {
        this.f55079G0 = colorStateList;
        m80448D();
    }

    public MaterialMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55073D = -1;
        this.f55083I0 = new ArgbEvaluator();
        this.f55085J0 = new Paint(1);
        this.f55087K0 = new TextPaint(1);
        m80467r(context, attributeSet);
    }

    @TargetApi(21)
    public MaterialMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55073D = -1;
        this.f55083I0 = new ArgbEvaluator();
        this.f55085J0 = new Paint(1);
        this.f55087K0 = new TextPaint(1);
        m80467r(context, attributeSet);
    }
}
