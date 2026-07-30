package p006l;

import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.data.ConvertedJsonAdapter;
import com.tantanapp.common.data.INetParser;
import com.tantanapp.common.data.JsonAdapter;
import java.util.HashSet;
import l.stc0;
import l.u700;
import l.v9j;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class la20 extends ka20<Envelope> {

    /* JADX INFO: renamed from: a */
    public static zpd0 f16296a = new zpd0("latest_api_request_time", -1L);

    @Deprecated
    public la20(v9j<stc0> v9jVar, int i, boolean z) {
        super(v9jVar, (INetParser) new C0966a(Envelope.JSON_ADAPTER, i), z);
    }

    /* JADX INFO: renamed from: b */
    public static Envelope m18623b(Envelope envelope, int i) {
        envelope.localOptions = i;
        m18624c(envelope, i);
        String str = xh5.API_VERSION_V2;
        return envelope;
    }

    /* JADX INFO: renamed from: c */
    public static Envelope m18624c(Envelope envelope, int i) {
        HashSet<String> hashSet = new HashSet<>();
        envelope.localOptions = i;
        u700 u700Var = qib0.f19812j0;
        if (u700Var != null && u700Var.z("feed")) {
            hashSet = qib0.f19805c0.mo11993O0(envelope, Integer.valueOf(i));
        }
        u700 u700Var2 = qib0.f19812j0;
        if (u700Var2 != null && u700Var2.z("core")) {
            qib0.f19805c0.mo11998T3(envelope, hashSet, Integer.valueOf(i));
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
    public class C0966a extends ConvertedJsonAdapter<Envelope, Envelope> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f16297a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0966a(JsonAdapter jsonAdapter, int i) {
            super(jsonAdapter);
            this.f16297a = i;
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Envelope m18627to(Envelope envelope) {
            la20.f16296a.put(Long.valueOf(qib0.f19784H.guessedCurrentServerTime()));
            return la20.m18623b(envelope, this.f16297a);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Envelope from(Envelope envelope) {
            return envelope;
        }
    }
}
