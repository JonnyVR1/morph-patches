package p153l;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes6.dex */
@NullMarked
public final class k3z0 {

    /* JADX INFO: renamed from: a */
    public final mky0 f123801a;

    /* JADX INFO: renamed from: b */
    public final boolean f123802b;

    /* JADX INFO: renamed from: c */
    public final pyy0 f123803c;

    public k3z0(pyy0 pyy0Var, boolean z, mky0 mky0Var, int i) {
        this.f123803c = pyy0Var;
        this.f123802b = z;
        this.f123801a = mky0Var;
    }

    /* JADX INFO: renamed from: c */
    public static k3z0 m148200c(mky0 mky0Var) {
        return new k3z0(new pyy0(mky0Var), false, vgy0.f184069b, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: b */
    public final k3z0 m148203b() {
        return new k3z0(this.f123803c, true, this.f123801a, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: d */
    public final Iterable m148204d(CharSequence charSequence) {
        return new i0z0(this, charSequence);
    }

    /* JADX INFO: renamed from: f */
    public final List m148205f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itM148206h = m148206h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itM148206h.hasNext()) {
            arrayList.add((String) itM148206h.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: h */
    public final Iterator m148206h(CharSequence charSequence) {
        return new xwy0(this.f123803c, this, charSequence);
    }
}
