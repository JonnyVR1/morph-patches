package com.p000p1.mobile.putong.core.p001ui.greet.head;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.CoreMomentInfo;
import com.p000p1.mobile.putong.core.p001ui.greet.C3132a;
import com.p000p1.mobile.putong.core.p001ui.greet.GreetAct;
import com.p000p1.mobile.putong.core.p001ui.greet.GreetMessageMomentNewView;
import com.p000p1.mobile.putong.core.p001ui.greet.GreetMessageStateFourView;
import com.p000p1.mobile.putong.core.p001ui.greet.GreetMessageStateNewView;
import com.p000p1.mobile.putong.core.p001ui.greet.head.UserGreetHeadView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Audio;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.bkb0;
import l.j760;
import l.jly;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p003l.c3c0;
import p003l.fsl;
import p003l.i5k0;
import p003l.rw6;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class UserGreetHeadView extends VLinear implements fsl {

    /* JADX INFO: renamed from: A */
    public VDraweeView f1863A;

    /* JADX INFO: renamed from: B */
    public View.OnClickListener f1864B;

    /* JADX INFO: renamed from: C */
    public String f1865C;

    /* JADX INFO: renamed from: D */
    public boolean f1866D;

    /* JADX INFO: renamed from: c */
    public UserGreetHeadView f1867c;

    /* JADX INFO: renamed from: d */
    public VFrame f1868d;

    /* JADX INFO: renamed from: e */
    public HeaderFrameWrapper f1869e;

    /* JADX INFO: renamed from: f */
    public VImage f1870f;

    /* JADX INFO: renamed from: g */
    public VText f1871g;

    /* JADX INFO: renamed from: h */
    public VLinear f1872h;

    /* JADX INFO: renamed from: i */
    public VText f1873i;

    /* JADX INFO: renamed from: j */
    public VLinear f1874j;

    /* JADX INFO: renamed from: k */
    public VFrame f1875k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f1876l;

    /* JADX INFO: renamed from: m */
    public VImage f1877m;

    /* JADX INFO: renamed from: n */
    public VFrame f1878n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f1879o;

    /* JADX INFO: renamed from: p */
    public VImage f1880p;

    /* JADX INFO: renamed from: q */
    public VFrame f1881q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f1882r;

    /* JADX INFO: renamed from: s */
    public VImage f1883s;

    /* JADX INFO: renamed from: t */
    public VText f1884t;

    /* JADX INFO: renamed from: u */
    public VText f1885u;

    /* JADX INFO: renamed from: v */
    public VText f1886v;

    /* JADX INFO: renamed from: w */
    public GreetMessageMomentNewView f1887w;

    /* JADX INFO: renamed from: x */
    public GreetMessageStateFourView f1888x;

    /* JADX INFO: renamed from: y */
    public GreetMessageStateNewView f1889y;

    /* JADX INFO: renamed from: z */
    public boolean f1890z;

    public UserGreetHeadView(@NonNull Context context) {
        super(context);
        this.f1890z = true;
        this.f1866D = true;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m3268P(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m3273X(View view) {
        if (NullChecker.a(this.f1864B)) {
            this.f1864B.onClick(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m3274Y(View view) {
        if (NullChecker.a(this.f1864B)) {
            this.f1864B.onClick(view);
        }
    }

    @Override // p003l.fsl
    /* JADX INFO: renamed from: M */
    public void mo3275M(C3132a c3132a, User user, String str) {
        xdl0.M(this.f1873i, false);
        xdl0.M(this.f1874j, false);
        xdl0.M(this.f1885u, false);
        xdl0.M(this.f1886v, false);
        xdl0.M(this.f1872h, false);
        xdl0.M(this.f1888x, true);
        this.f1888x.m3064h(c3132a, user, str);
    }

    @Override // p003l.fsl
    /* JADX INFO: renamed from: O */
    public void mo3276O() {
        xdl0.M(this.f1872h, false);
    }

    /* JADX INFO: renamed from: V */
    public final void m3277V(View view) {
        i5k0.m7129a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    public PutongAct m3278W() {
        return getContext();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m3279Z(CoreMomentInfo coreMomentInfo, String str, View view) {
        zvf0.u("e_moment", "p_kankan_chat_popup", new j760[]{vwb.Y("moment_id", ((CopyObject) coreMomentInfo).id)});
        m3278W().startActivity(CoreModule.N().argsToPhotoAlbumFeedAct(m3278W(), str, "from_greet_act", -1, "", 2));
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m3280a0(String str, View view) {
        m3278W().startActivity(CoreModule.N().argsToPhotoAlbumFeedAct(m3278W(), str, "from_greet_act", -1, "", 2));
    }

    @Override // p003l.fsl
    /* JADX INFO: renamed from: b */
    public void mo3281b(View view, VImage vImage, VText vText, int i) {
        int i2 = t100.t;
        float fMax = Math.max(1.0f - ((i * 1.0f) / i2), 0.0f);
        float fMin = Math.min(Math.max(((i - i2) * 1.0f) / i2, 0.0f), 1.0f);
        view.setAlpha(fMin);
        vImage.setAlpha(fMin);
        vText.setAlpha(fMin);
        this.f1869e.setAlpha(fMax);
        this.f1870f.setAlpha(fMax);
        this.f1871g.setAlpha(fMax);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m3282b0(Audio audio) {
        this.f1885u.setText(String.format("%s''", Integer.valueOf(Math.round(audio.duration))));
    }

    @Override // p003l.fsl
    /* JADX INFO: renamed from: c */
    public void mo3283c(User user, boolean z) {
        xdl0.M(this.f1868d, true);
        xdl0.M(this.f1871g, true);
        xdl0.M(this.f1870f, true);
        if (z) {
            bkb0 bkb0Var = qib0.G;
            VDraweeView vDraweeView = this.f1863A;
            String anonymousUrl = user.getAnonymousUrl();
            int i = t100.K;
            bkb0Var.I0(vDraweeView, anonymousUrl, i, i);
            this.f1869e.G0(false);
        } else {
            qib0.G.J0(this.f1863A, rw6.m9196b(user).profileSize(80), false);
            this.f1869e.n0(user);
        }
        this.f1871g.setText(user.name);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m3284c0(VFrame vFrame, VDraweeView vDraweeView, VImage vImage, List<Media> list, int i) {
        if (list.size() <= i) {
            xdl0.M(vFrame, false);
            return;
        }
        xdl0.M(vFrame, true);
        Media media = list.get(i);
        qib0.G.J0(vDraweeView, media.cover().profileSize(80), false);
        xdl0.M(vImage, media instanceof Video);
    }

    @Override // p003l.fsl
    /* JADX INFO: renamed from: k */
    public void mo3285k(User user, String str) {
        UserGreetHeadView userGreetHeadView;
        List<Media> list = user.pictures;
        int size = list.size();
        xdl0.M(this.f1874j, size > 0);
        if (size > 0) {
            userGreetHeadView = this;
            userGreetHeadView.m3284c0(this.f1875k, this.f1876l, this.f1877m, list, 0);
        } else {
            userGreetHeadView = this;
        }
        if (size > 2) {
            userGreetHeadView.m3284c0(userGreetHeadView.f1878n, userGreetHeadView.f1879o, userGreetHeadView.f1880p, list, 1);
            userGreetHeadView.m3284c0(userGreetHeadView.f1881q, userGreetHeadView.f1882r, userGreetHeadView.f1883s, list, 2);
        }
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayListK = jly.N().K(CoreModule.c.e0.na(), user);
            if (vwb.J(arrayListK)) {
                return;
            }
            xdl0.M(userGreetHeadView.f1886v, true);
            userGreetHeadView.f1886v.setMaxLines(2);
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayListK.iterator();
            while (it.hasNext()) {
                sb.append((String) ((Pair) it.next()).first);
            }
            userGreetHeadView.f1886v.setText(sb.toString());
        }
    }

    @Override // p003l.fsl
    /* JADX INFO: renamed from: n */
    public void mo3286n(String str, BubbleInfo bubbleInfo, String str2) {
        boolean z = false;
        xdl0.M(this.f1873i, false);
        xdl0.M(this.f1874j, false);
        xdl0.M(this.f1885u, false);
        xdl0.M(this.f1886v, false);
        if (CoreModule.N().M8() && NullChecker.a(bubbleInfo) && !TextUtils.isEmpty(bubbleInfo.id)) {
            z = true;
        }
        xdl0.M(this.f1872h, !z);
        if (z) {
            xdl0.M(this.f1889y, true);
            this.f1889y.m3088v(bubbleInfo, m3278W());
            xdl0.E0(this.f1889y, new View.OnClickListener() { // from class: l.f5k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserGreetHeadView.m3268P(view);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3277V(this);
        this.f1863A = this.f1869e.get_pic();
        xdl0.E0(this.f1868d, new View.OnClickListener() { // from class: l.d5k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4114a.m3273X(view);
            }
        });
        xdl0.E0(this.f1871g, new View.OnClickListener() { // from class: l.e5k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4259a.m3274Y(view);
            }
        });
        if ((m3278W() instanceof GreetAct) && NullChecker.a(this.f1870f)) {
            if (((GreetAct) m3278W()).m2922g2()) {
                this.f1870f.setBackgroundResource(0);
                this.f1870f.setImageResource(CoreModule.P().i().e() ? c3c0.f3558G : c3c0.f3567H);
            }
            if (CoreModule.o.d().I5() || CoreModule.P().a().jj()) {
                this.f1870f.setImageResource(c3c0.f3781f6);
            } else {
                this.f1870f.setImageResource(c3c0.f3847n0);
            }
        }
    }

    @Override // p003l.fsl
    /* JADX INFO: renamed from: p */
    public void mo3287p(Act act, final String str, final CoreMomentInfo coreMomentInfo, String str2, String str3) {
        this.f1865C = NullChecker.a(coreMomentInfo) ? ((CopyObject) coreMomentInfo).id : "";
        boolean z = this.f1890z;
        VLinear vLinear = this.f1872h;
        if (!z) {
            xdl0.M(vLinear, false);
            return;
        }
        xdl0.M(vLinear, this.f1866D);
        xdl0.M(this.f1873i, false);
        xdl0.M(this.f1874j, false);
        xdl0.M(this.f1885u, false);
        xdl0.M(this.f1886v, false);
        if (CoreModule.N().M8()) {
            xdl0.M(this.f1872h, !(TextUtils.isEmpty(str2) && CoreModule.N().Ib(str3)) && this.f1866D);
            if (CoreModule.N().Ib(str3) && TextUtils.isEmpty(str2)) {
                xdl0.M(this.f1887w, true);
                this.f1887w.m3055g(act, str, coreMomentInfo);
                xdl0.E0(this.f1887w, new View.OnClickListener() { // from class: l.g5k0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f4580a.m3279Z(coreMomentInfo, str, view);
                    }
                });
                return;
            }
        }
        if ((m3278W() instanceof GreetAct) && !((GreetAct) m3278W()).m2923h2()) {
            xdl0.E0(this.f1872h, new View.OnClickListener() { // from class: l.h5k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4796a.m3280a0(str, view);
                }
            });
        }
        if (!NullChecker.a(coreMomentInfo) || vwb.J(coreMomentInfo.media)) {
            if (!NullChecker.a(coreMomentInfo) || TextUtils.isEmpty(coreMomentInfo.value)) {
                xdl0.M(this.f1873i, true);
                this.f1873i.setText("内容已删除");
                return;
            } else {
                xdl0.M(this.f1873i, true);
                this.f1873i.setText(coreMomentInfo.value);
                return;
            }
        }
        if (coreMomentInfo.media.get(0) instanceof Audio) {
            xdl0.M(this.f1885u, true);
            m3282b0((Audio) coreMomentInfo.media.get(0));
        } else {
            xdl0.M(this.f1874j, true);
            m3284c0(this.f1875k, this.f1876l, this.f1877m, coreMomentInfo.media, 0);
            m3284c0(this.f1878n, this.f1879o, this.f1880p, coreMomentInfo.media, 1);
            m3284c0(this.f1881q, this.f1882r, this.f1883s, coreMomentInfo.media, 2);
            int size = coreMomentInfo.media.size();
            VText vText = this.f1884t;
            if (size > 3) {
                xdl0.M(vText, true);
                this.f1884t.setText(String.format("+%s", Integer.valueOf(coreMomentInfo.media.size() - 3)));
            } else {
                xdl0.M(vText, false);
            }
        }
        if (TextUtils.isEmpty(coreMomentInfo.value)) {
            return;
        }
        xdl0.M(this.f1886v, true);
        this.f1886v.setText(coreMomentInfo.value);
    }

    @Override // p003l.fsl
    public void setMomentId(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f1865C) || !TextUtils.equals(str, this.f1865C)) {
            return;
        }
        xdl0.M(this.f1872h, false);
        this.f1866D = false;
    }

    @Override // p003l.fsl
    public void setOnAvatarClickListener(View.OnClickListener onClickListener) {
        this.f1864B = onClickListener;
    }

    public void setShowGreetLayout(boolean z) {
        this.f1890z = z;
    }

    public UserGreetHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1890z = true;
        this.f1866D = true;
    }

    public UserGreetHeadView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1890z = true;
        this.f1866D = true;
    }
}
