package androidx.core.widget;

import android.text.Editable;
import com.p046p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m87232d2 = {"<anonymous>", "", Careers.f38732it, "Landroid/text/Editable;", "invoke"}, m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 176)
@SourceDebugExtension
public final class TextViewKt$addTextChangedListener$3 extends Lambda implements Function1<Editable, Unit> {
    public static final TextViewKt$addTextChangedListener$3 INSTANCE = new TextViewKt$addTextChangedListener$3();

    public TextViewKt$addTextChangedListener$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Editable editable) {
        invoke2(editable);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Editable editable) {
    }
}
