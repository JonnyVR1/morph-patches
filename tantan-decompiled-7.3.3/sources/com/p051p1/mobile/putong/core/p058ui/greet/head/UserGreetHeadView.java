package com.p051p1.mobile.putong.core.p058ui.greet.head;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.p058ui.greet.C8520a;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetAct;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetMessageMomentNewView;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetMessageStateFourView;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetMessageStateNewView;
import com.p051p1.mobile.putong.core.p058ui.greet.head.UserGreetHeadView;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.fsb0;
import p153l.guy;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.oek0;
import p153l.qa00;
import p153l.tul;
import p153l.uqb0;
import p153l.ux6;

/* JADX INFO: loaded from: classes3.dex */
public class UserGreetHeadView extends VLinear implements tul {

    /* JADX INFO: renamed from: A */
    public VDraweeView f30317A;

    /* JADX INFO: renamed from: B */
    public View.OnClickListener f30318B;

    /* JADX INFO: renamed from: C */
    public String f30319C;

    /* JADX INFO: renamed from: D */
    public boolean f30320D;

    /* JADX INFO: renamed from: c */
    public UserGreetHeadView f30321c;

    /* JADX INFO: renamed from: d */
    public VFrame f30322d;

    /* JADX INFO: renamed from: e */
    public HeaderFrameWrapper f30323e;

    /* JADX INFO: renamed from: f */
    public VImage f30324f;

    /* JADX INFO: renamed from: g */
    public VText f30325g;

    /* JADX INFO: renamed from: h */
    public VLinear f30326h;

    /* JADX INFO: renamed from: i */
    public VText f30327i;

    /* JADX INFO: renamed from: j */
    public VLinear f30328j;

    /* JADX INFO: renamed from: k */
    public VFrame f30329k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f30330l;

    /* JADX INFO: renamed from: m */
    public VImage f30331m;

    /* JADX INFO: renamed from: n */
    public VFrame f30332n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f30333o;

    /* JADX INFO: renamed from: p */
    public VImage f30334p;

    /* JADX INFO: renamed from: q */
    public VFrame f30335q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f30336r;

    /* JADX INFO: renamed from: s */
    public VImage f30337s;

    /* JADX INFO: renamed from: t */
    public VText f30338t;

    /* JADX INFO: renamed from: u */
    public VText f30339u;

    /* JADX INFO: renamed from: v */
    public VText f30340v;

    /* JADX INFO: renamed from: w */
    public GreetMessageMomentNewView f30341w;

    /* JADX INFO: renamed from: x */
    public GreetMessageStateFourView f30342x;

    /* JADX INFO: renamed from: y */
    public GreetMessageStateNewView f30343y;

    /* JADX INFO: renamed from: z */
    public boolean f30344z;

    public UserGreetHeadView(@NonNull Context context) {
        super(context);
        this.f30344z = true;
        this.f30320D = true;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m47105P(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m47110X(View view) {
        if (NullChecker.m82486a(this.f30318B)) {
            this.f30318B.onClick(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m47111Y(View view) {
        if (NullChecker.m82486a(this.f30318B)) {
            this.f30318B.onClick(view);
        }
    }

    @Override // p153l.tul
    /* JADX INFO: renamed from: M */
    public void mo41664M(C8520a c8520a, User user, String str) {
        bnl0.m105524M(this.f30327i, false);
        bnl0.m105524M(this.f30328j, false);
        bnl0.m105524M(this.f30339u, false);
        bnl0.m105524M(this.f30340v, false);
        bnl0.m105524M(this.f30326h, false);
        bnl0.m105524M(this.f30342x, true);
        this.f30342x.m46909h(c8520a, user, str);
    }

    @Override // p153l.tul
    /* JADX INFO: renamed from: O */
    public void mo41665O() {
        bnl0.m105524M(this.f30326h, false);
    }

    /* JADX INFO: renamed from: V */
    public final void m47112V(View view) {
        oek0.m167369a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public PutongAct m47113W() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m47114Z(CoreMomentInfo coreMomentInfo, String str, View view) {
        i4g0.m138523u("e_moment", "p_kankan_chat_popup", jyb.m147494Y("moment_id", coreMomentInfo.f56856id));
        m47113W().startActivity(CoreModule.m30932N().argsToPhotoAlbumFeedAct(m47113W(), str, "from_greet_act", -1, "", 2));
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m47115a0(String str, View view) {
        m47113W().startActivity(CoreModule.m30932N().argsToPhotoAlbumFeedAct(m47113W(), str, "from_greet_act", -1, "", 2));
    }

    @Override // p153l.tul
    /* JADX INFO: renamed from: b */
    public void mo41666b(View view, VImage vImage, VText vText, int i) {
        int i2 = qa00.f156333t;
        float fMax = Math.max(1.0f - ((i * 1.0f) / i2), 0.0f);
        float fMin = Math.min(Math.max(((i - i2) * 1.0f) / i2, 0.0f), 1.0f);
        view.setAlpha(fMin);
        vImage.setAlpha(fMin);
        vText.setAlpha(fMin);
        this.f30323e.setAlpha(fMax);
        this.f30324f.setAlpha(fMax);
        this.f30325g.setAlpha(fMax);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m47116b0(Audio audio) {
        this.f30339u.setText(String.format("%s''", Integer.valueOf(Math.round(audio.duration))));
    }

    @Override // p153l.tul
    /* JADX INFO: renamed from: c */
    public void mo41667c(User user, boolean z) {
        bnl0.m105524M(this.f30322d, true);
        bnl0.m105524M(this.f30325g, true);
        bnl0.m105524M(this.f30324f, true);
        if (z) {
            fsb0 fsb0Var = uqb0.f180374G;
            VDraweeView vDraweeView = this.f30317A;
            String anonymousUrl = user.getAnonymousUrl();
            int i = qa00.f156298K;
            fsb0Var.m127109I0(vDraweeView, anonymousUrl, i, i);
            this.f30323e.m80878G0(false);
        } else {
            uqb0.f180374G.m127111J0(this.f30317A, ux6.m198404b(user).profileSize(80), false);
            this.f30323e.m80885n0(user);
        }
        this.f30325g.setText(user.name);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m47117c0(VFrame vFrame, VDraweeView vDraweeView, VImage vImage, List<Media> list, int i) {
        if (list.size() <= i) {
            bnl0.m105524M(vFrame, false);
            return;
        }
        bnl0.m105524M(vFrame, true);
        Media media = list.get(i);
        uqb0.f180374G.m127111J0(vDraweeView, media.cover().profileSize(80), false);
        bnl0.m105524M(vImage, media instanceof Video);
    }

    @Override // p153l.tul
    /* JADX INFO: renamed from: k */
    public void mo41673k(User user, String str) {
        UserGreetHeadView userGreetHeadView;
        List<Media> list = user.pictures;
        int size = list.size();
        bnl0.m105524M(this.f30328j, size > 0);
        if (size > 0) {
            userGreetHeadView = this;
            userGreetHeadView.m47117c0(this.f30329k, this.f30330l, this.f30331m, list, 0);
        } else {
            userGreetHeadView = this;
        }
        if (size > 2) {
            userGreetHeadView.m47117c0(userGreetHeadView.f30332n, userGreetHeadView.f30333o, userGreetHeadView.f30334p, list, 1);
            userGreetHeadView.m47117c0(userGreetHeadView.f30335q, userGreetHeadView.f30336r, userGreetHeadView.f30337s, list, 2);
        }
        if (TextUtils.isEmpty(str)) {
            ArrayList<Pair<String, String>> arrayListM132453K = guy.m132421N().m132453K(CoreModule.f18264c.f20381e0.m116593na(), user);
            if (jyb.m147479J(arrayListM132453K)) {
                return;
            }
            bnl0.m105524M(userGreetHeadView.f30340v, true);
            userGreetHeadView.f30340v.setMaxLines(2);
            StringBuilder sb = new StringBuilder();
            Iterator<Pair<String, String>> it = arrayListM132453K.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next().first);
            }
            userGreetHeadView.f30340v.setText(sb.toString());
        }
    }

    @Override // p153l.tul
    /* JADX INFO: renamed from: n */
    public void mo41676n(String str, BubbleInfo bubbleInfo, String str2) {
        boolean z = false;
        bnl0.m105524M(this.f30327i, false);
        bnl0.m105524M(this.f30328j, false);
        bnl0.m105524M(this.f30339u, false);
        bnl0.m105524M(this.f30340v, false);
        if (CoreModule.m30932N().mo61478M8() && NullChecker.m82486a(bubbleInfo) && !TextUtils.isEmpty(bubbleInfo.f39578id)) {
            z = true;
        }
        bnl0.m105524M(this.f30326h, !z);
        if (z) {
            bnl0.m105524M(this.f30343y, true);
            this.f30343y.m46933v(bubbleInfo, m47113W());
            bnl0.m105509E0(this.f30343y, new View.OnClickListener() { // from class: l.lek0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserGreetHeadView.m47105P(view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47112V(this);
        this.f30317A = this.f30323e.get_pic();
        bnl0.m105509E0(this.f30322d, new View.OnClickListener() { // from class: l.jek0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120509a.m47110X(view);
            }
        });
        bnl0.m105509E0(this.f30325g, new View.OnClickListener() { // from class: l.kek0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126198a.m47111Y(view);
            }
        });
        if ((m47113W() instanceof GreetAct) && NullChecker.m82486a(this.f30324f)) {
            if (((GreetAct) m47113W()).m46769h2()) {
                this.f30324f.setBackgroundResource(0);
                this.f30324f.setImageResource(CoreModule.m30933P().m143412i().mo180457e() ? ibc0.f113796G : ibc0.f113805H);
            }
            if (CoreModule.f18276o.m132214d().mo34703I5() || CoreModule.m30933P().m143405a().mo34529jj()) {
                this.f30324f.setImageResource(ibc0.f114019f6);
            } else {
                this.f30324f.setImageResource(ibc0.f114085n0);
            }
        }
    }

    @Override // p153l.tul
    /* JADX INFO: renamed from: p */
    public void mo41677p(Act act, final String str, final CoreMomentInfo coreMomentInfo, String str2, String str3) {
        this.f30319C = NullChecker.m82486a(coreMomentInfo) ? coreMomentInfo.f56856id : "";
        boolean z = this.f30344z;
        VLinear vLinear = this.f30326h;
        if (!z) {
            bnl0.m105524M(vLinear, false);
            return;
        }
        bnl0.m105524M(vLinear, this.f30320D);
        bnl0.m105524M(this.f30327i, false);
        bnl0.m105524M(this.f30328j, false);
        bnl0.m105524M(this.f30339u, false);
        bnl0.m105524M(this.f30340v, false);
        if (CoreModule.m30932N().mo61478M8()) {
            bnl0.m105524M(this.f30326h, !(TextUtils.isEmpty(str2) && CoreModule.m30932N().mo61466Ib(str3)) && this.f30320D);
            if (CoreModule.m30932N().mo61466Ib(str3) && TextUtils.isEmpty(str2)) {
                bnl0.m105524M(this.f30341w, true);
                this.f30341w.m46900g(act, str, coreMomentInfo);
                bnl0.m105509E0(this.f30341w, new View.OnClickListener() { // from class: l.mek0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f136517a.m47114Z(coreMomentInfo, str, view);
                    }
                });
                return;
            }
        }
        if ((m47113W() instanceof GreetAct) && !((GreetAct) m47113W()).m46770i2()) {
            bnl0.m105509E0(this.f30326h, new View.OnClickListener() { // from class: l.nek0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f141663a.m47115a0(str, view);
                }
            });
        }
        if (!NullChecker.m82486a(coreMomentInfo) || jyb.m147479J(coreMomentInfo.media)) {
            if (!NullChecker.m82486a(coreMomentInfo) || TextUtils.isEmpty(coreMomentInfo.value)) {
                bnl0.m105524M(this.f30327i, true);
                this.f30327i.setText("内容已删除");
                return;
            } else {
                bnl0.m105524M(this.f30327i, true);
                this.f30327i.setText(coreMomentInfo.value);
                return;
            }
        }
        if (coreMomentInfo.media.get(0) instanceof Audio) {
            bnl0.m105524M(this.f30339u, true);
            m47116b0((Audio) coreMomentInfo.media.get(0));
        } else {
            bnl0.m105524M(this.f30328j, true);
            m47117c0(this.f30329k, this.f30330l, this.f30331m, coreMomentInfo.media, 0);
            m47117c0(this.f30332n, this.f30333o, this.f30334p, coreMomentInfo.media, 1);
            m47117c0(this.f30335q, this.f30336r, this.f30337s, coreMomentInfo.media, 2);
            int size = coreMomentInfo.media.size();
            VText vText = this.f30338t;
            if (size > 3) {
                bnl0.m105524M(vText, true);
                this.f30338t.setText(String.format("+%s", Integer.valueOf(coreMomentInfo.media.size() - 3)));
            } else {
                bnl0.m105524M(vText, false);
            }
        }
        if (TextUtils.isEmpty(coreMomentInfo.value)) {
            return;
        }
        bnl0.m105524M(this.f30340v, true);
        this.f30340v.setText(coreMomentInfo.value);
    }

    @Override // p153l.tul
    public void setMomentId(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f30319C) || !TextUtils.equals(str, this.f30319C)) {
            return;
        }
        bnl0.m105524M(this.f30326h, false);
        this.f30320D = false;
    }

    @Override // p153l.tul
    public void setOnAvatarClickListener(View.OnClickListener onClickListener) {
        this.f30318B = onClickListener;
    }

    public void setShowGreetLayout(boolean z) {
        this.f30344z = z;
    }

    public UserGreetHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30344z = true;
        this.f30320D = true;
    }

    public UserGreetHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30344z = true;
        this.f30320D = true;
    }
}
