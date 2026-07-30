package p149l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class roe {

    /* JADX INFO: renamed from: a */
    public int f160379a;

    public roe(@NonNull View view, AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, v9c0.f180624a, i, i2);
            this.f160379a = typedArrayObtainStyledAttributes.getInteger(v9c0.f180625b, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: a */
    public int m180240a() {
        return this.f160379a;
    }
}
