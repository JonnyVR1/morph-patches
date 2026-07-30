package p153l;

import android.content.Context;
import com.google.mlkit.p034nl.languageid.bundled.internal.ThickLanguageIdentifier;

/* JADX INFO: loaded from: classes7.dex */
public final class r8r0 implements a9r {
    @Override // p153l.a9r
    /* JADX INFO: renamed from: a */
    public final b9r mo96603a(Context context, z8r z8rVar) {
        return new ThickLanguageIdentifier(context, z8rVar);
    }

    @Override // p153l.a9r
    public final int getPriority() {
        return 100;
    }
}
