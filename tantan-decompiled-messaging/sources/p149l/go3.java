package p149l;

import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.sharedlibrary.loader.LoadEvent;
import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\u0003J\r\u0010\f\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u0003J\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0002¢\u0006\u0004\b\r\u0010\t¨\u0006\u000e"}, m87232d2 = {"Ll/go3;", "", "<init>", "()V", "", "e", "()Z", "Lrx/c;", "g", "()Lrx/c;", "", "f", "h", RXScreenCaptureService.KEY_INDEX, "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class go3 {

    @NotNull
    public static final go3 INSTANCE = new go3();

    /* JADX INFO: renamed from: a */
    public static Boolean m127223a(Unit unit) {
        qa2.INSTANCE.m173681a("BuzzLiveSoHelper", "loadMomoCVSDK suc");
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: b */
    public static void m127224b(Throwable th) {
        qa2.INSTANCE.m173681a("BuzzLiveSoHelper", "prepareLiveSo error " + th.getMessage());
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m127225c(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m127226d(LoadEvent loadEvent) {
        qa2 qa2Var = qa2.INSTANCE;
        qa2Var.m173681a("BuzzLiveSoHelper", "prepareLiveSo " + loadEvent);
        if (loadEvent.m81438c()) {
            qa2Var.m173681a("BuzzLiveSoHelper", "prepareLiveSo isAllSuccess ");
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m127227e() {
        return SharedLibraryLoader.INSTANCE.m81469a().m81463q("b_live");
    }

    /* JADX INFO: renamed from: f */
    public final void m127228f() {
        SharedLibraryLoader.m81456w(SharedLibraryLoader.INSTANCE.m81469a(), "b_live", false, 2, null).subscribe(mkd0.m154959K(new e30() { // from class: l.co3
            @Override // p149l.e30
            public final void call(Object obj) {
                go3.m127226d((LoadEvent) obj);
            }
        }, new e30() { // from class: l.do3
            @Override // p149l.e30
            public final void call(Object obj) {
                go3.m127224b((Throwable) obj);
            }
        }, false));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final C22306c<Boolean> m127229g() {
        if (m127227e()) {
            C22306c<Boolean> c22306cJust = C22306c.just(Boolean.TRUE);
            c22306cJust.getClass();
            return c22306cJust;
        }
        C22306c<Unit> c22306cM127231i = m127231i();
        final Function1 function1 = new Function1() { // from class: l.eo3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return go3.m127223a((Unit) obj);
            }
        };
        C22306c map = c22306cM127231i.map(new w9j() { // from class: l.fo3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return go3.m127225c(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: h */
    public final void m127230h() {
        if (m127227e()) {
            qa2.INSTANCE.m173681a("BuzzLiveSoHelper", "prepareLiveSo, but already loaded");
            return;
        }
        String[] strArr = zqx.m219898k() ? new String[]{"android.permission.RECORD_AUDIO", "android.permission.CAMERA"} : new String[]{"android.permission.RECORD_AUDIO", "android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"};
        if (!PermissionHelper.m79881b((String[]) Arrays.copyOf(strArr, strArr.length))) {
            qa2.INSTANCE.m173681a("BuzzLiveSoHelper", "prepareLiveSo, but permission not had all");
        } else if (qm3.INSTANCE.m175547r()) {
            m127228f();
        } else {
            qa2.INSTANCE.m173681a("BuzzLiveSoHelper", "prepareLiveSo, but getMemojiBuzzUsed false");
        }
    }

    /* JADX INFO: renamed from: i */
    public final C22306c<Unit> m127231i() {
        return SharedLibraryLoader.m81455t(SharedLibraryLoader.INSTANCE.m81469a(), "b_live", false, 2, null);
    }
}
