package com.p000p1.mobile.putong.core.buzz.service;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.BreakIce;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.LoveBuzzData;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.template.IProvider;
import java.util.ArrayList;
import l.eyl;
import l.g30;
import l.j760;
import l.mcr;
import rx.c;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public interface CoreBuzzInnerService extends IProvider {
    /* JADX INFO: renamed from: Bs */
    boolean mo7029Bs();

    /* JADX INFO: renamed from: Da */
    c<j760<Integer, Boolean>> mo7030Da(String str);

    /* JADX INFO: renamed from: Dj */
    void mo7031Dj(VText vText, Double d);

    /* JADX INFO: renamed from: Fg */
    void mo7032Fg();

    /* JADX INFO: renamed from: I7 */
    void mo7033I7();

    /* JADX INFO: renamed from: Jp */
    boolean mo7034Jp(String str, String str2);

    /* JADX INFO: renamed from: Ls */
    ArrayList<BreakIce> mo7035Ls(int i, Gender gender);

    /* JADX INFO: renamed from: Nk */
    LoveBuzzData mo7036Nk();

    /* JADX INFO: renamed from: Pe */
    boolean mo7037Pe(Conversation conversation);

    /* JADX INFO: renamed from: Pj */
    boolean mo7038Pj(Conversation conversation);

    /* JADX INFO: renamed from: Uq */
    String mo7039Uq(long j);

    /* JADX INFO: renamed from: Wh */
    String mo7040Wh();

    /* JADX INFO: renamed from: Wl */
    void mo7041Wl(Act act);

    /* JADX INFO: renamed from: Wr */
    boolean mo7042Wr(Conversation conversation);

    /* JADX INFO: renamed from: X7 */
    boolean mo7043X7(Conversation conversation);

    /* JADX INFO: renamed from: Yg */
    boolean mo7044Yg();

    /* JADX INFO: renamed from: Zf */
    void mo7045Zf(mcr mcrVar, String str, String str2, boolean z, boolean z2, g30<Integer, Boolean, Message> g30Var);

    /* JADX INFO: renamed from: Zm */
    boolean mo7046Zm(Conversation conversation);

    /* JADX INFO: renamed from: Zq */
    String mo7047Zq();

    /* JADX INFO: renamed from: a8 */
    void mo7048a8(User user, ImageView imageView);

    /* JADX INFO: renamed from: e6 */
    void mo7049e6(String str, Act act, boolean z, eyl eylVar);

    /* JADX INFO: renamed from: fq */
    boolean mo7050fq(Conversation conversation);

    /* JADX INFO: renamed from: gh */
    boolean mo7051gh(String str, String str2);

    /* JADX INFO: renamed from: io */
    void mo7052io(int i, String str);

    /* JADX INFO: renamed from: l9 */
    void mo7053l9(Act act, String str);

    /* JADX INFO: renamed from: la */
    boolean mo7054la(long j);

    /* JADX INFO: renamed from: lo */
    boolean mo7055lo(Conversation conversation);

    /* JADX INFO: renamed from: mf */
    void mo7056mf(Context context, VText vText, String str);

    /* JADX INFO: renamed from: nl */
    boolean mo7057nl(Conversation conversation);

    /* JADX INFO: renamed from: nt */
    void mo7058nt(User user, TextView textView);

    /* JADX INFO: renamed from: of */
    boolean mo7059of();

    /* JADX INFO: renamed from: ra */
    String mo7060ra();

    /* JADX INFO: renamed from: sc */
    boolean mo7061sc(Conversation conversation);

    /* JADX INFO: renamed from: tj */
    String mo7062tj();

    /* JADX INFO: renamed from: v6 */
    boolean mo7063v6(Conversation conversation);

    /* JADX INFO: renamed from: vg */
    c<j760<Integer, Boolean>> mo7064vg(Conversation conversation, String str);

    /* JADX INFO: renamed from: w9 */
    void mo7065w9(String str);

    /* JADX INFO: renamed from: wo */
    void mo7066wo();

    /* JADX INFO: renamed from: x3 */
    boolean mo7067x3();

    /* JADX INFO: renamed from: xk */
    boolean mo7068xk();

    /* JADX INFO: renamed from: xp */
    void mo7069xp(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i);

    /* JADX INFO: renamed from: zo */
    boolean mo7070zo(Conversation conversation);
}
