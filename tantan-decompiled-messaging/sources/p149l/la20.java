package p149l;

import com.p046p1.mobile.putong.data.Envelope;
import com.tantanapp.common.data.ConvertedJsonAdapter;
import com.tantanapp.common.data.JsonAdapter;
import java.util.HashSet;

/* JADX INFO: loaded from: classes9.dex */
public class la20 extends ka20<Envelope> {

    /* JADX INFO: renamed from: a */
    public static zpd0 f127161a = new zpd0("latest_api_request_time", -1L);

    @Deprecated
    public la20(v9j<stc0> v9jVar, int i, boolean z) {
        super(v9jVar, new C18178a(Envelope.JSON_ADAPTER, i), z);
    }

    /* JADX INFO: renamed from: b */
    public static Envelope m149123b(Envelope envelope, int i) {
        envelope.localOptions = i;
        m149124c(envelope, i);
        String str = xh5.API_VERSION_V2;
        return envelope;
    }

    /* JADX INFO: renamed from: c */
    public static Envelope m149124c(Envelope envelope, int i) {
        HashSet<String> hashSet = new HashSet<>();
        envelope.localOptions = i;
        u700 u700Var = qib0.f154721j0;
        if (u700Var != null && u700Var.m192072z("feed")) {
            hashSet = qib0.f154714c0.mo97501O0(envelope, Integer.valueOf(i));
        }
        u700 u700Var2 = qib0.f154721j0;
        if (u700Var2 != null && u700Var2.m192072z("core")) {
            qib0.f154714c0.mo97506T3(envelope, hashSet, Integer.valueOf(i));
        }
        return envelope;
    }

    @Deprecated
    public la20(v9j<stc0> v9jVar, boolean z) {
        this(v9jVar, xh5.MESSAGE_IN_CONVERSATION | xh5.INFER_INVALID_MOMENT_REFERENCE, z);
    }

    @Deprecated
    public la20(v9j<stc0> v9jVar, int i) {
        this(v9jVar, i, false);
    }

    @Deprecated
    public la20(v9j<stc0> v9jVar) {
        this(v9jVar, false);
    }

    /* JADX INFO: renamed from: l.la20$a */
    public class C18178a extends ConvertedJsonAdapter<Envelope, Envelope> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f127162a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18178a(JsonAdapter jsonAdapter, int i) {
            super(jsonAdapter);
            this.f127162a = i;
        }

        @Override // com.tantanapp.common.data.ConvertedJsonAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Envelope mo59726to(Envelope envelope) {
            la20.f127161a.put(Long.valueOf(qib0.f154693H.guessedCurrentServerTime()));
            return la20.m149123b(envelope, this.f127162a);
        }

        @Override // com.tantanapp.common.data.ConvertedJsonAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Envelope from(Envelope envelope) {
            return envelope;
        }
    }
}
