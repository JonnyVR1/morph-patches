package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.data.GreetingHotLevelInfo;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.data.IdBoxed;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/de80;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/ui/greet/d$a;", "builder", "", "b", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/greet/d$a;)V", "message_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class de80 {

    @NotNull
    public static final de80 INSTANCE = new de80();

    /* JADX INFO: renamed from: a */
    public static void m111179a(C8360d.a aVar, Act act, GreetingHotLevelInfo greetingHotLevelInfo) {
        IdBoxed idBoxed;
        List<Greeting> list;
        Greeting greeting = (greetingHotLevelInfo == null || (list = greetingHotLevelInfo.greetings) == null) ? null : list.get(0);
        if (!NullChecker.m81303a(greeting)) {
            new trd0(act, aVar, 0, 4, null).show();
            return;
        }
        if (TextUtils.equals(aVar.m45910g(), greeting != null ? greeting.otherUser : null) && greeting != null && (idBoxed = greeting.moment) != null) {
            idBoxed.f38759id = aVar.m45909f();
        }
        aVar.m45921r(greeting);
        C8360d.m45901j(act, aVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m111180b(@NotNull final Act act, @NotNull final C8360d.a builder) {
        act.getClass();
        builder.getClass();
        act.duringCreated(CoreModule.f17545c.f19678r0.m34138p5(builder.m45910g(), false)).filter(new z600()).subscribe(mkd0.m154955G(new e30() { // from class: l.ce80
            @Override // p149l.e30
            public final void call(Object obj) {
                de80.m111179a(builder, act, (GreetingHotLevelInfo) obj);
            }
        }));
    }
}
