package p153l;

import com.google.android.gms.internal.play_billing.AbstractC2403d0;
import com.google.android.gms.internal.play_billing.zzji;
import p153l.oox0;

/* JADX INFO: loaded from: classes6.dex */
public class oox0<MessageType extends AbstractC2403d0<MessageType, BuilderType>, BuilderType extends oox0<MessageType, BuilderType>> extends clw0<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a */
    public final AbstractC2403d0 f148399a;

    /* JADX INFO: renamed from: b */
    public AbstractC2403d0 f148400b;

    public oox0(MessageType messagetype) {
        this.f148399a = messagetype;
        if (messagetype.m14822e()) {
            wg3.m206174a("Default instance must be immutable.");
            throw null;
        }
        this.f148400b = messagetype.m14827m();
    }

    /* JADX INFO: renamed from: e */
    public static void m168602e(Object obj, Object obj2) {
        gxx0.m132928a().m132929b(obj.getClass()).zzg(obj, obj2);
    }

    @Override // p153l.clw0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final oox0 clone() {
        oox0 oox0Var = (oox0) this.f148399a.mo14801h(5, null, null);
        oox0Var.f148400b = zzh();
        return oox0Var;
    }

    /* JADX INFO: renamed from: j */
    public final oox0 m168604j(AbstractC2403d0 abstractC2403d0) {
        if (!this.f148399a.equals(abstractC2403d0)) {
            if (!this.f148400b.m14822e()) {
                m168608n();
            }
            m168602e(this.f148400b, abstractC2403d0);
        }
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final MessageType m168605k() {
        MessageType messagetype = (MessageType) zzh();
        if (AbstractC2403d0.m14819x(messagetype, true)) {
            return messagetype;
        }
        throw new zzji(messagetype);
    }

    @Override // p153l.tvx0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public MessageType zzh() {
        boolean zM14822e = this.f148400b.m14822e();
        MessageType messagetype = (MessageType) this.f148400b;
        if (!zM14822e) {
            return messagetype;
        }
        messagetype.m14829t();
        return (MessageType) this.f148400b;
    }

    /* JADX INFO: renamed from: m */
    public final void m168607m() {
        if (this.f148400b.m14822e()) {
            return;
        }
        m168608n();
    }

    /* JADX INFO: renamed from: n */
    public void m168608n() {
        AbstractC2403d0 abstractC2403d0M14827m = this.f148399a.m14827m();
        m168602e(abstractC2403d0M14827m, this.f148400b);
        this.f148400b = abstractC2403d0M14827m;
    }

    @Override // p153l.dwx0
    public final boolean zzl() {
        return AbstractC2403d0.m14819x(this.f148400b, false);
    }
}
