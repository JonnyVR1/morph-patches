package p153l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes13.dex */
public class hzv implements a1j0 {

    /* JADX INFO: renamed from: a */
    public String f112305a;

    @Override // p153l.a1j0
    /* JADX INFO: renamed from: a */
    public nyv mo95515a(nyv nyvVar) {
        if (nyvVar != null && !TextUtils.isEmpty(this.f112305a) && this.f112305a.equals(nyvVar.f144357b)) {
            return null;
        }
        this.f112305a = nyvVar.f144357b;
        return nyvVar;
    }
}
