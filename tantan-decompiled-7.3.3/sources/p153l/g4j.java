package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0017R&\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0019j\b\u0012\u0004\u0012\u00020\u0012`\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\"R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010#\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010&R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010#\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010&R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010#\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b)\u0010&R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b\u001e\u0010+\"\u0004\b,\u0010-¨\u0006."}, m88121d2 = {"Ll/g4j;", "Ll/erl;", "", OMSTemplateModeType.page, "", "windowFps", "pageFps", "avgFps", "", "jank", "<init>", "(Ljava/lang/String;III[I)V", "a", "()Ll/g4j;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ll/g4j;", "cloneFps", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "b", "Ljava/util/HashSet;", "scenes", "c", "Ljava/lang/String;", Constants.INAPP_DATA_TAG, "h", "(Ljava/lang/String;)V", "I", "f", "j", "(I)V", "e", RXScreenCaptureService.KEY_INDEX, "g", "[I", "()[I", "setJank", "([I)V", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final /* data */ class g4j implements erl<g4j> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private g4j cloneFps;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private HashSet<Object> scenes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private String page;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int windowFps;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int pageFps;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int avgFps;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private int[] jank;

    public g4j(@NotNull String str, int i, int i2, int i3, @NotNull int[] iArr) {
        str.getClass();
        iArr.getClass();
        this.page = str;
        this.windowFps = i;
        this.pageFps = i2;
        this.avgFps = i3;
        this.jank = iArr;
        this.scenes = new HashSet<>();
    }

    @Override // p153l.erl
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g4j clone() {
        if (this.cloneFps == null) {
            this.cloneFps = new g4j(this.page, this.windowFps, this.pageFps, this.avgFps, (int[]) this.jank.clone());
        }
        g4j g4jVar = this.cloneFps;
        if (g4jVar != null) {
            int[] iArr = g4jVar.jank;
            if (iArr.length == 5) {
                int[] iArr2 = this.jank;
                if (iArr2.length == 5) {
                    iArr[0] = iArr2[0];
                    iArr[1] = iArr2[1];
                    iArr[2] = iArr2[2];
                    iArr[3] = iArr2[3];
                    iArr[4] = iArr2[4];
                }
            }
            if (g4jVar.page.length() == 0) {
                g4jVar.page = this.page;
            }
            int i = g4jVar.windowFps;
            int i2 = this.windowFps;
            if (i != i2) {
                g4jVar.windowFps = i2;
            }
            g4jVar.pageFps = this.pageFps;
            g4jVar.avgFps = this.avgFps;
        }
        g4j g4jVar2 = this.cloneFps;
        if (g4jVar2 == null) {
            Intrinsics.m88386m();
        }
        return g4jVar2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAvgFps() {
        return this.avgFps;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int[] getJank() {
        return this.jank;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPage() {
        return this.page;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getPageFps() {
        return this.pageFps;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g4j)) {
            return false;
        }
        g4j g4jVar = (g4j) other;
        return Intrinsics.m88377d(this.page, g4jVar.page) && this.windowFps == g4jVar.windowFps && this.pageFps == g4jVar.pageFps && this.avgFps == g4jVar.avgFps && Intrinsics.m88377d(this.jank, g4jVar.jank);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getWindowFps() {
        return this.windowFps;
    }

    /* JADX INFO: renamed from: g */
    public final void m128888g(int i) {
        this.avgFps = i;
    }

    /* JADX INFO: renamed from: h */
    public final void m128889h(@NotNull String str) {
        str.getClass();
        this.page = str;
    }

    public int hashCode() {
        String str = this.page;
        int iHashCode = (((((((str != null ? str.hashCode() : 0) * 31) + this.windowFps) * 31) + this.pageFps) * 31) + this.avgFps) * 31;
        int[] iArr = this.jank;
        return iHashCode + (iArr != null ? Arrays.hashCode(iArr) : 0);
    }

    /* JADX INFO: renamed from: i */
    public final void m128890i(int i) {
        this.pageFps = i;
    }

    /* JADX INFO: renamed from: j */
    public final void m128891j(int i) {
        this.windowFps = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Fps(page='");
        sb.append(this.page);
        sb.append("', windowFps=");
        sb.append(this.windowFps);
        sb.append(", pageFps=");
        sb.append(this.pageFps);
        sb.append(", avgFps=");
        sb.append(this.avgFps);
        sb.append(", jank=");
        String string = Arrays.toString(this.jank);
        string.getClass();
        sb.append(string);
        sb.append(')');
        return sb.toString();
    }
}
