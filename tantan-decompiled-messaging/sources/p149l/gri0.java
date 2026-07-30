package p149l;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class gri0 implements wri0 {

    /* JADX INFO: renamed from: a */
    public static final SimpleDateFormat f104067a = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS", Locale.ROOT);

    @Override // p149l.wri0
    /* JADX INFO: renamed from: a */
    public nwv mo127713a(nwv nwvVar) {
        nwvVar.f140977a.add(f104067a.format(new Date(System.currentTimeMillis())));
        return nwvVar;
    }
}
