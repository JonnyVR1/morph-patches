package p149l;

import android.content.SharedPreferences;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveResourceCDN;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Ll/ypd0;", "Ll/bqd0;", "Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDN;", "", "id", "defaultValue", "<init>", "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDN;)V", Constants.KEY_T, "Landroid/content/SharedPreferences$Editor;", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDN;)Landroid/content/SharedPreferences$Editor;", "c", "()Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDN;", "cached", "changed", "", "a", "(Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDN;Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDN;)Z", "to", "from", "b", "(Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDN;Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDN;)Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDN;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ypd0 extends bqd0<BLiveResourceCDN> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypd0(@NotNull String str, @Nullable BLiveResourceCDN bLiveResourceCDN) {
        super(str, bLiveResourceCDN);
        str.getClass();
    }

    @Override // p149l.bqd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean checkEquals(@NotNull BLiveResourceCDN cached, @NotNull BLiveResourceCDN changed) {
        cached.getClass();
        changed.getClass();
        return Intrinsics.m87488d(cached.version, changed.version);
    }

    @Override // p149l.bqd0
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BLiveResourceCDN copyed(@Nullable BLiveResourceCDN to, @NotNull BLiveResourceCDN from) {
        from.getClass();
        BLiveResourceCDN bLiveResourceCDNMo223809clone = from.mo223809clone();
        bLiveResourceCDNMo223809clone.getClass();
        return bLiveResourceCDNMo223809clone;
    }

    @Override // p149l.fpd0
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public BLiveResourceCDN retrieveValue() {
        String string = pref().getString(this.f98687id, null);
        if (string != null) {
            return BLiveResourceCDN.JSON_ADAPTER.parse(string);
        }
        return null;
    }

    @Override // p149l.fpd0
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(@NotNull BLiveResourceCDN t) {
        t.getClass();
        SharedPreferences.Editor editorPutString = pref().edit().putString(this.f98687id, t.toJson());
        editorPutString.getClass();
        return editorPutString;
    }
}
