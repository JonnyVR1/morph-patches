package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveJoinFanBaseContent;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class qnq {

    /* JADX INFO: renamed from: a */
    public BLiveJoinFanBaseContent f155488a;

    /* JADX INFO: renamed from: b */
    public e30<String> f155489b;

    public qnq(String str, e30<String> e30Var) {
        this.f155489b = e30Var;
        try {
            this.f155488a = BLiveJoinFanBaseContent.JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public BLiveJoinFanBaseContent m175686a() {
        return this.f155488a;
    }

    /* JADX INFO: renamed from: b */
    public e30<String> m175687b() {
        return this.f155489b;
    }
}
