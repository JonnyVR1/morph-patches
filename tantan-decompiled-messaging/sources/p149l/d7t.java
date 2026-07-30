package p149l;

import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.data.INetParser;
import com.tantanapp.common.data.JsonAdapter;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class d7t {
    /* JADX INFO: renamed from: a */
    public static C22306c<BLiveEnvelope> m110247a(v9j<stc0> v9jVar) {
        return new e7t(v9jVar).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: b */
    public static <T extends BaseLiveBean> C22306c<T> m110248b(v9j<stc0> v9jVar, INetParser iNetParser) {
        return (C22306c<T>) new f7t(v9jVar, iNetParser, false).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: c */
    public static <T> C22306c<T> m110249c(v9j<stc0> v9jVar, JsonAdapter<T> jsonAdapter) {
        return ia20.m135119c(v9jVar, jsonAdapter);
    }

    /* JADX INFO: renamed from: d */
    public static C22306c<BLiveEnvelope> m110250d(v9j<stc0> v9jVar) {
        return new e7t(v9jVar);
    }
}
