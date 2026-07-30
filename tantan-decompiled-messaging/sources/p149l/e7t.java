package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.data.ConvertedJsonAdapter;
import com.tantanapp.common.data.JsonAdapter;

/* JADX INFO: loaded from: classes13.dex */
public class e7t extends ka20<BLiveEnvelope> {
    @Deprecated
    public e7t(v9j<stc0> v9jVar, boolean z) {
        super(v9jVar, new C16559a(BLiveEnvelope.JSON_ADAPTER), z);
    }

    @Deprecated
    public e7t(v9j<stc0> v9jVar) {
        this(v9jVar, false);
    }

    /* JADX INFO: renamed from: l.e7t$a */
    public class C16559a extends ConvertedJsonAdapter<BLiveEnvelope, BLiveEnvelope> {
        public C16559a(JsonAdapter jsonAdapter) {
            super(jsonAdapter);
        }

        @Override // com.tantanapp.common.data.ConvertedJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BLiveEnvelope from(BLiveEnvelope bLiveEnvelope) {
            return bLiveEnvelope;
        }

        @Override // com.tantanapp.common.data.ConvertedJsonAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveEnvelope mo59726to(BLiveEnvelope bLiveEnvelope) {
            return bLiveEnvelope;
        }
    }
}
