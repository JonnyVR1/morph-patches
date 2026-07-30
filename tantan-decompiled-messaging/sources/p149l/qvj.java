package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftGearEffectInfo;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/qvj;", "", "<init>", "()V", "Ll/ihs;", "itemModel", "", "a", "(Ll/ihs;)I", "c", "b", "", Constants.INAPP_DATA_TAG, "(Ll/ihs;)Z", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class qvj {

    @NotNull
    public static final qvj INSTANCE = new qvj();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m176703a(@NotNull ihs itemModel) {
        itemModel.getClass();
        if (itemModel.m136291p()) {
            return 4;
        }
        if (itemModel.m136288m()) {
            return INSTANCE.m176704b(itemModel);
        }
        if (itemModel.m136287l()) {
            return INSTANCE.m176705c(itemModel);
        }
        return 4;
    }

    /* JADX INFO: renamed from: b */
    public final int m176704b(ihs itemModel) {
        Object objM79669s;
        if (!m176706d(itemModel)) {
            return 1;
        }
        List<BLiveGiftGearEffectInfo> list = itemModel.m136283h().gear.gearEffects;
        list.getClass();
        List<BLiveGiftGearEffectInfo> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (true) {
            objM79669s = null;
            if (!it.hasNext()) {
                break;
            }
            BLiveEffect bLiveEffectM98266h = aqe.m98261i().m98266h(((BLiveGiftGearEffectInfo) it.next()).liveResourceId);
            if (bLiveEffectM98266h != null) {
                objM79669s = C13111a.m79654u().m79669s(bLiveEffectM98266h.zip);
            }
            arrayList.add(objM79669s);
        }
        for (Object obj : arrayList) {
            DownloadTask downloadTask = (DownloadTask) obj;
            if (downloadTask != null && downloadTask.m79619t() > 0) {
                objM79669s = obj;
                break;
            }
        }
        return ((DownloadTask) objM79669s) != null ? 2 : 1;
    }

    /* JADX INFO: renamed from: c */
    public final int m176705c(ihs itemModel) {
        DownloadTask downloadTaskM79669s;
        BLiveEffect bLiveEffectM98266h = aqe.m98261i().m98266h(itemModel.m136283h().liveResourceId);
        return (xi5.m208914a(bLiveEffectM98266h) || (downloadTaskM79669s = C13111a.m79654u().m79669s(bLiveEffectM98266h.zip)) == null || downloadTaskM79669s.m79619t() <= 0) ? 1 : 2;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m176706d(ihs itemModel) {
        List<BLiveGiftGearEffectInfo> list = itemModel.m136283h().gear.gearEffects;
        list.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (xi5.m208914a(aqe.m98261i().m98266h(((BLiveGiftGearEffectInfo) it.next()).liveResourceId))) {
                return false;
            }
        }
        return true;
    }
}
