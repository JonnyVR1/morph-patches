package p003l;

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
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.group.GroupProfileAct;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.data.ChatGroupTag;
import com.p1.mobile.putong.core.data.GroupApply;
import com.p1.mobile.putong.core.data.GroupMemberStatistic;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.newui.group.ChatGroupTags;
import com.p1.mobile.putong.core.ui.view.SeekArc;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.a1c0;
import l.au4;
import l.c3c0;
import l.e51;
import l.fce;
import l.l6c0;
import l.lsi0;
import l.o6j0;
import l.qib0;
import l.s7m;
import l.t100;
import l.vwb;
import l.x1c0;
import l.xdl0;
import org.eclipse.jetty.servlet.ServletHandler;
import p028v.VButton;
import p028v.VDraweeView;
import p028v.VEditText;
import p028v.VFrame;
import p028v.VImage;
import p028v.VLinear;
import p028v.VRelative;
import p028v.VScroll;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class chk implements s7m<sgk> {

    /* JADX INFO: renamed from: A */
    public VText f2648A;

    /* JADX INFO: renamed from: B */
    public VImage f2649B;

    /* JADX INFO: renamed from: C */
    public VLinear f2650C;

    /* JADX INFO: renamed from: D */
    public VText f2651D;

    /* JADX INFO: renamed from: E */
    public VLinear f2652E;

    /* JADX INFO: renamed from: F */
    public VFrame f2653F;

    /* JADX INFO: renamed from: G */
    public VEditText f2654G;

    /* JADX INFO: renamed from: H */
    public VButton f2655H;

    /* JADX INFO: renamed from: I */
    public GroupProfileAct f2656I;

    /* JADX INFO: renamed from: J */
    public sgk f2657J;

    /* JADX INFO: renamed from: K */
    public boolean f2658K;

    /* JADX INFO: renamed from: L */
    public Menu f2659L;

    /* JADX INFO: renamed from: M */
    public boolean f2660M = true;

    /* JADX INFO: renamed from: N */
    public boolean f2661N = false;

    /* JADX INFO: renamed from: O */
    public String f2662O = "";

    /* JADX INFO: renamed from: P */
    public List<GroupMemberStatistic> f2663P = new ArrayList();

    /* JADX INFO: renamed from: Q */
    public List<ChatGroupTag> f2664Q = new ArrayList();

    /* JADX INFO: renamed from: R */
    public boolean f2665R = false;

    /* JADX INFO: renamed from: a */
    public VScroll f2666a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f2667b;

    /* JADX INFO: renamed from: c */
    public VText f2668c;

    /* JADX INFO: renamed from: d */
    public VText f2669d;

    /* JADX INFO: renamed from: e */
    public VText f2670e;

    /* JADX INFO: renamed from: f */
    public VText f2671f;

    /* JADX INFO: renamed from: g */
    public VLinear f2672g;

    /* JADX INFO: renamed from: h */
    public VLinear f2673h;

    /* JADX INFO: renamed from: i */
    public SeekArc f2674i;

    /* JADX INFO: renamed from: j */
    public VText f2675j;

    /* JADX INFO: renamed from: k */
    public VLinear f2676k;

    /* JADX INFO: renamed from: l */
    public SeekArc f2677l;

    /* JADX INFO: renamed from: m */
    public VText f2678m;

    /* JADX INFO: renamed from: n */
    public VLinear f2679n;

    /* JADX INFO: renamed from: o */
    public SeekArc f2680o;

    /* JADX INFO: renamed from: p */
    public VText f2681p;

    /* JADX INFO: renamed from: q */
    public VLinear f2682q;

    /* JADX INFO: renamed from: r */
    public SeekArc f2683r;

    /* JADX INFO: renamed from: s */
    public VText f2684s;

    /* JADX INFO: renamed from: t */
    public VLinear f2685t;

    /* JADX INFO: renamed from: u */
    public ChatGroupTags f2686u;

    /* JADX INFO: renamed from: v */
    public VLinear f2687v;

    /* JADX INFO: renamed from: w */
    public VRelative f2688w;

    /* JADX INFO: renamed from: x */
    public VText f2689x;

    /* JADX INFO: renamed from: y */
    public VImage f2690y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f2691z;

    /* JADX INFO: renamed from: l.chk$a */
    public class C0201a implements f30<Boolean, Integer> {
        public C0201a() {
        }

        @Override // p003l.f30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool, Integer num) {
            chk.this.f2661N = bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: l.chk$b */
    public class ViewOnTouchListenerC0202b implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public float f2693a;

        public ViewOnTouchListenerC0202b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!chk.this.f2661N) {
                return false;
            }
            if (motionEvent.getAction() == 0) {
                this.f2693a = motionEvent.getY();
                return false;
            }
            if (motionEvent.getAction() != 2 || Math.abs(motionEvent.getY() - this.f2693a) < ViewConfiguration.get(chk.this.f2656I).getScaledEdgeSlop()) {
                return false;
            }
            chk.this.f2656I.hideInput(chk.this.f2654G);
            return true;
        }
    }

    /* JADX INFO: renamed from: l.chk$c */
    public static class C0203c {
        /* JADX INFO: renamed from: b */
        public static void m3332b(chk chkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            chkVar.f2666a = (VScroll) viewGroup.getChildAt(0);
            chkVar.f2667b = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
            chkVar.f2668c = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
            chkVar.f2669d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
            chkVar.f2670e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
            chkVar.f2671f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
            chkVar.f2672g = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
            chkVar.f2673h = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
            chkVar.f2674i = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
            chkVar.f2675j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
            chkVar.f2676k = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
            chkVar.f2677l = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
            chkVar.f2678m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
            chkVar.f2679n = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(2);
            chkVar.f2680o = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(0);
            chkVar.f2681p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(2)).getChildAt(1);
            chkVar.f2682q = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(3);
            chkVar.f2683r = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(0);
            chkVar.f2684s = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(3)).getChildAt(1);
            chkVar.f2685t = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            chkVar.f2686u = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
            chkVar.f2687v = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            chkVar.f2688w = (VRelative) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
            chkVar.f2689x = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
            chkVar.f2690y = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
            chkVar.f2691z = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(2)).getChildAt(0);
            chkVar.f2648A = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(2)).getChildAt(1);
            chkVar.f2649B = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(2)).getChildAt(2);
            chkVar.f2650C = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
            chkVar.f2651D = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(2);
            chkVar.f2652E = (VLinear) viewGroup.getChildAt(1);
            chkVar.f2653F = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            chkVar.f2654G = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
            chkVar.f2655H = (VButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m3333c(chk chkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.v0, viewGroup, false);
            m3332b(chkVar, viewInflate);
            return viewInflate;
        }
    }

    public chk(GroupProfileAct groupProfileAct) {
        this.f2656I = groupProfileAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m3294e0(View view) {
        this.f2657J.m7594s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m3296f0(View view) {
        if (xdl0.O0(this.f2654G)) {
            this.f2656I.hideInput(this.f2654G);
        }
        this.f2657J.m7589l0(this.f2654G.getText().toString().trim());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m3298i0(View view) {
        o6j0.c("e_apply_add_group_reason", this.f2657J.pageId(), new o6j0.a[]{o6j0.a.h("groupchat_id", this.f2657J.m7590m0())});
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m3313C0() {
        return this.f2656I;
    }

    /* JADX INFO: renamed from: b0 */
    public View m3314b0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0203c.m3333c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void m3319i1(sgk sgkVar) {
        this.f2657J = sgkVar;
    }

    /* JADX INFO: renamed from: d0 */
    public final SpannableStringBuilder m3316d0(List<ChatGroupTag> list, int i, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        for (ChatGroupTag chatGroupTag : list) {
            if (z) {
                spannableStringBuilder.append((CharSequence) "1");
                au4 au4Var = new au4(CoreModule.b, chatGroupTag.name, !TextUtils.isEmpty(chatGroupTag.textColor) ? Color.parseColor(chatGroupTag.textColor) : -9079435, 13, !TextUtils.isEmpty(chatGroupTag.backgroundColor) ? Color.parseColor(chatGroupTag.backgroundColor) : this.f2656I.color(a1c0.a0), i, 10, t100.k, 0.0f, 10.0f, 5.0f, -1644826, CoreModule.b.getResources().getDimensionPixelSize(x1c0.a), true);
                int i3 = i2 + 1;
                spannableStringBuilder.setSpan(au4Var, i2, i3, 33);
                i2 = i3;
            } else {
                spannableStringBuilder.append((CharSequence) " ");
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ boolean m3317g0(View view) {
        if (TextUtils.isEmpty(this.f2662O)) {
            return true;
        }
        e51.q(this.f2662O);
        lsi0.w(R.string.I5);
        return true;
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m3318h0(VScroll vScroll, int i, int i2, int i3, int i4) {
        int scrollY = this.f2666a.getScrollY();
        int iD = t100.d(40.0f);
        boolean z = this.f2658K;
        if (scrollY >= iD) {
            if (z) {
                return;
            }
            this.f2656I.setTitle(this.f2668c.getText());
            this.f2658K = true;
            return;
        }
        if (z) {
            this.f2656I.setTitle("");
            this.f2658K = false;
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m3314b0(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m3320j0(View view) {
        m3329r0();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m3321k0(User user, View view) {
        if (wdk.m8551d(user)) {
            return;
        }
        this.f2657J.m7594s0();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ SpannableStringBuilder m3322l0(Integer num, Boolean bool) {
        return m3316d0(this.f2664Q, num.intValue(), bool.booleanValue());
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m3323m0(Dialog dialog, View view, int i, CharSequence charSequence) {
        PutongCoreMvpAct putongCoreMvpAct = this.f2656I;
        putongCoreMvpAct.startActivity(WebViewAct.Z1(putongCoreMvpAct, "", tbk.m7723q(this.f2657J.m7590m0())));
    }

    /* JADX INFO: renamed from: n0 */
    public void m3324n0(Menu menu) {
        if (this.f2665R) {
            return;
        }
        this.f2659L = menu;
        MenuItem menuItemAdd = menu.add(0, 0, 0, this.f2656I.string(R.string.O));
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setActionView(l6c0.c1);
        xdl0.E0(menuItemAdd.getActionView(), new View.OnClickListener() { // from class: l.tgk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7464a.m3320j0(view);
            }
        });
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: o0 */
    public void m3325o0(ChatGroup chatGroup, final User user) {
        if (!NullChecker.a(user) || user.isMe()) {
            xdl0.M(this.f2687v, false);
            this.f2665R = true;
            if (NullChecker.a(this.f2659L)) {
                this.f2659L.setGroupVisible(0, false);
                return;
            }
            return;
        }
        xdl0.M(this.f2687v, true);
        this.f2665R = false;
        if (tbk.m7725s(chatGroup)) {
            this.f2691z.setBackgroundResource(c3c0.I0);
            qib0.G.Z0(this.f2691z, tbk.m7717k(user));
        } else if (user.isBanedOrInactivated()) {
            qib0.G.Y0(this.f2691z, CoreModule.P().i().T0());
        } else {
            qib0.G.Q0(this.f2691z, user.picture(0).profileSmall());
        }
        boolean zIsBanedOrInactivated = user.isBanedOrInactivated();
        AppCompatTextView appCompatTextView = this.f2648A;
        if (zIsBanedOrInactivated) {
            appCompatTextView.setText(user.publicId);
            xdl0.E0(this.f2688w, new View.OnClickListener() { // from class: l.ugk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7981a.m3321k0(user, view);
                }
            });
        } else {
            appCompatTextView.setText(tbk.m7721o(user.name));
            qib0.b0.b.showUserVerificationLogo(this.f2656I, user, this.f2649B);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: p0 */
    public void m3326p0(ChatGroup chatGroup, ChatGroupMember chatGroupMember, GroupApply groupApply) {
        if (vwb.J(chatGroup.avatars)) {
            qib0.G.Y0(this.f2667b, c3c0.I0);
        } else {
            qib0.G.Q0(this.f2667b, ((Picture) chatGroup.avatars.get(0)).profileSmall());
        }
        this.f2668c.setText(chatGroup.name);
        this.f2670e.setText(String.format("ID: %1$s", chatGroup.publicId));
        this.f2671f.setText(String.format("%1$s %2$s/%3$s", this.f2656I.string(R.string.R), Integer.valueOf(chatGroup.memberCount), Integer.valueOf(chatGroup.memberLimit)));
        this.f2662O = chatGroup.publicId;
        if (TextUtils.isEmpty(chatGroup.category.name) || chatGroup.category.hidden) {
            xdl0.M(this.f2669d, false);
        } else {
            xdl0.M(this.f2669d, true);
            this.f2669d.setText(chatGroup.category.name);
        }
        if (!TextUtils.isEmpty(chatGroup.category.backgroundColor)) {
            this.f2669d.setBackground(fce.b(Color.parseColor(chatGroup.category.backgroundColor), t100.d(4.0f)));
        }
        if (!TextUtils.isEmpty(chatGroup.category.textColor)) {
            this.f2669d.setTextColor(Color.parseColor(chatGroup.category.textColor));
        }
        if (!vwb.J(chatGroup.memberStatistics)) {
            this.f2663P.clear();
            this.f2663P.addAll(chatGroup.memberStatistics);
        }
        xdl0.M(this.f2671f, !vwb.J(this.f2663P));
        xdl0.M(this.f2672g, !vwb.J(this.f2663P));
        if (!vwb.J(this.f2663P)) {
            xdl0.M(this.f2673h, this.f2663P.size() >= 1);
            xdl0.M(this.f2676k, this.f2663P.size() >= 2);
            xdl0.M(this.f2679n, this.f2663P.size() >= 3);
            xdl0.M(this.f2682q, this.f2663P.size() >= 4);
            if (this.f2663P.size() >= 1) {
                m3327q0(this.f2674i, this.f2675j, this.f2663P.get(0));
            }
            if (this.f2663P.size() >= 2) {
                m3327q0(this.f2677l, this.f2678m, this.f2663P.get(1));
            }
            if (this.f2663P.size() >= 3) {
                m3327q0(this.f2680o, this.f2681p, this.f2663P.get(2));
            }
            if (this.f2663P.size() >= 4) {
                m3327q0(this.f2683r, this.f2684s, this.f2663P.get(3));
            }
        }
        if (!vwb.J(chatGroup.tags)) {
            this.f2664Q.clear();
            this.f2664Q.addAll(chatGroup.tags);
        }
        boolean zJ = vwb.J(this.f2664Q);
        VLinear vLinear = this.f2685t;
        if (zJ) {
            xdl0.M(vLinear, false);
        } else {
            xdl0.M(vLinear, true);
            this.f2686u.setTags(new x9j() { // from class: l.vgk
                @Override // p003l.x9j
                public final Object call(Object obj, Object obj2) {
                    return this.f8337a.m3322l0((Integer) obj, (Boolean) obj2);
                }
            });
        }
        boolean zIsEmpty = TextUtils.isEmpty(chatGroup.description);
        VLinear vLinear2 = this.f2650C;
        if (zIsEmpty) {
            xdl0.M(vLinear2, false);
        } else {
            xdl0.M(vLinear2, true);
            this.f2651D.setText(chatGroup.description);
        }
        if (NullChecker.a(chatGroupMember) && !TEnum.equals(chatGroupMember.status, "exited")) {
            xdl0.M(this.f2653F, false);
            if (this.f2660M) {
                o6j0.h("e_enter_groupchat", this.f2657J.pageId(), new o6j0.a[]{o6j0.a.h("groupchat_id", this.f2657J.m7590m0()), o6j0.a.f("is_anonymou_group", tbk.m7725s(chatGroup) ? 1 : 0)});
                this.f2660M = false;
            }
            this.f2655H.setText(R.string.E);
            this.f2655H.setEnabled(true);
        } else if (NullChecker.a(groupApply) && TEnum.equals(groupApply.status, ServletHandler.__DEFAULT_SERVLET)) {
            xdl0.M(this.f2653F, false);
            this.f2655H.setText(R.string.y);
            this.f2655H.setEnabled(false);
        } else {
            xdl0.M(this.f2653F, true);
            boolean zEquals = TEnum.equals(chatGroup.joinCondition, "noApplyRequired");
            VButton vButton = this.f2655H;
            if (zEquals) {
                vButton.setText("加入");
            } else {
                vButton.setText(R.string.z);
            }
            this.f2655H.setEnabled(true);
        }
        if (TEnum.equals(chatGroup.joinCondition, "noApplyRequired")) {
            xdl0.M(this.f2653F, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public final void m3327q0(SeekArc seekArc, VText vText, GroupMemberStatistic groupMemberStatistic) {
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
    public void m3328r() {
        this.f2656I.setTitle("");
        xdl0.E0(this.f2688w, new View.OnClickListener() { // from class: l.wgk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8548a.m3294e0(view);
            }
        });
        xdl0.E0(this.f2655H, new View.OnClickListener() { // from class: l.xgk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8785a.m3296f0(view);
            }
        });
        this.f2670e.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ygk
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f9066a.m3317g0(view);
            }
        });
        this.f2656I.setUpKeyboardDetectorLayout(new View(this.f2656I), this.f2666a, new C0201a());
        this.f2666a.setOnTouchListener(new ViewOnTouchListenerC0202b());
        this.f2666a.m11676d(new VScroll.InterfaceC1359a() { // from class: l.zgk
            @Override // p028v.VScroll.InterfaceC1359a
            /* JADX INFO: renamed from: a */
            public final void mo9423a(VScroll vScroll, int i, int i2, int i3, int i4) {
                this.f9359a.m3318h0(vScroll, i, i2, i3, i4);
            }
        });
        xdl0.E0(this.f2654G, new View.OnClickListener() { // from class: l.ahk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2210a.m3298i0(view);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final void m3329r0() {
        this.f2656I.dialog().e0(vwb.f0(new String[]{this.f2656I.string(R.string.O)})).g0(new Dialog.g() { // from class: l.bhk
            /* JADX INFO: renamed from: a */
            public final void m2951a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f2395a.m3323m0(dialog, view, i, charSequence);
            }
        }).z().show();
    }

    public void destroy() {
    }
}
