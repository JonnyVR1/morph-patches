package p149l;

import com.p046p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00102\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nR#\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m87232d2 = {"Ll/vm80;", "", "<init>", "()V", "Ll/x4;", "Ll/gnl;", "next", "b", "(Ll/x4;)Ll/vm80;", "c", "()Ll/gnl;", "a", "Lkotlin/Lazy;", "e", "()Ll/x4;", "head", "Companion", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class vm80 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy head = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.um80
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return vm80.m198899a();
        }
    });

    /* JADX INFO: renamed from: l.vm80$b */
    @Metadata(m87231d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"l/vm80$b", "Ll/x4;", "Ll/gnl;", "c", "()Ll/gnl;", "", "b", "()Z", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20664b extends AbstractC21023x4<gnl> {
        @Override // p149l.AbstractC21023x4
        /* JADX INFO: renamed from: b */
        public boolean mo95167b() {
            return false;
        }

        @Override // p149l.AbstractC21023x4
        /* JADX INFO: renamed from: c */
        public gnl mo95168c() {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C20664b m198899a() {
        return new C20664b();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final vm80 m198900d(@NotNull BusinessConversationView businessConversationView) {
        return INSTANCE.m198904a(businessConversationView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: b */
    public final vm80 m198901b(@NotNull AbstractC21023x4<gnl> next) {
        next.getClass();
        AbstractC21023x4<gnl> abstractC21023x4M198903e = m198903e();
        while (abstractC21023x4M198903e.m206956d() != null) {
            abstractC21023x4M198903e = abstractC21023x4M198903e.m206956d();
            abstractC21023x4M198903e.getClass();
        }
        abstractC21023x4M198903e.m206957e(next);
        return this;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final gnl m198902c() {
        return m198903e().m206955a();
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC21023x4<gnl> m198903e() {
        return (AbstractC21023x4) this.head.getValue();
    }

    /* JADX INFO: renamed from: l.vm80$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/vm80$a;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", OMSTemplateModeType.view, "Ll/vm80;", "a", "(Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;)Ll/vm80;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final vm80 m198904a(@NotNull BusinessConversationView view) {
            view.getClass();
            return new vm80().m198901b(new mwo(view)).m198901b(new a6y(view));
        }

        public Companion() {
        }
    }
}
