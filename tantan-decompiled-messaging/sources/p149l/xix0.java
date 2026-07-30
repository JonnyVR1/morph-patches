package p149l;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C2083R;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class xix0 {

    /* JADX INFO: renamed from: a */
    public final Resources f193161a;

    /* JADX INFO: renamed from: b */
    public final String f193162b;

    public xix0(Context context, @Nullable String str) {
        Preconditions.checkNotNull(context);
        this.f193161a = context.getResources();
        if (TextUtils.isEmpty(str)) {
            this.f193162b = m209682a(context);
        } else {
            this.f193162b = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m209682a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C2083R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m209683b(String str) {
        int identifier = this.f193161a.getIdentifier(str, "string", this.f193162b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.f193161a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
