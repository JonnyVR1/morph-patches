package p028v;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import l.b6c0;
import l.b9c0;
import l.p4c0;
import l.t100;
import l.u2c0;
import p003l.mep0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VSearchBar extends RelativeLayout implements TextWatcher {
    private static final int CANCEL_BEHAVIOR_EXTINCT = 2;
    private static final int CANCEL_BEHAVIOR_FLOAT = 0;
    private static final int CANCEL_BEHAVIOR_PIN = 1;
    private int cancelVisibleIndex;
    private View.OnClickListener mCancelListener;
    private VText mCancelText;
    private VIcon mClearImg;
    private FrameLayout mClearLayout;
    private View.OnClickListener mClearListener;
    private VEditText mEditText;
    private View.OnFocusChangeListener mFocusChangeListener;
    private TextWatcher mTextWatcher;

    public VSearchBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.cancelVisibleIndex = 0;
        m11685e(context, attributeSet);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.mClearLayout.setVisibility(editable.length() > 0 ? 0 : 8);
        TextWatcher textWatcher = this.mTextWatcher;
        if (textWatcher != null) {
            textWatcher.afterTextChanged(editable);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        TextWatcher textWatcher = this.mTextWatcher;
        if (textWatcher != null) {
            textWatcher.beforeTextChanged(charSequence, i, i2, i3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.mEditText.clearFocus();
    }

    /* JADX INFO: renamed from: d */
    public void m11684d(TextWatcher textWatcher) {
        this.mTextWatcher = textWatcher;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: e */
    public final void m11685e(Context context, AttributeSet attributeSet) {
        String string;
        int resourceId;
        int resourceId2;
        int resourceId3;
        int color;
        int color2;
        CharSequence string2;
        LayoutInflater.from(context).inflate(b6c0.v, this);
        this.mEditText = (VEditText) findViewById(p4c0.H);
        this.mClearLayout = (FrameLayout) findViewById(p4c0.X);
        this.mCancelText = (VText) findViewById(p4c0.p);
        this.mClearImg = (VIcon) findViewById(p4c0.T);
        mep0.m6391e1(this.mEditText, u2c0.u);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.a1);
            resourceId = typedArrayObtainStyledAttributes.getResourceId(b9c0.h1, -1);
            resourceId2 = typedArrayObtainStyledAttributes.getResourceId(b9c0.i1, -1);
            string = typedArrayObtainStyledAttributes.getString(b9c0.d1);
            color = typedArrayObtainStyledAttributes.getColor(b9c0.b1, Integer.MAX_VALUE);
            color2 = typedArrayObtainStyledAttributes.getColor(b9c0.c1, Integer.MAX_VALUE);
            string2 = typedArrayObtainStyledAttributes.getString(b9c0.g1);
            resourceId3 = typedArrayObtainStyledAttributes.getResourceId(b9c0.e1, -1);
            this.cancelVisibleIndex = typedArrayObtainStyledAttributes.getInt(b9c0.f1, 0);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            string = null;
            resourceId = -1;
            resourceId2 = -1;
            resourceId3 = -1;
            color = Integer.MAX_VALUE;
            color2 = Integer.MAX_VALUE;
            string2 = null;
        }
        if (resourceId != -1) {
            this.mEditText.setCompoundDrawablesWithIntrinsicBounds(resourceId, 0, 0, 0);
        }
        if (!TextUtils.isEmpty(string)) {
            this.mEditText.setHint(string);
        }
        if (color != Integer.MAX_VALUE) {
            this.mEditText.setTextColor(color);
        }
        if (color2 != Integer.MAX_VALUE) {
            this.mEditText.setHintTextColor(color2);
        }
        if (resourceId2 != -1) {
            this.mClearImg.setImageResource(resourceId2);
        }
        if (!TextUtils.isEmpty(string2)) {
            this.mCancelText.setText(string2);
        }
        if (resourceId3 != -1) {
            this.mCancelText.setBackgroundResource(resourceId3);
        }
        this.mCancelText.setVisibility(this.cancelVisibleIndex != 1 ? 8 : 0);
        this.mCancelText.setOnClickListener(new View.OnClickListener() { // from class: l.fqk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3684a.m11686f(view);
            }
        });
        this.mClearLayout.setOnClickListener(new View.OnClickListener() { // from class: l.gqk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3986a.m11687g(view);
            }
        });
        this.mEditText.addTextChangedListener(this);
        this.mEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.hqk0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f4259a.m11688h(view, z);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m11686f(View view) {
        if (this.cancelVisibleIndex != 1) {
            this.mCancelText.setVisibility(8);
        }
        this.mEditText.setText("");
        this.mEditText.clearFocus();
        this.mClearLayout.setVisibility(8);
        View.OnClickListener onClickListener = this.mCancelListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m11687g(View view) {
        this.mEditText.setText("");
        this.mClearLayout.setVisibility(8);
        View.OnClickListener onClickListener = this.mClearListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public VText getCancelText() {
        return this.mCancelText;
    }

    public FrameLayout getClearLayout() {
        return this.mClearLayout;
    }

    public VEditText getEditText() {
        return this.mEditText;
    }

    public Editable getInput() {
        return this.mEditText.getText();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m11688h(View view, boolean z) {
        View.OnFocusChangeListener onFocusChangeListener = this.mFocusChangeListener;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
        int i = this.cancelVisibleIndex;
        if (i == 2) {
            return;
        }
        if (z) {
            this.mCancelText.setVisibility(0);
        } else if (i != 1) {
            this.mCancelText.setVisibility(this.mEditText.getText().length() <= 0 ? 8 : 0);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(t100.z, 1073741824));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        TextWatcher textWatcher = this.mTextWatcher;
        if (textWatcher != null) {
            textWatcher.onTextChanged(charSequence, i, i2, i3);
        }
    }

    public void setCancelListener(View.OnClickListener onClickListener) {
        this.mCancelListener = onClickListener;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setCancelTextColor(int i) {
        AppCompatTextView appCompatTextView = this.mCancelText;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(i);
        }
    }

    public void setClearListener(View.OnClickListener onClickListener) {
        this.mClearListener = onClickListener;
    }

    public void setEditTextBg(int i) {
        VEditText vEditText = this.mEditText;
        if (vEditText != null) {
            vEditText.setBackgroundResource(i);
        }
    }

    public void setEditTextColor(int i) {
        VEditText vEditText = this.mEditText;
        if (vEditText != null) {
            vEditText.setTextColor(i);
        }
    }

    public void setEditTextHintColor(int i) {
        VEditText vEditText = this.mEditText;
        if (vEditText != null) {
            vEditText.setHintTextColor(i);
        }
    }

    public void setFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.mFocusChangeListener = onFocusChangeListener;
    }

    public void setLeftImageRes(int i) {
        VEditText vEditText = this.mEditText;
        if (vEditText != null) {
            vEditText.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        }
    }

    public void setRightImageRes(int i) {
        if (this.mEditText != null) {
            this.mClearImg.setImageResource(i);
        }
    }

    public VSearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VSearchBar(Context context) {
        this(context, null);
    }
}
