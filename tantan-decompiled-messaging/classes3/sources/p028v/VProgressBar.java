package p028v;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.p1.mobile.android.R;
import l.b9c0;
import l.j0c0;
import l.t0c0;
import l.u1c0;
import l.u5c0;
import p003l.upk0;
import p028v.progressbar.ProgressDrawable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VProgressBar extends ProgressBar {
    public VProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            setIndeterminateDrawable(new ProgressDrawable.C1427i(context).m12239a());
            return;
        }
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.r4, i, 0);
        int color = typedArrayObtainStyledAttributes.getColor(b9c0.s4, resources.getColor(t0c0.x));
        float dimension = typedArrayObtainStyledAttributes.getDimension(b9c0.y4, resources.getDimension(u1c0.f));
        float f = typedArrayObtainStyledAttributes.getFloat(b9c0.x4, -1.0f);
        float f2 = typedArrayObtainStyledAttributes.getFloat(b9c0.z4, Float.parseFloat(resources.getString(R.string.w8)));
        float f3 = typedArrayObtainStyledAttributes.getFloat(b9c0.w4, Float.parseFloat(resources.getString(R.string.v8)));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(b9c0.t4, 0);
        int integer = typedArrayObtainStyledAttributes.getInteger(b9c0.v4, resources.getInteger(u5c0.b));
        int integer2 = typedArrayObtainStyledAttributes.getInteger(b9c0.u4, resources.getInteger(u5c0.a));
        typedArrayObtainStyledAttributes.recycle();
        int[] intArray = resourceId != 0 ? resources.getIntArray(resourceId) : null;
        ProgressDrawable.C1427i c1427iM12243e = new ProgressDrawable.C1427i(context).m12248j(f2).m12245g(f3).m12247i(dimension).m12246h(f).m12244f(integer).m12243e(integer2);
        if (intArray == null || intArray.length <= 0) {
            c1427iM12243e.m12240b(color);
        } else {
            c1427iM12243e.m12241c(intArray);
        }
        setIndeterminateDrawable(c1427iM12243e.m12239a());
    }

    /* JADX INFO: renamed from: a */
    public final ProgressDrawable m11636a() {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null && (indeterminateDrawable instanceof ProgressDrawable)) {
            return (ProgressDrawable) indeterminateDrawable;
        }
        upk0.m8197a("The drawable is not a CircularProgressDrawable");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m11637b() {
        m11636a().m12235w();
    }

    /* JADX INFO: renamed from: c */
    public void m11638c() {
        m11636a().start();
    }

    /* JADX INFO: renamed from: d */
    public void m11639d() {
        m11636a().stop();
    }

    public void setColor(int i) {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof ProgressDrawable) {
            ProgressDrawable progressDrawable = (ProgressDrawable) indeterminateDrawable;
            progressDrawable.m12234v(new int[]{i});
            setIndeterminateDrawable(progressDrawable);
        }
    }

    public VProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j0c0.a);
    }

    public VProgressBar(Context context) {
        this(context, null);
    }
}
