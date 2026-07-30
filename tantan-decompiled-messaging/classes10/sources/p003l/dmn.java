package p003l;

import com.p000p1.mobile.putong.core.data.Greeting;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p000p1.mobile.putong.core.p001ui.intl.greet.IntlGreetingParam;
import com.p1.mobile.putong.data.Channel;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import l.jq2;
import l.mcr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p003l.emn;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b&\u0018\u0000*\u0016\b\u0000\u0010\u0002 \u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010RF\u0010\u001b\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\n0\n \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\n0\n\u0018\u00010\u00130\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u0011R\u0016\u0010/\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u0011R\u0011\u00102\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00104\u001a\u0004\u0018\u00010\u001c8$X¤\u0004¢\u0006\u0006\u001a\u0004\b3\u0010 ¨\u00065"}, d2 = {"Ll/dmn;", "Ll/emn;", "V", "Ll/jq2;", "Ll/mcr;", "lifecycleProvider", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;", "param", "<init>", "(Ll/mcr;Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;)V", "Lcom/p1/mobile/putong/core/data/Greeting;", Greeting.TYPE, "", "e0", "(Lcom/p1/mobile/putong/core/data/Greeting;)V", "a0", "()V", "Z", "j0", "Lrx/subjects/a;", "kotlin.jvm.PlatformType", "a", "Lrx/subjects/a;", "h0", "()Lrx/subjects/a;", "setCurrentGreetingBs", "(Lrx/subjects/a;)V", "currentGreetingBs", "", "b", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "from", "c", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;", "i0", "()Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;", "", "Ll/pmn;", "d", "Ljava/util/List;", "modulePresenters", "", "e", "hasInitSub", "f", "hasInitCreate", "g0", "()Lcom/p1/mobile/putong/core/data/Greeting;", "currentGreeting", "f0", "channelByFrom", "message_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public abstract class dmn<V extends emn<? extends dmn<? extends V>>> extends jq2<V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public a<Greeting> currentGreetingBs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String from;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final IntlGreetingParam param;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<pmn> modulePresenters;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean hasInitSub;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean hasInitCreate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmn(@Nullable mcr mcrVar, @NotNull IntlGreetingParam intlGreetingParam) {
        super(mcrVar);
        intlGreetingParam.getClass();
        this.currentGreetingBs = a.b();
        this.from = intlGreetingParam.getFrom();
        this.param = intlGreetingParam;
        this.modulePresenters = new ArrayList();
    }

    /* JADX INFO: renamed from: e0 */
    private final void m6173e0(Greeting greeting) {
        if (greeting == null || !TEnum.equals(greeting.channel, Channel.get("unknown_"))) {
            return;
        }
        greeting.channel = Channel.get(mo6176f0());
    }

    /* JADX INFO: renamed from: Z */
    public void m6174Z() {
        super.Z();
        Iterator<pmn> it = this.modulePresenters.iterator();
        while (it.hasNext()) {
            it.next().m8767a();
        }
        this.hasInitCreate = true;
    }

    /* JADX INFO: renamed from: a0 */
    public void mo6175a0() {
        super.a0();
        Iterator<pmn> it = this.modulePresenters.iterator();
        while (it.hasNext()) {
            it.next().m8768b();
        }
        this.hasInitSub = true;
    }

    @Nullable
    /* JADX INFO: renamed from: f0 */
    public abstract String mo6176f0();

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final Greeting m6177g0() {
        Object objE = this.currentGreetingBs.e();
        objE.getClass();
        return (Greeting) objE;
    }

    @NotNull
    public final String getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: h0 */
    public final a<Greeting> m6178h0() {
        return this.currentGreetingBs;
    }

    @NotNull
    /* JADX INFO: renamed from: i0, reason: from getter */
    public final IntlGreetingParam getParam() {
        return this.param;
    }

    /* JADX INFO: renamed from: j0 */
    public void m6180j0() {
        IntlGreetingParam intlGreetingParam = this.param;
        m6173e0(intlGreetingParam != null ? intlGreetingParam.getGreetInfo() : null);
        this.currentGreetingBs.onNext(this.param.getGreetInfo());
    }
}
