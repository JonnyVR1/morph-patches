package p006l;

import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.MigrateAwardDialogBean;
import com.p1.mobile.putong.core.data.MigrateAwardDialogData;
import com.p1.mobile.putong.core.data.TtcMigrateDisplayData;
import com.p1.mobile.putong.core.data.TtcMigrateDisplayDataBean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.e30;
import l.stc0;
import l.v9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0016\u0010\u0010J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\nJ\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\fR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001cR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001c¨\u0006$"}, d2 = {"Ll/qab;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "isBindPhone", "", "p3", "(Z)V", "k3", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/TtcMigrateDisplayData;", "z3", "()Lrx/c;", "y3", "Lcom/p1/mobile/putong/core/data/MigrateAwardDialogData;", "w3", xh5.API_VERSION_V3, "()Lcom/p1/mobile/putong/core/data/MigrateAwardDialogData;", "x3", "display", "A3", "u3", "Lrx/subjects/a;", "R", "Lrx/subjects/a;", "ttcMigrateDisplayDataBehaviorSubject", "S", "ttcBindPhoneMigrateDisplayDataBehaviorSubject", "T", "migrateAwardBehaviorSubject", "U", "ttcMigrateEnableDisplayBehaviorSubject", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class qab extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public a<TtcMigrateDisplayData> ttcMigrateDisplayDataBehaviorSubject;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public a<TtcMigrateDisplayData> ttcBindPhoneMigrateDisplayDataBehaviorSubject;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public a<MigrateAwardDialogData> migrateAwardBehaviorSubject;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public a<Boolean> ttcMigrateEnableDisplayBehaviorSubject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qab(@NotNull C0158c c0158c) {
        super(c0158c);
        c0158c.getClass();
        a<TtcMigrateDisplayData> aVarB = a.b();
        aVarB.getClass();
        this.ttcMigrateDisplayDataBehaviorSubject = aVarB;
        a<TtcMigrateDisplayData> aVarB2 = a.b();
        aVarB2.getClass();
        this.ttcBindPhoneMigrateDisplayDataBehaviorSubject = aVarB2;
        a<MigrateAwardDialogData> aVarB3 = a.b();
        aVarB3.getClass();
        this.migrateAwardBehaviorSubject = aVarB3;
        a<Boolean> aVarB4 = a.b();
        aVarB4.getClass();
        this.ttcMigrateEnableDisplayBehaviorSubject = aVarB4;
    }

    /* JADX INFO: renamed from: b3 */
    public static c m21973b3(final boolean z, final qab qabVar) {
        c cVarM16569c = ia20.m16569c(new v9j() { // from class: l.mab
            public final Object call() {
                return qab.m21986q3();
            }
        }, TtcMigrateDisplayDataBean.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.nab
            public final Object invoke(Object obj) {
                return qab.m21987r3(z, qabVar, (TtcMigrateDisplayDataBean) obj);
            }
        };
        return cVarM16569c.doOnNext(new e30() { // from class: l.oab
            public final void call(Object obj) {
                qab.m21988s3(function1, obj);
            }
        }).doOnError(new e30() { // from class: l.pab
            public final void call(Object obj) {
                qab.m21989t3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public static c m21981j3(final qab qabVar) {
        c cVarM16569c = ia20.m16569c(new v9j() { // from class: l.iab
            public final Object call() {
                return qab.m21982l3();
            }
        }, MigrateAwardDialogBean.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.jab
            public final Object invoke(Object obj) {
                return qab.m21983m3(this.f15090a, (MigrateAwardDialogBean) obj);
            }
        };
        return cVarM16569c.doOnNext(new e30() { // from class: l.kab
            public final void call(Object obj) {
                qab.m21984n3(function1, obj);
            }
        }).doOnError(new e30() { // from class: l.lab
            public final void call(Object obj) {
                qab.m21985o3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public static final stc0 m21982l3() {
        return C0154a.f3483P.auth().q(xh5.m27250i("/ttt/migration/award/dialog")).f().b();
    }

    /* JADX INFO: renamed from: m3 */
    public static final Unit m21983m3(qab qabVar, MigrateAwardDialogBean migrateAwardDialogBean) {
        qabVar.migrateAwardBehaviorSubject.onNext(migrateAwardDialogBean.data);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n3 */
    public static final void m21984n3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q3 */
    public static final stc0 m21986q3() {
        return C0154a.f3483P.auth().q(xh5.m27243b("/checkTTTandTTC")).f().b();
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m21987r3(boolean z, qab qabVar, TtcMigrateDisplayDataBean ttcMigrateDisplayDataBean) {
        if (z) {
            qabVar.ttcBindPhoneMigrateDisplayDataBehaviorSubject.onNext(ttcMigrateDisplayDataBean.data);
        } else {
            qabVar.ttcMigrateDisplayDataBehaviorSubject.onNext(ttcMigrateDisplayDataBean.data);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s3 */
    public static final void m21988s3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: A3 */
    public final void m21990A3(boolean display) {
        this.ttcMigrateEnableDisplayBehaviorSubject.onNext(Boolean.valueOf(display));
    }

    /* JADX INFO: renamed from: k3 */
    public final void m21991k3() {
        scheduled("migrate_award_dialog_data", 0, new v9j() { // from class: l.gab
            public final Object call() {
                return qab.m21981j3(this.f13132a);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public final void m21992p3(final boolean isBindPhone) {
        scheduled("ttc_migrate_display_data", 0, new v9j() { // from class: l.hab
            public final Object call() {
                return qab.m21973b3(isBindPhone, this);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public final void m21993u3() {
        this.migrateAwardBehaviorSubject.onNext(new MigrateAwardDialogData());
    }

    @Nullable
    /* JADX INFO: renamed from: v3 */
    public final MigrateAwardDialogData m21994v3() {
        MigrateAwardDialogData migrateAwardDialogData = (MigrateAwardDialogData) this.migrateAwardBehaviorSubject.e();
        if (migrateAwardDialogData != null && migrateAwardDialogData.showDialog) {
            return migrateAwardDialogData;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w3 */
    public final c<MigrateAwardDialogData> m21995w3() {
        c<MigrateAwardDialogData> cVarAsObservable = this.migrateAwardBehaviorSubject.asObservable();
        cVarAsObservable.getClass();
        return cVarAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: x3 */
    public final c<Boolean> m21996x3() {
        c<Boolean> cVarAsObservable = this.ttcMigrateEnableDisplayBehaviorSubject.asObservable();
        cVarAsObservable.getClass();
        return cVarAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: y3 */
    public final c<TtcMigrateDisplayData> m21997y3() {
        c<TtcMigrateDisplayData> cVarAsObservable = this.ttcBindPhoneMigrateDisplayDataBehaviorSubject.asObservable();
        cVarAsObservable.getClass();
        return cVarAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: z3 */
    public final c<TtcMigrateDisplayData> m21998z3() {
        c<TtcMigrateDisplayData> cVarAsObservable = this.ttcMigrateDisplayDataBehaviorSubject.asObservable();
        cVarAsObservable.getClass();
        return cVarAsObservable;
    }

    /* JADX INFO: renamed from: o3 */
    public static final void m21985o3(Throwable th) {
    }

    /* JADX INFO: renamed from: t3 */
    public static final void m21989t3(Throwable th) {
    }
}
