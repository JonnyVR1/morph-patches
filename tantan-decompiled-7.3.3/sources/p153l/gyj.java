package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftGearEffectInfo;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/gyj;", "", "<init>", "()V", "Ll/jjs;", "itemModel", "", "a", "(Ll/jjs;)I", "c", "b", "", Constants.INAPP_DATA_TAG, "(Ll/jjs;)Z", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class gyj {

    @NotNull
    public static final gyj INSTANCE = new gyj();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m132970a(@NotNull jjs itemModel) {
        itemModel.getClass();
        if (itemModel.m145130p()) {
            return 4;
        }
        if (itemModel.m145127m()) {
            return INSTANCE.m132971b(itemModel);
        }
        if (itemModel.m145126l()) {
            return INSTANCE.m132972c(itemModel);
        }
        return 4;
    }

    /* JADX INFO: renamed from: b */
    public final int m132971b(jjs itemModel) {
        Object objM80852s;
        if (!m132973d(itemModel)) {
            return 1;
        }
        List<BLiveGiftGearEffectInfo> list = itemModel.m145122h().gear.gearEffects;
        list.getClass();
        List<BLiveGiftGearEffectInfo> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (true) {
            objM80852s = null;
            if (!it.hasNext()) {
                break;
            }
            BLiveEffect bLiveEffectM122151h = ere.m122146i().m122151h(((BLiveGiftGearEffectInfo) it.next()).liveResourceId);
            if (bLiveEffectM122151h != null) {
                objM80852s = C13274a.m80837u().m80852s(bLiveEffectM122151h.zip);
            }
            arrayList.add(objM80852s);
        }
        for (Object obj : arrayList) {
            DownloadTask downloadTask = (DownloadTask) obj;
            if (downloadTask != null && downloadTask.m80802t() > 0) {
                objM80852s = obj;
                break;
            }
        }
        return ((DownloadTask) objM80852s) != null ? 2 : 1;
    }

    /* JADX INFO: renamed from: c */
    public final int m132972c(jjs itemModel) {
        DownloadTask downloadTaskM80852s;
        BLiveEffect bLiveEffectM122151h = ere.m122146i().m122151h(itemModel.m145122h().liveResourceId);
        return (yj5.m216388a(bLiveEffectM122151h) || (downloadTaskM80852s = C13274a.m80837u().m80852s(bLiveEffectM122151h.zip)) == null || downloadTaskM80852s.m80802t() <= 0) ? 1 : 2;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m132973d(jjs itemModel) {
        List<BLiveGiftGearEffectInfo> list = itemModel.m145122h().gear.gearEffects;
        list.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (yj5.m216388a(ere.m122146i().m122151h(((BLiveGiftGearEffectInfo) it.next()).liveResourceId))) {
                return false;
            }
        }
        return true;
    }
}
