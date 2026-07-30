package p147v;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.api.Api;
import p149l.b6c0;
import p149l.b9c0;
import p149l.p4c0;

/* JADX INFO: loaded from: classes3.dex */
public class VBlankPage extends ConstraintLayout {

    /* JADX INFO: renamed from: f */
    public static final ImageView.ScaleType[] f209041f = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: d */
    public VImage f209042d;

    /* JADX INFO: renamed from: e */
    public VText f209043e;

    public VBlankPage(Context context) {
        super(context);
        m222991h0(context, null);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m222991h0(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(b6c0.f73782h, this);
        this.f209042d = (VImage) findViewById(p4c0.f147118h);
        this.f209043e = (VText) findViewById(p4c0.f147120i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74399c);
        String string = typedArrayObtainStyledAttributes.getString(b9c0.f74441i);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74406d, -1);
        int color = typedArrayObtainStyledAttributes.getColor(b9c0.f74420f, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        int i = typedArrayObtainStyledAttributes.getInt(b9c0.f74413e, -1);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74427g, -1);
        int i2 = typedArrayObtainStyledAttributes.getInt(b9c0.f74434h, -1);
        typedArrayObtainStyledAttributes.recycle();
        if (!TextUtils.isEmpty(string)) {
            this.f209043e.setText(string);
        }
        if (dimensionPixelSize != -1) {
            this.f209043e.setTextSize(0, dimensionPixelSize);
        }
        if (color != Integer.MAX_VALUE) {
            this.f209043e.setTextColor(color);
        }
        if (resourceId != -1) {
            this.f209042d.setImageResource(resourceId);
        }
        if (i2 >= 0) {
            this.f209042d.setScaleType(f209041f[i2]);
        }
        if (i >= 0) {
            VText vText = this.f209043e;
            vText.setTypeface(vText.getTypeface(), i);
        }
    }

    public VBlankPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m222991h0(context, attributeSet);
    }

    public VBlankPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m222991h0(context, attributeSet);
    }
}
