package p153l;

import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.profile.expandprofilelike.ExpandProfileLikeAct;
import com.p051p1.mobile.putong.data.Detect;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.DetectRequest;
import com.p051p1.mobile.putong.data.DetectText;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.util.AntiSpamHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class clf extends ar2<rlf> {

    /* JADX INFO: renamed from: a */
    public boolean f82374a;

    /* JADX INFO: renamed from: b */
    public final String f82375b;

    /* JADX INFO: renamed from: c */
    public final String f82376c;

    /* JADX INFO: renamed from: d */
    public CoreSuggested.UserInfo f82377d;

    /* JADX INFO: renamed from: e */
    public User f82378e;

    /* JADX INFO: renamed from: f */
    public final int f82379f;

    /* JADX INFO: renamed from: g */
    public ExpandProfileLikeAct f82380g;

    public clf(ner nerVar, String str, String str2, CoreSuggested.UserInfo userInfo, User user, int i) {
        super(nerVar);
        this.f82374a = true;
        this.f82380g = (ExpandProfileLikeAct) nerVar;
        this.f82375b = str;
        this.f82376c = str2;
        this.f82378e = user;
        this.f82379f = i;
        this.f82377d = userInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m110597o0(Bundle bundle) {
        ((rlf) this.viewModel).m181968H(this.f82376c, this.f82377d, this.f82378e, this.f82379f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m110598p0() {
        ((rlf) this.viewModel).m181962A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m110599q0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            if (!this.f82374a) {
                ((rlf) this.viewModel).m181964C();
            }
            this.f82374a = false;
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.vkf
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184481a.m110597o0((Bundle) obj);
            }
        }, new x20() { // from class: l.wkf
            @Override // p153l.x20
            public final void call() {
                this.f189546a.m110598p0();
            }
        });
        m110601m0();
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.xkf
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194783a.m110599q0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m110601m0() {
        if (ln7.m154967b()) {
            lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.ykf
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f200390a.m110602n0((C4470c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m110602n0(C4470c c4470c) {
        if (c4470c == C4470c.f16271m) {
            ((rlf) this.viewModel).m181963B();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C22421c m110603r0(CoreSuggested.UserInfo userInfo, String str, Detect detect) {
        if (!NullChecker.m82486a(detect.text) || detect.text.size() <= 0) {
            return CoreModule.f18264c.f20322K1.m34250v3(userInfo, str);
        }
        if (AntiSpamHelper.m81449a(detect, act().pageId())) {
            o1j0.m165649w(R$string.f19139c0);
        } else {
            r1j0.m179420g(act().getString(R$string.f18634L7));
        }
        ((rlf) this.viewModel).f163751x = false;
        return C22421c.just(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m110604s0(boolean z, String str, Boolean bool) {
        if (bool.booleanValue()) {
            CoreModule.f18264c.f20381e0.m116470H9();
            ((rlf) this.viewModel).f163751x = false;
            m110608y0(z, str);
            m110606u0(str);
            r1j0.m179420g("已发送");
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m110605t0(Throwable th) {
        ((rlf) this.viewModel).f163751x = false;
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: u0 */
    public void m110606u0(String str) {
        CoreModule.f18264c.f20384f0.m33653Fo();
        ((rlf) this.viewModel).m181962A();
        Intent intent = new Intent();
        intent.putExtra(b1a0.f74351b, str);
        this.f82380g.getClass();
        if (NullChecker.m82486a(null)) {
            this.f82380g.getClass();
            throw null;
        }
        act().setResult(SwipeDirection.RIGHT.getValue(), intent);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: x0 */
    public void m110607x0(final CoreSuggested.UserInfo userInfo, final String str, final String str2, final boolean z) {
        DetectRequest detectRequestNew_ = DetectRequest.new_();
        detectRequestNew_.category = DetectCategoryType.get(DetectCategoryType.profile_comment);
        ArrayList arrayList = new ArrayList();
        DetectText detectTextNew_ = DetectText.new_();
        detectTextNew_.key = this.f82376c;
        detectTextNew_.value = str2;
        arrayList.add(detectTextNew_);
        detectRequestNew_.text = arrayList;
        duringCreated((C22421c) yb5.m214988Q(detectRequestNew_).flatMap(new qcj() { // from class: l.zkf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f204771a.m110603r0(userInfo, str, (Detect) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.alf
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72107a.m110604s0(z, str2, (Boolean) obj);
            }
        }, new y20() { // from class: l.blf
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77192a.m110605t0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y0 */
    public final void m110608y0(boolean z, String str) {
        i4g0.m138495D("e_profile_like_send_success", act().pageId(), jyb.m147494Y("have_comment", Boolean.valueOf(z)), jyb.m147494Y("profile_like_comment_content", str));
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l0 */
    public void m110600l0() {
    }
}
