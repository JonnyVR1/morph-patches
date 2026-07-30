package p149l;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public class xhf0 extends j5e {

    /* JADX INFO: renamed from: b */
    public Context f192884b;

    /* JADX INFO: renamed from: c */
    public Uri f192885c;

    public xhf0(@Nullable j5e j5eVar, Context context, Uri uri) {
        super(j5eVar);
        this.f192884b = context;
        this.f192885c = uri;
    }

    @Override // p149l.j5e
    @Nullable
    /* JADX INFO: renamed from: b */
    public String mo139841b() {
        return m5e.m153137b(this.f192884b, this.f192885c);
    }
}
