package p153l;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.p034nl.languageid.IdentifiedLanguage;
import com.google.mlkit.p034nl.languageid.LanguageIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class drw0 extends ze00 {

    /* JADX INFO: renamed from: d */
    @Nullable
    public b9r f90436d;

    /* JADX INFO: renamed from: e */
    public z8r f90437e;

    /* JADX INFO: renamed from: f */
    public final Context f90438f;

    /* JADX INFO: renamed from: g */
    public final a9r f90439g;

    /* JADX INFO: renamed from: h */
    public final boolean f90440h;

    public drw0(Context context, a9r a9rVar) {
        this.f90438f = context;
        this.f90439g = a9rVar;
        this.f90440h = a9rVar.getPriority() == 100;
    }

    @Override // p153l.ze00
    @WorkerThread
    /* JADX INFO: renamed from: c */
    public final void mo117710c() throws MlKitException {
        this.f203967a.m146465a();
        if (this.f90436d == null) {
            b9r b9rVarMo96603a = this.f90439g.mo96603a(this.f90438f, this.f90437e);
            this.f90436d = b9rVarMo96603a;
            b9rVarMo96603a.init();
        }
    }

    @Override // p153l.ze00
    @WorkerThread
    /* JADX INFO: renamed from: e */
    public final void mo117711e() {
        this.f203967a.m146465a();
        b9r b9rVar = this.f90436d;
        if (b9rVar != null) {
            b9rVar.release();
            this.f90436d = null;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: j */
    public final String m117712j(String str, float f) throws MlKitException {
        String strM16935b;
        if (this.f90436d == null) {
            mo117710c();
        }
        if (str.isEmpty()) {
            return LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG;
        }
        Iterator<IdentifiedLanguage> it = ((b9r) Preconditions.checkNotNull(this.f90436d)).mo16937a(str, f).iterator();
        while (true) {
            if (!it.hasNext()) {
                strM16935b = "";
                break;
            }
            IdentifiedLanguage next = it.next();
            if (!"unknown".equals(next.m16935b())) {
                strM16935b = next.m16935b();
                break;
            }
        }
        if (strM16935b.isEmpty()) {
            return LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG;
        }
        return "iw".equals(strM16935b) ? "he" : strM16935b;
    }

    @WorkerThread
    /* JADX INFO: renamed from: k */
    public final List m117713k(String str, float f) throws MlKitException {
        if (this.f90436d == null) {
            mo117710c();
        }
        ArrayList arrayList = new ArrayList();
        if (str.isEmpty()) {
            arrayList.add(new IdentifiedLanguage(LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG, 1.0f));
            return arrayList;
        }
        for (IdentifiedLanguage identifiedLanguage : ((b9r) Preconditions.checkNotNull(this.f90436d)).mo16937a(str, f)) {
            if (!"unknown".equals(identifiedLanguage.m16935b())) {
                arrayList.add(new IdentifiedLanguage("iw".equals(identifiedLanguage.m16935b()) ? "he" : identifiedLanguage.m16935b(), identifiedLanguage.m16934a()));
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new IdentifiedLanguage(LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG, 1.0f));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final void m117714l(z8r z8rVar) {
        this.f90437e = z8rVar;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m117715m() {
        return this.f90440h;
    }
}
