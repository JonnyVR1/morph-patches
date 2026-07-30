package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Ll/ioo0;", "", "<init>", "()V", "Companion", "a", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ioo0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l.ioo0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, m87232d2 = {"Ll/ioo0$a;", "", "<init>", "()V", "", "number", "", "a", "(D)Ljava/lang/String;", "num", "b", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m137367a(double number) {
            String strValueOf;
            if (number > 9.9999999E7d) {
                float fFloatValue = new BigDecimal(String.valueOf(number / 1.0E8d)).setScale(4, 1).floatValue();
                if (x8u.m207431a()) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    Locale locale = Locale.US;
                    String string = App.f15369e.getString(R$string.f47486r);
                    string.getClass();
                    strValueOf = String.format(locale, string, Arrays.copyOf(new Object[]{m137368b(fFloatValue)}, 1));
                } else {
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    Locale locale2 = Locale.US;
                    String string2 = App.f15369e.getString(R$string.f47516s7);
                    string2.getClass();
                    strValueOf = String.format(locale2, string2, Arrays.copyOf(new Object[]{m137368b(fFloatValue * 100.0f)}, 1));
                }
            } else if (number > 9999999.0d) {
                float fFloatValue2 = new BigDecimal(String.valueOf(number / 1.0E7d)).setScale(4, 1).floatValue();
                if (x8u.m207431a()) {
                    StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                    Locale locale3 = Locale.US;
                    String string3 = App.f15369e.getString(R$string.f46599Bk);
                    string3.getClass();
                    strValueOf = String.format(locale3, string3, Arrays.copyOf(new Object[]{m137368b(fFloatValue2)}, 1));
                } else {
                    StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                    Locale locale4 = Locale.US;
                    String string4 = App.f15369e.getString(R$string.f47516s7);
                    string4.getClass();
                    strValueOf = String.format(locale4, string4, Arrays.copyOf(new Object[]{m137368b(fFloatValue2 * 10.0f)}, 1));
                }
            } else if (number > 999999.0d) {
                float fFloatValue3 = new BigDecimal(String.valueOf(number / 1000000.0d)).setScale(4, 1).floatValue();
                if (x8u.m207431a()) {
                    StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
                    Locale locale5 = Locale.US;
                    String string5 = App.f15369e.getString(R$string.f46621Ck);
                    string5.getClass();
                    strValueOf = String.format(locale5, string5, Arrays.copyOf(new Object[]{m137368b(fFloatValue3 * 100.0f)}, 1));
                } else {
                    StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
                    Locale locale6 = Locale.US;
                    String string6 = App.f15369e.getString(R$string.f47516s7);
                    string6.getClass();
                    strValueOf = String.format(locale6, string6, Arrays.copyOf(new Object[]{m137368b(fFloatValue3)}, 1));
                }
            } else if (number > 9999.0d) {
                float fFloatValue4 = new BigDecimal(String.valueOf(number / 10000.0d)).setScale(4, 1).floatValue();
                if (x8u.m207431a()) {
                    StringCompanionObject stringCompanionObject7 = StringCompanionObject.INSTANCE;
                    Locale locale7 = Locale.US;
                    String string7 = App.f15369e.getString(R$string.f46621Ck);
                    string7.getClass();
                    strValueOf = String.format(locale7, string7, Arrays.copyOf(new Object[]{m137368b(fFloatValue4)}, 1));
                } else {
                    StringCompanionObject stringCompanionObject8 = StringCompanionObject.INSTANCE;
                    Locale locale8 = Locale.US;
                    String string8 = App.f15369e.getString(R$string.f46681Fe);
                    string8.getClass();
                    strValueOf = String.format(locale8, string8, Arrays.copyOf(new Object[]{m137368b(fFloatValue4 * 10.0f)}, 1));
                }
            } else if (number > 999.0d) {
                float fFloatValue5 = new BigDecimal(String.valueOf(number / 1000.0d)).setScale(4, 1).floatValue();
                if (x8u.m207431a()) {
                    strValueOf = String.valueOf((int) number);
                } else {
                    StringCompanionObject stringCompanionObject9 = StringCompanionObject.INSTANCE;
                    Locale locale9 = Locale.US;
                    String string9 = App.f15369e.getString(R$string.f46681Fe);
                    string9.getClass();
                    strValueOf = String.format(locale9, string9, Arrays.copyOf(new Object[]{m137368b(fFloatValue5)}, 1));
                }
            } else {
                strValueOf = String.valueOf((int) number);
            }
            return C15386d.m93479F(strValueOf, Constants.SEPARATOR_COMMA, ".", false, 4, null);
        }

        /* JADX INFO: renamed from: b */
        public final String m137368b(double num) {
            return new DecimalFormat("#.##").format(num);
        }

        public Companion() {
        }
    }
}
