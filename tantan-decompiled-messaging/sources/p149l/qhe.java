package p149l;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.CoreGiftPriority;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class qhe {

    /* JADX INFO: renamed from: a */
    public Map<String, CoreGiftInfo> f154461a;

    /* JADX INFO: renamed from: l.qhe$b */
    public static class C19499b {

        /* JADX INFO: renamed from: a */
        public static qhe f154463a = new qhe();
    }

    public qhe() {
        this.f154461a = new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public static qhe m174529b() {
        return C19499b.f154463a;
    }

    @MainThread
    /* JADX INFO: renamed from: a */
    public CoreGiftInfo m174530a(String str) {
        return this.f154461a.get(str);
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public void m174531c(CoreGiftInfo coreGiftInfo) {
        m174532d(coreGiftInfo, new C19498a());
    }

    @MainThread
    /* JADX INFO: renamed from: d */
    public void m174532d(CoreGiftInfo coreGiftInfo, @Nullable f2m.InterfaceC16743a interfaceC16743a) {
        this.f154461a.put(coreGiftInfo.f56011id, coreGiftInfo);
        if (coreGiftInfo.dynamicGift) {
            wfe.m202983b("video").mo102509a().mo119227a(coreGiftInfo.f56011id, coreGiftInfo.dynamicURL, coreGiftInfo.dynamicMD5, coreGiftInfo.priority, interfaceC16743a);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m174533e(List<CoreGiftInfo> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        for (CoreGiftInfo coreGiftInfo : list) {
            coreGiftInfo.priority = CoreGiftPriority.get("LOW");
            m174531c(coreGiftInfo);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m174534f(CoreGiftInfo coreGiftInfo) {
        coreGiftInfo.priority = CoreGiftPriority.get("HIGH");
        m174531c(coreGiftInfo);
    }

    /* JADX INFO: renamed from: l.qhe$a */
    public class C19498a extends cwc0 {
        public C19498a() {
        }

        @Override // p149l.f2m.InterfaceC16743a
        /* JADX INFO: renamed from: d */
        public void mo45459d(String str, String str2) {
        }
    }
}
