package p149l;

import com.clevertap.android.sdk.Constants;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\r\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u000f\u0010\u0006J\u001d\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\"\u0010#\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R!\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010\u0015¨\u0006'"}, m87232d2 = {"Ll/ps2;", j6f.GPS_DIRECTION_TRUE, "", "", "data", "<init>", "(Ljava/util/List;)V", "", "c", "()I", "f", "position", Constants.INAPP_DATA_TAG, "(I)Ljava/lang/Object;", "", "j", "min", Constants.PRIORITY_MAX, "k", "(II)V", "b", "()Ljava/util/List;", "dataList", "", "g", "(ILjava/util/List;)Z", "", "a", "Ljava/util/List;", "Z", "isRangeData", "h", "()Z", RXScreenCaptureService.KEY_INDEX, "(Z)V", "isCyclic", "Lkotlin/Lazy;", "e", "rangeDataList", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class ps2<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<T> dataList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isRangeData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean isCyclic;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy rangeDataList;

    public ps2(@Nullable List<? extends T> list) {
        this.dataList = new ArrayList();
        this.rangeDataList = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.os2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ps2.m171095a();
            }
        });
        if (list != null) {
            m171104j(list);
        }
    }

    /* JADX INFO: renamed from: a */
    public static List m171095a() {
        return new ArrayList();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<T> m171096b() {
        return (this.isCyclic || !this.isRangeData) ? this.dataList : m171099e();
    }

    /* JADX INFO: renamed from: c */
    public final int m171097c() {
        return ((this.isCyclic || !this.isRangeData) ? this.dataList : m171099e()).size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: d */
    public final T m171098d(int position) {
        if (this.isCyclic || !this.isRangeData) {
            if (m171101g(position, this.dataList)) {
                return this.dataList.get(position);
            }
            return null;
        }
        if (m171101g(position, m171099e())) {
            return (T) m171099e().get(position);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final List<T> m171099e() {
        return (List) this.rangeDataList.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final int m171100f() {
        return this.dataList.size();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m171101g(int position, @NotNull List<? extends T> dataList) {
        dataList.getClass();
        List<? extends T> list = dataList;
        return !list.isEmpty() && position >= 0 && position < list.size();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsCyclic() {
        return this.isCyclic;
    }

    /* JADX INFO: renamed from: i */
    public final void m171103i(boolean z) {
        this.isCyclic = z;
    }

    /* JADX INFO: renamed from: j */
    public final void m171104j(@NotNull List<? extends T> data) {
        data.getClass();
        this.dataList.clear();
        this.dataList.addAll(data);
    }

    /* JADX INFO: renamed from: k */
    public final void m171105k(int min, int max) {
        if (min < 0 || max < 0 || min > max || !m171101g(min, this.dataList) || !m171101g(max, this.dataList)) {
            this.isRangeData = false;
            m171099e().clear();
            return;
        }
        this.isRangeData = true;
        m171099e().clear();
        if (min > max) {
            return;
        }
        while (true) {
            m171099e().add(this.dataList.get(min));
            if (min == max) {
                return;
            } else {
                min++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ps2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ps2(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
