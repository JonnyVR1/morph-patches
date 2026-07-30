package p149l;

import androidx.annotation.RequiresPermission;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \f2\u00020\u0001:\u0001\u0007B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m87232d2 = {"Ll/lxb;", "", "<init>", "()V", "Ll/pnq;", SocialConstants.TYPE_REQUEST, "", "a", "(Ll/pnq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/iar;", "b", "(Ll/iar;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ads-adservices_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public abstract class lxb {
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract Object m152047a(@NotNull pnq pnqVar, @NotNull Continuation<? super Unit> continuation);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract Object m152048b(@NotNull iar iarVar, @NotNull Continuation<? super Unit> continuation);
}
