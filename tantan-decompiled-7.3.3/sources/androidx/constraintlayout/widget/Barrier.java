package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.solver.widgets.C0212b;
import p153l.qhc0;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends ConstraintHelper {

    /* JADX INFO: renamed from: g */
    public int f1202g;

    /* JADX INFO: renamed from: h */
    public int f1203h;

    /* JADX INFO: renamed from: i */
    public C0212b f1204i;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* JADX INFO: renamed from: b */
    public void mo1132b(AttributeSet attributeSet) {
        super.mo1132b(attributeSet);
        this.f1204i = new C0212b();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, qhc0.f157587a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == qhc0.f157608h) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == qhc0.f157605g) {
                    this.f1204i.m1070L0(typedArrayObtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.f1208d = this.f1204i;
        m1138f();
    }

    /* JADX INFO: renamed from: g */
    public boolean m1133g() {
        return this.f1204i.m1069K0();
    }

    public int getType() {
        return this.f1202g;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1204i.m1070L0(z);
    }

    public void setType(int i) {
        this.f1202g = i;
        this.f1203h = i;
        int layoutDirection = getResources().getConfiguration().getLayoutDirection();
        int i2 = this.f1202g;
        if (1 == layoutDirection) {
            if (i2 == 5) {
                this.f1203h = 1;
            } else if (i2 == 6) {
                this.f1203h = 0;
            }
        } else if (i2 == 5) {
            this.f1203h = 0;
        } else if (i2 == 6) {
            this.f1203h = 1;
        }
        this.f1204i.m1071M0(this.f1203h);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
