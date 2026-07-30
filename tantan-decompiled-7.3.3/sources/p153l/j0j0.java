package p153l;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class j0j0 implements z0j0 {

    /* JADX INFO: renamed from: a */
    public static final SimpleDateFormat f117829a = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS", Locale.ROOT);

    @Override // p153l.z0j0
    /* JADX INFO: renamed from: a */
    public nyv mo142978a(nyv nyvVar) {
        nyvVar.f144356a.add(f117829a.format(new Date(System.currentTimeMillis())));
        return nyvVar;
    }
}
