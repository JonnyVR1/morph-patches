package p153l;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.CoreGiftPriority;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class uie {

    /* JADX INFO: renamed from: a */
    public Map<String, CoreGiftInfo> f179090a;

    /* JADX INFO: renamed from: l.uie$b */
    public static class C20578b {

        /* JADX INFO: renamed from: a */
        public static uie f179092a = new uie();
    }

    public uie() {
        this.f179090a = new HashMap();
    }

    /* JADX INFO: renamed from: b */
    public static uie m196154b() {
        return C20578b.f179092a;
    }

    @MainThread
    /* JADX INFO: renamed from: a */
    public CoreGiftInfo m196155a(String str) {
        return this.f179090a.get(str);
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public void m196156c(CoreGiftInfo coreGiftInfo) {
        m196157d(coreGiftInfo, new C20577a());
    }

    @MainThread
    /* JADX INFO: renamed from: d */
    public void m196157d(CoreGiftInfo coreGiftInfo, @Nullable y4m.InterfaceC21517a interfaceC21517a) {
        this.f179090a.put(coreGiftInfo.f56859id, coreGiftInfo);
        if (coreGiftInfo.dynamicGift) {
            ahe.m97794b("video").mo115524a().mo199742a(coreGiftInfo.f56859id, coreGiftInfo.dynamicURL, coreGiftInfo.dynamicMD5, coreGiftInfo.priority, interfaceC21517a);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m196158e(List<CoreGiftInfo> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        for (CoreGiftInfo coreGiftInfo : list) {
            coreGiftInfo.priority = CoreGiftPriority.get("LOW");
            m196156c(coreGiftInfo);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m196159f(CoreGiftInfo coreGiftInfo) {
        coreGiftInfo.priority = CoreGiftPriority.get("HIGH");
        m196156c(coreGiftInfo);
    }

    /* JADX INFO: renamed from: l.uie$a */
    public class C20577a extends f4d0 {
        public C20577a() {
        }

        @Override // p153l.y4m.InterfaceC21517a
        /* JADX INFO: renamed from: d */
        public void mo46642d(String str, String str2) {
        }
    }
}
