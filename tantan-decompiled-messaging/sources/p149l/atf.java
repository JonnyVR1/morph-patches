package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m87232d2 = {"Ll/atf;", "Ll/tql;", "Ll/wmq;", "filter", "<init>", "(Ll/wmq;)V", "", "id", Constants.KEY_KEY, "", "value", "", "g", "(Ljava/lang/String;Ljava/lang/String;F)V", "updateMakeupStyleValue", "makeupKey", "filterKey", "removeMakeupStyle", "(Ljava/lang/String;Ljava/lang/String;)V", "path", "k", "(Ljava/lang/String;)V", "intensity", "h", "(F)V", "", "type", "r", "(I)V", "a", "Ll/wmq;", "momomediaext_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class atf implements tql {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final wmq filter;

    public atf(@NotNull wmq wmqVar) {
        wmqVar.getClass();
        this.filter = wmqVar;
    }

    @Override // p149l.tql
    /* JADX INFO: renamed from: g */
    public void mo98794g(@Nullable String id, @Nullable String key, float value) {
        this.filter.updateByteDanceFaceBeautyValue(id, key, value);
    }

    @Override // p149l.tql
    /* JADX INFO: renamed from: h */
    public void mo98795h(float intensity) {
        this.filter.setLookupIntensity(intensity);
    }

    @Override // p149l.tql
    /* JADX INFO: renamed from: k */
    public void mo98796k(@Nullable String path) {
        this.filter.m204040o2(path);
    }

    @Override // p149l.tql
    /* JADX INFO: renamed from: r */
    public void mo98797r(int type) {
        eyx.m118802c().m118808g("switchBeautyType type === " + type);
        this.filter.m204046v2(type);
    }

    @Override // p149l.tql
    public void removeMakeupStyle(@Nullable String makeupKey, @Nullable String filterKey) {
        this.filter.removeMakeupStyle(makeupKey, filterKey);
    }

    @Override // p149l.tql
    public void updateMakeupStyleValue(@Nullable String id, @Nullable String key, float value) {
        this.filter.updateMakeupStyleValue(id, key, value);
    }
}
