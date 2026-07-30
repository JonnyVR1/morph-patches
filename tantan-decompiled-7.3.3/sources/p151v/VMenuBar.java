package p151v;

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
import p153l.abc0;
import p153l.bnl0;
import p153l.gec0;
import p153l.hhc0;
import p153l.qa00;
import p153l.vcc0;

/* JADX INFO: loaded from: classes3.dex */
public class VMenuBar<V extends View> extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f210126d;

    /* JADX INFO: renamed from: e */
    public VText f210127e;

    /* JADX INFO: renamed from: f */
    public VText f210128f;

    /* JADX INFO: renamed from: g */
    public VIcon f210129g;

    /* JADX INFO: renamed from: h */
    public VIcon f210130h;

    /* JADX INFO: renamed from: i */
    public VIcon f210131i;

    /* JADX INFO: renamed from: j */
    public VLine f210132j;

    /* JADX INFO: renamed from: k */
    public ViewStub f210133k;

    /* JADX INFO: renamed from: l */
    public View f210134l;

    public VMenuBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m224376h0(context, attributeSet);
    }

    /* JADX INFO: renamed from: h0 */
    private void m224376h0(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(gec0.f103802o, this);
        setBackgroundResource(abc0.f69574w);
        this.f210126d = (VText) findViewById(vcc0.f183411d0);
        this.f210127e = (VText) findViewById(vcc0.f183368G0);
        VText vText = (VText) findViewById(vcc0.f183438r);
        this.f210128f = vText;
        vText.setTypeface(vText.getTypeface(), 1);
        this.f210129g = (VIcon) findViewById(vcc0.f183407b0);
        this.f210130h = (VIcon) findViewById(vcc0.f183364E0);
        this.f210131i = (VIcon) findViewById(vcc0.f183436q);
        this.f210132j = (VLine) findViewById(vcc0.f183422j);
        this.f210133k = (ViewStub) findViewById(vcc0.f183440s);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109863y0);
        String string = typedArrayObtainStyledAttributes.getString(hhc0.f109571G0);
        String string2 = typedArrayObtainStyledAttributes.getString(hhc0.f109585I0);
        String string3 = typedArrayObtainStyledAttributes.getString(hhc0.f109557E0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109543C0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109550D0, -1);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109536B0, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109870z0, true);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109529A0, -1);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(hhc0.f109578H0);
        ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(hhc0.f109592J0);
        ColorStateList colorStateList3 = typedArrayObtainStyledAttributes.getColorStateList(hhc0.f109564F0);
        int color = typedArrayObtainStyledAttributes.getColor(hhc0.f109578H0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        int color2 = typedArrayObtainStyledAttributes.getColor(hhc0.f109592J0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        int color3 = typedArrayObtainStyledAttributes.getColor(hhc0.f109564F0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        typedArrayObtainStyledAttributes.recycle();
        this.f210126d.setText(string);
        if (color != Integer.MAX_VALUE) {
            this.f210126d.setTextColor(color);
        }
        if (colorStateList != null) {
            this.f210126d.setTextColor(colorStateList);
        }
        boolean zIsEmpty = TextUtils.isEmpty(string);
        VText vText2 = this.f210126d;
        if (zIsEmpty) {
            vText2.setVisibility(8);
        } else {
            vText2.setVisibility(0);
        }
        this.f210127e.setText(string2);
        if (color2 != Integer.MAX_VALUE) {
            this.f210127e.setTextColor(color2);
        }
        if (colorStateList2 != null) {
            this.f210127e.setTextColor(colorStateList2);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(string2);
        VText vText3 = this.f210127e;
        if (zIsEmpty2) {
            vText3.setVisibility(8);
        } else {
            vText3.setVisibility(0);
        }
        this.f210128f.setText(string3);
        if (color3 != Integer.MAX_VALUE) {
            this.f210128f.setTextColor(color3);
        }
        if (colorStateList3 != null) {
            this.f210128f.setTextColor(colorStateList3);
        }
        boolean zIsEmpty3 = TextUtils.isEmpty(string3);
        VText vText4 = this.f210128f;
        if (zIsEmpty3) {
            vText4.setVisibility(8);
        } else {
            vText4.setVisibility(0);
        }
        VIcon vIcon = this.f210129g;
        if (resourceId != -1) {
            vIcon.setVisibility(0);
            this.f210129g.setImageResource(resourceId);
        } else {
            vIcon.setVisibility(8);
        }
        VIcon vIcon2 = this.f210130h;
        if (resourceId2 != -1) {
            vIcon2.setVisibility(0);
            this.f210130h.setImageResource(resourceId2);
        } else {
            vIcon2.setVisibility(8);
        }
        VIcon vIcon3 = this.f210131i;
        if (resourceId3 != -1) {
            vIcon3.setVisibility(0);
            this.f210131i.setImageResource(resourceId3);
        } else {
            vIcon3.setVisibility(8);
        }
        this.f210132j.setVisibility(z ? 0 : 8);
        if (resourceId4 != -1) {
            this.f210133k.setLayoutResource(resourceId4);
            this.f210134l = this.f210133k.inflate();
        }
    }

    public V getCenterCustomView() {
        return (V) this.f210134l;
    }

    /* JADX INFO: renamed from: i0 */
    public void m224377i0(boolean z) {
        this.f210132j.setVisibility(z ? 0 : 8);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(qa00.m175859d(62.0f), 1073741824));
    }

    public void setCenterCustomLayoutRes(int i) {
        if (i > 0) {
            this.f210133k.setLayoutResource(i);
            this.f210134l = this.f210133k.inflate();
        }
    }

    public <V extends View> void setCenterCustomView(V v2) {
        if (v2 != null) {
            Constraints.C0222a c0222a = new Constraints.C0222a(-2, -2);
            c0222a.f1257k = 0;
            c0222a.f1266q = 0;
            c0222a.f1251h = 0;
            c0222a.f1268s = 0;
            addView(v2, c0222a);
            this.f210134l = v2;
        }
    }

    public void setCenterImage(@DrawableRes int i) {
        VIcon vIcon = this.f210131i;
        if (i == -1) {
            vIcon.setVisibility(8);
        } else {
            vIcon.setVisibility(0);
            this.f210131i.setImageResource(i);
        }
    }

    public void setCenterRegionClick(View.OnClickListener onClickListener) {
        this.f210131i.setOnClickListener(onClickListener);
        this.f210128f.setOnClickListener(onClickListener);
    }

    public void setCenterTextColor(@ColorInt int i) {
        this.f210128f.setTextColor(i);
    }

    public void setCenterTextView(@StringRes int i) {
        String string = getResources().getString(i);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f210128f.setText(string);
        this.f210128f.setVisibility(0);
    }

    public void setLeftImage(@DrawableRes int i) {
        VIcon vIcon = this.f210129g;
        if (i == -1) {
            vIcon.setVisibility(8);
        } else {
            vIcon.setVisibility(0);
            this.f210129g.setImageResource(i);
        }
    }

    public void setLeftRegionClick(View.OnClickListener onClickListener) {
        this.f210129g.setOnClickListener(onClickListener);
        this.f210126d.setOnClickListener(onClickListener);
    }

    public void setLeftTextView(@StringRes int i) {
        String string = getResources().getString(i);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f210126d.setText(string);
        this.f210126d.setVisibility(0);
    }

    public void setRightImage(@DrawableRes int i) {
        VIcon vIcon = this.f210130h;
        if (i == -1) {
            vIcon.setVisibility(8);
        } else {
            vIcon.setVisibility(0);
            this.f210130h.setImageResource(i);
        }
    }

    public void setRightRegionClick(View.OnClickListener onClickListener) {
        this.f210130h.setOnClickListener(onClickListener);
        this.f210127e.setOnClickListener(onClickListener);
    }

    public void setRightTextColor(@ColorInt int i) {
        this.f210127e.setTextColor(i);
    }

    public void setRightTextMarginEnd(int i) {
        bnl0.m105539W(this.f210127e, i);
    }

    public void setRightTextSize(float f) {
        this.f210127e.setTextSize(f);
    }

    public void setRightTextView(@StringRes int i) {
        String string = getResources().getString(i);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f210127e.setText(string);
        this.f210127e.setVisibility(0);
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
        this.f210128f.setText(charSequence);
        this.f210128f.setVisibility(0);
    }

    public void setLeftTextView(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f210126d.setText(charSequence);
        this.f210126d.setVisibility(0);
    }

    public void setRightTextView(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f210127e.setText(charSequence);
        this.f210127e.setVisibility(0);
    }
}
