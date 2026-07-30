package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.data.GreetingHotLevelInfo;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.data.IdBoxed;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/km80;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/ui/greet/d$a;", "builder", "", "b", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/greet/d$a;)V", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class km80 {

    @NotNull
    public static final km80 INSTANCE = new km80();

    /* JADX INFO: renamed from: a */
    public static void m150414a(C8523d.a aVar, Act act, GreetingHotLevelInfo greetingHotLevelInfo) {
        IdBoxed idBoxed;
        List<Greeting> list;
        Greeting greeting = (greetingHotLevelInfo == null || (list = greetingHotLevelInfo.greetings) == null) ? null : list.get(0);
        if (!NullChecker.m82486a(greeting)) {
            new vzd0(act, aVar, 0, 4, null).show();
            return;
        }
        if (TextUtils.equals(aVar.m47093g(), greeting != null ? greeting.otherUser : null) && greeting != null && (idBoxed = greeting.moment) != null) {
            idBoxed.f39607id = aVar.m47092f();
        }
        aVar.m47104r(greeting);
        C8523d.m47084j(act, aVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m150415b(@NotNull final Act act, @NotNull final C8523d.a builder) {
        act.getClass();
        builder.getClass();
        act.duringCreated(CoreModule.f18264c.f20420r0.m35141p5(builder.m47093g(), false)).filter(new if00()).subscribe(psd0.m173596G(new y20() { // from class: l.jm80
            @Override // p153l.y20
            public final void call(Object obj) {
                km80.m150414a(builder, act, (GreetingHotLevelInfo) obj);
            }
        }));
    }
}
