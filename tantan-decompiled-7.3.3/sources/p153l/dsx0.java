package p153l;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C2106R;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class dsx0 {

    /* JADX INFO: renamed from: a */
    public final Resources f90527a;

    /* JADX INFO: renamed from: b */
    public final String f90528b;

    public dsx0(Context context, @Nullable String str) {
        Preconditions.checkNotNull(context);
        this.f90527a = context.getResources();
        if (TextUtils.isEmpty(str)) {
            this.f90528b = m117784a(context);
        } else {
            this.f90528b = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m117784a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C2106R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m117785b(String str) {
        int identifier = this.f90527a.getIdentifier(str, "string", this.f90528b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.f90527a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
