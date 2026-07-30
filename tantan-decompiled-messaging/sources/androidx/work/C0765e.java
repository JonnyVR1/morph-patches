package androidx.work;

import androidx.lifecycle.LiveData;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.gnr;

/* JADX INFO: renamed from: androidx.work.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Landroidx/work/e;", "Landroidx/work/d;", "Landroidx/lifecycle/LiveData;", "Landroidx/work/d$b;", "state", "Ll/gnr;", "Landroidx/work/d$b$c;", "future", "<init>", "(Landroidx/lifecycle/LiveData;Ll/gnr;)V", "getResult", "()Ll/gnr;", "c", "Landroidx/lifecycle/LiveData;", Constants.INAPP_DATA_TAG, "Ll/gnr;", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class C0765e implements InterfaceC0764d {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final LiveData<InterfaceC0764d.b> state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final gnr<InterfaceC0764d.b.c> future;

    public C0765e(@NotNull LiveData<InterfaceC0764d.b> liveData, @NotNull gnr<InterfaceC0764d.b.c> gnrVar) {
        liveData.getClass();
        gnrVar.getClass();
        this.state = liveData;
        this.future = gnrVar;
    }

    @Override // androidx.work.InterfaceC0764d
    @NotNull
    public gnr<InterfaceC0764d.b.c> getResult() {
        return this.future;
    }
}
