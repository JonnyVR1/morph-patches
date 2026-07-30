package p002l;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.p000p1.mobile.putong.core.p001ui.nightclub.view.IntlNightClubDlgView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.IntlNightClubConfig;
import com.p1.mobile.putong.core.data.IntlNightClubEnvelope;
import com.p1.mobile.putong.core.data.IntlRecordNightClub;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import l.cwf0;
import l.dd80;
import l.e30;
import l.f6c0;
import l.i0e;
import l.jo0;
import l.mkd0;
import l.mqi0;
import l.o7r;
import l.qib0;
import l.rza;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R)\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0%0$8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Ll/gj40;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "", "n", "(Lcom/p1/mobile/android/app/Act;)V", "q", "", "uid", "clubId", "r", "(Ljava/lang/String;Ljava/lang/String;Lcom/p1/mobile/android/app/Act;)V", "p", "(Ljava/lang/String;)V", "i", "", "o", "()Z", "id", "Ll/aqd0;", "j", "(Ljava/lang/String;)Ll/aqd0;", "k", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "a", "Lkotlin/Lazy;", "m", "couldShow", "", "Lcom/p1/mobile/putong/core/data/IntlNightClubConfig;", "b", "Ljava/util/List;", "clubConfigs", "Lrx/subjects/b;", "Landroid/util/Pair;", "c", "Lrx/subjects/b;", "l", "()Lrx/subjects/b;", "clubSuggestPub", "d", "Ll/aqd0;", "savedNightClub", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class gj40 {

    @NotNull
    public static final gj40 INSTANCE = new gj40();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy couldShow = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.yi40
        public final Object invoke() {
            return Boolean.valueOf(gj40.m13839h());
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static List<? extends IntlNightClubConfig> clubConfigs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final b<Pair<String, String>> clubSuggestPub;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    public static aqd0 savedNightClub;

    static {
        b<Pair<String, String>> bVarB = b.b();
        bVarB.getClass();
        clubSuggestPub = bVarB;
    }

    /* JADX INFO: renamed from: a */
    public static void m13832a(Throwable th) {
        Objects.toString(th);
    }

    /* JADX INFO: renamed from: b */
    public static void m13833b(String str, Envelope envelope) {
        if (envelope != null) {
            envelope.toString();
            CommonData moduleData = envelope.getModuleData(CommonData.class);
            moduleData.getClass();
            List list = moduleData.users;
            list.getClass();
            if (list.isEmpty()) {
                return;
            }
            aqd0 aqd0VarM13841j = INSTANCE.m13841j(str);
            IntlRecordNightClub intlRecordNightClub = (IntlRecordNightClub) aqd0VarM13841j.get();
            intlRecordNightClub.showRoundNum++;
            aqd0VarM13841j.put(intlRecordNightClub);
            clubSuggestPub.onNext(new Pair(((DbObject) ((User) list.get(0))).id, str));
        }
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m13834c(int i) {
        return Boolean.valueOf(qib0.f0 == i);
    }

    /* JADX INFO: renamed from: d */
    public static void m13835d(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.e(cwf0Var);
    }

    /* JADX INFO: renamed from: e */
    public static Unit m13836e(dd80 dd80Var) {
        dd80Var.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static void m13837f(Throwable th) {
        Objects.toString(th);
    }

    /* JADX INFO: renamed from: g */
    public static void m13838g(IntlNightClubEnvelope intlNightClubEnvelope) {
        if (intlNightClubEnvelope != null) {
            clubConfigs = intlNightClubEnvelope.data.clubs;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m13839h() {
        return INSTANCE.m13846o();
    }

    /* JADX INFO: renamed from: i */
    public final void m13840i() {
        savedNightClub = null;
    }

    /* JADX INFO: renamed from: j */
    public final aqd0 m13841j(String id) {
        if (savedNightClub == null) {
            savedNightClub = new aqd0("intl_night_club_" + CoreModule.H().userId() + "_" + id);
        }
        aqd0 aqd0Var = savedNightClub;
        aqd0Var.getClass();
        return aqd0Var;
    }

    /* JADX INFO: renamed from: k */
    public final void m13842k(Act act, final String id) {
        act.duringCreated(CoreModule.c.p2.g3(id)).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.ej40
            public final void call(Object obj) {
                gj40.m13833b(id, (Envelope) obj);
            }
        }, new e30() { // from class: l.fj40
            public final void call(Object obj) {
                gj40.m13837f((Throwable) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final b<Pair<String, String>> m13843l() {
        return clubSuggestPub;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m13844m() {
        return ((Boolean) couldShow.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: n */
    public final void m13845n(@NotNull Act act) {
        act.getClass();
        act.duringCreated(CoreModule.c.p2.k3()).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.zi40
            public final void call(Object obj) {
                gj40.m13838g((IntlNightClubEnvelope) obj);
            }
        }, new e30() { // from class: l.aj40
            public final void call(Object obj) {
                gj40.m13832a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public final boolean m13846o() {
        try {
            String strF = RemoteConfig.x().F(IntlCountryCodeController.k() ? "nightclub_config" : "intl_nightclub_config");
            strF.getClass();
            JSONObject jSONObject = new JSONObject(strF);
            if (jSONObject.getBoolean("enable")) {
                return vwb.m(JSON.parseArray(jSONObject.getString("mcc"), Integer.TYPE), new w9j() { // from class: l.dj40
                    public final Object call(Object obj) {
                        return gj40.m13834c(((Integer) obj).intValue());
                    }
                });
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m13847p(@NotNull String clubId) {
        clubId.getClass();
        aqd0 aqd0VarM13841j = m13841j(clubId);
        IntlRecordNightClub intlRecordNightClub = (IntlRecordNightClub) aqd0VarM13841j.get();
        intlRecordNightClub.notInterest = true;
        aqd0VarM13841j.put(intlRecordNightClub);
    }

    /* JADX INFO: renamed from: q */
    public final void m13848q(@NotNull Act act) {
        act.getClass();
        if (vwb.J(clubConfigs)) {
            return;
        }
        long jO = mqi0.o();
        List<? extends IntlNightClubConfig> list = clubConfigs;
        list.getClass();
        for (IntlNightClubConfig intlNightClubConfig : list) {
            if (intlNightClubConfig.enable && jO >= intlNightClubConfig.startTimeStamp && jO <= intlNightClubConfig.endTimeStamp && rza.z0(new DoublePair(intlNightClubConfig.latitude, intlNightClubConfig.longitude)) <= intlNightClubConfig.radiusMeter) {
                String str = intlNightClubConfig.id;
                str.getClass();
                aqd0 aqd0VarM13841j = m13841j(str);
                IntlRecordNightClub intlRecordNightClub = (IntlRecordNightClub) aqd0VarM13841j.get();
                if (!intlRecordNightClub.notInterest) {
                    if (!mqi0.D(intlRecordNightClub.startSwipeTime)) {
                        intlRecordNightClub.swipeCount = 0;
                        intlRecordNightClub.showRoundNum = 0;
                        intlRecordNightClub.startSwipeTime = jO;
                    } else if (intlRecordNightClub.showRoundNum >= intlNightClubConfig.roundNum) {
                    }
                    intlRecordNightClub.swipeCount++;
                    aqd0VarM13841j.put(intlRecordNightClub);
                    if (intlRecordNightClub.swipeCount % intlNightClubConfig.swipePopNum == 0) {
                        String str2 = intlNightClubConfig.id;
                        str2.getClass();
                        m13842k(act, str2);
                        return;
                    }
                    return;
                }
                continue;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, com.p1.mobile.putong.core.ui.nightclub.view.IntlNightClubDlgView] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: r */
    public final void m13849r(@NotNull String uid, @NotNull String clubId, @Nullable Act act) {
        ?? r0;
        IntlNightClubDlgView intlNightClubDlgView;
        uid.getClass();
        clubId.getClass();
        if (act == null || act.isFinishing() || act.isDestroyed()) {
            return;
        }
        final cwf0 cwf0VarC = i0e.c("p_intl_mkt_twclub_popup", Dialog.class.getName());
        Object objInflate = o7r.a(act).inflate(f6c0.m5, (ViewGroup) null);
        if (objInflate instanceof IntlNightClubDlgView) {
            intlNightClubDlgView = (IntlNightClubDlgView) objInflate;
        } else {
            r0 = 0;
        }
        if (r0 == 0) {
            r0 = intlNightClubDlgView;
            return;
        }
        r0 = intlNightClubDlgView;
        final dd80 dd80VarO = new dd80.a(act).R((View) r0).N((Drawable) null).O();
        r0.m542k0(uid, clubId, new Function0() { // from class: l.bj40
            public final Object invoke() {
                return gj40.m13836e(dd80VarO);
            }
        });
        dd80VarO.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.cj40
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                gj40.m13835d(cwf0VarC, dialogInterface);
            }
        });
        i0e.f(cwf0VarC);
        dd80VarO.show();
    }
}
