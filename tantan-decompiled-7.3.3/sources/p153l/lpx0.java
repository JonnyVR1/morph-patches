package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class lpx0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f133127a;

    public lpx0(int i) {
        this.f133127a = rpx0.m182553b(i);
    }

    /* JADX INFO: renamed from: a */
    public final lpx0 m155298a(Object obj, dqx0 dqx0Var) {
        cqx0.m111998a(obj, Constants.KEY_KEY);
        cqx0.m111998a(dqx0Var, "provider");
        this.f133127a.put(obj, dqx0Var);
        return this;
    }
}
