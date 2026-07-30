package p147v;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.google.android.gms.common.api.Api;
import p149l.b6c0;
import p149l.b9c0;
import p149l.p4c0;
import p149l.t100;
import p149l.u2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class VMenuBar<V extends View> extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f209204d;

    /* JADX INFO: renamed from: e */
    public VText f209205e;

    /* JADX INFO: renamed from: f */
    public VText f209206f;

    /* JADX INFO: renamed from: g */
    public VIcon f209207g;

    /* JADX INFO: renamed from: h */
    public VIcon f209208h;

    /* JADX INFO: renamed from: i */
    public VIcon f209209i;

    /* JADX INFO: renamed from: j */
    public VLine f209210j;

    /* JADX INFO: renamed from: k */
    public ViewStub f209211k;

    /* JADX INFO: renamed from: l */
    public View f209212l;

    public VMenuBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m223130h0(context, attributeSet);
    }

    /* JADX INFO: renamed from: h0 */
    private void m223130h0(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(b6c0.f73789o, this);
        setBackgroundResource(u2c0.f173454w);
        this.f209204d = (VText) findViewById(p4c0.f147111d0);
        this.f209205e = (VText) findViewById(p4c0.f147068G0);
        VText vText = (VText) findViewById(p4c0.f147138r);
        this.f209206f = vText;
        vText.setTypeface(vText.getTypeface(), 1);
        this.f209207g = (VIcon) findViewById(p4c0.f147107b0);
        this.f209208h = (VIcon) findViewById(p4c0.f147064E0);
        this.f209209i = (VIcon) findViewById(p4c0.f147136q);
        this.f209210j = (VLine) findViewById(p4c0.f147122j);
        this.f209211k = (ViewStub) findViewById(p4c0.f147140s);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74554y0);
        String string = typedArrayObtainStyledAttributes.getString(b9c0.f74262G0);
        String string2 = typedArrayObtainStyledAttributes.getString(b9c0.f74276I0);
        String string3 = typedArrayObtainStyledAttributes.getString(b9c0.f74248E0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74234C0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74241D0, -1);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74227B0, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74561z0, true);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74220A0, -1);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(b9c0.f74269H0);
        ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(b9c0.f74283J0);
        ColorStateList colorStateList3 = typedArrayObtainStyledAttributes.getColorStateList(b9c0.f74255F0);
        int color = typedArrayObtainStyledAttributes.getColor(b9c0.f74269H0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        int color2 = typedArrayObtainStyledAttributes.getColor(b9c0.f74283J0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        int color3 = typedArrayObtainStyledAttributes.getColor(b9c0.f74255F0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        typedArrayObtainStyledAttributes.recycle();
        this.f209204d.setText(string);
        if (color != Integer.MAX_VALUE) {
            this.f209204d.setTextColor(color);
        }
        if (colorStateList != null) {
            this.f209204d.setTextColor(colorStateList);
        }
        boolean zIsEmpty = TextUtils.isEmpty(string);
        VText vText2 = this.f209204d;
        if (zIsEmpty) {
            vText2.setVisibility(8);
        } else {
            vText2.setVisibility(0);
        }
        this.f209205e.setText(string2);
        if (color2 != Integer.MAX_VALUE) {
            this.f209205e.setTextColor(color2);
        }
        if (colorStateList2 != null) {
            this.f209205e.setTextColor(colorStateList2);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(string2);
        VText vText3 = this.f209205e;
        if (zIsEmpty2) {
            vText3.setVisibility(8);
        } else {
            vText3.setVisibility(0);
        }
        this.f209206f.setText(string3);
        if (color3 != Integer.MAX_VALUE) {
            this.f209206f.setTextColor(color3);
        }
        if (colorStateList3 != null) {
            this.f209206f.setTextColor(colorStateList3);
        }
        boolean zIsEmpty3 = TextUtils.isEmpty(string3);
        VText vText4 = this.f209206f;
        if (zIsEmpty3) {
            vText4.setVisibility(8);
        } else {
            vText4.setVisibility(0);
        }
        VIcon vIcon = this.f209207g;
        if (resourceId != -1) {
            vIcon.setVisibility(0);
            this.f209207g.setImageResource(resourceId);
        } else {
            vIcon.setVisibility(8);
        }
        VIcon vIcon2 = this.f209208h;
        if (resourceId2 != -1) {
            vIcon2.setVisibility(0);
            this.f209208h.setImageResource(resourceId2);
        } else {
            vIcon2.setVisibility(8);
        }
        VIcon vIcon3 = this.f209209i;
        if (resourceId3 != -1) {
            vIcon3.setVisibility(0);
            this.f209209i.setImageResource(resourceId3);
        } else {
            vIcon3.setVisibility(8);
        }
        this.f209210j.setVisibility(z ? 0 : 8);
        if (resourceId4 != -1) {
            this.f209211k.setLayoutResource(resourceId4);
            this.f209212l = this.f209211k.inflate();
        }
    }

    public V getCenterCustomView() {
        return (V) this.f209212l;
    }

    /* JADX INFO: renamed from: i0 */
    public void m223131i0(boolean z) {
        this.f209210j.setVisibility(z ? 0 : 8);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(t100.m186890d(62.0f), 1073741824));
    }

    public void setCenterCustomLayoutRes(int i) {
        if (i > 0) {
            this.f209211k.setLayoutResource(i);
            this.f209212l = this.f209211k.inflate();
        }
    }

    public <V extends View> void setCenterCustomView(V v2) {
        if (v2 != null) {
            Constraints.C0221a c0221a = new Constraints.C0221a(-2, -2);
            c0221a.f1257k = 0;
            c0221a.f1266q = 0;
            c0221a.f1251h = 0;
            c0221a.f1268s = 0;
            addView(v2, c0221a);
            this.f209212l = v2;
        }
    }

    public void setCenterImage(@DrawableRes int i) {
        VIcon vIcon = this.f209209i;
        if (i == -1) {
            vIcon.setVisibility(8);
        } else {
            vIcon.setVisibility(0);
            this.f209209i.setImageResource(i);
        }
    }

    public void setCenterRegionClick(View.OnClickListener onClickListener) {
        this.f209209i.setOnClickListener(onClickListener);
        this.f209206f.setOnClickListener(onClickListener);
    }

    public void setCenterTextColor(@ColorInt int i) {
        this.f209206f.setTextColor(i);
    }

    public void setCenterTextView(@StringRes int i) {
        String string = getResources().getString(i);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f209206f.setText(string);
        this.f209206f.setVisibility(0);
    }

    public void setLeftImage(@DrawableRes int i) {
        VIcon vIcon = this.f209207g;
        if (i == -1) {
            vIcon.setVisibility(8);
        } else {
            vIcon.setVisibility(0);
            this.f209207g.setImageResource(i);
        }
    }

    public void setLeftRegionClick(View.OnClickListener onClickListener) {
        this.f209207g.setOnClickListener(onClickListener);
        this.f209204d.setOnClickListener(onClickListener);
    }

    public void setLeftTextView(@StringRes int i) {
        String string = getResources().getString(i);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f209204d.setText(string);
        this.f209204d.setVisibility(0);
    }

    public void setRightImage(@DrawableRes int i) {
        VIcon vIcon = this.f209208h;
        if (i == -1) {
            vIcon.setVisibility(8);
        } else {
            vIcon.setVisibility(0);
            this.f209208h.setImageResource(i);
        }
    }

    public void setRightRegionClick(View.OnClickListener onClickListener) {
        this.f209208h.setOnClickListener(onClickListener);
        this.f209205e.setOnClickListener(onClickListener);
    }

    public void setRightTextColor(@ColorInt int i) {
        this.f209205e.setTextColor(i);
    }

    public void setRightTextMarginEnd(int i) {
        xdl0.m208359W(this.f209205e, i);
    }

    public void setRightTextSize(float f) {
        this.f209205e.setTextSize(f);
    }

    public void setRightTextView(@StringRes int i) {
        String string = getResources().getString(i);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f209205e.setText(string);
        this.f209205e.setVisibility(0);
    }

    public VMenuBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VMenuBar(@NonNull Context context) {
        this(context, null);
    }

    public void setCenterTextView(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f209206f.setText(charSequence);
        this.f209206f.setVisibility(0);
    }

    public void setLeftTextView(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f209204d.setText(charSequence);
        this.f209204d.setVisibility(0);
    }

    public void setRightTextView(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f209205e.setText(charSequence);
        this.f209205e.setVisibility(0);
    }
}
