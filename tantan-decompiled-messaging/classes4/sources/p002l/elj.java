package p002l;

import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\r¨\u0006\u0018"}, d2 = {"Ll/elj;", "", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "", "initPosition", "dataSize", "<init>", "(Landroidx/viewpager/widget/ViewPager;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", LiveMessage.LiveMessageType.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/viewpager/widget/ViewPager;", "c", "()Landroidx/viewpager/widget/ViewPager;", "b", "I", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class elj {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final ViewPager viewPager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int initPosition;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int dataSize;

    public elj(@Nullable ViewPager viewPager, int i, int i2) {
        this.viewPager = viewPager;
        this.initPosition = i;
        this.dataSize = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDataSize() {
        return this.dataSize;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getInitPosition() {
        return this.initPosition;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ViewPager getViewPager() {
        return this.viewPager;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof elj)) {
            return false;
        }
        elj eljVar = (elj) other;
        return Intrinsics.d(this.viewPager, eljVar.viewPager) && this.initPosition == eljVar.initPosition && this.dataSize == eljVar.dataSize;
    }

    public int hashCode() {
        ViewPager viewPager = this.viewPager;
        return ((((viewPager == null ? 0 : viewPager.hashCode()) * 31) + Integer.hashCode(this.initPosition)) * 31) + Integer.hashCode(this.dataSize);
    }

    @NotNull
    public String toString() {
        return "GiftBottomIndicatorInfo(viewPager=" + this.viewPager + ", initPosition=" + this.initPosition + ", dataSize=" + this.dataSize + ")";
    }
}
