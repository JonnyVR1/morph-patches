package p149l;

import android.content.Context;
import com.xiaomi.mipush.sdk.C14719c;
import com.xiaomi.mipush.sdk.C14722f;
import com.xiaomi.push.C14753gs;
import com.xiaomi.push.C14766he;
import com.xiaomi.push.EnumC14740gf;

/* JADX INFO: loaded from: classes2.dex */
public class nuq0 implements cpq0 {

    /* JADX INFO: renamed from: a */
    private Context f140646a;

    public nuq0(Context context) {
        this.f140646a = context;
    }

    @Override // p149l.cpq0
    /* JADX INFO: renamed from: a */
    public String mo108171a() {
        return C14719c.m85328c(this.f140646a).m85346t();
    }

    @Override // p149l.cpq0
    /* JADX INFO: renamed from: a */
    public void mo108172a(C14766he c14766he, EnumC14740gf enumC14740gf, C14753gs c14753gs) {
        C14722f.m85402h(this.f140646a).m85435w(c14766he, enumC14740gf, c14753gs);
    }
}
