package com.tantanapp.sharelib.workmanager;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\u0005R3\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0002\b\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\u0005R\"\u0010\u001e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\f\u0010\t\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, m88121d2 = {"Lcom/tantanapp/sharelib/workmanager/Constraints;", "", "", "tryLimit", "<init>", "(I)V", "()V", "", "f", "()Z", "e", "()I", "a", "I", Constants.INAPP_DATA_TAG, "setTryLimit", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "b", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "setPredicate", "(Lkotlin/jvm/functions/Function1;)V", "predicate", "c", "setTryAttemptCount", "tryAttemptCount", "Z", "setInterruptWhenFailure", "(Z)V", "interruptWhenFailure", "Builder", "workmanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class Constraints {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int tryLimit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Function1<? super Constraints, Boolean> predicate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int tryAttemptCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean interruptWhenFailure;

    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R3\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, m88121d2 = {"Lcom/tantanapp/sharelib/workmanager/Constraints$Builder;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/tantanapp/sharelib/workmanager/Constraints;", "", "Lkotlin/ExtensionFunctionType;", "a", "Lkotlin/jvm/functions/Function1;", "getPredicate", "()Lkotlin/jvm/functions/Function1;", "setPredicate", "(Lkotlin/jvm/functions/Function1;)V", "predicate", "workmanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public Function1<? super Constraints, Boolean> predicate = new Function1<Constraints, Boolean>() { // from class: com.tantanapp.sharelib.workmanager.Constraints$Builder$predicate$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Constraints constraints) {
                constraints.getClass();
                return Boolean.FALSE;
            }
        };
    }

    public Constraints(int i) {
        this.tryLimit = i;
        this.predicate = new Function1<Constraints, Boolean>() { // from class: com.tantanapp.sharelib.workmanager.Constraints$predicate$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Constraints constraints) {
                constraints.getClass();
                return Boolean.FALSE;
            }
        };
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getInterruptWhenFailure() {
        return this.interruptWhenFailure;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Function1<Constraints, Boolean> m82711b() {
        return this.predicate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getTryAttemptCount() {
        return this.tryAttemptCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTryLimit() {
        return this.tryLimit;
    }

    /* JADX INFO: renamed from: e */
    public final int m82714e() {
        int i = this.tryAttemptCount;
        this.tryAttemptCount = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m82715f() {
        return this.tryAttemptCount <= this.tryLimit;
    }

    public Constraints() {
        this(0);
    }
}
