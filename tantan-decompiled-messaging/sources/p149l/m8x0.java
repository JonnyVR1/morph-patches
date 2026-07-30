package p149l;

import com.google.android.gms.internal.ads.AbstractC2222p5;
import com.google.android.gms.internal.ads.zzhag;
import com.google.android.gms.internal.ads.zzhco;
import java.io.IOException;
import p149l.m8x0;

/* JADX INFO: loaded from: classes6.dex */
public class m8x0<MessageType extends AbstractC2222p5<MessageType, BuilderType>, BuilderType extends m8x0<MessageType, BuilderType>> extends s6x0<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a */
    public final AbstractC2222p5 f132638a;

    /* JADX INFO: renamed from: b */
    public AbstractC2222p5 f132639b;

    public m8x0(MessageType messagetype) {
        this.f132638a = messagetype;
        if (messagetype.m13180F()) {
            ig3.m135964a("Default instance must be immutable.");
            throw null;
        }
        this.f132639b = messagetype.m13188m();
    }

    /* JADX INFO: renamed from: f */
    public static void m153515f(Object obj, Object obj2) {
        hbx0.m130351a().m130352b(obj.getClass()).zzg(obj, obj2);
    }

    @Override // p149l.s6x0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final m8x0 clone() {
        m8x0 m8x0Var = (m8x0) this.f132638a.mo12506H(5, null, null);
        m8x0Var.f132639b = mo153516I();
        return m8x0Var;
    }

    /* JADX INFO: renamed from: k */
    public final m8x0 m153519k(AbstractC2222p5 abstractC2222p5) {
        if (!this.f132638a.equals(abstractC2222p5)) {
            if (!this.f132639b.m13180F()) {
                m153524p();
            }
            m153515f(this.f132639b, abstractC2222p5);
        }
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final m8x0 m153520l(byte[] bArr, int i, int i2, d8x0 d8x0Var) throws zzhag {
        if (!this.f132639b.m13180F()) {
            m153524p();
        }
        try {
            hbx0.m130351a().m130352b(this.f132639b.getClass()).mo13287d(this.f132639b, bArr, 0, i2, new x6x0(d8x0Var));
            return this;
        } catch (zzhag e) {
            throw e;
        } catch (IOException e2) {
            pkq0.m170054a("Reading from byte array should not throw IOException.", e2);
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw zzhag.zzj();
        }
    }

    /* JADX INFO: renamed from: m */
    public final MessageType m153521m() {
        MessageType messagetype = (MessageType) mo153516I();
        if (messagetype.m13179E()) {
            return messagetype;
        }
        throw new zzhco(messagetype);
    }

    @Override // p149l.yax0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public MessageType mo153516I() {
        boolean zM13180F = this.f132639b.m13180F();
        MessageType messagetype = (MessageType) this.f132639b;
        if (!zM13180F) {
            return messagetype;
        }
        messagetype.m13176A();
        return (MessageType) this.f132639b;
    }

    /* JADX INFO: renamed from: o */
    public final void m153523o() {
        if (this.f132639b.m13180F()) {
            return;
        }
        m153524p();
    }

    /* JADX INFO: renamed from: p */
    public void m153524p() {
        AbstractC2222p5 abstractC2222p5M13188m = this.f132638a.m13188m();
        m153515f(abstractC2222p5M13188m, this.f132639b);
        this.f132639b = abstractC2222p5M13188m;
    }
}
