package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveJoinFanBaseContent;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class ppq {

    /* JADX INFO: renamed from: a */
    public BLiveJoinFanBaseContent f153575a;

    /* JADX INFO: renamed from: b */
    public y20<String> f153576b;

    public ppq(String str, y20<String> y20Var) {
        this.f153576b = y20Var;
        try {
            this.f153575a = BLiveJoinFanBaseContent.JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public BLiveJoinFanBaseContent m173249a() {
        return this.f153575a;
    }

    /* JADX INFO: renamed from: b */
    public y20<String> m173250b() {
        return this.f153576b;
    }
}
