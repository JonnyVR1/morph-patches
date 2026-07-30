package p009l;

import android.content.Intent;
import android.os.Bundle;
import com.p000p1.mobile.putong.core.newui.profile.expandprofilelike.ExpandProfileLikeAct;
import com.p000p1.mobile.putong.util.AntiSpamHelper;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.Detect;
import com.p1.mobile.putong.data.DetectCategoryType;
import com.p1.mobile.putong.data.DetectRequest;
import com.p1.mobile.putong.data.DetectText;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.d30;
import l.e30;
import l.hm7;
import l.j760;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.osi0;
import l.vwb;
import l.w9j;
import l.xs90;
import l.ya5;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wjf extends jq2<lkf> {

    /* JADX INFO: renamed from: a */
    public boolean f22160a;

    /* JADX INFO: renamed from: b */
    public final String f22161b;

    /* JADX INFO: renamed from: c */
    public final String f22162c;

    /* JADX INFO: renamed from: d */
    public CoreSuggested.UserInfo f22163d;

    /* JADX INFO: renamed from: e */
    public User f22164e;

    /* JADX INFO: renamed from: f */
    public final int f22165f;

    /* JADX INFO: renamed from: g */
    public ExpandProfileLikeAct f22166g;

    public wjf(mcr mcrVar, String str, String str2, CoreSuggested.UserInfo userInfo, User user, int i) {
        super(mcrVar);
        this.f22160a = true;
        this.f22166g = (ExpandProfileLikeAct) mcrVar;
        this.f22161b = str;
        this.f22162c = str2;
        this.f22164e = user;
        this.f22165f = i;
        this.f22163d = userInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m24275o0(Bundle bundle) {
        ((lkf) ((jq2) this).viewModel).m17930H(this.f22162c, this.f22163d, this.f22164e, this.f22165f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m24276p0() {
        ((lkf) ((jq2) this).viewModel).m17923A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m24277q0(c cVar) {
        if (cVar == c.i) {
            if (!this.f22160a) {
                ((lkf) ((jq2) this).viewModel).m17925C();
            }
            this.f22160a = false;
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m24278Z() {
        super.Z();
    }

    /* JADX INFO: renamed from: a0 */
    public void m24279a0() {
        super.a0();
        creates(new e30() { // from class: l.pjf
            public final void call(Object obj) {
                this.f18756a.m24275o0((Bundle) obj);
            }
        }, new d30() { // from class: l.qjf
            public final void call() {
                this.f19360a.m24276p0();
            }
        });
        m24281m0();
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.rjf
            public final void call(Object obj) {
                this.f19864a.m24277q0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m24281m0() {
        if (hm7.b()) {
            lifecycle().subscribe(mkd0.G(new e30() { // from class: l.sjf
                public final void call(Object obj) {
                    this.f20314a.m24282n0((c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m24282n0(c cVar) {
        if (cVar == c.m) {
            ((lkf) ((jq2) this).viewModel).m17924B();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ rx.c m24283r0(CoreSuggested.UserInfo userInfo, String str, Detect detect) {
        if (!NullChecker.a(detect.text) || detect.text.size() <= 0) {
            return CoreModule.c.K1.v3(userInfo, str);
        }
        if (AntiSpamHelper.m10617a(detect, act().pageId())) {
            lsi0.w(R.string.c0);
        } else {
            osi0.g(act().getString(R.string.J7));
        }
        ((lkf) ((jq2) this).viewModel).f16236x = false;
        return rx.c.just(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m24284s0(boolean z, String str, Boolean bool) {
        if (bool.booleanValue()) {
            CoreModule.c.e0.H9();
            ((lkf) ((jq2) this).viewModel).f16236x = false;
            m24288y0(z, str);
            m24286u0(str);
            osi0.g("已发送");
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m24285t0(Throwable th) {
        ((lkf) ((jq2) this).viewModel).f16236x = false;
        yij0.m25382D(th);
    }

    /* JADX INFO: renamed from: u0 */
    public void m24286u0(String str) {
        CoreModule.c.f0.Fo();
        ((lkf) ((jq2) this).viewModel).m17923A();
        Intent intent = new Intent();
        intent.putExtra(xs90.b, str);
        this.f22166g.getClass();
        if (NullChecker.a((Object) null)) {
            this.f22166g.getClass();
            throw null;
        }
        act().setResult(SwipeDirection.RIGHT.getValue(), intent);
        act().finish();
    }

    /* JADX INFO: renamed from: x0 */
    public void m24287x0(final CoreSuggested.UserInfo userInfo, final String str, final String str2, final boolean z) {
        DetectRequest detectRequestNew_ = DetectRequest.new_();
        detectRequestNew_.category = DetectCategoryType.get("profile_comment");
        ArrayList arrayList = new ArrayList();
        DetectText detectTextNew_ = DetectText.new_();
        detectTextNew_.key = this.f22162c;
        detectTextNew_.value = str2;
        arrayList.add(detectTextNew_);
        detectRequestNew_.text = arrayList;
        duringCreated(ya5.Q(detectRequestNew_).flatMap(new w9j() { // from class: l.tjf
            public final Object call(Object obj) {
                return this.f20730a.m24283r0(userInfo, str, (Detect) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.ujf
            public final void call(Object obj) {
                this.f21218a.m24284s0(z, str2, (Boolean) obj);
            }
        }, new e30() { // from class: l.vjf
            public final void call(Object obj) {
                this.f21604a.m24285t0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y0 */
    public final void m24288y0(boolean z, String str) {
        zvf0.D("e_profile_like_send_success", act().pageId(), new j760[]{vwb.Y("have_comment", Boolean.valueOf(z)), vwb.Y("profile_like_comment_content", str)});
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l0 */
    public void m24280l0() {
    }
}
