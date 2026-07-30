package p149l;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.C0272a;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.core.MutablePreferences;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00148\u0006X\u0086D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, m87232d2 = {"Ll/ii80;", "Ll/wie0;", "Ll/ci80;", "<init>", "()V", "Ljava/io/InputStream;", "input", "c", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Constants.KEY_T, "Ljava/io/OutputStream;", "output", "", "h", "(Ll/ci80;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "value", "Landroidx/datastore/preferences/PreferencesProto$Value;", "g", "(Ljava/lang/Object;)Landroidx/datastore/preferences/PreferencesProto$Value;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Landroidx/datastore/preferences/core/MutablePreferences;", "mutablePreferences", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Landroidx/datastore/preferences/PreferencesProto$Value;Landroidx/datastore/preferences/core/MutablePreferences;)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "fileExtension", "e", "()Ll/ci80;", "defaultValue", "datastore-preferences-core"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public final class ii80 implements wie0<ci80> {

    @NotNull
    public static final ii80 INSTANCE = new ii80();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String fileExtension = "preferences_pb";

    /* JADX INFO: renamed from: l.ii80$a */
    @Metadata(m87233k = 3, m87234mv = {1, 5, 1}, m87236xi = 48)
    public /* synthetic */ class C17558a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f113373a;

        static {
            int[] iArr = new int[PreferencesProto$Value.ValueCase.values().length];
            iArr[PreferencesProto$Value.ValueCase.BOOLEAN.ordinal()] = 1;
            iArr[PreferencesProto$Value.ValueCase.FLOAT.ordinal()] = 2;
            iArr[PreferencesProto$Value.ValueCase.DOUBLE.ordinal()] = 3;
            iArr[PreferencesProto$Value.ValueCase.INTEGER.ordinal()] = 4;
            iArr[PreferencesProto$Value.ValueCase.LONG.ordinal()] = 5;
            iArr[PreferencesProto$Value.ValueCase.STRING.ordinal()] = 6;
            iArr[PreferencesProto$Value.ValueCase.STRING_SET.ordinal()] = 7;
            iArr[PreferencesProto$Value.ValueCase.VALUE_NOT_SET.ordinal()] = 8;
            f113373a = iArr;
        }
    }

    @Override // p149l.wie0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo136353c(@NotNull InputStream inputStream, @NotNull Continuation<? super ci80> continuation) throws IOException {
        hi80 hi80VarM121502a = fi80.INSTANCE.m121502a(inputStream);
        MutablePreferences mutablePreferencesM111870b = di80.m111870b(new ci80.C16163b[0]);
        Map<String, PreferencesProto$Value> mapM131233F = hi80VarM121502a.m131233F();
        mapM131233F.getClass();
        for (Map.Entry<String, PreferencesProto$Value> entry : mapM131233F.entrySet()) {
            String key = entry.getKey();
            PreferencesProto$Value value = entry.getValue();
            ii80 ii80Var = INSTANCE;
            key.getClass();
            value.getClass();
            ii80Var.m136354d(key, value, mutablePreferencesM111870b);
        }
        return mutablePreferencesM111870b.m107056d();
    }

    /* JADX INFO: renamed from: d */
    public final void m136354d(String name, PreferencesProto$Value value, MutablePreferences mutablePreferences) throws CorruptionException {
        PreferencesProto$Value.ValueCase valueCaseM1455S = value.m1455S();
        switch (valueCaseM1455S == null ? -1 : C17558a.f113373a[valueCaseM1455S.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                l9r.m149037a();
                return;
            case 1:
                mutablePreferences.m1486j(ei80.m116654a(name), Boolean.valueOf(value.m1448K()));
                return;
            case 2:
                mutablePreferences.m1486j(ei80.m116656c(name), Float.valueOf(value.m1450N()));
                return;
            case 3:
                mutablePreferences.m1486j(ei80.m116655b(name), Double.valueOf(value.m1449M()));
                return;
            case 4:
                mutablePreferences.m1486j(ei80.m116657d(name), Integer.valueOf(value.m1451O()));
                return;
            case 5:
                mutablePreferences.m1486j(ei80.m116658e(name), Long.valueOf(value.m1452P()));
                return;
            case 6:
                ci80.C16162a<String> c16162aM116659f = ei80.m116659f(name);
                String strM1453Q = value.m1453Q();
                strM1453Q.getClass();
                mutablePreferences.m1486j(c16162aM116659f, strM1453Q);
                return;
            case 7:
                ci80.C16162a<Set<String>> c16162aM116660g = ei80.m116660g(name);
                List<String> listM1477H = value.m1454R().m1477H();
                listM1477H.getClass();
                mutablePreferences.m1486j(c16162aM116660g, CollectionsKt.toSet(listM1477H));
                return;
            case 8:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }

    @Override // p149l.wie0
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ci80 mo136351a() {
        return di80.m111869a();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m136356f() {
        return fileExtension;
    }

    /* JADX INFO: renamed from: g */
    public final PreferencesProto$Value m136357g(Object value) {
        if (value instanceof Boolean) {
            PreferencesProto$Value preferencesProto$ValueBuild = PreferencesProto$Value.m1447T().m1464A(((Boolean) value).booleanValue()).build();
            preferencesProto$ValueBuild.getClass();
            return preferencesProto$ValueBuild;
        }
        if (value instanceof Float) {
            PreferencesProto$Value preferencesProto$ValueBuild2 = PreferencesProto$Value.m1447T().m1466C(((Number) value).floatValue()).build();
            preferencesProto$ValueBuild2.getClass();
            return preferencesProto$ValueBuild2;
        }
        if (value instanceof Double) {
            PreferencesProto$Value preferencesProto$ValueBuild3 = PreferencesProto$Value.m1447T().m1465B(((Number) value).doubleValue()).build();
            preferencesProto$ValueBuild3.getClass();
            return preferencesProto$ValueBuild3;
        }
        if (value instanceof Integer) {
            PreferencesProto$Value preferencesProto$ValueBuild4 = PreferencesProto$Value.m1447T().m1467D(((Number) value).intValue()).build();
            preferencesProto$ValueBuild4.getClass();
            return preferencesProto$ValueBuild4;
        }
        if (value instanceof Long) {
            PreferencesProto$Value preferencesProto$ValueBuild5 = PreferencesProto$Value.m1447T().m1468E(((Number) value).longValue()).build();
            preferencesProto$ValueBuild5.getClass();
            return preferencesProto$ValueBuild5;
        }
        if (value instanceof String) {
            PreferencesProto$Value preferencesProto$ValueBuild6 = PreferencesProto$Value.m1447T().m1469G((String) value).build();
            preferencesProto$ValueBuild6.getClass();
            return preferencesProto$ValueBuild6;
        }
        if (!(value instanceof Set)) {
            qkq0.m175383a(Intrinsics.m87496l("PreferencesSerializer does not support type: ", value.getClass().getName()));
            return null;
        }
        PreferencesProto$Value preferencesProto$ValueBuild7 = PreferencesProto$Value.m1447T().m1470K(C0272a.m1474I().m1478A((Set) value)).build();
        preferencesProto$ValueBuild7.getClass();
        return preferencesProto$ValueBuild7;
    }

    @Override // p149l.wie0
    @Nullable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object mo136352b(@NotNull ci80 ci80Var, @NotNull OutputStream outputStream, @NotNull Continuation<? super Unit> continuation) throws IOException {
        Map<ci80.C16162a<?>, Object> mapMo1479a = ci80Var.mo1479a();
        hi80.C17322a c17322aM131230I = hi80.m131230I();
        for (Map.Entry<ci80.C16162a<?>, Object> entry : mapMo1479a.entrySet()) {
            c17322aM131230I.m131236A(entry.getKey().getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String(), m136357g(entry.getValue()));
        }
        c17322aM131230I.build().m1794i(outputStream);
        return Unit.INSTANCE;
    }
}
