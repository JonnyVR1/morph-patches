package androidx.core.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m87232d2 = {"Landroid/view/View;", "Lkotlin/sequences/Sequence;", "a", "(Landroid/view/View;)Lkotlin/sequences/Sequence;", "allViews", "core-ktx_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ViewKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Sequence<View> m1333a(@NotNull View view) {
        return SequencesKt__SequenceBuilderKt.m93262b(new ViewKt$allViews$1(view, null));
    }
}
