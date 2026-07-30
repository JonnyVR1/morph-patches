package p009l;

import com.p1.mobile.putong.live.base.data.BLiveJoinFanBaseContent;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qnq {

    /* JADX INFO: renamed from: a */
    public BLiveJoinFanBaseContent f19393a;

    /* JADX INFO: renamed from: b */
    public e30<String> f19394b;

    public qnq(String str, e30<String> e30Var) {
        this.f19394b = e30Var;
        try {
            this.f19393a = (BLiveJoinFanBaseContent) BLiveJoinFanBaseContent.JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public BLiveJoinFanBaseContent m21113a() {
        return this.f19393a;
    }

    /* JADX INFO: renamed from: b */
    public e30<String> m21114b() {
        return this.f19394b;
    }
}
