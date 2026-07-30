package p149l;

import com.google.android.gms.internal.play_billing.AbstractC2380d0;
import com.google.android.gms.internal.play_billing.zzji;
import p149l.ifx0;

/* JADX INFO: loaded from: classes6.dex */
public class ifx0<MessageType extends AbstractC2380d0<MessageType, BuilderType>, BuilderType extends ifx0<MessageType, BuilderType>> extends wbw0<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a */
    public final AbstractC2380d0 f113060a;

    /* JADX INFO: renamed from: b */
    public AbstractC2380d0 f113061b;

    public ifx0(MessageType messagetype) {
        this.f113060a = messagetype;
        if (messagetype.m14768e()) {
            ig3.m135964a("Default instance must be immutable.");
            throw null;
        }
        this.f113061b = messagetype.m14773m();
    }

    /* JADX INFO: renamed from: e */
    public static void m135955e(Object obj, Object obj2) {
        aox0.m98001a().m98002b(obj.getClass()).zzg(obj, obj2);
    }

    @Override // p149l.wbw0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ifx0 clone() {
        ifx0 ifx0Var = (ifx0) this.f113060a.mo14747h(5, null, null);
        ifx0Var.f113061b = zzh();
        return ifx0Var;
    }

    /* JADX INFO: renamed from: j */
    public final ifx0 m135958j(AbstractC2380d0 abstractC2380d0) {
        if (!this.f113060a.equals(abstractC2380d0)) {
            if (!this.f113061b.m14768e()) {
                m135962n();
            }
            m135955e(this.f113061b, abstractC2380d0);
        }
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final MessageType m135959k() {
        MessageType messagetype = (MessageType) zzh();
        if (AbstractC2380d0.m14765x(messagetype, true)) {
            return messagetype;
        }
        throw new zzji(messagetype);
    }

    @Override // p149l.nmx0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public MessageType zzh() {
        boolean zM14768e = this.f113061b.m14768e();
        MessageType messagetype = (MessageType) this.f113061b;
        if (!zM14768e) {
            return messagetype;
        }
        messagetype.m14775t();
        return (MessageType) this.f113061b;
    }

    /* JADX INFO: renamed from: m */
    public final void m135961m() {
        if (this.f113061b.m14768e()) {
            return;
        }
        m135962n();
    }

    /* JADX INFO: renamed from: n */
    public void m135962n() {
        AbstractC2380d0 abstractC2380d0M14773m = this.f113060a.m14773m();
        m135955e(abstractC2380d0M14773m, this.f113061b);
        this.f113061b = abstractC2380d0M14773m;
    }

    @Override // p149l.xmx0
    public final boolean zzl() {
        return AbstractC2380d0.m14765x(this.f113061b, false);
    }
}
