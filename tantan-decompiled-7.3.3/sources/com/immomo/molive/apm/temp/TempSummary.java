package com.immomo.molive.apm.temp;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p153l.erl;
import p153l.vpi0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012\"\u0004\b\u0015\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u0019"}, m88121d2 = {"Lcom/immomo/molive/apm/temp/TempSummary;", "Ll/erl;", "Ll/vpi0;", "cupTemp", "batteryTemp", "skinTemp", "<init>", "(Ll/vpi0;Ll/vpi0;Ll/vpi0;)V", "a", "()Lcom/immomo/molive/apm/temp/TempSummary;", "", "toString", "()Ljava/lang/String;", "Lcom/immomo/molive/apm/temp/TempSummary;", "cloneTempSummary", "b", "Ll/vpi0;", "c", "()Ll/vpi0;", "setCupTemp", "(Ll/vpi0;)V", "setBatteryTemp", Constants.INAPP_DATA_TAG, "setSkinTemp", "TempType", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class TempSummary implements erl<TempSummary> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private TempSummary cloneTempSummary;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private vpi0 cupTemp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private vpi0 batteryTemp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private vpi0 skinTemp;

    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m88121d2 = {"Lcom/immomo/molive/apm/temp/TempSummary$TempType;", "", "(Ljava/lang/String;I)V", "CPU", "BATTERY", "GPU", "MODEM", "SKIN", "MEMORY", "POWER_SUPPLY", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 1, 16})
    public enum TempType {
        CPU,
        BATTERY,
        GPU,
        MODEM,
        SKIN,
        MEMORY,
        POWER_SUPPLY
    }

    public /* synthetic */ TempSummary(vpi0 vpi0Var, vpi0 vpi0Var2, vpi0 vpi0Var3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new vpi0(TempType.CPU, 0) : vpi0Var, (i & 2) != 0 ? new vpi0(TempType.BATTERY, 0) : vpi0Var2, (i & 4) != 0 ? new vpi0(TempType.SKIN, 0) : vpi0Var3);
    }

    @Override // p153l.erl
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public TempSummary clone() {
        vpi0 vpi0Var;
        vpi0 vpi0Var2;
        vpi0 vpi0Var3;
        if (this.cloneTempSummary == null) {
            this.cloneTempSummary = new TempSummary(null, null, null, 7, null);
        }
        TempSummary tempSummary = this.cloneTempSummary;
        if (tempSummary != null && (vpi0Var3 = tempSummary.cupTemp) != null) {
            vpi0Var3.m202238b(this.cupTemp.getTempValue());
        }
        TempSummary tempSummary2 = this.cloneTempSummary;
        if (tempSummary2 != null && (vpi0Var2 = tempSummary2.batteryTemp) != null) {
            vpi0Var2.m202238b(this.batteryTemp.getTempValue());
        }
        TempSummary tempSummary3 = this.cloneTempSummary;
        if (tempSummary3 != null && (vpi0Var = tempSummary3.skinTemp) != null) {
            vpi0Var.m202238b(this.skinTemp.getTempValue());
        }
        TempSummary tempSummary4 = this.cloneTempSummary;
        if (tempSummary4 == null) {
            Intrinsics.m88386m();
        }
        return tempSummary4;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final vpi0 getBatteryTemp() {
        return this.batteryTemp;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final vpi0 getCupTemp() {
        return this.cupTemp;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final vpi0 getSkinTemp() {
        return this.skinTemp;
    }

    @NotNull
    public String toString() {
        return "TempSummary(cupTemp=" + this.cupTemp.getTempValue() + "°C, batteryTemp=" + this.batteryTemp.getTempValue() + "°C, skinTemp=" + this.skinTemp.getTempValue() + "°C)";
    }

    public TempSummary(@NotNull vpi0 vpi0Var, @NotNull vpi0 vpi0Var2, @NotNull vpi0 vpi0Var3) {
        vpi0Var.getClass();
        vpi0Var2.getClass();
        vpi0Var3.getClass();
        this.cupTemp = vpi0Var;
        this.batteryTemp = vpi0Var2;
        this.skinTemp = vpi0Var3;
    }

    public TempSummary() {
        this(null, null, null, 7, null);
    }
}
