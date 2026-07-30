package p147v;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.p046p1.mobile.android.R$string;
import p147v.progressbar.ProgressDrawable;
import p149l.b9c0;
import p149l.j0c0;
import p149l.t0c0;
import p149l.u1c0;
import p149l.u5c0;
import p149l.upk0;

/* JADX INFO: loaded from: classes3.dex */
public class VProgressBar extends ProgressBar {
    public VProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            setIndeterminateDrawable(new ProgressDrawable.C22634i(context).m223733a());
            return;
        }
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74509r4, i, 0);
        int color = typedArrayObtainStyledAttributes.getColor(b9c0.f74516s4, resources.getColor(t0c0.f167172x));
        float dimension = typedArrayObtainStyledAttributes.getDimension(b9c0.f74558y4, resources.getDimension(u1c0.f172992f));
        float f = typedArrayObtainStyledAttributes.getFloat(b9c0.f74551x4, -1.0f);
        float f2 = typedArrayObtainStyledAttributes.getFloat(b9c0.f74565z4, Float.parseFloat(resources.getString(R$string.f15275w8)));
        float f3 = typedArrayObtainStyledAttributes.getFloat(b9c0.f74544w4, Float.parseFloat(resources.getString(R$string.f15265v8)));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74523t4, 0);
        int integer = typedArrayObtainStyledAttributes.getInteger(b9c0.f74537v4, resources.getInteger(u5c0.f174695b));
        int integer2 = typedArrayObtainStyledAttributes.getInteger(b9c0.f74530u4, resources.getInteger(u5c0.f174694a));
        typedArrayObtainStyledAttributes.recycle();
        int[] intArray = resourceId != 0 ? resources.getIntArray(resourceId) : null;
        ProgressDrawable.C22634i c22634iM223737e = new ProgressDrawable.C22634i(context).m223742j(f2).m223739g(f3).m223741i(dimension).m223740h(f).m223738f(integer).m223737e(integer2);
        if (intArray == null || intArray.length <= 0) {
            c22634iM223737e.m223734b(color);
        } else {
            c22634iM223737e.m223735c(intArray);
        }
        setIndeterminateDrawable(c22634iM223737e.m223733a());
    }

    /* JADX INFO: renamed from: a */
    public final ProgressDrawable m223154a() {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null && (indeterminateDrawable instanceof ProgressDrawable)) {
            return (ProgressDrawable) indeterminateDrawable;
        }
        upk0.m194883a("The drawable is not a CircularProgressDrawable");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m223155b() {
        m223154a().m223729w();
    }

    /* JADX INFO: renamed from: c */
    public void m223156c() {
        m223154a().start();
    }

    /* JADX INFO: renamed from: d */
    public void m223157d() {
        m223154a().stop();
    }

    public void setColor(int i) {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof ProgressDrawable) {
            ProgressDrawable progressDrawable = (ProgressDrawable) indeterminateDrawable;
            progressDrawable.m223728v(new int[]{i});
            setIndeterminateDrawable(progressDrawable);
        }
    }

    public VProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j0c0.f115657a);
    }

    public VProgressBar(Context context) {
        this(context, null);
    }
}
