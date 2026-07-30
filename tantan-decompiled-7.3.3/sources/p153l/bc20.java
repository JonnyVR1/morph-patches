package p153l;

import android.content.DialogInterface;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveIdCardVerificationInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveIdentity;
import com.p051p1.mobile.putong.live.base.data.BLiveVerificationCenter;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class bc20 extends lbl0 {

    /* JADX INFO: renamed from: a */
    public x20 f76090a;

    /* JADX INFO: renamed from: b */
    public boolean f76091b = true;

    public bc20(x20 x20Var) {
        this.f76090a = x20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m103481r(Act act, Throwable th) {
        it0.m142010D(act);
        m153581c(th);
        o1j0.m165634h(R$string.f45771r);
    }

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: a */
    public void mo96996a(final Act act) {
        super.mo96996a(act);
        LivingNormalApiProvider.m72773u5().subscribe(dhw.m115826e(new y20() { // from class: l.xb20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193121a.m103484q(act, (List) obj);
            }
        }, new y20() { // from class: l.yb20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198270a.m103481r(act, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: f */
    public String mo96997f() {
        return "NameVerifyChecker";
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m103484q(final Act act, List<BLiveVerificationCenter> list) {
        boolean z;
        boolean z2;
        BLiveIdentity bLiveIdentity;
        if (jyb.m147479J(list)) {
            z = false;
        } else {
            BLiveIdCardVerificationInfo bLiveIdCardVerificationInfo = list.get(0).idCard;
            z = true;
            if (bLiveIdCardVerificationInfo == null) {
                z2 = false;
            } else if (TEnum.equals(bLiveIdCardVerificationInfo.status, "pending")) {
                if (this.f76091b) {
                    o1j0.m165651y("认证审核中，请稍后再试");
                }
                it0.m142010D(act);
                return;
            } else if (TEnum.equals(bLiveIdCardVerificationInfo.status, "verified")) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 || (bLiveIdentity = list.get(0).identity) == null) {
                z = z2;
            } else if (TEnum.equals(bLiveIdentity.status, "pending")) {
                if (this.f76091b) {
                    o1j0.m165651y("认证审核中，请稍后再试");
                }
                it0.m142010D(act);
                return;
            } else if (!TEnum.equals(bLiveIdentity.status, "verified")) {
                z = z2;
            }
        }
        if (z) {
            m153583e(act);
        } else if (this.f76090a != null) {
            new th0.C20312a(act).m191151j("首次使用视频闪聊请先完成实名认证").m191160s("实名认证").m191147f("取消").m191159r("去认证").m191149h(false).m191153l(new DialogInterface.OnCancelListener() { // from class: l.zb20
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    it0.m142010D(act);
                }
            }).m191156o(new View.OnClickListener() { // from class: l.ac20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f69671a.m103483p(act, view);
                }
            }).m191142a().m191141g();
        }
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m103483p(Act act, View view) {
        it0.m142010D(act);
        this.f76090a.call();
    }
}
