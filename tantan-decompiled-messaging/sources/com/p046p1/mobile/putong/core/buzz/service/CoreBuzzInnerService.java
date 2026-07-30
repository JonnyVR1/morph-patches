package com.p046p1.mobile.putong.core.buzz.service;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.BreakIce;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.template.IProvider;
import java.util.ArrayList;
import p133rx.C22306c;
import p147v.VText;
import p149l.eyl;
import p149l.g30;
import p149l.j760;
import p149l.mcr;

/* JADX INFO: loaded from: classes9.dex */
public interface CoreBuzzInnerService extends IProvider {
    /* JADX INFO: renamed from: Bs */
    boolean mo35092Bs();

    /* JADX INFO: renamed from: Da */
    C22306c<j760<Integer, Boolean>> mo35093Da(String str);

    /* JADX INFO: renamed from: Dj */
    void mo35094Dj(VText vText, Double d);

    /* JADX INFO: renamed from: Fg */
    void mo35095Fg();

    /* JADX INFO: renamed from: I7 */
    void mo35096I7();

    /* JADX INFO: renamed from: Jp */
    boolean mo35097Jp(String str, String str2);

    /* JADX INFO: renamed from: Ls */
    ArrayList<BreakIce> mo35098Ls(int i, Gender gender);

    /* JADX INFO: renamed from: Nk */
    LoveBuzzData mo35099Nk();

    /* JADX INFO: renamed from: Pe */
    boolean mo35100Pe(Conversation conversation);

    /* JADX INFO: renamed from: Pj */
    boolean mo35101Pj(Conversation conversation);

    /* JADX INFO: renamed from: Uq */
    String mo35102Uq(long j);

    /* JADX INFO: renamed from: Wh */
    String mo35103Wh();

    /* JADX INFO: renamed from: Wl */
    void mo35104Wl(Act act);

    /* JADX INFO: renamed from: Wr */
    boolean mo35105Wr(Conversation conversation);

    /* JADX INFO: renamed from: X7 */
    boolean mo35106X7(Conversation conversation);

    /* JADX INFO: renamed from: Yg */
    boolean mo35107Yg();

    /* JADX INFO: renamed from: Zf */
    void mo35108Zf(mcr mcrVar, String str, String str2, boolean z, boolean z2, g30<Integer, Boolean, Message> g30Var);

    /* JADX INFO: renamed from: Zm */
    boolean mo35109Zm(Conversation conversation);

    /* JADX INFO: renamed from: Zq */
    String mo35110Zq();

    /* JADX INFO: renamed from: a8 */
    void mo35111a8(User user, ImageView imageView);

    /* JADX INFO: renamed from: e6 */
    void mo35112e6(String str, Act act, boolean z, eyl eylVar);

    /* JADX INFO: renamed from: fq */
    boolean mo35113fq(Conversation conversation);

    /* JADX INFO: renamed from: gh */
    boolean mo35114gh(String str, String str2);

    /* JADX INFO: renamed from: io */
    void mo35115io(int i, String str);

    /* JADX INFO: renamed from: l9 */
    void mo35116l9(Act act, String str);

    /* JADX INFO: renamed from: la */
    boolean mo35117la(long j);

    /* JADX INFO: renamed from: lo */
    boolean mo35118lo(Conversation conversation);

    /* JADX INFO: renamed from: mf */
    void mo35119mf(Context context, VText vText, String str);

    /* JADX INFO: renamed from: nl */
    boolean mo35120nl(Conversation conversation);

    /* JADX INFO: renamed from: nt */
    void mo35121nt(User user, TextView textView);

    /* JADX INFO: renamed from: of */
    boolean mo35122of();

    /* JADX INFO: renamed from: ra */
    String mo35123ra();

    /* JADX INFO: renamed from: sc */
    boolean mo35124sc(Conversation conversation);

    /* JADX INFO: renamed from: tj */
    String mo35125tj();

    /* JADX INFO: renamed from: v6 */
    boolean mo35126v6(Conversation conversation);

    /* JADX INFO: renamed from: vg */
    C22306c<j760<Integer, Boolean>> mo35127vg(Conversation conversation, String str);

    /* JADX INFO: renamed from: w9 */
    void mo35128w9(String str);

    /* JADX INFO: renamed from: wo */
    void mo35129wo();

    /* JADX INFO: renamed from: x3 */
    boolean mo35130x3();

    /* JADX INFO: renamed from: xk */
    boolean mo35131xk();

    /* JADX INFO: renamed from: xp */
    void mo35132xp(SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri, int i);

    /* JADX INFO: renamed from: zo */
    boolean mo35133zo(Conversation conversation);
}
