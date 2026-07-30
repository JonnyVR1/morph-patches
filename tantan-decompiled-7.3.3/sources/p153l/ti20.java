package p153l;

import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.data.ConvertedJsonAdapter;
import com.tantanapp.common.data.JsonAdapter;
import java.util.HashSet;

/* JADX INFO: loaded from: classes9.dex */
public class ti20 extends si20<Envelope> {

    /* JADX INFO: renamed from: a */
    public static byd0 f174440a = new byd0("latest_api_request_time", -1L);

    @Deprecated
    public ti20(pcj<x1d0> pcjVar, int i, boolean z) {
        super(pcjVar, new C20322a(Envelope.JSON_ADAPTER, i), z);
    }

    /* JADX INFO: renamed from: b */
    public static Envelope m191309b(Envelope envelope, int i) {
        envelope.localOptions = i;
        m191310c(envelope, i);
        String str = xi5.API_VERSION_V2;
        return envelope;
    }

    /* JADX INFO: renamed from: c */
    public static Envelope m191310c(Envelope envelope, int i) {
        HashSet<String> hashSet = new HashSet<>();
        envelope.localOptions = i;
        dg00 dg00Var = uqb0.f180404j0;
        if (dg00Var != null && dg00Var.m115602z("feed")) {
            hashSet = uqb0.f180397c0.mo105290O0(envelope, Integer.valueOf(i));
        }
        dg00 dg00Var2 = uqb0.f180404j0;
        if (dg00Var2 != null && dg00Var2.m115602z("core")) {
            uqb0.f180397c0.mo105295T3(envelope, hashSet, Integer.valueOf(i));
        }
        return envelope;
    }

    @Deprecated
    public ti20(pcj<x1d0> pcjVar, boolean z) {
        this(pcjVar, xi5.MESSAGE_IN_CONVERSATION | xi5.INFER_INVALID_MOMENT_REFERENCE, z);
    }

    @Deprecated
    public ti20(pcj<x1d0> pcjVar, int i) {
        this(pcjVar, i, false);
    }

    @Deprecated
    public ti20(pcj<x1d0> pcjVar) {
        this(pcjVar, false);
    }

    /* JADX INFO: renamed from: l.ti20$a */
    public class C20322a extends ConvertedJsonAdapter<Envelope, Envelope> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f174441a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20322a(JsonAdapter jsonAdapter, int i) {
            super(jsonAdapter);
            this.f174441a = i;
        }

        @Override // com.tantanapp.common.data.ConvertedJsonAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Envelope mo60910to(Envelope envelope) {
            ti20.f174440a.put(Long.valueOf(uqb0.f180376H.guessedCurrentServerTime()));
            return ti20.m191309b(envelope, this.f174441a);
        }

        @Override // com.tantanapp.common.data.ConvertedJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Envelope from(Envelope envelope) {
            return envelope;
        }
    }
}
