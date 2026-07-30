package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.data.Action;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.iaj0;
import p149l.inc0;
import p149l.zkl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u000f"}, m87232d2 = {"Landroid/view/ViewGroup;", "", FirebaseAnalytics.Param.INDEX, "Landroid/view/View;", "a", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "", Constants.INAPP_DATA_TAG, "(Landroid/view/ViewGroup;)Ljava/util/Iterator;", "Lkotlin/sequences/Sequence;", "b", "(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;", "children", "c", "descendants", "core-ktx_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class ViewGroupKt {

    /* JADX INFO: renamed from: androidx.core.view.ViewGroupKt$a */
    @Metadata(m87231d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"androidx/core/view/ViewGroupKt$a", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "", "iterator", "()Ljava/util/Iterator;", "core-ktx_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C0255a implements Sequence<View> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f1463a;

        public C0255a(ViewGroup viewGroup) {
            this.f1463a = viewGroup;
        }

        @Override // kotlin.sequences.Sequence
        @NotNull
        public Iterator<View> iterator() {
            return ViewGroupKt.m1331d(this.f1463a);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.ViewGroupKt$b */
    @Metadata(m87231d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u000e"}, m87232d2 = {"androidx/core/view/ViewGroupKt$b", "", "Landroid/view/View;", "", "hasNext", "()Z", "a", "()Landroid/view/View;", "", Action.remove, "()V", "", "I", FirebaseAnalytics.Param.INDEX, "core-ktx_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C0256b implements Iterator<View>, KMutableIterator {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public int index;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewGroup f1465b;

        public C0256b(ViewGroup viewGroup) {
            this.f1465b = viewGroup;
        }

        @Override // java.util.Iterator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f1465b;
            int i = this.index;
            this.index = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            zkl.m219192a();
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f1465b.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f1465b;
            int i = this.index - 1;
            this.index = i;
            viewGroup.removeViewAt(i);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.ViewGroupKt$c */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, m87232d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C0257c implements Sequence<View> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f1466a;

        public C0257c(ViewGroup viewGroup) {
            this.f1466a = viewGroup;
        }

        @Override // kotlin.sequences.Sequence
        @NotNull
        public Iterator<View> iterator() {
            return new iaj0(ViewGroupKt.m1329b(this.f1466a).iterator(), new Function1<View, Iterator<? extends View>>() { // from class: androidx.core.view.ViewGroupKt$descendants$1$1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Iterator<View> invoke(@NotNull View view) {
                    Sequence<View> sequenceM1329b;
                    ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                    if (viewGroup == null || (sequenceM1329b = ViewGroupKt.m1329b(viewGroup)) == null) {
                        return null;
                    }
                    return sequenceM1329b.iterator();
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final View m1328a(@NotNull ViewGroup viewGroup, int i) {
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        inc0.m137129a("Index: ", i, ", Size: ", viewGroup.getChildCount());
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Sequence<View> m1329b(@NotNull ViewGroup viewGroup) {
        return new C0255a(viewGroup);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final Sequence<View> m1330c(@NotNull ViewGroup viewGroup) {
        return new C0257c(viewGroup);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Iterator<View> m1331d(@NotNull ViewGroup viewGroup) {
        return new C0256b(viewGroup);
    }
}
