package p149l;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IntlNightClubConfig;
import com.p046p1.mobile.putong.core.data.IntlNightClubEnvelope;
import com.p046p1.mobile.putong.core.data.IntlRecordNightClub;
import com.p046p1.mobile.putong.core.p053ui.nightclub.view.IntlNightClubDlgView;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.data.BaseData;
import com.tencent.open.SocialConstants;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R)\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0%0$8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, m87232d2 = {"Ll/gj40;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "n", "(Lcom/p1/mobile/android/app/Act;)V", "q", "", Oauth2AccessToken.KEY_UID, "clubId", "r", "(Ljava/lang/String;Ljava/lang/String;Lcom/p1/mobile/android/app/Act;)V", "p", "(Ljava/lang/String;)V", RXScreenCaptureService.KEY_INDEX, "", "o", "()Z", "id", "Ll/aqd0;", "j", "(Ljava/lang/String;)Ll/aqd0;", "k", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "a", "Lkotlin/Lazy;", "m", "couldShow", "", "Lcom/p1/mobile/putong/core/data/IntlNightClubConfig;", "b", "Ljava/util/List;", "clubConfigs", "Lrx/subjects/b;", "Landroid/util/Pair;", "c", "Lrx/subjects/b;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lrx/subjects/b;", "clubSuggestPub", Constants.INAPP_DATA_TAG, "Ll/aqd0;", "savedNightClub", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class gj40 {

    @NotNull
    public static final gj40 INSTANCE = new gj40();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy couldShow = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.yi40
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(gj40.m126446h());
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static List<? extends IntlNightClubConfig> clubConfigs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final C22393b<Pair<String, String>> clubSuggestPub;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    public static aqd0 savedNightClub;

    static {
        C22393b<Pair<String, String>> c22393bM221521b = C22393b.m221521b();
        c22393bM221521b.getClass();
        clubSuggestPub = c22393bM221521b;
    }

    /* JADX INFO: renamed from: a */
    public static void m126439a(Throwable th) {
        Objects.toString(th);
    }

    /* JADX INFO: renamed from: b */
    public static void m126440b(String str, Envelope envelope) {
        if (envelope != null) {
            envelope.toString();
            BaseData moduleData = envelope.getModuleData(CommonData.class);
            moduleData.getClass();
            List<User> list = ((CommonData) moduleData).users;
            list.getClass();
            if (list.isEmpty()) {
                return;
            }
            aqd0 aqd0VarM126448j = INSTANCE.m126448j(str);
            IntlRecordNightClub intlRecordNightClub = aqd0VarM126448j.get();
            intlRecordNightClub.showRoundNum++;
            aqd0VarM126448j.put(intlRecordNightClub);
            clubSuggestPub.m132487l(new Pair<>(list.get(0).f56011id, str));
        }
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m126441c(int i) {
        return Boolean.valueOf(qib0.f154717f0 == i);
    }

    /* JADX INFO: renamed from: d */
    public static void m126442d(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: e */
    public static Unit m126443e(dd80 dd80Var) {
        dd80Var.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static void m126444f(Throwable th) {
        Objects.toString(th);
    }

    /* JADX INFO: renamed from: g */
    public static void m126445g(IntlNightClubEnvelope intlNightClubEnvelope) {
        if (intlNightClubEnvelope != null) {
            clubConfigs = intlNightClubEnvelope.data.clubs;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m126446h() {
        return INSTANCE.m126453o();
    }

    /* JADX INFO: renamed from: i */
    public final void m126447i() {
        savedNightClub = null;
    }

    /* JADX INFO: renamed from: j */
    public final aqd0 m126448j(String id) {
        if (savedNightClub == null) {
            savedNightClub = new aqd0("intl_night_club_" + CoreModule.m29931H().userId() + "_" + id);
        }
        aqd0 aqd0Var = savedNightClub;
        aqd0Var.getClass();
        return aqd0Var;
    }

    /* JADX INFO: renamed from: k */
    public final void m126449k(Act act, final String id) {
        act.duringCreated(CoreModule.f17545c.f19674p2.m140201g3(id)).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.ej40
            @Override // p149l.e30
            public final void call(Object obj) {
                gj40.m126440b(id, (Envelope) obj);
            }
        }, new e30() { // from class: l.fj40
            @Override // p149l.e30
            public final void call(Object obj) {
                gj40.m126444f((Throwable) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final C22393b<Pair<String, String>> m126450l() {
        return clubSuggestPub;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m126451m() {
        return ((Boolean) couldShow.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: n */
    public final void m126452n(@NotNull Act act) {
        act.getClass();
        act.duringCreated(CoreModule.f17545c.f19674p2.m140202k3()).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.zi40
            @Override // p149l.e30
            public final void call(Object obj) {
                gj40.m126445g((IntlNightClubEnvelope) obj);
            }
        }, new e30() { // from class: l.aj40
            @Override // p149l.e30
            public final void call(Object obj) {
                gj40.m126439a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public final boolean m126453o() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F(IntlCountryCodeController.m28115k() ? "nightclub_config" : "intl_nightclub_config");
            strM79302F.getClass();
            JSONObject jSONObject = new JSONObject(strM79302F);
            if (jSONObject.getBoolean("enable")) {
                return vwb.m200337m(JSON.parseArray(jSONObject.getString("mcc"), Integer.TYPE), new w9j() { // from class: l.dj40
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return gj40.m126441c(((Integer) obj).intValue());
                    }
                });
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m126454p(@NotNull String clubId) {
        clubId.getClass();
        aqd0 aqd0VarM126448j = m126448j(clubId);
        IntlRecordNightClub intlRecordNightClub = aqd0VarM126448j.get();
        intlRecordNightClub.notInterest = true;
        aqd0VarM126448j.put(intlRecordNightClub);
    }

    /* JADX INFO: renamed from: q */
    public final void m126455q(@NotNull Act act) {
        act.getClass();
        if (vwb.m200296J(clubConfigs)) {
            return;
        }
        long jM155944o = mqi0.m155944o();
        List<? extends IntlNightClubConfig> list = clubConfigs;
        list.getClass();
        for (IntlNightClubConfig intlNightClubConfig : list) {
            if (intlNightClubConfig.enable && jM155944o >= intlNightClubConfig.startTimeStamp && jM155944o <= intlNightClubConfig.endTimeStamp && rza.m181745z0(new DoublePair(intlNightClubConfig.latitude, intlNightClubConfig.longitude)) <= intlNightClubConfig.radiusMeter) {
                String str = intlNightClubConfig.f20427id;
                str.getClass();
                aqd0 aqd0VarM126448j = m126448j(str);
                IntlRecordNightClub intlRecordNightClub = aqd0VarM126448j.get();
                if (!intlRecordNightClub.notInterest) {
                    if (!mqi0.m155929D(intlRecordNightClub.startSwipeTime)) {
                        intlRecordNightClub.swipeCount = 0;
                        intlRecordNightClub.showRoundNum = 0;
                        intlRecordNightClub.startSwipeTime = jM155944o;
                    } else if (intlRecordNightClub.showRoundNum >= intlNightClubConfig.roundNum) {
                    }
                    intlRecordNightClub.swipeCount++;
                    aqd0VarM126448j.put(intlRecordNightClub);
                    if (intlRecordNightClub.swipeCount % intlNightClubConfig.swipePopNum == 0) {
                        String str2 = intlNightClubConfig.f20427id;
                        str2.getClass();
                        m126449k(act, str2);
                        return;
                    }
                    return;
                }
                continue;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m126456r(@NotNull String uid, @NotNull String clubId, @Nullable Act act) {
        uid.getClass();
        clubId.getClass();
        if (act == null || act.isFinishing() || act.isDestroyed()) {
            return;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_mkt_twclub_popup", Dialog.class.getName());
        View viewInflate = o7r.m163037a(act).inflate(f6c0.f95891m5, (ViewGroup) null);
        IntlNightClubDlgView intlNightClubDlgView = viewInflate instanceof IntlNightClubDlgView ? (IntlNightClubDlgView) viewInflate : null;
        if (intlNightClubDlgView == null) {
            return;
        }
        final dd80 dd80VarM110960O = new dd80.C16336a(act).m110963R(intlNightClubDlgView).m110959N(null).m110960O();
        intlNightClubDlgView.m50113k0(uid, clubId, new Function0() { // from class: l.bj40
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return gj40.m126443e(dd80VarM110960O);
            }
        });
        dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.cj40
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                gj40.m126442d(cwf0VarM133794c, dialogInterface);
            }
        });
        i0e.m133797f(cwf0VarM133794c);
        dd80VarM110960O.show();
    }
}
