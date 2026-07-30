package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.C15514c;
import kotlinx.coroutines.channels.C15521a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/unc0;", "E", "Ll/sop0;", "Lkotlinx/coroutines/c;", "Lkotlinx/coroutines/channels/a;", "cont", "<init>", "(Lkotlinx/coroutines/c;)V", "Ll/rke0;", "segment", "", FirebaseAnalytics.Param.INDEX, "", "g", "(Ll/rke0;I)V", "a", "Lkotlinx/coroutines/c;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class unc0<E> implements sop0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final C15514c<C15521a<? extends E>> cont;

    /* JADX WARN: Multi-variable type inference failed */
    public unc0(@NotNull C15514c<? super C15521a<? extends E>> c15514c) {
        this.cont = c15514c;
    }

    @Override // p153l.sop0
    /* JADX INFO: renamed from: g */
    public void mo94657g(@NotNull rke0<?> segment, int index) {
        this.cont.mo94657g(segment, index);
    }
}
