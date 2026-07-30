package p002l;

import android.content.SharedPreferences;
import com.p1.mobile.putong.live.base.data.BLiveIntlTemplateData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.bqd0;
import l.fpd0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ll/x9p;", "Ll/bqd0;", "Lcom/p1/mobile/putong/live/base/data/BLiveIntlTemplateData;", "", "id", "defaultValue", "<init>", "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveIntlTemplateData;)V", "t", "Landroid/content/SharedPreferences$Editor;", "d", "(Lcom/p1/mobile/putong/live/base/data/BLiveIntlTemplateData;)Landroid/content/SharedPreferences$Editor;", "c", "()Lcom/p1/mobile/putong/live/base/data/BLiveIntlTemplateData;", "cached", "changed", "", "a", "(Lcom/p1/mobile/putong/live/base/data/BLiveIntlTemplateData;Lcom/p1/mobile/putong/live/base/data/BLiveIntlTemplateData;)Z", "to", "from", "b", "(Lcom/p1/mobile/putong/live/base/data/BLiveIntlTemplateData;Lcom/p1/mobile/putong/live/base/data/BLiveIntlTemplateData;)Lcom/p1/mobile/putong/live/base/data/BLiveIntlTemplateData;", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class x9p extends bqd0<BLiveIntlTemplateData> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9p(@NotNull String str, @Nullable BLiveIntlTemplateData bLiveIntlTemplateData) {
        super(str, bLiveIntlTemplateData);
        str.getClass();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NotNull BLiveIntlTemplateData cached, @NotNull BLiveIntlTemplateData changed) {
        cached.getClass();
        changed.getClass();
        return Intrinsics.d(cached, changed);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BLiveIntlTemplateData copyed(@Nullable BLiveIntlTemplateData to, @NotNull BLiveIntlTemplateData from) {
        from.getClass();
        BLiveIntlTemplateData bLiveIntlTemplateDataClone = from.clone();
        bLiveIntlTemplateDataClone.getClass();
        return bLiveIntlTemplateDataClone;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public BLiveIntlTemplateData retrieveValue() {
        String string = pref().getString(((fpd0) this).id, null);
        if (string != null) {
            return (BLiveIntlTemplateData) BLiveIntlTemplateData.JSON_ADAPTER.parse(string);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(@NotNull BLiveIntlTemplateData t) {
        t.getClass();
        SharedPreferences.Editor editorPutString = pref().edit().putString(((fpd0) this).id, t.toJson());
        editorPutString.getClass();
        return editorPutString;
    }
}
