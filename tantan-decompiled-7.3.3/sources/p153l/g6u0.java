package p153l;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class g6u0 extends kdu0 implements har0 {
    public g6u0(Set set) {
        super(set);
    }

    @Override // p153l.har0
    public final void onAdClicked() {
        m149285v0(new jdu0() { // from class: l.f6u0
            @Override // p153l.jdu0
            public final void zza(Object obj) {
                ((har0) obj).onAdClicked();
            }
        });
    }
}
