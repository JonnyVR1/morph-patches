package p153l;

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
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.data.ChatGroupMemberStatus;
import com.p051p1.mobile.putong.core.data.ChatGroupTag;
import com.p051p1.mobile.putong.core.data.GroupApply;
import com.p051p1.mobile.putong.core.data.GroupMemberStatistic;
import com.p051p1.mobile.putong.core.data.JoinCondition;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.group.ChatGroupTags;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupProfileAct;
import com.p051p1.mobile.putong.core.p058ui.view.SeekArc;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class sjk implements iam<ijk> {

    /* JADX INFO: renamed from: A */
    public VText f168979A;

    /* JADX INFO: renamed from: B */
    public VImage f168980B;

    /* JADX INFO: renamed from: C */
    public VLinear f168981C;

    /* JADX INFO: renamed from: D */
    public VText f168982D;

    /* JADX INFO: renamed from: E */
    public VLinear f168983E;

    /* JADX INFO: renamed from: F */
    public VFrame f168984F;

    /* JADX INFO: renamed from: G */
    public VEditText f168985G;

    /* JADX INFO: renamed from: H */
    public VButton f168986H;

    /* JADX INFO: renamed from: I */
    public GroupProfileAct f168987I;

    /* JADX INFO: renamed from: J */
    public ijk f168988J;

    /* JADX INFO: renamed from: K */
    public boolean f168989K;

    /* JADX INFO: renamed from: L */
    public Menu f168990L;

    /* JADX INFO: renamed from: M */
    public boolean f168991M = true;

    /* JADX INFO: renamed from: N */
    public boolean f168992N = false;

    /* JADX INFO: renamed from: O */
    public String f168993O = "";

    /* JADX INFO: renamed from: P */
    public List<GroupMemberStatistic> f168994P = new ArrayList();

    /* JADX INFO: renamed from: Q */
    public List<ChatGroupTag> f168995Q = new ArrayList();

    /* JADX INFO: renamed from: R */
    public boolean f168996R = false;

    /* JADX INFO: renamed from: a */
    public VScroll f168997a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f168998b;

    /* JADX INFO: renamed from: c */
    public VText f168999c;

    /* JADX INFO: renamed from: d */
    public VText f169000d;

    /* JADX INFO: renamed from: e */
    public VText f169001e;

    /* JADX INFO: renamed from: f */
    public VText f169002f;

    /* JADX INFO: renamed from: g */
    public VLinear f169003g;

    /* JADX INFO: renamed from: h */
    public VLinear f169004h;

    /* JADX INFO: renamed from: i */
    public SeekArc f169005i;

    /* JADX INFO: renamed from: j */
    public VText f169006j;

    /* JADX INFO: renamed from: k */
    public VLinear f169007k;

    /* JADX INFO: renamed from: l */
    public SeekArc f169008l;

    /* JADX INFO: renamed from: m */
    public VText f169009m;

    /* JADX INFO: renamed from: n */
    public VLinear f169010n;

    /* JADX INFO: renamed from: o */
    public SeekArc f169011o;

    /* JADX INFO: renamed from: p */
    public VText f169012p;

    /* JADX INFO: renamed from: q */
    public VLinear f169013q;

    /* JADX INFO: renamed from: r */
    public SeekArc f169014r;

    /* JADX INFO: renamed from: s */
    public VText f169015s;

    /* JADX INFO: renamed from: t */
    public VLinear f169016t;

    /* JADX INFO: renamed from: u */
    public ChatGroupTags f169017u;

    /* JADX INFO: renamed from: v */
    public VLinear f169018v;

    /* JADX INFO: renamed from: w */
    public VRelative f169019w;

    /* JADX INFO: renamed from: x */
    public VText f169020x;

    /* JADX INFO: renamed from: y */
    public VImage f169021y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f169022z;

    /* JADX INFO: renamed from: l.sjk$a */
    public class C20055a implements z20<Boolean, Integer> {
        public C20055a() {
        }

        @Override // p153l.z20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool, Integer num) {
            sjk.this.f168992N = bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: l.sjk$b */
    public class ViewOnTouchListenerC20056b implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public float f169024a;

        public ViewOnTouchListenerC20056b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!sjk.this.f168992N) {
                return false;
            }
            if (motionEvent.getAction() == 0) {
                this.f169024a = motionEvent.getY();
                return false;
            }
            if (motionEvent.getAction() != 2 || Math.abs(motionEvent.getY() - this.f169024a) < ViewConfiguration.get(sjk.this.f168987I).getScaledEdgeSlop()) {
                return false;
            }
            sjk.this.f168987I.hideInput(sjk.this.f168985G);
            return true;
        }
    }

    /* JADX INFO: renamed from: l.sjk$c */
    public static class C20057c {
        /* JADX INFO: renamed from: b */
        public static void m186166b(sjk sjkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            sjkVar.f168997a = (VScroll) viewGroup.getChildAt(0);
            sjkVar.f168998b = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
            sjkVar.f168999c = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
            sjkVar.f169000d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
            sjkVar.f169001e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
            sjkVar.f169002f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
            sjkVar.f169003g = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
            sjkVar.f169004h = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
            sjkVar.f169005i = (SeekArc) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
            sjkVar.f169006j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
            sjkVar.f169007k = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
            sjkVar.f169008l = (SeekArc) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
            sjkVar.f169009m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
            sjkVar.f169010n = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(2);
            sjkVar.f169011o = (SeekArc) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(0);
            sjkVar.f169012p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(1);
            sjkVar.f169013q = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(3);
            sjkVar.f169014r = (SeekArc) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(0);
            sjkVar.f169015s = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(1);
            sjkVar.f169016t = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            sjkVar.f169017u = (ChatGroupTags) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
            sjkVar.f169018v = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            sjkVar.f169019w = (VRelative) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
            sjkVar.f169020x = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
            sjkVar.f169021y = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
            sjkVar.f169022z = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(2)).getChildAt(0);
            sjkVar.f168979A = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(2)).getChildAt(1);
            sjkVar.f168980B = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(2)).getChildAt(2);
            sjkVar.f168981C = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
            sjkVar.f168982D = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(2);
            sjkVar.f168983E = (VLinear) viewGroup.getChildAt(1);
            sjkVar.f168984F = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            sjkVar.f168985G = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
            sjkVar.f168986H = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m186167c(sjk sjkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(qec0.f157135v0, viewGroup, false);
            m186166b(sjkVar, viewInflate);
            return viewInflate;
        }
    }

    public sjk(GroupProfileAct groupProfileAct) {
        this.f168987I = groupProfileAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m186130e0(View view) {
        this.f168988J.m140209s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m186132f0(View view) {
        if (bnl0.m105529O0(this.f168985G)) {
            this.f168987I.hideInput(this.f168985G);
        }
        this.f168988J.m140204l0(this.f168985G.getText().toString().trim());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m186134i0(View view) {
        sfj0.m185596c("e_apply_add_group_reason", this.f168988J.pageId(), sfj0.C20032a.m185615h("groupchat_id", this.f168988J.m140205m0()));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f168987I;
    }

    /* JADX INFO: renamed from: b0 */
    public View m186149b0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C20057c.m186167c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ijk ijkVar) {
        this.f168988J = ijkVar;
    }

    /* JADX INFO: renamed from: d0 */
    public final SpannableStringBuilder m186151d0(List<ChatGroupTag> list, int i, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        for (ChatGroupTag chatGroupTag : list) {
            if (z) {
                spannableStringBuilder.append((CharSequence) "1");
                zu4 zu4Var = new zu4(CoreModule.f18263b, chatGroupTag.name, !TextUtils.isEmpty(chatGroupTag.textColor) ? Color.parseColor(chatGroupTag.textColor) : -9079435, 13, !TextUtils.isEmpty(chatGroupTag.backgroundColor) ? Color.parseColor(chatGroupTag.backgroundColor) : this.f168987I.color(g9c0.f102810a0), i, 10, qa00.f156324k, 0.0f, 10.0f, 5.0f, -1644826, CoreModule.f18263b.getResources().getDimensionPixelSize(eac0.f92753a), true);
                int i3 = i2 + 1;
                spannableStringBuilder.setSpan(zu4Var, i2, i3, 33);
                i2 = i3;
            } else {
                spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ boolean m186152g0(View view) {
        if (TextUtils.isEmpty(this.f168993O)) {
            return true;
        }
        l51.m152911q(this.f168993O);
        o1j0.m165649w(R$string.f21520I5);
        return true;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m186153h0(VScroll vScroll, int i, int i2, int i3, int i4) {
        int scrollY = this.f168997a.getScrollY();
        int iM175859d = qa00.m175859d(40.0f);
        boolean z = this.f168989K;
        if (scrollY >= iM175859d) {
            if (z) {
                return;
            }
            this.f168987I.setTitle(this.f168999c.getText());
            this.f168989K = true;
            return;
        }
        if (z) {
            this.f168987I.setTitle("");
            this.f168989K = false;
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m186149b0(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m186154j0(View view) {
        m186163r0();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m186155k0(User user, View view) {
        if (mgk.m158353d(user)) {
            return;
        }
        this.f168988J.m140209s0();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ SpannableStringBuilder m186156l0(Integer num, Boolean bool) {
        return m186151d0(this.f168995Q, num.intValue(), bool.booleanValue());
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m186157m0(Dialog dialog, View view, int i, CharSequence charSequence) {
        GroupProfileAct groupProfileAct = this.f168987I;
        groupProfileAct.startActivity(WebViewAct.m81347a2(groupProfileAct, "", jek.m144585q(this.f168988J.m140205m0())));
    }

    /* JADX INFO: renamed from: n0 */
    public void m186158n0(Menu menu) {
        if (this.f168996R) {
            return;
        }
        this.f168990L = menu;
        MenuItem menuItemAdd = menu.add(0, 0, 0, this.f168987I.string(R$string.f21562O));
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setActionView(qec0.f157003c1);
        bnl0.m105509E0(menuItemAdd.getActionView(), new View.OnClickListener() { // from class: l.jjk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121191a.m186154j0(view);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public void m186159o0(ChatGroup chatGroup, final User user) {
        if (!NullChecker.m82486a(user) || user.isMe()) {
            bnl0.m105524M(this.f169018v, false);
            this.f168996R = true;
            if (NullChecker.m82486a(this.f168990L)) {
                this.f168990L.setGroupVisible(0, false);
                return;
            }
            return;
        }
        bnl0.m105524M(this.f169018v, true);
        this.f168996R = false;
        if (jek.m144587s(chatGroup)) {
            this.f169022z.setBackgroundResource(ibc0.f113815I0);
            uqb0.f180374G.m127140Z0(this.f169022z, jek.m144579k(user));
        } else if (user.isBanedOrInactivated()) {
            uqb0.f180374G.m127138Y0(this.f169022z, CoreModule.m30933P().m143412i().mo180398T0());
        } else {
            uqb0.f180374G.m127125Q0(this.f169022z, user.picture(0).profileSmall());
        }
        boolean zIsBanedOrInactivated = user.isBanedOrInactivated();
        VText vText = this.f168979A;
        if (zIsBanedOrInactivated) {
            vText.setText(user.publicId);
            bnl0.m105509E0(this.f169019w, new View.OnClickListener() { // from class: l.kjk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f127104a.m186155k0(user, view);
                }
            });
        } else {
            vText.setText(jek.m144583o(user.name));
            uqb0.f180396b0.f170325b.showUserVerificationLogo(this.f168987I, user, this.f168980B);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m186160p0(ChatGroup chatGroup, ChatGroupMember chatGroupMember, GroupApply groupApply) {
        if (jyb.m147479J(chatGroup.avatars)) {
            uqb0.f180374G.m127138Y0(this.f168998b, ibc0.f113815I0);
        } else {
            uqb0.f180374G.m127125Q0(this.f168998b, chatGroup.avatars.get(0).profileSmall());
        }
        this.f168999c.setText(chatGroup.name);
        this.f169001e.setText(String.format("ID: %1$s", chatGroup.publicId));
        this.f169002f.setText(String.format("%1$s %2$s/%3$s", this.f168987I.string(R$string.f21586R), Integer.valueOf(chatGroup.memberCount), Integer.valueOf(chatGroup.memberLimit)));
        this.f168993O = chatGroup.publicId;
        if (TextUtils.isEmpty(chatGroup.category.name) || chatGroup.category.hidden) {
            bnl0.m105524M(this.f169000d, false);
        } else {
            bnl0.m105524M(this.f169000d, true);
            this.f169000d.setText(chatGroup.category.name);
        }
        if (!TextUtils.isEmpty(chatGroup.category.backgroundColor)) {
            this.f169000d.setBackground(jde.m144406b(Color.parseColor(chatGroup.category.backgroundColor), qa00.m175859d(4.0f)));
        }
        if (!TextUtils.isEmpty(chatGroup.category.textColor)) {
            this.f169000d.setTextColor(Color.parseColor(chatGroup.category.textColor));
        }
        if (!jyb.m147479J(chatGroup.memberStatistics)) {
            this.f168994P.clear();
            this.f168994P.addAll(chatGroup.memberStatistics);
        }
        bnl0.m105524M(this.f169002f, !jyb.m147479J(this.f168994P));
        bnl0.m105524M(this.f169003g, !jyb.m147479J(this.f168994P));
        if (!jyb.m147479J(this.f168994P)) {
            bnl0.m105524M(this.f169004h, this.f168994P.size() >= 1);
            bnl0.m105524M(this.f169007k, this.f168994P.size() >= 2);
            bnl0.m105524M(this.f169010n, this.f168994P.size() >= 3);
            bnl0.m105524M(this.f169013q, this.f168994P.size() >= 4);
            if (this.f168994P.size() >= 1) {
                m186161q0(this.f169005i, this.f169006j, this.f168994P.get(0));
            }
            if (this.f168994P.size() >= 2) {
                m186161q0(this.f169008l, this.f169009m, this.f168994P.get(1));
            }
            if (this.f168994P.size() >= 3) {
                m186161q0(this.f169011o, this.f169012p, this.f168994P.get(2));
            }
            if (this.f168994P.size() >= 4) {
                m186161q0(this.f169014r, this.f169015s, this.f168994P.get(3));
            }
        }
        if (!jyb.m147479J(chatGroup.tags)) {
            this.f168995Q.clear();
            this.f168995Q.addAll(chatGroup.tags);
        }
        boolean zM147479J = jyb.m147479J(this.f168995Q);
        VLinear vLinear = this.f169016t;
        if (zM147479J) {
            bnl0.m105524M(vLinear, false);
        } else {
            bnl0.m105524M(vLinear, true);
            this.f169017u.setTags(new rcj() { // from class: l.ljk
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return this.f132343a.m186156l0((Integer) obj, (Boolean) obj2);
                }
            });
        }
        boolean zIsEmpty = TextUtils.isEmpty(chatGroup.description);
        VLinear vLinear2 = this.f168981C;
        if (zIsEmpty) {
            bnl0.m105524M(vLinear2, false);
        } else {
            bnl0.m105524M(vLinear2, true);
            this.f168982D.setText(chatGroup.description);
        }
        if (NullChecker.m82486a(chatGroupMember) && !TEnum.equals(chatGroupMember.status, ChatGroupMemberStatus.exited)) {
            bnl0.m105524M(this.f168984F, false);
            if (this.f168991M) {
                sfj0.m185601h("e_enter_groupchat", this.f168988J.pageId(), sfj0.C20032a.m185615h("groupchat_id", this.f168988J.m140205m0()), sfj0.C20032a.m185613f("is_anonymou_group", jek.m144587s(chatGroup) ? 1 : 0));
                this.f168991M = false;
            }
            this.f168986H.setText(R$string.f21482E);
            this.f168986H.setEnabled(true);
        } else if (NullChecker.m82486a(groupApply) && TEnum.equals(groupApply.status, "default")) {
            bnl0.m105524M(this.f168984F, false);
            this.f168986H.setText(R$string.f21866y);
            this.f168986H.setEnabled(false);
        } else {
            bnl0.m105524M(this.f168984F, true);
            boolean zEquals = TEnum.equals(chatGroup.joinCondition, JoinCondition.noApplyRequired);
            VButton vButton = this.f168986H;
            if (zEquals) {
                vButton.setText("加入");
            } else {
                vButton.setText(R$string.f21874z);
            }
            this.f168986H.setEnabled(true);
        }
        if (TEnum.equals(chatGroup.joinCondition, JoinCondition.noApplyRequired)) {
            bnl0.m105524M(this.f168984F, false);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m186161q0(SeekArc seekArc, VText vText, GroupMemberStatistic groupMemberStatistic) {
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
    public void m186162r() {
        this.f168987I.setTitle("");
        bnl0.m105509E0(this.f169019w, new View.OnClickListener() { // from class: l.mjk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137101a.m186130e0(view);
            }
        });
        bnl0.m105509E0(this.f168986H, new View.OnClickListener() { // from class: l.njk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142302a.m186132f0(view);
            }
        });
        this.f169001e.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ojk
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f147679a.m186152g0(view);
            }
        });
        this.f168987I.setUpKeyboardDetectorLayout(new View(this.f168987I), this.f168997a, new C20055a());
        this.f168997a.setOnTouchListener(new ViewOnTouchListenerC20056b());
        this.f168997a.m224439d(new VScroll.InterfaceC22681a() { // from class: l.pjk
            @Override // p151v.VScroll.InterfaceC22681a
            /* JADX INFO: renamed from: a */
            public final void mo44202a(VScroll vScroll, int i, int i2, int i3, int i4) {
                this.f152708a.m186153h0(vScroll, i, i2, i3, i4);
            }
        });
        bnl0.m105509E0(this.f168985G, new View.OnClickListener() { // from class: l.qjk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157994a.m186134i0(view);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final void m186163r0() {
        this.f168987I.dialog().m21534e0(jyb.m147507f0(this.f168987I.string(R$string.f21562O))).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.rjk
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f163462a.m186157m0(dialog, view, i, charSequence);
            }
        }).m21566z().show();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
