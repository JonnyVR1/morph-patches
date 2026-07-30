package p149l;

import android.content.DialogInterface;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveIdCardVerificationInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveIdentity;
import com.p046p1.mobile.putong.live.base.data.BLiveVerificationCenter;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class t320 extends g2l0 {

    /* JADX INFO: renamed from: a */
    public d30 f167586a;

    /* JADX INFO: renamed from: b */
    public boolean f167587b = true;

    public t320(d30 d30Var) {
        this.f167586a = d30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m187105r(Act act, Throwable th) {
        dt0.m113504D(act);
        m124167c(th);
        lsi0.m151578h(R$string.f44923r);
    }

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: a */
    public void mo94566a(final Act act) {
        super.mo94566a(act);
        LivingNormalApiProvider.m71590u5().subscribe(ffw.m121194e(new e30() { // from class: l.p320
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146956a.m187108q(act, (List) obj);
            }
        }, new e30() { // from class: l.q320
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152356a.m187105r(act, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: f */
    public String mo94567f() {
        return "NameVerifyChecker";
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m187108q(final Act act, List<BLiveVerificationCenter> list) {
        boolean z;
        boolean z2;
        BLiveIdentity bLiveIdentity;
        if (vwb.m200296J(list)) {
            z = false;
        } else {
            BLiveIdCardVerificationInfo bLiveIdCardVerificationInfo = list.get(0).idCard;
            z = true;
            if (bLiveIdCardVerificationInfo == null) {
                z2 = false;
            } else if (TEnum.equals(bLiveIdCardVerificationInfo.status, "pending")) {
                if (this.f167587b) {
                    lsi0.m151595y("认证审核中，请稍后再试");
                }
                dt0.m113504D(act);
                return;
            } else if (TEnum.equals(bLiveIdCardVerificationInfo.status, "verified")) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 || (bLiveIdentity = list.get(0).identity) == null) {
                z = z2;
            } else if (TEnum.equals(bLiveIdentity.status, "pending")) {
                if (this.f167587b) {
                    lsi0.m151595y("认证审核中，请稍后再试");
                }
                dt0.m113504D(act);
                return;
            } else if (!TEnum.equals(bLiveIdentity.status, "verified")) {
                z = z2;
            }
        }
        if (z) {
            m124169e(act);
        } else if (this.f167586a != null) {
            new xh0.C21150a(act).m208731j("首次使用视频闪聊请先完成实名认证").m208740s("实名认证").m208727f("取消").m208739r("去认证").m208729h(false).m208733l(new DialogInterface.OnCancelListener() { // from class: l.r320
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    dt0.m113504D(act);
                }
            }).m208736o(new View.OnClickListener() { // from class: l.s320
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f162037a.m187107p(act, view);
                }
            }).m208722a().m208721g();
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m187107p(Act act, View view) {
        dt0.m113504D(act);
        this.f167586a.call();
    }
}
