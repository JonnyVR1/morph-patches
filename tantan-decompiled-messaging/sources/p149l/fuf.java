package p149l;

import com.facebook.FacebookException;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/fuf;", "RESULT", "", LovePlanetStage.result, "", "onSuccess", "(Ljava/lang/Object;)V", "onCancel", "()V", "Lcom/facebook/FacebookException;", "error", "a", "(Lcom/facebook/FacebookException;)V", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public interface fuf<RESULT> {
    /* JADX INFO: renamed from: a */
    void mo50769a(@NotNull FacebookException error);

    void onCancel();

    void onSuccess(RESULT result);
}
