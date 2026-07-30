package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.data.ConvertedJsonAdapter;
import com.tantanapp.common.data.JsonAdapter;

/* JADX INFO: loaded from: classes13.dex */
public class f9t extends si20<BLiveEnvelope> {
    @Deprecated
    public f9t(pcj<x1d0> pcjVar, boolean z) {
        super(pcjVar, new C16928a(BLiveEnvelope.JSON_ADAPTER), z);
    }

    @Deprecated
    public f9t(pcj<x1d0> pcjVar) {
        this(pcjVar, false);
    }

    /* JADX INFO: renamed from: l.f9t$a */
    public class C16928a extends ConvertedJsonAdapter<BLiveEnvelope, BLiveEnvelope> {
        public C16928a(JsonAdapter jsonAdapter) {
            super(jsonAdapter);
        }

        @Override // com.tantanapp.common.data.ConvertedJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveEnvelope from(BLiveEnvelope bLiveEnvelope) {
            return bLiveEnvelope;
        }

        @Override // com.tantanapp.common.data.ConvertedJsonAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveEnvelope mo60910to(BLiveEnvelope bLiveEnvelope) {
            return bLiveEnvelope;
        }
    }
}
