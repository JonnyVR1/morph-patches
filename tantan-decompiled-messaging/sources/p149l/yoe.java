package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveResourceCDNLoadTypeItem;
import com.p046p1.mobile.putong.live.base.data.BLiveResourceInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0017j\b\u0012\u0004\u0012\u00020\n`\u00182\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, m87232d2 = {"Ll/yoe;", "", "<init>", "()V", "Landroid/util/Pair;", "Lcom/p1/mobile/putong/live/base/data/BLiveResourceInfo;", "Ll/hvj;", "pair", "Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDNLoadTypeItem;", "currentMap", "", "roomType", "", "downSingleTabGiftEffect", "", "Lcom/p1/mobile/putong/live/base/data/BLiveEffect;", "c", "(Landroid/util/Pair;Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDNLoadTypeItem;Ljava/lang/String;Z)Ljava/util/List;", "isVoiceRoom", "f", "(Landroid/util/Pair;Z)Ljava/util/List;", "giftRoomInfo", "singleTab", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "b", "(Ll/hvj;Z)Ljava/util/HashSet;", "effect", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/live/base/data/BLiveEffect;)Z", "e", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class yoe {

    @NotNull
    public static final yoe INSTANCE = new yoe();

    /* JADX INFO: renamed from: a */
    public static void m215492a(HashSet hashSet, ihs ihsVar) {
        if (ihsVar.m136288m()) {
            hashSet.addAll(ihsVar.m136283h().getGearsEffectIds());
        } else if (ihsVar.m136287l()) {
            hashSet.add(ihsVar.m136283h().liveResourceId);
        }
    }

    /* JADX INFO: renamed from: b */
    public final HashSet<String> m215493b(hvj giftRoomInfo, boolean singleTab) {
        List<ihs> listEmptyList;
        ArrayList arrayList = new ArrayList();
        int iM143507d = giftRoomInfo.m133171d().m143507d();
        List<rwj> listM143509f = giftRoomInfo.m133171d().m143509f();
        listM143509f.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (rwj rwjVar : listM143509f) {
            if (!singleTab) {
                listEmptyList = rwjVar.f161338a;
            } else if (rwjVar.f161339b == iM143507d) {
                listEmptyList = rwjVar.f161338a.subList(0, rwjVar.f161338a.size() < 8 ? rwjVar.f161338a.size() : 8);
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            listEmptyList.getClass();
            CollectionsKt.addAll(arrayList2, listEmptyList);
        }
        arrayList.addAll(arrayList2);
        if (!singleTab) {
            List<rwj> listM143509f2 = giftRoomInfo.m133172e().m143509f();
            listM143509f2.getClass();
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it = listM143509f2.iterator();
            while (it.hasNext()) {
                List<ihs> list = ((rwj) it.next()).f161338a;
                list.getClass();
                CollectionsKt.addAll(arrayList3, list);
            }
            arrayList.addAll(arrayList3);
        }
        final HashSet<String> hashSet = new HashSet<>();
        vwb.m200354z(arrayList, new e30() { // from class: l.xoe
            @Override // p149l.e30
            public final void call(Object obj) {
                yoe.m215492a(hashSet, (ihs) obj);
            }
        });
        return hashSet;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<BLiveEffect> m215494c(@NotNull Pair<BLiveResourceInfo, hvj> pair, @Nullable BLiveResourceCDNLoadTypeItem currentMap, @NotNull String roomType, boolean downSingleTabGiftEffect) {
        pair.getClass();
        roomType.getClass();
        Object obj = pair.second;
        obj.getClass();
        HashSet<String> hashSetM215493b = m215493b((hvj) obj, downSingleTabGiftEffect);
        gkh0.m126627j("[gift]EffectManager", "enableDialog:" + downSingleTabGiftEffect);
        gkh0.m126627j("[gift]EffectManager", "加载礼物面板资源数量:" + hashSetM215493b.size());
        if (currentMap == null) {
            return m215497f(pair, TextUtils.equals(roomType, BLiveAbsData.VOICE_LIVE));
        }
        if (TextUtils.equals(roomType, BLiveAbsData.VOICE_LIVE)) {
            if (vwb.m200296J(currentMap.voiceRoom) && !downSingleTabGiftEffect) {
                return INSTANCE.m215497f(pair, true);
            }
            List<BLiveEffect> list = ((BLiveResourceInfo) pair.first).liveResources;
            list.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                BLiveEffect bLiveEffect = (BLiveEffect) obj2;
                if (currentMap.voiceRoom.contains(bLiveEffect.f44359id) || hashSetM215493b.contains(bLiveEffect.f44359id)) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        if (!TextUtils.equals(roomType, "live")) {
            List<BLiveEffect> list2 = ((BLiveResourceInfo) pair.first).liveResources;
            list2.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list2) {
                if (hashSetM215493b.contains(((BLiveEffect) obj3).f44359id)) {
                    arrayList2.add(obj3);
                }
            }
            return arrayList2;
        }
        if (vwb.m200296J(currentMap.liveRoom) && !downSingleTabGiftEffect) {
            return INSTANCE.m215497f(pair, false);
        }
        List<BLiveEffect> list3 = ((BLiveResourceInfo) pair.first).liveResources;
        list3.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : list3) {
            BLiveEffect bLiveEffect2 = (BLiveEffect) obj4;
            if (currentMap.liveRoom.contains(bLiveEffect2.f44359id) || hashSetM215493b.contains(bLiveEffect2.f44359id)) {
                arrayList3.add(obj4);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m215495d(BLiveEffect effect) {
        if (effect.loadTypes.isEmpty()) {
            return false;
        }
        return effect.loadTypes.contains("appStart") || effect.loadTypes.contains("liveEntry") || effect.loadTypes.contains("liveRoom");
    }

    /* JADX INFO: renamed from: e */
    public final boolean m215496e(BLiveEffect effect) {
        if (effect.loadTypes.isEmpty()) {
            return false;
        }
        return effect.loadTypes.contains("appStart") || effect.loadTypes.contains("voiceLiveEntry") || effect.loadTypes.contains("voiceRoom");
    }

    /* JADX INFO: renamed from: f */
    public final List<BLiveEffect> m215497f(Pair<BLiveResourceInfo, hvj> pair, boolean isVoiceRoom) {
        List<BLiveEffect> list = ((BLiveResourceInfo) pair.first).liveResources;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            BLiveEffect bLiveEffect = (BLiveEffect) obj;
            yoe yoeVar = INSTANCE;
            bLiveEffect.getClass();
            if (isVoiceRoom ? yoeVar.m215496e(bLiveEffect) : yoeVar.m215495d(bLiveEffect)) {
                arrayList.add(obj);
            }
        }
        Object obj2 = pair.second;
        obj2.getClass();
        HashSet<String> hashSetM215493b = m215493b((hvj) obj2, false);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (hashSetM215493b.contains(((BLiveEffect) obj3).f44359id)) {
                arrayList3.add(obj3);
            }
        }
        arrayList2.addAll(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : arrayList) {
            if (!hashSetM215493b.contains(((BLiveEffect) obj4).f44359id)) {
                arrayList4.add(obj4);
            }
        }
        arrayList2.addAll(arrayList4);
        return arrayList2;
    }
}
