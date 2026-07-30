package p153l;

import com.google.android.gms.internal.ads.AbstractC2245p5;
import com.google.android.gms.internal.ads.zzhag;
import com.google.android.gms.internal.ads.zzhco;
import java.io.IOException;
import p153l.shx0;

/* JADX INFO: loaded from: classes6.dex */
public class shx0<MessageType extends AbstractC2245p5<MessageType, BuilderType>, BuilderType extends shx0<MessageType, BuilderType>> extends yfx0<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a */
    public final AbstractC2245p5 f168770a;

    /* JADX INFO: renamed from: b */
    public AbstractC2245p5 f168771b;

    public shx0(MessageType messagetype) {
        this.f168770a = messagetype;
        if (messagetype.m13234F()) {
            wg3.m206174a("Default instance must be immutable.");
            throw null;
        }
        this.f168771b = messagetype.m13242m();
    }

    /* JADX INFO: renamed from: f */
    public static void m185945f(Object obj, Object obj2) {
        nkx0.m163670a().m163671b(obj.getClass()).zzg(obj, obj2);
    }

    @Override // p153l.yfx0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final shx0 clone() {
        shx0 shx0Var = (shx0) this.f168770a.mo12560H(5, null, null);
        shx0Var.f168771b = mo121087I();
        return shx0Var;
    }

    /* JADX INFO: renamed from: k */
    public final shx0 m185948k(AbstractC2245p5 abstractC2245p5) {
        if (!this.f168770a.equals(abstractC2245p5)) {
            if (!this.f168771b.m13234F()) {
                m185953p();
            }
            m185945f(this.f168771b, abstractC2245p5);
        }
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final shx0 m185949l(byte[] bArr, int i, int i2, jhx0 jhx0Var) throws zzhag {
        if (!this.f168771b.m13234F()) {
            m185953p();
        }
        try {
            nkx0.m163670a().m163671b(this.f168771b.getClass()).mo13341d(this.f168771b, bArr, 0, i2, new dgx0(jhx0Var));
            return this;
        } catch (zzhag e) {
            throw e;
        } catch (IOException e2) {
            vtq0.m202761a("Reading from byte array should not throw IOException.", e2);
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw zzhag.zzj();
        }
    }

    /* JADX INFO: renamed from: m */
    public final MessageType m185950m() {
        MessageType messagetype = (MessageType) mo121087I();
        if (messagetype.m13233E()) {
            return messagetype;
        }
        throw new zzhco(messagetype);
    }

    @Override // p153l.ekx0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public MessageType mo121087I() {
        boolean zM13234F = this.f168771b.m13234F();
        MessageType messagetype = (MessageType) this.f168771b;
        if (!zM13234F) {
            return messagetype;
        }
        messagetype.m13230A();
        return (MessageType) this.f168771b;
    }

    /* JADX INFO: renamed from: o */
    public final void m185952o() {
        if (this.f168771b.m13234F()) {
            return;
        }
        m185953p();
    }

    /* JADX INFO: renamed from: p */
    public void m185953p() {
        AbstractC2245p5 abstractC2245p5M13242m = this.f168770a.m13242m();
        m185945f(abstractC2245p5M13242m, this.f168771b);
        this.f168771b = abstractC2245p5M13242m;
    }
}
