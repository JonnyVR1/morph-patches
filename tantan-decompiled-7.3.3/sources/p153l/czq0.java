package p153l;

import android.content.Context;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.EnumC14890gh;

/* JADX INFO: loaded from: classes2.dex */
public class czq0 extends bzq0 {
    public czq0(Context context, int i) {
        super(context, i);
    }

    @Override // p153l.tsq0.AbstractRunnableC20394c
    /* JADX INFO: renamed from: a */
    public String mo87798a() {
        return Constants.VIA_REPORT_TYPE_SHARE_TO_TROOPBAR;
    }

    @Override // p153l.bzq0
    /* JADX INFO: renamed from: b */
    public EnumC14890gh mo107249b() {
        return EnumC14890gh.Storage;
    }

    @Override // p153l.bzq0
    /* JADX INFO: renamed from: f */
    public String mo107251f() {
        return "ram:" + u3r0.m194397e() + ",rom:" + u3r0.m194407o() + "|ramOriginal:" + u3r0.m194411s() + ",romOriginal:" + u3r0.m194414v();
    }
}
