package com.p046p1.mobile.putong.core.newui.messages;

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
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.data.ChatMM;
import com.p046p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.LabelParams;
import com.p046p1.mobile.putong.core.data.MessageFilterConfig;
import com.p046p1.mobile.putong.core.newui.messages.ConversationFilterLayout;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.bt0;
import p149l.c4g0;
import p149l.ct0;
import p149l.e30;
import p149l.e51;
import p149l.j760;
import p149l.mkd0;
import p149l.mqi0;
import p149l.p66;
import p149l.q860;
import p149l.qib0;
import p149l.r66;
import p149l.roj0;
import p149l.t100;
import p149l.u4c0;
import p149l.upa;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.yij0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationFilterLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f24698a;

    /* JADX INFO: renamed from: b */
    public VText f24699b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f24700c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f24701d;

    /* JADX INFO: renamed from: e */
    public final Set<String> f24702e;

    /* JADX INFO: renamed from: f */
    public DbLinks f24703f;

    /* JADX INFO: renamed from: g */
    public c4g0 f24704g;

    /* JADX INFO: renamed from: h */
    public c4g0 f24705h;

    /* JADX INFO: renamed from: i */
    public r66 f24706i;

    /* JADX INFO: renamed from: j */
    public MessageFilterConfig f24707j;

    /* JADX INFO: renamed from: k */
    public String f24708k;

    /* JADX INFO: renamed from: l */
    public Runnable f24709l;

    /* JADX INFO: renamed from: m */
    public ConversationsList f24710m;

    /* JADX INFO: renamed from: n */
    public final e30<String> f24711n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationFilterLayout$a */
    public class C8109a extends RecyclerView.AbstractC0576n {
        public C8109a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            super.getItemOffsets(rect, view, recyclerView, c0588z);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                rect.left = t100.f167261j;
            } else {
                rect.left = t100.f167259h;
            }
            if (NullChecker.m81303a(ConversationFilterLayout.this.f24707j) && childAdapterPosition == c0588z.m3487c() - 1) {
                if (upa.m194741d3()) {
                    rect.right = t100.f167271t;
                } else {
                    rect.right = t100.f167261j;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationFilterLayout$b */
    public class C8110b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f24713a;

        public C8110b(Runnable runnable) {
            this.f24713a = runnable;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            this.f24713a.run();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationFilterLayout$c */
    public class C8111c implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f24715a;

        public C8111c(Runnable runnable) {
            this.f24715a = runnable;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            this.f24715a.run();
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }

    public ConversationFilterLayout(@NonNull Context context) {
        super(context);
        this.f24702e = new HashSet();
        this.f24703f = null;
        this.f24708k = "";
        this.f24711n = new e30() { // from class: l.d66
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84588a.m40705O((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m40674g(Throwable th) {
    }

    private View getOnlineAllView() {
        int iM200293G;
        if (!NullChecker.m81303a(this.f24706i) || this.f24698a.getChildCount() <= (iM200293G = vwb.m200293G(this.f24706i.m178044G(), new w9j() { // from class: l.s56
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LabelParams) obj).key, "onlineAll"));
            }
        }))) {
            return null;
        }
        return this.f24698a.getChildAt(iM200293G);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m40679l(View view) {
        xdl0.m208344M(view, true);
        CoreModule.f17545c.f19639e0.f149414l1.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m40682o(View view) {
    }

    /* JADX INFO: renamed from: A */
    public boolean m40691A(Conversation conversation, User user) {
        if (conversation == null || user == null || user.isBanedOrInactivated() || !(TEnum.equals(conversation.status, "default") || TEnum.equals(conversation.status, "blocked"))) {
            return false;
        }
        for (String str : this.f24702e) {
            if (!TextUtils.isEmpty(str) && !m40692B(str, conversation, user)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: B */
    public boolean m40692B(String str, Conversation conversation, User user) {
        str.getClass();
        switch (str) {
            case "sentMessage":
                return conversation.userMessageCount > 0;
            case "nearby":
                return !user.isHideLocationFromSVip() && user.location.distance <= 20000;
            case "online":
            case "onlineAll":
                return CoreModule.f17545c.f19588N0.m31967k3(user, 5);
            case "unread":
                if (conversation.unreadMessages <= 0) {
                    return false;
                }
                return (upa.m194695S2() && conversation.f56011id.startsWith("-") && !TextUtils.equals(User.ID_LIVE_VIP_SERVICE, conversation.f56011id)) ? false : true;
            case "picture":
                return user.isPicVerificationVerified();
            case "closefriend":
                if (NullChecker.m81303a(conversation.additional) && NullChecker.m81303a(conversation.additional.chatMM)) {
                    ChatMM chatMM = conversation.additional.chatMM;
                    if (chatMM.partnerSwitch && chatMM.level >= 3) {
                        return true;
                    }
                }
                return false;
            case "newMatch":
                return conversation.localEverHasMessage && !conversation.localHasMessage && TextUtils.isEmpty(conversation.readUntil);
            case "superLikeMe":
                return m40708R(user);
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m40693C() {
        View onlineAllView = getOnlineAllView();
        if (onlineAllView == null) {
            return;
        }
        final View viewFindViewById = onlineAllView.findViewById(u4c0.f173818G);
        final ColorTrackTextView colorTrackTextView = (ColorTrackTextView) onlineAllView.findViewById(u4c0.f174548x6);
        final SVGAnimationView sVGAnimationView = (SVGAnimationView) onlineAllView.findViewById(u4c0.f174283hc);
        final int width = onlineAllView.getWidth();
        m40710T(viewFindViewById, colorTrackTextView, width, true, new Runnable() { // from class: l.z56
            @Override // java.lang.Runnable
            public final void run() {
                this.f201752a.m40700J(sVGAnimationView, viewFindViewById, colorTrackTextView, width);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public void m40694D(ConversationsList conversationsList, Runnable runnable, final Runnable runnable2) {
        this.f24709l = runnable;
        this.f24710m = conversationsList;
        e30 e30Var = new e30() { // from class: l.i66
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111677a.m40701K((String) obj);
            }
        };
        final Set<String> set = this.f24702e;
        Objects.requireNonNull(set);
        r66 r66Var = new r66(e30Var, new w9j() { // from class: l.j66
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(set.contains((String) obj));
            }
        });
        this.f24706i = r66Var;
        this.f24698a.setAdapter(r66Var);
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(this.f24707j) && !vwb.m200296J(this.f24707j.filterTabList)) {
            arrayList.addAll(this.f24707j.filterTabList);
        }
        if (vwb.m200296J(arrayList)) {
            xdl0.m208344M(this.f24698a, false);
        } else {
            List<LabelParams> listM40709S = m40709S();
            if (!vwb.m200296J(listM40709S)) {
                arrayList = new ArrayList(listM40709S);
                if (!CoreModule.f17545c.f19639e0.f149520z6.get().booleanValue()) {
                    vwb.m200320d0(arrayList, new w9j() { // from class: l.k66
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(TextUtils.equals(((LabelParams) obj).key, "closefriend"));
                        }
                    });
                }
            }
            LabelParams labelParamsM194816s3 = upa.m194816s3();
            if (NullChecker.m81303a(labelParamsM194816s3)) {
                vwb.m200320d0(arrayList, new w9j() { // from class: l.l66
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((LabelParams) obj).key, "online"));
                    }
                });
                arrayList.add(0, labelParamsM194816s3);
            }
            this.f24706i.m178047J(arrayList);
        }
        if (!upa.m194741d3() || !NullChecker.m81303a(runnable2)) {
            xdl0.m208344M(this.f24700c, false);
            xdl0.m208359W(this.f24698a, 0);
        } else {
            xdl0.m208344M(this.f24700c, true);
            xdl0.m208329E0(this.f24701d, new View.OnClickListener() { // from class: l.m66
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable2.run();
                }
            });
            xdl0.m208359W(this.f24698a, t100.f167276y);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m40695E() {
        this.f24707j = upa.m194843y0();
        this.f24699b.setTypeface(Typeface.DEFAULT_BOLD);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f24698a.setLayoutManager(linearLayoutManager);
        this.f24698a.addItemDecoration(new C8109a());
    }

    /* JADX INFO: renamed from: F */
    public boolean m40696F() {
        return !this.f24702e.isEmpty();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m40697G(ConversationsList.C8130e c8130e, List list) {
        if (this.f24702e.isEmpty()) {
            return;
        }
        int iMin = Math.min(list.size(), 20);
        ArrayList arrayList = new ArrayList();
        List<Conversation> listMo41520k = c8130e.mo41520k();
        for (int i = 0; i < iMin; i++) {
            final Conversation conversation = (Conversation) list.get(i);
            if (m40691A(conversation, CoreModule.f17545c.f19639e0.m169524oa(conversation.f56011id))) {
                int iM200293G = vwb.m200293G(listMo41520k, new w9j() { // from class: l.f66
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((Conversation) obj).f56011id, conversation.f56011id));
                    }
                });
                if (iM200293G >= 0) {
                    listMo41520k.remove(iM200293G);
                }
                arrayList.add(conversation);
            }
        }
        if (NullChecker.m81303a(listMo41520k) && !vwb.m200296J(arrayList)) {
            listMo41520k.addAll(0, arrayList);
        }
        c8130e.notifyDataSetChanged();
        m40714z(c8130e);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m40698H(View view, ColorTrackTextView colorTrackTextView) {
        xdl0.m208327D0(0, view);
        xdl0.m208344M(view, false);
        colorTrackTextView.setProgress(0.0f);
        this.f24706i.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m40699I(SVGAnimationView sVGAnimationView, final View view, final ColorTrackTextView colorTrackTextView, int i) {
        xdl0.m208344M(sVGAnimationView, false);
        m40710T(view, colorTrackTextView, i, false, new Runnable() { // from class: l.g66
            @Override // java.lang.Runnable
            public final void run() {
                this.f101227a.m40698H(view, colorTrackTextView);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m40700J(final SVGAnimationView sVGAnimationView, final View view, final ColorTrackTextView colorTrackTextView, final int i) {
        Runnable runnable = new Runnable() { // from class: l.b66
            @Override // java.lang.Runnable
            public final void run() {
                this.f73745a.m40699I(sVGAnimationView, view, colorTrackTextView, i);
            }
        };
        xdl0.m208344M(sVGAnimationView, true);
        SVGALoader.with(getContext()).loadCallback(new C8111c(runnable)).from("https://auto.tancdn.com/v1/raw/6298bf34-85f1-47a4-83ad-43dd96fcb6e114.svga").autoPlay(true).animListener(new C8110b(runnable)).repeatCount(1).into(sVGAnimationView);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m40701K(String str) {
        zvf0.m220399u("e_fast_filtrate", OMSDialogPositon.p_messages_view, j760.m140076a("filtrate_tag", str), j760.m140076a("tag_state", Integer.valueOf(!this.f24702e.contains(str) ? 1 : 0)));
        this.f24711n.call(str);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m40702L(String str, ConversationsList.C8130e c8130e, boolean z, q860 q860Var) {
        if (TextUtils.equals(getTabFilter(), str)) {
            if (upa.m194695S2()) {
                vwb.m200320d0(q860Var.f153135a, new w9j() { // from class: l.u56
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        Conversation conversation = (Conversation) obj;
                        return Boolean.valueOf(!TextUtils.equals(User.ID_LIVE_VIP_SERVICE, conversation.f56011id) && conversation.f56011id.startsWith("-"));
                    }
                });
            }
            this.f24703f = q860Var.f153136b;
            c8130e.m41513M(q860Var.f153135a, z);
            m40714z(c8130e);
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m40703M(Throwable th) {
        this.f24708k = "";
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m40704N() {
        if (NullChecker.m81303a(this.f24709l)) {
            this.f24709l.run();
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m40705O(String str) {
        boolean zContains = this.f24702e.contains(str);
        Set<String> set = this.f24702e;
        if (zContains) {
            set.remove(str);
        } else {
            set.add(str);
        }
        if (TextUtils.equals(str, "onlineAll")) {
            CoreModule.f17545c.f19639e0.f149414l1.put(-1L);
        }
        zvf0.m220368A("e_fast_filtrate", OMSDialogPositon.p_messages_view, j760.m140076a("filtrate_tag", getTabFilter()));
        this.f24706i.notifyDataSetChanged();
        if (vwb.m200296J(this.f24702e)) {
            CoreModule.f17545c.f19642f0.f19966p2.onNext(roj0.f160388a);
            mkd0.m154992z(this.f24705h);
        } else {
            m40707Q(this.f24710m.getConversationsAdapter(), false);
        }
        e51.m114741F(getContext(), new Runnable() { // from class: l.n66
            @Override // java.lang.Runnable
            public final void run() {
                this.f137269a.m40704N();
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m40706P(q860 q860Var) {
        if (vwb.m200296J(q860Var.f153135a) || vwb.m200296J(vwb.m200339n(q860Var.f153135a, new w9j() { // from class: l.a66
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Conversation) obj).f20374mm < 1);
            }
        }))) {
            m40693C();
        } else {
            CoreModule.f17545c.f19639e0.f149414l1.put(Long.valueOf(mqi0.m155944o()));
            this.f24711n.call("onlineAll");
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m40707Q(final ConversationsList.C8130e c8130e, final boolean z) {
        String str;
        if (z) {
            DbLinks dbLinks = this.f24703f;
            if (dbLinks == null || TextUtils.isEmpty(dbLinks.links.next)) {
                return;
            }
        } else {
            this.f24703f = null;
        }
        final String tabFilter = getTabFilter();
        StringBuilder sb = new StringBuilder();
        sb.append(C4728a.m31196F(tabFilter));
        if (z) {
            str = "&" + this.f24703f.links.next;
        } else {
            str = "";
        }
        sb.append(str);
        String string = sb.toString();
        if (TextUtils.equals(this.f24708k, string)) {
            return;
        }
        this.f24708k = string;
        mkd0.m154992z(this.f24704g);
        this.f24704g = ((Act) getContext()).duringCreated(CoreModule.f17545c.f19642f0.m33040mg(string)).subscribe(mkd0.m154956H(new e30() { // from class: l.o66
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141975a.m40702L(tabFilter, c8130e, z, (q860) obj);
            }
        }, new e30() { // from class: l.t56
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167792a.m40703M((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public boolean m40708R(User user) {
        if (user == null || user.f56011id.equals(qib0.f154714c0.userId()) || user.isTeamAccount() || !NullChecker.m81303a(user.localRelationship) || !NullChecker.m81303a(user.localRelationship.relationshipExtensions)) {
            return false;
        }
        return TEnum.equals(user.localRelationship.relationshipExtensions.otherRelationType, RelationshipStatus.SUPERLIKED);
    }

    /* JADX INFO: renamed from: S */
    public final List<LabelParams> m40709S() {
        ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfigM194680P = upa.m194680P();
        if (NullChecker.m81303a(chatRoundsDisplayedExternallyConfigM194680P) && chatRoundsDisplayedExternallyConfigM194680P.enabled && !vwb.m200296J(chatRoundsDisplayedExternallyConfigM194680P.filterTabList)) {
            return chatRoundsDisplayedExternallyConfigM194680P.filterTabList;
        }
        return null;
    }

    /* JADX INFO: renamed from: T */
    public final void m40710T(final View view, final ColorTrackTextView colorTrackTextView, int i, boolean z, @NonNull Runnable runnable) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = z ? 8388611 : 8388613;
        view.setLayoutParams(layoutParams);
        int color = Color.parseColor("#33000000");
        if (z) {
            colorTrackTextView.m40593t(color, -1);
        } else {
            colorTrackTextView.m40593t(-1, color);
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
        Property<View, Integer> property = ct0.f82448n;
        int i2 = z ? 0 : i;
        if (!z) {
            i = 0;
        }
        animatorSet.playTogether(bt0.m103742o(view, property, i2, i), valueAnimatorOfFloat);
        animatorSet.setDuration(400L);
        bt0.m103749v(animatorSet, new Runnable() { // from class: l.e66
            @Override // java.lang.Runnable
            public final void run() {
                ConversationFilterLayout.m40679l(view);
            }
        });
        bt0.m103734g(animatorSet, runnable, runnable);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: U */
    public void m40711U() {
        if (upa.m194836w3() && !CoreModule.f17545c.f19639e0.m169520na().isFemale()) {
            ((Act) getContext()).duringCreated(CoreModule.f17545c.f19642f0.m33040mg(C4728a.m31196F("onlineAll"))).subscribe(mkd0.m154956H(new e30() { // from class: l.v56
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f180005a.m40706P((q860) obj);
                }
            }, new e30() { // from class: l.w56
                @Override // p149l.e30
                public final void call(Object obj) {
                    ConversationFilterLayout.m40674g((Throwable) obj);
                }
            }));
        } else if (upa.m194831v3()) {
            m40693C();
        }
    }

    public String getTabFilter() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f24702e) {
            if (TextUtils.isEmpty(sb)) {
                sb.append(str);
            } else {
                sb.append(Constants.SEPARATOR_COMMA);
                sb.append(str);
            }
        }
        return sb.toString();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40712x(this);
        m40695E();
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.h66
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationFilterLayout.m40682o(view);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final void m40712x(View view) {
        p66.m167641a(this, view);
    }

    /* JADX INFO: renamed from: y */
    public boolean m40713y(int i, String str) {
        mkd0.m154992z(this.f24705h);
        this.f24708k = "";
        boolean z = true;
        if (i == 0) {
            boolean z2 = NullChecker.m81303a(this.f24707j) && !vwb.m200296J(this.f24707j.filterTabList);
            xdl0.m208344M(this.f24698a, z2);
            VText vText = this.f24699b;
            if (z2) {
                xdl0.m208344M(vText, false);
                this.f24699b.setText("");
            } else {
                xdl0.m208344M(vText, true);
                this.f24699b.setText(getResources().getString(R$string.f18442d2));
            }
        } else {
            xdl0.m208344M(this.f24698a, false);
            xdl0.m208344M(this.f24699b, true);
            this.f24699b.setText(str);
        }
        if (this.f24702e.isEmpty()) {
            z = false;
        } else {
            this.f24698a.scrollToPosition(0);
            this.f24702e.clear();
            CoreModule.f17545c.f19642f0.f19966p2.onNext(roj0.f160388a);
            if (NullChecker.m81303a(this.f24709l)) {
                this.f24709l.run();
            }
        }
        if (NullChecker.m81303a(this.f24706i)) {
            this.f24706i.notifyDataSetChanged();
        }
        return z;
    }

    /* JADX INFO: renamed from: z */
    public final void m40714z(final ConversationsList.C8130e c8130e) {
        mkd0.m154992z(this.f24705h);
        this.f24705h = ((Act) getContext()).duringCreated(CoreModule.f17545c.f19642f0.m32808Te().filter(new w9j() { // from class: l.x56
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        }).onBackpressureLatest()).subscribe(mkd0.m154955G(new e30() { // from class: l.y56
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196382a.m40697G(c8130e, (List) obj);
            }
        }));
    }

    public ConversationFilterLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24702e = new HashSet();
        this.f24703f = null;
        this.f24708k = "";
        this.f24711n = new e30() { // from class: l.d66
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84588a.m40705O((String) obj);
            }
        };
    }

    public ConversationFilterLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24702e = new HashSet();
        this.f24703f = null;
        this.f24708k = "";
        this.f24711n = new e30() { // from class: l.d66
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84588a.m40705O((String) obj);
            }
        };
    }
}
