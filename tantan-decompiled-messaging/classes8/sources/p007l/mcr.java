package p007l;

import android.os.Bundle;
import com.p003p1.mobile.android.app.C0231c;
import l.d30;
import l.e30;
import l.v9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public interface mcr {
    void creates(e30<Bundle> e30Var);

    void creates(e30<Bundle> e30Var, d30 d30Var);

    <T> c<T> duringCreated(v9j<c<T>> v9jVar);

    <T> c<T> duringCreated(v9j<c<T>> v9jVar, boolean z);

    <T> c<T> duringCreated(c<T> cVar);

    c<C0231c> lifecycle();

    C0231c lifecycle_();
}
