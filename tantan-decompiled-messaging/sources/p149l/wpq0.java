package p149l;

import android.content.Context;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.EnumC14742gh;

/* JADX INFO: loaded from: classes2.dex */
public class wpq0 extends vpq0 {
    public wpq0(Context context, int i) {
        super(context, i);
    }

    @Override // p149l.njq0.AbstractRunnableC18717c
    /* JADX INFO: renamed from: a */
    public String mo86627a() {
        return Constants.VIA_REPORT_TYPE_SHARE_TO_TROOPBAR;
    }

    @Override // p149l.vpq0
    /* JADX INFO: renamed from: b */
    public EnumC14742gh mo199295b() {
        return EnumC14742gh.Storage;
    }

    @Override // p149l.vpq0
    /* JADX INFO: renamed from: f */
    public String mo199297f() {
        return "ram:" + ouq0.m166096e() + ",rom:" + ouq0.m166106o() + "|ramOriginal:" + ouq0.m166110s() + ",romOriginal:" + ouq0.m166113v();
    }
}
