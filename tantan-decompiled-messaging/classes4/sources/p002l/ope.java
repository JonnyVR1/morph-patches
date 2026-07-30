package p002l;

import android.net.NetworkInfo;
import android.util.Pair;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.BLiveResourceCDN;
import com.p1.mobile.putong.live.base.data.BLiveResourceCDNLoadTypeItem;
import com.p1.mobile.putong.live.base.data.BLiveResourceInfo;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import l.e30;
import l.ffw;
import l.gkh0;
import l.vwb;
import l.w9j;
import l.xi5;
import l.y9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;
import rx.schedulers.Schedulers;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J#\u0010\u000b\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b\r\u0010\fJ+\u0010\u0010\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001e\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u0011J\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010\"J\u001d\u0010%\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002¢\u0006\u0004\b'\u0010&J\u001d\u0010(\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002¢\u0006\u0004\b(\u0010&R0\u0010+\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0004\u0012\u00020 \u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Ll/ope;", "Ll/woe;", "<init>", "()V", "", "f", "i", "Landroid/util/Pair;", "Lcom/p1/mobile/putong/live/base/data/BLiveResourceInfo;", "Ll/hvj;", "pair", "g", "(Landroid/util/Pair;)V", "j", "", "roomType", "a", "(Landroid/util/Pair;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDN;", "", "downloadType", "", "Lcom/p1/mobile/putong/live/base/data/BLiveEffect;", "D", "(Landroid/util/Pair;I)Ljava/util/List;", "E", "(ILandroid/util/Pair;)Ljava/util/List;", "loadType", "H", "(I)Ljava/lang/String;", "C", "effect", "", "F", "(Lcom/p1/mobile/putong/live/base/data/BLiveEffect;)Z", "G", "loadTypes", "z", "(Ljava/util/List;)Z", "A", "B", "c", "Landroid/util/Pair;", "currentPair", "Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDNLoadTypeItem;", "d", "Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDNLoadTypeItem;", "currentMap", "e", "Z", "enableDialogStrategy", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        c cVarM = ConnectivityReceiver.m();
        final Function1 function1 = new Function1() { // from class: l.zoe
            public final Object invoke(Object obj) {
                return ope.m19657v((NetworkInfo) obj);
            }
        };
        c cVarFilter = cVarM.filter(new w9j() { // from class: l.hpe
            public final Object call(Object obj) {
                return ope.m19652q(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: l.ipe
            public final Object invoke(Object obj) {
                return ope.m19648m((NetworkInfo) obj);
            }
        };
        c map = cVarFilter.map(new w9j() { // from class: l.jpe
            public final Object call(Object obj) {
                return ope.m19655t(function2, obj);
            }
        });
        a<Pair<BLiveResourceInfo, BLiveResourceCDN>> aVarM25268c = m25268c();
        c cVarDistinctUntilChanged = m25267b().distinctUntilChanged();
        final Function3 function3 = new Function3() { // from class: l.kpe
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ope.m19653r((Pair) obj, (Integer) obj2, (Boolean) obj3);
            }
        };
        c cVarCombineLatest = c.combineLatest(aVarM25268c, cVarDistinctUntilChanged, map, new y9j() { // from class: l.lpe
            /* JADX INFO: renamed from: a */
            public final Object m17343a(Object obj, Object obj2, Object obj3) {
                return ope.m19659x(function3, obj, obj2, obj3);
            }
        });
        final Function1 function4 = new Function1() { // from class: l.mpe
            public final Object invoke(Object obj) {
                return ope.m19654s(this.f15516a, (Triple) obj);
            }
        };
        c map2 = cVarCombineLatest.map(new w9j() { // from class: l.npe
            public final Object call(Object obj) {
                return ope.m19660y(function4, obj);
            }
        });
        final Function1 function5 = new Function1() { // from class: l.ape
            public final Object invoke(Object obj) {
                return ope.m19650o((List) obj);
            }
        };
        map2.filter(new w9j() { // from class: l.bpe
            public final Object call(Object obj) {
                return ope.m19651p(function5, obj);
            }
        }).observeOn(Schedulers.io()).subscribe(ffw.h(new e30() { // from class: l.fpe
            public final void call(Object obj) {
                ope.m19647l((List) obj);
            }
        }));
        map.subscribe(ffw.h(new e30() { // from class: l.gpe
            public final void call(Object obj) {
                ope.m19656u(this.f11575a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public static Boolean m19646k(String str, BLiveEffect bLiveEffect) {
        bLiveEffect.getClass();
        return Boolean.valueOf(bLiveEffect.loadTypes.contains(str));
    }

    /* JADX INFO: renamed from: l */
    public static void m19647l(List list) {
        if (list == null || !ConnectivityReceiver.g()) {
            return;
        }
        aqe.m10039i().m10050o(list);
    }

    /* JADX INFO: renamed from: m */
    public static Boolean m19648m(NetworkInfo networkInfo) {
        return Boolean.valueOf(ConnectivityReceiver.g());
    }

    /* JADX INFO: renamed from: n */
    public static void m19649n(List list) {
        aqe.m10039i().m10050o(list);
    }

    /* JADX INFO: renamed from: o */
    public static Boolean m19650o(List list) {
        return Boolean.valueOf(!vwb.J(list));
    }

    /* JADX INFO: renamed from: p */
    public static Boolean m19651p(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    public static Boolean m19652q(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r */
    public static Triple m19653r(Pair pair, Integer num, Boolean bool) {
        return new Triple(pair, num, bool);
    }

    /* JADX INFO: renamed from: s */
    public static List m19654s(ope opeVar, Triple triple) {
        Object first = triple.getFirst();
        first.getClass();
        Object second = triple.getSecond();
        second.getClass();
        return opeVar.m19664D((Pair) first, ((Number) second).intValue());
    }

    /* JADX INFO: renamed from: t */
    public static Boolean m19655t(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u */
    public static void m19656u(ope opeVar, Boolean bool) {
        Pair<Pair<BLiveResourceInfo, hvj>, Boolean> pair = opeVar.currentPair;
        if (pair == null || !ConnectivityReceiver.g()) {
            return;
        }
        Object obj = pair.first;
        obj.getClass();
        opeVar.m19663C((Pair) obj, ((Boolean) pair.second).booleanValue() ? "voice-live" : "live");
    }

    /* JADX INFO: renamed from: v */
    public static Boolean m19657v(NetworkInfo networkInfo) {
        return Boolean.valueOf(xi5.b(networkInfo));
    }

    /* JADX INFO: renamed from: w */
    public static void m19658w(List list) {
        aqe.m10039i().m10050o(list);
    }

    /* JADX INFO: renamed from: x */
    public static Triple m19659x(Function3 function3, Object obj, Object obj2, Object obj3) {
        return (Triple) function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: y */
    public static List m19660y(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m19661A(List<String> loadTypes) {
        return loadTypes.contains("liveEntry");
    }

    /* JADX INFO: renamed from: B */
    public final boolean m19662B(List<String> loadTypes) {
        return loadTypes.contains("voiceLiveEntry");
    }

    /* JADX INFO: renamed from: C */
    public final void m19663C(Pair<BLiveResourceInfo, hvj> pair, String roomType) {
        List<BLiveEffect> listM26842c = yoe.INSTANCE.m26842c(pair, this.currentMap, roomType, this.enableDialogStrategy);
        gkh0.j("[gift]EffectManager", "进入房间-下载资源总数:" + listM26842c.size());
        if (listM26842c.isEmpty()) {
            return;
        }
        c.just(listM26842c).observeOn(Schedulers.io()).subscribe(ffw.h(new e30() { // from class: l.dpe
            public final void call(Object obj) {
                ope.m19658w((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D */
    public final List<BLiveEffect> m19664D(Pair<BLiveResourceInfo, BLiveResourceCDN> pair, int downloadType) {
        Object obj = pair.second;
        this.currentMap = ((BLiveResourceCDN) obj).loadResourceIdsMap;
        this.enableDialogStrategy = ((BLiveResourceCDN) obj).enableDialogNewStrategy;
        if (downloadType == 6) {
            List list = ((BLiveResourceInfo) pair.first).liveResources;
            list.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                BLiveEffect bLiveEffect = (BLiveEffect) obj2;
                bLiveEffect.getClass();
                if (m19666F(bLiveEffect)) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        if (downloadType == 7) {
            List list2 = ((BLiveResourceInfo) pair.first).liveResources;
            list2.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list2) {
                BLiveEffect bLiveEffect2 = (BLiveEffect) obj3;
                bLiveEffect2.getClass();
                if (m19667G(bLiveEffect2)) {
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
            List list4 = bLiveResourceCDNLoadTypeItem.liveRoom;
            list4.getClass();
            if (list4.isEmpty()) {
                List list5 = bLiveResourceCDNLoadTypeItem.voiceRoom;
                list5.getClass();
                if (list5.isEmpty()) {
                    return m19665E(downloadType, pair);
                }
            }
            return Collections.EMPTY_LIST;
        }
        if (downloadType != 1) {
            if (downloadType != 2) {
                if (downloadType == 3 && m19662B(list3)) {
                    return ((BLiveResourceInfo) pair.first).liveResources;
                }
            } else if (m19661A(list3)) {
                return ((BLiveResourceInfo) pair.first).liveResources;
            }
        } else if (m19673z(list3)) {
            return ((BLiveResourceInfo) pair.first).liveResources;
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: E */
    public final List<BLiveEffect> m19665E(int downloadType, Pair<BLiveResourceInfo, BLiveResourceCDN> pair) {
        final String strM19668H = m19668H(downloadType);
        return vwb.n(((BLiveResourceInfo) pair.first).liveResources, new w9j() { // from class: l.epe
            public final Object call(Object obj) {
                return ope.m19646k(strM19668H, (BLiveEffect) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public final boolean m19666F(BLiveEffect effect) {
        return effect.loadTypes.contains("appStart") || effect.loadTypes.contains("liveEntry") || effect.loadTypes.contains("liveRoom");
    }

    /* JADX INFO: renamed from: G */
    public final boolean m19667G(BLiveEffect effect) {
        return effect.loadTypes.contains("appStart") || effect.loadTypes.contains("voiceLiveEntry") || effect.loadTypes.contains("voiceRoom");
    }

    /* JADX INFO: renamed from: H */
    public final String m19668H(int loadType) {
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

    @Override // p002l.eql
    /* JADX INFO: renamed from: a */
    public void mo10040a(@NotNull Pair<BLiveResourceInfo, hvj> pair, @NotNull String roomType) {
        pair.getClass();
        roomType.getClass();
        if (this.enableDialogStrategy) {
            List<BLiveEffect> listM26842c = yoe.INSTANCE.m26842c(pair, this.currentMap, roomType, false);
            gkh0.j("[gift]EffectManager", "打开礼物面板-下载资源数:" + listM26842c.size());
            if (listM26842c.isEmpty()) {
                return;
            }
            c.just(listM26842c).observeOn(Schedulers.io()).subscribe(ffw.h(new e30() { // from class: l.cpe
                public final void call(Object obj) {
                    ope.m19649n((List) obj);
                }
            }));
        }
    }

    @Override // p002l.woe
    /* JADX INFO: renamed from: f */
    public void mo19669f() {
        m25267b().onNext(6);
    }

    @Override // p002l.woe
    /* JADX INFO: renamed from: g */
    public void mo19670g(@NotNull Pair<BLiveResourceInfo, hvj> pair) {
        pair.getClass();
        this.currentPair = new Pair<>(pair, Boolean.FALSE);
        String strM14841f = ((hvj) pair.second).m14841f();
        strM14841f.getClass();
        m19663C(pair, strM14841f);
    }

    @Override // p002l.woe
    /* JADX INFO: renamed from: i */
    public void mo19671i() {
        m25267b().onNext(7);
    }

    @Override // p002l.woe
    /* JADX INFO: renamed from: j */
    public void mo19672j(@NotNull Pair<BLiveResourceInfo, hvj> pair) {
        pair.getClass();
        this.currentPair = new Pair<>(pair, Boolean.TRUE);
        m19663C(pair, "voice-live");
    }

    /* JADX INFO: renamed from: z */
    public final boolean m19673z(List<String> loadTypes) {
        return loadTypes.contains("appStart");
    }
}
