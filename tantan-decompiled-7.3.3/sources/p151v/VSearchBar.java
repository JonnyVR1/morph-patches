package p151v;

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
import com.google.android.gms.common.api.Api;
import p153l.abc0;
import p153l.gec0;
import p153l.hhc0;
import p153l.qa00;
import p153l.qnp0;
import p153l.vcc0;

/* JADX INFO: loaded from: classes3.dex */
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
        m224447e(context, attributeSet);
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
    public void m224446d(TextWatcher textWatcher) {
        this.mTextWatcher = textWatcher;
    }

    /* JADX INFO: renamed from: e */
    public final void m224447e(Context context, AttributeSet attributeSet) {
        String string;
        int resourceId;
        int resourceId2;
        int resourceId3;
        int color;
        int color2;
        String string2;
        LayoutInflater.from(context).inflate(gec0.f103809v, this);
        this.mEditText = (VEditText) findViewById(vcc0.f183369H);
        this.mClearLayout = (FrameLayout) findViewById(vcc0.f183401X);
        this.mCancelText = (VText) findViewById(vcc0.f183434p);
        this.mClearImg = (VIcon) findViewById(vcc0.f183393T);
        qnp0.m177262e1(this.mEditText, abc0.f69560u);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109696a1);
            resourceId = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109745h1, -1);
            resourceId2 = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109752i1, -1);
            string = typedArrayObtainStyledAttributes.getString(hhc0.f109717d1);
            color = typedArrayObtainStyledAttributes.getColor(hhc0.f109703b1, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            color2 = typedArrayObtainStyledAttributes.getColor(hhc0.f109710c1, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            string2 = typedArrayObtainStyledAttributes.getString(hhc0.f109738g1);
            resourceId3 = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109724e1, -1);
            this.cancelVisibleIndex = typedArrayObtainStyledAttributes.getInt(hhc0.f109731f1, 0);
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
        this.mCancelText.setOnClickListener(new View.OnClickListener() { // from class: l.lzk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134235a.m224448f(view);
            }
        });
        this.mClearLayout.setOnClickListener(new View.OnClickListener() { // from class: l.mzk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139531a.m224449g(view);
            }
        });
        this.mEditText.addTextChangedListener(this);
        this.mEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.nzk0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.f144452a.m224450h(view, z);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m224448f(View view) {
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
    public final /* synthetic */ void m224449g(View view) {
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

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m224450h(View view, boolean z) {
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
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(qa00.f156339z, 1073741824));
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

    public void setCancelTextColor(int i) {
        VText vText = this.mCancelText;
        if (vText != null) {
            vText.setTextColor(i);
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
