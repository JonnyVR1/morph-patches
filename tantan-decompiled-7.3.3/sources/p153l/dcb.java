package p153l;

import com.google.firebase.messaging.Constants;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.MigrateAwardDialogBean;
import com.p051p1.mobile.putong.core.data.MigrateAwardDialogData;
import com.p051p1.mobile.putong.core.data.TtcMigrateDisplayData;
import com.p051p1.mobile.putong.core.data.TtcMigrateDisplayDataBean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0016\u0010\u0010J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\nJ\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\fR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001cR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001c¨\u0006$"}, m88121d2 = {"Ll/dcb;", "Ll/dy6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "isBindPhone", "", "p3", "(Z)V", "k3", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/core/data/TtcMigrateDisplayData;", "z3", "()Lrx/c;", "y3", "Lcom/p1/mobile/putong/core/data/MigrateAwardDialogData;", "w3", xi5.API_VERSION_V3, "()Lcom/p1/mobile/putong/core/data/MigrateAwardDialogData;", "x3", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "A3", "u3", "Lrx/subjects/a;", "R", "Lrx/subjects/a;", "ttcMigrateDisplayDataBehaviorSubject", p7f.LATITUDE_SOUTH, "ttcBindPhoneMigrateDisplayDataBehaviorSubject", p7f.GPS_DIRECTION_TRUE, "migrateAwardBehaviorSubject", "U", "ttcMigrateEnableDisplayBehaviorSubject", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class dcb extends dy6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public C22507a<TtcMigrateDisplayData> ttcMigrateDisplayDataBehaviorSubject;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public C22507a<TtcMigrateDisplayData> ttcBindPhoneMigrateDisplayDataBehaviorSubject;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public C22507a<MigrateAwardDialogData> migrateAwardBehaviorSubject;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public C22507a<Boolean> ttcMigrateEnableDisplayBehaviorSubject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcb(@NotNull C4883c c4883c) {
        super(c4883c);
        c4883c.getClass();
        C22507a<TtcMigrateDisplayData> c22507aM222758b = C22507a.m222758b();
        c22507aM222758b.getClass();
        this.ttcMigrateDisplayDataBehaviorSubject = c22507aM222758b;
        C22507a<TtcMigrateDisplayData> c22507aM222758b2 = C22507a.m222758b();
        c22507aM222758b2.getClass();
        this.ttcBindPhoneMigrateDisplayDataBehaviorSubject = c22507aM222758b2;
        C22507a<MigrateAwardDialogData> c22507aM222758b3 = C22507a.m222758b();
        c22507aM222758b3.getClass();
        this.migrateAwardBehaviorSubject = c22507aM222758b3;
        C22507a<Boolean> c22507aM222758b4 = C22507a.m222758b();
        c22507aM222758b4.getClass();
        this.ttcMigrateEnableDisplayBehaviorSubject = c22507aM222758b4;
    }

    /* JADX INFO: renamed from: b3 */
    public static C22421c m115245b3(final boolean z, final dcb dcbVar) {
        C22421c c22421cM176656c = qi20.m176656c(new pcj() { // from class: l.zbb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dcb.m115258q3();
            }
        }, TtcMigrateDisplayDataBean.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.acb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dcb.m115259r3(z, dcbVar, (TtcMigrateDisplayDataBean) obj);
            }
        };
        return c22421cM176656c.doOnNext(new y20() { // from class: l.bcb
            @Override // p153l.y20
            public final void call(Object obj) {
                dcb.m115260s3(function1, obj);
            }
        }).doOnError(new y20() { // from class: l.ccb
            @Override // p153l.y20
            public final void call(Object obj) {
                dcb.m115261t3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public static C22421c m115253j3(final dcb dcbVar) {
        C22421c c22421cM176656c = qi20.m176656c(new pcj() { // from class: l.vbb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dcb.m115254l3();
            }
        }, MigrateAwardDialogBean.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.wbb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dcb.m115255m3(this.f188223a, (MigrateAwardDialogBean) obj);
            }
        };
        return c22421cM176656c.doOnNext(new y20() { // from class: l.xbb
            @Override // p153l.y20
            public final void call(Object obj) {
                dcb.m115256n3(function1, obj);
            }
        }).doOnError(new y20() { // from class: l.ybb
            @Override // p153l.y20
            public final void call(Object obj) {
                dcb.m115257o3((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public static final x1d0 m115254l3() {
        return C4879a.f20236P.auth().m209043q(xi5.m211107i("/ttt/migration/award/dialog")).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: m3 */
    public static final Unit m115255m3(dcb dcbVar, MigrateAwardDialogBean migrateAwardDialogBean) {
        dcbVar.migrateAwardBehaviorSubject.m137019l(migrateAwardDialogBean.data);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n3 */
    public static final void m115256n3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q3 */
    public static final x1d0 m115258q3() {
        return C4879a.f20236P.auth().m209043q(xi5.m211100b("/checkTTTandTTC")).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m115259r3(boolean z, dcb dcbVar, TtcMigrateDisplayDataBean ttcMigrateDisplayDataBean) {
        if (z) {
            dcbVar.ttcBindPhoneMigrateDisplayDataBehaviorSubject.m137019l(ttcMigrateDisplayDataBean.data);
        } else {
            dcbVar.ttcMigrateDisplayDataBehaviorSubject.m137019l(ttcMigrateDisplayDataBean.data);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s3 */
    public static final void m115260s3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: A3 */
    public final void m115262A3(boolean display) {
        this.ttcMigrateEnableDisplayBehaviorSubject.m137019l(Boolean.valueOf(display));
    }

    /* JADX INFO: renamed from: k3 */
    public final void m115263k3() {
        scheduled("migrate_award_dialog_data", 0, new pcj() { // from class: l.tbb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dcb.m115253j3(this.f172849a);
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public final void m115264p3(final boolean isBindPhone) {
        scheduled("ttc_migrate_display_data", 0, new pcj() { // from class: l.ubb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dcb.m115245b3(isBindPhone, this);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public final void m115265u3() {
        this.migrateAwardBehaviorSubject.m137019l(new MigrateAwardDialogData());
    }

    @Nullable
    /* JADX INFO: renamed from: v3 */
    public final MigrateAwardDialogData m115266v3() {
        MigrateAwardDialogData migrateAwardDialogDataM222761e = this.migrateAwardBehaviorSubject.m222761e();
        if (migrateAwardDialogDataM222761e != null && migrateAwardDialogDataM222761e.showDialog) {
            return migrateAwardDialogDataM222761e;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w3 */
    public final C22421c<MigrateAwardDialogData> m115267w3() {
        C22421c<MigrateAwardDialogData> c22421cAsObservable = this.migrateAwardBehaviorSubject.asObservable();
        c22421cAsObservable.getClass();
        return c22421cAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: x3 */
    public final C22421c<Boolean> m115268x3() {
        C22421c<Boolean> c22421cAsObservable = this.ttcMigrateEnableDisplayBehaviorSubject.asObservable();
        c22421cAsObservable.getClass();
        return c22421cAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: y3 */
    public final C22421c<TtcMigrateDisplayData> m115269y3() {
        C22421c<TtcMigrateDisplayData> c22421cAsObservable = this.ttcBindPhoneMigrateDisplayDataBehaviorSubject.asObservable();
        c22421cAsObservable.getClass();
        return c22421cAsObservable;
    }

    @NotNull
    /* JADX INFO: renamed from: z3 */
    public final C22421c<TtcMigrateDisplayData> m115270z3() {
        C22421c<TtcMigrateDisplayData> c22421cAsObservable = this.ttcMigrateDisplayDataBehaviorSubject.asObservable();
        c22421cAsObservable.getClass();
        return c22421cAsObservable;
    }

    /* JADX INFO: renamed from: o3 */
    public static final void m115257o3(Throwable th) {
    }

    /* JADX INFO: renamed from: t3 */
    public static final void m115261t3(Throwable th) {
    }
}
