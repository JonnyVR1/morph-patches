package p149l;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
public final class gvv implements fvv {

    /* JADX INFO: renamed from: a */
    public final LocaleList f104608a;

    public gvv(Object obj) {
        this.f104608a = (LocaleList) obj;
    }

    @Override // p149l.fvv
    /* JADX INFO: renamed from: a */
    public Object mo123370a() {
        return this.f104608a;
    }

    public boolean equals(Object obj) {
        return this.f104608a.equals(((fvv) obj).mo123370a());
    }

    @Override // p149l.fvv
    public Locale get(int i) {
        return this.f104608a.get(i);
    }

    public int hashCode() {
        return this.f104608a.hashCode();
    }

    @Override // p149l.fvv
    public int size() {
        return this.f104608a.size();
    }

    public String toString() {
        return this.f104608a.toString();
    }
}
