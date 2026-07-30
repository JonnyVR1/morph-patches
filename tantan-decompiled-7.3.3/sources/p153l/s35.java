package p153l;

import com.clevertap.android.sdk.Constants;
import com.hellogroup.common.thread.MMThreadExecutors;
import io.reactivex.Flowable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/s35;", "Ll/b6k0;", "", "Ll/etl;", "repository", "<init>", "(Ll/etl;)V", "token", "Lio/reactivex/Flowable;", "f", "(Ljava/lang/String;)Lio/reactivex/Flowable;", Constants.INAPP_DATA_TAG, "Ll/etl;", "getRepository", "()Ll/etl;", "MKFDT_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class s35 extends b6k0<String, String> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final etl repository;

    /* JADX WARN: Illegal instructions before constructor call */
    public s35(@NotNull etl etlVar) {
        etlVar.getClass();
        MMThreadExecutors mMThreadExecutors = MMThreadExecutors.INSTANCE;
        super(mMThreadExecutors.m17550b(), mMThreadExecutors.m17549a());
        this.repository = etlVar;
    }

    @Override // p153l.b6k0
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Flowable<String> mo102765b(@Nullable String token) {
        if (token != null) {
            return this.repository.mo112683a(token);
        }
        Flowable<String> flowableEmpty = Flowable.empty();
        flowableEmpty.getClass();
        return flowableEmpty;
    }
}
