package com.facebook.internal;

import com.momo.rtcbase.PeerConnectionFactory;
import com.p051p1.mobile.putong.live.base.data.BLiveChatJailedType;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.commons.codec.language.p126bm.Rule;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\t\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m88121d2 = {"Lcom/facebook/internal/SmartLoginOption;", "", "", "value", "<init>", "(Ljava/lang/String;IJ)V", "J", "getValue", "()J", "Companion", "a", BLiveChatJailedType.None, PeerConnectionFactory.TRIAL_ENABLED, "RequireConfirm", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public enum SmartLoginOption {
    None(0),
    Enabled(1),
    RequireConfirm(2);


    @NotNull
    private static final EnumSet<SmartLoginOption> ALL;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long value;

    /* JADX INFO: renamed from: com.facebook.internal.SmartLoginOption$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Lcom/facebook/internal/SmartLoginOption$a;", "", "<init>", "()V", "", "bitmask", "Ljava/util/EnumSet;", "Lcom/facebook/internal/SmartLoginOption;", "a", "(J)Ljava/util/EnumSet;", Rule.ALL, "Ljava/util/EnumSet;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final EnumSet<SmartLoginOption> m8758a(long bitmask) {
            EnumSet<SmartLoginOption> enumSetNoneOf = EnumSet.noneOf(SmartLoginOption.class);
            for (SmartLoginOption smartLoginOption : SmartLoginOption.ALL) {
                if ((smartLoginOption.getValue() & bitmask) != 0) {
                    enumSetNoneOf.add(smartLoginOption);
                }
            }
            enumSetNoneOf.getClass();
            return enumSetNoneOf;
        }

        public Companion() {
        }
    }

    static {
        EnumSet<SmartLoginOption> enumSetAllOf = EnumSet.allOf(SmartLoginOption.class);
        enumSetAllOf.getClass();
        ALL = enumSetAllOf;
    }

    SmartLoginOption(long j) {
        this.value = j;
    }

    @JvmStatic
    @NotNull
    public static final EnumSet<SmartLoginOption> parseOptions(long j) {
        return INSTANCE.m8758a(j);
    }

    public final long getValue() {
        return this.value;
    }
}
