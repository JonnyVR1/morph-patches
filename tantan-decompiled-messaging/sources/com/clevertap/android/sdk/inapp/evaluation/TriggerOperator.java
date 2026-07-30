package com.clevertap.android.sdk.inapp.evaluation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/evaluation/TriggerOperator;", "", "", "operatorValue", "<init>", "(Ljava/lang/String;II)V", "I", "getOperatorValue", "()I", "Companion", "a", "GreaterThan", "Equals", "LessThan", "Contains", "Between", "NotEquals", "Set", "NotSet", "NotContains", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public enum TriggerOperator {
    GreaterThan(0),
    Equals(1),
    LessThan(2),
    Contains(3),
    Between(4),
    NotEquals(15),
    Set(26),
    NotSet(27),
    NotContains(28);

    private final int operatorValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.evaluation.TriggerOperator$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/evaluation/TriggerOperator$a;", "", "<init>", "()V", "", "operatorValue", "Lcom/clevertap/android/sdk/inapp/evaluation/TriggerOperator;", "a", "(I)Lcom/clevertap/android/sdk/inapp/evaluation/TriggerOperator;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final TriggerOperator m6365a(int operatorValue) {
            for (TriggerOperator triggerOperator : TriggerOperator.values()) {
                if (triggerOperator.getOperatorValue() == operatorValue) {
                    if (triggerOperator == null) {
                        return TriggerOperator.Equals;
                    }
                    return triggerOperator;
                }
            }
            triggerOperator = null;
            if (triggerOperator == null) {
                return TriggerOperator.Equals;
            }
            return triggerOperator;
        }

        private Companion() {
        }
    }

    TriggerOperator(int i) {
        this.operatorValue = i;
    }

    @NotNull
    public static EnumEntries<TriggerOperator> getEntries() {
        return $ENTRIES;
    }

    public final int getOperatorValue() {
        return this.operatorValue;
    }
}
