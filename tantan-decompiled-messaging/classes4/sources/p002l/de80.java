package p002l;

import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Greeting;
import com.p1.mobile.putong.core.data.GreetingHotLevelInfo;
import com.p1.mobile.putong.core.ui.greet.d;
import com.p1.mobile.putong.data.IdBoxed;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.e30;
import l.mkd0;
import l.trd0;
import l.z600;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll/de80;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/ui/greet/d$a;", "builder", "", "b", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/greet/d$a;)V", "message_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class de80 {

    @NotNull
    public static final de80 INSTANCE = new de80();

    /* JADX INFO: renamed from: a */
    public static void m11768a(d.a aVar, Act act, GreetingHotLevelInfo greetingHotLevelInfo) {
        IdBoxed idBoxed;
        List list;
        Greeting greeting = (greetingHotLevelInfo == null || (list = greetingHotLevelInfo.greetings) == null) ? null : (Greeting) list.get(0);
        if (!NullChecker.a(greeting)) {
            new trd0(act, aVar, 0, 4, (DefaultConstructorMarker) null).show();
            return;
        }
        if (TextUtils.equals(aVar.g(), greeting != null ? greeting.otherUser : null) && greeting != null && (idBoxed = greeting.moment) != null) {
            idBoxed.id = aVar.f();
        }
        aVar.r(greeting);
        d.j(act, aVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m11769b(@NotNull final Act act, @NotNull final d.a builder) {
        act.getClass();
        builder.getClass();
        act.duringCreated(CoreModule.c.r0.p5(builder.g(), false)).filter(new z600()).subscribe(mkd0.G(new e30() { // from class: l.ce80
            public final void call(Object obj) {
                de80.m11768a(builder, act, (GreetingHotLevelInfo) obj);
            }
        }));
    }
}
