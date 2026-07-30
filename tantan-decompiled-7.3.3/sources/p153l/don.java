package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.p058ui.intl.greet.IntlGreetingParam;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.subjects.C22507a;
import p153l.eon;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b&\u0018\u0000*\u0016\b\u0000\u0010\u0002 \u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010RF\u0010\u001b\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\n0\n \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\n0\n\u0018\u00010\u00130\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u0011R\u0016\u0010/\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u0011R\u0011\u00102\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00104\u001a\u0004\u0018\u00010\u001c8$X¤\u0004¢\u0006\u0006\u001a\u0004\b3\u0010 ¨\u00065"}, m88121d2 = {"Ll/don;", "Ll/eon;", p7f.GPS_MEASUREMENT_INTERRUPTED, "Ll/ar2;", "Ll/ner;", "lifecycleProvider", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;", "param", "<init>", "(Ll/ner;Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;)V", "Lcom/p1/mobile/putong/core/data/Greeting;", "greeting", "", "e0", "(Lcom/p1/mobile/putong/core/data/Greeting;)V", "a0", "()V", "Z", "j0", "Lrx/subjects/a;", "kotlin.jvm.PlatformType", "a", "Lrx/subjects/a;", "h0", "()Lrx/subjects/a;", "setCurrentGreetingBs", "(Lrx/subjects/a;)V", "currentGreetingBs", "", "b", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "from", "c", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;", "i0", "()Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;", "", "Ll/pon;", Constants.INAPP_DATA_TAG, "Ljava/util/List;", "modulePresenters", "", "e", "hasInitSub", "f", "hasInitCreate", "g0", "()Lcom/p1/mobile/putong/core/data/Greeting;", "currentGreeting", "f0", "channelByFrom", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public abstract class don<V extends eon<? extends don<? extends V>>> extends ar2<V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public C22507a<Greeting> currentGreetingBs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String from;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final IntlGreetingParam param;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<pon> modulePresenters;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean hasInitSub;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean hasInitCreate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public don(@Nullable ner nerVar, @NotNull IntlGreetingParam intlGreetingParam) {
        super(nerVar);
        intlGreetingParam.getClass();
        this.currentGreetingBs = C22507a.m222758b();
        this.from = intlGreetingParam.getFrom();
        this.param = intlGreetingParam;
        this.modulePresenters = new ArrayList();
    }

    /* JADX INFO: renamed from: e0 */
    private final void m117333e0(Greeting greeting) {
        if (greeting == null || !TEnum.equals(greeting.channel, Channel.get("unknown_"))) {
            return;
        }
        greeting.channel = Channel.get(mo117334f0());
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        Iterator<pon> it = this.modulePresenters.iterator();
        while (it.hasNext()) {
            it.next().m173109a();
        }
        this.hasInitCreate = true;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        Iterator<pon> it = this.modulePresenters.iterator();
        while (it.hasNext()) {
            it.next().m173110b();
        }
        this.hasInitSub = true;
    }

    @Nullable
    /* JADX INFO: renamed from: f0 */
    public abstract String mo117334f0();

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final Greeting m117335g0() {
        Greeting greetingM222761e = this.currentGreetingBs.m222761e();
        greetingM222761e.getClass();
        return greetingM222761e;
    }

    @NotNull
    public final String getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: h0 */
    public final C22507a<Greeting> m117336h0() {
        return this.currentGreetingBs;
    }

    @NotNull
    /* JADX INFO: renamed from: i0, reason: from getter */
    public final IntlGreetingParam getParam() {
        return this.param;
    }

    /* JADX INFO: renamed from: j0 */
    public void m117338j0() {
        IntlGreetingParam intlGreetingParam = this.param;
        m117333e0(intlGreetingParam != null ? intlGreetingParam.getGreetInfo() : null);
        this.currentGreetingBs.onNext(this.param.getGreetInfo());
    }
}
