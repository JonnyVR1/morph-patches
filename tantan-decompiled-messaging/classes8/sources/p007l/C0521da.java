package p007l;

import android.content.Context;
import android.text.TextUtils;
import com.p003p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.c;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.core.ui.dlg.MemberAnimView;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.av6;
import l.d30;
import l.e30;
import l.j760;
import l.lac0;
import l.roj0;
import l.t100;
import l.vwb;
import l.x7y;
import l.xma;
import l.z0c0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VCheckBox;

/* JADX INFO: renamed from: l.da */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ll/da;", "", "<init>", "()V", "Companion", "a", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0521da {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public static boolean f2515a;

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: c */
    public static final void m8843c(@NotNull Act act, boolean z, @NotNull String str) {
        INSTANCE.m8864t(act, z, str);
    }

    /* JADX INFO: renamed from: l.da$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010\u001eJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Ll/da$a;", "", "<init>", "()V", "", "k", "()Z", "Lcom/p1/mobile/android/app/Act;", "act", "again", "", "from", "Ll/d30;", "mlnCallback", "", "u", "(Lcom/p1/mobile/android/app/Act;ZLjava/lang/String;Ll/d30;)V", "isFreeUse", "isAfterFreeUse", "freeUseRecordId", "m", "(Lcom/p1/mobile/android/app/Act;ZZLjava/lang/String;Ll/d30;)V", "q", "(Lcom/p1/mobile/android/app/Act;)V", "onConfirm", "p", "(Lcom/p1/mobile/android/app/Act;Ll/d30;)V", "Landroid/content/Context;", "context", "r", "(Landroid/content/Context;)V", "s", "", "j", "()I", "isGuideShow", "Z", "l", "o", "(Z)V", "PLATINUM_ACCELERATE_PAIRING_FREE_NUM_KEY", "Ljava/lang/String;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m8844a(Act act, d30 d30Var) {
            m8853n(C0521da.INSTANCE, act, false, false, null, d30Var, 14, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static void m8845b(String str, Act act) {
            if (Intrinsics.d("p_chat,assistant_accelerate", str)) {
                return;
            }
            C0521da.INSTANCE.m8862r(act);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public static void m8846c(boolean z, Act act, d30 d30Var, roj0 roj0Var) {
            roj0Var.getClass();
            if (z) {
                CoreModule.c.m0.L5();
            } else if (CoreModule.K().isNewMainActContext(act)) {
                CoreModule.c.c2.s3().onNext(roj0.a);
            }
            if (d30Var != null) {
                d30Var.call();
            }
        }

        /* JADX INFO: renamed from: d */
        public static void m8847d(x7y x7yVar, int i) {
            x7yVar.e();
            zvf0.u("p_boost_confirm_use", "e_boost_confirm_use", new j760[]{vwb.Y("boost_valid_times", Integer.valueOf(i)), vwb.Y("button_type", "close")});
        }

        /* JADX INFO: renamed from: e */
        public static void m8848e(d30 d30Var, x7y x7yVar, int i) {
            MemberAnimView memberAnimViewG;
            VCheckBox vCheckBox;
            av6 av6Var;
            d30Var.call();
            if (x7yVar != null && (memberAnimViewG = x7yVar.g()) != null && (vCheckBox = memberAnimViewG.y) != null && vCheckBox.isChecked() && (av6Var = CoreModule.c.c2) != null) {
                av6Var.I3(true);
            }
            zvf0.u("p_boost_confirm_use", "e_boost_confirm_use", new j760[]{vwb.Y("boost_valid_times", Integer.valueOf(i)), vwb.Y("button_type", "open")});
            x7yVar.e();
        }

        /* JADX INFO: renamed from: f */
        public static void m8849f(PurchaseType purchaseType) {
        }

        /* JADX INFO: renamed from: g */
        public static void m8850g() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: h */
        public static void m8851h(String str, Act act) {
            if (Intrinsics.d("p_chat,assistant_accelerate", str)) {
                return;
            }
            C0521da.INSTANCE.m8862r(act);
        }

        /* JADX INFO: renamed from: i */
        public static void m8852i(Throwable th) {
            CoreModule.c.c2.y3();
            lsi0.m9840n(R.string.F);
        }

        /* JADX INFO: renamed from: n */
        public static /* synthetic */ void m8853n(Companion companion, Act act, boolean z, boolean z2, String str, d30 d30Var, int i, Object obj) {
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
            companion.m8858m(act, z, z2, str, d30Var);
        }

        /* JADX INFO: renamed from: v */
        public static /* synthetic */ void m8854v(Companion companion, Act act, boolean z, String str, d30 d30Var, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                str = "";
            }
            if ((i & 8) != 0) {
                d30Var = null;
            }
            companion.m8865u(act, z, str, d30Var);
        }

        /* JADX INFO: renamed from: j */
        public final int m8855j() {
            try {
                return RemoteConfig.x().z("platinum_accelerate_pairing_free_num", 1);
            } catch (Exception unused) {
                return 1;
            }
        }

        /* JADX INFO: renamed from: k */
        public final boolean m8856k() {
            av6 av6Var;
            c cVar = CoreModule.c;
            return (cVar == null || (av6Var = cVar.c2) == null || !av6Var.t3()) ? false : true;
        }

        /* JADX INFO: renamed from: l */
        public final boolean m8857l() {
            return C0521da.f2515a;
        }

        /* JADX INFO: renamed from: m */
        public final void m8858m(@NotNull final Act act, final boolean isFreeUse, boolean isAfterFreeUse, @NotNull String freeUseRecordId, @Nullable final d30 mlnCallback) {
            act.getClass();
            freeUseRecordId.getClass();
            if (CoreModule.c.c2.t3()) {
                return;
            }
            act.duringCreated(CoreModule.c.c2.D3(isFreeUse, isAfterFreeUse, freeUseRecordId)).subscribe(mkd0.m9875H(new e30() { // from class: l.ba
                public final void call(Object obj) {
                    C0521da.Companion.m8846c(isFreeUse, act, mlnCallback, (roj0) obj);
                }
            }, new e30() { // from class: l.ca
                public final void call(Object obj) {
                    C0521da.Companion.m8852i((Throwable) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: o */
        public final void m8859o(boolean z) {
            C0521da.f2515a = z;
        }

        /* JADX INFO: renamed from: p */
        public final void m8860p(@NotNull Act act, @NotNull final d30 onConfirm) {
            act.getClass();
            onConfirm.getClass();
            final int iO3 = xma.o3();
            final x7y x7yVarT = new x7y.a(act).D("确认使用加速配对？").C("现在使用加速配对，30分钟内可无限右滑，优先把你推荐给喜欢的人").y(false).A(false).t();
            MemberAnimView memberAnimViewG = x7yVarT.g();
            memberAnimViewG.Z(new Runnable() { // from class: l.z9
                @Override // java.lang.Runnable
                public final void run() {
                    C0521da.Companion.m8847d(x7yVarT, iO3);
                }
            });
            memberAnimViewG.K("还有" + iO3 + "次机会", new Runnable() { // from class: l.aa
                @Override // java.lang.Runnable
                public final void run() {
                    C0521da.Companion.m8848e(onConfirm, x7yVarT, iO3);
                }
            });
            memberAnimViewG.Y();
            memberAnimViewG.h0(t100.d(4.0f));
            memberAnimViewG.g0(0.0f, 1.0f);
            memberAnimViewG.f0(act.getResources().getColor(z0c0.a));
            memberAnimViewG.c0(t100.d(16.0f));
            memberAnimViewG.P().z("https://auto.tancdn.com/v1/raw/4b3ab5fd-5eb5-46fc-b152-bc4c749c6e0a14.so", -1).b0().O("https://fe-static.tancdn.com/v1/images/eyJpZCI6IlNTSlJVSkNUSEVDV0RVUlFHN1FQNU9YVlFNREJGRDE0IiwidyI6OTM2LCJoIjoxMjI3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NDk5OTM1MzIyNTE3NTE4Nzc4OX0.webp");
            zvf0.A("p_boost_confirm_use", "e_boost_confirm_use", new j760[]{vwb.Y("boost_valid_times", Integer.valueOf(iO3))});
            x7yVarT.n();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: q */
        public final void m8861q(@NotNull Act act) {
            act.getClass();
            if (CoreModule.c.c2.t3()) {
                CoreModule.c.c2.C3(false);
                lac0.k(lac0.Companion.a(), act, (String) null, 2, (Object) null);
            }
        }

        /* JADX INFO: renamed from: r */
        public final void m8862r(@NotNull Context context) {
            context.getClass();
            lac0.Companion.b();
        }

        /* JADX INFO: renamed from: s */
        public final void m8863s(@NotNull Context context) {
            context.getClass();
            lac0.Companion.b();
        }

        @JvmStatic
        @JvmOverloads
        /* JADX INFO: renamed from: t */
        public final void m8864t(@NotNull Act act, boolean z, @NotNull String str) {
            act.getClass();
            str.getClass();
            m8854v(this, act, z, str, null, 8, null);
        }

        @JvmStatic
        @JvmOverloads
        /* JADX INFO: renamed from: u */
        public final void m8865u(@NotNull final Act act, boolean again, @NotNull final String from, @Nullable final d30 mlnCallback) {
            act.getClass();
            from.getClass();
            if (!xma.R3()) {
                if (CoreModule.c.c2.r3()) {
                    m8853n(this, act, false, false, null, mlnCallback, 14, null);
                    return;
                } else {
                    m8860p(act, new d30() { // from class: l.y9
                        public final void call() {
                            C0521da.Companion.m8844a(act, mlnCallback);
                        }
                    });
                    return;
                }
            }
            if (!CoreModule.P().g().v9() || xma.H3()) {
                CoreModule.P().a().Mr(act, TextUtils.isEmpty(from) ? C0583ka.m9576d(act, again) : from, new d30() { // from class: l.v9
                    public final void call() {
                        C0521da.Companion.m8850g();
                    }
                }, new d30() { // from class: l.w9
                    public final void call() {
                        C0521da.Companion.m8845b(from, act);
                    }
                }, new e30() { // from class: l.x9
                    public final void call(Object obj) {
                        C0521da.Companion.m8849f((PurchaseType) obj);
                    }
                });
            } else {
                CoreModule.P().g().Ds(act, TextUtils.isEmpty(from) ? C0583ka.m9576d(act, again) : from, Privilege.accelerate_pairing, (e30) null, new d30() { // from class: l.u9
                    public final void call() {
                        C0521da.Companion.m8851h(from, act);
                    }
                });
            }
        }

        public Companion() {
        }
    }
}
