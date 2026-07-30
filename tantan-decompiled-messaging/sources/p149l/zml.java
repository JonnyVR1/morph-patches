package p149l;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH&¢\u0006\u0004\b\u0015\u0010\r¨\u0006\u0016"}, m87232d2 = {"Ll/zml;", "Ll/tql;", "Ll/uql;", "Landroid/content/Context;", "context", "Ll/rpl;", "detectorModule", "Ll/lrl;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "n", "(Landroid/content/Context;Ll/rpl;Ll/lrl;)V", "destroy", "()V", "Ll/nrl;", "j", "(Ll/nrl;)V", "", "scaleFactor", "q", "(F)V", "p", "momomediaext_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public interface zml extends tql, uql {
    void destroy();

    /* JADX INFO: renamed from: j */
    void mo118390j(@Nullable nrl listener);

    /* JADX INFO: renamed from: n */
    void mo118393n(@NotNull Context context, @NotNull rpl detectorModule, @NotNull lrl listener);

    /* JADX INFO: renamed from: p */
    void mo118395p();

    /* JADX INFO: renamed from: q */
    void mo118396q(float scaleFactor);
}
