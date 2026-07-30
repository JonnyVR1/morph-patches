package com.p000p1.mobile.putong.core.newui.messages;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.newui.messages.ConversationFilterLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.a;
import com.p1.mobile.putong.core.data.ChatMM;
import com.p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.LabelParams;
import com.p1.mobile.putong.core.data.MessageFilterConfig;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import l.bt0;
import l.c4g0;
import l.ct0;
import l.e30;
import l.e51;
import l.j760;
import l.mkd0;
import l.p66;
import l.qib0;
import l.roj0;
import l.t100;
import l.u4c0;
import l.upa;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;
import p009l.mqi0;
import p009l.q860;
import p009l.r66;
import p009l.yij0;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationFilterLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f3476a;

    /* JADX INFO: renamed from: b */
    public VText f3477b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f3478c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f3479d;

    /* JADX INFO: renamed from: e */
    public final Set<String> f3480e;

    /* JADX INFO: renamed from: f */
    public DbLinks f3481f;

    /* JADX INFO: renamed from: g */
    public c4g0 f3482g;

    /* JADX INFO: renamed from: h */
    public c4g0 f3483h;

    /* JADX INFO: renamed from: i */
    public r66 f3484i;

    /* JADX INFO: renamed from: j */
    public MessageFilterConfig f3485j;

    /* JADX INFO: renamed from: k */
    public String f3486k;

    /* JADX INFO: renamed from: l */
    public Runnable f3487l;

    /* JADX INFO: renamed from: m */
    public ConversationsList f3488m;

    /* JADX INFO: renamed from: n */
    public final e30<String> f3489n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationFilterLayout$a */
    public class C0273a extends RecyclerView.n {
        public C0273a() {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                rect.left = t100.j;
            } else {
                rect.left = t100.h;
            }
            if (NullChecker.a(ConversationFilterLayout.this.f3485j) && childAdapterPosition == zVar.c() - 1) {
                if (upa.d3()) {
                    rect.right = t100.t;
                } else {
                    rect.right = t100.j;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationFilterLayout$b */
    public class C0274b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f3491a;

        public C0274b(Runnable runnable) {
            this.f3491a = runnable;
        }

        public void onFinished() {
            this.f3491a.run();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationFilterLayout$c */
    public class C0275c implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f3493a;

        public C0275c(Runnable runnable) {
            this.f3493a = runnable;
        }

        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            this.f3493a.run();
        }

        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }

    public ConversationFilterLayout(@NonNull Context context) {
        super(context);
        this.f3480e = new HashSet();
        this.f3481f = null;
        this.f3486k = "";
        this.f3489n = new e30() { // from class: l.d66
            public final void call(Object obj) {
                this.f11648a.m4800O((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m4769g(Throwable th) {
    }

    private View getOnlineAllView() {
        int iG;
        if (!NullChecker.a(this.f3484i) || this.f3476a.getChildCount() <= (iG = vwb.G(this.f3484i.m21414G(), new w9j() { // from class: l.s56
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LabelParams) obj).key, "onlineAll"));
            }
        }))) {
            return null;
        }
        return this.f3476a.getChildAt(iG);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m4774l(View view) {
        xdl0.M(view, true);
        CoreModule.c.e0.l1.put(Long.valueOf(mqi0.m18550o()));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m4777o(View view) {
    }

    /* JADX INFO: renamed from: A */
    public boolean m4786A(Conversation conversation, User user) {
        if (conversation == null || user == null || user.isBanedOrInactivated() || !(TEnum.equals(conversation.status, "default") || TEnum.equals(conversation.status, "blocked"))) {
            return false;
        }
        for (String str : this.f3480e) {
            if (!TextUtils.isEmpty(str) && !m4787B(str, conversation, user)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: B */
    public boolean m4787B(String str, Conversation conversation, User user) {
        str.getClass();
        switch (str) {
            case "sentMessage":
                return conversation.userMessageCount > 0;
            case "nearby":
                return !user.isHideLocationFromSVip() && user.location.distance <= 20000;
            case "online":
            case "onlineAll":
                return CoreModule.c.N0.k3(user, 5);
            case "unread":
                if (conversation.unreadMessages <= 0) {
                    return false;
                }
                return (upa.S2() && ((DbObject) conversation).id.startsWith("-") && !TextUtils.equals("-11000", ((DbObject) conversation).id)) ? false : true;
            case "picture":
                return user.isPicVerificationVerified();
            case "closefriend":
                if (NullChecker.a(conversation.additional) && NullChecker.a(conversation.additional.chatMM)) {
                    ChatMM chatMM = conversation.additional.chatMM;
                    if (chatMM.partnerSwitch && chatMM.level >= 3) {
                        return true;
                    }
                }
                return false;
            case "newMatch":
                return conversation.localEverHasMessage && !conversation.localHasMessage && TextUtils.isEmpty(conversation.readUntil);
            case "superLikeMe":
                return m4803R(user);
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m4788C() {
        View onlineAllView = getOnlineAllView();
        if (onlineAllView == null) {
            return;
        }
        final View viewFindViewById = onlineAllView.findViewById(u4c0.G);
        final ColorTrackTextView colorTrackTextView = (ColorTrackTextView) onlineAllView.findViewById(u4c0.x6);
        final SVGAnimationView sVGAnimationViewFindViewById = onlineAllView.findViewById(u4c0.hc);
        final int width = onlineAllView.getWidth();
        m4805T(viewFindViewById, colorTrackTextView, width, true, new Runnable() { // from class: l.z56
            @Override // java.lang.Runnable
            public final void run() {
                this.f23478a.m4795J(sVGAnimationViewFindViewById, viewFindViewById, colorTrackTextView, width);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public void m4789D(ConversationsList conversationsList, Runnable runnable, final Runnable runnable2) {
        this.f3487l = runnable;
        this.f3488m = conversationsList;
        e30 e30Var = new e30() { // from class: l.i66
            public final void call(Object obj) {
                this.f14406a.m4796K((String) obj);
            }
        };
        final Set<String> set = this.f3480e;
        Objects.requireNonNull(set);
        r66 r66Var = new r66(e30Var, new w9j() { // from class: l.j66
            public final Object call(Object obj) {
                return Boolean.valueOf(set.contains((String) obj));
            }
        });
        this.f3484i = r66Var;
        this.f3476a.setAdapter(r66Var);
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(this.f3485j) && !vwb.J(this.f3485j.filterTabList)) {
            arrayList.addAll(this.f3485j.filterTabList);
        }
        if (vwb.J(arrayList)) {
            xdl0.M(this.f3476a, false);
        } else {
            List<LabelParams> listM4804S = m4804S();
            if (!vwb.J(listM4804S)) {
                arrayList = new ArrayList(listM4804S);
                if (!((Boolean) CoreModule.c.e0.z6.get()).booleanValue()) {
                    vwb.d0(arrayList, new w9j() { // from class: l.k66
                        public final Object call(Object obj) {
                            return Boolean.valueOf(TextUtils.equals(((LabelParams) obj).key, "closefriend"));
                        }
                    });
                }
            }
            LabelParams labelParamsS3 = upa.s3();
            if (NullChecker.a(labelParamsS3)) {
                vwb.d0(arrayList, new w9j() { // from class: l.l66
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((LabelParams) obj).key, "online"));
                    }
                });
                arrayList.add(0, labelParamsS3);
            }
            this.f3484i.m21417J(arrayList);
        }
        if (!upa.d3() || !NullChecker.a(runnable2)) {
            xdl0.M(this.f3478c, false);
            xdl0.W(this.f3476a, 0);
        } else {
            xdl0.M(this.f3478c, true);
            xdl0.E0(this.f3479d, new View.OnClickListener() { // from class: l.m66
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable2.run();
                }
            });
            xdl0.W(this.f3476a, t100.y);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m4790E() {
        this.f3485j = upa.y0();
        this.f3477b.setTypeface(Typeface.DEFAULT_BOLD);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f3476a.setLayoutManager(linearLayoutManager);
        this.f3476a.addItemDecoration(new C0273a());
    }

    /* JADX INFO: renamed from: F */
    public boolean m4791F() {
        return !this.f3480e.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m4792G(ConversationsList.C0294e c0294e, List list) {
        if (this.f3480e.isEmpty()) {
            return;
        }
        int iMin = Math.min(list.size(), 20);
        ArrayList arrayList = new ArrayList();
        List<Conversation> listMo5628k = c0294e.mo5628k();
        for (int i = 0; i < iMin; i++) {
            final Conversation conversation = (Conversation) list.get(i);
            if (m4786A(conversation, CoreModule.c.e0.oa(((DbObject) conversation).id))) {
                int iG = vwb.G(listMo5628k, new w9j() { // from class: l.f66
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((DbObject) ((Conversation) obj)).id, ((DbObject) conversation).id));
                    }
                });
                if (iG >= 0) {
                    listMo5628k.remove(iG);
                }
                arrayList.add(conversation);
            }
        }
        if (NullChecker.a(listMo5628k) && !vwb.J(arrayList)) {
            listMo5628k.addAll(0, arrayList);
        }
        c0294e.notifyDataSetChanged();
        m4809z(c0294e);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m4793H(View view, ColorTrackTextView colorTrackTextView) {
        xdl0.D0(0, new View[]{view});
        xdl0.M(view, false);
        colorTrackTextView.setProgress(0.0f);
        this.f3484i.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m4794I(SVGAnimationView sVGAnimationView, final View view, final ColorTrackTextView colorTrackTextView, int i) {
        xdl0.M(sVGAnimationView, false);
        m4805T(view, colorTrackTextView, i, false, new Runnable() { // from class: l.g66
            @Override // java.lang.Runnable
            public final void run() {
                this.f13322a.m4793H(view, colorTrackTextView);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m4795J(final SVGAnimationView sVGAnimationView, final View view, final ColorTrackTextView colorTrackTextView, final int i) {
        Runnable runnable = new Runnable() { // from class: l.b66
            @Override // java.lang.Runnable
            public final void run() {
                this.f9911a.m4794I(sVGAnimationView, view, colorTrackTextView, i);
            }
        };
        xdl0.M(sVGAnimationView, true);
        SVGALoader.with(getContext()).loadCallback(new C0275c(runnable)).from("https://auto.tancdn.com/v1/raw/6298bf34-85f1-47a4-83ad-43dd96fcb6e114.svga").autoPlay(true).animListener(new C0274b(runnable)).repeatCount(1).into(sVGAnimationView);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m4796K(String str) {
        zvf0.u("e_fast_filtrate", "p_messages_view", new j760[]{j760.a("filtrate_tag", str), j760.a("tag_state", Integer.valueOf(!this.f3480e.contains(str) ? 1 : 0))});
        this.f3489n.call(str);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m4797L(String str, ConversationsList.C0294e c0294e, boolean z, q860 q860Var) {
        if (TextUtils.equals(getTabFilter(), str)) {
            if (upa.S2()) {
                vwb.d0(q860Var.f19068a, new w9j() { // from class: l.u56
                    public final Object call(Object obj) {
                        Conversation conversation = (Conversation) obj;
                        return Boolean.valueOf(!TextUtils.equals("-11000", ((DbObject) conversation).id) && ((DbObject) conversation).id.startsWith("-"));
                    }
                });
            }
            this.f3481f = q860Var.f19069b;
            c0294e.m5620M(q860Var.f19068a, z);
            m4809z(c0294e);
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m4798M(Throwable th) {
        this.f3486k = "";
        yij0.m25382D(th);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m4799N() {
        if (NullChecker.a(this.f3487l)) {
            this.f3487l.run();
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m4800O(String str) {
        boolean zContains = this.f3480e.contains(str);
        Set<String> set = this.f3480e;
        if (zContains) {
            set.remove(str);
        } else {
            set.add(str);
        }
        if (TextUtils.equals(str, "onlineAll")) {
            CoreModule.c.e0.l1.put(-1L);
        }
        zvf0.A("e_fast_filtrate", "p_messages_view", new j760[]{j760.a("filtrate_tag", getTabFilter())});
        this.f3484i.notifyDataSetChanged();
        if (vwb.J(this.f3480e)) {
            CoreModule.c.f0.p2.onNext(roj0.a);
            mkd0.z(this.f3483h);
        } else {
            m4802Q(this.f3488m.getConversationsAdapter(), false);
        }
        e51.F(getContext(), new Runnable() { // from class: l.n66
            @Override // java.lang.Runnable
            public final void run() {
                this.f17232a.m4799N();
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m4801P(q860 q860Var) {
        if (vwb.J(q860Var.f19068a) || vwb.J(vwb.n(q860Var.f19068a, new w9j() { // from class: l.a66
            public final Object call(Object obj) {
                return Boolean.valueOf(((Conversation) obj).mm < 1);
            }
        }))) {
            m4788C();
        } else {
            CoreModule.c.e0.l1.put(Long.valueOf(mqi0.m18550o()));
            this.f3489n.call("onlineAll");
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m4802Q(final ConversationsList.C0294e c0294e, final boolean z) {
        String str;
        if (z) {
            DbLinks dbLinks = this.f3481f;
            if (dbLinks == null || TextUtils.isEmpty(dbLinks.links.next)) {
                return;
            }
        } else {
            this.f3481f = null;
        }
        final String tabFilter = getTabFilter();
        StringBuilder sb = new StringBuilder();
        sb.append(a.F(tabFilter));
        if (z) {
            str = "&" + this.f3481f.links.next;
        } else {
            str = "";
        }
        sb.append(str);
        String string = sb.toString();
        if (TextUtils.equals(this.f3486k, string)) {
            return;
        }
        this.f3486k = string;
        mkd0.z(this.f3482g);
        this.f3482g = getContext().duringCreated(CoreModule.c.f0.mg(string)).subscribe(mkd0.H(new e30() { // from class: l.o66
            public final void call(Object obj) {
                this.f17848a.m4797L(tabFilter, c0294e, z, (q860) obj);
            }
        }, new e30() { // from class: l.t56
            public final void call(Object obj) {
                this.f20562a.m4798M((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public boolean m4803R(User user) {
        if (user == null || ((DbObject) user).id.equals(qib0.c0.userId()) || user.isTeamAccount() || !NullChecker.a(user.localRelationship) || !NullChecker.a(user.localRelationship.relationshipExtensions)) {
            return false;
        }
        return TEnum.equals(user.localRelationship.relationshipExtensions.otherRelationType, "SUPERLIKED");
    }

    /* JADX INFO: renamed from: S */
    public final List<LabelParams> m4804S() {
        ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfigP = upa.P();
        if (NullChecker.a(chatRoundsDisplayedExternallyConfigP) && chatRoundsDisplayedExternallyConfigP.enabled && !vwb.J(chatRoundsDisplayedExternallyConfigP.filterTabList)) {
            return chatRoundsDisplayedExternallyConfigP.filterTabList;
        }
        return null;
    }

    /* JADX INFO: renamed from: T */
    public final void m4805T(final View view, final ColorTrackTextView colorTrackTextView, int i, boolean z, @NonNull Runnable runnable) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = z ? 8388611 : 8388613;
        view.setLayoutParams(layoutParams);
        int color = Color.parseColor("#33000000");
        if (z) {
            colorTrackTextView.m4686t(color, -1);
        } else {
            colorTrackTextView.m4686t(-1, color);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.c66
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                colorTrackTextView.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat.start();
        Property property = ct0.n;
        int i2 = z ? 0 : i;
        if (!z) {
            i = 0;
        }
        animatorSet.playTogether(bt0.o(view, property, new int[]{i2, i}), valueAnimatorOfFloat);
        animatorSet.setDuration(400L);
        bt0.v(animatorSet, new Runnable() { // from class: l.e66
            @Override // java.lang.Runnable
            public final void run() {
                ConversationFilterLayout.m4774l(view);
            }
        });
        bt0.g(animatorSet, runnable, runnable);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: U */
    public void m4806U() {
        if (upa.w3() && !CoreModule.c.e0.na().isFemale()) {
            getContext().duringCreated(CoreModule.c.f0.mg(a.F("onlineAll"))).subscribe(mkd0.H(new e30() { // from class: l.v56
                public final void call(Object obj) {
                    this.f21454a.m4801P((q860) obj);
                }
            }, new e30() { // from class: l.w56
                public final void call(Object obj) {
                    ConversationFilterLayout.m4769g((Throwable) obj);
                }
            }));
        } else if (upa.v3()) {
            m4788C();
        }
    }

    public String getTabFilter() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f3480e) {
            if (TextUtils.isEmpty(sb)) {
                sb.append(str);
            } else {
                sb.append(",");
                sb.append(str);
            }
        }
        return sb.toString();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4807x(this);
        m4790E();
        xdl0.E0(this, new View.OnClickListener() { // from class: l.h66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationFilterLayout.m4777o(view);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final void m4807x(View view) {
        p66.a(this, view);
    }

    /* JADX INFO: renamed from: y */
    public boolean m4808y(int i, String str) {
        mkd0.z(this.f3483h);
        this.f3486k = "";
        boolean z = true;
        if (i == 0) {
            boolean z2 = NullChecker.a(this.f3485j) && !vwb.J(this.f3485j.filterTabList);
            xdl0.M(this.f3476a, z2);
            VText vText = this.f3477b;
            if (z2) {
                xdl0.M(vText, false);
                this.f3477b.setText("");
            } else {
                xdl0.M(vText, true);
                this.f3477b.setText(getResources().getString(R.string.d2));
            }
        } else {
            xdl0.M(this.f3476a, false);
            xdl0.M(this.f3477b, true);
            this.f3477b.setText(str);
        }
        if (this.f3480e.isEmpty()) {
            z = false;
        } else {
            this.f3476a.scrollToPosition(0);
            this.f3480e.clear();
            CoreModule.c.f0.p2.onNext(roj0.a);
            if (NullChecker.a(this.f3487l)) {
                this.f3487l.run();
            }
        }
        if (NullChecker.a(this.f3484i)) {
            this.f3484i.notifyDataSetChanged();
        }
        return z;
    }

    /* JADX INFO: renamed from: z */
    public final void m4809z(final ConversationsList.C0294e c0294e) {
        mkd0.z(this.f3483h);
        this.f3483h = getContext().duringCreated(CoreModule.c.f0.Te().filter(new w9j() { // from class: l.x56
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        }).onBackpressureLatest()).subscribe(mkd0.G(new e30() { // from class: l.y56
            public final void call(Object obj) {
                this.f22897a.m4792G(c0294e, (List) obj);
            }
        }));
    }

    public ConversationFilterLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3480e = new HashSet();
        this.f3481f = null;
        this.f3486k = "";
        this.f3489n = new e30() { // from class: l.d66
            public final void call(Object obj) {
                this.f11648a.m4800O((String) obj);
            }
        };
    }

    public ConversationFilterLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3480e = new HashSet();
        this.f3481f = null;
        this.f3486k = "";
        this.f3489n = new e30() { // from class: l.d66
            public final void call(Object obj) {
                this.f11648a.m4800O((String) obj);
            }
        };
    }
}
