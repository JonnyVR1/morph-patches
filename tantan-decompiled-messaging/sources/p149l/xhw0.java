package p149l;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.p033nl.languageid.IdentifiedLanguage;
import com.google.mlkit.p033nl.languageid.LanguageIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class xhw0 extends q600 {

    /* JADX INFO: renamed from: d */
    @Nullable
    public a7r f192924d;

    /* JADX INFO: renamed from: e */
    public y6r f192925e;

    /* JADX INFO: renamed from: f */
    public final Context f192926f;

    /* JADX INFO: renamed from: g */
    public final z6r f192927g;

    /* JADX INFO: renamed from: h */
    public final boolean f192928h;

    public xhw0(Context context, z6r z6rVar) {
        this.f192926f = context;
        this.f192927g = z6rVar;
        this.f192928h = z6rVar.getPriority() == 100;
    }

    @Override // p149l.q600
    @WorkerThread
    /* JADX INFO: renamed from: c */
    public final void mo173117c() throws MlKitException {
        this.f152844a.m141185a();
        if (this.f192924d == null) {
            a7r a7rVarMo152362a = this.f192927g.mo152362a(this.f192926f, this.f192925e);
            this.f192924d = a7rVarMo152362a;
            a7rVarMo152362a.init();
        }
    }

    @Override // p149l.q600
    @WorkerThread
    /* JADX INFO: renamed from: e */
    public final void mo173119e() {
        this.f152844a.m141185a();
        a7r a7rVar = this.f192924d;
        if (a7rVar != null) {
            a7rVar.release();
            this.f192924d = null;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: j */
    public final String m208846j(String str, float f) throws MlKitException {
        String strM16880b;
        if (this.f192924d == null) {
            mo173117c();
        }
        if (str.isEmpty()) {
            return LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG;
        }
        Iterator<IdentifiedLanguage> it = ((a7r) Preconditions.checkNotNull(this.f192924d)).mo16882a(str, f).iterator();
        while (true) {
            if (!it.hasNext()) {
                strM16880b = "";
                break;
            }
            IdentifiedLanguage next = it.next();
            if (!"unknown".equals(next.m16880b())) {
                strM16880b = next.m16880b();
                break;
            }
        }
        if (strM16880b.isEmpty()) {
            return LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG;
        }
        return "iw".equals(strM16880b) ? "he" : strM16880b;
    }

    @WorkerThread
    /* JADX INFO: renamed from: k */
    public final List m208847k(String str, float f) throws MlKitException {
        if (this.f192924d == null) {
            mo173117c();
        }
        ArrayList arrayList = new ArrayList();
        if (str.isEmpty()) {
            arrayList.add(new IdentifiedLanguage(LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG, 1.0f));
            return arrayList;
        }
        for (IdentifiedLanguage identifiedLanguage : ((a7r) Preconditions.checkNotNull(this.f192924d)).mo16882a(str, f)) {
            if (!"unknown".equals(identifiedLanguage.m16880b())) {
                arrayList.add(new IdentifiedLanguage("iw".equals(identifiedLanguage.m16880b()) ? "he" : identifiedLanguage.m16880b(), identifiedLanguage.m16879a()));
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new IdentifiedLanguage(LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG, 1.0f));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final void m208848l(y6r y6rVar) {
        this.f192925e = y6rVar;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m208849m() {
        return this.f192928h;
    }
}
