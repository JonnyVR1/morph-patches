package p153l;

import androidx.lifecycle.C0491t;
import androidx.lifecycle.InterfaceC0476e;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.Owner;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m88121d2 = {"Ll/rll0;", "", "<init>", "()V", "Ll/nll0;", p7f.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "modelClass", "", "c", "(Lkotlin/reflect/KClass;)Ljava/lang/String;", "VM", Constants.INAPP_DATA_TAG, "()Ll/nll0;", "Ll/tll0;", Owner.TYPE, "Landroidx/lifecycle/t$c;", "b", "(Ll/tll0;)Landroidx/lifecycle/t$c;", "Ll/cvb;", "a", "(Ll/tll0;)Ll/cvb;", "lifecycle-viewmodel_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class rll0 {

    @NotNull
    public static final rll0 INSTANCE = new rll0();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final cvb m182015a(@NotNull tll0 owner) {
        owner.getClass();
        return owner instanceof InterfaceC0476e ? ((InterfaceC0476e) owner).getDefaultViewModelCreationExtras() : cvb.C16369b.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final C0491t.c m182016b(@NotNull tll0 owner) {
        owner.getClass();
        return owner instanceof InterfaceC0476e ? ((InterfaceC0476e) owner).getDefaultViewModelProviderFactory() : std.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final <T extends nll0> String m182017c(@NotNull KClass<T> modelClass) {
        modelClass.getClass();
        String strM149735a = kg4.m149735a(modelClass);
        if (strM149735a != null) {
            return "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM149735a);
        }
        wg3.m206174a("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final <VM extends nll0> VM m182018d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
