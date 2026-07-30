package com.p000p1.mobile.putong.core.buzz.module;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.buzz.module.CoreBuzzInnerServiceImpl;
import com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.BreakIce;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.LoveBuzzData;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.annotation.Route;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import l.eyl;
import l.f6w;
import l.g30;
import l.h6w;
import l.j760;
import l.j8w;
import l.m6w;
import l.mcr;
import l.p9w;
import l.r4w;
import l.u9w;
import p006l.t49;
import rx.c;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Route(name = "CoreBuzzInnerService", path = "/buzz_service/service")
public class CoreBuzzInnerServiceImpl implements CoreBuzzInnerService {
    /* JADX INFO: renamed from: F */
    public static /* synthetic */ Unit m7027F(String str, eyl eylVar) {
        u9w.INSTANCE.e(str, eylVar);
        return null;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ Unit m7028H() {
        return null;
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Bs */
    public boolean mo7029Bs() {
        return t49.m24448c();
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Da */
    public c<j760<Integer, Boolean>> mo7030Da(String str) {
        return r4w.INSTANCE.F(str);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Dj */
    public void mo7031Dj(VText vText, Double d) {
        r4w.INSTANCE.H(vText, d.doubleValue());
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Fg */
    public void mo7032Fg() {
        p9w.INSTANCE.y0();
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: I7 */
    public void mo7033I7() {
        p9w.INSTANCE.m0();
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Jp */
    public boolean mo7034Jp(String str, String str2) {
        return r4w.INSTANCE.A(str, str2);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Ls */
    public ArrayList<BreakIce> mo7035Ls(int i, Gender gender) {
        return r4w.INSTANCE.G(i, gender);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Nk */
    public LoveBuzzData mo7036Nk() {
        return j8w.Companion.a().v0();
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Pe */
    public boolean mo7037Pe(Conversation conversation) {
        return r4w.INSTANCE.m(conversation);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Pj */
    public boolean mo7038Pj(Conversation conversation) {
        return r4w.INSTANCE.r(conversation);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Uq */
    public String mo7039Uq(long j) {
        return m6w.INSTANCE.g(j);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Wh */
    public String mo7040Wh() {
        return "textBuzz";
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Wl */
    public void mo7041Wl(Act act) {
        f6w.INSTANCE.S(act);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Wr */
    public boolean mo7042Wr(Conversation conversation) {
        return r4w.INSTANCE.D(conversation);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: X7 */
    public boolean mo7043X7(Conversation conversation) {
        return r4w.INSTANCE.p(conversation);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Yg */
    public boolean mo7044Yg() {
        return j8w.Companion.a().t0();
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Zf */
    public void mo7045Zf(mcr mcrVar, String str, String str2, boolean z, boolean z2, g30<Integer, Boolean, Message> g30Var) {
        r4w.INSTANCE.L(mcrVar, str, str2, z, z2, g30Var);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Zm */
    public boolean mo7046Zm(Conversation conversation) {
        return r4w.INSTANCE.n(conversation);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Zq */
    public String mo7047Zq() {
        return "memojiBuzz";
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: a8 */
    public void mo7048a8(User user, ImageView imageView) {
        u9w.INSTANCE.p(user, imageView);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: e6 */
    public void mo7049e6(final String str, Act act, boolean z, final eyl eylVar) {
        p9w p9wVar = p9w.INSTANCE;
        p9wVar.k(str);
        if (j8w.Companion.a().l0(str, act, z, p9wVar.v(str), new Function0() { // from class: l.v97
            public final Object invoke() {
                return CoreBuzzInnerServiceImpl.m7028H();
            }
        }, new Function0() { // from class: l.w97
            public final Object invoke() {
                return CoreBuzzInnerServiceImpl.m7027F(str, eylVar);
            }
        })) {
            u9w.INSTANCE.e(str, eylVar);
        }
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: fq */
    public boolean mo7050fq(Conversation conversation) {
        return r4w.INSTANCE.l(conversation);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: gh */
    public boolean mo7051gh(String str, String str2) {
        return r4w.INSTANCE.B(str, str2);
    }

    public void init(Context context) {
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: io */
    public void mo7052io(int i, String str) {
        h6w.INSTANCE.c(i, str);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: l9 */
    public void mo7053l9(Act act, String str) {
        j8w.Companion.a().R0(act, str);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: la */
    public boolean mo7054la(long j) {
        return r4w.INSTANCE.t(Long.valueOf(j));
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: lo */
    public boolean mo7055lo(Conversation conversation) {
        return r4w.INSTANCE.v(conversation);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: mf */
    public void mo7056mf(Context context, VText vText, String str) {
        r4w.INSTANCE.I(context, vText, str);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: nl */
    public boolean mo7057nl(Conversation conversation) {
        return r4w.INSTANCE.s(conversation);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: nt */
    public void mo7058nt(User user, TextView textView) {
        u9w.INSTANCE.o(user, textView, 18.0f, 18.0f);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: of */
    public boolean mo7059of() {
        return BuzzMediaCallManager.INSTANCE.Q();
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: ra */
    public String mo7060ra() {
        return "videoBuzz";
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: sc */
    public boolean mo7061sc(Conversation conversation) {
        return r4w.INSTANCE.u(conversation);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: tj */
    public String mo7062tj() {
        return "voiceBuzz";
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: v6 */
    public boolean mo7063v6(Conversation conversation) {
        return r4w.INSTANCE.q(conversation);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: vg */
    public c<j760<Integer, Boolean>> mo7064vg(Conversation conversation, String str) {
        return r4w.INSTANCE.E(conversation, str);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: w9 */
    public void mo7065w9(String str) {
        p9w.INSTANCE.l(str);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: wo */
    public void mo7066wo() {
        p9w.INSTANCE.z0();
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: x3 */
    public boolean mo7067x3() {
        return t49.m24449d();
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: xk */
    public boolean mo7068xk() {
        return h6w.INSTANCE.g();
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: xp */
    public void mo7069xp(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i) {
        u9w.INSTANCE.f(simpleDraweeView, imageUri, i);
    }

    @Override // com.p000p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: zo */
    public boolean mo7070zo(Conversation conversation) {
        return r4w.INSTANCE.o(conversation);
    }
}
