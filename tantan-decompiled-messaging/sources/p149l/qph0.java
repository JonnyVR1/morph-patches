package p149l;

import android.content.Context;
import com.momo.mcamera.mask.MaskStore;

/* JADX INFO: loaded from: classes13.dex */
public class qph0 {

    /* JADX INFO: renamed from: b */
    public static qph0 f155764b = new qph0();

    /* JADX INFO: renamed from: a */
    public MaskStore f155765a = MaskStore.getInstance();

    /* JADX INFO: renamed from: a */
    public static qph0 m175841a() {
        return f155764b;
    }

    /* JADX INFO: renamed from: b */
    public pph0 m175842b(Context context, String str) {
        return new pph0(this.f155765a.getMask(context, str));
    }
}
