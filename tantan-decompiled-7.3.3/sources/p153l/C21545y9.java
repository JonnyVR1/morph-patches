package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.p058ui.dlg.MemberAnimView;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VCheckBox;

/* JADX INFO: renamed from: l.y9 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/y9;", "", "<init>", "()V", "Companion", "a", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C21545y9 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public static boolean f198057a;

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: c */
    public static final void m214784c(@NotNull Act act, boolean z, @NotNull String str) {
        INSTANCE.m214805t(act, z, str);
    }

    /* JADX INFO: renamed from: l.y9$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010\u001eJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, m88121d2 = {"Ll/y9$a;", "", "<init>", "()V", "", "k", "()Z", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "again", "", "from", "Ll/x20;", "mlnCallback", "", "u", "(Lcom/p1/mobile/android/app/Act;ZLjava/lang/String;Ll/x20;)V", "isFreeUse", "isAfterFreeUse", "freeUseRecordId", "m", "(Lcom/p1/mobile/android/app/Act;ZZLjava/lang/String;Ll/x20;)V", "q", "(Lcom/p1/mobile/android/app/Act;)V", "onConfirm", "p", "(Lcom/p1/mobile/android/app/Act;Ll/x20;)V", "Landroid/content/Context;", "context", "r", "(Landroid/content/Context;)V", BLiveStormDanmakuGiftResourceType.f45294s, "", "j", "()I", "isGuideShow", "Z", BLiveStormDanmakuGiftResourceType.f45292l, "o", "(Z)V", "PLATINUM_ACCELERATE_PAIRING_FREE_NUM_KEY", "Ljava/lang/String;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m214785a(Act act, x20 x20Var) {
            m214794n(C21545y9.INSTANCE, act, false, false, null, x20Var, 14, null);
        }

        /* JADX INFO: renamed from: b */
        public static void m214786b(String str, Act act) {
            if (Intrinsics.m88377d("p_chat,assistant_accelerate", str)) {
                return;
            }
            C21545y9.INSTANCE.m214803r(act);
        }

        /* JADX INFO: renamed from: c */
        public static void m214787c(boolean z, Act act, x20 x20Var, uxj0 uxj0Var) {
            uxj0Var.getClass();
            if (z) {
                CoreModule.f18264c.f20405m0.m32022L5();
            } else if (CoreModule.m30930K().isNewMainActContext(act)) {
                CoreModule.f18264c.f20377c2.m118407s3().m137019l(uxj0.f181467a);
            }
            if (x20Var != null) {
                x20Var.call();
            }
        }

        /* JADX INFO: renamed from: d */
        public static void m214788d(ugy ugyVar, int i) {
            ugyVar.m195966e();
            i4g0.m138523u("p_boost_confirm_use", "e_boost_confirm_use", jyb.m147494Y("boost_valid_times", Integer.valueOf(i)), jyb.m147494Y("button_type", "close"));
        }

        /* JADX INFO: renamed from: e */
        public static void m214789e(x20 x20Var, ugy ugyVar, int i) {
            MemberAnimView memberAnimViewM195967g;
            VCheckBox vCheckBox;
            dw6 dw6Var;
            x20Var.call();
            if (ugyVar != null && (memberAnimViewM195967g = ugyVar.m195967g()) != null && (vCheckBox = memberAnimViewM195967g.f29819y) != null && vCheckBox.isChecked() && (dw6Var = CoreModule.f18264c.f20377c2) != null) {
                dw6Var.m118399I3(true);
            }
            i4g0.m138523u("p_boost_confirm_use", "e_boost_confirm_use", jyb.m147494Y("boost_valid_times", Integer.valueOf(i)), jyb.m147494Y("button_type", "open"));
            ugyVar.m195966e();
        }

        /* JADX INFO: renamed from: f */
        public static void m214790f(PurchaseType purchaseType) {
        }

        /* JADX INFO: renamed from: g */
        public static void m214791g() {
        }

        /* JADX INFO: renamed from: h */
        public static void m214792h(String str, Act act) {
            if (Intrinsics.m88377d("p_chat,assistant_accelerate", str)) {
                return;
            }
            C21545y9.INSTANCE.m214803r(act);
        }

        /* JADX INFO: renamed from: i */
        public static void m214793i(Throwable th) {
            CoreModule.f18264c.f20377c2.m118410y3();
            o1j0.m165640n(R$string.f21320F);
        }

        /* JADX INFO: renamed from: n */
        public static /* synthetic */ void m214794n(Companion companion, Act act, boolean z, boolean z2, String str, x20 x20Var, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            if ((i & 8) != 0) {
                str = "";
            }
            if ((i & 16) != 0) {
                x20Var = null;
            }
            companion.m214799m(act, z, z2, str, x20Var);
        }

        /* JADX INFO: renamed from: v */
        public static /* synthetic */ void m214795v(Companion companion, Act act, boolean z, String str, x20 x20Var, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                str = "";
            }
            if ((i & 8) != 0) {
                x20Var = null;
            }
            companion.m214806u(act, z, str, x20Var);
        }

        /* JADX INFO: renamed from: j */
        public final int m214796j() {
            try {
                return RemoteConfig.m80481x().m80519z("platinum_accelerate_pairing_free_num", 1);
            } catch (Exception unused) {
                return 1;
            }
        }

        /* JADX INFO: renamed from: k */
        public final boolean m214797k() {
            dw6 dw6Var;
            C4883c c4883c = CoreModule.f18264c;
            return (c4883c == null || (dw6Var = c4883c.f20377c2) == null || !dw6Var.m118408t3()) ? false : true;
        }

        /* JADX INFO: renamed from: l */
        public final boolean m214798l() {
            return C21545y9.f198057a;
        }

        /* JADX INFO: renamed from: m */
        public final void m214799m(@NotNull final Act act, final boolean isFreeUse, boolean isAfterFreeUse, @NotNull String freeUseRecordId, @Nullable final x20 mlnCallback) {
            act.getClass();
            freeUseRecordId.getClass();
            if (CoreModule.f18264c.f20377c2.m118408t3()) {
                return;
            }
            act.duringCreated(CoreModule.f18264c.f20377c2.m118397D3(isFreeUse, isAfterFreeUse, freeUseRecordId)).subscribe(psd0.m173597H(new y20() { // from class: l.w9
                @Override // p153l.y20
                public final void call(Object obj) {
                    C21545y9.Companion.m214787c(isFreeUse, act, mlnCallback, (uxj0) obj);
                }
            }, new y20() { // from class: l.x9
                @Override // p153l.y20
                public final void call(Object obj) {
                    C21545y9.Companion.m214793i((Throwable) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: o */
        public final void m214800o(boolean z) {
            C21545y9.f198057a = z;
        }

        /* JADX INFO: renamed from: p */
        public final void m214801p(@NotNull Act act, @NotNull final x20 onConfirm) {
            act.getClass();
            onConfirm.getClass();
            final int iM146402o3 = joa.m146402o3();
            final ugy ugyVarM195998t = new ugy.C20573a(act).m195995D("确认使用加速配对？").m195994C("现在使用加速配对，30分钟内可无限右滑，优先把你推荐给喜欢的人").m196003y(false).m195992A(false).m195998t();
            MemberAnimView memberAnimViewM195967g = ugyVarM195998t.m195967g();
            memberAnimViewM195967g.m46355Z(new Runnable() { // from class: l.u9
                @Override // java.lang.Runnable
                public final void run() {
                    C21545y9.Companion.m214788d(ugyVarM195998t, iM146402o3);
                }
            });
            memberAnimViewM195967g.m46342K("还有" + iM146402o3 + "次机会", new Runnable() { // from class: l.v9
                @Override // java.lang.Runnable
                public final void run() {
                    C21545y9.Companion.m214789e(onConfirm, ugyVarM195998t, iM146402o3);
                }
            });
            memberAnimViewM195967g.m46354Y();
            memberAnimViewM195967g.m46362h0(qa00.m175859d(4.0f));
            memberAnimViewM195967g.m46361g0(0.0f, 1.0f);
            memberAnimViewM195967g.m46360f0(act.getResources().getColor(f9c0.f97856a));
            memberAnimViewM195967g.m46358c0(qa00.m175859d(16.0f));
            memberAnimViewM195967g.m46347P().m46368z("https://auto.tancdn.com/v1/raw/4b3ab5fd-5eb5-46fc-b152-bc4c749c6e0a14.so", -1).m46357b0().m46346O("https://fe-static.tancdn.com/v1/images/eyJpZCI6IlNTSlJVSkNUSEVDV0RVUlFHN1FQNU9YVlFNREJGRDE0IiwidyI6OTM2LCJoIjoxMjI3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NDk5OTM1MzIyNTE3NTE4Nzc4OX0.webp");
            i4g0.m138492A("p_boost_confirm_use", "e_boost_confirm_use", jyb.m147494Y("boost_valid_times", Integer.valueOf(iM146402o3)));
            ugyVarM195998t.m195974n();
        }

        /* JADX INFO: renamed from: q */
        public final void m214802q(@NotNull Act act) {
            act.getClass();
            if (CoreModule.f18264c.f20377c2.m118408t3()) {
                CoreModule.f18264c.f20377c2.m118396C3(false);
                ric0.m181582k(ric0.INSTANCE.m181593a(), act, null, 2, null);
            }
        }

        /* JADX INFO: renamed from: r */
        public final void m214803r(@NotNull Context context) {
            context.getClass();
            ric0.INSTANCE.m181594b();
        }

        /* JADX INFO: renamed from: s */
        public final void m214804s(@NotNull Context context) {
            context.getClass();
            ric0.INSTANCE.m181594b();
        }

        @JvmStatic
        @JvmOverloads
        /* JADX INFO: renamed from: t */
        public final void m214805t(@NotNull Act act, boolean z, @NotNull String str) {
            act.getClass();
            str.getClass();
            m214795v(this, act, z, str, null, 8, null);
        }

        @JvmStatic
        @JvmOverloads
        /* JADX INFO: renamed from: u */
        public final void m214806u(@NotNull final Act act, boolean again, @NotNull final String from, @Nullable final x20 mlnCallback) {
            act.getClass();
            from.getClass();
            if (!joa.m146367S3()) {
                if (CoreModule.f18264c.f20377c2.m118406r3()) {
                    m214794n(this, act, false, false, null, mlnCallback, 14, null);
                    return;
                } else {
                    m214801p(act, new x20() { // from class: l.t9
                        @Override // p153l.x20
                        public final void call() {
                            C21545y9.Companion.m214785a(act, mlnCallback);
                        }
                    });
                    return;
                }
            }
            if (!CoreModule.m30933P().m143410g().mo36081v9() || joa.m146359I3()) {
                CoreModule.m30933P().m143405a().mo34375Mr(act, TextUtils.isEmpty(from) ? C16929fa.m124693d(act, again) : from, new x20() { // from class: l.q9
                    @Override // p153l.x20
                    public final void call() {
                        C21545y9.Companion.m214791g();
                    }
                }, new x20() { // from class: l.r9
                    @Override // p153l.x20
                    public final void call() {
                        C21545y9.Companion.m214786b(from, act);
                    }
                }, new y20() { // from class: l.s9
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        C21545y9.Companion.m214790f((PurchaseType) obj);
                    }
                });
            } else {
                CoreModule.m30933P().m143410g().mo36009Ds(act, TextUtils.isEmpty(from) ? C16929fa.m124693d(act, again) : from, Privilege.accelerate_pairing, null, new x20() { // from class: l.p9
                    @Override // p153l.x20
                    public final void call() {
                        C21545y9.Companion.m214792h(from, act);
                    }
                });
            }
        }

        public Companion() {
        }
    }
}
