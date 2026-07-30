package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import p153l.qhc0;
import p153l.t1l;
import p153l.zcc0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends View {

    /* JADX INFO: renamed from: a */
    public int[] f1205a;

    /* JADX INFO: renamed from: b */
    public int f1206b;

    /* JADX INFO: renamed from: c */
    public Context f1207c;

    /* JADX INFO: renamed from: d */
    public t1l f1208d;

    /* JADX INFO: renamed from: e */
    public boolean f1209e;

    /* JADX INFO: renamed from: f */
    public String f1210f;

    public ConstraintHelper(Context context) {
        super(context);
        this.f1205a = new int[32];
        this.f1209e = false;
        this.f1207c = context;
        mo1132b(null);
    }

    private void setIds(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m1134a(str.substring(i));
                return;
            } else {
                m1134a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1134a(String str) {
        int iIntValue;
        Object designInformation;
        if (str == null || this.f1207c == null) {
            return;
        }
        String strTrim = str.trim();
        try {
            iIntValue = zcc0.class.getField(strTrim).getInt(null);
        } catch (Exception unused) {
            iIntValue = 0;
        }
        if (iIntValue == 0) {
            iIntValue = this.f1207c.getResources().getIdentifier(strTrim, "id", this.f1207c.getPackageName());
        }
        if (iIntValue == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
            iIntValue = ((Integer) designInformation).intValue();
        }
        if (iIntValue != 0) {
            setTag(iIntValue, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo1132b(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, qhc0.f157587a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == qhc0.f157614j) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f1210f = string;
                    setIds(string);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo1135c(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: renamed from: d */
    public void m1136d(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: renamed from: e */
    public void mo1137e(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f1210f);
        }
        t1l t1lVar = this.f1208d;
        if (t1lVar == null) {
            return;
        }
        t1lVar.m188926J0();
        for (int i = 0; i < this.f1206b; i++) {
            View viewById = constraintLayout.getViewById(this.f1205a[i]);
            if (viewById != null) {
                this.f1208d.m188925I0(constraintLayout.getViewWidget(viewById));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m1138f() {
        if (this.f1208d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0221a) {
            ((ConstraintLayout.C0221a) layoutParams).f1260l0 = this.f1208d;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1205a, this.f1206b);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f1209e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1206b = 0;
        for (int i : iArr) {
            setTag(i, null);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        int i2 = this.f1206b + 1;
        int[] iArr = this.f1205a;
        if (i2 > iArr.length) {
            this.f1205a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1205a;
        int i3 = this.f1206b;
        iArr2[i3] = i;
        this.f1206b = i3 + 1;
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1205a = new int[32];
        this.f1209e = false;
        this.f1207c = context;
        mo1132b(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1205a = new int[32];
        this.f1209e = false;
        this.f1207c = context;
        mo1132b(attributeSet);
    }
}
