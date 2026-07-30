package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.e30;
import l.hxn0;
import l.i54;
import l.mqv;
import l.nnn0;
import l.vwb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016JC\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00122\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Ll/sfc0;", "", "<init>", "()V", "Ll/ahs;", "presenter", "Ll/fp50;", "event", "", "anchorId", "c", "(Ll/ahs;Ll/fp50;Ljava/lang/String;)Ljava/lang/String;", "Ll/h4t;", "Ll/mlj;", "e", "(Ll/h4t;)Ll/mlj;", "Ll/mnj;", "extraInfo", "", "callList", "Ll/lgc0;", "b", "(Ll/mnj;Ljava/util/List;Ll/lgc0;)Ljava/util/List;", "list", "", "isPacketMode", "Ll/wfc0;", "listener", "needResetSelectStatus", "Ll/tfc0;", "d", "(Ll/mnj;Ljava/util/List;ZLl/wfc0;Z)Ljava/util/List;", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class sfc0 {

    @NotNull
    public static final sfc0 INSTANCE = new sfc0();

    /* JADX INFO: renamed from: a */
    public static void m22412a(mlj mljVar, hxn0 hxn0Var) {
        hxn0Var.getClass();
        mljVar.f15442a = hxn0Var.c;
        mljVar.f15443b = hxn0Var.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m22413c(@NotNull ahs<?> presenter, @NotNull fp50 event, @NotNull String anchorId) {
        Object next;
        presenter.getClass();
        event.getClass();
        anchorId.getClass();
        if (!presenter.m25547E2().m14588n0().isVoiceLive()) {
            String strM13440d = event.m13440d();
            return (strM13440d == null || strM13440d.length() == 0) ? anchorId : strM13440d;
        }
        Object objM14184F3 = presenter.m14184F3(new qee0(700));
        objM14184F3.getClass();
        List list = (List) objM14184F3;
        if (list.isEmpty()) {
            return anchorId;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((mlj) obj).m18008h()) {
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
        } while (!((mlj) next).m18005e());
        if (((mlj) next) != null) {
            return anchorId;
        }
        String str = ((mlj) arrayList.get(0)).f15446e.a;
        str.getClass();
        return str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final mlj m22414e(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        User userM14582l0 = presenter.m25547E2().m14582l0();
        String str = "";
        if (!presenter.m25547E2().m14548Z0()) {
            return mlj.m18003c(new i54(((DbObject) userM14582l0).id, userM14582l0.name, ((Media) userM14582l0.fp()).url), q44.m21020b("", "gift-audience-none-voiceLiveMain", 0));
        }
        Object objM25547E2 = presenter.m25547E2();
        objM25547E2.getClass();
        nnn0 nnn0Var = (nnn0) objM25547E2;
        ArrayList<mlj> arrayListM18053N = mmj.m18053N(nnn0Var);
        if (nnn0Var.j3() && !vwb.J(arrayListM18053N) && arrayListM18053N.size() > 1) {
            return arrayListM18053N.get(1);
        }
        BLiveVoiceCall bLiveVoiceCallL = nnn0Var.P2().l(((DbObject) userM14582l0).id);
        if (bLiveVoiceCallL != null) {
            str = bLiveVoiceCallL.id;
            str.getClass();
        }
        mqv mqvVarM = nnn0Var.P2().m(((DbObject) userM14582l0).id);
        if (mqvVarM == null) {
            mqvVarM = mqv.f(new i54(((DbObject) userM14582l0).id, userM14582l0.name, userM14582l0.fp().profileSmall().formatted())).c(((DbObject) userM14582l0).id, (BLiveUserMask) null, false);
        }
        mqvVarM.getClass();
        final mlj mljVarM18003c = mlj.m18003c((i54) mqvVarM.a, q44.m21020b(str, "gift-audience-none-voiceLiveMain", 0));
        mljVarM18003c.getClass();
        mljVarM18003c.f15448g = "voiceLiveMain";
        hxn0.c(mqvVarM).a(new e30() { // from class: l.rfc0
            public final void call(Object obj) {
                sfc0.m22412a(mljVarM18003c, (hxn0) obj);
            }
        });
        return mljVarM18003c;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2] */
    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<mlj> m22415b(@NotNull mnj extraInfo, @Nullable List<? extends mlj> callList, @Nullable lgc0 presenter) {
        mlj mljVarPrevious;
        extraInfo.getClass();
        ArrayList arrayList = new ArrayList();
        List<? extends mlj> list = callList;
        if (list == null || list.isEmpty()) {
            mlj mljVarM18095g = extraInfo.m18095g();
            mljVarM18095g.getClass();
            arrayList.add(mljVarM18095g);
            return arrayList;
        }
        if (presenter != null && (presenter.m25547E2() instanceof nnn0)) {
            D dM25547E2 = presenter.m25547E2();
            dM25547E2.getClass();
            nnn0 nnn0Var = (nnn0) dM25547E2;
            if (nnn0Var.i3()) {
                ListIterator<? extends mlj> listIterator = callList.listIterator(callList.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        mljVarPrevious = null;
                        break;
                    }
                    mljVarPrevious = listIterator.previous();
                } while (!Intrinsics.d(mljVarPrevious.f15446e.a, presenter.m25547E2().m14576j0()));
                if (mljVarPrevious == null) {
                    User userM14582l0 = nnn0Var.m14582l0();
                    i54 i54VarN = nnn0Var.P2().n(((DbObject) userM14582l0).id);
                    mlj mljVarM18003c = mlj.m18003c(new i54(((DbObject) userM14582l0).id, userM14582l0.name, i54VarN == null ? userM14582l0.fp().profileSmall().formatted() : i54VarN.c), q44.m21020b("", "gift-audience-none-voiceLiveMain", 0));
                    mljVarM18003c.f15448g = "voiceLiveMain";
                    arrayList.add(mljVarM18003c);
                }
            }
        }
        arrayList.addAll(list);
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<tfc0> m22416d(@NotNull mnj extraInfo, @NotNull List<? extends mlj> list, boolean isPacketMode, @NotNull wfc0 listener, boolean needResetSelectStatus) {
        extraInfo.getClass();
        list.getClass();
        listener.getClass();
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            return arrayList;
        }
        List<? extends mlj> list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            mlj mljVar = (mlj) obj;
            tfc0 tfc0Var = new tfc0(mljVar, i, listener);
            if (needResetSelectStatus) {
                tfc0Var.getCallInfo().m18010j(TextUtils.equals(mljVar.f15446e.a, extraInfo.m18093e()));
            }
            tfc0Var.m22912O(isPacketMode);
            arrayList2.add(tfc0Var);
            i = i2;
        }
        return arrayList2;
    }
}
