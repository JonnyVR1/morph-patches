package p151v;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.p051p1.mobile.android.R$string;
import p151v.progressbar.ProgressDrawable;
import p153l.azk0;
import p153l.bac0;
import p153l.hhc0;
import p153l.o8c0;
import p153l.z8c0;
import p153l.zdc0;

/* JADX INFO: loaded from: classes3.dex */
public class VProgressBar extends ProgressBar {
    public VProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            setIndeterminateDrawable(new ProgressDrawable.C22749i(context).m224979a());
            return;
        }
        Resources resources = context.getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109818r4, i, 0);
        int color = typedArrayObtainStyledAttributes.getColor(hhc0.f109825s4, resources.getColor(z8c0.f203363x));
        float dimension = typedArrayObtainStyledAttributes.getDimension(hhc0.f109867y4, resources.getDimension(bac0.f75667f));
        float f = typedArrayObtainStyledAttributes.getFloat(hhc0.f109860x4, -1.0f);
        float f2 = typedArrayObtainStyledAttributes.getFloat(hhc0.f109874z4, Float.parseFloat(resources.getString(R$string.f15994w8)));
        float f3 = typedArrayObtainStyledAttributes.getFloat(hhc0.f109853w4, Float.parseFloat(resources.getString(R$string.f15984v8)));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109832t4, 0);
        int integer = typedArrayObtainStyledAttributes.getInteger(hhc0.f109846v4, resources.getInteger(zdc0.f203871b));
        int integer2 = typedArrayObtainStyledAttributes.getInteger(hhc0.f109839u4, resources.getInteger(zdc0.f203870a));
        typedArrayObtainStyledAttributes.recycle();
        int[] intArray = resourceId != 0 ? resources.getIntArray(resourceId) : null;
        ProgressDrawable.C22749i c22749iM224983e = new ProgressDrawable.C22749i(context).m224988j(f2).m224985g(f3).m224987i(dimension).m224986h(f).m224984f(integer).m224983e(integer2);
        if (intArray == null || intArray.length <= 0) {
            c22749iM224983e.m224980b(color);
        } else {
            c22749iM224983e.m224981c(intArray);
        }
        setIndeterminateDrawable(c22749iM224983e.m224979a());
    }

    /* JADX INFO: renamed from: a */
    public final ProgressDrawable m224400a() {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null && (indeterminateDrawable instanceof ProgressDrawable)) {
            return (ProgressDrawable) indeterminateDrawable;
        }
        azk0.m101074a("The drawable is not a CircularProgressDrawable");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m224401b() {
        m224400a().m224975w();
    }

    /* JADX INFO: renamed from: c */
    public void m224402c() {
        m224400a().start();
    }

    /* JADX INFO: renamed from: d */
    public void m224403d() {
        m224400a().stop();
    }

    public void setColor(int i) {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof ProgressDrawable) {
            ProgressDrawable progressDrawable = (ProgressDrawable) indeterminateDrawable;
            progressDrawable.m224974v(new int[]{i});
            setIndeterminateDrawable(progressDrawable);
        }
    }

    public VProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, o8c0.f145391a);
    }

    public VProgressBar(Context context) {
        this(context, null);
    }
}
