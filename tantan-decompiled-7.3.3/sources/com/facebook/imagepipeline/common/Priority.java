package com.facebook.imagepipeline.common;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m88121d2 = {"Lcom/facebook/imagepipeline/common/Priority;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "LOW", "MEDIUM", "HIGH", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public enum Priority {
    LOW,
    MEDIUM,
    HIGH;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.facebook.imagepipeline.common.Priority$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/facebook/imagepipeline/common/Priority$a;", "", "<init>", "()V", "Lcom/facebook/imagepipeline/common/Priority;", "priority1", "priority2", "a", "(Lcom/facebook/imagepipeline/common/Priority;Lcom/facebook/imagepipeline/common/Priority;)Lcom/facebook/imagepipeline/common/Priority;", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Priority m8459a(@NotNull Priority priority1, @NotNull Priority priority2) {
            priority1.getClass();
            priority2.getClass();
            return priority1.ordinal() > priority2.ordinal() ? priority1 : priority2;
        }

        public Companion() {
        }
    }

    @NotNull
    public static EnumEntries<Priority> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    @NotNull
    public static final Priority getHigherPriority(@NotNull Priority priority, @NotNull Priority priority2) {
        return INSTANCE.m8459a(priority, priority2);
    }
}
