package p153l;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.C0273a;
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
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00148\u0006X\u0086D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, m88121d2 = {"Ll/nq80;", "Ll/bre0;", "Ll/hq80;", "<init>", "()V", "Ljava/io/InputStream;", "input", "c", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Constants.KEY_T, "Ljava/io/OutputStream;", "output", "", "h", "(Ll/hq80;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "value", "Landroidx/datastore/preferences/PreferencesProto$Value;", "g", "(Ljava/lang/Object;)Landroidx/datastore/preferences/PreferencesProto$Value;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Landroidx/datastore/preferences/core/MutablePreferences;", "mutablePreferences", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Landroidx/datastore/preferences/PreferencesProto$Value;Landroidx/datastore/preferences/core/MutablePreferences;)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "fileExtension", "e", "()Ll/hq80;", "defaultValue", "datastore-preferences-core"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class nq80 implements bre0<hq80> {

    @NotNull
    public static final nq80 INSTANCE = new nq80();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String fileExtension = "preferences_pb";

    /* JADX INFO: renamed from: l.nq80$a */
    @Metadata(m88122k = 3, m88123mv = {1, 5, 1}, m88125xi = 48)
    public /* synthetic */ class C18921a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f143190a;

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
            f143190a = iArr;
        }
    }

    @Override // p153l.bre0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo106132c(@NotNull InputStream inputStream, @NotNull Continuation<? super hq80> continuation) throws IOException {
        mq80 mq80VarM150843a = kq80.INSTANCE.m150843a(inputStream);
        MutablePreferences mutablePreferencesM141661b = iq80.m141661b(new hq80.C17537b[0]);
        Map<String, PreferencesProto$Value> mapM159495F = mq80VarM150843a.m159495F();
        mapM159495F.getClass();
        for (Map.Entry<String, PreferencesProto$Value> entry : mapM159495F.entrySet()) {
            String key = entry.getKey();
            PreferencesProto$Value value = entry.getValue();
            nq80 nq80Var = INSTANCE;
            key.getClass();
            value.getClass();
            nq80Var.m164289d(key, value, mutablePreferencesM141661b);
        }
        return mutablePreferencesM141661b.m136605d();
    }

    /* JADX INFO: renamed from: d */
    public final void m164289d(String name, PreferencesProto$Value value, MutablePreferences mutablePreferences) throws CorruptionException {
        PreferencesProto$Value.ValueCase valueCaseM1456S = value.m1456S();
        switch (valueCaseM1456S == null ? -1 : C18921a.f143190a[valueCaseM1456S.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                nbr.m162172a();
                return;
            case 1:
                mutablePreferences.m1487j(jq80.m146560a(name), Boolean.valueOf(value.m1449K()));
                return;
            case 2:
                mutablePreferences.m1487j(jq80.m146562c(name), Float.valueOf(value.m1451N()));
                return;
            case 3:
                mutablePreferences.m1487j(jq80.m146561b(name), Double.valueOf(value.m1450M()));
                return;
            case 4:
                mutablePreferences.m1487j(jq80.m146563d(name), Integer.valueOf(value.m1452O()));
                return;
            case 5:
                mutablePreferences.m1487j(jq80.m146564e(name), Long.valueOf(value.m1453P()));
                return;
            case 6:
                hq80.C17536a<String> c17536aM146565f = jq80.m146565f(name);
                String strM1454Q = value.m1454Q();
                strM1454Q.getClass();
                mutablePreferences.m1487j(c17536aM146565f, strM1454Q);
                return;
            case 7:
                hq80.C17536a<Set<String>> c17536aM146566g = jq80.m146566g(name);
                List<String> listM1478H = value.m1455R().m1478H();
                listM1478H.getClass();
                mutablePreferences.m1487j(c17536aM146566g, CollectionsKt.toSet(listM1478H));
                return;
            case 8:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }

    @Override // p153l.bre0
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public hq80 mo106130a() {
        return iq80.m141660a();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m164291f() {
        return fileExtension;
    }

    /* JADX INFO: renamed from: g */
    public final PreferencesProto$Value m164292g(Object value) {
        if (value instanceof Boolean) {
            PreferencesProto$Value preferencesProto$ValueBuild = PreferencesProto$Value.m1448T().m1465A(((Boolean) value).booleanValue()).build();
            preferencesProto$ValueBuild.getClass();
            return preferencesProto$ValueBuild;
        }
        if (value instanceof Float) {
            PreferencesProto$Value preferencesProto$ValueBuild2 = PreferencesProto$Value.m1448T().m1467C(((Number) value).floatValue()).build();
            preferencesProto$ValueBuild2.getClass();
            return preferencesProto$ValueBuild2;
        }
        if (value instanceof Double) {
            PreferencesProto$Value preferencesProto$ValueBuild3 = PreferencesProto$Value.m1448T().m1466B(((Number) value).doubleValue()).build();
            preferencesProto$ValueBuild3.getClass();
            return preferencesProto$ValueBuild3;
        }
        if (value instanceof Integer) {
            PreferencesProto$Value preferencesProto$ValueBuild4 = PreferencesProto$Value.m1448T().m1468D(((Number) value).intValue()).build();
            preferencesProto$ValueBuild4.getClass();
            return preferencesProto$ValueBuild4;
        }
        if (value instanceof Long) {
            PreferencesProto$Value preferencesProto$ValueBuild5 = PreferencesProto$Value.m1448T().m1469E(((Number) value).longValue()).build();
            preferencesProto$ValueBuild5.getClass();
            return preferencesProto$ValueBuild5;
        }
        if (value instanceof String) {
            PreferencesProto$Value preferencesProto$ValueBuild6 = PreferencesProto$Value.m1448T().m1470G((String) value).build();
            preferencesProto$ValueBuild6.getClass();
            return preferencesProto$ValueBuild6;
        }
        if (!(value instanceof Set)) {
            wtq0.m207906a(Intrinsics.m88385l("PreferencesSerializer does not support type: ", value.getClass().getName()));
            return null;
        }
        PreferencesProto$Value preferencesProto$ValueBuild7 = PreferencesProto$Value.m1448T().m1471K(C0273a.m1475I().m1479A((Set) value)).build();
        preferencesProto$ValueBuild7.getClass();
        return preferencesProto$ValueBuild7;
    }

    @Override // p153l.bre0
    @Nullable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object mo106131b(@NotNull hq80 hq80Var, @NotNull OutputStream outputStream, @NotNull Continuation<? super Unit> continuation) throws IOException {
        Map<hq80.C17536a<?>, Object> mapMo1480a = hq80Var.mo1480a();
        mq80.C18671a c18671aM159492I = mq80.m159492I();
        for (Map.Entry<hq80.C17536a<?>, Object> entry : mapMo1480a.entrySet()) {
            c18671aM159492I.m159498A(entry.getKey().getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String(), m164292g(entry.getValue()));
        }
        c18671aM159492I.build().m1795i(outputStream);
        return Unit.INSTANCE;
    }
}
