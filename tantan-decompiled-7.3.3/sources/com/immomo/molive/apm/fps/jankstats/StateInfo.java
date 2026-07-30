package com.immomo.molive.apm.fps.jankstats;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C0799b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0010"}, m88121d2 = {"Lcom/immomo/molive/apm/fps/jankstats/StateInfo;", "Ljava/io/Serializable;", "stateName", "", "state", "(Ljava/lang/String;Ljava/lang/String;)V", "getState", "()Ljava/lang/String;", "getStateName", "equals", "", "other", "", "hashCode", "", "toString", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 1, 16})
public final class StateInfo implements Serializable {

    @NotNull
    private final String state;

    @NotNull
    private final String stateName;

    public StateInfo(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.stateName = str;
        this.state = str2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m88377d(StateInfo.class, other != null ? other.getClass() : null)) {
            return false;
        }
        if (other != null) {
            StateInfo stateInfo = (StateInfo) other;
            return Intrinsics.m88377d(this.stateName, stateInfo.stateName) && Intrinsics.m88377d(this.state, stateInfo.state);
        }
        C0799b.m4641a("null cannot be cast to non-null type com.immomo.molive.apm.fps.jankstats.StateInfo");
        return false;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    @NotNull
    public final String getStateName() {
        return this.stateName;
    }

    public int hashCode() {
        return (this.stateName.hashCode() * 31) + this.state.hashCode();
    }

    @NotNull
    public String toString() {
        return this.stateName + ": " + this.state;
    }
}
