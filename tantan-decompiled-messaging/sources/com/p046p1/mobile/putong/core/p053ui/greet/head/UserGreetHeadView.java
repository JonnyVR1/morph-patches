package com.p046p1.mobile.putong.core.p053ui.greet.head;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.p053ui.greet.C8357a;
import com.p046p1.mobile.putong.core.p053ui.greet.GreetAct;
import com.p046p1.mobile.putong.core.p053ui.greet.GreetMessageMomentNewView;
import com.p046p1.mobile.putong.core.p053ui.greet.GreetMessageStateFourView;
import com.p046p1.mobile.putong.core.p053ui.greet.GreetMessageStateNewView;
import com.p046p1.mobile.putong.core.p053ui.greet.head.UserGreetHeadView;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.bkb0;
import p149l.c3c0;
import p149l.fsl;
import p149l.i5k0;
import p149l.jly;
import p149l.qib0;
import p149l.rw6;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class UserGreetHeadView extends VLinear implements fsl {

    /* JADX INFO: renamed from: A */
    public VDraweeView f29469A;

    /* JADX INFO: renamed from: B */
    public View.OnClickListener f29470B;

    /* JADX INFO: renamed from: C */
    public String f29471C;

    /* JADX INFO: renamed from: D */
    public boolean f29472D;

    /* JADX INFO: renamed from: c */
    public UserGreetHeadView f29473c;

    /* JADX INFO: renamed from: d */
    public VFrame f29474d;

    /* JADX INFO: renamed from: e */
    public HeaderFrameWrapper f29475e;

    /* JADX INFO: renamed from: f */
    public VImage f29476f;

    /* JADX INFO: renamed from: g */
    public VText f29477g;

    /* JADX INFO: renamed from: h */
    public VLinear f29478h;

    /* JADX INFO: renamed from: i */
    public VText f29479i;

    /* JADX INFO: renamed from: j */
    public VLinear f29480j;

    /* JADX INFO: renamed from: k */
    public VFrame f29481k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f29482l;

    /* JADX INFO: renamed from: m */
    public VImage f29483m;

    /* JADX INFO: renamed from: n */
    public VFrame f29484n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f29485o;

    /* JADX INFO: renamed from: p */
    public VImage f29486p;

    /* JADX INFO: renamed from: q */
    public VFrame f29487q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f29488r;

    /* JADX INFO: renamed from: s */
    public VImage f29489s;

    /* JADX INFO: renamed from: t */
    public VText f29490t;

    /* JADX INFO: renamed from: u */
    public VText f29491u;

    /* JADX INFO: renamed from: v */
    public VText f29492v;

    /* JADX INFO: renamed from: w */
    public GreetMessageMomentNewView f29493w;

    /* JADX INFO: renamed from: x */
    public GreetMessageStateFourView f29494x;

    /* JADX INFO: renamed from: y */
    public GreetMessageStateNewView f29495y;

    /* JADX INFO: renamed from: z */
    public boolean f29496z;

    public UserGreetHeadView(@NonNull Context context) {
        super(context);
        this.f29496z = true;
        this.f29472D = true;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m45922P(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m45927X(View view) {
        if (NullChecker.m81303a(this.f29470B)) {
            this.f29470B.onClick(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m45928Y(View view) {
        if (NullChecker.m81303a(this.f29470B)) {
            this.f29470B.onClick(view);
        }
    }

    @Override // p149l.fsl
    /* JADX INFO: renamed from: M */
    public void mo40653M(C8357a c8357a, User user, String str) {
        xdl0.m208344M(this.f29479i, false);
        xdl0.m208344M(this.f29480j, false);
        xdl0.m208344M(this.f29491u, false);
        xdl0.m208344M(this.f29492v, false);
        xdl0.m208344M(this.f29478h, false);
        xdl0.m208344M(this.f29494x, true);
        this.f29494x.m45726h(c8357a, user, str);
    }

    @Override // p149l.fsl
    /* JADX INFO: renamed from: O */
    public void mo40654O() {
        xdl0.m208344M(this.f29478h, false);
    }

    /* JADX INFO: renamed from: V */
    public final void m45929V(View view) {
        i5k0.m134487a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public PutongAct m45930W() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m45931Z(CoreMomentInfo coreMomentInfo, String str, View view) {
        zvf0.m220399u("e_moment", "p_kankan_chat_popup", vwb.m200311Y("moment_id", coreMomentInfo.f56008id));
        m45930W().startActivity(CoreModule.m29934N().argsToPhotoAlbumFeedAct(m45930W(), str, "from_greet_act", -1, "", 2));
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m45932a0(String str, View view) {
        m45930W().startActivity(CoreModule.m29934N().argsToPhotoAlbumFeedAct(m45930W(), str, "from_greet_act", -1, "", 2));
    }

    @Override // p149l.fsl
    /* JADX INFO: renamed from: b */
    public void mo40655b(View view, VImage vImage, VText vText, int i) {
        int i2 = t100.f167271t;
        float fMax = Math.max(1.0f - ((i * 1.0f) / i2), 0.0f);
        float fMin = Math.min(Math.max(((i - i2) * 1.0f) / i2, 0.0f), 1.0f);
        view.setAlpha(fMin);
        vImage.setAlpha(fMin);
        vText.setAlpha(fMin);
        this.f29475e.setAlpha(fMax);
        this.f29476f.setAlpha(fMax);
        this.f29477g.setAlpha(fMax);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m45933b0(Audio audio) {
        this.f29491u.setText(String.format("%s''", Integer.valueOf(Math.round(audio.duration))));
    }

    @Override // p149l.fsl
    /* JADX INFO: renamed from: c */
    public void mo40656c(User user, boolean z) {
        xdl0.m208344M(this.f29474d, true);
        xdl0.m208344M(this.f29477g, true);
        xdl0.m208344M(this.f29476f, true);
        if (z) {
            bkb0 bkb0Var = qib0.f154691G;
            VDraweeView vDraweeView = this.f29469A;
            String anonymousUrl = user.getAnonymousUrl();
            int i = t100.f167236K;
            bkb0Var.m102325I0(vDraweeView, anonymousUrl, i, i);
            this.f29475e.m79695G0(false);
        } else {
            qib0.f154691G.m102327J0(this.f29469A, rw6.m181386b(user).profileSize(80), false);
            this.f29475e.m79702n0(user);
        }
        this.f29477g.setText(user.name);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m45934c0(VFrame vFrame, VDraweeView vDraweeView, VImage vImage, List<Media> list, int i) {
        if (list.size() <= i) {
            xdl0.m208344M(vFrame, false);
            return;
        }
        xdl0.m208344M(vFrame, true);
        Media media = list.get(i);
        qib0.f154691G.m102327J0(vDraweeView, media.cover().profileSize(80), false);
        xdl0.m208344M(vImage, media instanceof Video);
    }

    @Override // p149l.fsl
    /* JADX INFO: renamed from: k */
    public void mo40662k(User user, String str) {
        UserGreetHeadView userGreetHeadView;
        List<Media> list = user.pictures;
        int size = list.size();
        xdl0.m208344M(this.f29480j, size > 0);
        if (size > 0) {
            userGreetHeadView = this;
            userGreetHeadView.m45934c0(this.f29481k, this.f29482l, this.f29483m, list, 0);
        } else {
            userGreetHeadView = this;
        }
        if (size > 2) {
            userGreetHeadView.m45934c0(userGreetHeadView.f29484n, userGreetHeadView.f29485o, userGreetHeadView.f29486p, list, 1);
            userGreetHeadView.m45934c0(userGreetHeadView.f29487q, userGreetHeadView.f29488r, userGreetHeadView.f29489s, list, 2);
        }
        if (TextUtils.isEmpty(str)) {
            ArrayList<Pair<String, String>> arrayListM142158K = jly.m142126N().m142158K(CoreModule.f17545c.f19639e0.m169520na(), user);
            if (vwb.m200296J(arrayListM142158K)) {
                return;
            }
            xdl0.m208344M(userGreetHeadView.f29492v, true);
            userGreetHeadView.f29492v.setMaxLines(2);
            StringBuilder sb = new StringBuilder();
            Iterator<Pair<String, String>> it = arrayListM142158K.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next().first);
            }
            userGreetHeadView.f29492v.setText(sb.toString());
        }
    }

    @Override // p149l.fsl
    /* JADX INFO: renamed from: n */
    public void mo40665n(String str, BubbleInfo bubbleInfo, String str2) {
        boolean z = false;
        xdl0.m208344M(this.f29479i, false);
        xdl0.m208344M(this.f29480j, false);
        xdl0.m208344M(this.f29491u, false);
        xdl0.m208344M(this.f29492v, false);
        if (CoreModule.m29934N().mo60294M8() && NullChecker.m81303a(bubbleInfo) && !TextUtils.isEmpty(bubbleInfo.f38730id)) {
            z = true;
        }
        xdl0.m208344M(this.f29478h, !z);
        if (z) {
            xdl0.m208344M(this.f29495y, true);
            this.f29495y.m45750v(bubbleInfo, m45930W());
            xdl0.m208329E0(this.f29495y, new View.OnClickListener() { // from class: l.f5k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserGreetHeadView.m45922P(view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45929V(this);
        this.f29469A = this.f29475e.get_pic();
        xdl0.m208329E0(this.f29474d, new View.OnClickListener() { // from class: l.d5k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84543a.m45927X(view);
            }
        });
        xdl0.m208329E0(this.f29477g, new View.OnClickListener() { // from class: l.e5k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89438a.m45928Y(view);
            }
        });
        if ((m45930W() instanceof GreetAct) && NullChecker.m81303a(this.f29476f)) {
            if (((GreetAct) m45930W()).m45586g2()) {
                this.f29476f.setBackgroundResource(0);
                this.f29476f.setImageResource(CoreModule.m29935P().m94658i().mo158365e() ? c3c0.f78521G : c3c0.f78530H);
            }
            if (CoreModule.f17557o.m195057d().mo33700I5() || CoreModule.m29935P().m94651a().mo33526jj()) {
                this.f29476f.setImageResource(c3c0.f78744f6);
            } else {
                this.f29476f.setImageResource(c3c0.f78810n0);
            }
        }
    }

    @Override // p149l.fsl
    /* JADX INFO: renamed from: p */
    public void mo40666p(Act act, final String str, final CoreMomentInfo coreMomentInfo, String str2, String str3) {
        this.f29471C = NullChecker.m81303a(coreMomentInfo) ? coreMomentInfo.f56008id : "";
        boolean z = this.f29496z;
        VLinear vLinear = this.f29478h;
        if (!z) {
            xdl0.m208344M(vLinear, false);
            return;
        }
        xdl0.m208344M(vLinear, this.f29472D);
        xdl0.m208344M(this.f29479i, false);
        xdl0.m208344M(this.f29480j, false);
        xdl0.m208344M(this.f29491u, false);
        xdl0.m208344M(this.f29492v, false);
        if (CoreModule.m29934N().mo60294M8()) {
            xdl0.m208344M(this.f29478h, !(TextUtils.isEmpty(str2) && CoreModule.m29934N().mo60282Ib(str3)) && this.f29472D);
            if (CoreModule.m29934N().mo60282Ib(str3) && TextUtils.isEmpty(str2)) {
                xdl0.m208344M(this.f29493w, true);
                this.f29493w.m45717g(act, str, coreMomentInfo);
                xdl0.m208329E0(this.f29493w, new View.OnClickListener() { // from class: l.g5k0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f101167a.m45931Z(coreMomentInfo, str, view);
                    }
                });
                return;
            }
        }
        if ((m45930W() instanceof GreetAct) && !((GreetAct) m45930W()).m45587h2()) {
            xdl0.m208329E0(this.f29478h, new View.OnClickListener() { // from class: l.h5k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f105953a.m45932a0(str, view);
                }
            });
        }
        if (!NullChecker.m81303a(coreMomentInfo) || vwb.m200296J(coreMomentInfo.media)) {
            if (!NullChecker.m81303a(coreMomentInfo) || TextUtils.isEmpty(coreMomentInfo.value)) {
                xdl0.m208344M(this.f29479i, true);
                this.f29479i.setText("内容已删除");
                return;
            } else {
                xdl0.m208344M(this.f29479i, true);
                this.f29479i.setText(coreMomentInfo.value);
                return;
            }
        }
        if (coreMomentInfo.media.get(0) instanceof Audio) {
            xdl0.m208344M(this.f29491u, true);
            m45933b0((Audio) coreMomentInfo.media.get(0));
        } else {
            xdl0.m208344M(this.f29480j, true);
            m45934c0(this.f29481k, this.f29482l, this.f29483m, coreMomentInfo.media, 0);
            m45934c0(this.f29484n, this.f29485o, this.f29486p, coreMomentInfo.media, 1);
            m45934c0(this.f29487q, this.f29488r, this.f29489s, coreMomentInfo.media, 2);
            int size = coreMomentInfo.media.size();
            VText vText = this.f29490t;
            if (size > 3) {
                xdl0.m208344M(vText, true);
                this.f29490t.setText(String.format("+%s", Integer.valueOf(coreMomentInfo.media.size() - 3)));
            } else {
                xdl0.m208344M(vText, false);
            }
        }
        if (TextUtils.isEmpty(coreMomentInfo.value)) {
            return;
        }
        xdl0.m208344M(this.f29492v, true);
        this.f29492v.setText(coreMomentInfo.value);
    }

    @Override // p149l.fsl
    public void setMomentId(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f29471C) || !TextUtils.equals(str, this.f29471C)) {
            return;
        }
        xdl0.m208344M(this.f29478h, false);
        this.f29472D = false;
    }

    @Override // p149l.fsl
    public void setOnAvatarClickListener(View.OnClickListener onClickListener) {
        this.f29470B = onClickListener;
    }

    public void setShowGreetLayout(boolean z) {
        this.f29496z = z;
    }

    public UserGreetHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29496z = true;
        this.f29472D = true;
    }

    public UserGreetHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29496z = true;
        this.f29472D = true;
    }
}
