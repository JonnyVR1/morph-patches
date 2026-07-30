package p153l;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/mxl;", "", "", "taskId", "", "a", "(Ljava/lang/String;)Z", "Ll/yjw;", "task", "autoStart", "Ll/mxl$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "b", "(Ll/yjw;ZLl/mxl$a;)V", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public interface mxl {

    /* JADX INFO: renamed from: l.mxl$a */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\f"}, m88121d2 = {"Ll/mxl$a;", "", "Ll/yjw;", "task", "", "c", "(Ll/yjw;)V", "", "cause", "a", "(Ll/yjw;I)V", "b", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public interface InterfaceC18742a {
        /* JADX INFO: renamed from: a */
        void mo126157a(@Nullable yjw task, int cause);

        /* JADX INFO: renamed from: b */
        void mo126158b(@Nullable yjw task);

        /* JADX INFO: renamed from: c */
        void mo126159c(@Nullable yjw task);
    }

    /* JADX INFO: renamed from: a */
    boolean mo18421a(@Nullable String taskId);

    /* JADX INFO: renamed from: b */
    void mo18422b(@Nullable yjw task, boolean autoStart, @Nullable InterfaceC18742a listener);
}
