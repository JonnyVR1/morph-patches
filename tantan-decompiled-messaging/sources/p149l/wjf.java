package p149l;

import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.profile.expandprofilelike.ExpandProfileLikeAct;
import com.p046p1.mobile.putong.data.Detect;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.DetectRequest;
import com.p046p1.mobile.putong.data.DetectText;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.util.AntiSpamHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class wjf extends jq2<lkf> {

    /* JADX INFO: renamed from: a */
    public boolean f186629a;

    /* JADX INFO: renamed from: b */
    public final String f186630b;

    /* JADX INFO: renamed from: c */
    public final String f186631c;

    /* JADX INFO: renamed from: d */
    public CoreSuggested.UserInfo f186632d;

    /* JADX INFO: renamed from: e */
    public User f186633e;

    /* JADX INFO: renamed from: f */
    public final int f186634f;

    /* JADX INFO: renamed from: g */
    public ExpandProfileLikeAct f186635g;

    public wjf(mcr mcrVar, String str, String str2, CoreSuggested.UserInfo userInfo, User user, int i) {
        super(mcrVar);
        this.f186629a = true;
        this.f186635g = (ExpandProfileLikeAct) mcrVar;
        this.f186630b = str;
        this.f186631c = str2;
        this.f186633e = user;
        this.f186634f = i;
        this.f186632d = userInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m203424o0(Bundle bundle) {
        ((lkf) this.viewModel).m150245H(this.f186631c, this.f186632d, this.f186633e, this.f186634f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m203425p0() {
        ((lkf) this.viewModel).m150239A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m203426q0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            if (!this.f186629a) {
                ((lkf) this.viewModel).m150241C();
            }
            this.f186629a = false;
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.pjf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f149772a.m203424o0((Bundle) obj);
            }
        }, new d30() { // from class: l.qjf
            @Override // p149l.d30
            public final void call() {
                this.f154921a.m203425p0();
            }
        });
        m203428m0();
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.rjf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159679a.m203426q0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m203428m0() {
        if (hm7.m131700b()) {
            lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.sjf
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f164833a.m203429n0((C4319c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m203429n0(C4319c c4319c) {
        if (c4319c == C4319c.f15552m) {
            ((lkf) this.viewModel).m150240B();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C22306c m203430r0(CoreSuggested.UserInfo userInfo, String str, Detect detect) {
        if (!NullChecker.m81303a(detect.text) || detect.text.size() <= 0) {
            return CoreModule.f17545c.f19580K1.m33247v3(userInfo, str);
        }
        if (AntiSpamHelper.m80266a(detect, act().pageId())) {
            lsi0.m151593w(R$string.f18409c0);
        } else {
            osi0.m165783g(act().getString(R$string.f17844J7));
        }
        ((lkf) this.viewModel).f128522x = false;
        return C22306c.just(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m203431s0(boolean z, String str, Boolean bool) {
        if (bool.booleanValue()) {
            CoreModule.f17545c.f19639e0.m169397H9();
            ((lkf) this.viewModel).f128522x = false;
            m203435y0(z, str);
            m203433u0(str);
            osi0.m165783g("已发送");
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m203432t0(Throwable th) {
        ((lkf) this.viewModel).f128522x = false;
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: u0 */
    public void m203433u0(String str) {
        CoreModule.f17545c.f19642f0.m32650Fo();
        ((lkf) this.viewModel).m150239A();
        Intent intent = new Intent();
        intent.putExtra(xs90.f194214b, str);
        this.f186635g.getClass();
        if (NullChecker.m81303a(null)) {
            this.f186635g.getClass();
            throw null;
        }
        act().setResult(SwipeDirection.RIGHT.getValue(), intent);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: x0 */
    public void m203434x0(final CoreSuggested.UserInfo userInfo, final String str, final String str2, final boolean z) {
        DetectRequest detectRequestNew_ = DetectRequest.new_();
        detectRequestNew_.category = DetectCategoryType.get(DetectCategoryType.profile_comment);
        ArrayList arrayList = new ArrayList();
        DetectText detectTextNew_ = DetectText.new_();
        detectTextNew_.key = this.f186631c;
        detectTextNew_.value = str2;
        arrayList.add(detectTextNew_);
        detectRequestNew_.text = arrayList;
        duringCreated((C22306c) ya5.m213801Q(detectRequestNew_).flatMap(new w9j() { // from class: l.tjf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f170712a.m203430r0(userInfo, str, (Detect) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.ujf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176763a.m203431s0(z, str2, (Boolean) obj);
            }
        }, new e30() { // from class: l.vjf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181683a.m203432t0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y0 */
    public final void m203435y0(boolean z, String str) {
        zvf0.m220371D("e_profile_like_send_success", act().pageId(), vwb.m200311Y("have_comment", Boolean.valueOf(z)), vwb.m200311Y("profile_like_comment_content", str));
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l0 */
    public void m203427l0() {
    }
}
