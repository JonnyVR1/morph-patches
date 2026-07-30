package p149l;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.data.ChatGroupMemberStatus;
import com.p046p1.mobile.putong.core.data.ChatGroupTag;
import com.p046p1.mobile.putong.core.data.GroupApply;
import com.p046p1.mobile.putong.core.data.GroupMemberStatistic;
import com.p046p1.mobile.putong.core.data.JoinCondition;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.newui.group.ChatGroupTags;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupProfileAct;
import com.p046p1.mobile.putong.core.p053ui.view.SeekArc;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class chk implements s7m<sgk> {

    /* JADX INFO: renamed from: A */
    public VText f80895A;

    /* JADX INFO: renamed from: B */
    public VImage f80896B;

    /* JADX INFO: renamed from: C */
    public VLinear f80897C;

    /* JADX INFO: renamed from: D */
    public VText f80898D;

    /* JADX INFO: renamed from: E */
    public VLinear f80899E;

    /* JADX INFO: renamed from: F */
    public VFrame f80900F;

    /* JADX INFO: renamed from: G */
    public VEditText f80901G;

    /* JADX INFO: renamed from: H */
    public VButton f80902H;

    /* JADX INFO: renamed from: I */
    public GroupProfileAct f80903I;

    /* JADX INFO: renamed from: J */
    public sgk f80904J;

    /* JADX INFO: renamed from: K */
    public boolean f80905K;

    /* JADX INFO: renamed from: L */
    public Menu f80906L;

    /* JADX INFO: renamed from: M */
    public boolean f80907M = true;

    /* JADX INFO: renamed from: N */
    public boolean f80908N = false;

    /* JADX INFO: renamed from: O */
    public String f80909O = "";

    /* JADX INFO: renamed from: P */
    public List<GroupMemberStatistic> f80910P = new ArrayList();

    /* JADX INFO: renamed from: Q */
    public List<ChatGroupTag> f80911Q = new ArrayList();

    /* JADX INFO: renamed from: R */
    public boolean f80912R = false;

    /* JADX INFO: renamed from: a */
    public VScroll f80913a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f80914b;

    /* JADX INFO: renamed from: c */
    public VText f80915c;

    /* JADX INFO: renamed from: d */
    public VText f80916d;

    /* JADX INFO: renamed from: e */
    public VText f80917e;

    /* JADX INFO: renamed from: f */
    public VText f80918f;

    /* JADX INFO: renamed from: g */
    public VLinear f80919g;

    /* JADX INFO: renamed from: h */
    public VLinear f80920h;

    /* JADX INFO: renamed from: i */
    public SeekArc f80921i;

    /* JADX INFO: renamed from: j */
    public VText f80922j;

    /* JADX INFO: renamed from: k */
    public VLinear f80923k;

    /* JADX INFO: renamed from: l */
    public SeekArc f80924l;

    /* JADX INFO: renamed from: m */
    public VText f80925m;

    /* JADX INFO: renamed from: n */
    public VLinear f80926n;

    /* JADX INFO: renamed from: o */
    public SeekArc f80927o;

    /* JADX INFO: renamed from: p */
    public VText f80928p;

    /* JADX INFO: renamed from: q */
    public VLinear f80929q;

    /* JADX INFO: renamed from: r */
    public SeekArc f80930r;

    /* JADX INFO: renamed from: s */
    public VText f80931s;

    /* JADX INFO: renamed from: t */
    public VLinear f80932t;

    /* JADX INFO: renamed from: u */
    public ChatGroupTags f80933u;

    /* JADX INFO: renamed from: v */
    public VLinear f80934v;

    /* JADX INFO: renamed from: w */
    public VRelative f80935w;

    /* JADX INFO: renamed from: x */
    public VText f80936x;

    /* JADX INFO: renamed from: y */
    public VImage f80937y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f80938z;

    /* JADX INFO: renamed from: l.chk$a */
    public class C16153a implements f30<Boolean, Integer> {
        public C16153a() {
        }

        @Override // p149l.f30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool, Integer num) {
            chk.this.f80908N = bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: l.chk$b */
    public class ViewOnTouchListenerC16154b implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public float f80940a;

        public ViewOnTouchListenerC16154b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!chk.this.f80908N) {
                return false;
            }
            if (motionEvent.getAction() == 0) {
                this.f80940a = motionEvent.getY();
                return false;
            }
            if (motionEvent.getAction() != 2 || Math.abs(motionEvent.getY() - this.f80940a) < ViewConfiguration.get(chk.this.f80903I).getScaledEdgeSlop()) {
                return false;
            }
            chk.this.f80903I.hideInput(chk.this.f80901G);
            return true;
        }
    }

    /* JADX INFO: renamed from: l.chk$c */
    public static class C16155c {
        /* JADX INFO: renamed from: b */
        public static void m106966b(chk chkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            chkVar.f80913a = (VScroll) viewGroup.getChildAt(0);
            chkVar.f80914b = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
            chkVar.f80915c = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
            chkVar.f80916d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
            chkVar.f80917e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
            chkVar.f80918f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
            chkVar.f80919g = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
            chkVar.f80920h = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
            chkVar.f80921i = (SeekArc) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
            chkVar.f80922j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
            chkVar.f80923k = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
            chkVar.f80924l = (SeekArc) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
            chkVar.f80925m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
            chkVar.f80926n = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(2);
            chkVar.f80927o = (SeekArc) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(0);
            chkVar.f80928p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(1);
            chkVar.f80929q = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(3);
            chkVar.f80930r = (SeekArc) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(0);
            chkVar.f80931s = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(1);
            chkVar.f80932t = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            chkVar.f80933u = (ChatGroupTags) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
            chkVar.f80934v = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            chkVar.f80935w = (VRelative) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
            chkVar.f80936x = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
            chkVar.f80937y = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
            chkVar.f80938z = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(2)).getChildAt(0);
            chkVar.f80895A = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(2)).getChildAt(1);
            chkVar.f80896B = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(2)).getChildAt(2);
            chkVar.f80897C = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
            chkVar.f80898D = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(2);
            chkVar.f80899E = (VLinear) viewGroup.getChildAt(1);
            chkVar.f80900F = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            chkVar.f80901G = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
            chkVar.f80902H = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m106967c(chk chkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.f126579v0, viewGroup, false);
            m106966b(chkVar, viewInflate);
            return viewInflate;
        }
    }

    public chk(GroupProfileAct groupProfileAct) {
        this.f80903I = groupProfileAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m106930e0(View view) {
        this.f80904J.m184124s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m106932f0(View view) {
        if (xdl0.m208349O0(this.f80901G)) {
            this.f80903I.hideInput(this.f80901G);
        }
        this.f80904J.m184119l0(this.f80901G.getText().toString().trim());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m106934i0(View view) {
        o6j0.m162859c("e_apply_add_group_reason", this.f80904J.pageId(), o6j0.C18854a.m162878h("groupchat_id", this.f80904J.m184120m0()));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f80903I;
    }

    /* JADX INFO: renamed from: b0 */
    public View m106949b0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16155c.m106967c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(sgk sgkVar) {
        this.f80904J = sgkVar;
    }

    /* JADX INFO: renamed from: d0 */
    public final SpannableStringBuilder m106951d0(List<ChatGroupTag> list, int i, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        for (ChatGroupTag chatGroupTag : list) {
            if (z) {
                spannableStringBuilder.append((CharSequence) "1");
                au4 au4Var = new au4(CoreModule.f17544b, chatGroupTag.name, !TextUtils.isEmpty(chatGroupTag.textColor) ? Color.parseColor(chatGroupTag.textColor) : -9079435, 13, !TextUtils.isEmpty(chatGroupTag.backgroundColor) ? Color.parseColor(chatGroupTag.backgroundColor) : this.f80903I.color(a1c0.f67146a0), i, 10, t100.f167262k, 0.0f, 10.0f, 5.0f, -1644826, CoreModule.f17544b.getResources().getDimensionPixelSize(x1c0.f189046a), true);
                int i3 = i2 + 1;
                spannableStringBuilder.setSpan(au4Var, i2, i3, 33);
                i2 = i3;
            } else {
                spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ boolean m106952g0(View view) {
        if (TextUtils.isEmpty(this.f80909O)) {
            return true;
        }
        e51.m114766q(this.f80909O);
        lsi0.m151593w(R$string.f20778I5);
        return true;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m106953h0(VScroll vScroll, int i, int i2, int i3, int i4) {
        int scrollY = this.f80913a.getScrollY();
        int iM186890d = t100.m186890d(40.0f);
        boolean z = this.f80905K;
        if (scrollY >= iM186890d) {
            if (z) {
                return;
            }
            this.f80903I.setTitle(this.f80915c.getText());
            this.f80905K = true;
            return;
        }
        if (z) {
            this.f80903I.setTitle("");
            this.f80905K = false;
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m106949b0(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m106954j0(View view) {
        m106963r0();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m106955k0(User user, View view) {
        if (wdk.m202744d(user)) {
            return;
        }
        this.f80904J.m184124s0();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ SpannableStringBuilder m106956l0(Integer num, Boolean bool) {
        return m106951d0(this.f80911Q, num.intValue(), bool.booleanValue());
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m106957m0(Dialog dialog, View view, int i, CharSequence charSequence) {
        GroupProfileAct groupProfileAct = this.f80903I;
        groupProfileAct.startActivity(WebViewAct.m80164Z1(groupProfileAct, "", tbk.m187870q(this.f80904J.m184120m0())));
    }

    /* JADX INFO: renamed from: n0 */
    public void m106958n0(Menu menu) {
        if (this.f80912R) {
            return;
        }
        this.f80906L = menu;
        MenuItem menuItemAdd = menu.add(0, 0, 0, this.f80903I.string(R$string.f20820O));
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setActionView(l6c0.f126447c1);
        xdl0.m208329E0(menuItemAdd.getActionView(), new View.OnClickListener() { // from class: l.tgk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170099a.m106954j0(view);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public void m106959o0(ChatGroup chatGroup, final User user) {
        if (!NullChecker.m81303a(user) || user.isMe()) {
            xdl0.m208344M(this.f80934v, false);
            this.f80912R = true;
            if (NullChecker.m81303a(this.f80906L)) {
                this.f80906L.setGroupVisible(0, false);
                return;
            }
            return;
        }
        xdl0.m208344M(this.f80934v, true);
        this.f80912R = false;
        if (tbk.m187872s(chatGroup)) {
            this.f80938z.setBackgroundResource(c3c0.f78540I0);
            qib0.f154691G.m102356Z0(this.f80938z, tbk.m187864k(user));
        } else if (user.isBanedOrInactivated()) {
            qib0.f154691G.m102354Y0(this.f80938z, CoreModule.m29935P().m94658i().mo158306T0());
        } else {
            qib0.f154691G.m102341Q0(this.f80938z, user.picture(0).profileSmall());
        }
        boolean zIsBanedOrInactivated = user.isBanedOrInactivated();
        VText vText = this.f80895A;
        if (zIsBanedOrInactivated) {
            vText.setText(user.publicId);
            xdl0.m208329E0(this.f80935w, new View.OnClickListener() { // from class: l.ugk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f176397a.m106955k0(user, view);
                }
            });
        } else {
            vText.setText(tbk.m187868o(user.name));
            qib0.f154713b0.f139231b.showUserVerificationLogo(this.f80903I, user, this.f80896B);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m106960p0(ChatGroup chatGroup, ChatGroupMember chatGroupMember, GroupApply groupApply) {
        if (vwb.m200296J(chatGroup.avatars)) {
            qib0.f154691G.m102354Y0(this.f80914b, c3c0.f78540I0);
        } else {
            qib0.f154691G.m102341Q0(this.f80914b, chatGroup.avatars.get(0).profileSmall());
        }
        this.f80915c.setText(chatGroup.name);
        this.f80917e.setText(String.format("ID: %1$s", chatGroup.publicId));
        this.f80918f.setText(String.format("%1$s %2$s/%3$s", this.f80903I.string(R$string.f20844R), Integer.valueOf(chatGroup.memberCount), Integer.valueOf(chatGroup.memberLimit)));
        this.f80909O = chatGroup.publicId;
        if (TextUtils.isEmpty(chatGroup.category.name) || chatGroup.category.hidden) {
            xdl0.m208344M(this.f80916d, false);
        } else {
            xdl0.m208344M(this.f80916d, true);
            this.f80916d.setText(chatGroup.category.name);
        }
        if (!TextUtils.isEmpty(chatGroup.category.backgroundColor)) {
            this.f80916d.setBackground(fce.m120425b(Color.parseColor(chatGroup.category.backgroundColor), t100.m186890d(4.0f)));
        }
        if (!TextUtils.isEmpty(chatGroup.category.textColor)) {
            this.f80916d.setTextColor(Color.parseColor(chatGroup.category.textColor));
        }
        if (!vwb.m200296J(chatGroup.memberStatistics)) {
            this.f80910P.clear();
            this.f80910P.addAll(chatGroup.memberStatistics);
        }
        xdl0.m208344M(this.f80918f, !vwb.m200296J(this.f80910P));
        xdl0.m208344M(this.f80919g, !vwb.m200296J(this.f80910P));
        if (!vwb.m200296J(this.f80910P)) {
            xdl0.m208344M(this.f80920h, this.f80910P.size() >= 1);
            xdl0.m208344M(this.f80923k, this.f80910P.size() >= 2);
            xdl0.m208344M(this.f80926n, this.f80910P.size() >= 3);
            xdl0.m208344M(this.f80929q, this.f80910P.size() >= 4);
            if (this.f80910P.size() >= 1) {
                m106961q0(this.f80921i, this.f80922j, this.f80910P.get(0));
            }
            if (this.f80910P.size() >= 2) {
                m106961q0(this.f80924l, this.f80925m, this.f80910P.get(1));
            }
            if (this.f80910P.size() >= 3) {
                m106961q0(this.f80927o, this.f80928p, this.f80910P.get(2));
            }
            if (this.f80910P.size() >= 4) {
                m106961q0(this.f80930r, this.f80931s, this.f80910P.get(3));
            }
        }
        if (!vwb.m200296J(chatGroup.tags)) {
            this.f80911Q.clear();
            this.f80911Q.addAll(chatGroup.tags);
        }
        boolean zM200296J = vwb.m200296J(this.f80911Q);
        VLinear vLinear = this.f80932t;
        if (zM200296J) {
            xdl0.m208344M(vLinear, false);
        } else {
            xdl0.m208344M(vLinear, true);
            this.f80933u.setTags(new x9j() { // from class: l.vgk
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return this.f181378a.m106956l0((Integer) obj, (Boolean) obj2);
                }
            });
        }
        boolean zIsEmpty = TextUtils.isEmpty(chatGroup.description);
        VLinear vLinear2 = this.f80897C;
        if (zIsEmpty) {
            xdl0.m208344M(vLinear2, false);
        } else {
            xdl0.m208344M(vLinear2, true);
            this.f80898D.setText(chatGroup.description);
        }
        if (NullChecker.m81303a(chatGroupMember) && !TEnum.equals(chatGroupMember.status, ChatGroupMemberStatus.exited)) {
            xdl0.m208344M(this.f80900F, false);
            if (this.f80907M) {
                o6j0.m162864h("e_enter_groupchat", this.f80904J.pageId(), o6j0.C18854a.m162878h("groupchat_id", this.f80904J.m184120m0()), o6j0.C18854a.m162876f("is_anonymou_group", tbk.m187872s(chatGroup) ? 1 : 0));
                this.f80907M = false;
            }
            this.f80902H.setText(R$string.f20740E);
            this.f80902H.setEnabled(true);
        } else if (NullChecker.m81303a(groupApply) && TEnum.equals(groupApply.status, "default")) {
            xdl0.m208344M(this.f80900F, false);
            this.f80902H.setText(R$string.f21124y);
            this.f80902H.setEnabled(false);
        } else {
            xdl0.m208344M(this.f80900F, true);
            boolean zEquals = TEnum.equals(chatGroup.joinCondition, JoinCondition.noApplyRequired);
            VButton vButton = this.f80902H;
            if (zEquals) {
                vButton.setText("加入");
            } else {
                vButton.setText(R$string.f21132z);
            }
            this.f80902H.setEnabled(true);
        }
        if (TEnum.equals(chatGroup.joinCondition, JoinCondition.noApplyRequired)) {
            xdl0.m208344M(this.f80900F, false);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m106961q0(SeekArc seekArc, VText vText, GroupMemberStatistic groupMemberStatistic) {
        if (!TextUtils.isEmpty(groupMemberStatistic.backgroundColor)) {
            seekArc.setProgressColor(Color.parseColor(groupMemberStatistic.backgroundColor));
        }
        if (!TextUtils.isEmpty(groupMemberStatistic.textColor)) {
            vText.setTextColor(Color.parseColor(groupMemberStatistic.textColor));
        }
        seekArc.setProgress((int) (groupMemberStatistic.percentage * 100.0d));
        vText.setText(groupMemberStatistic.description);
    }

    /* JADX INFO: renamed from: r */
    public void m106962r() {
        this.f80903I.setTitle("");
        xdl0.m208329E0(this.f80935w, new View.OnClickListener() { // from class: l.wgk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186205a.m106930e0(view);
            }
        });
        xdl0.m208329E0(this.f80902H, new View.OnClickListener() { // from class: l.xgk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192772a.m106932f0(view);
            }
        });
        this.f80917e.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ygk
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f198203a.m106952g0(view);
            }
        });
        this.f80903I.setUpKeyboardDetectorLayout(new View(this.f80903I), this.f80913a, new C16153a());
        this.f80913a.setOnTouchListener(new ViewOnTouchListenerC16154b());
        this.f80913a.m223193d(new VScroll.InterfaceC22566a() { // from class: l.zgk
            @Override // p147v.VScroll.InterfaceC22566a
            /* JADX INFO: renamed from: a */
            public final void mo43191a(VScroll vScroll, int i, int i2, int i3, int i4) {
                this.f203051a.m106953h0(vScroll, i, i2, i3, i4);
            }
        });
        xdl0.m208329E0(this.f80901G, new View.OnClickListener() { // from class: l.ahk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69609a.m106934i0(view);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final void m106963r0() {
        this.f80903I.dialog().m20535e0(vwb.m200324f0(this.f80903I.string(R$string.f20820O))).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.bhk
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f75618a.m106957m0(dialog, view, i, charSequence);
            }
        }).m20567z().show();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
