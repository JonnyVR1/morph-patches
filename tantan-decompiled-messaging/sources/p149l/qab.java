package p149l;

import com.google.firebase.messaging.Constants;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.MigrateAwardDialogBean;
import com.p046p1.mobile.putong.core.data.MigrateAwardDialogData;
import com.p046p1.mobile.putong.core.data.TtcMigrateDisplayData;
import com.p046p1.mobile.putong.core.data.TtcMigrateDisplayDataBean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0016\u0010\u0010J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\nJ\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\fR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001cR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001c¨\u0006$"}, m87232d2 = {"Ll/qab;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "isBindPhone", "", "p3", "(Z)V", "k3", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/TtcMigrateDisplayData;", "z3", "()Lrx/c;", "y3", "Lcom/p1/mobile/putong/core/data/MigrateAwardDialogData;", "w3", xh5.API_VERSION_V3, "()Lcom/p1/mobile/putong/core/data/MigrateAwardDialogData;", "x3", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "A3", "u3", "Lrx/subjects/a;", "R", "Lrx/subjects/a;", "ttcMigrateDisplayDataBehaviorSubject", j6f.LATITUDE_SOUTH, "ttcBindPhoneMigrateDisplayDataBehaviorSubject", j6f.GPS_DIRECTION_TRUE, "migrateAwardBehaviorSubject", "U", "ttcMigrateEnableDisplayBehaviorSubject", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class qab extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public C22392a<TtcMigrateDisplayData> ttcMigrateDisplayDataBehaviorSubject;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public C22392a<TtcMigrateDisplayData> ttcBindPhoneMigrateDisplayDataBehaviorSubject;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public C22392a<MigrateAwardDialogData> migrateAwardBehaviorSubject;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public C22392a<Boolean> ttcMigrateEnableDisplayBehaviorSubject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qab(@NotNull C4732c c4732c) {
        super(c4732c);
        c4732c.getClass();
        C22392a<TtcMigrateDisplayData> c22392aM221512b = C22392a.m221512b();
        c22392aM221512b.getClass();
        this.ttcMigrateDisplayDataBehaviorSubject = c22392aM221512b;
        C22392a<TtcMigrateDisplayData> c22392aM221512b2 = C22392a.m221512b();
        c22392aM221512b2.getClass();
        this.ttcBindPhoneMigrateDisplayDataBehaviorSubject = c22392aM221512b2;
        C22392a<MigrateAwardDialogData> c22392aM221512b3 = C22392a.m221512b();
        c22392aM221512b3.getClass();
        this.migrateAwardBehaviorSubject = c22392aM221512b3;
        C22392a<Boolean> c22392aM221512b4 = C22392a.m221512b();
        c22392aM221512b4.getClass();
        this.ttcMigrateEnableDisplayBehaviorSubject = c22392aM221512b4;
    }

    /* JADX INFO: renamed from: b3 */
    public static C22306c m173691b3(final boolean z, final qab qabVar) {
        C22306c c22306cM135119c = ia20.m135119c(new v9j() { // from class: l.mab
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qab.m173704q3();
            }
        }, TtcMigrateDisplayDataBean.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.nab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qab.m173705r3(z, qabVar, (TtcMigrateDisplayDataBean) obj);
            }
        };
        return c22306cM135119c.doOnNext(new e30() { // from class: l.oab
            @Override // p149l.e30
            public final void call(Object obj) {
                qab.m173706s3(function1, obj);
            }
        }).doOnError(new e30() { // from class: l.pab
            @Override // p149l.e30
            public final void call(Object obj) {
                qab.m173707t3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public static C22306c m173699j3(final qab qabVar) {
        C22306c c22306cM135119c = ia20.m135119c(new v9j() { // from class: l.iab
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qab.m173700l3();
            }
        }, MigrateAwardDialogBean.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.jab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qab.m173701m3(this.f117076a, (MigrateAwardDialogBean) obj);
            }
        };
        return c22306cM135119c.doOnNext(new e30() { // from class: l.kab
            @Override // p149l.e30
            public final void call(Object obj) {
                qab.m173702n3(function1, obj);
            }
        }).doOnError(new e30() { // from class: l.lab
            @Override // p149l.e30
            public final void call(Object obj) {
                qab.m173703o3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public static final stc0 m173700l3() {
        return C4728a.f19494P.auth().m185898q(xh5.m208761i("/ttt/migration/award/dialog")).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: m3 */
    public static final Unit m173701m3(qab qabVar, MigrateAwardDialogBean migrateAwardDialogBean) {
        qabVar.migrateAwardBehaviorSubject.m132487l(migrateAwardDialogBean.data);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n3 */
    public static final void m173702n3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q3 */
    public static final stc0 m173704q3() {
        return C4728a.f19494P.auth().m185898q(xh5.m208754b("/checkTTTandTTC")).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m173705r3(boolean z, qab qabVar, TtcMigrateDisplayDataBean ttcMigrateDisplayDataBean) {
        if (z) {
            qabVar.ttcBindPhoneMigrateDisplayDataBehaviorSubject.m132487l(ttcMigrateDisplayDataBean.data);
        } else {
            qabVar.ttcMigrateDisplayDataBehaviorSubject.m132487l(ttcMigrateDisplayDataBean.data);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s3 */
    public static final void m173706s3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: A3 */
    public final void m173708A3(boolean display) {
        this.ttcMigrateEnableDisplayBehaviorSubject.m132487l(Boolean.valueOf(display));
    }

    /* JADX INFO: renamed from: k3 */
    public final void m173709k3() {
        scheduled("migrate_award_dialog_data", 0, new v9j() { // from class: l.gab
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qab.m173699j3(this.f101659a);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public final void m173710p3(final boolean isBindPhone) {
        scheduled("ttc_migrate_display_data", 0, new v9j() { // from class: l.hab
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qab.m173691b3(isBindPhone, this);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public final void m173711u3() {
        this.migrateAwardBehaviorSubject.m132487l(new MigrateAwardDialogData());
    }

    @Nullable
    /* JADX INFO: renamed from: v3 */
    public final MigrateAwardDialogData m173712v3() {
        MigrateAwardDialogData migrateAwardDialogDataM221515e = this.migrateAwardBehaviorSubject.m221515e();
        if (migrateAwardDialogDataM221515e != null && migrateAwardDialogDataM221515e.showDialog) {
            return migrateAwardDialogDataM221515e;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w3 */
    public final C22306c<MigrateAwardDialogData> m173713w3() {
        C22306c<MigrateAwardDialogData> c22306cAsObservable = this.migrateAwardBehaviorSubject.asObservable();
        c22306cAsObservable.getClass();
        return c22306cAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: x3 */
    public final C22306c<Boolean> m173714x3() {
        C22306c<Boolean> c22306cAsObservable = this.ttcMigrateEnableDisplayBehaviorSubject.asObservable();
        c22306cAsObservable.getClass();
        return c22306cAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: y3 */
    public final C22306c<TtcMigrateDisplayData> m173715y3() {
        C22306c<TtcMigrateDisplayData> c22306cAsObservable = this.ttcBindPhoneMigrateDisplayDataBehaviorSubject.asObservable();
        c22306cAsObservable.getClass();
        return c22306cAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: z3 */
    public final C22306c<TtcMigrateDisplayData> m173716z3() {
        C22306c<TtcMigrateDisplayData> c22306cAsObservable = this.ttcMigrateDisplayDataBehaviorSubject.asObservable();
        c22306cAsObservable.getClass();
        return c22306cAsObservable;
    }

    /* JADX INFO: renamed from: o3 */
    public static final void m173703o3(Throwable th) {
    }

    /* JADX INFO: renamed from: t3 */
    public static final void m173707t3(Throwable th) {
    }
}
