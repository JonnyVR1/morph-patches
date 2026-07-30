package p153l;

import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/aox;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "", "isDiamond", "", "available", "b", "(ZJ)Ljava/lang/String;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class aox {

    @NotNull
    public static final aox INSTANCE = new aox();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m99234a() {
        boolean zMo31838xf = CoreModule.m30930K().mo31838xf();
        return m99235b(zMo31838xf, zMo31838xf ? CoreModule.f18264c.f20315I0.m144054K3() : CoreModule.f18264c.f20312H0.m155435Y4());
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m99235b(boolean isDiamond, long available) {
        if (available < 1) {
            String string = App.f16088e.getString(R$string.f19395kb);
            string.getClass();
            return string;
        }
        String strM96120U = a5i0.m96120U(available);
        if (isDiamond) {
            String string2 = App.f16088e.getString(com.p051p1.mobile.putong.core.pay.R$string.f28305g8, strM96120U);
            string2.getClass();
            return string2;
        }
        String string3 = App.f16088e.getString(com.p051p1.mobile.putong.core.pay.R$string.f28089N7, strM96120U);
        string3.getClass();
        return string3;
    }
}
