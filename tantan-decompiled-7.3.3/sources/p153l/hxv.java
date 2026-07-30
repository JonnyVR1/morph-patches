package p153l;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
public final class hxv implements gxv {

    /* JADX INFO: renamed from: a */
    public final LocaleList f112059a;

    public hxv(Object obj) {
        this.f112059a = (LocaleList) obj;
    }

    @Override // p153l.gxv
    /* JADX INFO: renamed from: a */
    public Object mo132925a() {
        return this.f112059a;
    }

    public boolean equals(Object obj) {
        return this.f112059a.equals(((gxv) obj).mo132925a());
    }

    @Override // p153l.gxv
    public Locale get(int i) {
        return this.f112059a.get(i);
    }

    public int hashCode() {
        return this.f112059a.hashCode();
    }

    @Override // p153l.gxv
    public int size() {
        return this.f112059a.size();
    }

    public String toString() {
        return this.f112059a.toString();
    }
}
