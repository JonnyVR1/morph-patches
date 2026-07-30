package p153l;

import android.content.SharedPreferences;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Condition;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m88121d2 = {"Ll/j4f0;", p7f.GPS_DIRECTION_TRUE, "", "Landroid/content/SharedPreferences;", "oldSharedPreferences", "newSharedPreferences", "Ljava/lang/Class;", "valueType", "Lkotlin/Function1;", "", Condition.TYPE, "<init>", "(Landroid/content/SharedPreferences;Landroid/content/SharedPreferences;Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)V", "", "a", "()V", "Landroid/content/SharedPreferences;", "b", "c", "Ljava/lang/Class;", Constants.INAPP_DATA_TAG, "Lkotlin/jvm/functions/Function1;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class j4f0<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SharedPreferences oldSharedPreferences;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SharedPreferences newSharedPreferences;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Class<T> valueType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function1<T, Boolean> condition;

    /* JADX WARN: Multi-variable type inference failed */
    public j4f0(@NotNull SharedPreferences sharedPreferences, @NotNull SharedPreferences sharedPreferences2, @NotNull Class<T> cls, @NotNull Function1<? super T, Boolean> function1) {
        sharedPreferences.getClass();
        sharedPreferences2.getClass();
        cls.getClass();
        function1.getClass();
        this.oldSharedPreferences = sharedPreferences;
        this.newSharedPreferences = sharedPreferences2;
        this.valueType = cls;
        this.condition = function1;
    }

    /* JADX INFO: renamed from: a */
    public final void m143413a() {
        Map<String, ?> all = this.oldSharedPreferences.getAll();
        SharedPreferences.Editor editorEdit = this.newSharedPreferences.edit();
        all.getClass();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (this.valueType.isInstance(value) && this.condition.invoke((T) value).booleanValue()) {
                Class<T> cls = this.valueType;
                if (Intrinsics.m88377d(cls, Boolean.class)) {
                    value.getClass();
                    editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
                } else if (Intrinsics.m88377d(cls, Integer.class)) {
                    value.getClass();
                    editorEdit.putInt(key, ((Integer) value).intValue());
                } else if (Intrinsics.m88377d(cls, Long.class)) {
                    value.getClass();
                    editorEdit.putLong(key, ((Long) value).longValue());
                } else if (Intrinsics.m88377d(cls, Float.class)) {
                    value.getClass();
                    editorEdit.putFloat(key, ((Float) value).floatValue());
                } else if (Intrinsics.m88377d(cls, String.class)) {
                    value.getClass();
                    editorEdit.putString(key, (String) value);
                } else {
                    if (value instanceof Boolean) {
                        editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
                    } else if (value instanceof Integer) {
                        editorEdit.putInt(key, ((Number) value).intValue());
                    } else if (value instanceof Long) {
                        editorEdit.putLong(key, ((Number) value).longValue());
                    } else if (value instanceof Float) {
                        editorEdit.putFloat(key, ((Number) value).floatValue());
                    } else if (value instanceof String) {
                        editorEdit.putString(key, (String) value);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        editorEdit.getClass();
        v5g0.m199858l(editorEdit);
        this.oldSharedPreferences.edit().clear().apply();
    }
}
