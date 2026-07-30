package p153l;

import com.p051p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00102\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nR#\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m88121d2 = {"Ll/zu80;", "", "<init>", "()V", "Ll/v4;", "Ll/rpl;", "next", "b", "(Ll/v4;)Ll/zu80;", "c", "()Ll/rpl;", "a", "Lkotlin/Lazy;", "e", "()Ll/v4;", "head", "Companion", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class zu80 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy head = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.yu80
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return zu80.m221599a();
        }
    });

    /* JADX INFO: renamed from: l.zu80$b */
    @Metadata(m88120d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"l/zu80$b", "Ll/v4;", "Ll/rpl;", "c", "()Ll/rpl;", "", "b", "()Z", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21899b extends AbstractC20745v4<rpl> {
        @Override // p153l.AbstractC20745v4
        /* JADX INFO: renamed from: b */
        public boolean mo160802b() {
            return false;
        }

        @Override // p153l.AbstractC20745v4
        /* JADX INFO: renamed from: c */
        public rpl mo160803c() {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C21899b m221599a() {
        return new C21899b();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final zu80 m221600d(@NotNull BusinessConversationView businessConversationView) {
        return INSTANCE.m221604a(businessConversationView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: b */
    public final zu80 m221601b(@NotNull AbstractC20745v4<rpl> next) {
        next.getClass();
        AbstractC20745v4<rpl> abstractC20745v4M221603e = m221603e();
        while (abstractC20745v4M221603e.m199636d() != null) {
            abstractC20745v4M221603e = abstractC20745v4M221603e.m199636d();
            abstractC20745v4M221603e.getClass();
        }
        abstractC20745v4M221603e.m199637e(next);
        return this;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final rpl m221602c() {
        return m221603e().m199635a();
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC20745v4<rpl> m221603e() {
        return (AbstractC20745v4) this.head.getValue();
    }

    /* JADX INFO: renamed from: l.zu80$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/zu80$a;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", OMSTemplateModeType.view, "Ll/zu80;", "a", "(Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;)Ll/zu80;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final zu80 m221604a(@NotNull BusinessConversationView view) {
            view.getClass();
            return new zu80().m221601b(new myo(view)).m221601b(new xey(view));
        }

        public Companion() {
        }
    }
}
