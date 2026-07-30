package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveOwner;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.HashMap;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes4.dex */
public class zod {

    /* JADX INFO: renamed from: a */
    public String f205313a;

    /* JADX INFO: renamed from: b */
    public boolean f205314b;

    /* JADX INFO: renamed from: c */
    public m500 f205315c;

    /* JADX INFO: renamed from: d */
    public BLiveAbsData f205316d;

    /* JADX INFO: renamed from: e */
    public C22508b<LiveControlMessage> f205317e;

    /* JADX INFO: renamed from: f */
    public cxl<LiveMessage> f205318f;

    /* JADX INFO: renamed from: g */
    public HashMap<String, Object> f205319g = new HashMap<>();

    public zod(@NonNull BLiveAbsData bLiveAbsData, m500 m500Var, C22508b<LiveControlMessage> c22508b, cxl<LiveMessage> cxlVar) {
        BLiveOwner bLiveOwner;
        this.f205315c = m500Var;
        this.f205316d = bLiveAbsData;
        this.f205317e = c22508b;
        this.f205318f = cxlVar;
        boolean z = (bLiveAbsData == null || (bLiveOwner = bLiveAbsData.anchor) == null || !TextUtils.equals(bLiveOwner.f45267id, zrv.f205799a.m207631D0())) ? false : true;
        this.f205314b = z;
        this.f205313a = afu.m97558g(bLiveAbsData, z);
    }

    /* JADX INFO: renamed from: a */
    public BLiveAbsData m220733a() {
        return this.f205316d;
    }

    /* JADX INFO: renamed from: b */
    public C22508b<LiveControlMessage> m220734b() {
        return this.f205317e;
    }

    /* JADX INFO: renamed from: c */
    public cxl<LiveMessage> m220735c() {
        return this.f205318f;
    }

    /* JADX INFO: renamed from: d */
    public m500 m220736d() {
        return this.f205315c;
    }

    /* JADX INFO: renamed from: e */
    public String m220737e() {
        return this.f205313a;
    }

    /* JADX INFO: renamed from: f */
    public boolean m220738f() {
        return this.f205314b;
    }

    /* JADX INFO: renamed from: g */
    public void m220739g(@NonNull BLiveAbsData bLiveAbsData) {
        this.f205316d = bLiveAbsData;
    }
}
