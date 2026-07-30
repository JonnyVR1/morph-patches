package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import p149l.l9c0;

/* JADX INFO: loaded from: classes.dex */
public class Placeholder extends View {

    /* JADX INFO: renamed from: a */
    public int f1291a;

    /* JADX INFO: renamed from: b */
    public View f1292b;

    /* JADX INFO: renamed from: c */
    public int f1293c;

    public Placeholder(Context context) {
        super(context);
        this.f1291a = -1;
        this.f1292b = null;
        this.f1293c = 4;
        m1142a(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m1142a(AttributeSet attributeSet) {
        super.setVisibility(this.f1293c);
        this.f1291a = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, l9c0.f127020i0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == l9c0.f127023j0) {
                    this.f1291a = typedArrayObtainStyledAttributes.getResourceId(index, this.f1291a);
                } else if (index == l9c0.f127026k0) {
                    this.f1293c = typedArrayObtainStyledAttributes.getInt(index, this.f1293c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m1143b(ConstraintLayout constraintLayout) {
        if (this.f1292b == null) {
            return;
        }
        ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) getLayoutParams();
        ConstraintLayout.C0220a c0220a2 = (ConstraintLayout.C0220a) this.f1292b.getLayoutParams();
        c0220a2.f1260l0.m1051x0(0);
        c0220a.f1260l0.m1053y0(c0220a2.f1260l0.m976D());
        c0220a.f1260l0.m1007b0(c0220a2.f1260l0.m1038r());
        c0220a2.f1260l0.m1051x0(8);
    }

    /* JADX INFO: renamed from: c */
    public void m1144c(ConstraintLayout constraintLayout) {
        if (this.f1291a == -1 && !isInEditMode()) {
            setVisibility(this.f1293c);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f1291a);
        this.f1292b = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.C0220a) viewFindViewById.getLayoutParams()).f1238a0 = true;
            this.f1292b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f1292b;
    }

    public int getEmptyVisibility() {
        return this.f1293c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View viewFindViewById;
        if (this.f1291a == i) {
            return;
        }
        View view = this.f1292b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.C0220a) this.f1292b.getLayoutParams()).f1238a0 = false;
            this.f1292b = null;
        }
        this.f1291a = i;
        if (i == -1 || (viewFindViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f1293c = i;
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1291a = -1;
        this.f1292b = null;
        this.f1293c = 4;
        m1142a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1291a = -1;
        this.f1292b = null;
        this.f1293c = 4;
        m1142a(attributeSet);
    }
}
