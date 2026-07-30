package com.p046p1.mobile.putong.core.buzz.module;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.buzz.module.CoreBuzzInnerServiceImpl;
import com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService;
import com.p046p1.mobile.putong.core.data.BreakIce;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.media.BuzzMediaCallManager;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.annotation.Route;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p133rx.C22306c;
import p147v.VText;
import p149l.eyl;
import p149l.f6w;
import p149l.g30;
import p149l.h6w;
import p149l.j760;
import p149l.j8w;
import p149l.m6w;
import p149l.mcr;
import p149l.p9w;
import p149l.r4w;
import p149l.t49;
import p149l.u9w;

/* JADX INFO: loaded from: classes9.dex */
@Route(name = "CoreBuzzInnerService", path = "/buzz_service/service")
public class CoreBuzzInnerServiceImpl implements CoreBuzzInnerService {
    /* JADX INFO: renamed from: F */
    public static /* synthetic */ Unit m35090F(String str, eyl eylVar) {
        u9w.INSTANCE.m192672e(str, eylVar);
        return null;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ Unit m35091H() {
        return null;
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Bs */
    public boolean mo35092Bs() {
        return t49.m187149c();
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Da */
    public C22306c<j760<Integer, Boolean>> mo35093Da(String str) {
        return r4w.INSTANCE.m177851F(str);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Dj */
    public void mo35094Dj(VText vText, Double d) {
        r4w.INSTANCE.m177853H(vText, d.doubleValue());
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Fg */
    public void mo35095Fg() {
        p9w.INSTANCE.m167965y0();
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: I7 */
    public void mo35096I7() {
        p9w.INSTANCE.m167943m0();
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Jp */
    public boolean mo35097Jp(String str, String str2) {
        return r4w.INSTANCE.m177846A(str, str2);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Ls */
    public ArrayList<BreakIce> mo35098Ls(int i, Gender gender) {
        return r4w.INSTANCE.m177852G(i, gender);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Nk */
    public LoveBuzzData mo35099Nk() {
        return j8w.INSTANCE.m140473a().m140468v0();
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Pe */
    public boolean mo35100Pe(Conversation conversation) {
        return r4w.INSTANCE.m177859m(conversation);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Pj */
    public boolean mo35101Pj(Conversation conversation) {
        return r4w.INSTANCE.m177864r(conversation);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Uq */
    public String mo35102Uq(long j) {
        return m6w.INSTANCE.m153302g(j);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Wh */
    public String mo35103Wh() {
        return "textBuzz";
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Wl */
    public void mo35104Wl(Act act) {
        f6w.INSTANCE.m119686S(act);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Wr */
    public boolean mo35105Wr(Conversation conversation) {
        return r4w.INSTANCE.m177849D(conversation);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: X7 */
    public boolean mo35106X7(Conversation conversation) {
        return r4w.INSTANCE.m177862p(conversation);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Yg */
    public boolean mo35107Yg() {
        return j8w.INSTANCE.m140473a().m140466t0();
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Zf */
    public void mo35108Zf(mcr mcrVar, String str, String str2, boolean z, boolean z2, g30<Integer, Boolean, Message> g30Var) {
        r4w.INSTANCE.m177857L(mcrVar, str, str2, z, z2, g30Var);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Zm */
    public boolean mo35109Zm(Conversation conversation) {
        return r4w.INSTANCE.m177860n(conversation);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: Zq */
    public String mo35110Zq() {
        return "memojiBuzz";
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: a8 */
    public void mo35111a8(User user, ImageView imageView) {
        u9w.INSTANCE.m192683p(user, imageView);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: e6 */
    public void mo35112e6(final String str, Act act, boolean z, final eyl eylVar) {
        p9w p9wVar = p9w.INSTANCE;
        p9wVar.m167938k(str);
        if (j8w.INSTANCE.m140473a().m140454l0(str, act, z, p9wVar.m167959v(str), new Function0() { // from class: l.v97
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CoreBuzzInnerServiceImpl.m35091H();
            }
        }, new Function0() { // from class: l.w97
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CoreBuzzInnerServiceImpl.m35090F(str, eylVar);
            }
        })) {
            u9w.INSTANCE.m192672e(str, eylVar);
        }
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: fq */
    public boolean mo35113fq(Conversation conversation) {
        return r4w.INSTANCE.m177858l(conversation);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: gh */
    public boolean mo35114gh(String str, String str2) {
        return r4w.INSTANCE.m177847B(str, str2);
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: io */
    public void mo35115io(int i, String str) {
        h6w.INSTANCE.m129531c(i, str);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: l9 */
    public void mo35116l9(Act act, String str) {
        j8w.INSTANCE.m140473a().m140432R0(act, str);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: la */
    public boolean mo35117la(long j) {
        return r4w.INSTANCE.m177866t(Long.valueOf(j));
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: lo */
    public boolean mo35118lo(Conversation conversation) {
        return r4w.INSTANCE.m177868v(conversation);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: mf */
    public void mo35119mf(Context context, VText vText, String str) {
        r4w.INSTANCE.m177854I(context, vText, str);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: nl */
    public boolean mo35120nl(Conversation conversation) {
        return r4w.INSTANCE.m177865s(conversation);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: nt */
    public void mo35121nt(User user, TextView textView) {
        u9w.INSTANCE.m192682o(user, textView, 18.0f, 18.0f);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: of */
    public boolean mo35122of() {
        return BuzzMediaCallManager.INSTANCE.m46952Q();
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: ra */
    public String mo35123ra() {
        return "videoBuzz";
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: sc */
    public boolean mo35124sc(Conversation conversation) {
        return r4w.INSTANCE.m177867u(conversation);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: tj */
    public String mo35125tj() {
        return "voiceBuzz";
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: v6 */
    public boolean mo35126v6(Conversation conversation) {
        return r4w.INSTANCE.m177863q(conversation);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: vg */
    public C22306c<j760<Integer, Boolean>> mo35127vg(Conversation conversation, String str) {
        return r4w.INSTANCE.m177850E(conversation, str);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: w9 */
    public void mo35128w9(String str) {
        p9w.INSTANCE.m167940l(str);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: wo */
    public void mo35129wo() {
        p9w.INSTANCE.m167967z0();
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: x3 */
    public boolean mo35130x3() {
        return t49.m187150d();
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: xk */
    public boolean mo35131xk() {
        return h6w.INSTANCE.m129535g();
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: xp */
    public void mo35132xp(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i) {
        u9w.INSTANCE.m192673f(simpleDraweeView, imageUri, i);
    }

    @Override // com.p046p1.mobile.putong.core.buzz.service.CoreBuzzInnerService
    /* JADX INFO: renamed from: zo */
    public boolean mo35133zo(Conversation conversation) {
        return r4w.INSTANCE.m177861o(conversation);
    }
}
