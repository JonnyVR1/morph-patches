package com.p051p1.mobile.putong.core.buzz.module;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.buzz.module.CoreBuzzInnerServiceImpl;
import com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService;
import com.p051p1.mobile.putong.core.data.BreakIce;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.LoveBuzzData;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzMediaCallManager;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.annotation.Route;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p137rx.C22421c;
import p151v.VText;
import p153l.a30;
import p153l.c69;
import p153l.d8w;
import p153l.f8w;
import p153l.haw;
import p153l.k8w;
import p153l.nbw;
import p153l.ner;
import p153l.p6w;
import p153l.pf60;
import p153l.sbw;
import p153l.x0m;

/* JADX INFO: loaded from: classes9.dex */
@Route(name = "CoreBuzzInnerService", path = "/buzz_service/service")
public class CoreBuzzInnerServiceImpl implements CoreBuzzInnerService {
    /* JADX INFO: renamed from: F */
    public static /* synthetic */ Unit m36093F(String str, x0m x0mVar) {
        sbw.INSTANCE.m185340e(str, x0mVar);
        return null;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ Unit m36094H() {
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Bs */
    public boolean mo36095Bs() {
        return c69.m108117c();
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Da */
    public C22421c<pf60<Integer, Boolean>> mo36096Da(String str) {
        return p6w.INSTANCE.m171058F(str);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Dj */
    public void mo36097Dj(VText vText, Double d) {
        p6w.INSTANCE.m171060H(vText, d.doubleValue());
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Fg */
    public void mo36098Fg() {
        nbw.INSTANCE.m162269y0();
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: I7 */
    public void mo36099I7() {
        nbw.INSTANCE.m162247m0();
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Jp */
    public boolean mo36100Jp(String str, String str2) {
        return p6w.INSTANCE.m171053A(str, str2);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Ls */
    public ArrayList<BreakIce> mo36101Ls(int i, Gender gender) {
        return p6w.INSTANCE.m171059G(i, gender);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Nk */
    public LoveBuzzData mo36102Nk() {
        return haw.INSTANCE.m134320a().m134315v0();
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Pe */
    public boolean mo36103Pe(Conversation conversation) {
        return p6w.INSTANCE.m171066m(conversation);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Pj */
    public boolean mo36104Pj(Conversation conversation) {
        return p6w.INSTANCE.m171071r(conversation);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Uq */
    public String mo36105Uq(long j) {
        return k8w.INSTANCE.m148758g(j);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Wh */
    public String mo36106Wh() {
        return "textBuzz";
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Wl */
    public void mo36107Wl(Act act) {
        d8w.INSTANCE.m114971S(act);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Wr */
    public boolean mo36108Wr(Conversation conversation) {
        return p6w.INSTANCE.m171056D(conversation);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: X7 */
    public boolean mo36109X7(Conversation conversation) {
        return p6w.INSTANCE.m171069p(conversation);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Yg */
    public boolean mo36110Yg() {
        return haw.INSTANCE.m134320a().m134313t0();
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Zf */
    public void mo36111Zf(ner nerVar, String str, String str2, boolean z, boolean z2, a30<Integer, Boolean, Message> a30Var) {
        p6w.INSTANCE.m171064L(nerVar, str, str2, z, z2, a30Var);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Zm */
    public boolean mo36112Zm(Conversation conversation) {
        return p6w.INSTANCE.m171067n(conversation);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Zq */
    public String mo36113Zq() {
        return "memojiBuzz";
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: a8 */
    public void mo36114a8(User user, ImageView imageView) {
        sbw.INSTANCE.m185351p(user, imageView);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: e6 */
    public void mo36115e6(final String str, Act act, boolean z, final x0m x0mVar) {
        nbw nbwVar = nbw.INSTANCE;
        nbwVar.m162242k(str);
        if (haw.INSTANCE.m134320a().m134301l0(str, act, z, nbwVar.m162263v(str), new Function0() { // from class: l.za7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CoreBuzzInnerServiceImpl.m36094H();
            }
        }, new Function0() { // from class: l.ab7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CoreBuzzInnerServiceImpl.m36093F(str, x0mVar);
            }
        })) {
            sbw.INSTANCE.m185340e(str, x0mVar);
        }
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: fq */
    public boolean mo36116fq(Conversation conversation) {
        return p6w.INSTANCE.m171065l(conversation);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: gh */
    public boolean mo36117gh(String str, String str2) {
        return p6w.INSTANCE.m171054B(str, str2);
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: io */
    public void mo36118io(int i, String str) {
        f8w.INSTANCE.m124567c(i, str);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: l9 */
    public void mo36119l9(Act act, String str) {
        haw.INSTANCE.m134320a().m134279R0(act, str);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: la */
    public boolean mo36120la(long j) {
        return p6w.INSTANCE.m171073t(Long.valueOf(j));
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: lo */
    public boolean mo36121lo(Conversation conversation) {
        return p6w.INSTANCE.m171075v(conversation);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: mf */
    public void mo36122mf(Context context, VText vText, String str) {
        p6w.INSTANCE.m171061I(context, vText, str);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: nl */
    public boolean mo36123nl(Conversation conversation) {
        return p6w.INSTANCE.m171072s(conversation);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: nt */
    public void mo36124nt(User user, TextView textView) {
        sbw.INSTANCE.m185350o(user, textView, 18.0f, 18.0f);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: of */
    public boolean mo36125of() {
        return BuzzMediaCallManager.INSTANCE.m48135Q();
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: ra */
    public String mo36126ra() {
        return "videoBuzz";
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: sc */
    public boolean mo36127sc(Conversation conversation) {
        return p6w.INSTANCE.m171074u(conversation);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: tj */
    public String mo36128tj() {
        return "voiceBuzz";
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: v6 */
    public boolean mo36129v6(Conversation conversation) {
        return p6w.INSTANCE.m171070q(conversation);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: vg */
    public C22421c<pf60<Integer, Boolean>> mo36130vg(Conversation conversation, String str) {
        return p6w.INSTANCE.m171057E(conversation, str);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: w9 */
    public void mo36131w9(String str) {
        nbw.INSTANCE.m162244l(str);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: wo */
    public void mo36132wo() {
        nbw.INSTANCE.m162271z0();
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: x3 */
    public boolean mo36133x3() {
        return c69.m108118d();
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: xk */
    public boolean mo36134xk() {
        return f8w.INSTANCE.m124571g();
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: xp */
    public void mo36135xp(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i) {
        sbw.INSTANCE.m185341f(simpleDraweeView, imageUri, i);
    }

    @Override // com.p051p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: zo */
    public boolean mo36136zo(Conversation conversation) {
        return p6w.INSTANCE.m171068o(conversation);
    }
}
