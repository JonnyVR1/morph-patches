package p153l;

import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.data.INetParser;
import com.tantanapp.common.data.JsonAdapter;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class e9t {
    /* JADX INFO: renamed from: a */
    public static C22421c<BLiveEnvelope> m119951a(pcj<x1d0> pcjVar) {
        return new f9t(pcjVar).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: b */
    public static <T extends BaseLiveBean> C22421c<T> m119952b(pcj<x1d0> pcjVar, INetParser iNetParser) {
        return (C22421c<T>) new g9t(pcjVar, iNetParser, false).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: c */
    public static <T> C22421c<T> m119953c(pcj<x1d0> pcjVar, JsonAdapter<T> jsonAdapter) {
        return qi20.m176656c(pcjVar, jsonAdapter);
    }

    /* JADX INFO: renamed from: d */
    public static C22421c<BLiveEnvelope> m119954d(pcj<x1d0> pcjVar) {
        return new f9t(pcjVar);
    }
}
