package com.immomo.molive.apm.temp;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p149l.tol;
import p149l.vgi0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012\"\u0004\b\u0015\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u0019"}, m87232d2 = {"Lcom/immomo/molive/apm/temp/TempSummary;", "Ll/tol;", "Ll/vgi0;", "cupTemp", "batteryTemp", "skinTemp", "<init>", "(Ll/vgi0;Ll/vgi0;Ll/vgi0;)V", "a", "()Lcom/immomo/molive/apm/temp/TempSummary;", "", "toString", "()Ljava/lang/String;", "Lcom/immomo/molive/apm/temp/TempSummary;", "cloneTempSummary", "b", "Ll/vgi0;", "c", "()Ll/vgi0;", "setCupTemp", "(Ll/vgi0;)V", "setBatteryTemp", Constants.INAPP_DATA_TAG, "setSkinTemp", "TempType", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class TempSummary implements tol<TempSummary> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private TempSummary cloneTempSummary;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private vgi0 cupTemp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private vgi0 batteryTemp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private vgi0 skinTemp;

    @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m87232d2 = {"Lcom/immomo/molive/apm/temp/TempSummary$TempType;", "", "(Ljava/lang/String;I)V", "CPU", "BATTERY", "GPU", "MODEM", "SKIN", "MEMORY", "POWER_SUPPLY", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 1, 16})
    public enum TempType {
        CPU,
        BATTERY,
        GPU,
        MODEM,
        SKIN,
        MEMORY,
        POWER_SUPPLY
    }

    public /* synthetic */ TempSummary(vgi0 vgi0Var, vgi0 vgi0Var2, vgi0 vgi0Var3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new vgi0(TempType.CPU, 0) : vgi0Var, (i & 2) != 0 ? new vgi0(TempType.BATTERY, 0) : vgi0Var2, (i & 4) != 0 ? new vgi0(TempType.SKIN, 0) : vgi0Var3);
    }

    @Override // p149l.tol
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public TempSummary clone() {
        vgi0 vgi0Var;
        vgi0 vgi0Var2;
        vgi0 vgi0Var3;
        if (this.cloneTempSummary == null) {
            this.cloneTempSummary = new TempSummary(null, null, null, 7, null);
        }
        TempSummary tempSummary = this.cloneTempSummary;
        if (tempSummary != null && (vgi0Var3 = tempSummary.cupTemp) != null) {
            vgi0Var3.m198320b(this.cupTemp.getTempValue());
        }
        TempSummary tempSummary2 = this.cloneTempSummary;
        if (tempSummary2 != null && (vgi0Var2 = tempSummary2.batteryTemp) != null) {
            vgi0Var2.m198320b(this.batteryTemp.getTempValue());
        }
        TempSummary tempSummary3 = this.cloneTempSummary;
        if (tempSummary3 != null && (vgi0Var = tempSummary3.skinTemp) != null) {
            vgi0Var.m198320b(this.skinTemp.getTempValue());
        }
        TempSummary tempSummary4 = this.cloneTempSummary;
        if (tempSummary4 == null) {
            Intrinsics.m87497m();
        }
        return tempSummary4;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final vgi0 getBatteryTemp() {
        return this.batteryTemp;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final vgi0 getCupTemp() {
        return this.cupTemp;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final vgi0 getSkinTemp() {
        return this.skinTemp;
    }

    @NotNull
    public String toString() {
        return "TempSummary(cupTemp=" + this.cupTemp.getTempValue() + "°C, batteryTemp=" + this.batteryTemp.getTempValue() + "°C, skinTemp=" + this.skinTemp.getTempValue() + "°C)";
    }

    public TempSummary(@NotNull vgi0 vgi0Var, @NotNull vgi0 vgi0Var2, @NotNull vgi0 vgi0Var3) {
        vgi0Var.getClass();
        vgi0Var2.getClass();
        vgi0Var3.getClass();
        this.cupTemp = vgi0Var;
        this.batteryTemp = vgi0Var2;
        this.skinTemp = vgi0Var3;
    }

    public TempSummary() {
        this(null, null, null, 7, null);
    }
}
