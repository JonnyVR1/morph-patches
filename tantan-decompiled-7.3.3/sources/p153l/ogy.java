package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, m88121d2 = {"Ll/ogy;", "Ll/erl;", "", "appMem", "totalMem", "freeMem", "<init>", "(III)V", "a", "()Ll/ogy;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ll/ogy;", "cloneMem", "b", "I", "e", "(I)V", "c", Constants.INAPP_DATA_TAG, "g", "f", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final /* data */ class ogy implements erl<ogy> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private ogy cloneMem;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int appMem;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int totalMem;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int freeMem;

    public /* synthetic */ ogy(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }

    @Override // p153l.erl
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ogy clone() {
        if (this.cloneMem == null) {
            this.cloneMem = new ogy(this.appMem, 0, 0, 6, null);
        }
        ogy ogyVar = this.cloneMem;
        if (ogyVar != null) {
            ogyVar.appMem = this.appMem;
            ogyVar.totalMem = this.totalMem;
            ogyVar.freeMem = this.freeMem;
        }
        if (ogyVar == null) {
            Intrinsics.m88386m();
        }
        return ogyVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAppMem() {
        return this.appMem;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getFreeMem() {
        return this.freeMem;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTotalMem() {
        return this.totalMem;
    }

    /* JADX INFO: renamed from: e */
    public final void m167673e(int i) {
        this.appMem = i;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ogy)) {
            return false;
        }
        ogy ogyVar = (ogy) other;
        return this.appMem == ogyVar.appMem && this.totalMem == ogyVar.totalMem && this.freeMem == ogyVar.freeMem;
    }

    /* JADX INFO: renamed from: f */
    public final void m167674f(int i) {
        this.freeMem = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m167675g(int i) {
        this.totalMem = i;
    }

    public int hashCode() {
        return (((this.appMem * 31) + this.totalMem) * 31) + this.freeMem;
    }

    @NotNull
    public String toString() {
        return "Mem(appMem=" + this.appMem + "M totalMem=" + this.totalMem + "M freeMem=" + this.freeMem + "M)";
    }

    public ogy(int i, int i2, int i3) {
        this.appMem = i;
        this.totalMem = i2;
        this.freeMem = i3;
    }

    public ogy() {
        this(0, 0, 0, 7, null);
    }
}
