package p149l;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes6.dex */
@NullMarked
public final class euy0 {

    /* JADX INFO: renamed from: a */
    public final gby0 f93292a;

    /* JADX INFO: renamed from: b */
    public final boolean f93293b;

    /* JADX INFO: renamed from: c */
    public final jpy0 f93294c;

    public euy0(jpy0 jpy0Var, boolean z, gby0 gby0Var, int i) {
        this.f93294c = jpy0Var;
        this.f93293b = z;
        this.f93292a = gby0Var;
    }

    /* JADX INFO: renamed from: c */
    public static euy0 m118226c(gby0 gby0Var) {
        return new euy0(new jpy0(gby0Var), false, p7y0.f147550b, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: b */
    public final euy0 m118229b() {
        return new euy0(this.f93294c, true, this.f93292a, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: d */
    public final Iterable m118230d(CharSequence charSequence) {
        return new cry0(this, charSequence);
    }

    /* JADX INFO: renamed from: f */
    public final List m118231f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itM118232h = m118232h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itM118232h.hasNext()) {
            arrayList.add((String) itM118232h.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: h */
    public final Iterator m118232h(CharSequence charSequence) {
        return new rny0(this.f93294c, this, charSequence);
    }
}
