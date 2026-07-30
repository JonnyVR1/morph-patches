package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public class nkl extends pq2 {

    /* JADX INFO: renamed from: n */
    private String f139442n;

    /* JADX INFO: renamed from: o */
    private boolean f139443o;

    /* JADX INFO: renamed from: l.nkl$a */
    public class C18727a implements tm2.InterfaceC20213a {
        public C18727a() {
        }

        @Override // p149l.tm2.InterfaceC20213a
        /* JADX INFO: renamed from: a */
        public void mo159978a(tm2 tm2Var) {
            nkl.this.m170885j("tanghttp--------主域名检测成功，不继续检测备用域名 " + nkl.this.f150739c);
            nkl.this.m159975M(tm2Var);
        }

        @Override // p149l.tm2.InterfaceC20213a
        /* JADX INFO: renamed from: b */
        public void mo159979b(tm2 tm2Var, String str) {
            if (tm2Var == null) {
                return;
            }
            nkl.this.m170886k("referee http--------主域名检测结束 " + nkl.this.f150739c + "[" + tm2Var.m189636c() + Constants.AES_SUFFIX);
            if (nkl.this.f150738b.get() && TextUtils.equals(tm2Var.m189634a(), nkl.this.m170877b())) {
                nkl.this.m159958J();
                return;
            }
            nkl.this.m170885j("tanghttp--------一次检测失败，但是异常处理流程已经结束，放弃 " + tm2Var.m189636c() + ":" + tm2Var.m189635b());
        }
    }

    /* JADX INFO: renamed from: l.nkl$b */
    public class C18728b implements tm2.InterfaceC20213a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AtomicBoolean f139445a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int[] f139446b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int[] f139447c;

        public C18728b(AtomicBoolean atomicBoolean, int[] iArr, int[] iArr2) {
            this.f139445a = atomicBoolean;
            this.f139446b = iArr;
            this.f139447c = iArr2;
        }

        @Override // p149l.tm2.InterfaceC20213a
        /* JADX INFO: renamed from: a */
        public void mo159978a(tm2 tm2Var) {
            nkl.this.m159975M(tm2Var);
        }

        @Override // p149l.tm2.InterfaceC20213a
        /* JADX INFO: renamed from: b */
        public void mo159979b(tm2 tm2Var, String str) {
            if (tm2Var == null) {
                return;
            }
            nkl.this.m170886k("referee http--------一次Ip检测结束 " + nkl.this.f150739c + "[" + tm2Var.m189636c() + Constants.AES_SUFFIX);
            if (!nkl.this.f150738b.get() || !TextUtils.equals(tm2Var.m189634a(), nkl.this.m170877b())) {
                nkl.this.m170885j("tanghttp--------一次检测失败，但是异常处理流程已经结束，放弃 " + tm2Var.m189636c() + ":" + tm2Var.m189635b());
                return;
            }
            synchronized (this.f139445a) {
                try {
                    int[] iArr = this.f139446b;
                    int i = iArr[0] + 1;
                    iArr[0] = i;
                    if (i < this.f139447c[0]) {
                        nkl.this.m170886k("referee http------检测失败，还未完成,已检测次数为 " + this.f139446b[0] + "   备用地址列表数量是 " + nkl.this.f150737a.size());
                    } else if (!this.f139445a.get()) {
                        this.f139445a.set(true);
                        nkl.this.m170885j("referee http------检测成功，完成,已检测次数为 " + this.f139446b[0] + "   备用地址列表数量是 " + nkl.this.f150737a.size());
                        nkl.this.m159977P();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.nkl$c */
    public class C18729c implements cf50 {
        public C18729c() {
        }

        @Override // p149l.cf50
        /* JADX INFO: renamed from: a */
        public void mo106485a() {
            nkl.this.m159961N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public void m159958J() {
        boolean z;
        boolean z2;
        synchronized (this.f150749m) {
            try {
                ArrayList<String> arrayList = this.f150737a;
                z = arrayList == null || arrayList.size() == 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m159977P();
            return;
        }
        m170886k("referee http-----开始检测备用列表");
        int[] iArr = {0};
        C18728b c18728b = new C18728b(new AtomicBoolean(false), new int[]{0}, iArr);
        synchronized (this.f150749m) {
            try {
                if (this.f150737a.size() != 1 || m170881f(this.f150737a.get(0), 0)) {
                    z2 = false;
                } else {
                    m170886k("tanghttp-------备用域名，只有一个：跳过此域名的检测，因为已经连续失败6次 " + this.f150737a.get(0));
                    z2 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z2) {
            m159977P();
            return;
        }
        synchronized (this.f150749m) {
            try {
                for (String str : this.f150737a) {
                    if (m170881f(str, 0)) {
                        iArr[0] = iArr[0] + 1;
                        wjl wjlVar = new wjl(this.f150739c, str);
                        wjlVar.m189637d(c18728b);
                        wjlVar.m203463t(m159960L());
                        wjlVar.m203462s(this.f139442n);
                        wjlVar.m189638e(m170877b());
                        wjlVar.m203464u();
                    } else {
                        m170886k("referee http-------备用域名:跳过此域名的检测，因为已经连续失败6次 " + str);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    private void m159959K() {
        if (!m170881f(this.f150741e, 0)) {
            m170885j("tang-------主域名连续失败超过6次，跳过检测 " + this.f150744h.m170894c());
            m159958J();
            return;
        }
        C18727a c18727a = new C18727a();
        String str = this.f150739c;
        wjl wjlVar = new wjl(str, str);
        wjlVar.m189637d(c18727a);
        wjlVar.m203463t(m159960L());
        wjlVar.m203462s(this.f139442n);
        wjlVar.m189638e(m170877b());
        wjlVar.m203464u();
    }

    /* JADX INFO: renamed from: L */
    private String m159960L() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f139443o ? "https://" : "http://");
        sb.append(this.f150739c);
        sb.append("/nb/ping.txt");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public void m159961N() {
        m170885j("tanghttp-----onRefereeUpdateFinished Referee更新结束，标记异常处理结束 " + this.f150739c);
        this.f150738b.set(false);
        this.f150743g = 0;
    }

    /* JADX INFO: renamed from: Q */
    private void m159962Q() {
        m170884i(this.f150739c + " 进入异常检测流程 ,异常处理次数 " + this.f150743g + "  当前使用域名是 " + this.f150741e);
        boolean zM170883h = m170883h();
        String str = this.f150739c;
        if (zM170883h) {
            m170886k(str + " [异常检测] 直接检测备用域名");
            m159958J();
            return;
        }
        m170886k(str + " [异常检测]优先检测主域名");
        m159959K();
    }

    /* JADX INFO: renamed from: R */
    private void m159963R() {
        m170884i("开始异常处理流程 " + this.f150739c + "[" + this.f150741e + "] 请求失败次数:" + m170880e() + "/" + m170879d());
        m170887l();
        this.f150738b.set(true);
        this.f150743g = this.f150743g + 1;
        m159962Q();
    }

    /* JADX INFO: renamed from: I */
    public void m159974I() {
        if (m170882g()) {
            this.f150738b.set(false);
        } else {
            if (dmc0.m112455e().m112466n(false, new C18729c())) {
                return;
            }
            m159961N();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m159975M(tm2 tm2Var) {
        if (!this.f150738b.get() || !TextUtils.equals(tm2Var.m189634a(), m170877b())) {
            m170885j("referee http--------检测成功，但是异常处理流程已经结束，放弃 " + tm2Var.m189636c() + ":" + tm2Var.m189635b());
            return;
        }
        this.f150738b.set(false);
        m170891p(tm2Var.m189636c());
        this.f150743g = 0;
        m170890o();
        m170876a();
        m170884i(this.f150739c + " Referee异常测试完毕，检测到可用ip是 " + tm2Var.m189636c() + "   [异常处理]流程耗时 " + (System.currentTimeMillis() - this.f150740d));
    }

    /* JADX INFO: renamed from: O */
    public boolean m159976O(String str) {
        m170888m();
        m170889n();
        m170886k("tang-----纪录失败次数 " + m170880e() + "/" + m170879d() + "  请求链接 " + str + "  当前使用的地址是 " + this.f150741e + ":" + this.f150742f);
        if (m170880e() < m170879d()) {
            return false;
        }
        if (this.f150738b.get()) {
            m170886k("tanghttp-----已经进入异常处理流程了 " + (System.currentTimeMillis() - this.f150740d));
            return true;
        }
        if (!na20.m158575f()) {
            m170885j("tanghttp-----网络不可用，不进行异常检测");
            return false;
        }
        this.f150740d = System.currentTimeMillis();
        m159963R();
        return true;
    }

    /* JADX INFO: renamed from: P */
    public void m159977P() {
        if (cmc0.m107608c()) {
            m170884i(this.f150739c + " 单次异常检测流程结束,异常检测次数 " + this.f150743g + " 最大异常检测次数 " + dmc0.m112455e().m112459f());
        }
        int i = this.f150743g;
        int iM112459f = dmc0.m112455e().m112459f();
        String str = this.f150739c;
        if (i < iM112459f) {
            m170884i(str + " [异常处理] 流程失败1次，重新进入[异常处理]");
            m159963R();
            return;
        }
        m170884i(str + " [异常处理] 流程失败了 " + this.f150743g + "次,总共耗时  " + (System.currentTimeMillis() - this.f150740d) + "ms ，开始更新Referee流程");
        this.f150743g = 0;
        m170876a();
        m159974I();
    }

    public String toString() {
        return "主域名 " + this.f150739c + "\n当前使用的地址是 " + this.f150741e + "\nisHttps=" + this.f139443o + "\n最大失败次数=" + m170879d() + "\n备用域名列表是 " + this.f150737a;
    }
}
