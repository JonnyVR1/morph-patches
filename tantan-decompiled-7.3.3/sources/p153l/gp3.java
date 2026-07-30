package p153l;

import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.sharedlibrary.loader.LoadEvent;
import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\u0003J\r\u0010\f\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u0003J\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0002¢\u0006\u0004\b\r\u0010\t¨\u0006\u000e"}, m88121d2 = {"Ll/gp3;", "", "<init>", "()V", "", "e", "()Z", "Lrx/c;", "g", "()Lrx/c;", "", "f", "h", RXScreenCaptureService.KEY_INDEX, "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gp3 {

    @NotNull
    public static final gp3 INSTANCE = new gp3();

    /* JADX INFO: renamed from: a */
    public static Boolean m131197a(Unit unit) {
        xa2.INSTANCE.m209830a("BuzzLiveSoHelper", "loadMomoCVSDK suc");
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: b */
    public static void m131198b(Throwable th) {
        xa2.INSTANCE.m209830a("BuzzLiveSoHelper", "prepareLiveSo error " + th.getMessage());
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m131199c(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m131200d(LoadEvent loadEvent) {
        xa2 xa2Var = xa2.INSTANCE;
        xa2Var.m209830a("BuzzLiveSoHelper", "prepareLiveSo " + loadEvent);
        if (loadEvent.m82621c()) {
            xa2Var.m209830a("BuzzLiveSoHelper", "prepareLiveSo isAllSuccess ");
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m131201e() {
        return SharedLibraryLoader.INSTANCE.m82652a().m82646q("b_live");
    }

    /* JADX INFO: renamed from: f */
    public final void m131202f() {
        SharedLibraryLoader.m82639w(SharedLibraryLoader.INSTANCE.m82652a(), "b_live", false, 2, null).subscribe(psd0.m173600K(new y20() { // from class: l.cp3
            @Override // p153l.y20
            public final void call(Object obj) {
                gp3.m131200d((LoadEvent) obj);
            }
        }, new y20() { // from class: l.dp3
            @Override // p153l.y20
            public final void call(Object obj) {
                gp3.m131198b((Throwable) obj);
            }
        }, false));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final C22421c<Boolean> m131203g() {
        if (m131201e()) {
            C22421c<Boolean> c22421cJust = C22421c.just(Boolean.TRUE);
            c22421cJust.getClass();
            return c22421cJust;
        }
        C22421c<Unit> c22421cM131205i = m131205i();
        final Function1 function1 = new Function1() { // from class: l.ep3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return gp3.m131197a((Unit) obj);
            }
        };
        C22421c map = c22421cM131205i.map(new qcj() { // from class: l.fp3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return gp3.m131199c(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: h */
    public final void m131204h() {
        if (m131201e()) {
            xa2.INSTANCE.m209830a("BuzzLiveSoHelper", "prepareLiveSo, but already loaded");
            return;
        }
        String[] strArr = wzx.m208784k() ? new String[]{"android.permission.RECORD_AUDIO", "android.permission.CAMERA"} : new String[]{"android.permission.RECORD_AUDIO", "android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"};
        if (!PermissionHelper.m81064b((String[]) Arrays.copyOf(strArr, strArr.length))) {
            xa2.INSTANCE.m209830a("BuzzLiveSoHelper", "prepareLiveSo, but permission not had all");
        } else if (qn3.INSTANCE.m177198r()) {
            m131202f();
        } else {
            xa2.INSTANCE.m209830a("BuzzLiveSoHelper", "prepareLiveSo, but getMemojiBuzzUsed false");
        }
    }

    /* JADX INFO: renamed from: i */
    public final C22421c<Unit> m131205i() {
        return SharedLibraryLoader.m82638t(SharedLibraryLoader.INSTANCE.m82652a(), "b_live", false, 2, null);
    }
}
