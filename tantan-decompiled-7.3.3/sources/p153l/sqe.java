package p153l;

import android.net.NetworkInfo;
import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveResourceCDN;
import com.p051p1.mobile.putong.live.base.data.BLiveResourceCDNLoadTypeItem;
import com.p051p1.mobile.putong.live.base.data.BLiveResourceInfo;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J#\u0010\u000b\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b\r\u0010\fJ+\u0010\u0010\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001e\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u0011J\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010\"J\u001d\u0010%\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002¢\u0006\u0004\b'\u0010&J\u001d\u0010(\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002¢\u0006\u0004\b(\u0010&R0\u0010+\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020 \u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, m88121d2 = {"Ll/sqe;", "Ll/aqe;", "<init>", "()V", "", "f", RXScreenCaptureService.KEY_INDEX, "Landroid/util/Pair;", "Lcom/p1/mobile/putong/live/base/data/BLiveResourceInfo;", "Ll/xxj;", "pair", "g", "(Landroid/util/Pair;)V", "j", "", "roomType", "a", "(Landroid/util/Pair;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDN;", "", "downloadType", "", "Lcom/p1/mobile/putong/live/base/data/BLiveEffect;", "D", "(Landroid/util/Pair;I)Ljava/util/List;", "E", "(ILandroid/util/Pair;)Ljava/util/List;", "loadType", "H", "(I)Ljava/lang/String;", c4s.C_ZONE, "effect", "", "F", "(Lcom/p1/mobile/putong/live/base/data/BLiveEffect;)Z", "G", "loadTypes", BaseSei.f14626Z, "(Ljava/util/List;)Z", "A", "B", "c", "Landroid/util/Pair;", "currentPair", "Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDNLoadTypeItem;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDNLoadTypeItem;", "currentMap", "e", "Z", "enableDialogStrategy", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class sqe extends aqe {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Pair<Pair<BLiveResourceInfo, xxj>, Boolean> currentPair;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public BLiveResourceCDNLoadTypeItem currentMap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean enableDialogStrategy;

    public sqe() {
        C22421c<NetworkInfo> c22421cM82473m = ConnectivityReceiver.m82473m();
        final Function1 function1 = new Function1() { // from class: l.dqe
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return sqe.m187528v((NetworkInfo) obj);
            }
        };
        C22421c<NetworkInfo> c22421cFilter = c22421cM82473m.filter(new qcj() { // from class: l.lqe
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return sqe.m187523q(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.mqe
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return sqe.m187519m((NetworkInfo) obj);
            }
        };
        C22421c<R> map = c22421cFilter.map(new qcj() { // from class: l.nqe
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return sqe.m187526t(function2, obj);
            }
        });
        C22507a<Pair<BLiveResourceInfo, BLiveResourceCDN>> c22507aM99459c = m99459c();
        C22421c<Integer> c22421cDistinctUntilChanged = m99458b().distinctUntilChanged();
        final Function3 function3 = new Function3() { // from class: l.oqe
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return sqe.m187524r((Pair) obj, (Integer) obj2, (Boolean) obj3);
            }
        };
        C22421c c22421cCombineLatest = C22421c.combineLatest(c22507aM99459c, c22421cDistinctUntilChanged, map, new scj() { // from class: l.pqe
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return sqe.m187530x(function3, obj, obj2, obj3);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.qqe
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return sqe.m187525s(this.f158995a, (Triple) obj);
            }
        };
        C22421c map2 = c22421cCombineLatest.map(new qcj() { // from class: l.rqe
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return sqe.m187531y(function4, obj);
            }
        });
        final Function1 function5 = new Function1() { // from class: l.eqe
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return sqe.m187521o((List) obj);
            }
        };
        map2.filter(new qcj() { // from class: l.fqe
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return sqe.m187522p(function5, obj);
            }
        }).observeOn(Schedulers.m222739io()).subscribe(dhw.m115829h(new y20() { // from class: l.jqe
            @Override // p153l.y20
            public final void call(Object obj) {
                sqe.m187518l((List) obj);
            }
        }));
        map.subscribe(dhw.m115829h(new y20() { // from class: l.kqe
            @Override // p153l.y20
            public final void call(Object obj) {
                sqe.m187527u(this.f128214a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public static Boolean m187517k(String str, BLiveEffect bLiveEffect) {
        bLiveEffect.getClass();
        return Boolean.valueOf(bLiveEffect.loadTypes.contains(str));
    }

    /* JADX INFO: renamed from: l */
    public static void m187518l(List list) {
        if (list == null || !ConnectivityReceiver.m82467g()) {
            return;
        }
        ere.m122146i().m122157o(list);
    }

    /* JADX INFO: renamed from: m */
    public static Boolean m187519m(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.m82467g());
    }

    /* JADX INFO: renamed from: n */
    public static void m187520n(List list) {
        ere.m122146i().m122157o(list);
    }

    /* JADX INFO: renamed from: o */
    public static Boolean m187521o(List list) {
        return Boolean.valueOf(!jyb.m147479J(list));
    }

    /* JADX INFO: renamed from: p */
    public static Boolean m187522p(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    public static Boolean m187523q(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r */
    public static Triple m187524r(Pair pair, Integer num, Boolean bool) {
        return new Triple(pair, num, bool);
    }

    /* JADX INFO: renamed from: s */
    public static List m187525s(sqe sqeVar, Triple triple) {
        Object first = triple.getFirst();
        first.getClass();
        Object second = triple.getSecond();
        second.getClass();
        return sqeVar.m187535D((Pair) first, ((Number) second).intValue());
    }

    /* JADX INFO: renamed from: t */
    public static Boolean m187526t(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u */
    public static void m187527u(sqe sqeVar, Boolean bool) {
        Pair<Pair<BLiveResourceInfo, xxj>, Boolean> pair = sqeVar.currentPair;
        if (pair == null || !ConnectivityReceiver.m82467g()) {
            return;
        }
        Object obj = pair.first;
        obj.getClass();
        sqeVar.m187534C((Pair) obj, ((Boolean) pair.second).booleanValue() ? BLiveAbsData.VOICE_LIVE : "live");
    }

    /* JADX INFO: renamed from: v */
    public static Boolean m187528v(NetworkInfo networkInfo) {
        return Boolean.valueOf(yj5.m216389b(networkInfo));
    }

    /* JADX INFO: renamed from: w */
    public static void m187529w(List list) {
        ere.m122146i().m122157o(list);
    }

    /* JADX INFO: renamed from: x */
    public static Triple m187530x(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (Triple) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: y */
    public static List m187531y(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m187532A(List<String> loadTypes) {
        return loadTypes.contains("liveEntry");
    }

    /* JADX INFO: renamed from: B */
    public final boolean m187533B(List<String> loadTypes) {
        return loadTypes.contains("voiceLiveEntry");
    }

    /* JADX INFO: renamed from: C */
    public final void m187534C(Pair<BLiveResourceInfo, xxj> pair, String roomType) {
        List<BLiveEffect> listM111892c = cqe.INSTANCE.m111892c(pair, this.currentMap, roomType, this.enableDialogStrategy);
        nsh0.m164608j("[gift]EffectManager", "进入房间-下载资源总数:" + listM111892c.size());
        if (listM111892c.isEmpty()) {
            return;
        }
        C22421c.just(listM111892c).observeOn(Schedulers.m222739io()).subscribe(dhw.m115829h(new y20() { // from class: l.hqe
            @Override // p153l.y20
            public final void call(Object obj) {
                sqe.m187529w((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D */
    public final List<BLiveEffect> m187535D(Pair<BLiveResourceInfo, BLiveResourceCDN> pair, int downloadType) {
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
                if (m187537F(bLiveEffect)) {
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
                if (m187538G(bLiveEffect2)) {
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
                    return m187536E(downloadType, pair);
                }
            }
            return Collections.EMPTY_LIST;
        }
        if (downloadType != 1) {
            if (downloadType != 2) {
                if (downloadType == 3 && m187533B(list3)) {
                    return ((BLiveResourceInfo) pair.first).liveResources;
                }
            } else if (m187532A(list3)) {
                return ((BLiveResourceInfo) pair.first).liveResources;
            }
        } else if (m187540z(list3)) {
            return ((BLiveResourceInfo) pair.first).liveResources;
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: E */
    public final List<BLiveEffect> m187536E(int downloadType, Pair<BLiveResourceInfo, BLiveResourceCDN> pair) {
        final String strM187539H = m187539H(downloadType);
        return jyb.m147522n(((BLiveResourceInfo) pair.first).liveResources, new qcj() { // from class: l.iqe
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return sqe.m187517k(strM187539H, (BLiveEffect) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public final boolean m187537F(BLiveEffect effect) {
        return effect.loadTypes.contains("appStart") || effect.loadTypes.contains("liveEntry") || effect.loadTypes.contains("liveRoom");
    }

    /* JADX INFO: renamed from: G */
    public final boolean m187538G(BLiveEffect effect) {
        return effect.loadTypes.contains("appStart") || effect.loadTypes.contains("voiceLiveEntry") || effect.loadTypes.contains("voiceRoom");
    }

    /* JADX INFO: renamed from: H */
    public final String m187539H(int loadType) {
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

    @Override // p153l.qsl
    /* JADX INFO: renamed from: a */
    public void mo122147a(@NotNull Pair<BLiveResourceInfo, xxj> pair, @NotNull String roomType) {
        pair.getClass();
        roomType.getClass();
        if (this.enableDialogStrategy) {
            List<BLiveEffect> listM111892c = cqe.INSTANCE.m111892c(pair, this.currentMap, roomType, false);
            nsh0.m164608j("[gift]EffectManager", "打开礼物面板-下载资源数:" + listM111892c.size());
            if (listM111892c.isEmpty()) {
                return;
            }
            C22421c.just(listM111892c).observeOn(Schedulers.m222739io()).subscribe(dhw.m115829h(new y20() { // from class: l.gqe
                @Override // p153l.y20
                public final void call(Object obj) {
                    sqe.m187520n((List) obj);
                }
            }));
        }
    }

    @Override // p153l.aqe
    /* JADX INFO: renamed from: f */
    public void mo99462f() {
        m99458b().onNext(6);
    }

    @Override // p153l.aqe
    /* JADX INFO: renamed from: g */
    public void mo99463g(@NotNull Pair<BLiveResourceInfo, xxj> pair) {
        pair.getClass();
        this.currentPair = new Pair<>(pair, Boolean.FALSE);
        String strM213532f = ((xxj) pair.second).m213532f();
        strM213532f.getClass();
        m187534C(pair, strM213532f);
    }

    @Override // p153l.aqe
    /* JADX INFO: renamed from: i */
    public void mo99465i() {
        m99458b().onNext(7);
    }

    @Override // p153l.aqe
    /* JADX INFO: renamed from: j */
    public void mo99466j(@NotNull Pair<BLiveResourceInfo, xxj> pair) {
        pair.getClass();
        this.currentPair = new Pair<>(pair, Boolean.TRUE);
        m187534C(pair, BLiveAbsData.VOICE_LIVE);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m187540z(List<String> loadTypes) {
        return loadTypes.contains("appStart");
    }
}
