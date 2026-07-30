package p153l;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public class gqf0 extends x6e {

    /* JADX INFO: renamed from: b */
    public Context f105680b;

    /* JADX INFO: renamed from: c */
    public Uri f105681c;

    public gqf0(@Nullable x6e x6eVar, Context context, Uri uri) {
        super(x6eVar);
        this.f105680b = context;
        this.f105681c = uri;
    }

    @Override // p153l.x6e
    @Nullable
    /* JADX INFO: renamed from: b */
    public String mo131373b() {
        return a7e.m96357b(this.f105680b, this.f105681c);
    }
}
