package p153l;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016JC\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00122\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m88121d2 = {"Ll/znc0;", "", "<init>", "()V", "Ll/bjs;", "presenter", "Ll/lx50;", NotificationCompat.CATEGORY_EVENT, "", "anchorId", "c", "(Ll/bjs;Ll/lx50;Ljava/lang/String;)Ljava/lang/String;", "Ll/i6t;", "Ll/coj;", "e", "(Ll/i6t;)Ll/coj;", "Ll/cqj;", "extraInfo", "", "callList", "Ll/soc0;", "b", "(Ll/cqj;Ljava/util/List;Ll/soc0;)Ljava/util/List;", "list", "", "isPacketMode", "Ll/doc0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "needResetSelectStatus", "Ll/aoc0;", Constants.INAPP_DATA_TAG, "(Ll/cqj;Ljava/util/List;ZLl/doc0;Z)Ljava/util/List;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class znc0 {

    @NotNull
    public static final znc0 INSTANCE = new znc0();

    /* JADX INFO: renamed from: a */
    public static void m220588a(coj cojVar, l6o0 l6o0Var) {
        l6o0Var.getClass();
        cojVar.f82885a = l6o0Var.f130276c;
        cojVar.f82886b = l6o0Var.f130275b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m220589c(@NotNull bjs<?> presenter, @NotNull lx50 event, @NotNull String anchorId) {
        Object next;
        presenter.getClass();
        event.getClass();
        anchorId.getClass();
        if (!presenter.m213810E2().m168538n0().isVoiceLive()) {
            String strM156154d = event.m156154d();
            return (strM156154d == null || strM156154d.length() == 0) ? anchorId : strM156154d;
        }
        Object objM138856F3 = presenter.m138856F3(new vme0(700));
        objM138856F3.getClass();
        List list = (List) objM138856F3;
        if (list.isEmpty()) {
            return anchorId;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((coj) obj).m111666h()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((coj) next).m111663e());
        if (((coj) next) != null) {
            return anchorId;
        }
        String str = ((coj) arrayList.get(0)).f82889e.f107997a;
        str.getClass();
        return str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final coj m220590e(@NotNull i6t<?, ?> presenter) {
        presenter.getClass();
        User userM168532l0 = presenter.m213810E2().m168532l0();
        String str = "";
        if (!presenter.m213810E2().m168498Z0()) {
            return coj.m111661c(new h64(userM168532l0.f56859id, userM168532l0.name, userM168532l0.m61308fp().url), p54.m170592b("", "gift-audience-none-voiceLiveMain", 0));
        }
        Object objM213810E2 = presenter.m213810E2();
        objM213810E2.getClass();
        rwn0 rwn0Var = (rwn0) objM213810E2;
        ArrayList<coj> arrayListM111778N = cpj.m111778N(rwn0Var);
        if (rwn0Var.m183436j3() && !jyb.m147479J(arrayListM111778N) && arrayListM111778N.size() > 1) {
            return arrayListM111778N.get(1);
        }
        BLiveVoiceCall bLiveVoiceCallM136873l = rwn0Var.m183411P2().m136873l(userM168532l0.f56859id);
        if (bLiveVoiceCallM136873l != null) {
            str = bLiveVoiceCallM136873l.f45333id;
            str.getClass();
        }
        nsv<h64> nsvVarM136874m = rwn0Var.m183411P2().m136874m(userM168532l0.f56859id);
        if (nsvVarM136874m == null) {
            nsvVarM136874m = nsv.m164636f(new h64(userM168532l0.f56859id, userM168532l0.name, userM168532l0.m61308fp().profileSmall().formatted())).m164639c(userM168532l0.f56859id, null, false);
        }
        nsvVarM136874m.getClass();
        final coj cojVarM111661c = coj.m111661c(nsvVarM136874m.f143542a, p54.m170592b(str, "gift-audience-none-voiceLiveMain", 0));
        cojVarM111661c.getClass();
        cojVarM111661c.f82891g = "voiceLiveMain";
        l6o0.m153068c(nsvVarM136874m).m153069a(new y20() { // from class: l.ync0
            @Override // p153l.y20
            public final void call(Object obj) {
                znc0.m220588a(cojVarM111661c, (l6o0) obj);
            }
        });
        return cojVarM111661c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.oo2] */
    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<coj> m220591b(@NotNull cqj extraInfo, @Nullable List<? extends coj> callList, @Nullable soc0 presenter) {
        coj cojVarPrevious;
        extraInfo.getClass();
        ArrayList arrayList = new ArrayList();
        List<? extends coj> list = callList;
        if (list == null || list.isEmpty()) {
            coj cojVarM111918g = extraInfo.m111918g();
            cojVarM111918g.getClass();
            arrayList.add(cojVarM111918g);
            return arrayList;
        }
        if (presenter != null && (presenter.m213810E2() instanceof rwn0)) {
            D dM213810E2 = presenter.m213810E2();
            dM213810E2.getClass();
            rwn0 rwn0Var = (rwn0) dM213810E2;
            if (rwn0Var.m183434i3()) {
                ListIterator<? extends coj> listIterator = callList.listIterator(callList.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        cojVarPrevious = null;
                        break;
                    }
                    cojVarPrevious = listIterator.previous();
                } while (!Intrinsics.m88377d(cojVarPrevious.f82889e.f107997a, presenter.m213810E2().m168526j0()));
                if (cojVarPrevious == null) {
                    User userM168532l0 = rwn0Var.m168532l0();
                    h64 h64VarM136875n = rwn0Var.m183411P2().m136875n(userM168532l0.f56859id);
                    coj cojVarM111661c = coj.m111661c(new h64(userM168532l0.f56859id, userM168532l0.name, h64VarM136875n == null ? userM168532l0.m61308fp().profileSmall().formatted() : h64VarM136875n.f107999c), p54.m170592b("", "gift-audience-none-voiceLiveMain", 0));
                    cojVarM111661c.f82891g = "voiceLiveMain";
                    arrayList.add(cojVarM111661c);
                }
            }
        }
        arrayList.addAll(list);
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<aoc0> m220592d(@NotNull cqj extraInfo, @NotNull List<? extends coj> list, boolean isPacketMode, @NotNull doc0 listener, boolean needResetSelectStatus) {
        extraInfo.getClass();
        list.getClass();
        listener.getClass();
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            return arrayList;
        }
        List<? extends coj> list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            coj cojVar = (coj) obj;
            aoc0 aoc0Var = new aoc0(cojVar, i, listener);
            if (needResetSelectStatus) {
                aoc0Var.getCallInfo().m111668j(TextUtils.equals(cojVar.f82889e.f107997a, extraInfo.m111916e()));
            }
            aoc0Var.m99065O(isPacketMode);
            arrayList2.add(aoc0Var);
            i = i2;
        }
        return arrayList2;
    }
}
