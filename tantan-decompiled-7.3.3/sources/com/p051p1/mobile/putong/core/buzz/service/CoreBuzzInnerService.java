package com.p051p1.mobile.putong.core.buzz.service;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.BreakIce;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.LoveBuzzData;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.template.IProvider;
import java.util.ArrayList;
import p137rx.C22421c;
import p151v.VText;
import p153l.a30;
import p153l.ner;
import p153l.pf60;
import p153l.x0m;

/* JADX INFO: loaded from: classes9.dex */
public interface CoreBuzzInnerService extends IProvider {
    /* JADX INFO: renamed from: Bs */
    boolean mo36095Bs();

    /* JADX INFO: renamed from: Da */
    C22421c<pf60<Integer, Boolean>> mo36096Da(String str);

    /* JADX INFO: renamed from: Dj */
    void mo36097Dj(VText vText, Double d);

    /* JADX INFO: renamed from: Fg */
    void mo36098Fg();

    /* JADX INFO: renamed from: I7 */
    void mo36099I7();

    /* JADX INFO: renamed from: Jp */
    boolean mo36100Jp(String str, String str2);

    /* JADX INFO: renamed from: Ls */
    ArrayList<BreakIce> mo36101Ls(int i, Gender gender);

    /* JADX INFO: renamed from: Nk */
    LoveBuzzData mo36102Nk();

    /* JADX INFO: renamed from: Pe */
    boolean mo36103Pe(Conversation conversation);

    /* JADX INFO: renamed from: Pj */
    boolean mo36104Pj(Conversation conversation);

    /* JADX INFO: renamed from: Uq */
    String mo36105Uq(long j);

    /* JADX INFO: renamed from: Wh */
    String mo36106Wh();

    /* JADX INFO: renamed from: Wl */
    void mo36107Wl(Act act);

    /* JADX INFO: renamed from: Wr */
    boolean mo36108Wr(Conversation conversation);

    /* JADX INFO: renamed from: X7 */
    boolean mo36109X7(Conversation conversation);

    /* JADX INFO: renamed from: Yg */
    boolean mo36110Yg();

    /* JADX INFO: renamed from: Zf */
    void mo36111Zf(ner nerVar, String str, String str2, boolean z, boolean z2, a30<Integer, Boolean, Message> a30Var);

    /* JADX INFO: renamed from: Zm */
    boolean mo36112Zm(Conversation conversation);

    /* JADX INFO: renamed from: Zq */
    String mo36113Zq();

    /* JADX INFO: renamed from: a8 */
    void mo36114a8(User user, ImageView imageView);

    /* JADX INFO: renamed from: e6 */
    void mo36115e6(String str, Act act, boolean z, x0m x0mVar);

    /* JADX INFO: renamed from: fq */
    boolean mo36116fq(Conversation conversation);

    /* JADX INFO: renamed from: gh */
    boolean mo36117gh(String str, String str2);

    /* JADX INFO: renamed from: io */
    void mo36118io(int i, String str);

    /* JADX INFO: renamed from: l9 */
    void mo36119l9(Act act, String str);

    /* JADX INFO: renamed from: la */
    boolean mo36120la(long j);

    /* JADX INFO: renamed from: lo */
    boolean mo36121lo(Conversation conversation);

    /* JADX INFO: renamed from: mf */
    void mo36122mf(Context context, VText vText, String str);

    /* JADX INFO: renamed from: nl */
    boolean mo36123nl(Conversation conversation);

    /* JADX INFO: renamed from: nt */
    void mo36124nt(User user, TextView textView);

    /* JADX INFO: renamed from: of */
    boolean mo36125of();

    /* JADX INFO: renamed from: ra */
    String mo36126ra();

    /* JADX INFO: renamed from: sc */
    boolean mo36127sc(Conversation conversation);

    /* JADX INFO: renamed from: tj */
    String mo36128tj();

    /* JADX INFO: renamed from: v6 */
    boolean mo36129v6(Conversation conversation);

    /* JADX INFO: renamed from: vg */
    C22421c<pf60<Integer, Boolean>> mo36130vg(Conversation conversation, String str);

    /* JADX INFO: renamed from: w9 */
    void mo36131w9(String str);

    /* JADX INFO: renamed from: wo */
    void mo36132wo();

    /* JADX INFO: renamed from: x3 */
    boolean mo36133x3();

    /* JADX INFO: renamed from: xk */
    boolean mo36134xk();

    /* JADX INFO: renamed from: xp */
    void mo36135xp(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i);

    /* JADX INFO: renamed from: zo */
    boolean mo36136zo(Conversation conversation);
}
