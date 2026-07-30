package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.p053ui.dlg.MemberAnimView;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VCheckBox;

/* JADX INFO: renamed from: l.da */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Ll/da;", "", "<init>", "()V", "Companion", "a", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C16319da {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public static boolean f85165a;

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: c */
    public static final void m110497c(@NotNull Act act, boolean z, @NotNull String str) {
        INSTANCE.m110518t(act, z, str);
    }

    /* JADX INFO: renamed from: l.da$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010\u001eJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, m87232d2 = {"Ll/da$a;", "", "<init>", "()V", "", "k", "()Z", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "again", "", "from", "Ll/d30;", "mlnCallback", "", "u", "(Lcom/p1/mobile/android/app/Act;ZLjava/lang/String;Ll/d30;)V", "isFreeUse", "isAfterFreeUse", "freeUseRecordId", "m", "(Lcom/p1/mobile/android/app/Act;ZZLjava/lang/String;Ll/d30;)V", "q", "(Lcom/p1/mobile/android/app/Act;)V", "onConfirm", "p", "(Lcom/p1/mobile/android/app/Act;Ll/d30;)V", "Landroid/content/Context;", "context", "r", "(Landroid/content/Context;)V", BLiveStormDanmakuGiftResourceType.f44446s, "", "j", "()I", "isGuideShow", "Z", BLiveStormDanmakuGiftResourceType.f44444l, "o", "(Z)V", "PLATINUM_ACCELERATE_PAIRING_FREE_NUM_KEY", "Ljava/lang/String;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m110498a(Act act, d30 d30Var) {
            m110507n(C16319da.INSTANCE, act, false, false, null, d30Var, 14, null);
        }

        /* JADX INFO: renamed from: b */
        public static void m110499b(String str, Act act) {
            if (Intrinsics.m87488d("p_chat,assistant_accelerate", str)) {
                return;
            }
            C16319da.INSTANCE.m110516r(act);
        }

        /* JADX INFO: renamed from: c */
        public static void m110500c(boolean z, Act act, d30 d30Var, roj0 roj0Var) {
            roj0Var.getClass();
            if (z) {
                CoreModule.f17545c.f19663m0.m31019L5();
            } else if (CoreModule.m29932K().isNewMainActContext(act)) {
                CoreModule.f17545c.f19635c2.m99147s3().m132487l(roj0.f160388a);
            }
            if (d30Var != null) {
                d30Var.call();
            }
        }

        /* JADX INFO: renamed from: d */
        public static void m110501d(x7y x7yVar, int i) {
            x7yVar.m207316e();
            zvf0.m220399u("p_boost_confirm_use", "e_boost_confirm_use", vwb.m200311Y("boost_valid_times", Integer.valueOf(i)), vwb.m200311Y("button_type", "close"));
        }

        /* JADX INFO: renamed from: e */
        public static void m110502e(d30 d30Var, x7y x7yVar, int i) {
            MemberAnimView memberAnimViewM207317g;
            VCheckBox vCheckBox;
            av6 av6Var;
            d30Var.call();
            if (x7yVar != null && (memberAnimViewM207317g = x7yVar.m207317g()) != null && (vCheckBox = memberAnimViewM207317g.f28971y) != null && vCheckBox.isChecked() && (av6Var = CoreModule.f17545c.f19635c2) != null) {
                av6Var.m99139I3(true);
            }
            zvf0.m220399u("p_boost_confirm_use", "e_boost_confirm_use", vwb.m200311Y("boost_valid_times", Integer.valueOf(i)), vwb.m200311Y("button_type", "open"));
            x7yVar.m207316e();
        }

        /* JADX INFO: renamed from: f */
        public static void m110503f(PurchaseType purchaseType) {
        }

        /* JADX INFO: renamed from: g */
        public static void m110504g() {
        }

        /* JADX INFO: renamed from: h */
        public static void m110505h(String str, Act act) {
            if (Intrinsics.m87488d("p_chat,assistant_accelerate", str)) {
                return;
            }
            C16319da.INSTANCE.m110516r(act);
        }

        /* JADX INFO: renamed from: i */
        public static void m110506i(Throwable th) {
            CoreModule.f17545c.f19635c2.m99150y3();
            lsi0.m151584n(R$string.f20578F);
        }

        /* JADX INFO: renamed from: n */
        public static /* synthetic */ void m110507n(Companion companion, Act act, boolean z, boolean z2, String str, d30 d30Var, int i, Object obj) {
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
                d30Var = null;
            }
            companion.m110512m(act, z, z2, str, d30Var);
        }

        /* JADX INFO: renamed from: v */
        public static /* synthetic */ void m110508v(Companion companion, Act act, boolean z, String str, d30 d30Var, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                str = "";
            }
            if ((i & 8) != 0) {
                d30Var = null;
            }
            companion.m110519u(act, z, str, d30Var);
        }

        /* JADX INFO: renamed from: j */
        public final int m110509j() {
            try {
                return RemoteConfig.m79298x().m79336z("platinum_accelerate_pairing_free_num", 1);
            } catch (Exception unused) {
                return 1;
            }
        }

        /* JADX INFO: renamed from: k */
        public final boolean m110510k() {
            av6 av6Var;
            C4732c c4732c = CoreModule.f17545c;
            return (c4732c == null || (av6Var = c4732c.f19635c2) == null || !av6Var.m99148t3()) ? false : true;
        }

        /* JADX INFO: renamed from: l */
        public final boolean m110511l() {
            return C16319da.f85165a;
        }

        /* JADX INFO: renamed from: m */
        public final void m110512m(@NotNull final Act act, final boolean isFreeUse, boolean isAfterFreeUse, @NotNull String freeUseRecordId, @Nullable final d30 mlnCallback) {
            act.getClass();
            freeUseRecordId.getClass();
            if (CoreModule.f17545c.f19635c2.m99148t3()) {
                return;
            }
            act.duringCreated(CoreModule.f17545c.f19635c2.m99137D3(isFreeUse, isAfterFreeUse, freeUseRecordId)).subscribe(mkd0.m154956H(new e30() { // from class: l.ba
                @Override // p149l.e30
                public final void call(Object obj) {
                    C16319da.Companion.m110500c(isFreeUse, act, mlnCallback, (roj0) obj);
                }
            }, new e30() { // from class: l.ca
                @Override // p149l.e30
                public final void call(Object obj) {
                    C16319da.Companion.m110506i((Throwable) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: o */
        public final void m110513o(boolean z) {
            C16319da.f85165a = z;
        }

        /* JADX INFO: renamed from: p */
        public final void m110514p(@NotNull Act act, @NotNull final d30 onConfirm) {
            act.getClass();
            onConfirm.getClass();
            final int iM210088o3 = xma.m210088o3();
            final x7y x7yVarM207348t = new x7y.C21039a(act).m207345D("确认使用加速配对？").m207344C("现在使用加速配对，30分钟内可无限右滑，优先把你推荐给喜欢的人").m207353y(false).m207342A(false).m207348t();
            MemberAnimView memberAnimViewM207317g = x7yVarM207348t.m207317g();
            memberAnimViewM207317g.m45172Z(new Runnable() { // from class: l.z9
                @Override // java.lang.Runnable
                public final void run() {
                    C16319da.Companion.m110501d(x7yVarM207348t, iM210088o3);
                }
            });
            memberAnimViewM207317g.m45159K("还有" + iM210088o3 + "次机会", new Runnable() { // from class: l.aa
                @Override // java.lang.Runnable
                public final void run() {
                    C16319da.Companion.m110502e(onConfirm, x7yVarM207348t, iM210088o3);
                }
            });
            memberAnimViewM207317g.m45171Y();
            memberAnimViewM207317g.m45179h0(t100.m186890d(4.0f));
            memberAnimViewM207317g.m45178g0(0.0f, 1.0f);
            memberAnimViewM207317g.m45177f0(act.getResources().getColor(z0c0.f200973a));
            memberAnimViewM207317g.m45175c0(t100.m186890d(16.0f));
            memberAnimViewM207317g.m45164P().m45185z("https://auto.tancdn.com/v1/raw/4b3ab5fd-5eb5-46fc-b152-bc4c749c6e0a14.so", -1).m45174b0().m45163O("https://fe-static.tancdn.com/v1/images/eyJpZCI6IlNTSlJVSkNUSEVDV0RVUlFHN1FQNU9YVlFNREJGRDE0IiwidyI6OTM2LCJoIjoxMjI3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NDk5OTM1MzIyNTE3NTE4Nzc4OX0.webp");
            zvf0.m220368A("p_boost_confirm_use", "e_boost_confirm_use", vwb.m200311Y("boost_valid_times", Integer.valueOf(iM210088o3)));
            x7yVarM207348t.m207324n();
        }

        /* JADX INFO: renamed from: q */
        public final void m110515q(@NotNull Act act) {
            act.getClass();
            if (CoreModule.f17545c.f19635c2.m99148t3()) {
                CoreModule.f17545c.f19635c2.m99136C3(false);
                lac0.m149135k(lac0.INSTANCE.m149146a(), act, null, 2, null);
            }
        }

        /* JADX INFO: renamed from: r */
        public final void m110516r(@NotNull Context context) {
            context.getClass();
            lac0.INSTANCE.m149147b();
        }

        /* JADX INFO: renamed from: s */
        public final void m110517s(@NotNull Context context) {
            context.getClass();
            lac0.INSTANCE.m149147b();
        }

        @JvmStatic
        @JvmOverloads
        /* JADX INFO: renamed from: t */
        public final void m110518t(@NotNull Act act, boolean z, @NotNull String str) {
            act.getClass();
            str.getClass();
            m110508v(this, act, z, str, null, 8, null);
        }

        @JvmStatic
        @JvmOverloads
        /* JADX INFO: renamed from: u */
        public final void m110519u(@NotNull final Act act, boolean again, @NotNull final String from, @Nullable final d30 mlnCallback) {
            act.getClass();
            from.getClass();
            if (!xma.m210053R3()) {
                if (CoreModule.f17545c.f19635c2.m99146r3()) {
                    m110507n(this, act, false, false, null, mlnCallback, 14, null);
                    return;
                } else {
                    m110514p(act, new d30() { // from class: l.y9
                        @Override // p149l.d30
                        public final void call() {
                            C16319da.Companion.m110498a(act, mlnCallback);
                        }
                    });
                    return;
                }
            }
            if (!CoreModule.m29935P().m94656g().mo35078v9() || xma.m210045H3()) {
                CoreModule.m29935P().m94651a().mo33372Mr(act, TextUtils.isEmpty(from) ? C17963ka.m145130d(act, again) : from, new d30() { // from class: l.v9
                    @Override // p149l.d30
                    public final void call() {
                        C16319da.Companion.m110504g();
                    }
                }, new d30() { // from class: l.w9
                    @Override // p149l.d30
                    public final void call() {
                        C16319da.Companion.m110499b(from, act);
                    }
                }, new e30() { // from class: l.x9
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        C16319da.Companion.m110503f((PurchaseType) obj);
                    }
                });
            } else {
                CoreModule.m29935P().m94656g().mo35006Ds(act, TextUtils.isEmpty(from) ? C17963ka.m145130d(act, again) : from, Privilege.accelerate_pairing, null, new d30() { // from class: l.u9
                    @Override // p149l.d30
                    public final void call() {
                        C16319da.Companion.m110505h(from, act);
                    }
                });
            }
        }

        public Companion() {
        }
    }
}
