package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.ui.greet.d;
import com.p1.mobile.putong.core.ui.vip.widget.LetterRemainingSwitcherView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.RecommendMessage;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.c4g0;
import l.e30;
import l.mkd0;
import l.o6j0;
import l.qib0;
import l.t100;
import l.vwb;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.yh4;
import p009l.dol;
import p009l.eol;
import p009l.q860;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardBottomMomentGreetView extends VLinear implements eol {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f2321c;

    /* JADX INFO: renamed from: d */
    public VLinear f2322d;

    /* JADX INFO: renamed from: e */
    public CardUserContentView f2323e;

    /* JADX INFO: renamed from: f */
    public VLinear f2324f;

    /* JADX INFO: renamed from: g */
    public VFrame f2325g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f2326h;

    /* JADX INFO: renamed from: i */
    public VImage f2327i;

    /* JADX INFO: renamed from: j */
    public VText f2328j;

    /* JADX INFO: renamed from: k */
    public VText f2329k;

    /* JADX INFO: renamed from: l */
    public LetterRemainingSwitcherView f2330l;

    /* JADX INFO: renamed from: m */
    public VText f2331m;

    /* JADX INFO: renamed from: n */
    public User f2332n;

    /* JADX INFO: renamed from: o */
    public CoreMomentInfo f2333o;

    /* JADX INFO: renamed from: p */
    public c4g0 f2334p;

    public CardBottomMomentGreetView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m2950W(View view) {
        o6j0.c("e_send_message", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.h("is_reply", "0"), o6j0.a.h("moment_id", NullChecker.a(this.f2333o) ? ((CopyObject) this.f2333o).id : ""), o6j0.a.h("is_input", "0"), o6j0.a.h("is_match", "0"), o6j0.a.h("owner_id", ((DbObject) this.f2332n).id), o6j0.a.h("state_id", "")});
        String str = NullChecker.a(this.f2333o) ? ((CopyObject) this.f2333o).id : "";
        d.a aVar = new d.a(((DbObject) this.f2332n).id, "card");
        aVar.n(str);
        aVar.o("p_home,greet");
        d.a(getContext(), aVar);
    }

    /* JADX INFO: renamed from: V */
    public final void m2951V(View view) {
        yh4.a(this, view);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m2952X(dol dolVar, View view, q860 q860Var) {
        List<T> list = q860Var.f19068a;
        User user = this.f2332n;
        if (user == null || !TextUtils.equals(((DbObject) user).id, ((DbObject) dolVar.getUser()).id)) {
            o6j0.h("e_send_message", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.h("is_reply", "0"), o6j0.a.h("moment_id", !vwb.J(list) ? ((CopyObject) ((CoreMomentInfo) list.get(0))).id : ""), o6j0.a.h("is_input", "0"), o6j0.a.h("is_match", "0"), o6j0.a.h("owner_id", ((DbObject) dolVar.getUser()).id), o6j0.a.h("state_id", "")});
        }
        m2955a0(dolVar.getUser(), list);
        xdl0.k0(view);
    }

    /* JADX INFO: renamed from: Y */
    public void m2953Y(final dol dolVar, final View view, Act act) {
        List<RecommendMessage> listM2956b0 = m2956b0(dolVar.getUserInfo().getRecommendMessage());
        if (vwb.J(listM2956b0)) {
            mkd0.z(this.f2334p);
            if (this.f2332n == null || !TextUtils.equals(dolVar.getUserInfo().id, ((DbObject) this.f2332n).id)) {
                CoreModule.N().coreMomentPrevious(dolVar.getUserInfo().id);
            }
            this.f2334p = act.duringCreated(CoreModule.N().coreMomentMoments(dolVar.getUserInfo().id, CoreMomentInfo.JSON_ADAPTER)).subscribe(mkd0.G(new e30() { // from class: l.vh4
                public final void call(Object obj) {
                    this.f21576a.m2952X(dolVar, view, (q860) obj);
                }
            }));
            return;
        }
        User user = this.f2332n;
        if (user == null || !TextUtils.equals(((DbObject) user).id, ((DbObject) dolVar.getUser()).id)) {
            o6j0.h("e_send_message", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.h("is_reply", "1"), o6j0.a.h("moment_id", ""), o6j0.a.h("is_input", "0"), o6j0.a.h("is_match", "0"), o6j0.a.h("owner_id", CoreModule.H().userId()), o6j0.a.h("state_id", "")});
        }
        m2954Z(dolVar.getUser(), listM2956b0);
        this.f2330l.post(new Runnable() { // from class: l.uh4
            @Override // java.lang.Runnable
            public final void run() {
                xdl0.k0(view);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public final void m2954Z(User user, List<RecommendMessage> list) {
        this.f2332n = user;
        xdl0.M(this.f2325g, false);
        xdl0.M(this.f2328j, true);
        xdl0.M(this.f2329k, false);
        xdl0.M(this.f2330l, true);
        xdl0.M(this.f2331m, false);
        this.f2328j.setCompoundDrawablesWithIntrinsicBounds(x2c0.k8, 0, 0, 0);
        if (NullChecker.a(user)) {
            boolean zIsFemale = user.isFemale();
            VText vText = this.f2328j;
            if (zIsFemale) {
                vText.setText(CoreModule.b.getString(R.string.V4));
            } else {
                vText.setText(CoreModule.b.getString(R.string.X4));
            }
        }
        this.f2330l.i();
        this.f2330l.setTextList(vwb.Q(list, new w9j() { // from class: l.wh4
            public final Object call(Object obj) {
                return ((RecommendMessage) obj).messageValue;
            }
        }));
        this.f2330l.g(500L, true, 150L);
        this.f2330l.h();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m2955a0(User user, List<CoreMomentInfo> list) {
        long j;
        this.f2332n = user;
        xdl0.M(this.f2330l, false);
        xdl0.M(this.f2331m, true);
        this.f2328j.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        String str = user.isFemale() ? "她" : "他";
        if (vwb.J(list)) {
            xdl0.M(this.f2325g, false);
            xdl0.M(this.f2328j, false);
            xdl0.M(this.f2329k, true);
            xdl0.d0(this.f2324f, t100.d(20.0f));
            try {
                j = Long.parseLong(((DbObject) user).id);
            } catch (Exception unused) {
                j = 0;
            }
            long j2 = j % 2;
            VText vText = this.f2329k;
            if (j2 == 0) {
                vText.setText(String.format("%1$s很受欢迎，和%2$s聊一聊兴趣爱好更容易收到回复", str, str));
            } else {
                vText.setText(String.format("跟%1$s认真介绍一下自己，让%2$s更了解你", str, str));
            }
        } else {
            this.f2333o = list.get(0);
            if (vwb.J(list.get(0).media) || !NullChecker.a(((Media) list.get(0).media.get(0)).cover())) {
                xdl0.M(this.f2325g, false);
                xdl0.d0(this.f2324f, t100.d(20.0f));
            } else {
                Media media = (Media) list.get(0).media.get(0);
                xdl0.M(this.f2325g, true);
                xdl0.M(this.f2327i, media instanceof Video);
                qib0.G.Q0(this.f2326h, media.cover().profileSmall());
                xdl0.d0(this.f2324f, t100.d(10.0f));
            }
            xdl0.M(this.f2328j, true);
            boolean zIsFemale = user.isFemale();
            VText vText2 = this.f2328j;
            if (zIsFemale) {
                vText2.setText(R.string.U4);
            } else {
                vText2.setText(R.string.W4);
            }
            this.f2329k.setText(list.get(0).value);
            xdl0.M(this.f2329k, !TextUtils.isEmpty(list.get(0).value));
        }
        this.f2329k.setMaxLines(xdl0.O0(this.f2328j) ? 1 : 2);
        if (xdl0.O0(this.f2328j) && xdl0.O0(this.f2329k)) {
            xdl0.X(this.f2329k, t100.d(5.5f));
        } else {
            xdl0.X(this.f2329k, 0);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final List<RecommendMessage> m2956b0(List<RecommendMessage> list) {
        return vwb.n(list, new w9j() { // from class: l.xh4
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((RecommendMessage) obj).messageType, "text"));
            }
        });
    }

    public CardBottomBaseInfoView getBaseInfoLayout() {
        return this.f2321c;
    }

    @Override // p009l.eol
    public CardUserContentView getUserContentLayout() {
        return this.f2323e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2951V(this);
        this.f2330l.setAnimateDirection(false);
        this.f2330l.setTextGravity(19);
        xdl0.E0(this.f2331m, new View.OnClickListener() { // from class: l.th4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20693a.m2950W(view);
            }
        });
    }

    public CardBottomMomentGreetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardBottomMomentGreetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
