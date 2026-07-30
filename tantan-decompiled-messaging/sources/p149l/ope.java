package p149l;

import android.net.NetworkInfo;
import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveResourceCDN;
import com.p046p1.mobile.putong.live.base.data.BLiveResourceCDNLoadTypeItem;
import com.p046p1.mobile.putong.live.base.data.BLiveResourceInfo;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J#\u0010\u000b\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b\r\u0010\fJ+\u0010\u0010\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001e\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u0011J\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010\"J\u001d\u0010%\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002¢\u0006\u0004\b'\u0010&J\u001d\u0010(\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002¢\u0006\u0004\b(\u0010&R0\u0010+\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020 \u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, m87232d2 = {"Ll/ope;", "Ll/woe;", "<init>", "()V", "", "f", RXScreenCaptureService.KEY_INDEX, "Landroid/util/Pair;", "Lcom/p1/mobile/putong/live/base/data/BLiveResourceInfo;", "Ll/hvj;", "pair", "g", "(Landroid/util/Pair;)V", "j", "", "roomType", "a", "(Landroid/util/Pair;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDN;", "", "downloadType", "", "Lcom/p1/mobile/putong/live/base/data/BLiveEffect;", "D", "(Landroid/util/Pair;I)Ljava/util/List;", "E", "(ILandroid/util/Pair;)Ljava/util/List;", "loadType", "H", "(I)Ljava/lang/String;", b2s.C_ZONE, "effect", "", "F", "(Lcom/p1/mobile/putong/live/base/data/BLiveEffect;)Z", "G", "loadTypes", BaseSei.f13932Z, "(Ljava/util/List;)Z", "A", "B", "c", "Landroid/util/Pair;", "currentPair", "Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDNLoadTypeItem;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDNLoadTypeItem;", "currentMap", "e", "Z", "enableDialogStrategy", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ope extends woe {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Pair<Pair<BLiveResourceInfo, hvj>, Boolean> currentPair;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public BLiveResourceCDNLoadTypeItem currentMap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean enableDialogStrategy;

    public ope() {
        C22306c<NetworkInfo> c22306cM81290m = ConnectivityReceiver.m81290m();
        final Function1 function1 = new Function1() { // from class: l.zoe
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ope.m165340v((NetworkInfo) obj);
            }
        };
        C22306c<NetworkInfo> c22306cFilter = c22306cM81290m.filter(new w9j() { // from class: l.hpe
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ope.m165335q(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.ipe
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ope.m165331m((NetworkInfo) obj);
            }
        };
        C22306c<R> map = c22306cFilter.map(new w9j() { // from class: l.jpe
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ope.m165338t(function2, obj);
            }
        });
        C22392a<Pair<BLiveResourceInfo, BLiveResourceCDN>> c22392aM204804c = m204804c();
        C22306c<Integer> c22306cDistinctUntilChanged = m204803b().distinctUntilChanged();
        final Function3 function3 = new Function3() { // from class: l.kpe
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ope.m165336r((Pair) obj, (Integer) obj2, (Boolean) obj3);
            }
        };
        C22306c c22306cCombineLatest = C22306c.combineLatest(c22392aM204804c, c22306cDistinctUntilChanged, map, new y9j() { // from class: l.lpe
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return ope.m165342x(function3, obj, obj2, obj3);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.mpe
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ope.m165337s(this.f135042a, (Triple) obj);
            }
        };
        C22306c map2 = c22306cCombineLatest.map(new w9j() { // from class: l.npe
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ope.m165343y(function4, obj);
            }
        });
        final Function1 function5 = new Function1() { // from class: l.ape
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ope.m165333o((List) obj);
            }
        };
        map2.filter(new w9j() { // from class: l.bpe
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ope.m165334p(function5, obj);
            }
        }).observeOn(Schedulers.m221493io()).subscribe(ffw.m121197h(new e30() { // from class: l.fpe
            @Override // p149l.e30
            public final void call(Object obj) {
                ope.m165330l((List) obj);
            }
        }));
        map.subscribe(ffw.m121197h(new e30() { // from class: l.gpe
            @Override // p149l.e30
            public final void call(Object obj) {
                ope.m165339u(this.f103795a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public static Boolean m165329k(String str, BLiveEffect bLiveEffect) {
        bLiveEffect.getClass();
        return Boolean.valueOf(bLiveEffect.loadTypes.contains(str));
    }

    /* JADX INFO: renamed from: l */
    public static void m165330l(List list) {
        if (list == null || !ConnectivityReceiver.m81284g()) {
            return;
        }
        aqe.m98261i().m98272o(list);
    }

    /* JADX INFO: renamed from: m */
    public static Boolean m165331m(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.m81284g());
    }

    /* JADX INFO: renamed from: n */
    public static void m165332n(List list) {
        aqe.m98261i().m98272o(list);
    }

    /* JADX INFO: renamed from: o */
    public static Boolean m165333o(List list) {
        return Boolean.valueOf(!vwb.m200296J(list));
    }

    /* JADX INFO: renamed from: p */
    public static Boolean m165334p(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    public static Boolean m165335q(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r */
    public static Triple m165336r(Pair pair, Integer num, Boolean bool) {
        return new Triple(pair, num, bool);
    }

    /* JADX INFO: renamed from: s */
    public static List m165337s(ope opeVar, Triple triple) {
        Object first = triple.getFirst();
        first.getClass();
        Object second = triple.getSecond();
        second.getClass();
        return opeVar.m165347D((Pair) first, ((Number) second).intValue());
    }

    /* JADX INFO: renamed from: t */
    public static Boolean m165338t(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u */
    public static void m165339u(ope opeVar, Boolean bool) {
        Pair<Pair<BLiveResourceInfo, hvj>, Boolean> pair = opeVar.currentPair;
        if (pair == null || !ConnectivityReceiver.m81284g()) {
            return;
        }
        Object obj = pair.first;
        obj.getClass();
        opeVar.m165346C((Pair) obj, ((Boolean) pair.second).booleanValue() ? BLiveAbsData.VOICE_LIVE : "live");
    }

    /* JADX INFO: renamed from: v */
    public static Boolean m165340v(NetworkInfo networkInfo) {
        return Boolean.valueOf(xi5.m208915b(networkInfo));
    }

    /* JADX INFO: renamed from: w */
    public static void m165341w(List list) {
        aqe.m98261i().m98272o(list);
    }

    /* JADX INFO: renamed from: x */
    public static Triple m165342x(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (Triple) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: y */
    public static List m165343y(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m165344A(List<String> loadTypes) {
        return loadTypes.contains("liveEntry");
    }

    /* JADX INFO: renamed from: B */
    public final boolean m165345B(List<String> loadTypes) {
        return loadTypes.contains("voiceLiveEntry");
    }

    /* JADX INFO: renamed from: C */
    public final void m165346C(Pair<BLiveResourceInfo, hvj> pair, String roomType) {
        List<BLiveEffect> listM215494c = yoe.INSTANCE.m215494c(pair, this.currentMap, roomType, this.enableDialogStrategy);
        gkh0.m126627j("[gift]EffectManager", "进入房间-下载资源总数:" + listM215494c.size());
        if (listM215494c.isEmpty()) {
            return;
        }
        C22306c.just(listM215494c).observeOn(Schedulers.m221493io()).subscribe(ffw.m121197h(new e30() { // from class: l.dpe
            @Override // p149l.e30
            public final void call(Object obj) {
                ope.m165341w((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D */
    public final List<BLiveEffect> m165347D(Pair<BLiveResourceInfo, BLiveResourceCDN> pair, int downloadType) {
        Object obj = pair.second;
        this.currentMap = ((BLiveResourceCDN) obj).loadResourceIdsMap;
        this.enableDialogStrategy = ((BLiveResourceCDN) obj).enableDialogNewStrategy;
        if (downloadType == 6) {
            List<BLiveEffect> list = ((BLiveResourceInfo) pair.first).liveResources;
            list.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                BLiveEffect bLiveEffect = (BLiveEffect) obj2;
                bLiveEffect.getClass();
                if (m165349F(bLiveEffect)) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        if (downloadType == 7) {
            List<BLiveEffect> list2 = ((BLiveResourceInfo) pair.first).liveResources;
            list2.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list2) {
                BLiveEffect bLiveEffect2 = (BLiveEffect) obj3;
                bLiveEffect2.getClass();
                if (m165350G(bLiveEffect2)) {
                    arrayList2.add(obj3);
                }
            }
            return arrayList2;
        }
        List<String> list3 = ((BLiveResourceCDN) obj).loadTypes;
        list3.getClass();
        BLiveResourceCDNLoadTypeItem bLiveResourceCDNLoadTypeItem = ((BLiveResourceCDN) pair.second).loadResourceIdsMap;
        bLiveResourceCDNLoadTypeItem.getClass();
        if (list3.isEmpty()) {
            List<String> list4 = bLiveResourceCDNLoadTypeItem.liveRoom;
            list4.getClass();
            if (list4.isEmpty()) {
                List<String> list5 = bLiveResourceCDNLoadTypeItem.voiceRoom;
                list5.getClass();
                if (list5.isEmpty()) {
                    return m165348E(downloadType, pair);
                }
            }
            return Collections.EMPTY_LIST;
        }
        if (downloadType != 1) {
            if (downloadType != 2) {
                if (downloadType == 3 && m165345B(list3)) {
                    return ((BLiveResourceInfo) pair.first).liveResources;
                }
            } else if (m165344A(list3)) {
                return ((BLiveResourceInfo) pair.first).liveResources;
            }
        } else if (m165356z(list3)) {
            return ((BLiveResourceInfo) pair.first).liveResources;
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: E */
    public final List<BLiveEffect> m165348E(int downloadType, Pair<BLiveResourceInfo, BLiveResourceCDN> pair) {
        final String strM165351H = m165351H(downloadType);
        return vwb.m200339n(((BLiveResourceInfo) pair.first).liveResources, new w9j() { // from class: l.epe
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ope.m165329k(strM165351H, (BLiveEffect) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public final boolean m165349F(BLiveEffect effect) {
        return effect.loadTypes.contains("appStart") || effect.loadTypes.contains("liveEntry") || effect.loadTypes.contains("liveRoom");
    }

    /* JADX INFO: renamed from: G */
    public final boolean m165350G(BLiveEffect effect) {
        return effect.loadTypes.contains("appStart") || effect.loadTypes.contains("voiceLiveEntry") || effect.loadTypes.contains("voiceRoom");
    }

    /* JADX INFO: renamed from: H */
    public final String m165351H(int loadType) {
        if (loadType == 1) {
            return "appStart";
        }
        if (loadType == 2) {
            return "liveEntry";
        }
        if (loadType == 3) {
            return "voiceLiveEntry";
        }
        if (loadType != 4) {
            return loadType != 5 ? "appStart" : "voiceRoom";
        }
        return "liveRoom";
    }

    @Override // p149l.eql
    /* JADX INFO: renamed from: a */
    public void mo98262a(@NotNull Pair<BLiveResourceInfo, hvj> pair, @NotNull String roomType) {
        pair.getClass();
        roomType.getClass();
        if (this.enableDialogStrategy) {
            List<BLiveEffect> listM215494c = yoe.INSTANCE.m215494c(pair, this.currentMap, roomType, false);
            gkh0.m126627j("[gift]EffectManager", "打开礼物面板-下载资源数:" + listM215494c.size());
            if (listM215494c.isEmpty()) {
                return;
            }
            C22306c.just(listM215494c).observeOn(Schedulers.m221493io()).subscribe(ffw.m121197h(new e30() { // from class: l.cpe
                @Override // p149l.e30
                public final void call(Object obj) {
                    ope.m165332n((List) obj);
                }
            }));
        }
    }

    @Override // p149l.woe
    /* JADX INFO: renamed from: f */
    public void mo165352f() {
        m204803b().onNext(6);
    }

    @Override // p149l.woe
    /* JADX INFO: renamed from: g */
    public void mo165353g(@NotNull Pair<BLiveResourceInfo, hvj> pair) {
        pair.getClass();
        this.currentPair = new Pair<>(pair, Boolean.FALSE);
        String strM133173f = ((hvj) pair.second).m133173f();
        strM133173f.getClass();
        m165346C(pair, strM133173f);
    }

    @Override // p149l.woe
    /* JADX INFO: renamed from: i */
    public void mo165354i() {
        m204803b().onNext(7);
    }

    @Override // p149l.woe
    /* JADX INFO: renamed from: j */
    public void mo165355j(@NotNull Pair<BLiveResourceInfo, hvj> pair) {
        pair.getClass();
        this.currentPair = new Pair<>(pair, Boolean.TRUE);
        m165346C(pair, BLiveAbsData.VOICE_LIVE);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m165356z(List<String> loadTypes) {
        return loadTypes.contains("appStart");
    }
}
