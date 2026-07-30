package p153l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class vpe {

    /* JADX INFO: renamed from: a */
    public int f185246a;

    public vpe(@NonNull View view, AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, bic0.f76855a, i, i2);
            this.f185246a = typedArrayObtainStyledAttributes.getInteger(bic0.f76856b, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: a */
    public int m202229a() {
        return this.f185246a;
    }
}
