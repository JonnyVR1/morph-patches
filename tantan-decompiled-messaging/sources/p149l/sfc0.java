package p149l;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
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
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016JC\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00122\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m87232d2 = {"Ll/sfc0;", "", "<init>", "()V", "Ll/ahs;", "presenter", "Ll/fp50;", NotificationCompat.CATEGORY_EVENT, "", "anchorId", "c", "(Ll/ahs;Ll/fp50;Ljava/lang/String;)Ljava/lang/String;", "Ll/h4t;", "Ll/mlj;", "e", "(Ll/h4t;)Ll/mlj;", "Ll/mnj;", "extraInfo", "", "callList", "Ll/lgc0;", "b", "(Ll/mnj;Ljava/util/List;Ll/lgc0;)Ljava/util/List;", "list", "", "isPacketMode", "Ll/wfc0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "needResetSelectStatus", "Ll/tfc0;", Constants.INAPP_DATA_TAG, "(Ll/mnj;Ljava/util/List;ZLl/wfc0;Z)Ljava/util/List;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class sfc0 {

    @NotNull
    public static final sfc0 INSTANCE = new sfc0();

    /* JADX INFO: renamed from: a */
    public static void m183905a(mlj mljVar, hxn0 hxn0Var) {
        hxn0Var.getClass();
        mljVar.f134440a = hxn0Var.f109897c;
        mljVar.f134441b = hxn0Var.f109896b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m183906c(@NotNull ahs<?> presenter, @NotNull fp50 event, @NotNull String anchorId) {
        Object next;
        presenter.getClass();
        event.getClass();
        anchorId.getClass();
        if (!presenter.m206027E2().m132152n0().isVoiceLive()) {
            String strM122560d = event.m122560d();
            return (strM122560d == null || strM122560d.length() == 0) ? anchorId : strM122560d;
        }
        Object objM129297F3 = presenter.m129297F3(new qee0(700));
        objM129297F3.getClass();
        List list = (List) objM129297F3;
        if (list.isEmpty()) {
            return anchorId;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((mlj) obj).m155159h()) {
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
        } while (!((mlj) next).m155156e());
        if (((mlj) next) != null) {
            return anchorId;
        }
        String str = ((mlj) arrayList.get(0)).f134444e.f111520a;
        str.getClass();
        return str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final mlj m183907e(@NotNull h4t<?, ?> presenter) {
        presenter.getClass();
        User userM132146l0 = presenter.m206027E2().m132146l0();
        String str = "";
        if (!presenter.m206027E2().m132112Z0()) {
            return mlj.m155154c(new i54(userM132146l0.f56011id, userM132146l0.name, userM132146l0.m60124fp().url), q44.m172922b("", "gift-audience-none-voiceLiveMain", 0));
        }
        Object objM206027E2 = presenter.m206027E2();
        objM206027E2.getClass();
        nnn0 nnn0Var = (nnn0) objM206027E2;
        ArrayList<mlj> arrayListM155411N = mmj.m155411N(nnn0Var);
        if (nnn0Var.m160272j3() && !vwb.m200296J(arrayListM155411N) && arrayListM155411N.size() > 1) {
            return arrayListM155411N.get(1);
        }
        BLiveVoiceCall bLiveVoiceCallM102063l = nnn0Var.m160249P2().m102063l(userM132146l0.f56011id);
        if (bLiveVoiceCallM102063l != null) {
            str = bLiveVoiceCallM102063l.f44485id;
            str.getClass();
        }
        mqv<i54> mqvVarM102064m = nnn0Var.m160249P2().m102064m(userM132146l0.f56011id);
        if (mqvVarM102064m == null) {
            mqvVarM102064m = mqv.m155998f(new i54(userM132146l0.f56011id, userM132146l0.name, userM132146l0.m60124fp().profileSmall().formatted())).m156001c(userM132146l0.f56011id, null, false);
        }
        mqvVarM102064m.getClass();
        final mlj mljVarM155154c = mlj.m155154c(mqvVarM102064m.f135304a, q44.m172922b(str, "gift-audience-none-voiceLiveMain", 0));
        mljVarM155154c.getClass();
        mljVarM155154c.f134446g = "voiceLiveMain";
        hxn0.m133350c(mqvVarM102064m).m133351a(new e30() { // from class: l.rfc0
            @Override // p149l.e30
            public final void call(Object obj) {
                sfc0.m183905a(mljVarM155154c, (hxn0) obj);
            }
        });
        return mljVarM155154c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2] */
    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<mlj> m183908b(@NotNull mnj extraInfo, @Nullable List<? extends mlj> callList, @Nullable lgc0 presenter) {
        mlj mljVarPrevious;
        extraInfo.getClass();
        ArrayList arrayList = new ArrayList();
        List<? extends mlj> list = callList;
        if (list == null || list.isEmpty()) {
            mlj mljVarM155518g = extraInfo.m155518g();
            mljVarM155518g.getClass();
            arrayList.add(mljVarM155518g);
            return arrayList;
        }
        if (presenter != null && (presenter.m206027E2() instanceof nnn0)) {
            D dM206027E2 = presenter.m206027E2();
            dM206027E2.getClass();
            nnn0 nnn0Var = (nnn0) dM206027E2;
            if (nnn0Var.m160271i3()) {
                ListIterator<? extends mlj> listIterator = callList.listIterator(callList.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        mljVarPrevious = null;
                        break;
                    }
                    mljVarPrevious = listIterator.previous();
                } while (!Intrinsics.m87488d(mljVarPrevious.f134444e.f111520a, presenter.m206027E2().m132140j0()));
                if (mljVarPrevious == null) {
                    User userM132146l0 = nnn0Var.m132146l0();
                    i54 i54VarM102065n = nnn0Var.m160249P2().m102065n(userM132146l0.f56011id);
                    mlj mljVarM155154c = mlj.m155154c(new i54(userM132146l0.f56011id, userM132146l0.name, i54VarM102065n == null ? userM132146l0.m60124fp().profileSmall().formatted() : i54VarM102065n.f111522c), q44.m172922b("", "gift-audience-none-voiceLiveMain", 0));
                    mljVarM155154c.f134446g = "voiceLiveMain";
                    arrayList.add(mljVarM155154c);
                }
            }
        }
        arrayList.addAll(list);
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<tfc0> m183909d(@NotNull mnj extraInfo, @NotNull List<? extends mlj> list, boolean isPacketMode, @NotNull wfc0 listener, boolean needResetSelectStatus) {
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
                tfc0Var.getCallInfo().m155161j(TextUtils.equals(mljVar.f134444e.f111520a, extraInfo.m155516e()));
            }
            tfc0Var.m188680O(isPacketMode);
            arrayList2.add(tfc0Var);
            i = i2;
        }
        return arrayList2;
    }
}
