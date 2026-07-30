package p153l;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IntlNightClubConfig;
import com.p051p1.mobile.putong.core.data.IntlNightClubEnvelope;
import com.p051p1.mobile.putong.core.data.IntlRecordNightClub;
import com.p051p1.mobile.putong.core.p058ui.nightclub.view.IntlNightClubDlgView;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R)\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0%0$8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, m88121d2 = {"Ll/ur40;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "n", "(Lcom/p1/mobile/android/app/Act;)V", "q", "", Oauth2AccessToken.KEY_UID, "clubId", "r", "(Ljava/lang/String;Ljava/lang/String;Lcom/p1/mobile/android/app/Act;)V", "p", "(Ljava/lang/String;)V", RXScreenCaptureService.KEY_INDEX, "", "o", "()Z", "id", "Ll/cyd0;", "j", "(Ljava/lang/String;)Ll/cyd0;", "k", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "a", "Lkotlin/Lazy;", "m", "couldShow", "", "Lcom/p1/mobile/putong/core/data/IntlNightClubConfig;", "b", "Ljava/util/List;", "clubConfigs", "Lrx/subjects/b;", "Landroid/util/Pair;", "c", "Lrx/subjects/b;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lrx/subjects/b;", "clubSuggestPub", Constants.INAPP_DATA_TAG, "Ll/cyd0;", "savedNightClub", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ur40 {

    @NotNull
    public static final ur40 INSTANCE = new ur40();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy couldShow = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.mr40
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(ur40.m197464h());
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static List<? extends IntlNightClubConfig> clubConfigs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final C22508b<Pair<String, String>> clubSuggestPub;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SuppressLint({"StaticFieldLeak"})
    @Nullable
    public static cyd0 savedNightClub;

    static {
        C22508b<Pair<String, String>> c22508bM222767b = C22508b.m222767b();
        c22508bM222767b.getClass();
        clubSuggestPub = c22508bM222767b;
    }

    /* JADX INFO: renamed from: a */
    public static void m197457a(Throwable th) {
        Objects.toString(th);
    }

    /* JADX INFO: renamed from: b */
    public static void m197458b(String str, Envelope envelope) {
        if (envelope != null) {
            envelope.toString();
            BaseData moduleData = envelope.getModuleData(CommonData.class);
            moduleData.getClass();
            List<User> list = ((CommonData) moduleData).users;
            list.getClass();
            if (list.isEmpty()) {
                return;
            }
            cyd0 cyd0VarM197466j = INSTANCE.m197466j(str);
            IntlRecordNightClub intlRecordNightClub = cyd0VarM197466j.get();
            intlRecordNightClub.showRoundNum++;
            cyd0VarM197466j.put(intlRecordNightClub);
            clubSuggestPub.m137019l(new Pair<>(list.get(0).f56859id, str));
        }
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m197459c(int i) {
        return Boolean.valueOf(uqb0.f180400f0 == i);
    }

    /* JADX INFO: renamed from: d */
    public static void m197460d(l4g0 l4g0Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: e */
    public static Unit m197461e(jl80 jl80Var) {
        jl80Var.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static void m197462f(Throwable th) {
        Objects.toString(th);
    }

    /* JADX INFO: renamed from: g */
    public static void m197463g(IntlNightClubEnvelope intlNightClubEnvelope) {
        if (intlNightClubEnvelope != null) {
            clubConfigs = intlNightClubEnvelope.data.clubs;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m197464h() {
        return INSTANCE.m197471o();
    }

    /* JADX INFO: renamed from: i */
    public final void m197465i() {
        savedNightClub = null;
    }

    /* JADX INFO: renamed from: j */
    public final cyd0 m197466j(String id) {
        if (savedNightClub == null) {
            savedNightClub = new cyd0("intl_night_club_" + CoreModule.m30929H().userId() + "_" + id);
        }
        cyd0 cyd0Var = savedNightClub;
        cyd0Var.getClass();
        return cyd0Var;
    }

    /* JADX INFO: renamed from: k */
    public final void m197467k(Act act, final String id) {
        act.duringCreated(CoreModule.f18264c.f20416p2.m185169g3(id)).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.sr40
            @Override // p153l.y20
            public final void call(Object obj) {
                ur40.m197458b(id, (Envelope) obj);
            }
        }, new y20() { // from class: l.tr40
            @Override // p153l.y20
            public final void call(Object obj) {
                ur40.m197462f((Throwable) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final C22508b<Pair<String, String>> m197468l() {
        return clubSuggestPub;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m197469m() {
        return ((Boolean) couldShow.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: n */
    public final void m197470n(@NotNull Act act) {
        act.getClass();
        act.duringCreated(CoreModule.f18264c.f20416p2.m185170k3()).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.nr40
            @Override // p153l.y20
            public final void call(Object obj) {
                ur40.m197463g((IntlNightClubEnvelope) obj);
            }
        }, new y20() { // from class: l.or40
            @Override // p153l.y20
            public final void call(Object obj) {
                ur40.m197457a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public final boolean m197471o() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F(IntlCountryCodeController.m29114k() ? "nightclub_config" : "intl_nightclub_config");
            strM80485F.getClass();
            JSONObject jSONObject = new JSONObject(strM80485F);
            if (jSONObject.getBoolean("enable")) {
                return jyb.m147520m(JSON.parseArray(jSONObject.getString("mcc"), Integer.TYPE), new qcj() { // from class: l.rr40
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ur40.m197459c(((Integer) obj).intValue());
                    }
                });
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m197472p(@NotNull String clubId) {
        clubId.getClass();
        cyd0 cyd0VarM197466j = m197466j(clubId);
        IntlRecordNightClub intlRecordNightClub = cyd0VarM197466j.get();
        intlRecordNightClub.notInterest = true;
        cyd0VarM197466j.put(intlRecordNightClub);
    }

    /* JADX INFO: renamed from: q */
    public final void m197473q(@NotNull Act act) {
        act.getClass();
        if (jyb.m147479J(clubConfigs)) {
            return;
        }
        long jM174454o = pzi0.m174454o();
        List<? extends IntlNightClubConfig> list = clubConfigs;
        list.getClass();
        for (IntlNightClubConfig intlNightClubConfig : list) {
            if (intlNightClubConfig.enable && jM174454o >= intlNightClubConfig.startTimeStamp && jM174454o <= intlNightClubConfig.endTimeStamp && e1b.m118967z0(new DoublePair(intlNightClubConfig.latitude, intlNightClubConfig.longitude)) <= intlNightClubConfig.radiusMeter) {
                String str = intlNightClubConfig.f21169id;
                str.getClass();
                cyd0 cyd0VarM197466j = m197466j(str);
                IntlRecordNightClub intlRecordNightClub = cyd0VarM197466j.get();
                if (!intlRecordNightClub.notInterest) {
                    if (!pzi0.m174439D(intlRecordNightClub.startSwipeTime)) {
                        intlRecordNightClub.swipeCount = 0;
                        intlRecordNightClub.showRoundNum = 0;
                        intlRecordNightClub.startSwipeTime = jM174454o;
                    } else if (intlRecordNightClub.showRoundNum >= intlNightClubConfig.roundNum) {
                    }
                    intlRecordNightClub.swipeCount++;
                    cyd0VarM197466j.put(intlRecordNightClub);
                    if (intlRecordNightClub.swipeCount % intlNightClubConfig.swipePopNum == 0) {
                        String str2 = intlNightClubConfig.f21169id;
                        str2.getClass();
                        m197467k(act, str2);
                        return;
                    }
                    return;
                }
                continue;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m197474r(@NotNull String uid, @NotNull String clubId, @Nullable Act act) {
        uid.getClass();
        clubId.getClass();
        if (act == null || act.isFinishing() || act.isDestroyed()) {
            return;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_mkt_twclub_popup", Dialog.class.getName());
        View viewInflate = p9r.m171370a(act).inflate(kec0.f125962n5, (ViewGroup) null);
        IntlNightClubDlgView intlNightClubDlgView = viewInflate instanceof IntlNightClubDlgView ? (IntlNightClubDlgView) viewInflate : null;
        if (intlNightClubDlgView == null) {
            return;
        }
        final jl80 jl80VarM146020O = new jl80.C17971a(act).m146023R(intlNightClubDlgView).m146019N(null).m146020O();
        intlNightClubDlgView.m51296k0(uid, clubId, new Function0() { // from class: l.pr40
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ur40.m197461e(jl80VarM146020O);
            }
        });
        jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.qr40
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ur40.m197460d(l4g0VarM204399c, dialogInterface);
            }
        });
        w1e.m204402f(l4g0VarM204399c);
        jl80VarM146020O.show();
    }
}
