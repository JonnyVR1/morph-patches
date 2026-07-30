package p153l;

import android.content.SharedPreferences;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftsFromCdnWarpData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/xxd0;", "Ll/dyd0;", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftsFromCdnWarpData;", "", "id", "defaultValue", "<init>", "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveGiftsFromCdnWarpData;)V", Constants.KEY_T, "Landroid/content/SharedPreferences$Editor;", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftsFromCdnWarpData;)Landroid/content/SharedPreferences$Editor;", "c", "()Lcom/p1/mobile/putong/live/base/data/BLiveGiftsFromCdnWarpData;", "cached", "changed", "", "a", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftsFromCdnWarpData;Lcom/p1/mobile/putong/live/base/data/BLiveGiftsFromCdnWarpData;)Z", "to", "from", "b", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftsFromCdnWarpData;Lcom/p1/mobile/putong/live/base/data/BLiveGiftsFromCdnWarpData;)Lcom/p1/mobile/putong/live/base/data/BLiveGiftsFromCdnWarpData;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class xxd0 extends dyd0<BLiveGiftsFromCdnWarpData> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxd0(@NotNull String str, @Nullable BLiveGiftsFromCdnWarpData bLiveGiftsFromCdnWarpData) {
        super(str, bLiveGiftsFromCdnWarpData);
        str.getClass();
    }

    @Override // p153l.dyd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NotNull BLiveGiftsFromCdnWarpData cached, @NotNull BLiveGiftsFromCdnWarpData changed) {
        cached.getClass();
        changed.getClass();
        return Intrinsics.m88377d(cached.version, changed.version);
    }

    @Override // p153l.dyd0
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BLiveGiftsFromCdnWarpData copyed(@Nullable BLiveGiftsFromCdnWarpData to, @NotNull BLiveGiftsFromCdnWarpData from) {
        from.getClass();
        BLiveGiftsFromCdnWarpData bLiveGiftsFromCdnWarpDataMo225055clone = from.mo225055clone();
        bLiveGiftsFromCdnWarpDataMo225055clone.getClass();
        return bLiveGiftsFromCdnWarpDataMo225055clone;
    }

    @Override // p153l.hxd0
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public BLiveGiftsFromCdnWarpData retrieveValue() {
        String string = pref().getString(this.f111993id, null);
        if (string != null) {
            return BLiveGiftsFromCdnWarpData.JSON_ADAPTER.parse(string);
        }
        return null;
    }

    @Override // p153l.hxd0
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(@NotNull BLiveGiftsFromCdnWarpData t) {
        t.getClass();
        SharedPreferences.Editor editorPutString = pref().edit().putString(this.f111993id, t.toJson());
        editorPutString.getClass();
        return editorPutString;
    }
}
