package p153l;

import android.app.Activity;
import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hellogroup.p036mk.fdt.FDTManager;
import com.heytap.mcssdk.mode.CommandMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/tp9;", "Ll/qpl;", "Ll/hul;", "mkWebView", "<init>", "(Ll/hul;)V", "", "namespace", FirebaseAnalytics.Param.METHOD, "Lorg/json/JSONObject;", CommandMessage.PARAMS, "", "p", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Z", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class tp9 extends qpl {

    /* JADX INFO: renamed from: l.tp9$a */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC20367a implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JSONObject f175564b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f175565c;

        /* JADX INFO: renamed from: l.tp9$a$a */
        @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"l/tp9$a$a", "Lcom/hellogroup/mk/fdt/FDTManager$a;", "", "ec", "", "em", "", "a", "(ILjava/lang/String;)V", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
        public static final class a implements FDTManager.InterfaceC3607a {
            public a() {
            }

            @Override // com.hellogroup.p036mk.fdt.FDTManager.InterfaceC3607a
            /* JADX INFO: renamed from: a */
            public void mo18523a(int ec, @NotNull String em) {
                em.getClass();
                RunnableC20367a runnableC20367a = RunnableC20367a.this;
                tp9.this.m177464h(runnableC20367a.f175565c, null, em, String.valueOf(ec));
            }
        }

        public RunnableC20367a(JSONObject jSONObject, String str) {
            this.f175564b = jSONObject;
            this.f175565c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            FDTManager.INSTANCE.m18521m(this.f175564b, new a());
        }
    }

    /* JADX INFO: renamed from: l.tp9$b */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC20368b implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JSONObject f175568b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f175569c;

        /* JADX INFO: renamed from: l.tp9$b$a */
        @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"l/tp9$b$a", "Lcom/hellogroup/mk/fdt/FDTManager$a;", "", "ec", "", "em", "", "a", "(ILjava/lang/String;)V", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
        public static final class a implements FDTManager.InterfaceC3607a {
            public a() {
            }

            @Override // com.hellogroup.p036mk.fdt.FDTManager.InterfaceC3607a
            /* JADX INFO: renamed from: a */
            public void mo18523a(int ec, @NotNull String em) {
                em.getClass();
                RunnableC20368b runnableC20368b = RunnableC20368b.this;
                tp9.this.m177464h(runnableC20368b.f175569c, null, em, String.valueOf(ec));
            }
        }

        public RunnableC20368b(JSONObject jSONObject, String str) {
            this.f175568b = jSONObject;
            this.f175569c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            FDTManager.INSTANCE.m18513a(this.f175568b, new a());
        }
    }

    /* JADX INFO: renamed from: l.tp9$c */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC20369c implements Runnable {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f175572b;

        /* JADX INFO: renamed from: l.tp9$c$a */
        @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"l/tp9$c$a", "Lcom/hellogroup/mk/fdt/FDTManager$a;", "", "ec", "", "em", "", "a", "(ILjava/lang/String;)V", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
        public static final class a implements FDTManager.InterfaceC3607a {
            public a() {
            }

            @Override // com.hellogroup.p036mk.fdt.FDTManager.InterfaceC3607a
            /* JADX INFO: renamed from: a */
            public void mo18523a(int ec, @NotNull String em) {
                em.getClass();
                RunnableC20369c runnableC20369c = RunnableC20369c.this;
                tp9.this.m177464h(runnableC20369c.f175572b, null, em, String.valueOf(ec));
            }
        }

        public RunnableC20369c(String str) {
            this.f175572b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            FDTManager.INSTANCE.m18515c(new a());
        }
    }

    /* JADX INFO: renamed from: l.tp9$d */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC20370d implements Runnable {
        public RunnableC20370d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FDTManager fDTManager = FDTManager.INSTANCE;
            Context contextM177460c = tp9.this.m177460c();
            if (!(contextM177460c instanceof Activity)) {
                contextM177460c = null;
            }
            fDTManager.m18520l((Activity) contextM177460c);
        }
    }

    /* JADX INFO: renamed from: l.tp9$e */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m88121d2 = {"<anonymous>", "", "run"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class RunnableC20371e implements Runnable {
        public static final RunnableC20371e INSTANCE = new RunnableC20371e();

        @Override // java.lang.Runnable
        public final void run() {
            FDTManager.INSTANCE.m18516e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp9(@NotNull hul hulVar) {
        super(hulVar);
        hulVar.getClass();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p153l.qpl
    /* JADX INFO: renamed from: p */
    public boolean mo18018p(@Nullable String namespace, @Nullable String method, @Nullable JSONObject params) {
        if (!Intrinsics.m88377d("fdt", namespace)) {
            return false;
        }
        if (!rs8.m182930u()) {
            t1j0.m188917m("需要配置config才可以使用FDT哦");
            return true;
        }
        if (params == null) {
            Intrinsics.m88386m();
        }
        String strOptString = params.optString("callback");
        if (method != null) {
            switch (method.hashCode()) {
                case -1540735178:
                    if (method.equals("keepScreenAlwaysLight")) {
                        x310.m209186d(new RunnableC20370d());
                        m177464h(strOptString, null, "ok", String.valueOf(0));
                    }
                    break;
                case -1176871341:
                    if (method.equals("checkDNSStatus")) {
                        x310.m209186d(new RunnableC20369c(strOptString));
                    }
                    break;
                case 103149417:
                    if (method.equals("login")) {
                        x310.m209186d(new RunnableC20367a(params, strOptString));
                    }
                    break;
                case 530405532:
                    if (method.equals("disconnect")) {
                        x310.m209186d(RunnableC20371e.INSTANCE);
                        m177464h(strOptString, null, "ok", String.valueOf(0));
                    }
                    break;
                case 1551567390:
                    if (method.equals("authDevice")) {
                        x310.m209186d(new RunnableC20368b(params, strOptString));
                    }
                    break;
            }
        }
        return true;
    }
}
