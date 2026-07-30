package p002l;

import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.BLiveGiftGearEffectInfo;
import com.p1.mobile.putong.ui.download.DownloadTask;
import com.p1.mobile.putong.ui.download.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import l.xi5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ll/qvj;", "", "<init>", "()V", "Ll/ihs;", "itemModel", "", "a", "(Ll/ihs;)I", "c", "b", "", "d", "(Ll/ihs;)Z", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class qvj {

    @NotNull
    public static final qvj INSTANCE = new qvj();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m21584a(@NotNull ihs itemModel) {
        itemModel.getClass();
        if (itemModel.m15168p()) {
            return 4;
        }
        if (itemModel.m15165m()) {
            return INSTANCE.m21585b(itemModel);
        }
        if (itemModel.m15164l()) {
            return INSTANCE.m21586c(itemModel);
        }
        return 4;
    }

    /* JADX INFO: renamed from: b */
    public final int m21585b(ihs itemModel) {
        Object objS;
        if (!m21587d(itemModel)) {
            return 1;
        }
        List list = itemModel.m15160h().gear.gearEffects;
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            objS = null;
            if (!it.hasNext()) {
                break;
            }
            BLiveEffect bLiveEffectM10044h = aqe.m10039i().m10044h(((BLiveGiftGearEffectInfo) it.next()).liveResourceId);
            if (bLiveEffectM10044h != null) {
                objS = a.u().s(bLiveEffectM10044h.zip);
            }
            arrayList.add(objS);
        }
        for (Object obj : arrayList) {
            DownloadTask downloadTask = (DownloadTask) obj;
            if (downloadTask != null && downloadTask.t() > 0) {
                objS = obj;
                break;
            }
        }
        return ((DownloadTask) objS) != null ? 2 : 1;
    }

    /* JADX INFO: renamed from: c */
    public final int m21586c(ihs itemModel) {
        DownloadTask downloadTaskS;
        BLiveEffect bLiveEffectM10044h = aqe.m10039i().m10044h(itemModel.m15160h().liveResourceId);
        return (xi5.a(bLiveEffectM10044h) || (downloadTaskS = a.u().s(bLiveEffectM10044h.zip)) == null || downloadTaskS.t() <= 0) ? 1 : 2;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m21587d(ihs itemModel) {
        List list = itemModel.m15160h().gear.gearEffects;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (xi5.a(aqe.m10039i().m10044h(((BLiveGiftGearEffectInfo) it.next()).liveResourceId))) {
                return false;
            }
        }
        return true;
    }
}
