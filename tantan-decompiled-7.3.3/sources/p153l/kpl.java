package p153l;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH&¢\u0006\u0004\b\u0015\u0010\r¨\u0006\u0016"}, m88121d2 = {"Ll/kpl;", "Ll/gtl;", "Ll/htl;", "Landroid/content/Context;", "context", "Ll/esl;", "detectorModule", "Ll/ytl;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "n", "(Landroid/content/Context;Ll/esl;Ll/ytl;)V", "destroy", "()V", "Ll/aul;", "j", "(Ll/aul;)V", "", "scaleFactor", "q", "(F)V", "p", "momomediaext_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public interface kpl extends gtl, htl {
    void destroy();

    /* JADX INFO: renamed from: j */
    void mo150742j(@Nullable aul listener);

    /* JADX INFO: renamed from: n */
    void mo150743n(@NotNull Context context, @NotNull esl detectorModule, @NotNull ytl listener);

    /* JADX INFO: renamed from: p */
    void mo150744p();

    /* JADX INFO: renamed from: q */
    void mo150745q(float scaleFactor);
}
