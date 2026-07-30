package p151v;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.api.Api;
import p153l.gec0;
import p153l.hhc0;
import p153l.vcc0;

/* JADX INFO: loaded from: classes3.dex */
public class VBlankPage extends ConstraintLayout {

    /* JADX INFO: renamed from: f */
    public static final ImageView.ScaleType[] f209963f = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: d */
    public VImage f209964d;

    /* JADX INFO: renamed from: e */
    public VText f209965e;

    public VBlankPage(Context context) {
        super(context);
        m224237h0(context, null);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m224237h0(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(gec0.f103795h, this);
        this.f209964d = (VImage) findViewById(vcc0.f183418h);
        this.f209965e = (VText) findViewById(vcc0.f183420i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109708c);
        String string = typedArrayObtainStyledAttributes.getString(hhc0.f109750i);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109715d, -1);
        int color = typedArrayObtainStyledAttributes.getColor(hhc0.f109729f, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        int i = typedArrayObtainStyledAttributes.getInt(hhc0.f109722e, -1);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109736g, -1);
        int i2 = typedArrayObtainStyledAttributes.getInt(hhc0.f109743h, -1);
        typedArrayObtainStyledAttributes.recycle();
        if (!TextUtils.isEmpty(string)) {
            this.f209965e.setText(string);
        }
        if (dimensionPixelSize != -1) {
            this.f209965e.setTextSize(0, dimensionPixelSize);
        }
        if (color != Integer.MAX_VALUE) {
            this.f209965e.setTextColor(color);
        }
        if (resourceId != -1) {
            this.f209964d.setImageResource(resourceId);
        }
        if (i2 >= 0) {
            this.f209964d.setScaleType(f209963f[i2]);
        }
        if (i >= 0) {
            VText vText = this.f209965e;
            vText.setTypeface(vText.getTypeface(), i);
        }
    }

    public VBlankPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m224237h0(context, attributeSet);
    }

    public VBlankPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m224237h0(context, attributeSet);
    }
}
