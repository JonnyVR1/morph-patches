package p003l;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p000p1.mobile.putong.core.data.CoreGiftPriority;
import com.tantanapp.common.data.DbObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qhe {

    /* JADX INFO: renamed from: a */
    public Map<String, CoreGiftInfo> f7022a;

    /* JADX INFO: renamed from: l.qhe$b */
    public static class C3410b {

        /* JADX INFO: renamed from: a */
        public static qhe f7024a = new qhe();
    }

    public qhe() {
        this.f7022a = new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public static qhe m8996b() {
        return C3410b.f7024a;
    }

    @MainThread
    /* JADX INFO: renamed from: a */
    public CoreGiftInfo m8997a(String str) {
        return this.f7022a.get(str);
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public void m8998c(CoreGiftInfo coreGiftInfo) {
        m8999d(coreGiftInfo, new C3409a());
    }

    @MainThread
    /* JADX INFO: renamed from: d */
    public void m8999d(CoreGiftInfo coreGiftInfo, @Nullable f2m.InterfaceC3325a interfaceC3325a) {
        this.f7022a.put(((DbObject) coreGiftInfo).id, coreGiftInfo);
        if (coreGiftInfo.dynamicGift) {
            wfe.m10496b("video").mo5736a().mo6370a(((DbObject) coreGiftInfo).id, coreGiftInfo.dynamicURL, coreGiftInfo.dynamicMD5, coreGiftInfo.priority, interfaceC3325a);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m9000e(List<CoreGiftInfo> list) {
        if (vwb.J(list)) {
            return;
        }
        for (CoreGiftInfo coreGiftInfo : list) {
            coreGiftInfo.priority = CoreGiftPriority.get(CoreGiftPriority.LOW);
            m8998c(coreGiftInfo);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m9001f(CoreGiftInfo coreGiftInfo) {
        coreGiftInfo.priority = CoreGiftPriority.get(CoreGiftPriority.HIGH);
        m8998c(coreGiftInfo);
    }

    /* JADX INFO: renamed from: l.qhe$a */
    public class C3409a extends cwc0 {
        public C3409a() {
        }

        @Override // p003l.f2m.InterfaceC3325a
        /* JADX INFO: renamed from: d */
        public void mo2789d(String str, String str2) {
        }
    }
}
